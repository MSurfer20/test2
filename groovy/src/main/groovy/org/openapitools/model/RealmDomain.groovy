package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class RealmDomain {
    /* The new allowed domain.  */
    String domain
    /* Whether subdomains are allowed for this domain.  */
    Boolean allowSubdomains
}
