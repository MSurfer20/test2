package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.EmojiReactionBaseAllOfUser;

@Canonical
class EmojiReactionBaseAllOf {
    /* The ID of the user who added the reaction.  **Changes**: New in Zulip 3.0 (feature level 2). The `user` object is deprecated and will be removed in the future.  */
    Integer userId
    
    EmojiReactionBaseAllOfUser user
}
