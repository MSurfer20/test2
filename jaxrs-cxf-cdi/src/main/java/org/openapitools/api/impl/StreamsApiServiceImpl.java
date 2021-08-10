package org.openapitools.api.impl;

import org.openapitools.api.*;
import org.openapitools.model.*;

import org.apache.cxf.jaxrs.ext.multipart.Attachment;

import org.openapitools.model.CodedError;
import org.openapitools.model.JsonError;
import org.openapitools.model.JsonSuccess;
import org.openapitools.model.JsonSuccessBase;
import org.openapitools.model.OneOfstringinteger;

import java.util.List;

import java.io.InputStream;

import javax.enterprise.context.RequestScoped;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@RequestScoped
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSCXFCDIServerCodegen", date = "2021-08-10T11:44:42.621439Z[Etc/UTC]")
public class StreamsApiServiceImpl implements StreamsApiService {
      @Override
      public Response archiveStream(Integer streamId, SecurityContext securityContext) {
      // do some magic!
      return Response.ok().entity("magic!").build();
  }
      @Override
      public Response deleteTopic(Integer streamId, String topicName, SecurityContext securityContext) {
      // do some magic!
      return Response.ok().entity("magic!").build();
  }
      @Override
      public Response getStreams(Boolean includePublic, Boolean includeWebPublic, Boolean includeSubscribed, Boolean includeAllActive, Boolean includeDefault, Boolean includeOwnerSubscribed, SecurityContext securityContext) {
      // do some magic!
      return Response.ok().entity("magic!").build();
  }
      @Override
      public Response getSubscribers(Integer streamId, SecurityContext securityContext) {
      // do some magic!
      return Response.ok().entity("magic!").build();
  }
      @Override
      public Response updateStream(Integer streamId, String description, String newName, Boolean isPrivate, Boolean isAnnouncementOnly, Integer streamPostPolicy, Boolean historyPublicToSubscribers, OneOfstringinteger messageRetentionDays, SecurityContext securityContext) {
      // do some magic!
      return Response.ok().entity("magic!").build();
  }
}
