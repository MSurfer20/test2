package org.openapitools.model;


import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class JsonSuccessBaseAllOf  {
  
@XmlType(name="ResultEnum")
@XmlEnum(String.class)
public enum ResultEnum {

@XmlEnumValue("success") SUCCESS(String.valueOf("success"));


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
  **/
  @JsonProperty("result")
  public String getResult() {
    if (result == null) {
      return null;
    }
    return result.value();
  }

  public void setResult(ResultEnum result) {
    this.result = result;
  }

  public JsonSuccessBaseAllOf result(ResultEnum result) {
    this.result = result;
    return this;
  }

 /**
   * Get msg
   * @return msg
  **/
  @JsonProperty("msg")
  public String getMsg() {
    return msg;
  }

  public void setMsg(String msg) {
    this.msg = msg;
  }

  public JsonSuccessBaseAllOf msg(String msg) {
    this.msg = msg;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JsonSuccessBaseAllOf {\n");
    
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

