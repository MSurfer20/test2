package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import java.math.BigDecimal;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Object containing details about a realm export. 
 */
@ApiModel(description="Object containing details about a realm export. ")

public class RealmExport  {
  
 /**
  * The id of the export. 
  */
  @ApiModelProperty(value = "The id of the export. ")
  private Integer id;

 /**
  * The id of the user who did the export. 
  */
  @ApiModelProperty(value = "The id of the user who did the export. ")
  private Integer actingUserId;

 /**
  * The UNIX timestamp of when the export was made. 
  */
  @ApiModelProperty(value = "The UNIX timestamp of when the export was made. ")
  @Valid
  private BigDecimal exportTime;

 /**
  * The timestamp of when the export was deleted. Null if it wasn't. 
  */
  @ApiModelProperty(value = "The timestamp of when the export was deleted. Null if it wasn't. ")
  @Valid
  private BigDecimal deletedTimestamp;

 /**
  * The timestamp of when the export failed. Null if it didn't. 
  */
  @ApiModelProperty(value = "The timestamp of when the export failed. Null if it didn't. ")
  @Valid
  private BigDecimal failedTimestamp;

 /**
  * The URL of the export. `null` if there's no URL. 
  */
  @ApiModelProperty(value = "The URL of the export. `null` if there's no URL. ")
  private String exportUrl;

 /**
  * Whether the export is pending or not. 
  */
  @ApiModelProperty(value = "Whether the export is pending or not. ")
  private Boolean pending;
 /**
  * The id of the export. 
  * @return id
  */
  @JsonProperty("id")
  public Integer getId() {
    return id;
  }

  /**
   * Sets the <code>id</code> property.
   */
  public void setId(Integer id) {
    this.id = id;
  }

  /**
   * Sets the <code>id</code> property.
   */
  public RealmExport id(Integer id) {
    this.id = id;
    return this;
  }

 /**
  * The id of the user who did the export. 
  * @return actingUserId
  */
  @JsonProperty("acting_user_id")
  public Integer getActingUserId() {
    return actingUserId;
  }

  /**
   * Sets the <code>actingUserId</code> property.
   */
  public void setActingUserId(Integer actingUserId) {
    this.actingUserId = actingUserId;
  }

  /**
   * Sets the <code>actingUserId</code> property.
   */
  public RealmExport actingUserId(Integer actingUserId) {
    this.actingUserId = actingUserId;
    return this;
  }

 /**
  * The UNIX timestamp of when the export was made. 
  * @return exportTime
  */
  @JsonProperty("export_time")
  public BigDecimal getExportTime() {
    return exportTime;
  }

  /**
   * Sets the <code>exportTime</code> property.
   */
  public void setExportTime(BigDecimal exportTime) {
    this.exportTime = exportTime;
  }

  /**
   * Sets the <code>exportTime</code> property.
   */
  public RealmExport exportTime(BigDecimal exportTime) {
    this.exportTime = exportTime;
    return this;
  }

 /**
  * The timestamp of when the export was deleted. Null if it wasn&#39;t. 
  * @return deletedTimestamp
  */
  @JsonProperty("deleted_timestamp")
  public BigDecimal getDeletedTimestamp() {
    return deletedTimestamp;
  }

  /**
   * Sets the <code>deletedTimestamp</code> property.
   */
  public void setDeletedTimestamp(BigDecimal deletedTimestamp) {
    this.deletedTimestamp = deletedTimestamp;
  }

  /**
   * Sets the <code>deletedTimestamp</code> property.
   */
  public RealmExport deletedTimestamp(BigDecimal deletedTimestamp) {
    this.deletedTimestamp = deletedTimestamp;
    return this;
  }

 /**
  * The timestamp of when the export failed. Null if it didn&#39;t. 
  * @return failedTimestamp
  */
  @JsonProperty("failed_timestamp")
  public BigDecimal getFailedTimestamp() {
    return failedTimestamp;
  }

  /**
   * Sets the <code>failedTimestamp</code> property.
   */
  public void setFailedTimestamp(BigDecimal failedTimestamp) {
    this.failedTimestamp = failedTimestamp;
  }

  /**
   * Sets the <code>failedTimestamp</code> property.
   */
  public RealmExport failedTimestamp(BigDecimal failedTimestamp) {
    this.failedTimestamp = failedTimestamp;
    return this;
  }

 /**
  * The URL of the export. &#x60;null&#x60; if there&#39;s no URL. 
  * @return exportUrl
  */
  @JsonProperty("export_url")
  public String getExportUrl() {
    return exportUrl;
  }

  /**
   * Sets the <code>exportUrl</code> property.
   */
  public void setExportUrl(String exportUrl) {
    this.exportUrl = exportUrl;
  }

  /**
   * Sets the <code>exportUrl</code> property.
   */
  public RealmExport exportUrl(String exportUrl) {
    this.exportUrl = exportUrl;
    return this;
  }

 /**
  * Whether the export is pending or not. 
  * @return pending
  */
  @JsonProperty("pending")
  public Boolean getPending() {
    return pending;
  }

  /**
   * Sets the <code>pending</code> property.
   */
  public void setPending(Boolean pending) {
    this.pending = pending;
  }

  /**
   * Sets the <code>pending</code> property.
   */
  public RealmExport pending(Boolean pending) {
    this.pending = pending;
    return this;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

