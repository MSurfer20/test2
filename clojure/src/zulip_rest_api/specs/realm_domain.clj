(ns zulip-rest-api.specs.realm-domain
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def realm-domain-data
  {
   (ds/opt :domain) string?
   (ds/opt :allow_subdomains) boolean?
   })

(def realm-domain-spec
  (ds/spec
    {:name ::realm-domain
     :spec realm-domain-data}))
