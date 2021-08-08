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

import { RequestFile } from './models';

export class Subscriptions {
    /**
    * The unique ID of a stream. 
    */
    'streamId'?: number;
    /**
    * The name of a stream. 
    */
    'name'?: string;
    /**
    * The short description of a stream in text/markdown format, intended to be used to prepopulate UI for editing a stream\'s description. 
    */
    'description'?: string;
    /**
    * A short description of a stream rendered as HTML, intended to be used when displaying the stream description in a UI.  One should use the standard Zulip rendered_markdown CSS when displaying this content so that emoji, LaTeX, and other syntax work correctly.  And any client-side security logic for user-generated message content should be applied when displaying this HTML as though it were the body of a Zulip message. 
    */
    'renderedDescription'?: string;
    /**
    * The UNIX timestamp for when the stream was created, in UTC seconds.  **Changes**: New in Zulip 4.0 (feature level 30). 
    */
    'dateCreated'?: number;
    /**
    * Specifies whether the stream is private or not. Only people who have been invited can access a private stream. 
    */
    'inviteOnly'?: boolean;
    /**
    * A list of user IDs of users who are also subscribed to a given stream. Included only if `include_subscribers` is `true`. 
    */
    'subscribers'?: Array<number>;
    /**
    * A boolean specifying whether desktop notifications are enabled for the given stream.  A null value means the value of this setting should be inherited from the user-level default setting, enable_stream_desktop_notifications, for this stream. 
    */
    'desktopNotifications'?: boolean | null;
    /**
    * A boolean specifying whether email notifications are enabled for the given stream.  A null value means the value of this setting should be inherited from the user-level default setting, enable_stream_email_notifications, for this stream. 
    */
    'emailNotifications'?: boolean | null;
    /**
    * A boolean specifying whether wildcard mentions trigger notifications as though they were personal mentions in this stream.  A null value means the value of this setting should be inherited from the user-level default setting, wildcard_mentions_notify, for this stream. 
    */
    'wildcardMentionsNotify'?: boolean | null;
    /**
    * A boolean specifying whether push notifications are enabled for the given stream.  A null value means the value of this setting should be inherited from the user-level default setting, enable_stream_push_notifications, for this stream. 
    */
    'pushNotifications'?: boolean | null;
    /**
    * A boolean specifying whether audible notifications are enabled for the given stream.  A null value means the value of this setting should be inherited from the user-level default setting, enable_stream_audible_notifications, for this stream. 
    */
    'audibleNotifications'?: boolean | null;
    /**
    * A boolean specifying whether the given stream has been pinned to the top. 
    */
    'pinToTop'?: boolean;
    /**
    * Email address of the given stream, used for [sending emails to the stream](/help/message-a-stream-by-email). 
    */
    'emailAddress'?: string;
    /**
    * Whether the user has muted the stream. Muted streams do not count towards your total unread count and do not show up in `All messages` view (previously known as `Home` view).  **Changes**: Prior to Zulip 2.1, this feature was represented by the more confusingly named `in_home_view` (with the opposite value, `in_home_view=!is_muted`). 
    */
    'isMuted'?: boolean;
    /**
    * Legacy property for if the given stream is muted, with inverted meeting.  **Deprecated**; clients should use is_muted where available. 
    */
    'inHomeView'?: boolean;
    /**
    * Whether only organization administrators can post to the stream.  **Changes**: Deprecated in Zulip 3.0 (feature level 1), use `stream_post_policy` instead. 
    */
    'isAnnouncementOnly'?: boolean;
    /**
    * Whether the stream has been configured to allow unauthenticated access to its message history from the web. 
    */
    'isWebPublic'?: boolean;
    /**
    * The user\'s role within the stream (distinct from the user\'s [organization-level role](/help/roles-and-permissions)). Valid values are:  * 20 => Stream administrator. * 50 => Subscriber.  **Changes**: New in Zulip 4.0 (feature level 31). 
    */
    'role'?: Subscriptions.RoleEnum;
    /**
    * The user\'s personal color for the stream. 
    */
    'color'?: string;
    /**
    * Policy for which users can post messages to the stream.  * 1 => Any user can post. * 2 => Only administrators can post. * 3 => Only full members can post. * 4 => Only moderators can post.  **Changes**: New in Zulip 3.0, replacing the previous `is_announcement_only` boolean. 
    */
    'streamPostPolicy'?: number;
    /**
    * Number of days that messages sent to this stream will be stored before being automatically deleted by the [message retention policy](/help/message-retention-policy).  There are two special values:  * `null`, the default, means the stream will inherit the organization   level setting. * `-1` encodes retaining messages in this stream forever.  **Changes**: New in Zulip 3.0 (feature level 17). 
    */
    'messageRetentionDays'?: number | null;
    /**
    * Whether the history of the stream is public to its subscribers.  Currently always true for public streams (i.e. invite_only=False implies history_public_to_subscribers=True), but clients should not make that assumption, as we may change that behavior in the future. 
    */
    'historyPublicToSubscribers'?: boolean;
    /**
    * The id of the first message in the stream.  Intended to help clients determine whether they need to display UI like the \"more topics\" widget that would suggest the stream has older history that can be accessed.  Null is used for streams with no message history. 
    */
    'firstMessageId'?: number | null;
    /**
    * The average number of messages sent to the stream in recent weeks, rounded to the nearest integer.  Null means the stream was recently created and there is insufficient data to estimate the average traffic. 
    */
    'streamWeeklyTraffic'?: number | null;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "streamId",
            "baseName": "stream_id",
            "type": "number"
        },
        {
            "name": "name",
            "baseName": "name",
            "type": "string"
        },
        {
            "name": "description",
            "baseName": "description",
            "type": "string"
        },
        {
            "name": "renderedDescription",
            "baseName": "rendered_description",
            "type": "string"
        },
        {
            "name": "dateCreated",
            "baseName": "date_created",
            "type": "number"
        },
        {
            "name": "inviteOnly",
            "baseName": "invite_only",
            "type": "boolean"
        },
        {
            "name": "subscribers",
            "baseName": "subscribers",
            "type": "Array<number>"
        },
        {
            "name": "desktopNotifications",
            "baseName": "desktop_notifications",
            "type": "boolean"
        },
        {
            "name": "emailNotifications",
            "baseName": "email_notifications",
            "type": "boolean"
        },
        {
            "name": "wildcardMentionsNotify",
            "baseName": "wildcard_mentions_notify",
            "type": "boolean"
        },
        {
            "name": "pushNotifications",
            "baseName": "push_notifications",
            "type": "boolean"
        },
        {
            "name": "audibleNotifications",
            "baseName": "audible_notifications",
            "type": "boolean"
        },
        {
            "name": "pinToTop",
            "baseName": "pin_to_top",
            "type": "boolean"
        },
        {
            "name": "emailAddress",
            "baseName": "email_address",
            "type": "string"
        },
        {
            "name": "isMuted",
            "baseName": "is_muted",
            "type": "boolean"
        },
        {
            "name": "inHomeView",
            "baseName": "in_home_view",
            "type": "boolean"
        },
        {
            "name": "isAnnouncementOnly",
            "baseName": "is_announcement_only",
            "type": "boolean"
        },
        {
            "name": "isWebPublic",
            "baseName": "is_web_public",
            "type": "boolean"
        },
        {
            "name": "role",
            "baseName": "role",
            "type": "Subscriptions.RoleEnum"
        },
        {
            "name": "color",
            "baseName": "color",
            "type": "string"
        },
        {
            "name": "streamPostPolicy",
            "baseName": "stream_post_policy",
            "type": "number"
        },
        {
            "name": "messageRetentionDays",
            "baseName": "message_retention_days",
            "type": "number"
        },
        {
            "name": "historyPublicToSubscribers",
            "baseName": "history_public_to_subscribers",
            "type": "boolean"
        },
        {
            "name": "firstMessageId",
            "baseName": "first_message_id",
            "type": "number"
        },
        {
            "name": "streamWeeklyTraffic",
            "baseName": "stream_weekly_traffic",
            "type": "number"
        }    ];

    static getAttributeTypeMap() {
        return Subscriptions.attributeTypeMap;
    }
}

export namespace Subscriptions {
    export enum RoleEnum {
        NUMBER_20 = <any> 20,
        NUMBER_50 = <any> 50
    }
}
