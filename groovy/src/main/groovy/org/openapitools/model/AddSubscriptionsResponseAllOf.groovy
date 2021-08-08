package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Canonical
class AddSubscriptionsResponseAllOf {
    
    Object result = null
    
    Object msg = null
    /* A dictionary where the key is the email address of the user/bot and the value is a list of the names of the streams that were subscribed to as a result of the query.  */
    Map<String, List<String>> subscribed = new HashMap<String, List<String>>()
    /* A dictionary where the key is the email address of the user/bot and the value is a list of the names of the streams that the user/bot is already subscribed to.  */
    Map<String, List<String>> alreadySubscribed = new HashMap<String, List<String>>()
    /* A list of names of streams that the requesting user/bot was not authorized to subscribe to.  Only present if `authorization_errors_fatal=false`.  */
    List<String> unauthorized = new ArrayList<String>()
}
