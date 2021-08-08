package org.openapitools.api;

import org.openapitools.api.*;
import org.openapitools.model.*;

import org.wso2.msf4j.formparam.FormDataParam;
import org.wso2.msf4j.formparam.FileInfo;

import org.openapitools.model.JsonSuccessBase;
import java.util.List;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2021-08-08T21:19:24.930319Z[Etc/UTC]")
public abstract class RegisterApiService {
    public abstract Response registerQueue(Boolean applyMarkdown
 ,Boolean clientGravatar
 ,Boolean slimPresence
 ,List<String> eventTypes
 ,Boolean allPublicStreams
 ,Boolean includeSubscribers
 ,Object clientCapabilities
 ,List<String> fetchEventTypes
 ,List<List<String>> narrow
 ) throws NotFoundException;
}
