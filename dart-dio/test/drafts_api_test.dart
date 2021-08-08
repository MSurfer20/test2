//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.7

// ignore_for_file: unused_import

import 'package:openapi/api.dart';
import 'package:openapi/api/drafts_api.dart';
import 'package:test/test.dart';


/// tests for DraftsApi
void main() {
  final instance = Openapi().getDraftsApi();

  group(DraftsApi, () {
    // Create drafts
    //
    // Create one or more drafts on the server. These drafts will be automatically synchronized to other clients via `drafts` events.  `POST {{ api_url }}/v1/drafts` 
    //
    //Future<JsonSuccess> createDrafts({ BuiltList<Draft> drafts }) async
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
