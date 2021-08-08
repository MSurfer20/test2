(ns zulip-rest-api.specs.custom-profile-field
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def custom-profile-field-data
  {
   (ds/opt :id) int?
   (ds/opt :type) int?
   (ds/opt :order) int?
   (ds/opt :name) string?
   (ds/opt :hint) string?
   (ds/opt :field_data) string?
   })

(def custom-profile-field-spec
  (ds/spec
    {:name ::custom-profile-field
     :spec custom-profile-field-data}))
