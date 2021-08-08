(ns zulip-rest-api.specs.bad-event-queue-id-error
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [zulip-rest-api.specs. :refer :all]
            [zulip-rest-api.specs. :refer :all]
            [zulip-rest-api.specs. :refer :all]
            )
  (:import (java.io File)))


(def bad-event-queue-id-error-data
  {
   (ds/req :result) any-type-spec
   (ds/req :msg) any-type-spec
   (ds/opt :code) any-type-spec
   (ds/opt :queue_id) string?
   })

(def bad-event-queue-id-error-spec
  (ds/spec
    {:name ::bad-event-queue-id-error
     :spec bad-event-queue-id-error-data}))
