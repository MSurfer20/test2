(ns zulip-rest-api.specs.api-key-response-all-of
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [zulip-rest-api.specs. :refer :all]
            [zulip-rest-api.specs. :refer :all]
            )
  (:import (java.io File)))


(def api-key-response-all-of-data
  {
   (ds/opt :result) any-type-spec
   (ds/opt :msg) any-type-spec
   (ds/req :api_key) string?
   (ds/req :email) string?
   })

(def api-key-response-all-of-spec
  (ds/spec
    {:name ::api-key-response-all-of
     :spec api-key-response-all-of-data}))
