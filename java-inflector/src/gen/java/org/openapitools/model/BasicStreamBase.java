package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Object containing basic details about the stream. 
 **/

@ApiModel(description = "Object containing basic details about the stream. ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2021-08-08T21:19:21.039467Z[Etc/UTC]")
public class BasicStreamBase   {
  @JsonProperty("stream_id")
  private Integer streamId;

  @JsonProperty("name")
  private String name;

  @JsonProperty("description")
  private String description;

  @JsonProperty("date_created")
  private Integer dateCreated;

  @JsonProperty("invite_only")
  private Boolean inviteOnly;

  @JsonProperty("rendered_description")
  private String renderedDescription;

  @JsonProperty("is_web_public")
  private Boolean isWebPublic;

  @JsonProperty("stream_post_policy")
  private Integer streamPostPolicy;

  @JsonProperty("message_retention_days")
  private Integer messageRetentionDays;

  @JsonProperty("history_public_to_subscribers")
  private Boolean historyPublicToSubscribers;

  @JsonProperty("first_message_id")
  private Integer firstMessageId;

  @JsonProperty("is_announcement_only")
  private Boolean isAnnouncementOnly;

  /**
   * The unique ID of the stream. 
   **/
  public BasicStreamBase streamId(Integer streamId) {
    this.streamId = streamId;
    return this;
  }

  
  @ApiModelProperty(value = "The unique ID of the stream. ")
  @JsonProperty("stream_id")
  public Integer getStreamId() {
    return streamId;
  }
  public void setStreamId(Integer streamId) {
    this.streamId = streamId;
  }

  /**
   * The name of the stream. 
   **/
  public BasicStreamBase name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(value = "The name of the stream. ")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   * The short description of the stream in text/markdown format, intended to be used to prepopulate UI for editing a stream's description. 
   **/
  public BasicStreamBase description(String description) {
    this.description = description;
    return this;
  }

  
  @ApiModelProperty(value = "The short description of the stream in text/markdown format, intended to be used to prepopulate UI for editing a stream's description. ")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * The UNIX timestamp for when the stream was created, in UTC seconds.  **Changes**: New in Zulip 4.0 (feature level 30). 
   **/
  public BasicStreamBase dateCreated(Integer dateCreated) {
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
  public BasicStreamBase inviteOnly(Boolean inviteOnly) {
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
   * The short description of the stream rendered as HTML, intended to be used when displaying the stream description in a UI.  One should use the standard Zulip rendered_markdown CSS when displaying this content so that emoji, LaTeX, and other syntax work correctly.  And any client-side security logic for user-generated message content should be applied when displaying this HTML as though it were the body of a Zulip message. 
   **/
  public BasicStreamBase renderedDescription(String renderedDescription) {
    this.renderedDescription = renderedDescription;
    return this;
  }

  
  @ApiModelProperty(value = "The short description of the stream rendered as HTML, intended to be used when displaying the stream description in a UI.  One should use the standard Zulip rendered_markdown CSS when displaying this content so that emoji, LaTeX, and other syntax work correctly.  And any client-side security logic for user-generated message content should be applied when displaying this HTML as though it were the body of a Zulip message. ")
  @JsonProperty("rendered_description")
  public String getRenderedDescription() {
    return renderedDescription;
  }
  public void setRenderedDescription(String renderedDescription) {
    this.renderedDescription = renderedDescription;
  }

  /**
   * Whether the stream has been configured to allow unauthenticated access to its message history from the web. 
   **/
  public BasicStreamBase isWebPublic(Boolean isWebPublic) {
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
   * Policy for which users can post messages to the stream.  * 1 => Any user can post. * 2 => Only administrators can post. * 3 => Only full members can post. * 4 => Only moderators can post.  **Changes**: New in Zulip 3.0, replacing the previous `is_announcement_only` boolean. 
   **/
  public BasicStreamBase streamPostPolicy(Integer streamPostPolicy) {
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
  public BasicStreamBase messageRetentionDays(Integer messageRetentionDays) {
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
  public BasicStreamBase historyPublicToSubscribers(Boolean historyPublicToSubscribers) {
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
  public BasicStreamBase firstMessageId(Integer firstMessageId) {
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
   * Whether the given stream is announcement only or not.  **Changes**: Deprecated in Zulip 3.0 (feature level 1), use `stream_post_policy` instead. 
   **/
  public BasicStreamBase isAnnouncementOnly(Boolean isAnnouncementOnly) {
    this.isAnnouncementOnly = isAnnouncementOnly;
    return this;
  }

  
  @ApiModelProperty(value = "Whether the given stream is announcement only or not.  **Changes**: Deprecated in Zulip 3.0 (feature level 1), use `stream_post_policy` instead. ")
  @JsonProperty("is_announcement_only")
  public Boolean getIsAnnouncementOnly() {
    return isAnnouncementOnly;
  }
  public void setIsAnnouncementOnly(Boolean isAnnouncementOnly) {
    this.isAnnouncementOnly = isAnnouncementOnly;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BasicStreamBase basicStreamBase = (BasicStreamBase) o;
    return Objects.equals(streamId, basicStreamBase.streamId) &&
        Objects.equals(name, basicStreamBase.name) &&
        Objects.equals(description, basicStreamBase.description) &&
        Objects.equals(dateCreated, basicStreamBase.dateCreated) &&
        Objects.equals(inviteOnly, basicStreamBase.inviteOnly) &&
        Objects.equals(renderedDescription, basicStreamBase.renderedDescription) &&
        Objects.equals(isWebPublic, basicStreamBase.isWebPublic) &&
        Objects.equals(streamPostPolicy, basicStreamBase.streamPostPolicy) &&
        Objects.equals(messageRetentionDays, basicStreamBase.messageRetentionDays) &&
        Objects.equals(historyPublicToSubscribers, basicStreamBase.historyPublicToSubscribers) &&
        Objects.equals(firstMessageId, basicStreamBase.firstMessageId) &&
        Objects.equals(isAnnouncementOnly, basicStreamBase.isAnnouncementOnly);
  }

  @Override
  public int hashCode() {
    return Objects.hash(streamId, name, description, dateCreated, inviteOnly, renderedDescription, isWebPublic, streamPostPolicy, messageRetentionDays, historyPublicToSubscribers, firstMessageId, isAnnouncementOnly);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BasicStreamBase {\n");
    
    sb.append("    streamId: ").append(toIndentedString(streamId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    inviteOnly: ").append(toIndentedString(inviteOnly)).append("\n");
    sb.append("    renderedDescription: ").append(toIndentedString(renderedDescription)).append("\n");
    sb.append("    isWebPublic: ").append(toIndentedString(isWebPublic)).append("\n");
    sb.append("    streamPostPolicy: ").append(toIndentedString(streamPostPolicy)).append("\n");
    sb.append("    messageRetentionDays: ").append(toIndentedString(messageRetentionDays)).append("\n");
    sb.append("    historyPublicToSubscribers: ").append(toIndentedString(historyPublicToSubscribers)).append("\n");
    sb.append("    firstMessageId: ").append(toIndentedString(firstMessageId)).append("\n");
    sb.append("    isAnnouncementOnly: ").append(toIndentedString(isAnnouncementOnly)).append("\n");
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

