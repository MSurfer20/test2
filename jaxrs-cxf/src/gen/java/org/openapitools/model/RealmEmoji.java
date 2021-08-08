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
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * `{emoji_id}`: Object containing details about the emoji with  the specified ID. It has the following properties: 
 **/
@ApiModel(description="`{emoji_id}`: Object containing details about the emoji with  the specified ID. It has the following properties: ")
public class RealmEmoji  {
  
  @ApiModelProperty(value = "The ID for this emoji, same as the object's key. ")
 /**
   * The ID for this emoji, same as the object's key. 
  **/
  private String id;

  @ApiModelProperty(value = "The user-friendly name for this emoji. Users in the organization can use this emoji by writing this name between colons (`:name  :`). ")
 /**
   * The user-friendly name for this emoji. Users in the organization can use this emoji by writing this name between colons (`:name  :`). 
  **/
  private String name;

  @ApiModelProperty(value = "The path relative to the organization's URL where the emoji's image can be found. ")
 /**
   * The path relative to the organization's URL where the emoji's image can be found. 
  **/
  private String sourceUrl;

  @ApiModelProperty(value = "Whether the emoji has been deactivated or not. ")
 /**
   * Whether the emoji has been deactivated or not. 
  **/
  private Boolean deactivated;

  @ApiModelProperty(value = "The user ID of the user who uploaded the custom emoji. Will be null if the uploader is unknown.  **Changes**: New in Zulip 3.0 (feature level 7).  Previously was accessible via and `author` object with an `id` field. ")
 /**
   * The user ID of the user who uploaded the custom emoji. Will be null if the uploader is unknown.  **Changes**: New in Zulip 3.0 (feature level 7).  Previously was accessible via and `author` object with an `id` field. 
  **/
  private Integer authorId;
 /**
   * The ID for this emoji, same as the object&#39;s key. 
   * @return id
  **/
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public RealmEmoji id(String id) {
    this.id = id;
    return this;
  }

 /**
   * The user-friendly name for this emoji. Users in the organization can use this emoji by writing this name between colons (&#x60;:name  :&#x60;). 
   * @return name
  **/
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public RealmEmoji name(String name) {
    this.name = name;
    return this;
  }

 /**
   * The path relative to the organization&#39;s URL where the emoji&#39;s image can be found. 
   * @return sourceUrl
  **/
  @JsonProperty("source_url")
  public String getSourceUrl() {
    return sourceUrl;
  }

  public void setSourceUrl(String sourceUrl) {
    this.sourceUrl = sourceUrl;
  }

  public RealmEmoji sourceUrl(String sourceUrl) {
    this.sourceUrl = sourceUrl;
    return this;
  }

 /**
   * Whether the emoji has been deactivated or not. 
   * @return deactivated
  **/
  @JsonProperty("deactivated")
  public Boolean getDeactivated() {
    return deactivated;
  }

  public void setDeactivated(Boolean deactivated) {
    this.deactivated = deactivated;
  }

  public RealmEmoji deactivated(Boolean deactivated) {
    this.deactivated = deactivated;
    return this;
  }

 /**
   * The user ID of the user who uploaded the custom emoji. Will be null if the uploader is unknown.  **Changes**: New in Zulip 3.0 (feature level 7).  Previously was accessible via and &#x60;author&#x60; object with an &#x60;id&#x60; field. 
   * @return authorId
  **/
  @JsonProperty("author_id")
  public Integer getAuthorId() {
    return authorId;
  }

  public void setAuthorId(Integer authorId) {
    this.authorId = authorId;
  }

  public RealmEmoji authorId(Integer authorId) {
    this.authorId = authorId;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RealmEmoji {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    sourceUrl: ").append(toIndentedString(sourceUrl)).append("\n");
    sb.append("    deactivated: ").append(toIndentedString(deactivated)).append("\n");
    sb.append("    authorId: ").append(toIndentedString(authorId)).append("\n");
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

