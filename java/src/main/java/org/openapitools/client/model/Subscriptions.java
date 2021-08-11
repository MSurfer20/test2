/*
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


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Subscriptions
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Subscriptions {
  public static final String SERIALIZED_NAME_STREAM_ID = "stream_id";
  @SerializedName(SERIALIZED_NAME_STREAM_ID)
  private Integer streamId;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_RENDERED_DESCRIPTION = "rendered_description";
  @SerializedName(SERIALIZED_NAME_RENDERED_DESCRIPTION)
  private String renderedDescription;

  public static final String SERIALIZED_NAME_DATE_CREATED = "date_created";
  @SerializedName(SERIALIZED_NAME_DATE_CREATED)
  private Integer dateCreated;

  public static final String SERIALIZED_NAME_INVITE_ONLY = "invite_only";
  @SerializedName(SERIALIZED_NAME_INVITE_ONLY)
  private Boolean inviteOnly;

  public static final String SERIALIZED_NAME_SUBSCRIBERS = "subscribers";
  @SerializedName(SERIALIZED_NAME_SUBSCRIBERS)
  private List<Integer> subscribers = null;

  public static final String SERIALIZED_NAME_DESKTOP_NOTIFICATIONS = "desktop_notifications";
  @SerializedName(SERIALIZED_NAME_DESKTOP_NOTIFICATIONS)
  private Boolean desktopNotifications;

  public static final String SERIALIZED_NAME_EMAIL_NOTIFICATIONS = "email_notifications";
  @SerializedName(SERIALIZED_NAME_EMAIL_NOTIFICATIONS)
  private Boolean emailNotifications;

  public static final String SERIALIZED_NAME_WILDCARD_MENTIONS_NOTIFY = "wildcard_mentions_notify";
  @SerializedName(SERIALIZED_NAME_WILDCARD_MENTIONS_NOTIFY)
  private Boolean wildcardMentionsNotify;

  public static final String SERIALIZED_NAME_PUSH_NOTIFICATIONS = "push_notifications";
  @SerializedName(SERIALIZED_NAME_PUSH_NOTIFICATIONS)
  private Boolean pushNotifications;

  public static final String SERIALIZED_NAME_AUDIBLE_NOTIFICATIONS = "audible_notifications";
  @SerializedName(SERIALIZED_NAME_AUDIBLE_NOTIFICATIONS)
  private Boolean audibleNotifications;

  public static final String SERIALIZED_NAME_PIN_TO_TOP = "pin_to_top";
  @SerializedName(SERIALIZED_NAME_PIN_TO_TOP)
  private Boolean pinToTop;

  public static final String SERIALIZED_NAME_EMAIL_ADDRESS = "email_address";
  @SerializedName(SERIALIZED_NAME_EMAIL_ADDRESS)
  private String emailAddress;

  public static final String SERIALIZED_NAME_IS_MUTED = "is_muted";
  @SerializedName(SERIALIZED_NAME_IS_MUTED)
  private Boolean isMuted;

  public static final String SERIALIZED_NAME_IN_HOME_VIEW = "in_home_view";
  @SerializedName(SERIALIZED_NAME_IN_HOME_VIEW)
  private Boolean inHomeView;

  public static final String SERIALIZED_NAME_IS_ANNOUNCEMENT_ONLY = "is_announcement_only";
  @SerializedName(SERIALIZED_NAME_IS_ANNOUNCEMENT_ONLY)
  private Boolean isAnnouncementOnly;

  public static final String SERIALIZED_NAME_IS_WEB_PUBLIC = "is_web_public";
  @SerializedName(SERIALIZED_NAME_IS_WEB_PUBLIC)
  private Boolean isWebPublic;

  /**
   * The user&#39;s role within the stream (distinct from the user&#39;s [organization-level role](/help/roles-and-permissions)). Valid values are:  * 20 &#x3D;&gt; Stream administrator. * 50 &#x3D;&gt; Subscriber.  **Changes**: New in Zulip 4.0 (feature level 31). 
   */
  @JsonAdapter(RoleEnum.Adapter.class)
  public enum RoleEnum {
    NUMBER_20(20),
    
    NUMBER_50(50);

    private Integer value;

    RoleEnum(Integer value) {
      this.value = value;
    }

    public Integer getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static RoleEnum fromValue(Integer value) {
      for (RoleEnum b : RoleEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<RoleEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final RoleEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public RoleEnum read(final JsonReader jsonReader) throws IOException {
        Integer value =  jsonReader.nextInt();
        return RoleEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_ROLE = "role";
  @SerializedName(SERIALIZED_NAME_ROLE)
  private RoleEnum role;

  public static final String SERIALIZED_NAME_COLOR = "color";
  @SerializedName(SERIALIZED_NAME_COLOR)
  private String color;

  public static final String SERIALIZED_NAME_STREAM_POST_POLICY = "stream_post_policy";
  @SerializedName(SERIALIZED_NAME_STREAM_POST_POLICY)
  private Integer streamPostPolicy;

  public static final String SERIALIZED_NAME_MESSAGE_RETENTION_DAYS = "message_retention_days";
  @SerializedName(SERIALIZED_NAME_MESSAGE_RETENTION_DAYS)
  private Integer messageRetentionDays;

  public static final String SERIALIZED_NAME_HISTORY_PUBLIC_TO_SUBSCRIBERS = "history_public_to_subscribers";
  @SerializedName(SERIALIZED_NAME_HISTORY_PUBLIC_TO_SUBSCRIBERS)
  private Boolean historyPublicToSubscribers;

  public static final String SERIALIZED_NAME_FIRST_MESSAGE_ID = "first_message_id";
  @SerializedName(SERIALIZED_NAME_FIRST_MESSAGE_ID)
  private Integer firstMessageId;

  public static final String SERIALIZED_NAME_STREAM_WEEKLY_TRAFFIC = "stream_weekly_traffic";
  @SerializedName(SERIALIZED_NAME_STREAM_WEEKLY_TRAFFIC)
  private Integer streamWeeklyTraffic;


  public Subscriptions streamId(Integer streamId) {
    
    this.streamId = streamId;
    return this;
  }

   /**
   * The unique ID of a stream. 
   * @return streamId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The unique ID of a stream. ")

  public Integer getStreamId() {
    return streamId;
  }


  public void setStreamId(Integer streamId) {
    this.streamId = streamId;
  }


  public Subscriptions name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The name of a stream. 
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of a stream. ")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public Subscriptions description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * The short description of a stream in text/markdown format, intended to be used to prepopulate UI for editing a stream&#39;s description. 
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The short description of a stream in text/markdown format, intended to be used to prepopulate UI for editing a stream's description. ")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public Subscriptions renderedDescription(String renderedDescription) {
    
    this.renderedDescription = renderedDescription;
    return this;
  }

   /**
   * A short description of a stream rendered as HTML, intended to be used when displaying the stream description in a UI.  One should use the standard Zulip rendered_markdown CSS when displaying this content so that emoji, LaTeX, and other syntax work correctly.  And any client-side security logic for user-generated message content should be applied when displaying this HTML as though it were the body of a Zulip message. 
   * @return renderedDescription
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A short description of a stream rendered as HTML, intended to be used when displaying the stream description in a UI.  One should use the standard Zulip rendered_markdown CSS when displaying this content so that emoji, LaTeX, and other syntax work correctly.  And any client-side security logic for user-generated message content should be applied when displaying this HTML as though it were the body of a Zulip message. ")

  public String getRenderedDescription() {
    return renderedDescription;
  }


  public void setRenderedDescription(String renderedDescription) {
    this.renderedDescription = renderedDescription;
  }


  public Subscriptions dateCreated(Integer dateCreated) {
    
    this.dateCreated = dateCreated;
    return this;
  }

   /**
   * The UNIX timestamp for when the stream was created, in UTC seconds.  **Changes**: New in Zulip 4.0 (feature level 30). 
   * @return dateCreated
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The UNIX timestamp for when the stream was created, in UTC seconds.  **Changes**: New in Zulip 4.0 (feature level 30). ")

  public Integer getDateCreated() {
    return dateCreated;
  }


  public void setDateCreated(Integer dateCreated) {
    this.dateCreated = dateCreated;
  }


  public Subscriptions inviteOnly(Boolean inviteOnly) {
    
    this.inviteOnly = inviteOnly;
    return this;
  }

   /**
   * Specifies whether the stream is private or not. Only people who have been invited can access a private stream. 
   * @return inviteOnly
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies whether the stream is private or not. Only people who have been invited can access a private stream. ")

  public Boolean getInviteOnly() {
    return inviteOnly;
  }


  public void setInviteOnly(Boolean inviteOnly) {
    this.inviteOnly = inviteOnly;
  }


  public Subscriptions subscribers(List<Integer> subscribers) {
    
    this.subscribers = subscribers;
    return this;
  }

  public Subscriptions addSubscribersItem(Integer subscribersItem) {
    if (this.subscribers == null) {
      this.subscribers = new ArrayList<Integer>();
    }
    this.subscribers.add(subscribersItem);
    return this;
  }

   /**
   * A list of user IDs of users who are also subscribed to a given stream. Included only if &#x60;include_subscribers&#x60; is &#x60;true&#x60;. 
   * @return subscribers
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A list of user IDs of users who are also subscribed to a given stream. Included only if `include_subscribers` is `true`. ")

  public List<Integer> getSubscribers() {
    return subscribers;
  }


  public void setSubscribers(List<Integer> subscribers) {
    this.subscribers = subscribers;
  }


  public Subscriptions desktopNotifications(Boolean desktopNotifications) {
    
    this.desktopNotifications = desktopNotifications;
    return this;
  }

   /**
   * A boolean specifying whether desktop notifications are enabled for the given stream.  A null value means the value of this setting should be inherited from the user-level default setting, enable_stream_desktop_notifications, for this stream. 
   * @return desktopNotifications
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A boolean specifying whether desktop notifications are enabled for the given stream.  A null value means the value of this setting should be inherited from the user-level default setting, enable_stream_desktop_notifications, for this stream. ")

  public Boolean getDesktopNotifications() {
    return desktopNotifications;
  }


  public void setDesktopNotifications(Boolean desktopNotifications) {
    this.desktopNotifications = desktopNotifications;
  }


  public Subscriptions emailNotifications(Boolean emailNotifications) {
    
    this.emailNotifications = emailNotifications;
    return this;
  }

   /**
   * A boolean specifying whether email notifications are enabled for the given stream.  A null value means the value of this setting should be inherited from the user-level default setting, enable_stream_email_notifications, for this stream. 
   * @return emailNotifications
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A boolean specifying whether email notifications are enabled for the given stream.  A null value means the value of this setting should be inherited from the user-level default setting, enable_stream_email_notifications, for this stream. ")

  public Boolean getEmailNotifications() {
    return emailNotifications;
  }


  public void setEmailNotifications(Boolean emailNotifications) {
    this.emailNotifications = emailNotifications;
  }


  public Subscriptions wildcardMentionsNotify(Boolean wildcardMentionsNotify) {
    
    this.wildcardMentionsNotify = wildcardMentionsNotify;
    return this;
  }

   /**
   * A boolean specifying whether wildcard mentions trigger notifications as though they were personal mentions in this stream.  A null value means the value of this setting should be inherited from the user-level default setting, wildcard_mentions_notify, for this stream. 
   * @return wildcardMentionsNotify
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A boolean specifying whether wildcard mentions trigger notifications as though they were personal mentions in this stream.  A null value means the value of this setting should be inherited from the user-level default setting, wildcard_mentions_notify, for this stream. ")

  public Boolean getWildcardMentionsNotify() {
    return wildcardMentionsNotify;
  }


  public void setWildcardMentionsNotify(Boolean wildcardMentionsNotify) {
    this.wildcardMentionsNotify = wildcardMentionsNotify;
  }


  public Subscriptions pushNotifications(Boolean pushNotifications) {
    
    this.pushNotifications = pushNotifications;
    return this;
  }

   /**
   * A boolean specifying whether push notifications are enabled for the given stream.  A null value means the value of this setting should be inherited from the user-level default setting, enable_stream_push_notifications, for this stream. 
   * @return pushNotifications
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A boolean specifying whether push notifications are enabled for the given stream.  A null value means the value of this setting should be inherited from the user-level default setting, enable_stream_push_notifications, for this stream. ")

  public Boolean getPushNotifications() {
    return pushNotifications;
  }


  public void setPushNotifications(Boolean pushNotifications) {
    this.pushNotifications = pushNotifications;
  }


  public Subscriptions audibleNotifications(Boolean audibleNotifications) {
    
    this.audibleNotifications = audibleNotifications;
    return this;
  }

   /**
   * A boolean specifying whether audible notifications are enabled for the given stream.  A null value means the value of this setting should be inherited from the user-level default setting, enable_stream_audible_notifications, for this stream. 
   * @return audibleNotifications
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A boolean specifying whether audible notifications are enabled for the given stream.  A null value means the value of this setting should be inherited from the user-level default setting, enable_stream_audible_notifications, for this stream. ")

  public Boolean getAudibleNotifications() {
    return audibleNotifications;
  }


  public void setAudibleNotifications(Boolean audibleNotifications) {
    this.audibleNotifications = audibleNotifications;
  }


  public Subscriptions pinToTop(Boolean pinToTop) {
    
    this.pinToTop = pinToTop;
    return this;
  }

   /**
   * A boolean specifying whether the given stream has been pinned to the top. 
   * @return pinToTop
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A boolean specifying whether the given stream has been pinned to the top. ")

  public Boolean getPinToTop() {
    return pinToTop;
  }


  public void setPinToTop(Boolean pinToTop) {
    this.pinToTop = pinToTop;
  }


  public Subscriptions emailAddress(String emailAddress) {
    
    this.emailAddress = emailAddress;
    return this;
  }

   /**
   * Email address of the given stream, used for [sending emails to the stream](/help/message-a-stream-by-email). 
   * @return emailAddress
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Email address of the given stream, used for [sending emails to the stream](/help/message-a-stream-by-email). ")

  public String getEmailAddress() {
    return emailAddress;
  }


  public void setEmailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
  }


  public Subscriptions isMuted(Boolean isMuted) {
    
    this.isMuted = isMuted;
    return this;
  }

   /**
   * Whether the user has muted the stream. Muted streams do not count towards your total unread count and do not show up in &#x60;All messages&#x60; view (previously known as &#x60;Home&#x60; view).  **Changes**: Prior to Zulip 2.1, this feature was represented by the more confusingly named &#x60;in_home_view&#x60; (with the opposite value, &#x60;in_home_view&#x3D;!is_muted&#x60;). 
   * @return isMuted
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether the user has muted the stream. Muted streams do not count towards your total unread count and do not show up in `All messages` view (previously known as `Home` view).  **Changes**: Prior to Zulip 2.1, this feature was represented by the more confusingly named `in_home_view` (with the opposite value, `in_home_view=!is_muted`). ")

  public Boolean getIsMuted() {
    return isMuted;
  }


  public void setIsMuted(Boolean isMuted) {
    this.isMuted = isMuted;
  }


  public Subscriptions inHomeView(Boolean inHomeView) {
    
    this.inHomeView = inHomeView;
    return this;
  }

   /**
   * Legacy property for if the given stream is muted, with inverted meeting.  **Deprecated**; clients should use is_muted where available. 
   * @return inHomeView
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Legacy property for if the given stream is muted, with inverted meeting.  **Deprecated**; clients should use is_muted where available. ")

  public Boolean getInHomeView() {
    return inHomeView;
  }


  public void setInHomeView(Boolean inHomeView) {
    this.inHomeView = inHomeView;
  }


  public Subscriptions isAnnouncementOnly(Boolean isAnnouncementOnly) {
    
    this.isAnnouncementOnly = isAnnouncementOnly;
    return this;
  }

   /**
   * Whether only organization administrators can post to the stream.  **Changes**: Deprecated in Zulip 3.0 (feature level 1), use &#x60;stream_post_policy&#x60; instead. 
   * @return isAnnouncementOnly
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether only organization administrators can post to the stream.  **Changes**: Deprecated in Zulip 3.0 (feature level 1), use `stream_post_policy` instead. ")

  public Boolean getIsAnnouncementOnly() {
    return isAnnouncementOnly;
  }


  public void setIsAnnouncementOnly(Boolean isAnnouncementOnly) {
    this.isAnnouncementOnly = isAnnouncementOnly;
  }


  public Subscriptions isWebPublic(Boolean isWebPublic) {
    
    this.isWebPublic = isWebPublic;
    return this;
  }

   /**
   * Whether the stream has been configured to allow unauthenticated access to its message history from the web. 
   * @return isWebPublic
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether the stream has been configured to allow unauthenticated access to its message history from the web. ")

  public Boolean getIsWebPublic() {
    return isWebPublic;
  }


  public void setIsWebPublic(Boolean isWebPublic) {
    this.isWebPublic = isWebPublic;
  }


  public Subscriptions role(RoleEnum role) {
    
    this.role = role;
    return this;
  }

   /**
   * The user&#39;s role within the stream (distinct from the user&#39;s [organization-level role](/help/roles-and-permissions)). Valid values are:  * 20 &#x3D;&gt; Stream administrator. * 50 &#x3D;&gt; Subscriber.  **Changes**: New in Zulip 4.0 (feature level 31). 
   * @return role
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The user's role within the stream (distinct from the user's [organization-level role](/help/roles-and-permissions)). Valid values are:  * 20 => Stream administrator. * 50 => Subscriber.  **Changes**: New in Zulip 4.0 (feature level 31). ")

  public RoleEnum getRole() {
    return role;
  }


  public void setRole(RoleEnum role) {
    this.role = role;
  }


  public Subscriptions color(String color) {
    
    this.color = color;
    return this;
  }

   /**
   * The user&#39;s personal color for the stream. 
   * @return color
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The user's personal color for the stream. ")

  public String getColor() {
    return color;
  }


  public void setColor(String color) {
    this.color = color;
  }


  public Subscriptions streamPostPolicy(Integer streamPostPolicy) {
    
    this.streamPostPolicy = streamPostPolicy;
    return this;
  }

   /**
   * Policy for which users can post messages to the stream.  * 1 &#x3D;&gt; Any user can post. * 2 &#x3D;&gt; Only administrators can post. * 3 &#x3D;&gt; Only full members can post. * 4 &#x3D;&gt; Only moderators can post.  **Changes**: New in Zulip 3.0, replacing the previous &#x60;is_announcement_only&#x60; boolean. 
   * @return streamPostPolicy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Policy for which users can post messages to the stream.  * 1 => Any user can post. * 2 => Only administrators can post. * 3 => Only full members can post. * 4 => Only moderators can post.  **Changes**: New in Zulip 3.0, replacing the previous `is_announcement_only` boolean. ")

  public Integer getStreamPostPolicy() {
    return streamPostPolicy;
  }


  public void setStreamPostPolicy(Integer streamPostPolicy) {
    this.streamPostPolicy = streamPostPolicy;
  }


  public Subscriptions messageRetentionDays(Integer messageRetentionDays) {
    
    this.messageRetentionDays = messageRetentionDays;
    return this;
  }

   /**
   * Number of days that messages sent to this stream will be stored before being automatically deleted by the [message retention policy](/help/message-retention-policy).  There are two special values:  * &#x60;null&#x60;, the default, means the stream will inherit the organization   level setting. * &#x60;-1&#x60; encodes retaining messages in this stream forever.  **Changes**: New in Zulip 3.0 (feature level 17). 
   * @return messageRetentionDays
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Number of days that messages sent to this stream will be stored before being automatically deleted by the [message retention policy](/help/message-retention-policy).  There are two special values:  * `null`, the default, means the stream will inherit the organization   level setting. * `-1` encodes retaining messages in this stream forever.  **Changes**: New in Zulip 3.0 (feature level 17). ")

  public Integer getMessageRetentionDays() {
    return messageRetentionDays;
  }


  public void setMessageRetentionDays(Integer messageRetentionDays) {
    this.messageRetentionDays = messageRetentionDays;
  }


  public Subscriptions historyPublicToSubscribers(Boolean historyPublicToSubscribers) {
    
    this.historyPublicToSubscribers = historyPublicToSubscribers;
    return this;
  }

   /**
   * Whether the history of the stream is public to its subscribers.  Currently always true for public streams (i.e. invite_only&#x3D;False implies history_public_to_subscribers&#x3D;True), but clients should not make that assumption, as we may change that behavior in the future. 
   * @return historyPublicToSubscribers
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether the history of the stream is public to its subscribers.  Currently always true for public streams (i.e. invite_only=False implies history_public_to_subscribers=True), but clients should not make that assumption, as we may change that behavior in the future. ")

  public Boolean getHistoryPublicToSubscribers() {
    return historyPublicToSubscribers;
  }


  public void setHistoryPublicToSubscribers(Boolean historyPublicToSubscribers) {
    this.historyPublicToSubscribers = historyPublicToSubscribers;
  }


  public Subscriptions firstMessageId(Integer firstMessageId) {
    
    this.firstMessageId = firstMessageId;
    return this;
  }

   /**
   * The id of the first message in the stream.  Intended to help clients determine whether they need to display UI like the \&quot;more topics\&quot; widget that would suggest the stream has older history that can be accessed.  Null is used for streams with no message history. 
   * @return firstMessageId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The id of the first message in the stream.  Intended to help clients determine whether they need to display UI like the \"more topics\" widget that would suggest the stream has older history that can be accessed.  Null is used for streams with no message history. ")

  public Integer getFirstMessageId() {
    return firstMessageId;
  }


  public void setFirstMessageId(Integer firstMessageId) {
    this.firstMessageId = firstMessageId;
  }


  public Subscriptions streamWeeklyTraffic(Integer streamWeeklyTraffic) {
    
    this.streamWeeklyTraffic = streamWeeklyTraffic;
    return this;
  }

   /**
   * The average number of messages sent to the stream in recent weeks, rounded to the nearest integer.  Null means the stream was recently created and there is insufficient data to estimate the average traffic. 
   * @return streamWeeklyTraffic
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The average number of messages sent to the stream in recent weeks, rounded to the nearest integer.  Null means the stream was recently created and there is insufficient data to estimate the average traffic. ")

  public Integer getStreamWeeklyTraffic() {
    return streamWeeklyTraffic;
  }


  public void setStreamWeeklyTraffic(Integer streamWeeklyTraffic) {
    this.streamWeeklyTraffic = streamWeeklyTraffic;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Subscriptions subscriptions = (Subscriptions) o;
    return Objects.equals(this.streamId, subscriptions.streamId) &&
        Objects.equals(this.name, subscriptions.name) &&
        Objects.equals(this.description, subscriptions.description) &&
        Objects.equals(this.renderedDescription, subscriptions.renderedDescription) &&
        Objects.equals(this.dateCreated, subscriptions.dateCreated) &&
        Objects.equals(this.inviteOnly, subscriptions.inviteOnly) &&
        Objects.equals(this.subscribers, subscriptions.subscribers) &&
        Objects.equals(this.desktopNotifications, subscriptions.desktopNotifications) &&
        Objects.equals(this.emailNotifications, subscriptions.emailNotifications) &&
        Objects.equals(this.wildcardMentionsNotify, subscriptions.wildcardMentionsNotify) &&
        Objects.equals(this.pushNotifications, subscriptions.pushNotifications) &&
        Objects.equals(this.audibleNotifications, subscriptions.audibleNotifications) &&
        Objects.equals(this.pinToTop, subscriptions.pinToTop) &&
        Objects.equals(this.emailAddress, subscriptions.emailAddress) &&
        Objects.equals(this.isMuted, subscriptions.isMuted) &&
        Objects.equals(this.inHomeView, subscriptions.inHomeView) &&
        Objects.equals(this.isAnnouncementOnly, subscriptions.isAnnouncementOnly) &&
        Objects.equals(this.isWebPublic, subscriptions.isWebPublic) &&
        Objects.equals(this.role, subscriptions.role) &&
        Objects.equals(this.color, subscriptions.color) &&
        Objects.equals(this.streamPostPolicy, subscriptions.streamPostPolicy) &&
        Objects.equals(this.messageRetentionDays, subscriptions.messageRetentionDays) &&
        Objects.equals(this.historyPublicToSubscribers, subscriptions.historyPublicToSubscribers) &&
        Objects.equals(this.firstMessageId, subscriptions.firstMessageId) &&
        Objects.equals(this.streamWeeklyTraffic, subscriptions.streamWeeklyTraffic);
  }

  @Override
  public int hashCode() {
    return Objects.hash(streamId, name, description, renderedDescription, dateCreated, inviteOnly, subscribers, desktopNotifications, emailNotifications, wildcardMentionsNotify, pushNotifications, audibleNotifications, pinToTop, emailAddress, isMuted, inHomeView, isAnnouncementOnly, isWebPublic, role, color, streamPostPolicy, messageRetentionDays, historyPublicToSubscribers, firstMessageId, streamWeeklyTraffic);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Subscriptions {\n");
    sb.append("    streamId: ").append(toIndentedString(streamId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    renderedDescription: ").append(toIndentedString(renderedDescription)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    inviteOnly: ").append(toIndentedString(inviteOnly)).append("\n");
    sb.append("    subscribers: ").append(toIndentedString(subscribers)).append("\n");
    sb.append("    desktopNotifications: ").append(toIndentedString(desktopNotifications)).append("\n");
    sb.append("    emailNotifications: ").append(toIndentedString(emailNotifications)).append("\n");
    sb.append("    wildcardMentionsNotify: ").append(toIndentedString(wildcardMentionsNotify)).append("\n");
    sb.append("    pushNotifications: ").append(toIndentedString(pushNotifications)).append("\n");
    sb.append("    audibleNotifications: ").append(toIndentedString(audibleNotifications)).append("\n");
    sb.append("    pinToTop: ").append(toIndentedString(pinToTop)).append("\n");
    sb.append("    emailAddress: ").append(toIndentedString(emailAddress)).append("\n");
    sb.append("    isMuted: ").append(toIndentedString(isMuted)).append("\n");
    sb.append("    inHomeView: ").append(toIndentedString(inHomeView)).append("\n");
    sb.append("    isAnnouncementOnly: ").append(toIndentedString(isAnnouncementOnly)).append("\n");
    sb.append("    isWebPublic: ").append(toIndentedString(isWebPublic)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("    color: ").append(toIndentedString(color)).append("\n");
    sb.append("    streamPostPolicy: ").append(toIndentedString(streamPostPolicy)).append("\n");
    sb.append("    messageRetentionDays: ").append(toIndentedString(messageRetentionDays)).append("\n");
    sb.append("    historyPublicToSubscribers: ").append(toIndentedString(historyPublicToSubscribers)).append("\n");
    sb.append("    firstMessageId: ").append(toIndentedString(firstMessageId)).append("\n");
    sb.append("    streamWeeklyTraffic: ").append(toIndentedString(streamWeeklyTraffic)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

