{-
   Zulip REST API
   Powerful open source group chat 

   The version of the OpenAPI document: 1.0.0

   NOTE: This file is auto generated by the openapi-generator.
   https://github.com/openapitools/openapi-generator.git

   DO NOT EDIT THIS FILE MANUALLY.

   For more info on generating Elm code, see https://eriktim.github.io/openapi-elm/
-}


module Api.Request.Drafts exposing
    ( createDrafts
    , deleteDraft
    , editDraft
    , getDrafts
    )

import Api
import Api.Data
import Dict
import Http
import Json.Decode
import Json.Encode



{-| Create one or more drafts on the server. These drafts will be automatically synchronized to other clients via `drafts` events.  `POST {{ api_url }}/v1/drafts` 
-}
createDrafts : Maybe List Draft -> Api.Request Api.Data.JsonSuccess
createDrafts drafts_query =
    Api.request
        "POST"
        "/drafts"
        []
        [ ( "drafts", Maybe.map String.join "," << List.map  drafts_query ) ]
        []
        Nothing
        Api.Data.jsonSuccessDecoder



{-| Delete a single draft from the server. The deletion will be automatically synchronized to other clients via a `drafts` event.  `DELETE {{ api_url }}/v1/drafts/{draft_id}` 
-}
deleteDraft : Int -> Api.Request Api.Data.JsonSuccess
deleteDraft draftId_path =
    Api.request
        "DELETE"
        "/drafts/{draft_id}"
        [ ( "draftId", String.fromInt draftId_path ) ]
        []
        []
        Nothing
        Api.Data.jsonSuccessDecoder



{-| Edit a draft on the server. The edit will be automatically synchronized to other clients via `drafts` events.  `PATCH {{ api_url }}/v1/drafts/{draft_id}` 
-}
editDraft : Int -> Api.Data.Draft -> Api.Request Api.Data.JsonSuccess
editDraft draftId_path draft_query =
    Api.request
        "PATCH"
        "/drafts/{draft_id}"
        [ ( "draftId", String.fromInt draftId_path ) ]
        [ ( "draft", Just <|  draft_query ) ]
        []
        Nothing
        Api.Data.jsonSuccessDecoder



{-| Fetch all drafts for the current user.  `GET {{ api_url }}/v1/drafts` 
-}
getDrafts : Api.Request Api.Data.JsonSuccess
getDrafts =
    Api.request
        "GET"
        "/drafts"
        []
        []
        []
        Nothing
        Api.Data.jsonSuccessDecoder
