package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class MessagesBaseTopicLinks {
    /* The original link text present in the topic.  */
    String text
    /* The expanded target url which the link points to.  */
    String url
}
