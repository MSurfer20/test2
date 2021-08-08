(ns zulip-rest-api.specs.user-deactivated-error
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [zulip-rest-api.specs. :refer :all]
            [zulip-rest-api.specs. :refer :all]
            [zulip-rest-api.specs. :refer :all]
            )
  (:import (java.io File)))


(def user-deactivated-error-data
  {
   (ds/req :result) any-type-spec
   (ds/req :msg) any-type-spec
   (ds/opt :code) any-type-spec
   })

(def user-deactivated-error-spec
  (ds/spec
    {:name ::user-deactivated-error
     :spec user-deactivated-error-data}))
