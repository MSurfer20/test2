package apimodels;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * Whether the user is a mirror dummy. Dictionary with data on the user who added the reaction, including the user ID as the &#x60;id&#x60; field.  **Note**: In the [events API](/api/get-events), this &#x60;user&#x60; dictionary confusing had the user ID in a field called &#x60;user_id&#x60; instead.  We recommend ignoring fields other than the user ID.  **Deprecated** and to be removed in a future release once core clients have migrated to use the &#x60;user_id&#x60; field. 
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2021-08-08T21:19:33.131185Z[Etc/UTC]")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class EmojiReactionBaseAllOfUser   {
  @JsonProperty("id")
  
  private Integer id;

  @JsonProperty("email")
  
  private String email;

  @JsonProperty("full_name")
  
  private String fullName;

  @JsonProperty("is_mirror_dummy")
  
  private Boolean isMirrorDummy;

  public EmojiReactionBaseAllOfUser id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * ID of the user. 
   * @return id
  **/
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public EmojiReactionBaseAllOfUser email(String email) {
    this.email = email;
    return this;
  }

   /**
   * Email of the user. 
   * @return email
  **/
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public EmojiReactionBaseAllOfUser fullName(String fullName) {
    this.fullName = fullName;
    return this;
  }

   /**
   * Full name of the user. 
   * @return fullName
  **/
  public String getFullName() {
    return fullName;
  }

  public void setFullName(String fullName) {
    this.fullName = fullName;
  }

  public EmojiReactionBaseAllOfUser isMirrorDummy(Boolean isMirrorDummy) {
    this.isMirrorDummy = isMirrorDummy;
    return this;
  }

   /**
   * Whether the user is a mirror dummy. 
   * @return isMirrorDummy
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

