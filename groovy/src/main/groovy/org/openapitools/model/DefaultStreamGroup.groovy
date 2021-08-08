package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.BasicStream;

@Canonical
class DefaultStreamGroup {
    /* Name of the default stream group.  */
    String name
    /* Description of the default stream group.  */
    String description
    /* id of the default stream group.  */
    Integer id
    /* Array containing details about the streams in the default stream group.  */
    List<BasicStream> streams = new ArrayList<BasicStream>()
}
