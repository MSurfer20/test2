(ns zulip-rest-api.specs.inline-response-200
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [zulip-rest-api.specs.messages-base :refer :all]
            )
  (:import (java.io File)))


(def inline-response-200-data
  {
   (ds/opt :bot_email) string?
   (ds/opt :bot_full_name) string?
   (ds/opt :data) string?
   (ds/opt :trigger) string?
   (ds/opt :token) string?
   (ds/opt :message) messages-base-spec
   })

(def inline-response-200-spec
  (ds/spec
    {:name ::inline-response-200
     :spec inline-response-200-data}))
