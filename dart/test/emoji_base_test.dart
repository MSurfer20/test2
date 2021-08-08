//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.0

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: lines_longer_than_80_chars

import 'package:openapi/api.dart';
import 'package:test/test.dart';

// tests for EmojiBase
void main() {
  final instance = EmojiBase();

  group('test EmojiBase', () {
    // A unique identifier, defining the specific emoji codepoint requested, within the namespace of the `reaction_type`.  For example, for `unicode_emoji`, this will be an encoding of the Unicode codepoint; for `realm_emoji`, it'll be the ID of the realm emoji. 
    // String emojiCode
    test('to test the property `emojiCode`', () async {
      // TODO
    });

    // Name of the emoji. 
    // String emojiName
    test('to test the property `emojiName`', () async {
      // TODO
    });

    // One of the following values:  * `unicode_emoji`: Unicode emoji (`emoji_code` will be its Unicode   codepoint). * `realm_emoji`: [Custom emoji](/help/add-custom-emoji).   (`emoji_code` will be its ID). * `zulip_extra_emoji`: Special emoji included with Zulip.  Exists to   namespace the `zulip` emoji. 
    // String reactionType
    test('to test the property `reactionType`', () async {
      // TODO
    });


  });

}
