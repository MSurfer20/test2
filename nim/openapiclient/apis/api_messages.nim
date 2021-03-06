#
# Zulip REST API
# 
# Powerful open source group chat 
# The version of the OpenAPI document: 1.0.0
# 
# Generated by: https://openapi-generator.tech
#

import httpclient
import json
import logging
import marshal
import options
import strformat
import strutils
import tables
import typetraits
import uri

import ../models/model_any_type
import ../models/model_coded_error
import ../models/model_invalid_message_error
import ../models/model_json_success
import ../models/model_json_success_base
import ../models/model_object
import ../models/model_one_of&lt;object,object&gt;
import ../models/model_one_of&lt;string,integer&gt;

const basepath = "https://example.zulipchat.com/api/v1"

template constructResult[T](response: Response): untyped =
  if response.code in {Http200, Http201, Http202, Http204, Http206}:
    try:
      when name(stripGenericParams(T.typedesc).typedesc) == name(Table):
        (some(json.to(parseJson(response.body), T.typedesc)), response)
      else:
        (some(marshal.to[T](response.body)), response)
    except JsonParsingError:
      # The server returned a malformed response though the response code is 2XX
      # TODO: need better error handling
      error("JsonParsingError")
      (none(T.typedesc), response)
  else:
    (none(T.typedesc), response)


proc addReaction*(httpClient: HttpClient, messageId: int, emojiName: string, emojiCode: string, reactionType: string): (Option[JsonSuccess], Response) =
  ## Add an emoji reaction
  let query_for_api_call = encodeQuery([
    ("emoji_name", $emojiName), # The target emoji's human-readable name.  To find an emoji's name, hover over a message to reveal three icons on the right, then click the smiley face icon. Images of available reaction emojis appear. Hover over the emoji you want, and note that emoji's text name. 
    ("emoji_code", $emojiCode), # A unique identifier, defining the specific emoji codepoint requested, within the namespace of the `reaction_type`.  For most API clients, you won't need this, but it's important for Zulip apps to handle rare corner cases when adding/removing votes on an emoji reaction added previously by another user.  If the existing reaction was added when the Zulip server was using a previous version of the emoji data mapping between Unicode codepoints and human-readable names, sending the `emoji_code` in the data for the original reaction allows the Zulip server to correctly interpret your upvote as an upvote rather than a reaction with a \"diffenent\" emoji. 
    ("reaction_type", $reactionType), # If an app is adding/removing a vote on an existing reaction, it should pass this parameter using the value the server provided for the existing reaction for specificity.  Supported values:  * `unicode_emoji`: Unicode emoji (`emoji_code` will be its Unicode codepoint). * `realm_emoji`: Custom emoji. (`emoji_code` will be its ID). * `zulip_extra_emoji`: Special emoji included with Zulip.  Exists to    namespace the `zulip` emoji.  **Changes**: In Zulip 3.0 (feature level 2), this become optional for [custom emoji](/help/add-custom-emoji); previously, this endpoint assumed `unicode_emoji` if this parameter was not specified. 
  ])

  let response = httpClient.post(basepath & fmt"/messages/{message_id}/reactions" & "?" & query_for_api_call)
  constructResult[JsonSuccess](response)


proc checkMessagesMatchNarrow*(httpClient: HttpClient, msgIds: seq[int], narrow: seq[object]): (Option[AnyType], Response) =
  ## Check if messages match a narrow
  let query_for_api_call = encodeQuery([
    ("msg_ids", $msgIds.join(",")), # List of IDs for the messages to check.
    ("narrow", $narrow.join(",")), # A structure defining the narrow to check against. See how to [construct a narrow](/api/construct-narrow).
  ])

  let response = httpClient.get(basepath & "/messages/matches_narrow" & "?" & query_for_api_call)
  constructResult[AnyType](response)


proc deleteMessage*(httpClient: HttpClient, messageId: int): (Option[JsonSuccess], Response) =
  ## Delete a message

  let response = httpClient.delete(basepath & fmt"/messages/{message_id}")
  constructResult[JsonSuccess](response)


proc getFileTemporaryUrl*(httpClient: HttpClient, realmIdStr: int, filename: string): (Option[JsonSuccessBase], Response) =
  ## Get public temporary URL

  let response = httpClient.get(basepath & fmt"/user_uploads/{realm_id_str}/{filename}")
  constructResult[JsonSuccessBase](response)


proc getMessageHistory*(httpClient: HttpClient, messageId: int): (Option[JsonSuccessBase], Response) =
  ## Get a message's edit history

  let response = httpClient.get(basepath & fmt"/messages/{message_id}/history")
  constructResult[JsonSuccessBase](response)


proc getMessages*(httpClient: HttpClient, numBefore: int, numAfter: int, anchor: oneOf<string,integer>, narrow: seq[object], clientGravatar: bool, applyMarkdown: bool, useFirstUnreadAnchor: bool): (Option[JsonSuccessBase], Response) =
  ## Get messages
  let query_for_api_call = encodeQuery([
    ("anchor", $anchor), # Integer message ID to anchor fetching of new messages. Supports special string values for when the client wants the server to compute the anchor to use:  * `newest`: The most recent message. * `oldest`: The oldest message. * `first_unread`: The oldest unread message matching the   query, if any; otherwise, the most recent message.  The special values of `'newest'` and `'oldest'` are also supported for anchoring the query at the most recent or oldest messages.  **Changes**: String values are new in Zulip 3.0 (feature level 1).  The   `first_unread` functionality was supported in Zulip 2.1.x   and older by not sending anchor and using use_first_unread_anchor.    In Zulip 2.1.x and older, `oldest` can be emulated with   `anchor=0`, and `newest` with `anchor=10000000000000000`   (that specific large value works around a bug in Zulip   2.1.x and older in the `found_newest` return value). 
    ("num_before", $numBefore), # The number of messages with IDs less than the anchor to retrieve. 
    ("num_after", $numAfter), # The number of messages with IDs greater than the anchor to retrieve. 
    ("narrow", $narrow.join(",")), # The narrow where you want to fetch the messages from. See how to [construct a narrow](/api/construct-narrow). 
    ("client_gravatar", $clientGravatar), # Whether the client supports computing gravatars URLs.  If enabled, `avatar_url` will be included in the response only if there is a Zulip avatar, and will be `null` for users who are using gravatar as their avatar.  This option significantly reduces the compressed size of user data, since gravatar URLs are long, random strings and thus do not compress well. The `client_gravatar` field is set to `true` if clients can compute their own gravatars. 
    ("apply_markdown", $applyMarkdown), # If `true`, message content is returned in the rendered HTML format. If `false`, message content is returned in the raw Markdown-format text that user entered. 
    ("use_first_unread_anchor", $useFirstUnreadAnchor), # Legacy way to specify `anchor=\"first_unread\"` in Zulip 2.1.x and older.  Whether to use the (computed by the server) first unread message matching the narrow as the `anchor`.  Mutually exclusive with `anchor`.  **Changes**: Deprecated in Zulip 3.0, replaced by `anchor=\"first_unread\"` instead. 
  ])

  let response = httpClient.get(basepath & "/messages" & "?" & query_for_api_call)
  constructResult[JsonSuccessBase](response)


proc getRawMessage*(httpClient: HttpClient, messageId: int): (Option[JsonSuccessBase], Response) =
  ## Get a message's raw Markdown

  let response = httpClient.get(basepath & fmt"/messages/{message_id}")
  constructResult[JsonSuccessBase](response)


proc markAllAsRead*(httpClient: HttpClient): (Option[JsonSuccess], Response) =
  ## Mark all messages as read

  let response = httpClient.post(basepath & "/mark_all_as_read")
  constructResult[JsonSuccess](response)


proc markStreamAsRead*(httpClient: HttpClient, streamId: int): (Option[JsonSuccess], Response) =
  ## Mark messages in a stream as read
  let query_for_api_call = encodeQuery([
    ("stream_id", $streamId), # The ID of the stream to access. 
  ])

  let response = httpClient.post(basepath & "/mark_stream_as_read" & "?" & query_for_api_call)
  constructResult[JsonSuccess](response)


proc markTopicAsRead*(httpClient: HttpClient, streamId: int, topicName: string): (Option[JsonSuccess], Response) =
  ## Mark messages in a topic as read
  let query_for_api_call = encodeQuery([
    ("stream_id", $streamId), # The ID of the stream to access. 
    ("topic_name", $topicName), # The name of the topic whose messages should be marked as read. 
  ])

  let response = httpClient.post(basepath & "/mark_topic_as_read" & "?" & query_for_api_call)
  constructResult[JsonSuccess](response)


proc removeReaction*(httpClient: HttpClient, messageId: int, emojiName: string, emojiCode: string, reactionType: string): (Option[JsonSuccess], Response) =
  ## Remove an emoji reaction
  let query_for_api_call = encodeQuery([
    ("emoji_name", $emojiName), # The target emoji's human-readable name.  To find an emoji's name, hover over a message to reveal three icons on the right, then click the smiley face icon. Images of available reaction emojis appear. Hover over the emoji you want, and note that emoji's text name. 
    ("emoji_code", $emojiCode), # A unique identifier, defining the specific emoji codepoint requested, within the namespace of the `reaction_type`.  For most API clients, you won't need this, but it's important for Zulip apps to handle rare corner cases when adding/removing votes on an emoji reaction added previously by another user.  If the existing reaction was added when the Zulip server was using a previous version of the emoji data mapping between Unicode codepoints and human-readable names, sending the `emoji_code` in the data for the original reaction allows the Zulip server to correctly interpret your upvote as an upvote rather than a reaction with a \"diffenent\" emoji. 
    ("reaction_type", $reactionType), # If an app is adding/removing a vote on an existing reaction, it should pass this parameter using the value the server provided for the existing reaction for specificity.  Supported values:  * `unicode_emoji`: Unicode emoji (`emoji_code` will be its Unicode codepoint). * `realm_emoji`: Custom emoji. (`emoji_code` will be its ID). * `zulip_extra_emoji`: Special emoji included with Zulip.  Exists to    namespace the `zulip` emoji.  **Changes**: In Zulip 3.0 (feature level 2), this become optional for [custom emoji](/help/add-custom-emoji); previously, this endpoint assumed `unicode_emoji` if this parameter was not specified. 
  ])

  let response = httpClient.delete(basepath & fmt"/messages/{message_id}/reactions" & "?" & query_for_api_call)
  constructResult[JsonSuccess](response)


proc renderMessage*(httpClient: HttpClient, content: string): (Option[JsonSuccessBase], Response) =
  ## Render message
  let query_for_api_call = encodeQuery([
    ("content", $content), # The content of the message. Maximum message size of 10000 bytes. 
  ])

  let response = httpClient.post(basepath & "/messages/render" & "?" & query_for_api_call)
  constructResult[JsonSuccessBase](response)


proc sendMessage*(httpClient: HttpClient, `type`: string, to: seq[int], content: string, topic: string, queueId: string, localId: string): (Option[JsonSuccessBase], Response) =
  ## Send a message
  let query_for_api_call = encodeQuery([
    ("type", $`type`), # The type of message to be sent. `private` for a private message and `stream` for a stream message. 
    ("to", $to.join(",")), # For stream messages, either the name or integer ID of the stream. For private messages, either a list containing integer user IDs or a list containing string email addresses.  **Changes**: Support for using user/stream IDs was added in Zulip 2.0.0. 
    ("content", $content), # The content of the message. Maximum message size of 10000 bytes. 
    ("topic", $topic), # The topic of the message. Only required for stream messages (`type=\"stream\"`), ignored otherwise.  Maximum length of 60 characters.  **Changes**: New in Zulip 2.0.  Previous Zulip releases encoded this as `subject`, which is currently a deprecated alias. 
    ("queue_id", $queueId), # For clients supporting [local echo](https://zulip.readthedocs.io/en/latest/subsystems/sending-messages.html#local-echo), the [event queue](/api/register-queue) ID for the client.  If passed, `local_id` is required.  If the message is successfully sent, the server will include `local_id` in the `message` event that the client with this `queue_id` will receive notifying it of the new message via [`GET /events`](/api/get-events).  This lets the client know unambiguously that it should replace the locally echoed message, rather than adding this new message (which would be correct if the user had sent the new message from another device). 
    ("local_id", $localId), # For clients supporting local echo, a unique string-format identifier chosen freely by the client; the server will pass it back to the client without inspecting it, as described in the `queue_id` description. 
  ])

  let response = httpClient.post(basepath & "/messages" & "?" & query_for_api_call)
  constructResult[JsonSuccessBase](response)


proc updateMessage*(httpClient: HttpClient, messageId: int, topic: string, propagateMode: string, sendNotificationToOldThread: bool, sendNotificationToNewThread: bool, content: string, streamId: int): (Option[JsonSuccess], Response) =
  ## Edit a message
  let query_for_api_call = encodeQuery([
    ("topic", $topic), # The topic to move the message(s) to, to request changing the topic. Should only be sent when changing the topic, and will throw an error if the target message is not a stream message.  Maximum length of 60 characters.  **Changes**: New in Zulip 2.0.  Previous Zulip releases encoded this as `subject`, which is currently a deprecated alias. 
    ("propagate_mode", $propagateMode), # Which message(s) should be edited: just the one indicated in `message_id`, messages in the same topic that had been sent after this one, or all of them.  Only the default value of `change_one` is valid when editing only the content of a message.  This parameter determines both which messages get moved and also whether clients that are currently narrowed to the topic containing the message should navigate or adjust their compose box recipient to point to the post-edit stream/topic. 
    ("send_notification_to_old_thread", $sendNotificationToOldThread), # Whether to send breadcrumb message to the old thread to notify users where the messages were moved to.  **Changes**: New in Zulip 3.0 (feature level 9). 
    ("send_notification_to_new_thread", $sendNotificationToNewThread), # Whether to send a notification message to the new thread to notify users where the messages came from.  **Changes**: New in Zulip 3.0 (feature level 9). 
    ("content", $content), # The content of the message. Maximum message size of 10000 bytes. 
    ("stream_id", $streamId), # The stream ID to move the message(s) to, to request moving messages to another stream.  Should only be sent when changing the stream, and will throw an error if the target message is not a stream message. 
  ])

  let response = httpClient.patch(basepath & fmt"/messages/{message_id}" & "?" & query_for_api_call)
  constructResult[JsonSuccess](response)


proc updateMessageFlags*(httpClient: HttpClient, messages: seq[int], op: string, flag: string): (Option[JsonSuccessBase], Response) =
  ## Update personal message flags
  let query_for_api_call = encodeQuery([
    ("messages", $messages.join(",")), # An array containing the IDs of the target messages. 
    ("op", $op), # Whether to `add` the flag or `remove` it. 
    ("flag", $flag), # The flag that should be added/removed. 
  ])

  let response = httpClient.post(basepath & "/messages/flags" & "?" & query_for_api_call)
  constructResult[JsonSuccessBase](response)


proc uploadFile*(httpClient: HttpClient, filename: string): (Option[JsonSuccessBase], Response) =
  ## Upload a file
  httpClient.headers["Content-Type"] = "multipart/form-data"
  let query_for_api_call = newMultipartData({
    "filename": $filename, # 
  })

  let response = httpClient.post(basepath & "/user_uploads", multipart=query_for_api_call)
  constructResult[JsonSuccessBase](response)

