package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

@Canonical
class UserGroup {
    /* The name of the user group.  */
    String name
    /* The description of the user group.  */
    String description
    /* Array containing the id of the users who are members of this user group.  */
    List<Integer> members = new ArrayList<Integer>()
    /* The ID of the user group.  */
    Integer id
}
