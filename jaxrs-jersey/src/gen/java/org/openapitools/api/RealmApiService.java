package org.openapitools.api;

import org.openapitools.api.*;
import org.openapitools.model.*;

import org.glassfish.jersey.media.multipart.FormDataBodyPart;

import java.io.File;
import org.openapitools.model.JsonSuccess;
import org.openapitools.model.JsonSuccessBase;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.validation.constraints.*;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2021-08-08T20:42:23.370561Z[Etc/UTC]")
public abstract class RealmApiService {
    public abstract Response addCodePlayground( @NotNull String name, @NotNull String pygmentsLanguage, @NotNull String urlPrefix,SecurityContext securityContext) throws NotFoundException;
    public abstract Response addLinkifier( @NotNull String pattern, @NotNull String urlFormatString,SecurityContext securityContext) throws NotFoundException;
    public abstract Response createCustomProfileField( @NotNull Integer fieldType,String name,String hint,Object fieldData,SecurityContext securityContext) throws NotFoundException;
    public abstract Response getCustomEmoji(SecurityContext securityContext) throws NotFoundException;
    public abstract Response getCustomProfileFields(SecurityContext securityContext) throws NotFoundException;
    public abstract Response getLinkifiers(SecurityContext securityContext) throws NotFoundException;
    public abstract Response removeCodePlayground(Integer playgroundId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response removeLinkifier(Integer filterId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response reorderCustomProfileFields( @NotNull List<Integer> order,SecurityContext securityContext) throws NotFoundException;
    public abstract Response updateLinkifier(Integer filterId, @NotNull String pattern, @NotNull String urlFormatString,SecurityContext securityContext) throws NotFoundException;
    public abstract Response uploadCustomEmoji(String emojiName,FormDataBodyPart filenameBodypart,SecurityContext securityContext) throws NotFoundException;
}
