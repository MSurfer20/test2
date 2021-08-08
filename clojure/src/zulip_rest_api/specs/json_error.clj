(ns zulip-rest-api.specs.json-error
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [zulip-rest-api.specs. :refer :all]
            [zulip-rest-api.specs. :refer :all]
            )
  (:import (java.io File)))


(def json-error-data
  {
   (ds/req :result) any-type-spec
   (ds/req :msg) any-type-spec
   })

(def json-error-spec
  (ds/spec
    {:name ::json-error
     :spec json-error-data}))
