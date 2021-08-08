package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class Subscriptions  {
  
 /**
  * The unique ID of a stream. 
  */
  @ApiModelProperty(value = "The unique ID of a stream. ")
  private Integer streamId;

 /**
  * The name of a stream. 
  */
  @ApiModelProperty(value = "The name of a stream. ")
  private String name;

 /**
  * The short description of a stream in text/markdown format, intended to be used to prepopulate UI for editing a stream's description. 
  */
  @ApiModelProperty(value = "The short description of a stream in text/markdown format, intended to be used to prepopulate UI for editing a stream's description. ")
  private String description;

 /**
  * A short description of a stream rendered as HTML, intended to be used when displaying the stream description in a UI.  One should use the standard Zulip rendered_markdown CSS when displaying this content so that emoji, LaTeX, and other syntax work correctly.  And any client-side security logic for user-generated message content should be applied when displaying this HTML as though it were the body of a Zulip message. 
  */
  @ApiModelProperty(value = "A short description of a stream rendered as HTML, intended to be used when displaying the stream description in a UI.  One should use the standard Zulip rendered_markdown CSS when displaying this content so that emoji, LaTeX, and other syntax work correctly.  And any client-side security logic for user-generated message content should be applied when displaying this HTML as though it were the body of a Zulip message. ")
  private String renderedDescription;

 /**
  * The UNIX timestamp for when the stream was created, in UTC seconds.  **Changes**: New in Zulip 4.0 (feature level 30). 
  */
  @ApiModelProperty(value = "The UNIX timestamp for when the stream was created, in UTC seconds.  **Changes**: New in Zulip 4.0 (feature level 30). ")
  private Integer dateCreated;

 /**
  * Specifies whether the stream is private or not. Only people who have been invited can access a private stream. 
  */
  @ApiModelProperty(value = "Specifies whether the stream is private or not. Only people who have been invited can access a private stream. ")
  private Boolean inviteOnly;

 /**
  * A list of user IDs of users who are also subscribed to a given stream. Included only if `include_subscribers` is `true`. 
  */
  @ApiModelProperty(value = "A list of user IDs of users who are also subscribed to a given stream. Included only if `include_subscribers` is `true`. ")
  private List<Integer> subscribers = null;

 /**
  * A boolean specifying whether desktop notifications are enabled for the given stream.  A null value means the value of this setting should be inherited from the user-level default setting, enable_stream_desktop_notifications, for this stream. 
  */
  @ApiModelProperty(value = "A boolean specifying whether desktop notifications are enabled for the given stream.  A null value means the value of this setting should be inherited from the user-level default setting, enable_stream_desktop_notifications, for this stream. ")
  private Boolean desktopNotifications;

 /**
  * A boolean specifying whether email notifications are enabled for the given stream.  A null value means the value of this setting should be inherited from the user-level default setting, enable_stream_email_notifications, for this stream. 
  */
  @ApiModelProperty(value = "A boolean specifying whether email notifications are enabled for the given stream.  A null value means the value of this setting should be inherited from the user-level default setting, enable_stream_email_notifications, for this stream. ")
  private Boolean emailNotifications;

 /**
  * A boolean specifying whether wildcard mentions trigger notifications as though they were personal mentions in this stream.  A null value means the value of this setting should be inherited from the user-level default setting, wildcard_mentions_notify, for this stream. 
  */
  @ApiModelProperty(value = "A boolean specifying whether wildcard mentions trigger notifications as though they were personal mentions in this stream.  A null value means the value of this setting should be inherited from the user-level default setting, wildcard_mentions_notify, for this stream. ")
  private Boolean wildcardMentionsNotify;

 /**
  * A boolean specifying whether push notifications are enabled for the given stream.  A null value means the value of this setting should be inherited from the user-level default setting, enable_stream_push_notifications, for this stream. 
  */
  @ApiModelProperty(value = "A boolean specifying whether push notifications are enabled for the given stream.  A null value means the value of this setting should be inherited from the user-level default setting, enable_stream_push_notifications, for this stream. ")
  private Boolean pushNotifications;

 /**
  * A boolean specifying whether audible notifications are enabled for the given stream.  A null value means the value of this setting should be inherited from the user-level default setting, enable_stream_audible_notifications, for this stream. 
  */
  @ApiModelProperty(value = "A boolean specifying whether audible notifications are enabled for the given stream.  A null value means the value of this setting should be inherited from the user-level default setting, enable_stream_audible_notifications, for this stream. ")
  private Boolean audibleNotifications;

 /**
  * A boolean specifying whether the given stream has been pinned to the top. 
  */
  @ApiModelProperty(value = "A boolean specifying whether the given stream has been pinned to the top. ")
  private Boolean pinToTop;

 /**
  * Email address of the given stream, used for [sending emails to the stream](/help/message-a-stream-by-email). 
  */
  @ApiModelProperty(value = "Email address of the given stream, used for [sending emails to the stream](/help/message-a-stream-by-email). ")
  private String emailAddress;

 /**
  * Whether the user has muted the stream. Muted streams do not count towards your total unread count and do not show up in `All messages` view (previously known as `Home` view).  **Changes**: Prior to Zulip 2.1, this feature was represented by the more confusingly named `in_home_view` (with the opposite value, `in_home_view=!is_muted`). 
  */
  @ApiModelProperty(value = "Whether the user has muted the stream. Muted streams do not count towards your total unread count and do not show up in `All messages` view (previously known as `Home` view).  **Changes**: Prior to Zulip 2.1, this feature was represented by the more confusingly named `in_home_view` (with the opposite value, `in_home_view=!is_muted`). ")
  private Boolean isMuted;

 /**
  * Legacy property for if the given stream is muted, with inverted meeting.  **Deprecated**; clients should use is_muted where available. 
  */
  @ApiModelProperty(value = "Legacy property for if the given stream is muted, with inverted meeting.  **Deprecated**; clients should use is_muted where available. ")
  private Boolean inHomeView;

 /**
  * Whether only organization administrators can post to the stream.  **Changes**: Deprecated in Zulip 3.0 (feature level 1), use `stream_post_policy` instead. 
  */
  @ApiModelProperty(value = "Whether only organization administrators can post to the stream.  **Changes**: Deprecated in Zulip 3.0 (feature level 1), use `stream_post_policy` instead. ")
  private Boolean isAnnouncementOnly;

 /**
  * Whether the stream has been configured to allow unauthenticated access to its message history from the web. 
  */
  @ApiModelProperty(value = "Whether the stream has been configured to allow unauthenticated access to its message history from the web. ")
  private Boolean isWebPublic;

@XmlType(name="RoleEnum")
@XmlEnum(Integer.class)
public enum RoleEnum {

    @XmlEnumValue("20") @JsonProperty("20") NUMBER_20(Integer.valueOf(20)), 
    @XmlEnumValue("50") @JsonProperty("50") NUMBER_50(Integer.valueOf(50));

    private Integer value;

    RoleEnum (Integer v) {
        value = v;
    }

    public Integer value() {
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
}

 /**
  * The user's role within the stream (distinct from the user's [organization-level role](/help/roles-and-permissions)). Valid values are:  * 20 => Stream administrator. * 50 => Subscriber.  **Changes**: New in Zulip 4.0 (feature level 31). 
  */
  @ApiModelProperty(value = "The user's role within the stream (distinct from the user's [organization-level role](/help/roles-and-permissions)). Valid values are:  * 20 => Stream administrator. * 50 => Subscriber.  **Changes**: New in Zulip 4.0 (feature level 31). ")
  private RoleEnum role;

 /**
  * The user's personal color for the stream. 
  */
  @ApiModelProperty(value = "The user's personal color for the stream. ")
  private String color;

 /**
  * Policy for which users can post messages to the stream.  * 1 => Any user can post. * 2 => Only administrators can post. * 3 => Only full members can post. * 4 => Only moderators can post.  **Changes**: New in Zulip 3.0, replacing the previous `is_announcement_only` boolean. 
  */
  @ApiModelProperty(value = "Policy for which users can post messages to the stream.  * 1 => Any user can post. * 2 => Only administrators can post. * 3 => Only full members can post. * 4 => Only moderators can post.  **Changes**: New in Zulip 3.0, replacing the previous `is_announcement_only` boolean. ")
  private Integer streamPostPolicy;

 /**
  * Number of days that messages sent to this stream will be stored before being automatically deleted by the [message retention policy](/help/message-retention-policy).  There are two special values:  * `null`, the default, means the stream will inherit the organization   level setting. * `-1` encodes retaining messages in this stream forever.  **Changes**: New in Zulip 3.0 (feature level 17). 
  */
  @ApiModelProperty(value = "Number of days that messages sent to this stream will be stored before being automatically deleted by the [message retention policy](/help/message-retention-policy).  There are two special values:  * `null`, the default, means the stream will inherit the organization   level setting. * `-1` encodes retaining messages in this stream forever.  **Changes**: New in Zulip 3.0 (feature level 17). ")
  private Integer messageRetentionDays;

 /**
  * Whether the history of the stream is public to its subscribers.  Currently always true for public streams (i.e. invite_only=False implies history_public_to_subscribers=True), but clients should not make that assumption, as we may change that behavior in the future. 
  */
  @ApiModelProperty(value = "Whether the history of the stream is public to its subscribers.  Currently always true for public streams (i.e. invite_only=False implies history_public_to_subscribers=True), but clients should not make that assumption, as we may change that behavior in the future. ")
  private Boolean historyPublicToSubscribers;

 /**
  * The id of the first message in the stream.  Intended to help clients determine whether they need to display UI like the \"more topics\" widget that would suggest the stream has older history that can be accessed.  Null is used for streams with no message history. 
  */
  @ApiModelProperty(value = "The id of the first message in the stream.  Intended to help clients determine whether they need to display UI like the \"more topics\" widget that would suggest the stream has older history that can be accessed.  Null is used for streams with no message history. ")
  private Integer firstMessageId;

 /**
  * The average number of messages sent to the stream in recent weeks, rounded to the nearest integer.  Null means the stream was recently created and there is insufficient data to estimate the average traffic. 
  */
  @ApiModelProperty(value = "The average number of messages sent to the stream in recent weeks, rounded to the nearest integer.  Null means the stream was recently created and there is insufficient data to estimate the average traffic. ")
  private Integer streamWeeklyTraffic;
 /**
  * The unique ID of a stream. 
  * @return streamId
  */
  @JsonProperty("stream_id")
  public Integer getStreamId() {
    return streamId;
  }

  /**
   * Sets the <code>streamId</code> property.
   */
  public void setStreamId(Integer streamId) {
    this.streamId = streamId;
  }

  /**
   * Sets the <code>streamId</code> property.
   */
  public Subscriptions streamId(Integer streamId) {
    this.streamId = streamId;
    return this;
  }

 /**
  * The name of a stream. 
  * @return name
  */
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  /**
   * Sets the <code>name</code> property.
   */
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Sets the <code>name</code> property.
   */
  public Subscriptions name(String name) {
    this.name = name;
    return this;
  }

 /**
  * The short description of a stream in text/markdown format, intended to be used to prepopulate UI for editing a stream&#39;s description. 
  * @return description
  */
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  /**
   * Sets the <code>description</code> property.
   */
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * Sets the <code>description</code> property.
   */
  public Subscriptions description(String description) {
    this.description = description;
    return this;
  }

 /**
  * A short description of a stream rendered as HTML, intended to be used when displaying the stream description in a UI.  One should use the standard Zulip rendered_markdown CSS when displaying this content so that emoji, LaTeX, and other syntax work correctly.  And any client-side security logic for user-generated message content should be applied when displaying this HTML as though it were the body of a Zulip message. 
  * @return renderedDescription
  */
  @JsonProperty("rendered_description")
  public String getRenderedDescription() {
    return renderedDescription;
  }

  /**
   * Sets the <code>renderedDescription</code> property.
   */
  public void setRenderedDescription(String renderedDescription) {
    this.renderedDescription = renderedDescription;
  }

  /**
   * Sets the <code>renderedDescription</code> property.
   */
  public Subscriptions renderedDescription(String renderedDescription) {
    this.renderedDescription = renderedDescription;
    return this;
  }

 /**
  * The UNIX timestamp for when the stream was created, in UTC seconds.  **Changes**: New in Zulip 4.0 (feature level 30). 
  * @return dateCreated
  */
  @JsonProperty("date_created")
  public Integer getDateCreated() {
    return dateCreated;
  }

  /**
   * Sets the <code>dateCreated</code> property.
   */
  public void setDateCreated(Integer dateCreated) {
    this.dateCreated = dateCreated;
  }

  /**
   * Sets the <code>dateCreated</code> property.
   */
  public Subscriptions dateCreated(Integer dateCreated) {
    this.dateCreated = dateCreated;
    return this;
  }

 /**
  * Specifies whether the stream is private or not. Only people who have been invited can access a private stream. 
  * @return inviteOnly
  */
  @JsonProperty("invite_only")
  public Boolean getInviteOnly() {
    return inviteOnly;
  }

  /**
   * Sets the <code>inviteOnly</code> property.
   */
  public void setInviteOnly(Boolean inviteOnly) {
    this.inviteOnly = inviteOnly;
  }

  /**
   * Sets the <code>inviteOnly</code> property.
   */
  public Subscriptions inviteOnly(Boolean inviteOnly) {
    this.inviteOnly = inviteOnly;
    return this;
  }

 /**
  * A list of user IDs of users who are also subscribed to a given stream. Included only if &#x60;include_subscribers&#x60; is &#x60;true&#x60;. 
  * @return subscribers
  */
  @JsonProperty("subscribers")
  public List<Integer> getSubscribers() {
    return subscribers;
  }

  /**
   * Sets the <code>subscribers</code> property.
   */
  public void setSubscribers(List<Integer> subscribers) {
    this.subscribers = subscribers;
  }

  /**
   * Sets the <code>subscribers</code> property.
   */
  public Subscriptions subscribers(List<Integer> subscribers) {
    this.subscribers = subscribers;
    return this;
  }

  /**
   * Adds a new item to the <code>subscribers</code> list.
   */
  public Subscriptions addSubscribersItem(Integer subscribersItem) {
    this.subscribers.add(subscribersItem);
    return this;
  }

 /**
  * A boolean specifying whether desktop notifications are enabled for the given stream.  A null value means the value of this setting should be inherited from the user-level default setting, enable_stream_desktop_notifications, for this stream. 
  * @return desktopNotifications
  */
  @JsonProperty("desktop_notifications")
  public Boolean getDesktopNotifications() {
    return desktopNotifications;
  }

  /**
   * Sets the <code>desktopNotifications</code> property.
   */
  public void setDesktopNotifications(Boolean desktopNotifications) {
    this.desktopNotifications = desktopNotifications;
  }

  /**
   * Sets the <code>desktopNotifications</code> property.
   */
  public Subscriptions desktopNotifications(Boolean desktopNotifications) {
    this.desktopNotifications = desktopNotifications;
    return this;
  }

 /**
  * A boolean specifying whether email notifications are enabled for the given stream.  A null value means the value of this setting should be inherited from the user-level default setting, enable_stream_email_notifications, for this stream. 
  * @return emailNotifications
  */
  @JsonProperty("email_notifications")
  public Boolean getEmailNotifications() {
    return emailNotifications;
  }

  /**
   * Sets the <code>emailNotifications</code> property.
   */
  public void setEmailNotifications(Boolean emailNotifications) {
    this.emailNotifications = emailNotifications;
  }

  /**
   * Sets the <code>emailNotifications</code> property.
   */
  public Subscriptions emailNotifications(Boolean emailNotifications) {
    this.emailNotifications = emailNotifications;
    return this;
  }

 /**
  * A boolean specifying whether wildcard mentions trigger notifications as though they were personal mentions in this stream.  A null value means the value of this setting should be inherited from the user-level default setting, wildcard_mentions_notify, for this stream. 
  * @return wildcardMentionsNotify
  */
  @JsonProperty("wildcard_mentions_notify")
  public Boolean getWildcardMentionsNotify() {
    return wildcardMentionsNotify;
  }

  /**
   * Sets the <code>wildcardMentionsNotify</code> property.
   */
  public void setWildcardMentionsNotify(Boolean wildcardMentionsNotify) {
    this.wildcardMentionsNotify = wildcardMentionsNotify;
  }

  /**
   * Sets the <code>wildcardMentionsNotify</code> property.
   */
  public Subscriptions wildcardMentionsNotify(Boolean wildcardMentionsNotify) {
    this.wildcardMentionsNotify = wildcardMentionsNotify;
    return this;
  }

 /**
  * A boolean specifying whether push notifications are enabled for the given stream.  A null value means the value of this setting should be inherited from the user-level default setting, enable_stream_push_notifications, for this stream. 
  * @return pushNotifications
  */
  @JsonProperty("push_notifications")
  public Boolean getPushNotifications() {
    return pushNotifications;
  }

  /**
   * Sets the <code>pushNotifications</code> property.
   */
  public void setPushNotifications(Boolean pushNotifications) {
    this.pushNotifications = pushNotifications;
  }

  /**
   * Sets the <code>pushNotifications</code> property.
   */
  public Subscriptions pushNotifications(Boolean pushNotifications) {
    this.pushNotifications = pushNotifications;
    return this;
  }

 /**
  * A boolean specifying whether audible notifications are enabled for the given stream.  A null value means the value of this setting should be inherited from the user-level default setting, enable_stream_audible_notifications, for this stream. 
  * @return audibleNotifications
  */
  @JsonProperty("audible_notifications")
  public Boolean getAudibleNotifications() {
    return audibleNotifications;
  }

  /**
   * Sets the <code>audibleNotifications</code> property.
   */
  public void setAudibleNotifications(Boolean audibleNotifications) {
    this.audibleNotifications = audibleNotifications;
  }

  /**
   * Sets the <code>audibleNotifications</code> property.
   */
  public Subscriptions audibleNotifications(Boolean audibleNotifications) {
    this.audibleNotifications = audibleNotifications;
    return this;
  }

 /**
  * A boolean specifying whether the given stream has been pinned to the top. 
  * @return pinToTop
  */
  @JsonProperty("pin_to_top")
  public Boolean getPinToTop() {
    return pinToTop;
  }

  /**
   * Sets the <code>pinToTop</code> property.
   */
  public void setPinToTop(Boolean pinToTop) {
    this.pinToTop = pinToTop;
  }

  /**
   * Sets the <code>pinToTop</code> property.
   */
  public Subscriptions pinToTop(Boolean pinToTop) {
    this.pinToTop = pinToTop;
    return this;
  }

 /**
  * Email address of the given stream, used for [sending emails to the stream](/help/message-a-stream-by-email). 
  * @return emailAddress
  */
  @JsonProperty("email_address")
  public String getEmailAddress() {
    return emailAddress;
  }

  /**
   * Sets the <code>emailAddress</code> property.
   */
  public void setEmailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
  }

  /**
   * Sets the <code>emailAddress</code> property.
   */
  public Subscriptions emailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
    return this;
  }

 /**
  * Whether the user has muted the stream. Muted streams do not count towards your total unread count and do not show up in &#x60;All messages&#x60; view (previously known as &#x60;Home&#x60; view).  **Changes**: Prior to Zulip 2.1, this feature was represented by the more confusingly named &#x60;in_home_view&#x60; (with the opposite value, &#x60;in_home_view&#x3D;!is_muted&#x60;). 
  * @return isMuted
  */
  @JsonProperty("is_muted")
  public Boolean getIsMuted() {
    return isMuted;
  }

  /**
   * Sets the <code>isMuted</code> property.
   */
  public void setIsMuted(Boolean isMuted) {
    this.isMuted = isMuted;
  }

  /**
   * Sets the <code>isMuted</code> property.
   */
  public Subscriptions isMuted(Boolean isMuted) {
    this.isMuted = isMuted;
    return this;
  }

 /**
  * Legacy property for if the given stream is muted, with inverted meeting.  **Deprecated**; clients should use is_muted where available. 
  * @return inHomeView
  */
  @JsonProperty("in_home_view")
  public Boolean getInHomeView() {
    return inHomeView;
  }

  /**
   * Sets the <code>inHomeView</code> property.
   */
  public void setInHomeView(Boolean inHomeView) {
    this.inHomeView = inHomeView;
  }

  /**
   * Sets the <code>inHomeView</code> property.
   */
  public Subscriptions inHomeView(Boolean inHomeView) {
    this.inHomeView = inHomeView;
    return this;
  }

 /**
  * Whether only organization administrators can post to the stream.  **Changes**: Deprecated in Zulip 3.0 (feature level 1), use &#x60;stream_post_policy&#x60; instead. 
  * @return isAnnouncementOnly
  */
  @JsonProperty("is_announcement_only")
  public Boolean getIsAnnouncementOnly() {
    return isAnnouncementOnly;
  }

  /**
   * Sets the <code>isAnnouncementOnly</code> property.
   */
  public void setIsAnnouncementOnly(Boolean isAnnouncementOnly) {
    this.isAnnouncementOnly = isAnnouncementOnly;
  }

  /**
   * Sets the <code>isAnnouncementOnly</code> property.
   */
  public Subscriptions isAnnouncementOnly(Boolean isAnnouncementOnly) {
    this.isAnnouncementOnly = isAnnouncementOnly;
    return this;
  }

 /**
  * Whether the stream has been configured to allow unauthenticated access to its message history from the web. 
  * @return isWebPublic
  */
  @JsonProperty("is_web_public")
  public Boolean getIsWebPublic() {
    return isWebPublic;
  }

  /**
   * Sets the <code>isWebPublic</code> property.
   */
  public void setIsWebPublic(Boolean isWebPublic) {
    this.isWebPublic = isWebPublic;
  }

  /**
   * Sets the <code>isWebPublic</code> property.
   */
  public Subscriptions isWebPublic(Boolean isWebPublic) {
    this.isWebPublic = isWebPublic;
    return this;
  }

 /**
  * The user&#39;s role within the stream (distinct from the user&#39;s [organization-level role](/help/roles-and-permissions)). Valid values are:  * 20 &#x3D;&gt; Stream administrator. * 50 &#x3D;&gt; Subscriber.  **Changes**: New in Zulip 4.0 (feature level 31). 
  * @return role
  */
  @JsonProperty("role")
  public Integer getRole() {
    return role == null ? null : role.value();
  }

  /**
   * Sets the <code>role</code> property.
   */
  public void setRole(RoleEnum role) {
    this.role = role;
  }

  /**
   * Sets the <code>role</code> property.
   */
  public Subscriptions role(RoleEnum role) {
    this.role = role;
    return this;
  }

 /**
  * The user&#39;s personal color for the stream. 
  * @return color
  */
  @JsonProperty("color")
  public String getColor() {
    return color;
  }

  /**
   * Sets the <code>color</code> property.
   */
  public void setColor(String color) {
    this.color = color;
  }

  /**
   * Sets the <code>color</code> property.
   */
  public Subscriptions color(String color) {
    this.color = color;
    return this;
  }

 /**
  * Policy for which users can post messages to the stream.  * 1 &#x3D;&gt; Any user can post. * 2 &#x3D;&gt; Only administrators can post. * 3 &#x3D;&gt; Only full members can post. * 4 &#x3D;&gt; Only moderators can post.  **Changes**: New in Zulip 3.0, replacing the previous &#x60;is_announcement_only&#x60; boolean. 
  * @return streamPostPolicy
  */
  @JsonProperty("stream_post_policy")
  public Integer getStreamPostPolicy() {
    return streamPostPolicy;
  }

  /**
   * Sets the <code>streamPostPolicy</code> property.
   */
  public void setStreamPostPolicy(Integer streamPostPolicy) {
    this.streamPostPolicy = streamPostPolicy;
  }

  /**
   * Sets the <code>streamPostPolicy</code> property.
   */
  public Subscriptions streamPostPolicy(Integer streamPostPolicy) {
    this.streamPostPolicy = streamPostPolicy;
    return this;
  }

 /**
  * Number of days that messages sent to this stream will be stored before being automatically deleted by the [message retention policy](/help/message-retention-policy).  There are two special values:  * &#x60;null&#x60;, the default, means the stream will inherit the organization   level setting. * &#x60;-1&#x60; encodes retaining messages in this stream forever.  **Changes**: New in Zulip 3.0 (feature level 17). 
  * @return messageRetentionDays
  */
  @JsonProperty("message_retention_days")
  public Integer getMessageRetentionDays() {
    return messageRetentionDays;
  }

  /**
   * Sets the <code>messageRetentionDays</code> property.
   */
  public void setMessageRetentionDays(Integer messageRetentionDays) {
    this.messageRetentionDays = messageRetentionDays;
  }

  /**
   * Sets the <code>messageRetentionDays</code> property.
   */
  public Subscriptions messageRetentionDays(Integer messageRetentionDays) {
    this.messageRetentionDays = messageRetentionDays;
    return this;
  }

 /**
  * Whether the history of the stream is public to its subscribers.  Currently always true for public streams (i.e. invite_only&#x3D;False implies history_public_to_subscribers&#x3D;True), but clients should not make that assumption, as we may change that behavior in the future. 
  * @return historyPublicToSubscribers
  */
  @JsonProperty("history_public_to_subscribers")
  public Boolean getHistoryPublicToSubscribers() {
    return historyPublicToSubscribers;
  }

  /**
   * Sets the <code>historyPublicToSubscribers</code> property.
   */
  public void setHistoryPublicToSubscribers(Boolean historyPublicToSubscribers) {
    this.historyPublicToSubscribers = historyPublicToSubscribers;
  }

  /**
   * Sets the <code>historyPublicToSubscribers</code> property.
   */
  public Subscriptions historyPublicToSubscribers(Boolean historyPublicToSubscribers) {
    this.historyPublicToSubscribers = historyPublicToSubscribers;
    return this;
  }

 /**
  * The id of the first message in the stream.  Intended to help clients determine whether they need to display UI like the \&quot;more topics\&quot; widget that would suggest the stream has older history that can be accessed.  Null is used for streams with no message history. 
  * @return firstMessageId
  */
  @JsonProperty("first_message_id")
  public Integer getFirstMessageId() {
    return firstMessageId;
  }

  /**
   * Sets the <code>firstMessageId</code> property.
   */
  public void setFirstMessageId(Integer firstMessageId) {
    this.firstMessageId = firstMessageId;
  }

  /**
   * Sets the <code>firstMessageId</code> property.
   */
  public Subscriptions firstMessageId(Integer firstMessageId) {
    this.firstMessageId = firstMessageId;
    return this;
  }

 /**
  * The average number of messages sent to the stream in recent weeks, rounded to the nearest integer.  Null means the stream was recently created and there is insufficient data to estimate the average traffic. 
  * @return streamWeeklyTraffic
  */
  @JsonProperty("stream_weekly_traffic")
  public Integer getStreamWeeklyTraffic() {
    return streamWeeklyTraffic;
  }

  /**
   * Sets the <code>streamWeeklyTraffic</code> property.
   */
  public void setStreamWeeklyTraffic(Integer streamWeeklyTraffic) {
    this.streamWeeklyTraffic = streamWeeklyTraffic;
  }

  /**
   * Sets the <code>streamWeeklyTraffic</code> property.
   */
  public Subscriptions streamWeeklyTraffic(Integer streamWeeklyTraffic) {
    this.streamWeeklyTraffic = streamWeeklyTraffic;
    return this;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

