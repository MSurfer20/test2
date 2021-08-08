(ns zulip-rest-api.specs.coded-error-base
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [zulip-rest-api.specs. :refer :all]
            [zulip-rest-api.specs. :refer :all]
            )
  (:import (java.io File)))


(def coded-error-base-data
  {
   (ds/req :result) any-type-spec
   (ds/req :msg) any-type-spec
   (ds/opt :code) string?
   })

(def coded-error-base-spec
  (ds/spec
    {:name ::coded-error-base
     :spec coded-error-base-data}))
