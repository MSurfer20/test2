package org.openapitools.api;

import org.openapitools.api.*;
import org.openapitools.model.*;

import org.wso2.msf4j.formparam.FormDataParam;
import org.wso2.msf4j.formparam.FileInfo;

import java.io.File;
import org.openapitools.model.JsonSuccess;
import org.openapitools.model.JsonSuccessBase;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen")
public abstract class RealmApiService {
    public abstract Response addCodePlayground(String name
 ,String pygmentsLanguage
 ,String urlPrefix
 ) throws NotFoundException;
    public abstract Response addLinkifier(String pattern
 ,String urlFormatString
 ) throws NotFoundException;
    public abstract Response createCustomProfileField(Integer fieldType
 ,String name
 ,String hint
 ,Object fieldData
 ) throws NotFoundException;
    public abstract Response getCustomEmoji() throws NotFoundException;
    public abstract Response getCustomProfileFields() throws NotFoundException;
    public abstract Response getLinkifiers() throws NotFoundException;
    public abstract Response removeCodePlayground(Integer playgroundId
 ) throws NotFoundException;
    public abstract Response removeLinkifier(Integer filterId
 ) throws NotFoundException;
    public abstract Response reorderCustomProfileFields(List<Integer> order
 ) throws NotFoundException;
    public abstract Response updateLinkifier(Integer filterId
 ,String pattern
 ,String urlFormatString
 ) throws NotFoundException;
    public abstract Response uploadCustomEmoji(String emojiName
 ,InputStream filenameInputStream, FileInfo filenameDetail
 ) throws NotFoundException;
}
