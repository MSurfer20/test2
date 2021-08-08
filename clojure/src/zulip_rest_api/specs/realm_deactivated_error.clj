(ns zulip-rest-api.specs.realm-deactivated-error
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [zulip-rest-api.specs. :refer :all]
            [zulip-rest-api.specs. :refer :all]
            [zulip-rest-api.specs. :refer :all]
            )
  (:import (java.io File)))


(def realm-deactivated-error-data
  {
   (ds/req :result) any-type-spec
   (ds/req :msg) any-type-spec
   (ds/opt :code) any-type-spec
   })

(def realm-deactivated-error-spec
  (ds/spec
    {:name ::realm-deactivated-error
     :spec realm-deactivated-error-data}))
