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
 * Whether the user is a mirror dummy. Dictionary with data on the user who added the reaction, including the user ID as the &#x60;id&#x60; field.  **Note**: In the [events API](/api/get-events), this &#x60;user&#x60; dictionary confusing had the user ID in a field called &#x60;user_id&#x60; instead.  We recommend ignoring fields other than the user ID.  **Deprecated** and to be removed in a future release once core clients have migrated to use the &#x60;user_id&#x60; field. 
 */
@ApiModel(description = "Whether the user is a mirror dummy. Dictionary with data on the user who added the reaction, including the user ID as the `id` field.  **Note**: In the [events API](/api/get-events), this `user` dictionary confusing had the user ID in a field called `user_id` instead.  We recommend ignoring fields other than the user ID.  **Deprecated** and to be removed in a future release once core clients have migrated to use the `user_id` field. ")

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen")
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
  @ApiModelProperty(value = "ID of the user. ")
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
  @ApiModelProperty(value = "Email of the user. ")
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
  @ApiModelProperty(value = "Full name of the user. ")
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
  @ApiModelProperty(value = "Whether the user is a mirror dummy. ")
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
    return Objects.equals(this.id, emojiReactionBaseAllOfUser.id) &&
        Objects.equals(this.email, emojiReactionBaseAllOfUser.email) &&
        Objects.equals(this.fullName, emojiReactionBaseAllOfUser.fullName) &&
        Objects.equals(this.isMirrorDummy, emojiReactionBaseAllOfUser.isMirrorDummy);
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

