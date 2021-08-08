(ns zulip-rest-api.specs.emoji-reaction-base
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [zulip-rest-api.specs.emoji-reaction-base-user :refer :all]
            )
  (:import (java.io File)))


(def emoji-reaction-base-data
  {
   (ds/opt :emoji_code) string?
   (ds/opt :emoji_name) string?
   (ds/opt :reaction_type) string?
   (ds/opt :user_id) int?
   (ds/opt :user) emoji-reaction-base-user-spec
   })

(def emoji-reaction-base-spec
  (ds/spec
    {:name ::emoji-reaction-base
     :spec emoji-reaction-base-data}))
