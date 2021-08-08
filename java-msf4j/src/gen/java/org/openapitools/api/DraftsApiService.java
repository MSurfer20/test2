package org.openapitools.api;

import org.openapitools.api.*;
import org.openapitools.model.*;

import org.wso2.msf4j.formparam.FormDataParam;
import org.wso2.msf4j.formparam.FileInfo;

import org.openapitools.model.CodedError;
import org.openapitools.model.Draft;
import org.openapitools.model.JsonError;
import org.openapitools.model.JsonSuccess;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2021-08-08T21:11:36.575393Z[Etc/UTC]")
public abstract class DraftsApiService {
    public abstract Response createDrafts(List<Draft> drafts
 ) throws NotFoundException;
    public abstract Response deleteDraft(Integer draftId
 ) throws NotFoundException;
    public abstract Response editDraft(Integer draftId
 ,Draft draft
 ) throws NotFoundException;
    public abstract Response getDrafts() throws NotFoundException;
}
