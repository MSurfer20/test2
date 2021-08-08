(ns zulip-rest-api.api.real-time-events
  (:require [zulip-rest-api.core :refer [call-api check-required-params with-collection-format *api-context*]]
            [clojure.spec.alpha :as s]
            [spec-tools.core :as st]
            [orchestra.core :refer [defn-spec]]
            [zulip-rest-api.specs.subscriptions :refer :all]
            [zulip-rest-api.specs.basic-stream-all-of :refer :all]
            [zulip-rest-api.specs.api-key-response-all-of :refer :all]
            [zulip-rest-api.specs.non-existing-stream-error-all-of :refer :all]
            [zulip-rest-api.specs.json-error-base-all-of :refer :all]
            [zulip-rest-api.specs.coded-error :refer :all]
            [zulip-rest-api.specs.custom-profile-field :refer :all]
            [zulip-rest-api.specs.json-success-base :refer :all]
            [zulip-rest-api.specs.user-not-authorized-error :refer :all]
            [zulip-rest-api.specs.basic-bot :refer :all]
            [zulip-rest-api.specs.get-messages :refer :all]
            [zulip-rest-api.specs.json-success-base-all-of :refer :all]
            [zulip-rest-api.specs.add-subscriptions-response-all-of :refer :all]
            [zulip-rest-api.specs.realm-domain :refer :all]
            [zulip-rest-api.specs.emoji-reaction-all-of :refer :all]
            [zulip-rest-api.specs.rate-limited-error :refer :all]
            [zulip-rest-api.specs.presence :refer :all]
            [zulip-rest-api.specs.event-id-schema :refer :all]
            [zulip-rest-api.specs.coded-error-all-of :refer :all]
            [zulip-rest-api.specs.bad-event-queue-id-error-all-of :refer :all]
            [zulip-rest-api.specs.emoji-reaction :refer :all]
            [zulip-rest-api.specs.json-error :refer :all]
            [zulip-rest-api.specs.invalid-message-error :refer :all]
            [zulip-rest-api.specs.default-stream-group :refer :all]
            [zulip-rest-api.specs.user-group :refer :all]
            [zulip-rest-api.specs.basic-stream-base :refer :all]
            [zulip-rest-api.specs.user-all-of :refer :all]
            [zulip-rest-api.specs.json-success-all-of :refer :all]
            [zulip-rest-api.specs.missing-argument-error-all-of :refer :all]
            [zulip-rest-api.specs.realm-playground :refer :all]
            [zulip-rest-api.specs.bad-event-queue-id-error :refer :all]
            [zulip-rest-api.specs.messages-all-of :refer :all]
            [zulip-rest-api.specs.realm-export :refer :all]
            [zulip-rest-api.specs.messages :refer :all]
            [zulip-rest-api.specs.bot-all-of :refer :all]
            [zulip-rest-api.specs.user-deactivated-error :refer :all]
            [zulip-rest-api.specs.non-existing-stream-error :refer :all]
            [zulip-rest-api.specs.attachments :refer :all]
            [zulip-rest-api.specs.emoji-reaction-base :refer :all]
            [zulip-rest-api.specs.hotspot :refer :all]
            [zulip-rest-api.specs.bot :refer :all]
            [zulip-rest-api.specs.realm-deactivated-error :refer :all]
            [zulip-rest-api.specs.json-success :refer :all]
            [zulip-rest-api.specs.event-type-schema :refer :all]
            [zulip-rest-api.specs.add-subscriptions-response :refer :all]
            [zulip-rest-api.specs.inline-response-200 :refer :all]
            [zulip-rest-api.specs.attachments-messages :refer :all]
            [zulip-rest-api.specs.coded-error-base :refer :all]
            [zulip-rest-api.specs.realm-emoji :refer :all]
            [zulip-rest-api.specs.json-response-base :refer :all]
            [zulip-rest-api.specs.basic-bot-base :refer :all]
            [zulip-rest-api.specs.user-base :refer :all]
            [zulip-rest-api.specs.emoji-reaction-base-user :refer :all]
            [zulip-rest-api.specs.basic-stream :refer :all]
            [zulip-rest-api.specs.get-messages-all-of :refer :all]
            [zulip-rest-api.specs.json-error-base :refer :all]
            [zulip-rest-api.specs.invalid-message-error-all-of :refer :all]
            [zulip-rest-api.specs.messages-base :refer :all]
            [zulip-rest-api.specs.api-key-response :refer :all]
            [zulip-rest-api.specs.missing-argument-error :refer :all]
            [zulip-rest-api.specs.messages-base-topic-links :refer :all]
            [zulip-rest-api.specs.basic-bot-all-of :refer :all]
            [zulip-rest-api.specs.user :refer :all]
            [zulip-rest-api.specs.invalid-api-key-error :refer :all]
            [zulip-rest-api.specs.coded-error-base-all-of :refer :all]
            [zulip-rest-api.specs.success-description :refer :all]
            )
  (:import (java.io File)))


(defn-spec delete-queue-with-http-info any?
  "Delete an event queue
  Delete a previously registered queue.

`DELETE {{ api_url }}/v1/events`"
  [queue_id string?]
  (check-required-params queue_id)
  (call-api "/events" :delete
            {:path-params   {}
             :header-params {}
             :query-params  {"queue_id" queue_id }
             :form-params   {}
             :content-types []
             :accepts       ["application/json"]
             :auth-names    []}))

(defn-spec delete-queue json-success-spec
  "Delete an event queue
  Delete a previously registered queue.

`DELETE {{ api_url }}/v1/events`"
  [queue_id string?]
  (let [res (:data (delete-queue-with-http-info queue_id))]
    (if (:decode-models *api-context*)
       (st/decode json-success-spec res st/string-transformer)
       res)))


(defn-spec get-events-with-http-info any?
  "Get events from an event queue
  `GET {{ api_url }}/v1/events`

This endpoint allows you to receive new events from
[a registered event queue](/api/register-queue).

Long-lived clients should use the
`event_queue_longpoll_timeout_seconds` property returned by
`POST /register` as the client-side HTTP request timeout for
calls to this endpoint.  It is guaranteed to be higher than
heartbeat frequency and should be respected by clients to
avoid breaking when heartbeat frequency increases."
  ([queue_id string?, ] (get-events-with-http-info queue_id nil))
  ([queue_id string?, {:keys [last_event_id dont_block]} (s/map-of keyword? any?)]
   (check-required-params queue_id)
   (call-api "/events" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"queue_id" queue_id "last_event_id" last_event_id "dont_block" dont_block }
              :form-params   {}
              :content-types []
              :accepts       ["application/json"]
              :auth-names    []})))

(defn-spec get-events json-success-base-spec
  "Get events from an event queue
  `GET {{ api_url }}/v1/events`

This endpoint allows you to receive new events from
[a registered event queue](/api/register-queue).

Long-lived clients should use the
`event_queue_longpoll_timeout_seconds` property returned by
`POST /register` as the client-side HTTP request timeout for
calls to this endpoint.  It is guaranteed to be higher than
heartbeat frequency and should be respected by clients to
avoid breaking when heartbeat frequency increases."
  ([queue_id string?, ] (get-events queue_id nil))
  ([queue_id string?, optional-params any?]
   (let [res (:data (get-events-with-http-info queue_id optional-params))]
     (if (:decode-models *api-context*)
        (st/decode json-success-base-spec res st/string-transformer)
        res))))


(defn-spec real-time-post-with-http-info any?
  "
  (Ignored)"
  ([] (real-time-post-with-http-info nil))
  ([{:keys [event_types narrow all_public_streams]} (s/map-of keyword? any?)]
   (call-api "/real-time" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"event_types" (with-collection-format event_types :multi) "narrow" (with-collection-format narrow :multi) "all_public_streams" all_public_streams }
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec real-time-post any?
  "
  (Ignored)"
  ([] (real-time-post nil))
  ([optional-params any?]
   (let [res (:data (real-time-post-with-http-info optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec register-queue-with-http-info any?
  "Register an event queue
  `POST {{ api_url }}/v1/register`

This powerful endpoint can be used to register a Zulip \"event queue\"
(subscribed to certain types of \"events\", or updates to the messages
and other Zulip data the current user has access to), as well as to
fetch the current state of that data.

(`register` also powers the `call_on_each_event` Python API, and is
intended primarily for complex applications for which the more convenient
`call_on_each_event` API is insufficient).

This endpoint returns a `queue_id` and a `last_event_id`; these can be
used in subsequent calls to the
[\"events\" endpoint](/api/get-events) to request events from
the Zulip server using long-polling.

The server will queue events for up to 10 minutes of inactivity.
After 10 minutes, your event queue will be garbage-collected.  The
server will send `heartbeat` events every minute, which makes it easy
to implement a robust client that does not miss events unless the
client loses network connectivity with the Zulip server for 10 minutes
or longer.

Once the server garbage-collects your event queue, the server will
[return an error](/api/get-events#bad_event_queue_id-errors)
with a code of `BAD_EVENT_QUEUE_ID` if you try to fetch events from
the event queue.  Your software will need to handle that error
condition by re-initializing itself (e.g. this is what triggers your
browser reloading the Zulip web app when your laptop comes back online
after being offline for more than 10 minutes).

When prototyping with this API, we recommend first calling `register`
with no `event_types` parameter to see all the available data from all
supported event types.  Before using your client in production, you
should set appropriate `event_types` and `fetch_event_types` filters
so that your client only requests the data it needs.  A few minutes
doing this often saves 90% of the total bandwidth and other resources
consumed by a client using this API.

See the
[events system developer documentation](https://zulip.readthedocs.io/en/latest/subsystems/events-system.html)
if you need deeper details about how the Zulip event queue system
works, avoids clients needing to worry about large classes of
potentially messy races, etc."
  ([] (register-queue-with-http-info nil))
  ([{:keys [apply_markdown client_gravatar slim_presence event_types all_public_streams include_subscribers client_capabilities fetch_event_types narrow]} (s/map-of keyword? any?)]
   (call-api "/register" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"apply_markdown" apply_markdown "client_gravatar" client_gravatar "slim_presence" slim_presence "event_types" (with-collection-format event_types :multi) "all_public_streams" all_public_streams "include_subscribers" include_subscribers "client_capabilities" client_capabilities "fetch_event_types" (with-collection-format fetch_event_types :multi) "narrow" (with-collection-format narrow :multi) }
              :form-params   {}
              :content-types []
              :accepts       ["application/json"]
              :auth-names    []})))

(defn-spec register-queue json-success-base-spec
  "Register an event queue
  `POST {{ api_url }}/v1/register`

This powerful endpoint can be used to register a Zulip \"event queue\"
(subscribed to certain types of \"events\", or updates to the messages
and other Zulip data the current user has access to), as well as to
fetch the current state of that data.

(`register` also powers the `call_on_each_event` Python API, and is
intended primarily for complex applications for which the more convenient
`call_on_each_event` API is insufficient).

This endpoint returns a `queue_id` and a `last_event_id`; these can be
used in subsequent calls to the
[\"events\" endpoint](/api/get-events) to request events from
the Zulip server using long-polling.

The server will queue events for up to 10 minutes of inactivity.
After 10 minutes, your event queue will be garbage-collected.  The
server will send `heartbeat` events every minute, which makes it easy
to implement a robust client that does not miss events unless the
client loses network connectivity with the Zulip server for 10 minutes
or longer.

Once the server garbage-collects your event queue, the server will
[return an error](/api/get-events#bad_event_queue_id-errors)
with a code of `BAD_EVENT_QUEUE_ID` if you try to fetch events from
the event queue.  Your software will need to handle that error
condition by re-initializing itself (e.g. this is what triggers your
browser reloading the Zulip web app when your laptop comes back online
after being offline for more than 10 minutes).

When prototyping with this API, we recommend first calling `register`
with no `event_types` parameter to see all the available data from all
supported event types.  Before using your client in production, you
should set appropriate `event_types` and `fetch_event_types` filters
so that your client only requests the data it needs.  A few minutes
doing this often saves 90% of the total bandwidth and other resources
consumed by a client using this API.

See the
[events system developer documentation](https://zulip.readthedocs.io/en/latest/subsystems/events-system.html)
if you need deeper details about how the Zulip event queue system
works, avoids clients needing to worry about large classes of
potentially messy races, etc."
  ([] (register-queue nil))
  ([optional-params any?]
   (let [res (:data (register-queue-with-http-info optional-params))]
     (if (:decode-models *api-context*)
        (st/decode json-success-base-spec res st/string-transformer)
        res))))


(defn-spec rest-error-handling-with-http-info any?
  "Error handling
  Common error to many endpoints"
  []
  (call-api "/rest-error-handling" :post
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/json"]
             :auth-names    []}))

(defn-spec rest-error-handling any?
  "Error handling
  Common error to many endpoints"
  []
  (let [res (:data (rest-error-handling-with-http-info))]
    (if (:decode-models *api-context*)
       (st/decode any? res st/string-transformer)
       res)))


