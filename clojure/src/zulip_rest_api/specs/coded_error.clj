(ns zulip-rest-api.specs.coded-error
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [zulip-rest-api.specs. :refer :all]
            [zulip-rest-api.specs. :refer :all]
            [zulip-rest-api.specs. :refer :all]
            )
  (:import (java.io File)))


(def coded-error-data
  {
   (ds/req :result) any-type-spec
   (ds/req :msg) any-type-spec
   (ds/opt :code) any-type-spec
   })

(def coded-error-spec
  (ds/spec
    {:name ::coded-error
     :spec coded-error-data}))
