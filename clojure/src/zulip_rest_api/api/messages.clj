(ns zulip-rest-api.api.messages
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


(defn-spec add-reaction-with-http-info any?
  "Add an emoji reaction
  Add an [emoji reaction](/help/emoji-reactions) to a message.

`POST {{ api_url }}/v1/messages/{message_id}/reactions`"
  ([message_id int?, emoji_name string?, ] (add-reaction-with-http-info message_id emoji_name nil))
  ([message_id int?, emoji_name string?, {:keys [emoji_code reaction_type]} (s/map-of keyword? any?)]
   (check-required-params message_id emoji_name)
   (call-api "/messages/{message_id}/reactions" :post
             {:path-params   {"message_id" message_id }
              :header-params {}
              :query-params  {"emoji_name" emoji_name "emoji_code" emoji_code "reaction_type" reaction_type }
              :form-params   {}
              :content-types []
              :accepts       ["application/json"]
              :auth-names    []})))

(defn-spec add-reaction json-success-spec
  "Add an emoji reaction
  Add an [emoji reaction](/help/emoji-reactions) to a message.

`POST {{ api_url }}/v1/messages/{message_id}/reactions`"
  ([message_id int?, emoji_name string?, ] (add-reaction message_id emoji_name nil))
  ([message_id int?, emoji_name string?, optional-params any?]
   (let [res (:data (add-reaction-with-http-info message_id emoji_name optional-params))]
     (if (:decode-models *api-context*)
        (st/decode json-success-spec res st/string-transformer)
        res))))


(defn-spec check-messages-match-narrow-with-http-info any?
  "Check if messages match a narrow
  Check whether a set of messages match a [narrow](/api/construct-narrow).

`GET {{ api_url }}/v1/messages/matches_narrow`

For many common narrows (E.g. a topic), clients can write an
efficient client-side check to determine whether a
newly arrived message belongs in the view.

This endpoint is designed to allow clients to handle more complex narrows
for which the client does not (or in the case of full-text search,
cannot) implement this check.

The format of the `match_subject` and `match_content` objects is designed to match
those of `GET /messages`, so that a client can splice these fields into a
`message` object received from `GET /events` and end up with an extended message
object identical to how a `GET /messages` for the current narrow would have
returned the message."
  [msg_ids (s/coll-of int?), narrow (s/coll-of any?)]
  (check-required-params msg_ids narrow)
  (call-api "/messages/matches_narrow" :get
            {:path-params   {}
             :header-params {}
             :query-params  {"msg_ids" (with-collection-format msg_ids :multi) "narrow" (with-collection-format narrow :multi) }
             :form-params   {}
             :content-types []
             :accepts       ["application/json"]
             :auth-names    []}))

(defn-spec check-messages-match-narrow any-type-spec
  "Check if messages match a narrow
  Check whether a set of messages match a [narrow](/api/construct-narrow).

`GET {{ api_url }}/v1/messages/matches_narrow`

For many common narrows (E.g. a topic), clients can write an
efficient client-side check to determine whether a
newly arrived message belongs in the view.

This endpoint is designed to allow clients to handle more complex narrows
for which the client does not (or in the case of full-text search,
cannot) implement this check.

The format of the `match_subject` and `match_content` objects is designed to match
those of `GET /messages`, so that a client can splice these fields into a
`message` object received from `GET /events` and end up with an extended message
object identical to how a `GET /messages` for the current narrow would have
returned the message."
  [msg_ids (s/coll-of int?), narrow (s/coll-of any?)]
  (let [res (:data (check-messages-match-narrow-with-http-info msg_ids narrow))]
    (if (:decode-models *api-context*)
       (st/decode any-type-spec res st/string-transformer)
       res)))


(defn-spec delete-message-with-http-info any?
  "Delete a message
  Permanently delete a message.

`DELETE {{ api_url }}/v1/messages/{msg_id}`

This API corresponds to the
[delete a message completely][delete-completely] feature documented in
the Zulip Help Center.

[delete-completely]: /help/edit-or-delete-a-message#delete-a-message-completely"
  [message_id int?]
  (check-required-params message_id)
  (call-api "/messages/{message_id}" :delete
            {:path-params   {"message_id" message_id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/json"]
             :auth-names    []}))

(defn-spec delete-message json-success-spec
  "Delete a message
  Permanently delete a message.

`DELETE {{ api_url }}/v1/messages/{msg_id}`

This API corresponds to the
[delete a message completely][delete-completely] feature documented in
the Zulip Help Center.

[delete-completely]: /help/edit-or-delete-a-message#delete-a-message-completely"
  [message_id int?]
  (let [res (:data (delete-message-with-http-info message_id))]
    (if (:decode-models *api-context*)
       (st/decode json-success-spec res st/string-transformer)
       res)))


(defn-spec get-file-temporary-url-with-http-info any?
  "Get public temporary URL
  Get a temporary URL for access to the file that doesn't require authentication."
  [realm_id_str int?, filename string?]
  (check-required-params realm_id_str filename)
  (call-api "/user_uploads/{realm_id_str}/{filename}" :get
            {:path-params   {"realm_id_str" realm_id_str "filename" filename }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/json"]
             :auth-names    []}))

(defn-spec get-file-temporary-url json-success-base-spec
  "Get public temporary URL
  Get a temporary URL for access to the file that doesn't require authentication."
  [realm_id_str int?, filename string?]
  (let [res (:data (get-file-temporary-url-with-http-info realm_id_str filename))]
    (if (:decode-models *api-context*)
       (st/decode json-success-base-spec res st/string-transformer)
       res)))


(defn-spec get-message-history-with-http-info any?
  "Get a message's edit history
  Fetch the message edit history of a previously edited message.

`GET {{ api_url }}/v1/messages/{message_id}/history`

Note that edit history may be disabled in some organizations; see the
[Zulip Help Center documentation on editing messages][edit-settings].

[edit-settings]: /help/view-a-messages-edit-history"
  [message_id int?]
  (check-required-params message_id)
  (call-api "/messages/{message_id}/history" :get
            {:path-params   {"message_id" message_id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/json"]
             :auth-names    []}))

(defn-spec get-message-history json-success-base-spec
  "Get a message's edit history
  Fetch the message edit history of a previously edited message.

`GET {{ api_url }}/v1/messages/{message_id}/history`

Note that edit history may be disabled in some organizations; see the
[Zulip Help Center documentation on editing messages][edit-settings].

[edit-settings]: /help/view-a-messages-edit-history"
  [message_id int?]
  (let [res (:data (get-message-history-with-http-info message_id))]
    (if (:decode-models *api-context*)
       (st/decode json-success-base-spec res st/string-transformer)
       res)))


(defn-spec get-messages-with-http-info any?
  "Get messages
  Fetch message history from a Zulip server.

`GET {{ api_url }}/v1/messages`

This `GET /api/v1/messages` endpoint is the primary way to fetch
message history from a Zulip server.  It is useful both for Zulip
clients (e.g. the web, desktop, mobile, and terminal clients) as well
as bots, API clients, backup scripts, etc.

By specifying a [narrow filter](/api/construct-narrow), you can use
this endpoint to fetch the messages matching any search query that is
supported by Zulip's powerful full-text search backend.

When a narrow is not specified, it can be used to fetch a user's
message history. (We recommend paginating to 1000 messages at a time.)

In either case, you specify an `anchor` message (or ask the server to
calculate the first unread message for you and use that as the
anchor), as well as a number of messages before and after the anchor
message.  The server returns those messages, sorted by message ID, as
well as some metadata that makes it easy for a client to determine
whether there are more messages matching the query that were not
returned due to the `num_before` and `num_after` limits.

We recommend using `num_before <= 1000` and `num_after <= 1000` to
avoid generating very large HTTP responses. A maximum of 5000 messages
can be obtained per request; attempting to exceed this will result in an
error."
  ([num_before int?, num_after int?, ] (get-messages-with-http-info num_before num_after nil))
  ([num_before int?, num_after int?, {:keys [anchor narrow client_gravatar apply_markdown use_first_unread_anchor]} (s/map-of keyword? any?)]
   (check-required-params num_before num_after)
   (call-api "/messages" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"anchor" anchor "num_before" num_before "num_after" num_after "narrow" (with-collection-format narrow :multi) "client_gravatar" client_gravatar "apply_markdown" apply_markdown "use_first_unread_anchor" use_first_unread_anchor }
              :form-params   {}
              :content-types []
              :accepts       ["application/json"]
              :auth-names    []})))

(defn-spec get-messages json-success-base-spec
  "Get messages
  Fetch message history from a Zulip server.

`GET {{ api_url }}/v1/messages`

This `GET /api/v1/messages` endpoint is the primary way to fetch
message history from a Zulip server.  It is useful both for Zulip
clients (e.g. the web, desktop, mobile, and terminal clients) as well
as bots, API clients, backup scripts, etc.

By specifying a [narrow filter](/api/construct-narrow), you can use
this endpoint to fetch the messages matching any search query that is
supported by Zulip's powerful full-text search backend.

When a narrow is not specified, it can be used to fetch a user's
message history. (We recommend paginating to 1000 messages at a time.)

In either case, you specify an `anchor` message (or ask the server to
calculate the first unread message for you and use that as the
anchor), as well as a number of messages before and after the anchor
message.  The server returns those messages, sorted by message ID, as
well as some metadata that makes it easy for a client to determine
whether there are more messages matching the query that were not
returned due to the `num_before` and `num_after` limits.

We recommend using `num_before <= 1000` and `num_after <= 1000` to
avoid generating very large HTTP responses. A maximum of 5000 messages
can be obtained per request; attempting to exceed this will result in an
error."
  ([num_before int?, num_after int?, ] (get-messages num_before num_after nil))
  ([num_before int?, num_after int?, optional-params any?]
   (let [res (:data (get-messages-with-http-info num_before num_after optional-params))]
     (if (:decode-models *api-context*)
        (st/decode json-success-base-spec res st/string-transformer)
        res))))


(defn-spec get-raw-message-with-http-info any?
  "Get a message's raw Markdown
  Get the raw content of a message.

`GET {{ api_url }}/v1/messages/{msg_id}`

This is a rarely-used endpoint relevant for clients that primarily
work with HTML-rendered messages but might need to occasionally fetch
the message's raw Markdown (e.g. for pre-filling a message-editing
UI)."
  [message_id int?]
  (check-required-params message_id)
  (call-api "/messages/{message_id}" :get
            {:path-params   {"message_id" message_id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/json"]
             :auth-names    []}))

(defn-spec get-raw-message json-success-base-spec
  "Get a message's raw Markdown
  Get the raw content of a message.

`GET {{ api_url }}/v1/messages/{msg_id}`

This is a rarely-used endpoint relevant for clients that primarily
work with HTML-rendered messages but might need to occasionally fetch
the message's raw Markdown (e.g. for pre-filling a message-editing
UI)."
  [message_id int?]
  (let [res (:data (get-raw-message-with-http-info message_id))]
    (if (:decode-models *api-context*)
       (st/decode json-success-base-spec res st/string-transformer)
       res)))


(defn-spec mark-all-as-read-with-http-info any?
  "Mark all messages as read
  Marks all of the current user's unread messages as read.

`POST {{ api_url }}/v1/mark_all_as_read`"
  []
  (call-api "/mark_all_as_read" :post
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/json"]
             :auth-names    []}))

(defn-spec mark-all-as-read json-success-spec
  "Mark all messages as read
  Marks all of the current user's unread messages as read.

`POST {{ api_url }}/v1/mark_all_as_read`"
  []
  (let [res (:data (mark-all-as-read-with-http-info))]
    (if (:decode-models *api-context*)
       (st/decode json-success-spec res st/string-transformer)
       res)))


(defn-spec mark-stream-as-read-with-http-info any?
  "Mark messages in a stream as read
  Mark all the unread messages in a stream as read."
  [stream_id int?]
  (check-required-params stream_id)
  (call-api "/mark_stream_as_read" :post
            {:path-params   {}
             :header-params {}
             :query-params  {"stream_id" stream_id }
             :form-params   {}
             :content-types []
             :accepts       ["application/json"]
             :auth-names    []}))

(defn-spec mark-stream-as-read json-success-spec
  "Mark messages in a stream as read
  Mark all the unread messages in a stream as read."
  [stream_id int?]
  (let [res (:data (mark-stream-as-read-with-http-info stream_id))]
    (if (:decode-models *api-context*)
       (st/decode json-success-spec res st/string-transformer)
       res)))


(defn-spec mark-topic-as-read-with-http-info any?
  "Mark messages in a topic as read
  Mark all the unread messages in a topic as read."
  [stream_id int?, topic_name string?]
  (check-required-params stream_id topic_name)
  (call-api "/mark_topic_as_read" :post
            {:path-params   {}
             :header-params {}
             :query-params  {"stream_id" stream_id "topic_name" topic_name }
             :form-params   {}
             :content-types []
             :accepts       ["application/json"]
             :auth-names    []}))

(defn-spec mark-topic-as-read json-success-spec
  "Mark messages in a topic as read
  Mark all the unread messages in a topic as read."
  [stream_id int?, topic_name string?]
  (let [res (:data (mark-topic-as-read-with-http-info stream_id topic_name))]
    (if (:decode-models *api-context*)
       (st/decode json-success-spec res st/string-transformer)
       res)))


(defn-spec remove-reaction-with-http-info any?
  "Remove an emoji reaction
  Remove an [emoji reaction](/help/emoji-reactions) from a message.

`DELETE {{ api_url }}/v1/messages/{message_id}/reactions`"
  ([message_id int?, ] (remove-reaction-with-http-info message_id nil))
  ([message_id int?, {:keys [emoji_name emoji_code reaction_type]} (s/map-of keyword? any?)]
   (check-required-params message_id)
   (call-api "/messages/{message_id}/reactions" :delete
             {:path-params   {"message_id" message_id }
              :header-params {}
              :query-params  {"emoji_name" emoji_name "emoji_code" emoji_code "reaction_type" reaction_type }
              :form-params   {}
              :content-types []
              :accepts       ["application/json"]
              :auth-names    []})))

(defn-spec remove-reaction json-success-spec
  "Remove an emoji reaction
  Remove an [emoji reaction](/help/emoji-reactions) from a message.

`DELETE {{ api_url }}/v1/messages/{message_id}/reactions`"
  ([message_id int?, ] (remove-reaction message_id nil))
  ([message_id int?, optional-params any?]
   (let [res (:data (remove-reaction-with-http-info message_id optional-params))]
     (if (:decode-models *api-context*)
        (st/decode json-success-spec res st/string-transformer)
        res))))


(defn-spec render-message-with-http-info any?
  "Render message
  Render a message to HTML.

`POST {{ api_url }}/v1/messages/render`"
  [content string?]
  (check-required-params content)
  (call-api "/messages/render" :post
            {:path-params   {}
             :header-params {}
             :query-params  {"content" content }
             :form-params   {}
             :content-types []
             :accepts       ["application/json"]
             :auth-names    []}))

(defn-spec render-message json-success-base-spec
  "Render message
  Render a message to HTML.

`POST {{ api_url }}/v1/messages/render`"
  [content string?]
  (let [res (:data (render-message-with-http-info content))]
    (if (:decode-models *api-context*)
       (st/decode json-success-base-spec res st/string-transformer)
       res)))


(defn-spec send-message-with-http-info any?
  "Send a message
  Send a stream or a private message.

`POST {{ api_url }}/v1/messages`"
  ([type string?, to (s/coll-of int?), content string?, ] (send-message-with-http-info type to content nil))
  ([type string?, to (s/coll-of int?), content string?, {:keys [topic queue_id local_id]} (s/map-of keyword? any?)]
   (check-required-params type to content)
   (call-api "/messages" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"type" type "to" (with-collection-format to :multi) "content" content "topic" topic "queue_id" queue_id "local_id" local_id }
              :form-params   {}
              :content-types []
              :accepts       ["application/json"]
              :auth-names    []})))

(defn-spec send-message json-success-base-spec
  "Send a message
  Send a stream or a private message.

`POST {{ api_url }}/v1/messages`"
  ([type string?, to (s/coll-of int?), content string?, ] (send-message type to content nil))
  ([type string?, to (s/coll-of int?), content string?, optional-params any?]
   (let [res (:data (send-message-with-http-info type to content optional-params))]
     (if (:decode-models *api-context*)
        (st/decode json-success-base-spec res st/string-transformer)
        res))))


(defn-spec update-message-with-http-info any?
  "Edit a message
  Edit/update the content or topic of a message.

`PATCH {{ api_url }}/v1/messages/{msg_id}`

`{msg_id}` in the above URL should be replaced with the ID of the
message you wish you update.

You can [resolve topics](/help/resolve-a-topic) by editing the
topic to `✔ {original_topic}`.

**Note**: See [configuring message
editing][config-message-editing] for detailed documentation on
when users are allowed to edit topics.

[config-message-editing]: /help/configure-message-editing-and-deletion"
  ([message_id int?, ] (update-message-with-http-info message_id nil))
  ([message_id int?, {:keys [topic propagate_mode send_notification_to_old_thread send_notification_to_new_thread content stream_id]} (s/map-of keyword? any?)]
   (check-required-params message_id)
   (call-api "/messages/{message_id}" :patch
             {:path-params   {"message_id" message_id }
              :header-params {}
              :query-params  {"topic" topic "propagate_mode" propagate_mode "send_notification_to_old_thread" send_notification_to_old_thread "send_notification_to_new_thread" send_notification_to_new_thread "content" content "stream_id" stream_id }
              :form-params   {}
              :content-types []
              :accepts       ["application/json"]
              :auth-names    []})))

(defn-spec update-message json-success-spec
  "Edit a message
  Edit/update the content or topic of a message.

`PATCH {{ api_url }}/v1/messages/{msg_id}`

`{msg_id}` in the above URL should be replaced with the ID of the
message you wish you update.

You can [resolve topics](/help/resolve-a-topic) by editing the
topic to `✔ {original_topic}`.

**Note**: See [configuring message
editing][config-message-editing] for detailed documentation on
when users are allowed to edit topics.

[config-message-editing]: /help/configure-message-editing-and-deletion"
  ([message_id int?, ] (update-message message_id nil))
  ([message_id int?, optional-params any?]
   (let [res (:data (update-message-with-http-info message_id optional-params))]
     (if (:decode-models *api-context*)
        (st/decode json-success-spec res st/string-transformer)
        res))))


(defn-spec update-message-flags-with-http-info any?
  "Update personal message flags
  Add or remove personal message flags like `read` and `starred`
on a collection of message IDs.

`POST {{ api_url }}/v1/messages/flags`

For updating the `read` flag on common collections of messages, see also
the
[special endpoints for marking message as read in bulk](/api/mark-all-as-read)."
  [messages (s/coll-of int?), op string?, flag string?]
  (check-required-params messages op flag)
  (call-api "/messages/flags" :post
            {:path-params   {}
             :header-params {}
             :query-params  {"messages" (with-collection-format messages :multi) "op" op "flag" flag }
             :form-params   {}
             :content-types []
             :accepts       ["application/json"]
             :auth-names    []}))

(defn-spec update-message-flags json-success-base-spec
  "Update personal message flags
  Add or remove personal message flags like `read` and `starred`
on a collection of message IDs.

`POST {{ api_url }}/v1/messages/flags`

For updating the `read` flag on common collections of messages, see also
the
[special endpoints for marking message as read in bulk](/api/mark-all-as-read)."
  [messages (s/coll-of int?), op string?, flag string?]
  (let [res (:data (update-message-flags-with-http-info messages op flag))]
    (if (:decode-models *api-context*)
       (st/decode json-success-base-spec res st/string-transformer)
       res)))


(defn-spec upload-file-with-http-info any?
  "Upload a file
  Upload a single file and get the corresponding URI.

`POST {{ api_url }}/v1/user_uploads`

Initially, only you will be able to access the link.  To share the
uploaded file, you'll need to [send a message][send-message]
containing the resulting link.  Users who can already access the link
can reshare it with other users by sending additional Zulip messages
containing the link.

[uploaded-files]: /help/manage-your-uploaded-files
[send-message]: /api/send-message"
  ([] (upload-file-with-http-info nil))
  ([{:keys [^File filename]} (s/map-of keyword? any?)]
   (call-api "/user_uploads" :post
             {:path-params   {}
              :header-params {}
              :query-params  {}
              :form-params   {"filename" filename }
              :content-types ["multipart/form-data"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn-spec upload-file json-success-base-spec
  "Upload a file
  Upload a single file and get the corresponding URI.

`POST {{ api_url }}/v1/user_uploads`

Initially, only you will be able to access the link.  To share the
uploaded file, you'll need to [send a message][send-message]
containing the resulting link.  Users who can already access the link
can reshare it with other users by sending additional Zulip messages
containing the link.

[uploaded-files]: /help/manage-your-uploaded-files
[send-message]: /api/send-message"
  ([] (upload-file nil))
  ([optional-params any?]
   (let [res (:data (upload-file-with-http-info optional-params))]
     (if (:decode-models *api-context*)
        (st/decode json-success-base-spec res st/string-transformer)
        res))))


