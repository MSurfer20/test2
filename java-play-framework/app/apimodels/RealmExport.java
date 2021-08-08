package apimodels;

import java.math.BigDecimal;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * Object containing details about a realm export. 
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2021-08-08T21:11:44.583112Z[Etc/UTC]")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class RealmExport   {
  @JsonProperty("id")
  
  private Integer id;

  @JsonProperty("acting_user_id")
  
  private Integer actingUserId;

  @JsonProperty("export_time")
  @Valid

  private BigDecimal exportTime;

  @JsonProperty("deleted_timestamp")
  @Valid

  private BigDecimal deletedTimestamp;

  @JsonProperty("failed_timestamp")
  @Valid

  private BigDecimal failedTimestamp;

  @JsonProperty("export_url")
  
  private String exportUrl;

  @JsonProperty("pending")
  
  private Boolean pending;

  public RealmExport id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * The id of the export. 
   * @return id
  **/
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public RealmExport actingUserId(Integer actingUserId) {
    this.actingUserId = actingUserId;
    return this;
  }

   /**
   * The id of the user who did the export. 
   * @return actingUserId
  **/
  public Integer getActingUserId() {
    return actingUserId;
  }

  public void setActingUserId(Integer actingUserId) {
    this.actingUserId = actingUserId;
  }

  public RealmExport exportTime(BigDecimal exportTime) {
    this.exportTime = exportTime;
    return this;
  }

   /**
   * The UNIX timestamp of when the export was made. 
   * @return exportTime
  **/
  public BigDecimal getExportTime() {
    return exportTime;
  }

  public void setExportTime(BigDecimal exportTime) {
    this.exportTime = exportTime;
  }

  public RealmExport deletedTimestamp(BigDecimal deletedTimestamp) {
    this.deletedTimestamp = deletedTimestamp;
    return this;
  }

   /**
   * The timestamp of when the export was deleted. Null if it wasn't. 
   * @return deletedTimestamp
  **/
  public BigDecimal getDeletedTimestamp() {
    return deletedTimestamp;
  }

  public void setDeletedTimestamp(BigDecimal deletedTimestamp) {
    this.deletedTimestamp = deletedTimestamp;
  }

  public RealmExport failedTimestamp(BigDecimal failedTimestamp) {
    this.failedTimestamp = failedTimestamp;
    return this;
  }

   /**
   * The timestamp of when the export failed. Null if it didn't. 
   * @return failedTimestamp
  **/
  public BigDecimal getFailedTimestamp() {
    return failedTimestamp;
  }

  public void setFailedTimestamp(BigDecimal failedTimestamp) {
    this.failedTimestamp = failedTimestamp;
  }

  public RealmExport exportUrl(String exportUrl) {
    this.exportUrl = exportUrl;
    return this;
  }

   /**
   * The URL of the export. `null` if there's no URL. 
   * @return exportUrl
  **/
  public String getExportUrl() {
    return exportUrl;
  }

  public void setExportUrl(String exportUrl) {
    this.exportUrl = exportUrl;
  }

  public RealmExport pending(Boolean pending) {
    this.pending = pending;
    return this;
  }

   /**
   * Whether the export is pending or not. 
   * @return pending
  **/
  public Boolean getPending() {
    return pending;
  }

  public void setPending(Boolean pending) {
    this.pending = pending;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RealmExport realmExport = (RealmExport) o;
    return Objects.equals(id, realmExport.id) &&
        Objects.equals(actingUserId, realmExport.actingUserId) &&
        Objects.equals(exportTime, realmExport.exportTime) &&
        Objects.equals(deletedTimestamp, realmExport.deletedTimestamp) &&
        Objects.equals(failedTimestamp, realmExport.failedTimestamp) &&
        Objects.equals(exportUrl, realmExport.exportUrl) &&
        Objects.equals(pending, realmExport.pending);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, actingUserId, exportTime, deletedTimestamp, failedTimestamp, exportUrl, pending);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RealmExport {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    actingUserId: ").append(toIndentedString(actingUserId)).append("\n");
    sb.append("    exportTime: ").append(toIndentedString(exportTime)).append("\n");
    sb.append("    deletedTimestamp: ").append(toIndentedString(deletedTimestamp)).append("\n");
    sb.append("    failedTimestamp: ").append(toIndentedString(failedTimestamp)).append("\n");
    sb.append("    exportUrl: ").append(toIndentedString(exportUrl)).append("\n");
    sb.append("    pending: ").append(toIndentedString(pending)).append("\n");
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

