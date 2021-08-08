package controllers;

import java.io.InputStream;
import apimodels.JsonSuccess;
import apimodels.JsonSuccessBase;

import com.google.inject.Inject;
import com.typesafe.config.Config;
import play.mvc.Controller;
import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import play.mvc.Result;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.JsonNode;
import openapitools.OpenAPIUtils;
import static play.mvc.Results.ok;
import play.libs.Files.TemporaryFile;

import javax.validation.constraints.*;

@SuppressWarnings("RedundantThrows")
public abstract class ServerAndOrganizationsApiControllerImpInterface {
    @Inject private Config configuration;
    private ObjectMapper mapper = new ObjectMapper();

    public Result addCodePlaygroundHttp(Http.Request request, @NotNull String name, @NotNull String pygmentsLanguage, @NotNull String urlPrefix) throws Exception {
        JsonSuccessBase obj = addCodePlayground(request, name, pygmentsLanguage, urlPrefix);
    if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
    }
JsonNode result = mapper.valueToTree(obj);
return ok(result);

    }

    public abstract JsonSuccessBase addCodePlayground(Http.Request request, @NotNull String name, @NotNull String pygmentsLanguage, @NotNull String urlPrefix) throws Exception;

    public Result addLinkifierHttp(Http.Request request, @NotNull String pattern, @NotNull String urlFormatString) throws Exception {
        JsonSuccessBase obj = addLinkifier(request, pattern, urlFormatString);
    if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
    }
JsonNode result = mapper.valueToTree(obj);
return ok(result);

    }

    public abstract JsonSuccessBase addLinkifier(Http.Request request, @NotNull String pattern, @NotNull String urlFormatString) throws Exception;

    public Result createCustomProfileFieldHttp(Http.Request request, @NotNull Integer fieldType, String name, String hint, Object fieldData) throws Exception {
        JsonSuccessBase obj = createCustomProfileField(request, fieldType, name, hint, fieldData);
    if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
    }
JsonNode result = mapper.valueToTree(obj);
return ok(result);

    }

    public abstract JsonSuccessBase createCustomProfileField(Http.Request request, @NotNull Integer fieldType, String name, String hint, Object fieldData) throws Exception;

    public Result getCustomEmojiHttp(Http.Request request) throws Exception {
        JsonSuccessBase obj = getCustomEmoji(request);
    if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
    }
JsonNode result = mapper.valueToTree(obj);
return ok(result);

    }

    public abstract JsonSuccessBase getCustomEmoji(Http.Request request) throws Exception;

    public Result getCustomProfileFieldsHttp(Http.Request request) throws Exception {
        JsonSuccessBase obj = getCustomProfileFields(request);
    if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
    }
JsonNode result = mapper.valueToTree(obj);
return ok(result);

    }

    public abstract JsonSuccessBase getCustomProfileFields(Http.Request request) throws Exception;

    public Result getLinkifiersHttp(Http.Request request) throws Exception {
        JsonSuccessBase obj = getLinkifiers(request);
    if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
    }
JsonNode result = mapper.valueToTree(obj);
return ok(result);

    }

    public abstract JsonSuccessBase getLinkifiers(Http.Request request) throws Exception;

    public Result getServerSettingsHttp(Http.Request request) throws Exception {
        JsonSuccessBase obj = getServerSettings(request);
    if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
    }
JsonNode result = mapper.valueToTree(obj);
return ok(result);

    }

    public abstract JsonSuccessBase getServerSettings(Http.Request request) throws Exception;

    public Result removeCodePlaygroundHttp(Http.Request request, Integer playgroundId) throws Exception {
        JsonSuccess obj = removeCodePlayground(request, playgroundId);
    if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
    }
JsonNode result = mapper.valueToTree(obj);
return ok(result);

    }

    public abstract JsonSuccess removeCodePlayground(Http.Request request, Integer playgroundId) throws Exception;

    public Result removeLinkifierHttp(Http.Request request, Integer filterId) throws Exception {
        JsonSuccess obj = removeLinkifier(request, filterId);
    if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
    }
JsonNode result = mapper.valueToTree(obj);
return ok(result);

    }

    public abstract JsonSuccess removeLinkifier(Http.Request request, Integer filterId) throws Exception;

    public Result reorderCustomProfileFieldsHttp(Http.Request request, @NotNull List<Integer> order) throws Exception {
        JsonSuccess obj = reorderCustomProfileFields(request, order);
    if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
    }
JsonNode result = mapper.valueToTree(obj);
return ok(result);

    }

    public abstract JsonSuccess reorderCustomProfileFields(Http.Request request, @NotNull List<Integer> order) throws Exception;

    public Result updateLinkifierHttp(Http.Request request, Integer filterId, @NotNull String pattern, @NotNull String urlFormatString) throws Exception {
        JsonSuccess obj = updateLinkifier(request, filterId, pattern, urlFormatString);
    if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
    }
JsonNode result = mapper.valueToTree(obj);
return ok(result);

    }

    public abstract JsonSuccess updateLinkifier(Http.Request request, Integer filterId, @NotNull String pattern, @NotNull String urlFormatString) throws Exception;

    public Result uploadCustomEmojiHttp(Http.Request request, String emojiName, Http.MultipartFormData.FilePart<TemporaryFile> filename) throws Exception {
        JsonSuccess obj = uploadCustomEmoji(request, emojiName, filename);
    if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
    }
JsonNode result = mapper.valueToTree(obj);
return ok(result);

    }

    public abstract JsonSuccess uploadCustomEmoji(Http.Request request, String emojiName, Http.MultipartFormData.FilePart<TemporaryFile> filename) throws Exception;

}
