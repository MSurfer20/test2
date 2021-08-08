(ns zulip-rest-api.specs.api-key-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [zulip-rest-api.specs. :refer :all]
            [zulip-rest-api.specs. :refer :all]
            )
  (:import (java.io File)))


(def api-key-response-data
  {
   (ds/req :result) any-type-spec
   (ds/req :msg) any-type-spec
   (ds/req :api_key) string?
   (ds/req :email) string?
   })

(def api-key-response-spec
  (ds/spec
    {:name ::api-key-response
     :spec api-key-response-data}))
