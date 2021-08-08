package controllers;

import apimodels.ApiKeyResponse;

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
public abstract class AuthenticationApiControllerImpInterface {
    @Inject private Config configuration;
    private ObjectMapper mapper = new ObjectMapper();

    public Result devFetchApiKeyHttp(Http.Request request, @NotNull String username) throws Exception {
        ApiKeyResponse obj = devFetchApiKey(request, username);
    if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
    }
JsonNode result = mapper.valueToTree(obj);
return ok(result);

    }

    public abstract ApiKeyResponse devFetchApiKey(Http.Request request, @NotNull String username) throws Exception;

    public Result fetchApiKeyHttp(Http.Request request, @NotNull String username, @NotNull String password) throws Exception {
        ApiKeyResponse obj = fetchApiKey(request, username, password);
    if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
    }
JsonNode result = mapper.valueToTree(obj);
return ok(result);

    }

    public abstract ApiKeyResponse fetchApiKey(Http.Request request, @NotNull String username, @NotNull String password) throws Exception;

}
