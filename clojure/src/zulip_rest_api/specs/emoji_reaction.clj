(ns zulip-rest-api.specs.emoji-reaction
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [zulip-rest-api.specs. :refer :all]
            [zulip-rest-api.specs. :refer :all]
            [zulip-rest-api.specs. :refer :all]
            [zulip-rest-api.specs. :refer :all]
            [zulip-rest-api.specs. :refer :all]
            )
  (:import (java.io File)))


(def emoji-reaction-data
  {
   (ds/opt :emoji_code) any-type-spec
   (ds/opt :emoji_name) any-type-spec
   (ds/opt :reaction_type) any-type-spec
   (ds/opt :user_id) any-type-spec
   (ds/opt :user) any-type-spec
   })

(def emoji-reaction-spec
  (ds/spec
    {:name ::emoji-reaction
     :spec emoji-reaction-data}))
