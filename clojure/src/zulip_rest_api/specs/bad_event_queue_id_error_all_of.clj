(ns zulip-rest-api.specs.bad-event-queue-id-error-all-of
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [zulip-rest-api.specs. :refer :all]
            [zulip-rest-api.specs. :refer :all]
            [zulip-rest-api.specs. :refer :all]
            )
  (:import (java.io File)))


(def bad-event-queue-id-error-all-of-data
  {
   (ds/opt :result) any-type-spec
   (ds/opt :msg) any-type-spec
   (ds/opt :code) any-type-spec
   (ds/opt :queue_id) string?
   })

(def bad-event-queue-id-error-all-of-spec
  (ds/spec
    {:name ::bad-event-queue-id-error-all-of
     :spec bad-event-queue-id-error-all-of-data}))
