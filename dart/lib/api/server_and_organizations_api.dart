//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.0

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;


class ServerAndOrganizationsApi {
  ServerAndOrganizationsApi([ApiClient apiClient]) : apiClient = apiClient ?? defaultApiClient;

  final ApiClient apiClient;

  /// Add a code playground
  ///
  /// Configure [code playgrounds](/help/code-blocks#code-playgrounds) for the organization.  `POST {{ api_url }}/v1/realm/playgrounds`  **Changes**: New in Zulip 4.0 (feature level 49). A parameter encoding bug was fixed in Zulip 4.0 (feature level 57). 
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [String] name (required):
  ///   The user-visible display name of the playground which can be used to pick the target playground, especially when multiple playground options exist for that programming language. 
  ///
  /// * [String] pygmentsLanguage (required):
  ///   The name of the Pygments language lexer for that programming language. 
  ///
  /// * [String] urlPrefix (required):
  ///   The url prefix for the playground. 
  Future<Response> addCodePlaygroundWithHttpInfo(String name, String pygmentsLanguage, String urlPrefix) async {
    // Verify required params are set.
    if (name == null) {
     throw ApiException(HttpStatus.badRequest, 'Missing required param: name');
    }
    if (pygmentsLanguage == null) {
     throw ApiException(HttpStatus.badRequest, 'Missing required param: pygmentsLanguage');
    }
    if (urlPrefix == null) {
     throw ApiException(HttpStatus.badRequest, 'Missing required param: urlPrefix');
    }

    final path = r'/realm/playgrounds';

    Object postBody;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

      queryParams.addAll(_convertParametersForCollectionFormat('', 'name', name));
      queryParams.addAll(_convertParametersForCollectionFormat('', 'pygments_language', pygmentsLanguage));
      queryParams.addAll(_convertParametersForCollectionFormat('', 'url_prefix', urlPrefix));

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

  /// Add a code playground
  ///
  /// Configure [code playgrounds](/help/code-blocks#code-playgrounds) for the organization.  `POST {{ api_url }}/v1/realm/playgrounds`  **Changes**: New in Zulip 4.0 (feature level 49). A parameter encoding bug was fixed in Zulip 4.0 (feature level 57). 
  ///
  /// Parameters:
  ///
  /// * [String] name (required):
  ///   The user-visible display name of the playground which can be used to pick the target playground, especially when multiple playground options exist for that programming language. 
  ///
  /// * [String] pygmentsLanguage (required):
  ///   The name of the Pygments language lexer for that programming language. 
  ///
  /// * [String] urlPrefix (required):
  ///   The url prefix for the playground. 
  Future<JsonSuccessBase> addCodePlayground(String name, String pygmentsLanguage, String urlPrefix) async {
    final response = await addCodePlaygroundWithHttpInfo(name, pygmentsLanguage, urlPrefix);
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

  /// Add a linkifier
  ///
  /// Configure [linkifiers](/help/add-a-custom-linkifier), regular expression patterns that are automatically linkified when they appear in messages and topics.  `POST {{ api_url }}/v1/realm/filters` 
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [String] pattern (required):
  ///   The [Python regular expression](https://docs.python.org/3/howto/regex.html) that should trigger the linkifier. 
  ///
  /// * [String] urlFormatString (required):
  ///   The URL used for the link. If you used named groups for the `pattern`, you can insert their content here with `%(name_of_the_capturing_group)s`. 
  Future<Response> addLinkifierWithHttpInfo(String pattern, String urlFormatString) async {
    // Verify required params are set.
    if (pattern == null) {
     throw ApiException(HttpStatus.badRequest, 'Missing required param: pattern');
    }
    if (urlFormatString == null) {
     throw ApiException(HttpStatus.badRequest, 'Missing required param: urlFormatString');
    }

    final path = r'/realm/filters';

    Object postBody;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

      queryParams.addAll(_convertParametersForCollectionFormat('', 'pattern', pattern));
      queryParams.addAll(_convertParametersForCollectionFormat('', 'url_format_string', urlFormatString));

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

  /// Add a linkifier
  ///
  /// Configure [linkifiers](/help/add-a-custom-linkifier), regular expression patterns that are automatically linkified when they appear in messages and topics.  `POST {{ api_url }}/v1/realm/filters` 
  ///
  /// Parameters:
  ///
  /// * [String] pattern (required):
  ///   The [Python regular expression](https://docs.python.org/3/howto/regex.html) that should trigger the linkifier. 
  ///
  /// * [String] urlFormatString (required):
  ///   The URL used for the link. If you used named groups for the `pattern`, you can insert their content here with `%(name_of_the_capturing_group)s`. 
  Future<JsonSuccessBase> addLinkifier(String pattern, String urlFormatString) async {
    final response = await addLinkifierWithHttpInfo(pattern, urlFormatString);
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

  /// Create a custom profile field
  ///
  /// [Create a custom profile field](/help/add-custom-profile-fields) in the user's organization.  `POST {{ api_url }}/v1/realm/profile_fields` 
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [int] fieldType (required):
  ///   The field type can be any of the supported custom profile field types. See the [custom profile fields documentation](/help/add-custom-profile-fields) more details on what each type means.  * **1**: Short text * **2**: Long text * **3**: List of options * **4**: Date picker * **5**: Link * **6**: Person picker * **7**: External account 
  ///
  /// * [String] name:
  ///   The name of the custom profile field, which will appear both in user-facing settings UI for configuring custom profile fields and in UI displaying a user's profile. 
  ///
  /// * [String] hint:
  ///   The help text to be displayed for the custom profile field in user-facing settings UI for configuring custom profile fields. 
  ///
  /// * [Object] fieldData:
  ///   Field types 3 (List of options) and 7 (External account) support storing additional configuration for the field type in the `field_data` attribute.  For field type 3 (List of options), this attribute is a JSON dictionary defining the choices and the order they will be displayed in the dropdown UI for individual users to select an option.  The interface for field type 7 is not yet stabilized. 
  Future<Response> createCustomProfileFieldWithHttpInfo(int fieldType, { String name, String hint, Object fieldData }) async {
    // Verify required params are set.
    if (fieldType == null) {
     throw ApiException(HttpStatus.badRequest, 'Missing required param: fieldType');
    }

    final path = r'/realm/profile_fields';

    Object postBody;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

    if (name != null) {
      queryParams.addAll(_convertParametersForCollectionFormat('', 'name', name));
    }
    if (hint != null) {
      queryParams.addAll(_convertParametersForCollectionFormat('', 'hint', hint));
    }
      queryParams.addAll(_convertParametersForCollectionFormat('', 'field_type', fieldType));
    if (fieldData != null) {
      queryParams.addAll(_convertParametersForCollectionFormat('', 'field_data', fieldData));
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

  /// Create a custom profile field
  ///
  /// [Create a custom profile field](/help/add-custom-profile-fields) in the user's organization.  `POST {{ api_url }}/v1/realm/profile_fields` 
  ///
  /// Parameters:
  ///
  /// * [int] fieldType (required):
  ///   The field type can be any of the supported custom profile field types. See the [custom profile fields documentation](/help/add-custom-profile-fields) more details on what each type means.  * **1**: Short text * **2**: Long text * **3**: List of options * **4**: Date picker * **5**: Link * **6**: Person picker * **7**: External account 
  ///
  /// * [String] name:
  ///   The name of the custom profile field, which will appear both in user-facing settings UI for configuring custom profile fields and in UI displaying a user's profile. 
  ///
  /// * [String] hint:
  ///   The help text to be displayed for the custom profile field in user-facing settings UI for configuring custom profile fields. 
  ///
  /// * [Object] fieldData:
  ///   Field types 3 (List of options) and 7 (External account) support storing additional configuration for the field type in the `field_data` attribute.  For field type 3 (List of options), this attribute is a JSON dictionary defining the choices and the order they will be displayed in the dropdown UI for individual users to select an option.  The interface for field type 7 is not yet stabilized. 
  Future<JsonSuccessBase> createCustomProfileField(int fieldType, { String name, String hint, Object fieldData }) async {
    final response = await createCustomProfileFieldWithHttpInfo(fieldType,  name: name, hint: hint, fieldData: fieldData );
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

  /// Get all custom emoji
  ///
  /// Get all the custom emoji in the user's organization.  `GET {{ api_url }}/v1/realm/emoji` 
  ///
  /// Note: This method returns the HTTP [Response].
  Future<Response> getCustomEmojiWithHttpInfo() async {
    final path = r'/realm/emoji';

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

  /// Get all custom emoji
  ///
  /// Get all the custom emoji in the user's organization.  `GET {{ api_url }}/v1/realm/emoji` 
  Future<JsonSuccessBase> getCustomEmoji() async {
    final response = await getCustomEmojiWithHttpInfo();
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

  /// Get all custom profile fields
  ///
  /// Get all the [custom profile fields](/help/add-custom-profile-fields) configured for the user's organization.  `GET {{ api_url }}/v1/realm/profile_fields` 
  ///
  /// Note: This method returns the HTTP [Response].
  Future<Response> getCustomProfileFieldsWithHttpInfo() async {
    final path = r'/realm/profile_fields';

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

  /// Get all custom profile fields
  ///
  /// Get all the [custom profile fields](/help/add-custom-profile-fields) configured for the user's organization.  `GET {{ api_url }}/v1/realm/profile_fields` 
  Future<JsonSuccessBase> getCustomProfileFields() async {
    final response = await getCustomProfileFieldsWithHttpInfo();
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

  /// Get linkifiers
  ///
  /// List all of an organization's configured [linkifiers](/help/add-a-custom-linkifier), regular expression patterns that are automatically linkified when they appear in messages and topics.  `GET {{ api_url }}/v1/realm/linkifiers`  **Changes**: New in Zulip 4.0 (feature level 54). On older versions, a similar `GET /realm/filters` endpoint was available with each entry in a `[pattern, url_format, id]` tuple format. 
  ///
  /// Note: This method returns the HTTP [Response].
  Future<Response> getLinkifiersWithHttpInfo() async {
    final path = r'/realm/linkifiers';

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

  /// Get linkifiers
  ///
  /// List all of an organization's configured [linkifiers](/help/add-a-custom-linkifier), regular expression patterns that are automatically linkified when they appear in messages and topics.  `GET {{ api_url }}/v1/realm/linkifiers`  **Changes**: New in Zulip 4.0 (feature level 54). On older versions, a similar `GET /realm/filters` endpoint was available with each entry in a `[pattern, url_format, id]` tuple format. 
  Future<JsonSuccessBase> getLinkifiers() async {
    final response = await getLinkifiersWithHttpInfo();
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

  /// Get server settings
  ///
  /// Fetch global settings for a Zulip server.  `GET {{ api_url }}/v1/server_settings`  **Note:** this endpoint does not require any authentication at all, and you can use it to check:  * If this is a Zulip server, and if so, what version of Zulip it's running. * What a Zulip client (e.g. a mobile app or [zulip-terminal](https://github.com/zulip/zulip-terminal/)) needs to know in order to display a login prompt for the server (e.g. what authentication methods are available). 
  ///
  /// Note: This method returns the HTTP [Response].
  Future<Response> getServerSettingsWithHttpInfo() async {
    final path = r'/server_settings';

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

  /// Get server settings
  ///
  /// Fetch global settings for a Zulip server.  `GET {{ api_url }}/v1/server_settings`  **Note:** this endpoint does not require any authentication at all, and you can use it to check:  * If this is a Zulip server, and if so, what version of Zulip it's running. * What a Zulip client (e.g. a mobile app or [zulip-terminal](https://github.com/zulip/zulip-terminal/)) needs to know in order to display a login prompt for the server (e.g. what authentication methods are available). 
  Future<JsonSuccessBase> getServerSettings() async {
    final response = await getServerSettingsWithHttpInfo();
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

  /// Remove a code playground
  ///
  /// Remove a [code playground](/help/code-blocks#code-playgrounds) previously configured for an organization.  `DELETE {{ api_url }}/v1/realm/playgrounds/{playground_id}`  **Changes**: New in Zulip 4.0 (feature level 49). 
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [int] playgroundId (required):
  ///   The ID of the playground that you want to remove. 
  Future<Response> removeCodePlaygroundWithHttpInfo(int playgroundId) async {
    // Verify required params are set.
    if (playgroundId == null) {
     throw ApiException(HttpStatus.badRequest, 'Missing required param: playgroundId');
    }

    final path = r'/realm/playgrounds/{playground_id}'
      .replaceAll('{' + 'playground_id' + '}', playgroundId.toString());

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

  /// Remove a code playground
  ///
  /// Remove a [code playground](/help/code-blocks#code-playgrounds) previously configured for an organization.  `DELETE {{ api_url }}/v1/realm/playgrounds/{playground_id}`  **Changes**: New in Zulip 4.0 (feature level 49). 
  ///
  /// Parameters:
  ///
  /// * [int] playgroundId (required):
  ///   The ID of the playground that you want to remove. 
  Future<JsonSuccess> removeCodePlayground(int playgroundId) async {
    final response = await removeCodePlaygroundWithHttpInfo(playgroundId);
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

  /// Remove a linkifier
  ///
  /// Remove [linkifiers](/help/add-a-custom-linkifier), regular expression patterns that are automatically linkified when they appear in messages and topics.  `DELETE {{ api_url }}/v1/realm/filters/{filter_id}` 
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [int] filterId (required):
  ///   The ID of the linkifier that you want to remove. 
  Future<Response> removeLinkifierWithHttpInfo(int filterId) async {
    // Verify required params are set.
    if (filterId == null) {
     throw ApiException(HttpStatus.badRequest, 'Missing required param: filterId');
    }

    final path = r'/realm/filters/{filter_id}'
      .replaceAll('{' + 'filter_id' + '}', filterId.toString());

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

  /// Remove a linkifier
  ///
  /// Remove [linkifiers](/help/add-a-custom-linkifier), regular expression patterns that are automatically linkified when they appear in messages and topics.  `DELETE {{ api_url }}/v1/realm/filters/{filter_id}` 
  ///
  /// Parameters:
  ///
  /// * [int] filterId (required):
  ///   The ID of the linkifier that you want to remove. 
  Future<JsonSuccess> removeLinkifier(int filterId) async {
    final response = await removeLinkifierWithHttpInfo(filterId);
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

  /// Reorder custom profile fields
  ///
  /// Reorder the custom profile fields in the user's organization.  `PATCH {{ api_url }}/v1/realm/profile_fields`  Custom profile fields are displayed in Zulip UI widgets in order; this endpoint allows administrative settings UI to change the field ordering.  This endpoint is used to implement the dragging feature described in the [custom profile fields documentation](/help/add-custom-profile-fields). 
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [List<int>] order (required):
  ///   A list of the IDs of all the custom profile fields defined in this organization, in the desired new order. 
  Future<Response> reorderCustomProfileFieldsWithHttpInfo(List<int> order) async {
    // Verify required params are set.
    if (order == null) {
     throw ApiException(HttpStatus.badRequest, 'Missing required param: order');
    }

    final path = r'/realm/profile_fields';

    Object postBody;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

      queryParams.addAll(_convertParametersForCollectionFormat('multi', 'order', order));

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

  /// Reorder custom profile fields
  ///
  /// Reorder the custom profile fields in the user's organization.  `PATCH {{ api_url }}/v1/realm/profile_fields`  Custom profile fields are displayed in Zulip UI widgets in order; this endpoint allows administrative settings UI to change the field ordering.  This endpoint is used to implement the dragging feature described in the [custom profile fields documentation](/help/add-custom-profile-fields). 
  ///
  /// Parameters:
  ///
  /// * [List<int>] order (required):
  ///   A list of the IDs of all the custom profile fields defined in this organization, in the desired new order. 
  Future<JsonSuccess> reorderCustomProfileFields(List<int> order) async {
    final response = await reorderCustomProfileFieldsWithHttpInfo(order);
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

  /// Update a linkifier
  ///
  /// Update a [linkifier](/help/add-a-custom-linkifier), regular expression patterns that are automatically linkified when they appear in messages and topics.  `PATCH {{ api_url }}/v1/realm/filters/{filter_id}`  **Changes**: New in Zulip 4.0 (feature level 57). 
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [int] filterId (required):
  ///   The ID of the linkifier that you want to update. 
  ///
  /// * [String] pattern (required):
  ///   The [Python regular expression](https://docs.python.org/3/howto/regex.html) that should trigger the linkifier. 
  ///
  /// * [String] urlFormatString (required):
  ///   The URL used for the link. If you used named groups for the `pattern`, you can insert their content here with `%(name_of_the_capturing_group)s`. 
  Future<Response> updateLinkifierWithHttpInfo(int filterId, String pattern, String urlFormatString) async {
    // Verify required params are set.
    if (filterId == null) {
     throw ApiException(HttpStatus.badRequest, 'Missing required param: filterId');
    }
    if (pattern == null) {
     throw ApiException(HttpStatus.badRequest, 'Missing required param: pattern');
    }
    if (urlFormatString == null) {
     throw ApiException(HttpStatus.badRequest, 'Missing required param: urlFormatString');
    }

    final path = r'/realm/filters/{filter_id}'
      .replaceAll('{' + 'filter_id' + '}', filterId.toString());

    Object postBody;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

      queryParams.addAll(_convertParametersForCollectionFormat('', 'pattern', pattern));
      queryParams.addAll(_convertParametersForCollectionFormat('', 'url_format_string', urlFormatString));

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

  /// Update a linkifier
  ///
  /// Update a [linkifier](/help/add-a-custom-linkifier), regular expression patterns that are automatically linkified when they appear in messages and topics.  `PATCH {{ api_url }}/v1/realm/filters/{filter_id}`  **Changes**: New in Zulip 4.0 (feature level 57). 
  ///
  /// Parameters:
  ///
  /// * [int] filterId (required):
  ///   The ID of the linkifier that you want to update. 
  ///
  /// * [String] pattern (required):
  ///   The [Python regular expression](https://docs.python.org/3/howto/regex.html) that should trigger the linkifier. 
  ///
  /// * [String] urlFormatString (required):
  ///   The URL used for the link. If you used named groups for the `pattern`, you can insert their content here with `%(name_of_the_capturing_group)s`. 
  Future<JsonSuccess> updateLinkifier(int filterId, String pattern, String urlFormatString) async {
    final response = await updateLinkifierWithHttpInfo(filterId, pattern, urlFormatString);
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

  /// Upload custom emoji
  ///
  /// This endpoint is used to upload a custom emoji for use in the user's organization.  Access to this endpoint depends on the [organization's configuration](https://zulip.com/help/only-allow-admins-to-add-emoji).  `POST {{ api_url }}/v1/realm/emoji/{emoji_name}` 
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [String] emojiName (required):
  ///   The name that should be associated with the uploaded emoji image/gif. The emoji name can only contain letters, numbers, dashes, and spaces. Upper and lower case letters are treated the same, and underscores (_) are treated the same as spaces (consistent with how the Zulip UI handles emoji). 
  ///
  /// * [MultipartFile] filename:
  Future<Response> uploadCustomEmojiWithHttpInfo(String emojiName, { MultipartFile filename }) async {
    // Verify required params are set.
    if (emojiName == null) {
     throw ApiException(HttpStatus.badRequest, 'Missing required param: emojiName');
    }

    final path = r'/realm/emoji/{emoji_name}'
      .replaceAll('{' + 'emoji_name' + '}', emojiName.toString());

    Object postBody;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

    final contentTypes = <String>['multipart/form-data'];
    final nullableContentType = contentTypes.isNotEmpty ? contentTypes[0] : null;
    final authNames = <String>[];

    bool hasFields = false;
    final mp = MultipartRequest('POST', Uri.parse(path));
    if (filename != null) {
      hasFields = true;
      mp.fields[r'filename'] = filename.field;
      mp.files.add(filename);
    }
    if (hasFields) {
      postBody = mp;
    }

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

  /// Upload custom emoji
  ///
  /// This endpoint is used to upload a custom emoji for use in the user's organization.  Access to this endpoint depends on the [organization's configuration](https://zulip.com/help/only-allow-admins-to-add-emoji).  `POST {{ api_url }}/v1/realm/emoji/{emoji_name}` 
  ///
  /// Parameters:
  ///
  /// * [String] emojiName (required):
  ///   The name that should be associated with the uploaded emoji image/gif. The emoji name can only contain letters, numbers, dashes, and spaces. Upper and lower case letters are treated the same, and underscores (_) are treated the same as spaces (consistent with how the Zulip UI handles emoji). 
  ///
  /// * [MultipartFile] filename:
  Future<JsonSuccess> uploadCustomEmoji(String emojiName, { MultipartFile filename }) async {
    final response = await uploadCustomEmojiWithHttpInfo(emojiName,  filename: filename );
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
