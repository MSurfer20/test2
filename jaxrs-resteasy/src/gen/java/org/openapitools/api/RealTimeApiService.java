package org.openapitools.api;

import org.openapitools.api.*;
import org.openapitools.model.*;


import java.util.List;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen")
public interface RealTimeApiService {
      Response realTimePost(List<String> eventTypes,List<List<String>> narrow,Boolean allPublicStreams,SecurityContext securityContext)
      throws NotFoundException;
}
