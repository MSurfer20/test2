(ns zulip-rest-api.specs.draft
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def draft-data
  {
   (ds/opt :id) int?
   (ds/req :type) string?
   (ds/req :to) (s/coll-of int?)
   (ds/req :topic) string?
   (ds/req :content) string?
   (ds/opt :timestamp) float?
   })

(def draft-spec
  (ds/spec
    {:name ::draft
     :spec draft-data}))
