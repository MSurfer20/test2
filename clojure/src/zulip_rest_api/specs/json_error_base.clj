(ns zulip-rest-api.specs.json-error-base
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def json-error-base-data
  {
   (ds/req :result) string?
   (ds/req :msg) string?
   })

(def json-error-base-spec
  (ds/spec
    {:name ::json-error-base
     :spec json-error-base-data}))
