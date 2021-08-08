package com.prokarma.pkmst.controller;

import java.io.File;
import com.prokarma.pkmst.model.JsonSuccess;
import com.prokarma.pkmst.model.JsonSuccessBase;

import io.swagger.annotations.*;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
/**
 * Api implemention
 * @author pkmst
 *
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2021-08-08T21:19:29.098714Z[Etc/UTC]")
@Controller
public class ServerAndOrganizationsApiController implements ServerAndOrganizationsApi {
    private final ObjectMapper objectMapper;
@Autowired
    public ServerAndOrganizationsApiController(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    public ResponseEntity<JsonSuccessBase> addCodePlayground(@ApiParam(value = "The user-visible display name of the playground which can be used to pick the target playground, especially when multiple playground options exist for that programming language. ", required = true)  @RequestParam(value = "name", required = true) String name,
        @ApiParam(value = "The name of the Pygments language lexer for that programming language. ", required = true)  @RequestParam(value = "pygments_language", required = true) String pygmentsLanguage,
        @ApiParam(value = "The url prefix for the playground. ", required = true)  @RequestParam(value = "url_prefix", required = true) String urlPrefix,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!
        return new ResponseEntity<JsonSuccessBase>(HttpStatus.OK);
    }

    public ResponseEntity<JsonSuccessBase> addLinkifier(@ApiParam(value = "The [Python regular expression](https://docs.python.org/3/howto/regex.html) that should trigger the linkifier. ", required = true)  @RequestParam(value = "pattern", required = true) String pattern,
        @ApiParam(value = "The URL used for the link. If you used named groups for the `pattern`, you can insert their content here with `%(name_of_the_capturing_group)s`. ", required = true)  @RequestParam(value = "url_format_string", required = true) String urlFormatString,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!
        return new ResponseEntity<JsonSuccessBase>(HttpStatus.OK);
    }

    public ResponseEntity<JsonSuccessBase> createCustomProfileField(@ApiParam(value = "The field type can be any of the supported custom profile field types. See the [custom profile fields documentation](/help/add-custom-profile-fields) more details on what each type means.  * **1**: Short text * **2**: Long text * **3**: List of options * **4**: Date picker * **5**: Link * **6**: Person picker * **7**: External account ", required = true)  @RequestParam(value = "field_type", required = true) Integer fieldType,
        @ApiParam(value = "The name of the custom profile field, which will appear both in user-facing settings UI for configuring custom profile fields and in UI displaying a user's profile. ")  @RequestParam(value = "name", required = false) String name,
        @ApiParam(value = "The help text to be displayed for the custom profile field in user-facing settings UI for configuring custom profile fields. ")  @RequestParam(value = "hint", required = false) String hint,
        @ApiParam(value = "Field types 3 (List of options) and 7 (External account) support storing additional configuration for the field type in the `field_data` attribute.  For field type 3 (List of options), this attribute is a JSON dictionary defining the choices and the order they will be displayed in the dropdown UI for individual users to select an option.  The interface for field type 7 is not yet stabilized. ")  @RequestParam(value = "field_data", required = false) Object fieldData,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!
        return new ResponseEntity<JsonSuccessBase>(HttpStatus.OK);
    }

    public ResponseEntity<JsonSuccessBase> getCustomEmoji(@RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!
        return new ResponseEntity<JsonSuccessBase>(HttpStatus.OK);
    }

    public ResponseEntity<JsonSuccessBase> getCustomProfileFields(@RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!
        return new ResponseEntity<JsonSuccessBase>(HttpStatus.OK);
    }

    public ResponseEntity<JsonSuccessBase> getLinkifiers(@RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!
        return new ResponseEntity<JsonSuccessBase>(HttpStatus.OK);
    }

    public ResponseEntity<JsonSuccessBase> getServerSettings(@RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!
        return new ResponseEntity<JsonSuccessBase>(HttpStatus.OK);
    }

    public ResponseEntity<JsonSuccess> removeCodePlayground(@ApiParam(value = "The ID of the playground that you want to remove. ",required=true ) @PathVariable("playground_id") Integer playgroundId,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!
        return new ResponseEntity<JsonSuccess>(HttpStatus.OK);
    }

    public ResponseEntity<JsonSuccess> removeLinkifier(@ApiParam(value = "The ID of the linkifier that you want to remove. ",required=true ) @PathVariable("filter_id") Integer filterId,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!
        return new ResponseEntity<JsonSuccess>(HttpStatus.OK);
    }

    public ResponseEntity<JsonSuccess> reorderCustomProfileFields(@ApiParam(value = "A list of the IDs of all the custom profile fields defined in this organization, in the desired new order. ", required = true)  @RequestParam(value = "order", required = true) List<Integer> order,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!
        return new ResponseEntity<JsonSuccess>(HttpStatus.OK);
    }

    public ResponseEntity<JsonSuccess> updateLinkifier(@ApiParam(value = "The ID of the linkifier that you want to update. ",required=true ) @PathVariable("filter_id") Integer filterId,
        @ApiParam(value = "The [Python regular expression](https://docs.python.org/3/howto/regex.html) that should trigger the linkifier. ", required = true)  @RequestParam(value = "pattern", required = true) String pattern,
        @ApiParam(value = "The URL used for the link. If you used named groups for the `pattern`, you can insert their content here with `%(name_of_the_capturing_group)s`. ", required = true)  @RequestParam(value = "url_format_string", required = true) String urlFormatString,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!
        return new ResponseEntity<JsonSuccess>(HttpStatus.OK);
    }

    public ResponseEntity<JsonSuccess> uploadCustomEmoji(@ApiParam(value = "The name that should be associated with the uploaded emoji image/gif. The emoji name can only contain letters, numbers, dashes, and spaces. Upper and lower case letters are treated the same, and underscores (_) are treated the same as spaces (consistent with how the Zulip UI handles emoji). ",required=true ) @PathVariable("emoji_name") String emojiName,
        @ApiParam(value = "file detail")  @RequestPart("file") MultipartFile filename,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!
        return new ResponseEntity<JsonSuccess>(HttpStatus.OK);
    }

}
