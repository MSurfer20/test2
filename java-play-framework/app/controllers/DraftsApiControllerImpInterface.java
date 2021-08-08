package controllers;

import apimodels.CodedError;
import apimodels.Draft;
import apimodels.JsonError;
import apimodels.JsonSuccess;

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
public abstract class DraftsApiControllerImpInterface {
    @Inject private Config configuration;
    private ObjectMapper mapper = new ObjectMapper();

    public Result createDraftsHttp(Http.Request request, List<Draft> drafts) throws Exception {
        JsonSuccess obj = createDrafts(request, drafts);
    if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
    }
JsonNode result = mapper.valueToTree(obj);
return ok(result);

    }

    public abstract JsonSuccess createDrafts(Http.Request request, List<Draft> drafts) throws Exception;

    public Result deleteDraftHttp(Http.Request request, Integer draftId) throws Exception {
        JsonSuccess obj = deleteDraft(request, draftId);
    if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
    }
JsonNode result = mapper.valueToTree(obj);
return ok(result);

    }

    public abstract JsonSuccess deleteDraft(Http.Request request, Integer draftId) throws Exception;

    public Result editDraftHttp(Http.Request request, Integer draftId, @NotNull Draft draft) throws Exception {
        JsonSuccess obj = editDraft(request, draftId, draft);
    if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
    }
JsonNode result = mapper.valueToTree(obj);
return ok(result);

    }

    public abstract JsonSuccess editDraft(Http.Request request, Integer draftId, @NotNull Draft draft) throws Exception;

    public Result getDraftsHttp(Http.Request request) throws Exception {
        JsonSuccess obj = getDrafts(request);
    if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
    }
JsonNode result = mapper.valueToTree(obj);
return ok(result);

    }

    public abstract JsonSuccess getDrafts(Http.Request request) throws Exception;

}
