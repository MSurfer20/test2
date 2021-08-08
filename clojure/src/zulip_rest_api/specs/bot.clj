(ns zulip-rest-api.specs.bot
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [zulip-rest-api.specs. :refer :all]
            [zulip-rest-api.specs. :refer :all]
            [zulip-rest-api.specs. :refer :all]
            [zulip-rest-api.specs. :refer :all]
            [zulip-rest-api.specs. :refer :all]
            [zulip-rest-api.specs. :refer :all]
            [zulip-rest-api.specs. :refer :all]
            [zulip-rest-api.specs. :refer :all]
            [zulip-rest-api.specs. :refer :all]
            )
  (:import (java.io File)))


(def bot-data
  {
   (ds/opt :user_id) any-type-spec
   (ds/opt :full_name) any-type-spec
   (ds/opt :api_key) any-type-spec
   (ds/opt :default_sending_stream) any-type-spec
   (ds/opt :default_events_register_stream) any-type-spec
   (ds/opt :default_all_public_streams) any-type-spec
   (ds/opt :avatar_url) any-type-spec
   (ds/opt :owner_id) any-type-spec
   (ds/opt :services) any-type-spec
   (ds/opt :email) string?
   (ds/opt :bot_type) int?
   (ds/opt :is_active) boolean?
   })

(def bot-spec
  (ds/spec
    {:name ::bot
     :spec bot-data}))
