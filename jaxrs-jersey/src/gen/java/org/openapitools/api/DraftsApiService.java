package org.openapitools.api;

import org.openapitools.api.*;
import org.openapitools.model.*;

import org.glassfish.jersey.media.multipart.FormDataBodyPart;

import org.openapitools.model.CodedError;
import org.openapitools.model.Draft;
import org.openapitools.model.JsonError;
import org.openapitools.model.JsonSuccess;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.validation.constraints.*;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2021-08-09T21:34:02.517112Z[Etc/UTC]")
public abstract class DraftsApiService {
    public abstract Response createDrafts(List<Draft> drafts,SecurityContext securityContext) throws NotFoundException;
    public abstract Response deleteDraft(Integer draftId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response editDraft(Integer draftId, @NotNull Draft draft,SecurityContext securityContext) throws NotFoundException;
    public abstract Response getDrafts(SecurityContext securityContext) throws NotFoundException;
}
