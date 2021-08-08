package org.openapitools.api;

import org.openapitools.api.*;
import org.openapitools.model.*;

import org.glassfish.jersey.media.multipart.FormDataBodyPart;

import org.openapitools.model.CodedError;
import org.openapitools.model.JsonError;
import org.openapitools.model.JsonSuccess;
import org.openapitools.model.JsonSuccessBase;
import org.openapitools.model.OneOfstringinteger;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.validation.constraints.*;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2021-08-08T21:12:13.281187Z[Etc/UTC]")
public abstract class StreamsApiService {
    public abstract Response archiveStream(Integer streamId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response deleteTopic(Integer streamId, @NotNull String topicName,SecurityContext securityContext) throws NotFoundException;
    public abstract Response getStreams(Boolean includePublic,Boolean includeWebPublic,Boolean includeSubscribed,Boolean includeAllActive,Boolean includeDefault,Boolean includeOwnerSubscribed,SecurityContext securityContext) throws NotFoundException;
    public abstract Response getSubscribers(Integer streamId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response updateStream(Integer streamId,String description,String newName,Boolean isPrivate,Boolean isAnnouncementOnly,Integer streamPostPolicy,Boolean historyPublicToSubscribers,OneOfstringinteger messageRetentionDays,SecurityContext securityContext) throws NotFoundException;
}
