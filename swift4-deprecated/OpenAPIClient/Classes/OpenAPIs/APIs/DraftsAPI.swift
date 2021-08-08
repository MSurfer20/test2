//
// DraftsAPI.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation



open class DraftsAPI {
    /**
     Create drafts
     
     - parameter drafts: (query) A JSON-encoded list of containing new draft objects.  (optional)
     - parameter completion: completion handler to receive the data and the error objects
     */
    open class func createDrafts(drafts: [Draft]? = nil, completion: @escaping ((_ data: JsonSuccess?,_ error: Error?) -> Void)) {
        createDraftsWithRequestBuilder(drafts: drafts).execute { (response, error) -> Void in
            completion(response?.body, error)
        }
    }

    /**
     Create drafts
     - POST /drafts
     - Create one or more drafts on the server. These drafts will be automatically synchronized to other clients via `drafts` events.  `POST {{ api_url }}/v1/drafts` 
     - parameter drafts: (query) A JSON-encoded list of containing new draft objects.  (optional)
     - returns: RequestBuilder<JsonSuccess> 
     */
    open class func createDraftsWithRequestBuilder(drafts: [Draft]? = nil) -> RequestBuilder<JsonSuccess> {
        let path = "/drafts"
        let URLString = OpenAPIClientAPI.basePath + path
        let parameters: [String:Any]? = nil
        
        var url = URLComponents(string: URLString)
        url?.queryItems = APIHelper.mapValuesToQueryItems([
            "drafts": drafts?.encodeToJSON()
        ])

        let requestBuilder: RequestBuilder<JsonSuccess>.Type = OpenAPIClientAPI.requestBuilderFactory.getBuilder()

        return requestBuilder.init(method: "POST", URLString: (url?.string ?? URLString), parameters: parameters, isBody: false)
    }

    /**
     Delete a draft
     
     - parameter draftId: (path) The ID of the draft you want to delete.  
     - parameter completion: completion handler to receive the data and the error objects
     */
    open class func deleteDraft(draftId: Int, completion: @escaping ((_ data: JsonSuccess?,_ error: Error?) -> Void)) {
        deleteDraftWithRequestBuilder(draftId: draftId).execute { (response, error) -> Void in
            completion(response?.body, error)
        }
    }

    /**
     Delete a draft
     - DELETE /drafts/{draft_id}
     - Delete a single draft from the server. The deletion will be automatically synchronized to other clients via a `drafts` event.  `DELETE {{ api_url }}/v1/drafts/{draft_id}` 
     - parameter draftId: (path) The ID of the draft you want to delete.  
     - returns: RequestBuilder<JsonSuccess> 
     */
    open class func deleteDraftWithRequestBuilder(draftId: Int) -> RequestBuilder<JsonSuccess> {
        var path = "/drafts/{draft_id}"
        let draftIdPreEscape = "\(APIHelper.mapValueToPathItem(draftId))"
        let draftIdPostEscape = draftIdPreEscape.addingPercentEncoding(withAllowedCharacters: .urlPathAllowed) ?? ""
        path = path.replacingOccurrences(of: "{draft_id}", with: draftIdPostEscape, options: .literal, range: nil)
        let URLString = OpenAPIClientAPI.basePath + path
        let parameters: [String:Any]? = nil
        
        let url = URLComponents(string: URLString)

        let requestBuilder: RequestBuilder<JsonSuccess>.Type = OpenAPIClientAPI.requestBuilderFactory.getBuilder()

        return requestBuilder.init(method: "DELETE", URLString: (url?.string ?? URLString), parameters: parameters, isBody: false)
    }

    /**
     Edit a draft
     
     - parameter draftId: (path) The ID of the draft to be edited.  
     - parameter draft: (query) A JSON-encoded object containing a replacement draft object for this ID.  
     - parameter completion: completion handler to receive the data and the error objects
     */
    open class func editDraft(draftId: Int, draft: Draft, completion: @escaping ((_ data: JsonSuccess?,_ error: Error?) -> Void)) {
        editDraftWithRequestBuilder(draftId: draftId, draft: draft).execute { (response, error) -> Void in
            completion(response?.body, error)
        }
    }

    /**
     Edit a draft
     - PATCH /drafts/{draft_id}
     - Edit a draft on the server. The edit will be automatically synchronized to other clients via `drafts` events.  `PATCH {{ api_url }}/v1/drafts/{draft_id}` 
     - parameter draftId: (path) The ID of the draft to be edited.  
     - parameter draft: (query) A JSON-encoded object containing a replacement draft object for this ID.  
     - returns: RequestBuilder<JsonSuccess> 
     */
    open class func editDraftWithRequestBuilder(draftId: Int, draft: Draft) -> RequestBuilder<JsonSuccess> {
        var path = "/drafts/{draft_id}"
        let draftIdPreEscape = "\(APIHelper.mapValueToPathItem(draftId))"
        let draftIdPostEscape = draftIdPreEscape.addingPercentEncoding(withAllowedCharacters: .urlPathAllowed) ?? ""
        path = path.replacingOccurrences(of: "{draft_id}", with: draftIdPostEscape, options: .literal, range: nil)
        let URLString = OpenAPIClientAPI.basePath + path
        let parameters: [String:Any]? = nil
        
        var url = URLComponents(string: URLString)
        url?.queryItems = APIHelper.mapValuesToQueryItems([
            "draft": draft.encodeToJSON()
        ])

        let requestBuilder: RequestBuilder<JsonSuccess>.Type = OpenAPIClientAPI.requestBuilderFactory.getBuilder()

        return requestBuilder.init(method: "PATCH", URLString: (url?.string ?? URLString), parameters: parameters, isBody: false)
    }

    /**
     Get drafts
     
     - parameter completion: completion handler to receive the data and the error objects
     */
    open class func getDrafts(completion: @escaping ((_ data: JsonSuccess?,_ error: Error?) -> Void)) {
        getDraftsWithRequestBuilder().execute { (response, error) -> Void in
            completion(response?.body, error)
        }
    }

    /**
     Get drafts
     - GET /drafts
     - Fetch all drafts for the current user.  `GET {{ api_url }}/v1/drafts` 
     - returns: RequestBuilder<JsonSuccess> 
     */
    open class func getDraftsWithRequestBuilder() -> RequestBuilder<JsonSuccess> {
        let path = "/drafts"
        let URLString = OpenAPIClientAPI.basePath + path
        let parameters: [String:Any]? = nil
        
        let url = URLComponents(string: URLString)

        let requestBuilder: RequestBuilder<JsonSuccess>.Type = OpenAPIClientAPI.requestBuilderFactory.getBuilder()

        return requestBuilder.init(method: "GET", URLString: (url?.string ?? URLString), parameters: parameters, isBody: false)
    }

}