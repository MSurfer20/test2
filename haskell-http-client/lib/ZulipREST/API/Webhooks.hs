{-
   Zulip REST API

   Powerful open source group chat 

   OpenAPI Version: 3.0.1
   Zulip REST API API version: 1.0.0
   Generated by OpenAPI Generator (https://openapi-generator.tech)
-}

{-|
Module : ZulipREST.API.Webhooks
-}

{-# LANGUAGE FlexibleContexts #-}
{-# LANGUAGE FlexibleInstances #-}
{-# LANGUAGE MonoLocalBinds #-}
{-# LANGUAGE MultiParamTypeClasses #-}
{-# LANGUAGE OverloadedStrings #-}
{-# OPTIONS_GHC -fno-warn-name-shadowing -fno-warn-unused-binds -fno-warn-unused-imports #-}

module ZulipREST.API.Webhooks where

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


-- ** Webhooks

-- *** zulipOutgoingWebhooks

-- | @POST \/zulip-outgoing-webhook@
-- 
-- Outgoing webhooks
-- 
-- Outgoing webhooks allows to build or set up Zulip integrations which are notified when certain types of messages are sent in Zulip. 
-- 
zulipOutgoingWebhooks 
  :: ZulipRESTRequest ZulipOutgoingWebhooks MimeNoContent InlineResponse200 MimeJSON
zulipOutgoingWebhooks =
  _mkRequest "POST" ["/zulip-outgoing-webhook"]

data ZulipOutgoingWebhooks  
-- | @application/json@
instance Produces ZulipOutgoingWebhooks MimeJSON

