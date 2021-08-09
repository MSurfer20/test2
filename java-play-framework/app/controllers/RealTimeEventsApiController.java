package controllers;

import apimodels.BadEventQueueIdError;
import apimodels.JsonSuccess;
import apimodels.JsonSuccessBase;
import java.util.List;
import apimodels.OneOfInvalidApiKeyErrorMissingArgumentErrorUserNotAuthorizedError;
import apimodels.OneOfRateLimitedError;
import apimodels.OneOfUserDeactivatedErrorRealmDeactivatedError;

import com.typesafe.config.Config;
import play.mvc.Controller;
import play.mvc.Result;
import play.mvc.Http;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.JsonNode;
import com.google.inject.Inject;
import java.io.File;
import play.libs.Files.TemporaryFile;
import openapitools.OpenAPIUtils;
import com.fasterxml.jackson.core.type.TypeReference;

import javax.validation.constraints.*;
import com.typesafe.config.Config;

import openapitools.OpenAPIUtils.ApiAction;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2021-08-09T21:33:34.002001Z[Etc/UTC]")
public class RealTimeEventsApiController extends Controller {
    private final RealTimeEventsApiControllerImpInterface imp;
    private final ObjectMapper mapper;
    private final Config configuration;

    @Inject
    private RealTimeEventsApiController(Config configuration, RealTimeEventsApiControllerImpInterface imp) {
        this.imp = imp;
        mapper = new ObjectMapper();
        this.configuration = configuration;
    }

    @ApiAction
    public Result deleteQueue(Http.Request request) throws Exception {
        String valuequeueId = request.getQueryString("queue_id");
        String queueId;
        if (valuequeueId != null) {
            queueId = valuequeueId;
        } else {
            throw new IllegalArgumentException("'queue_id' parameter is required");
        }
        return imp.deleteQueueHttp(request, queueId);
    }

    @ApiAction
    public Result getEvents(Http.Request request) throws Exception {
        String valuequeueId = request.getQueryString("queue_id");
        String queueId;
        if (valuequeueId != null) {
            queueId = valuequeueId;
        } else {
            throw new IllegalArgumentException("'queue_id' parameter is required");
        }
        String valuelastEventId = request.getQueryString("last_event_id");
        Integer lastEventId;
        if (valuelastEventId != null) {
            lastEventId = Integer.parseInt(valuelastEventId);
        } else {
            lastEventId = null;
        }
        String valuedontBlock = request.getQueryString("dont_block");
        Boolean dontBlock;
        if (valuedontBlock != null) {
            dontBlock = Boolean.valueOf(valuedontBlock);
        } else {
            dontBlock = false;
        }
        return imp.getEventsHttp(request, queueId, lastEventId, dontBlock);
    }

    @ApiAction
    public Result realTimePost(Http.Request request) throws Exception {
        String[] eventTypesArray = request.queryString().get("event_types");
        List<String> eventTypesList = OpenAPIUtils.parametersToList("multi", eventTypesArray);
        List<String> eventTypes = new ArrayList<>();
        for (String curParam : eventTypesList) {
            if (!curParam.isEmpty()) {
                //noinspection UseBulkOperation
                eventTypes.add(curParam);
            }
        }
        String[] narrowArray = request.queryString().get("narrow");
        List<String> narrowList = OpenAPIUtils.parametersToList("multi", narrowArray);
        List<List<String>> narrow = new ArrayList<>();
        for (String curParam : narrowList) {
            if (!curParam.isEmpty()) {
                //noinspection UseBulkOperation
                narrow.add(curParam);
            }
        }
        String valueallPublicStreams = request.getQueryString("all_public_streams");
        Boolean allPublicStreams;
        if (valueallPublicStreams != null) {
            allPublicStreams = Boolean.valueOf(valueallPublicStreams);
        } else {
            allPublicStreams = false;
        }
        return imp.realTimePostHttp(request, eventTypes, narrow, allPublicStreams);
    }

    @ApiAction
    public Result registerQueue(Http.Request request) throws Exception {
        String valueapplyMarkdown = request.getQueryString("apply_markdown");
        Boolean applyMarkdown;
        if (valueapplyMarkdown != null) {
            applyMarkdown = Boolean.valueOf(valueapplyMarkdown);
        } else {
            applyMarkdown = false;
        }
        String valueclientGravatar = request.getQueryString("client_gravatar");
        Boolean clientGravatar;
        if (valueclientGravatar != null) {
            clientGravatar = Boolean.valueOf(valueclientGravatar);
        } else {
            clientGravatar = false;
        }
        String valueslimPresence = request.getQueryString("slim_presence");
        Boolean slimPresence;
        if (valueslimPresence != null) {
            slimPresence = Boolean.valueOf(valueslimPresence);
        } else {
            slimPresence = false;
        }
        String[] eventTypesArray = request.queryString().get("event_types");
        List<String> eventTypesList = OpenAPIUtils.parametersToList("multi", eventTypesArray);
        List<String> eventTypes = new ArrayList<>();
        for (String curParam : eventTypesList) {
            if (!curParam.isEmpty()) {
                //noinspection UseBulkOperation
                eventTypes.add(curParam);
            }
        }
        String valueallPublicStreams = request.getQueryString("all_public_streams");
        Boolean allPublicStreams;
        if (valueallPublicStreams != null) {
            allPublicStreams = Boolean.valueOf(valueallPublicStreams);
        } else {
            allPublicStreams = false;
        }
        String valueincludeSubscribers = request.getQueryString("include_subscribers");
        Boolean includeSubscribers;
        if (valueincludeSubscribers != null) {
            includeSubscribers = Boolean.valueOf(valueincludeSubscribers);
        } else {
            includeSubscribers = false;
        }
        String valueclientCapabilities = request.getQueryString("client_capabilities");
        Object clientCapabilities;
        if (valueclientCapabilities != null) {
            clientCapabilities = valueclientCapabilities;
        } else {
            clientCapabilities = null;
        }
        String[] fetchEventTypesArray = request.queryString().get("fetch_event_types");
        List<String> fetchEventTypesList = OpenAPIUtils.parametersToList("multi", fetchEventTypesArray);
        List<String> fetchEventTypes = new ArrayList<>();
        for (String curParam : fetchEventTypesList) {
            if (!curParam.isEmpty()) {
                //noinspection UseBulkOperation
                fetchEventTypes.add(curParam);
            }
        }
        String[] narrowArray = request.queryString().get("narrow");
        List<String> narrowList = OpenAPIUtils.parametersToList("multi", narrowArray);
        List<List<String>> narrow = new ArrayList<>();
        for (String curParam : narrowList) {
            if (!curParam.isEmpty()) {
                //noinspection UseBulkOperation
                narrow.add(curParam);
            }
        }
        return imp.registerQueueHttp(request, applyMarkdown, clientGravatar, slimPresence, eventTypes, allPublicStreams, includeSubscribers, clientCapabilities, fetchEventTypes, narrow);
    }

    @ApiAction
    public Result restErrorHandling(Http.Request request) throws Exception {
        return imp.restErrorHandlingHttp(request);
    }

}
