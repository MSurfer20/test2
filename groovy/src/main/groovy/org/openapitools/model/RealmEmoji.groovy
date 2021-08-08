package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class RealmEmoji {
    /* The ID for this emoji, same as the object's key.  */
    String id
    /* The user-friendly name for this emoji. Users in the organization can use this emoji by writing this name between colons (`:name  :`).  */
    String name
    /* The path relative to the organization's URL where the emoji's image can be found.  */
    String sourceUrl
    /* Whether the emoji has been deactivated or not.  */
    Boolean deactivated
    /* The user ID of the user who uploaded the custom emoji. Will be null if the uploader is unknown.  **Changes**: New in Zulip 3.0 (feature level 7).  Previously was accessible via and `author` object with an `id` field.  */
    Integer authorId
}
