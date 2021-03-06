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

import org.openapitools.client.model.OasAnyTypeNotMapped;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class JsonSuccessAllOf {
  
  @SerializedName("result")
  private OasAnyTypeNotMapped result = null;
  @SerializedName("msg")
  private OasAnyTypeNotMapped msg = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public OasAnyTypeNotMapped getResult() {
    return result;
  }
  public void setResult(OasAnyTypeNotMapped result) {
    this.result = result;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public OasAnyTypeNotMapped getMsg() {
    return msg;
  }
  public void setMsg(OasAnyTypeNotMapped msg) {
    this.msg = msg;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JsonSuccessAllOf jsonSuccessAllOf = (JsonSuccessAllOf) o;
    return (this.result == null ? jsonSuccessAllOf.result == null : this.result.equals(jsonSuccessAllOf.result)) &&
        (this.msg == null ? jsonSuccessAllOf.msg == null : this.msg.equals(jsonSuccessAllOf.msg));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.result == null ? 0: this.result.hashCode());
    result = 31 * result + (this.msg == null ? 0: this.msg.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class JsonSuccessAllOf {\n");
    
    sb.append("  result: ").append(result).append("\n");
    sb.append("  msg: ").append(msg).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
