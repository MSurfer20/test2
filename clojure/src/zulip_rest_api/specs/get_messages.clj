(ns zulip-rest-api.specs.get-messages
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [zulip-rest-api.specs. :refer :all]
            [zulip-rest-api.specs. :refer :all]
            [zulip-rest-api.specs. :refer :all]
            [zulip-rest-api.specs. :refer :all]
            [zulip-rest-api.specs. :refer :all]
            [zulip-rest-api.specs. :refer :all]
            [zulip-rest-api.specs. :refer :all]
            [zulip-rest-api.specs. :refer :all]
            [zulip-rest-api.specs. :refer :all]
            [zulip-rest-api.specs. :refer :all]
            [zulip-rest-api.specs. :refer :all]
            [zulip-rest-api.specs. :refer :all]
            [zulip-rest-api.specs. :refer :all]
            [zulip-rest-api.specs. :refer :all]
            [zulip-rest-api.specs. :refer :all]
            [zulip-rest-api.specs. :refer :all]
            [zulip-rest-api.specs. :refer :all]
            [zulip-rest-api.specs. :refer :all]
            [zulip-rest-api.specs. :refer :all]
            )
  (:import (java.io File)))


(def get-messages-data
  {
   (ds/opt :avatar_url) any-type-spec
   (ds/opt :client) any-type-spec
   (ds/opt :content) any-type-spec
   (ds/opt :content_type) any-type-spec
   (ds/opt :display_recipient) any-type-spec
   (ds/opt :id) any-type-spec
   (ds/opt :is_me_message) any-type-spec
   (ds/opt :reactions) any-type-spec
   (ds/opt :recipient_id) any-type-spec
   (ds/opt :sender_email) any-type-spec
   (ds/opt :sender_full_name) any-type-spec
   (ds/opt :sender_id) any-type-spec
   (ds/opt :sender_realm_str) any-type-spec
   (ds/opt :stream_id) any-type-spec
   (ds/opt :subject) any-type-spec
   (ds/opt :topic_links) any-type-spec
   (ds/opt :submessages) any-type-spec
   (ds/opt :timestamp) any-type-spec
   (ds/opt :type) any-type-spec
   (ds/opt :flags) (s/coll-of string?)
   (ds/opt :last_edit_timestamp) int?
   (ds/opt :match_content) string?
   (ds/opt :match_subject) string?
   })

(def get-messages-spec
  (ds/spec
    {:name ::get-messages
     :spec get-messages-data}))
