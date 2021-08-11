package org.openapitools.api.impl;

import org.openapitools.api.*;
import org.openapitools.model.*;

import org.openapitools.model.JsonSuccessBase;
import java.util.List;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import org.wso2.msf4j.formparam.FormDataParam;
import org.wso2.msf4j.formparam.FileInfo;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen")
public class RegisterApiServiceImpl extends RegisterApiService {
    @Override
    public Response registerQueue(Boolean applyMarkdown
, Boolean clientGravatar
, Boolean slimPresence
, List<String> eventTypes
, Boolean allPublicStreams
, Boolean includeSubscribers
, Object clientCapabilities
, List<String> fetchEventTypes
, List<List<String>> narrow
 ) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
}
