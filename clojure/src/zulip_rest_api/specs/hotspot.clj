(ns zulip-rest-api.specs.hotspot
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def hotspot-data
  {
   (ds/opt :delay) float?
   (ds/opt :name) string?
   (ds/opt :title) string?
   (ds/opt :description) string?
   })

(def hotspot-spec
  (ds/spec
    {:name ::hotspot
     :spec hotspot-data}))
