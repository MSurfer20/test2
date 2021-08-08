(ns zulip-rest-api.api.drafts
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


(defn-spec create-drafts-with-http-info any?
  "Create drafts
  Create one or more drafts on the server. These drafts will be automatically
synchronized to other clients via `drafts` events.

`POST {{ api_url }}/v1/drafts`"
  ([] (create-drafts-with-http-info nil))
  ([{:keys [drafts]} (s/map-of keyword? any?)]
   (call-api "/drafts" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"drafts" (with-collection-format drafts :multi) }
              :form-params   {}
              :content-types []
              :accepts       ["application/json"]
              :auth-names    []})))

(defn-spec create-drafts json-success-spec
  "Create drafts
  Create one or more drafts on the server. These drafts will be automatically
synchronized to other clients via `drafts` events.

`POST {{ api_url }}/v1/drafts`"
  ([] (create-drafts nil))
  ([optional-params any?]
   (let [res (:data (create-drafts-with-http-info optional-params))]
     (if (:decode-models *api-context*)
        (st/decode json-success-spec res st/string-transformer)
        res))))


(defn-spec delete-draft-with-http-info any?
  "Delete a draft
  Delete a single draft from the server. The deletion will be automatically
synchronized to other clients via a `drafts` event.

`DELETE {{ api_url }}/v1/drafts/{draft_id}`"
  [draft_id int?]
  (check-required-params draft_id)
  (call-api "/drafts/{draft_id}" :delete
            {:path-params   {"draft_id" draft_id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/json"]
             :auth-names    []}))

(defn-spec delete-draft json-success-spec
  "Delete a draft
  Delete a single draft from the server. The deletion will be automatically
synchronized to other clients via a `drafts` event.

`DELETE {{ api_url }}/v1/drafts/{draft_id}`"
  [draft_id int?]
  (let [res (:data (delete-draft-with-http-info draft_id))]
    (if (:decode-models *api-context*)
       (st/decode json-success-spec res st/string-transformer)
       res)))


(defn-spec edit-draft-with-http-info any?
  "Edit a draft
  Edit a draft on the server. The edit will be automatically
synchronized to other clients via `drafts` events.

`PATCH {{ api_url }}/v1/drafts/{draft_id}`"
  [draft_id int?, draft draft-spec]
  (check-required-params draft_id draft)
  (call-api "/drafts/{draft_id}" :patch
            {:path-params   {"draft_id" draft_id }
             :header-params {}
             :query-params  {"draft" draft }
             :form-params   {}
             :content-types []
             :accepts       ["application/json"]
             :auth-names    []}))

(defn-spec edit-draft json-success-spec
  "Edit a draft
  Edit a draft on the server. The edit will be automatically
synchronized to other clients via `drafts` events.

`PATCH {{ api_url }}/v1/drafts/{draft_id}`"
  [draft_id int?, draft draft-spec]
  (let [res (:data (edit-draft-with-http-info draft_id draft))]
    (if (:decode-models *api-context*)
       (st/decode json-success-spec res st/string-transformer)
       res)))


(defn-spec get-drafts-with-http-info any?
  "Get drafts
  Fetch all drafts for the current user.

`GET {{ api_url }}/v1/drafts`"
  []
  (call-api "/drafts" :get
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/json"]
             :auth-names    []}))

(defn-spec get-drafts json-success-spec
  "Get drafts
  Fetch all drafts for the current user.

`GET {{ api_url }}/v1/drafts`"
  []
  (let [res (:data (get-drafts-with-http-info))]
    (if (:decode-models *api-context*)
       (st/decode json-success-spec res st/string-transformer)
       res)))


