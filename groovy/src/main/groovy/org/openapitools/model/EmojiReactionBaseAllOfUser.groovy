package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class EmojiReactionBaseAllOfUser {
    /* ID of the user.  */
    Integer id
    /* Email of the user.  */
    String email
    /* Full name of the user.  */
    String fullName
    /* Whether the user is a mirror dummy.  */
    Boolean isMirrorDummy
}
