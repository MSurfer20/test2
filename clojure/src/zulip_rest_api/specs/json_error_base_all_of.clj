(ns zulip-rest-api.specs.json-error-base-all-of
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def json-error-base-all-of-data
  {
   (ds/req :result) string?
   (ds/req :msg) string?
   })

(def json-error-base-all-of-spec
  (ds/spec
    {:name ::json-error-base-all-of
     :spec json-error-base-all-of-data}))
