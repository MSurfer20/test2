package apimodels;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * MessagesBaseTopicLinks
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2021-08-08T20:41:53.018098Z[Etc/UTC]")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
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
  **/
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
  **/
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
    return Objects.equals(text, messagesBaseTopicLinks.text) &&
        Objects.equals(url, messagesBaseTopicLinks.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(text, url);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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

