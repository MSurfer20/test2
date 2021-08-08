package controllers;

import apimodels.BadEventQueueIdError;
import apimodels.JsonSuccess;
import apimodels.JsonSuccessBase;
import java.util.List;
import apimodels.OneOfInvalidApiKeyErrorMissingArgumentErrorUserNotAuthorizedError;
import apimodels.OneOfRateLimitedError;
import apimodels.OneOfUserDeactivatedErrorRealmDeactivatedError;

import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.io.FileInputStream;
import play.libs.Files.TemporaryFile;
import javax.validation.constraints.*;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2021-08-08T20:39:36.686816Z[Etc/UTC]")
public class RealTimeEventsApiControllerImp extends RealTimeEventsApiControllerImpInterface {
    @Override
    public JsonSuccess deleteQueue(Http.Request request, @NotNull String queueId) throws Exception {
        //Do your magic!!!
        return new JsonSuccess();
    }

    @Override
    public JsonSuccessBase getEvents(Http.Request request, @NotNull String queueId, Integer lastEventId, Boolean dontBlock) throws Exception {
        //Do your magic!!!
        return new JsonSuccessBase();
    }

    @Override
    public void realTimePost(Http.Request request, List<String> eventTypes, List<List<String>> narrow, Boolean allPublicStreams) throws Exception {
        //Do your magic!!!
    }

    @Override
    public JsonSuccessBase registerQueue(Http.Request request, Boolean applyMarkdown, Boolean clientGravatar, Boolean slimPresence, List<String> eventTypes, Boolean allPublicStreams, Boolean includeSubscribers, Object clientCapabilities, List<String> fetchEventTypes, List<List<String>> narrow) throws Exception {
        //Do your magic!!!
        return new JsonSuccessBase();
    }

    @Override
    public void restErrorHandling(Http.Request request) throws Exception {
        //Do your magic!!!
    }

}
