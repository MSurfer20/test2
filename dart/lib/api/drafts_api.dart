//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.0

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;


class DraftsApi {
  DraftsApi([ApiClient apiClient]) : apiClient = apiClient ?? defaultApiClient;

  final ApiClient apiClient;

  /// Create drafts
  ///
  /// Create one or more drafts on the server. These drafts will be automatically synchronized to other clients via `drafts` events.  `POST {{ api_url }}/v1/drafts` 
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [List<Draft>] drafts:
  ///   A JSON-encoded list of containing new draft objects. 
  Future<Response> createDraftsWithHttpInfo({ List<Draft> drafts }) async {
    // Verify required params are set.

    final path = r'/drafts';

    Object postBody;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

    if (drafts != null) {
      queryParams.addAll(_convertParametersForCollectionFormat('multi', 'drafts', drafts));
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

  /// Create drafts
  ///
  /// Create one or more drafts on the server. These drafts will be automatically synchronized to other clients via `drafts` events.  `POST {{ api_url }}/v1/drafts` 
  ///
  /// Parameters:
  ///
  /// * [List<Draft>] drafts:
  ///   A JSON-encoded list of containing new draft objects. 
  Future<JsonSuccess> createDrafts({ List<Draft> drafts }) async {
    final response = await createDraftsWithHttpInfo( drafts: drafts );
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

  /// Delete a draft
  ///
  /// Delete a single draft from the server. The deletion will be automatically synchronized to other clients via a `drafts` event.  `DELETE {{ api_url }}/v1/drafts/{draft_id}` 
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [int] draftId (required):
  ///   The ID of the draft you want to delete. 
  Future<Response> deleteDraftWithHttpInfo(int draftId) async {
    // Verify required params are set.
    if (draftId == null) {
     throw ApiException(HttpStatus.badRequest, 'Missing required param: draftId');
    }

    final path = r'/drafts/{draft_id}'
      .replaceAll('{' + 'draft_id' + '}', draftId.toString());

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

  /// Delete a draft
  ///
  /// Delete a single draft from the server. The deletion will be automatically synchronized to other clients via a `drafts` event.  `DELETE {{ api_url }}/v1/drafts/{draft_id}` 
  ///
  /// Parameters:
  ///
  /// * [int] draftId (required):
  ///   The ID of the draft you want to delete. 
  Future<JsonSuccess> deleteDraft(int draftId) async {
    final response = await deleteDraftWithHttpInfo(draftId);
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

  /// Edit a draft
  ///
  /// Edit a draft on the server. The edit will be automatically synchronized to other clients via `drafts` events.  `PATCH {{ api_url }}/v1/drafts/{draft_id}` 
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [int] draftId (required):
  ///   The ID of the draft to be edited. 
  ///
  /// * [Draft] draft (required):
  ///   A JSON-encoded object containing a replacement draft object for this ID. 
  Future<Response> editDraftWithHttpInfo(int draftId, Draft draft) async {
    // Verify required params are set.
    if (draftId == null) {
     throw ApiException(HttpStatus.badRequest, 'Missing required param: draftId');
    }
    if (draft == null) {
     throw ApiException(HttpStatus.badRequest, 'Missing required param: draft');
    }

    final path = r'/drafts/{draft_id}'
      .replaceAll('{' + 'draft_id' + '}', draftId.toString());

    Object postBody;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

      queryParams.addAll(_convertParametersForCollectionFormat('', 'draft', draft));

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

  /// Edit a draft
  ///
  /// Edit a draft on the server. The edit will be automatically synchronized to other clients via `drafts` events.  `PATCH {{ api_url }}/v1/drafts/{draft_id}` 
  ///
  /// Parameters:
  ///
  /// * [int] draftId (required):
  ///   The ID of the draft to be edited. 
  ///
  /// * [Draft] draft (required):
  ///   A JSON-encoded object containing a replacement draft object for this ID. 
  Future<JsonSuccess> editDraft(int draftId, Draft draft) async {
    final response = await editDraftWithHttpInfo(draftId, draft);
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

  /// Get drafts
  ///
  /// Fetch all drafts for the current user.  `GET {{ api_url }}/v1/drafts` 
  ///
  /// Note: This method returns the HTTP [Response].
  Future<Response> getDraftsWithHttpInfo() async {
    final path = r'/drafts';

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

  /// Get drafts
  ///
  /// Fetch all drafts for the current user.  `GET {{ api_url }}/v1/drafts` 
  Future<JsonSuccess> getDrafts() async {
    final response = await getDraftsWithHttpInfo();
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
