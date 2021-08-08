package org.openapitools.api.impl;

import org.openapitools.api.*;
import org.openapitools.model.*;


import org.openapitools.model.JsonSuccessBase;
import java.util.List;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.enterprise.context.RequestScoped;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@RequestScoped
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2021-08-08T21:12:17.400215Z[Etc/UTC]")
public class RegisterApiServiceImpl implements RegisterApiService {
      public Response registerQueue(Boolean applyMarkdown,Boolean clientGravatar,Boolean slimPresence,List<String> eventTypes,Boolean allPublicStreams,Boolean includeSubscribers,Object clientCapabilities,List<String> fetchEventTypes,List<List<String>> narrow,SecurityContext securityContext)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
}
