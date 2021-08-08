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
 * Object containing details of the newly added domain. 
 */
@ApiModel(description = "Object containing details of the newly added domain. ")
@JsonPropertyOrder({
  RealmDomain.JSON_PROPERTY_DOMAIN,
  RealmDomain.JSON_PROPERTY_ALLOW_SUBDOMAINS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2021-08-08T21:12:13.281187Z[Etc/UTC]")
public class RealmDomain   {
  public static final String JSON_PROPERTY_DOMAIN = "domain";
  @JsonProperty(JSON_PROPERTY_DOMAIN)
  private String domain;

  public static final String JSON_PROPERTY_ALLOW_SUBDOMAINS = "allow_subdomains";
  @JsonProperty(JSON_PROPERTY_ALLOW_SUBDOMAINS)
  private Boolean allowSubdomains;

  public RealmDomain domain(String domain) {
    this.domain = domain;
    return this;
  }

  /**
   * The new allowed domain. 
   * @return domain
   **/
  @JsonProperty(value = "domain")
  @ApiModelProperty(value = "The new allowed domain. ")
  
  public String getDomain() {
    return domain;
  }

  public void setDomain(String domain) {
    this.domain = domain;
  }

  public RealmDomain allowSubdomains(Boolean allowSubdomains) {
    this.allowSubdomains = allowSubdomains;
    return this;
  }

  /**
   * Whether subdomains are allowed for this domain. 
   * @return allowSubdomains
   **/
  @JsonProperty(value = "allow_subdomains")
  @ApiModelProperty(value = "Whether subdomains are allowed for this domain. ")
  
  public Boolean getAllowSubdomains() {
    return allowSubdomains;
  }

  public void setAllowSubdomains(Boolean allowSubdomains) {
    this.allowSubdomains = allowSubdomains;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RealmDomain realmDomain = (RealmDomain) o;
    return Objects.equals(this.domain, realmDomain.domain) &&
        Objects.equals(this.allowSubdomains, realmDomain.allowSubdomains);
  }

  @Override
  public int hashCode() {
    return Objects.hash(domain, allowSubdomains);
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

