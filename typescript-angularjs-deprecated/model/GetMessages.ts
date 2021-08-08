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

import * as models from './models';

export interface GetMessages {
    "avatar_url"?: any;
    "client"?: any;
    "content"?: any;
    "content_type"?: any;
    "display_recipient"?: any;
    "id"?: any;
    "is_me_message"?: any;
    "reactions"?: any;
    "recipient_id"?: any;
    "sender_email"?: any;
    "sender_full_name"?: any;
    "sender_id"?: any;
    "sender_realm_str"?: any;
    "stream_id"?: any;
    "subject"?: any;
    "topic_links"?: any;
    "submessages"?: any;
    "timestamp"?: any;
    "type"?: any;
    /**
     * The user\'s [message flags][message-flags] for the message.  [message-flags]: /api/update-message-flags#available-flags 
     */
    "flags"?: Array<string>;
    /**
     * The UNIX timestamp for when the message was last edited, in UTC seconds. 
     */
    "last_edit_timestamp"?: number;
    /**
     * Only present if keyword search was included among the narrow parameters. HTML content of a queried message that matches the narrow, with `<span class=\"highlight\">` elements wrapping the matches for the search keywords. 
     */
    "match_content"?: string;
    /**
     * Only present if keyword search was included among the narrow parameters. HTML-escaped topic of a queried message that matches the narrow, with `<span class=\"highlight\">` elements wrapping the matches for the search keywords. 
     */
    "match_subject"?: string;
}

