# #Zulip REST API
#
##Powerful open source group chat 
#
#The version of the OpenAPI document: 1.0.0
#
#Generated by: https://openapi-generator.tech
#OpenAPI Generator version: 5.2.0
#

require "../spec_helper"
require "json"
require "time"

# Unit tests for ::StreamsApi
# Automatically generated by openapi-generator (https://openapi-generator.tech)
# Please update as you see appropriate
describe "StreamsApi" do
  describe "test an instance of StreamsApi" do
    it "should create an instance of StreamsApi" do
      api_instance = ::StreamsApi.new
      # TODO expect(api_instance).to be_instance_of(::StreamsApi)
    end
  end

  # unit tests for archive_stream
  # Archive a stream
  # [Archive the stream](/help/archive-a-stream) with the ID &#x60;stream_id&#x60;.  &#x60;DELETE {{ api_url }}/v1/streams/{stream_id}&#x60; 
  # @param stream_id The ID of the stream to access. 
  # @param [Hash] opts the optional parameters
  # @return [JsonSuccess]
  describe "archive_stream test" do
    it "should work" do
      # assertion here. ref: https://crystal-lang.org/reference/guides/testing.html
    end
  end

  # unit tests for create_big_blue_button_video_call
  # Create BigBlueButton video call
  # Create a video call URL for a BigBlueButton video call. Requires BigBlueButton to be configured on the Zulip server. 
  # @param [Hash] opts the optional parameters
  # @return [JsonSuccessBase]
  describe "create_big_blue_button_video_call test" do
    it "should work" do
      # assertion here. ref: https://crystal-lang.org/reference/guides/testing.html
    end
  end

  # unit tests for get_stream_id
  # Get stream ID
  # Get the unique ID of a given stream.  &#x60;GET {{ api_url }}/v1/get_stream_id&#x60; 
  # @param stream The name of the stream to access. 
  # @param [Hash] opts the optional parameters
  # @return [JsonSuccessBase]
  describe "get_stream_id test" do
    it "should work" do
      # assertion here. ref: https://crystal-lang.org/reference/guides/testing.html
    end
  end

  # unit tests for get_stream_topics
  # Get topics in a stream
  # Get all the topics in a specific stream  &#x60;GET {{ api_url }}/v1/users/me/{stream_id}/topics&#x60; 
  # @param stream_id The ID of the stream to access. 
  # @param [Hash] opts the optional parameters
  # @return [JsonSuccessBase]
  describe "get_stream_topics test" do
    it "should work" do
      # assertion here. ref: https://crystal-lang.org/reference/guides/testing.html
    end
  end

  # unit tests for get_streams
  # Get all streams
  # Get all streams that the user has access to.  &#x60;GET {{ api_url }}/v1/streams&#x60; 
  # @param [Hash] opts the optional parameters
  # @option opts [Bool] :include_public Include all public streams. 
  # @option opts [Bool] :include_web_public Include all web public streams. 
  # @option opts [Bool] :include_subscribed Include all streams that the user is subscribed to. 
  # @option opts [Bool] :include_all_active Include all active streams. The user must have administrative privileges to use this parameter. 
  # @option opts [Bool] :include_default Include all default streams for the user&#39;s realm. 
  # @option opts [Bool] :include_owner_subscribed If the user is a bot, include all streams that the bot&#39;s owner is subscribed to. 
  # @return [JsonSuccessBase]
  describe "get_streams test" do
    it "should work" do
      # assertion here. ref: https://crystal-lang.org/reference/guides/testing.html
    end
  end

  # unit tests for get_subscription_status
  # Get subscription status
  # Check whether a user is subscribed to a stream.  &#x60;GET {{ api_url }}/v1/users/{user_id}/subscriptions/{stream_id}&#x60;  **Changes**: New in Zulip 3.0 (feature level 11). 
  # @param user_id The target user&#39;s ID. 
  # @param stream_id The ID of the stream to access. 
  # @param [Hash] opts the optional parameters
  # @return [JsonSuccessBase]
  describe "get_subscription_status test" do
    it "should work" do
      # assertion here. ref: https://crystal-lang.org/reference/guides/testing.html
    end
  end

  # unit tests for get_subscriptions
  # Get subscribed streams
  # Get all streams that the user is subscribed to.  &#x60;GET {{ api_url }}/v1/users/me/subscriptions&#x60; 
  # @param [Hash] opts the optional parameters
  # @option opts [Bool] :include_subscribers Whether each returned stream object should include a &#x60;subscribers&#x60; field containing a list of the user IDs of its subscribers.  (This may be significantly slower in organizations with thousands of users subscribed to many streams.)  **Changes**: New in Zulip 2.1.0. 
  # @return [JsonSuccessBase]
  describe "get_subscriptions test" do
    it "should work" do
      # assertion here. ref: https://crystal-lang.org/reference/guides/testing.html
    end
  end

  # unit tests for mute_topic
  # Topic muting
  # This endpoint mutes/unmutes a topic within a stream that the current user is subscribed to.  Muted topics are displayed faded in the Zulip UI, and are not included in the user&#39;s unread count totals.  &#x60;PATCH {{ api_url }}/v1/users/me/subscriptions/muted_topics&#x60; 
  # @param topic The topic to (un)mute. Note that the request will succeed regardless of whether any messages have been sent to the specified topic. 
  # @param op Whether to mute (&#x60;add&#x60;) or unmute (&#x60;remove&#x60;) the provided topic. 
  # @param [Hash] opts the optional parameters
  # @option opts [String] :stream The name of the stream to access. 
  # @option opts [Int32] :stream_id The ID of the stream to access. 
  # @return [JsonSuccess]
  describe "mute_topic test" do
    it "should work" do
      # assertion here. ref: https://crystal-lang.org/reference/guides/testing.html
    end
  end

  # unit tests for subscribe
  # Subscribe to a stream
  # Subscribe one or more users to one or more streams.  &#x60;POST {{ api_url }}/v1/users/me/subscriptions&#x60;  If any of the specified streams do not exist, they are automatically created.  The initial [stream settings](/api/update-stream) will be determined by the optional parameters like &#x60;invite_only&#x60; detailed below. 
  # @param subscriptions A list of dictionaries containing the key &#x60;name&#x60; and value specifying the name of the stream to subscribe. If the stream does not exist a new stream is created. The description of the stream created can be specified by setting the dictionary key &#x60;description&#x60; with an appropriate value. 
  # @param [Hash] opts the optional parameters
  # @option opts [Array(OneOfstringinteger)] :principals A list of user ids (preferred) or Zulip display email addresses of the users to be subscribed to or unsubscribed from the streams specified in the &#x60;subscriptions&#x60; parameter. If not provided, then the requesting user/bot is subscribed.  **Changes**: The integer format is new in Zulip 3.0 (feature level 9). 
  # @option opts [Bool] :authorization_errors_fatal A boolean specifying whether authorization errors (such as when the requesting user is not authorized to access a private stream) should be considered fatal or not. When &#x60;True&#x60;, an authorization error is reported as such. When set to &#x60;False&#x60;, the response will be a 200 and any streams where the request encountered an authorization error will be listed in the &#x60;unauthorized&#x60; key. 
  # @option opts [Bool] :announce If one of the streams specified did not exist previously and is thus craeted by this call, this determines whether [notification bot](/help/configure-notification-bot) will send an announcement about the new stream&#39;s creation. 
  # @option opts [Bool] :invite_only As described above, this endpoint will create a new stream if passed a stream name that doesn&#39;t already exist.  This parameters and the ones that follow are used to request an initial configuration of a created stream; they are ignored for streams that already exist.  This parameter determines whether any newly created streams will be private streams. 
  # @option opts [Bool] :history_public_to_subscribers Whether the stream&#39;s message history should be available to newly subscribed members, or users can only access messages they actually received while subscribed to the stream.  Corresponds to the [shared history](/help/stream-permissions) option in documentation. 
  # @option opts [Int32] :stream_post_policy Policy for which users can post messages to the stream.  * 1 &#x3D;&gt; Any user can post. * 2 &#x3D;&gt; Only administrators can post. * 3 &#x3D;&gt; Only full members can post. * 4 &#x3D;&gt; Only moderators can post.  **Changes**: New in Zulip 3.0, replacing the previous &#x60;is_announcement_only&#x60; boolean. 
  # @option opts [OneOfstringinteger] :message_retention_days Number of days that messages sent to this stream will be stored before being automatically deleted by the [message retention policy](/help/message-retention-policy).  Two special string format values are supported:  * \&quot;realm_default\&quot; &#x3D;&gt; Return to the organization-level setting. * \&quot;forever\&quot; &#x3D;&gt; Retain messages forever.  **Changes**: New in Zulip 3.0 (feature level 17). 
  # @return [OneOfobjectobject]
  describe "subscribe test" do
    it "should work" do
      # assertion here. ref: https://crystal-lang.org/reference/guides/testing.html
    end
  end

  # unit tests for unsubscribe
  # Unsubscribe from a stream
  # Unsubscribe yourself or other users from one or more streams.  &#x60;DELETE {{ api_url }}/v1/users/me/subscriptions&#x60; 
  # @param subscriptions A list of stream names to unsubscribe from. This parameter is called &#x60;streams&#x60; in our Python API. 
  # @param [Hash] opts the optional parameters
  # @option opts [Array(OneOfstringinteger)] :principals A list of user ids (preferred) or Zulip display email addresses of the users to be subscribed to or unsubscribed from the streams specified in the &#x60;subscriptions&#x60; parameter. If not provided, then the requesting user/bot is subscribed.  **Changes**: The integer format is new in Zulip 3.0 (feature level 9). 
  # @return [JsonSuccessBase]
  describe "unsubscribe test" do
    it "should work" do
      # assertion here. ref: https://crystal-lang.org/reference/guides/testing.html
    end
  end

  # unit tests for update_stream
  # Update a stream
  # Configure the stream with the ID &#x60;stream_id&#x60;.  This endpoint supports an organization administrator editing any property of a stream, including:  * Stream [name](/help/rename-a-stream) and [description](/help/change-the-stream-description) * Stream [permissions](/help/stream-permissions), including [privacy](/help/change-the-privacy-of-a-stream) and [who can send](/help/stream-sending-policy).  &#x60;PATCH {{ api_url }}/v1/streams/{stream_id}&#x60; 
  # @param stream_id The ID of the stream to access. 
  # @param [Hash] opts the optional parameters
  # @option opts [String] :description The new description for the stream. Limited Zulip markdown is allowed in this field.  **Changes**: Removed unnecessary JSON-encoding of this parameter in Zulip 4.0 (feature level 64). 
  # @option opts [String] :new_name The new name for the stream.  **Changes**: Removed unnecessary JSON-encoding of this parameter in Zulip 4.0 (feature level 64). 
  # @option opts [Bool] :is_private Change whether the stream is a private stream. 
  # @option opts [Bool] :is_announcement_only Whether the stream is limited to announcements.  **Changes**: Deprecated in Zulip 3.0 (feature level 1), use   &#x60;stream_post_policy&#x60; instead. 
  # @option opts [Int32] :stream_post_policy Policy for which users can post messages to the stream.  * 1 &#x3D;&gt; Any user can post. * 2 &#x3D;&gt; Only administrators can post. * 3 &#x3D;&gt; Only full members can post. * 4 &#x3D;&gt; Only moderators can post.  **Changes**: New in Zulip 3.0, replacing the previous &#x60;is_announcement_only&#x60; boolean. 
  # @option opts [Bool] :history_public_to_subscribers Whether the stream&#39;s message history should be available to newly subscribed members, or users can only access messages they actually received while subscribed to the stream.  Corresponds to the [shared history](/help/stream-permissions) option in documentation. 
  # @option opts [OneOfstringinteger] :message_retention_days Number of days that messages sent to this stream will be stored before being automatically deleted by the [message retention policy](/help/message-retention-policy).  Two special string format values are supported:  * \&quot;realm_default\&quot; &#x3D;&gt; Return to the organization-level setting. * \&quot;forever\&quot; &#x3D;&gt; Retain messages forever.  **Changes**: New in Zulip 3.0 (feature level 17). 
  # @return [JsonSuccess]
  describe "update_stream test" do
    it "should work" do
      # assertion here. ref: https://crystal-lang.org/reference/guides/testing.html
    end
  end

  # unit tests for update_subscription_settings
  # Update subscription settings
  # This endpoint is used to update the user&#39;s personal settings for the streams they are subscribed to, including muting, color, pinning, and per-stream notification settings.  &#x60;POST {{ api_url }}/v1/users/me/subscriptions/properties&#x60; 
  # @param subscription_data A list of objects that describe the changes that should be applied in each subscription. Each object represents a subscription, and must have a &#x60;stream_id&#x60; key that identifies the stream, as well as the &#x60;property&#x60; being modified and its new &#x60;value&#x60;.  The possible values for each &#x60;property&#x60; and &#x60;value&#x60; pairs are:  * &#x60;color&#x60; (string): the hex value of the user&#39;s display color for the stream. * &#x60;is_muted&#x60; (boolean): whether the stream is   [muted](/help/mute-a-stream).  Prior to Zulip 2.1, this feature was   represented by the more confusingly named &#x60;in_home_view&#x60; (with the   opposite value, &#x60;in_home_view&#x3D;!is_muted&#x60;); for   backwards-compatibility, modern Zulip still accepts that value. * &#x60;pin_to_top&#x60; (boolean): whether to pin the stream at the top of the stream list. * &#x60;desktop_notifications&#x60; (boolean): whether to show desktop notifications     for all messages sent to the stream. * &#x60;audible_notifications&#x60; (boolean): whether to play a sound   notification for all messages sent to the stream. * &#x60;push_notifications&#x60; (boolean): whether to trigger a mobile push     notification for all messages sent to the stream. * &#x60;email_notifications&#x60; (boolean): whether to trigger an email     notification for all messages sent to the stream. 
  # @param [Hash] opts the optional parameters
  # @return [JsonSuccessBase]
  describe "update_subscription_settings test" do
    it "should work" do
      # assertion here. ref: https://crystal-lang.org/reference/guides/testing.html
    end
  end

  # unit tests for update_subscriptions
  # Update subscriptions
  # Update which streams you are are subscribed to. 
  # @param [Hash] opts the optional parameters
  # @option opts [Array(String)] :delete A list of stream names to unsubscribe from. 
  # @option opts [Array(Object)] :add A list of objects describing which streams to subscribe to, optionally including per-user subscription parameters (e.g. color) and if the stream is to be created, its description. 
  # @return [JsonSuccessBase]
  describe "update_subscriptions test" do
    it "should work" do
      # assertion here. ref: https://crystal-lang.org/reference/guides/testing.html
    end
  end

end
