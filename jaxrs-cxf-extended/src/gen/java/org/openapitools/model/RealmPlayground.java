package org.openapitools.model;

import io.swagger.annotations.ApiModel;
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
 * Object containing details about a realm playground. 
 */
@ApiModel(description="Object containing details about a realm playground. ")

public class RealmPlayground  {
  
 /**
  * The unique ID for the realm playground. 
  */
  @ApiModelProperty(value = "The unique ID for the realm playground. ")
  private Integer id;

 /**
  * The user-visible display name of the playground.  Clients should display this in UI for picking which playground to open a code block in, to differentiate between multiple configured playground options for a given pygments language.  **Changes**: New in Zulip 4.0 (feature level 49). 
  */
  @ApiModelProperty(value = "The user-visible display name of the playground.  Clients should display this in UI for picking which playground to open a code block in, to differentiate between multiple configured playground options for a given pygments language.  **Changes**: New in Zulip 4.0 (feature level 49). ")
  private String name;

 /**
  * The name of the Pygments language lexer for that programming language. 
  */
  @ApiModelProperty(value = "The name of the Pygments language lexer for that programming language. ")
  private String pygmentsLanguage;

 /**
  * The url prefix for the playground. 
  */
  @ApiModelProperty(value = "The url prefix for the playground. ")
  private String urlPrefix;
 /**
  * The unique ID for the realm playground. 
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
  public RealmPlayground id(Integer id) {
    this.id = id;
    return this;
  }

 /**
  * The user-visible display name of the playground.  Clients should display this in UI for picking which playground to open a code block in, to differentiate between multiple configured playground options for a given pygments language.  **Changes**: New in Zulip 4.0 (feature level 49). 
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
  public RealmPlayground name(String name) {
    this.name = name;
    return this;
  }

 /**
  * The name of the Pygments language lexer for that programming language. 
  * @return pygmentsLanguage
  */
  @JsonProperty("pygments_language")
  public String getPygmentsLanguage() {
    return pygmentsLanguage;
  }

  /**
   * Sets the <code>pygmentsLanguage</code> property.
   */
  public void setPygmentsLanguage(String pygmentsLanguage) {
    this.pygmentsLanguage = pygmentsLanguage;
  }

  /**
   * Sets the <code>pygmentsLanguage</code> property.
   */
  public RealmPlayground pygmentsLanguage(String pygmentsLanguage) {
    this.pygmentsLanguage = pygmentsLanguage;
    return this;
  }

 /**
  * The url prefix for the playground. 
  * @return urlPrefix
  */
  @JsonProperty("url_prefix")
  public String getUrlPrefix() {
    return urlPrefix;
  }

  /**
   * Sets the <code>urlPrefix</code> property.
   */
  public void setUrlPrefix(String urlPrefix) {
    this.urlPrefix = urlPrefix;
  }

  /**
   * Sets the <code>urlPrefix</code> property.
   */
  public RealmPlayground urlPrefix(String urlPrefix) {
    this.urlPrefix = urlPrefix;
    return this;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

