package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Object containing the user group&#39;s attributes. 
 **/
@ApiModel(description = "Object containing the user group's attributes. ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2021-08-08T20:40:13.248583Z[Etc/UTC]")public class UserGroup   {
  
  private @Valid String name;
  private @Valid String description;
  private @Valid List<Integer> members = new ArrayList<Integer>();
  private @Valid Integer id;

  /**
   * The name of the user group. 
   **/
  public UserGroup name(String name) {
    this.name = name;
    return this;
  }

  

  
  @ApiModelProperty(value = "The name of the user group. ")
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

/**
   * The description of the user group. 
   **/
  public UserGroup description(String description) {
    this.description = description;
    return this;
  }

  

  
  @ApiModelProperty(value = "The description of the user group. ")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

/**
   * Array containing the id of the users who are members of this user group. 
   **/
  public UserGroup members(List<Integer> members) {
    this.members = members;
    return this;
  }

  

  
  @ApiModelProperty(value = "Array containing the id of the users who are members of this user group. ")
  @JsonProperty("members")
  public List<Integer> getMembers() {
    return members;
  }

  public void setMembers(List<Integer> members) {
    this.members = members;
  }

/**
   * The ID of the user group. 
   **/
  public UserGroup id(Integer id) {
    this.id = id;
    return this;
  }

  

  
  @ApiModelProperty(value = "The ID of the user group. ")
  @JsonProperty("id")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserGroup userGroup = (UserGroup) o;
    return Objects.equals(this.name, userGroup.name) &&
        Objects.equals(this.description, userGroup.description) &&
        Objects.equals(this.members, userGroup.members) &&
        Objects.equals(this.id, userGroup.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, description, members, id);
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


}

