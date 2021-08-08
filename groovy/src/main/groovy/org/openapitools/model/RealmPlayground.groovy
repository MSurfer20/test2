package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class RealmPlayground {
    /* The unique ID for the realm playground.  */
    Integer id
    /* The user-visible display name of the playground.  Clients should display this in UI for picking which playground to open a code block in, to differentiate between multiple configured playground options for a given pygments language.  **Changes**: New in Zulip 4.0 (feature level 49).  */
    String name
    /* The name of the Pygments language lexer for that programming language.  */
    String pygmentsLanguage
    /* The url prefix for the playground.  */
    String urlPrefix
}
