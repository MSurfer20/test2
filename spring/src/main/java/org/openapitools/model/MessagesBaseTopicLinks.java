package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * MessagesBaseTopicLinks
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-08-08T21:15:43.843274Z[Etc/UTC]")
public class MessagesBaseTopicLinks   {
  @JsonProperty("text")
  private String text;

  @JsonProperty("url")
  private String url;

  public MessagesBaseTopicLinks text(String text) {
    this.text = text;
    return this;
  }

  /**
   * The original link text present in the topic. 
   * @return text
  */
  @ApiModelProperty(value = "The original link text present in the topic. ")


  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public MessagesBaseTopicLinks url(String url) {
    this.url = url;
    return this;
  }

  /**
   * The expanded target url which the link points to. 
   * @return url
  */
  @ApiModelProperty(value = "The expanded target url which the link points to. ")


  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MessagesBaseTopicLinks messagesBaseTopicLinks = (MessagesBaseTopicLinks) o;
    return Objects.equals(this.text, messagesBaseTopicLinks.text) &&
        Objects.equals(this.url, messagesBaseTopicLinks.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(text, url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MessagesBaseTopicLinks {\n");
    
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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

