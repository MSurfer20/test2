package org.openapitools.api.impl;

import org.openapitools.api.*;
import org.openapitools.model.*;

import org.openapitools.model.CodedError;
import org.openapitools.model.Draft;
import org.openapitools.model.JsonError;
import org.openapitools.model.JsonSuccess;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import org.glassfish.jersey.media.multipart.FormDataBodyPart;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.validation.constraints.*;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2021-08-08T21:20:01.120158Z[Etc/UTC]")
public class DraftsApiServiceImpl extends DraftsApiService {
    @Override
    public Response createDrafts(List<Draft> drafts, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response deleteDraft(Integer draftId, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response editDraft(Integer draftId,  @NotNull Draft draft, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response getDrafts(SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
}
