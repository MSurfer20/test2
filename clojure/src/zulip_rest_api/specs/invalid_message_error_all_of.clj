(ns zulip-rest-api.specs.invalid-message-error-all-of
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [zulip-rest-api.specs. :refer :all]
            [zulip-rest-api.specs. :refer :all]
            )
  (:import (java.io File)))


(def invalid-message-error-all-of-data
  {
   (ds/opt :result) any-type-spec
   (ds/opt :msg) any-type-spec
   (ds/opt :raw_content) string?
   })

(def invalid-message-error-all-of-spec
  (ds/spec
    {:name ::invalid-message-error-all-of
     :spec invalid-message-error-all-of-data}))
