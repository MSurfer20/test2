(ns zulip-rest-api.specs.attachments
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [zulip-rest-api.specs.attachments-messages :refer :all]
            )
  (:import (java.io File)))


(def attachments-data
  {
   (ds/opt :id) int?
   (ds/opt :name) string?
   (ds/opt :path_id) string?
   (ds/opt :size) int?
   (ds/opt :create_time) int?
   (ds/opt :messages) (s/coll-of attachments-messages-spec)
   })

(def attachments-spec
  (ds/spec
    {:name ::attachments
     :spec attachments-data}))
