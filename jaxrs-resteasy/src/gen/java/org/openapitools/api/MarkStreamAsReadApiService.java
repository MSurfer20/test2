package org.openapitools.api;

import org.openapitools.api.*;
import org.openapitools.model.*;


import org.openapitools.model.JsonSuccess;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2021-08-08T21:12:17.400215Z[Etc/UTC]")
public interface MarkStreamAsReadApiService {
      Response markStreamAsRead(Integer streamId,SecurityContext securityContext)
      throws NotFoundException;
}
