//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.0

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: lines_longer_than_80_chars

import 'package:openapi/api.dart';
import 'package:test/test.dart';


/// tests for DraftsApi
void main() {
  final instance = DraftsApi();

  group('tests for DraftsApi', () {
    // Create drafts
    //
    // Create one or more drafts on the server. These drafts will be automatically synchronized to other clients via `drafts` events.  `POST {{ api_url }}/v1/drafts` 
    //
    //Future<JsonSuccess> createDrafts({ List<Draft> drafts }) async
    test('test createDrafts', () async {
      // TODO
    });

    // Delete a draft
    //
    // Delete a single draft from the server. The deletion will be automatically synchronized to other clients via a `drafts` event.  `DELETE {{ api_url }}/v1/drafts/{draft_id}` 
    //
    //Future<JsonSuccess> deleteDraft(int draftId) async
    test('test deleteDraft', () async {
      // TODO
    });

    // Edit a draft
    //
    // Edit a draft on the server. The edit will be automatically synchronized to other clients via `drafts` events.  `PATCH {{ api_url }}/v1/drafts/{draft_id}` 
    //
    //Future<JsonSuccess> editDraft(int draftId, Draft draft) async
    test('test editDraft', () async {
      // TODO
    });

    // Get drafts
    //
    // Fetch all drafts for the current user.  `GET {{ api_url }}/v1/drafts` 
    //
    //Future<JsonSuccess> getDrafts() async
    test('test getDrafts', () async {
      // TODO
    });

  });
}
