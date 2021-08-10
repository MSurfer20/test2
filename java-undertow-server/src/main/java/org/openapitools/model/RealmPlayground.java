/*
 * Zulip REST API
 *
 * Powerful open source group chat 
 *
 * OpenAPI document version: 1.0.0
 * 
 *
 * AUTO-GENERATED FILE, DO NOT MODIFY!
 */
package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Object containing details about a realm playground. 
 */

@ApiModel(description = "Object containing details about a realm playground. ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2021-08-10T11:44:25.718353Z[Etc/UTC]")
public class RealmPlayground   {
  
  private Integer id;
  private String name;
  private String pygmentsLanguage;
  private String urlPrefix;

  /**
   * The unique ID for the realm playground. 
   */
  public RealmPlayground id(Integer id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(value = "The unique ID for the realm playground. ")
  @JsonProperty("id")
  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }

  /**
   * The user-visible display name of the playground.  Clients should display this in UI for picking which playground to open a code block in, to differentiate between multiple configured playground options for a given pygments language.  **Changes**: New in Zulip 4.0 (feature level 49). 
   */
  public RealmPlayground name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(value = "The user-visible display name of the playground.  Clients should display this in UI for picking which playground to open a code block in, to differentiate between multiple configured playground options for a given pygments language.  **Changes**: New in Zulip 4.0 (feature level 49). ")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   * The name of the Pygments language lexer for that programming language. 
   */
  public RealmPlayground pygmentsLanguage(String pygmentsLanguage) {
    this.pygmentsLanguage = pygmentsLanguage;
    return this;
  }

  
  @ApiModelProperty(value = "The name of the Pygments language lexer for that programming language. ")
  @JsonProperty("pygments_language")
  public String getPygmentsLanguage() {
    return pygmentsLanguage;
  }
  public void setPygmentsLanguage(String pygmentsLanguage) {
    this.pygmentsLanguage = pygmentsLanguage;
  }

  /**
   * The url prefix for the playground. 
   */
  public RealmPlayground urlPrefix(String urlPrefix) {
    this.urlPrefix = urlPrefix;
    return this;
  }

  
  @ApiModelProperty(value = "The url prefix for the playground. ")
  @JsonProperty("url_prefix")
  public String getUrlPrefix() {
    return urlPrefix;
  }
  public void setUrlPrefix(String urlPrefix) {
    this.urlPrefix = urlPrefix;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RealmPlayground realmPlayground = (RealmPlayground) o;
    return Objects.equals(id, realmPlayground.id) &&
        Objects.equals(name, realmPlayground.name) &&
        Objects.equals(pygmentsLanguage, realmPlayground.pygmentsLanguage) &&
        Objects.equals(urlPrefix, realmPlayground.urlPrefix);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, pygmentsLanguage, urlPrefix);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RealmPlayground {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    pygmentsLanguage: ").append(toIndentedString(pygmentsLanguage)).append("\n");
    sb.append("    urlPrefix: ").append(toIndentedString(urlPrefix)).append("\n");
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

