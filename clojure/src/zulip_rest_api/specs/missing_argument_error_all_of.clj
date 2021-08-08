(ns zulip-rest-api.specs.missing-argument-error-all-of
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [zulip-rest-api.specs. :refer :all]
            [zulip-rest-api.specs. :refer :all]
            [zulip-rest-api.specs. :refer :all]
            )
  (:import (java.io File)))


(def missing-argument-error-all-of-data
  {
   (ds/opt :result) any-type-spec
   (ds/opt :msg) any-type-spec
   (ds/opt :code) any-type-spec
   (ds/opt :var_name) string?
   })

(def missing-argument-error-all-of-spec
  (ds/spec
    {:name ::missing-argument-error-all-of
     :spec missing-argument-error-all-of-data}))
