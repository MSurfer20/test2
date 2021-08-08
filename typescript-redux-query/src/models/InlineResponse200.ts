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

import { exists, mapValues } from '../runtime';
import {
    MessagesBase,
    MessagesBaseFromJSON,
    MessagesBaseToJSON,
} from './';

/**
 * This is an example of the JSON payload that the Zulip server will `POST` to your server 
 * @export
 * @interface InlineResponse200
 */
export interface InlineResponse200  {
    /**
     * Email of the bot user. 
     * @type {string}
     * @memberof InlineResponse200
     */
    botEmail?: string;
    /**
     * The full name of the bot user. 
     * @type {string}
     * @memberof InlineResponse200
     */
    botFullName?: string;
    /**
     * The message content, in raw Markdown format (not rendered to HTML). 
     * @type {string}
     * @memberof InlineResponse200
     */
    data?: string;
    /**
     * What aspect of the message triggered the outgoing webhook notification. Possible values include `private_message` and `mention`. 
     * @type {string}
     * @memberof InlineResponse200
     */
    trigger?: string;
    /**
     * A string of alphanumeric characters that can be used to authenticate the webhook request (each bot user uses a fixed token). You can get the token used by a given outgoing webhook bot in the `zuliprc` file downloaded when creating the bot. 
     * @type {string}
     * @memberof InlineResponse200
     */
    token?: string;
    /**
     * A dict containing details on the message that triggered the outgoing webhook, in the format used by [`GET /messages`](/api/get-messages). 
     * @type {MessagesBase & object}
     * @memberof InlineResponse200
     */
    message?: MessagesBase & object;
}

export function InlineResponse200FromJSON(json: any): InlineResponse200 {
    return {
        'botEmail': !exists(json, 'bot_email') ? undefined : json['bot_email'],
        'botFullName': !exists(json, 'bot_full_name') ? undefined : json['bot_full_name'],
        'data': !exists(json, 'data') ? undefined : json['data'],
        'trigger': !exists(json, 'trigger') ? undefined : json['trigger'],
        'token': !exists(json, 'token') ? undefined : json['token'],
        'message': !exists(json, 'message') ? undefined : MessagesBase &amp; objectFromJSON(json['message']),
    };
}

export function InlineResponse200ToJSON(value?: InlineResponse200): any {
    if (value === undefined) {
        return undefined;
    }
    return {
        'bot_email': value.botEmail,
        'bot_full_name': value.botFullName,
        'data': value.data,
        'trigger': value.trigger,
        'token': value.token,
        'message': MessagesBase &amp; objectToJSON(value.message),
    };
}

