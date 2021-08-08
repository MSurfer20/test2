package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Object containing details about a realm playground. 
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RealmPlayground   {
  
  private Integer id;
  private String name;
  private String pygmentsLanguage;
  private String urlPrefix;

  public RealmPlayground () {

  }

  public RealmPlayground (Integer id, String name, String pygmentsLanguage, String urlPrefix) {
    this.id = id;
    this.name = name;
    this.pygmentsLanguage = pygmentsLanguage;
    this.urlPrefix = urlPrefix;
  }

    
  @JsonProperty("id")
  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }

    
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

    
  @JsonProperty("pygments_language")
  public String getPygmentsLanguage() {
    return pygmentsLanguage;
  }
  public void setPygmentsLanguage(String pygmentsLanguage) {
    this.pygmentsLanguage = pygmentsLanguage;
  }

    
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
