(ns zulip-rest-api.specs.add-subscriptions-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [zulip-rest-api.specs. :refer :all]
            [zulip-rest-api.specs. :refer :all]
            )
  (:import (java.io File)))


(def add-subscriptions-response-data
  {
   (ds/req :result) any-type-spec
   (ds/req :msg) any-type-spec
   (ds/opt :subscribed) (s/map-of string? (s/coll-of string?))
   (ds/opt :already_subscribed) (s/map-of string? (s/coll-of string?))
   (ds/opt :unauthorized) (s/coll-of string?)
   })

(def add-subscriptions-response-spec
  (ds/spec
    {:name ::add-subscriptions-response
     :spec add-subscriptions-response-data}))
