(ns zulip-rest-api.specs.missing-argument-error
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [zulip-rest-api.specs. :refer :all]
            [zulip-rest-api.specs. :refer :all]
            [zulip-rest-api.specs. :refer :all]
            )
  (:import (java.io File)))


(def missing-argument-error-data
  {
   (ds/req :result) any-type-spec
   (ds/req :msg) any-type-spec
   (ds/opt :code) any-type-spec
   (ds/opt :var_name) string?
   })

(def missing-argument-error-spec
  (ds/spec
    {:name ::missing-argument-error
     :spec missing-argument-error-data}))
