package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.JsonErrorBaseAllOf;
import org.openapitools.model.JsonResponseBase;
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


public class JsonErrorBase  {
  
@XmlType(name="ResultEnum")
@XmlEnum(String.class)
public enum ResultEnum {

    @XmlEnumValue("error") @JsonProperty("error") ERROR(String.valueOf("error"));

    private String value;

    ResultEnum (String v) {
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

  @ApiModelProperty(required = true, value = "")
  private ResultEnum result;

  @ApiModelProperty(required = true, value = "")
  private String msg;
 /**
  * Get result
  * @return result
  */
  @JsonProperty("result")
  @NotNull
  public String getResult() {
    return result == null ? null : result.value();
  }

  /**
   * Sets the <code>result</code> property.
   */
  public void setResult(ResultEnum result) {
    this.result = result;
  }

  /**
   * Sets the <code>result</code> property.
   */
  public JsonErrorBase result(ResultEnum result) {
    this.result = result;
    return this;
  }

 /**
  * Get msg
  * @return msg
  */
  @JsonProperty("msg")
  @NotNull
  public String getMsg() {
    return msg;
  }

  /**
   * Sets the <code>msg</code> property.
   */
  public void setMsg(String msg) {
    this.msg = msg;
  }

  /**
   * Sets the <code>msg</code> property.
   */
  public JsonErrorBase msg(String msg) {
    this.msg = msg;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JsonErrorBase {\n");
    
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
    sb.append("    msg: ").append(toIndentedString(msg)).append("\n");
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

