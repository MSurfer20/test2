package org.openapitools.api;

import org.openapitools.api.*;
import org.openapitools.model.*;

import org.glassfish.jersey.media.multipart.FormDataBodyPart;

import org.openapitools.model.JsonSuccessBase;
import java.util.List;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.validation.constraints.*;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2021-08-08T21:12:13.281187Z[Etc/UTC]")
public abstract class RegisterApiService {
    public abstract Response registerQueue(Boolean applyMarkdown,Boolean clientGravatar,Boolean slimPresence,List<String> eventTypes,Boolean allPublicStreams,Boolean includeSubscribers,Object clientCapabilities,List<String> fetchEventTypes,List<List<String>> narrow,SecurityContext securityContext) throws NotFoundException;
}
