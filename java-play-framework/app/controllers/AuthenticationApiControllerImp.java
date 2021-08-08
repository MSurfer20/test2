package controllers;

import apimodels.ApiKeyResponse;

import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.io.FileInputStream;
import play.libs.Files.TemporaryFile;
import javax.validation.constraints.*;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2021-08-08T21:19:33.131185Z[Etc/UTC]")
public class AuthenticationApiControllerImp extends AuthenticationApiControllerImpInterface {
    @Override
    public ApiKeyResponse devFetchApiKey(Http.Request request, @NotNull String username) throws Exception {
        //Do your magic!!!
        return new ApiKeyResponse();
    }

    @Override
    public ApiKeyResponse fetchApiKey(Http.Request request, @NotNull String username, @NotNull String password) throws Exception {
        //Do your magic!!!
        return new ApiKeyResponse();
    }

}
