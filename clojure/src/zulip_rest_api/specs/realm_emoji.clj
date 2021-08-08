(ns zulip-rest-api.specs.realm-emoji
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def realm-emoji-data
  {
   (ds/opt :id) string?
   (ds/opt :name) string?
   (ds/opt :source_url) string?
   (ds/opt :deactivated) boolean?
   (ds/opt :author_id) int?
   })

(def realm-emoji-spec
  (ds/spec
    {:name ::realm-emoji
     :spec realm-emoji-data}))
