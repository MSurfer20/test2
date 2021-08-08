import 'package:openapi/api.dart';
import 'package:test/test.dart';

// tests for AttachmentsMessages
void main() {
  var instance = new AttachmentsMessages();

  group('test AttachmentsMessages', () {
    // Time when the message was sent as a UNIX timestamp multiplied by 1000 (matching the format of getTime() in JavaScript).  **Changes**: Changed in Zulip 2.2 (feature level 22).  This field was previously strangely called `name` and was a floating point number. 
    // int dateSent (default value: null)
    test('to test the property `dateSent`', () async {
      // TODO
    });

    // The unique message ID.  Messages should always be displayed sorted by ID. 
    // int id (default value: null)
    test('to test the property `id`', () async {
      // TODO
    });


  });

}
