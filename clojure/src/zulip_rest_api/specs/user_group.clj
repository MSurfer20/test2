(ns zulip-rest-api.specs.user-group
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def user-group-data
  {
   (ds/opt :name) string?
   (ds/opt :description) string?
   (ds/opt :members) (s/coll-of int?)
   (ds/opt :id) int?
   })

(def user-group-spec
  (ds/spec
    {:name ::user-group
     :spec user-group-data}))
