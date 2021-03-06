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
 * OASEmojiReaction
 */
public class OASEmojiReaction implements OASEmojiReactionBase, OASEmojiReactionAllOf, OAS.MappedProperties {
    /**
     * Get emojiCode
     * @return emojiCode
     */
    public oas_any_type_not_mapped emojiCode { get; set; }

    /**
     * Get emojiName
     * @return emojiName
     */
    public oas_any_type_not_mapped emojiName { get; set; }

    /**
     * Get reactionType
     * @return reactionType
     */
    public oas_any_type_not_mapped reactionType { get; set; }

    /**
     * Get userId
     * @return userId
     */
    public oas_any_type_not_mapped userId { get; set; }

    /**
     * Get user
     * @return user
     */
    public oas_any_type_not_mapped user { get; set; }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'emoji_code' => 'emojiCode',
        'emoji_name' => 'emojiName',
        'reaction_type' => 'reactionType',
        'user_id' => 'userId'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'emoji_code' => 'emojiCode',
        'emoji_name' => 'emojiName',
        'reaction_type' => 'reactionType',
        'user_id' => 'userId'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'emoji_code' => 'emojiCode',
        'emoji_name' => 'emojiName',
        'reaction_type' => 'reactionType',
        'user_id' => 'userId'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'emoji_code' => 'emojiCode',
        'emoji_name' => 'emojiName',
        'reaction_type' => 'reactionType',
        'user_id' => 'userId'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    public static OASEmojiReaction getExample() {
        OASEmojiReaction emojiReaction = new OASEmojiReaction();
          emojiReaction.emojiCode = oas_any_type_not_mapped.getExample();
          emojiReaction.emojiName = oas_any_type_not_mapped.getExample();
          emojiReaction.reactionType = oas_any_type_not_mapped.getExample();
          emojiReaction.userId = oas_any_type_not_mapped.getExample();
          emojiReaction.user = oas_any_type_not_mapped.getExample();
        return emojiReaction;
    }

    public Boolean equals(Object obj) {
        if (obj instanceof OASEmojiReaction) {           
            OASEmojiReaction emojiReaction = (OASEmojiReaction) obj;
            return this.emojiCode == emojiReaction.emojiCode
                && this.emojiName == emojiReaction.emojiName
                && this.reactionType == emojiReaction.reactionType
                && this.userId == emojiReaction.userId
                && this.user == emojiReaction.user;
        }
        return false;
    }

    public Integer hashCode() {
        Integer hashCode = 43;
        hashCode = (17 * hashCode) + (emojiCode == null ? 0 : System.hashCode(emojiCode));
        hashCode = (17 * hashCode) + (emojiName == null ? 0 : System.hashCode(emojiName));
        hashCode = (17 * hashCode) + (reactionType == null ? 0 : System.hashCode(reactionType));
        hashCode = (17 * hashCode) + (userId == null ? 0 : System.hashCode(userId));
        hashCode = (17 * hashCode) + (user == null ? 0 : System.hashCode(user));
        return hashCode;
    }
}

