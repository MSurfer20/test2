package apimodels;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * Subscriptions
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2021-08-08T20:41:53.018098Z[Etc/UTC]")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
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

    private final Integer value;

    RoleEnum(Integer value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static RoleEnum fromValue(Integer value) {
      for (RoleEnum b : RoleEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
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

  public Subscriptions streamId(Integer streamId) {
    this.streamId = streamId;
    return this;
  }

   /**
   * The unique ID of a stream. 
   * @return streamId
  **/
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
   * The short description of a stream in text/markdown format, intended to be used to prepopulate UI for editing a stream's description. 
   * @return description
  **/
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
    if (subscribers == null) {
      subscribers = new ArrayList<>();
    }
    subscribers.add(subscribersItem);
    return this;
  }

   /**
   * A list of user IDs of users who are also subscribed to a given stream. Included only if `include_subscribers` is `true`. 
   * @return subscribers
  **/
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
   * Whether the user has muted the stream. Muted streams do not count towards your total unread count and do not show up in `All messages` view (previously known as `Home` view).  **Changes**: Prior to Zulip 2.1, this feature was represented by the more confusingly named `in_home_view` (with the opposite value, `in_home_view=!is_muted`). 
   * @return isMuted
  **/
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
   * Whether only organization administrators can post to the stream.  **Changes**: Deprecated in Zulip 3.0 (feature level 1), use `stream_post_policy` instead. 
   * @return isAnnouncementOnly
  **/
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
   * The user's role within the stream (distinct from the user's [organization-level role](/help/roles-and-permissions)). Valid values are:  * 20 => Stream administrator. * 50 => Subscriber.  **Changes**: New in Zulip 4.0 (feature level 31). 
   * @return role
  **/
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
   * The user's personal color for the stream. 
   * @return color
  **/
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
   * Policy for which users can post messages to the stream.  * 1 => Any user can post. * 2 => Only administrators can post. * 3 => Only full members can post. * 4 => Only moderators can post.  **Changes**: New in Zulip 3.0, replacing the previous `is_announcement_only` boolean. 
   * @return streamPostPolicy
  **/
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
   * Number of days that messages sent to this stream will be stored before being automatically deleted by the [message retention policy](/help/message-retention-policy).  There are two special values:  * `null`, the default, means the stream will inherit the organization   level setting. * `-1` encodes retaining messages in this stream forever.  **Changes**: New in Zulip 3.0 (feature level 17). 
   * @return messageRetentionDays
  **/
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
   * Whether the history of the stream is public to its subscribers.  Currently always true for public streams (i.e. invite_only=False implies history_public_to_subscribers=True), but clients should not make that assumption, as we may change that behavior in the future. 
   * @return historyPublicToSubscribers
  **/
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
   * The id of the first message in the stream.  Intended to help clients determine whether they need to display UI like the \"more topics\" widget that would suggest the stream has older history that can be accessed.  Null is used for streams with no message history. 
   * @return firstMessageId
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

