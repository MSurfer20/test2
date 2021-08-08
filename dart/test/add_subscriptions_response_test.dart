//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.0

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: lines_longer_than_80_chars

import 'package:openapi/api.dart';
import 'package:test/test.dart';

// tests for AddSubscriptionsResponse
void main() {
  final instance = AddSubscriptionsResponse();

  group('test AddSubscriptionsResponse', () {
    // Object result
    test('to test the property `result`', () async {
      // TODO
    });

    // Object msg
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
