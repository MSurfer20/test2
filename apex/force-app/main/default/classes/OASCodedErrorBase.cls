/*
 * Zulip REST API
 * Powerful open source group chat\n
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the OAS code generator program.
 * https://github.com/OpenAPITools/openapi-generator
 * Do not edit the class manually.
 */

/**
 * OASCodedErrorBase
 */
public class OASCodedErrorBase implements OASJsonErrorBase, OASCodedErrorBaseAllOf {
    /**
     * Get result
     * @return result
     */
    public oas_any_type_not_mapped result { get; set; }

    /**
     * Get msg
     * @return msg
     */
    public oas_any_type_not_mapped msg { get; set; }

    /**
     * A string that identifies the error.\n
     * @return code
     */
    public String code { get; set; }

    public static OASCodedErrorBase getExample() {
        OASCodedErrorBase codedErrorBase = new OASCodedErrorBase();
          codedErrorBase.result = oas_any_type_not_mapped.getExample();
          codedErrorBase.msg = oas_any_type_not_mapped.getExample();
          codedErrorBase.code = '';
        return codedErrorBase;
    }

    public Boolean equals(Object obj) {
        if (obj instanceof OASCodedErrorBase) {           
            OASCodedErrorBase codedErrorBase = (OASCodedErrorBase) obj;
            return this.result == codedErrorBase.result
                && this.msg == codedErrorBase.msg
                && this.code == codedErrorBase.code;
        }
        return false;
    }

    public Integer hashCode() {
        Integer hashCode = 43;
        hashCode = (17 * hashCode) + (result == null ? 0 : System.hashCode(result));
        hashCode = (17 * hashCode) + (msg == null ? 0 : System.hashCode(msg));
        hashCode = (17 * hashCode) + (code == null ? 0 : System.hashCode(code));
        return hashCode;
    }
}

