(ns zulip-rest-api.api.streams
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


(defn-spec archive-stream-with-http-info any?
  "Archive a stream
  [Archive the stream](/help/archive-a-stream) with the ID `stream_id`.

`DELETE {{ api_url }}/v1/streams/{stream_id}`"
  [stream_id int?]
  (check-required-params stream_id)
  (call-api "/streams/{stream_id}" :delete
            {:path-params   {"stream_id" stream_id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/json"]
             :auth-names    []}))

(defn-spec archive-stream json-success-spec
  "Archive a stream
  [Archive the stream](/help/archive-a-stream) with the ID `stream_id`.

`DELETE {{ api_url }}/v1/streams/{stream_id}`"
  [stream_id int?]
  (let [res (:data (archive-stream-with-http-info stream_id))]
    (if (:decode-models *api-context*)
       (st/decode json-success-spec res st/string-transformer)
       res)))


(defn-spec create-big-blue-button-video-call-with-http-info any?
  "Create BigBlueButton video call
  Create a video call URL for a BigBlueButton video call.
Requires BigBlueButton to be configured on the Zulip server."
  []
  (call-api "/calls/bigbluebutton/create" :get
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/json"]
             :auth-names    []}))

(defn-spec create-big-blue-button-video-call json-success-base-spec
  "Create BigBlueButton video call
  Create a video call URL for a BigBlueButton video call.
Requires BigBlueButton to be configured on the Zulip server."
  []
  (let [res (:data (create-big-blue-button-video-call-with-http-info))]
    (if (:decode-models *api-context*)
       (st/decode json-success-base-spec res st/string-transformer)
       res)))


(defn-spec get-stream-id-with-http-info any?
  "Get stream ID
  Get the unique ID of a given stream.

`GET {{ api_url }}/v1/get_stream_id`"
  [stream string?]
  (check-required-params stream)
  (call-api "/get_stream_id" :get
            {:path-params   {}
             :header-params {}
             :query-params  {"stream" stream }
             :form-params   {}
             :content-types []
             :accepts       ["application/json"]
             :auth-names    []}))

(defn-spec get-stream-id json-success-base-spec
  "Get stream ID
  Get the unique ID of a given stream.

`GET {{ api_url }}/v1/get_stream_id`"
  [stream string?]
  (let [res (:data (get-stream-id-with-http-info stream))]
    (if (:decode-models *api-context*)
       (st/decode json-success-base-spec res st/string-transformer)
       res)))


(defn-spec get-stream-topics-with-http-info any?
  "Get topics in a stream
  Get all the topics in a specific stream

`GET {{ api_url }}/v1/users/me/{stream_id}/topics`"
  [stream_id int?]
  (check-required-params stream_id)
  (call-api "/users/me/{stream_id}/topics" :get
            {:path-params   {"stream_id" stream_id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/json"]
             :auth-names    []}))

(defn-spec get-stream-topics json-success-base-spec
  "Get topics in a stream
  Get all the topics in a specific stream

`GET {{ api_url }}/v1/users/me/{stream_id}/topics`"
  [stream_id int?]
  (let [res (:data (get-stream-topics-with-http-info stream_id))]
    (if (:decode-models *api-context*)
       (st/decode json-success-base-spec res st/string-transformer)
       res)))


(defn-spec get-streams-with-http-info any?
  "Get all streams
  Get all streams that the user has access to.

`GET {{ api_url }}/v1/streams`"
  ([] (get-streams-with-http-info nil))
  ([{:keys [include_public include_web_public include_subscribed include_all_active include_default include_owner_subscribed]} (s/map-of keyword? any?)]
   (call-api "/streams" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"include_public" include_public "include_web_public" include_web_public "include_subscribed" include_subscribed "include_all_active" include_all_active "include_default" include_default "include_owner_subscribed" include_owner_subscribed }
              :form-params   {}
              :content-types []
              :accepts       ["application/json"]
              :auth-names    []})))

(defn-spec get-streams json-success-base-spec
  "Get all streams
  Get all streams that the user has access to.

`GET {{ api_url }}/v1/streams`"
  ([] (get-streams nil))
  ([optional-params any?]
   (let [res (:data (get-streams-with-http-info optional-params))]
     (if (:decode-models *api-context*)
        (st/decode json-success-base-spec res st/string-transformer)
        res))))


(defn-spec get-subscription-status-with-http-info any?
  "Get subscription status
  Check whether a user is subscribed to a stream.

`GET {{ api_url }}/v1/users/{user_id}/subscriptions/{stream_id}`

**Changes**: New in Zulip 3.0 (feature level 11)."
  [user_id int?, stream_id int?]
  (check-required-params user_id stream_id)
  (call-api "/users/{user_id}/subscriptions/{stream_id}" :get
            {:path-params   {"user_id" user_id "stream_id" stream_id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/json"]
             :auth-names    []}))

(defn-spec get-subscription-status json-success-base-spec
  "Get subscription status
  Check whether a user is subscribed to a stream.

`GET {{ api_url }}/v1/users/{user_id}/subscriptions/{stream_id}`

**Changes**: New in Zulip 3.0 (feature level 11)."
  [user_id int?, stream_id int?]
  (let [res (:data (get-subscription-status-with-http-info user_id stream_id))]
    (if (:decode-models *api-context*)
       (st/decode json-success-base-spec res st/string-transformer)
       res)))


(defn-spec get-subscriptions-with-http-info any?
  "Get subscribed streams
  Get all streams that the user is subscribed to.

`GET {{ api_url }}/v1/users/me/subscriptions`"
  ([] (get-subscriptions-with-http-info nil))
  ([{:keys [include_subscribers]} (s/map-of keyword? any?)]
   (call-api "/users/me/subscriptions" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"include_subscribers" include_subscribers }
              :form-params   {}
              :content-types []
              :accepts       ["application/json"]
              :auth-names    []})))

(defn-spec get-subscriptions json-success-base-spec
  "Get subscribed streams
  Get all streams that the user is subscribed to.

`GET {{ api_url }}/v1/users/me/subscriptions`"
  ([] (get-subscriptions nil))
  ([optional-params any?]
   (let [res (:data (get-subscriptions-with-http-info optional-params))]
     (if (:decode-models *api-context*)
        (st/decode json-success-base-spec res st/string-transformer)
        res))))


(defn-spec mute-topic-with-http-info any?
  "Topic muting
  This endpoint mutes/unmutes a topic within a stream that the current
user is subscribed to.  Muted topics are displayed faded in the Zulip
UI, and are not included in the user's unread count totals.

`PATCH {{ api_url }}/v1/users/me/subscriptions/muted_topics`"
  ([topic string?, op string?, ] (mute-topic-with-http-info topic op nil))
  ([topic string?, op string?, {:keys [stream stream_id]} (s/map-of keyword? any?)]
   (check-required-params topic op)
   (call-api "/users/me/subscriptions/muted_topics" :patch
             {:path-params   {}
              :header-params {}
              :query-params  {"stream" stream "stream_id" stream_id "topic" topic "op" op }
              :form-params   {}
              :content-types []
              :accepts       ["application/json"]
              :auth-names    []})))

(defn-spec mute-topic json-success-spec
  "Topic muting
  This endpoint mutes/unmutes a topic within a stream that the current
user is subscribed to.  Muted topics are displayed faded in the Zulip
UI, and are not included in the user's unread count totals.

`PATCH {{ api_url }}/v1/users/me/subscriptions/muted_topics`"
  ([topic string?, op string?, ] (mute-topic topic op nil))
  ([topic string?, op string?, optional-params any?]
   (let [res (:data (mute-topic-with-http-info topic op optional-params))]
     (if (:decode-models *api-context*)
        (st/decode json-success-spec res st/string-transformer)
        res))))


(defn-spec subscribe-with-http-info any?
  "Subscribe to a stream
  Subscribe one or more users to one or more streams.

`POST {{ api_url }}/v1/users/me/subscriptions`

If any of the specified streams do not exist, they are automatically
created.  The initial [stream settings](/api/update-stream) will be determined
by the optional parameters like `invite_only` detailed below."
  ([subscriptions (s/coll-of any?), ] (subscribe-with-http-info subscriptions nil))
  ([subscriptions (s/coll-of any?), {:keys [principals authorization_errors_fatal announce invite_only history_public_to_subscribers stream_post_policy message_retention_days]} (s/map-of keyword? any?)]
   (check-required-params subscriptions)
   (call-api "/users/me/subscriptions" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"subscriptions" (with-collection-format subscriptions :multi) "principals" (with-collection-format principals :multi) "authorization_errors_fatal" authorization_errors_fatal "announce" announce "invite_only" invite_only "history_public_to_subscribers" history_public_to_subscribers "stream_post_policy" stream_post_policy "message_retention_days" message_retention_days }
              :form-params   {}
              :content-types []
              :accepts       ["application/json"]
              :auth-names    []})))

(defn-spec subscribe one-of&lt;object,object&gt;-spec
  "Subscribe to a stream
  Subscribe one or more users to one or more streams.

`POST {{ api_url }}/v1/users/me/subscriptions`

If any of the specified streams do not exist, they are automatically
created.  The initial [stream settings](/api/update-stream) will be determined
by the optional parameters like `invite_only` detailed below."
  ([subscriptions (s/coll-of any?), ] (subscribe subscriptions nil))
  ([subscriptions (s/coll-of any?), optional-params any?]
   (let [res (:data (subscribe-with-http-info subscriptions optional-params))]
     (if (:decode-models *api-context*)
        (st/decode one-of&lt;object,object&gt;-spec res st/string-transformer)
        res))))


(defn-spec unsubscribe-with-http-info any?
  "Unsubscribe from a stream
  Unsubscribe yourself or other users from one or more streams.

`DELETE {{ api_url }}/v1/users/me/subscriptions`"
  ([subscriptions (s/coll-of string?), ] (unsubscribe-with-http-info subscriptions nil))
  ([subscriptions (s/coll-of string?), {:keys [principals]} (s/map-of keyword? any?)]
   (check-required-params subscriptions)
   (call-api "/users/me/subscriptions" :delete
             {:path-params   {}
              :header-params {}
              :query-params  {"subscriptions" (with-collection-format subscriptions :multi) "principals" (with-collection-format principals :multi) }
              :form-params   {}
              :content-types []
              :accepts       ["application/json"]
              :auth-names    []})))

(defn-spec unsubscribe json-success-base-spec
  "Unsubscribe from a stream
  Unsubscribe yourself or other users from one or more streams.

`DELETE {{ api_url }}/v1/users/me/subscriptions`"
  ([subscriptions (s/coll-of string?), ] (unsubscribe subscriptions nil))
  ([subscriptions (s/coll-of string?), optional-params any?]
   (let [res (:data (unsubscribe-with-http-info subscriptions optional-params))]
     (if (:decode-models *api-context*)
        (st/decode json-success-base-spec res st/string-transformer)
        res))))


(defn-spec update-stream-with-http-info any?
  "Update a stream
  Configure the stream with the ID `stream_id`.  This endpoint supports
an organization administrator editing any property of a stream,
including:

* Stream [name](/help/rename-a-stream) and [description](/help/change-the-stream-description)
* Stream [permissions](/help/stream-permissions), including
[privacy](/help/change-the-privacy-of-a-stream) and [who can
send](/help/stream-sending-policy).

`PATCH {{ api_url }}/v1/streams/{stream_id}`"
  ([stream_id int?, ] (update-stream-with-http-info stream_id nil))
  ([stream_id int?, {:keys [description new_name is_private is_announcement_only stream_post_policy history_public_to_subscribers message_retention_days]} (s/map-of keyword? any?)]
   (check-required-params stream_id)
   (call-api "/streams/{stream_id}" :patch
             {:path-params   {"stream_id" stream_id }
              :header-params {}
              :query-params  {"description" description "new_name" new_name "is_private" is_private "is_announcement_only" is_announcement_only "stream_post_policy" stream_post_policy "history_public_to_subscribers" history_public_to_subscribers "message_retention_days" message_retention_days }
              :form-params   {}
              :content-types []
              :accepts       ["application/json"]
              :auth-names    []})))

(defn-spec update-stream json-success-spec
  "Update a stream
  Configure the stream with the ID `stream_id`.  This endpoint supports
an organization administrator editing any property of a stream,
including:

* Stream [name](/help/rename-a-stream) and [description](/help/change-the-stream-description)
* Stream [permissions](/help/stream-permissions), including
[privacy](/help/change-the-privacy-of-a-stream) and [who can
send](/help/stream-sending-policy).

`PATCH {{ api_url }}/v1/streams/{stream_id}`"
  ([stream_id int?, ] (update-stream stream_id nil))
  ([stream_id int?, optional-params any?]
   (let [res (:data (update-stream-with-http-info stream_id optional-params))]
     (if (:decode-models *api-context*)
        (st/decode json-success-spec res st/string-transformer)
        res))))


(defn-spec update-subscription-settings-with-http-info any?
  "Update subscription settings
  This endpoint is used to update the user's personal settings for the
streams they are subscribed to, including muting, color, pinning, and
per-stream notification settings.

`POST {{ api_url }}/v1/users/me/subscriptions/properties`"
  [subscription_data (s/coll-of any?)]
  (check-required-params subscription_data)
  (call-api "/users/me/subscriptions/properties" :post
            {:path-params   {}
             :header-params {}
             :query-params  {"subscription_data" (with-collection-format subscription_data :multi) }
             :form-params   {}
             :content-types []
             :accepts       ["application/json"]
             :auth-names    []}))

(defn-spec update-subscription-settings json-success-base-spec
  "Update subscription settings
  This endpoint is used to update the user's personal settings for the
streams they are subscribed to, including muting, color, pinning, and
per-stream notification settings.

`POST {{ api_url }}/v1/users/me/subscriptions/properties`"
  [subscription_data (s/coll-of any?)]
  (let [res (:data (update-subscription-settings-with-http-info subscription_data))]
    (if (:decode-models *api-context*)
       (st/decode json-success-base-spec res st/string-transformer)
       res)))


(defn-spec update-subscriptions-with-http-info any?
  "Update subscriptions
  Update which streams you are are subscribed to."
  ([] (update-subscriptions-with-http-info nil))
  ([{:keys [delete add]} (s/map-of keyword? any?)]
   (call-api "/users/me/subscriptions" :patch
             {:path-params   {}
              :header-params {}
              :query-params  {"delete" (with-collection-format delete :multi) "add" (with-collection-format add :multi) }
              :form-params   {}
              :content-types []
              :accepts       ["application/json"]
              :auth-names    []})))

(defn-spec update-subscriptions json-success-base-spec
  "Update subscriptions
  Update which streams you are are subscribed to."
  ([] (update-subscriptions nil))
  ([optional-params any?]
   (let [res (:data (update-subscriptions-with-http-info optional-params))]
     (if (:decode-models *api-context*)
        (st/decode json-success-base-spec res st/string-transformer)
        res))))


