package org.openapitools.api.impl;

import org.openapitools.api.*;
import org.openapitools.model.*;

import org.apache.cxf.jaxrs.ext.multipart.Attachment;

import java.util.List;

import java.util.List;

import java.io.InputStream;

import javax.enterprise.context.RequestScoped;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@RequestScoped
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSCXFCDIServerCodegen", date = "2021-08-09T21:33:58.385931Z[Etc/UTC]")
public class RealTimeApiServiceImpl implements RealTimeApiService {
      @Override
      public Response realTimePost(List<String> eventTypes, List<List<String>> narrow, Boolean allPublicStreams, SecurityContext securityContext) {
      // do some magic!
      return Response.ok().entity("magic!").build();
  }
}
