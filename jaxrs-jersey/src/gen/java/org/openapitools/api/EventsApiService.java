package org.openapitools.api;

import org.openapitools.api.*;
import org.openapitools.model.*;

import org.glassfish.jersey.media.multipart.FormDataBodyPart;

import org.openapitools.model.BadEventQueueIdError;
import org.openapitools.model.JsonSuccess;
import org.openapitools.model.JsonSuccessBase;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.validation.constraints.*;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2021-08-08T21:12:13.281187Z[Etc/UTC]")
public abstract class EventsApiService {
    public abstract Response deleteQueue( @NotNull String queueId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response getEvents( @NotNull String queueId,Integer lastEventId,Boolean dontBlock,SecurityContext securityContext) throws NotFoundException;
}
