(ns zulip-rest-api.specs.coded-error-base-all-of
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [zulip-rest-api.specs. :refer :all]
            [zulip-rest-api.specs. :refer :all]
            )
  (:import (java.io File)))


(def coded-error-base-all-of-data
  {
   (ds/opt :result) any-type-spec
   (ds/opt :msg) any-type-spec
   (ds/opt :code) string?
   })

(def coded-error-base-all-of-spec
  (ds/spec
    {:name ::coded-error-base-all-of
     :spec coded-error-base-all-of-data}))
