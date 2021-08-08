(ns zulip-rest-api.specs.user-base
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def user-base-data
  {
   (ds/opt :email) string?
   (ds/opt :is_bot) boolean?
   (ds/opt :avatar_url) string?
   (ds/opt :avatar_version) int?
   (ds/opt :full_name) string?
   (ds/opt :is_admin) boolean?
   (ds/opt :is_owner) boolean?
   (ds/opt :is_billing_admin) boolean?
   (ds/opt :role) int?
   (ds/opt :bot_type) int?
   (ds/opt :user_id) int?
   (ds/opt :bot_owner_id) int?
   (ds/opt :is_active) boolean?
   (ds/opt :is_guest) boolean?
   (ds/opt :timezone) string?
   (ds/opt :date_joined) string?
   (ds/opt :delivery_email) string?
   (ds/opt :profile_data) (s/map-of string? any?)
   })

(def user-base-spec
  (ds/spec
    {:name ::user-base
     :spec user-base-data}))
