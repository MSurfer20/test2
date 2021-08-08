(ns zulip-rest-api.specs.invalid-message-error
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [zulip-rest-api.specs. :refer :all]
            [zulip-rest-api.specs. :refer :all]
            )
  (:import (java.io File)))


(def invalid-message-error-data
  {
   (ds/req :result) any-type-spec
   (ds/req :msg) any-type-spec
   (ds/opt :raw_content) string?
   })

(def invalid-message-error-spec
  (ds/spec
    {:name ::invalid-message-error
     :spec invalid-message-error-data}))
