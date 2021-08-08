(ns zulip-rest-api.api.authentication
  (:require [zulip-rest-api.core :refer [call-api check-required-params with-collection-format *api-context*]]
            [clojure.spec.alpha :as s]
            [spec-tools.core :as st]
            [orchestra.core :refer [defn-spec]]
            [zulip-rest-api.specs.subscriptions :refer :all]
            [zulip-rest-api.specs.basic-stream-all-of :refer :all]
            [zulip-rest-api.specs.api-key-response-all-of :refer :all]
            [zulip-rest-api.specs.non-existing-stream-error-all-of :refer :all]
            [zulip-rest-api.specs.json-error-base-all-of :refer :all]
            [zulip-rest-api.specs.coded-error :refer :all]
            [zulip-rest-api.specs.custom-profile-field :refer :all]
            [zulip-rest-api.specs.json-success-base :refer :all]
            [zulip-rest-api.specs.user-not-authorized-error :refer :all]
            [zulip-rest-api.specs.basic-bot :refer :all]
            [zulip-rest-api.specs.emoji-base :refer :all]
            [zulip-rest-api.specs.get-messages :refer :all]
            [zulip-rest-api.specs.json-success-base-all-of :refer :all]
            [zulip-rest-api.specs.add-subscriptions-response-all-of :refer :all]
            [zulip-rest-api.specs.realm-domain :refer :all]
            [zulip-rest-api.specs.draft :refer :all]
            [zulip-rest-api.specs.emoji-reaction-all-of :refer :all]
            [zulip-rest-api.specs.rate-limited-error :refer :all]
            [zulip-rest-api.specs.presence :refer :all]
            [zulip-rest-api.specs.event-id-schema :refer :all]
            [zulip-rest-api.specs.coded-error-all-of :refer :all]
            [zulip-rest-api.specs.bad-event-queue-id-error-all-of :refer :all]
            [zulip-rest-api.specs.emoji-reaction :refer :all]
            [zulip-rest-api.specs.json-error :refer :all]
            [zulip-rest-api.specs.invalid-message-error :refer :all]
            [zulip-rest-api.specs.default-stream-group :refer :all]
            [zulip-rest-api.specs.user-group :refer :all]
            [zulip-rest-api.specs.basic-stream-base :refer :all]
            [zulip-rest-api.specs.user-all-of :refer :all]
            [zulip-rest-api.specs.json-success-all-of :refer :all]
            [zulip-rest-api.specs.missing-argument-error-all-of :refer :all]
            [zulip-rest-api.specs.realm-playground :refer :all]
            [zulip-rest-api.specs.bad-event-queue-id-error :refer :all]
            [zulip-rest-api.specs.messages-all-of :refer :all]
            [zulip-rest-api.specs.realm-export :refer :all]
            [zulip-rest-api.specs.messages :refer :all]
            [zulip-rest-api.specs.bot-all-of :refer :all]
            [zulip-rest-api.specs.user-deactivated-error :refer :all]
            [zulip-rest-api.specs.non-existing-stream-error :refer :all]
            [zulip-rest-api.specs.attachments :refer :all]
            [zulip-rest-api.specs.emoji-reaction-base :refer :all]
            [zulip-rest-api.specs.hotspot :refer :all]
            [zulip-rest-api.specs.bot :refer :all]
            [zulip-rest-api.specs.realm-deactivated-error :refer :all]
            [zulip-rest-api.specs.json-success :refer :all]
            [zulip-rest-api.specs.event-type-schema :refer :all]
            [zulip-rest-api.specs.add-subscriptions-response :refer :all]
            [zulip-rest-api.specs.inline-response-200 :refer :all]
            [zulip-rest-api.specs.attachments-messages :refer :all]
            [zulip-rest-api.specs.coded-error-base :refer :all]
            [zulip-rest-api.specs.emoji-reaction-base-all-of-user :refer :all]
            [zulip-rest-api.specs.realm-emoji :refer :all]
            [zulip-rest-api.specs.json-response-base :refer :all]
            [zulip-rest-api.specs.basic-bot-base :refer :all]
            [zulip-rest-api.specs.user-base :refer :all]
            [zulip-rest-api.specs.emoji-reaction-base-all-of :refer :all]
            [zulip-rest-api.specs.basic-stream :refer :all]
            [zulip-rest-api.specs.get-messages-all-of :refer :all]
            [zulip-rest-api.specs.json-error-base :refer :all]
            [zulip-rest-api.specs.invalid-message-error-all-of :refer :all]
            [zulip-rest-api.specs.messages-base :refer :all]
            [zulip-rest-api.specs.api-key-response :refer :all]
            [zulip-rest-api.specs.missing-argument-error :refer :all]
            [zulip-rest-api.specs.messages-base-topic-links :refer :all]
            [zulip-rest-api.specs.basic-bot-all-of :refer :all]
            [zulip-rest-api.specs.user :refer :all]
            [zulip-rest-api.specs.invalid-api-key-error :refer :all]
            [zulip-rest-api.specs.coded-error-base-all-of :refer :all]
            [zulip-rest-api.specs.success-description :refer :all]
            )
  (:import (java.io File)))


(defn-spec dev-fetch-api-key-with-http-info any?
  "Fetch an API key (development only)
  For easy testing of mobile apps and other clients and against Zulip
development servers, we support fetching a Zulip API key for any user
on the development server without authentication (so that they can
implement analogues of the one-click login process available for Zulip
development servers on the web).

**Note:** This endpoint is only available on Zulip development
servers; for obvious security reasons it will always return an error
in a Zulip production server.

`POST {{ api_url }}/v1/dev_fetch_api_key`"
  [username string?]
  (check-required-params username)
  (call-api "/dev_fetch_api_key" :post
            {:path-params   {}
             :header-params {}
             :query-params  {"username" username }
             :form-params   {}
             :content-types []
             :accepts       ["application/json"]
             :auth-names    []}))

(defn-spec dev-fetch-api-key api-key-response-spec
  "Fetch an API key (development only)
  For easy testing of mobile apps and other clients and against Zulip
development servers, we support fetching a Zulip API key for any user
on the development server without authentication (so that they can
implement analogues of the one-click login process available for Zulip
development servers on the web).

**Note:** This endpoint is only available on Zulip development
servers; for obvious security reasons it will always return an error
in a Zulip production server.

`POST {{ api_url }}/v1/dev_fetch_api_key`"
  [username string?]
  (let [res (:data (dev-fetch-api-key-with-http-info username))]
    (if (:decode-models *api-context*)
       (st/decode api-key-response-spec res st/string-transformer)
       res)))


(defn-spec fetch-api-key-with-http-info any?
  "Fetch an API key (production)
  This API endpoint is used by clients such as the Zulip mobile and
terminal apps to implement password-based authentication.  Given the
user's Zulip login credentials, it returns a Zulip API key that the client
can use to make requests requests as the user.

This endpoint is only useful for Zulip servers/organizations with
EmailAuthBackend or LDAPAuthBackend enabled.

The Zulip mobile apps also support SSO/social authentication (GitHub
auth, Google auth, SAML, etc.) that does not use this endpoint.  Instead,
the mobile apps reuse the web login flow passing the `mobile_flow_otp` in
a webview, and the credentials are returned to the app (encrypted) via a redirect
to a `zulip://` URL.

!!! warn \"\"
    **Note:** If you signed up using passwordless authentication and
    never had a password, you can [reset your password](/help/change-your-password).

    See the [API keys](/api/api-keys) documentation for
    more details on how to download API key manually.

In a [Zulip development environment](https://zulip.readthedocs.io/en/latest/development/overview.html),
see also [the unauthenticated variant](/api/dev-fetch-api-key)."
  [username string?, password string?]
  (check-required-params username password)
  (call-api "/fetch_api_key" :post
            {:path-params   {}
             :header-params {}
             :query-params  {"username" username "password" password }
             :form-params   {}
             :content-types []
             :accepts       ["application/json"]
             :auth-names    []}))

(defn-spec fetch-api-key api-key-response-spec
  "Fetch an API key (production)
  This API endpoint is used by clients such as the Zulip mobile and
terminal apps to implement password-based authentication.  Given the
user's Zulip login credentials, it returns a Zulip API key that the client
can use to make requests requests as the user.

This endpoint is only useful for Zulip servers/organizations with
EmailAuthBackend or LDAPAuthBackend enabled.

The Zulip mobile apps also support SSO/social authentication (GitHub
auth, Google auth, SAML, etc.) that does not use this endpoint.  Instead,
the mobile apps reuse the web login flow passing the `mobile_flow_otp` in
a webview, and the credentials are returned to the app (encrypted) via a redirect
to a `zulip://` URL.

!!! warn \"\"
    **Note:** If you signed up using passwordless authentication and
    never had a password, you can [reset your password](/help/change-your-password).

    See the [API keys](/api/api-keys) documentation for
    more details on how to download API key manually.

In a [Zulip development environment](https://zulip.readthedocs.io/en/latest/development/overview.html),
see also [the unauthenticated variant](/api/dev-fetch-api-key)."
  [username string?, password string?]
  (let [res (:data (fetch-api-key-with-http-info username password))]
    (if (:decode-models *api-context*)
       (st/decode api-key-response-spec res st/string-transformer)
       res)))


