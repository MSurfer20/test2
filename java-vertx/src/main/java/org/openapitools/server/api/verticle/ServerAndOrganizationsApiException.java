package org.openapitools.server.api.verticle;

import java.io.File;
import org.openapitools.server.api.model.JsonSuccess;
import org.openapitools.server.api.model.JsonSuccessBase;
import org.openapitools.server.api.MainApiException;

public final class ServerAndOrganizationsApiException extends MainApiException {
    public ServerAndOrganizationsApiException(int statusCode, String statusMessage) {
        super(statusCode, statusMessage);
    }
    
    public static final ServerAndOrganizationsApiException ServerAndOrganizations_addCodePlayground_200_Exception = new ServerAndOrganizationsApiException(200, "Success.");
    public static final ServerAndOrganizationsApiException ServerAndOrganizations_addLinkifier_200_Exception = new ServerAndOrganizationsApiException(200, "Success.");
    public static final ServerAndOrganizationsApiException ServerAndOrganizations_createCustomProfileField_200_Exception = new ServerAndOrganizationsApiException(200, "Success.");
    public static final ServerAndOrganizationsApiException ServerAndOrganizations_getCustomEmoji_200_Exception = new ServerAndOrganizationsApiException(200, "Success.");
    public static final ServerAndOrganizationsApiException ServerAndOrganizations_getCustomProfileFields_200_Exception = new ServerAndOrganizationsApiException(200, "Success.");
    public static final ServerAndOrganizationsApiException ServerAndOrganizations_getLinkifiers_200_Exception = new ServerAndOrganizationsApiException(200, "Success.");
    public static final ServerAndOrganizationsApiException ServerAndOrganizations_getServerSettings_200_Exception = new ServerAndOrganizationsApiException(200, "Success.");
    public static final ServerAndOrganizationsApiException ServerAndOrganizations_removeCodePlayground_200_Exception = new ServerAndOrganizationsApiException(200, "Success.");
    public static final ServerAndOrganizationsApiException ServerAndOrganizations_removeLinkifier_200_Exception = new ServerAndOrganizationsApiException(200, "Success.");
    public static final ServerAndOrganizationsApiException ServerAndOrganizations_reorderCustomProfileFields_200_Exception = new ServerAndOrganizationsApiException(200, "Success.");
    public static final ServerAndOrganizationsApiException ServerAndOrganizations_updateLinkifier_200_Exception = new ServerAndOrganizationsApiException(200, "Success.");
    public static final ServerAndOrganizationsApiException ServerAndOrganizations_uploadCustomEmoji_200_Exception = new ServerAndOrganizationsApiException(200, "Success.");
    

}