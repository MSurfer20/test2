//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.0

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;


class UsersApi {
  UsersApi([ApiClient apiClient]) : apiClient = apiClient ?? defaultApiClient;

  final ApiClient apiClient;

  /// Create a user
  ///
  /// {!can-create-users-only.md!}  Create a new user account via the API.  `POST {{ api_url }}/v1/users` 
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [String] email (required):
  ///   The email address of the new user. 
  ///
  /// * [String] password (required):
  ///   The password of the new user. 
  ///
  /// * [String] fullName (required):
  ///   The full name of the new user. 
  Future<Response> createUserWithHttpInfo(String email, String password, String fullName) async {
    // Verify required params are set.
    if (email == null) {
     throw ApiException(HttpStatus.badRequest, 'Missing required param: email');
    }
    if (password == null) {
     throw ApiException(HttpStatus.badRequest, 'Missing required param: password');
    }
    if (fullName == null) {
     throw ApiException(HttpStatus.badRequest, 'Missing required param: fullName');
    }

    final path = r'/users';

    Object postBody;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

      queryParams.addAll(_convertParametersForCollectionFormat('', 'email', email));
      queryParams.addAll(_convertParametersForCollectionFormat('', 'password', password));
      queryParams.addAll(_convertParametersForCollectionFormat('', 'full_name', fullName));

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

  /// Create a user
  ///
  /// {!can-create-users-only.md!}  Create a new user account via the API.  `POST {{ api_url }}/v1/users` 
  ///
  /// Parameters:
  ///
  /// * [String] email (required):
  ///   The email address of the new user. 
  ///
  /// * [String] password (required):
  ///   The password of the new user. 
  ///
  /// * [String] fullName (required):
  ///   The full name of the new user. 
  Future<JsonSuccessBase> createUser(String email, String password, String fullName) async {
    final response = await createUserWithHttpInfo(email, password, fullName);
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

  /// Create a user group
  ///
  /// Create a new [user group](/help/user-groups).  `POST {{ api_url }}/v1/user_groups/create` 
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [String] name (required):
  ///   The name of the user group. 
  ///
  /// * [String] description (required):
  ///   The description of the user group. 
  ///
  /// * [List<int>] members (required):
  ///   An array containing the user IDs of the initial members for the new user group. 
  Future<Response> createUserGroupWithHttpInfo(String name, String description, List<int> members) async {
    // Verify required params are set.
    if (name == null) {
     throw ApiException(HttpStatus.badRequest, 'Missing required param: name');
    }
    if (description == null) {
     throw ApiException(HttpStatus.badRequest, 'Missing required param: description');
    }
    if (members == null) {
     throw ApiException(HttpStatus.badRequest, 'Missing required param: members');
    }

    final path = r'/user_groups/create';

    Object postBody;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

      queryParams.addAll(_convertParametersForCollectionFormat('', 'name', name));
      queryParams.addAll(_convertParametersForCollectionFormat('', 'description', description));
      queryParams.addAll(_convertParametersForCollectionFormat('multi', 'members', members));

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

  /// Create a user group
  ///
  /// Create a new [user group](/help/user-groups).  `POST {{ api_url }}/v1/user_groups/create` 
  ///
  /// Parameters:
  ///
  /// * [String] name (required):
  ///   The name of the user group. 
  ///
  /// * [String] description (required):
  ///   The description of the user group. 
  ///
  /// * [List<int>] members (required):
  ///   An array containing the user IDs of the initial members for the new user group. 
  Future<JsonSuccess> createUserGroup(String name, String description, List<int> members) async {
    final response = await createUserGroupWithHttpInfo(name, description, members);
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

  /// Deactivate own user
  ///
  /// Deactivates the user's account.  See also the administrative endpoint for [deactivating another user](/api/deactivate-user).  `DELETE {{ api_url }}/v1/users/me`  This endpoint is primarily useful to Zulip clients providing a user settings UI. 
  ///
  /// Note: This method returns the HTTP [Response].
  Future<Response> deactivateOwnUserWithHttpInfo() async {
    final path = r'/users/me';

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

  /// Deactivate own user
  ///
  /// Deactivates the user's account.  See also the administrative endpoint for [deactivating another user](/api/deactivate-user).  `DELETE {{ api_url }}/v1/users/me`  This endpoint is primarily useful to Zulip clients providing a user settings UI. 
  Future<JsonSuccess> deactivateOwnUser() async {
    final response = await deactivateOwnUserWithHttpInfo();
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

  /// Deactivate a user
  ///
  /// [Deactivates a user](https://zulip.com/help/deactivate-or-reactivate-a-user) given their user ID.  `DELETE {{ api_url }}/v1/users/{user_id}` 
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [int] userId (required):
  ///   The target user's ID. 
  Future<Response> deactivateUserWithHttpInfo(int userId) async {
    // Verify required params are set.
    if (userId == null) {
     throw ApiException(HttpStatus.badRequest, 'Missing required param: userId');
    }

    final path = r'/users/{user_id}'
      .replaceAll('{' + 'user_id' + '}', userId.toString());

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

  /// Deactivate a user
  ///
  /// [Deactivates a user](https://zulip.com/help/deactivate-or-reactivate-a-user) given their user ID.  `DELETE {{ api_url }}/v1/users/{user_id}` 
  ///
  /// Parameters:
  ///
  /// * [int] userId (required):
  ///   The target user's ID. 
  Future<JsonSuccess> deactivateUser(int userId) async {
    final response = await deactivateUserWithHttpInfo(userId);
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

  /// Get attachments
  ///
  /// Fetch metadata on files uploaded by the requesting user.  `GET {{ api_url }}/v1/attachments` 
  ///
  /// Note: This method returns the HTTP [Response].
  Future<Response> getAttachmentsWithHttpInfo() async {
    final path = r'/attachments';

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

  /// Get attachments
  ///
  /// Fetch metadata on files uploaded by the requesting user.  `GET {{ api_url }}/v1/attachments` 
  Future<JsonSuccessBase> getAttachments() async {
    final response = await getAttachmentsWithHttpInfo();
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

  /// Get own user
  ///
  /// Get basic data about the user/bot that requests this endpoint.  `GET {{ api_url }}/v1/users/me` 
  ///
  /// Note: This method returns the HTTP [Response].
  Future<Response> getOwnUserWithHttpInfo() async {
    final path = r'/users/me';

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

  /// Get own user
  ///
  /// Get basic data about the user/bot that requests this endpoint.  `GET {{ api_url }}/v1/users/me` 
  Future<JsonSuccessBase> getOwnUser() async {
    final response = await getOwnUserWithHttpInfo();
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

  /// Get a user
  ///
  /// Fetch details for a single user in the organization.  `GET {{ api_url }}/v1/users/{user_id}`  You can also fetch details on [all users in the organization](/api/get-users) or [by email](/api/get-user-by-email).  *This endpoint is new in Zulip Server 3.0 (feature level 1).* 
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [int] userId (required):
  ///   The target user's ID. 
  ///
  /// * [bool] clientGravatar:
  ///   Whether the client supports computing gravatars URLs.  If enabled, `avatar_url` will be included in the response only if there is a Zulip avatar, and will be `null` for users who are using gravatar as their avatar.  This option significantly reduces the compressed size of user data, since gravatar URLs are long, random strings and thus do not compress well. The `client_gravatar` field is set to `true` if clients can compute their own gravatars. 
  ///
  /// * [bool] includeCustomProfileFields:
  ///   Whether the client wants [custom profile field](/help/add-custom-profile-fields) data to be included in the response.  **Changes**: New in Zulip 2.1.0.  Previous versions do no offer these data via the API. 
  Future<Response> getUserWithHttpInfo(int userId, { bool clientGravatar, bool includeCustomProfileFields }) async {
    // Verify required params are set.
    if (userId == null) {
     throw ApiException(HttpStatus.badRequest, 'Missing required param: userId');
    }

    final path = r'/users/{user_id}'
      .replaceAll('{' + 'user_id' + '}', userId.toString());

    Object postBody;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

    if (clientGravatar != null) {
      queryParams.addAll(_convertParametersForCollectionFormat('', 'client_gravatar', clientGravatar));
    }
    if (includeCustomProfileFields != null) {
      queryParams.addAll(_convertParametersForCollectionFormat('', 'include_custom_profile_fields', includeCustomProfileFields));
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

  /// Get a user
  ///
  /// Fetch details for a single user in the organization.  `GET {{ api_url }}/v1/users/{user_id}`  You can also fetch details on [all users in the organization](/api/get-users) or [by email](/api/get-user-by-email).  *This endpoint is new in Zulip Server 3.0 (feature level 1).* 
  ///
  /// Parameters:
  ///
  /// * [int] userId (required):
  ///   The target user's ID. 
  ///
  /// * [bool] clientGravatar:
  ///   Whether the client supports computing gravatars URLs.  If enabled, `avatar_url` will be included in the response only if there is a Zulip avatar, and will be `null` for users who are using gravatar as their avatar.  This option significantly reduces the compressed size of user data, since gravatar URLs are long, random strings and thus do not compress well. The `client_gravatar` field is set to `true` if clients can compute their own gravatars. 
  ///
  /// * [bool] includeCustomProfileFields:
  ///   Whether the client wants [custom profile field](/help/add-custom-profile-fields) data to be included in the response.  **Changes**: New in Zulip 2.1.0.  Previous versions do no offer these data via the API. 
  Future<JsonSuccessBase> getUser(int userId, { bool clientGravatar, bool includeCustomProfileFields }) async {
    final response = await getUserWithHttpInfo(userId,  clientGravatar: clientGravatar, includeCustomProfileFields: includeCustomProfileFields );
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

  /// Get a user by email
  ///
  /// Fetch details for a single user in the organization given a Zulip display email address.  `GET {{ api_url }}/v1/users/{email}`  Note that this endpoint uses Zulip display emails addresses for organizations that have configured limited [email address visibility](/help/restrict-visibility-of-email-addresses).  You can also fetch details on [all users in the organization](/api/get-users) or [by user ID](/api/get-user).  Fetching by user ID is generally recommended when possible, as users can [change their email address](/help/change-your-email-address).  *This endpoint is new in Zulip Server 4.0 (feature level 39).* 
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [String] email (required):
  ///   The email address of the user whose details you want to fetch. 
  ///
  /// * [bool] clientGravatar:
  ///   Whether the client supports computing gravatars URLs.  If enabled, `avatar_url` will be included in the response only if there is a Zulip avatar, and will be `null` for users who are using gravatar as their avatar.  This option significantly reduces the compressed size of user data, since gravatar URLs are long, random strings and thus do not compress well. The `client_gravatar` field is set to `true` if clients can compute their own gravatars. 
  ///
  /// * [bool] includeCustomProfileFields:
  ///   Whether the client wants [custom profile field](/help/add-custom-profile-fields) data to be included in the response.  **Changes**: New in Zulip 2.1.0.  Previous versions do no offer these data via the API. 
  Future<Response> getUserByEmailWithHttpInfo(String email, { bool clientGravatar, bool includeCustomProfileFields }) async {
    // Verify required params are set.
    if (email == null) {
     throw ApiException(HttpStatus.badRequest, 'Missing required param: email');
    }

    final path = r'/users/{email}'
      .replaceAll('{' + 'email' + '}', email.toString());

    Object postBody;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

    if (clientGravatar != null) {
      queryParams.addAll(_convertParametersForCollectionFormat('', 'client_gravatar', clientGravatar));
    }
    if (includeCustomProfileFields != null) {
      queryParams.addAll(_convertParametersForCollectionFormat('', 'include_custom_profile_fields', includeCustomProfileFields));
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

  /// Get a user by email
  ///
  /// Fetch details for a single user in the organization given a Zulip display email address.  `GET {{ api_url }}/v1/users/{email}`  Note that this endpoint uses Zulip display emails addresses for organizations that have configured limited [email address visibility](/help/restrict-visibility-of-email-addresses).  You can also fetch details on [all users in the organization](/api/get-users) or [by user ID](/api/get-user).  Fetching by user ID is generally recommended when possible, as users can [change their email address](/help/change-your-email-address).  *This endpoint is new in Zulip Server 4.0 (feature level 39).* 
  ///
  /// Parameters:
  ///
  /// * [String] email (required):
  ///   The email address of the user whose details you want to fetch. 
  ///
  /// * [bool] clientGravatar:
  ///   Whether the client supports computing gravatars URLs.  If enabled, `avatar_url` will be included in the response only if there is a Zulip avatar, and will be `null` for users who are using gravatar as their avatar.  This option significantly reduces the compressed size of user data, since gravatar URLs are long, random strings and thus do not compress well. The `client_gravatar` field is set to `true` if clients can compute their own gravatars. 
  ///
  /// * [bool] includeCustomProfileFields:
  ///   Whether the client wants [custom profile field](/help/add-custom-profile-fields) data to be included in the response.  **Changes**: New in Zulip 2.1.0.  Previous versions do no offer these data via the API. 
  Future<JsonSuccessBase> getUserByEmail(String email, { bool clientGravatar, bool includeCustomProfileFields }) async {
    final response = await getUserByEmailWithHttpInfo(email,  clientGravatar: clientGravatar, includeCustomProfileFields: includeCustomProfileFields );
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

  /// Get user groups
  ///
  /// {!api-members-only.md!}  Fetches all of the user groups in the organization.  `GET {{ api_url }}/v1/user_groups` 
  ///
  /// Note: This method returns the HTTP [Response].
  Future<Response> getUserGroupsWithHttpInfo() async {
    final path = r'/user_groups';

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

  /// Get user groups
  ///
  /// {!api-members-only.md!}  Fetches all of the user groups in the organization.  `GET {{ api_url }}/v1/user_groups` 
  Future<JsonSuccessBase> getUserGroups() async {
    final response = await getUserGroupsWithHttpInfo();
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

  /// Get user presence
  ///
  /// Get the presence status for a specific user.  This endpoint is most useful for embedding data about a user's presence status in other sites (E.g. an employee directory).  Full Zulip clients like mobile/desktop apps will want to use the main presence endpoint, which returns data for all active users in the organization, instead.  `GET {{ api_url }}/v1/users/{user_id_or_email}/presence`  See [Zulip's developer documentation](https://zulip.readthedocs.io/en/latest/subsystems/presence.html) for details on the data model for presence in Zulip. 
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [String] userIdOrEmail (required):
  ///   The user_id or Zulip display email address of the user whose presence you want to fetch.  **Changes**: New in Zulip 4.0 (feature level 43). Previous versions only supported identifying the user by Zulip display email. 
  Future<Response> getUserPresenceWithHttpInfo(String userIdOrEmail) async {
    // Verify required params are set.
    if (userIdOrEmail == null) {
     throw ApiException(HttpStatus.badRequest, 'Missing required param: userIdOrEmail');
    }

    final path = r'/users/{user_id_or_email}/presence'
      .replaceAll('{' + 'user_id_or_email' + '}', userIdOrEmail.toString());

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

  /// Get user presence
  ///
  /// Get the presence status for a specific user.  This endpoint is most useful for embedding data about a user's presence status in other sites (E.g. an employee directory).  Full Zulip clients like mobile/desktop apps will want to use the main presence endpoint, which returns data for all active users in the organization, instead.  `GET {{ api_url }}/v1/users/{user_id_or_email}/presence`  See [Zulip's developer documentation](https://zulip.readthedocs.io/en/latest/subsystems/presence.html) for details on the data model for presence in Zulip. 
  ///
  /// Parameters:
  ///
  /// * [String] userIdOrEmail (required):
  ///   The user_id or Zulip display email address of the user whose presence you want to fetch.  **Changes**: New in Zulip 4.0 (feature level 43). Previous versions only supported identifying the user by Zulip display email. 
  Future<JsonSuccessBase> getUserPresence(String userIdOrEmail) async {
    final response = await getUserPresenceWithHttpInfo(userIdOrEmail);
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

  /// Get all users
  ///
  /// Retrieve details on all users in the organization.  Optionally includes values of [custom profile field](/help/add-custom-profile-fields).  `GET {{ api_url }}/v1/users`  You can also [fetch details on a single user](/api/get-user). 
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [bool] clientGravatar:
  ///   Whether the client supports computing gravatars URLs.  If enabled, `avatar_url` will be included in the response only if there is a Zulip avatar, and will be `null` for users who are using gravatar as their avatar.  This option significantly reduces the compressed size of user data, since gravatar URLs are long, random strings and thus do not compress well. The `client_gravatar` field is set to `true` if clients can compute their own gravatars. 
  ///
  /// * [bool] includeCustomProfileFields:
  ///   Whether the client wants [custom profile field](/help/add-custom-profile-fields) data to be included in the response.  **Changes**: New in Zulip 2.1.0.  Previous versions do no offer these data via the API. 
  Future<Response> getUsersWithHttpInfo({ bool clientGravatar, bool includeCustomProfileFields }) async {
    // Verify required params are set.

    final path = r'/users';

    Object postBody;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

    if (clientGravatar != null) {
      queryParams.addAll(_convertParametersForCollectionFormat('', 'client_gravatar', clientGravatar));
    }
    if (includeCustomProfileFields != null) {
      queryParams.addAll(_convertParametersForCollectionFormat('', 'include_custom_profile_fields', includeCustomProfileFields));
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

  /// Get all users
  ///
  /// Retrieve details on all users in the organization.  Optionally includes values of [custom profile field](/help/add-custom-profile-fields).  `GET {{ api_url }}/v1/users`  You can also [fetch details on a single user](/api/get-user). 
  ///
  /// Parameters:
  ///
  /// * [bool] clientGravatar:
  ///   Whether the client supports computing gravatars URLs.  If enabled, `avatar_url` will be included in the response only if there is a Zulip avatar, and will be `null` for users who are using gravatar as their avatar.  This option significantly reduces the compressed size of user data, since gravatar URLs are long, random strings and thus do not compress well. The `client_gravatar` field is set to `true` if clients can compute their own gravatars. 
  ///
  /// * [bool] includeCustomProfileFields:
  ///   Whether the client wants [custom profile field](/help/add-custom-profile-fields) data to be included in the response.  **Changes**: New in Zulip 2.1.0.  Previous versions do no offer these data via the API. 
  Future<JsonSuccessBase> getUsers({ bool clientGravatar, bool includeCustomProfileFields }) async {
    final response = await getUsersWithHttpInfo( clientGravatar: clientGravatar, includeCustomProfileFields: includeCustomProfileFields );
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

  /// Mute a user
  ///
  /// This endpoint [mutes a user](/help/mute-a-user).  Messages sent by users you've muted will be automatically marked as read and hidden.  `POST {{ api_url }}/v1/users/me/muted_users/{muted_user_id}`  Muted users should be implemented by clients as follows:  * The server will immediately mark all messages sent by the muted   user as read.  This will automatically clear any existing mobile   push notifications related to the muted user. * The server will mark any new messages sent by the muted user as read   for your account, which prevents all email and mobile push notifications. * Clients should exclude muted users from presence lists or other UI   for viewing or composing 1:1 private messages. 1:1 private messages sent by   muted users should be hidden everywhere in the Zulip UI. * Stream messages and group private messages sent by the muted   user should avoid displaying the content and name/avatar,   but should display that N messages by a muted user were   hidden (so that it is possible to interpret the messages by   other users who are talking with the muted user). * Group private message conversations including the muted user   should display muted users as \"Muted user\", rather than   showing their name, in lists of such conversations, along with using   a blank grey avatar where avatars are displayed. * Administrative/settings UI elements for showing \"All users that exist   on this stream or realm\", e.g. for organization   administration or showing stream subscribers, should display   the user's name as normal.  **Changes**: New in Zulip 4.0 (feature level 48). 
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [int] mutedUserId (required):
  ///   The ID of the user to mute/un-mute. 
  Future<Response> muteUserWithHttpInfo(int mutedUserId) async {
    // Verify required params are set.
    if (mutedUserId == null) {
     throw ApiException(HttpStatus.badRequest, 'Missing required param: mutedUserId');
    }

    final path = r'/users/me/muted_users/{muted_user_id}'
      .replaceAll('{' + 'muted_user_id' + '}', mutedUserId.toString());

    Object postBody;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

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

  /// Mute a user
  ///
  /// This endpoint [mutes a user](/help/mute-a-user).  Messages sent by users you've muted will be automatically marked as read and hidden.  `POST {{ api_url }}/v1/users/me/muted_users/{muted_user_id}`  Muted users should be implemented by clients as follows:  * The server will immediately mark all messages sent by the muted   user as read.  This will automatically clear any existing mobile   push notifications related to the muted user. * The server will mark any new messages sent by the muted user as read   for your account, which prevents all email and mobile push notifications. * Clients should exclude muted users from presence lists or other UI   for viewing or composing 1:1 private messages. 1:1 private messages sent by   muted users should be hidden everywhere in the Zulip UI. * Stream messages and group private messages sent by the muted   user should avoid displaying the content and name/avatar,   but should display that N messages by a muted user were   hidden (so that it is possible to interpret the messages by   other users who are talking with the muted user). * Group private message conversations including the muted user   should display muted users as \"Muted user\", rather than   showing their name, in lists of such conversations, along with using   a blank grey avatar where avatars are displayed. * Administrative/settings UI elements for showing \"All users that exist   on this stream or realm\", e.g. for organization   administration or showing stream subscribers, should display   the user's name as normal.  **Changes**: New in Zulip 4.0 (feature level 48). 
  ///
  /// Parameters:
  ///
  /// * [int] mutedUserId (required):
  ///   The ID of the user to mute/un-mute. 
  Future<JsonSuccess> muteUser(int mutedUserId) async {
    final response = await muteUserWithHttpInfo(mutedUserId);
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

  /// Reactivate a user
  ///
  /// [Reactivates a user](https://zulip.com/help/deactivate-or-reactivate-a-user) given their user ID.  `POST {{ api_url }}/v1/users/{user_id}/reactivate` 
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [int] userId (required):
  ///   The target user's ID. 
  Future<Response> reactivateUserWithHttpInfo(int userId) async {
    // Verify required params are set.
    if (userId == null) {
     throw ApiException(HttpStatus.badRequest, 'Missing required param: userId');
    }

    final path = r'/users/{user_id}/reactivate'
      .replaceAll('{' + 'user_id' + '}', userId.toString());

    Object postBody;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

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

  /// Reactivate a user
  ///
  /// [Reactivates a user](https://zulip.com/help/deactivate-or-reactivate-a-user) given their user ID.  `POST {{ api_url }}/v1/users/{user_id}/reactivate` 
  ///
  /// Parameters:
  ///
  /// * [int] userId (required):
  ///   The target user's ID. 
  Future<Object> reactivateUser(int userId) async {
    final response = await reactivateUserWithHttpInfo(userId);
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body != null && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'Object',) as Object;
        }
    return Future<Object>.value(null);
  }

  /// Delete a user group
  ///
  /// Delete a [user group](/help/user-groups).  `DELETE {{ api_url }}/v1/user_groups/{user_group_id}` 
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [int] userGroupId (required):
  ///   The ID of the target user group. 
  Future<Response> removeUserGroupWithHttpInfo(int userGroupId) async {
    // Verify required params are set.
    if (userGroupId == null) {
     throw ApiException(HttpStatus.badRequest, 'Missing required param: userGroupId');
    }

    final path = r'/user_groups/{user_group_id}'
      .replaceAll('{' + 'user_group_id' + '}', userGroupId.toString());

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

  /// Delete a user group
  ///
  /// Delete a [user group](/help/user-groups).  `DELETE {{ api_url }}/v1/user_groups/{user_group_id}` 
  ///
  /// Parameters:
  ///
  /// * [int] userGroupId (required):
  ///   The ID of the target user group. 
  Future<JsonSuccess> removeUserGroup(int userGroupId) async {
    final response = await removeUserGroupWithHttpInfo(userGroupId);
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

  /// Set \"typing\" status
  ///
  /// Notify other users whether the current user is typing a message.  `POST {{ api_url }}/v1/typing`  Clients implementing Zulip's typing notifications protocol should work as follows:  * Send a request to this endpoint with `op=\"start\"` when a user starts typing a message,   and also every `TYPING_STARTED_WAIT_PERIOD=10` seconds that the user continues to   actively type or otherwise interact with the compose UI (E.g. interacting with the   compose box emoji picker). * Send a request to this endpoint with `op=\"stop\"` when a user pauses using the   compose UI for at least `TYPING_STOPPED_WAIT_PERIOD=5` seconds or cancels   the compose action (if it had previously sent a \"start\" operation for that   compose action). * Start displaying \"Sender is typing\" for a given conversation when the client   receives an `op=\"start\"` event from the [events API](/api/get-events). * Continue displaying \"Sender is typing\" until they receive an `op=\"stop\"` event   from the [events API](/api/get-events) or `TYPING_STARTED_EXPIRY_PERIOD=15`   seconds have passed without a new `op=\"start\"` event for that conversation. * Clients that support displaying stream typing notifications (new in Zulip 4.0)   should indicate they support processing stream typing events via the   `stream_typing_notifications` in the `client_capabilities` parameter to `/register`.  This protocol is designed to allow the server-side typing notifications implementation to be stateless while being resilient; network failures cannot result in a user being incorrectly displayed as perpetually typing.  See [the typing notification docs](https://zulip.readthedocs.io/en/latest/subsystems/typing-indicators.html) for additional design details on Zulip's typing notifications protocol. 
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [String] op (required):
  ///   Whether the user has started (`start`) or stopped (`stop`) to type. 
  ///
  /// * [List<int>] to (required):
  ///   For 'private' type it is the user_ids of the recipients of the message being typed. Send a JSON-encoded list of user_ids. (Use a list even if there is only one recipient.)  For 'stream' type it is a single element list containing ID of stream in which the message is being typed.  **Changes**: Before Zulip 2.0, this parameter accepted only a JSON-encoded list of email addresses.  Support for the email address-based format was removed in Zulip 3.0 (feature level 11). 
  ///
  /// * [String] type:
  ///   Type of the message being composed. 
  ///
  /// * [String] topic:
  ///   Topic to which message is being typed. Required for the 'stream' type. Ignored in case of 'private' type. 
  Future<Response> setTypingStatusWithHttpInfo(String op, List<int> to, { String type, String topic }) async {
    // Verify required params are set.
    if (op == null) {
     throw ApiException(HttpStatus.badRequest, 'Missing required param: op');
    }
    if (to == null) {
     throw ApiException(HttpStatus.badRequest, 'Missing required param: to');
    }

    final path = r'/typing';

    Object postBody;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

    if (type != null) {
      queryParams.addAll(_convertParametersForCollectionFormat('', 'type', type));
    }
      queryParams.addAll(_convertParametersForCollectionFormat('', 'op', op));
      queryParams.addAll(_convertParametersForCollectionFormat('multi', 'to', to));
    if (topic != null) {
      queryParams.addAll(_convertParametersForCollectionFormat('', 'topic', topic));
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

  /// Set \"typing\" status
  ///
  /// Notify other users whether the current user is typing a message.  `POST {{ api_url }}/v1/typing`  Clients implementing Zulip's typing notifications protocol should work as follows:  * Send a request to this endpoint with `op=\"start\"` when a user starts typing a message,   and also every `TYPING_STARTED_WAIT_PERIOD=10` seconds that the user continues to   actively type or otherwise interact with the compose UI (E.g. interacting with the   compose box emoji picker). * Send a request to this endpoint with `op=\"stop\"` when a user pauses using the   compose UI for at least `TYPING_STOPPED_WAIT_PERIOD=5` seconds or cancels   the compose action (if it had previously sent a \"start\" operation for that   compose action). * Start displaying \"Sender is typing\" for a given conversation when the client   receives an `op=\"start\"` event from the [events API](/api/get-events). * Continue displaying \"Sender is typing\" until they receive an `op=\"stop\"` event   from the [events API](/api/get-events) or `TYPING_STARTED_EXPIRY_PERIOD=15`   seconds have passed without a new `op=\"start\"` event for that conversation. * Clients that support displaying stream typing notifications (new in Zulip 4.0)   should indicate they support processing stream typing events via the   `stream_typing_notifications` in the `client_capabilities` parameter to `/register`.  This protocol is designed to allow the server-side typing notifications implementation to be stateless while being resilient; network failures cannot result in a user being incorrectly displayed as perpetually typing.  See [the typing notification docs](https://zulip.readthedocs.io/en/latest/subsystems/typing-indicators.html) for additional design details on Zulip's typing notifications protocol. 
  ///
  /// Parameters:
  ///
  /// * [String] op (required):
  ///   Whether the user has started (`start`) or stopped (`stop`) to type. 
  ///
  /// * [List<int>] to (required):
  ///   For 'private' type it is the user_ids of the recipients of the message being typed. Send a JSON-encoded list of user_ids. (Use a list even if there is only one recipient.)  For 'stream' type it is a single element list containing ID of stream in which the message is being typed.  **Changes**: Before Zulip 2.0, this parameter accepted only a JSON-encoded list of email addresses.  Support for the email address-based format was removed in Zulip 3.0 (feature level 11). 
  ///
  /// * [String] type:
  ///   Type of the message being composed. 
  ///
  /// * [String] topic:
  ///   Topic to which message is being typed. Required for the 'stream' type. Ignored in case of 'private' type. 
  Future<JsonSuccess> setTypingStatus(String op, List<int> to, { String type, String topic }) async {
    final response = await setTypingStatusWithHttpInfo(op, to,  type: type, topic: topic );
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

  /// Unmute a user
  ///
  /// This endpoint unmutes a user.  `DELETE {{ api_url }}/v1/users/me/muted_users/{muted_user_id}`  **Changes**: New in Zulip 4.0 (feature level 48). 
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [int] mutedUserId (required):
  ///   The ID of the user to mute/un-mute. 
  Future<Response> unmuteUserWithHttpInfo(int mutedUserId) async {
    // Verify required params are set.
    if (mutedUserId == null) {
     throw ApiException(HttpStatus.badRequest, 'Missing required param: mutedUserId');
    }

    final path = r'/users/me/muted_users/{muted_user_id}'
      .replaceAll('{' + 'muted_user_id' + '}', mutedUserId.toString());

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

  /// Unmute a user
  ///
  /// This endpoint unmutes a user.  `DELETE {{ api_url }}/v1/users/me/muted_users/{muted_user_id}`  **Changes**: New in Zulip 4.0 (feature level 48). 
  ///
  /// Parameters:
  ///
  /// * [int] mutedUserId (required):
  ///   The ID of the user to mute/un-mute. 
  Future<JsonSuccess> unmuteUser(int mutedUserId) async {
    final response = await unmuteUserWithHttpInfo(mutedUserId);
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

  /// Update settings
  ///
  /// This endpoint is used to edit the current user's settings.  `PATCH {{ api_url }}/v1/settings`  **Changes**: Prior to Zulip 5.0 (feature level 80), this endpoint only supported the `full_name`, `email`, `old_password`, and `new_password` parameters. Notification settings were managed by `PATCH /settings/notifications`, and all other settings by `PATCH /settings/display`. The feature level 80 migration to merge these endpoints did not change how request parameters are encoded. Note, however, that it did change the handling of any invalid parameters present in a request to change notification or display settings, since the merged endpoint uses the new response format that was introduced for `/settings` in Zulip 5.0 (feature level 78).  The `/settings/display` and `/settings/notifications` endpoints are now deprecated aliases for this endpoint for backwards-compatibility, and will be removed once clients have migrated to use this endpoint. 
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [String] fullName:
  ///   A new display name for the user. 
  ///
  /// * [String] email:
  ///   Asks the server to initiate a confirmation sequence to change the user's email address to the indicated value. The user will need to demonstrate control of the new email address by clicking a confirmation link sent to that address. 
  ///
  /// * [String] oldPassword:
  ///   The user's old Zulip password (or LDAP password, if LDAP authentication is in use).  Required only when sending the `new_password` parameter. 
  ///
  /// * [String] newPassword:
  ///   The user's new Zulip password (or LDAP password, if LDAP authentication is in use).  The `old_password` parameter must be included in the request. 
  ///
  /// * [bool] twentyFourHourTime:
  ///   Whether time should be [displayed in 24-hour notation](/help/change-the-time-format).  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/display` endpoint. 
  ///
  /// * [bool] denseMode:
  ///   This setting has no effect at present.  It is reserved for use in controlling the default font size in Zulip.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/display` endpoint. 
  ///
  /// * [bool] starredMessageCounts:
  ///   Whether clients should display the [number of starred messages](/help/star-a-message#display-the-number-of-starred-messages).  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/display` endpoint. 
  ///
  /// * [bool] fluidLayoutWidth:
  ///   Whether to use the [maximum available screen width](/help/enable-full-width-display) for the web app's center panel (message feed, recent topics) on wide screens.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/display` endpoint. 
  ///
  /// * [bool] highContrastMode:
  ///   This setting is reserved for use to control variations in Zulip's design to help visually impaired users.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/display` endpoint. 
  ///
  /// * [int] colorScheme:
  ///   Controls which [color theme](/help/night-mode) to use.  * 1 - Automatic * 2 - Night mode * 3 - Day mode  Automatic detection is implementing using the standard `prefers-color-scheme` media query.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/display` endpoint. 
  ///
  /// * [bool] enableDraftsSynchronization:
  ///   A boolean parameter to control whether synchronizing drafts is enabled for the user. When synchronization is disabled, all drafts stored in the server will be automatically deleted from the server.  This does not do anything (like sending events) to delete local copies of drafts stored in clients.  **Changes**: New in Zulip 5.0 (feature level 87). 
  ///
  /// * [bool] translateEmoticons:
  ///   Whether to [translate emoticons to emoji](/help/enable-emoticon-translations) in messages the user sends.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/display` endpoint. 
  ///
  /// * [String] defaultLanguage:
  ///   What [default language](/help/change-your-language) to use for the account.  This controls both the Zulip UI as well as email notifications sent to the user.  The value needs to be a standard language code that the Zulip server has translation data for; for example, `\"en\"` for English or `\"de\"` for German.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/display` endpoint.  Unnecessary JSON-encoding of this parameter was removed in Zulip 4.0 (feature level 63). 
  ///
  /// * [String] defaultView:
  ///   The [default view](/help/change-default-view) used when opening a new Zulip web app window or hitting the `Esc` keyboard shortcut repeatedly.  * \"recent_topics\" - Recent topics view * \"all_messages\" - All messages view  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/display` endpoint.  Unnecessary JSON-encoding of this parameter was removed in Zulip 4.0 (feature level 64). 
  ///
  /// * [bool] leftSideUserlist:
  ///   Whether the users list on left sidebar in narrow windows.  This feature is not heavily used and is likely to be reworked.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/display` endpoint. 
  ///
  /// * [String] emojiset:
  ///   The user's configured [emoji set](/help/emoji-and-emoticons#use-emoticons), used to display emoji to the user everything they appear in the UI.  * \"google\" - Google modern * \"google-blob\" - Google classic * \"twitter\" - Twitter * \"text\" - Plain text  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/display` endpoint.  Unnecessary JSON-encoding of this parameter was removed in Zulip 4.0 (feature level 64). 
  ///
  /// * [int] demoteInactiveStreams:
  ///   Whether to [demote inactive streams](/help/manage-inactive-streams) in the left sidebar.  * 1 - Automatic * 2 - Always * 3 - Never  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/display` endpoint. 
  ///
  /// * [String] timezone:
  ///   The user's [configured timezone](/help/change-your-timezone).  Timezone values supported by the server are served at [/static/generated/timezones.json](/static/generated/timezones.json).  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/display` endpoint.  Unnecessary JSON-encoding of this parameter was removed in Zulip 4.0 (feature level 64). 
  ///
  /// * [bool] enableStreamDesktopNotifications:
  ///   Enable visual desktop notifications for stream messages.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/notifications` endpoint. 
  ///
  /// * [bool] enableStreamEmailNotifications:
  ///   Enable email notifications for stream messages.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/notifications` endpoint. 
  ///
  /// * [bool] enableStreamPushNotifications:
  ///   Enable mobile notifications for stream messages.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/notifications` endpoint. 
  ///
  /// * [bool] enableStreamAudibleNotifications:
  ///   Enable audible desktop notifications for stream messages.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/notifications` endpoint. 
  ///
  /// * [String] notificationSound:
  ///   Notification sound name.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/notifications` endpoint.  Unnecessary JSON-encoding of this parameter was removed in Zulip 4.0 (feature level 63). 
  ///
  /// * [bool] enableDesktopNotifications:
  ///   Enable visual desktop notifications for private messages and @-mentions.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/notifications` endpoint. 
  ///
  /// * [bool] enableSounds:
  ///   Enable audible desktop notifications for private messages and @-mentions.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/notifications` endpoint. 
  ///
  /// * [int] emailNotificationsBatchingPeriodSeconds:
  ///   The duration (in seconds) for which the server should wait to batch email notifications before sending them.  **Changes**: New in Zulip 5.0 (feature level 82) 
  ///
  /// * [bool] enableOfflineEmailNotifications:
  ///   Enable email notifications for private messages and @-mentions received when the user is offline.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/notifications` endpoint. 
  ///
  /// * [bool] enableOfflinePushNotifications:
  ///   Enable mobile notification for private messages and @-mentions received when the user is offline.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/notifications` endpoint. 
  ///
  /// * [bool] enableOnlinePushNotifications:
  ///   Enable mobile notification for private messages and @-mentions received when the user is online.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/notifications` endpoint. 
  ///
  /// * [bool] enableDigestEmails:
  ///   Enable digest emails when the user is away.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/notifications` endpoint. 
  ///
  /// * [bool] enableMarketingEmails:
  ///   Enable marketing emails. Has no function outside Zulip Cloud.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/notifications` endpoint. 
  ///
  /// * [bool] enableLoginEmails:
  ///   Enable email notifications for new logins to account.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/notifications` endpoint. 
  ///
  /// * [bool] messageContentInEmailNotifications:
  ///   Include the message's content in email notifications for new messages.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/notifications` endpoint. 
  ///
  /// * [bool] pmContentInDesktopNotifications:
  ///   Include content of private messages in desktop notifications.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/notifications` endpoint. 
  ///
  /// * [bool] wildcardMentionsNotify:
  ///   Whether wildcard mentions (E.g. @**all**) should send notifications like a personal mention.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/notifications` endpoint. 
  ///
  /// * [int] desktopIconCountDisplay:
  ///   Unread count summary (appears in desktop sidebar and browser tab)  * 1 - All unreads * 2 - Private messages and mentions * 3 - None  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/notifications` endpoint. 
  ///
  /// * [bool] realmNameInNotifications:
  ///   Include organization name in subject of message notification emails.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/notifications` endpoint. 
  ///
  /// * [bool] presenceEnabled:
  ///   Display the presence status to other users when online.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/notifications` endpoint. 
  ///
  /// * [bool] enterSends:
  ///   Whether pressing Enter in the compose box sends a message (or saves a message edit).  **Changes**: Before Zulip 5.0 (feature level 81), this setting was managed by the `POST /users/me/enter-sends` endpoint, with the same parameter format. 
  Future<Response> updateSettingsWithHttpInfo({ String fullName, String email, String oldPassword, String newPassword, bool twentyFourHourTime, bool denseMode, bool starredMessageCounts, bool fluidLayoutWidth, bool highContrastMode, int colorScheme, bool enableDraftsSynchronization, bool translateEmoticons, String defaultLanguage, String defaultView, bool leftSideUserlist, String emojiset, int demoteInactiveStreams, String timezone, bool enableStreamDesktopNotifications, bool enableStreamEmailNotifications, bool enableStreamPushNotifications, bool enableStreamAudibleNotifications, String notificationSound, bool enableDesktopNotifications, bool enableSounds, int emailNotificationsBatchingPeriodSeconds, bool enableOfflineEmailNotifications, bool enableOfflinePushNotifications, bool enableOnlinePushNotifications, bool enableDigestEmails, bool enableMarketingEmails, bool enableLoginEmails, bool messageContentInEmailNotifications, bool pmContentInDesktopNotifications, bool wildcardMentionsNotify, int desktopIconCountDisplay, bool realmNameInNotifications, bool presenceEnabled, bool enterSends }) async {
    // Verify required params are set.

    final path = r'/settings';

    Object postBody;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

    if (fullName != null) {
      queryParams.addAll(_convertParametersForCollectionFormat('', 'full_name', fullName));
    }
    if (email != null) {
      queryParams.addAll(_convertParametersForCollectionFormat('', 'email', email));
    }
    if (oldPassword != null) {
      queryParams.addAll(_convertParametersForCollectionFormat('', 'old_password', oldPassword));
    }
    if (newPassword != null) {
      queryParams.addAll(_convertParametersForCollectionFormat('', 'new_password', newPassword));
    }
    if (twentyFourHourTime != null) {
      queryParams.addAll(_convertParametersForCollectionFormat('', 'twenty_four_hour_time', twentyFourHourTime));
    }
    if (denseMode != null) {
      queryParams.addAll(_convertParametersForCollectionFormat('', 'dense_mode', denseMode));
    }
    if (starredMessageCounts != null) {
      queryParams.addAll(_convertParametersForCollectionFormat('', 'starred_message_counts', starredMessageCounts));
    }
    if (fluidLayoutWidth != null) {
      queryParams.addAll(_convertParametersForCollectionFormat('', 'fluid_layout_width', fluidLayoutWidth));
    }
    if (highContrastMode != null) {
      queryParams.addAll(_convertParametersForCollectionFormat('', 'high_contrast_mode', highContrastMode));
    }
    if (colorScheme != null) {
      queryParams.addAll(_convertParametersForCollectionFormat('', 'color_scheme', colorScheme));
    }
    if (enableDraftsSynchronization != null) {
      queryParams.addAll(_convertParametersForCollectionFormat('', 'enable_drafts_synchronization', enableDraftsSynchronization));
    }
    if (translateEmoticons != null) {
      queryParams.addAll(_convertParametersForCollectionFormat('', 'translate_emoticons', translateEmoticons));
    }
    if (defaultLanguage != null) {
      queryParams.addAll(_convertParametersForCollectionFormat('', 'default_language', defaultLanguage));
    }
    if (defaultView != null) {
      queryParams.addAll(_convertParametersForCollectionFormat('', 'default_view', defaultView));
    }
    if (leftSideUserlist != null) {
      queryParams.addAll(_convertParametersForCollectionFormat('', 'left_side_userlist', leftSideUserlist));
    }
    if (emojiset != null) {
      queryParams.addAll(_convertParametersForCollectionFormat('', 'emojiset', emojiset));
    }
    if (demoteInactiveStreams != null) {
      queryParams.addAll(_convertParametersForCollectionFormat('', 'demote_inactive_streams', demoteInactiveStreams));
    }
    if (timezone != null) {
      queryParams.addAll(_convertParametersForCollectionFormat('', 'timezone', timezone));
    }
    if (enableStreamDesktopNotifications != null) {
      queryParams.addAll(_convertParametersForCollectionFormat('', 'enable_stream_desktop_notifications', enableStreamDesktopNotifications));
    }
    if (enableStreamEmailNotifications != null) {
      queryParams.addAll(_convertParametersForCollectionFormat('', 'enable_stream_email_notifications', enableStreamEmailNotifications));
    }
    if (enableStreamPushNotifications != null) {
      queryParams.addAll(_convertParametersForCollectionFormat('', 'enable_stream_push_notifications', enableStreamPushNotifications));
    }
    if (enableStreamAudibleNotifications != null) {
      queryParams.addAll(_convertParametersForCollectionFormat('', 'enable_stream_audible_notifications', enableStreamAudibleNotifications));
    }
    if (notificationSound != null) {
      queryParams.addAll(_convertParametersForCollectionFormat('', 'notification_sound', notificationSound));
    }
    if (enableDesktopNotifications != null) {
      queryParams.addAll(_convertParametersForCollectionFormat('', 'enable_desktop_notifications', enableDesktopNotifications));
    }
    if (enableSounds != null) {
      queryParams.addAll(_convertParametersForCollectionFormat('', 'enable_sounds', enableSounds));
    }
    if (emailNotificationsBatchingPeriodSeconds != null) {
      queryParams.addAll(_convertParametersForCollectionFormat('', 'email_notifications_batching_period_seconds', emailNotificationsBatchingPeriodSeconds));
    }
    if (enableOfflineEmailNotifications != null) {
      queryParams.addAll(_convertParametersForCollectionFormat('', 'enable_offline_email_notifications', enableOfflineEmailNotifications));
    }
    if (enableOfflinePushNotifications != null) {
      queryParams.addAll(_convertParametersForCollectionFormat('', 'enable_offline_push_notifications', enableOfflinePushNotifications));
    }
    if (enableOnlinePushNotifications != null) {
      queryParams.addAll(_convertParametersForCollectionFormat('', 'enable_online_push_notifications', enableOnlinePushNotifications));
    }
    if (enableDigestEmails != null) {
      queryParams.addAll(_convertParametersForCollectionFormat('', 'enable_digest_emails', enableDigestEmails));
    }
    if (enableMarketingEmails != null) {
      queryParams.addAll(_convertParametersForCollectionFormat('', 'enable_marketing_emails', enableMarketingEmails));
    }
    if (enableLoginEmails != null) {
      queryParams.addAll(_convertParametersForCollectionFormat('', 'enable_login_emails', enableLoginEmails));
    }
    if (messageContentInEmailNotifications != null) {
      queryParams.addAll(_convertParametersForCollectionFormat('', 'message_content_in_email_notifications', messageContentInEmailNotifications));
    }
    if (pmContentInDesktopNotifications != null) {
      queryParams.addAll(_convertParametersForCollectionFormat('', 'pm_content_in_desktop_notifications', pmContentInDesktopNotifications));
    }
    if (wildcardMentionsNotify != null) {
      queryParams.addAll(_convertParametersForCollectionFormat('', 'wildcard_mentions_notify', wildcardMentionsNotify));
    }
    if (desktopIconCountDisplay != null) {
      queryParams.addAll(_convertParametersForCollectionFormat('', 'desktop_icon_count_display', desktopIconCountDisplay));
    }
    if (realmNameInNotifications != null) {
      queryParams.addAll(_convertParametersForCollectionFormat('', 'realm_name_in_notifications', realmNameInNotifications));
    }
    if (presenceEnabled != null) {
      queryParams.addAll(_convertParametersForCollectionFormat('', 'presence_enabled', presenceEnabled));
    }
    if (enterSends != null) {
      queryParams.addAll(_convertParametersForCollectionFormat('', 'enter_sends', enterSends));
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

  /// Update settings
  ///
  /// This endpoint is used to edit the current user's settings.  `PATCH {{ api_url }}/v1/settings`  **Changes**: Prior to Zulip 5.0 (feature level 80), this endpoint only supported the `full_name`, `email`, `old_password`, and `new_password` parameters. Notification settings were managed by `PATCH /settings/notifications`, and all other settings by `PATCH /settings/display`. The feature level 80 migration to merge these endpoints did not change how request parameters are encoded. Note, however, that it did change the handling of any invalid parameters present in a request to change notification or display settings, since the merged endpoint uses the new response format that was introduced for `/settings` in Zulip 5.0 (feature level 78).  The `/settings/display` and `/settings/notifications` endpoints are now deprecated aliases for this endpoint for backwards-compatibility, and will be removed once clients have migrated to use this endpoint. 
  ///
  /// Parameters:
  ///
  /// * [String] fullName:
  ///   A new display name for the user. 
  ///
  /// * [String] email:
  ///   Asks the server to initiate a confirmation sequence to change the user's email address to the indicated value. The user will need to demonstrate control of the new email address by clicking a confirmation link sent to that address. 
  ///
  /// * [String] oldPassword:
  ///   The user's old Zulip password (or LDAP password, if LDAP authentication is in use).  Required only when sending the `new_password` parameter. 
  ///
  /// * [String] newPassword:
  ///   The user's new Zulip password (or LDAP password, if LDAP authentication is in use).  The `old_password` parameter must be included in the request. 
  ///
  /// * [bool] twentyFourHourTime:
  ///   Whether time should be [displayed in 24-hour notation](/help/change-the-time-format).  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/display` endpoint. 
  ///
  /// * [bool] denseMode:
  ///   This setting has no effect at present.  It is reserved for use in controlling the default font size in Zulip.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/display` endpoint. 
  ///
  /// * [bool] starredMessageCounts:
  ///   Whether clients should display the [number of starred messages](/help/star-a-message#display-the-number-of-starred-messages).  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/display` endpoint. 
  ///
  /// * [bool] fluidLayoutWidth:
  ///   Whether to use the [maximum available screen width](/help/enable-full-width-display) for the web app's center panel (message feed, recent topics) on wide screens.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/display` endpoint. 
  ///
  /// * [bool] highContrastMode:
  ///   This setting is reserved for use to control variations in Zulip's design to help visually impaired users.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/display` endpoint. 
  ///
  /// * [int] colorScheme:
  ///   Controls which [color theme](/help/night-mode) to use.  * 1 - Automatic * 2 - Night mode * 3 - Day mode  Automatic detection is implementing using the standard `prefers-color-scheme` media query.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/display` endpoint. 
  ///
  /// * [bool] enableDraftsSynchronization:
  ///   A boolean parameter to control whether synchronizing drafts is enabled for the user. When synchronization is disabled, all drafts stored in the server will be automatically deleted from the server.  This does not do anything (like sending events) to delete local copies of drafts stored in clients.  **Changes**: New in Zulip 5.0 (feature level 87). 
  ///
  /// * [bool] translateEmoticons:
  ///   Whether to [translate emoticons to emoji](/help/enable-emoticon-translations) in messages the user sends.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/display` endpoint. 
  ///
  /// * [String] defaultLanguage:
  ///   What [default language](/help/change-your-language) to use for the account.  This controls both the Zulip UI as well as email notifications sent to the user.  The value needs to be a standard language code that the Zulip server has translation data for; for example, `\"en\"` for English or `\"de\"` for German.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/display` endpoint.  Unnecessary JSON-encoding of this parameter was removed in Zulip 4.0 (feature level 63). 
  ///
  /// * [String] defaultView:
  ///   The [default view](/help/change-default-view) used when opening a new Zulip web app window or hitting the `Esc` keyboard shortcut repeatedly.  * \"recent_topics\" - Recent topics view * \"all_messages\" - All messages view  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/display` endpoint.  Unnecessary JSON-encoding of this parameter was removed in Zulip 4.0 (feature level 64). 
  ///
  /// * [bool] leftSideUserlist:
  ///   Whether the users list on left sidebar in narrow windows.  This feature is not heavily used and is likely to be reworked.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/display` endpoint. 
  ///
  /// * [String] emojiset:
  ///   The user's configured [emoji set](/help/emoji-and-emoticons#use-emoticons), used to display emoji to the user everything they appear in the UI.  * \"google\" - Google modern * \"google-blob\" - Google classic * \"twitter\" - Twitter * \"text\" - Plain text  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/display` endpoint.  Unnecessary JSON-encoding of this parameter was removed in Zulip 4.0 (feature level 64). 
  ///
  /// * [int] demoteInactiveStreams:
  ///   Whether to [demote inactive streams](/help/manage-inactive-streams) in the left sidebar.  * 1 - Automatic * 2 - Always * 3 - Never  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/display` endpoint. 
  ///
  /// * [String] timezone:
  ///   The user's [configured timezone](/help/change-your-timezone).  Timezone values supported by the server are served at [/static/generated/timezones.json](/static/generated/timezones.json).  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/display` endpoint.  Unnecessary JSON-encoding of this parameter was removed in Zulip 4.0 (feature level 64). 
  ///
  /// * [bool] enableStreamDesktopNotifications:
  ///   Enable visual desktop notifications for stream messages.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/notifications` endpoint. 
  ///
  /// * [bool] enableStreamEmailNotifications:
  ///   Enable email notifications for stream messages.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/notifications` endpoint. 
  ///
  /// * [bool] enableStreamPushNotifications:
  ///   Enable mobile notifications for stream messages.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/notifications` endpoint. 
  ///
  /// * [bool] enableStreamAudibleNotifications:
  ///   Enable audible desktop notifications for stream messages.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/notifications` endpoint. 
  ///
  /// * [String] notificationSound:
  ///   Notification sound name.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/notifications` endpoint.  Unnecessary JSON-encoding of this parameter was removed in Zulip 4.0 (feature level 63). 
  ///
  /// * [bool] enableDesktopNotifications:
  ///   Enable visual desktop notifications for private messages and @-mentions.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/notifications` endpoint. 
  ///
  /// * [bool] enableSounds:
  ///   Enable audible desktop notifications for private messages and @-mentions.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/notifications` endpoint. 
  ///
  /// * [int] emailNotificationsBatchingPeriodSeconds:
  ///   The duration (in seconds) for which the server should wait to batch email notifications before sending them.  **Changes**: New in Zulip 5.0 (feature level 82) 
  ///
  /// * [bool] enableOfflineEmailNotifications:
  ///   Enable email notifications for private messages and @-mentions received when the user is offline.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/notifications` endpoint. 
  ///
  /// * [bool] enableOfflinePushNotifications:
  ///   Enable mobile notification for private messages and @-mentions received when the user is offline.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/notifications` endpoint. 
  ///
  /// * [bool] enableOnlinePushNotifications:
  ///   Enable mobile notification for private messages and @-mentions received when the user is online.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/notifications` endpoint. 
  ///
  /// * [bool] enableDigestEmails:
  ///   Enable digest emails when the user is away.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/notifications` endpoint. 
  ///
  /// * [bool] enableMarketingEmails:
  ///   Enable marketing emails. Has no function outside Zulip Cloud.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/notifications` endpoint. 
  ///
  /// * [bool] enableLoginEmails:
  ///   Enable email notifications for new logins to account.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/notifications` endpoint. 
  ///
  /// * [bool] messageContentInEmailNotifications:
  ///   Include the message's content in email notifications for new messages.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/notifications` endpoint. 
  ///
  /// * [bool] pmContentInDesktopNotifications:
  ///   Include content of private messages in desktop notifications.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/notifications` endpoint. 
  ///
  /// * [bool] wildcardMentionsNotify:
  ///   Whether wildcard mentions (E.g. @**all**) should send notifications like a personal mention.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/notifications` endpoint. 
  ///
  /// * [int] desktopIconCountDisplay:
  ///   Unread count summary (appears in desktop sidebar and browser tab)  * 1 - All unreads * 2 - Private messages and mentions * 3 - None  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/notifications` endpoint. 
  ///
  /// * [bool] realmNameInNotifications:
  ///   Include organization name in subject of message notification emails.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/notifications` endpoint. 
  ///
  /// * [bool] presenceEnabled:
  ///   Display the presence status to other users when online.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/notifications` endpoint. 
  ///
  /// * [bool] enterSends:
  ///   Whether pressing Enter in the compose box sends a message (or saves a message edit).  **Changes**: Before Zulip 5.0 (feature level 81), this setting was managed by the `POST /users/me/enter-sends` endpoint, with the same parameter format. 
  Future<JsonSuccessBase> updateSettings({ String fullName, String email, String oldPassword, String newPassword, bool twentyFourHourTime, bool denseMode, bool starredMessageCounts, bool fluidLayoutWidth, bool highContrastMode, int colorScheme, bool enableDraftsSynchronization, bool translateEmoticons, String defaultLanguage, String defaultView, bool leftSideUserlist, String emojiset, int demoteInactiveStreams, String timezone, bool enableStreamDesktopNotifications, bool enableStreamEmailNotifications, bool enableStreamPushNotifications, bool enableStreamAudibleNotifications, String notificationSound, bool enableDesktopNotifications, bool enableSounds, int emailNotificationsBatchingPeriodSeconds, bool enableOfflineEmailNotifications, bool enableOfflinePushNotifications, bool enableOnlinePushNotifications, bool enableDigestEmails, bool enableMarketingEmails, bool enableLoginEmails, bool messageContentInEmailNotifications, bool pmContentInDesktopNotifications, bool wildcardMentionsNotify, int desktopIconCountDisplay, bool realmNameInNotifications, bool presenceEnabled, bool enterSends }) async {
    final response = await updateSettingsWithHttpInfo( fullName: fullName, email: email, oldPassword: oldPassword, newPassword: newPassword, twentyFourHourTime: twentyFourHourTime, denseMode: denseMode, starredMessageCounts: starredMessageCounts, fluidLayoutWidth: fluidLayoutWidth, highContrastMode: highContrastMode, colorScheme: colorScheme, enableDraftsSynchronization: enableDraftsSynchronization, translateEmoticons: translateEmoticons, defaultLanguage: defaultLanguage, defaultView: defaultView, leftSideUserlist: leftSideUserlist, emojiset: emojiset, demoteInactiveStreams: demoteInactiveStreams, timezone: timezone, enableStreamDesktopNotifications: enableStreamDesktopNotifications, enableStreamEmailNotifications: enableStreamEmailNotifications, enableStreamPushNotifications: enableStreamPushNotifications, enableStreamAudibleNotifications: enableStreamAudibleNotifications, notificationSound: notificationSound, enableDesktopNotifications: enableDesktopNotifications, enableSounds: enableSounds, emailNotificationsBatchingPeriodSeconds: emailNotificationsBatchingPeriodSeconds, enableOfflineEmailNotifications: enableOfflineEmailNotifications, enableOfflinePushNotifications: enableOfflinePushNotifications, enableOnlinePushNotifications: enableOnlinePushNotifications, enableDigestEmails: enableDigestEmails, enableMarketingEmails: enableMarketingEmails, enableLoginEmails: enableLoginEmails, messageContentInEmailNotifications: messageContentInEmailNotifications, pmContentInDesktopNotifications: pmContentInDesktopNotifications, wildcardMentionsNotify: wildcardMentionsNotify, desktopIconCountDisplay: desktopIconCountDisplay, realmNameInNotifications: realmNameInNotifications, presenceEnabled: presenceEnabled, enterSends: enterSends );
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

  /// Update your status
  ///
  /// Change your [status](/help/status-and-availability).  `POST {{ api_url }}/v1/users/me/status`  A request to this endpoint will only change the parameters passed. For example, passing just `status_text` requests a change in the status text, but will leave the status emoji unchanged.  Clients that wish to set the user's status to a specific value should pass all supported parameters. 
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [String] statusText:
  ///   The text content of the status message. Sending the empty string will clear the user's status.  **Note**: The limit on the size of the message is 60 characters. 
  ///
  /// * [bool] away:
  ///   Whether the user should be marked as \"away\". 
  ///
  /// * [String] emojiName:
  ///   The name for the emoji to associate with this status. 
  ///
  /// * [String] emojiCode:
  ///   A unique identifier, defining the specific emoji codepoint requested, within the namespace of the `reaction_type`.  For example, for `unicode_emoji`, this will be an encoding of the Unicode codepoint; for `realm_emoji`, it'll be the ID of the realm emoji. 
  ///
  /// * [String] reactionType:
  ///   One of the following values:  * `unicode_emoji`: Unicode emoji (`emoji_code` will be its Unicode   codepoint). * `realm_emoji`: [Custom emoji](/help/add-custom-emoji).   (`emoji_code` will be its ID). * `zulip_extra_emoji`: Special emoji included with Zulip.  Exists to   namespace the `zulip` emoji. 
  Future<Response> updateStatusWithHttpInfo({ String statusText, bool away, String emojiName, String emojiCode, String reactionType }) async {
    // Verify required params are set.

    final path = r'/users/me/status';

    Object postBody;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

    if (statusText != null) {
      queryParams.addAll(_convertParametersForCollectionFormat('', 'status_text', statusText));
    }
    if (away != null) {
      queryParams.addAll(_convertParametersForCollectionFormat('', 'away', away));
    }
    if (emojiName != null) {
      queryParams.addAll(_convertParametersForCollectionFormat('', 'emoji_name', emojiName));
    }
    if (emojiCode != null) {
      queryParams.addAll(_convertParametersForCollectionFormat('', 'emoji_code', emojiCode));
    }
    if (reactionType != null) {
      queryParams.addAll(_convertParametersForCollectionFormat('', 'reaction_type', reactionType));
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

  /// Update your status
  ///
  /// Change your [status](/help/status-and-availability).  `POST {{ api_url }}/v1/users/me/status`  A request to this endpoint will only change the parameters passed. For example, passing just `status_text` requests a change in the status text, but will leave the status emoji unchanged.  Clients that wish to set the user's status to a specific value should pass all supported parameters. 
  ///
  /// Parameters:
  ///
  /// * [String] statusText:
  ///   The text content of the status message. Sending the empty string will clear the user's status.  **Note**: The limit on the size of the message is 60 characters. 
  ///
  /// * [bool] away:
  ///   Whether the user should be marked as \"away\". 
  ///
  /// * [String] emojiName:
  ///   The name for the emoji to associate with this status. 
  ///
  /// * [String] emojiCode:
  ///   A unique identifier, defining the specific emoji codepoint requested, within the namespace of the `reaction_type`.  For example, for `unicode_emoji`, this will be an encoding of the Unicode codepoint; for `realm_emoji`, it'll be the ID of the realm emoji. 
  ///
  /// * [String] reactionType:
  ///   One of the following values:  * `unicode_emoji`: Unicode emoji (`emoji_code` will be its Unicode   codepoint). * `realm_emoji`: [Custom emoji](/help/add-custom-emoji).   (`emoji_code` will be its ID). * `zulip_extra_emoji`: Special emoji included with Zulip.  Exists to   namespace the `zulip` emoji. 
  Future<JsonSuccess> updateStatus({ String statusText, bool away, String emojiName, String emojiCode, String reactionType }) async {
    final response = await updateStatusWithHttpInfo( statusText: statusText, away: away, emojiName: emojiName, emojiCode: emojiCode, reactionType: reactionType );
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

  /// Update a user
  ///
  /// Administrative endpoint to update the details of another user in the organization.  `PATCH {{ api_url }}/v1/users/{user_id}`  Supports everything an administrator can do to edit details of another user's account, including editing full name, [role](/help/roles-and-permissions), and [custom profile fields](/help/add-custom-profile-fields). 
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [int] userId (required):
  ///   The target user's ID. 
  ///
  /// * [String] fullName:
  ///   The user's full name. 
  ///
  /// * [int] role:
  ///   New [role](/help/roles-and-permissions) for the user.  Roles are encoded as:  * Organization owner: 100 * Organization administrator: 200 * Organization moderator: 300 * Member: 400 * Guest: 600  Only organization owners can add or remove the owner role.  The owner role cannot be removed from the only organization owner.  **Changes**: New in Zulip 3.0 (feature level 8), replacing the previous pair of `is_admin` and `is_guest` boolean parameters. Organization moderator role added in Zulip 4.0 (feature level 60). 
  ///
  /// * [List<Object>] profileData:
  ///   A dictionary containing the to be updated custom profile field data for the user. 
  Future<Response> updateUserWithHttpInfo(int userId, { String fullName, int role, List<Object> profileData }) async {
    // Verify required params are set.
    if (userId == null) {
     throw ApiException(HttpStatus.badRequest, 'Missing required param: userId');
    }

    final path = r'/users/{user_id}'
      .replaceAll('{' + 'user_id' + '}', userId.toString());

    Object postBody;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

    if (fullName != null) {
      queryParams.addAll(_convertParametersForCollectionFormat('', 'full_name', fullName));
    }
    if (role != null) {
      queryParams.addAll(_convertParametersForCollectionFormat('', 'role', role));
    }
    if (profileData != null) {
      queryParams.addAll(_convertParametersForCollectionFormat('multi', 'profile_data', profileData));
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

  /// Update a user
  ///
  /// Administrative endpoint to update the details of another user in the organization.  `PATCH {{ api_url }}/v1/users/{user_id}`  Supports everything an administrator can do to edit details of another user's account, including editing full name, [role](/help/roles-and-permissions), and [custom profile fields](/help/add-custom-profile-fields). 
  ///
  /// Parameters:
  ///
  /// * [int] userId (required):
  ///   The target user's ID. 
  ///
  /// * [String] fullName:
  ///   The user's full name. 
  ///
  /// * [int] role:
  ///   New [role](/help/roles-and-permissions) for the user.  Roles are encoded as:  * Organization owner: 100 * Organization administrator: 200 * Organization moderator: 300 * Member: 400 * Guest: 600  Only organization owners can add or remove the owner role.  The owner role cannot be removed from the only organization owner.  **Changes**: New in Zulip 3.0 (feature level 8), replacing the previous pair of `is_admin` and `is_guest` boolean parameters. Organization moderator role added in Zulip 4.0 (feature level 60). 
  ///
  /// * [List<Object>] profileData:
  ///   A dictionary containing the to be updated custom profile field data for the user. 
  Future<JsonSuccess> updateUser(int userId, { String fullName, int role, List<Object> profileData }) async {
    final response = await updateUserWithHttpInfo(userId,  fullName: fullName, role: role, profileData: profileData );
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

  /// Update a user group
  ///
  /// Update the name or description of a [user group](/help/user-groups).  `PATCH {{ api_url }}/v1/user_groups/{user_group_id}` 
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [int] userGroupId (required):
  ///   The ID of the target user group. 
  ///
  /// * [String] name (required):
  ///   The new name of the group. 
  ///
  /// * [String] description (required):
  ///   The new description of the group. 
  Future<Response> updateUserGroupWithHttpInfo(int userGroupId, String name, String description) async {
    // Verify required params are set.
    if (userGroupId == null) {
     throw ApiException(HttpStatus.badRequest, 'Missing required param: userGroupId');
    }
    if (name == null) {
     throw ApiException(HttpStatus.badRequest, 'Missing required param: name');
    }
    if (description == null) {
     throw ApiException(HttpStatus.badRequest, 'Missing required param: description');
    }

    final path = r'/user_groups/{user_group_id}'
      .replaceAll('{' + 'user_group_id' + '}', userGroupId.toString());

    Object postBody;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

      queryParams.addAll(_convertParametersForCollectionFormat('', 'name', name));
      queryParams.addAll(_convertParametersForCollectionFormat('', 'description', description));

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

  /// Update a user group
  ///
  /// Update the name or description of a [user group](/help/user-groups).  `PATCH {{ api_url }}/v1/user_groups/{user_group_id}` 
  ///
  /// Parameters:
  ///
  /// * [int] userGroupId (required):
  ///   The ID of the target user group. 
  ///
  /// * [String] name (required):
  ///   The new name of the group. 
  ///
  /// * [String] description (required):
  ///   The new description of the group. 
  Future<JsonSuccess> updateUserGroup(int userGroupId, String name, String description) async {
    final response = await updateUserGroupWithHttpInfo(userGroupId, name, description);
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

  /// Update user group members
  ///
  /// Update the members of a [user group](/help/user-groups).  `POST {{ api_url }}/v1/user_groups/{user_group_id}/members` 
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [int] userGroupId (required):
  ///   The ID of the target user group. 
  ///
  /// * [List<int>] delete:
  ///   The list of user ids to be removed from the user group. 
  ///
  /// * [List<int>] add:
  ///   The list of user ids to be added to the user group. 
  Future<Response> updateUserGroupMembersWithHttpInfo(int userGroupId, { List<int> delete, List<int> add }) async {
    // Verify required params are set.
    if (userGroupId == null) {
     throw ApiException(HttpStatus.badRequest, 'Missing required param: userGroupId');
    }

    final path = r'/user_groups/{user_group_id}/members'
      .replaceAll('{' + 'user_group_id' + '}', userGroupId.toString());

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
      'POST',
      queryParams,
      postBody,
      headerParams,
      formParams,
      nullableContentType,
      authNames,
    );
  }

  /// Update user group members
  ///
  /// Update the members of a [user group](/help/user-groups).  `POST {{ api_url }}/v1/user_groups/{user_group_id}/members` 
  ///
  /// Parameters:
  ///
  /// * [int] userGroupId (required):
  ///   The ID of the target user group. 
  ///
  /// * [List<int>] delete:
  ///   The list of user ids to be removed from the user group. 
  ///
  /// * [List<int>] add:
  ///   The list of user ids to be added to the user group. 
  Future<JsonSuccess> updateUserGroupMembers(int userGroupId, { List<int> delete, List<int> add }) async {
    final response = await updateUserGroupMembersWithHttpInfo(userGroupId,  delete: delete, add: add );
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
}
