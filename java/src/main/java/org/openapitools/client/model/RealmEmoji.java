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

/**
 * &#x60;{emoji_id}&#x60;: Object containing details about the emoji with  the specified ID. It has the following properties: 
 */
@ApiModel(description = "`{emoji_id}`: Object containing details about the emoji with  the specified ID. It has the following properties: ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class RealmEmoji {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_SOURCE_URL = "source_url";
  @SerializedName(SERIALIZED_NAME_SOURCE_URL)
  private String sourceUrl;

  public static final String SERIALIZED_NAME_DEACTIVATED = "deactivated";
  @SerializedName(SERIALIZED_NAME_DEACTIVATED)
  private Boolean deactivated;

  public static final String SERIALIZED_NAME_AUTHOR_ID = "author_id";
  @SerializedName(SERIALIZED_NAME_AUTHOR_ID)
  private Integer authorId;


  public RealmEmoji id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * The ID for this emoji, same as the object&#39;s key. 
   * @return id
  **/
  @javax.annotation.Nullable
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
  @javax.annotation.Nullable
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
  @javax.annotation.Nullable
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
  @javax.annotation.Nullable
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
  @javax.annotation.Nullable
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

