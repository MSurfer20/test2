{-
   Zulip REST API

   Powerful open source group chat 

   OpenAPI Version: 3.0.1
   Zulip REST API API version: 1.0.0
   Generated by OpenAPI Generator (https://openapi-generator.tech)
-}

{-|
Module : ZulipREST.API.RealTimeEvents
-}

{-# LANGUAGE FlexibleContexts #-}
{-# LANGUAGE FlexibleInstances #-}
{-# LANGUAGE MonoLocalBinds #-}
{-# LANGUAGE MultiParamTypeClasses #-}
{-# LANGUAGE OverloadedStrings #-}
{-# OPTIONS_GHC -fno-warn-name-shadowing -fno-warn-unused-binds -fno-warn-unused-imports #-}

module ZulipREST.API.RealTimeEvents where

import ZulipREST.Core
import ZulipREST.MimeTypes
import ZulipREST.Model as M

import qualified Data.Aeson as A
import qualified Data.ByteString as B
import qualified Data.ByteString.Lazy as BL
import qualified Data.Data as P (Typeable, TypeRep, typeOf, typeRep)
import qualified Data.Foldable as P
import qualified Data.Map as Map
import qualified Data.Maybe as P
import qualified Data.Proxy as P (Proxy(..))
import qualified Data.Set as Set
import qualified Data.String as P
import qualified Data.Text as T
import qualified Data.Text.Encoding as T
import qualified Data.Text.Lazy as TL
import qualified Data.Text.Lazy.Encoding as TL
import qualified Data.Time as TI
import qualified Network.HTTP.Client.MultipartFormData as NH
import qualified Network.HTTP.Media as ME
import qualified Network.HTTP.Types as NH
import qualified Web.FormUrlEncoded as WH
import qualified Web.HttpApiData as WH

import Data.Text (Text)
import GHC.Base ((<|>))

import Prelude ((==),(/=),($), (.),(<$>),(<*>),(>>=),Maybe(..),Bool(..),Char,Double,FilePath,Float,Int,Integer,String,fmap,undefined,mempty,maybe,pure,Monad,Applicative,Functor)
import qualified Prelude as P

-- * Operations


-- ** RealTimeEvents

-- *** deleteQueue

-- | @DELETE \/events@
-- 
-- Delete an event queue
-- 
-- Delete a previously registered queue.  `DELETE {{ api_url }}/v1/events` 
-- 
deleteQueue 
  :: QueueId -- ^ "queueId" -  The ID of an event queue that was previously registered via `POST /api/v1/register` (see [Register a queue](/api/register-queue)). 
  -> ZulipRESTRequest DeleteQueue MimeNoContent JsonSuccess MimeJSON
deleteQueue (QueueId queueId) =
  _mkRequest "DELETE" ["/events"]
    `addQuery` toQuery ("queue_id", Just queueId)

data DeleteQueue  
-- | @application/json@
instance Produces DeleteQueue MimeJSON


-- *** getEvents

-- | @GET \/events@
-- 
-- Get events from an event queue
-- 
-- `GET {{ api_url }}/v1/events`  This endpoint allows you to receive new events from [a registered event queue](/api/register-queue).  Long-lived clients should use the `event_queue_longpoll_timeout_seconds` property returned by `POST /register` as the client-side HTTP request timeout for calls to this endpoint.  It is guaranteed to be higher than heartbeat frequency and should be respected by clients to avoid breaking when heartbeat frequency increases. 
-- 
getEvents 
  :: QueueId -- ^ "queueId" -  The ID of an event queue that was previously registered via `POST /api/v1/register` (see [Register a queue](/api/register-queue)). 
  -> ZulipRESTRequest GetEvents MimeNoContent JsonSuccessBase MimeJSON
getEvents (QueueId queueId) =
  _mkRequest "GET" ["/events"]
    `addQuery` toQuery ("queue_id", Just queueId)

data GetEvents  

-- | /Optional Param/ "last_event_id" - The highest event ID in this queue that you've received and wish to acknowledge. See the [code for `call_on_each_event`](https://github.com/zulip/python-zulip-api/blob/master/zulip/zulip/__init__.py) in the [zulip Python module](https://github.com/zulip/python-zulip-api) for an example implementation of correctly processing each event exactly once. 
instance HasOptionalParam GetEvents LastEventId where
  applyOptionalParam req (LastEventId xs) =
    req `addQuery` toQuery ("last_event_id", Just xs)

-- | /Optional Param/ "dont_block" - Set to `true` if the client is requesting a nonblocking reply. If not specified, the request will block until either a new event is available or a few minutes have passed, in which case the server will send the client a heartbeat event. 
instance HasOptionalParam GetEvents DontBlock where
  applyOptionalParam req (DontBlock xs) =
    req `addQuery` toQuery ("dont_block", Just xs)
-- | @application/json@
instance Produces GetEvents MimeJSON


-- *** realTimePost

-- | @POST \/real-time@
-- 
-- (Ignored) 
-- 
realTimePost 
  :: ZulipRESTRequest RealTimePost MimeNoContent NoContent MimeNoContent
realTimePost =
  _mkRequest "POST" ["/real-time"]

data RealTimePost  

-- | /Optional Param/ "event_types" - A JSON-encoded array indicating which types of events you're interested in. Values that you might find useful include:    * **message** (messages)   * **subscription** (changes in your subscriptions)   * **realm_user** (changes to users in the organization and     their properties, such as their name).  If you do not specify this parameter, you will receive all events, and have to filter out the events not relevant to your client in your client code.  For most applications, one is only interested in messages, so one specifies: `event_types=['message']`  Event types not supported by the server are ignored, in order to simplify the implementation of client apps that support multiple server versions. 
instance HasOptionalParam RealTimePost EventTypes where
  applyOptionalParam req (EventTypes xs) =
    req `addQuery` toQueryColl MultiParamArray ("event_types", Just xs)

-- | /Optional Param/ "narrow" - A JSON-encoded array of arrays of length 2 indicating the narrow for which you'd like to receive events for. For instance, to receive events for the stream `Denmark`, you would specify `narrow=[['stream', 'Denmark']]`.  Another example is `narrow=[['is', 'private']]` for private messages. Default is `[]`. 
instance HasOptionalParam RealTimePost NarrowText where
  applyOptionalParam req (NarrowText xs) =
    req `addQuery` toQueryColl MultiParamArray ("narrow", Just xs)

-- | /Optional Param/ "all_public_streams" - Whether you would like to request message events from all public streams.  Useful for workflow bots that you'd like to see all new messages sent to public streams.  (You can also subscribe the user to private streams). 
instance HasOptionalParam RealTimePost AllPublicStreams where
  applyOptionalParam req (AllPublicStreams xs) =
    req `addQuery` toQuery ("all_public_streams", Just xs)
instance Produces RealTimePost MimeNoContent


-- *** registerQueue

-- | @POST \/register@
-- 
-- Register an event queue
-- 
-- `POST {{ api_url }}/v1/register`  This powerful endpoint can be used to register a Zulip \"event queue\" (subscribed to certain types of \"events\", or updates to the messages and other Zulip data the current user has access to), as well as to fetch the current state of that data.  (`register` also powers the `call_on_each_event` Python API, and is intended primarily for complex applications for which the more convenient `call_on_each_event` API is insufficient).  This endpoint returns a `queue_id` and a `last_event_id`; these can be used in subsequent calls to the [\"events\" endpoint](/api/get-events) to request events from the Zulip server using long-polling.  The server will queue events for up to 10 minutes of inactivity. After 10 minutes, your event queue will be garbage-collected.  The server will send `heartbeat` events every minute, which makes it easy to implement a robust client that does not miss events unless the client loses network connectivity with the Zulip server for 10 minutes or longer.  Once the server garbage-collects your event queue, the server will [return an error](/api/get-events#bad_event_queue_id-errors) with a code of `BAD_EVENT_QUEUE_ID` if you try to fetch events from the event queue.  Your software will need to handle that error condition by re-initializing itself (e.g. this is what triggers your browser reloading the Zulip web app when your laptop comes back online after being offline for more than 10 minutes).  When prototyping with this API, we recommend first calling `register` with no `event_types` parameter to see all the available data from all supported event types.  Before using your client in production, you should set appropriate `event_types` and `fetch_event_types` filters so that your client only requests the data it needs.  A few minutes doing this often saves 90% of the total bandwidth and other resources consumed by a client using this API.  See the [events system developer documentation](https://zulip.readthedocs.io/en/latest/subsystems/events-system.html) if you need deeper details about how the Zulip event queue system works, avoids clients needing to worry about large classes of potentially messy races, etc. 
-- 
registerQueue 
  :: ZulipRESTRequest RegisterQueue MimeNoContent JsonSuccessBase MimeJSON
registerQueue =
  _mkRequest "POST" ["/register"]

data RegisterQueue  

-- | /Optional Param/ "apply_markdown" - Set to `true` if you would like the content to be rendered in HTML format (otherwise the API will return the raw text that the user entered) 
instance HasOptionalParam RegisterQueue ApplyMarkdown where
  applyOptionalParam req (ApplyMarkdown xs) =
    req `addQuery` toQuery ("apply_markdown", Just xs)

-- | /Optional Param/ "client_gravatar" - Whether the client supports computing gravatars URLs.  If enabled, `avatar_url` will be included in the response only if there is a Zulip avatar, and will be `null` for users who are using gravatar as their avatar.  This option significantly reduces the compressed size of user data, since gravatar URLs are long, random strings and thus do not compress well. The `client_gravatar` field is set to `true` if clients can compute their own gravatars. 
instance HasOptionalParam RegisterQueue ClientGravatar where
  applyOptionalParam req (ClientGravatar xs) =
    req `addQuery` toQuery ("client_gravatar", Just xs)

-- | /Optional Param/ "slim_presence" - Setting this to `true` will make presence dictionaries be keyed by user_id instead of email.  **Changes**: New in Zulip 3.0 (Unstable with no feature level yet). 
instance HasOptionalParam RegisterQueue SlimPresence where
  applyOptionalParam req (SlimPresence xs) =
    req `addQuery` toQuery ("slim_presence", Just xs)

-- | /Optional Param/ "event_types" - A JSON-encoded array indicating which types of events you're interested in. Values that you might find useful include:    * **message** (messages)   * **subscription** (changes in your subscriptions)   * **realm_user** (changes to users in the organization and     their properties, such as their name).  If you do not specify this parameter, you will receive all events, and have to filter out the events not relevant to your client in your client code.  For most applications, one is only interested in messages, so one specifies: `event_types=['message']`  Event types not supported by the server are ignored, in order to simplify the implementation of client apps that support multiple server versions. 
instance HasOptionalParam RegisterQueue EventTypes where
  applyOptionalParam req (EventTypes xs) =
    req `addQuery` toQueryColl MultiParamArray ("event_types", Just xs)

-- | /Optional Param/ "all_public_streams" - Whether you would like to request message events from all public streams.  Useful for workflow bots that you'd like to see all new messages sent to public streams.  (You can also subscribe the user to private streams). 
instance HasOptionalParam RegisterQueue AllPublicStreams where
  applyOptionalParam req (AllPublicStreams xs) =
    req `addQuery` toQuery ("all_public_streams", Just xs)

-- | /Optional Param/ "include_subscribers" - Whether each returned stream object should include a `subscribers` field containing a list of the user IDs of its subscribers.  (This may be significantly slower in organizations with thousands of users subscribed to many streams.)  **Changes**: New in Zulip 2.1.0. 
instance HasOptionalParam RegisterQueue IncludeSubscribers where
  applyOptionalParam req (IncludeSubscribers xs) =
    req `addQuery` toQuery ("include_subscribers", Just xs)

-- | /Optional Param/ "client_capabilities" - Dictionary containing details on features the client supports that are relevant to the format of responses sent by the server.  * `notification_settings_null`: Boolean for whether the   client can handle the current API with null values for   stream-level notification settings (which means the stream   is not customized and should inherit the user's global   notification settings for stream messages).  New in Zulip   2.1.0; in earlier Zulip releases, stream-level   notification settings were simple booleans.  * `bulk_message_deletion`: Boolean for whether the client's    handler for the `delete_message` event type has been    updated to process the new bulk format (with a    `message_ids`, rather than a singleton `message_id`).    Otherwise, the server will send `delete_message` events    in a loop.  New in Zulip 3.0 (feature level 13).  This    capability is for backwards-compatibility; it will be    required in a future server release.  * `user_avatar_url_field_optional`: Boolean for whether the    client required avatar URLs for all users, or supports    using `GET /avatar/{user_id}` to access user avatars.  If the    client has this capability, the server may skip sending a    `avatar_url` field in the `realm_user` at its sole discretion    to optimize network performance.  This is an important optimization    in organizations with 10,000s of users.    New in Zulip 3.0 (feature level 18).  * `stream_typing_notifications`: Boolean for whether the client   supports stream typing notifications.    New in Zulip 4.0 (feature level 58).  This capability is   for backwards-compatibility; it will be required in a   future server release. 
instance HasOptionalParam RegisterQueue ClientCapabilities where
  applyOptionalParam req (ClientCapabilities xs) =
    req `addQuery` toQuery ("client_capabilities", Just xs)

-- | /Optional Param/ "fetch_event_types" - Same as the `event_types` parameter except that the values in `fetch_event_types` are used to fetch initial data. If `fetch_event_types` is not provided, `event_types` is used and if `event_types` is not provided, this parameter defaults to `None`.  Event types not supported by the server are ignored, in order to simplify the implementation of client apps that support multiple server versions. 
instance HasOptionalParam RegisterQueue FetchEventTypes where
  applyOptionalParam req (FetchEventTypes xs) =
    req `addQuery` toQueryColl MultiParamArray ("fetch_event_types", Just xs)

-- | /Optional Param/ "narrow" - A JSON-encoded array of arrays of length 2 indicating the narrow for which you'd like to receive events for. For instance, to receive events for the stream `Denmark`, you would specify `narrow=[['stream', 'Denmark']]`.  Another example is `narrow=[['is', 'private']]` for private messages. Default is `[]`. 
instance HasOptionalParam RegisterQueue NarrowText where
  applyOptionalParam req (NarrowText xs) =
    req `addQuery` toQueryColl MultiParamArray ("narrow", Just xs)
-- | @application/json@
instance Produces RegisterQueue MimeJSON


-- *** restErrorHandling

-- | @POST \/rest-error-handling@
-- 
-- Error handling
-- 
-- Common error to many endpoints 
-- 
-- Note: Has 'Produces' instances, but no response schema
-- 
restErrorHandling 
  :: ZulipRESTRequest RestErrorHandling MimeNoContent res MimeJSON
restErrorHandling =
  _mkRequest "POST" ["/rest-error-handling"]

data RestErrorHandling  
-- | @application/json@
instance Produces RestErrorHandling MimeJSON
