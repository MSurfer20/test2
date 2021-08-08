(ns zulip-rest-api.specs.json-success
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [zulip-rest-api.specs. :refer :all]
            [zulip-rest-api.specs. :refer :all]
            )
  (:import (java.io File)))


(def json-success-data
  {
   (ds/req :result) any-type-spec
   (ds/req :msg) any-type-spec
   })

(def json-success-spec
  (ds/spec
    {:name ::json-success
     :spec json-success-data}))
