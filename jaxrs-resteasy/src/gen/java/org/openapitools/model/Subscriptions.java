package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2021-08-08T20:40:06.005587Z[Etc/UTC]")
public class Subscriptions   {
  
  private Integer streamId;
  private String name;
  private String description;
  private String renderedDescription;
  private Integer dateCreated;
  private Boolean inviteOnly;
  private List<Integer> subscribers = new ArrayList<Integer>();
  private Boolean desktopNotifications;
  private Boolean emailNotifications;
  private Boolean wildcardMentionsNotify;
  private Boolean pushNotifications;
  private Boolean audibleNotifications;
  private Boolean pinToTop;
  private String emailAddress;
  private Boolean isMuted;
  private Boolean inHomeView;
  private Boolean isAnnouncementOnly;
  private Boolean isWebPublic;

  /**
   * The user&#39;s role within the stream (distinct from the user&#39;s [organization-level role](/help/roles-and-permissions)). Valid values are:  * 20 &#x3D;&gt; Stream administrator. * 50 &#x3D;&gt; Subscriber.  **Changes**: New in Zulip 4.0 (feature level 31). 
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
  }

  private RoleEnum role;
  private String color;
  private Integer streamPostPolicy;
  private Integer messageRetentionDays;
  private Boolean historyPublicToSubscribers;
  private Integer firstMessageId;
  private Integer streamWeeklyTraffic;

  /**
   * The unique ID of a stream. 
   **/
  
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
  
  @ApiModelProperty(value = "The name of a stream. ")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   * The short description of a stream in text/markdown format, intended to be used to prepopulate UI for editing a stream&#39;s description. 
   **/
  
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
  
  @ApiModelProperty(value = "Specifies whether the stream is private or not. Only people who have been invited can access a private stream. ")
  @JsonProperty("invite_only")
  public Boolean getInviteOnly() {
    return inviteOnly;
  }
  public void setInviteOnly(Boolean inviteOnly) {
    this.inviteOnly = inviteOnly;
  }

  /**
   * A list of user IDs of users who are also subscribed to a given stream. Included only if &#x60;include_subscribers&#x60; is &#x60;true&#x60;. 
   **/
  
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
  
  @ApiModelProperty(value = "Email address of the given stream, used for [sending emails to the stream](/help/message-a-stream-by-email). ")
  @JsonProperty("email_address")
  public String getEmailAddress() {
    return emailAddress;
  }
  public void setEmailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
  }

  /**
   * Whether the user has muted the stream. Muted streams do not count towards your total unread count and do not show up in &#x60;All messages&#x60; view (previously known as &#x60;Home&#x60; view).  **Changes**: Prior to Zulip 2.1, this feature was represented by the more confusingly named &#x60;in_home_view&#x60; (with the opposite value, &#x60;in_home_view&#x3D;!is_muted&#x60;). 
   **/
  
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
  
  @ApiModelProperty(value = "Legacy property for if the given stream is muted, with inverted meeting.  **Deprecated**; clients should use is_muted where available. ")
  @JsonProperty("in_home_view")
  public Boolean getInHomeView() {
    return inHomeView;
  }
  public void setInHomeView(Boolean inHomeView) {
    this.inHomeView = inHomeView;
  }

  /**
   * Whether only organization administrators can post to the stream.  **Changes**: Deprecated in Zulip 3.0 (feature level 1), use &#x60;stream_post_policy&#x60; instead. 
   **/
  
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
  
  @ApiModelProperty(value = "Whether the stream has been configured to allow unauthenticated access to its message history from the web. ")
  @JsonProperty("is_web_public")
  public Boolean getIsWebPublic() {
    return isWebPublic;
  }
  public void setIsWebPublic(Boolean isWebPublic) {
    this.isWebPublic = isWebPublic;
  }

  /**
   * The user&#39;s role within the stream (distinct from the user&#39;s [organization-level role](/help/roles-and-permissions)). Valid values are:  * 20 &#x3D;&gt; Stream administrator. * 50 &#x3D;&gt; Subscriber.  **Changes**: New in Zulip 4.0 (feature level 31). 
   **/
  
  @ApiModelProperty(value = "The user's role within the stream (distinct from the user's [organization-level role](/help/roles-and-permissions)). Valid values are:  * 20 => Stream administrator. * 50 => Subscriber.  **Changes**: New in Zulip 4.0 (feature level 31). ")
  @JsonProperty("role")
  public RoleEnum getRole() {
    return role;
  }
  public void setRole(RoleEnum role) {
    this.role = role;
  }

  /**
   * The user&#39;s personal color for the stream. 
   **/
  
  @ApiModelProperty(value = "The user's personal color for the stream. ")
  @JsonProperty("color")
  public String getColor() {
    return color;
  }
  public void setColor(String color) {
    this.color = color;
  }

  /**
   * Policy for which users can post messages to the stream.  * 1 &#x3D;&gt; Any user can post. * 2 &#x3D;&gt; Only administrators can post. * 3 &#x3D;&gt; Only full members can post. * 4 &#x3D;&gt; Only moderators can post.  **Changes**: New in Zulip 3.0, replacing the previous &#x60;is_announcement_only&#x60; boolean. 
   **/
  
  @ApiModelProperty(value = "Policy for which users can post messages to the stream.  * 1 => Any user can post. * 2 => Only administrators can post. * 3 => Only full members can post. * 4 => Only moderators can post.  **Changes**: New in Zulip 3.0, replacing the previous `is_announcement_only` boolean. ")
  @JsonProperty("stream_post_policy")
  public Integer getStreamPostPolicy() {
    return streamPostPolicy;
  }
  public void setStreamPostPolicy(Integer streamPostPolicy) {
    this.streamPostPolicy = streamPostPolicy;
  }

  /**
   * Number of days that messages sent to this stream will be stored before being automatically deleted by the [message retention policy](/help/message-retention-policy).  There are two special values:  * &#x60;null&#x60;, the default, means the stream will inherit the organization   level setting. * &#x60;-1&#x60; encodes retaining messages in this stream forever.  **Changes**: New in Zulip 3.0 (feature level 17). 
   **/
  
  @ApiModelProperty(value = "Number of days that messages sent to this stream will be stored before being automatically deleted by the [message retention policy](/help/message-retention-policy).  There are two special values:  * `null`, the default, means the stream will inherit the organization   level setting. * `-1` encodes retaining messages in this stream forever.  **Changes**: New in Zulip 3.0 (feature level 17). ")
  @JsonProperty("message_retention_days")
  public Integer getMessageRetentionDays() {
    return messageRetentionDays;
  }
  public void setMessageRetentionDays(Integer messageRetentionDays) {
    this.messageRetentionDays = messageRetentionDays;
  }

  /**
   * Whether the history of the stream is public to its subscribers.  Currently always true for public streams (i.e. invite_only&#x3D;False implies history_public_to_subscribers&#x3D;True), but clients should not make that assumption, as we may change that behavior in the future. 
   **/
  
  @ApiModelProperty(value = "Whether the history of the stream is public to its subscribers.  Currently always true for public streams (i.e. invite_only=False implies history_public_to_subscribers=True), but clients should not make that assumption, as we may change that behavior in the future. ")
  @JsonProperty("history_public_to_subscribers")
  public Boolean getHistoryPublicToSubscribers() {
    return historyPublicToSubscribers;
  }
  public void setHistoryPublicToSubscribers(Boolean historyPublicToSubscribers) {
    this.historyPublicToSubscribers = historyPublicToSubscribers;
  }

  /**
   * The id of the first message in the stream.  Intended to help clients determine whether they need to display UI like the \&quot;more topics\&quot; widget that would suggest the stream has older history that can be accessed.  Null is used for streams with no message history. 
   **/
  
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

