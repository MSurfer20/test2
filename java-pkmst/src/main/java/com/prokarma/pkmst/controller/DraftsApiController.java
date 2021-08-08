package com.prokarma.pkmst.controller;

import com.prokarma.pkmst.model.CodedError;
import com.prokarma.pkmst.model.Draft;
import com.prokarma.pkmst.model.JsonError;
import com.prokarma.pkmst.model.JsonSuccess;

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
public class DraftsApiController implements DraftsApi {
    private final ObjectMapper objectMapper;
@Autowired
    public DraftsApiController(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    public ResponseEntity<JsonSuccess> createDrafts(@ApiParam(value = "A JSON-encoded list of containing new draft objects. ")  @RequestParam(value = "drafts", required = false) List<Draft> drafts,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!
        return new ResponseEntity<JsonSuccess>(HttpStatus.OK);
    }

    public ResponseEntity<JsonSuccess> deleteDraft(@ApiParam(value = "The ID of the draft you want to delete. ",required=true ) @PathVariable("draft_id") Integer draftId,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!
        return new ResponseEntity<JsonSuccess>(HttpStatus.OK);
    }

    public ResponseEntity<JsonSuccess> editDraft(@ApiParam(value = "The ID of the draft to be edited. ",required=true ) @PathVariable("draft_id") Integer draftId,
        @ApiParam(value = "A JSON-encoded object containing a replacement draft object for this ID. ", required = true)  @RequestParam(value = "draft", required = true) Draft draft,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!
        return new ResponseEntity<JsonSuccess>(HttpStatus.OK);
    }

    public ResponseEntity<JsonSuccess> getDrafts(@RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!
        return new ResponseEntity<JsonSuccess>(HttpStatus.OK);
    }

}
