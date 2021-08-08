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
 * OASAttachmentsMessages
 */
public class OASAttachmentsMessages implements OAS.MappedProperties {
    /**
     * Time when the message was sent as a UNIX timestamp\nmultiplied by 1000 (matching the format of getTime() in JavaScript).\n\n**Changes**: Changed in Zulip 2.2 (feature level 22).  This\nfield was previously strangely called `name` and was a floating\npoint number.\n
     * @return dateSent
     */
    public Integer dateSent { get; set; }

    /**
     * The unique message ID.  Messages should always be\ndisplayed sorted by ID.\n
     * @return id
     */
    public Integer id { get; set; }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'date_sent' => 'dateSent'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    public static OASAttachmentsMessages getExample() {
        OASAttachmentsMessages attachmentsMessages = new OASAttachmentsMessages();
          attachmentsMessages.dateSent = 0;
          attachmentsMessages.id = 0;
        return attachmentsMessages;
    }

    public Boolean equals(Object obj) {
        if (obj instanceof OASAttachmentsMessages) {           
            OASAttachmentsMessages attachmentsMessages = (OASAttachmentsMessages) obj;
            return this.dateSent == attachmentsMessages.dateSent
                && this.id == attachmentsMessages.id;
        }
        return false;
    }

    public Integer hashCode() {
        Integer hashCode = 43;
        hashCode = (17 * hashCode) + (dateSent == null ? 0 : System.hashCode(dateSent));
        hashCode = (17 * hashCode) + (id == null ? 0 : System.hashCode(id));
        return hashCode;
    }
}
