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
 * Dictionary with data on the user who added the reaction, including\nthe user ID as the &#x60;id&#x60; field.  **Note**: In the [events\nAPI](/api/get-events), this &#x60;user&#x60; dictionary\nconfusing had the user ID in a field called &#x60;user_id&#x60;\ninstead.  We recommend ignoring fields other than the user\nID.  **Deprecated** and to be removed in a future release\nonce core clients have migrated to use the &#x60;user_id&#x60; field.\n
 */
public class OASEmojiReactionBaseUser implements OAS.MappedProperties {
    /**
     * ID of the user.\n
     * @return id
     */
    public Integer id { get; set; }

    /**
     * Email of the user.\n
     * @return email
     */
    public String email { get; set; }

    /**
     * Full name of the user.\n
     * @return fullName
     */
    public String fullName { get; set; }

    /**
     * Whether the user is a mirror dummy.\n
     * @return isMirrorDummy
     */
    public Boolean isMirrorDummy { get; set; }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'full_name' => 'fullName',
        'is_mirror_dummy' => 'isMirrorDummy'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'full_name' => 'fullName',
        'is_mirror_dummy' => 'isMirrorDummy'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    public static OASEmojiReactionBaseUser getExample() {
        OASEmojiReactionBaseUser emojiReactionBaseUser = new OASEmojiReactionBaseUser();
          emojiReactionBaseUser.id = 0;
          emojiReactionBaseUser.email = '';
          emojiReactionBaseUser.fullName = '';
          emojiReactionBaseUser.isMirrorDummy = true;
        return emojiReactionBaseUser;
    }

    public Boolean equals(Object obj) {
        if (obj instanceof OASEmojiReactionBaseUser) {           
            OASEmojiReactionBaseUser emojiReactionBaseUser = (OASEmojiReactionBaseUser) obj;
            return this.id == emojiReactionBaseUser.id
                && this.email == emojiReactionBaseUser.email
                && this.fullName == emojiReactionBaseUser.fullName
                && this.isMirrorDummy == emojiReactionBaseUser.isMirrorDummy;
        }
        return false;
    }

    public Integer hashCode() {
        Integer hashCode = 43;
        hashCode = (17 * hashCode) + (id == null ? 0 : System.hashCode(id));
        hashCode = (17 * hashCode) + (email == null ? 0 : System.hashCode(email));
        hashCode = (17 * hashCode) + (fullName == null ? 0 : System.hashCode(fullName));
        hashCode = (17 * hashCode) + (isMirrorDummy == null ? 0 : System.hashCode(isMirrorDummy));
        return hashCode;
    }
}
