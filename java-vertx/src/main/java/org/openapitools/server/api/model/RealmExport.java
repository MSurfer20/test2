package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.math.BigDecimal;

/**
 * Object containing details about a realm export. 
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RealmExport   {
  
  private Integer id;
  private Integer actingUserId;
  private BigDecimal exportTime;
  private BigDecimal deletedTimestamp;
  private BigDecimal failedTimestamp;
  private String exportUrl;
  private Boolean pending;

  public RealmExport () {

  }

  public RealmExport (Integer id, Integer actingUserId, BigDecimal exportTime, BigDecimal deletedTimestamp, BigDecimal failedTimestamp, String exportUrl, Boolean pending) {
    this.id = id;
    this.actingUserId = actingUserId;
    this.exportTime = exportTime;
    this.deletedTimestamp = deletedTimestamp;
    this.failedTimestamp = failedTimestamp;
    this.exportUrl = exportUrl;
    this.pending = pending;
  }

    
  @JsonProperty("id")
  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }

    
  @JsonProperty("acting_user_id")
  public Integer getActingUserId() {
    return actingUserId;
  }
  public void setActingUserId(Integer actingUserId) {
    this.actingUserId = actingUserId;
  }

    
  @JsonProperty("export_time")
  public BigDecimal getExportTime() {
    return exportTime;
  }
  public void setExportTime(BigDecimal exportTime) {
    this.exportTime = exportTime;
  }

    
  @JsonProperty("deleted_timestamp")
  public BigDecimal getDeletedTimestamp() {
    return deletedTimestamp;
  }
  public void setDeletedTimestamp(BigDecimal deletedTimestamp) {
    this.deletedTimestamp = deletedTimestamp;
  }

    
  @JsonProperty("failed_timestamp")
  public BigDecimal getFailedTimestamp() {
    return failedTimestamp;
  }
  public void setFailedTimestamp(BigDecimal failedTimestamp) {
    this.failedTimestamp = failedTimestamp;
  }

    
  @JsonProperty("export_url")
  public String getExportUrl() {
    return exportUrl;
  }
  public void setExportUrl(String exportUrl) {
    this.exportUrl = exportUrl;
  }

    
  @JsonProperty("pending")
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
