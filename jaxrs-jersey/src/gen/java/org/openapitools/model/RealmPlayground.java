/*
 * Zulip REST API
 * Powerful open source group chat 
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Object containing details about a realm playground. 
 */
@ApiModel(description = "Object containing details about a realm playground. ")
@JsonPropertyOrder({
  RealmPlayground.JSON_PROPERTY_ID,
  RealmPlayground.JSON_PROPERTY_NAME,
  RealmPlayground.JSON_PROPERTY_PYGMENTS_LANGUAGE,
  RealmPlayground.JSON_PROPERTY_URL_PREFIX
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2021-08-09T21:34:02.517112Z[Etc/UTC]")
public class RealmPlayground   {
  public static final String JSON_PROPERTY_ID = "id";
  @JsonProperty(JSON_PROPERTY_ID)
  private Integer id;

  public static final String JSON_PROPERTY_NAME = "name";
  @JsonProperty(JSON_PROPERTY_NAME)
  private String name;

  public static final String JSON_PROPERTY_PYGMENTS_LANGUAGE = "pygments_language";
  @JsonProperty(JSON_PROPERTY_PYGMENTS_LANGUAGE)
  private String pygmentsLanguage;

  public static final String JSON_PROPERTY_URL_PREFIX = "url_prefix";
  @JsonProperty(JSON_PROPERTY_URL_PREFIX)
  private String urlPrefix;

  public RealmPlayground id(Integer id) {
    this.id = id;
    return this;
  }

  /**
   * The unique ID for the realm playground. 
   * @return id
   **/
  @JsonProperty(value = "id")
  @ApiModelProperty(value = "The unique ID for the realm playground. ")
  
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public RealmPlayground name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The user-visible display name of the playground.  Clients should display this in UI for picking which playground to open a code block in, to differentiate between multiple configured playground options for a given pygments language.  **Changes**: New in Zulip 4.0 (feature level 49). 
   * @return name
   **/
  @JsonProperty(value = "name")
  @ApiModelProperty(value = "The user-visible display name of the playground.  Clients should display this in UI for picking which playground to open a code block in, to differentiate between multiple configured playground options for a given pygments language.  **Changes**: New in Zulip 4.0 (feature level 49). ")
  
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public RealmPlayground pygmentsLanguage(String pygmentsLanguage) {
    this.pygmentsLanguage = pygmentsLanguage;
    return this;
  }

  /**
   * The name of the Pygments language lexer for that programming language. 
   * @return pygmentsLanguage
   **/
  @JsonProperty(value = "pygments_language")
  @ApiModelProperty(value = "The name of the Pygments language lexer for that programming language. ")
  
  public String getPygmentsLanguage() {
    return pygmentsLanguage;
  }

  public void setPygmentsLanguage(String pygmentsLanguage) {
    this.pygmentsLanguage = pygmentsLanguage;
  }

  public RealmPlayground urlPrefix(String urlPrefix) {
    this.urlPrefix = urlPrefix;
    return this;
  }

  /**
   * The url prefix for the playground. 
   * @return urlPrefix
   **/
  @JsonProperty(value = "url_prefix")
  @ApiModelProperty(value = "The url prefix for the playground. ")
  
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
    return Objects.equals(this.id, realmPlayground.id) &&
        Objects.equals(this.name, realmPlayground.name) &&
        Objects.equals(this.pygmentsLanguage, realmPlayground.pygmentsLanguage) &&
        Objects.equals(this.urlPrefix, realmPlayground.urlPrefix);
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

