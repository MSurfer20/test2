package controllers;

import apimodels.CodedError;
import apimodels.JsonError;
import apimodels.JsonSuccess;
import apimodels.JsonSuccessBase;
import apimodels.NonExistingStreamError;
import apimodels.OneOfobjectobject;
import apimodels.OneOfstringinteger;

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
public class StreamsApiController extends Controller {
    private final StreamsApiControllerImpInterface imp;
    private final ObjectMapper mapper;
    private final Config configuration;

    @Inject
    private StreamsApiController(Config configuration, StreamsApiControllerImpInterface imp) {
        this.imp = imp;
        mapper = new ObjectMapper();
        this.configuration = configuration;
    }

    @ApiAction
    public Result archiveStream(Http.Request request, Integer streamId) throws Exception {
        return imp.archiveStreamHttp(request, streamId);
    }

    @ApiAction
    public Result createBigBlueButtonVideoCall(Http.Request request) throws Exception {
        return imp.createBigBlueButtonVideoCallHttp(request);
    }

    @ApiAction
    public Result deleteTopic(Http.Request request, Integer streamId) throws Exception {
        String valuetopicName = request.getQueryString("topic_name");
        String topicName;
        if (valuetopicName != null) {
            topicName = valuetopicName;
        } else {
            throw new IllegalArgumentException("'topic_name' parameter is required");
        }
        return imp.deleteTopicHttp(request, streamId, topicName);
    }

    @ApiAction
    public Result getStreamId(Http.Request request) throws Exception {
        String valuestream = request.getQueryString("stream");
        String stream;
        if (valuestream != null) {
            stream = valuestream;
        } else {
            throw new IllegalArgumentException("'stream' parameter is required");
        }
        return imp.getStreamIdHttp(request, stream);
    }

    @ApiAction
    public Result getStreamTopics(Http.Request request, Integer streamId) throws Exception {
        return imp.getStreamTopicsHttp(request, streamId);
    }

    @ApiAction
    public Result getStreams(Http.Request request) throws Exception {
        String valueincludePublic = request.getQueryString("include_public");
        Boolean includePublic;
        if (valueincludePublic != null) {
            includePublic = Boolean.valueOf(valueincludePublic);
        } else {
            includePublic = true;
        }
        String valueincludeWebPublic = request.getQueryString("include_web_public");
        Boolean includeWebPublic;
        if (valueincludeWebPublic != null) {
            includeWebPublic = Boolean.valueOf(valueincludeWebPublic);
        } else {
            includeWebPublic = false;
        }
        String valueincludeSubscribed = request.getQueryString("include_subscribed");
        Boolean includeSubscribed;
        if (valueincludeSubscribed != null) {
            includeSubscribed = Boolean.valueOf(valueincludeSubscribed);
        } else {
            includeSubscribed = true;
        }
        String valueincludeAllActive = request.getQueryString("include_all_active");
        Boolean includeAllActive;
        if (valueincludeAllActive != null) {
            includeAllActive = Boolean.valueOf(valueincludeAllActive);
        } else {
            includeAllActive = false;
        }
        String valueincludeDefault = request.getQueryString("include_default");
        Boolean includeDefault;
        if (valueincludeDefault != null) {
            includeDefault = Boolean.valueOf(valueincludeDefault);
        } else {
            includeDefault = false;
        }
        String valueincludeOwnerSubscribed = request.getQueryString("include_owner_subscribed");
        Boolean includeOwnerSubscribed;
        if (valueincludeOwnerSubscribed != null) {
            includeOwnerSubscribed = Boolean.valueOf(valueincludeOwnerSubscribed);
        } else {
            includeOwnerSubscribed = false;
        }
        return imp.getStreamsHttp(request, includePublic, includeWebPublic, includeSubscribed, includeAllActive, includeDefault, includeOwnerSubscribed);
    }

    @ApiAction
    public Result getSubscribers(Http.Request request, Integer streamId) throws Exception {
        return imp.getSubscribersHttp(request, streamId);
    }

    @ApiAction
    public Result getSubscriptionStatus(Http.Request request, Integer userId,Integer streamId) throws Exception {
        return imp.getSubscriptionStatusHttp(request, userId, streamId);
    }

    @ApiAction
    public Result getSubscriptions(Http.Request request) throws Exception {
        String valueincludeSubscribers = request.getQueryString("include_subscribers");
        Boolean includeSubscribers;
        if (valueincludeSubscribers != null) {
            includeSubscribers = Boolean.valueOf(valueincludeSubscribers);
        } else {
            includeSubscribers = false;
        }
        return imp.getSubscriptionsHttp(request, includeSubscribers);
    }

    @ApiAction
    public Result muteTopic(Http.Request request) throws Exception {
        String valuestream = request.getQueryString("stream");
        String stream;
        if (valuestream != null) {
            stream = valuestream;
        } else {
            stream = null;
        }
        String valuestreamId = request.getQueryString("stream_id");
        Integer streamId;
        if (valuestreamId != null) {
            streamId = Integer.parseInt(valuestreamId);
        } else {
            streamId = null;
        }
        String valuetopic = request.getQueryString("topic");
        String topic;
        if (valuetopic != null) {
            topic = valuetopic;
        } else {
            throw new IllegalArgumentException("'topic' parameter is required");
        }
        String valueop = request.getQueryString("op");
        String op;
        if (valueop != null) {
            op = valueop;
        } else {
            throw new IllegalArgumentException("'op' parameter is required");
        }
        return imp.muteTopicHttp(request, topic, op, stream, streamId);
    }

    @ApiAction
    public Result subscribe(Http.Request request) throws Exception {
        String[] subscriptionsArray = request.queryString().get("subscriptions");
        if (subscriptionsArray == null) {
            throw new IllegalArgumentException("'subscriptions' parameter is required");
        }
        List<String> subscriptionsList = OpenAPIUtils.parametersToList("multi", subscriptionsArray);
        List<Object> subscriptions = new ArrayList<>();
        for (String curParam : subscriptionsList) {
            if (!curParam.isEmpty()) {
                //noinspection UseBulkOperation
                subscriptions.add(curParam);
            }
        }
        String[] principalsArray = request.queryString().get("principals");
        List<String> principalsList = OpenAPIUtils.parametersToList("multi", principalsArray);
        List<OneOfstringinteger> principals = new ArrayList<>();
        for (String curParam : principalsList) {
            if (!curParam.isEmpty()) {
                //noinspection UseBulkOperation
                principals.add(curParam);
            }
        }
        String valueauthorizationErrorsFatal = request.getQueryString("authorization_errors_fatal");
        Boolean authorizationErrorsFatal;
        if (valueauthorizationErrorsFatal != null) {
            authorizationErrorsFatal = Boolean.valueOf(valueauthorizationErrorsFatal);
        } else {
            authorizationErrorsFatal = true;
        }
        String valueannounce = request.getQueryString("announce");
        Boolean announce;
        if (valueannounce != null) {
            announce = Boolean.valueOf(valueannounce);
        } else {
            announce = false;
        }
        String valueinviteOnly = request.getQueryString("invite_only");
        Boolean inviteOnly;
        if (valueinviteOnly != null) {
            inviteOnly = Boolean.valueOf(valueinviteOnly);
        } else {
            inviteOnly = false;
        }
        String valuehistoryPublicToSubscribers = request.getQueryString("history_public_to_subscribers");
        Boolean historyPublicToSubscribers;
        if (valuehistoryPublicToSubscribers != null) {
            historyPublicToSubscribers = Boolean.valueOf(valuehistoryPublicToSubscribers);
        } else {
            historyPublicToSubscribers = null;
        }
        String valuestreamPostPolicy = request.getQueryString("stream_post_policy");
        Integer streamPostPolicy;
        if (valuestreamPostPolicy != null) {
            streamPostPolicy = Integer.parseInt(valuestreamPostPolicy);
        } else {
            streamPostPolicy = 1;
        }
        String valuemessageRetentionDays = request.getQueryString("message_retention_days");
        OneOfstringinteger messageRetentionDays;
        if (valuemessageRetentionDays != null) {
            messageRetentionDays = valuemessageRetentionDays;
        } else {
            messageRetentionDays = null;
        }
        return imp.subscribeHttp(request, subscriptions, principals, authorizationErrorsFatal, announce, inviteOnly, historyPublicToSubscribers, streamPostPolicy, messageRetentionDays);
    }

    @ApiAction
    public Result unsubscribe(Http.Request request) throws Exception {
        String[] subscriptionsArray = request.queryString().get("subscriptions");
        if (subscriptionsArray == null) {
            throw new IllegalArgumentException("'subscriptions' parameter is required");
        }
        List<String> subscriptionsList = OpenAPIUtils.parametersToList("multi", subscriptionsArray);
        List<String> subscriptions = new ArrayList<>();
        for (String curParam : subscriptionsList) {
            if (!curParam.isEmpty()) {
                //noinspection UseBulkOperation
                subscriptions.add(curParam);
            }
        }
        String[] principalsArray = request.queryString().get("principals");
        List<String> principalsList = OpenAPIUtils.parametersToList("multi", principalsArray);
        List<OneOfstringinteger> principals = new ArrayList<>();
        for (String curParam : principalsList) {
            if (!curParam.isEmpty()) {
                //noinspection UseBulkOperation
                principals.add(curParam);
            }
        }
        return imp.unsubscribeHttp(request, subscriptions, principals);
    }

    @ApiAction
    public Result updateStream(Http.Request request, Integer streamId) throws Exception {
        String valuedescription = request.getQueryString("description");
        String description;
        if (valuedescription != null) {
            description = valuedescription;
        } else {
            description = null;
        }
        String valuenewName = request.getQueryString("new_name");
        String newName;
        if (valuenewName != null) {
            newName = valuenewName;
        } else {
            newName = null;
        }
        String valueisPrivate = request.getQueryString("is_private");
        Boolean isPrivate;
        if (valueisPrivate != null) {
            isPrivate = Boolean.valueOf(valueisPrivate);
        } else {
            isPrivate = null;
        }
        String valueisAnnouncementOnly = request.getQueryString("is_announcement_only");
        Boolean isAnnouncementOnly;
        if (valueisAnnouncementOnly != null) {
            isAnnouncementOnly = Boolean.valueOf(valueisAnnouncementOnly);
        } else {
            isAnnouncementOnly = null;
        }
        String valuestreamPostPolicy = request.getQueryString("stream_post_policy");
        Integer streamPostPolicy;
        if (valuestreamPostPolicy != null) {
            streamPostPolicy = Integer.parseInt(valuestreamPostPolicy);
        } else {
            streamPostPolicy = 1;
        }
        String valuehistoryPublicToSubscribers = request.getQueryString("history_public_to_subscribers");
        Boolean historyPublicToSubscribers;
        if (valuehistoryPublicToSubscribers != null) {
            historyPublicToSubscribers = Boolean.valueOf(valuehistoryPublicToSubscribers);
        } else {
            historyPublicToSubscribers = null;
        }
        String valuemessageRetentionDays = request.getQueryString("message_retention_days");
        OneOfstringinteger messageRetentionDays;
        if (valuemessageRetentionDays != null) {
            messageRetentionDays = valuemessageRetentionDays;
        } else {
            messageRetentionDays = null;
        }
        return imp.updateStreamHttp(request, streamId, description, newName, isPrivate, isAnnouncementOnly, streamPostPolicy, historyPublicToSubscribers, messageRetentionDays);
    }

    @ApiAction
    public Result updateSubscriptionSettings(Http.Request request) throws Exception {
        String[] subscriptionDataArray = request.queryString().get("subscription_data");
        if (subscriptionDataArray == null) {
            throw new IllegalArgumentException("'subscription_data' parameter is required");
        }
        List<String> subscriptionDataList = OpenAPIUtils.parametersToList("multi", subscriptionDataArray);
        List<Object> subscriptionData = new ArrayList<>();
        for (String curParam : subscriptionDataList) {
            if (!curParam.isEmpty()) {
                //noinspection UseBulkOperation
                subscriptionData.add(curParam);
            }
        }
        return imp.updateSubscriptionSettingsHttp(request, subscriptionData);
    }

    @ApiAction
    public Result updateSubscriptions(Http.Request request) throws Exception {
        String[] deleteArray = request.queryString().get("delete");
        List<String> deleteList = OpenAPIUtils.parametersToList("multi", deleteArray);
        List<String> delete = new ArrayList<>();
        for (String curParam : deleteList) {
            if (!curParam.isEmpty()) {
                //noinspection UseBulkOperation
                delete.add(curParam);
            }
        }
        String[] addArray = request.queryString().get("add");
        List<String> addList = OpenAPIUtils.parametersToList("multi", addArray);
        List<Object> add = new ArrayList<>();
        for (String curParam : addList) {
            if (!curParam.isEmpty()) {
                //noinspection UseBulkOperation
                add.add(curParam);
            }
        }
        return imp.updateSubscriptionsHttp(request, delete, add);
    }

}
