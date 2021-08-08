(ns zulip-rest-api.specs.emoji-base
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def emoji-base-data
  {
   (ds/opt :emoji_code) string?
   (ds/opt :emoji_name) string?
   (ds/opt :reaction_type) string?
   })

(def emoji-base-spec
  (ds/spec
    {:name ::emoji-base
     :spec emoji-base-data}))
