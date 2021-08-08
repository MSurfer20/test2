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
import 'package:openapi/model/one_ofobjectobject.dart';
import 'package:openapi/model/one_ofobjectobjectobject.dart';

class UsersApi {

  final Dio _dio;

  final Serializers _serializers;

  const UsersApi(this._dio, this._serializers);

  /// Create a user
  ///
  /// {!can-create-users-only.md!}  Create a new user account via the API.  `POST {{ api_url }}/v1/users` 
  Future<Response<JsonSuccessBase>> createUser(
    String email,
    String password,
    String fullName, { 
    CancelToken cancelToken,
    Map<String, dynamic> headers,
    Map<String, dynamic> extra,
    ValidateStatus validateStatus,
    ProgressCallback onSendProgress,
    ProgressCallback onReceiveProgress,
  }) async {
    final _request = RequestOptions(
      path: r'/users',
      method: 'POST',
      headers: <String, dynamic>{
        ...?headers,
      },
      queryParameters: <String, dynamic>{
        r'email': email,
        r'password': password,
        r'full_name': fullName,
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

  /// Create a user group
  ///
  /// Create a new [user group](/help/user-groups).  `POST {{ api_url }}/v1/user_groups/create` 
  Future<Response<JsonSuccess>> createUserGroup(
    String name,
    String description,
    BuiltList<int> members, { 
    CancelToken cancelToken,
    Map<String, dynamic> headers,
    Map<String, dynamic> extra,
    ValidateStatus validateStatus,
    ProgressCallback onSendProgress,
    ProgressCallback onReceiveProgress,
  }) async {
    final _request = RequestOptions(
      path: r'/user_groups/create',
      method: 'POST',
      headers: <String, dynamic>{
        ...?headers,
      },
      queryParameters: <String, dynamic>{
        r'name': name,
        r'description': description,
        r'members': members,
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

  /// Deactivate own user
  ///
  /// Deactivates the user's account.  See also the administrative endpoint for [deactivating another user](/api/deactivate-user).  `DELETE {{ api_url }}/v1/users/me`  This endpoint is primarily useful to Zulip clients providing a user settings UI. 
  Future<Response<JsonSuccess>> deactivateOwnUser({ 
    CancelToken cancelToken,
    Map<String, dynamic> headers,
    Map<String, dynamic> extra,
    ValidateStatus validateStatus,
    ProgressCallback onSendProgress,
    ProgressCallback onReceiveProgress,
  }) async {
    final _request = RequestOptions(
      path: r'/users/me',
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

  /// Deactivate a user
  ///
  /// [Deactivates a user](https://zulip.com/help/deactivate-or-reactivate-a-user) given their user ID.  `DELETE {{ api_url }}/v1/users/{user_id}` 
  Future<Response<JsonSuccess>> deactivateUser(
    int userId, { 
    CancelToken cancelToken,
    Map<String, dynamic> headers,
    Map<String, dynamic> extra,
    ValidateStatus validateStatus,
    ProgressCallback onSendProgress,
    ProgressCallback onReceiveProgress,
  }) async {
    final _request = RequestOptions(
      path: r'/users/{user_id}'.replaceAll('{' r'user_id' '}', userId.toString()),
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

  /// Get attachments
  ///
  /// Fetch metadata on files uploaded by the requesting user.  `GET {{ api_url }}/v1/attachments` 
  Future<Response<JsonSuccessBase>> getAttachments({ 
    CancelToken cancelToken,
    Map<String, dynamic> headers,
    Map<String, dynamic> extra,
    ValidateStatus validateStatus,
    ProgressCallback onSendProgress,
    ProgressCallback onReceiveProgress,
  }) async {
    final _request = RequestOptions(
      path: r'/attachments',
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

  /// Get own user
  ///
  /// Get basic data about the user/bot that requests this endpoint.  `GET {{ api_url }}/v1/users/me` 
  Future<Response<JsonSuccessBase>> getOwnUser({ 
    CancelToken cancelToken,
    Map<String, dynamic> headers,
    Map<String, dynamic> extra,
    ValidateStatus validateStatus,
    ProgressCallback onSendProgress,
    ProgressCallback onReceiveProgress,
  }) async {
    final _request = RequestOptions(
      path: r'/users/me',
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

  /// Get a user
  ///
  /// Fetch details for a single user in the organization.  `GET {{ api_url }}/v1/users/{user_id}`  You can also fetch details on [all users in the organization](/api/get-users) or [by email](/api/get-user-by-email).  *This endpoint is new in Zulip Server 3.0 (feature level 1).* 
  Future<Response<JsonSuccessBase>> getUser(
    int userId, { 
    bool clientGravatar,
    bool includeCustomProfileFields,
    CancelToken cancelToken,
    Map<String, dynamic> headers,
    Map<String, dynamic> extra,
    ValidateStatus validateStatus,
    ProgressCallback onSendProgress,
    ProgressCallback onReceiveProgress,
  }) async {
    final _request = RequestOptions(
      path: r'/users/{user_id}'.replaceAll('{' r'user_id' '}', userId.toString()),
      method: 'GET',
      headers: <String, dynamic>{
        ...?headers,
      },
      queryParameters: <String, dynamic>{
        if (clientGravatar != null) r'client_gravatar': clientGravatar,
        if (includeCustomProfileFields != null) r'include_custom_profile_fields': includeCustomProfileFields,
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

  /// Get a user by email
  ///
  /// Fetch details for a single user in the organization given a Zulip display email address.  `GET {{ api_url }}/v1/users/{email}`  Note that this endpoint uses Zulip display emails addresses for organizations that have configured limited [email address visibility](/help/restrict-visibility-of-email-addresses).  You can also fetch details on [all users in the organization](/api/get-users) or [by user ID](/api/get-user).  Fetching by user ID is generally recommended when possible, as users can [change their email address](/help/change-your-email-address).  *This endpoint is new in Zulip Server 4.0 (feature level 39).* 
  Future<Response<JsonSuccessBase>> getUserByEmail(
    String email, { 
    bool clientGravatar,
    bool includeCustomProfileFields,
    CancelToken cancelToken,
    Map<String, dynamic> headers,
    Map<String, dynamic> extra,
    ValidateStatus validateStatus,
    ProgressCallback onSendProgress,
    ProgressCallback onReceiveProgress,
  }) async {
    final _request = RequestOptions(
      path: r'/users/{email}'.replaceAll('{' r'email' '}', email.toString()),
      method: 'GET',
      headers: <String, dynamic>{
        ...?headers,
      },
      queryParameters: <String, dynamic>{
        if (clientGravatar != null) r'client_gravatar': clientGravatar,
        if (includeCustomProfileFields != null) r'include_custom_profile_fields': includeCustomProfileFields,
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

  /// Get user groups
  ///
  /// {!api-members-only.md!}  Fetches all of the user groups in the organization.  `GET {{ api_url }}/v1/user_groups` 
  Future<Response<JsonSuccessBase>> getUserGroups({ 
    CancelToken cancelToken,
    Map<String, dynamic> headers,
    Map<String, dynamic> extra,
    ValidateStatus validateStatus,
    ProgressCallback onSendProgress,
    ProgressCallback onReceiveProgress,
  }) async {
    final _request = RequestOptions(
      path: r'/user_groups',
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

  /// Get user presence
  ///
  /// Get the presence status for a specific user.  This endpoint is most useful for embedding data about a user's presence status in other sites (E.g. an employee directory).  Full Zulip clients like mobile/desktop apps will want to use the main presence endpoint, which returns data for all active users in the organization, instead.  `GET {{ api_url }}/v1/users/{user_id_or_email}/presence`  See [Zulip's developer documentation](https://zulip.readthedocs.io/en/latest/subsystems/presence.html) for details on the data model for presence in Zulip. 
  Future<Response<JsonSuccessBase>> getUserPresence(
    String userIdOrEmail, { 
    CancelToken cancelToken,
    Map<String, dynamic> headers,
    Map<String, dynamic> extra,
    ValidateStatus validateStatus,
    ProgressCallback onSendProgress,
    ProgressCallback onReceiveProgress,
  }) async {
    final _request = RequestOptions(
      path: r'/users/{user_id_or_email}/presence'.replaceAll('{' r'user_id_or_email' '}', userIdOrEmail.toString()),
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

  /// Get all users
  ///
  /// Retrieve details on all users in the organization.  Optionally includes values of [custom profile field](/help/add-custom-profile-fields).  `GET {{ api_url }}/v1/users`  You can also [fetch details on a single user](/api/get-user). 
  Future<Response<JsonSuccessBase>> getUsers({ 
    bool clientGravatar,
    bool includeCustomProfileFields,
    CancelToken cancelToken,
    Map<String, dynamic> headers,
    Map<String, dynamic> extra,
    ValidateStatus validateStatus,
    ProgressCallback onSendProgress,
    ProgressCallback onReceiveProgress,
  }) async {
    final _request = RequestOptions(
      path: r'/users',
      method: 'GET',
      headers: <String, dynamic>{
        ...?headers,
      },
      queryParameters: <String, dynamic>{
        if (clientGravatar != null) r'client_gravatar': clientGravatar,
        if (includeCustomProfileFields != null) r'include_custom_profile_fields': includeCustomProfileFields,
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

  /// Mute a user
  ///
  /// This endpoint [mutes a user](/help/mute-a-user).  Messages sent by users you've muted will be automatically marked as read and hidden.  `POST {{ api_url }}/v1/users/me/muted_users/{muted_user_id}`  Muted users should be implemented by clients as follows:  * The server will immediately mark all messages sent by the muted   user as read.  This will automatically clear any existing mobile   push notifications related to the muted user. * The server will mark any new messages sent by the muted user as read   for your account, which prevents all email and mobile push notifications. * Clients should exclude muted users from presence lists or other UI   for viewing or composing 1:1 private messages. 1:1 private messages sent by   muted users should be hidden everywhere in the Zulip UI. * Stream messages and group private messages sent by the muted   user should avoid displaying the content and name/avatar,   but should display that N messages by a muted user were   hidden (so that it is possible to interpret the messages by   other users who are talking with the muted user). * Group private message conversations including the muted user   should display muted users as \"Muted user\", rather than   showing their name, in lists of such conversations, along with using   a blank grey avatar where avatars are displayed. * Administrative/settings UI elements for showing \"All users that exist   on this stream or realm\", e.g. for organization   administration or showing stream subscribers, should display   the user's name as normal.  **Changes**: New in Zulip 4.0 (feature level 48). 
  Future<Response<JsonSuccess>> muteUser(
    int mutedUserId, { 
    CancelToken cancelToken,
    Map<String, dynamic> headers,
    Map<String, dynamic> extra,
    ValidateStatus validateStatus,
    ProgressCallback onSendProgress,
    ProgressCallback onReceiveProgress,
  }) async {
    final _request = RequestOptions(
      path: r'/users/me/muted_users/{muted_user_id}'.replaceAll('{' r'muted_user_id' '}', mutedUserId.toString()),
      method: 'POST',
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

  /// Reactivate a user
  ///
  /// [Reactivates a user](https://zulip.com/help/deactivate-or-reactivate-a-user) given their user ID.  `POST {{ api_url }}/v1/users/{user_id}/reactivate` 
  Future<Response<JsonObject>> reactivateUser(
    int userId, { 
    CancelToken cancelToken,
    Map<String, dynamic> headers,
    Map<String, dynamic> extra,
    ValidateStatus validateStatus,
    ProgressCallback onSendProgress,
    ProgressCallback onReceiveProgress,
  }) async {
    final _request = RequestOptions(
      path: r'/users/{user_id}/reactivate'.replaceAll('{' r'user_id' '}', userId.toString()),
      method: 'POST',
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

    const _responseType = FullType(JsonObject);
    final _responseData = _serializers.deserialize(
      _response.data,
      specifiedType: _responseType,
    ) as JsonObject;

    return Response<JsonObject>(
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

  /// Delete a user group
  ///
  /// Delete a [user group](/help/user-groups).  `DELETE {{ api_url }}/v1/user_groups/{user_group_id}` 
  Future<Response<JsonSuccess>> removeUserGroup(
    int userGroupId, { 
    CancelToken cancelToken,
    Map<String, dynamic> headers,
    Map<String, dynamic> extra,
    ValidateStatus validateStatus,
    ProgressCallback onSendProgress,
    ProgressCallback onReceiveProgress,
  }) async {
    final _request = RequestOptions(
      path: r'/user_groups/{user_group_id}'.replaceAll('{' r'user_group_id' '}', userGroupId.toString()),
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

  /// Set \"typing\" status
  ///
  /// Notify other users whether the current user is typing a message.  `POST {{ api_url }}/v1/typing`  Clients implementing Zulip's typing notifications protocol should work as follows:  * Send a request to this endpoint with `op=\"start\"` when a user starts typing a message,   and also every `TYPING_STARTED_WAIT_PERIOD=10` seconds that the user continues to   actively type or otherwise interact with the compose UI (E.g. interacting with the   compose box emoji picker). * Send a request to this endpoint with `op=\"stop\"` when a user pauses using the   compose UI for at least `TYPING_STOPPED_WAIT_PERIOD=5` seconds or cancels   the compose action (if it had previously sent a \"start\" operation for that   compose action). * Start displaying \"Sender is typing\" for a given conversation when the client   receives an `op=\"start\"` event from the [events API](/api/get-events). * Continue displaying \"Sender is typing\" until they receive an `op=\"stop\"` event   from the [events API](/api/get-events) or `TYPING_STARTED_EXPIRY_PERIOD=15`   seconds have passed without a new `op=\"start\"` event for that conversation. * Clients that support displaying stream typing notifications (new in Zulip 4.0)   should indicate they support processing stream typing events via the   `stream_typing_notifications` in the `client_capabilities` parameter to `/register`.  This protocol is designed to allow the server-side typing notifications implementation to be stateless while being resilient; network failures cannot result in a user being incorrectly displayed as perpetually typing.  See [the typing notification docs](https://zulip.readthedocs.io/en/latest/subsystems/typing-indicators.html) for additional design details on Zulip's typing notifications protocol. 
  Future<Response<JsonSuccess>> setTypingStatus(
    String op,
    BuiltList<int> to, { 
    String type,
    String topic,
    CancelToken cancelToken,
    Map<String, dynamic> headers,
    Map<String, dynamic> extra,
    ValidateStatus validateStatus,
    ProgressCallback onSendProgress,
    ProgressCallback onReceiveProgress,
  }) async {
    final _request = RequestOptions(
      path: r'/typing',
      method: 'POST',
      headers: <String, dynamic>{
        ...?headers,
      },
      queryParameters: <String, dynamic>{
        if (type != null) r'type': type,
        r'op': op,
        r'to': to,
        if (topic != null) r'topic': topic,
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

  /// Unmute a user
  ///
  /// This endpoint unmutes a user.  `DELETE {{ api_url }}/v1/users/me/muted_users/{muted_user_id}`  **Changes**: New in Zulip 4.0 (feature level 48). 
  Future<Response<JsonSuccess>> unmuteUser(
    int mutedUserId, { 
    CancelToken cancelToken,
    Map<String, dynamic> headers,
    Map<String, dynamic> extra,
    ValidateStatus validateStatus,
    ProgressCallback onSendProgress,
    ProgressCallback onReceiveProgress,
  }) async {
    final _request = RequestOptions(
      path: r'/users/me/muted_users/{muted_user_id}'.replaceAll('{' r'muted_user_id' '}', mutedUserId.toString()),
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

  /// Update display settings
  ///
  /// This endpoint is used to edit the current user's user interface settings.  `PATCH {{ api_url }}/v1/settings/display` 
  Future<Response<JsonSuccessBase>> updateDisplaySettings({ 
    bool twentyFourHourTime,
    bool denseMode,
    bool starredMessageCounts,
    bool fluidLayoutWidth,
    bool highContrastMode,
    int colorScheme,
    bool translateEmoticons,
    String defaultLanguage,
    String defaultView,
    bool leftSideUserlist,
    String emojiset,
    int demoteInactiveStreams,
    String timezone,
    CancelToken cancelToken,
    Map<String, dynamic> headers,
    Map<String, dynamic> extra,
    ValidateStatus validateStatus,
    ProgressCallback onSendProgress,
    ProgressCallback onReceiveProgress,
  }) async {
    final _request = RequestOptions(
      path: r'/settings/display',
      method: 'PATCH',
      headers: <String, dynamic>{
        ...?headers,
      },
      queryParameters: <String, dynamic>{
        if (twentyFourHourTime != null) r'twenty_four_hour_time': twentyFourHourTime,
        if (denseMode != null) r'dense_mode': denseMode,
        if (starredMessageCounts != null) r'starred_message_counts': starredMessageCounts,
        if (fluidLayoutWidth != null) r'fluid_layout_width': fluidLayoutWidth,
        if (highContrastMode != null) r'high_contrast_mode': highContrastMode,
        if (colorScheme != null) r'color_scheme': colorScheme,
        if (translateEmoticons != null) r'translate_emoticons': translateEmoticons,
        if (defaultLanguage != null) r'default_language': defaultLanguage,
        if (defaultView != null) r'default_view': defaultView,
        if (leftSideUserlist != null) r'left_side_userlist': leftSideUserlist,
        if (emojiset != null) r'emojiset': emojiset,
        if (demoteInactiveStreams != null) r'demote_inactive_streams': demoteInactiveStreams,
        if (timezone != null) r'timezone': timezone,
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

  /// Update notification settings
  ///
  /// This endpoint is used to edit the user's global notification settings. See [this endpoint](/api/update-subscription-settings) for per-stream notification settings.  `PATCH {{ api_url }}/v1/settings/notifications` 
  Future<Response<JsonSuccessBase>> updateNotificationSettings({ 
    bool enableStreamDesktopNotifications,
    bool enableStreamEmailNotifications,
    bool enableStreamPushNotifications,
    bool enableStreamAudibleNotifications,
    String notificationSound,
    bool enableDesktopNotifications,
    bool enableSounds,
    bool enableOfflineEmailNotifications,
    bool enableOfflinePushNotifications,
    bool enableOnlinePushNotifications,
    bool enableDigestEmails,
    bool enableMarketingEmails,
    bool enableLoginEmails,
    bool messageContentInEmailNotifications,
    bool pmContentInDesktopNotifications,
    bool wildcardMentionsNotify,
    int desktopIconCountDisplay,
    bool realmNameInNotifications,
    bool presenceEnabled,
    CancelToken cancelToken,
    Map<String, dynamic> headers,
    Map<String, dynamic> extra,
    ValidateStatus validateStatus,
    ProgressCallback onSendProgress,
    ProgressCallback onReceiveProgress,
  }) async {
    final _request = RequestOptions(
      path: r'/settings/notifications',
      method: 'PATCH',
      headers: <String, dynamic>{
        ...?headers,
      },
      queryParameters: <String, dynamic>{
        if (enableStreamDesktopNotifications != null) r'enable_stream_desktop_notifications': enableStreamDesktopNotifications,
        if (enableStreamEmailNotifications != null) r'enable_stream_email_notifications': enableStreamEmailNotifications,
        if (enableStreamPushNotifications != null) r'enable_stream_push_notifications': enableStreamPushNotifications,
        if (enableStreamAudibleNotifications != null) r'enable_stream_audible_notifications': enableStreamAudibleNotifications,
        if (notificationSound != null) r'notification_sound': notificationSound,
        if (enableDesktopNotifications != null) r'enable_desktop_notifications': enableDesktopNotifications,
        if (enableSounds != null) r'enable_sounds': enableSounds,
        if (enableOfflineEmailNotifications != null) r'enable_offline_email_notifications': enableOfflineEmailNotifications,
        if (enableOfflinePushNotifications != null) r'enable_offline_push_notifications': enableOfflinePushNotifications,
        if (enableOnlinePushNotifications != null) r'enable_online_push_notifications': enableOnlinePushNotifications,
        if (enableDigestEmails != null) r'enable_digest_emails': enableDigestEmails,
        if (enableMarketingEmails != null) r'enable_marketing_emails': enableMarketingEmails,
        if (enableLoginEmails != null) r'enable_login_emails': enableLoginEmails,
        if (messageContentInEmailNotifications != null) r'message_content_in_email_notifications': messageContentInEmailNotifications,
        if (pmContentInDesktopNotifications != null) r'pm_content_in_desktop_notifications': pmContentInDesktopNotifications,
        if (wildcardMentionsNotify != null) r'wildcard_mentions_notify': wildcardMentionsNotify,
        if (desktopIconCountDisplay != null) r'desktop_icon_count_display': desktopIconCountDisplay,
        if (realmNameInNotifications != null) r'realm_name_in_notifications': realmNameInNotifications,
        if (presenceEnabled != null) r'presence_enabled': presenceEnabled,
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

  /// Update a user
  ///
  /// Administrative endpoint to update the details of another user in the organization.  `PATCH {{ api_url }}/v1/users/{user_id}`  Supports everything an administrator can do to edit details of another user's account, including editing full name, [role](/help/roles-and-permissions), and [custom profile fields](/help/add-custom-profile-fields). 
  Future<Response<JsonSuccess>> updateUser(
    int userId, { 
    String fullName,
    int role,
    BuiltList<JsonObject> profileData,
    CancelToken cancelToken,
    Map<String, dynamic> headers,
    Map<String, dynamic> extra,
    ValidateStatus validateStatus,
    ProgressCallback onSendProgress,
    ProgressCallback onReceiveProgress,
  }) async {
    final _request = RequestOptions(
      path: r'/users/{user_id}'.replaceAll('{' r'user_id' '}', userId.toString()),
      method: 'PATCH',
      headers: <String, dynamic>{
        ...?headers,
      },
      queryParameters: <String, dynamic>{
        if (fullName != null) r'full_name': fullName,
        if (role != null) r'role': role,
        if (profileData != null) r'profile_data': profileData,
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

  /// Update a user group
  ///
  /// Update the name or description of a [user group](/help/user-groups).  `PATCH {{ api_url }}/v1/user_groups/{user_group_id}` 
  Future<Response<JsonSuccess>> updateUserGroup(
    int userGroupId,
    String name,
    String description, { 
    CancelToken cancelToken,
    Map<String, dynamic> headers,
    Map<String, dynamic> extra,
    ValidateStatus validateStatus,
    ProgressCallback onSendProgress,
    ProgressCallback onReceiveProgress,
  }) async {
    final _request = RequestOptions(
      path: r'/user_groups/{user_group_id}'.replaceAll('{' r'user_group_id' '}', userGroupId.toString()),
      method: 'PATCH',
      headers: <String, dynamic>{
        ...?headers,
      },
      queryParameters: <String, dynamic>{
        r'name': name,
        r'description': description,
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

  /// Update user group members
  ///
  /// Update the members of a [user group](/help/user-groups).  `POST {{ api_url }}/v1/user_groups/{user_group_id}/members` 
  Future<Response<JsonSuccess>> updateUserGroupMembers(
    int userGroupId, { 
    BuiltList<int> delete,
    BuiltList<int> add,
    CancelToken cancelToken,
    Map<String, dynamic> headers,
    Map<String, dynamic> extra,
    ValidateStatus validateStatus,
    ProgressCallback onSendProgress,
    ProgressCallback onReceiveProgress,
  }) async {
    final _request = RequestOptions(
      path: r'/user_groups/{user_group_id}/members'.replaceAll('{' r'user_group_id' '}', userGroupId.toString()),
      method: 'POST',
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

}
