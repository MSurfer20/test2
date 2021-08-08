import 'package:jaguar_retrofit/annotations/annotations.dart';
import 'package:jaguar_retrofit/jaguar_retrofit.dart';
import 'package:jaguar_serializer/jaguar_serializer.dart';
import 'package:jaguar_mimetype/jaguar_mimetype.dart';
import 'dart:async';

import 'package:openapi/model/json_success.dart';
import 'package:openapi/model/json_error.dart';
import 'package:openapi/model/draft.dart';
import 'package:openapi/model/coded_error.dart';

part 'drafts_api.jretro.dart';

@GenApiClient()
class DraftsApi extends ApiClient with _$DraftsApiClient {
    final Route base;
    final Map<String, CodecRepo> converters;
    final Duration timeout;

    DraftsApi({this.base, this.converters, this.timeout = const Duration(minutes: 2)});

    /// Create drafts
    ///
    /// Create one or more drafts on the server. These drafts will be automatically synchronized to other clients via &#x60;drafts&#x60; events.  &#x60;POST {{ api_url }}/v1/drafts&#x60; 
    @PostReq(path: "/drafts")
    Future<JsonSuccess> createDrafts(
        
            @QueryParam("drafts") List<Draft> drafts
        ) {
        return super.createDrafts(
        
        drafts

        ).timeout(timeout);
    }

    /// Delete a draft
    ///
    /// Delete a single draft from the server. The deletion will be automatically synchronized to other clients via a &#x60;drafts&#x60; event.  &#x60;DELETE {{ api_url }}/v1/drafts/{draft_id}&#x60; 
    @DeleteReq(path: "/drafts/:draft_id")
    Future<JsonSuccess> deleteDraft(
            @PathParam("draft_id") int draftId
        ) {
        return super.deleteDraft(
        draftId

        ).timeout(timeout);
    }

    /// Edit a draft
    ///
    /// Edit a draft on the server. The edit will be automatically synchronized to other clients via &#x60;drafts&#x60; events.  &#x60;PATCH {{ api_url }}/v1/drafts/{draft_id}&#x60; 
    @PatchReq(path: "/drafts/:draft_id")
    Future<JsonSuccess> editDraft(
            @PathParam("draft_id") int draftId
        ,
            @QueryParam("draft") Draft draft
        ) {
        return super.editDraft(
        draftId
        ,
        draft

        ).timeout(timeout);
    }

    /// Get drafts
    ///
    /// Fetch all drafts for the current user.  &#x60;GET {{ api_url }}/v1/drafts&#x60; 
    @GetReq(path: "/drafts")
    Future<JsonSuccess> getDrafts(
        ) {
        return super.getDrafts(

        ).timeout(timeout);
    }


}
