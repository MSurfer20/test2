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

import {
    BasicBotBase,
    BasicBotBaseFromJSON,
    BasicBotBaseToJSON,
    BotAllOf,
    BotAllOfFromJSON,
    BotAllOfToJSON,
} from './';

/**
 * @type Bot
 * @export
 */
export interface Bot extends BasicBotBase, BotAllOf {
}

export function BotFromJSON(json: any): Bot {
    return {
        ...BasicBotBaseFromJSON(json),
        ...BotAllOfFromJSON(json),
    };
}

export function BotToJSON(value?: Bot): any {
    if (value === undefined) {
        return undefined;
    }
    return {
        ...BasicBotBaseToJSON(value),
        ...BotAllOfToJSON(value),
    };
}