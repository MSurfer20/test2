package apimodels;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * &#x60;{emoji_id}&#x60;: Object containing details about the emoji with  the specified ID. It has the following properties: 
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2021-08-08T21:11:44.583112Z[Etc/UTC]")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

