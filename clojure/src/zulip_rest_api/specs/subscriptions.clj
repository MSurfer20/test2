(ns zulip-rest-api.specs.subscriptions
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def subscriptions-data
  {
   (ds/opt :stream_id) int?
   (ds/opt :name) string?
   (ds/opt :description) string?
   (ds/opt :rendered_description) string?
   (ds/opt :date_created) int?
   (ds/opt :invite_only) boolean?
   (ds/opt :subscribers) (s/coll-of int?)
   (ds/opt :desktop_notifications) boolean?
   (ds/opt :email_notifications) boolean?
   (ds/opt :wildcard_mentions_notify) boolean?
   (ds/opt :push_notifications) boolean?
   (ds/opt :audible_notifications) boolean?
   (ds/opt :pin_to_top) boolean?
   (ds/opt :email_address) string?
   (ds/opt :is_muted) boolean?
   (ds/opt :in_home_view) boolean?
   (ds/opt :is_announcement_only) boolean?
   (ds/opt :is_web_public) boolean?
   (ds/opt :role) int?
   (ds/opt :color) string?
   (ds/opt :stream_post_policy) int?
   (ds/opt :message_retention_days) int?
   (ds/opt :history_public_to_subscribers) boolean?
   (ds/opt :first_message_id) int?
   (ds/opt :stream_weekly_traffic) int?
   })

(def subscriptions-spec
  (ds/spec
    {:name ::subscriptions
     :spec subscriptions-data}))
