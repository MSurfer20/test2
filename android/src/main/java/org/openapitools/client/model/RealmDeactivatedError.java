/**
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

import org.openapitools.client.model.CodedError;
import org.openapitools.client.model.OasAnyTypeNotMapped;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class RealmDeactivatedError {
  
  @SerializedName("result")
  private OasAnyTypeNotMapped result = null;
  @SerializedName("msg")
  private OasAnyTypeNotMapped msg = null;
  @SerializedName("code")
  private OasAnyTypeNotMapped code = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public OasAnyTypeNotMapped getResult() {
    return result;
  }
  public void setResult(OasAnyTypeNotMapped result) {
    this.result = result;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public OasAnyTypeNotMapped getMsg() {
    return msg;
  }
  public void setMsg(OasAnyTypeNotMapped msg) {
    this.msg = msg;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public OasAnyTypeNotMapped getCode() {
    return code;
  }
  public void setCode(OasAnyTypeNotMapped code) {
    this.code = code;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RealmDeactivatedError realmDeactivatedError = (RealmDeactivatedError) o;
    return (this.result == null ? realmDeactivatedError.result == null : this.result.equals(realmDeactivatedError.result)) &&
        (this.msg == null ? realmDeactivatedError.msg == null : this.msg.equals(realmDeactivatedError.msg)) &&
        (this.code == null ? realmDeactivatedError.code == null : this.code.equals(realmDeactivatedError.code));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.result == null ? 0: this.result.hashCode());
    result = 31 * result + (this.msg == null ? 0: this.msg.hashCode());
    result = 31 * result + (this.code == null ? 0: this.code.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class RealmDeactivatedError {\n");
    
    sb.append("  result: ").append(result).append("\n");
    sb.append("  msg: ").append(msg).append("\n");
    sb.append("  code: ").append(code).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
