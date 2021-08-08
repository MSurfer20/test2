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
 * Object containing details of the newly added domain. 
 */
@ApiModel(description="Object containing details of the newly added domain. ")

public class RealmDomain  {
  
 /**
  * The new allowed domain. 
  */
  @ApiModelProperty(value = "The new allowed domain. ")
  private String domain;

 /**
  * Whether subdomains are allowed for this domain. 
  */
  @ApiModelProperty(value = "Whether subdomains are allowed for this domain. ")
  private Boolean allowSubdomains;
 /**
  * The new allowed domain. 
  * @return domain
  */
  @JsonProperty("domain")
  public String getDomain() {
    return domain;
  }

  /**
   * Sets the <code>domain</code> property.
   */
  public void setDomain(String domain) {
    this.domain = domain;
  }

  /**
   * Sets the <code>domain</code> property.
   */
  public RealmDomain domain(String domain) {
    this.domain = domain;
    return this;
  }

 /**
  * Whether subdomains are allowed for this domain. 
  * @return allowSubdomains
  */
  @JsonProperty("allow_subdomains")
  public Boolean getAllowSubdomains() {
    return allowSubdomains;
  }

  /**
   * Sets the <code>allowSubdomains</code> property.
   */
  public void setAllowSubdomains(Boolean allowSubdomains) {
    this.allowSubdomains = allowSubdomains;
  }

  /**
   * Sets the <code>allowSubdomains</code> property.
   */
  public RealmDomain allowSubdomains(Boolean allowSubdomains) {
    this.allowSubdomains = allowSubdomains;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RealmDomain {\n");
    
    sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
    sb.append("    allowSubdomains: ").append(toIndentedString(allowSubdomains)).append("\n");
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

