package org.openapitools.api;

import org.openapitools.api.*;
import org.openapitools.model.*;
import org.jboss.resteasy.plugins.providers.multipart.MultipartFormDataInput;


import java.io.File;
import org.openapitools.model.JsonSuccessBase;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2021-08-08T21:20:05.336070Z[Etc/UTC]")
public interface UserUploadsApiService {
      Response getFileTemporaryUrl(Integer realmIdStr,String filename,SecurityContext securityContext)
      throws NotFoundException;
      Response uploadFile(MultipartFormDataInput input,SecurityContext securityContext)
      throws NotFoundException;
}
