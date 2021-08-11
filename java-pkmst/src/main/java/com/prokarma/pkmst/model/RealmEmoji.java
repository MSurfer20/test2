package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * &#x60;{emoji_id}&#x60;: Object containing details about the emoji with  the specified ID. It has the following properties: 
 */
@ApiModel(description = "`{emoji_id}`: Object containing details about the emoji with  the specified ID. It has the following properties: ")

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen")
public class RealmEmoji   {
  @JsonProperty("id")
  private String id;

  @JsonProperty("name")
  private String name;

  @JsonProperty("source_url")
  private String sourceUrl;

  @JsonProperty("deactivated")
  private Boolean deactivated;

  @JsonProperty("author_id")
  private Integer authorId;

  public RealmEmoji id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The ID for this emoji, same as the object's key. 
   * @return id
  **/
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
   * The user-friendly name for this emoji. Users in the organization can use this emoji by writing this name between colons (`:name  :`). 
   * @return name
  **/
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
   * The path relative to the organization's URL where the emoji's image can be found. 
   * @return sourceUrl
  **/
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
   * The user ID of the user who uploaded the custom emoji. Will be null if the uploader is unknown.  **Changes**: New in Zulip 3.0 (feature level 7).  Previously was accessible via and `author` object with an `id` field. 
   * @return authorId
  **/
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

