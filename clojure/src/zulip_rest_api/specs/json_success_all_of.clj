(ns zulip-rest-api.specs.json-success-all-of
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [zulip-rest-api.specs. :refer :all]
            [zulip-rest-api.specs. :refer :all]
            )
  (:import (java.io File)))


(def json-success-all-of-data
  {
   (ds/opt :result) any-type-spec
   (ds/opt :msg) any-type-spec
   })

(def json-success-all-of-spec
  (ds/spec
    {:name ::json-success-all-of
     :spec json-success-all-of-data}))
