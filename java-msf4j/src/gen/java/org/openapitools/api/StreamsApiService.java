package org.openapitools.api;

import org.openapitools.api.*;
import org.openapitools.model.*;

import org.wso2.msf4j.formparam.FormDataParam;
import org.wso2.msf4j.formparam.FileInfo;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen")
public abstract class StreamsApiService {
    public abstract Response archiveStream(Integer streamId
 ) throws NotFoundException;
    public abstract Response deleteTopic(Integer streamId
 ,String topicName
 ) throws NotFoundException;
    public abstract Response getStreams(Boolean includePublic
 ,Boolean includeWebPublic
 ,Boolean includeSubscribed
 ,Boolean includeAllActive
 ,Boolean includeDefault
 ,Boolean includeOwnerSubscribed
 ) throws NotFoundException;
    public abstract Response getSubscribers(Integer streamId
 ) throws NotFoundException;
    public abstract Response updateStream(Integer streamId
 ,String description
 ,String newName
 ,Boolean isPrivate
 ,Boolean isAnnouncementOnly
 ,Integer streamPostPolicy
 ,Boolean historyPublicToSubscribers
 ,OneOfstringinteger messageRetentionDays
 ) throws NotFoundException;
}
