package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.JsonResponseBase;
import org.openapitools.model.JsonSuccessBaseAllOf;
import javax.validation.constraints.*;


import io.swagger.annotations.*;
import java.util.Objects;

import javax.xml.bind.annotation.*;


public class JsonSuccessBase   {
  

@XmlType(name="ResultEnum")
@XmlEnum(String.class)
public enum ResultEnum {

    @XmlEnumValue("success") SUCCESS(String.valueOf("success"));


    private String value;

    ResultEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static ResultEnum fromValue(String value) {
        for (ResultEnum b : ResultEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  private ResultEnum result;

  private String msg;


  /**
   **/
  public JsonSuccessBase result(ResultEnum result) {
    this.result = result;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("result")
  @NotNull
  public ResultEnum getResult() {
    return result;
  }
  public void setResult(ResultEnum result) {
    this.result = result;
  }


  /**
   **/
  public JsonSuccessBase msg(String msg) {
    this.msg = msg;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("msg")
  @NotNull
  public String getMsg() {
    return msg;
  }
  public void setMsg(String msg) {
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
    JsonSuccessBase jsonSuccessBase = (JsonSuccessBase) o;
    return Objects.equals(result, jsonSuccessBase.result) &&
        Objects.equals(msg, jsonSuccessBase.msg);
  }

  @Override
  public int hashCode() {
    return Objects.hash(result, msg);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JsonSuccessBase {\n");
    
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
    sb.append("    msg: ").append(toIndentedString(msg)).append("\n");
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

