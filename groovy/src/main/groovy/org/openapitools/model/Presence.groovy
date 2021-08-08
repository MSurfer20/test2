package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class Presence {
    /* The client's platform name.  */
    String client
    /* The status of the user on this client. It is either `idle` or `active`.  */
    String status
    /* The UNIX timestamp of when this client sent the user's presence to the server with the precision of a second.  */
    Integer timestamp
    /* Whether the client is capable of showing mobile/push notifications to the user.  */
    Boolean pushable
}
