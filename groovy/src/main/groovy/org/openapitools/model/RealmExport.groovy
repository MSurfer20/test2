package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;

@Canonical
class RealmExport {
    /* The id of the export.  */
    Integer id
    /* The id of the user who did the export.  */
    Integer actingUserId
    /* The UNIX timestamp of when the export was made.  */
    BigDecimal exportTime
    /* The timestamp of when the export was deleted. Null if it wasn't.  */
    BigDecimal deletedTimestamp
    /* The timestamp of when the export failed. Null if it didn't.  */
    BigDecimal failedTimestamp
    /* The URL of the export. `null` if there's no URL.  */
    String exportUrl
    /* Whether the export is pending or not.  */
    Boolean pending
}
