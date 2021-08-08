(ns zulip-rest-api.specs.user
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


(def user-data
  {
   (ds/opt :email) any-type-spec
   (ds/opt :is_bot) any-type-spec
   (ds/opt :avatar_url) any-type-spec
   (ds/opt :avatar_version) any-type-spec
   (ds/opt :full_name) any-type-spec
   (ds/opt :is_admin) any-type-spec
   (ds/opt :is_owner) any-type-spec
   (ds/opt :is_billing_admin) any-type-spec
   (ds/opt :role) any-type-spec
   (ds/opt :bot_type) any-type-spec
   (ds/opt :user_id) any-type-spec
   (ds/opt :bot_owner_id) any-type-spec
   (ds/opt :is_active) any-type-spec
   (ds/opt :is_guest) any-type-spec
   (ds/opt :timezone) any-type-spec
   (ds/opt :date_joined) any-type-spec
   (ds/opt :delivery_email) any-type-spec
   (ds/opt :profile_data) any-type-spec
   })

(def user-spec
  (ds/spec
    {:name ::user
     :spec user-data}))
