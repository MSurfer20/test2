(ns zulip-rest-api.specs.user-not-authorized-error
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [zulip-rest-api.specs. :refer :all]
            [zulip-rest-api.specs. :refer :all]
            [zulip-rest-api.specs. :refer :all]
            )
  (:import (java.io File)))


(def user-not-authorized-error-data
  {
   (ds/req :result) any-type-spec
   (ds/req :msg) any-type-spec
   (ds/opt :code) any-type-spec
   })

(def user-not-authorized-error-spec
  (ds/spec
    {:name ::user-not-authorized-error
     :spec user-not-authorized-error-data}))
