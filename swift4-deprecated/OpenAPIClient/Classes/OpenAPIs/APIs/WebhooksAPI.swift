//
// WebhooksAPI.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation



open class WebhooksAPI {
    /**
     Outgoing webhooks
     
     - parameter completion: completion handler to receive the data and the error objects
     */
    open class func zulipOutgoingWebhooks(completion: @escaping ((_ data: InlineResponse200?,_ error: Error?) -> Void)) {
        zulipOutgoingWebhooksWithRequestBuilder().execute { (response, error) -> Void in
            completion(response?.body, error)
        }
    }

    /**
     Outgoing webhooks
     - POST /zulip-outgoing-webhook
     - Outgoing webhooks allows to build or set up Zulip integrations which are notified when certain types of messages are sent in Zulip. 
     - returns: RequestBuilder<InlineResponse200> 
     */
    open class func zulipOutgoingWebhooksWithRequestBuilder() -> RequestBuilder<InlineResponse200> {
        let path = "/zulip-outgoing-webhook"
        let URLString = OpenAPIClientAPI.basePath + path
        let parameters: [String:Any]? = nil
        
        let url = URLComponents(string: URLString)

        let requestBuilder: RequestBuilder<InlineResponse200>.Type = OpenAPIClientAPI.requestBuilderFactory.getBuilder()

        return requestBuilder.init(method: "POST", URLString: (url?.string ?? URLString), parameters: parameters, isBody: false)
    }

}
