{-# LANGUAGE ScopedTypeVariables #-}
{-# LANGUAGE OverloadedStrings #-}
{-# LANGUAGE RecordWildCards #-}
{-# LANGUAGE PartialTypeSignatures #-}

module Main where

import Data.Typeable (Proxy(..))
import Test.Hspec
import Test.Hspec.QuickCheck

import PropMime
import Instances ()

import ZulipREST.Model
import ZulipREST.MimeTypes

main :: IO ()
main =
  hspec $ modifyMaxSize (const 10) $ do
    describe "JSON instances" $ do
      pure ()
      propMimeEq MimeJSON (Proxy :: Proxy AddSubscriptionsResponse)
      propMimeEq MimeJSON (Proxy :: Proxy AddSubscriptionsResponseAllOf)
      propMimeEq MimeJSON (Proxy :: Proxy ApiKeyResponse)
      propMimeEq MimeJSON (Proxy :: Proxy ApiKeyResponseAllOf)
      propMimeEq MimeJSON (Proxy :: Proxy Attachments)
      propMimeEq MimeJSON (Proxy :: Proxy AttachmentsMessages)
      propMimeEq MimeJSON (Proxy :: Proxy BadEventQueueIdError)
      propMimeEq MimeJSON (Proxy :: Proxy BadEventQueueIdErrorAllOf)
      propMimeEq MimeJSON (Proxy :: Proxy BasicBot)
      propMimeEq MimeJSON (Proxy :: Proxy BasicBotAllOf)
      propMimeEq MimeJSON (Proxy :: Proxy BasicBotBase)
      propMimeEq MimeJSON (Proxy :: Proxy BasicStream)
      propMimeEq MimeJSON (Proxy :: Proxy BasicStreamAllOf)
      propMimeEq MimeJSON (Proxy :: Proxy BasicStreamBase)
      propMimeEq MimeJSON (Proxy :: Proxy Bot)
      propMimeEq MimeJSON (Proxy :: Proxy BotAllOf)
      propMimeEq MimeJSON (Proxy :: Proxy CodedError)
      propMimeEq MimeJSON (Proxy :: Proxy CodedErrorAllOf)
      propMimeEq MimeJSON (Proxy :: Proxy CodedErrorBase)
      propMimeEq MimeJSON (Proxy :: Proxy CodedErrorBaseAllOf)
      propMimeEq MimeJSON (Proxy :: Proxy CustomProfileField)
      propMimeEq MimeJSON (Proxy :: Proxy DefaultStreamGroup)
      propMimeEq MimeJSON (Proxy :: Proxy Draft)
      propMimeEq MimeJSON (Proxy :: Proxy EmojiBase)
      propMimeEq MimeJSON (Proxy :: Proxy EmojiReaction)
      propMimeEq MimeJSON (Proxy :: Proxy EmojiReactionAllOf)
      propMimeEq MimeJSON (Proxy :: Proxy EmojiReactionBase)
      propMimeEq MimeJSON (Proxy :: Proxy EmojiReactionBaseAllOf)
      propMimeEq MimeJSON (Proxy :: Proxy EmojiReactionBaseAllOfUser)
      propMimeEq MimeJSON (Proxy :: Proxy GetMessages)
      propMimeEq MimeJSON (Proxy :: Proxy GetMessagesAllOf)
      propMimeEq MimeJSON (Proxy :: Proxy Hotspot)
      propMimeEq MimeJSON (Proxy :: Proxy InlineResponse200)
      propMimeEq MimeJSON (Proxy :: Proxy InvalidApiKeyError)
      propMimeEq MimeJSON (Proxy :: Proxy InvalidMessageError)
      propMimeEq MimeJSON (Proxy :: Proxy InvalidMessageErrorAllOf)
      propMimeEq MimeJSON (Proxy :: Proxy JsonError)
      propMimeEq MimeJSON (Proxy :: Proxy JsonErrorBase)
      propMimeEq MimeJSON (Proxy :: Proxy JsonErrorBaseAllOf)
      propMimeEq MimeJSON (Proxy :: Proxy JsonResponseBase)
      propMimeEq MimeJSON (Proxy :: Proxy JsonSuccess)
      propMimeEq MimeJSON (Proxy :: Proxy JsonSuccessAllOf)
      propMimeEq MimeJSON (Proxy :: Proxy JsonSuccessBase)
      propMimeEq MimeJSON (Proxy :: Proxy JsonSuccessBaseAllOf)
      propMimeEq MimeJSON (Proxy :: Proxy Messages)
      propMimeEq MimeJSON (Proxy :: Proxy MessagesAllOf)
      propMimeEq MimeJSON (Proxy :: Proxy MessagesBase)
      propMimeEq MimeJSON (Proxy :: Proxy MessagesBaseTopicLinks)
      propMimeEq MimeJSON (Proxy :: Proxy MissingArgumentError)
      propMimeEq MimeJSON (Proxy :: Proxy MissingArgumentErrorAllOf)
      propMimeEq MimeJSON (Proxy :: Proxy NonExistingStreamError)
      propMimeEq MimeJSON (Proxy :: Proxy NonExistingStreamErrorAllOf)
      propMimeEq MimeJSON (Proxy :: Proxy Presence)
      propMimeEq MimeJSON (Proxy :: Proxy RateLimitedError)
      propMimeEq MimeJSON (Proxy :: Proxy RealmDeactivatedError)
      propMimeEq MimeJSON (Proxy :: Proxy RealmDomain)
      propMimeEq MimeJSON (Proxy :: Proxy RealmEmoji)
      propMimeEq MimeJSON (Proxy :: Proxy RealmExport)
      propMimeEq MimeJSON (Proxy :: Proxy RealmPlayground)
      propMimeEq MimeJSON (Proxy :: Proxy Subscriptions)
      propMimeEq MimeJSON (Proxy :: Proxy User)
      propMimeEq MimeJSON (Proxy :: Proxy UserAllOf)
      propMimeEq MimeJSON (Proxy :: Proxy UserBase)
      propMimeEq MimeJSON (Proxy :: Proxy UserDeactivatedError)
      propMimeEq MimeJSON (Proxy :: Proxy UserGroup)
      propMimeEq MimeJSON (Proxy :: Proxy UserNotAuthorizedError)
      
