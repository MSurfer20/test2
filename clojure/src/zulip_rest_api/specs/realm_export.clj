(ns zulip-rest-api.specs.realm-export
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def realm-export-data
  {
   (ds/opt :id) int?
   (ds/opt :acting_user_id) int?
   (ds/opt :export_time) float?
   (ds/opt :deleted_timestamp) float?
   (ds/opt :failed_timestamp) float?
   (ds/opt :export_url) string?
   (ds/opt :pending) boolean?
   })

(def realm-export-spec
  (ds/spec
    {:name ::realm-export
     :spec realm-export-data}))
