package org.openapitools.api;

import org.openapitools.api.*;
import org.openapitools.model.*;

import org.apache.cxf.jaxrs.ext.multipart.Attachment;
import org.apache.cxf.jaxrs.ext.multipart.Multipart;

import org.openapitools.model.BadEventQueueIdError;
import org.openapitools.model.JsonSuccess;
import org.openapitools.model.JsonSuccessBase;

import java.util.List;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSCXFCDIServerCodegen", date = "2021-08-10T11:44:42.621439Z[Etc/UTC]")
public interface EventsApiService {
      public Response deleteQueue(String queueId, SecurityContext securityContext);
      public Response getEvents(String queueId, Integer lastEventId, Boolean dontBlock, SecurityContext securityContext);
}
