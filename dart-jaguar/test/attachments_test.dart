import 'package:openapi/api.dart';
import 'package:test/test.dart';

// tests for Attachments
void main() {
  var instance = new Attachments();

  group('test Attachments', () {
    // The unique ID for the attachment. 
    // int id (default value: null)
    test('to test the property `id`', () async {
      // TODO
    });

    // Name of the uploaded file. 
    // String name (default value: null)
    test('to test the property `name`', () async {
      // TODO
    });

    // A representation of the path of the file within the repository of user-uploaded files.  If the `path_id` of a file is `{realm_id}/ab/cdef/temp_file.py`, its URL will be: `{server_url}/user_uploads/{realm_id}/ab/cdef/temp_file.py`. 
    // String pathId (default value: null)
    test('to test the property `pathId`', () async {
      // TODO
    });

    // Size of the file in bytes. 
    // int size (default value: null)
    test('to test the property `size`', () async {
      // TODO
    });

    // Time when the attachment was uploaded as a UNIX timestamp multiplied by 1000 (matching the format of getTime() in JavaScript).  **Changes**: Changed in Zulip 2.2 (feature level 22).  This field was previously a floating point number. 
    // int createTime (default value: null)
    test('to test the property `createTime`', () async {
      // TODO
    });

    // Contains basic details on any Zulip messages that have been sent referencing this [uploaded file](/api/upload-file). This includes messages sent by any user in the Zulip organization who sent a message containing a link to the uploaded file. 
    // List<AttachmentsMessages> messages (default value: const [])
    test('to test the property `messages`', () async {
      // TODO
    });


  });

}
