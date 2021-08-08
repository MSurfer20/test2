package org.openapitools.api.impl;

import org.openapitools.api.*;
import org.openapitools.model.*;


import org.openapitools.model.CodedError;
import org.openapitools.model.JsonError;
import org.openapitools.model.JsonSuccess;
import org.openapitools.model.JsonSuccessBase;
import org.openapitools.model.OneOfstringinteger;

import java.util.List;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2021-08-08T20:42:32.152989Z[Etc/UTC]")
public class StreamsApiServiceImpl implements StreamsApi {
      public Response archiveStream(Integer streamId,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response getStreams(Boolean includePublic,Boolean includeWebPublic,Boolean includeSubscribed,Boolean includeAllActive,Boolean includeDefault,Boolean includeOwnerSubscribed,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response updateStream(Integer streamId,String description,String newName,Boolean isPrivate,Boolean isAnnouncementOnly,Integer streamPostPolicy,Boolean historyPublicToSubscribers,OneOfstringinteger messageRetentionDays,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
}
