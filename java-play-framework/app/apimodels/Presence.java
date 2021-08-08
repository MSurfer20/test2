package apimodels;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * &#x60;{client_name}&#x60;: Object containing the details of the user&#39;s presence on a particular platform with the client&#39;s platform name being the object key. 
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2021-08-08T20:41:53.018098Z[Etc/UTC]")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class Presence   {
  @JsonProperty("client")
  
  private String client;

  /**
   * The status of the user on this client. It is either `idle` or `active`. 
   */
  public enum StatusEnum {
    IDLE("idle"),
    
    ACTIVE("active");

    private final String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("status")
  
  private StatusEnum status;

  @JsonProperty("timestamp")
  
  private Integer timestamp;

  @JsonProperty("pushable")
  
  private Boolean pushable;

  public Presence client(String client) {
    this.client = client;
    return this;
  }

   /**
   * The client's platform name. 
   * @return client
  **/
  public String getClient() {
    return client;
  }

  public void setClient(String client) {
    this.client = client;
  }

  public Presence status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * The status of the user on this client. It is either `idle` or `active`. 
   * @return status
  **/
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public Presence timestamp(Integer timestamp) {
    this.timestamp = timestamp;
    return this;
  }

   /**
   * The UNIX timestamp of when this client sent the user's presence to the server with the precision of a second. 
   * @return timestamp
  **/
  public Integer getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(Integer timestamp) {
    this.timestamp = timestamp;
  }

  public Presence pushable(Boolean pushable) {
    this.pushable = pushable;
    return this;
  }

   /**
   * Whether the client is capable of showing mobile/push notifications to the user. 
   * @return pushable
  **/
  public Boolean getPushable() {
    return pushable;
  }

  public void setPushable(Boolean pushable) {
    this.pushable = pushable;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Presence presence = (Presence) o;
    return Objects.equals(client, presence.client) &&
        Objects.equals(status, presence.status) &&
        Objects.equals(timestamp, presence.timestamp) &&
        Objects.equals(pushable, presence.pushable);
  }

  @Override
  public int hashCode() {
    return Objects.hash(client, status, timestamp, pushable);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Presence {\n");
    
    sb.append("    client: ").append(toIndentedString(client)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    pushable: ").append(toIndentedString(pushable)).append("\n");
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

