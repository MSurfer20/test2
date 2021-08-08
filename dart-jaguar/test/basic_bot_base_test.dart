import 'package:openapi/api.dart';
import 'package:test/test.dart';

// tests for BasicBotBase
void main() {
  var instance = new BasicBotBase();

  group('test BasicBotBase', () {
    // The user id of the bot. 
    // int userId (default value: null)
    test('to test the property `userId`', () async {
      // TODO
    });

    // The full name of the bot. 
    // String fullName (default value: null)
    test('to test the property `fullName`', () async {
      // TODO
    });

    // The API key of the bot which it uses to make API requests. 
    // String apiKey (default value: null)
    test('to test the property `apiKey`', () async {
      // TODO
    });

    // The default sending stream of the bot. Null if the bot doesn't have a default sending stream. 
    // String defaultSendingStream (default value: null)
    test('to test the property `defaultSendingStream`', () async {
      // TODO
    });

    // The default stream for which the bot receives events/register data. Null if the bot doesn't have such a default stream. 
    // String defaultEventsRegisterStream (default value: null)
    test('to test the property `defaultEventsRegisterStream`', () async {
      // TODO
    });

    // Whether the bot can send messages to all streams by default. 
    // bool defaultAllPublicStreams (default value: null)
    test('to test the property `defaultAllPublicStreams`', () async {
      // TODO
    });

    // The URL of the bot's avatar. 
    // String avatarUrl (default value: null)
    test('to test the property `avatarUrl`', () async {
      // TODO
    });

    // The user id of the bot's owner.  Null if the bot has no owner. 
    // int ownerId (default value: null)
    test('to test the property `ownerId`', () async {
      // TODO
    });

    // The \"Services\" array contains extra configuration fields only relevant for Outgoing webhook bots and Embedded bots.  It is always a single-element array.  We consider this part of the Zulip API to be unstable; it is used only for UI elements for administering bots and is likely to change. 
    // List<OneOfobjectobject> services (default value: const [])
    test('to test the property `services`', () async {
      // TODO
    });


  });

}
