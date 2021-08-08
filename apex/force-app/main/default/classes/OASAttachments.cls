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
 * Dictionary containing details of a file uploaded by a user.\n
 */
public class OASAttachments implements OAS.MappedProperties {
    /**
     * The unique ID for the attachment.\n
     * @return id
     */
    public Integer id { get; set; }

    /**
     * Name of the uploaded file.\n
     * @return name
     */
    public String name { get; set; }

    /**
     * A representation of the path of the file within the\nrepository of user-uploaded files.  If the `path_id` of a\nfile is `{realm_id}/ab/cdef/temp_file.py`, its URL will be:\n`{server_url}/user_uploads/{realm_id}/ab/cdef/temp_file.py`.\n
     * @return pathId
     */
    public String pathId { get; set; }

    /**
     * Size of the file in bytes.\n
     * @return size
     */
    public Integer size { get; set; }

    /**
     * Time when the attachment was uploaded as a UNIX timestamp\nmultiplied by 1000 (matching the format of getTime() in JavaScript).\n\n**Changes**: Changed in Zulip 2.2 (feature level 22).  This field was\npreviously a floating point number.\n
     * @return createTime
     */
    public Integer createTime { get; set; }

    /**
     * Contains basic details on any Zulip messages that have been\nsent referencing this [uploaded file](/api/upload-file).\nThis includes messages sent by any user in the Zulip\norganization who sent a message containing a link to the\nuploaded file.\n
     * @return messages
     */
    public List<OASAttachmentsMessages> messages { get; set; }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'path_id' => 'pathId',
        'create_time' => 'createTime'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'path_id' => 'pathId',
        'create_time' => 'createTime'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    public OASAttachments() {
        messages = new List<OASAttachmentsMessages>();
    }

    public static OASAttachments getExample() {
        OASAttachments attachments = new OASAttachments();
          attachments.id = 0;
          attachments.name = '';
          attachments.pathId = '';
          attachments.size = 0;
          attachments.createTime = 0;
          attachments.messages = new List<OASAttachmentsMessages>{OASAttachmentsMessages.getExample()};
        return attachments;
    }

    public Boolean equals(Object obj) {
        if (obj instanceof OASAttachments) {           
            OASAttachments attachments = (OASAttachments) obj;
            return this.id == attachments.id
                && this.name == attachments.name
                && this.pathId == attachments.pathId
                && this.size == attachments.size
                && this.createTime == attachments.createTime
                && this.messages == attachments.messages;
        }
        return false;
    }

    public Integer hashCode() {
        Integer hashCode = 43;
        hashCode = (17 * hashCode) + (id == null ? 0 : System.hashCode(id));
        hashCode = (17 * hashCode) + (name == null ? 0 : System.hashCode(name));
        hashCode = (17 * hashCode) + (pathId == null ? 0 : System.hashCode(pathId));
        hashCode = (17 * hashCode) + (size == null ? 0 : System.hashCode(size));
        hashCode = (17 * hashCode) + (createTime == null ? 0 : System.hashCode(createTime));
        hashCode = (17 * hashCode) + (messages == null ? 0 : System.hashCode(messages));
        return hashCode;
    }
}
