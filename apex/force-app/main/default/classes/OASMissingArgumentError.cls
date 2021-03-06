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
 * OASMissingArgumentError
 */
public class OASMissingArgumentError implements OASCodedErrorBase, OASMissingArgumentErrorAllOf, OAS.MappedProperties {
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
     * Get code
     * @return code
     */
    public oas_any_type_not_mapped code { get; set; }

    /**
     * It contains the information about the missing parameter.\n
     * @return varName
     */
    public String varName { get; set; }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'var_name' => 'varName'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    public static OASMissingArgumentError getExample() {
        OASMissingArgumentError missingArgumentError = new OASMissingArgumentError();
          missingArgumentError.result = oas_any_type_not_mapped.getExample();
          missingArgumentError.msg = oas_any_type_not_mapped.getExample();
          missingArgumentError.code = oas_any_type_not_mapped.getExample();
          missingArgumentError.varName = '';
        return missingArgumentError;
    }

    public Boolean equals(Object obj) {
        if (obj instanceof OASMissingArgumentError) {           
            OASMissingArgumentError missingArgumentError = (OASMissingArgumentError) obj;
            return this.result == missingArgumentError.result
                && this.msg == missingArgumentError.msg
                && this.code == missingArgumentError.code
                && this.varName == missingArgumentError.varName;
        }
        return false;
    }

    public Integer hashCode() {
        Integer hashCode = 43;
        hashCode = (17 * hashCode) + (result == null ? 0 : System.hashCode(result));
        hashCode = (17 * hashCode) + (msg == null ? 0 : System.hashCode(msg));
        hashCode = (17 * hashCode) + (code == null ? 0 : System.hashCode(code));
        hashCode = (17 * hashCode) + (varName == null ? 0 : System.hashCode(varName));
        return hashCode;
    }
}

