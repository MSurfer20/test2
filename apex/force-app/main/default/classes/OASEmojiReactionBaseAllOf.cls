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
 * OASEmojiReactionBaseAllOf
 */
public class OASEmojiReactionBaseAllOf implements OAS.MappedProperties {
    /**
     * The ID of the user who added the reaction.\n\n**Changes**: New in Zulip 3.0 (feature level 2). The `user`\nobject is deprecated and will be removed in the future.\n
     * @return userId
     */
    public Integer userId { get; set; }

    /**
     * Get user
     * @return user
     */
    public OASEmojiReactionBaseAllOfUser user { get; set; }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'user_id' => 'userId'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    public static OASEmojiReactionBaseAllOf getExample() {
        OASEmojiReactionBaseAllOf emojiReactionBaseAllOf = new OASEmojiReactionBaseAllOf();
          emojiReactionBaseAllOf.userId = 0;
          emojiReactionBaseAllOf.user = OASEmojiReactionBaseAllOfUser.getExample();
        return emojiReactionBaseAllOf;
    }

    public Boolean equals(Object obj) {
        if (obj instanceof OASEmojiReactionBaseAllOf) {           
            OASEmojiReactionBaseAllOf emojiReactionBaseAllOf = (OASEmojiReactionBaseAllOf) obj;
            return this.userId == emojiReactionBaseAllOf.userId
                && this.user == emojiReactionBaseAllOf.user;
        }
        return false;
    }

    public Integer hashCode() {
        Integer hashCode = 43;
        hashCode = (17 * hashCode) + (userId == null ? 0 : System.hashCode(userId));
        hashCode = (17 * hashCode) + (user == null ? 0 : System.hashCode(user));
        return hashCode;
    }
}

