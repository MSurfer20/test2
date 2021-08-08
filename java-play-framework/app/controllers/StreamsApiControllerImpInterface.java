package controllers;

import apimodels.CodedError;
import apimodels.JsonError;
import apimodels.JsonSuccess;
import apimodels.JsonSuccessBase;
import apimodels.NonExistingStreamError;
import apimodels.OneOfobjectobject;
import apimodels.OneOfstringinteger;

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
public abstract class StreamsApiControllerImpInterface {
    @Inject private Config configuration;
    private ObjectMapper mapper = new ObjectMapper();

    public Result archiveStreamHttp(Http.Request request, Integer streamId) throws Exception {
        JsonSuccess obj = archiveStream(request, streamId);
    if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
    }
JsonNode result = mapper.valueToTree(obj);
return ok(result);

    }

    public abstract JsonSuccess archiveStream(Http.Request request, Integer streamId) throws Exception;

    public Result createBigBlueButtonVideoCallHttp(Http.Request request) throws Exception {
        JsonSuccessBase obj = createBigBlueButtonVideoCall(request);
    if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
    }
JsonNode result = mapper.valueToTree(obj);
return ok(result);

    }

    public abstract JsonSuccessBase createBigBlueButtonVideoCall(Http.Request request) throws Exception;

    public Result getStreamIdHttp(Http.Request request, @NotNull String stream) throws Exception {
        JsonSuccessBase obj = getStreamId(request, stream);
    if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
    }
JsonNode result = mapper.valueToTree(obj);
return ok(result);

    }

    public abstract JsonSuccessBase getStreamId(Http.Request request, @NotNull String stream) throws Exception;

    public Result getStreamTopicsHttp(Http.Request request, Integer streamId) throws Exception {
        JsonSuccessBase obj = getStreamTopics(request, streamId);
    if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
    }
JsonNode result = mapper.valueToTree(obj);
return ok(result);

    }

    public abstract JsonSuccessBase getStreamTopics(Http.Request request, Integer streamId) throws Exception;

    public Result getStreamsHttp(Http.Request request, Boolean includePublic, Boolean includeWebPublic, Boolean includeSubscribed, Boolean includeAllActive, Boolean includeDefault, Boolean includeOwnerSubscribed) throws Exception {
        JsonSuccessBase obj = getStreams(request, includePublic, includeWebPublic, includeSubscribed, includeAllActive, includeDefault, includeOwnerSubscribed);
    if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
    }
JsonNode result = mapper.valueToTree(obj);
return ok(result);

    }

    public abstract JsonSuccessBase getStreams(Http.Request request, Boolean includePublic, Boolean includeWebPublic, Boolean includeSubscribed, Boolean includeAllActive, Boolean includeDefault, Boolean includeOwnerSubscribed) throws Exception;

    public Result getSubscriptionStatusHttp(Http.Request request, Integer userId, Integer streamId) throws Exception {
        JsonSuccessBase obj = getSubscriptionStatus(request, userId, streamId);
    if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
    }
JsonNode result = mapper.valueToTree(obj);
return ok(result);

    }

    public abstract JsonSuccessBase getSubscriptionStatus(Http.Request request, Integer userId, Integer streamId) throws Exception;

    public Result getSubscriptionsHttp(Http.Request request, Boolean includeSubscribers) throws Exception {
        JsonSuccessBase obj = getSubscriptions(request, includeSubscribers);
    if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
    }
JsonNode result = mapper.valueToTree(obj);
return ok(result);

    }

    public abstract JsonSuccessBase getSubscriptions(Http.Request request, Boolean includeSubscribers) throws Exception;

    public Result muteTopicHttp(Http.Request request, @NotNull String topic, @NotNull String op, String stream, Integer streamId) throws Exception {
        JsonSuccess obj = muteTopic(request, topic, op, stream, streamId);
    if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
    }
JsonNode result = mapper.valueToTree(obj);
return ok(result);

    }

    public abstract JsonSuccess muteTopic(Http.Request request, @NotNull String topic, @NotNull String op, String stream, Integer streamId) throws Exception;

    public Result subscribeHttp(Http.Request request, @NotNull List<Object> subscriptions, List<OneOfstringinteger> principals, Boolean authorizationErrorsFatal, Boolean announce, Boolean inviteOnly, Boolean historyPublicToSubscribers, Integer streamPostPolicy, OneOfstringinteger messageRetentionDays) throws Exception {
        OneOfobjectobject obj = subscribe(request, subscriptions, principals, authorizationErrorsFatal, announce, inviteOnly, historyPublicToSubscribers, streamPostPolicy, messageRetentionDays);
    if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
    }
JsonNode result = mapper.valueToTree(obj);
return ok(result);

    }

    public abstract OneOfobjectobject subscribe(Http.Request request, @NotNull List<Object> subscriptions, List<OneOfstringinteger> principals, Boolean authorizationErrorsFatal, Boolean announce, Boolean inviteOnly, Boolean historyPublicToSubscribers, Integer streamPostPolicy, OneOfstringinteger messageRetentionDays) throws Exception;

    public Result unsubscribeHttp(Http.Request request, @NotNull List<String> subscriptions, List<OneOfstringinteger> principals) throws Exception {
        JsonSuccessBase obj = unsubscribe(request, subscriptions, principals);
    if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
    }
JsonNode result = mapper.valueToTree(obj);
return ok(result);

    }

    public abstract JsonSuccessBase unsubscribe(Http.Request request, @NotNull List<String> subscriptions, List<OneOfstringinteger> principals) throws Exception;

    public Result updateStreamHttp(Http.Request request, Integer streamId, String description, String newName, Boolean isPrivate, Boolean isAnnouncementOnly, Integer streamPostPolicy, Boolean historyPublicToSubscribers, OneOfstringinteger messageRetentionDays) throws Exception {
        JsonSuccess obj = updateStream(request, streamId, description, newName, isPrivate, isAnnouncementOnly, streamPostPolicy, historyPublicToSubscribers, messageRetentionDays);
    if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
    }
JsonNode result = mapper.valueToTree(obj);
return ok(result);

    }

    public abstract JsonSuccess updateStream(Http.Request request, Integer streamId, String description, String newName, Boolean isPrivate, Boolean isAnnouncementOnly, Integer streamPostPolicy, Boolean historyPublicToSubscribers, OneOfstringinteger messageRetentionDays) throws Exception;

    public Result updateSubscriptionSettingsHttp(Http.Request request, @NotNull List<Object> subscriptionData) throws Exception {
        JsonSuccessBase obj = updateSubscriptionSettings(request, subscriptionData);
    if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
    }
JsonNode result = mapper.valueToTree(obj);
return ok(result);

    }

    public abstract JsonSuccessBase updateSubscriptionSettings(Http.Request request, @NotNull List<Object> subscriptionData) throws Exception;

    public Result updateSubscriptionsHttp(Http.Request request, List<String> delete, List<Object> add) throws Exception {
        JsonSuccessBase obj = updateSubscriptions(request, delete, add);
    if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
    }
JsonNode result = mapper.valueToTree(obj);
return ok(result);

    }

    public abstract JsonSuccessBase updateSubscriptions(Http.Request request, List<String> delete, List<Object> add) throws Exception;

}
