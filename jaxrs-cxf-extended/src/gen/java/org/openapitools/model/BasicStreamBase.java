package org.openapitools.model;

import io.swagger.annotations.ApiModel;
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


/**
 * Object containing basic details about the stream. 
 */
@ApiModel(description="Object containing basic details about the stream. ")

public class BasicStreamBase  {
  
 /**
  * The unique ID of the stream. 
  */
  @ApiModelProperty(value = "The unique ID of the stream. ")
  private Integer streamId;

 /**
  * The name of the stream. 
  */
  @ApiModelProperty(value = "The name of the stream. ")
  private String name;

 /**
  * The short description of the stream in text/markdown format, intended to be used to prepopulate UI for editing a stream's description. 
  */
  @ApiModelProperty(value = "The short description of the stream in text/markdown format, intended to be used to prepopulate UI for editing a stream's description. ")
  private String description;

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
  * The short description of the stream rendered as HTML, intended to be used when displaying the stream description in a UI.  One should use the standard Zulip rendered_markdown CSS when displaying this content so that emoji, LaTeX, and other syntax work correctly.  And any client-side security logic for user-generated message content should be applied when displaying this HTML as though it were the body of a Zulip message. 
  */
  @ApiModelProperty(value = "The short description of the stream rendered as HTML, intended to be used when displaying the stream description in a UI.  One should use the standard Zulip rendered_markdown CSS when displaying this content so that emoji, LaTeX, and other syntax work correctly.  And any client-side security logic for user-generated message content should be applied when displaying this HTML as though it were the body of a Zulip message. ")
  private String renderedDescription;

 /**
  * Whether the stream has been configured to allow unauthenticated access to its message history from the web. 
  */
  @ApiModelProperty(value = "Whether the stream has been configured to allow unauthenticated access to its message history from the web. ")
  private Boolean isWebPublic;

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
  * Whether the given stream is announcement only or not.  **Changes**: Deprecated in Zulip 3.0 (feature level 1), use `stream_post_policy` instead. 
  */
  @ApiModelProperty(value = "Whether the given stream is announcement only or not.  **Changes**: Deprecated in Zulip 3.0 (feature level 1), use `stream_post_policy` instead. ")
  private Boolean isAnnouncementOnly;
 /**
  * The unique ID of the stream. 
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
  public BasicStreamBase streamId(Integer streamId) {
    this.streamId = streamId;
    return this;
  }

 /**
  * The name of the stream. 
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
  public BasicStreamBase name(String name) {
    this.name = name;
    return this;
  }

 /**
  * The short description of the stream in text/markdown format, intended to be used to prepopulate UI for editing a stream&#39;s description. 
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
  public BasicStreamBase description(String description) {
    this.description = description;
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
  public BasicStreamBase dateCreated(Integer dateCreated) {
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
  public BasicStreamBase inviteOnly(Boolean inviteOnly) {
    this.inviteOnly = inviteOnly;
    return this;
  }

 /**
  * The short description of the stream rendered as HTML, intended to be used when displaying the stream description in a UI.  One should use the standard Zulip rendered_markdown CSS when displaying this content so that emoji, LaTeX, and other syntax work correctly.  And any client-side security logic for user-generated message content should be applied when displaying this HTML as though it were the body of a Zulip message. 
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
  public BasicStreamBase renderedDescription(String renderedDescription) {
    this.renderedDescription = renderedDescription;
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
  public BasicStreamBase isWebPublic(Boolean isWebPublic) {
    this.isWebPublic = isWebPublic;
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
  public BasicStreamBase streamPostPolicy(Integer streamPostPolicy) {
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
  public BasicStreamBase messageRetentionDays(Integer messageRetentionDays) {
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
  public BasicStreamBase historyPublicToSubscribers(Boolean historyPublicToSubscribers) {
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
  public BasicStreamBase firstMessageId(Integer firstMessageId) {
    this.firstMessageId = firstMessageId;
    return this;
  }

 /**
  * Whether the given stream is announcement only or not.  **Changes**: Deprecated in Zulip 3.0 (feature level 1), use &#x60;stream_post_policy&#x60; instead. 
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
  public BasicStreamBase isAnnouncementOnly(Boolean isAnnouncementOnly) {
    this.isAnnouncementOnly = isAnnouncementOnly;
    return this;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

