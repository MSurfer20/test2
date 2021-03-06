/* tslint:disable */
/* eslint-disable */
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
/**
 * Object containing basic details about the stream.
 * @export
 * @interface BasicStreamBase
 */
export interface BasicStreamBase {
    /**
     * The unique ID of the stream.
     * @type {number}
     * @memberof BasicStreamBase
     */
    streamId?: number;
    /**
     * The name of the stream.
     * @type {string}
     * @memberof BasicStreamBase
     */
    name?: string;
    /**
     * The short description of the stream in text/markdown format,
     * intended to be used to prepopulate UI for editing a stream's
     * description.
     * @type {string}
     * @memberof BasicStreamBase
     */
    description?: string;
    /**
     * The UNIX timestamp for when the stream was created, in UTC seconds.
     * 
     * **Changes**: New in Zulip 4.0 (feature level 30).
     * @type {number}
     * @memberof BasicStreamBase
     */
    dateCreated?: number;
    /**
     * Specifies whether the stream is private or not.
     * Only people who have been invited can access a private stream.
     * @type {boolean}
     * @memberof BasicStreamBase
     */
    inviteOnly?: boolean;
    /**
     * The short description of the stream rendered as HTML, intended to
     * be used when displaying the stream description in a UI.
     * 
     * One should use the standard Zulip rendered_markdown CSS when
     * displaying this content so that emoji, LaTeX, and other syntax
     * work correctly.  And any client-side security logic for
     * user-generated message content should be applied when displaying
     * this HTML as though it were the body of a Zulip message.
     * @type {string}
     * @memberof BasicStreamBase
     */
    renderedDescription?: string;
    /**
     * Whether the stream has been configured to allow unauthenticated
     * access to its message history from the web.
     * @type {boolean}
     * @memberof BasicStreamBase
     */
    isWebPublic?: boolean;
    /**
     * Policy for which users can post messages to the stream.
     * 
     * * 1 => Any user can post.
     * * 2 => Only administrators can post.
     * * 3 => Only full members can post.
     * * 4 => Only moderators can post.
     * 
     * **Changes**: New in Zulip 3.0, replacing the previous
     * `is_announcement_only` boolean.
     * @type {number}
     * @memberof BasicStreamBase
     */
    streamPostPolicy?: number;
    /**
     * Number of days that messages sent to this stream will be stored
     * before being automatically deleted by the [message retention
     * policy](/help/message-retention-policy).  There are two special values:
     * 
     * * `null`, the default, means the stream will inherit the organization
     *   level setting.
     * * `-1` encodes retaining messages in this stream forever.
     * 
     * **Changes**: New in Zulip 3.0 (feature level 17).
     * @type {number}
     * @memberof BasicStreamBase
     */
    messageRetentionDays?: number | null;
    /**
     * Whether the history of the stream is public to its subscribers.
     * 
     * Currently always true for public streams (i.e. invite_only=False implies
     * history_public_to_subscribers=True), but clients should not make that
     * assumption, as we may change that behavior in the future.
     * @type {boolean}
     * @memberof BasicStreamBase
     */
    historyPublicToSubscribers?: boolean;
    /**
     * The id of the first message in the stream.
     * 
     * Intended to help clients determine whether they need to display
     * UI like the "more topics" widget that would suggest the stream
     * has older history that can be accessed.
     * 
     * Null is used for streams with no message history.
     * @type {number}
     * @memberof BasicStreamBase
     */
    firstMessageId?: number | null;
    /**
     * Whether the given stream is announcement only or not.
     * 
     * **Changes**: Deprecated in Zulip 3.0 (feature level 1), use
     * `stream_post_policy` instead.
     * @type {boolean}
     * @memberof BasicStreamBase
     */
    isAnnouncementOnly?: boolean;
}

export function BasicStreamBaseFromJSON(json: any): BasicStreamBase {
    return BasicStreamBaseFromJSONTyped(json, false);
}

export function BasicStreamBaseFromJSONTyped(json: any, ignoreDiscriminator: boolean): BasicStreamBase {
    if ((json === undefined) || (json === null)) {
        return json;
    }
    return {
        
        'streamId': !exists(json, 'stream_id') ? undefined : json['stream_id'],
        'name': !exists(json, 'name') ? undefined : json['name'],
        'description': !exists(json, 'description') ? undefined : json['description'],
        'dateCreated': !exists(json, 'date_created') ? undefined : json['date_created'],
        'inviteOnly': !exists(json, 'invite_only') ? undefined : json['invite_only'],
        'renderedDescription': !exists(json, 'rendered_description') ? undefined : json['rendered_description'],
        'isWebPublic': !exists(json, 'is_web_public') ? undefined : json['is_web_public'],
        'streamPostPolicy': !exists(json, 'stream_post_policy') ? undefined : json['stream_post_policy'],
        'messageRetentionDays': !exists(json, 'message_retention_days') ? undefined : json['message_retention_days'],
        'historyPublicToSubscribers': !exists(json, 'history_public_to_subscribers') ? undefined : json['history_public_to_subscribers'],
        'firstMessageId': !exists(json, 'first_message_id') ? undefined : json['first_message_id'],
        'isAnnouncementOnly': !exists(json, 'is_announcement_only') ? undefined : json['is_announcement_only'],
    };
}

export function BasicStreamBaseToJSON(value?: BasicStreamBase | null): any {
    if (value === undefined) {
        return undefined;
    }
    if (value === null) {
        return null;
    }
    return {
        
        'stream_id': value.streamId,
        'name': value.name,
        'description': value.description,
        'date_created': value.dateCreated,
        'invite_only': value.inviteOnly,
        'rendered_description': value.renderedDescription,
        'is_web_public': value.isWebPublic,
        'stream_post_policy': value.streamPostPolicy,
        'message_retention_days': value.messageRetentionDays,
        'history_public_to_subscribers': value.historyPublicToSubscribers,
        'first_message_id': value.firstMessageId,
        'is_announcement_only': value.isAnnouncementOnly,
    };
}


