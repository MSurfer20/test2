// tslint:disable
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


import { HttpMethods, QueryConfig, ResponseBody, ResponseText } from 'redux-query';
import * as runtime from '../runtime';
import {
    InlineResponse200,
    InlineResponse200FromJSON,
    InlineResponse200ToJSON,
} from '../models';


/**
 * Outgoing webhooks allows to build or set up Zulip integrations which are notified when certain types of messages are sent in Zulip. 
 * Outgoing webhooks
 */
function zulipOutgoingWebhooksRaw<T>( requestConfig: runtime.TypedQueryConfig<T, InlineResponse200> = {}): QueryConfig<T> {
    let queryParameters = null;


    const headerParameters : runtime.HttpHeaders = {};


    const { meta = {} } = requestConfig;

    const config: QueryConfig<T> = {
        url: `${runtime.Configuration.basePath}/zulip-outgoing-webhook`,
        meta,
        update: requestConfig.update,
        queryKey: requestConfig.queryKey,
        optimisticUpdate: requestConfig.optimisticUpdate,
        force: requestConfig.force,
        rollback: requestConfig.rollback,
        options: {
            method: 'POST',
            headers: headerParameters,
        },
        body: queryParameters,
    };

    const { transform: requestTransform } = requestConfig;
    if (requestTransform) {
        config.transform = (body: ResponseBody, text: ResponseBody) => requestTransform(InlineResponse200FromJSON(body), text);
    }

    return config;
}

/**
* Outgoing webhooks allows to build or set up Zulip integrations which are notified when certain types of messages are sent in Zulip. 
* Outgoing webhooks
*/
export function zulipOutgoingWebhooks<T>( requestConfig?: runtime.TypedQueryConfig<T, InlineResponse200>): QueryConfig<T> {
    return zulipOutgoingWebhooksRaw( requestConfig);
}
