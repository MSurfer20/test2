(ns zulip-rest-api.specs.json-success-base-all-of
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def json-success-base-all-of-data
  {
   (ds/req :result) string?
   (ds/req :msg) string?
   })

(def json-success-base-all-of-spec
  (ds/spec
    {:name ::json-success-base-all-of
     :spec json-success-base-all-of-data}))
