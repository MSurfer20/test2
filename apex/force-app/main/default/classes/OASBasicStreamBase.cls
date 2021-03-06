/*
 * Zulip REST API
 * Powerful open source group chat\n
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the OAS code generator program.
 * https://github.com/OpenAPITools/openapi-generator
 * Do not edit the class manually.
 */

/**
 * Object containing basic details about the stream.\n
 */
public class OASBasicStreamBase implements OAS.MappedProperties {
    /**
     * The unique ID of the stream.\n
     * @return streamId
     */
    public Integer streamId { get; set; }

    /**
     * The name of the stream.\n
     * @return name
     */
    public String name { get; set; }

    /**
     * The short description of the stream in text/markdown format,\nintended to be used to prepopulate UI for editing a stream\'s\ndescription.\n
     * @return description
     */
    public String description { get; set; }

    /**
     * The UNIX timestamp for when the stream was created, in UTC seconds.\n\n**Changes**: New in Zulip 4.0 (feature level 30).\n
     * @return dateCreated
     */
    public Integer dateCreated { get; set; }

    /**
     * Specifies whether the stream is private or not.\nOnly people who have been invited can access a private stream.\n
     * @return inviteOnly
     */
    public Boolean inviteOnly { get; set; }

    /**
     * The short description of the stream rendered as HTML, intended to\nbe used when displaying the stream description in a UI.\n\nOne should use the standard Zulip rendered_markdown CSS when\ndisplaying this content so that emoji, LaTeX, and other syntax\nwork correctly.  And any client-side security logic for\nuser-generated message content should be applied when displaying\nthis HTML as though it were the body of a Zulip message.\n
     * @return renderedDescription
     */
    public String renderedDescription { get; set; }

    /**
     * Whether the stream has been configured to allow unauthenticated\naccess to its message history from the web.\n
     * @return isWebPublic
     */
    public Boolean isWebPublic { get; set; }

    /**
     * Policy for which users can post messages to the stream.\n\n* 1 => Any user can post.\n* 2 => Only administrators can post.\n* 3 => Only full members can post.\n* 4 => Only moderators can post.\n\n**Changes**: New in Zulip 3.0, replacing the previous\n`is_announcement_only` boolean.\n
     * @return streamPostPolicy
     */
    public Integer streamPostPolicy { get; set; }

    /**
     * Number of days that messages sent to this stream will be stored\nbefore being automatically deleted by the [message retention\npolicy](/help/message-retention-policy).  There are two special values:\n\n* `null`, the default, means the stream will inherit the organization\n  level setting.\n* `-1` encodes retaining messages in this stream forever.\n\n**Changes**: New in Zulip 3.0 (feature level 17).\n
     * @return messageRetentionDays
     */
    public Integer messageRetentionDays { get; set; }

    /**
     * Whether the history of the stream is public to its subscribers.\n\nCurrently always true for public streams (i.e. invite_only=False implies\nhistory_public_to_subscribers=True), but clients should not make that\nassumption, as we may change that behavior in the future.\n
     * @return historyPublicToSubscribers
     */
    public Boolean historyPublicToSubscribers { get; set; }

    /**
     * The id of the first message in the stream.\n\nIntended to help clients determine whether they need to display\nUI like the "more topics" widget that would suggest the stream\nhas older history that can be accessed.\n\nNull is used for streams with no message history.\n
     * @return firstMessageId
     */
    public Integer firstMessageId { get; set; }

    /**
     * Whether the given stream is announcement only or not.\n\n**Changes**: Deprecated in Zulip 3.0 (feature level 1), use\n`stream_post_policy` instead.\n
     * @return isAnnouncementOnly
     */
    public Boolean isAnnouncementOnly { get; set; }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'stream_id' => 'streamId',
        'date_created' => 'dateCreated',
        'invite_only' => 'inviteOnly',
        'rendered_description' => 'renderedDescription',
        'is_web_public' => 'isWebPublic',
        'stream_post_policy' => 'streamPostPolicy',
        'message_retention_days' => 'messageRetentionDays',
        'history_public_to_subscribers' => 'historyPublicToSubscribers',
        'first_message_id' => 'firstMessageId',
        'is_announcement_only' => 'isAnnouncementOnly'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'stream_id' => 'streamId',
        'date_created' => 'dateCreated',
        'invite_only' => 'inviteOnly',
        'rendered_description' => 'renderedDescription',
        'is_web_public' => 'isWebPublic',
        'stream_post_policy' => 'streamPostPolicy',
        'message_retention_days' => 'messageRetentionDays',
        'history_public_to_subscribers' => 'historyPublicToSubscribers',
        'first_message_id' => 'firstMessageId',
        'is_announcement_only' => 'isAnnouncementOnly'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'stream_id' => 'streamId',
        'date_created' => 'dateCreated',
        'invite_only' => 'inviteOnly',
        'rendered_description' => 'renderedDescription',
        'is_web_public' => 'isWebPublic',
        'stream_post_policy' => 'streamPostPolicy',
        'message_retention_days' => 'messageRetentionDays',
        'history_public_to_subscribers' => 'historyPublicToSubscribers',
        'first_message_id' => 'firstMessageId',
        'is_announcement_only' => 'isAnnouncementOnly'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'stream_id' => 'streamId',
        'date_created' => 'dateCreated',
        'invite_only' => 'inviteOnly',
        'rendered_description' => 'renderedDescription',
        'is_web_public' => 'isWebPublic',
        'stream_post_policy' => 'streamPostPolicy',
        'message_retention_days' => 'messageRetentionDays',
        'history_public_to_subscribers' => 'historyPublicToSubscribers',
        'first_message_id' => 'firstMessageId',
        'is_announcement_only' => 'isAnnouncementOnly'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'stream_id' => 'streamId',
        'date_created' => 'dateCreated',
        'invite_only' => 'inviteOnly',
        'rendered_description' => 'renderedDescription',
        'is_web_public' => 'isWebPublic',
        'stream_post_policy' => 'streamPostPolicy',
        'message_retention_days' => 'messageRetentionDays',
        'history_public_to_subscribers' => 'historyPublicToSubscribers',
        'first_message_id' => 'firstMessageId',
        'is_announcement_only' => 'isAnnouncementOnly'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'stream_id' => 'streamId',
        'date_created' => 'dateCreated',
        'invite_only' => 'inviteOnly',
        'rendered_description' => 'renderedDescription',
        'is_web_public' => 'isWebPublic',
        'stream_post_policy' => 'streamPostPolicy',
        'message_retention_days' => 'messageRetentionDays',
        'history_public_to_subscribers' => 'historyPublicToSubscribers',
        'first_message_id' => 'firstMessageId',
        'is_announcement_only' => 'isAnnouncementOnly'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'stream_id' => 'streamId',
        'date_created' => 'dateCreated',
        'invite_only' => 'inviteOnly',
        'rendered_description' => 'renderedDescription',
        'is_web_public' => 'isWebPublic',
        'stream_post_policy' => 'streamPostPolicy',
        'message_retention_days' => 'messageRetentionDays',
        'history_public_to_subscribers' => 'historyPublicToSubscribers',
        'first_message_id' => 'firstMessageId',
        'is_announcement_only' => 'isAnnouncementOnly'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'stream_id' => 'streamId',
        'date_created' => 'dateCreated',
        'invite_only' => 'inviteOnly',
        'rendered_description' => 'renderedDescription',
        'is_web_public' => 'isWebPublic',
        'stream_post_policy' => 'streamPostPolicy',
        'message_retention_days' => 'messageRetentionDays',
        'history_public_to_subscribers' => 'historyPublicToSubscribers',
        'first_message_id' => 'firstMessageId',
        'is_announcement_only' => 'isAnnouncementOnly'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'stream_id' => 'streamId',
        'date_created' => 'dateCreated',
        'invite_only' => 'inviteOnly',
        'rendered_description' => 'renderedDescription',
        'is_web_public' => 'isWebPublic',
        'stream_post_policy' => 'streamPostPolicy',
        'message_retention_days' => 'messageRetentionDays',
        'history_public_to_subscribers' => 'historyPublicToSubscribers',
        'first_message_id' => 'firstMessageId',
        'is_announcement_only' => 'isAnnouncementOnly'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'stream_id' => 'streamId',
        'date_created' => 'dateCreated',
        'invite_only' => 'inviteOnly',
        'rendered_description' => 'renderedDescription',
        'is_web_public' => 'isWebPublic',
        'stream_post_policy' => 'streamPostPolicy',
        'message_retention_days' => 'messageRetentionDays',
        'history_public_to_subscribers' => 'historyPublicToSubscribers',
        'first_message_id' => 'firstMessageId',
        'is_announcement_only' => 'isAnnouncementOnly'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    public static OASBasicStreamBase getExample() {
        OASBasicStreamBase basicStreamBase = new OASBasicStreamBase();
          basicStreamBase.streamId = 0;
          basicStreamBase.name = '';
          basicStreamBase.description = '';
          basicStreamBase.dateCreated = 0;
          basicStreamBase.inviteOnly = true;
          basicStreamBase.renderedDescription = '';
          basicStreamBase.isWebPublic = true;
          basicStreamBase.streamPostPolicy = 0;
          basicStreamBase.messageRetentionDays = 0;
          basicStreamBase.historyPublicToSubscribers = true;
          basicStreamBase.firstMessageId = 0;
          basicStreamBase.isAnnouncementOnly = true;
        return basicStreamBase;
    }

    public Boolean equals(Object obj) {
        if (obj instanceof OASBasicStreamBase) {           
            OASBasicStreamBase basicStreamBase = (OASBasicStreamBase) obj;
            return this.streamId == basicStreamBase.streamId
                && this.name == basicStreamBase.name
                && this.description == basicStreamBase.description
                && this.dateCreated == basicStreamBase.dateCreated
                && this.inviteOnly == basicStreamBase.inviteOnly
                && this.renderedDescription == basicStreamBase.renderedDescription
                && this.isWebPublic == basicStreamBase.isWebPublic
                && this.streamPostPolicy == basicStreamBase.streamPostPolicy
                && this.messageRetentionDays == basicStreamBase.messageRetentionDays
                && this.historyPublicToSubscribers == basicStreamBase.historyPublicToSubscribers
                && this.firstMessageId == basicStreamBase.firstMessageId
                && this.isAnnouncementOnly == basicStreamBase.isAnnouncementOnly;
        }
        return false;
    }

    public Integer hashCode() {
        Integer hashCode = 43;
        hashCode = (17 * hashCode) + (streamId == null ? 0 : System.hashCode(streamId));
        hashCode = (17 * hashCode) + (name == null ? 0 : System.hashCode(name));
        hashCode = (17 * hashCode) + (description == null ? 0 : System.hashCode(description));
        hashCode = (17 * hashCode) + (dateCreated == null ? 0 : System.hashCode(dateCreated));
        hashCode = (17 * hashCode) + (inviteOnly == null ? 0 : System.hashCode(inviteOnly));
        hashCode = (17 * hashCode) + (renderedDescription == null ? 0 : System.hashCode(renderedDescription));
        hashCode = (17 * hashCode) + (isWebPublic == null ? 0 : System.hashCode(isWebPublic));
        hashCode = (17 * hashCode) + (streamPostPolicy == null ? 0 : System.hashCode(streamPostPolicy));
        hashCode = (17 * hashCode) + (messageRetentionDays == null ? 0 : System.hashCode(messageRetentionDays));
        hashCode = (17 * hashCode) + (historyPublicToSubscribers == null ? 0 : System.hashCode(historyPublicToSubscribers));
        hashCode = (17 * hashCode) + (firstMessageId == null ? 0 : System.hashCode(firstMessageId));
        hashCode = (17 * hashCode) + (isAnnouncementOnly == null ? 0 : System.hashCode(isAnnouncementOnly));
        return hashCode;
    }
}

