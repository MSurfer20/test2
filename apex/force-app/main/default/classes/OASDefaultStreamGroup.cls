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
 * Dictionary containing details of a default stream\ngroup.\n
 */
public class OASDefaultStreamGroup {
    /**
     * Name of the default stream group.\n
     * @return name
     */
    public String name { get; set; }

    /**
     * Description of the default stream group.\n
     * @return description
     */
    public String description { get; set; }

    /**
     * id of the default stream group.\n
     * @return id
     */
    public Integer id { get; set; }

    /**
     * Array containing details about the streams\nin the default stream group.\n
     * @return streams
     */
    public List<OASBasicStream> streams { get; set; }

    public OASDefaultStreamGroup() {
        streams = new List<OASBasicStream>();
    }

    public static OASDefaultStreamGroup getExample() {
        OASDefaultStreamGroup defaultStreamGroup = new OASDefaultStreamGroup();
          defaultStreamGroup.name = '';
          defaultStreamGroup.description = '';
          defaultStreamGroup.id = 0;
          defaultStreamGroup.streams = new List<OASBasicStream>{OASBasicStream.getExample()};
        return defaultStreamGroup;
    }

    public Boolean equals(Object obj) {
        if (obj instanceof OASDefaultStreamGroup) {           
            OASDefaultStreamGroup defaultStreamGroup = (OASDefaultStreamGroup) obj;
            return this.name == defaultStreamGroup.name
                && this.description == defaultStreamGroup.description
                && this.id == defaultStreamGroup.id
                && this.streams == defaultStreamGroup.streams;
        }
        return false;
    }

    public Integer hashCode() {
        Integer hashCode = 43;
        hashCode = (17 * hashCode) + (name == null ? 0 : System.hashCode(name));
        hashCode = (17 * hashCode) + (description == null ? 0 : System.hashCode(description));
        hashCode = (17 * hashCode) + (id == null ? 0 : System.hashCode(id));
        hashCode = (17 * hashCode) + (streams == null ? 0 : System.hashCode(streams));
        return hashCode;
    }
}

