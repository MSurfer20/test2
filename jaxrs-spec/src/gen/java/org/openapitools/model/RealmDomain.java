package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Object containing details of the newly added domain. 
 **/
@ApiModel(description = "Object containing details of the newly added domain. ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2021-08-08T21:12:25.585041Z[Etc/UTC]")public class RealmDomain   {
  
  private @Valid String domain;
  private @Valid Boolean allowSubdomains;

  /**
   * The new allowed domain. 
   **/
  public RealmDomain domain(String domain) {
    this.domain = domain;
    return this;
  }

  

  
  @ApiModelProperty(value = "The new allowed domain. ")
  @JsonProperty("domain")
  public String getDomain() {
    return domain;
  }

  public void setDomain(String domain) {
    this.domain = domain;
  }

/**
   * Whether subdomains are allowed for this domain. 
   **/
  public RealmDomain allowSubdomains(Boolean allowSubdomains) {
    this.allowSubdomains = allowSubdomains;
    return this;
  }

  

  
  @ApiModelProperty(value = "Whether subdomains are allowed for this domain. ")
  @JsonProperty("allow_subdomains")
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

