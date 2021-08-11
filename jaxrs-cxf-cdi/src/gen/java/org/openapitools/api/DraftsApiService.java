package org.openapitools.api;

import org.openapitools.api.*;
import org.openapitools.model.*;

import org.apache.cxf.jaxrs.ext.multipart.Attachment;
import org.apache.cxf.jaxrs.ext.multipart.Multipart;

import org.openapitools.model.CodedError;
import org.openapitools.model.Draft;
import org.openapitools.model.JsonError;
import org.openapitools.model.JsonSuccess;

import java.util.List;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSCXFCDIServerCodegen")
public interface DraftsApiService {
      public Response createDrafts(List<Draft> drafts, SecurityContext securityContext);
      public Response deleteDraft(Integer draftId, SecurityContext securityContext);
      public Response editDraft(Integer draftId, Draft draft, SecurityContext securityContext);
      public Response getDrafts(SecurityContext securityContext);
}
