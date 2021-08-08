require 'json'


MyApp.add_route('DELETE', '/api/v1/streams/{stream_id}', {
  "resourcePath" => "/Streams",
  "summary" => "Archive a stream",
  "nickname" => "archive_stream", 
  "responseClass" => "JsonSuccess",
  "endpoint" => "/streams/{stream_id}", 
  "notes" => "[Archive the stream](/help/archive-a-stream) with the ID `stream_id`.  `DELETE {{ api_url }}/v1/streams/{stream_id}` ",
  "parameters" => [
    {
      "name" => "stream_id",
      "description" => "The ID of the stream to access. ",
      "dataType" => "Integer",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/api/v1/calls/bigbluebutton/create', {
  "resourcePath" => "/Streams",
  "summary" => "Create BigBlueButton video call",
  "nickname" => "create_big_blue_button_video_call", 
  "responseClass" => "JsonSuccessBase",
  "endpoint" => "/calls/bigbluebutton/create", 
  "notes" => "Create a video call URL for a BigBlueButton video call. Requires BigBlueButton to be configured on the Zulip server. ",
  "parameters" => [
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/api/v1/get_stream_id', {
  "resourcePath" => "/Streams",
  "summary" => "Get stream ID",
  "nickname" => "get_stream_id", 
  "responseClass" => "JsonSuccessBase",
  "endpoint" => "/get_stream_id", 
  "notes" => "Get the unique ID of a given stream.  `GET {{ api_url }}/v1/get_stream_id` ",
  "parameters" => [
    {
      "name" => "stream",
      "description" => "The name of the stream to access. ",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/api/v1/users/me/{stream_id}/topics', {
  "resourcePath" => "/Streams",
  "summary" => "Get topics in a stream",
  "nickname" => "get_stream_topics", 
  "responseClass" => "JsonSuccessBase",
  "endpoint" => "/users/me/{stream_id}/topics", 
  "notes" => "Get all the topics in a specific stream  `GET {{ api_url }}/v1/users/me/{stream_id}/topics` ",
  "parameters" => [
    {
      "name" => "stream_id",
      "description" => "The ID of the stream to access. ",
      "dataType" => "Integer",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/api/v1/streams', {
  "resourcePath" => "/Streams",
  "summary" => "Get all streams",
  "nickname" => "get_streams", 
  "responseClass" => "JsonSuccessBase",
  "endpoint" => "/streams", 
  "notes" => "Get all streams that the user has access to.  `GET {{ api_url }}/v1/streams` ",
  "parameters" => [
    {
      "name" => "include_public",
      "description" => "Include all public streams. ",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "defaultValue" => "true",
      "paramType" => "query",
    },
    {
      "name" => "include_web_public",
      "description" => "Include all web public streams. ",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "defaultValue" => "false",
      "paramType" => "query",
    },
    {
      "name" => "include_subscribed",
      "description" => "Include all streams that the user is subscribed to. ",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "defaultValue" => "true",
      "paramType" => "query",
    },
    {
      "name" => "include_all_active",
      "description" => "Include all active streams. The user must have administrative privileges to use this parameter. ",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "defaultValue" => "false",
      "paramType" => "query",
    },
    {
      "name" => "include_default",
      "description" => "Include all default streams for the user&#39;s realm. ",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "defaultValue" => "false",
      "paramType" => "query",
    },
    {
      "name" => "include_owner_subscribed",
      "description" => "If the user is a bot, include all streams that the bot&#39;s owner is subscribed to. ",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "defaultValue" => "false",
      "paramType" => "query",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/api/v1/users/{user_id}/subscriptions/{stream_id}', {
  "resourcePath" => "/Streams",
  "summary" => "Get subscription status",
  "nickname" => "get_subscription_status", 
  "responseClass" => "JsonSuccessBase",
  "endpoint" => "/users/{user_id}/subscriptions/{stream_id}", 
  "notes" => "Check whether a user is subscribed to a stream.  `GET {{ api_url }}/v1/users/{user_id}/subscriptions/{stream_id}`  **Changes**: New in Zulip 3.0 (feature level 11). ",
  "parameters" => [
    {
      "name" => "user_id",
      "description" => "The target user&#39;s ID. ",
      "dataType" => "Integer",
      "paramType" => "path",
    },
    {
      "name" => "stream_id",
      "description" => "The ID of the stream to access. ",
      "dataType" => "Integer",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/api/v1/users/me/subscriptions', {
  "resourcePath" => "/Streams",
  "summary" => "Get subscribed streams",
  "nickname" => "get_subscriptions", 
  "responseClass" => "JsonSuccessBase",
  "endpoint" => "/users/me/subscriptions", 
  "notes" => "Get all streams that the user is subscribed to.  `GET {{ api_url }}/v1/users/me/subscriptions` ",
  "parameters" => [
    {
      "name" => "include_subscribers",
      "description" => "Whether each returned stream object should include a &#x60;subscribers&#x60; field containing a list of the user IDs of its subscribers.  (This may be significantly slower in organizations with thousands of users subscribed to many streams.)  **Changes**: New in Zulip 2.1.0. ",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "defaultValue" => "false",
      "paramType" => "query",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('PATCH', '/api/v1/users/me/subscriptions/muted_topics', {
  "resourcePath" => "/Streams",
  "summary" => "Topic muting",
  "nickname" => "mute_topic", 
  "responseClass" => "JsonSuccess",
  "endpoint" => "/users/me/subscriptions/muted_topics", 
  "notes" => "This endpoint mutes/unmutes a topic within a stream that the current user is subscribed to.  Muted topics are displayed faded in the Zulip UI, and are not included in the user's unread count totals.  `PATCH {{ api_url }}/v1/users/me/subscriptions/muted_topics` ",
  "parameters" => [
    {
      "name" => "stream",
      "description" => "The name of the stream to access. ",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "stream_id",
      "description" => "The ID of the stream to access. ",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "topic",
      "description" => "The topic to (un)mute. Note that the request will succeed regardless of whether any messages have been sent to the specified topic. ",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "op",
      "description" => "Whether to mute (&#x60;add&#x60;) or unmute (&#x60;remove&#x60;) the provided topic. ",
      "dataType" => "String",
      "allowableValues" => "[add, remove]",
      "paramType" => "query",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '/api/v1/users/me/subscriptions', {
  "resourcePath" => "/Streams",
  "summary" => "Subscribe to a stream",
  "nickname" => "subscribe", 
  "responseClass" => "oneOf<object,object>",
  "endpoint" => "/users/me/subscriptions", 
  "notes" => "Subscribe one or more users to one or more streams.  `POST {{ api_url }}/v1/users/me/subscriptions`  If any of the specified streams do not exist, they are automatically created.  The initial [stream settings](/api/update-stream) will be determined by the optional parameters like `invite_only` detailed below. ",
  "parameters" => [
    {
      "name" => "subscriptions",
      "description" => "A list of dictionaries containing the key &#x60;name&#x60; and value specifying the name of the stream to subscribe. If the stream does not exist a new stream is created. The description of the stream created can be specified by setting the dictionary key &#x60;description&#x60; with an appropriate value. ",
      "dataType" => "Array<Object>",
      "collectionFormat" => "multi",
      "paramType" => "query",
    },
    {
      "name" => "principals",
      "description" => "A list of user ids (preferred) or Zulip display email addresses of the users to be subscribed to or unsubscribed from the streams specified in the &#x60;subscriptions&#x60; parameter. If not provided, then the requesting user/bot is subscribed.  **Changes**: The integer format is new in Zulip 3.0 (feature level 9). ",
      "dataType" => "Array<oneOf<string,integer>>",
      "collectionFormat" => "multi",
      "paramType" => "query",
    },
    {
      "name" => "authorization_errors_fatal",
      "description" => "A boolean specifying whether authorization errors (such as when the requesting user is not authorized to access a private stream) should be considered fatal or not. When &#x60;True&#x60;, an authorization error is reported as such. When set to &#x60;False&#x60;, the response will be a 200 and any streams where the request encountered an authorization error will be listed in the &#x60;unauthorized&#x60; key. ",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "defaultValue" => "true",
      "paramType" => "query",
    },
    {
      "name" => "announce",
      "description" => "If one of the streams specified did not exist previously and is thus craeted by this call, this determines whether [notification bot](/help/configure-notification-bot) will send an announcement about the new stream&#39;s creation. ",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "defaultValue" => "false",
      "paramType" => "query",
    },
    {
      "name" => "invite_only",
      "description" => "As described above, this endpoint will create a new stream if passed a stream name that doesn&#39;t already exist.  This parameters and the ones that follow are used to request an initial configuration of a created stream; they are ignored for streams that already exist.  This parameter determines whether any newly created streams will be private streams. ",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "defaultValue" => "false",
      "paramType" => "query",
    },
    {
      "name" => "history_public_to_subscribers",
      "description" => "Whether the stream&#39;s message history should be available to newly subscribed members, or users can only access messages they actually received while subscribed to the stream.  Corresponds to the [shared history](/help/stream-permissions) option in documentation. ",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "stream_post_policy",
      "description" => "Policy for which users can post messages to the stream.  * 1 &#x3D;&gt; Any user can post. * 2 &#x3D;&gt; Only administrators can post. * 3 &#x3D;&gt; Only full members can post. * 4 &#x3D;&gt; Only moderators can post.  **Changes**: New in Zulip 3.0, replacing the previous &#x60;is_announcement_only&#x60; boolean. ",
      "dataType" => "Integer",
      "allowableValues" => "",
      "defaultValue" => "1",
      "paramType" => "query",
    },
    {
      "name" => "message_retention_days",
      "description" => "Number of days that messages sent to this stream will be stored before being automatically deleted by the [message retention policy](/help/message-retention-policy).  Two special string format values are supported:  * \&quot;realm_default\&quot; &#x3D;&gt; Return to the organization-level setting. * \&quot;forever\&quot; &#x3D;&gt; Retain messages forever.  **Changes**: New in Zulip 3.0 (feature level 17). ",
      "dataType" => "oneOf<string,integer>",
      "allowableValues" => "",
      "paramType" => "query",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('DELETE', '/api/v1/users/me/subscriptions', {
  "resourcePath" => "/Streams",
  "summary" => "Unsubscribe from a stream",
  "nickname" => "unsubscribe", 
  "responseClass" => "JsonSuccessBase",
  "endpoint" => "/users/me/subscriptions", 
  "notes" => "Unsubscribe yourself or other users from one or more streams.  `DELETE {{ api_url }}/v1/users/me/subscriptions` ",
  "parameters" => [
    {
      "name" => "subscriptions",
      "description" => "A list of stream names to unsubscribe from. This parameter is called &#x60;streams&#x60; in our Python API. ",
      "dataType" => "Array<String>",
      "collectionFormat" => "multi",
      "paramType" => "query",
    },
    {
      "name" => "principals",
      "description" => "A list of user ids (preferred) or Zulip display email addresses of the users to be subscribed to or unsubscribed from the streams specified in the &#x60;subscriptions&#x60; parameter. If not provided, then the requesting user/bot is subscribed.  **Changes**: The integer format is new in Zulip 3.0 (feature level 9). ",
      "dataType" => "Array<oneOf<string,integer>>",
      "collectionFormat" => "multi",
      "paramType" => "query",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('PATCH', '/api/v1/streams/{stream_id}', {
  "resourcePath" => "/Streams",
  "summary" => "Update a stream",
  "nickname" => "update_stream", 
  "responseClass" => "JsonSuccess",
  "endpoint" => "/streams/{stream_id}", 
  "notes" => "Configure the stream with the ID `stream_id`.  This endpoint supports an organization administrator editing any property of a stream, including:  * Stream [name](/help/rename-a-stream) and [description](/help/change-the-stream-description) * Stream [permissions](/help/stream-permissions), including [privacy](/help/change-the-privacy-of-a-stream) and [who can send](/help/stream-sending-policy).  `PATCH {{ api_url }}/v1/streams/{stream_id}` ",
  "parameters" => [
    {
      "name" => "description",
      "description" => "The new description for the stream. Limited Zulip markdown is allowed in this field.  **Changes**: Removed unnecessary JSON-encoding of this parameter in Zulip 4.0 (feature level 64). ",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "new_name",
      "description" => "The new name for the stream.  **Changes**: Removed unnecessary JSON-encoding of this parameter in Zulip 4.0 (feature level 64). ",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "is_private",
      "description" => "Change whether the stream is a private stream. ",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "is_announcement_only",
      "description" => "Whether the stream is limited to announcements.  **Changes**: Deprecated in Zulip 3.0 (feature level 1), use   &#x60;stream_post_policy&#x60; instead. ",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "stream_post_policy",
      "description" => "Policy for which users can post messages to the stream.  * 1 &#x3D;&gt; Any user can post. * 2 &#x3D;&gt; Only administrators can post. * 3 &#x3D;&gt; Only full members can post. * 4 &#x3D;&gt; Only moderators can post.  **Changes**: New in Zulip 3.0, replacing the previous &#x60;is_announcement_only&#x60; boolean. ",
      "dataType" => "Integer",
      "allowableValues" => "",
      "defaultValue" => "1",
      "paramType" => "query",
    },
    {
      "name" => "history_public_to_subscribers",
      "description" => "Whether the stream&#39;s message history should be available to newly subscribed members, or users can only access messages they actually received while subscribed to the stream.  Corresponds to the [shared history](/help/stream-permissions) option in documentation. ",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "message_retention_days",
      "description" => "Number of days that messages sent to this stream will be stored before being automatically deleted by the [message retention policy](/help/message-retention-policy).  Two special string format values are supported:  * \&quot;realm_default\&quot; &#x3D;&gt; Return to the organization-level setting. * \&quot;forever\&quot; &#x3D;&gt; Retain messages forever.  **Changes**: New in Zulip 3.0 (feature level 17). ",
      "dataType" => "oneOf<string,integer>",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "stream_id",
      "description" => "The ID of the stream to access. ",
      "dataType" => "Integer",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '/api/v1/users/me/subscriptions/properties', {
  "resourcePath" => "/Streams",
  "summary" => "Update subscription settings",
  "nickname" => "update_subscription_settings", 
  "responseClass" => "JsonSuccessBase",
  "endpoint" => "/users/me/subscriptions/properties", 
  "notes" => "This endpoint is used to update the user's personal settings for the streams they are subscribed to, including muting, color, pinning, and per-stream notification settings.  `POST {{ api_url }}/v1/users/me/subscriptions/properties` ",
  "parameters" => [
    {
      "name" => "subscription_data",
      "description" => "A list of objects that describe the changes that should be applied in each subscription. Each object represents a subscription, and must have a &#x60;stream_id&#x60; key that identifies the stream, as well as the &#x60;property&#x60; being modified and its new &#x60;value&#x60;.  The possible values for each &#x60;property&#x60; and &#x60;value&#x60; pairs are:  * &#x60;color&#x60; (string): the hex value of the user&#39;s display color for the stream. * &#x60;is_muted&#x60; (boolean): whether the stream is   [muted](/help/mute-a-stream).  Prior to Zulip 2.1, this feature was   represented by the more confusingly named &#x60;in_home_view&#x60; (with the   opposite value, &#x60;in_home_view&#x3D;!is_muted&#x60;); for   backwards-compatibility, modern Zulip still accepts that value. * &#x60;pin_to_top&#x60; (boolean): whether to pin the stream at the top of the stream list. * &#x60;desktop_notifications&#x60; (boolean): whether to show desktop notifications     for all messages sent to the stream. * &#x60;audible_notifications&#x60; (boolean): whether to play a sound   notification for all messages sent to the stream. * &#x60;push_notifications&#x60; (boolean): whether to trigger a mobile push     notification for all messages sent to the stream. * &#x60;email_notifications&#x60; (boolean): whether to trigger an email     notification for all messages sent to the stream. ",
      "dataType" => "Array<Object>",
      "collectionFormat" => "multi",
      "paramType" => "query",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('PATCH', '/api/v1/users/me/subscriptions', {
  "resourcePath" => "/Streams",
  "summary" => "Update subscriptions",
  "nickname" => "update_subscriptions", 
  "responseClass" => "JsonSuccessBase",
  "endpoint" => "/users/me/subscriptions", 
  "notes" => "Update which streams you are are subscribed to. ",
  "parameters" => [
    {
      "name" => "delete",
      "description" => "A list of stream names to unsubscribe from. ",
      "dataType" => "Array<String>",
      "collectionFormat" => "multi",
      "paramType" => "query",
    },
    {
      "name" => "add",
      "description" => "A list of objects describing which streams to subscribe to, optionally including per-user subscription parameters (e.g. color) and if the stream is to be created, its description. ",
      "dataType" => "Array<Object>",
      "collectionFormat" => "multi",
      "paramType" => "query",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end

