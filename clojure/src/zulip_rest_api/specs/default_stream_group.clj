(ns zulip-rest-api.specs.default-stream-group
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [zulip-rest-api.specs.basic-stream :refer :all]
            )
  (:import (java.io File)))


(def default-stream-group-data
  {
   (ds/opt :name) string?
   (ds/opt :description) string?
   (ds/opt :id) int?
   (ds/opt :streams) (s/coll-of basic-stream-spec)
   })

(def default-stream-group-spec
  (ds/spec
    {:name ::default-stream-group
     :spec default-stream-group-data}))
