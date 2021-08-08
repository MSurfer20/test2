(ns zulip-rest-api.specs.coded-error-all-of
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [zulip-rest-api.specs. :refer :all]
            [zulip-rest-api.specs. :refer :all]
            [zulip-rest-api.specs. :refer :all]
            )
  (:import (java.io File)))


(def coded-error-all-of-data
  {
   (ds/opt :result) any-type-spec
   (ds/opt :msg) any-type-spec
   (ds/opt :code) any-type-spec
   })

(def coded-error-all-of-spec
  (ds/spec
    {:name ::coded-error-all-of
     :spec coded-error-all-of-data}))
