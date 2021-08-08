(ns zulip-rest-api.specs.non-existing-stream-error
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [zulip-rest-api.specs. :refer :all]
            [zulip-rest-api.specs. :refer :all]
            [zulip-rest-api.specs. :refer :all]
            )
  (:import (java.io File)))


(def non-existing-stream-error-data
  {
   (ds/req :result) any-type-spec
   (ds/req :msg) any-type-spec
   (ds/opt :code) any-type-spec
   (ds/opt :stream) string?
   })

(def non-existing-stream-error-spec
  (ds/spec
    {:name ::non-existing-stream-error
     :spec non-existing-stream-error-data}))
