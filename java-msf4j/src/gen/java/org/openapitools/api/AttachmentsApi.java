package org.openapitools.api;

import org.openapitools.model.*;
import org.openapitools.api.AttachmentsApiService;
import org.openapitools.api.factories.AttachmentsApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import org.openapitools.model.JsonSuccessBase;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import org.wso2.msf4j.formparam.FormDataParam;
import org.wso2.msf4j.formparam.FileInfo;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;

@Path("/attachments")


@io.swagger.annotations.Api(description = "the attachments API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2021-08-10T11:44:15.430476Z[Etc/UTC]")
public class AttachmentsApi  {
   private final AttachmentsApiService delegate = AttachmentsApiServiceFactory.getAttachmentsApi();

    @GET
    
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get attachments", notes = "Fetch metadata on files uploaded by the requesting user.  `GET {{ api_url }}/v1/attachments` ", response = JsonSuccessBase.class, tags={ "users", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success.", response = JsonSuccessBase.class) })
    public Response getAttachments()
    throws NotFoundException {
        return delegate.getAttachments();
    }
}
