package org.openapitools.model;

import io.swagger.annotations.ApiModel;

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
  * Whether the user is a mirror dummy. Dictionary with data on the user who added the reaction, including the user ID as the `id` field.  **Note**: In the [events API](/api/get-events), this `user` dictionary confusing had the user ID in a field called `user_id` instead.  We recommend ignoring fields other than the user ID.  **Deprecated** and to be removed in a future release once core clients have migrated to use the `user_id` field. 
 **/
@ApiModel(description="Whether the user is a mirror dummy. Dictionary with data on the user who added the reaction, including the user ID as the `id` field.  **Note**: In the [events API](/api/get-events), this `user` dictionary confusing had the user ID in a field called `user_id` instead.  We recommend ignoring fields other than the user ID.  **Deprecated** and to be removed in a future release once core clients have migrated to use the `user_id` field. ")
public class EmojiReactionBaseAllOfUser  {
  
  @ApiModelProperty(value = "ID of the user. ")
 /**
   * ID of the user. 
  **/
  private Integer id;

  @ApiModelProperty(value = "Email of the user. ")
 /**
   * Email of the user. 
  **/
  private String email;

  @ApiModelProperty(value = "Full name of the user. ")
 /**
   * Full name of the user. 
  **/
  private String fullName;

  @ApiModelProperty(value = "Whether the user is a mirror dummy. ")
 /**
   * Whether the user is a mirror dummy. 
  **/
  private Boolean isMirrorDummy;
 /**
   * ID of the user. 
   * @return id
  **/
  @JsonProperty("id")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public EmojiReactionBaseAllOfUser id(Integer id) {
    this.id = id;
    return this;
  }

 /**
   * Email of the user. 
   * @return email
  **/
  @JsonProperty("email")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public EmojiReactionBaseAllOfUser email(String email) {
    this.email = email;
    return this;
  }

 /**
   * Full name of the user. 
   * @return fullName
  **/
  @JsonProperty("full_name")
  public String getFullName() {
    return fullName;
  }

  public void setFullName(String fullName) {
    this.fullName = fullName;
  }

  public EmojiReactionBaseAllOfUser fullName(String fullName) {
    this.fullName = fullName;
    return this;
  }

 /**
   * Whether the user is a mirror dummy. 
   * @return isMirrorDummy
  **/
  @JsonProperty("is_mirror_dummy")
  public Boolean getIsMirrorDummy() {
    return isMirrorDummy;
  }

  public void setIsMirrorDummy(Boolean isMirrorDummy) {
    this.isMirrorDummy = isMirrorDummy;
  }

  public EmojiReactionBaseAllOfUser isMirrorDummy(Boolean isMirrorDummy) {
    this.isMirrorDummy = isMirrorDummy;
    return this;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

