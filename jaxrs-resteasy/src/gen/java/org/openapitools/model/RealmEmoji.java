package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
import io.swagger.annotations.*;

@ApiModel(description="`{emoji_id}`: Object containing details about the emoji with  the specified ID. It has the following properties: ")@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen")
public class RealmEmoji   {
  
  private String id;
  private String name;
  private String sourceUrl;
  private Boolean deactivated;
  private Integer authorId;

  /**
   * The ID for this emoji, same as the object&#39;s key. 
   **/
  
  @ApiModelProperty(value = "The ID for this emoji, same as the object's key. ")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  /**
   * The user-friendly name for this emoji. Users in the organization can use this emoji by writing this name between colons (&#x60;:name  :&#x60;). 
   **/
  
  @ApiModelProperty(value = "The user-friendly name for this emoji. Users in the organization can use this emoji by writing this name between colons (`:name  :`). ")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   * The path relative to the organization&#39;s URL where the emoji&#39;s image can be found. 
   **/
  
  @ApiModelProperty(value = "The path relative to the organization's URL where the emoji's image can be found. ")
  @JsonProperty("source_url")
  public String getSourceUrl() {
    return sourceUrl;
  }
  public void setSourceUrl(String sourceUrl) {
    this.sourceUrl = sourceUrl;
  }

  /**
   * Whether the emoji has been deactivated or not. 
   **/
  
  @ApiModelProperty(value = "Whether the emoji has been deactivated or not. ")
  @JsonProperty("deactivated")
  public Boolean getDeactivated() {
    return deactivated;
  }
  public void setDeactivated(Boolean deactivated) {
    this.deactivated = deactivated;
  }

  /**
   * The user ID of the user who uploaded the custom emoji. Will be null if the uploader is unknown.  **Changes**: New in Zulip 3.0 (feature level 7).  Previously was accessible via and &#x60;author&#x60; object with an &#x60;id&#x60; field. 
   **/
  
  @ApiModelProperty(value = "The user ID of the user who uploaded the custom emoji. Will be null if the uploader is unknown.  **Changes**: New in Zulip 3.0 (feature level 7).  Previously was accessible via and `author` object with an `id` field. ")
  @JsonProperty("author_id")
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
    return Objects.equals(id, realmEmoji.id) &&
        Objects.equals(name, realmEmoji.name) &&
        Objects.equals(sourceUrl, realmEmoji.sourceUrl) &&
        Objects.equals(deactivated, realmEmoji.deactivated) &&
        Objects.equals(authorId, realmEmoji.authorId);
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

