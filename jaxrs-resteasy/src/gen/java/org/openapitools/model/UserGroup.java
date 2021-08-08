package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import io.swagger.annotations.*;

@ApiModel(description="Object containing the user group's attributes. ")@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2021-08-08T21:20:05.336070Z[Etc/UTC]")
public class UserGroup   {
  
  private String name;
  private String description;
  private List<Integer> members = new ArrayList<Integer>();
  private Integer id;

  /**
   * The name of the user group. 
   **/
  
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
    return Objects.equals(name, userGroup.name) &&
        Objects.equals(description, userGroup.description) &&
        Objects.equals(members, userGroup.members) &&
        Objects.equals(id, userGroup.id);
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

