package controllers;

import apimodels.BadEventQueueIdError;
import apimodels.JsonSuccess;
import apimodels.JsonSuccessBase;
import java.util.List;
import apimodels.OneOfInvalidApiKeyErrorMissingArgumentErrorUserNotAuthorizedError;
import apimodels.OneOfRateLimitedError;
import apimodels.OneOfUserDeactivatedErrorRealmDeactivatedError;

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
public abstract class RealTimeEventsApiControllerImpInterface {
    @Inject private Config configuration;
    private ObjectMapper mapper = new ObjectMapper();

    public Result deleteQueueHttp(Http.Request request, @NotNull String queueId) throws Exception {
        JsonSuccess obj = deleteQueue(request, queueId);
    if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
    }
JsonNode result = mapper.valueToTree(obj);
return ok(result);

    }

    public abstract JsonSuccess deleteQueue(Http.Request request, @NotNull String queueId) throws Exception;

    public Result getEventsHttp(Http.Request request, @NotNull String queueId, Integer lastEventId, Boolean dontBlock) throws Exception {
        JsonSuccessBase obj = getEvents(request, queueId, lastEventId, dontBlock);
    if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
    }
JsonNode result = mapper.valueToTree(obj);
return ok(result);

    }

    public abstract JsonSuccessBase getEvents(Http.Request request, @NotNull String queueId, Integer lastEventId, Boolean dontBlock) throws Exception;

    public Result realTimePostHttp(Http.Request request, List<String> eventTypes, List<List<String>> narrow, Boolean allPublicStreams) throws Exception {
        realTimePost(request, eventTypes, narrow, allPublicStreams);
return ok();

    }

    public abstract void realTimePost(Http.Request request, List<String> eventTypes, List<List<String>> narrow, Boolean allPublicStreams) throws Exception;

    public Result registerQueueHttp(Http.Request request, Boolean applyMarkdown, Boolean clientGravatar, Boolean slimPresence, List<String> eventTypes, Boolean allPublicStreams, Boolean includeSubscribers, Object clientCapabilities, List<String> fetchEventTypes, List<List<String>> narrow) throws Exception {
        JsonSuccessBase obj = registerQueue(request, applyMarkdown, clientGravatar, slimPresence, eventTypes, allPublicStreams, includeSubscribers, clientCapabilities, fetchEventTypes, narrow);
    if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
    }
JsonNode result = mapper.valueToTree(obj);
return ok(result);

    }

    public abstract JsonSuccessBase registerQueue(Http.Request request, Boolean applyMarkdown, Boolean clientGravatar, Boolean slimPresence, List<String> eventTypes, Boolean allPublicStreams, Boolean includeSubscribers, Object clientCapabilities, List<String> fetchEventTypes, List<List<String>> narrow) throws Exception;

    public Result restErrorHandlingHttp(Http.Request request) throws Exception {
        restErrorHandling(request);
return ok();

    }

    public abstract void restErrorHandling(Http.Request request) throws Exception;

}
