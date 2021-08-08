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


package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * &#x60;{emoji_id}&#x60;: Object containing details about the emoji with  the specified ID. It has the following properties: 
 */
@ApiModel(description = "`{emoji_id}`: Object containing details about the emoji with  the specified ID. It has the following properties: ")
@JsonPropertyOrder({
  RealmEmoji.JSON_PROPERTY_ID,
  RealmEmoji.JSON_PROPERTY_NAME,
  RealmEmoji.JSON_PROPERTY_SOURCE_URL,
  RealmEmoji.JSON_PROPERTY_DEACTIVATED,
  RealmEmoji.JSON_PROPERTY_AUTHOR_ID
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2021-08-08T21:12:13.281187Z[Etc/UTC]")
public class RealmEmoji   {
  public static final String JSON_PROPERTY_ID = "id";
  @JsonProperty(JSON_PROPERTY_ID)
  private String id;

  public static final String JSON_PROPERTY_NAME = "name";
  @JsonProperty(JSON_PROPERTY_NAME)
  private String name;

  public static final String JSON_PROPERTY_SOURCE_URL = "source_url";
  @JsonProperty(JSON_PROPERTY_SOURCE_URL)
  private String sourceUrl;

  public static final String JSON_PROPERTY_DEACTIVATED = "deactivated";
  @JsonProperty(JSON_PROPERTY_DEACTIVATED)
  private Boolean deactivated;

  public static final String JSON_PROPERTY_AUTHOR_ID = "author_id";
  @JsonProperty(JSON_PROPERTY_AUTHOR_ID)
  private Integer authorId;

  public RealmEmoji id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The ID for this emoji, same as the object&#39;s key. 
   * @return id
   **/
  @JsonProperty(value = "id")
  @ApiModelProperty(value = "The ID for this emoji, same as the object's key. ")
  
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public RealmEmoji name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The user-friendly name for this emoji. Users in the organization can use this emoji by writing this name between colons (&#x60;:name  :&#x60;). 
   * @return name
   **/
  @JsonProperty(value = "name")
  @ApiModelProperty(value = "The user-friendly name for this emoji. Users in the organization can use this emoji by writing this name between colons (`:name  :`). ")
  
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public RealmEmoji sourceUrl(String sourceUrl) {
    this.sourceUrl = sourceUrl;
    return this;
  }

  /**
   * The path relative to the organization&#39;s URL where the emoji&#39;s image can be found. 
   * @return sourceUrl
   **/
  @JsonProperty(value = "source_url")
  @ApiModelProperty(value = "The path relative to the organization's URL where the emoji's image can be found. ")
  
  public String getSourceUrl() {
    return sourceUrl;
  }

  public void setSourceUrl(String sourceUrl) {
    this.sourceUrl = sourceUrl;
  }

  public RealmEmoji deactivated(Boolean deactivated) {
    this.deactivated = deactivated;
    return this;
  }

  /**
   * Whether the emoji has been deactivated or not. 
   * @return deactivated
   **/
  @JsonProperty(value = "deactivated")
  @ApiModelProperty(value = "Whether the emoji has been deactivated or not. ")
  
  public Boolean getDeactivated() {
    return deactivated;
  }

  public void setDeactivated(Boolean deactivated) {
    this.deactivated = deactivated;
  }

  public RealmEmoji authorId(Integer authorId) {
    this.authorId = authorId;
    return this;
  }

  /**
   * The user ID of the user who uploaded the custom emoji. Will be null if the uploader is unknown.  **Changes**: New in Zulip 3.0 (feature level 7).  Previously was accessible via and &#x60;author&#x60; object with an &#x60;id&#x60; field. 
   * @return authorId
   **/
  @JsonProperty(value = "author_id")
  @ApiModelProperty(value = "The user ID of the user who uploaded the custom emoji. Will be null if the uploader is unknown.  **Changes**: New in Zulip 3.0 (feature level 7).  Previously was accessible via and `author` object with an `id` field. ")
  
  public Integer getAuthorId() {
    return authorId;
  }

  public void setAuthorId(Integer authorId) {
    this.authorId = authorId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RealmEmoji realmEmoji = (RealmEmoji) o;
    return Objects.equals(this.id, realmEmoji.id) &&
        Objects.equals(this.name, realmEmoji.name) &&
        Objects.equals(this.sourceUrl, realmEmoji.sourceUrl) &&
        Objects.equals(this.deactivated, realmEmoji.deactivated) &&
        Objects.equals(this.authorId, realmEmoji.authorId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, sourceUrl, deactivated, authorId);
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

