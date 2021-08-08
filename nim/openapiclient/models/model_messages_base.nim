#
# Zulip REST API
# 
# Powerful open source group chat 
# The version of the OpenAPI document: 1.0.0
# 
# Generated by: https://openapi-generator.tech
#

import json
import tables

import model_emoji_reaction
import model_messages_base_topic_links
import model_one_of&lt;string,array&gt;

type MessagesBase* = object
  ## Object containing details of the message. 
  avatarUrl*: string ## The URL of the user's avatar.  Can be null only if client_gravatar was passed, which means that the user has not uploaded an avatar in Zulip, and the client should compute the gravatar URL by hashing the user's email address itself for this user. 
  client*: string ## A Zulip \"client\" string, describing what Zulip client sent the message. 
  content*: string ## The content/body of the message. 
  contentType*: string ## The HTTP `content_type` for the message content.  This will be `text/html` or `text/x-markdown`, depending on whether `apply_markdown` was set. 
  displayRecipient*: oneOf<string,array> ## Data on the recipient of the message; either the name of a stream or a dictionary containing basic data on the users who received the message. 
  id*: int ## The unique message ID.  Messages should always be displayed sorted by ID. 
  isMeMessage*: bool ## Whether the message is a [/me status message][status-messages]  [status-messages]: /help/format-your-message-using-markdown#status-messages 
  reactions*: seq[EmojiReaction] ## Data on any reactions to the message. 
  recipientId*: int ## A unique ID for the set of users receiving the message (either a stream or group of users).  Useful primarily for hashing. 
  senderEmail*: string ## The Zulip display email address of the message's sender. 
  senderFullName*: string ## The full name of the message's sender. 
  senderId*: int ## The user ID of the message's sender. 
  senderRealmStr*: string ## A string identifier for the realm the sender is in.  Unique only within the context of a given Zulip server.  E.g. on `example.zulip.com`, this will be `example`. 
  streamId*: int ## Only present for stream messages; the ID of the stream. 
  subject*: string ## The `topic` of the message.  Currently always `\"\"` for private messages, though this could change if Zulip adds support for topics in private message conversations.  The field name is a legacy holdover from when topics were called \"subjects\" and will eventually change. 
  topicLinks*: seq[MessagesBase_topic_links] ## Data on any links to be included in the `topic` line (these are generated by [custom linkification filters](/help/add-a-custom-linkifier) that match content in the message's topic.)  **Changes**: This field contained a list of urls before   Zulip 4.0 (feature level 46).  New in Zulip 3.0 (feature level 1): Previously, this field was called `subject_links`; clients are recommended to rename `subject_links` to `topic_links` if present for compatibility with older Zulip servers. 
  submessages*: seq[string] ## Data used for certain experimental Zulip integrations. 
  timestamp*: int ## The UNIX timestamp for when the message was sent, in UTC seconds. 
  `type`*: string ## The type of the message: `stream` or `private`. 