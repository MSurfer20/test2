(ns zulip-rest-api.api.webhooks
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


(defn-spec zulip-outgoing-webhooks-with-http-info any?
  "Outgoing webhooks
  Outgoing webhooks allows to build or set up Zulip integrations which are
notified when certain types of messages are sent in Zulip."
  []
  (call-api "/zulip-outgoing-webhook" :post
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/json"]
             :auth-names    []}))

(defn-spec zulip-outgoing-webhooks inline-response-200-spec
  "Outgoing webhooks
  Outgoing webhooks allows to build or set up Zulip integrations which are
notified when certain types of messages are sent in Zulip."
  []
  (let [res (:data (zulip-outgoing-webhooks-with-http-info))]
    (if (:decode-models *api-context*)
       (st/decode inline-response-200-spec res st/string-transformer)
       res)))


