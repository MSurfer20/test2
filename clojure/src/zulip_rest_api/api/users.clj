(ns zulip-rest-api.api.users
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


(defn-spec create-user-with-http-info any?
  "Create a user
  {!can-create-users-only.md!}

Create a new user account via the API.

`POST {{ api_url }}/v1/users`"
  [email string?, password string?, full_name string?]
  (check-required-params email password full_name)
  (call-api "/users" :post
            {:path-params   {}
             :header-params {}
             :query-params  {"email" email "password" password "full_name" full_name }
             :form-params   {}
             :content-types []
             :accepts       ["application/json"]
             :auth-names    []}))

(defn-spec create-user json-success-base-spec
  "Create a user
  {!can-create-users-only.md!}

Create a new user account via the API.

`POST {{ api_url }}/v1/users`"
  [email string?, password string?, full_name string?]
  (let [res (:data (create-user-with-http-info email password full_name))]
    (if (:decode-models *api-context*)
       (st/decode json-success-base-spec res st/string-transformer)
       res)))


(defn-spec create-user-group-with-http-info any?
  "Create a user group
  Create a new [user group](/help/user-groups).

`POST {{ api_url }}/v1/user_groups/create`"
  [name string?, description string?, members (s/coll-of int?)]
  (check-required-params name description members)
  (call-api "/user_groups/create" :post
            {:path-params   {}
             :header-params {}
             :query-params  {"name" name "description" description "members" (with-collection-format members :multi) }
             :form-params   {}
             :content-types []
             :accepts       ["application/json"]
             :auth-names    []}))

(defn-spec create-user-group json-success-spec
  "Create a user group
  Create a new [user group](/help/user-groups).

`POST {{ api_url }}/v1/user_groups/create`"
  [name string?, description string?, members (s/coll-of int?)]
  (let [res (:data (create-user-group-with-http-info name description members))]
    (if (:decode-models *api-context*)
       (st/decode json-success-spec res st/string-transformer)
       res)))


(defn-spec deactivate-own-user-with-http-info any?
  "Deactivate own user
  Deactivates the user's account.  See also the administrative endpoint for
[deactivating another user](/api/deactivate-user).

`DELETE {{ api_url }}/v1/users/me`

This endpoint is primarily useful to Zulip clients providing a user settings UI."
  []
  (call-api "/users/me" :delete
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/json"]
             :auth-names    []}))

(defn-spec deactivate-own-user json-success-spec
  "Deactivate own user
  Deactivates the user's account.  See also the administrative endpoint for
[deactivating another user](/api/deactivate-user).

`DELETE {{ api_url }}/v1/users/me`

This endpoint is primarily useful to Zulip clients providing a user settings UI."
  []
  (let [res (:data (deactivate-own-user-with-http-info))]
    (if (:decode-models *api-context*)
       (st/decode json-success-spec res st/string-transformer)
       res)))


(defn-spec deactivate-user-with-http-info any?
  "Deactivate a user
  [Deactivates a
user](https://zulip.com/help/deactivate-or-reactivate-a-user)
given their user ID.

`DELETE {{ api_url }}/v1/users/{user_id}`"
  [user_id int?]
  (check-required-params user_id)
  (call-api "/users/{user_id}" :delete
            {:path-params   {"user_id" user_id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/json"]
             :auth-names    []}))

(defn-spec deactivate-user json-success-spec
  "Deactivate a user
  [Deactivates a
user](https://zulip.com/help/deactivate-or-reactivate-a-user)
given their user ID.

`DELETE {{ api_url }}/v1/users/{user_id}`"
  [user_id int?]
  (let [res (:data (deactivate-user-with-http-info user_id))]
    (if (:decode-models *api-context*)
       (st/decode json-success-spec res st/string-transformer)
       res)))


(defn-spec get-attachments-with-http-info any?
  "Get attachments
  Fetch metadata on files uploaded by the requesting user.

`GET {{ api_url }}/v1/attachments`"
  []
  (call-api "/attachments" :get
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/json"]
             :auth-names    []}))

(defn-spec get-attachments json-success-base-spec
  "Get attachments
  Fetch metadata on files uploaded by the requesting user.

`GET {{ api_url }}/v1/attachments`"
  []
  (let [res (:data (get-attachments-with-http-info))]
    (if (:decode-models *api-context*)
       (st/decode json-success-base-spec res st/string-transformer)
       res)))


(defn-spec get-own-user-with-http-info any?
  "Get own user
  Get basic data about the user/bot that requests this endpoint.

`GET {{ api_url }}/v1/users/me`"
  []
  (call-api "/users/me" :get
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/json"]
             :auth-names    []}))

(defn-spec get-own-user json-success-base-spec
  "Get own user
  Get basic data about the user/bot that requests this endpoint.

`GET {{ api_url }}/v1/users/me`"
  []
  (let [res (:data (get-own-user-with-http-info))]
    (if (:decode-models *api-context*)
       (st/decode json-success-base-spec res st/string-transformer)
       res)))


(defn-spec get-user-with-http-info any?
  "Get a user
  Fetch details for a single user in the organization.

`GET {{ api_url }}/v1/users/{user_id}`

You can also fetch details on [all users in the organization](/api/get-users)
or [by email](/api/get-user-by-email).

*This endpoint is new in Zulip Server 3.0 (feature level 1).*"
  ([user_id int?, ] (get-user-with-http-info user_id nil))
  ([user_id int?, {:keys [client_gravatar include_custom_profile_fields]} (s/map-of keyword? any?)]
   (check-required-params user_id)
   (call-api "/users/{user_id}" :get
             {:path-params   {"user_id" user_id }
              :header-params {}
              :query-params  {"client_gravatar" client_gravatar "include_custom_profile_fields" include_custom_profile_fields }
              :form-params   {}
              :content-types []
              :accepts       ["application/json"]
              :auth-names    []})))

(defn-spec get-user json-success-base-spec
  "Get a user
  Fetch details for a single user in the organization.

`GET {{ api_url }}/v1/users/{user_id}`

You can also fetch details on [all users in the organization](/api/get-users)
or [by email](/api/get-user-by-email).

*This endpoint is new in Zulip Server 3.0 (feature level 1).*"
  ([user_id int?, ] (get-user user_id nil))
  ([user_id int?, optional-params any?]
   (let [res (:data (get-user-with-http-info user_id optional-params))]
     (if (:decode-models *api-context*)
        (st/decode json-success-base-spec res st/string-transformer)
        res))))


(defn-spec get-user-by-email-with-http-info any?
  "Get a user by email
  Fetch details for a single user in the organization given a Zulip display
email address.

`GET {{ api_url }}/v1/users/{email}`

Note that this endpoint uses Zulip display emails addresses
for organizations that have configured limited [email address
visibility](/help/restrict-visibility-of-email-addresses).

You can also fetch details on [all users in the organization](/api/get-users) or
[by user ID](/api/get-user).  Fetching by user ID is generally recommended
when possible, as users can
[change their email address](/help/change-your-email-address).

*This endpoint is new in Zulip Server 4.0 (feature level 39).*"
  ([email string?, ] (get-user-by-email-with-http-info email nil))
  ([email string?, {:keys [client_gravatar include_custom_profile_fields]} (s/map-of keyword? any?)]
   (check-required-params email)
   (call-api "/users/{email}" :get
             {:path-params   {"email" email }
              :header-params {}
              :query-params  {"client_gravatar" client_gravatar "include_custom_profile_fields" include_custom_profile_fields }
              :form-params   {}
              :content-types []
              :accepts       ["application/json"]
              :auth-names    []})))

(defn-spec get-user-by-email json-success-base-spec
  "Get a user by email
  Fetch details for a single user in the organization given a Zulip display
email address.

`GET {{ api_url }}/v1/users/{email}`

Note that this endpoint uses Zulip display emails addresses
for organizations that have configured limited [email address
visibility](/help/restrict-visibility-of-email-addresses).

You can also fetch details on [all users in the organization](/api/get-users) or
[by user ID](/api/get-user).  Fetching by user ID is generally recommended
when possible, as users can
[change their email address](/help/change-your-email-address).

*This endpoint is new in Zulip Server 4.0 (feature level 39).*"
  ([email string?, ] (get-user-by-email email nil))
  ([email string?, optional-params any?]
   (let [res (:data (get-user-by-email-with-http-info email optional-params))]
     (if (:decode-models *api-context*)
        (st/decode json-success-base-spec res st/string-transformer)
        res))))


(defn-spec get-user-groups-with-http-info any?
  "Get user groups
  {!api-members-only.md!}

Fetches all of the user groups in the organization.

`GET {{ api_url }}/v1/user_groups`"
  []
  (call-api "/user_groups" :get
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/json"]
             :auth-names    []}))

(defn-spec get-user-groups json-success-base-spec
  "Get user groups
  {!api-members-only.md!}

Fetches all of the user groups in the organization.

`GET {{ api_url }}/v1/user_groups`"
  []
  (let [res (:data (get-user-groups-with-http-info))]
    (if (:decode-models *api-context*)
       (st/decode json-success-base-spec res st/string-transformer)
       res)))


(defn-spec get-user-presence-with-http-info any?
  "Get user presence
  Get the presence status for a specific user.

This endpoint is most useful for embedding data about a user's
presence status in other sites (E.g. an employee directory).  Full
Zulip clients like mobile/desktop apps will want to use the main
presence endpoint, which returns data for all active users in the
organization, instead.

`GET {{ api_url }}/v1/users/{user_id_or_email}/presence`

See
[Zulip's developer documentation](https://zulip.readthedocs.io/en/latest/subsystems/presence.html)
for details on the data model for presence in Zulip."
  [user_id_or_email string?]
  (check-required-params user_id_or_email)
  (call-api "/users/{user_id_or_email}/presence" :get
            {:path-params   {"user_id_or_email" user_id_or_email }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/json"]
             :auth-names    []}))

(defn-spec get-user-presence json-success-base-spec
  "Get user presence
  Get the presence status for a specific user.

This endpoint is most useful for embedding data about a user's
presence status in other sites (E.g. an employee directory).  Full
Zulip clients like mobile/desktop apps will want to use the main
presence endpoint, which returns data for all active users in the
organization, instead.

`GET {{ api_url }}/v1/users/{user_id_or_email}/presence`

See
[Zulip's developer documentation](https://zulip.readthedocs.io/en/latest/subsystems/presence.html)
for details on the data model for presence in Zulip."
  [user_id_or_email string?]
  (let [res (:data (get-user-presence-with-http-info user_id_or_email))]
    (if (:decode-models *api-context*)
       (st/decode json-success-base-spec res st/string-transformer)
       res)))


(defn-spec get-users-with-http-info any?
  "Get all users
  Retrieve details on all users in the organization.  Optionally
includes values of [custom profile field](/help/add-custom-profile-fields).

`GET {{ api_url }}/v1/users`

You can also [fetch details on a single user](/api/get-user)."
  ([] (get-users-with-http-info nil))
  ([{:keys [client_gravatar include_custom_profile_fields]} (s/map-of keyword? any?)]
   (call-api "/users" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"client_gravatar" client_gravatar "include_custom_profile_fields" include_custom_profile_fields }
              :form-params   {}
              :content-types []
              :accepts       ["application/json"]
              :auth-names    []})))

(defn-spec get-users json-success-base-spec
  "Get all users
  Retrieve details on all users in the organization.  Optionally
includes values of [custom profile field](/help/add-custom-profile-fields).

`GET {{ api_url }}/v1/users`

You can also [fetch details on a single user](/api/get-user)."
  ([] (get-users nil))
  ([optional-params any?]
   (let [res (:data (get-users-with-http-info optional-params))]
     (if (:decode-models *api-context*)
        (st/decode json-success-base-spec res st/string-transformer)
        res))))


(defn-spec mute-user-with-http-info any?
  "Mute a user
  This endpoint [mutes a user](/help/mute-a-user).  Messages sent by users
you've muted will be automatically marked as read and hidden.

`POST {{ api_url }}/v1/users/me/muted_users/{muted_user_id}`

Muted users should be implemented by clients as follows:

* The server will immediately mark all messages sent by the muted
  user as read.  This will automatically clear any existing mobile
  push notifications related to the muted user.
* The server will mark any new messages sent by the muted user as read
  for your account, which prevents all email and mobile push notifications.
* Clients should exclude muted users from presence lists or other UI
  for viewing or composing 1:1 private messages. 1:1 private messages sent by
  muted users should be hidden everywhere in the Zulip UI.
* Stream messages and group private messages sent by the muted
  user should avoid displaying the content and name/avatar,
  but should display that N messages by a muted user were
  hidden (so that it is possible to interpret the messages by
  other users who are talking with the muted user).
* Group private message conversations including the muted user
  should display muted users as \"Muted user\", rather than
  showing their name, in lists of such conversations, along with using
  a blank grey avatar where avatars are displayed.
* Administrative/settings UI elements for showing \"All users that exist
  on this stream or realm\", e.g. for organization
  administration or showing stream subscribers, should display
  the user's name as normal.

**Changes**: New in Zulip 4.0 (feature level 48)."
  [muted_user_id int?]
  (check-required-params muted_user_id)
  (call-api "/users/me/muted_users/{muted_user_id}" :post
            {:path-params   {"muted_user_id" muted_user_id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/json"]
             :auth-names    []}))

(defn-spec mute-user json-success-spec
  "Mute a user
  This endpoint [mutes a user](/help/mute-a-user).  Messages sent by users
you've muted will be automatically marked as read and hidden.

`POST {{ api_url }}/v1/users/me/muted_users/{muted_user_id}`

Muted users should be implemented by clients as follows:

* The server will immediately mark all messages sent by the muted
  user as read.  This will automatically clear any existing mobile
  push notifications related to the muted user.
* The server will mark any new messages sent by the muted user as read
  for your account, which prevents all email and mobile push notifications.
* Clients should exclude muted users from presence lists or other UI
  for viewing or composing 1:1 private messages. 1:1 private messages sent by
  muted users should be hidden everywhere in the Zulip UI.
* Stream messages and group private messages sent by the muted
  user should avoid displaying the content and name/avatar,
  but should display that N messages by a muted user were
  hidden (so that it is possible to interpret the messages by
  other users who are talking with the muted user).
* Group private message conversations including the muted user
  should display muted users as \"Muted user\", rather than
  showing their name, in lists of such conversations, along with using
  a blank grey avatar where avatars are displayed.
* Administrative/settings UI elements for showing \"All users that exist
  on this stream or realm\", e.g. for organization
  administration or showing stream subscribers, should display
  the user's name as normal.

**Changes**: New in Zulip 4.0 (feature level 48)."
  [muted_user_id int?]
  (let [res (:data (mute-user-with-http-info muted_user_id))]
    (if (:decode-models *api-context*)
       (st/decode json-success-spec res st/string-transformer)
       res)))


(defn-spec reactivate-user-with-http-info any?
  "Reactivate a user
  [Reactivates a
user](https://zulip.com/help/deactivate-or-reactivate-a-user)
given their user ID.

`POST {{ api_url }}/v1/users/{user_id}/reactivate`"
  [user_id int?]
  (check-required-params user_id)
  (call-api "/users/{user_id}/reactivate" :post
            {:path-params   {"user_id" user_id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/json"]
             :auth-names    []}))

(defn-spec reactivate-user any-type-spec
  "Reactivate a user
  [Reactivates a
user](https://zulip.com/help/deactivate-or-reactivate-a-user)
given their user ID.

`POST {{ api_url }}/v1/users/{user_id}/reactivate`"
  [user_id int?]
  (let [res (:data (reactivate-user-with-http-info user_id))]
    (if (:decode-models *api-context*)
       (st/decode any-type-spec res st/string-transformer)
       res)))


(defn-spec remove-user-group-with-http-info any?
  "Delete a user group
  Delete a [user group](/help/user-groups).

`DELETE {{ api_url }}/v1/user_groups/{user_group_id}`"
  [user_group_id int?]
  (check-required-params user_group_id)
  (call-api "/user_groups/{user_group_id}" :delete
            {:path-params   {"user_group_id" user_group_id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/json"]
             :auth-names    []}))

(defn-spec remove-user-group json-success-spec
  "Delete a user group
  Delete a [user group](/help/user-groups).

`DELETE {{ api_url }}/v1/user_groups/{user_group_id}`"
  [user_group_id int?]
  (let [res (:data (remove-user-group-with-http-info user_group_id))]
    (if (:decode-models *api-context*)
       (st/decode json-success-spec res st/string-transformer)
       res)))


(defn-spec set-typing-status-with-http-info any?
  "Set \"typing\" status
  Notify other users whether the current user is typing a message.

`POST {{ api_url }}/v1/typing`

Clients implementing Zulip's typing notifications protocol should work as follows:

* Send a request to this endpoint with `op=\"start\"` when a user starts typing a message,
  and also every `TYPING_STARTED_WAIT_PERIOD=10` seconds that the user continues to
  actively type or otherwise interact with the compose UI (E.g. interacting with the
  compose box emoji picker).
* Send a request to this endpoint with `op=\"stop\"` when a user pauses using the
  compose UI for at least `TYPING_STOPPED_WAIT_PERIOD=5` seconds or cancels
  the compose action (if it had previously sent a \"start\" operation for that
  compose action).
* Start displaying \"Sender is typing\" for a given conversation when the client
  receives an `op=\"start\"` event from the [events API](/api/get-events).
* Continue displaying \"Sender is typing\" until they receive an `op=\"stop\"` event
  from the [events API](/api/get-events) or `TYPING_STARTED_EXPIRY_PERIOD=15`
  seconds have passed without a new `op=\"start\"` event for that conversation.
* Clients that support displaying stream typing notifications (new in Zulip 4.0)
  should indicate they support processing stream typing events via the
  `stream_typing_notifications` in the `client_capabilities` parameter to `/register`.

This protocol is designed to allow the server-side typing notifications implementation
to be stateless while being resilient; network failures cannot result in a user being
incorrectly displayed as perpetually typing.

See
[the typing notification docs](https://zulip.readthedocs.io/en/latest/subsystems/typing-indicators.html)
for additional design details on Zulip's typing notifications protocol."
  ([op string?, to (s/coll-of int?), ] (set-typing-status-with-http-info op to nil))
  ([op string?, to (s/coll-of int?), {:keys [type topic]} (s/map-of keyword? any?)]
   (check-required-params op to)
   (call-api "/typing" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"type" type "op" op "to" (with-collection-format to :multi) "topic" topic }
              :form-params   {}
              :content-types []
              :accepts       ["application/json"]
              :auth-names    []})))

(defn-spec set-typing-status json-success-spec
  "Set \"typing\" status
  Notify other users whether the current user is typing a message.

`POST {{ api_url }}/v1/typing`

Clients implementing Zulip's typing notifications protocol should work as follows:

* Send a request to this endpoint with `op=\"start\"` when a user starts typing a message,
  and also every `TYPING_STARTED_WAIT_PERIOD=10` seconds that the user continues to
  actively type or otherwise interact with the compose UI (E.g. interacting with the
  compose box emoji picker).
* Send a request to this endpoint with `op=\"stop\"` when a user pauses using the
  compose UI for at least `TYPING_STOPPED_WAIT_PERIOD=5` seconds or cancels
  the compose action (if it had previously sent a \"start\" operation for that
  compose action).
* Start displaying \"Sender is typing\" for a given conversation when the client
  receives an `op=\"start\"` event from the [events API](/api/get-events).
* Continue displaying \"Sender is typing\" until they receive an `op=\"stop\"` event
  from the [events API](/api/get-events) or `TYPING_STARTED_EXPIRY_PERIOD=15`
  seconds have passed without a new `op=\"start\"` event for that conversation.
* Clients that support displaying stream typing notifications (new in Zulip 4.0)
  should indicate they support processing stream typing events via the
  `stream_typing_notifications` in the `client_capabilities` parameter to `/register`.

This protocol is designed to allow the server-side typing notifications implementation
to be stateless while being resilient; network failures cannot result in a user being
incorrectly displayed as perpetually typing.

See
[the typing notification docs](https://zulip.readthedocs.io/en/latest/subsystems/typing-indicators.html)
for additional design details on Zulip's typing notifications protocol."
  ([op string?, to (s/coll-of int?), ] (set-typing-status op to nil))
  ([op string?, to (s/coll-of int?), optional-params any?]
   (let [res (:data (set-typing-status-with-http-info op to optional-params))]
     (if (:decode-models *api-context*)
        (st/decode json-success-spec res st/string-transformer)
        res))))


(defn-spec unmute-user-with-http-info any?
  "Unmute a user
  This endpoint unmutes a user.

`DELETE {{ api_url }}/v1/users/me/muted_users/{muted_user_id}`

**Changes**: New in Zulip 4.0 (feature level 48)."
  [muted_user_id int?]
  (check-required-params muted_user_id)
  (call-api "/users/me/muted_users/{muted_user_id}" :delete
            {:path-params   {"muted_user_id" muted_user_id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/json"]
             :auth-names    []}))

(defn-spec unmute-user json-success-spec
  "Unmute a user
  This endpoint unmutes a user.

`DELETE {{ api_url }}/v1/users/me/muted_users/{muted_user_id}`

**Changes**: New in Zulip 4.0 (feature level 48)."
  [muted_user_id int?]
  (let [res (:data (unmute-user-with-http-info muted_user_id))]
    (if (:decode-models *api-context*)
       (st/decode json-success-spec res st/string-transformer)
       res)))


(defn-spec update-display-settings-with-http-info any?
  "Update display settings
  This endpoint is used to edit the current user's user interface settings.

`PATCH {{ api_url }}/v1/settings/display`"
  ([] (update-display-settings-with-http-info nil))
  ([{:keys [twenty_four_hour_time dense_mode starred_message_counts fluid_layout_width high_contrast_mode color_scheme translate_emoticons default_language default_view left_side_userlist emojiset demote_inactive_streams timezone]} (s/map-of keyword? any?)]
   (call-api "/settings/display" :patch
             {:path-params   {}
              :header-params {}
              :query-params  {"twenty_four_hour_time" twenty_four_hour_time "dense_mode" dense_mode "starred_message_counts" starred_message_counts "fluid_layout_width" fluid_layout_width "high_contrast_mode" high_contrast_mode "color_scheme" color_scheme "translate_emoticons" translate_emoticons "default_language" default_language "default_view" default_view "left_side_userlist" left_side_userlist "emojiset" emojiset "demote_inactive_streams" demote_inactive_streams "timezone" timezone }
              :form-params   {}
              :content-types []
              :accepts       ["application/json"]
              :auth-names    []})))

(defn-spec update-display-settings json-success-base-spec
  "Update display settings
  This endpoint is used to edit the current user's user interface settings.

`PATCH {{ api_url }}/v1/settings/display`"
  ([] (update-display-settings nil))
  ([optional-params any?]
   (let [res (:data (update-display-settings-with-http-info optional-params))]
     (if (:decode-models *api-context*)
        (st/decode json-success-base-spec res st/string-transformer)
        res))))


(defn-spec update-notification-settings-with-http-info any?
  "Update notification settings
  This endpoint is used to edit the user's global notification settings.
See [this endpoint](/api/update-subscription-settings) for
per-stream notification settings.

`PATCH {{ api_url }}/v1/settings/notifications`"
  ([] (update-notification-settings-with-http-info nil))
  ([{:keys [enable_stream_desktop_notifications enable_stream_email_notifications enable_stream_push_notifications enable_stream_audible_notifications notification_sound enable_desktop_notifications enable_sounds enable_offline_email_notifications enable_offline_push_notifications enable_online_push_notifications enable_digest_emails enable_marketing_emails enable_login_emails message_content_in_email_notifications pm_content_in_desktop_notifications wildcard_mentions_notify desktop_icon_count_display realm_name_in_notifications presence_enabled]} (s/map-of keyword? any?)]
   (call-api "/settings/notifications" :patch
             {:path-params   {}
              :header-params {}
              :query-params  {"enable_stream_desktop_notifications" enable_stream_desktop_notifications "enable_stream_email_notifications" enable_stream_email_notifications "enable_stream_push_notifications" enable_stream_push_notifications "enable_stream_audible_notifications" enable_stream_audible_notifications "notification_sound" notification_sound "enable_desktop_notifications" enable_desktop_notifications "enable_sounds" enable_sounds "enable_offline_email_notifications" enable_offline_email_notifications "enable_offline_push_notifications" enable_offline_push_notifications "enable_online_push_notifications" enable_online_push_notifications "enable_digest_emails" enable_digest_emails "enable_marketing_emails" enable_marketing_emails "enable_login_emails" enable_login_emails "message_content_in_email_notifications" message_content_in_email_notifications "pm_content_in_desktop_notifications" pm_content_in_desktop_notifications "wildcard_mentions_notify" wildcard_mentions_notify "desktop_icon_count_display" desktop_icon_count_display "realm_name_in_notifications" realm_name_in_notifications "presence_enabled" presence_enabled }
              :form-params   {}
              :content-types []
              :accepts       ["application/json"]
              :auth-names    []})))

(defn-spec update-notification-settings json-success-base-spec
  "Update notification settings
  This endpoint is used to edit the user's global notification settings.
See [this endpoint](/api/update-subscription-settings) for
per-stream notification settings.

`PATCH {{ api_url }}/v1/settings/notifications`"
  ([] (update-notification-settings nil))
  ([optional-params any?]
   (let [res (:data (update-notification-settings-with-http-info optional-params))]
     (if (:decode-models *api-context*)
        (st/decode json-success-base-spec res st/string-transformer)
        res))))


(defn-spec update-user-with-http-info any?
  "Update a user
  Administrative endpoint to update the details of another user in the organization.

`PATCH {{ api_url }}/v1/users/{user_id}`

Supports everything an administrator can do to edit details of another
user's account, including editing full name,
[role](/help/roles-and-permissions), and [custom profile
fields](/help/add-custom-profile-fields)."
  ([user_id int?, ] (update-user-with-http-info user_id nil))
  ([user_id int?, {:keys [full_name role profile_data]} (s/map-of keyword? any?)]
   (check-required-params user_id)
   (call-api "/users/{user_id}" :patch
             {:path-params   {"user_id" user_id }
              :header-params {}
              :query-params  {"full_name" full_name "role" role "profile_data" (with-collection-format profile_data :multi) }
              :form-params   {}
              :content-types []
              :accepts       ["application/json"]
              :auth-names    []})))

(defn-spec update-user json-success-spec
  "Update a user
  Administrative endpoint to update the details of another user in the organization.

`PATCH {{ api_url }}/v1/users/{user_id}`

Supports everything an administrator can do to edit details of another
user's account, including editing full name,
[role](/help/roles-and-permissions), and [custom profile
fields](/help/add-custom-profile-fields)."
  ([user_id int?, ] (update-user user_id nil))
  ([user_id int?, optional-params any?]
   (let [res (:data (update-user-with-http-info user_id optional-params))]
     (if (:decode-models *api-context*)
        (st/decode json-success-spec res st/string-transformer)
        res))))


(defn-spec update-user-group-with-http-info any?
  "Update a user group
  Update the name or description of a [user group](/help/user-groups).

`PATCH {{ api_url }}/v1/user_groups/{user_group_id}`"
  [user_group_id int?, name string?, description string?]
  (check-required-params user_group_id name description)
  (call-api "/user_groups/{user_group_id}" :patch
            {:path-params   {"user_group_id" user_group_id }
             :header-params {}
             :query-params  {"name" name "description" description }
             :form-params   {}
             :content-types []
             :accepts       ["application/json"]
             :auth-names    []}))

(defn-spec update-user-group json-success-spec
  "Update a user group
  Update the name or description of a [user group](/help/user-groups).

`PATCH {{ api_url }}/v1/user_groups/{user_group_id}`"
  [user_group_id int?, name string?, description string?]
  (let [res (:data (update-user-group-with-http-info user_group_id name description))]
    (if (:decode-models *api-context*)
       (st/decode json-success-spec res st/string-transformer)
       res)))


(defn-spec update-user-group-members-with-http-info any?
  "Update user group members
  Update the members of a [user group](/help/user-groups).

`POST {{ api_url }}/v1/user_groups/{user_group_id}/members`"
  ([user_group_id int?, ] (update-user-group-members-with-http-info user_group_id nil))
  ([user_group_id int?, {:keys [delete add]} (s/map-of keyword? any?)]
   (check-required-params user_group_id)
   (call-api "/user_groups/{user_group_id}/members" :post
             {:path-params   {"user_group_id" user_group_id }
              :header-params {}
              :query-params  {"delete" (with-collection-format delete :multi) "add" (with-collection-format add :multi) }
              :form-params   {}
              :content-types []
              :accepts       ["application/json"]
              :auth-names    []})))

(defn-spec update-user-group-members json-success-spec
  "Update user group members
  Update the members of a [user group](/help/user-groups).

`POST {{ api_url }}/v1/user_groups/{user_group_id}/members`"
  ([user_group_id int?, ] (update-user-group-members user_group_id nil))
  ([user_group_id int?, optional-params any?]
   (let [res (:data (update-user-group-members-with-http-info user_group_id optional-params))]
     (if (:decode-models *api-context*)
        (st/decode json-success-spec res st/string-transformer)
        res))))


