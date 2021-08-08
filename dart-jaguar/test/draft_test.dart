import 'package:openapi/api.dart';
import 'package:test/test.dart';

// tests for Draft
void main() {
  var instance = new Draft();

  group('test Draft', () {
    // The unique ID of the draft. It will only used whenever the drafts are fetched. This field should not be specified when the draft is being created or edited. 
    // int id (default value: null)
    test('to test the property `id`', () async {
      // TODO
    });

    // The type of the draft. Either unaddressed (empty string), \"stream\", or \"private\" (for PMs and private group messages). 
    // String type (default value: null)
    test('to test the property `type`', () async {
      // TODO
    });

    // An array of the tentative target audience IDs. For \"stream\" messages, this should contain exactly 1 ID, the ID of the target stream. For private messages, this should be an array of target user IDs. For unaddressed drafts, this is ignored, and clients should send an empty array. 
    // List<int> to (default value: const [])
    test('to test the property `to`', () async {
      // TODO
    });

    // For stream message drafts, the tentative topic name. For private or unaddressed messages, this will be ignored and should ideally be the empty string. Should not contain null bytes. 
    // String topic (default value: null)
    test('to test the property `topic`', () async {
      // TODO
    });

    // The body of the draft. Should not contain null bytes. 
    // String content (default value: null)
    test('to test the property `content`', () async {
      // TODO
    });

    // A Unix timestamp (seconds only) representing when the draft was last edited. When creating a draft, this key need not be present and it will be filled in automatically by the server. 
    // num timestamp (default value: null)
    test('to test the property `timestamp`', () async {
      // TODO
    });


  });

}
