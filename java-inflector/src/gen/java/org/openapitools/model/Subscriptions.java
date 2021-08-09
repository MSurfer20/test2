package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2021-08-09T21:33:21.953019Z[Etc/UTC]")
public class Subscriptions   {
  @JsonProperty("stream_id")
  private Integer streamId;

  @JsonProperty("name")
  private String name;

  @JsonProperty("description")
  private String description;

  @JsonProperty("rendered_description")
  private String renderedDescription;

  @JsonProperty("date_created")
  private Integer dateCreated;

  @JsonProperty("invite_only")
  private Boolean inviteOnly;

  @JsonProperty("subscribers")
  private List<Integer> subscribers = null;

  @JsonProperty("desktop_notifications")
  private Boolean desktopNotifications;

  @JsonProperty("email_notifications")
  private Boolean emailNotifications;

  @JsonProperty("wildcard_mentions_notify")
  private Boolean wildcardMentionsNotify;

  @JsonProperty("push_notifications")
  private Boolean pushNotifications;

  @JsonProperty("audible_notifications")
  private Boolean audibleNotifications;

  @JsonProperty("pin_to_top")
  private Boolean pinToTop;

  @JsonProperty("email_address")
  private String emailAddress;

  @JsonProperty("is_muted")
  private Boolean isMuted;

  @JsonProperty("in_home_view")
  private Boolean inHomeView;

  @JsonProperty("is_announcement_only")
  private Boolean isAnnouncementOnly;

  @JsonProperty("is_web_public")
  private Boolean isWebPublic;

  /**
   * The user's role within the stream (distinct from the user's [organization-level role](/help/roles-and-permissions)). Valid values are:  * 20 => Stream administrator. * 50 => Subscriber.  **Changes**: New in Zulip 4.0 (feature level 31). 
   */
  public enum RoleEnum {
    NUMBER_20(20),
    
    NUMBER_50(50);

    private Integer value;

    RoleEnum(Integer value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static RoleEnum fromValue(String text) {
      for (RoleEnum b : RoleEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("role")
  private RoleEnum role;

  @JsonProperty("color")
  private String color;

  @JsonProperty("stream_post_policy")
  private Integer streamPostPolicy;

  @JsonProperty("message_retention_days")
  private Integer messageRetentionDays;

  @JsonProperty("history_public_to_subscribers")
  private Boolean historyPublicToSubscribers;

  @JsonProperty("first_message_id")
  private Integer firstMessageId;

  @JsonProperty("stream_weekly_traffic")
  private Integer streamWeeklyTraffic;

  /**
   * The unique ID of a stream. 
   **/
  public Subscriptions streamId(Integer streamId) {
    this.streamId = streamId;
    return this;
  }

  
  @ApiModelProperty(value = "The unique ID of a stream. ")
  @JsonProperty("stream_id")
  public Integer getStreamId() {
    return streamId;
  }
  public void setStreamId(Integer streamId) {
    this.streamId = streamId;
  }

  /**
   * The name of a stream. 
   **/
  public Subscriptions name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(value = "The name of a stream. ")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   * The short description of a stream in text/markdown format, intended to be used to prepopulate UI for editing a stream's description. 
   **/
  public Subscriptions description(String description) {
    this.description = description;
    return this;
  }

  
  @ApiModelProperty(value = "The short description of a stream in text/markdown format, intended to be used to prepopulate UI for editing a stream's description. ")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * A short description of a stream rendered as HTML, intended to be used when displaying the stream description in a UI.  One should use the standard Zulip rendered_markdown CSS when displaying this content so that emoji, LaTeX, and other syntax work correctly.  And any client-side security logic for user-generated message content should be applied when displaying this HTML as though it were the body of a Zulip message. 
   **/
  public Subscriptions renderedDescription(String renderedDescription) {
    this.renderedDescription = renderedDescription;
    return this;
  }

  
  @ApiModelProperty(value = "A short description of a stream rendered as HTML, intended to be used when displaying the stream description in a UI.  One should use the standard Zulip rendered_markdown CSS when displaying this content so that emoji, LaTeX, and other syntax work correctly.  And any client-side security logic for user-generated message content should be applied when displaying this HTML as though it were the body of a Zulip message. ")
  @JsonProperty("rendered_description")
  public String getRenderedDescription() {
    return renderedDescription;
  }
  public void setRenderedDescription(String renderedDescription) {
    this.renderedDescription = renderedDescription;
  }

  /**
   * The UNIX timestamp for when the stream was created, in UTC seconds.  **Changes**: New in Zulip 4.0 (feature level 30). 
   **/
  public Subscriptions dateCreated(Integer dateCreated) {
    this.dateCreated = dateCreated;
    return this;
  }

  
  @ApiModelProperty(value = "The UNIX timestamp for when the stream was created, in UTC seconds.  **Changes**: New in Zulip 4.0 (feature level 30). ")
  @JsonProperty("date_created")
  public Integer getDateCreated() {
    return dateCreated;
  }
  public void setDateCreated(Integer dateCreated) {
    this.dateCreated = dateCreated;
  }

  /**
   * Specifies whether the stream is private or not. Only people who have been invited can access a private stream. 
   **/
  public Subscriptions inviteOnly(Boolean inviteOnly) {
    this.inviteOnly = inviteOnly;
    return this;
  }

  
  @ApiModelProperty(value = "Specifies whether the stream is private or not. Only people who have been invited can access a private stream. ")
  @JsonProperty("invite_only")
  public Boolean getInviteOnly() {
    return inviteOnly;
  }
  public void setInviteOnly(Boolean inviteOnly) {
    this.inviteOnly = inviteOnly;
  }

  /**
   * A list of user IDs of users who are also subscribed to a given stream. Included only if `include_subscribers` is `true`. 
   **/
  public Subscriptions subscribers(List<Integer> subscribers) {
    this.subscribers = subscribers;
    return this;
  }

  
  @ApiModelProperty(value = "A list of user IDs of users who are also subscribed to a given stream. Included only if `include_subscribers` is `true`. ")
  @JsonProperty("subscribers")
  public List<Integer> getSubscribers() {
    return subscribers;
  }
  public void setSubscribers(List<Integer> subscribers) {
    this.subscribers = subscribers;
  }

  /**
   * A boolean specifying whether desktop notifications are enabled for the given stream.  A null value means the value of this setting should be inherited from the user-level default setting, enable_stream_desktop_notifications, for this stream. 
   **/
  public Subscriptions desktopNotifications(Boolean desktopNotifications) {
    this.desktopNotifications = desktopNotifications;
    return this;
  }

  
  @ApiModelProperty(value = "A boolean specifying whether desktop notifications are enabled for the given stream.  A null value means the value of this setting should be inherited from the user-level default setting, enable_stream_desktop_notifications, for this stream. ")
  @JsonProperty("desktop_notifications")
  public Boolean getDesktopNotifications() {
    return desktopNotifications;
  }
  public void setDesktopNotifications(Boolean desktopNotifications) {
    this.desktopNotifications = desktopNotifications;
  }

  /**
   * A boolean specifying whether email notifications are enabled for the given stream.  A null value means the value of this setting should be inherited from the user-level default setting, enable_stream_email_notifications, for this stream. 
   **/
  public Subscriptions emailNotifications(Boolean emailNotifications) {
    this.emailNotifications = emailNotifications;
    return this;
  }

  
  @ApiModelProperty(value = "A boolean specifying whether email notifications are enabled for the given stream.  A null value means the value of this setting should be inherited from the user-level default setting, enable_stream_email_notifications, for this stream. ")
  @JsonProperty("email_notifications")
  public Boolean getEmailNotifications() {
    return emailNotifications;
  }
  public void setEmailNotifications(Boolean emailNotifications) {
    this.emailNotifications = emailNotifications;
  }

  /**
   * A boolean specifying whether wildcard mentions trigger notifications as though they were personal mentions in this stream.  A null value means the value of this setting should be inherited from the user-level default setting, wildcard_mentions_notify, for this stream. 
   **/
  public Subscriptions wildcardMentionsNotify(Boolean wildcardMentionsNotify) {
    this.wildcardMentionsNotify = wildcardMentionsNotify;
    return this;
  }

  
  @ApiModelProperty(value = "A boolean specifying whether wildcard mentions trigger notifications as though they were personal mentions in this stream.  A null value means the value of this setting should be inherited from the user-level default setting, wildcard_mentions_notify, for this stream. ")
  @JsonProperty("wildcard_mentions_notify")
  public Boolean getWildcardMentionsNotify() {
    return wildcardMentionsNotify;
  }
  public void setWildcardMentionsNotify(Boolean wildcardMentionsNotify) {
    this.wildcardMentionsNotify = wildcardMentionsNotify;
  }

  /**
   * A boolean specifying whether push notifications are enabled for the given stream.  A null value means the value of this setting should be inherited from the user-level default setting, enable_stream_push_notifications, for this stream. 
   **/
  public Subscriptions pushNotifications(Boolean pushNotifications) {
    this.pushNotifications = pushNotifications;
    return this;
  }

  
  @ApiModelProperty(value = "A boolean specifying whether push notifications are enabled for the given stream.  A null value means the value of this setting should be inherited from the user-level default setting, enable_stream_push_notifications, for this stream. ")
  @JsonProperty("push_notifications")
  public Boolean getPushNotifications() {
    return pushNotifications;
  }
  public void setPushNotifications(Boolean pushNotifications) {
    this.pushNotifications = pushNotifications;
  }

  /**
   * A boolean specifying whether audible notifications are enabled for the given stream.  A null value means the value of this setting should be inherited from the user-level default setting, enable_stream_audible_notifications, for this stream. 
   **/
  public Subscriptions audibleNotifications(Boolean audibleNotifications) {
    this.audibleNotifications = audibleNotifications;
    return this;
  }

  
  @ApiModelProperty(value = "A boolean specifying whether audible notifications are enabled for the given stream.  A null value means the value of this setting should be inherited from the user-level default setting, enable_stream_audible_notifications, for this stream. ")
  @JsonProperty("audible_notifications")
  public Boolean getAudibleNotifications() {
    return audibleNotifications;
  }
  public void setAudibleNotifications(Boolean audibleNotifications) {
    this.audibleNotifications = audibleNotifications;
  }

  /**
   * A boolean specifying whether the given stream has been pinned to the top. 
   **/
  public Subscriptions pinToTop(Boolean pinToTop) {
    this.pinToTop = pinToTop;
    return this;
  }

  
  @ApiModelProperty(value = "A boolean specifying whether the given stream has been pinned to the top. ")
  @JsonProperty("pin_to_top")
  public Boolean getPinToTop() {
    return pinToTop;
  }
  public void setPinToTop(Boolean pinToTop) {
    this.pinToTop = pinToTop;
  }

  /**
   * Email address of the given stream, used for [sending emails to the stream](/help/message-a-stream-by-email). 
   **/
  public Subscriptions emailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
    return this;
  }

  
  @ApiModelProperty(value = "Email address of the given stream, used for [sending emails to the stream](/help/message-a-stream-by-email). ")
  @JsonProperty("email_address")
  public String getEmailAddress() {
    return emailAddress;
  }
  public void setEmailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
  }

  /**
   * Whether the user has muted the stream. Muted streams do not count towards your total unread count and do not show up in `All messages` view (previously known as `Home` view).  **Changes**: Prior to Zulip 2.1, this feature was represented by the more confusingly named `in_home_view` (with the opposite value, `in_home_view=!is_muted`). 
   **/
  public Subscriptions isMuted(Boolean isMuted) {
    this.isMuted = isMuted;
    return this;
  }

  
  @ApiModelProperty(value = "Whether the user has muted the stream. Muted streams do not count towards your total unread count and do not show up in `All messages` view (previously known as `Home` view).  **Changes**: Prior to Zulip 2.1, this feature was represented by the more confusingly named `in_home_view` (with the opposite value, `in_home_view=!is_muted`). ")
  @JsonProperty("is_muted")
  public Boolean getIsMuted() {
    return isMuted;
  }
  public void setIsMuted(Boolean isMuted) {
    this.isMuted = isMuted;
  }

  /**
   * Legacy property for if the given stream is muted, with inverted meeting.  **Deprecated**; clients should use is_muted where available. 
   **/
  public Subscriptions inHomeView(Boolean inHomeView) {
    this.inHomeView = inHomeView;
    return this;
  }

  
  @ApiModelProperty(value = "Legacy property for if the given stream is muted, with inverted meeting.  **Deprecated**; clients should use is_muted where available. ")
  @JsonProperty("in_home_view")
  public Boolean getInHomeView() {
    return inHomeView;
  }
  public void setInHomeView(Boolean inHomeView) {
    this.inHomeView = inHomeView;
  }

  /**
   * Whether only organization administrators can post to the stream.  **Changes**: Deprecated in Zulip 3.0 (feature level 1), use `stream_post_policy` instead. 
   **/
  public Subscriptions isAnnouncementOnly(Boolean isAnnouncementOnly) {
    this.isAnnouncementOnly = isAnnouncementOnly;
    return this;
  }

  
  @ApiModelProperty(value = "Whether only organization administrators can post to the stream.  **Changes**: Deprecated in Zulip 3.0 (feature level 1), use `stream_post_policy` instead. ")
  @JsonProperty("is_announcement_only")
  public Boolean getIsAnnouncementOnly() {
    return isAnnouncementOnly;
  }
  public void setIsAnnouncementOnly(Boolean isAnnouncementOnly) {
    this.isAnnouncementOnly = isAnnouncementOnly;
  }

  /**
   * Whether the stream has been configured to allow unauthenticated access to its message history from the web. 
   **/
  public Subscriptions isWebPublic(Boolean isWebPublic) {
    this.isWebPublic = isWebPublic;
    return this;
  }

  
  @ApiModelProperty(value = "Whether the stream has been configured to allow unauthenticated access to its message history from the web. ")
  @JsonProperty("is_web_public")
  public Boolean getIsWebPublic() {
    return isWebPublic;
  }
  public void setIsWebPublic(Boolean isWebPublic) {
    this.isWebPublic = isWebPublic;
  }

  /**
   * The user's role within the stream (distinct from the user's [organization-level role](/help/roles-and-permissions)). Valid values are:  * 20 => Stream administrator. * 50 => Subscriber.  **Changes**: New in Zulip 4.0 (feature level 31). 
   **/
  public Subscriptions role(RoleEnum role) {
    this.role = role;
    return this;
  }

  
  @ApiModelProperty(value = "The user's role within the stream (distinct from the user's [organization-level role](/help/roles-and-permissions)). Valid values are:  * 20 => Stream administrator. * 50 => Subscriber.  **Changes**: New in Zulip 4.0 (feature level 31). ")
  @JsonProperty("role")
  public RoleEnum getRole() {
    return role;
  }
  public void setRole(RoleEnum role) {
    this.role = role;
  }

  /**
   * The user's personal color for the stream. 
   **/
  public Subscriptions color(String color) {
    this.color = color;
    return this;
  }

  
  @ApiModelProperty(value = "The user's personal color for the stream. ")
  @JsonProperty("color")
  public String getColor() {
    return color;
  }
  public void setColor(String color) {
    this.color = color;
  }

  /**
   * Policy for which users can post messages to the stream.  * 1 => Any user can post. * 2 => Only administrators can post. * 3 => Only full members can post. * 4 => Only moderators can post.  **Changes**: New in Zulip 3.0, replacing the previous `is_announcement_only` boolean. 
   **/
  public Subscriptions streamPostPolicy(Integer streamPostPolicy) {
    this.streamPostPolicy = streamPostPolicy;
    return this;
  }

  
  @ApiModelProperty(value = "Policy for which users can post messages to the stream.  * 1 => Any user can post. * 2 => Only administrators can post. * 3 => Only full members can post. * 4 => Only moderators can post.  **Changes**: New in Zulip 3.0, replacing the previous `is_announcement_only` boolean. ")
  @JsonProperty("stream_post_policy")
  public Integer getStreamPostPolicy() {
    return streamPostPolicy;
  }
  public void setStreamPostPolicy(Integer streamPostPolicy) {
    this.streamPostPolicy = streamPostPolicy;
  }

  /**
   * Number of days that messages sent to this stream will be stored before being automatically deleted by the [message retention policy](/help/message-retention-policy).  There are two special values:  * `null`, the default, means the stream will inherit the organization   level setting. * `-1` encodes retaining messages in this stream forever.  **Changes**: New in Zulip 3.0 (feature level 17). 
   **/
  public Subscriptions messageRetentionDays(Integer messageRetentionDays) {
    this.messageRetentionDays = messageRetentionDays;
    return this;
  }

  
  @ApiModelProperty(value = "Number of days that messages sent to this stream will be stored before being automatically deleted by the [message retention policy](/help/message-retention-policy).  There are two special values:  * `null`, the default, means the stream will inherit the organization   level setting. * `-1` encodes retaining messages in this stream forever.  **Changes**: New in Zulip 3.0 (feature level 17). ")
  @JsonProperty("message_retention_days")
  public Integer getMessageRetentionDays() {
    return messageRetentionDays;
  }
  public void setMessageRetentionDays(Integer messageRetentionDays) {
    this.messageRetentionDays = messageRetentionDays;
  }

  /**
   * Whether the history of the stream is public to its subscribers.  Currently always true for public streams (i.e. invite_only=False implies history_public_to_subscribers=True), but clients should not make that assumption, as we may change that behavior in the future. 
   **/
  public Subscriptions historyPublicToSubscribers(Boolean historyPublicToSubscribers) {
    this.historyPublicToSubscribers = historyPublicToSubscribers;
    return this;
  }

  
  @ApiModelProperty(value = "Whether the history of the stream is public to its subscribers.  Currently always true for public streams (i.e. invite_only=False implies history_public_to_subscribers=True), but clients should not make that assumption, as we may change that behavior in the future. ")
  @JsonProperty("history_public_to_subscribers")
  public Boolean getHistoryPublicToSubscribers() {
    return historyPublicToSubscribers;
  }
  public void setHistoryPublicToSubscribers(Boolean historyPublicToSubscribers) {
    this.historyPublicToSubscribers = historyPublicToSubscribers;
  }

  /**
   * The id of the first message in the stream.  Intended to help clients determine whether they need to display UI like the \"more topics\" widget that would suggest the stream has older history that can be accessed.  Null is used for streams with no message history. 
   **/
  public Subscriptions firstMessageId(Integer firstMessageId) {
    this.firstMessageId = firstMessageId;
    return this;
  }

  
  @ApiModelProperty(value = "The id of the first message in the stream.  Intended to help clients determine whether they need to display UI like the \"more topics\" widget that would suggest the stream has older history that can be accessed.  Null is used for streams with no message history. ")
  @JsonProperty("first_message_id")
  public Integer getFirstMessageId() {
    return firstMessageId;
  }
  public void setFirstMessageId(Integer firstMessageId) {
    this.firstMessageId = firstMessageId;
  }

  /**
   * The average number of messages sent to the stream in recent weeks, rounded to the nearest integer.  Null means the stream was recently created and there is insufficient data to estimate the average traffic. 
   **/
  public Subscriptions streamWeeklyTraffic(Integer streamWeeklyTraffic) {
    this.streamWeeklyTraffic = streamWeeklyTraffic;
    return this;
  }

  
  @ApiModelProperty(value = "The average number of messages sent to the stream in recent weeks, rounded to the nearest integer.  Null means the stream was recently created and there is insufficient data to estimate the average traffic. ")
  @JsonProperty("stream_weekly_traffic")
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
    return Objects.equals(streamId, subscriptions.streamId) &&
        Objects.equals(name, subscriptions.name) &&
        Objects.equals(description, subscriptions.description) &&
        Objects.equals(renderedDescription, subscriptions.renderedDescription) &&
        Objects.equals(dateCreated, subscriptions.dateCreated) &&
        Objects.equals(inviteOnly, subscriptions.inviteOnly) &&
        Objects.equals(subscribers, subscriptions.subscribers) &&
        Objects.equals(desktopNotifications, subscriptions.desktopNotifications) &&
        Objects.equals(emailNotifications, subscriptions.emailNotifications) &&
        Objects.equals(wildcardMentionsNotify, subscriptions.wildcardMentionsNotify) &&
        Objects.equals(pushNotifications, subscriptions.pushNotifications) &&
        Objects.equals(audibleNotifications, subscriptions.audibleNotifications) &&
        Objects.equals(pinToTop, subscriptions.pinToTop) &&
        Objects.equals(emailAddress, subscriptions.emailAddress) &&
        Objects.equals(isMuted, subscriptions.isMuted) &&
        Objects.equals(inHomeView, subscriptions.inHomeView) &&
        Objects.equals(isAnnouncementOnly, subscriptions.isAnnouncementOnly) &&
        Objects.equals(isWebPublic, subscriptions.isWebPublic) &&
        Objects.equals(role, subscriptions.role) &&
        Objects.equals(color, subscriptions.color) &&
        Objects.equals(streamPostPolicy, subscriptions.streamPostPolicy) &&
        Objects.equals(messageRetentionDays, subscriptions.messageRetentionDays) &&
        Objects.equals(historyPublicToSubscribers, subscriptions.historyPublicToSubscribers) &&
        Objects.equals(firstMessageId, subscriptions.firstMessageId) &&
        Objects.equals(streamWeeklyTraffic, subscriptions.streamWeeklyTraffic);
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

