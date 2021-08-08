/**
 * Zulip REST API
 * Powerful open source group chat 
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

import { autoinject } from 'aurelia-framework';
import { HttpClient } from 'aurelia-http-client';
import { Api } from './Api';
import { AuthStorage } from './AuthStorage';
import {
  InlineResponse200,
} from './models';

/**
 * zulipOutgoingWebhooks - parameters interface
 */
export interface IZulipOutgoingWebhooksParams {
}

/**
 * WebhooksApi - API class
 */
@autoinject()
export class WebhooksApi extends Api {

  /**
   * Creates a new WebhooksApi class.
   *
   * @param httpClient The Aurelia HTTP client to be injected.
   * @param authStorage A storage for authentication data.
   */
  constructor(httpClient: HttpClient, authStorage: AuthStorage) {
    super(httpClient, authStorage);
  }

  /**
   * Outgoing webhooks
   * Outgoing webhooks allows to build or set up Zulip integrations which are notified when certain types of messages are sent in Zulip. 
   */
  async zulipOutgoingWebhooks(): Promise<InlineResponse200> {
    // Verify required parameters are set

    // Create URL to call
    const url = `${this.basePath}/zulip-outgoing-webhook`;

    const response = await this.httpClient.createRequest(url)
      // Set HTTP method
      .asPost()

      // Send the request
      .send();

    if (response.statusCode < 200 || response.statusCode >= 300) {
      throw new Error(response.content);
    }

    // Extract the content
    return response.content;
  }

}
