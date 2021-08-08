package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;

@Canonical
class Hotspot {
    /* The delay after which the user should be shown the hotspot.  */
    BigDecimal delay
    /* The name of the hotspot.  */
    String name
    /* The title of the hotspot, as will be displayed to the user.  */
    String title
    /* The description of the hotspot, as will be displayed to the user.  */
    String description
}
