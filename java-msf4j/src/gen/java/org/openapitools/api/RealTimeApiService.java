package org.openapitools.api;

import org.openapitools.api.*;
import org.openapitools.model.*;

import org.wso2.msf4j.formparam.FormDataParam;
import org.wso2.msf4j.formparam.FileInfo;

import java.util.List;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2021-08-08T20:39:29.446170Z[Etc/UTC]")
public abstract class RealTimeApiService {
    public abstract Response realTimePost(List<String> eventTypes
 ,List<List<String>> narrow
 ,Boolean allPublicStreams
 ) throws NotFoundException;
}
