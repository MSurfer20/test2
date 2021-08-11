package apimodels;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * Object containing the user group&#39;s attributes. 
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class UserGroup   {
  @JsonProperty("name")
  
  private String name;

  @JsonProperty("description")
  
  private String description;

  @JsonProperty("members")
  
  private List<Integer> members = null;

  @JsonProperty("id")
  
  private Integer id;

  public UserGroup name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the user group. 
   * @return name
  **/
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public UserGroup description(String description) {
    this.description = description;
    return this;
  }

   /**
   * The description of the user group. 
   * @return description
  **/
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public UserGroup members(List<Integer> members) {
    this.members = members;
    return this;
  }

  public UserGroup addMembersItem(Integer membersItem) {
    if (members == null) {
      members = new ArrayList<>();
    }
    members.add(membersItem);
    return this;
  }

   /**
   * Array containing the id of the users who are members of this user group. 
   * @return members
  **/
  public List<Integer> getMembers() {
    return members;
  }

  public void setMembers(List<Integer> members) {
    this.members = members;
  }

  public UserGroup id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * The ID of the user group. 
   * @return id
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

