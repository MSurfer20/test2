(ns zulip-rest-api.specs.non-existing-stream-error-all-of
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [zulip-rest-api.specs. :refer :all]
            [zulip-rest-api.specs. :refer :all]
            [zulip-rest-api.specs. :refer :all]
            )
  (:import (java.io File)))


(def non-existing-stream-error-all-of-data
  {
   (ds/opt :result) any-type-spec
   (ds/opt :msg) any-type-spec
   (ds/opt :code) any-type-spec
   (ds/opt :stream) string?
   })

(def non-existing-stream-error-all-of-spec
  (ds/spec
    {:name ::non-existing-stream-error-all-of
     :spec non-existing-stream-error-all-of-data}))
