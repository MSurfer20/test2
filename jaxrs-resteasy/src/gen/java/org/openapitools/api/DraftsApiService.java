package org.openapitools.api;

import org.openapitools.api.*;
import org.openapitools.model.*;


import org.openapitools.model.CodedError;
import org.openapitools.model.Draft;
import org.openapitools.model.JsonError;
import org.openapitools.model.JsonSuccess;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2021-08-08T21:20:05.336070Z[Etc/UTC]")
public interface DraftsApiService {
      Response createDrafts(List<Draft> drafts,SecurityContext securityContext)
      throws NotFoundException;
      Response deleteDraft(Integer draftId,SecurityContext securityContext)
      throws NotFoundException;
      Response editDraft(Integer draftId,Draft draft,SecurityContext securityContext)
      throws NotFoundException;
      Response getDrafts(SecurityContext securityContext)
      throws NotFoundException;
}
