package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;

/**
 * Object containing details about a realm export. 
 */
@ApiModel(description = "Object containing details about a realm export. ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen")
public class RealmExport   {
  @JsonProperty("id")
  private Integer id;

  @JsonProperty("acting_user_id")
  private Integer actingUserId;

  @JsonProperty("export_time")
  private BigDecimal exportTime;

  @JsonProperty("deleted_timestamp")
  private BigDecimal deletedTimestamp;

  @JsonProperty("failed_timestamp")
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
  @ApiModelProperty(value = "The id of the export. ")
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
  @ApiModelProperty(value = "The id of the user who did the export. ")
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
  @ApiModelProperty(value = "The UNIX timestamp of when the export was made. ")
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
  @ApiModelProperty(value = "The timestamp of when the export was deleted. Null if it wasn't. ")
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
  @ApiModelProperty(value = "The timestamp of when the export failed. Null if it didn't. ")
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
  @ApiModelProperty(value = "The URL of the export. `null` if there's no URL. ")
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
  @ApiModelProperty(value = "Whether the export is pending or not. ")
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
    return Objects.equals(this.id, realmExport.id) &&
        Objects.equals(this.actingUserId, realmExport.actingUserId) &&
        Objects.equals(this.exportTime, realmExport.exportTime) &&
        Objects.equals(this.deletedTimestamp, realmExport.deletedTimestamp) &&
        Objects.equals(this.failedTimestamp, realmExport.failedTimestamp) &&
        Objects.equals(this.exportUrl, realmExport.exportUrl) &&
        Objects.equals(this.pending, realmExport.pending);
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

