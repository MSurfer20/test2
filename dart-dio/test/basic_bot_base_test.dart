//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.7

// ignore_for_file: unused_import

import 'package:openapi/model/basic_bot_base.dart';
import 'package:test/test.dart';

// tests for BasicBotBase
void main() {
  final instance = BasicBotBaseBuilder();
  // TODO add properties to the builder and call build()

  group(BasicBotBase, () {
    // The user id of the bot. 
    // int userId
    test('to test the property `userId`', () async {
      // TODO
    });

    // The full name of the bot. 
    // String fullName
    test('to test the property `fullName`', () async {
      // TODO
    });

    // The API key of the bot which it uses to make API requests. 
    // String apiKey
    test('to test the property `apiKey`', () async {
      // TODO
    });

    // The default sending stream of the bot. Null if the bot doesn't have a default sending stream. 
    // String defaultSendingStream
    test('to test the property `defaultSendingStream`', () async {
      // TODO
    });

    // The default stream for which the bot receives events/register data. Null if the bot doesn't have such a default stream. 
    // String defaultEventsRegisterStream
    test('to test the property `defaultEventsRegisterStream`', () async {
      // TODO
    });

    // Whether the bot can send messages to all streams by default. 
    // bool defaultAllPublicStreams
    test('to test the property `defaultAllPublicStreams`', () async {
      // TODO
    });

    // The URL of the bot's avatar. 
    // String avatarUrl
    test('to test the property `avatarUrl`', () async {
      // TODO
    });

    // The user id of the bot's owner.  Null if the bot has no owner. 
    // int ownerId
    test('to test the property `ownerId`', () async {
      // TODO
    });

    // The \"Services\" array contains extra configuration fields only relevant for Outgoing webhook bots and Embedded bots.  It is always a single-element array.  We consider this part of the Zulip API to be unstable; it is used only for UI elements for administering bots and is likely to change. 
    // BuiltList<OneOfobjectobject> services
    test('to test the property `services`', () async {
      // TODO
    });


  });

}
