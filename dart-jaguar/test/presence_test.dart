import 'package:openapi/api.dart';
import 'package:test/test.dart';

// tests for Presence
void main() {
  var instance = new Presence();

  group('test Presence', () {
    // The client's platform name. 
    // String client (default value: null)
    test('to test the property `client`', () async {
      // TODO
    });

    // The status of the user on this client. It is either `idle` or `active`. 
    // String status (default value: null)
    test('to test the property `status`', () async {
      // TODO
    });

    // The UNIX timestamp of when this client sent the user's presence to the server with the precision of a second. 
    // int timestamp (default value: null)
    test('to test the property `timestamp`', () async {
      // TODO
    });

    // Whether the client is capable of showing mobile/push notifications to the user. 
    // bool pushable (default value: null)
    test('to test the property `pushable`', () async {
      // TODO
    });


  });

}
