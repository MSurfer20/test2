//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.7

// ignore_for_file: unused_import

import 'package:openapi/model/attachments.dart';
import 'package:test/test.dart';

// tests for Attachments
void main() {
  final instance = AttachmentsBuilder();
  // TODO add properties to the builder and call build()

  group(Attachments, () {
    // The unique ID for the attachment. 
    // int id
    test('to test the property `id`', () async {
      // TODO
    });

    // Name of the uploaded file. 
    // String name
    test('to test the property `name`', () async {
      // TODO
    });

    // A representation of the path of the file within the repository of user-uploaded files.  If the `path_id` of a file is `{realm_id}/ab/cdef/temp_file.py`, its URL will be: `{server_url}/user_uploads/{realm_id}/ab/cdef/temp_file.py`. 
    // String pathId
    test('to test the property `pathId`', () async {
      // TODO
    });

    // Size of the file in bytes. 
    // int size
    test('to test the property `size`', () async {
      // TODO
    });

    // Time when the attachment was uploaded as a UNIX timestamp multiplied by 1000 (matching the format of getTime() in JavaScript).  **Changes**: Changed in Zulip 2.2 (feature level 22).  This field was previously a floating point number. 
    // int createTime
    test('to test the property `createTime`', () async {
      // TODO
    });

    // Contains basic details on any Zulip messages that have been sent referencing this [uploaded file](/api/upload-file). This includes messages sent by any user in the Zulip organization who sent a message containing a link to the uploaded file. 
    // BuiltList<AttachmentsMessages> messages
    test('to test the property `messages`', () async {
      // TODO
    });


  });

}
