//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.7

// ignore_for_file: unused_import

import 'package:openapi/model/add_subscriptions_response_all_of.dart';
import 'package:test/test.dart';

// tests for AddSubscriptionsResponseAllOf
void main() {
  final instance = AddSubscriptionsResponseAllOfBuilder();
  // TODO add properties to the builder and call build()

  group(AddSubscriptionsResponseAllOf, () {
    // JsonObject result
    test('to test the property `result`', () async {
      // TODO
    });

    // JsonObject msg
    test('to test the property `msg`', () async {
      // TODO
    });

    // A dictionary where the key is the email address of the user/bot and the value is a list of the names of the streams that were subscribed to as a result of the query. 
    // BuiltMap<String, BuiltList<String>> subscribed
    test('to test the property `subscribed`', () async {
      // TODO
    });

    // A dictionary where the key is the email address of the user/bot and the value is a list of the names of the streams that the user/bot is already subscribed to. 
    // BuiltMap<String, BuiltList<String>> alreadySubscribed
    test('to test the property `alreadySubscribed`', () async {
      // TODO
    });

    // A list of names of streams that the requesting user/bot was not authorized to subscribe to.  Only present if `authorization_errors_fatal=false`. 
    // BuiltList<String> unauthorized
    test('to test the property `unauthorized`', () async {
      // TODO
    });


  });

}
