//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.0

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;


class MessagesApi {
  MessagesApi([ApiClient apiClient]) : apiClient = apiClient ?? defaultApiClient;

  final ApiClient apiClient;

  /// Add an emoji reaction
  ///
  /// Add an [emoji reaction](/help/emoji-reactions) to a message.  `POST {{ api_url }}/v1/messages/{message_id}/reactions` 
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [int] messageId (required):
  ///   The target message's ID. 
  ///
  /// * [String] emojiName (required):
  ///   The target emoji's human-readable name.  To find an emoji's name, hover over a message to reveal three icons on the right, then click the smiley face icon. Images of available reaction emojis appear. Hover over the emoji you want, and note that emoji's text name. 
  ///
  /// * [String] emojiCode:
  ///   A unique identifier, defining the specific emoji codepoint requested, within the namespace of the `reaction_type`.  For most API clients, you won't need this, but it's important for Zulip apps to handle rare corner cases when adding/removing votes on an emoji reaction added previously by another user.  If the existing reaction was added when the Zulip server was using a previous version of the emoji data mapping between Unicode codepoints and human-readable names, sending the `emoji_code` in the data for the original reaction allows the Zulip server to correctly interpret your upvote as an upvote rather than a reaction with a \"diffenent\" emoji. 
  ///
  /// * [String] reactionType:
  ///   If an app is adding/removing a vote on an existing reaction, it should pass this parameter using the value the server provided for the existing reaction for specificity.  Supported values:  * `unicode_emoji`: Unicode emoji (`emoji_code` will be its Unicode codepoint). * `realm_emoji`: Custom emoji. (`emoji_code` will be its ID). * `zulip_extra_emoji`: Special emoji included with Zulip.  Exists to    namespace the `zulip` emoji.  **Changes**: In Zulip 3.0 (feature level 2), this become optional for [custom emoji](/help/add-custom-emoji); previously, this endpoint assumed `unicode_emoji` if this parameter was not specified. 
  Future<Response> addReactionWithHttpInfo(int messageId, String emojiName, { String emojiCode, String reactionType }) async {
    // Verify required params are set.
    if (messageId == null) {
     throw ApiException(HttpStatus.badRequest, 'Missing required param: messageId');
    }
    if (emojiName == null) {
     throw ApiException(HttpStatus.badRequest, 'Missing required param: emojiName');
    }

    final path = r'/messages/{message_id}/reactions'
      .replaceAll('{' + 'message_id' + '}', messageId.toString());

    Object postBody;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

      queryParams.addAll(_convertParametersForCollectionFormat('', 'emoji_name', emojiName));
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

  /// Add an emoji reaction
  ///
  /// Add an [emoji reaction](/help/emoji-reactions) to a message.  `POST {{ api_url }}/v1/messages/{message_id}/reactions` 
  ///
  /// Parameters:
  ///
  /// * [int] messageId (required):
  ///   The target message's ID. 
  ///
  /// * [String] emojiName (required):
  ///   The target emoji's human-readable name.  To find an emoji's name, hover over a message to reveal three icons on the right, then click the smiley face icon. Images of available reaction emojis appear. Hover over the emoji you want, and note that emoji's text name. 
  ///
  /// * [String] emojiCode:
  ///   A unique identifier, defining the specific emoji codepoint requested, within the namespace of the `reaction_type`.  For most API clients, you won't need this, but it's important for Zulip apps to handle rare corner cases when adding/removing votes on an emoji reaction added previously by another user.  If the existing reaction was added when the Zulip server was using a previous version of the emoji data mapping between Unicode codepoints and human-readable names, sending the `emoji_code` in the data for the original reaction allows the Zulip server to correctly interpret your upvote as an upvote rather than a reaction with a \"diffenent\" emoji. 
  ///
  /// * [String] reactionType:
  ///   If an app is adding/removing a vote on an existing reaction, it should pass this parameter using the value the server provided for the existing reaction for specificity.  Supported values:  * `unicode_emoji`: Unicode emoji (`emoji_code` will be its Unicode codepoint). * `realm_emoji`: Custom emoji. (`emoji_code` will be its ID). * `zulip_extra_emoji`: Special emoji included with Zulip.  Exists to    namespace the `zulip` emoji.  **Changes**: In Zulip 3.0 (feature level 2), this become optional for [custom emoji](/help/add-custom-emoji); previously, this endpoint assumed `unicode_emoji` if this parameter was not specified. 
  Future<JsonSuccess> addReaction(int messageId, String emojiName, { String emojiCode, String reactionType }) async {
    final response = await addReactionWithHttpInfo(messageId, emojiName,  emojiCode: emojiCode, reactionType: reactionType );
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

  /// Check if messages match a narrow
  ///
  /// Check whether a set of messages match a [narrow](/api/construct-narrow).  `GET {{ api_url }}/v1/messages/matches_narrow`  For many common narrows (E.g. a topic), clients can write an efficient client-side check to determine whether a newly arrived message belongs in the view.  This endpoint is designed to allow clients to handle more complex narrows for which the client does not (or in the case of full-text search, cannot) implement this check.  The format of the `match_subject` and `match_content` objects is designed to match those of `GET /messages`, so that a client can splice these fields into a `message` object received from `GET /events` and end up with an extended message object identical to how a `GET /messages` for the current narrow would have returned the message. 
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [List<int>] msgIds (required):
  ///   List of IDs for the messages to check.
  ///
  /// * [List<Object>] narrow (required):
  ///   A structure defining the narrow to check against. See how to [construct a narrow](/api/construct-narrow).
  Future<Response> checkMessagesMatchNarrowWithHttpInfo(List<int> msgIds, List<Object> narrow) async {
    // Verify required params are set.
    if (msgIds == null) {
     throw ApiException(HttpStatus.badRequest, 'Missing required param: msgIds');
    }
    if (narrow == null) {
     throw ApiException(HttpStatus.badRequest, 'Missing required param: narrow');
    }

    final path = r'/messages/matches_narrow';

    Object postBody;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

      queryParams.addAll(_convertParametersForCollectionFormat('multi', 'msg_ids', msgIds));
      queryParams.addAll(_convertParametersForCollectionFormat('multi', 'narrow', narrow));

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

  /// Check if messages match a narrow
  ///
  /// Check whether a set of messages match a [narrow](/api/construct-narrow).  `GET {{ api_url }}/v1/messages/matches_narrow`  For many common narrows (E.g. a topic), clients can write an efficient client-side check to determine whether a newly arrived message belongs in the view.  This endpoint is designed to allow clients to handle more complex narrows for which the client does not (or in the case of full-text search, cannot) implement this check.  The format of the `match_subject` and `match_content` objects is designed to match those of `GET /messages`, so that a client can splice these fields into a `message` object received from `GET /events` and end up with an extended message object identical to how a `GET /messages` for the current narrow would have returned the message. 
  ///
  /// Parameters:
  ///
  /// * [List<int>] msgIds (required):
  ///   List of IDs for the messages to check.
  ///
  /// * [List<Object>] narrow (required):
  ///   A structure defining the narrow to check against. See how to [construct a narrow](/api/construct-narrow).
  Future<Object> checkMessagesMatchNarrow(List<int> msgIds, List<Object> narrow) async {
    final response = await checkMessagesMatchNarrowWithHttpInfo(msgIds, narrow);
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

  /// Delete a message
  ///
  /// Permanently delete a message.  `DELETE {{ api_url }}/v1/messages/{msg_id}`  This API corresponds to the [delete a message completely][delete-completely] feature documented in the Zulip Help Center.  [delete-completely]: /help/edit-or-delete-a-message#delete-a-message-completely 
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [int] messageId (required):
  ///   The target message's ID. 
  Future<Response> deleteMessageWithHttpInfo(int messageId) async {
    // Verify required params are set.
    if (messageId == null) {
     throw ApiException(HttpStatus.badRequest, 'Missing required param: messageId');
    }

    final path = r'/messages/{message_id}'
      .replaceAll('{' + 'message_id' + '}', messageId.toString());

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

  /// Delete a message
  ///
  /// Permanently delete a message.  `DELETE {{ api_url }}/v1/messages/{msg_id}`  This API corresponds to the [delete a message completely][delete-completely] feature documented in the Zulip Help Center.  [delete-completely]: /help/edit-or-delete-a-message#delete-a-message-completely 
  ///
  /// Parameters:
  ///
  /// * [int] messageId (required):
  ///   The target message's ID. 
  Future<JsonSuccess> deleteMessage(int messageId) async {
    final response = await deleteMessageWithHttpInfo(messageId);
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

  /// Get public temporary URL
  ///
  /// Get a temporary URL for access to the file that doesn't require authentication. 
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [int] realmIdStr (required):
  ///   The realm id. 
  ///
  /// * [String] filename (required):
  ///   Path to the URL. 
  Future<Response> getFileTemporaryUrlWithHttpInfo(int realmIdStr, String filename) async {
    // Verify required params are set.
    if (realmIdStr == null) {
     throw ApiException(HttpStatus.badRequest, 'Missing required param: realmIdStr');
    }
    if (filename == null) {
     throw ApiException(HttpStatus.badRequest, 'Missing required param: filename');
    }

    final path = r'/user_uploads/{realm_id_str}/{filename}'
      .replaceAll('{' + 'realm_id_str' + '}', realmIdStr.toString())
      .replaceAll('{' + 'filename' + '}', filename.toString());

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

  /// Get public temporary URL
  ///
  /// Get a temporary URL for access to the file that doesn't require authentication. 
  ///
  /// Parameters:
  ///
  /// * [int] realmIdStr (required):
  ///   The realm id. 
  ///
  /// * [String] filename (required):
  ///   Path to the URL. 
  Future<JsonSuccessBase> getFileTemporaryUrl(int realmIdStr, String filename) async {
    final response = await getFileTemporaryUrlWithHttpInfo(realmIdStr, filename);
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

  /// Get a message's edit history
  ///
  /// Fetch the message edit history of a previously edited message.  `GET {{ api_url }}/v1/messages/{message_id}/history`  Note that edit history may be disabled in some organizations; see the [Zulip Help Center documentation on editing messages][edit-settings].  [edit-settings]: /help/view-a-messages-edit-history 
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [int] messageId (required):
  ///   The target message's ID. 
  Future<Response> getMessageHistoryWithHttpInfo(int messageId) async {
    // Verify required params are set.
    if (messageId == null) {
     throw ApiException(HttpStatus.badRequest, 'Missing required param: messageId');
    }

    final path = r'/messages/{message_id}/history'
      .replaceAll('{' + 'message_id' + '}', messageId.toString());

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

  /// Get a message's edit history
  ///
  /// Fetch the message edit history of a previously edited message.  `GET {{ api_url }}/v1/messages/{message_id}/history`  Note that edit history may be disabled in some organizations; see the [Zulip Help Center documentation on editing messages][edit-settings].  [edit-settings]: /help/view-a-messages-edit-history 
  ///
  /// Parameters:
  ///
  /// * [int] messageId (required):
  ///   The target message's ID. 
  Future<JsonSuccessBase> getMessageHistory(int messageId) async {
    final response = await getMessageHistoryWithHttpInfo(messageId);
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

  /// Get messages
  ///
  /// Fetch message history from a Zulip server.  `GET {{ api_url }}/v1/messages`  This `GET /api/v1/messages` endpoint is the primary way to fetch message history from a Zulip server.  It is useful both for Zulip clients (e.g. the web, desktop, mobile, and terminal clients) as well as bots, API clients, backup scripts, etc.  By specifying a [narrow filter](/api/construct-narrow), you can use this endpoint to fetch the messages matching any search query that is supported by Zulip's powerful full-text search backend.  When a narrow is not specified, it can be used to fetch a user's message history. (We recommend paginating to 1000 messages at a time.)  In either case, you specify an `anchor` message (or ask the server to calculate the first unread message for you and use that as the anchor), as well as a number of messages before and after the anchor message.  The server returns those messages, sorted by message ID, as well as some metadata that makes it easy for a client to determine whether there are more messages matching the query that were not returned due to the `num_before` and `num_after` limits.  We recommend using `num_before <= 1000` and `num_after <= 1000` to avoid generating very large HTTP responses. A maximum of 5000 messages can be obtained per request; attempting to exceed this will result in an error. 
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [int] numBefore (required):
  ///   The number of messages with IDs less than the anchor to retrieve. 
  ///
  /// * [int] numAfter (required):
  ///   The number of messages with IDs greater than the anchor to retrieve. 
  ///
  /// * [OneOfstringinteger] anchor:
  ///   Integer message ID to anchor fetching of new messages. Supports special string values for when the client wants the server to compute the anchor to use:  * `newest`: The most recent message. * `oldest`: The oldest message. * `first_unread`: The oldest unread message matching the   query, if any; otherwise, the most recent message.  The special values of `'newest'` and `'oldest'` are also supported for anchoring the query at the most recent or oldest messages.  **Changes**: String values are new in Zulip 3.0 (feature level 1).  The   `first_unread` functionality was supported in Zulip 2.1.x   and older by not sending anchor and using use_first_unread_anchor.    In Zulip 2.1.x and older, `oldest` can be emulated with   `anchor=0`, and `newest` with `anchor=10000000000000000`   (that specific large value works around a bug in Zulip   2.1.x and older in the `found_newest` return value). 
  ///
  /// * [List<Object>] narrow:
  ///   The narrow where you want to fetch the messages from. See how to [construct a narrow](/api/construct-narrow). 
  ///
  /// * [bool] clientGravatar:
  ///   Whether the client supports computing gravatars URLs.  If enabled, `avatar_url` will be included in the response only if there is a Zulip avatar, and will be `null` for users who are using gravatar as their avatar.  This option significantly reduces the compressed size of user data, since gravatar URLs are long, random strings and thus do not compress well. The `client_gravatar` field is set to `true` if clients can compute their own gravatars. 
  ///
  /// * [bool] applyMarkdown:
  ///   If `true`, message content is returned in the rendered HTML format. If `false`, message content is returned in the raw Markdown-format text that user entered. 
  ///
  /// * [bool] useFirstUnreadAnchor:
  ///   Legacy way to specify `anchor=\"first_unread\"` in Zulip 2.1.x and older.  Whether to use the (computed by the server) first unread message matching the narrow as the `anchor`.  Mutually exclusive with `anchor`.  **Changes**: Deprecated in Zulip 3.0, replaced by `anchor=\"first_unread\"` instead. 
  Future<Response> getMessagesWithHttpInfo(int numBefore, int numAfter, { OneOfstringinteger anchor, List<Object> narrow, bool clientGravatar, bool applyMarkdown, bool useFirstUnreadAnchor }) async {
    // Verify required params are set.
    if (numBefore == null) {
     throw ApiException(HttpStatus.badRequest, 'Missing required param: numBefore');
    }
    if (numAfter == null) {
     throw ApiException(HttpStatus.badRequest, 'Missing required param: numAfter');
    }

    final path = r'/messages';

    Object postBody;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

    if (anchor != null) {
      queryParams.addAll(_convertParametersForCollectionFormat('', 'anchor', anchor));
    }
      queryParams.addAll(_convertParametersForCollectionFormat('', 'num_before', numBefore));
      queryParams.addAll(_convertParametersForCollectionFormat('', 'num_after', numAfter));
    if (narrow != null) {
      queryParams.addAll(_convertParametersForCollectionFormat('multi', 'narrow', narrow));
    }
    if (clientGravatar != null) {
      queryParams.addAll(_convertParametersForCollectionFormat('', 'client_gravatar', clientGravatar));
    }
    if (applyMarkdown != null) {
      queryParams.addAll(_convertParametersForCollectionFormat('', 'apply_markdown', applyMarkdown));
    }
    if (useFirstUnreadAnchor != null) {
      queryParams.addAll(_convertParametersForCollectionFormat('', 'use_first_unread_anchor', useFirstUnreadAnchor));
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

  /// Get messages
  ///
  /// Fetch message history from a Zulip server.  `GET {{ api_url }}/v1/messages`  This `GET /api/v1/messages` endpoint is the primary way to fetch message history from a Zulip server.  It is useful both for Zulip clients (e.g. the web, desktop, mobile, and terminal clients) as well as bots, API clients, backup scripts, etc.  By specifying a [narrow filter](/api/construct-narrow), you can use this endpoint to fetch the messages matching any search query that is supported by Zulip's powerful full-text search backend.  When a narrow is not specified, it can be used to fetch a user's message history. (We recommend paginating to 1000 messages at a time.)  In either case, you specify an `anchor` message (or ask the server to calculate the first unread message for you and use that as the anchor), as well as a number of messages before and after the anchor message.  The server returns those messages, sorted by message ID, as well as some metadata that makes it easy for a client to determine whether there are more messages matching the query that were not returned due to the `num_before` and `num_after` limits.  We recommend using `num_before <= 1000` and `num_after <= 1000` to avoid generating very large HTTP responses. A maximum of 5000 messages can be obtained per request; attempting to exceed this will result in an error. 
  ///
  /// Parameters:
  ///
  /// * [int] numBefore (required):
  ///   The number of messages with IDs less than the anchor to retrieve. 
  ///
  /// * [int] numAfter (required):
  ///   The number of messages with IDs greater than the anchor to retrieve. 
  ///
  /// * [OneOfstringinteger] anchor:
  ///   Integer message ID to anchor fetching of new messages. Supports special string values for when the client wants the server to compute the anchor to use:  * `newest`: The most recent message. * `oldest`: The oldest message. * `first_unread`: The oldest unread message matching the   query, if any; otherwise, the most recent message.  The special values of `'newest'` and `'oldest'` are also supported for anchoring the query at the most recent or oldest messages.  **Changes**: String values are new in Zulip 3.0 (feature level 1).  The   `first_unread` functionality was supported in Zulip 2.1.x   and older by not sending anchor and using use_first_unread_anchor.    In Zulip 2.1.x and older, `oldest` can be emulated with   `anchor=0`, and `newest` with `anchor=10000000000000000`   (that specific large value works around a bug in Zulip   2.1.x and older in the `found_newest` return value). 
  ///
  /// * [List<Object>] narrow:
  ///   The narrow where you want to fetch the messages from. See how to [construct a narrow](/api/construct-narrow). 
  ///
  /// * [bool] clientGravatar:
  ///   Whether the client supports computing gravatars URLs.  If enabled, `avatar_url` will be included in the response only if there is a Zulip avatar, and will be `null` for users who are using gravatar as their avatar.  This option significantly reduces the compressed size of user data, since gravatar URLs are long, random strings and thus do not compress well. The `client_gravatar` field is set to `true` if clients can compute their own gravatars. 
  ///
  /// * [bool] applyMarkdown:
  ///   If `true`, message content is returned in the rendered HTML format. If `false`, message content is returned in the raw Markdown-format text that user entered. 
  ///
  /// * [bool] useFirstUnreadAnchor:
  ///   Legacy way to specify `anchor=\"first_unread\"` in Zulip 2.1.x and older.  Whether to use the (computed by the server) first unread message matching the narrow as the `anchor`.  Mutually exclusive with `anchor`.  **Changes**: Deprecated in Zulip 3.0, replaced by `anchor=\"first_unread\"` instead. 
  Future<JsonSuccessBase> getMessages(int numBefore, int numAfter, { OneOfstringinteger anchor, List<Object> narrow, bool clientGravatar, bool applyMarkdown, bool useFirstUnreadAnchor }) async {
    final response = await getMessagesWithHttpInfo(numBefore, numAfter,  anchor: anchor, narrow: narrow, clientGravatar: clientGravatar, applyMarkdown: applyMarkdown, useFirstUnreadAnchor: useFirstUnreadAnchor );
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

  /// Get a message's raw Markdown
  ///
  /// Get the raw content of a message.  `GET {{ api_url }}/v1/messages/{msg_id}`  This is a rarely-used endpoint relevant for clients that primarily work with HTML-rendered messages but might need to occasionally fetch the message's raw Markdown (e.g. for pre-filling a message-editing UI). 
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [int] messageId (required):
  ///   The target message's ID. 
  Future<Response> getRawMessageWithHttpInfo(int messageId) async {
    // Verify required params are set.
    if (messageId == null) {
     throw ApiException(HttpStatus.badRequest, 'Missing required param: messageId');
    }

    final path = r'/messages/{message_id}'
      .replaceAll('{' + 'message_id' + '}', messageId.toString());

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

  /// Get a message's raw Markdown
  ///
  /// Get the raw content of a message.  `GET {{ api_url }}/v1/messages/{msg_id}`  This is a rarely-used endpoint relevant for clients that primarily work with HTML-rendered messages but might need to occasionally fetch the message's raw Markdown (e.g. for pre-filling a message-editing UI). 
  ///
  /// Parameters:
  ///
  /// * [int] messageId (required):
  ///   The target message's ID. 
  Future<JsonSuccessBase> getRawMessage(int messageId) async {
    final response = await getRawMessageWithHttpInfo(messageId);
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

  /// Mark all messages as read
  ///
  /// Marks all of the current user's unread messages as read.  `POST {{ api_url }}/v1/mark_all_as_read` 
  ///
  /// Note: This method returns the HTTP [Response].
  Future<Response> markAllAsReadWithHttpInfo() async {
    final path = r'/mark_all_as_read';

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

  /// Mark all messages as read
  ///
  /// Marks all of the current user's unread messages as read.  `POST {{ api_url }}/v1/mark_all_as_read` 
  Future<JsonSuccess> markAllAsRead() async {
    final response = await markAllAsReadWithHttpInfo();
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

  /// Mark messages in a stream as read
  ///
  /// Mark all the unread messages in a stream as read. 
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [int] streamId (required):
  ///   The ID of the stream to access. 
  Future<Response> markStreamAsReadWithHttpInfo(int streamId) async {
    // Verify required params are set.
    if (streamId == null) {
     throw ApiException(HttpStatus.badRequest, 'Missing required param: streamId');
    }

    final path = r'/mark_stream_as_read';

    Object postBody;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

      queryParams.addAll(_convertParametersForCollectionFormat('', 'stream_id', streamId));

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

  /// Mark messages in a stream as read
  ///
  /// Mark all the unread messages in a stream as read. 
  ///
  /// Parameters:
  ///
  /// * [int] streamId (required):
  ///   The ID of the stream to access. 
  Future<JsonSuccess> markStreamAsRead(int streamId) async {
    final response = await markStreamAsReadWithHttpInfo(streamId);
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

  /// Mark messages in a topic as read
  ///
  /// Mark all the unread messages in a topic as read. 
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [int] streamId (required):
  ///   The ID of the stream to access. 
  ///
  /// * [String] topicName (required):
  ///   The name of the topic whose messages should be marked as read. 
  Future<Response> markTopicAsReadWithHttpInfo(int streamId, String topicName) async {
    // Verify required params are set.
    if (streamId == null) {
     throw ApiException(HttpStatus.badRequest, 'Missing required param: streamId');
    }
    if (topicName == null) {
     throw ApiException(HttpStatus.badRequest, 'Missing required param: topicName');
    }

    final path = r'/mark_topic_as_read';

    Object postBody;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

      queryParams.addAll(_convertParametersForCollectionFormat('', 'stream_id', streamId));
      queryParams.addAll(_convertParametersForCollectionFormat('', 'topic_name', topicName));

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

  /// Mark messages in a topic as read
  ///
  /// Mark all the unread messages in a topic as read. 
  ///
  /// Parameters:
  ///
  /// * [int] streamId (required):
  ///   The ID of the stream to access. 
  ///
  /// * [String] topicName (required):
  ///   The name of the topic whose messages should be marked as read. 
  Future<JsonSuccess> markTopicAsRead(int streamId, String topicName) async {
    final response = await markTopicAsReadWithHttpInfo(streamId, topicName);
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

  /// Remove an emoji reaction
  ///
  /// Remove an [emoji reaction](/help/emoji-reactions) from a message.  `DELETE {{ api_url }}/v1/messages/{message_id}/reactions` 
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [int] messageId (required):
  ///   The target message's ID. 
  ///
  /// * [String] emojiName:
  ///   The target emoji's human-readable name.  To find an emoji's name, hover over a message to reveal three icons on the right, then click the smiley face icon. Images of available reaction emojis appear. Hover over the emoji you want, and note that emoji's text name. 
  ///
  /// * [String] emojiCode:
  ///   A unique identifier, defining the specific emoji codepoint requested, within the namespace of the `reaction_type`.  For most API clients, you won't need this, but it's important for Zulip apps to handle rare corner cases when adding/removing votes on an emoji reaction added previously by another user.  If the existing reaction was added when the Zulip server was using a previous version of the emoji data mapping between Unicode codepoints and human-readable names, sending the `emoji_code` in the data for the original reaction allows the Zulip server to correctly interpret your upvote as an upvote rather than a reaction with a \"diffenent\" emoji. 
  ///
  /// * [String] reactionType:
  ///   If an app is adding/removing a vote on an existing reaction, it should pass this parameter using the value the server provided for the existing reaction for specificity.  Supported values:  * `unicode_emoji`: Unicode emoji (`emoji_code` will be its Unicode codepoint). * `realm_emoji`: Custom emoji. (`emoji_code` will be its ID). * `zulip_extra_emoji`: Special emoji included with Zulip.  Exists to    namespace the `zulip` emoji.  **Changes**: In Zulip 3.0 (feature level 2), this become optional for [custom emoji](/help/add-custom-emoji); previously, this endpoint assumed `unicode_emoji` if this parameter was not specified. 
  Future<Response> removeReactionWithHttpInfo(int messageId, { String emojiName, String emojiCode, String reactionType }) async {
    // Verify required params are set.
    if (messageId == null) {
     throw ApiException(HttpStatus.badRequest, 'Missing required param: messageId');
    }

    final path = r'/messages/{message_id}/reactions'
      .replaceAll('{' + 'message_id' + '}', messageId.toString());

    Object postBody;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

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
      'DELETE',
      queryParams,
      postBody,
      headerParams,
      formParams,
      nullableContentType,
      authNames,
    );
  }

  /// Remove an emoji reaction
  ///
  /// Remove an [emoji reaction](/help/emoji-reactions) from a message.  `DELETE {{ api_url }}/v1/messages/{message_id}/reactions` 
  ///
  /// Parameters:
  ///
  /// * [int] messageId (required):
  ///   The target message's ID. 
  ///
  /// * [String] emojiName:
  ///   The target emoji's human-readable name.  To find an emoji's name, hover over a message to reveal three icons on the right, then click the smiley face icon. Images of available reaction emojis appear. Hover over the emoji you want, and note that emoji's text name. 
  ///
  /// * [String] emojiCode:
  ///   A unique identifier, defining the specific emoji codepoint requested, within the namespace of the `reaction_type`.  For most API clients, you won't need this, but it's important for Zulip apps to handle rare corner cases when adding/removing votes on an emoji reaction added previously by another user.  If the existing reaction was added when the Zulip server was using a previous version of the emoji data mapping between Unicode codepoints and human-readable names, sending the `emoji_code` in the data for the original reaction allows the Zulip server to correctly interpret your upvote as an upvote rather than a reaction with a \"diffenent\" emoji. 
  ///
  /// * [String] reactionType:
  ///   If an app is adding/removing a vote on an existing reaction, it should pass this parameter using the value the server provided for the existing reaction for specificity.  Supported values:  * `unicode_emoji`: Unicode emoji (`emoji_code` will be its Unicode codepoint). * `realm_emoji`: Custom emoji. (`emoji_code` will be its ID). * `zulip_extra_emoji`: Special emoji included with Zulip.  Exists to    namespace the `zulip` emoji.  **Changes**: In Zulip 3.0 (feature level 2), this become optional for [custom emoji](/help/add-custom-emoji); previously, this endpoint assumed `unicode_emoji` if this parameter was not specified. 
  Future<JsonSuccess> removeReaction(int messageId, { String emojiName, String emojiCode, String reactionType }) async {
    final response = await removeReactionWithHttpInfo(messageId,  emojiName: emojiName, emojiCode: emojiCode, reactionType: reactionType );
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

  /// Render message
  ///
  /// Render a message to HTML.  `POST {{ api_url }}/v1/messages/render` 
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [String] content (required):
  ///   The content of the message. Maximum message size of 10000 bytes. 
  Future<Response> renderMessageWithHttpInfo(String content) async {
    // Verify required params are set.
    if (content == null) {
     throw ApiException(HttpStatus.badRequest, 'Missing required param: content');
    }

    final path = r'/messages/render';

    Object postBody;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

      queryParams.addAll(_convertParametersForCollectionFormat('', 'content', content));

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

  /// Render message
  ///
  /// Render a message to HTML.  `POST {{ api_url }}/v1/messages/render` 
  ///
  /// Parameters:
  ///
  /// * [String] content (required):
  ///   The content of the message. Maximum message size of 10000 bytes. 
  Future<JsonSuccessBase> renderMessage(String content) async {
    final response = await renderMessageWithHttpInfo(content);
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

  /// Send a message
  ///
  /// Send a stream or a private message.  `POST {{ api_url }}/v1/messages` 
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [String] type (required):
  ///   The type of message to be sent. `private` for a private message and `stream` for a stream message. 
  ///
  /// * [List<int>] to (required):
  ///   For stream messages, either the name or integer ID of the stream. For private messages, either a list containing integer user IDs or a list containing string email addresses.  **Changes**: Support for using user/stream IDs was added in Zulip 2.0.0. 
  ///
  /// * [String] content (required):
  ///   The content of the message. Maximum message size of 10000 bytes. 
  ///
  /// * [String] topic:
  ///   The topic of the message. Only required for stream messages (`type=\"stream\"`), ignored otherwise.  Maximum length of 60 characters.  **Changes**: New in Zulip 2.0.  Previous Zulip releases encoded this as `subject`, which is currently a deprecated alias. 
  ///
  /// * [String] queueId:
  ///   For clients supporting [local echo](https://zulip.readthedocs.io/en/latest/subsystems/sending-messages.html#local-echo), the [event queue](/api/register-queue) ID for the client.  If passed, `local_id` is required.  If the message is successfully sent, the server will include `local_id` in the `message` event that the client with this `queue_id` will receive notifying it of the new message via [`GET /events`](/api/get-events).  This lets the client know unambiguously that it should replace the locally echoed message, rather than adding this new message (which would be correct if the user had sent the new message from another device). 
  ///
  /// * [String] localId:
  ///   For clients supporting local echo, a unique string-format identifier chosen freely by the client; the server will pass it back to the client without inspecting it, as described in the `queue_id` description. 
  Future<Response> sendMessageWithHttpInfo(String type, List<int> to, String content, { String topic, String queueId, String localId }) async {
    // Verify required params are set.
    if (type == null) {
     throw ApiException(HttpStatus.badRequest, 'Missing required param: type');
    }
    if (to == null) {
     throw ApiException(HttpStatus.badRequest, 'Missing required param: to');
    }
    if (content == null) {
     throw ApiException(HttpStatus.badRequest, 'Missing required param: content');
    }

    final path = r'/messages';

    Object postBody;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

      queryParams.addAll(_convertParametersForCollectionFormat('', 'type', type));
      queryParams.addAll(_convertParametersForCollectionFormat('multi', 'to', to));
      queryParams.addAll(_convertParametersForCollectionFormat('', 'content', content));
    if (topic != null) {
      queryParams.addAll(_convertParametersForCollectionFormat('', 'topic', topic));
    }
    if (queueId != null) {
      queryParams.addAll(_convertParametersForCollectionFormat('', 'queue_id', queueId));
    }
    if (localId != null) {
      queryParams.addAll(_convertParametersForCollectionFormat('', 'local_id', localId));
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

  /// Send a message
  ///
  /// Send a stream or a private message.  `POST {{ api_url }}/v1/messages` 
  ///
  /// Parameters:
  ///
  /// * [String] type (required):
  ///   The type of message to be sent. `private` for a private message and `stream` for a stream message. 
  ///
  /// * [List<int>] to (required):
  ///   For stream messages, either the name or integer ID of the stream. For private messages, either a list containing integer user IDs or a list containing string email addresses.  **Changes**: Support for using user/stream IDs was added in Zulip 2.0.0. 
  ///
  /// * [String] content (required):
  ///   The content of the message. Maximum message size of 10000 bytes. 
  ///
  /// * [String] topic:
  ///   The topic of the message. Only required for stream messages (`type=\"stream\"`), ignored otherwise.  Maximum length of 60 characters.  **Changes**: New in Zulip 2.0.  Previous Zulip releases encoded this as `subject`, which is currently a deprecated alias. 
  ///
  /// * [String] queueId:
  ///   For clients supporting [local echo](https://zulip.readthedocs.io/en/latest/subsystems/sending-messages.html#local-echo), the [event queue](/api/register-queue) ID for the client.  If passed, `local_id` is required.  If the message is successfully sent, the server will include `local_id` in the `message` event that the client with this `queue_id` will receive notifying it of the new message via [`GET /events`](/api/get-events).  This lets the client know unambiguously that it should replace the locally echoed message, rather than adding this new message (which would be correct if the user had sent the new message from another device). 
  ///
  /// * [String] localId:
  ///   For clients supporting local echo, a unique string-format identifier chosen freely by the client; the server will pass it back to the client without inspecting it, as described in the `queue_id` description. 
  Future<JsonSuccessBase> sendMessage(String type, List<int> to, String content, { String topic, String queueId, String localId }) async {
    final response = await sendMessageWithHttpInfo(type, to, content,  topic: topic, queueId: queueId, localId: localId );
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

  /// Edit a message
  ///
  /// Edit/update the content or topic of a message.  `PATCH {{ api_url }}/v1/messages/{msg_id}`  `{msg_id}` in the above URL should be replaced with the ID of the message you wish you update.  You can [resolve topics](/help/resolve-a-topic) by editing the topic to `✔ {original_topic}`.  **Note**: See [configuring message editing][config-message-editing] for detailed documentation on when users are allowed to edit topics.  [config-message-editing]: /help/configure-message-editing-and-deletion 
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [int] messageId (required):
  ///   The target message's ID. 
  ///
  /// * [String] topic:
  ///   The topic to move the message(s) to, to request changing the topic. Should only be sent when changing the topic, and will throw an error if the target message is not a stream message.  Maximum length of 60 characters.  **Changes**: New in Zulip 2.0.  Previous Zulip releases encoded this as `subject`, which is currently a deprecated alias. 
  ///
  /// * [String] propagateMode:
  ///   Which message(s) should be edited: just the one indicated in `message_id`, messages in the same topic that had been sent after this one, or all of them.  Only the default value of `change_one` is valid when editing only the content of a message.  This parameter determines both which messages get moved and also whether clients that are currently narrowed to the topic containing the message should navigate or adjust their compose box recipient to point to the post-edit stream/topic. 
  ///
  /// * [bool] sendNotificationToOldThread:
  ///   Whether to send breadcrumb message to the old thread to notify users where the messages were moved to.  **Changes**: New in Zulip 3.0 (feature level 9). 
  ///
  /// * [bool] sendNotificationToNewThread:
  ///   Whether to send a notification message to the new thread to notify users where the messages came from.  **Changes**: New in Zulip 3.0 (feature level 9). 
  ///
  /// * [String] content:
  ///   The content of the message. Maximum message size of 10000 bytes. 
  ///
  /// * [int] streamId:
  ///   The stream ID to move the message(s) to, to request moving messages to another stream.  Should only be sent when changing the stream, and will throw an error if the target message is not a stream message. 
  Future<Response> updateMessageWithHttpInfo(int messageId, { String topic, String propagateMode, bool sendNotificationToOldThread, bool sendNotificationToNewThread, String content, int streamId }) async {
    // Verify required params are set.
    if (messageId == null) {
     throw ApiException(HttpStatus.badRequest, 'Missing required param: messageId');
    }

    final path = r'/messages/{message_id}'
      .replaceAll('{' + 'message_id' + '}', messageId.toString());

    Object postBody;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

    if (topic != null) {
      queryParams.addAll(_convertParametersForCollectionFormat('', 'topic', topic));
    }
    if (propagateMode != null) {
      queryParams.addAll(_convertParametersForCollectionFormat('', 'propagate_mode', propagateMode));
    }
    if (sendNotificationToOldThread != null) {
      queryParams.addAll(_convertParametersForCollectionFormat('', 'send_notification_to_old_thread', sendNotificationToOldThread));
    }
    if (sendNotificationToNewThread != null) {
      queryParams.addAll(_convertParametersForCollectionFormat('', 'send_notification_to_new_thread', sendNotificationToNewThread));
    }
    if (content != null) {
      queryParams.addAll(_convertParametersForCollectionFormat('', 'content', content));
    }
    if (streamId != null) {
      queryParams.addAll(_convertParametersForCollectionFormat('', 'stream_id', streamId));
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

  /// Edit a message
  ///
  /// Edit/update the content or topic of a message.  `PATCH {{ api_url }}/v1/messages/{msg_id}`  `{msg_id}` in the above URL should be replaced with the ID of the message you wish you update.  You can [resolve topics](/help/resolve-a-topic) by editing the topic to `✔ {original_topic}`.  **Note**: See [configuring message editing][config-message-editing] for detailed documentation on when users are allowed to edit topics.  [config-message-editing]: /help/configure-message-editing-and-deletion 
  ///
  /// Parameters:
  ///
  /// * [int] messageId (required):
  ///   The target message's ID. 
  ///
  /// * [String] topic:
  ///   The topic to move the message(s) to, to request changing the topic. Should only be sent when changing the topic, and will throw an error if the target message is not a stream message.  Maximum length of 60 characters.  **Changes**: New in Zulip 2.0.  Previous Zulip releases encoded this as `subject`, which is currently a deprecated alias. 
  ///
  /// * [String] propagateMode:
  ///   Which message(s) should be edited: just the one indicated in `message_id`, messages in the same topic that had been sent after this one, or all of them.  Only the default value of `change_one` is valid when editing only the content of a message.  This parameter determines both which messages get moved and also whether clients that are currently narrowed to the topic containing the message should navigate or adjust their compose box recipient to point to the post-edit stream/topic. 
  ///
  /// * [bool] sendNotificationToOldThread:
  ///   Whether to send breadcrumb message to the old thread to notify users where the messages were moved to.  **Changes**: New in Zulip 3.0 (feature level 9). 
  ///
  /// * [bool] sendNotificationToNewThread:
  ///   Whether to send a notification message to the new thread to notify users where the messages came from.  **Changes**: New in Zulip 3.0 (feature level 9). 
  ///
  /// * [String] content:
  ///   The content of the message. Maximum message size of 10000 bytes. 
  ///
  /// * [int] streamId:
  ///   The stream ID to move the message(s) to, to request moving messages to another stream.  Should only be sent when changing the stream, and will throw an error if the target message is not a stream message. 
  Future<JsonSuccess> updateMessage(int messageId, { String topic, String propagateMode, bool sendNotificationToOldThread, bool sendNotificationToNewThread, String content, int streamId }) async {
    final response = await updateMessageWithHttpInfo(messageId,  topic: topic, propagateMode: propagateMode, sendNotificationToOldThread: sendNotificationToOldThread, sendNotificationToNewThread: sendNotificationToNewThread, content: content, streamId: streamId );
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

  /// Update personal message flags
  ///
  /// Add or remove personal message flags like `read` and `starred` on a collection of message IDs.  `POST {{ api_url }}/v1/messages/flags`  For updating the `read` flag on common collections of messages, see also the [special endpoints for marking message as read in bulk](/api/mark-all-as-read). 
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [List<int>] messages (required):
  ///   An array containing the IDs of the target messages. 
  ///
  /// * [String] op (required):
  ///   Whether to `add` the flag or `remove` it. 
  ///
  /// * [String] flag (required):
  ///   The flag that should be added/removed. 
  Future<Response> updateMessageFlagsWithHttpInfo(List<int> messages, String op, String flag) async {
    // Verify required params are set.
    if (messages == null) {
     throw ApiException(HttpStatus.badRequest, 'Missing required param: messages');
    }
    if (op == null) {
     throw ApiException(HttpStatus.badRequest, 'Missing required param: op');
    }
    if (flag == null) {
     throw ApiException(HttpStatus.badRequest, 'Missing required param: flag');
    }

    final path = r'/messages/flags';

    Object postBody;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

      queryParams.addAll(_convertParametersForCollectionFormat('multi', 'messages', messages));
      queryParams.addAll(_convertParametersForCollectionFormat('', 'op', op));
      queryParams.addAll(_convertParametersForCollectionFormat('', 'flag', flag));

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

  /// Update personal message flags
  ///
  /// Add or remove personal message flags like `read` and `starred` on a collection of message IDs.  `POST {{ api_url }}/v1/messages/flags`  For updating the `read` flag on common collections of messages, see also the [special endpoints for marking message as read in bulk](/api/mark-all-as-read). 
  ///
  /// Parameters:
  ///
  /// * [List<int>] messages (required):
  ///   An array containing the IDs of the target messages. 
  ///
  /// * [String] op (required):
  ///   Whether to `add` the flag or `remove` it. 
  ///
  /// * [String] flag (required):
  ///   The flag that should be added/removed. 
  Future<JsonSuccessBase> updateMessageFlags(List<int> messages, String op, String flag) async {
    final response = await updateMessageFlagsWithHttpInfo(messages, op, flag);
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

  /// Upload a file
  ///
  /// Upload a single file and get the corresponding URI.  `POST {{ api_url }}/v1/user_uploads`  Initially, only you will be able to access the link.  To share the uploaded file, you'll need to [send a message][send-message] containing the resulting link.  Users who can already access the link can reshare it with other users by sending additional Zulip messages containing the link.  [uploaded-files]: /help/manage-your-uploaded-files [send-message]: /api/send-message 
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [MultipartFile] filename:
  Future<Response> uploadFileWithHttpInfo({ MultipartFile filename }) async {
    // Verify required params are set.

    final path = r'/user_uploads';

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

  /// Upload a file
  ///
  /// Upload a single file and get the corresponding URI.  `POST {{ api_url }}/v1/user_uploads`  Initially, only you will be able to access the link.  To share the uploaded file, you'll need to [send a message][send-message] containing the resulting link.  Users who can already access the link can reshare it with other users by sending additional Zulip messages containing the link.  [uploaded-files]: /help/manage-your-uploaded-files [send-message]: /api/send-message 
  ///
  /// Parameters:
  ///
  /// * [MultipartFile] filename:
  Future<JsonSuccessBase> uploadFile({ MultipartFile filename }) async {
    final response = await uploadFileWithHttpInfo( filename: filename );
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
