(ns zulip-rest-api.api.server-and-organizations
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
            [zulip-rest-api.specs.emoji-base :refer :all]
            [zulip-rest-api.specs.get-messages :refer :all]
            [zulip-rest-api.specs.json-success-base-all-of :refer :all]
            [zulip-rest-api.specs.add-subscriptions-response-all-of :refer :all]
            [zulip-rest-api.specs.realm-domain :refer :all]
            [zulip-rest-api.specs.draft :refer :all]
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
            [zulip-rest-api.specs.emoji-reaction-base-all-of-user :refer :all]
            [zulip-rest-api.specs.realm-emoji :refer :all]
            [zulip-rest-api.specs.json-response-base :refer :all]
            [zulip-rest-api.specs.basic-bot-base :refer :all]
            [zulip-rest-api.specs.user-base :refer :all]
            [zulip-rest-api.specs.emoji-reaction-base-all-of :refer :all]
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


(defn-spec add-code-playground-with-http-info any?
  "Add a code playground
  Configure [code playgrounds](/help/code-blocks#code-playgrounds) for the organization.

`POST {{ api_url }}/v1/realm/playgrounds`

**Changes**: New in Zulip 4.0 (feature level 49). A parameter encoding bug was
fixed in Zulip 4.0 (feature level 57)."
  [name string?, pygments_language string?, url_prefix string?]
  (check-required-params name pygments_language url_prefix)
  (call-api "/realm/playgrounds" :post
            {:path-params   {}
             :header-params {}
             :query-params  {"name" name "pygments_language" pygments_language "url_prefix" url_prefix }
             :form-params   {}
             :content-types []
             :accepts       ["application/json"]
             :auth-names    []}))

(defn-spec add-code-playground json-success-base-spec
  "Add a code playground
  Configure [code playgrounds](/help/code-blocks#code-playgrounds) for the organization.

`POST {{ api_url }}/v1/realm/playgrounds`

**Changes**: New in Zulip 4.0 (feature level 49). A parameter encoding bug was
fixed in Zulip 4.0 (feature level 57)."
  [name string?, pygments_language string?, url_prefix string?]
  (let [res (:data (add-code-playground-with-http-info name pygments_language url_prefix))]
    (if (:decode-models *api-context*)
       (st/decode json-success-base-spec res st/string-transformer)
       res)))


(defn-spec add-linkifier-with-http-info any?
  "Add a linkifier
  Configure [linkifiers](/help/add-a-custom-linkifier),
regular expression patterns that are automatically linkified when they
appear in messages and topics.

`POST {{ api_url }}/v1/realm/filters`"
  [pattern string?, url_format_string string?]
  (check-required-params pattern url_format_string)
  (call-api "/realm/filters" :post
            {:path-params   {}
             :header-params {}
             :query-params  {"pattern" pattern "url_format_string" url_format_string }
             :form-params   {}
             :content-types []
             :accepts       ["application/json"]
             :auth-names    []}))

(defn-spec add-linkifier json-success-base-spec
  "Add a linkifier
  Configure [linkifiers](/help/add-a-custom-linkifier),
regular expression patterns that are automatically linkified when they
appear in messages and topics.

`POST {{ api_url }}/v1/realm/filters`"
  [pattern string?, url_format_string string?]
  (let [res (:data (add-linkifier-with-http-info pattern url_format_string))]
    (if (:decode-models *api-context*)
       (st/decode json-success-base-spec res st/string-transformer)
       res)))


(defn-spec create-custom-profile-field-with-http-info any?
  "Create a custom profile field
  [Create a custom profile field](/help/add-custom-profile-fields) in the user's organization.

`POST {{ api_url }}/v1/realm/profile_fields`"
  ([field_type int?, ] (create-custom-profile-field-with-http-info field_type nil))
  ([field_type int?, {:keys [name hint field_data]} (s/map-of keyword? any?)]
   (check-required-params field_type)
   (call-api "/realm/profile_fields" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"name" name "hint" hint "field_type" field_type "field_data" field_data }
              :form-params   {}
              :content-types []
              :accepts       ["application/json"]
              :auth-names    []})))

(defn-spec create-custom-profile-field json-success-base-spec
  "Create a custom profile field
  [Create a custom profile field](/help/add-custom-profile-fields) in the user's organization.

`POST {{ api_url }}/v1/realm/profile_fields`"
  ([field_type int?, ] (create-custom-profile-field field_type nil))
  ([field_type int?, optional-params any?]
   (let [res (:data (create-custom-profile-field-with-http-info field_type optional-params))]
     (if (:decode-models *api-context*)
        (st/decode json-success-base-spec res st/string-transformer)
        res))))


(defn-spec get-custom-emoji-with-http-info any?
  "Get all custom emoji
  Get all the custom emoji in the user's organization.

`GET {{ api_url }}/v1/realm/emoji`"
  []
  (call-api "/realm/emoji" :get
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/json"]
             :auth-names    []}))

(defn-spec get-custom-emoji json-success-base-spec
  "Get all custom emoji
  Get all the custom emoji in the user's organization.

`GET {{ api_url }}/v1/realm/emoji`"
  []
  (let [res (:data (get-custom-emoji-with-http-info))]
    (if (:decode-models *api-context*)
       (st/decode json-success-base-spec res st/string-transformer)
       res)))


(defn-spec get-custom-profile-fields-with-http-info any?
  "Get all custom profile fields
  Get all the [custom profile fields](/help/add-custom-profile-fields)
configured for the user's organization.

`GET {{ api_url }}/v1/realm/profile_fields`"
  []
  (call-api "/realm/profile_fields" :get
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/json"]
             :auth-names    []}))

(defn-spec get-custom-profile-fields json-success-base-spec
  "Get all custom profile fields
  Get all the [custom profile fields](/help/add-custom-profile-fields)
configured for the user's organization.

`GET {{ api_url }}/v1/realm/profile_fields`"
  []
  (let [res (:data (get-custom-profile-fields-with-http-info))]
    (if (:decode-models *api-context*)
       (st/decode json-success-base-spec res st/string-transformer)
       res)))


(defn-spec get-linkifiers-with-http-info any?
  "Get linkifiers
  List all of an organization's configured
[linkifiers](/help/add-a-custom-linkifier), regular
expression patterns that are automatically linkified when they appear
in messages and topics.

`GET {{ api_url }}/v1/realm/linkifiers`

**Changes**: New in Zulip 4.0 (feature level 54). On older versions,
a similar `GET /realm/filters` endpoint was available with each entry in
a `[pattern, url_format, id]` tuple format."
  []
  (call-api "/realm/linkifiers" :get
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/json"]
             :auth-names    []}))

(defn-spec get-linkifiers json-success-base-spec
  "Get linkifiers
  List all of an organization's configured
[linkifiers](/help/add-a-custom-linkifier), regular
expression patterns that are automatically linkified when they appear
in messages and topics.

`GET {{ api_url }}/v1/realm/linkifiers`

**Changes**: New in Zulip 4.0 (feature level 54). On older versions,
a similar `GET /realm/filters` endpoint was available with each entry in
a `[pattern, url_format, id]` tuple format."
  []
  (let [res (:data (get-linkifiers-with-http-info))]
    (if (:decode-models *api-context*)
       (st/decode json-success-base-spec res st/string-transformer)
       res)))


(defn-spec get-server-settings-with-http-info any?
  "Get server settings
  Fetch global settings for a Zulip server.

`GET {{ api_url }}/v1/server_settings`

**Note:** this endpoint does not require any authentication at all, and you can use it to check:

* If this is a Zulip server, and if so, what version of Zulip it's running.
* What a Zulip client (e.g. a mobile app or
[zulip-terminal](https://github.com/zulip/zulip-terminal/)) needs to
know in order to display a login prompt for the server (e.g. what
authentication methods are available)."
  []
  (call-api "/server_settings" :get
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/json"]
             :auth-names    []}))

(defn-spec get-server-settings json-success-base-spec
  "Get server settings
  Fetch global settings for a Zulip server.

`GET {{ api_url }}/v1/server_settings`

**Note:** this endpoint does not require any authentication at all, and you can use it to check:

* If this is a Zulip server, and if so, what version of Zulip it's running.
* What a Zulip client (e.g. a mobile app or
[zulip-terminal](https://github.com/zulip/zulip-terminal/)) needs to
know in order to display a login prompt for the server (e.g. what
authentication methods are available)."
  []
  (let [res (:data (get-server-settings-with-http-info))]
    (if (:decode-models *api-context*)
       (st/decode json-success-base-spec res st/string-transformer)
       res)))


(defn-spec remove-code-playground-with-http-info any?
  "Remove a code playground
  Remove a [code playground](/help/code-blocks#code-playgrounds) previously
configured for an organization.

`DELETE {{ api_url }}/v1/realm/playgrounds/{playground_id}`

**Changes**: New in Zulip 4.0 (feature level 49)."
  [playground_id int?]
  (check-required-params playground_id)
  (call-api "/realm/playgrounds/{playground_id}" :delete
            {:path-params   {"playground_id" playground_id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/json"]
             :auth-names    []}))

(defn-spec remove-code-playground json-success-spec
  "Remove a code playground
  Remove a [code playground](/help/code-blocks#code-playgrounds) previously
configured for an organization.

`DELETE {{ api_url }}/v1/realm/playgrounds/{playground_id}`

**Changes**: New in Zulip 4.0 (feature level 49)."
  [playground_id int?]
  (let [res (:data (remove-code-playground-with-http-info playground_id))]
    (if (:decode-models *api-context*)
       (st/decode json-success-spec res st/string-transformer)
       res)))


(defn-spec remove-linkifier-with-http-info any?
  "Remove a linkifier
  Remove [linkifiers](/help/add-a-custom-linkifier), regular
expression patterns that are automatically linkified when they appear
in messages and topics.

`DELETE {{ api_url }}/v1/realm/filters/{filter_id}`"
  [filter_id int?]
  (check-required-params filter_id)
  (call-api "/realm/filters/{filter_id}" :delete
            {:path-params   {"filter_id" filter_id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/json"]
             :auth-names    []}))

(defn-spec remove-linkifier json-success-spec
  "Remove a linkifier
  Remove [linkifiers](/help/add-a-custom-linkifier), regular
expression patterns that are automatically linkified when they appear
in messages and topics.

`DELETE {{ api_url }}/v1/realm/filters/{filter_id}`"
  [filter_id int?]
  (let [res (:data (remove-linkifier-with-http-info filter_id))]
    (if (:decode-models *api-context*)
       (st/decode json-success-spec res st/string-transformer)
       res)))


(defn-spec reorder-custom-profile-fields-with-http-info any?
  "Reorder custom profile fields
  Reorder the custom profile fields in the user's organization.

`PATCH {{ api_url }}/v1/realm/profile_fields`

Custom profile fields are displayed in Zulip UI widgets in order; this
endpoint allows administrative settings UI to change the field ordering.

This endpoint is used to implement the dragging feature described in the
[custom profile fields documentation](/help/add-custom-profile-fields)."
  [order (s/coll-of int?)]
  (check-required-params order)
  (call-api "/realm/profile_fields" :patch
            {:path-params   {}
             :header-params {}
             :query-params  {"order" (with-collection-format order :multi) }
             :form-params   {}
             :content-types []
             :accepts       ["application/json"]
             :auth-names    []}))

(defn-spec reorder-custom-profile-fields json-success-spec
  "Reorder custom profile fields
  Reorder the custom profile fields in the user's organization.

`PATCH {{ api_url }}/v1/realm/profile_fields`

Custom profile fields are displayed in Zulip UI widgets in order; this
endpoint allows administrative settings UI to change the field ordering.

This endpoint is used to implement the dragging feature described in the
[custom profile fields documentation](/help/add-custom-profile-fields)."
  [order (s/coll-of int?)]
  (let [res (:data (reorder-custom-profile-fields-with-http-info order))]
    (if (:decode-models *api-context*)
       (st/decode json-success-spec res st/string-transformer)
       res)))


(defn-spec update-linkifier-with-http-info any?
  "Update a linkifier
  Update a [linkifier](/help/add-a-custom-linkifier), regular
expression patterns that are automatically linkified when they appear
in messages and topics.

`PATCH {{ api_url }}/v1/realm/filters/{filter_id}`

**Changes**: New in Zulip 4.0 (feature level 57)."
  [filter_id int?, pattern string?, url_format_string string?]
  (check-required-params filter_id pattern url_format_string)
  (call-api "/realm/filters/{filter_id}" :patch
            {:path-params   {"filter_id" filter_id }
             :header-params {}
             :query-params  {"pattern" pattern "url_format_string" url_format_string }
             :form-params   {}
             :content-types []
             :accepts       ["application/json"]
             :auth-names    []}))

(defn-spec update-linkifier json-success-spec
  "Update a linkifier
  Update a [linkifier](/help/add-a-custom-linkifier), regular
expression patterns that are automatically linkified when they appear
in messages and topics.

`PATCH {{ api_url }}/v1/realm/filters/{filter_id}`

**Changes**: New in Zulip 4.0 (feature level 57)."
  [filter_id int?, pattern string?, url_format_string string?]
  (let [res (:data (update-linkifier-with-http-info filter_id pattern url_format_string))]
    (if (:decode-models *api-context*)
       (st/decode json-success-spec res st/string-transformer)
       res)))


(defn-spec upload-custom-emoji-with-http-info any?
  "Upload custom emoji
  This endpoint is used to upload a custom emoji for use in the user's
organization.  Access to this endpoint depends on the
[organization's configuration](https://zulip.com/help/only-allow-admins-to-add-emoji).

`POST {{ api_url }}/v1/realm/emoji/{emoji_name}`"
  ([emoji_name string?, ] (upload-custom-emoji-with-http-info emoji_name nil))
  ([emoji_name string?, {:keys [^File filename]} (s/map-of keyword? any?)]
   (check-required-params emoji_name)
   (call-api "/realm/emoji/{emoji_name}" :post
             {:path-params   {"emoji_name" emoji_name }
              :header-params {}
              :query-params  {}
              :form-params   {"filename" filename }
              :content-types ["multipart/form-data"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn-spec upload-custom-emoji json-success-spec
  "Upload custom emoji
  This endpoint is used to upload a custom emoji for use in the user's
organization.  Access to this endpoint depends on the
[organization's configuration](https://zulip.com/help/only-allow-admins-to-add-emoji).

`POST {{ api_url }}/v1/realm/emoji/{emoji_name}`"
  ([emoji_name string?, ] (upload-custom-emoji emoji_name nil))
  ([emoji_name string?, optional-params any?]
   (let [res (:data (upload-custom-emoji-with-http-info emoji_name optional-params))]
     (if (:decode-models *api-context*)
        (st/decode json-success-spec res st/string-transformer)
        res))))


