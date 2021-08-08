(ns zulip-rest-api.specs.basic-stream-base
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def basic-stream-base-data
  {
   (ds/opt :stream_id) int?
   (ds/opt :name) string?
   (ds/opt :description) string?
   (ds/opt :date_created) int?
   (ds/opt :invite_only) boolean?
   (ds/opt :rendered_description) string?
   (ds/opt :is_web_public) boolean?
   (ds/opt :stream_post_policy) int?
   (ds/opt :message_retention_days) int?
   (ds/opt :history_public_to_subscribers) boolean?
   (ds/opt :first_message_id) int?
   (ds/opt :is_announcement_only) boolean?
   })

(def basic-stream-base-spec
  (ds/spec
    {:name ::basic-stream-base
     :spec basic-stream-base-data}))
