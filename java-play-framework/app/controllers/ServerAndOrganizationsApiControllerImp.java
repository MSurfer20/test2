package controllers;

import java.io.InputStream;
import apimodels.JsonSuccess;
import apimodels.JsonSuccessBase;

import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.io.FileInputStream;
import play.libs.Files.TemporaryFile;
import javax.validation.constraints.*;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2021-08-08T20:39:36.686816Z[Etc/UTC]")
public class ServerAndOrganizationsApiControllerImp extends ServerAndOrganizationsApiControllerImpInterface {
    @Override
    public JsonSuccessBase addCodePlayground(Http.Request request, @NotNull String name, @NotNull String pygmentsLanguage, @NotNull String urlPrefix) throws Exception {
        //Do your magic!!!
        return new JsonSuccessBase();
    }

    @Override
    public JsonSuccessBase addLinkifier(Http.Request request, @NotNull String pattern, @NotNull String urlFormatString) throws Exception {
        //Do your magic!!!
        return new JsonSuccessBase();
    }

    @Override
    public JsonSuccessBase createCustomProfileField(Http.Request request, @NotNull Integer fieldType, String name, String hint, Object fieldData) throws Exception {
        //Do your magic!!!
        return new JsonSuccessBase();
    }

    @Override
    public JsonSuccessBase getCustomEmoji(Http.Request request) throws Exception {
        //Do your magic!!!
        return new JsonSuccessBase();
    }

    @Override
    public JsonSuccessBase getCustomProfileFields(Http.Request request) throws Exception {
        //Do your magic!!!
        return new JsonSuccessBase();
    }

    @Override
    public JsonSuccessBase getLinkifiers(Http.Request request) throws Exception {
        //Do your magic!!!
        return new JsonSuccessBase();
    }

    @Override
    public JsonSuccessBase getServerSettings(Http.Request request) throws Exception {
        //Do your magic!!!
        return new JsonSuccessBase();
    }

    @Override
    public JsonSuccess removeCodePlayground(Http.Request request, Integer playgroundId) throws Exception {
        //Do your magic!!!
        return new JsonSuccess();
    }

    @Override
    public JsonSuccess removeLinkifier(Http.Request request, Integer filterId) throws Exception {
        //Do your magic!!!
        return new JsonSuccess();
    }

    @Override
    public JsonSuccess reorderCustomProfileFields(Http.Request request, @NotNull List<Integer> order) throws Exception {
        //Do your magic!!!
        return new JsonSuccess();
    }

    @Override
    public JsonSuccess updateLinkifier(Http.Request request, Integer filterId, @NotNull String pattern, @NotNull String urlFormatString) throws Exception {
        //Do your magic!!!
        return new JsonSuccess();
    }

    @Override
    public JsonSuccess uploadCustomEmoji(Http.Request request, String emojiName, Http.MultipartFormData.FilePart<TemporaryFile> filename) throws Exception {
        //Do your magic!!!
        return new JsonSuccess();
    }

}
