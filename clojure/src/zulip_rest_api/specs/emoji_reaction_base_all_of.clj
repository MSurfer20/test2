(ns zulip-rest-api.specs.emoji-reaction-base-all-of
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [zulip-rest-api.specs.emoji-reaction-base-all-of-user :refer :all]
            )
  (:import (java.io File)))


(def emoji-reaction-base-all-of-data
  {
   (ds/opt :user_id) int?
   (ds/opt :user) emoji-reaction-base-all-of-user-spec
   })

(def emoji-reaction-base-all-of-spec
  (ds/spec
    {:name ::emoji-reaction-base-all-of
     :spec emoji-reaction-base-all-of-data}))
