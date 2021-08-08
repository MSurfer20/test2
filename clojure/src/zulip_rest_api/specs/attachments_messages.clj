(ns zulip-rest-api.specs.attachments-messages
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def attachments-messages-data
  {
   (ds/opt :date_sent) int?
   (ds/opt :id) int?
   })

(def attachments-messages-spec
  (ds/spec
    {:name ::attachments-messages
     :spec attachments-messages-data}))
