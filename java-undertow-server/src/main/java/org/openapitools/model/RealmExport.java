/*
 * Zulip REST API
 *
 * Powerful open source group chat 
 *
 * OpenAPI document version: 1.0.0
 * 
 *
 * AUTO-GENERATED FILE, DO NOT MODIFY!
 */
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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2021-08-08T21:19:37.133192Z[Etc/UTC]")
public class RealmExport   {
  
  private Integer id;
  private Integer actingUserId;
  private BigDecimal exportTime;
  private BigDecimal deletedTimestamp;
  private BigDecimal failedTimestamp;
  private String exportUrl;
  private Boolean pending;

  /**
   * The id of the export. 
   */
  public RealmExport id(Integer id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(value = "The id of the export. ")
  @JsonProperty("id")
  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }

  /**
   * The id of the user who did the export. 
   */
  public RealmExport actingUserId(Integer actingUserId) {
    this.actingUserId = actingUserId;
    return this;
  }

  
  @ApiModelProperty(value = "The id of the user who did the export. ")
  @JsonProperty("acting_user_id")
  public Integer getActingUserId() {
    return actingUserId;
  }
  public void setActingUserId(Integer actingUserId) {
    this.actingUserId = actingUserId;
  }

  /**
   * The UNIX timestamp of when the export was made. 
   */
  public RealmExport exportTime(BigDecimal exportTime) {
    this.exportTime = exportTime;
    return this;
  }

  
  @ApiModelProperty(value = "The UNIX timestamp of when the export was made. ")
  @JsonProperty("export_time")
  public BigDecimal getExportTime() {
    return exportTime;
  }
  public void setExportTime(BigDecimal exportTime) {
    this.exportTime = exportTime;
  }

  /**
   * The timestamp of when the export was deleted. Null if it wasn't. 
   */
  public RealmExport deletedTimestamp(BigDecimal deletedTimestamp) {
    this.deletedTimestamp = deletedTimestamp;
    return this;
  }

  
  @ApiModelProperty(value = "The timestamp of when the export was deleted. Null if it wasn't. ")
  @JsonProperty("deleted_timestamp")
  public BigDecimal getDeletedTimestamp() {
    return deletedTimestamp;
  }
  public void setDeletedTimestamp(BigDecimal deletedTimestamp) {
    this.deletedTimestamp = deletedTimestamp;
  }

  /**
   * The timestamp of when the export failed. Null if it didn't. 
   */
  public RealmExport failedTimestamp(BigDecimal failedTimestamp) {
    this.failedTimestamp = failedTimestamp;
    return this;
  }

  
  @ApiModelProperty(value = "The timestamp of when the export failed. Null if it didn't. ")
  @JsonProperty("failed_timestamp")
  public BigDecimal getFailedTimestamp() {
    return failedTimestamp;
  }
  public void setFailedTimestamp(BigDecimal failedTimestamp) {
    this.failedTimestamp = failedTimestamp;
  }

  /**
   * The URL of the export. `null` if there's no URL. 
   */
  public RealmExport exportUrl(String exportUrl) {
    this.exportUrl = exportUrl;
    return this;
  }

  
  @ApiModelProperty(value = "The URL of the export. `null` if there's no URL. ")
  @JsonProperty("export_url")
  public String getExportUrl() {
    return exportUrl;
  }
  public void setExportUrl(String exportUrl) {
    this.exportUrl = exportUrl;
  }

  /**
   * Whether the export is pending or not. 
   */
  public RealmExport pending(Boolean pending) {
    this.pending = pending;
    return this;
  }

  
  @ApiModelProperty(value = "Whether the export is pending or not. ")
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

