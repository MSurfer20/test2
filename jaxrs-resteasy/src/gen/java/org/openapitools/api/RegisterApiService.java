package org.openapitools.api;

import org.openapitools.api.*;
import org.openapitools.model.*;


import org.openapitools.model.JsonSuccessBase;
import java.util.List;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2021-08-08T20:42:27.763537Z[Etc/UTC]")
public interface RegisterApiService {
      Response registerQueue(Boolean applyMarkdown,Boolean clientGravatar,Boolean slimPresence,List<String> eventTypes,Boolean allPublicStreams,Boolean includeSubscribers,Object clientCapabilities,List<String> fetchEventTypes,List<List<String>> narrow,SecurityContext securityContext)
      throws NotFoundException;
}
