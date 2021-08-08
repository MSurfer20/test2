package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * &#x60;{emoji_id}&#x60;: Object containing details about the emoji with  the specified ID. It has the following properties: 
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RealmEmoji   {
  
  private String id;
  private String name;
  private String sourceUrl;
  private Boolean deactivated;
  private Integer authorId;

  public RealmEmoji () {

  }

  public RealmEmoji (String id, String name, String sourceUrl, Boolean deactivated, Integer authorId) {
    this.id = id;
    this.name = name;
    this.sourceUrl = sourceUrl;
    this.deactivated = deactivated;
    this.authorId = authorId;
  }

    
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

    
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

    
  @JsonProperty("source_url")
  public String getSourceUrl() {
    return sourceUrl;
  }
  public void setSourceUrl(String sourceUrl) {
    this.sourceUrl = sourceUrl;
  }

    
  @JsonProperty("deactivated")
  public Boolean getDeactivated() {
    return deactivated;
  }
  public void setDeactivated(Boolean deactivated) {
    this.deactivated = deactivated;
  }

    
  @JsonProperty("author_id")
  public Integer getAuthorId() {
    return authorId;
  }
  public void setAuthorId(Integer authorId) {
    this.authorId = authorId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RealmEmoji realmEmoji = (RealmEmoji) o;
    return Objects.equals(id, realmEmoji.id) &&
        Objects.equals(name, realmEmoji.name) &&
        Objects.equals(sourceUrl, realmEmoji.sourceUrl) &&
        Objects.equals(deactivated, realmEmoji.deactivated) &&
        Objects.equals(authorId, realmEmoji.authorId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, sourceUrl, deactivated, authorId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RealmEmoji {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    sourceUrl: ").append(toIndentedString(sourceUrl)).append("\n");
    sb.append("    deactivated: ").append(toIndentedString(deactivated)).append("\n");
    sb.append("    authorId: ").append(toIndentedString(authorId)).append("\n");
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
