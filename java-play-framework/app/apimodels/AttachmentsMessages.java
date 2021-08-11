package apimodels;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * AttachmentsMessages
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class AttachmentsMessages   {
  @JsonProperty("date_sent")
  
  private Integer dateSent;

  @JsonProperty("id")
  
  private Integer id;

  public AttachmentsMessages dateSent(Integer dateSent) {
    this.dateSent = dateSent;
    return this;
  }

   /**
   * Time when the message was sent as a UNIX timestamp multiplied by 1000 (matching the format of getTime() in JavaScript).  **Changes**: Changed in Zulip 2.2 (feature level 22).  This field was previously strangely called `name` and was a floating point number. 
   * @return dateSent
  **/
  public Integer getDateSent() {
    return dateSent;
  }

  public void setDateSent(Integer dateSent) {
    this.dateSent = dateSent;
  }

  public AttachmentsMessages id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * The unique message ID.  Messages should always be displayed sorted by ID. 
   * @return id
  **/
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AttachmentsMessages attachmentsMessages = (AttachmentsMessages) o;
    return Objects.equals(dateSent, attachmentsMessages.dateSent) &&
        Objects.equals(id, attachmentsMessages.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dateSent, id);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AttachmentsMessages {\n");
    
    sb.append("    dateSent: ").append(toIndentedString(dateSent)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

