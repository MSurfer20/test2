package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Subscriptions   {
  
  private Integer streamId;
  private String name;
  private String description;
  private String renderedDescription;
  private Integer dateCreated;
  private Boolean inviteOnly;
  private List<Integer> subscribers = new ArrayList<>();
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


  public enum RoleEnum {
    NUMBER_20(20),
    NUMBER_50(50);

    private String value;

    RoleEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private RoleEnum role;
  private String color;
  private Integer streamPostPolicy;
  private Integer messageRetentionDays;
  private Boolean historyPublicToSubscribers;
  private Integer firstMessageId;
  private Integer streamWeeklyTraffic;

  public Subscriptions () {

  }

  public Subscriptions (Integer streamId, String name, String description, String renderedDescription, Integer dateCreated, Boolean inviteOnly, List<Integer> subscribers, Boolean desktopNotifications, Boolean emailNotifications, Boolean wildcardMentionsNotify, Boolean pushNotifications, Boolean audibleNotifications, Boolean pinToTop, String emailAddress, Boolean isMuted, Boolean inHomeView, Boolean isAnnouncementOnly, Boolean isWebPublic, RoleEnum role, String color, Integer streamPostPolicy, Integer messageRetentionDays, Boolean historyPublicToSubscribers, Integer firstMessageId, Integer streamWeeklyTraffic) {
    this.streamId = streamId;
    this.name = name;
    this.description = description;
    this.renderedDescription = renderedDescription;
    this.dateCreated = dateCreated;
    this.inviteOnly = inviteOnly;
    this.subscribers = subscribers;
    this.desktopNotifications = desktopNotifications;
    this.emailNotifications = emailNotifications;
    this.wildcardMentionsNotify = wildcardMentionsNotify;
    this.pushNotifications = pushNotifications;
    this.audibleNotifications = audibleNotifications;
    this.pinToTop = pinToTop;
    this.emailAddress = emailAddress;
    this.isMuted = isMuted;
    this.inHomeView = inHomeView;
    this.isAnnouncementOnly = isAnnouncementOnly;
    this.isWebPublic = isWebPublic;
    this.role = role;
    this.color = color;
    this.streamPostPolicy = streamPostPolicy;
    this.messageRetentionDays = messageRetentionDays;
    this.historyPublicToSubscribers = historyPublicToSubscribers;
    this.firstMessageId = firstMessageId;
    this.streamWeeklyTraffic = streamWeeklyTraffic;
  }

    
  @JsonProperty("stream_id")
  public Integer getStreamId() {
    return streamId;
  }
  public void setStreamId(Integer streamId) {
    this.streamId = streamId;
  }

    
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

    
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

    
  @JsonProperty("rendered_description")
  public String getRenderedDescription() {
    return renderedDescription;
  }
  public void setRenderedDescription(String renderedDescription) {
    this.renderedDescription = renderedDescription;
  }

    
  @JsonProperty("date_created")
  public Integer getDateCreated() {
    return dateCreated;
  }
  public void setDateCreated(Integer dateCreated) {
    this.dateCreated = dateCreated;
  }

    
  @JsonProperty("invite_only")
  public Boolean getInviteOnly() {
    return inviteOnly;
  }
  public void setInviteOnly(Boolean inviteOnly) {
    this.inviteOnly = inviteOnly;
  }

    
  @JsonProperty("subscribers")
  public List<Integer> getSubscribers() {
    return subscribers;
  }
  public void setSubscribers(List<Integer> subscribers) {
    this.subscribers = subscribers;
  }

    
  @JsonProperty("desktop_notifications")
  public Boolean getDesktopNotifications() {
    return desktopNotifications;
  }
  public void setDesktopNotifications(Boolean desktopNotifications) {
    this.desktopNotifications = desktopNotifications;
  }

    
  @JsonProperty("email_notifications")
  public Boolean getEmailNotifications() {
    return emailNotifications;
  }
  public void setEmailNotifications(Boolean emailNotifications) {
    this.emailNotifications = emailNotifications;
  }

    
  @JsonProperty("wildcard_mentions_notify")
  public Boolean getWildcardMentionsNotify() {
    return wildcardMentionsNotify;
  }
  public void setWildcardMentionsNotify(Boolean wildcardMentionsNotify) {
    this.wildcardMentionsNotify = wildcardMentionsNotify;
  }

    
  @JsonProperty("push_notifications")
  public Boolean getPushNotifications() {
    return pushNotifications;
  }
  public void setPushNotifications(Boolean pushNotifications) {
    this.pushNotifications = pushNotifications;
  }

    
  @JsonProperty("audible_notifications")
  public Boolean getAudibleNotifications() {
    return audibleNotifications;
  }
  public void setAudibleNotifications(Boolean audibleNotifications) {
    this.audibleNotifications = audibleNotifications;
  }

    
  @JsonProperty("pin_to_top")
  public Boolean getPinToTop() {
    return pinToTop;
  }
  public void setPinToTop(Boolean pinToTop) {
    this.pinToTop = pinToTop;
  }

    
  @JsonProperty("email_address")
  public String getEmailAddress() {
    return emailAddress;
  }
  public void setEmailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
  }

    
  @JsonProperty("is_muted")
  public Boolean getIsMuted() {
    return isMuted;
  }
  public void setIsMuted(Boolean isMuted) {
    this.isMuted = isMuted;
  }

    
  @JsonProperty("in_home_view")
  public Boolean getInHomeView() {
    return inHomeView;
  }
  public void setInHomeView(Boolean inHomeView) {
    this.inHomeView = inHomeView;
  }

    
  @JsonProperty("is_announcement_only")
  public Boolean getIsAnnouncementOnly() {
    return isAnnouncementOnly;
  }
  public void setIsAnnouncementOnly(Boolean isAnnouncementOnly) {
    this.isAnnouncementOnly = isAnnouncementOnly;
  }

    
  @JsonProperty("is_web_public")
  public Boolean getIsWebPublic() {
    return isWebPublic;
  }
  public void setIsWebPublic(Boolean isWebPublic) {
    this.isWebPublic = isWebPublic;
  }

    
  @JsonProperty("role")
  public RoleEnum getRole() {
    return role;
  }
  public void setRole(RoleEnum role) {
    this.role = role;
  }

    
  @JsonProperty("color")
  public String getColor() {
    return color;
  }
  public void setColor(String color) {
    this.color = color;
  }

    
  @JsonProperty("stream_post_policy")
  public Integer getStreamPostPolicy() {
    return streamPostPolicy;
  }
  public void setStreamPostPolicy(Integer streamPostPolicy) {
    this.streamPostPolicy = streamPostPolicy;
  }

    
  @JsonProperty("message_retention_days")
  public Integer getMessageRetentionDays() {
    return messageRetentionDays;
  }
  public void setMessageRetentionDays(Integer messageRetentionDays) {
    this.messageRetentionDays = messageRetentionDays;
  }

    
  @JsonProperty("history_public_to_subscribers")
  public Boolean getHistoryPublicToSubscribers() {
    return historyPublicToSubscribers;
  }
  public void setHistoryPublicToSubscribers(Boolean historyPublicToSubscribers) {
    this.historyPublicToSubscribers = historyPublicToSubscribers;
  }

    
  @JsonProperty("first_message_id")
  public Integer getFirstMessageId() {
    return firstMessageId;
  }
  public void setFirstMessageId(Integer firstMessageId) {
    this.firstMessageId = firstMessageId;
  }

    
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
