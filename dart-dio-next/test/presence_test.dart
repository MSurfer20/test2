import 'package:test/test.dart';
import 'package:openapi/openapi.dart';

// tests for Presence
void main() {
  final instance = PresenceBuilder();
  // TODO add properties to the builder and call build()

  group(Presence, () {
    // The client's platform name. 
    // String client
    test('to test the property `client`', () async {
      // TODO
    });

    // The status of the user on this client. It is either `idle` or `active`. 
    // String status
    test('to test the property `status`', () async {
      // TODO
    });

    // The UNIX timestamp of when this client sent the user's presence to the server with the precision of a second. 
    // int timestamp
    test('to test the property `timestamp`', () async {
      // TODO
    });

    // Whether the client is capable of showing mobile/push notifications to the user. 
    // bool pushable
    test('to test the property `pushable`', () async {
      // TODO
    });

  });
}
