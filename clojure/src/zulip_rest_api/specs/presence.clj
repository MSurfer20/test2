(ns zulip-rest-api.specs.presence
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def presence-data
  {
   (ds/opt :client) string?
   (ds/opt :status) string?
   (ds/opt :timestamp) int?
   (ds/opt :pushable) boolean?
   })

(def presence-spec
  (ds/spec
    {:name ::presence
     :spec presence-data}))
