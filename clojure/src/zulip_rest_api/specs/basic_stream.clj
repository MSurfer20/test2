(ns zulip-rest-api.specs.basic-stream
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
            )
  (:import (java.io File)))


(def basic-stream-data
  {
   (ds/opt :stream_id) any-type-spec
   (ds/opt :name) any-type-spec
   (ds/opt :description) any-type-spec
   (ds/opt :date_created) any-type-spec
   (ds/opt :invite_only) any-type-spec
   (ds/opt :rendered_description) any-type-spec
   (ds/opt :is_web_public) any-type-spec
   (ds/opt :stream_post_policy) any-type-spec
   (ds/opt :message_retention_days) any-type-spec
   (ds/opt :history_public_to_subscribers) any-type-spec
   (ds/opt :first_message_id) any-type-spec
   (ds/opt :is_announcement_only) any-type-spec
   })

(def basic-stream-spec
  (ds/spec
    {:name ::basic-stream
     :spec basic-stream-data}))
