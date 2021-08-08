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
import java.math.BigDecimal;

/**
 * Object containing details about a realm export. 
 */
@ApiModel(description = "Object containing details about a realm export. ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-08-08T21:19:12.385396Z[Etc/UTC]")
public class RealmExport {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_ACTING_USER_ID = "acting_user_id";
  @SerializedName(SERIALIZED_NAME_ACTING_USER_ID)
  private Integer actingUserId;

  public static final String SERIALIZED_NAME_EXPORT_TIME = "export_time";
  @SerializedName(SERIALIZED_NAME_EXPORT_TIME)
  private BigDecimal exportTime;

  public static final String SERIALIZED_NAME_DELETED_TIMESTAMP = "deleted_timestamp";
  @SerializedName(SERIALIZED_NAME_DELETED_TIMESTAMP)
  private BigDecimal deletedTimestamp;

  public static final String SERIALIZED_NAME_FAILED_TIMESTAMP = "failed_timestamp";
  @SerializedName(SERIALIZED_NAME_FAILED_TIMESTAMP)
  private BigDecimal failedTimestamp;

  public static final String SERIALIZED_NAME_EXPORT_URL = "export_url";
  @SerializedName(SERIALIZED_NAME_EXPORT_URL)
  private String exportUrl;

  public static final String SERIALIZED_NAME_PENDING = "pending";
  @SerializedName(SERIALIZED_NAME_PENDING)
  private Boolean pending;


  public RealmExport id(Integer id) {
    
    this.id = id;
    return this;
  }

   /**
   * The id of the export. 
   * @return id
  **/
  @javax.annotation.Nullable
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
  @javax.annotation.Nullable
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
  @javax.annotation.Nullable
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
   * The timestamp of when the export was deleted. Null if it wasn&#39;t. 
   * @return deletedTimestamp
  **/
  @javax.annotation.Nullable
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
   * The timestamp of when the export failed. Null if it didn&#39;t. 
   * @return failedTimestamp
  **/
  @javax.annotation.Nullable
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
   * The URL of the export. &#x60;null&#x60; if there&#39;s no URL. 
   * @return exportUrl
  **/
  @javax.annotation.Nullable
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
  @javax.annotation.Nullable
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

