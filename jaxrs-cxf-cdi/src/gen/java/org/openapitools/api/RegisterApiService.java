package org.openapitools.api;

import org.openapitools.api.*;
import org.openapitools.model.*;

import org.apache.cxf.jaxrs.ext.multipart.Attachment;
import org.apache.cxf.jaxrs.ext.multipart.Multipart;

import org.openapitools.model.JsonSuccessBase;
import java.util.List;

import java.util.List;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSCXFCDIServerCodegen", date = "2021-08-08T21:19:56.888133Z[Etc/UTC]")
public interface RegisterApiService {
      public Response registerQueue(Boolean applyMarkdown, Boolean clientGravatar, Boolean slimPresence, List<String> eventTypes, Boolean allPublicStreams, Boolean includeSubscribers, Object clientCapabilities, List<String> fetchEventTypes, List<List<String>> narrow, SecurityContext securityContext);
}
