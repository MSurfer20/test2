package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * Object containing the user group&#39;s attributes. 
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class UserGroup   {
  
  private String name;
  private String description;
  private List<Integer> members = new ArrayList<>();
  private Integer id;

  public UserGroup () {

  }

  public UserGroup (String name, String description, List<Integer> members, Integer id) {
    this.name = name;
    this.description = description;
    this.members = members;
    this.id = id;
  }

    
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

    
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

    
  @JsonProperty("members")
  public List<Integer> getMembers() {
    return members;
  }
  public void setMembers(List<Integer> members) {
    this.members = members;
  }

    
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
