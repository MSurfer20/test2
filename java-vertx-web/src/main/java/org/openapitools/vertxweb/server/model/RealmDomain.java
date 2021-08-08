package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Object containing details of the newly added domain. 
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RealmDomain   {
  
  private String domain;
  private Boolean allowSubdomains;

  public RealmDomain () {

  }

  public RealmDomain (String domain, Boolean allowSubdomains) {
    this.domain = domain;
    this.allowSubdomains = allowSubdomains;
  }

    
  @JsonProperty("domain")
  public String getDomain() {
    return domain;
  }
  public void setDomain(String domain) {
    this.domain = domain;
  }

    
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
    return Objects.equals(domain, realmDomain.domain) &&
        Objects.equals(allowSubdomains, realmDomain.allowSubdomains);
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
