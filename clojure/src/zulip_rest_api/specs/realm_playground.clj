(ns zulip-rest-api.specs.realm-playground
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def realm-playground-data
  {
   (ds/opt :id) int?
   (ds/opt :name) string?
   (ds/opt :pygments_language) string?
   (ds/opt :url_prefix) string?
   })

(def realm-playground-spec
  (ds/spec
    {:name ::realm-playground
     :spec realm-playground-data}))
