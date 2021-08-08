//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.7

// ignore_for_file: unused_import

import 'package:openapi/api.dart';
import 'package:openapi/api/server_and_organizations_api.dart';
import 'package:test/test.dart';


/// tests for ServerAndOrganizationsApi
void main() {
  final instance = Openapi().getServerAndOrganizationsApi();

  group(ServerAndOrganizationsApi, () {
    // Add a code playground
    //
    // Configure [code playgrounds](/help/code-blocks#code-playgrounds) for the organization.  `POST {{ api_url }}/v1/realm/playgrounds`  **Changes**: New in Zulip 4.0 (feature level 49). A parameter encoding bug was fixed in Zulip 4.0 (feature level 57). 
    //
    //Future<JsonSuccessBase> addCodePlayground(String name, String pygmentsLanguage, String urlPrefix) async
    test('test addCodePlayground', () async {
      // TODO
    });

    // Add a linkifier
    //
    // Configure [linkifiers](/help/add-a-custom-linkifier), regular expression patterns that are automatically linkified when they appear in messages and topics.  `POST {{ api_url }}/v1/realm/filters` 
    //
    //Future<JsonSuccessBase> addLinkifier(String pattern, String urlFormatString) async
    test('test addLinkifier', () async {
      // TODO
    });

    // Create a custom profile field
    //
    // [Create a custom profile field](/help/add-custom-profile-fields) in the user's organization.  `POST {{ api_url }}/v1/realm/profile_fields` 
    //
    //Future<JsonSuccessBase> createCustomProfileField(int fieldType, { String name, String hint, JsonObject fieldData }) async
    test('test createCustomProfileField', () async {
      // TODO
    });

    // Get all custom emoji
    //
    // Get all the custom emoji in the user's organization.  `GET {{ api_url }}/v1/realm/emoji` 
    //
    //Future<JsonSuccessBase> getCustomEmoji() async
    test('test getCustomEmoji', () async {
      // TODO
    });

    // Get all custom profile fields
    //
    // Get all the [custom profile fields](/help/add-custom-profile-fields) configured for the user's organization.  `GET {{ api_url }}/v1/realm/profile_fields` 
    //
    //Future<JsonSuccessBase> getCustomProfileFields() async
    test('test getCustomProfileFields', () async {
      // TODO
    });

    // Get linkifiers
    //
    // List all of an organization's configured [linkifiers](/help/add-a-custom-linkifier), regular expression patterns that are automatically linkified when they appear in messages and topics.  `GET {{ api_url }}/v1/realm/linkifiers`  **Changes**: New in Zulip 4.0 (feature level 54). On older versions, a similar `GET /realm/filters` endpoint was available with each entry in a `[pattern, url_format, id]` tuple format. 
    //
    //Future<JsonSuccessBase> getLinkifiers() async
    test('test getLinkifiers', () async {
      // TODO
    });

    // Get server settings
    //
    // Fetch global settings for a Zulip server.  `GET {{ api_url }}/v1/server_settings`  **Note:** this endpoint does not require any authentication at all, and you can use it to check:  * If this is a Zulip server, and if so, what version of Zulip it's running. * What a Zulip client (e.g. a mobile app or [zulip-terminal](https://github.com/zulip/zulip-terminal/)) needs to know in order to display a login prompt for the server (e.g. what authentication methods are available). 
    //
    //Future<JsonSuccessBase> getServerSettings() async
    test('test getServerSettings', () async {
      // TODO
    });

    // Remove a code playground
    //
    // Remove a [code playground](/help/code-blocks#code-playgrounds) previously configured for an organization.  `DELETE {{ api_url }}/v1/realm/playgrounds/{playground_id}`  **Changes**: New in Zulip 4.0 (feature level 49). 
    //
    //Future<JsonSuccess> removeCodePlayground(int playgroundId) async
    test('test removeCodePlayground', () async {
      // TODO
    });

    // Remove a linkifier
    //
    // Remove [linkifiers](/help/add-a-custom-linkifier), regular expression patterns that are automatically linkified when they appear in messages and topics.  `DELETE {{ api_url }}/v1/realm/filters/{filter_id}` 
    //
    //Future<JsonSuccess> removeLinkifier(int filterId) async
    test('test removeLinkifier', () async {
      // TODO
    });

    // Reorder custom profile fields
    //
    // Reorder the custom profile fields in the user's organization.  `PATCH {{ api_url }}/v1/realm/profile_fields`  Custom profile fields are displayed in Zulip UI widgets in order; this endpoint allows administrative settings UI to change the field ordering.  This endpoint is used to implement the dragging feature described in the [custom profile fields documentation](/help/add-custom-profile-fields). 
    //
    //Future<JsonSuccess> reorderCustomProfileFields(BuiltList<int> order) async
    test('test reorderCustomProfileFields', () async {
      // TODO
    });

    // Update a linkifier
    //
    // Update a [linkifier](/help/add-a-custom-linkifier), regular expression patterns that are automatically linkified when they appear in messages and topics.  `PATCH {{ api_url }}/v1/realm/filters/{filter_id}`  **Changes**: New in Zulip 4.0 (feature level 57). 
    //
    //Future<JsonSuccess> updateLinkifier(int filterId, String pattern, String urlFormatString) async
    test('test updateLinkifier', () async {
      // TODO
    });

    // Upload custom emoji
    //
    // This endpoint is used to upload a custom emoji for use in the user's organization.  Access to this endpoint depends on the [organization's configuration](https://zulip.com/help/only-allow-admins-to-add-emoji).  `POST {{ api_url }}/v1/realm/emoji/{emoji_name}` 
    //
    //Future<JsonSuccess> uploadCustomEmoji(String emojiName, { Uint8List filename }) async
    test('test uploadCustomEmoji', () async {
      // TODO
    });

  });
}
