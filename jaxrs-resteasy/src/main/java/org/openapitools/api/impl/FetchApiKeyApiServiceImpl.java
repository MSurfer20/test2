package org.openapitools.api.impl;

import org.openapitools.api.*;
import org.openapitools.model.*;


import org.openapitools.model.ApiKeyResponse;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.enterprise.context.RequestScoped;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@RequestScoped
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen")
public class FetchApiKeyApiServiceImpl implements FetchApiKeyApiService {
      public Response fetchApiKey(String username,String password,SecurityContext securityContext)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
}
