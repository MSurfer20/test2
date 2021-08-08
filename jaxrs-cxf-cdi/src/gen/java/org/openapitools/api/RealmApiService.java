package org.openapitools.api;

import org.openapitools.api.*;
import org.openapitools.model.*;

import org.apache.cxf.jaxrs.ext.multipart.Attachment;
import org.apache.cxf.jaxrs.ext.multipart.Multipart;

import java.io.File;
import org.openapitools.model.JsonSuccess;
import org.openapitools.model.JsonSuccessBase;

import java.util.List;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSCXFCDIServerCodegen", date = "2021-08-08T21:12:04.371582Z[Etc/UTC]")
public interface RealmApiService {
      public Response addCodePlayground(String name, String pygmentsLanguage, String urlPrefix, SecurityContext securityContext);
      public Response addLinkifier(String pattern, String urlFormatString, SecurityContext securityContext);
      public Response createCustomProfileField(Integer fieldType, String name, String hint, Object fieldData, SecurityContext securityContext);
      public Response getCustomEmoji(SecurityContext securityContext);
      public Response getCustomProfileFields(SecurityContext securityContext);
      public Response getLinkifiers(SecurityContext securityContext);
      public Response removeCodePlayground(Integer playgroundId, SecurityContext securityContext);
      public Response removeLinkifier(Integer filterId, SecurityContext securityContext);
      public Response reorderCustomProfileFields(List<Integer> order, SecurityContext securityContext);
      public Response updateLinkifier(Integer filterId, String pattern, String urlFormatString, SecurityContext securityContext);
      public Response uploadCustomEmoji(String emojiName, InputStream filenameInputStream, Attachment filenameDetail, SecurityContext securityContext);
}
