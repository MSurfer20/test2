(ns zulip-rest-api.specs.invalid-api-key-error
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [zulip-rest-api.specs. :refer :all]
            [zulip-rest-api.specs. :refer :all]
            )
  (:import (java.io File)))


(def invalid-api-key-error-data
  {
   (ds/req :result) any-type-spec
   (ds/req :msg) any-type-spec
   })

(def invalid-api-key-error-spec
  (ds/spec
    {:name ::invalid-api-key-error
     :spec invalid-api-key-error-data}))
