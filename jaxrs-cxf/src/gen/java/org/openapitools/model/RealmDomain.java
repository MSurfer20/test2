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
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Object containing details of the newly added domain. 
 **/
@ApiModel(description="Object containing details of the newly added domain. ")
public class RealmDomain  {
  
  @ApiModelProperty(value = "The new allowed domain. ")
 /**
   * The new allowed domain. 
  **/
  private String domain;

  @ApiModelProperty(value = "Whether subdomains are allowed for this domain. ")
 /**
   * Whether subdomains are allowed for this domain. 
  **/
  private Boolean allowSubdomains;
 /**
   * The new allowed domain. 
   * @return domain
  **/
  @JsonProperty("domain")
  public String getDomain() {
    return domain;
  }

  public void setDomain(String domain) {
    this.domain = domain;
  }

  public RealmDomain domain(String domain) {
    this.domain = domain;
    return this;
  }

 /**
   * Whether subdomains are allowed for this domain. 
   * @return allowSubdomains
  **/
  @JsonProperty("allow_subdomains")
  public Boolean getAllowSubdomains() {
    return allowSubdomains;
  }

  public void setAllowSubdomains(Boolean allowSubdomains) {
    this.allowSubdomains = allowSubdomains;
  }

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

