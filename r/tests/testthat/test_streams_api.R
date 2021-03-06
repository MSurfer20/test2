# Automatically generated by openapi-generator (https://openapi-generator.tech)
# Please update as you see appropriate

context("Test StreamsApi")

api.instance <- StreamsApi$new()

test_that("ArchiveStream", {
  # tests for ArchiveStream
  # base path: https://example.zulipchat.com/api/v1
  # Archive a stream
  # [Archive the stream](/help/archive-a-stream) with the ID &#x60;stream_id&#x60;.  &#x60;DELETE {{ api_url }}/v1/streams/{stream_id}&#x60; 
  # @param stream.id integer The ID of the stream to access. 
  # @return [JsonSuccess]

  # uncomment below to test the operation
  #expect_equal(result, "EXPECTED_RESULT")
})

test_that("CreateBigBlueButtonVideoCall", {
  # tests for CreateBigBlueButtonVideoCall
  # base path: https://example.zulipchat.com/api/v1
  # Create BigBlueButton video call
  # Create a video call URL for a BigBlueButton video call. Requires BigBlueButton to be configured on the Zulip server. 
  # @return [JsonSuccessBase]

  # uncomment below to test the operation
  #expect_equal(result, "EXPECTED_RESULT")
})

test_that("DeleteTopic", {
  # tests for DeleteTopic
  # base path: https://example.zulipchat.com/api/v1
  # Delete a topic
  # Delete all messages in a topic.  &#x60;POST {{ api_url }}/v1/streams/{stream_id}/delete_topic&#x60;  Topics are a field on messages (not an independent data structure), so deleting all the messages in the topic deletes the topic from Zulip. 
  # @param stream.id integer The ID of the stream to access. 
  # @param topic.name character The name of the topic to delete. 
  # @return [JsonSuccess]

  # uncomment below to test the operation
  #expect_equal(result, "EXPECTED_RESULT")
})

test_that("GetStreamId", {
  # tests for GetStreamId
  # base path: https://example.zulipchat.com/api/v1
  # Get stream ID
  # Get the unique ID of a given stream.  &#x60;GET {{ api_url }}/v1/get_stream_id&#x60; 
  # @param stream character The name of the stream to access. 
  # @return [JsonSuccessBase]

  # uncomment below to test the operation
  #expect_equal(result, "EXPECTED_RESULT")
})

test_that("GetStreamTopics", {
  # tests for GetStreamTopics
  # base path: https://example.zulipchat.com/api/v1
  # Get topics in a stream
  # Get all the topics in a specific stream  &#x60;GET {{ api_url }}/v1/users/me/{stream_id}/topics&#x60; 
  # @param stream.id integer The ID of the stream to access. 
  # @return [JsonSuccessBase]

  # uncomment below to test the operation
  #expect_equal(result, "EXPECTED_RESULT")
})

test_that("GetStreams", {
  # tests for GetStreams
  # base path: https://example.zulipchat.com/api/v1
  # Get all streams
  # Get all streams that the user has access to.  &#x60;GET {{ api_url }}/v1/streams&#x60; 
  # @param include.public character Include all public streams.  (optional)
  # @param include.web.public character Include all web public streams.  (optional)
  # @param include.subscribed character Include all streams that the user is subscribed to.  (optional)
  # @param include.all.active character Include all active streams. The user must have administrative privileges to use this parameter.  (optional)
  # @param include.default character Include all default streams for the user's realm.  (optional)
  # @param include.owner.subscribed character If the user is a bot, include all streams that the bot's owner is subscribed to.  (optional)
  # @return [JsonSuccessBase]

  # uncomment below to test the operation
  #expect_equal(result, "EXPECTED_RESULT")
})

test_that("GetSubscribers", {
  # tests for GetSubscribers
  # base path: https://example.zulipchat.com/api/v1
  # Get the subscribers of a stream
  # Get all users subscribed to a stream.  &#x60;Get {{ api_url }}/v1/streams/{stream_id}/members&#x60; 
  # @param stream.id integer The ID of the stream to access. 
  # @return [JsonSuccessBase]

  # uncomment below to test the operation
  #expect_equal(result, "EXPECTED_RESULT")
})

test_that("GetSubscriptionStatus", {
  # tests for GetSubscriptionStatus
  # base path: https://example.zulipchat.com/api/v1
  # Get subscription status
  # Check whether a user is subscribed to a stream.  &#x60;GET {{ api_url }}/v1/users/{user_id}/subscriptions/{stream_id}&#x60;  **Changes**: New in Zulip 3.0 (feature level 11). 
  # @param user.id integer The target user's ID. 
  # @param stream.id integer The ID of the stream to access. 
  # @return [JsonSuccessBase]

  # uncomment below to test the operation
  #expect_equal(result, "EXPECTED_RESULT")
})

test_that("GetSubscriptions", {
  # tests for GetSubscriptions
  # base path: https://example.zulipchat.com/api/v1
  # Get subscribed streams
  # Get all streams that the user is subscribed to.  &#x60;GET {{ api_url }}/v1/users/me/subscriptions&#x60; 
  # @param include.subscribers character Whether each returned stream object should include a `subscribers` field containing a list of the user IDs of its subscribers.  (This may be significantly slower in organizations with thousands of users subscribed to many streams.)  **Changes**: New in Zulip 2.1.0.  (optional)
  # @return [JsonSuccessBase]

  # uncomment below to test the operation
  #expect_equal(result, "EXPECTED_RESULT")
})

test_that("MuteTopic", {
  # tests for MuteTopic
  # base path: https://example.zulipchat.com/api/v1
  # Topic muting
  # This endpoint mutes/unmutes a topic within a stream that the current user is subscribed to.  Muted topics are displayed faded in the Zulip UI, and are not included in the user&#39;s unread count totals.  &#x60;PATCH {{ api_url }}/v1/users/me/subscriptions/muted_topics&#x60; 
  # @param topic character The topic to (un)mute. Note that the request will succeed regardless of whether any messages have been sent to the specified topic. 
  # @param op character Whether to mute (`add`) or unmute (`remove`) the provided topic. 
  # @param stream character The name of the stream to access.  (optional)
  # @param stream.id integer The ID of the stream to access.  (optional)
  # @return [JsonSuccess]

  # uncomment below to test the operation
  #expect_equal(result, "EXPECTED_RESULT")
})

test_that("Subscribe", {
  # tests for Subscribe
  # base path: https://example.zulipchat.com/api/v1
  # Subscribe to a stream
  # Subscribe one or more users to one or more streams.  &#x60;POST {{ api_url }}/v1/users/me/subscriptions&#x60;  If any of the specified streams do not exist, they are automatically created.  The initial [stream settings](/api/update-stream) will be determined by the optional parameters like &#x60;invite_only&#x60; detailed below. 
  # @param subscriptions array[object] A list of dictionaries containing the key `name` and value specifying the name of the stream to subscribe. If the stream does not exist a new stream is created. The description of the stream created can be specified by setting the dictionary key `description` with an appropriate value. 
  # @param principals array[OneOfstringinteger] A list of user ids (preferred) or Zulip display email addresses of the users to be subscribed to or unsubscribed from the streams specified in the `subscriptions` parameter. If not provided, then the requesting user/bot is subscribed.  **Changes**: The integer format is new in Zulip 3.0 (feature level 9).  (optional)
  # @param authorization.errors.fatal character A boolean specifying whether authorization errors (such as when the requesting user is not authorized to access a private stream) should be considered fatal or not. When `True`, an authorization error is reported as such. When set to `False`, the response will be a 200 and any streams where the request encountered an authorization error will be listed in the `unauthorized` key.  (optional)
  # @param announce character If one of the streams specified did not exist previously and is thus craeted by this call, this determines whether [notification bot](/help/configure-notification-bot) will send an announcement about the new stream's creation.  (optional)
  # @param invite.only character As described above, this endpoint will create a new stream if passed a stream name that doesn't already exist.  This parameters and the ones that follow are used to request an initial configuration of a created stream; they are ignored for streams that already exist.  This parameter determines whether any newly created streams will be private streams.  (optional)
  # @param history.public.to.subscribers character Whether the stream's message history should be available to newly subscribed members, or users can only access messages they actually received while subscribed to the stream.  Corresponds to the [shared history](/help/stream-permissions) option in documentation.  (optional)
  # @param stream.post.policy integer Policy for which users can post messages to the stream.  * 1 => Any user can post. * 2 => Only administrators can post. * 3 => Only full members can post. * 4 => Only moderators can post.  **Changes**: New in Zulip 3.0, replacing the previous `is_announcement_only` boolean.  (optional)
  # @param message.retention.days OneOfstringinteger Number of days that messages sent to this stream will be stored before being automatically deleted by the [message retention policy](/help/message-retention-policy).  Two special string format values are supported:  * \"realm_default\" => Return to the organization-level setting. * \"forever\" => Retain messages forever.  **Changes**: New in Zulip 3.0 (feature level 17).  (optional)
  # @return [OneOfobjectobject]

  # uncomment below to test the operation
  #expect_equal(result, "EXPECTED_RESULT")
})

test_that("Unsubscribe", {
  # tests for Unsubscribe
  # base path: https://example.zulipchat.com/api/v1
  # Unsubscribe from a stream
  # Unsubscribe yourself or other users from one or more streams.  &#x60;DELETE {{ api_url }}/v1/users/me/subscriptions&#x60; 
  # @param subscriptions array[character] A list of stream names to unsubscribe from. This parameter is called `streams` in our Python API. 
  # @param principals array[OneOfstringinteger] A list of user ids (preferred) or Zulip display email addresses of the users to be subscribed to or unsubscribed from the streams specified in the `subscriptions` parameter. If not provided, then the requesting user/bot is subscribed.  **Changes**: The integer format is new in Zulip 3.0 (feature level 9).  (optional)
  # @return [JsonSuccessBase]

  # uncomment below to test the operation
  #expect_equal(result, "EXPECTED_RESULT")
})

test_that("UpdateStream", {
  # tests for UpdateStream
  # base path: https://example.zulipchat.com/api/v1
  # Update a stream
  # Configure the stream with the ID &#x60;stream_id&#x60;.  This endpoint supports an organization administrator editing any property of a stream, including:  * Stream [name](/help/rename-a-stream) and [description](/help/change-the-stream-description) * Stream [permissions](/help/stream-permissions), including [privacy](/help/change-the-privacy-of-a-stream) and [who can send](/help/stream-sending-policy).  &#x60;PATCH {{ api_url }}/v1/streams/{stream_id}&#x60; 
  # @param stream.id integer The ID of the stream to access. 
  # @param description character The new description for the stream. Limited Zulip markdown is allowed in this field.  **Changes**: Removed unnecessary JSON-encoding of this parameter in Zulip 4.0 (feature level 64).  (optional)
  # @param new.name character The new name for the stream.  **Changes**: Removed unnecessary JSON-encoding of this parameter in Zulip 4.0 (feature level 64).  (optional)
  # @param is.private character Change whether the stream is a private stream.  (optional)
  # @param is.announcement.only character Whether the stream is limited to announcements.  **Changes**: Deprecated in Zulip 3.0 (feature level 1), use   `stream_post_policy` instead.  (optional)
  # @param stream.post.policy integer Policy for which users can post messages to the stream.  * 1 => Any user can post. * 2 => Only administrators can post. * 3 => Only full members can post. * 4 => Only moderators can post.  **Changes**: New in Zulip 3.0, replacing the previous `is_announcement_only` boolean.  (optional)
  # @param history.public.to.subscribers character Whether the stream's message history should be available to newly subscribed members, or users can only access messages they actually received while subscribed to the stream.  Corresponds to the [shared history](/help/stream-permissions) option in documentation.  (optional)
  # @param message.retention.days OneOfstringinteger Number of days that messages sent to this stream will be stored before being automatically deleted by the [message retention policy](/help/message-retention-policy).  Two special string format values are supported:  * \"realm_default\" => Return to the organization-level setting. * \"forever\" => Retain messages forever.  **Changes**: New in Zulip 3.0 (feature level 17).  (optional)
  # @return [JsonSuccess]

  # uncomment below to test the operation
  #expect_equal(result, "EXPECTED_RESULT")
})

test_that("UpdateSubscriptionSettings", {
  # tests for UpdateSubscriptionSettings
  # base path: https://example.zulipchat.com/api/v1
  # Update subscription settings
  # This endpoint is used to update the user&#39;s personal settings for the streams they are subscribed to, including muting, color, pinning, and per-stream notification settings.  &#x60;POST {{ api_url }}/v1/users/me/subscriptions/properties&#x60; 
  # @param subscription.data array[object] A list of objects that describe the changes that should be applied in each subscription. Each object represents a subscription, and must have a `stream_id` key that identifies the stream, as well as the `property` being modified and its new `value`.  The possible values for each `property` and `value` pairs are:  * `color` (string): the hex value of the user's display color for the stream. * `is_muted` (boolean): whether the stream is   [muted](/help/mute-a-stream).  Prior to Zulip 2.1, this feature was   represented by the more confusingly named `in_home_view` (with the   opposite value, `in_home_view=!is_muted`); for   backwards-compatibility, modern Zulip still accepts that value. * `pin_to_top` (boolean): whether to pin the stream at the top of the stream list. * `desktop_notifications` (boolean): whether to show desktop notifications     for all messages sent to the stream. * `audible_notifications` (boolean): whether to play a sound   notification for all messages sent to the stream. * `push_notifications` (boolean): whether to trigger a mobile push     notification for all messages sent to the stream. * `email_notifications` (boolean): whether to trigger an email     notification for all messages sent to the stream. 
  # @return [JsonSuccessBase]

  # uncomment below to test the operation
  #expect_equal(result, "EXPECTED_RESULT")
})

test_that("UpdateSubscriptions", {
  # tests for UpdateSubscriptions
  # base path: https://example.zulipchat.com/api/v1
  # Update subscriptions
  # Update which streams you are are subscribed to. 
  # @param delete array[character] A list of stream names to unsubscribe from.  (optional)
  # @param add array[object] A list of objects describing which streams to subscribe to, optionally including per-user subscription parameters (e.g. color) and if the stream is to be created, its description.  (optional)
  # @return [JsonSuccessBase]

  # uncomment below to test the operation
  #expect_equal(result, "EXPECTED_RESULT")
})

