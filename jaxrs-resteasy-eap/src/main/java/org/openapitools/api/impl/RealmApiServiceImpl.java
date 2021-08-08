package org.openapitools.api.impl;

import org.openapitools.api.*;
import org.openapitools.model.*;
import org.jboss.resteasy.plugins.providers.multipart.MultipartFormDataInput;


import java.io.File;
import org.openapitools.model.JsonSuccess;
import org.openapitools.model.JsonSuccessBase;

import java.util.List;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2021-08-08T21:20:09.368890Z[Etc/UTC]")
public class RealmApiServiceImpl implements RealmApi {
      public Response addCodePlayground(String name,String pygmentsLanguage,String urlPrefix,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response addLinkifier(String pattern,String urlFormatString,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response createCustomProfileField(Integer fieldType,String name,String hint,Object fieldData,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response getCustomEmoji(SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response getCustomProfileFields(SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response getLinkifiers(SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response removeCodePlayground(Integer playgroundId,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response removeLinkifier(Integer filterId,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response reorderCustomProfileFields(List<Integer> order,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response updateLinkifier(Integer filterId,String pattern,String urlFormatString,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response uploadCustomEmoji(MultipartFormDataInput input,String emojiName,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
}
