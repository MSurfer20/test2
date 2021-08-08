//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.7

// ignore_for_file: unused_import

import 'package:openapi/model/realm_emoji.dart';
import 'package:test/test.dart';

// tests for RealmEmoji
void main() {
  final instance = RealmEmojiBuilder();
  // TODO add properties to the builder and call build()

  group(RealmEmoji, () {
    // The ID for this emoji, same as the object's key. 
    // String id
    test('to test the property `id`', () async {
      // TODO
    });

    // The user-friendly name for this emoji. Users in the organization can use this emoji by writing this name between colons (`:name  :`). 
    // String name
    test('to test the property `name`', () async {
      // TODO
    });

    // The path relative to the organization's URL where the emoji's image can be found. 
    // String sourceUrl
    test('to test the property `sourceUrl`', () async {
      // TODO
    });

    // Whether the emoji has been deactivated or not. 
    // bool deactivated
    test('to test the property `deactivated`', () async {
      // TODO
    });

    // The user ID of the user who uploaded the custom emoji. Will be null if the uploader is unknown.  **Changes**: New in Zulip 3.0 (feature level 7).  Previously was accessible via and `author` object with an `id` field. 
    // int authorId
    test('to test the property `authorId`', () async {
      // TODO
    });


  });

}
