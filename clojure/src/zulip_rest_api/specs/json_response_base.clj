(ns zulip-rest-api.specs.json-response-base
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def json-response-base-data
  {
   (ds/opt :result) string?
   })

(def json-response-base-spec
  (ds/spec
    {:name ::json-response-base
     :spec json-response-base-data}))
