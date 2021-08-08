(ns zulip-rest-api.specs.json-success-base
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def json-success-base-data
  {
   (ds/req :result) string?
   (ds/req :msg) string?
   })

(def json-success-base-spec
  (ds/spec
    {:name ::json-success-base
     :spec json-success-base-data}))
