//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.7

// ignore_for_file: unused_import

import 'dart:async';
import 'package:dio/dio.dart';
import 'package:built_value/serializer.dart';

import 'package:built_collection/built_collection.dart';
import 'package:built_value/json_object.dart';
import 'package:openapi/model/coded_error.dart';
import 'package:openapi/model/json_error.dart';
import 'package:openapi/model/json_success.dart';
import 'package:openapi/model/json_success_base.dart';
import 'package:openapi/model/non_existing_stream_error.dart';
import 'package:openapi/model/one_ofobjectobject.dart';
import 'package:openapi/model/one_ofstringinteger.dart';

class StreamsApi {

  final Dio _dio;

  final Serializers _serializers;

  const StreamsApi(this._dio, this._serializers);

  /// Archive a stream
  ///
  /// [Archive the stream](/help/archive-a-stream) with the ID `stream_id`.  `DELETE {{ api_url }}/v1/streams/{stream_id}` 
  Future<Response<JsonSuccess>> archiveStream(
    int streamId, { 
    CancelToken cancelToken,
    Map<String, dynamic> headers,
    Map<String, dynamic> extra,
    ValidateStatus validateStatus,
    ProgressCallback onSendProgress,
    ProgressCallback onReceiveProgress,
  }) async {
    final _request = RequestOptions(
      path: r'/streams/{stream_id}'.replaceAll('{' r'stream_id' '}', streamId.toString()),
      method: 'DELETE',
      headers: <String, dynamic>{
        ...?headers,
      },
      extra: <String, dynamic>{
        'secure': <Map<String, String>>[],
        ...?extra,
      },
      validateStatus: validateStatus,
      contentType: 'application/json',
      cancelToken: cancelToken,
      onSendProgress: onSendProgress,
      onReceiveProgress: onReceiveProgress,
    );

    dynamic _bodyData;

    final _response = await _dio.request<dynamic>(
      _request.path,
      data: _bodyData,
      options: _request,
    );

    const _responseType = FullType(JsonSuccess);
    final _responseData = _serializers.deserialize(
      _response.data,
      specifiedType: _responseType,
    ) as JsonSuccess;

    return Response<JsonSuccess>(
      data: _responseData,
      headers: _response.headers,
      isRedirect: _response.isRedirect,
      request: _response.request,
      redirects: _response.redirects,
      statusCode: _response.statusCode,
      statusMessage: _response.statusMessage,
      extra: _response.extra,
    );
  }

  /// Create BigBlueButton video call
  ///
  /// Create a video call URL for a BigBlueButton video call. Requires BigBlueButton to be configured on the Zulip server. 
  Future<Response<JsonSuccessBase>> createBigBlueButtonVideoCall({ 
    CancelToken cancelToken,
    Map<String, dynamic> headers,
    Map<String, dynamic> extra,
    ValidateStatus validateStatus,
    ProgressCallback onSendProgress,
    ProgressCallback onReceiveProgress,
  }) async {
    final _request = RequestOptions(
      path: r'/calls/bigbluebutton/create',
      method: 'GET',
      headers: <String, dynamic>{
        ...?headers,
      },
      extra: <String, dynamic>{
        'secure': <Map<String, String>>[],
        ...?extra,
      },
      validateStatus: validateStatus,
      contentType: 'application/json',
      cancelToken: cancelToken,
      onSendProgress: onSendProgress,
      onReceiveProgress: onReceiveProgress,
    );

    dynamic _bodyData;

    final _response = await _dio.request<dynamic>(
      _request.path,
      data: _bodyData,
      options: _request,
    );

    const _responseType = FullType(JsonSuccessBase);
    final _responseData = _serializers.deserialize(
      _response.data,
      specifiedType: _responseType,
    ) as JsonSuccessBase;

    return Response<JsonSuccessBase>(
      data: _responseData,
      headers: _response.headers,
      isRedirect: _response.isRedirect,
      request: _response.request,
      redirects: _response.redirects,
      statusCode: _response.statusCode,
      statusMessage: _response.statusMessage,
      extra: _response.extra,
    );
  }

  /// Delete a topic
  ///
  /// Delete all messages in a topic.  `POST {{ api_url }}/v1/streams/{stream_id}/delete_topic`  Topics are a field on messages (not an independent data structure), so deleting all the messages in the topic deletes the topic from Zulip. 
  Future<Response<JsonSuccess>> deleteTopic(
    int streamId,
    String topicName, { 
    CancelToken cancelToken,
    Map<String, dynamic> headers,
    Map<String, dynamic> extra,
    ValidateStatus validateStatus,
    ProgressCallback onSendProgress,
    ProgressCallback onReceiveProgress,
  }) async {
    final _request = RequestOptions(
      path: r'/streams/{stream_id}/delete_topic'.replaceAll('{' r'stream_id' '}', streamId.toString()),
      method: 'POST',
      headers: <String, dynamic>{
        ...?headers,
      },
      queryParameters: <String, dynamic>{
        r'topic_name': topicName,
      },
      extra: <String, dynamic>{
        'secure': <Map<String, String>>[],
        ...?extra,
      },
      validateStatus: validateStatus,
      contentType: 'application/json',
      cancelToken: cancelToken,
      onSendProgress: onSendProgress,
      onReceiveProgress: onReceiveProgress,
    );

    dynamic _bodyData;

    final _response = await _dio.request<dynamic>(
      _request.path,
      data: _bodyData,
      options: _request,
    );

    const _responseType = FullType(JsonSuccess);
    final _responseData = _serializers.deserialize(
      _response.data,
      specifiedType: _responseType,
    ) as JsonSuccess;

    return Response<JsonSuccess>(
      data: _responseData,
      headers: _response.headers,
      isRedirect: _response.isRedirect,
      request: _response.request,
      redirects: _response.redirects,
      statusCode: _response.statusCode,
      statusMessage: _response.statusMessage,
      extra: _response.extra,
    );
  }

  /// Get stream ID
  ///
  /// Get the unique ID of a given stream.  `GET {{ api_url }}/v1/get_stream_id` 
  Future<Response<JsonSuccessBase>> getStreamId(
    String stream, { 
    CancelToken cancelToken,
    Map<String, dynamic> headers,
    Map<String, dynamic> extra,
    ValidateStatus validateStatus,
    ProgressCallback onSendProgress,
    ProgressCallback onReceiveProgress,
  }) async {
    final _request = RequestOptions(
      path: r'/get_stream_id',
      method: 'GET',
      headers: <String, dynamic>{
        ...?headers,
      },
      queryParameters: <String, dynamic>{
        r'stream': stream,
      },
      extra: <String, dynamic>{
        'secure': <Map<String, String>>[],
        ...?extra,
      },
      validateStatus: validateStatus,
      contentType: 'application/json',
      cancelToken: cancelToken,
      onSendProgress: onSendProgress,
      onReceiveProgress: onReceiveProgress,
    );

    dynamic _bodyData;

    final _response = await _dio.request<dynamic>(
      _request.path,
      data: _bodyData,
      options: _request,
    );

    const _responseType = FullType(JsonSuccessBase);
    final _responseData = _serializers.deserialize(
      _response.data,
      specifiedType: _responseType,
    ) as JsonSuccessBase;

    return Response<JsonSuccessBase>(
      data: _responseData,
      headers: _response.headers,
      isRedirect: _response.isRedirect,
      request: _response.request,
      redirects: _response.redirects,
      statusCode: _response.statusCode,
      statusMessage: _response.statusMessage,
      extra: _response.extra,
    );
  }

  /// Get topics in a stream
  ///
  /// Get all the topics in a specific stream  `GET {{ api_url }}/v1/users/me/{stream_id}/topics` 
  Future<Response<JsonSuccessBase>> getStreamTopics(
    int streamId, { 
    CancelToken cancelToken,
    Map<String, dynamic> headers,
    Map<String, dynamic> extra,
    ValidateStatus validateStatus,
    ProgressCallback onSendProgress,
    ProgressCallback onReceiveProgress,
  }) async {
    final _request = RequestOptions(
      path: r'/users/me/{stream_id}/topics'.replaceAll('{' r'stream_id' '}', streamId.toString()),
      method: 'GET',
      headers: <String, dynamic>{
        ...?headers,
      },
      extra: <String, dynamic>{
        'secure': <Map<String, String>>[],
        ...?extra,
      },
      validateStatus: validateStatus,
      contentType: 'application/json',
      cancelToken: cancelToken,
      onSendProgress: onSendProgress,
      onReceiveProgress: onReceiveProgress,
    );

    dynamic _bodyData;

    final _response = await _dio.request<dynamic>(
      _request.path,
      data: _bodyData,
      options: _request,
    );

    const _responseType = FullType(JsonSuccessBase);
    final _responseData = _serializers.deserialize(
      _response.data,
      specifiedType: _responseType,
    ) as JsonSuccessBase;

    return Response<JsonSuccessBase>(
      data: _responseData,
      headers: _response.headers,
      isRedirect: _response.isRedirect,
      request: _response.request,
      redirects: _response.redirects,
      statusCode: _response.statusCode,
      statusMessage: _response.statusMessage,
      extra: _response.extra,
    );
  }

  /// Get all streams
  ///
  /// Get all streams that the user has access to.  `GET {{ api_url }}/v1/streams` 
  Future<Response<JsonSuccessBase>> getStreams({ 
    bool includePublic,
    bool includeWebPublic,
    bool includeSubscribed,
    bool includeAllActive,
    bool includeDefault,
    bool includeOwnerSubscribed,
    CancelToken cancelToken,
    Map<String, dynamic> headers,
    Map<String, dynamic> extra,
    ValidateStatus validateStatus,
    ProgressCallback onSendProgress,
    ProgressCallback onReceiveProgress,
  }) async {
    final _request = RequestOptions(
      path: r'/streams',
      method: 'GET',
      headers: <String, dynamic>{
        ...?headers,
      },
      queryParameters: <String, dynamic>{
        if (includePublic != null) r'include_public': includePublic,
        if (includeWebPublic != null) r'include_web_public': includeWebPublic,
        if (includeSubscribed != null) r'include_subscribed': includeSubscribed,
        if (includeAllActive != null) r'include_all_active': includeAllActive,
        if (includeDefault != null) r'include_default': includeDefault,
        if (includeOwnerSubscribed != null) r'include_owner_subscribed': includeOwnerSubscribed,
      },
      extra: <String, dynamic>{
        'secure': <Map<String, String>>[],
        ...?extra,
      },
      validateStatus: validateStatus,
      contentType: 'application/json',
      cancelToken: cancelToken,
      onSendProgress: onSendProgress,
      onReceiveProgress: onReceiveProgress,
    );

    dynamic _bodyData;

    final _response = await _dio.request<dynamic>(
      _request.path,
      data: _bodyData,
      options: _request,
    );

    const _responseType = FullType(JsonSuccessBase);
    final _responseData = _serializers.deserialize(
      _response.data,
      specifiedType: _responseType,
    ) as JsonSuccessBase;

    return Response<JsonSuccessBase>(
      data: _responseData,
      headers: _response.headers,
      isRedirect: _response.isRedirect,
      request: _response.request,
      redirects: _response.redirects,
      statusCode: _response.statusCode,
      statusMessage: _response.statusMessage,
      extra: _response.extra,
    );
  }

  /// Get the subscribers of a stream
  ///
  /// Get all users subscribed to a stream.  `Get {{ api_url }}/v1/streams/{stream_id}/members` 
  Future<Response<JsonSuccessBase>> getSubscribers(
    int streamId, { 
    CancelToken cancelToken,
    Map<String, dynamic> headers,
    Map<String, dynamic> extra,
    ValidateStatus validateStatus,
    ProgressCallback onSendProgress,
    ProgressCallback onReceiveProgress,
  }) async {
    final _request = RequestOptions(
      path: r'/streams/{stream_id}/members'.replaceAll('{' r'stream_id' '}', streamId.toString()),
      method: 'GET',
      headers: <String, dynamic>{
        ...?headers,
      },
      extra: <String, dynamic>{
        'secure': <Map<String, String>>[],
        ...?extra,
      },
      validateStatus: validateStatus,
      contentType: 'application/json',
      cancelToken: cancelToken,
      onSendProgress: onSendProgress,
      onReceiveProgress: onReceiveProgress,
    );

    dynamic _bodyData;

    final _response = await _dio.request<dynamic>(
      _request.path,
      data: _bodyData,
      options: _request,
    );

    const _responseType = FullType(JsonSuccessBase);
    final _responseData = _serializers.deserialize(
      _response.data,
      specifiedType: _responseType,
    ) as JsonSuccessBase;

    return Response<JsonSuccessBase>(
      data: _responseData,
      headers: _response.headers,
      isRedirect: _response.isRedirect,
      request: _response.request,
      redirects: _response.redirects,
      statusCode: _response.statusCode,
      statusMessage: _response.statusMessage,
      extra: _response.extra,
    );
  }

  /// Get subscription status
  ///
  /// Check whether a user is subscribed to a stream.  `GET {{ api_url }}/v1/users/{user_id}/subscriptions/{stream_id}`  **Changes**: New in Zulip 3.0 (feature level 11). 
  Future<Response<JsonSuccessBase>> getSubscriptionStatus(
    int userId,
    int streamId, { 
    CancelToken cancelToken,
    Map<String, dynamic> headers,
    Map<String, dynamic> extra,
    ValidateStatus validateStatus,
    ProgressCallback onSendProgress,
    ProgressCallback onReceiveProgress,
  }) async {
    final _request = RequestOptions(
      path: r'/users/{user_id}/subscriptions/{stream_id}'.replaceAll('{' r'user_id' '}', userId.toString()).replaceAll('{' r'stream_id' '}', streamId.toString()),
      method: 'GET',
      headers: <String, dynamic>{
        ...?headers,
      },
      extra: <String, dynamic>{
        'secure': <Map<String, String>>[],
        ...?extra,
      },
      validateStatus: validateStatus,
      contentType: 'application/json',
      cancelToken: cancelToken,
      onSendProgress: onSendProgress,
      onReceiveProgress: onReceiveProgress,
    );

    dynamic _bodyData;

    final _response = await _dio.request<dynamic>(
      _request.path,
      data: _bodyData,
      options: _request,
    );

    const _responseType = FullType(JsonSuccessBase);
    final _responseData = _serializers.deserialize(
      _response.data,
      specifiedType: _responseType,
    ) as JsonSuccessBase;

    return Response<JsonSuccessBase>(
      data: _responseData,
      headers: _response.headers,
      isRedirect: _response.isRedirect,
      request: _response.request,
      redirects: _response.redirects,
      statusCode: _response.statusCode,
      statusMessage: _response.statusMessage,
      extra: _response.extra,
    );
  }

  /// Get subscribed streams
  ///
  /// Get all streams that the user is subscribed to.  `GET {{ api_url }}/v1/users/me/subscriptions` 
  Future<Response<JsonSuccessBase>> getSubscriptions({ 
    bool includeSubscribers,
    CancelToken cancelToken,
    Map<String, dynamic> headers,
    Map<String, dynamic> extra,
    ValidateStatus validateStatus,
    ProgressCallback onSendProgress,
    ProgressCallback onReceiveProgress,
  }) async {
    final _request = RequestOptions(
      path: r'/users/me/subscriptions',
      method: 'GET',
      headers: <String, dynamic>{
        ...?headers,
      },
      queryParameters: <String, dynamic>{
        if (includeSubscribers != null) r'include_subscribers': includeSubscribers,
      },
      extra: <String, dynamic>{
        'secure': <Map<String, String>>[],
        ...?extra,
      },
      validateStatus: validateStatus,
      contentType: 'application/json',
      cancelToken: cancelToken,
      onSendProgress: onSendProgress,
      onReceiveProgress: onReceiveProgress,
    );

    dynamic _bodyData;

    final _response = await _dio.request<dynamic>(
      _request.path,
      data: _bodyData,
      options: _request,
    );

    const _responseType = FullType(JsonSuccessBase);
    final _responseData = _serializers.deserialize(
      _response.data,
      specifiedType: _responseType,
    ) as JsonSuccessBase;

    return Response<JsonSuccessBase>(
      data: _responseData,
      headers: _response.headers,
      isRedirect: _response.isRedirect,
      request: _response.request,
      redirects: _response.redirects,
      statusCode: _response.statusCode,
      statusMessage: _response.statusMessage,
      extra: _response.extra,
    );
  }

  /// Topic muting
  ///
  /// This endpoint mutes/unmutes a topic within a stream that the current user is subscribed to.  Muted topics are displayed faded in the Zulip UI, and are not included in the user's unread count totals.  `PATCH {{ api_url }}/v1/users/me/subscriptions/muted_topics` 
  Future<Response<JsonSuccess>> muteTopic(
    String topic,
    String op, { 
    String stream,
    int streamId,
    CancelToken cancelToken,
    Map<String, dynamic> headers,
    Map<String, dynamic> extra,
    ValidateStatus validateStatus,
    ProgressCallback onSendProgress,
    ProgressCallback onReceiveProgress,
  }) async {
    final _request = RequestOptions(
      path: r'/users/me/subscriptions/muted_topics',
      method: 'PATCH',
      headers: <String, dynamic>{
        ...?headers,
      },
      queryParameters: <String, dynamic>{
        if (stream != null) r'stream': stream,
        if (streamId != null) r'stream_id': streamId,
        r'topic': topic,
        r'op': op,
      },
      extra: <String, dynamic>{
        'secure': <Map<String, String>>[],
        ...?extra,
      },
      validateStatus: validateStatus,
      contentType: 'application/json',
      cancelToken: cancelToken,
      onSendProgress: onSendProgress,
      onReceiveProgress: onReceiveProgress,
    );

    dynamic _bodyData;

    final _response = await _dio.request<dynamic>(
      _request.path,
      data: _bodyData,
      options: _request,
    );

    const _responseType = FullType(JsonSuccess);
    final _responseData = _serializers.deserialize(
      _response.data,
      specifiedType: _responseType,
    ) as JsonSuccess;

    return Response<JsonSuccess>(
      data: _responseData,
      headers: _response.headers,
      isRedirect: _response.isRedirect,
      request: _response.request,
      redirects: _response.redirects,
      statusCode: _response.statusCode,
      statusMessage: _response.statusMessage,
      extra: _response.extra,
    );
  }

  /// Subscribe to a stream
  ///
  /// Subscribe one or more users to one or more streams.  `POST {{ api_url }}/v1/users/me/subscriptions`  If any of the specified streams do not exist, they are automatically created.  The initial [stream settings](/api/update-stream) will be determined by the optional parameters like `invite_only` detailed below. 
  Future<Response<OneOfobjectobject>> subscribe(
    BuiltList<JsonObject> subscriptions, { 
    BuiltList<OneOfstringinteger> principals,
    bool authorizationErrorsFatal,
    bool announce,
    bool inviteOnly,
    bool historyPublicToSubscribers,
    int streamPostPolicy,
    OneOfstringinteger messageRetentionDays,
    CancelToken cancelToken,
    Map<String, dynamic> headers,
    Map<String, dynamic> extra,
    ValidateStatus validateStatus,
    ProgressCallback onSendProgress,
    ProgressCallback onReceiveProgress,
  }) async {
    final _request = RequestOptions(
      path: r'/users/me/subscriptions',
      method: 'POST',
      headers: <String, dynamic>{
        ...?headers,
      },
      queryParameters: <String, dynamic>{
        r'subscriptions': subscriptions,
        if (principals != null) r'principals': principals,
        if (authorizationErrorsFatal != null) r'authorization_errors_fatal': authorizationErrorsFatal,
        if (announce != null) r'announce': announce,
        if (inviteOnly != null) r'invite_only': inviteOnly,
        if (historyPublicToSubscribers != null) r'history_public_to_subscribers': historyPublicToSubscribers,
        if (streamPostPolicy != null) r'stream_post_policy': streamPostPolicy,
        if (messageRetentionDays != null) r'message_retention_days': messageRetentionDays,
      },
      extra: <String, dynamic>{
        'secure': <Map<String, String>>[],
        ...?extra,
      },
      validateStatus: validateStatus,
      contentType: 'application/json',
      cancelToken: cancelToken,
      onSendProgress: onSendProgress,
      onReceiveProgress: onReceiveProgress,
    );

    dynamic _bodyData;

    final _response = await _dio.request<dynamic>(
      _request.path,
      data: _bodyData,
      options: _request,
    );

    const _responseType = FullType(OneOfobjectobject);
    final _responseData = _serializers.deserialize(
      _response.data,
      specifiedType: _responseType,
    ) as OneOfobjectobject;

    return Response<OneOfobjectobject>(
      data: _responseData,
      headers: _response.headers,
      isRedirect: _response.isRedirect,
      request: _response.request,
      redirects: _response.redirects,
      statusCode: _response.statusCode,
      statusMessage: _response.statusMessage,
      extra: _response.extra,
    );
  }

  /// Unsubscribe from a stream
  ///
  /// Unsubscribe yourself or other users from one or more streams.  `DELETE {{ api_url }}/v1/users/me/subscriptions` 
  Future<Response<JsonSuccessBase>> unsubscribe(
    BuiltList<String> subscriptions, { 
    BuiltList<OneOfstringinteger> principals,
    CancelToken cancelToken,
    Map<String, dynamic> headers,
    Map<String, dynamic> extra,
    ValidateStatus validateStatus,
    ProgressCallback onSendProgress,
    ProgressCallback onReceiveProgress,
  }) async {
    final _request = RequestOptions(
      path: r'/users/me/subscriptions',
      method: 'DELETE',
      headers: <String, dynamic>{
        ...?headers,
      },
      queryParameters: <String, dynamic>{
        r'subscriptions': subscriptions,
        if (principals != null) r'principals': principals,
      },
      extra: <String, dynamic>{
        'secure': <Map<String, String>>[],
        ...?extra,
      },
      validateStatus: validateStatus,
      contentType: 'application/json',
      cancelToken: cancelToken,
      onSendProgress: onSendProgress,
      onReceiveProgress: onReceiveProgress,
    );

    dynamic _bodyData;

    final _response = await _dio.request<dynamic>(
      _request.path,
      data: _bodyData,
      options: _request,
    );

    const _responseType = FullType(JsonSuccessBase);
    final _responseData = _serializers.deserialize(
      _response.data,
      specifiedType: _responseType,
    ) as JsonSuccessBase;

    return Response<JsonSuccessBase>(
      data: _responseData,
      headers: _response.headers,
      isRedirect: _response.isRedirect,
      request: _response.request,
      redirects: _response.redirects,
      statusCode: _response.statusCode,
      statusMessage: _response.statusMessage,
      extra: _response.extra,
    );
  }

  /// Update a stream
  ///
  /// Configure the stream with the ID `stream_id`.  This endpoint supports an organization administrator editing any property of a stream, including:  * Stream [name](/help/rename-a-stream) and [description](/help/change-the-stream-description) * Stream [permissions](/help/stream-permissions), including [privacy](/help/change-the-privacy-of-a-stream) and [who can send](/help/stream-sending-policy).  `PATCH {{ api_url }}/v1/streams/{stream_id}` 
  Future<Response<JsonSuccess>> updateStream(
    int streamId, { 
    String description,
    String newName,
    bool isPrivate,
    bool isAnnouncementOnly,
    int streamPostPolicy,
    bool historyPublicToSubscribers,
    OneOfstringinteger messageRetentionDays,
    CancelToken cancelToken,
    Map<String, dynamic> headers,
    Map<String, dynamic> extra,
    ValidateStatus validateStatus,
    ProgressCallback onSendProgress,
    ProgressCallback onReceiveProgress,
  }) async {
    final _request = RequestOptions(
      path: r'/streams/{stream_id}'.replaceAll('{' r'stream_id' '}', streamId.toString()),
      method: 'PATCH',
      headers: <String, dynamic>{
        ...?headers,
      },
      queryParameters: <String, dynamic>{
        if (description != null) r'description': description,
        if (newName != null) r'new_name': newName,
        if (isPrivate != null) r'is_private': isPrivate,
        if (isAnnouncementOnly != null) r'is_announcement_only': isAnnouncementOnly,
        if (streamPostPolicy != null) r'stream_post_policy': streamPostPolicy,
        if (historyPublicToSubscribers != null) r'history_public_to_subscribers': historyPublicToSubscribers,
        if (messageRetentionDays != null) r'message_retention_days': messageRetentionDays,
      },
      extra: <String, dynamic>{
        'secure': <Map<String, String>>[],
        ...?extra,
      },
      validateStatus: validateStatus,
      contentType: 'application/json',
      cancelToken: cancelToken,
      onSendProgress: onSendProgress,
      onReceiveProgress: onReceiveProgress,
    );

    dynamic _bodyData;

    final _response = await _dio.request<dynamic>(
      _request.path,
      data: _bodyData,
      options: _request,
    );

    const _responseType = FullType(JsonSuccess);
    final _responseData = _serializers.deserialize(
      _response.data,
      specifiedType: _responseType,
    ) as JsonSuccess;

    return Response<JsonSuccess>(
      data: _responseData,
      headers: _response.headers,
      isRedirect: _response.isRedirect,
      request: _response.request,
      redirects: _response.redirects,
      statusCode: _response.statusCode,
      statusMessage: _response.statusMessage,
      extra: _response.extra,
    );
  }

  /// Update subscription settings
  ///
  /// This endpoint is used to update the user's personal settings for the streams they are subscribed to, including muting, color, pinning, and per-stream notification settings.  `POST {{ api_url }}/v1/users/me/subscriptions/properties` 
  Future<Response<JsonSuccessBase>> updateSubscriptionSettings(
    BuiltList<JsonObject> subscriptionData, { 
    CancelToken cancelToken,
    Map<String, dynamic> headers,
    Map<String, dynamic> extra,
    ValidateStatus validateStatus,
    ProgressCallback onSendProgress,
    ProgressCallback onReceiveProgress,
  }) async {
    final _request = RequestOptions(
      path: r'/users/me/subscriptions/properties',
      method: 'POST',
      headers: <String, dynamic>{
        ...?headers,
      },
      queryParameters: <String, dynamic>{
        r'subscription_data': subscriptionData,
      },
      extra: <String, dynamic>{
        'secure': <Map<String, String>>[],
        ...?extra,
      },
      validateStatus: validateStatus,
      contentType: 'application/json',
      cancelToken: cancelToken,
      onSendProgress: onSendProgress,
      onReceiveProgress: onReceiveProgress,
    );

    dynamic _bodyData;

    final _response = await _dio.request<dynamic>(
      _request.path,
      data: _bodyData,
      options: _request,
    );

    const _responseType = FullType(JsonSuccessBase);
    final _responseData = _serializers.deserialize(
      _response.data,
      specifiedType: _responseType,
    ) as JsonSuccessBase;

    return Response<JsonSuccessBase>(
      data: _responseData,
      headers: _response.headers,
      isRedirect: _response.isRedirect,
      request: _response.request,
      redirects: _response.redirects,
      statusCode: _response.statusCode,
      statusMessage: _response.statusMessage,
      extra: _response.extra,
    );
  }

  /// Update subscriptions
  ///
  /// Update which streams you are are subscribed to. 
  Future<Response<JsonSuccessBase>> updateSubscriptions({ 
    BuiltList<String> delete,
    BuiltList<JsonObject> add,
    CancelToken cancelToken,
    Map<String, dynamic> headers,
    Map<String, dynamic> extra,
    ValidateStatus validateStatus,
    ProgressCallback onSendProgress,
    ProgressCallback onReceiveProgress,
  }) async {
    final _request = RequestOptions(
      path: r'/users/me/subscriptions',
      method: 'PATCH',
      headers: <String, dynamic>{
        ...?headers,
      },
      queryParameters: <String, dynamic>{
        if (delete != null) r'delete': delete,
        if (add != null) r'add': add,
      },
      extra: <String, dynamic>{
        'secure': <Map<String, String>>[],
        ...?extra,
      },
      validateStatus: validateStatus,
      contentType: 'application/json',
      cancelToken: cancelToken,
      onSendProgress: onSendProgress,
      onReceiveProgress: onReceiveProgress,
    );

    dynamic _bodyData;

    final _response = await _dio.request<dynamic>(
      _request.path,
      data: _bodyData,
      options: _request,
    );

    const _responseType = FullType(JsonSuccessBase);
    final _responseData = _serializers.deserialize(
      _response.data,
      specifiedType: _responseType,
    ) as JsonSuccessBase;

    return Response<JsonSuccessBase>(
      data: _responseData,
      headers: _response.headers,
      isRedirect: _response.isRedirect,
      request: _response.request,
      redirects: _response.redirects,
      statusCode: _response.statusCode,
      statusMessage: _response.statusMessage,
      extra: _response.extra,
    );
  }

}
