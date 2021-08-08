//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.0

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: lines_longer_than_80_chars

import 'package:openapi/api.dart';
import 'package:test/test.dart';

// tests for InlineResponse200
void main() {
  final instance = InlineResponse200();

  group('test InlineResponse200', () {
    // Email of the bot user. 
    // String botEmail
    test('to test the property `botEmail`', () async {
      // TODO
    });

    // The full name of the bot user. 
    // String botFullName
    test('to test the property `botFullName`', () async {
      // TODO
    });

    // The message content, in raw Markdown format (not rendered to HTML). 
    // String data
    test('to test the property `data`', () async {
      // TODO
    });

    // What aspect of the message triggered the outgoing webhook notification. Possible values include `private_message` and `mention`. 
    // String trigger
    test('to test the property `trigger`', () async {
      // TODO
    });

    // A string of alphanumeric characters that can be used to authenticate the webhook request (each bot user uses a fixed token). You can get the token used by a given outgoing webhook bot in the `zuliprc` file downloaded when creating the bot. 
    // String token
    test('to test the property `token`', () async {
      // TODO
    });

    // A dict containing details on the message that triggered the outgoing webhook, in the format used by [`GET /messages`](/api/get-messages). 
    // MessagesBase message
    test('to test the property `message`', () async {
      // TODO
    });


  });

}
