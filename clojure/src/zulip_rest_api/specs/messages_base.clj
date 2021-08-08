(ns zulip-rest-api.specs.messages-base
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [zulip-rest-api.specs.one-of&lt;string,array&gt; :refer :all]
            [zulip-rest-api.specs.emoji-reaction :refer :all]
            [zulip-rest-api.specs.messages-base-topic-links :refer :all]
            )
  (:import (java.io File)))


(def messages-base-data
  {
   (ds/opt :avatar_url) string?
   (ds/opt :client) string?
   (ds/opt :content) string?
   (ds/opt :content_type) string?
   (ds/opt :display_recipient) one-of&lt;string,array&gt;-spec
   (ds/opt :id) int?
   (ds/opt :is_me_message) boolean?
   (ds/opt :reactions) (s/coll-of emoji-reaction-spec)
   (ds/opt :recipient_id) int?
   (ds/opt :sender_email) string?
   (ds/opt :sender_full_name) string?
   (ds/opt :sender_id) int?
   (ds/opt :sender_realm_str) string?
   (ds/opt :stream_id) int?
   (ds/opt :subject) string?
   (ds/opt :topic_links) (s/coll-of messages-base-topic-links-spec)
   (ds/opt :submessages) (s/coll-of string?)
   (ds/opt :timestamp) int?
   (ds/opt :type) string?
   })

(def messages-base-spec
  (ds/spec
    {:name ::messages-base
     :spec messages-base-data}))
