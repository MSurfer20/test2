package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Canonical
class Draft {
    /* The unique ID of the draft. It will only used whenever the drafts are fetched. This field should not be specified when the draft is being created or edited.  */
    Integer id
    /* The type of the draft. Either unaddressed (empty string), \"stream\", or \"private\" (for PMs and private group messages).  */
    String type
    /* An array of the tentative target audience IDs. For \"stream\" messages, this should contain exactly 1 ID, the ID of the target stream. For private messages, this should be an array of target user IDs. For unaddressed drafts, this is ignored, and clients should send an empty array.  */
    List<Integer> to = new ArrayList<Integer>()
    /* For stream message drafts, the tentative topic name. For private or unaddressed messages, this will be ignored and should ideally be the empty string. Should not contain null bytes.  */
    String topic
    /* The body of the draft. Should not contain null bytes.  */
    String content
    /* A Unix timestamp (seconds only) representing when the draft was last edited. When creating a draft, this key need not be present and it will be filled in automatically by the server.  */
    BigDecimal timestamp
}
