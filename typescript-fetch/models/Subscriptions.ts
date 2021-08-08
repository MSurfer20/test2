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
 * 
 * @export
 * @interface Subscriptions
 */
export interface Subscriptions {
    /**
     * The unique ID of a stream.
     * @type {number}
     * @memberof Subscriptions
     */
    streamId?: number;
    /**
     * The name of a stream.
     * @type {string}
     * @memberof Subscriptions
     */
    name?: string;
    /**
     * The short description of a stream in text/markdown format,
     * intended to be used to prepopulate UI for editing a stream's
     * description.
     * @type {string}
     * @memberof Subscriptions
     */
    description?: string;
    /**
     * A short description of a stream rendered as HTML, intended to
     * be used when displaying the stream description in a UI.
     * 
     * One should use the standard Zulip rendered_markdown CSS when
     * displaying this content so that emoji, LaTeX, and other syntax
     * work correctly.  And any client-side security logic for
     * user-generated message content should be applied when displaying
     * this HTML as though it were the body of a Zulip message.
     * @type {string}
     * @memberof Subscriptions
     */
    renderedDescription?: string;
    /**
     * The UNIX timestamp for when the stream was created, in UTC seconds.
     * 
     * **Changes**: New in Zulip 4.0 (feature level 30).
     * @type {number}
     * @memberof Subscriptions
     */
    dateCreated?: number;
    /**
     * Specifies whether the stream is private or not.
     * Only people who have been invited can access a private stream.
     * @type {boolean}
     * @memberof Subscriptions
     */
    inviteOnly?: boolean;
    /**
     * A list of user IDs of users who are also subscribed
     * to a given stream. Included only if `include_subscribers` is `true`.
     * @type {Array<number>}
     * @memberof Subscriptions
     */
    subscribers?: Array<number>;
    /**
     * A boolean specifying whether desktop notifications
     * are enabled for the given stream.
     * 
     * A null value means the value of this setting
     * should be inherited from the user-level default
     * setting, enable_stream_desktop_notifications, for
     * this stream.
     * @type {boolean}
     * @memberof Subscriptions
     */
    desktopNotifications?: boolean | null;
    /**
     * A boolean specifying whether email notifications
     * are enabled for the given stream.
     * 
     * A null value means the value of this setting
     * should be inherited from the user-level default
     * setting, enable_stream_email_notifications, for
     * this stream.
     * @type {boolean}
     * @memberof Subscriptions
     */
    emailNotifications?: boolean | null;
    /**
     * A boolean specifying whether wildcard mentions
     * trigger notifications as though they were personal
     * mentions in this stream.
     * 
     * A null value means the value of this setting
     * should be inherited from the user-level default
     * setting, wildcard_mentions_notify, for
     * this stream.
     * @type {boolean}
     * @memberof Subscriptions
     */
    wildcardMentionsNotify?: boolean | null;
    /**
     * A boolean specifying whether push notifications
     * are enabled for the given stream.
     * 
     * A null value means the value of this setting
     * should be inherited from the user-level default
     * setting, enable_stream_push_notifications, for
     * this stream.
     * @type {boolean}
     * @memberof Subscriptions
     */
    pushNotifications?: boolean | null;
    /**
     * A boolean specifying whether audible notifications
     * are enabled for the given stream.
     * 
     * A null value means the value of this setting
     * should be inherited from the user-level default
     * setting, enable_stream_audible_notifications, for
     * this stream.
     * @type {boolean}
     * @memberof Subscriptions
     */
    audibleNotifications?: boolean | null;
    /**
     * A boolean specifying whether the given stream has been pinned
     * to the top.
     * @type {boolean}
     * @memberof Subscriptions
     */
    pinToTop?: boolean;
    /**
     * Email address of the given stream, used for
     * [sending emails to the stream](/help/message-a-stream-by-email).
     * @type {string}
     * @memberof Subscriptions
     */
    emailAddress?: string;
    /**
     * Whether the user has muted the stream. Muted streams do
     * not count towards your total unread count and do not show up in
     * `All messages` view (previously known as `Home` view).
     * 
     * **Changes**: Prior to Zulip 2.1, this feature was
     * represented by the more confusingly named `in_home_view` (with the
     * opposite value, `in_home_view=!is_muted`).
     * @type {boolean}
     * @memberof Subscriptions
     */
    isMuted?: boolean;
    /**
     * Legacy property for if the given stream is muted, with inverted meeting.
     * 
     * **Deprecated**; clients should use is_muted where available.
     * @type {boolean}
     * @memberof Subscriptions
     */
    inHomeView?: boolean;
    /**
     * Whether only organization administrators can post to the stream.
     * 
     * **Changes**: Deprecated in Zulip 3.0 (feature level 1), use
     * `stream_post_policy` instead.
     * @type {boolean}
     * @memberof Subscriptions
     */
    isAnnouncementOnly?: boolean;
    /**
     * Whether the stream has been configured to allow unauthenticated
     * access to its message history from the web.
     * @type {boolean}
     * @memberof Subscriptions
     */
    isWebPublic?: boolean;
    /**
     * The user's role within the stream (distinct from the user's
     * [organization-level role](/help/roles-and-permissions)).
     * Valid values are:
     * 
     * * 20 => Stream administrator.
     * * 50 => Subscriber.
     * 
     * **Changes**: New in Zulip 4.0 (feature level 31).
     * @type {number}
     * @memberof Subscriptions
     */
    role?: SubscriptionsRoleEnum;
    /**
     * The user's personal color for the stream.
     * @type {string}
     * @memberof Subscriptions
     */
    color?: string;
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
     * @memberof Subscriptions
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
     * @memberof Subscriptions
     */
    messageRetentionDays?: number | null;
    /**
     * Whether the history of the stream is public to its subscribers.
     * 
     * Currently always true for public streams (i.e. invite_only=False implies
     * history_public_to_subscribers=True), but clients should not make that
     * assumption, as we may change that behavior in the future.
     * @type {boolean}
     * @memberof Subscriptions
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
     * @memberof Subscriptions
     */
    firstMessageId?: number | null;
    /**
     * The average number of messages sent to the stream in recent weeks,
     * rounded to the nearest integer.
     * 
     * Null means the stream was recently created and there is
     * insufficient data to estimate the average traffic.
     * @type {number}
     * @memberof Subscriptions
     */
    streamWeeklyTraffic?: number | null;
}

/**
* @export
* @enum {string}
*/
export enum SubscriptionsRoleEnum {
    NUMBER_20 = 20,
    NUMBER_50 = 50
}

export function SubscriptionsFromJSON(json: any): Subscriptions {
    return SubscriptionsFromJSONTyped(json, false);
}

export function SubscriptionsFromJSONTyped(json: any, ignoreDiscriminator: boolean): Subscriptions {
    if ((json === undefined) || (json === null)) {
        return json;
    }
    return {
        
        'streamId': !exists(json, 'stream_id') ? undefined : json['stream_id'],
        'name': !exists(json, 'name') ? undefined : json['name'],
        'description': !exists(json, 'description') ? undefined : json['description'],
        'renderedDescription': !exists(json, 'rendered_description') ? undefined : json['rendered_description'],
        'dateCreated': !exists(json, 'date_created') ? undefined : json['date_created'],
        'inviteOnly': !exists(json, 'invite_only') ? undefined : json['invite_only'],
        'subscribers': !exists(json, 'subscribers') ? undefined : json['subscribers'],
        'desktopNotifications': !exists(json, 'desktop_notifications') ? undefined : json['desktop_notifications'],
        'emailNotifications': !exists(json, 'email_notifications') ? undefined : json['email_notifications'],
        'wildcardMentionsNotify': !exists(json, 'wildcard_mentions_notify') ? undefined : json['wildcard_mentions_notify'],
        'pushNotifications': !exists(json, 'push_notifications') ? undefined : json['push_notifications'],
        'audibleNotifications': !exists(json, 'audible_notifications') ? undefined : json['audible_notifications'],
        'pinToTop': !exists(json, 'pin_to_top') ? undefined : json['pin_to_top'],
        'emailAddress': !exists(json, 'email_address') ? undefined : json['email_address'],
        'isMuted': !exists(json, 'is_muted') ? undefined : json['is_muted'],
        'inHomeView': !exists(json, 'in_home_view') ? undefined : json['in_home_view'],
        'isAnnouncementOnly': !exists(json, 'is_announcement_only') ? undefined : json['is_announcement_only'],
        'isWebPublic': !exists(json, 'is_web_public') ? undefined : json['is_web_public'],
        'role': !exists(json, 'role') ? undefined : json['role'],
        'color': !exists(json, 'color') ? undefined : json['color'],
        'streamPostPolicy': !exists(json, 'stream_post_policy') ? undefined : json['stream_post_policy'],
        'messageRetentionDays': !exists(json, 'message_retention_days') ? undefined : json['message_retention_days'],
        'historyPublicToSubscribers': !exists(json, 'history_public_to_subscribers') ? undefined : json['history_public_to_subscribers'],
        'firstMessageId': !exists(json, 'first_message_id') ? undefined : json['first_message_id'],
        'streamWeeklyTraffic': !exists(json, 'stream_weekly_traffic') ? undefined : json['stream_weekly_traffic'],
    };
}

export function SubscriptionsToJSON(value?: Subscriptions | null): any {
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
        'rendered_description': value.renderedDescription,
        'date_created': value.dateCreated,
        'invite_only': value.inviteOnly,
        'subscribers': value.subscribers,
        'desktop_notifications': value.desktopNotifications,
        'email_notifications': value.emailNotifications,
        'wildcard_mentions_notify': value.wildcardMentionsNotify,
        'push_notifications': value.pushNotifications,
        'audible_notifications': value.audibleNotifications,
        'pin_to_top': value.pinToTop,
        'email_address': value.emailAddress,
        'is_muted': value.isMuted,
        'in_home_view': value.inHomeView,
        'is_announcement_only': value.isAnnouncementOnly,
        'is_web_public': value.isWebPublic,
        'role': value.role,
        'color': value.color,
        'stream_post_policy': value.streamPostPolicy,
        'message_retention_days': value.messageRetentionDays,
        'history_public_to_subscribers': value.historyPublicToSubscribers,
        'first_message_id': value.firstMessageId,
        'stream_weekly_traffic': value.streamWeeklyTraffic,
    };
}


