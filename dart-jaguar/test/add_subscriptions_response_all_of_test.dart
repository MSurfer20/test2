import 'package:openapi/api.dart';
import 'package:test/test.dart';

// tests for AddSubscriptionsResponseAllOf
void main() {
  var instance = new AddSubscriptionsResponseAllOf();

  group('test AddSubscriptionsResponseAllOf', () {
    // Object result (default value: null)
    test('to test the property `result`', () async {
      // TODO
    });

    // Object msg (default value: null)
    test('to test the property `msg`', () async {
      // TODO
    });

    // A dictionary where the key is the email address of the user/bot and the value is a list of the names of the streams that were subscribed to as a result of the query. 
    // Map<String, List<String>> subscribed (default value: const {})
    test('to test the property `subscribed`', () async {
      // TODO
    });

    // A dictionary where the key is the email address of the user/bot and the value is a list of the names of the streams that the user/bot is already subscribed to. 
    // Map<String, List<String>> alreadySubscribed (default value: const {})
    test('to test the property `alreadySubscribed`', () async {
      // TODO
    });

    // A list of names of streams that the requesting user/bot was not authorized to subscribe to.  Only present if `authorization_errors_fatal=false`. 
    // List<String> unauthorized (default value: const [])
    test('to test the property `unauthorized`', () async {
      // TODO
    });


  });

}
