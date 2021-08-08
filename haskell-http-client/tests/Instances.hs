{-# OPTIONS_GHC -fno-warn-unused-imports -fno-warn-unused-matches #-}

module Instances where

import ZulipREST.Model
import ZulipREST.Core

import qualified Data.Aeson as A
import qualified Data.ByteString.Lazy as BL
import qualified Data.HashMap.Strict as HM
import qualified Data.Set as Set
import qualified Data.Text as T
import qualified Data.Time as TI
import qualified Data.Vector as V

import Control.Monad
import Data.Char (isSpace)
import Data.List (sort)
import Test.QuickCheck

import ApproxEq

instance Arbitrary T.Text where
  arbitrary = T.pack <$> arbitrary

instance Arbitrary TI.Day where
  arbitrary = TI.ModifiedJulianDay . (2000 +) <$> arbitrary
  shrink = (TI.ModifiedJulianDay <$>) . shrink . TI.toModifiedJulianDay

instance Arbitrary TI.UTCTime where
  arbitrary =
    TI.UTCTime <$> arbitrary <*> (TI.secondsToDiffTime <$> choose (0, 86401))

instance Arbitrary BL.ByteString where
    arbitrary = BL.pack <$> arbitrary
    shrink xs = BL.pack <$> shrink (BL.unpack xs)

instance Arbitrary ByteArray where
    arbitrary = ByteArray <$> arbitrary
    shrink (ByteArray xs) = ByteArray <$> shrink xs

instance Arbitrary Binary where
    arbitrary = Binary <$> arbitrary
    shrink (Binary xs) = Binary <$> shrink xs

instance Arbitrary DateTime where
    arbitrary = DateTime <$> arbitrary
    shrink (DateTime xs) = DateTime <$> shrink xs

instance Arbitrary Date where
    arbitrary = Date <$> arbitrary
    shrink (Date xs) = Date <$> shrink xs

-- | A naive Arbitrary instance for A.Value:
instance Arbitrary A.Value where
  arbitrary = frequency [(3, simpleTypes), (1, arrayTypes), (1, objectTypes)]
    where
      simpleTypes :: Gen A.Value
      simpleTypes =
        frequency
          [ (1, return A.Null)
          , (2, liftM A.Bool (arbitrary :: Gen Bool))
          , (2, liftM (A.Number . fromIntegral) (arbitrary :: Gen Int))
          , (2, liftM (A.String . T.pack) (arbitrary :: Gen String))
          ]
      mapF (k, v) = (T.pack k, v)
      simpleAndArrays = frequency [(1, sized sizedArray), (4, simpleTypes)]
      arrayTypes = sized sizedArray
      objectTypes = sized sizedObject
      sizedArray n = liftM (A.Array . V.fromList) $ replicateM n simpleTypes
      sizedObject n =
        liftM (A.object . map mapF) $
        replicateM n $ (,) <$> (arbitrary :: Gen String) <*> simpleAndArrays
    
-- | Checks if a given list has no duplicates in _O(n log n)_.
hasNoDups
  :: (Ord a)
  => [a] -> Bool
hasNoDups = go Set.empty
  where
    go _ [] = True
    go s (x:xs)
      | s' <- Set.insert x s
      , Set.size s' > Set.size s = go s' xs
      | otherwise = False

instance ApproxEq TI.Day where
  (=~) = (==)
    
arbitraryReduced :: Arbitrary a => Int -> Gen a
arbitraryReduced n = resize (n `div` 2) arbitrary

arbitraryReducedMaybe :: Arbitrary a => Int -> Gen (Maybe a)
arbitraryReducedMaybe 0 = elements [Nothing]
arbitraryReducedMaybe n = arbitraryReduced n

arbitraryReducedMaybeValue :: Int -> Gen (Maybe A.Value)
arbitraryReducedMaybeValue 0 = elements [Nothing]
arbitraryReducedMaybeValue n = do
  generated <- arbitraryReduced n
  if generated == Just A.Null
    then return Nothing
    else return generated

-- * Models
 
instance Arbitrary AddSubscriptionsResponse where
  arbitrary = sized genAddSubscriptionsResponse

genAddSubscriptionsResponse :: Int -> Gen AddSubscriptionsResponse
genAddSubscriptionsResponse n =
  AddSubscriptionsResponse
    <$> arbitraryReduced n -- addSubscriptionsResponseResult :: AnyType
    <*> arbitraryReduced n -- addSubscriptionsResponseMsg :: AnyType
    <*> arbitraryReducedMaybe n -- addSubscriptionsResponseSubscribed :: Maybe (Map.Map String [Text])
    <*> arbitraryReducedMaybe n -- addSubscriptionsResponseAlreadySubscribed :: Maybe (Map.Map String [Text])
    <*> arbitraryReducedMaybe n -- addSubscriptionsResponseUnauthorized :: Maybe [Text]
  
instance Arbitrary AddSubscriptionsResponseAllOf where
  arbitrary = sized genAddSubscriptionsResponseAllOf

genAddSubscriptionsResponseAllOf :: Int -> Gen AddSubscriptionsResponseAllOf
genAddSubscriptionsResponseAllOf n =
  AddSubscriptionsResponseAllOf
    <$> arbitraryReducedMaybe n -- addSubscriptionsResponseAllOfResult :: Maybe AnyType
    <*> arbitraryReducedMaybe n -- addSubscriptionsResponseAllOfMsg :: Maybe AnyType
    <*> arbitraryReducedMaybe n -- addSubscriptionsResponseAllOfSubscribed :: Maybe (Map.Map String [Text])
    <*> arbitraryReducedMaybe n -- addSubscriptionsResponseAllOfAlreadySubscribed :: Maybe (Map.Map String [Text])
    <*> arbitraryReducedMaybe n -- addSubscriptionsResponseAllOfUnauthorized :: Maybe [Text]
  
instance Arbitrary ApiKeyResponse where
  arbitrary = sized genApiKeyResponse

genApiKeyResponse :: Int -> Gen ApiKeyResponse
genApiKeyResponse n =
  ApiKeyResponse
    <$> arbitraryReduced n -- apiKeyResponseResult :: AnyType
    <*> arbitraryReduced n -- apiKeyResponseMsg :: AnyType
    <*> arbitrary -- apiKeyResponseApiKey :: Text
    <*> arbitrary -- apiKeyResponseEmail :: Text
  
instance Arbitrary ApiKeyResponseAllOf where
  arbitrary = sized genApiKeyResponseAllOf

genApiKeyResponseAllOf :: Int -> Gen ApiKeyResponseAllOf
genApiKeyResponseAllOf n =
  ApiKeyResponseAllOf
    <$> arbitraryReducedMaybe n -- apiKeyResponseAllOfResult :: Maybe AnyType
    <*> arbitraryReducedMaybe n -- apiKeyResponseAllOfMsg :: Maybe AnyType
    <*> arbitrary -- apiKeyResponseAllOfApiKey :: Text
    <*> arbitrary -- apiKeyResponseAllOfEmail :: Text
  
instance Arbitrary Attachments where
  arbitrary = sized genAttachments

genAttachments :: Int -> Gen Attachments
genAttachments n =
  Attachments
    <$> arbitraryReducedMaybe n -- attachmentsId :: Maybe Int
    <*> arbitraryReducedMaybe n -- attachmentsName :: Maybe Text
    <*> arbitraryReducedMaybe n -- attachmentsPathId :: Maybe Text
    <*> arbitraryReducedMaybe n -- attachmentsSize :: Maybe Int
    <*> arbitraryReducedMaybe n -- attachmentsCreateTime :: Maybe Int
    <*> arbitraryReducedMaybe n -- attachmentsMessages :: Maybe [AttachmentsMessages]
  
instance Arbitrary AttachmentsMessages where
  arbitrary = sized genAttachmentsMessages

genAttachmentsMessages :: Int -> Gen AttachmentsMessages
genAttachmentsMessages n =
  AttachmentsMessages
    <$> arbitraryReducedMaybe n -- attachmentsMessagesDateSent :: Maybe Int
    <*> arbitraryReducedMaybe n -- attachmentsMessagesId :: Maybe Int
  
instance Arbitrary BadEventQueueIdError where
  arbitrary = sized genBadEventQueueIdError

genBadEventQueueIdError :: Int -> Gen BadEventQueueIdError
genBadEventQueueIdError n =
  BadEventQueueIdError
    <$> arbitraryReduced n -- badEventQueueIdErrorResult :: AnyType
    <*> arbitraryReduced n -- badEventQueueIdErrorMsg :: AnyType
    <*> arbitraryReducedMaybe n -- badEventQueueIdErrorCode :: Maybe AnyType
    <*> arbitraryReducedMaybe n -- badEventQueueIdErrorQueueId :: Maybe Text
  
instance Arbitrary BadEventQueueIdErrorAllOf where
  arbitrary = sized genBadEventQueueIdErrorAllOf

genBadEventQueueIdErrorAllOf :: Int -> Gen BadEventQueueIdErrorAllOf
genBadEventQueueIdErrorAllOf n =
  BadEventQueueIdErrorAllOf
    <$> arbitraryReducedMaybe n -- badEventQueueIdErrorAllOfResult :: Maybe AnyType
    <*> arbitraryReducedMaybe n -- badEventQueueIdErrorAllOfMsg :: Maybe AnyType
    <*> arbitraryReducedMaybe n -- badEventQueueIdErrorAllOfCode :: Maybe AnyType
    <*> arbitraryReducedMaybe n -- badEventQueueIdErrorAllOfQueueId :: Maybe Text
  
instance Arbitrary BasicBot where
  arbitrary = sized genBasicBot

genBasicBot :: Int -> Gen BasicBot
genBasicBot n =
  BasicBot
    <$> arbitraryReducedMaybe n -- basicBotUserId :: Maybe AnyType
    <*> arbitraryReducedMaybe n -- basicBotFullName :: Maybe AnyType
    <*> arbitraryReducedMaybe n -- basicBotApiKey :: Maybe AnyType
    <*> arbitraryReducedMaybe n -- basicBotDefaultSendingStream :: Maybe AnyType
    <*> arbitraryReducedMaybe n -- basicBotDefaultEventsRegisterStream :: Maybe AnyType
    <*> arbitraryReducedMaybe n -- basicBotDefaultAllPublicStreams :: Maybe AnyType
    <*> arbitraryReducedMaybe n -- basicBotAvatarUrl :: Maybe AnyType
    <*> arbitraryReducedMaybe n -- basicBotOwnerId :: Maybe AnyType
    <*> arbitraryReducedMaybe n -- basicBotServices :: Maybe AnyType
  
instance Arbitrary BasicBotAllOf where
  arbitrary = sized genBasicBotAllOf

genBasicBotAllOf :: Int -> Gen BasicBotAllOf
genBasicBotAllOf n =
  BasicBotAllOf
    <$> arbitraryReducedMaybe n -- basicBotAllOfUserId :: Maybe AnyType
    <*> arbitraryReducedMaybe n -- basicBotAllOfFullName :: Maybe AnyType
    <*> arbitraryReducedMaybe n -- basicBotAllOfApiKey :: Maybe AnyType
    <*> arbitraryReducedMaybe n -- basicBotAllOfDefaultSendingStream :: Maybe AnyType
    <*> arbitraryReducedMaybe n -- basicBotAllOfDefaultEventsRegisterStream :: Maybe AnyType
    <*> arbitraryReducedMaybe n -- basicBotAllOfDefaultAllPublicStreams :: Maybe AnyType
    <*> arbitraryReducedMaybe n -- basicBotAllOfAvatarUrl :: Maybe AnyType
    <*> arbitraryReducedMaybe n -- basicBotAllOfOwnerId :: Maybe AnyType
    <*> arbitraryReducedMaybe n -- basicBotAllOfServices :: Maybe AnyType
  
instance Arbitrary BasicBotBase where
  arbitrary = sized genBasicBotBase

genBasicBotBase :: Int -> Gen BasicBotBase
genBasicBotBase n =
  BasicBotBase
    <$> arbitraryReducedMaybe n -- basicBotBaseUserId :: Maybe Int
    <*> arbitraryReducedMaybe n -- basicBotBaseFullName :: Maybe Text
    <*> arbitraryReducedMaybe n -- basicBotBaseApiKey :: Maybe Text
    <*> arbitraryReducedMaybe n -- basicBotBaseDefaultSendingStream :: Maybe Text
    <*> arbitraryReducedMaybe n -- basicBotBaseDefaultEventsRegisterStream :: Maybe Text
    <*> arbitraryReducedMaybe n -- basicBotBaseDefaultAllPublicStreams :: Maybe Bool
    <*> arbitraryReducedMaybe n -- basicBotBaseAvatarUrl :: Maybe Text
    <*> arbitraryReducedMaybe n -- basicBotBaseOwnerId :: Maybe Int
    <*> arbitraryReducedMaybe n -- basicBotBaseServices :: Maybe [OneOfobjectobject]
  
instance Arbitrary BasicStream where
  arbitrary = sized genBasicStream

genBasicStream :: Int -> Gen BasicStream
genBasicStream n =
  BasicStream
    <$> arbitraryReducedMaybe n -- basicStreamStreamId :: Maybe AnyType
    <*> arbitraryReducedMaybe n -- basicStreamName :: Maybe AnyType
    <*> arbitraryReducedMaybe n -- basicStreamDescription :: Maybe AnyType
    <*> arbitraryReducedMaybe n -- basicStreamDateCreated :: Maybe AnyType
    <*> arbitraryReducedMaybe n -- basicStreamInviteOnly :: Maybe AnyType
    <*> arbitraryReducedMaybe n -- basicStreamRenderedDescription :: Maybe AnyType
    <*> arbitraryReducedMaybe n -- basicStreamIsWebPublic :: Maybe AnyType
    <*> arbitraryReducedMaybe n -- basicStreamStreamPostPolicy :: Maybe AnyType
    <*> arbitraryReducedMaybe n -- basicStreamMessageRetentionDays :: Maybe AnyType
    <*> arbitraryReducedMaybe n -- basicStreamHistoryPublicToSubscribers :: Maybe AnyType
    <*> arbitraryReducedMaybe n -- basicStreamFirstMessageId :: Maybe AnyType
    <*> arbitraryReducedMaybe n -- basicStreamIsAnnouncementOnly :: Maybe AnyType
  
instance Arbitrary BasicStreamAllOf where
  arbitrary = sized genBasicStreamAllOf

genBasicStreamAllOf :: Int -> Gen BasicStreamAllOf
genBasicStreamAllOf n =
  BasicStreamAllOf
    <$> arbitraryReducedMaybe n -- basicStreamAllOfStreamId :: Maybe AnyType
    <*> arbitraryReducedMaybe n -- basicStreamAllOfName :: Maybe AnyType
    <*> arbitraryReducedMaybe n -- basicStreamAllOfDescription :: Maybe AnyType
    <*> arbitraryReducedMaybe n -- basicStreamAllOfDateCreated :: Maybe AnyType
    <*> arbitraryReducedMaybe n -- basicStreamAllOfInviteOnly :: Maybe AnyType
    <*> arbitraryReducedMaybe n -- basicStreamAllOfRenderedDescription :: Maybe AnyType
    <*> arbitraryReducedMaybe n -- basicStreamAllOfIsWebPublic :: Maybe AnyType
    <*> arbitraryReducedMaybe n -- basicStreamAllOfStreamPostPolicy :: Maybe AnyType
    <*> arbitraryReducedMaybe n -- basicStreamAllOfMessageRetentionDays :: Maybe AnyType
    <*> arbitraryReducedMaybe n -- basicStreamAllOfHistoryPublicToSubscribers :: Maybe AnyType
    <*> arbitraryReducedMaybe n -- basicStreamAllOfFirstMessageId :: Maybe AnyType
    <*> arbitraryReducedMaybe n -- basicStreamAllOfIsAnnouncementOnly :: Maybe AnyType
  
instance Arbitrary BasicStreamBase where
  arbitrary = sized genBasicStreamBase

genBasicStreamBase :: Int -> Gen BasicStreamBase
genBasicStreamBase n =
  BasicStreamBase
    <$> arbitraryReducedMaybe n -- basicStreamBaseStreamId :: Maybe Int
    <*> arbitraryReducedMaybe n -- basicStreamBaseName :: Maybe Text
    <*> arbitraryReducedMaybe n -- basicStreamBaseDescription :: Maybe Text
    <*> arbitraryReducedMaybe n -- basicStreamBaseDateCreated :: Maybe Int
    <*> arbitraryReducedMaybe n -- basicStreamBaseInviteOnly :: Maybe Bool
    <*> arbitraryReducedMaybe n -- basicStreamBaseRenderedDescription :: Maybe Text
    <*> arbitraryReducedMaybe n -- basicStreamBaseIsWebPublic :: Maybe Bool
    <*> arbitraryReducedMaybe n -- basicStreamBaseStreamPostPolicy :: Maybe Int
    <*> arbitraryReducedMaybe n -- basicStreamBaseMessageRetentionDays :: Maybe Int
    <*> arbitraryReducedMaybe n -- basicStreamBaseHistoryPublicToSubscribers :: Maybe Bool
    <*> arbitraryReducedMaybe n -- basicStreamBaseFirstMessageId :: Maybe Int
    <*> arbitraryReducedMaybe n -- basicStreamBaseIsAnnouncementOnly :: Maybe Bool
  
instance Arbitrary Bot where
  arbitrary = sized genBot

genBot :: Int -> Gen Bot
genBot n =
  Bot
    <$> arbitraryReducedMaybe n -- botUserId :: Maybe AnyType
    <*> arbitraryReducedMaybe n -- botFullName :: Maybe AnyType
    <*> arbitraryReducedMaybe n -- botApiKey :: Maybe AnyType
    <*> arbitraryReducedMaybe n -- botDefaultSendingStream :: Maybe AnyType
    <*> arbitraryReducedMaybe n -- botDefaultEventsRegisterStream :: Maybe AnyType
    <*> arbitraryReducedMaybe n -- botDefaultAllPublicStreams :: Maybe AnyType
    <*> arbitraryReducedMaybe n -- botAvatarUrl :: Maybe AnyType
    <*> arbitraryReducedMaybe n -- botOwnerId :: Maybe AnyType
    <*> arbitraryReducedMaybe n -- botServices :: Maybe AnyType
    <*> arbitraryReducedMaybe n -- botEmail :: Maybe Text
    <*> arbitraryReducedMaybe n -- botBotType :: Maybe Int
    <*> arbitraryReducedMaybe n -- botIsActive :: Maybe Bool
  
instance Arbitrary BotAllOf where
  arbitrary = sized genBotAllOf

genBotAllOf :: Int -> Gen BotAllOf
genBotAllOf n =
  BotAllOf
    <$> arbitraryReducedMaybe n -- botAllOfUserId :: Maybe AnyType
    <*> arbitraryReducedMaybe n -- botAllOfFullName :: Maybe AnyType
    <*> arbitraryReducedMaybe n -- botAllOfApiKey :: Maybe AnyType
    <*> arbitraryReducedMaybe n -- botAllOfDefaultSendingStream :: Maybe AnyType
    <*> arbitraryReducedMaybe n -- botAllOfDefaultEventsRegisterStream :: Maybe AnyType
    <*> arbitraryReducedMaybe n -- botAllOfDefaultAllPublicStreams :: Maybe AnyType
    <*> arbitraryReducedMaybe n -- botAllOfAvatarUrl :: Maybe AnyType
    <*> arbitraryReducedMaybe n -- botAllOfOwnerId :: Maybe AnyType
    <*> arbitraryReducedMaybe n -- botAllOfServices :: Maybe AnyType
    <*> arbitraryReducedMaybe n -- botAllOfEmail :: Maybe Text
    <*> arbitraryReducedMaybe n -- botAllOfBotType :: Maybe Int
    <*> arbitraryReducedMaybe n -- botAllOfIsActive :: Maybe Bool
  
instance Arbitrary CodedError where
  arbitrary = sized genCodedError

genCodedError :: Int -> Gen CodedError
genCodedError n =
  CodedError
    <$> arbitraryReduced n -- codedErrorResult :: AnyType
    <*> arbitraryReduced n -- codedErrorMsg :: AnyType
    <*> arbitraryReducedMaybe n -- codedErrorCode :: Maybe AnyType
  
instance Arbitrary CodedErrorAllOf where
  arbitrary = sized genCodedErrorAllOf

genCodedErrorAllOf :: Int -> Gen CodedErrorAllOf
genCodedErrorAllOf n =
  CodedErrorAllOf
    <$> arbitraryReducedMaybe n -- codedErrorAllOfResult :: Maybe AnyType
    <*> arbitraryReducedMaybe n -- codedErrorAllOfMsg :: Maybe AnyType
    <*> arbitraryReducedMaybe n -- codedErrorAllOfCode :: Maybe AnyType
  
instance Arbitrary CodedErrorBase where
  arbitrary = sized genCodedErrorBase

genCodedErrorBase :: Int -> Gen CodedErrorBase
genCodedErrorBase n =
  CodedErrorBase
    <$> arbitraryReduced n -- codedErrorBaseResult :: AnyType
    <*> arbitraryReduced n -- codedErrorBaseMsg :: AnyType
    <*> arbitraryReducedMaybe n -- codedErrorBaseCode :: Maybe Text
  
instance Arbitrary CodedErrorBaseAllOf where
  arbitrary = sized genCodedErrorBaseAllOf

genCodedErrorBaseAllOf :: Int -> Gen CodedErrorBaseAllOf
genCodedErrorBaseAllOf n =
  CodedErrorBaseAllOf
    <$> arbitraryReducedMaybe n -- codedErrorBaseAllOfResult :: Maybe AnyType
    <*> arbitraryReducedMaybe n -- codedErrorBaseAllOfMsg :: Maybe AnyType
    <*> arbitraryReducedMaybe n -- codedErrorBaseAllOfCode :: Maybe Text
  
instance Arbitrary CustomProfileField where
  arbitrary = sized genCustomProfileField

genCustomProfileField :: Int -> Gen CustomProfileField
genCustomProfileField n =
  CustomProfileField
    <$> arbitraryReducedMaybe n -- customProfileFieldId :: Maybe Int
    <*> arbitraryReducedMaybe n -- customProfileFieldType :: Maybe Int
    <*> arbitraryReducedMaybe n -- customProfileFieldOrder :: Maybe Int
    <*> arbitraryReducedMaybe n -- customProfileFieldName :: Maybe Text
    <*> arbitraryReducedMaybe n -- customProfileFieldHint :: Maybe Text
    <*> arbitraryReducedMaybe n -- customProfileFieldFieldData :: Maybe Text
  
instance Arbitrary DefaultStreamGroup where
  arbitrary = sized genDefaultStreamGroup

genDefaultStreamGroup :: Int -> Gen DefaultStreamGroup
genDefaultStreamGroup n =
  DefaultStreamGroup
    <$> arbitraryReducedMaybe n -- defaultStreamGroupName :: Maybe Text
    <*> arbitraryReducedMaybe n -- defaultStreamGroupDescription :: Maybe Text
    <*> arbitraryReducedMaybe n -- defaultStreamGroupId :: Maybe Int
    <*> arbitraryReducedMaybe n -- defaultStreamGroupStreams :: Maybe [BasicStream]
  
instance Arbitrary EmojiReaction where
  arbitrary = sized genEmojiReaction

genEmojiReaction :: Int -> Gen EmojiReaction
genEmojiReaction n =
  EmojiReaction
    <$> arbitraryReducedMaybe n -- emojiReactionEmojiCode :: Maybe AnyType
    <*> arbitraryReducedMaybe n -- emojiReactionEmojiName :: Maybe AnyType
    <*> arbitraryReducedMaybe n -- emojiReactionReactionType :: Maybe AnyType
    <*> arbitraryReducedMaybe n -- emojiReactionUserId :: Maybe AnyType
    <*> arbitraryReducedMaybe n -- emojiReactionUser :: Maybe AnyType
  
instance Arbitrary EmojiReactionAllOf where
  arbitrary = sized genEmojiReactionAllOf

genEmojiReactionAllOf :: Int -> Gen EmojiReactionAllOf
genEmojiReactionAllOf n =
  EmojiReactionAllOf
    <$> arbitraryReducedMaybe n -- emojiReactionAllOfEmojiCode :: Maybe AnyType
    <*> arbitraryReducedMaybe n -- emojiReactionAllOfEmojiName :: Maybe AnyType
    <*> arbitraryReducedMaybe n -- emojiReactionAllOfReactionType :: Maybe AnyType
    <*> arbitraryReducedMaybe n -- emojiReactionAllOfUserId :: Maybe AnyType
    <*> arbitraryReducedMaybe n -- emojiReactionAllOfUser :: Maybe AnyType
  
instance Arbitrary EmojiReactionBase where
  arbitrary = sized genEmojiReactionBase

genEmojiReactionBase :: Int -> Gen EmojiReactionBase
genEmojiReactionBase n =
  EmojiReactionBase
    <$> arbitraryReducedMaybe n -- emojiReactionBaseEmojiCode :: Maybe Text
    <*> arbitraryReducedMaybe n -- emojiReactionBaseEmojiName :: Maybe Text
    <*> arbitraryReducedMaybe n -- emojiReactionBaseReactionType :: Maybe Text
    <*> arbitraryReducedMaybe n -- emojiReactionBaseUserId :: Maybe Int
    <*> arbitraryReducedMaybe n -- emojiReactionBaseUser :: Maybe EmojiReactionBaseUser
  
instance Arbitrary EmojiReactionBaseUser where
  arbitrary = sized genEmojiReactionBaseUser

genEmojiReactionBaseUser :: Int -> Gen EmojiReactionBaseUser
genEmojiReactionBaseUser n =
  EmojiReactionBaseUser
    <$> arbitraryReducedMaybe n -- emojiReactionBaseUserId :: Maybe Int
    <*> arbitraryReducedMaybe n -- emojiReactionBaseUserEmail :: Maybe Text
    <*> arbitraryReducedMaybe n -- emojiReactionBaseUserFullName :: Maybe Text
    <*> arbitraryReducedMaybe n -- emojiReactionBaseUserIsMirrorDummy :: Maybe Bool
  
instance Arbitrary GetMessages where
  arbitrary = sized genGetMessages

genGetMessages :: Int -> Gen GetMessages
genGetMessages n =
  GetMessages
    <$> arbitraryReducedMaybe n -- getMessagesAvatarUrl :: Maybe AnyType
    <*> arbitraryReducedMaybe n -- getMessagesClient :: Maybe AnyType
    <*> arbitraryReducedMaybe n -- getMessagesContent :: Maybe AnyType
    <*> arbitraryReducedMaybe n -- getMessagesContentType :: Maybe AnyType
    <*> arbitraryReducedMaybe n -- getMessagesDisplayRecipient :: Maybe AnyType
    <*> arbitraryReducedMaybe n -- getMessagesId :: Maybe AnyType
    <*> arbitraryReducedMaybe n -- getMessagesIsMeMessage :: Maybe AnyType
    <*> arbitraryReducedMaybe n -- getMessagesReactions :: Maybe AnyType
    <*> arbitraryReducedMaybe n -- getMessagesRecipientId :: Maybe AnyType
    <*> arbitraryReducedMaybe n -- getMessagesSenderEmail :: Maybe AnyType
    <*> arbitraryReducedMaybe n -- getMessagesSenderFullName :: Maybe AnyType
    <*> arbitraryReducedMaybe n -- getMessagesSenderId :: Maybe AnyType
    <*> arbitraryReducedMaybe n -- getMessagesSenderRealmStr :: Maybe AnyType
    <*> arbitraryReducedMaybe n -- getMessagesStreamId :: Maybe AnyType
    <*> arbitraryReducedMaybe n -- getMessagesSubject :: Maybe AnyType
    <*> arbitraryReducedMaybe n -- getMessagesTopicLinks :: Maybe AnyType
    <*> arbitraryReducedMaybe n -- getMessagesSubmessages :: Maybe AnyType
    <*> arbitraryReducedMaybe n -- getMessagesTimestamp :: Maybe AnyType
    <*> arbitraryReducedMaybe n -- getMessagesType :: Maybe AnyType
    <*> arbitraryReducedMaybe n -- getMessagesFlags :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- getMessagesLastEditTimestamp :: Maybe Int
    <*> arbitraryReducedMaybe n -- getMessagesMatchContent :: Maybe Text
    <*> arbitraryReducedMaybe n -- getMessagesMatchSubject :: Maybe Text
  
instance Arbitrary GetMessagesAllOf where
  arbitrary = sized genGetMessagesAllOf

genGetMessagesAllOf :: Int -> Gen GetMessagesAllOf
genGetMessagesAllOf n =
  GetMessagesAllOf
    <$> arbitraryReducedMaybe n -- getMessagesAllOfAvatarUrl :: Maybe AnyType
    <*> arbitraryReducedMaybe n -- getMessagesAllOfClient :: Maybe AnyType
    <*> arbitraryReducedMaybe n -- getMessagesAllOfContent :: Maybe AnyType
    <*> arbitraryReducedMaybe n -- getMessagesAllOfContentType :: Maybe AnyType
    <*> arbitraryReducedMaybe n -- getMessagesAllOfDisplayRecipient :: Maybe AnyType
    <*> arbitraryReducedMaybe n -- getMessagesAllOfId :: Maybe AnyType
    <*> arbitraryReducedMaybe n -- getMessagesAllOfIsMeMessage :: Maybe AnyType
    <*> arbitraryReducedMaybe n -- getMessagesAllOfReactions :: Maybe AnyType
    <*> arbitraryReducedMaybe n -- getMessagesAllOfRecipientId :: Maybe AnyType
    <*> arbitraryReducedMaybe n -- getMessagesAllOfSenderEmail :: Maybe AnyType
    <*> arbitraryReducedMaybe n -- getMessagesAllOfSenderFullName :: Maybe AnyType
    <*> arbitraryReducedMaybe n -- getMessagesAllOfSenderId :: Maybe AnyType
    <*> arbitraryReducedMaybe n -- getMessagesAllOfSenderRealmStr :: Maybe AnyType
    <*> arbitraryReducedMaybe n -- getMessagesAllOfStreamId :: Maybe AnyType
    <*> arbitraryReducedMaybe n -- getMessagesAllOfSubject :: Maybe AnyType
    <*> arbitraryReducedMaybe n -- getMessagesAllOfTopicLinks :: Maybe AnyType
    <*> arbitraryReducedMaybe n -- getMessagesAllOfSubmessages :: Maybe AnyType
    <*> arbitraryReducedMaybe n -- getMessagesAllOfTimestamp :: Maybe AnyType
    <*> arbitraryReducedMaybe n -- getMessagesAllOfType :: Maybe AnyType
    <*> arbitraryReducedMaybe n -- getMessagesAllOfFlags :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- getMessagesAllOfLastEditTimestamp :: Maybe Int
    <*> arbitraryReducedMaybe n -- getMessagesAllOfMatchContent :: Maybe Text
    <*> arbitraryReducedMaybe n -- getMessagesAllOfMatchSubject :: Maybe Text
  
instance Arbitrary Hotspot where
  arbitrary = sized genHotspot

genHotspot :: Int -> Gen Hotspot
genHotspot n =
  Hotspot
    <$> arbitraryReducedMaybe n -- hotspotDelay :: Maybe Double
    <*> arbitraryReducedMaybe n -- hotspotName :: Maybe Text
    <*> arbitraryReducedMaybe n -- hotspotTitle :: Maybe Text
    <*> arbitraryReducedMaybe n -- hotspotDescription :: Maybe Text
  
instance Arbitrary InlineResponse200 where
  arbitrary = sized genInlineResponse200

genInlineResponse200 :: Int -> Gen InlineResponse200
genInlineResponse200 n =
  InlineResponse200
    <$> arbitraryReducedMaybe n -- inlineResponse200BotEmail :: Maybe Text
    <*> arbitraryReducedMaybe n -- inlineResponse200BotFullName :: Maybe Text
    <*> arbitraryReducedMaybe n -- inlineResponse200Data :: Maybe Text
    <*> arbitraryReducedMaybe n -- inlineResponse200Trigger :: Maybe Text
    <*> arbitraryReducedMaybe n -- inlineResponse200Token :: Maybe Text
    <*> arbitraryReducedMaybe n -- inlineResponse200Message :: Maybe MessagesBase
  
instance Arbitrary InvalidApiKeyError where
  arbitrary = sized genInvalidApiKeyError

genInvalidApiKeyError :: Int -> Gen InvalidApiKeyError
genInvalidApiKeyError n =
  InvalidApiKeyError
    <$> arbitraryReduced n -- invalidApiKeyErrorResult :: AnyType
    <*> arbitraryReduced n -- invalidApiKeyErrorMsg :: AnyType
  
instance Arbitrary InvalidMessageError where
  arbitrary = sized genInvalidMessageError

genInvalidMessageError :: Int -> Gen InvalidMessageError
genInvalidMessageError n =
  InvalidMessageError
    <$> arbitraryReduced n -- invalidMessageErrorResult :: AnyType
    <*> arbitraryReduced n -- invalidMessageErrorMsg :: AnyType
    <*> arbitraryReducedMaybe n -- invalidMessageErrorRawContent :: Maybe Text
  
instance Arbitrary InvalidMessageErrorAllOf where
  arbitrary = sized genInvalidMessageErrorAllOf

genInvalidMessageErrorAllOf :: Int -> Gen InvalidMessageErrorAllOf
genInvalidMessageErrorAllOf n =
  InvalidMessageErrorAllOf
    <$> arbitraryReducedMaybe n -- invalidMessageErrorAllOfResult :: Maybe AnyType
    <*> arbitraryReducedMaybe n -- invalidMessageErrorAllOfMsg :: Maybe AnyType
    <*> arbitraryReducedMaybe n -- invalidMessageErrorAllOfRawContent :: Maybe Text
  
instance Arbitrary JsonError where
  arbitrary = sized genJsonError

genJsonError :: Int -> Gen JsonError
genJsonError n =
  JsonError
    <$> arbitraryReduced n -- jsonErrorResult :: AnyType
    <*> arbitraryReduced n -- jsonErrorMsg :: AnyType
  
instance Arbitrary JsonErrorBase where
  arbitrary = sized genJsonErrorBase

genJsonErrorBase :: Int -> Gen JsonErrorBase
genJsonErrorBase n =
  JsonErrorBase
    <$> arbitrary -- jsonErrorBaseResult :: E'Result2
    <*> arbitrary -- jsonErrorBaseMsg :: Text
  
instance Arbitrary JsonErrorBaseAllOf where
  arbitrary = sized genJsonErrorBaseAllOf

genJsonErrorBaseAllOf :: Int -> Gen JsonErrorBaseAllOf
genJsonErrorBaseAllOf n =
  JsonErrorBaseAllOf
    <$> arbitrary -- jsonErrorBaseAllOfResult :: E'Result2
    <*> arbitrary -- jsonErrorBaseAllOfMsg :: Text
  
instance Arbitrary JsonResponseBase where
  arbitrary = sized genJsonResponseBase

genJsonResponseBase :: Int -> Gen JsonResponseBase
genJsonResponseBase n =
  JsonResponseBase
    <$> arbitraryReducedMaybe n -- jsonResponseBaseResult :: Maybe Text
  
instance Arbitrary JsonSuccess where
  arbitrary = sized genJsonSuccess

genJsonSuccess :: Int -> Gen JsonSuccess
genJsonSuccess n =
  JsonSuccess
    <$> arbitraryReduced n -- jsonSuccessResult :: AnyType
    <*> arbitraryReduced n -- jsonSuccessMsg :: AnyType
  
instance Arbitrary JsonSuccessAllOf where
  arbitrary = sized genJsonSuccessAllOf

genJsonSuccessAllOf :: Int -> Gen JsonSuccessAllOf
genJsonSuccessAllOf n =
  JsonSuccessAllOf
    <$> arbitraryReducedMaybe n -- jsonSuccessAllOfResult :: Maybe AnyType
    <*> arbitraryReducedMaybe n -- jsonSuccessAllOfMsg :: Maybe AnyType
  
instance Arbitrary JsonSuccessBase where
  arbitrary = sized genJsonSuccessBase

genJsonSuccessBase :: Int -> Gen JsonSuccessBase
genJsonSuccessBase n =
  JsonSuccessBase
    <$> arbitrary -- jsonSuccessBaseResult :: E'Result
    <*> arbitrary -- jsonSuccessBaseMsg :: Text
  
instance Arbitrary JsonSuccessBaseAllOf where
  arbitrary = sized genJsonSuccessBaseAllOf

genJsonSuccessBaseAllOf :: Int -> Gen JsonSuccessBaseAllOf
genJsonSuccessBaseAllOf n =
  JsonSuccessBaseAllOf
    <$> arbitrary -- jsonSuccessBaseAllOfResult :: E'Result
    <*> arbitrary -- jsonSuccessBaseAllOfMsg :: Text
  
instance Arbitrary Messages where
  arbitrary = sized genMessages

genMessages :: Int -> Gen Messages
genMessages n =
  Messages
    <$> arbitraryReducedMaybe n -- messagesAvatarUrl :: Maybe AnyType
    <*> arbitraryReducedMaybe n -- messagesClient :: Maybe AnyType
    <*> arbitraryReducedMaybe n -- messagesContent :: Maybe AnyType
    <*> arbitraryReducedMaybe n -- messagesContentType :: Maybe AnyType
    <*> arbitraryReducedMaybe n -- messagesDisplayRecipient :: Maybe AnyType
    <*> arbitraryReducedMaybe n -- messagesId :: Maybe AnyType
    <*> arbitraryReducedMaybe n -- messagesIsMeMessage :: Maybe AnyType
    <*> arbitraryReducedMaybe n -- messagesReactions :: Maybe AnyType
    <*> arbitraryReducedMaybe n -- messagesRecipientId :: Maybe AnyType
    <*> arbitraryReducedMaybe n -- messagesSenderEmail :: Maybe AnyType
    <*> arbitraryReducedMaybe n -- messagesSenderFullName :: Maybe AnyType
    <*> arbitraryReducedMaybe n -- messagesSenderId :: Maybe AnyType
    <*> arbitraryReducedMaybe n -- messagesSenderRealmStr :: Maybe AnyType
    <*> arbitraryReducedMaybe n -- messagesStreamId :: Maybe AnyType
    <*> arbitraryReducedMaybe n -- messagesSubject :: Maybe AnyType
    <*> arbitraryReducedMaybe n -- messagesTopicLinks :: Maybe AnyType
    <*> arbitraryReducedMaybe n -- messagesSubmessages :: Maybe AnyType
    <*> arbitraryReducedMaybe n -- messagesTimestamp :: Maybe AnyType
    <*> arbitraryReducedMaybe n -- messagesType :: Maybe AnyType
  
instance Arbitrary MessagesAllOf where
  arbitrary = sized genMessagesAllOf

genMessagesAllOf :: Int -> Gen MessagesAllOf
genMessagesAllOf n =
  MessagesAllOf
    <$> arbitraryReducedMaybe n -- messagesAllOfAvatarUrl :: Maybe AnyType
    <*> arbitraryReducedMaybe n -- messagesAllOfClient :: Maybe AnyType
    <*> arbitraryReducedMaybe n -- messagesAllOfContent :: Maybe AnyType
    <*> arbitraryReducedMaybe n -- messagesAllOfContentType :: Maybe AnyType
    <*> arbitraryReducedMaybe n -- messagesAllOfDisplayRecipient :: Maybe AnyType
    <*> arbitraryReducedMaybe n -- messagesAllOfId :: Maybe AnyType
    <*> arbitraryReducedMaybe n -- messagesAllOfIsMeMessage :: Maybe AnyType
    <*> arbitraryReducedMaybe n -- messagesAllOfReactions :: Maybe AnyType
    <*> arbitraryReducedMaybe n -- messagesAllOfRecipientId :: Maybe AnyType
    <*> arbitraryReducedMaybe n -- messagesAllOfSenderEmail :: Maybe AnyType
    <*> arbitraryReducedMaybe n -- messagesAllOfSenderFullName :: Maybe AnyType
    <*> arbitraryReducedMaybe n -- messagesAllOfSenderId :: Maybe AnyType
    <*> arbitraryReducedMaybe n -- messagesAllOfSenderRealmStr :: Maybe AnyType
    <*> arbitraryReducedMaybe n -- messagesAllOfStreamId :: Maybe AnyType
    <*> arbitraryReducedMaybe n -- messagesAllOfSubject :: Maybe AnyType
    <*> arbitraryReducedMaybe n -- messagesAllOfTopicLinks :: Maybe AnyType
    <*> arbitraryReducedMaybe n -- messagesAllOfSubmessages :: Maybe AnyType
    <*> arbitraryReducedMaybe n -- messagesAllOfTimestamp :: Maybe AnyType
    <*> arbitraryReducedMaybe n -- messagesAllOfType :: Maybe AnyType
  
instance Arbitrary MessagesBase where
  arbitrary = sized genMessagesBase

genMessagesBase :: Int -> Gen MessagesBase
genMessagesBase n =
  MessagesBase
    <$> arbitraryReducedMaybe n -- messagesBaseAvatarUrl :: Maybe Text
    <*> arbitraryReducedMaybe n -- messagesBaseClient :: Maybe Text
    <*> arbitraryReducedMaybe n -- messagesBaseContent :: Maybe Text
    <*> arbitraryReducedMaybe n -- messagesBaseContentType :: Maybe Text
    <*> arbitraryReducedMaybe n -- messagesBaseDisplayRecipient :: Maybe OneOfstringarray
    <*> arbitraryReducedMaybe n -- messagesBaseId :: Maybe Int
    <*> arbitraryReducedMaybe n -- messagesBaseIsMeMessage :: Maybe Bool
    <*> arbitraryReducedMaybe n -- messagesBaseReactions :: Maybe [EmojiReaction]
    <*> arbitraryReducedMaybe n -- messagesBaseRecipientId :: Maybe Int
    <*> arbitraryReducedMaybe n -- messagesBaseSenderEmail :: Maybe Text
    <*> arbitraryReducedMaybe n -- messagesBaseSenderFullName :: Maybe Text
    <*> arbitraryReducedMaybe n -- messagesBaseSenderId :: Maybe Int
    <*> arbitraryReducedMaybe n -- messagesBaseSenderRealmStr :: Maybe Text
    <*> arbitraryReducedMaybe n -- messagesBaseStreamId :: Maybe Int
    <*> arbitraryReducedMaybe n -- messagesBaseSubject :: Maybe Text
    <*> arbitraryReducedMaybe n -- messagesBaseTopicLinks :: Maybe [MessagesBaseTopicLinks]
    <*> arbitraryReducedMaybe n -- messagesBaseSubmessages :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- messagesBaseTimestamp :: Maybe Int
    <*> arbitraryReducedMaybe n -- messagesBaseType :: Maybe Text
  
instance Arbitrary MessagesBaseTopicLinks where
  arbitrary = sized genMessagesBaseTopicLinks

genMessagesBaseTopicLinks :: Int -> Gen MessagesBaseTopicLinks
genMessagesBaseTopicLinks n =
  MessagesBaseTopicLinks
    <$> arbitraryReducedMaybe n -- messagesBaseTopicLinksText :: Maybe Text
    <*> arbitraryReducedMaybe n -- messagesBaseTopicLinksUrl :: Maybe Text
  
instance Arbitrary MissingArgumentError where
  arbitrary = sized genMissingArgumentError

genMissingArgumentError :: Int -> Gen MissingArgumentError
genMissingArgumentError n =
  MissingArgumentError
    <$> arbitraryReduced n -- missingArgumentErrorResult :: AnyType
    <*> arbitraryReduced n -- missingArgumentErrorMsg :: AnyType
    <*> arbitraryReducedMaybe n -- missingArgumentErrorCode :: Maybe AnyType
    <*> arbitraryReducedMaybe n -- missingArgumentErrorVarName :: Maybe Text
  
instance Arbitrary MissingArgumentErrorAllOf where
  arbitrary = sized genMissingArgumentErrorAllOf

genMissingArgumentErrorAllOf :: Int -> Gen MissingArgumentErrorAllOf
genMissingArgumentErrorAllOf n =
  MissingArgumentErrorAllOf
    <$> arbitraryReducedMaybe n -- missingArgumentErrorAllOfResult :: Maybe AnyType
    <*> arbitraryReducedMaybe n -- missingArgumentErrorAllOfMsg :: Maybe AnyType
    <*> arbitraryReducedMaybe n -- missingArgumentErrorAllOfCode :: Maybe AnyType
    <*> arbitraryReducedMaybe n -- missingArgumentErrorAllOfVarName :: Maybe Text
  
instance Arbitrary NonExistingStreamError where
  arbitrary = sized genNonExistingStreamError

genNonExistingStreamError :: Int -> Gen NonExistingStreamError
genNonExistingStreamError n =
  NonExistingStreamError
    <$> arbitraryReduced n -- nonExistingStreamErrorResult :: AnyType
    <*> arbitraryReduced n -- nonExistingStreamErrorMsg :: AnyType
    <*> arbitraryReducedMaybe n -- nonExistingStreamErrorCode :: Maybe AnyType
    <*> arbitraryReducedMaybe n -- nonExistingStreamErrorStream :: Maybe Text
  
instance Arbitrary NonExistingStreamErrorAllOf where
  arbitrary = sized genNonExistingStreamErrorAllOf

genNonExistingStreamErrorAllOf :: Int -> Gen NonExistingStreamErrorAllOf
genNonExistingStreamErrorAllOf n =
  NonExistingStreamErrorAllOf
    <$> arbitraryReducedMaybe n -- nonExistingStreamErrorAllOfResult :: Maybe AnyType
    <*> arbitraryReducedMaybe n -- nonExistingStreamErrorAllOfMsg :: Maybe AnyType
    <*> arbitraryReducedMaybe n -- nonExistingStreamErrorAllOfCode :: Maybe AnyType
    <*> arbitraryReducedMaybe n -- nonExistingStreamErrorAllOfStream :: Maybe Text
  
instance Arbitrary Presence where
  arbitrary = sized genPresence

genPresence :: Int -> Gen Presence
genPresence n =
  Presence
    <$> arbitraryReducedMaybe n -- presenceClient :: Maybe Text
    <*> arbitraryReducedMaybe n -- presenceStatus :: Maybe E'Status
    <*> arbitraryReducedMaybe n -- presenceTimestamp :: Maybe Int
    <*> arbitraryReducedMaybe n -- presencePushable :: Maybe Bool
  
instance Arbitrary RateLimitedError where
  arbitrary = sized genRateLimitedError

genRateLimitedError :: Int -> Gen RateLimitedError
genRateLimitedError n =
  RateLimitedError
    <$> arbitraryReduced n -- rateLimitedErrorResult :: AnyType
    <*> arbitraryReduced n -- rateLimitedErrorMsg :: AnyType
    <*> arbitraryReducedMaybe n -- rateLimitedErrorCode :: Maybe AnyType
  
instance Arbitrary RealmDeactivatedError where
  arbitrary = sized genRealmDeactivatedError

genRealmDeactivatedError :: Int -> Gen RealmDeactivatedError
genRealmDeactivatedError n =
  RealmDeactivatedError
    <$> arbitraryReduced n -- realmDeactivatedErrorResult :: AnyType
    <*> arbitraryReduced n -- realmDeactivatedErrorMsg :: AnyType
    <*> arbitraryReducedMaybe n -- realmDeactivatedErrorCode :: Maybe AnyType
  
instance Arbitrary RealmDomain where
  arbitrary = sized genRealmDomain

genRealmDomain :: Int -> Gen RealmDomain
genRealmDomain n =
  RealmDomain
    <$> arbitraryReducedMaybe n -- realmDomainDomain :: Maybe Text
    <*> arbitraryReducedMaybe n -- realmDomainAllowSubdomains :: Maybe Bool
  
instance Arbitrary RealmEmoji where
  arbitrary = sized genRealmEmoji

genRealmEmoji :: Int -> Gen RealmEmoji
genRealmEmoji n =
  RealmEmoji
    <$> arbitraryReducedMaybe n -- realmEmojiId :: Maybe Text
    <*> arbitraryReducedMaybe n -- realmEmojiName :: Maybe Text
    <*> arbitraryReducedMaybe n -- realmEmojiSourceUrl :: Maybe Text
    <*> arbitraryReducedMaybe n -- realmEmojiDeactivated :: Maybe Bool
    <*> arbitraryReducedMaybe n -- realmEmojiAuthorId :: Maybe Int
  
instance Arbitrary RealmExport where
  arbitrary = sized genRealmExport

genRealmExport :: Int -> Gen RealmExport
genRealmExport n =
  RealmExport
    <$> arbitraryReducedMaybe n -- realmExportId :: Maybe Int
    <*> arbitraryReducedMaybe n -- realmExportActingUserId :: Maybe Int
    <*> arbitraryReducedMaybe n -- realmExportExportTime :: Maybe Double
    <*> arbitraryReducedMaybe n -- realmExportDeletedTimestamp :: Maybe Double
    <*> arbitraryReducedMaybe n -- realmExportFailedTimestamp :: Maybe Double
    <*> arbitraryReducedMaybe n -- realmExportExportUrl :: Maybe Text
    <*> arbitraryReducedMaybe n -- realmExportPending :: Maybe Bool
  
instance Arbitrary RealmPlayground where
  arbitrary = sized genRealmPlayground

genRealmPlayground :: Int -> Gen RealmPlayground
genRealmPlayground n =
  RealmPlayground
    <$> arbitraryReducedMaybe n -- realmPlaygroundId :: Maybe Int
    <*> arbitraryReducedMaybe n -- realmPlaygroundName :: Maybe Text
    <*> arbitraryReducedMaybe n -- realmPlaygroundPygmentsLanguage :: Maybe Text
    <*> arbitraryReducedMaybe n -- realmPlaygroundUrlPrefix :: Maybe Text
  
instance Arbitrary Subscriptions where
  arbitrary = sized genSubscriptions

genSubscriptions :: Int -> Gen Subscriptions
genSubscriptions n =
  Subscriptions
    <$> arbitraryReducedMaybe n -- subscriptionsStreamId :: Maybe Int
    <*> arbitraryReducedMaybe n -- subscriptionsName :: Maybe Text
    <*> arbitraryReducedMaybe n -- subscriptionsDescription :: Maybe Text
    <*> arbitraryReducedMaybe n -- subscriptionsRenderedDescription :: Maybe Text
    <*> arbitraryReducedMaybe n -- subscriptionsDateCreated :: Maybe Int
    <*> arbitraryReducedMaybe n -- subscriptionsInviteOnly :: Maybe Bool
    <*> arbitraryReducedMaybe n -- subscriptionsSubscribers :: Maybe [Int]
    <*> arbitraryReducedMaybe n -- subscriptionsDesktopNotifications :: Maybe Bool
    <*> arbitraryReducedMaybe n -- subscriptionsEmailNotifications :: Maybe Bool
    <*> arbitraryReducedMaybe n -- subscriptionsWildcardMentionsNotify :: Maybe Bool
    <*> arbitraryReducedMaybe n -- subscriptionsPushNotifications :: Maybe Bool
    <*> arbitraryReducedMaybe n -- subscriptionsAudibleNotifications :: Maybe Bool
    <*> arbitraryReducedMaybe n -- subscriptionsPinToTop :: Maybe Bool
    <*> arbitraryReducedMaybe n -- subscriptionsEmailAddress :: Maybe Text
    <*> arbitraryReducedMaybe n -- subscriptionsIsMuted :: Maybe Bool
    <*> arbitraryReducedMaybe n -- subscriptionsInHomeView :: Maybe Bool
    <*> arbitraryReducedMaybe n -- subscriptionsIsAnnouncementOnly :: Maybe Bool
    <*> arbitraryReducedMaybe n -- subscriptionsIsWebPublic :: Maybe Bool
    <*> arbitraryReducedMaybe n -- subscriptionsRole :: Maybe E'Role
    <*> arbitraryReducedMaybe n -- subscriptionsColor :: Maybe Text
    <*> arbitraryReducedMaybe n -- subscriptionsStreamPostPolicy :: Maybe Int
    <*> arbitraryReducedMaybe n -- subscriptionsMessageRetentionDays :: Maybe Int
    <*> arbitraryReducedMaybe n -- subscriptionsHistoryPublicToSubscribers :: Maybe Bool
    <*> arbitraryReducedMaybe n -- subscriptionsFirstMessageId :: Maybe Int
    <*> arbitraryReducedMaybe n -- subscriptionsStreamWeeklyTraffic :: Maybe Int
  
instance Arbitrary User where
  arbitrary = sized genUser

genUser :: Int -> Gen User
genUser n =
  User
    <$> arbitraryReducedMaybe n -- userEmail :: Maybe AnyType
    <*> arbitraryReducedMaybe n -- userIsBot :: Maybe AnyType
    <*> arbitraryReducedMaybe n -- userAvatarUrl :: Maybe AnyType
    <*> arbitraryReducedMaybe n -- userAvatarVersion :: Maybe AnyType
    <*> arbitraryReducedMaybe n -- userFullName :: Maybe AnyType
    <*> arbitraryReducedMaybe n -- userIsAdmin :: Maybe AnyType
    <*> arbitraryReducedMaybe n -- userIsOwner :: Maybe AnyType
    <*> arbitraryReducedMaybe n -- userIsBillingAdmin :: Maybe AnyType
    <*> arbitraryReducedMaybe n -- userRole :: Maybe AnyType
    <*> arbitraryReducedMaybe n -- userBotType :: Maybe AnyType
    <*> arbitraryReducedMaybe n -- userUserId :: Maybe AnyType
    <*> arbitraryReducedMaybe n -- userBotOwnerId :: Maybe AnyType
    <*> arbitraryReducedMaybe n -- userIsActive :: Maybe AnyType
    <*> arbitraryReducedMaybe n -- userIsGuest :: Maybe AnyType
    <*> arbitraryReducedMaybe n -- userTimezone :: Maybe AnyType
    <*> arbitraryReducedMaybe n -- userDateJoined :: Maybe AnyType
    <*> arbitraryReducedMaybe n -- userDeliveryEmail :: Maybe AnyType
    <*> arbitraryReducedMaybe n -- userProfileData :: Maybe AnyType
  
instance Arbitrary UserAllOf where
  arbitrary = sized genUserAllOf

genUserAllOf :: Int -> Gen UserAllOf
genUserAllOf n =
  UserAllOf
    <$> arbitraryReducedMaybe n -- userAllOfEmail :: Maybe AnyType
    <*> arbitraryReducedMaybe n -- userAllOfIsBot :: Maybe AnyType
    <*> arbitraryReducedMaybe n -- userAllOfAvatarUrl :: Maybe AnyType
    <*> arbitraryReducedMaybe n -- userAllOfAvatarVersion :: Maybe AnyType
    <*> arbitraryReducedMaybe n -- userAllOfFullName :: Maybe AnyType
    <*> arbitraryReducedMaybe n -- userAllOfIsAdmin :: Maybe AnyType
    <*> arbitraryReducedMaybe n -- userAllOfIsOwner :: Maybe AnyType
    <*> arbitraryReducedMaybe n -- userAllOfIsBillingAdmin :: Maybe AnyType
    <*> arbitraryReducedMaybe n -- userAllOfRole :: Maybe AnyType
    <*> arbitraryReducedMaybe n -- userAllOfBotType :: Maybe AnyType
    <*> arbitraryReducedMaybe n -- userAllOfUserId :: Maybe AnyType
    <*> arbitraryReducedMaybe n -- userAllOfBotOwnerId :: Maybe AnyType
    <*> arbitraryReducedMaybe n -- userAllOfIsActive :: Maybe AnyType
    <*> arbitraryReducedMaybe n -- userAllOfIsGuest :: Maybe AnyType
    <*> arbitraryReducedMaybe n -- userAllOfTimezone :: Maybe AnyType
    <*> arbitraryReducedMaybe n -- userAllOfDateJoined :: Maybe AnyType
    <*> arbitraryReducedMaybe n -- userAllOfDeliveryEmail :: Maybe AnyType
    <*> arbitraryReducedMaybe n -- userAllOfProfileData :: Maybe AnyType
  
instance Arbitrary UserBase where
  arbitrary = sized genUserBase

genUserBase :: Int -> Gen UserBase
genUserBase n =
  UserBase
    <$> arbitraryReducedMaybe n -- userBaseEmail :: Maybe Text
    <*> arbitraryReducedMaybe n -- userBaseIsBot :: Maybe Bool
    <*> arbitraryReducedMaybe n -- userBaseAvatarUrl :: Maybe Text
    <*> arbitraryReducedMaybe n -- userBaseAvatarVersion :: Maybe Int
    <*> arbitraryReducedMaybe n -- userBaseFullName :: Maybe Text
    <*> arbitraryReducedMaybe n -- userBaseIsAdmin :: Maybe Bool
    <*> arbitraryReducedMaybe n -- userBaseIsOwner :: Maybe Bool
    <*> arbitraryReducedMaybe n -- userBaseIsBillingAdmin :: Maybe Bool
    <*> arbitraryReducedMaybe n -- userBaseRole :: Maybe E'Role2
    <*> arbitraryReducedMaybe n -- userBaseBotType :: Maybe Int
    <*> arbitraryReducedMaybe n -- userBaseUserId :: Maybe Int
    <*> arbitraryReducedMaybe n -- userBaseBotOwnerId :: Maybe Int
    <*> arbitraryReducedMaybe n -- userBaseIsActive :: Maybe Bool
    <*> arbitraryReducedMaybe n -- userBaseIsGuest :: Maybe Bool
    <*> arbitraryReducedMaybe n -- userBaseTimezone :: Maybe Text
    <*> arbitraryReducedMaybe n -- userBaseDateJoined :: Maybe Text
    <*> arbitraryReducedMaybe n -- userBaseDeliveryEmail :: Maybe Text
    <*> arbitraryReducedMaybe n -- userBaseProfileData :: Maybe (Map.Map String A.Value)
  
instance Arbitrary UserDeactivatedError where
  arbitrary = sized genUserDeactivatedError

genUserDeactivatedError :: Int -> Gen UserDeactivatedError
genUserDeactivatedError n =
  UserDeactivatedError
    <$> arbitraryReduced n -- userDeactivatedErrorResult :: AnyType
    <*> arbitraryReduced n -- userDeactivatedErrorMsg :: AnyType
    <*> arbitraryReducedMaybe n -- userDeactivatedErrorCode :: Maybe AnyType
  
instance Arbitrary UserGroup where
  arbitrary = sized genUserGroup

genUserGroup :: Int -> Gen UserGroup
genUserGroup n =
  UserGroup
    <$> arbitraryReducedMaybe n -- userGroupName :: Maybe Text
    <*> arbitraryReducedMaybe n -- userGroupDescription :: Maybe Text
    <*> arbitraryReducedMaybe n -- userGroupMembers :: Maybe [Int]
    <*> arbitraryReducedMaybe n -- userGroupId :: Maybe Int
  
instance Arbitrary UserNotAuthorizedError where
  arbitrary = sized genUserNotAuthorizedError

genUserNotAuthorizedError :: Int -> Gen UserNotAuthorizedError
genUserNotAuthorizedError n =
  UserNotAuthorizedError
    <$> arbitraryReduced n -- userNotAuthorizedErrorResult :: AnyType
    <*> arbitraryReduced n -- userNotAuthorizedErrorMsg :: AnyType
    <*> arbitraryReducedMaybe n -- userNotAuthorizedErrorCode :: Maybe AnyType
  



instance Arbitrary E'DesktopIconCountDisplay where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Op where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Op2 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'PropagateMode where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Result where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Result2 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Role where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Role2 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Status where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Type where
  arbitrary = arbitraryBoundedEnum

