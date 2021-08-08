(ns zulip-rest-api.specs.emoji-reaction-base-all-of-user
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def emoji-reaction-base-all-of-user-data
  {
   (ds/opt :id) int?
   (ds/opt :email) string?
   (ds/opt :full_name) string?
   (ds/opt :is_mirror_dummy) boolean?
   })

(def emoji-reaction-base-all-of-user-spec
  (ds/spec
    {:name ::emoji-reaction-base-all-of-user
     :spec emoji-reaction-base-all-of-user-data}))
