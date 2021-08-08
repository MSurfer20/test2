(ns zulip-rest-api.specs.messages-base-topic-links
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def messages-base-topic-links-data
  {
   (ds/opt :text) string?
   (ds/opt :url) string?
   })

(def messages-base-topic-links-spec
  (ds/spec
    {:name ::messages-base-topic-links
     :spec messages-base-topic-links-data}))
