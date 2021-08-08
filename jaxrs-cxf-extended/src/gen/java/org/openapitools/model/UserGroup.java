package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.List;
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
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Object containing the user group's attributes. 
 */
@ApiModel(description="Object containing the user group's attributes. ")

public class UserGroup  {
  
 /**
  * The name of the user group. 
  */
  @ApiModelProperty(value = "The name of the user group. ")
  private String name;

 /**
  * The description of the user group. 
  */
  @ApiModelProperty(value = "The description of the user group. ")
  private String description;

 /**
  * Array containing the id of the users who are members of this user group. 
  */
  @ApiModelProperty(value = "Array containing the id of the users who are members of this user group. ")
  private List<Integer> members = null;

 /**
  * The ID of the user group. 
  */
  @ApiModelProperty(value = "The ID of the user group. ")
  private Integer id;
 /**
  * The name of the user group. 
  * @return name
  */
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  /**
   * Sets the <code>name</code> property.
   */
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Sets the <code>name</code> property.
   */
  public UserGroup name(String name) {
    this.name = name;
    return this;
  }

 /**
  * The description of the user group. 
  * @return description
  */
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  /**
   * Sets the <code>description</code> property.
   */
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * Sets the <code>description</code> property.
   */
  public UserGroup description(String description) {
    this.description = description;
    return this;
  }

 /**
  * Array containing the id of the users who are members of this user group. 
  * @return members
  */
  @JsonProperty("members")
  public List<Integer> getMembers() {
    return members;
  }

  /**
   * Sets the <code>members</code> property.
   */
  public void setMembers(List<Integer> members) {
    this.members = members;
  }

  /**
   * Sets the <code>members</code> property.
   */
  public UserGroup members(List<Integer> members) {
    this.members = members;
    return this;
  }

  /**
   * Adds a new item to the <code>members</code> list.
   */
  public UserGroup addMembersItem(Integer membersItem) {
    this.members.add(membersItem);
    return this;
  }

 /**
  * The ID of the user group. 
  * @return id
  */
  @JsonProperty("id")
  public Integer getId() {
    return id;
  }

  /**
   * Sets the <code>id</code> property.
   */
  public void setId(Integer id) {
    this.id = id;
  }

  /**
   * Sets the <code>id</code> property.
   */
  public UserGroup id(Integer id) {
    this.id = id;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserGroup {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    members: ").append(toIndentedString(members)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

