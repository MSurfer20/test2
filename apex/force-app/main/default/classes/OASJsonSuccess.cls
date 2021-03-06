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
 * OASJsonSuccess
 */
public class OASJsonSuccess implements OASJsonSuccessBase, OASJsonSuccessAllOf {
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

    public static OASJsonSuccess getExample() {
        OASJsonSuccess jsonSuccess = new OASJsonSuccess();
          jsonSuccess.result = oas_any_type_not_mapped.getExample();
          jsonSuccess.msg = oas_any_type_not_mapped.getExample();
        return jsonSuccess;
    }

    public Boolean equals(Object obj) {
        if (obj instanceof OASJsonSuccess) {           
            OASJsonSuccess jsonSuccess = (OASJsonSuccess) obj;
            return this.result == jsonSuccess.result
                && this.msg == jsonSuccess.msg;
        }
        return false;
    }

    public Integer hashCode() {
        Integer hashCode = 43;
        hashCode = (17 * hashCode) + (result == null ? 0 : System.hashCode(result));
        hashCode = (17 * hashCode) + (msg == null ? 0 : System.hashCode(msg));
        return hashCode;
    }
}

