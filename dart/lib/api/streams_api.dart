//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.0

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;


class StreamsApi {
  StreamsApi([ApiClient apiClient]) : apiClient = apiClient ?? defaultApiClient;

  final ApiClient apiClient;

  /// Archive a stream
  ///
  /// [Archive the stream](/help/archive-a-stream) with the ID `stream_id`.  `DELETE {{ api_url }}/v1/streams/{stream_id}` 
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [int] streamId (required):
  ///   The ID of the stream to access. 
  Future<Response> archiveStreamWithHttpInfo(int streamId) async {
    // Verify required params are set.
    if (streamId == null) {
     throw ApiException(HttpStatus.badRequest, 'Missing required param: streamId');
    }

    final path = r'/streams/{stream_id}'
      .replaceAll('{' + 'stream_id' + '}', streamId.toString());

    Object postBody;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

    final contentTypes = <String>[];
    final nullableContentType = contentTypes.isNotEmpty ? contentTypes[0] : null;
    final authNames = <String>[];


    return await apiClient.invokeAPI(
      path,
      'DELETE',
      queryParams,
      postBody,
      headerParams,
      formParams,
      nullableContentType,
      authNames,
    );
  }

  /// Archive a stream
  ///
  /// [Archive the stream](/help/archive-a-stream) with the ID `stream_id`.  `DELETE {{ api_url }}/v1/streams/{stream_id}` 
  ///
  /// Parameters:
  ///
  /// * [int] streamId (required):
  ///   The ID of the stream to access. 
  Future<JsonSuccess> archiveStream(int streamId) async {
    final response = await archiveStreamWithHttpInfo(streamId);
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body != null && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'JsonSuccess',) as JsonSuccess;
        }
    return Future<JsonSuccess>.value(null);
  }

  /// Create BigBlueButton video call
  ///
  /// Create a video call URL for a BigBlueButton video call. Requires BigBlueButton to be configured on the Zulip server. 
  ///
  /// Note: This method returns the HTTP [Response].
  Future<Response> createBigBlueButtonVideoCallWithHttpInfo() async {
    final path = r'/calls/bigbluebutton/create';

    Object postBody;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

    final contentTypes = <String>[];
    final nullableContentType = contentTypes.isNotEmpty ? contentTypes[0] : null;
    final authNames = <String>[];


    return await apiClient.invokeAPI(
      path,
      'GET',
      queryParams,
      postBody,
      headerParams,
      formParams,
      nullableContentType,
      authNames,
    );
  }

  /// Create BigBlueButton video call
  ///
  /// Create a video call URL for a BigBlueButton video call. Requires BigBlueButton to be configured on the Zulip server. 
  Future<JsonSuccessBase> createBigBlueButtonVideoCall() async {
    final response = await createBigBlueButtonVideoCallWithHttpInfo();
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body != null && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'JsonSuccessBase',) as JsonSuccessBase;
        }
    return Future<JsonSuccessBase>.value(null);
  }

  /// Get stream ID
  ///
  /// Get the unique ID of a given stream.  `GET {{ api_url }}/v1/get_stream_id` 
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [String] stream (required):
  ///   The name of the stream to access. 
  Future<Response> getStreamIdWithHttpInfo(String stream) async {
    // Verify required params are set.
    if (stream == null) {
     throw ApiException(HttpStatus.badRequest, 'Missing required param: stream');
    }

    final path = r'/get_stream_id';

    Object postBody;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

      queryParams.addAll(_convertParametersForCollectionFormat('', 'stream', stream));

    final contentTypes = <String>[];
    final nullableContentType = contentTypes.isNotEmpty ? contentTypes[0] : null;
    final authNames = <String>[];


    return await apiClient.invokeAPI(
      path,
      'GET',
      queryParams,
      postBody,
      headerParams,
      formParams,
      nullableContentType,
      authNames,
    );
  }

  /// Get stream ID
  ///
  /// Get the unique ID of a given stream.  `GET {{ api_url }}/v1/get_stream_id` 
  ///
  /// Parameters:
  ///
  /// * [String] stream (required):
  ///   The name of the stream to access. 
  Future<JsonSuccessBase> getStreamId(String stream) async {
    final response = await getStreamIdWithHttpInfo(stream);
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body != null && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'JsonSuccessBase',) as JsonSuccessBase;
        }
    return Future<JsonSuccessBase>.value(null);
  }

  /// Get topics in a stream
  ///
  /// Get all the topics in a specific stream  `GET {{ api_url }}/v1/users/me/{stream_id}/topics` 
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [int] streamId (required):
  ///   The ID of the stream to access. 
  Future<Response> getStreamTopicsWithHttpInfo(int streamId) async {
    // Verify required params are set.
    if (streamId == null) {
     throw ApiException(HttpStatus.badRequest, 'Missing required param: streamId');
    }

    final path = r'/users/me/{stream_id}/topics'
      .replaceAll('{' + 'stream_id' + '}', streamId.toString());

    Object postBody;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

    final contentTypes = <String>[];
    final nullableContentType = contentTypes.isNotEmpty ? contentTypes[0] : null;
    final authNames = <String>[];


    return await apiClient.invokeAPI(
      path,
      'GET',
      queryParams,
      postBody,
      headerParams,
      formParams,
      nullableContentType,
      authNames,
    );
  }

  /// Get topics in a stream
  ///
  /// Get all the topics in a specific stream  `GET {{ api_url }}/v1/users/me/{stream_id}/topics` 
  ///
  /// Parameters:
  ///
  /// * [int] streamId (required):
  ///   The ID of the stream to access. 
  Future<JsonSuccessBase> getStreamTopics(int streamId) async {
    final response = await getStreamTopicsWithHttpInfo(streamId);
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body != null && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'JsonSuccessBase',) as JsonSuccessBase;
        }
    return Future<JsonSuccessBase>.value(null);
  }

  /// Get all streams
  ///
  /// Get all streams that the user has access to.  `GET {{ api_url }}/v1/streams` 
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [bool] includePublic:
  ///   Include all public streams. 
  ///
  /// * [bool] includeWebPublic:
  ///   Include all web public streams. 
  ///
  /// * [bool] includeSubscribed:
  ///   Include all streams that the user is subscribed to. 
  ///
  /// * [bool] includeAllActive:
  ///   Include all active streams. The user must have administrative privileges to use this parameter. 
  ///
  /// * [bool] includeDefault:
  ///   Include all default streams for the user's realm. 
  ///
  /// * [bool] includeOwnerSubscribed:
  ///   If the user is a bot, include all streams that the bot's owner is subscribed to. 
  Future<Response> getStreamsWithHttpInfo({ bool includePublic, bool includeWebPublic, bool includeSubscribed, bool includeAllActive, bool includeDefault, bool includeOwnerSubscribed }) async {
    // Verify required params are set.

    final path = r'/streams';

    Object postBody;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

    if (includePublic != null) {
      queryParams.addAll(_convertParametersForCollectionFormat('', 'include_public', includePublic));
    }
    if (includeWebPublic != null) {
      queryParams.addAll(_convertParametersForCollectionFormat('', 'include_web_public', includeWebPublic));
    }
    if (includeSubscribed != null) {
      queryParams.addAll(_convertParametersForCollectionFormat('', 'include_subscribed', includeSubscribed));
    }
    if (includeAllActive != null) {
      queryParams.addAll(_convertParametersForCollectionFormat('', 'include_all_active', includeAllActive));
    }
    if (includeDefault != null) {
      queryParams.addAll(_convertParametersForCollectionFormat('', 'include_default', includeDefault));
    }
    if (includeOwnerSubscribed != null) {
      queryParams.addAll(_convertParametersForCollectionFormat('', 'include_owner_subscribed', includeOwnerSubscribed));
    }

    final contentTypes = <String>[];
    final nullableContentType = contentTypes.isNotEmpty ? contentTypes[0] : null;
    final authNames = <String>[];


    return await apiClient.invokeAPI(
      path,
      'GET',
      queryParams,
      postBody,
      headerParams,
      formParams,
      nullableContentType,
      authNames,
    );
  }

  /// Get all streams
  ///
  /// Get all streams that the user has access to.  `GET {{ api_url }}/v1/streams` 
  ///
  /// Parameters:
  ///
  /// * [bool] includePublic:
  ///   Include all public streams. 
  ///
  /// * [bool] includeWebPublic:
  ///   Include all web public streams. 
  ///
  /// * [bool] includeSubscribed:
  ///   Include all streams that the user is subscribed to. 
  ///
  /// * [bool] includeAllActive:
  ///   Include all active streams. The user must have administrative privileges to use this parameter. 
  ///
  /// * [bool] includeDefault:
  ///   Include all default streams for the user's realm. 
  ///
  /// * [bool] includeOwnerSubscribed:
  ///   If the user is a bot, include all streams that the bot's owner is subscribed to. 
  Future<JsonSuccessBase> getStreams({ bool includePublic, bool includeWebPublic, bool includeSubscribed, bool includeAllActive, bool includeDefault, bool includeOwnerSubscribed }) async {
    final response = await getStreamsWithHttpInfo( includePublic: includePublic, includeWebPublic: includeWebPublic, includeSubscribed: includeSubscribed, includeAllActive: includeAllActive, includeDefault: includeDefault, includeOwnerSubscribed: includeOwnerSubscribed );
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body != null && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'JsonSuccessBase',) as JsonSuccessBase;
        }
    return Future<JsonSuccessBase>.value(null);
  }

  /// Get subscription status
  ///
  /// Check whether a user is subscribed to a stream.  `GET {{ api_url }}/v1/users/{user_id}/subscriptions/{stream_id}`  **Changes**: New in Zulip 3.0 (feature level 11). 
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [int] userId (required):
  ///   The target user's ID. 
  ///
  /// * [int] streamId (required):
  ///   The ID of the stream to access. 
  Future<Response> getSubscriptionStatusWithHttpInfo(int userId, int streamId) async {
    // Verify required params are set.
    if (userId == null) {
     throw ApiException(HttpStatus.badRequest, 'Missing required param: userId');
    }
    if (streamId == null) {
     throw ApiException(HttpStatus.badRequest, 'Missing required param: streamId');
    }

    final path = r'/users/{user_id}/subscriptions/{stream_id}'
      .replaceAll('{' + 'user_id' + '}', userId.toString())
      .replaceAll('{' + 'stream_id' + '}', streamId.toString());

    Object postBody;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

    final contentTypes = <String>[];
    final nullableContentType = contentTypes.isNotEmpty ? contentTypes[0] : null;
    final authNames = <String>[];


    return await apiClient.invokeAPI(
      path,
      'GET',
      queryParams,
      postBody,
      headerParams,
      formParams,
      nullableContentType,
      authNames,
    );
  }

  /// Get subscription status
  ///
  /// Check whether a user is subscribed to a stream.  `GET {{ api_url }}/v1/users/{user_id}/subscriptions/{stream_id}`  **Changes**: New in Zulip 3.0 (feature level 11). 
  ///
  /// Parameters:
  ///
  /// * [int] userId (required):
  ///   The target user's ID. 
  ///
  /// * [int] streamId (required):
  ///   The ID of the stream to access. 
  Future<JsonSuccessBase> getSubscriptionStatus(int userId, int streamId) async {
    final response = await getSubscriptionStatusWithHttpInfo(userId, streamId);
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body != null && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'JsonSuccessBase',) as JsonSuccessBase;
        }
    return Future<JsonSuccessBase>.value(null);
  }

  /// Get subscribed streams
  ///
  /// Get all streams that the user is subscribed to.  `GET {{ api_url }}/v1/users/me/subscriptions` 
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [bool] includeSubscribers:
  ///   Whether each returned stream object should include a `subscribers` field containing a list of the user IDs of its subscribers.  (This may be significantly slower in organizations with thousands of users subscribed to many streams.)  **Changes**: New in Zulip 2.1.0. 
  Future<Response> getSubscriptionsWithHttpInfo({ bool includeSubscribers }) async {
    // Verify required params are set.

    final path = r'/users/me/subscriptions';

    Object postBody;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

    if (includeSubscribers != null) {
      queryParams.addAll(_convertParametersForCollectionFormat('', 'include_subscribers', includeSubscribers));
    }

    final contentTypes = <String>[];
    final nullableContentType = contentTypes.isNotEmpty ? contentTypes[0] : null;
    final authNames = <String>[];


    return await apiClient.invokeAPI(
      path,
      'GET',
      queryParams,
      postBody,
      headerParams,
      formParams,
      nullableContentType,
      authNames,
    );
  }

  /// Get subscribed streams
  ///
  /// Get all streams that the user is subscribed to.  `GET {{ api_url }}/v1/users/me/subscriptions` 
  ///
  /// Parameters:
  ///
  /// * [bool] includeSubscribers:
  ///   Whether each returned stream object should include a `subscribers` field containing a list of the user IDs of its subscribers.  (This may be significantly slower in organizations with thousands of users subscribed to many streams.)  **Changes**: New in Zulip 2.1.0. 
  Future<JsonSuccessBase> getSubscriptions({ bool includeSubscribers }) async {
    final response = await getSubscriptionsWithHttpInfo( includeSubscribers: includeSubscribers );
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body != null && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'JsonSuccessBase',) as JsonSuccessBase;
        }
    return Future<JsonSuccessBase>.value(null);
  }

  /// Topic muting
  ///
  /// This endpoint mutes/unmutes a topic within a stream that the current user is subscribed to.  Muted topics are displayed faded in the Zulip UI, and are not included in the user's unread count totals.  `PATCH {{ api_url }}/v1/users/me/subscriptions/muted_topics` 
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [String] topic (required):
  ///   The topic to (un)mute. Note that the request will succeed regardless of whether any messages have been sent to the specified topic. 
  ///
  /// * [String] op (required):
  ///   Whether to mute (`add`) or unmute (`remove`) the provided topic. 
  ///
  /// * [String] stream:
  ///   The name of the stream to access. 
  ///
  /// * [int] streamId:
  ///   The ID of the stream to access. 
  Future<Response> muteTopicWithHttpInfo(String topic, String op, { String stream, int streamId }) async {
    // Verify required params are set.
    if (topic == null) {
     throw ApiException(HttpStatus.badRequest, 'Missing required param: topic');
    }
    if (op == null) {
     throw ApiException(HttpStatus.badRequest, 'Missing required param: op');
    }

    final path = r'/users/me/subscriptions/muted_topics';

    Object postBody;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

    if (stream != null) {
      queryParams.addAll(_convertParametersForCollectionFormat('', 'stream', stream));
    }
    if (streamId != null) {
      queryParams.addAll(_convertParametersForCollectionFormat('', 'stream_id', streamId));
    }
      queryParams.addAll(_convertParametersForCollectionFormat('', 'topic', topic));
      queryParams.addAll(_convertParametersForCollectionFormat('', 'op', op));

    final contentTypes = <String>[];
    final nullableContentType = contentTypes.isNotEmpty ? contentTypes[0] : null;
    final authNames = <String>[];


    return await apiClient.invokeAPI(
      path,
      'PATCH',
      queryParams,
      postBody,
      headerParams,
      formParams,
      nullableContentType,
      authNames,
    );
  }

  /// Topic muting
  ///
  /// This endpoint mutes/unmutes a topic within a stream that the current user is subscribed to.  Muted topics are displayed faded in the Zulip UI, and are not included in the user's unread count totals.  `PATCH {{ api_url }}/v1/users/me/subscriptions/muted_topics` 
  ///
  /// Parameters:
  ///
  /// * [String] topic (required):
  ///   The topic to (un)mute. Note that the request will succeed regardless of whether any messages have been sent to the specified topic. 
  ///
  /// * [String] op (required):
  ///   Whether to mute (`add`) or unmute (`remove`) the provided topic. 
  ///
  /// * [String] stream:
  ///   The name of the stream to access. 
  ///
  /// * [int] streamId:
  ///   The ID of the stream to access. 
  Future<JsonSuccess> muteTopic(String topic, String op, { String stream, int streamId }) async {
    final response = await muteTopicWithHttpInfo(topic, op,  stream: stream, streamId: streamId );
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body != null && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'JsonSuccess',) as JsonSuccess;
        }
    return Future<JsonSuccess>.value(null);
  }

  /// Subscribe to a stream
  ///
  /// Subscribe one or more users to one or more streams.  `POST {{ api_url }}/v1/users/me/subscriptions`  If any of the specified streams do not exist, they are automatically created.  The initial [stream settings](/api/update-stream) will be determined by the optional parameters like `invite_only` detailed below. 
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [List<Object>] subscriptions (required):
  ///   A list of dictionaries containing the key `name` and value specifying the name of the stream to subscribe. If the stream does not exist a new stream is created. The description of the stream created can be specified by setting the dictionary key `description` with an appropriate value. 
  ///
  /// * [List<OneOfstringinteger>] principals:
  ///   A list of user ids (preferred) or Zulip display email addresses of the users to be subscribed to or unsubscribed from the streams specified in the `subscriptions` parameter. If not provided, then the requesting user/bot is subscribed.  **Changes**: The integer format is new in Zulip 3.0 (feature level 9). 
  ///
  /// * [bool] authorizationErrorsFatal:
  ///   A boolean specifying whether authorization errors (such as when the requesting user is not authorized to access a private stream) should be considered fatal or not. When `True`, an authorization error is reported as such. When set to `False`, the response will be a 200 and any streams where the request encountered an authorization error will be listed in the `unauthorized` key. 
  ///
  /// * [bool] announce:
  ///   If one of the streams specified did not exist previously and is thus craeted by this call, this determines whether [notification bot](/help/configure-notification-bot) will send an announcement about the new stream's creation. 
  ///
  /// * [bool] inviteOnly:
  ///   As described above, this endpoint will create a new stream if passed a stream name that doesn't already exist.  This parameters and the ones that follow are used to request an initial configuration of a created stream; they are ignored for streams that already exist.  This parameter determines whether any newly created streams will be private streams. 
  ///
  /// * [bool] historyPublicToSubscribers:
  ///   Whether the stream's message history should be available to newly subscribed members, or users can only access messages they actually received while subscribed to the stream.  Corresponds to the [shared history](/help/stream-permissions) option in documentation. 
  ///
  /// * [int] streamPostPolicy:
  ///   Policy for which users can post messages to the stream.  * 1 => Any user can post. * 2 => Only administrators can post. * 3 => Only full members can post. * 4 => Only moderators can post.  **Changes**: New in Zulip 3.0, replacing the previous `is_announcement_only` boolean. 
  ///
  /// * [OneOfstringinteger] messageRetentionDays:
  ///   Number of days that messages sent to this stream will be stored before being automatically deleted by the [message retention policy](/help/message-retention-policy).  Two special string format values are supported:  * \"realm_default\" => Return to the organization-level setting. * \"forever\" => Retain messages forever.  **Changes**: New in Zulip 3.0 (feature level 17). 
  Future<Response> subscribeWithHttpInfo(List<Object> subscriptions, { List<OneOfstringinteger> principals, bool authorizationErrorsFatal, bool announce, bool inviteOnly, bool historyPublicToSubscribers, int streamPostPolicy, OneOfstringinteger messageRetentionDays }) async {
    // Verify required params are set.
    if (subscriptions == null) {
     throw ApiException(HttpStatus.badRequest, 'Missing required param: subscriptions');
    }

    final path = r'/users/me/subscriptions';

    Object postBody;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

      queryParams.addAll(_convertParametersForCollectionFormat('multi', 'subscriptions', subscriptions));
    if (principals != null) {
      queryParams.addAll(_convertParametersForCollectionFormat('multi', 'principals', principals));
    }
    if (authorizationErrorsFatal != null) {
      queryParams.addAll(_convertParametersForCollectionFormat('', 'authorization_errors_fatal', authorizationErrorsFatal));
    }
    if (announce != null) {
      queryParams.addAll(_convertParametersForCollectionFormat('', 'announce', announce));
    }
    if (inviteOnly != null) {
      queryParams.addAll(_convertParametersForCollectionFormat('', 'invite_only', inviteOnly));
    }
    if (historyPublicToSubscribers != null) {
      queryParams.addAll(_convertParametersForCollectionFormat('', 'history_public_to_subscribers', historyPublicToSubscribers));
    }
    if (streamPostPolicy != null) {
      queryParams.addAll(_convertParametersForCollectionFormat('', 'stream_post_policy', streamPostPolicy));
    }
    if (messageRetentionDays != null) {
      queryParams.addAll(_convertParametersForCollectionFormat('', 'message_retention_days', messageRetentionDays));
    }

    final contentTypes = <String>[];
    final nullableContentType = contentTypes.isNotEmpty ? contentTypes[0] : null;
    final authNames = <String>[];


    return await apiClient.invokeAPI(
      path,
      'POST',
      queryParams,
      postBody,
      headerParams,
      formParams,
      nullableContentType,
      authNames,
    );
  }

  /// Subscribe to a stream
  ///
  /// Subscribe one or more users to one or more streams.  `POST {{ api_url }}/v1/users/me/subscriptions`  If any of the specified streams do not exist, they are automatically created.  The initial [stream settings](/api/update-stream) will be determined by the optional parameters like `invite_only` detailed below. 
  ///
  /// Parameters:
  ///
  /// * [List<Object>] subscriptions (required):
  ///   A list of dictionaries containing the key `name` and value specifying the name of the stream to subscribe. If the stream does not exist a new stream is created. The description of the stream created can be specified by setting the dictionary key `description` with an appropriate value. 
  ///
  /// * [List<OneOfstringinteger>] principals:
  ///   A list of user ids (preferred) or Zulip display email addresses of the users to be subscribed to or unsubscribed from the streams specified in the `subscriptions` parameter. If not provided, then the requesting user/bot is subscribed.  **Changes**: The integer format is new in Zulip 3.0 (feature level 9). 
  ///
  /// * [bool] authorizationErrorsFatal:
  ///   A boolean specifying whether authorization errors (such as when the requesting user is not authorized to access a private stream) should be considered fatal or not. When `True`, an authorization error is reported as such. When set to `False`, the response will be a 200 and any streams where the request encountered an authorization error will be listed in the `unauthorized` key. 
  ///
  /// * [bool] announce:
  ///   If one of the streams specified did not exist previously and is thus craeted by this call, this determines whether [notification bot](/help/configure-notification-bot) will send an announcement about the new stream's creation. 
  ///
  /// * [bool] inviteOnly:
  ///   As described above, this endpoint will create a new stream if passed a stream name that doesn't already exist.  This parameters and the ones that follow are used to request an initial configuration of a created stream; they are ignored for streams that already exist.  This parameter determines whether any newly created streams will be private streams. 
  ///
  /// * [bool] historyPublicToSubscribers:
  ///   Whether the stream's message history should be available to newly subscribed members, or users can only access messages they actually received while subscribed to the stream.  Corresponds to the [shared history](/help/stream-permissions) option in documentation. 
  ///
  /// * [int] streamPostPolicy:
  ///   Policy for which users can post messages to the stream.  * 1 => Any user can post. * 2 => Only administrators can post. * 3 => Only full members can post. * 4 => Only moderators can post.  **Changes**: New in Zulip 3.0, replacing the previous `is_announcement_only` boolean. 
  ///
  /// * [OneOfstringinteger] messageRetentionDays:
  ///   Number of days that messages sent to this stream will be stored before being automatically deleted by the [message retention policy](/help/message-retention-policy).  Two special string format values are supported:  * \"realm_default\" => Return to the organization-level setting. * \"forever\" => Retain messages forever.  **Changes**: New in Zulip 3.0 (feature level 17). 
  Future<OneOfobjectobject> subscribe(List<Object> subscriptions, { List<OneOfstringinteger> principals, bool authorizationErrorsFatal, bool announce, bool inviteOnly, bool historyPublicToSubscribers, int streamPostPolicy, OneOfstringinteger messageRetentionDays }) async {
    final response = await subscribeWithHttpInfo(subscriptions,  principals: principals, authorizationErrorsFatal: authorizationErrorsFatal, announce: announce, inviteOnly: inviteOnly, historyPublicToSubscribers: historyPublicToSubscribers, streamPostPolicy: streamPostPolicy, messageRetentionDays: messageRetentionDays );
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body != null && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'OneOfobjectobject',) as OneOfobjectobject;
        }
    return Future<OneOfobjectobject>.value(null);
  }

  /// Unsubscribe from a stream
  ///
  /// Unsubscribe yourself or other users from one or more streams.  `DELETE {{ api_url }}/v1/users/me/subscriptions` 
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [List<String>] subscriptions (required):
  ///   A list of stream names to unsubscribe from. This parameter is called `streams` in our Python API. 
  ///
  /// * [List<OneOfstringinteger>] principals:
  ///   A list of user ids (preferred) or Zulip display email addresses of the users to be subscribed to or unsubscribed from the streams specified in the `subscriptions` parameter. If not provided, then the requesting user/bot is subscribed.  **Changes**: The integer format is new in Zulip 3.0 (feature level 9). 
  Future<Response> unsubscribeWithHttpInfo(List<String> subscriptions, { List<OneOfstringinteger> principals }) async {
    // Verify required params are set.
    if (subscriptions == null) {
     throw ApiException(HttpStatus.badRequest, 'Missing required param: subscriptions');
    }

    final path = r'/users/me/subscriptions';

    Object postBody;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

      queryParams.addAll(_convertParametersForCollectionFormat('multi', 'subscriptions', subscriptions));
    if (principals != null) {
      queryParams.addAll(_convertParametersForCollectionFormat('multi', 'principals', principals));
    }

    final contentTypes = <String>[];
    final nullableContentType = contentTypes.isNotEmpty ? contentTypes[0] : null;
    final authNames = <String>[];


    return await apiClient.invokeAPI(
      path,
      'DELETE',
      queryParams,
      postBody,
      headerParams,
      formParams,
      nullableContentType,
      authNames,
    );
  }

  /// Unsubscribe from a stream
  ///
  /// Unsubscribe yourself or other users from one or more streams.  `DELETE {{ api_url }}/v1/users/me/subscriptions` 
  ///
  /// Parameters:
  ///
  /// * [List<String>] subscriptions (required):
  ///   A list of stream names to unsubscribe from. This parameter is called `streams` in our Python API. 
  ///
  /// * [List<OneOfstringinteger>] principals:
  ///   A list of user ids (preferred) or Zulip display email addresses of the users to be subscribed to or unsubscribed from the streams specified in the `subscriptions` parameter. If not provided, then the requesting user/bot is subscribed.  **Changes**: The integer format is new in Zulip 3.0 (feature level 9). 
  Future<JsonSuccessBase> unsubscribe(List<String> subscriptions, { List<OneOfstringinteger> principals }) async {
    final response = await unsubscribeWithHttpInfo(subscriptions,  principals: principals );
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body != null && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'JsonSuccessBase',) as JsonSuccessBase;
        }
    return Future<JsonSuccessBase>.value(null);
  }

  /// Update a stream
  ///
  /// Configure the stream with the ID `stream_id`.  This endpoint supports an organization administrator editing any property of a stream, including:  * Stream [name](/help/rename-a-stream) and [description](/help/change-the-stream-description) * Stream [permissions](/help/stream-permissions), including [privacy](/help/change-the-privacy-of-a-stream) and [who can send](/help/stream-sending-policy).  `PATCH {{ api_url }}/v1/streams/{stream_id}` 
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [int] streamId (required):
  ///   The ID of the stream to access. 
  ///
  /// * [String] description:
  ///   The new description for the stream. Limited Zulip markdown is allowed in this field.  **Changes**: Removed unnecessary JSON-encoding of this parameter in Zulip 4.0 (feature level 64). 
  ///
  /// * [String] newName:
  ///   The new name for the stream.  **Changes**: Removed unnecessary JSON-encoding of this parameter in Zulip 4.0 (feature level 64). 
  ///
  /// * [bool] isPrivate:
  ///   Change whether the stream is a private stream. 
  ///
  /// * [bool] isAnnouncementOnly:
  ///   Whether the stream is limited to announcements.  **Changes**: Deprecated in Zulip 3.0 (feature level 1), use   `stream_post_policy` instead. 
  ///
  /// * [int] streamPostPolicy:
  ///   Policy for which users can post messages to the stream.  * 1 => Any user can post. * 2 => Only administrators can post. * 3 => Only full members can post. * 4 => Only moderators can post.  **Changes**: New in Zulip 3.0, replacing the previous `is_announcement_only` boolean. 
  ///
  /// * [bool] historyPublicToSubscribers:
  ///   Whether the stream's message history should be available to newly subscribed members, or users can only access messages they actually received while subscribed to the stream.  Corresponds to the [shared history](/help/stream-permissions) option in documentation. 
  ///
  /// * [OneOfstringinteger] messageRetentionDays:
  ///   Number of days that messages sent to this stream will be stored before being automatically deleted by the [message retention policy](/help/message-retention-policy).  Two special string format values are supported:  * \"realm_default\" => Return to the organization-level setting. * \"forever\" => Retain messages forever.  **Changes**: New in Zulip 3.0 (feature level 17). 
  Future<Response> updateStreamWithHttpInfo(int streamId, { String description, String newName, bool isPrivate, bool isAnnouncementOnly, int streamPostPolicy, bool historyPublicToSubscribers, OneOfstringinteger messageRetentionDays }) async {
    // Verify required params are set.
    if (streamId == null) {
     throw ApiException(HttpStatus.badRequest, 'Missing required param: streamId');
    }

    final path = r'/streams/{stream_id}'
      .replaceAll('{' + 'stream_id' + '}', streamId.toString());

    Object postBody;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

    if (description != null) {
      queryParams.addAll(_convertParametersForCollectionFormat('', 'description', description));
    }
    if (newName != null) {
      queryParams.addAll(_convertParametersForCollectionFormat('', 'new_name', newName));
    }
    if (isPrivate != null) {
      queryParams.addAll(_convertParametersForCollectionFormat('', 'is_private', isPrivate));
    }
    if (isAnnouncementOnly != null) {
      queryParams.addAll(_convertParametersForCollectionFormat('', 'is_announcement_only', isAnnouncementOnly));
    }
    if (streamPostPolicy != null) {
      queryParams.addAll(_convertParametersForCollectionFormat('', 'stream_post_policy', streamPostPolicy));
    }
    if (historyPublicToSubscribers != null) {
      queryParams.addAll(_convertParametersForCollectionFormat('', 'history_public_to_subscribers', historyPublicToSubscribers));
    }
    if (messageRetentionDays != null) {
      queryParams.addAll(_convertParametersForCollectionFormat('', 'message_retention_days', messageRetentionDays));
    }

    final contentTypes = <String>[];
    final nullableContentType = contentTypes.isNotEmpty ? contentTypes[0] : null;
    final authNames = <String>[];


    return await apiClient.invokeAPI(
      path,
      'PATCH',
      queryParams,
      postBody,
      headerParams,
      formParams,
      nullableContentType,
      authNames,
    );
  }

  /// Update a stream
  ///
  /// Configure the stream with the ID `stream_id`.  This endpoint supports an organization administrator editing any property of a stream, including:  * Stream [name](/help/rename-a-stream) and [description](/help/change-the-stream-description) * Stream [permissions](/help/stream-permissions), including [privacy](/help/change-the-privacy-of-a-stream) and [who can send](/help/stream-sending-policy).  `PATCH {{ api_url }}/v1/streams/{stream_id}` 
  ///
  /// Parameters:
  ///
  /// * [int] streamId (required):
  ///   The ID of the stream to access. 
  ///
  /// * [String] description:
  ///   The new description for the stream. Limited Zulip markdown is allowed in this field.  **Changes**: Removed unnecessary JSON-encoding of this parameter in Zulip 4.0 (feature level 64). 
  ///
  /// * [String] newName:
  ///   The new name for the stream.  **Changes**: Removed unnecessary JSON-encoding of this parameter in Zulip 4.0 (feature level 64). 
  ///
  /// * [bool] isPrivate:
  ///   Change whether the stream is a private stream. 
  ///
  /// * [bool] isAnnouncementOnly:
  ///   Whether the stream is limited to announcements.  **Changes**: Deprecated in Zulip 3.0 (feature level 1), use   `stream_post_policy` instead. 
  ///
  /// * [int] streamPostPolicy:
  ///   Policy for which users can post messages to the stream.  * 1 => Any user can post. * 2 => Only administrators can post. * 3 => Only full members can post. * 4 => Only moderators can post.  **Changes**: New in Zulip 3.0, replacing the previous `is_announcement_only` boolean. 
  ///
  /// * [bool] historyPublicToSubscribers:
  ///   Whether the stream's message history should be available to newly subscribed members, or users can only access messages they actually received while subscribed to the stream.  Corresponds to the [shared history](/help/stream-permissions) option in documentation. 
  ///
  /// * [OneOfstringinteger] messageRetentionDays:
  ///   Number of days that messages sent to this stream will be stored before being automatically deleted by the [message retention policy](/help/message-retention-policy).  Two special string format values are supported:  * \"realm_default\" => Return to the organization-level setting. * \"forever\" => Retain messages forever.  **Changes**: New in Zulip 3.0 (feature level 17). 
  Future<JsonSuccess> updateStream(int streamId, { String description, String newName, bool isPrivate, bool isAnnouncementOnly, int streamPostPolicy, bool historyPublicToSubscribers, OneOfstringinteger messageRetentionDays }) async {
    final response = await updateStreamWithHttpInfo(streamId,  description: description, newName: newName, isPrivate: isPrivate, isAnnouncementOnly: isAnnouncementOnly, streamPostPolicy: streamPostPolicy, historyPublicToSubscribers: historyPublicToSubscribers, messageRetentionDays: messageRetentionDays );
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body != null && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'JsonSuccess',) as JsonSuccess;
        }
    return Future<JsonSuccess>.value(null);
  }

  /// Update subscription settings
  ///
  /// This endpoint is used to update the user's personal settings for the streams they are subscribed to, including muting, color, pinning, and per-stream notification settings.  `POST {{ api_url }}/v1/users/me/subscriptions/properties` 
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [List<Object>] subscriptionData (required):
  ///   A list of objects that describe the changes that should be applied in each subscription. Each object represents a subscription, and must have a `stream_id` key that identifies the stream, as well as the `property` being modified and its new `value`.  The possible values for each `property` and `value` pairs are:  * `color` (string): the hex value of the user's display color for the stream. * `is_muted` (boolean): whether the stream is   [muted](/help/mute-a-stream).  Prior to Zulip 2.1, this feature was   represented by the more confusingly named `in_home_view` (with the   opposite value, `in_home_view=!is_muted`); for   backwards-compatibility, modern Zulip still accepts that value. * `pin_to_top` (boolean): whether to pin the stream at the top of the stream list. * `desktop_notifications` (boolean): whether to show desktop notifications     for all messages sent to the stream. * `audible_notifications` (boolean): whether to play a sound   notification for all messages sent to the stream. * `push_notifications` (boolean): whether to trigger a mobile push     notification for all messages sent to the stream. * `email_notifications` (boolean): whether to trigger an email     notification for all messages sent to the stream. 
  Future<Response> updateSubscriptionSettingsWithHttpInfo(List<Object> subscriptionData) async {
    // Verify required params are set.
    if (subscriptionData == null) {
     throw ApiException(HttpStatus.badRequest, 'Missing required param: subscriptionData');
    }

    final path = r'/users/me/subscriptions/properties';

    Object postBody;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

      queryParams.addAll(_convertParametersForCollectionFormat('multi', 'subscription_data', subscriptionData));

    final contentTypes = <String>[];
    final nullableContentType = contentTypes.isNotEmpty ? contentTypes[0] : null;
    final authNames = <String>[];


    return await apiClient.invokeAPI(
      path,
      'POST',
      queryParams,
      postBody,
      headerParams,
      formParams,
      nullableContentType,
      authNames,
    );
  }

  /// Update subscription settings
  ///
  /// This endpoint is used to update the user's personal settings for the streams they are subscribed to, including muting, color, pinning, and per-stream notification settings.  `POST {{ api_url }}/v1/users/me/subscriptions/properties` 
  ///
  /// Parameters:
  ///
  /// * [List<Object>] subscriptionData (required):
  ///   A list of objects that describe the changes that should be applied in each subscription. Each object represents a subscription, and must have a `stream_id` key that identifies the stream, as well as the `property` being modified and its new `value`.  The possible values for each `property` and `value` pairs are:  * `color` (string): the hex value of the user's display color for the stream. * `is_muted` (boolean): whether the stream is   [muted](/help/mute-a-stream).  Prior to Zulip 2.1, this feature was   represented by the more confusingly named `in_home_view` (with the   opposite value, `in_home_view=!is_muted`); for   backwards-compatibility, modern Zulip still accepts that value. * `pin_to_top` (boolean): whether to pin the stream at the top of the stream list. * `desktop_notifications` (boolean): whether to show desktop notifications     for all messages sent to the stream. * `audible_notifications` (boolean): whether to play a sound   notification for all messages sent to the stream. * `push_notifications` (boolean): whether to trigger a mobile push     notification for all messages sent to the stream. * `email_notifications` (boolean): whether to trigger an email     notification for all messages sent to the stream. 
  Future<JsonSuccessBase> updateSubscriptionSettings(List<Object> subscriptionData) async {
    final response = await updateSubscriptionSettingsWithHttpInfo(subscriptionData);
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body != null && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'JsonSuccessBase',) as JsonSuccessBase;
        }
    return Future<JsonSuccessBase>.value(null);
  }

  /// Update subscriptions
  ///
  /// Update which streams you are are subscribed to. 
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [List<String>] delete:
  ///   A list of stream names to unsubscribe from. 
  ///
  /// * [List<Object>] add:
  ///   A list of objects describing which streams to subscribe to, optionally including per-user subscription parameters (e.g. color) and if the stream is to be created, its description. 
  Future<Response> updateSubscriptionsWithHttpInfo({ List<String> delete, List<Object> add }) async {
    // Verify required params are set.

    final path = r'/users/me/subscriptions';

    Object postBody;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

    if (delete != null) {
      queryParams.addAll(_convertParametersForCollectionFormat('multi', 'delete', delete));
    }
    if (add != null) {
      queryParams.addAll(_convertParametersForCollectionFormat('multi', 'add', add));
    }

    final contentTypes = <String>[];
    final nullableContentType = contentTypes.isNotEmpty ? contentTypes[0] : null;
    final authNames = <String>[];


    return await apiClient.invokeAPI(
      path,
      'PATCH',
      queryParams,
      postBody,
      headerParams,
      formParams,
      nullableContentType,
      authNames,
    );
  }

  /// Update subscriptions
  ///
  /// Update which streams you are are subscribed to. 
  ///
  /// Parameters:
  ///
  /// * [List<String>] delete:
  ///   A list of stream names to unsubscribe from. 
  ///
  /// * [List<Object>] add:
  ///   A list of objects describing which streams to subscribe to, optionally including per-user subscription parameters (e.g. color) and if the stream is to be created, its description. 
  Future<JsonSuccessBase> updateSubscriptions({ List<String> delete, List<Object> add }) async {
    final response = await updateSubscriptionsWithHttpInfo( delete: delete, add: add );
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body != null && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'JsonSuccessBase',) as JsonSuccessBase;
        }
    return Future<JsonSuccessBase>.value(null);
  }
}
