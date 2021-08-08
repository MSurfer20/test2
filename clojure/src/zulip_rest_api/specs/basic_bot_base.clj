(ns zulip-rest-api.specs.basic-bot-base
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [zulip-rest-api.specs.one-of&lt;object,object&gt; :refer :all]
            )
  (:import (java.io File)))


(def basic-bot-base-data
  {
   (ds/opt :user_id) int?
   (ds/opt :full_name) string?
   (ds/opt :api_key) string?
   (ds/opt :default_sending_stream) string?
   (ds/opt :default_events_register_stream) string?
   (ds/opt :default_all_public_streams) boolean?
   (ds/opt :avatar_url) string?
   (ds/opt :owner_id) int?
   (ds/opt :services) (s/coll-of one-of&lt;object,object&gt;-spec)
   })

(def basic-bot-base-spec
  (ds/spec
    {:name ::basic-bot-base
     :spec basic-bot-base-data}))
