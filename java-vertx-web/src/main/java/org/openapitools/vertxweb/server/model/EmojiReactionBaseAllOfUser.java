package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Whether the user is a mirror dummy. Dictionary with data on the user who added the reaction, including the user ID as the &#x60;id&#x60; field.  **Note**: In the [events API](/api/get-events), this &#x60;user&#x60; dictionary confusing had the user ID in a field called &#x60;user_id&#x60; instead.  We recommend ignoring fields other than the user ID.  **Deprecated** and to be removed in a future release once core clients have migrated to use the &#x60;user_id&#x60; field. 
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class EmojiReactionBaseAllOfUser   {
  
  private Integer id;
  private String email;
  private String fullName;
  private Boolean isMirrorDummy;

  public EmojiReactionBaseAllOfUser () {

  }

  public EmojiReactionBaseAllOfUser (Integer id, String email, String fullName, Boolean isMirrorDummy) {
    this.id = id;
    this.email = email;
    this.fullName = fullName;
    this.isMirrorDummy = isMirrorDummy;
  }

    
  @JsonProperty("id")
  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }

    
  @JsonProperty("email")
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }

    
  @JsonProperty("full_name")
  public String getFullName() {
    return fullName;
  }
  public void setFullName(String fullName) {
    this.fullName = fullName;
  }

    
  @JsonProperty("is_mirror_dummy")
  public Boolean getIsMirrorDummy() {
    return isMirrorDummy;
  }
  public void setIsMirrorDummy(Boolean isMirrorDummy) {
    this.isMirrorDummy = isMirrorDummy;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EmojiReactionBaseAllOfUser emojiReactionBaseAllOfUser = (EmojiReactionBaseAllOfUser) o;
    return Objects.equals(id, emojiReactionBaseAllOfUser.id) &&
        Objects.equals(email, emojiReactionBaseAllOfUser.email) &&
        Objects.equals(fullName, emojiReactionBaseAllOfUser.fullName) &&
        Objects.equals(isMirrorDummy, emojiReactionBaseAllOfUser.isMirrorDummy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, email, fullName, isMirrorDummy);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmojiReactionBaseAllOfUser {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    fullName: ").append(toIndentedString(fullName)).append("\n");
    sb.append("    isMirrorDummy: ").append(toIndentedString(isMirrorDummy)).append("\n");
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
