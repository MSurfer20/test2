(ns zulip-rest-api.specs.emoji-reaction-base-user
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def emoji-reaction-base-user-data
  {
   (ds/opt :id) int?
   (ds/opt :email) string?
   (ds/opt :full_name) string?
   (ds/opt :is_mirror_dummy) boolean?
   })

(def emoji-reaction-base-user-spec
  (ds/spec
    {:name ::emoji-reaction-base-user
     :spec emoji-reaction-base-user-data}))
