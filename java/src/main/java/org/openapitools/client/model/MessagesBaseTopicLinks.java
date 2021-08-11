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


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * MessagesBaseTopicLinks
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class MessagesBaseTopicLinks {
  public static final String SERIALIZED_NAME_TEXT = "text";
  @SerializedName(SERIALIZED_NAME_TEXT)
  private String text;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url;


  public MessagesBaseTopicLinks text(String text) {
    
    this.text = text;
    return this;
  }

   /**
   * The original link text present in the topic. 
   * @return text
  **/
  @javax.annotation.Nullable
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
  **/
  @javax.annotation.Nullable
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

