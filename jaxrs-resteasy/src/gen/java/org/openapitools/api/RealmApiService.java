package org.openapitools.api;

import org.openapitools.api.*;
import org.openapitools.model.*;
import org.jboss.resteasy.plugins.providers.multipart.MultipartFormDataInput;


import java.io.File;
import org.openapitools.model.JsonSuccess;
import org.openapitools.model.JsonSuccessBase;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen")
public interface RealmApiService {
      Response addCodePlayground(String name,String pygmentsLanguage,String urlPrefix,SecurityContext securityContext)
      throws NotFoundException;
      Response addLinkifier(String pattern,String urlFormatString,SecurityContext securityContext)
      throws NotFoundException;
      Response createCustomProfileField(Integer fieldType,String name,String hint,Object fieldData,SecurityContext securityContext)
      throws NotFoundException;
      Response getCustomEmoji(SecurityContext securityContext)
      throws NotFoundException;
      Response getCustomProfileFields(SecurityContext securityContext)
      throws NotFoundException;
      Response getLinkifiers(SecurityContext securityContext)
      throws NotFoundException;
      Response removeCodePlayground(Integer playgroundId,SecurityContext securityContext)
      throws NotFoundException;
      Response removeLinkifier(Integer filterId,SecurityContext securityContext)
      throws NotFoundException;
      Response reorderCustomProfileFields(List<Integer> order,SecurityContext securityContext)
      throws NotFoundException;
      Response updateLinkifier(Integer filterId,String pattern,String urlFormatString,SecurityContext securityContext)
      throws NotFoundException;
      Response uploadCustomEmoji(MultipartFormDataInput input,String emojiName,SecurityContext securityContext)
      throws NotFoundException;
}
