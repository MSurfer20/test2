package com.prokarma.pkmst.controller;

import com.prokarma.pkmst.model.ApiKeyResponse;

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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2021-08-08T20:39:33.025212Z[Etc/UTC]")
@Controller
public class AuthenticationApiController implements AuthenticationApi {
    private final ObjectMapper objectMapper;
@Autowired
    public AuthenticationApiController(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    public ResponseEntity<ApiKeyResponse> devFetchApiKey(@ApiParam(value = "The email address for the user that owns the API key. ", required = true)  @RequestParam(value = "username", required = true) String username,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!
        return new ResponseEntity<ApiKeyResponse>(HttpStatus.OK);
    }

    public ResponseEntity<ApiKeyResponse> fetchApiKey(@ApiParam(value = "The username to be used for authentication (typically, the email address, but depending on configuration, it could be an LDAP username).  See the `require_email_format_usernames` parameter documented in [GET /server_settings](/api/get-server-settings) for details. ", required = true)  @RequestParam(value = "username", required = true) String username,
        @ApiParam(value = "The user's Zulip password (or LDAP password, if LDAP authentication is in use). ", required = true)  @RequestParam(value = "password", required = true) String password,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!
        return new ResponseEntity<ApiKeyResponse>(HttpStatus.OK);
    }

}
