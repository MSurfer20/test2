package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.CodedError;
import org.openapitools.vertxweb.server.model.JsonError;
import org.openapitools.vertxweb.server.model.JsonSuccess;
import org.openapitools.vertxweb.server.model.JsonSuccessBase;
import org.openapitools.vertxweb.server.model.NonExistingStreamError;
import org.openapitools.vertxweb.server.model.OneOfobjectobject;
import org.openapitools.vertxweb.server.model.OneOfstringinteger;

import com.fasterxml.jackson.core.type.TypeReference;
import io.vertx.core.json.jackson.DatabindCodec;
import io.vertx.ext.web.openapi.RouterBuilder;
import io.vertx.ext.web.validation.RequestParameters;
import io.vertx.ext.web.validation.RequestParameter;
import io.vertx.ext.web.validation.ValidationHandler;
import io.vertx.ext.web.RoutingContext;
import io.vertx.core.json.JsonObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.Map;

public class StreamsApiHandler {

    private static final Logger logger = LoggerFactory.getLogger(StreamsApiHandler.class);

    private final StreamsApi api;

    public StreamsApiHandler(StreamsApi api) {
        this.api = api;
    }

    @Deprecated
    public StreamsApiHandler() {
        this(new StreamsApiImpl());
    }

    public void mount(RouterBuilder builder) {
        builder.operation("archiveStream").handler(this::archiveStream);
        builder.operation("createBigBlueButtonVideoCall").handler(this::createBigBlueButtonVideoCall);
        builder.operation("deleteTopic").handler(this::deleteTopic);
        builder.operation("getStreamId").handler(this::getStreamId);
        builder.operation("getStreamTopics").handler(this::getStreamTopics);
        builder.operation("getStreams").handler(this::getStreams);
        builder.operation("getSubscribers").handler(this::getSubscribers);
        builder.operation("getSubscriptionStatus").handler(this::getSubscriptionStatus);
        builder.operation("getSubscriptions").handler(this::getSubscriptions);
        builder.operation("muteTopic").handler(this::muteTopic);
        builder.operation("subscribe").handler(this::subscribe);
        builder.operation("unsubscribe").handler(this::unsubscribe);
        builder.operation("updateStream").handler(this::updateStream);
        builder.operation("updateSubscriptionSettings").handler(this::updateSubscriptionSettings);
        builder.operation("updateSubscriptions").handler(this::updateSubscriptions);
    }

    private void archiveStream(RoutingContext routingContext) {
        logger.info("archiveStream()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        Integer streamId = requestParameters.pathParameter("stream_id") != null ? requestParameters.pathParameter("stream_id").getInteger() : null;

        logger.debug("Parameter streamId is {}", streamId);

        api.archiveStream(streamId)
            .onSuccess(apiResponse -> {
                routingContext.response().setStatusCode(apiResponse.getStatusCode());
                if (apiResponse.hasData()) {
                    routingContext.json(apiResponse.getData());
                } else {
                    routingContext.response().end();
                }
            })
            .onFailure(routingContext::fail);
    }

    private void createBigBlueButtonVideoCall(RoutingContext routingContext) {
        logger.info("createBigBlueButtonVideoCall()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);



        api.createBigBlueButtonVideoCall()
            .onSuccess(apiResponse -> {
                routingContext.response().setStatusCode(apiResponse.getStatusCode());
                if (apiResponse.hasData()) {
                    routingContext.json(apiResponse.getData());
                } else {
                    routingContext.response().end();
                }
            })
            .onFailure(routingContext::fail);
    }

    private void deleteTopic(RoutingContext routingContext) {
        logger.info("deleteTopic()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        Integer streamId = requestParameters.pathParameter("stream_id") != null ? requestParameters.pathParameter("stream_id").getInteger() : null;
        String topicName = requestParameters.queryParameter("topic_name") != null ? requestParameters.queryParameter("topic_name").getString() : null;

        logger.debug("Parameter streamId is {}", streamId);
        logger.debug("Parameter topicName is {}", topicName);

        api.deleteTopic(streamId, topicName)
            .onSuccess(apiResponse -> {
                routingContext.response().setStatusCode(apiResponse.getStatusCode());
                if (apiResponse.hasData()) {
                    routingContext.json(apiResponse.getData());
                } else {
                    routingContext.response().end();
                }
            })
            .onFailure(routingContext::fail);
    }

    private void getStreamId(RoutingContext routingContext) {
        logger.info("getStreamId()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String stream = requestParameters.queryParameter("stream") != null ? requestParameters.queryParameter("stream").getString() : null;

        logger.debug("Parameter stream is {}", stream);

        api.getStreamId(stream)
            .onSuccess(apiResponse -> {
                routingContext.response().setStatusCode(apiResponse.getStatusCode());
                if (apiResponse.hasData()) {
                    routingContext.json(apiResponse.getData());
                } else {
                    routingContext.response().end();
                }
            })
            .onFailure(routingContext::fail);
    }

    private void getStreamTopics(RoutingContext routingContext) {
        logger.info("getStreamTopics()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        Integer streamId = requestParameters.pathParameter("stream_id") != null ? requestParameters.pathParameter("stream_id").getInteger() : null;

        logger.debug("Parameter streamId is {}", streamId);

        api.getStreamTopics(streamId)
            .onSuccess(apiResponse -> {
                routingContext.response().setStatusCode(apiResponse.getStatusCode());
                if (apiResponse.hasData()) {
                    routingContext.json(apiResponse.getData());
                } else {
                    routingContext.response().end();
                }
            })
            .onFailure(routingContext::fail);
    }

    private void getStreams(RoutingContext routingContext) {
        logger.info("getStreams()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        Boolean includePublic = requestParameters.queryParameter("include_public") != null ? requestParameters.queryParameter("include_public").getBoolean() : null;
        Boolean includeWebPublic = requestParameters.queryParameter("include_web_public") != null ? requestParameters.queryParameter("include_web_public").getBoolean() : null;
        Boolean includeSubscribed = requestParameters.queryParameter("include_subscribed") != null ? requestParameters.queryParameter("include_subscribed").getBoolean() : null;
        Boolean includeAllActive = requestParameters.queryParameter("include_all_active") != null ? requestParameters.queryParameter("include_all_active").getBoolean() : null;
        Boolean includeDefault = requestParameters.queryParameter("include_default") != null ? requestParameters.queryParameter("include_default").getBoolean() : null;
        Boolean includeOwnerSubscribed = requestParameters.queryParameter("include_owner_subscribed") != null ? requestParameters.queryParameter("include_owner_subscribed").getBoolean() : null;

        logger.debug("Parameter includePublic is {}", includePublic);
        logger.debug("Parameter includeWebPublic is {}", includeWebPublic);
        logger.debug("Parameter includeSubscribed is {}", includeSubscribed);
        logger.debug("Parameter includeAllActive is {}", includeAllActive);
        logger.debug("Parameter includeDefault is {}", includeDefault);
        logger.debug("Parameter includeOwnerSubscribed is {}", includeOwnerSubscribed);

        api.getStreams(includePublic, includeWebPublic, includeSubscribed, includeAllActive, includeDefault, includeOwnerSubscribed)
            .onSuccess(apiResponse -> {
                routingContext.response().setStatusCode(apiResponse.getStatusCode());
                if (apiResponse.hasData()) {
                    routingContext.json(apiResponse.getData());
                } else {
                    routingContext.response().end();
                }
            })
            .onFailure(routingContext::fail);
    }

    private void getSubscribers(RoutingContext routingContext) {
        logger.info("getSubscribers()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        Integer streamId = requestParameters.pathParameter("stream_id") != null ? requestParameters.pathParameter("stream_id").getInteger() : null;

        logger.debug("Parameter streamId is {}", streamId);

        api.getSubscribers(streamId)
            .onSuccess(apiResponse -> {
                routingContext.response().setStatusCode(apiResponse.getStatusCode());
                if (apiResponse.hasData()) {
                    routingContext.json(apiResponse.getData());
                } else {
                    routingContext.response().end();
                }
            })
            .onFailure(routingContext::fail);
    }

    private void getSubscriptionStatus(RoutingContext routingContext) {
        logger.info("getSubscriptionStatus()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        Integer userId = requestParameters.pathParameter("user_id") != null ? requestParameters.pathParameter("user_id").getInteger() : null;
        Integer streamId = requestParameters.pathParameter("stream_id") != null ? requestParameters.pathParameter("stream_id").getInteger() : null;

        logger.debug("Parameter userId is {}", userId);
        logger.debug("Parameter streamId is {}", streamId);

        api.getSubscriptionStatus(userId, streamId)
            .onSuccess(apiResponse -> {
                routingContext.response().setStatusCode(apiResponse.getStatusCode());
                if (apiResponse.hasData()) {
                    routingContext.json(apiResponse.getData());
                } else {
                    routingContext.response().end();
                }
            })
            .onFailure(routingContext::fail);
    }

    private void getSubscriptions(RoutingContext routingContext) {
        logger.info("getSubscriptions()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        Boolean includeSubscribers = requestParameters.queryParameter("include_subscribers") != null ? requestParameters.queryParameter("include_subscribers").getBoolean() : null;

        logger.debug("Parameter includeSubscribers is {}", includeSubscribers);

        api.getSubscriptions(includeSubscribers)
            .onSuccess(apiResponse -> {
                routingContext.response().setStatusCode(apiResponse.getStatusCode());
                if (apiResponse.hasData()) {
                    routingContext.json(apiResponse.getData());
                } else {
                    routingContext.response().end();
                }
            })
            .onFailure(routingContext::fail);
    }

    private void muteTopic(RoutingContext routingContext) {
        logger.info("muteTopic()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String topic = requestParameters.queryParameter("topic") != null ? requestParameters.queryParameter("topic").getString() : null;
        String op = requestParameters.queryParameter("op") != null ? requestParameters.queryParameter("op").getString() : null;
        String stream = requestParameters.queryParameter("stream") != null ? requestParameters.queryParameter("stream").getString() : null;
        Integer streamId = requestParameters.queryParameter("stream_id") != null ? requestParameters.queryParameter("stream_id").getInteger() : null;

        logger.debug("Parameter topic is {}", topic);
        logger.debug("Parameter op is {}", op);
        logger.debug("Parameter stream is {}", stream);
        logger.debug("Parameter streamId is {}", streamId);

        api.muteTopic(topic, op, stream, streamId)
            .onSuccess(apiResponse -> {
                routingContext.response().setStatusCode(apiResponse.getStatusCode());
                if (apiResponse.hasData()) {
                    routingContext.json(apiResponse.getData());
                } else {
                    routingContext.response().end();
                }
            })
            .onFailure(routingContext::fail);
    }

    private void subscribe(RoutingContext routingContext) {
        logger.info("subscribe()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        List<Object> subscriptions = requestParameters.queryParameter("subscriptions") != null ? DatabindCodec.mapper().convertValue(requestParameters.queryParameter("subscriptions").get(), new TypeReference<List<Object>>(){}) : null;
        List<OneOfstringinteger> principals = requestParameters.queryParameter("principals") != null ? DatabindCodec.mapper().convertValue(requestParameters.queryParameter("principals").get(), new TypeReference<List<OneOfstringinteger>>(){}) : null;
        Boolean authorizationErrorsFatal = requestParameters.queryParameter("authorization_errors_fatal") != null ? requestParameters.queryParameter("authorization_errors_fatal").getBoolean() : null;
        Boolean announce = requestParameters.queryParameter("announce") != null ? requestParameters.queryParameter("announce").getBoolean() : null;
        Boolean inviteOnly = requestParameters.queryParameter("invite_only") != null ? requestParameters.queryParameter("invite_only").getBoolean() : null;
        Boolean historyPublicToSubscribers = requestParameters.queryParameter("history_public_to_subscribers") != null ? requestParameters.queryParameter("history_public_to_subscribers").getBoolean() : null;
        Integer streamPostPolicy = requestParameters.queryParameter("stream_post_policy") != null ? requestParameters.queryParameter("stream_post_policy").getInteger() : null;
        OneOfstringinteger messageRetentionDays = requestParameters.queryParameter("message_retention_days") != null ? DatabindCodec.mapper().convertValue(requestParameters.queryParameter("message_retention_days").get(), new TypeReference<OneOfstringinteger>(){}) : null;

        logger.debug("Parameter subscriptions is {}", subscriptions);
        logger.debug("Parameter principals is {}", principals);
        logger.debug("Parameter authorizationErrorsFatal is {}", authorizationErrorsFatal);
        logger.debug("Parameter announce is {}", announce);
        logger.debug("Parameter inviteOnly is {}", inviteOnly);
        logger.debug("Parameter historyPublicToSubscribers is {}", historyPublicToSubscribers);
        logger.debug("Parameter streamPostPolicy is {}", streamPostPolicy);
        logger.debug("Parameter messageRetentionDays is {}", messageRetentionDays);

        api.subscribe(subscriptions, principals, authorizationErrorsFatal, announce, inviteOnly, historyPublicToSubscribers, streamPostPolicy, messageRetentionDays)
            .onSuccess(apiResponse -> {
                routingContext.response().setStatusCode(apiResponse.getStatusCode());
                if (apiResponse.hasData()) {
                    routingContext.json(apiResponse.getData());
                } else {
                    routingContext.response().end();
                }
            })
            .onFailure(routingContext::fail);
    }

    private void unsubscribe(RoutingContext routingContext) {
        logger.info("unsubscribe()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        List<String> subscriptions = requestParameters.queryParameter("subscriptions") != null ? DatabindCodec.mapper().convertValue(requestParameters.queryParameter("subscriptions").get(), new TypeReference<List<String>>(){}) : null;
        List<OneOfstringinteger> principals = requestParameters.queryParameter("principals") != null ? DatabindCodec.mapper().convertValue(requestParameters.queryParameter("principals").get(), new TypeReference<List<OneOfstringinteger>>(){}) : null;

        logger.debug("Parameter subscriptions is {}", subscriptions);
        logger.debug("Parameter principals is {}", principals);

        api.unsubscribe(subscriptions, principals)
            .onSuccess(apiResponse -> {
                routingContext.response().setStatusCode(apiResponse.getStatusCode());
                if (apiResponse.hasData()) {
                    routingContext.json(apiResponse.getData());
                } else {
                    routingContext.response().end();
                }
            })
            .onFailure(routingContext::fail);
    }

    private void updateStream(RoutingContext routingContext) {
        logger.info("updateStream()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        Integer streamId = requestParameters.pathParameter("stream_id") != null ? requestParameters.pathParameter("stream_id").getInteger() : null;
        String description = requestParameters.queryParameter("description") != null ? requestParameters.queryParameter("description").getString() : null;
        String newName = requestParameters.queryParameter("new_name") != null ? requestParameters.queryParameter("new_name").getString() : null;
        Boolean isPrivate = requestParameters.queryParameter("is_private") != null ? requestParameters.queryParameter("is_private").getBoolean() : null;
        Boolean isAnnouncementOnly = requestParameters.queryParameter("is_announcement_only") != null ? requestParameters.queryParameter("is_announcement_only").getBoolean() : null;
        Integer streamPostPolicy = requestParameters.queryParameter("stream_post_policy") != null ? requestParameters.queryParameter("stream_post_policy").getInteger() : null;
        Boolean historyPublicToSubscribers = requestParameters.queryParameter("history_public_to_subscribers") != null ? requestParameters.queryParameter("history_public_to_subscribers").getBoolean() : null;
        OneOfstringinteger messageRetentionDays = requestParameters.queryParameter("message_retention_days") != null ? DatabindCodec.mapper().convertValue(requestParameters.queryParameter("message_retention_days").get(), new TypeReference<OneOfstringinteger>(){}) : null;

        logger.debug("Parameter streamId is {}", streamId);
        logger.debug("Parameter description is {}", description);
        logger.debug("Parameter newName is {}", newName);
        logger.debug("Parameter isPrivate is {}", isPrivate);
        logger.debug("Parameter isAnnouncementOnly is {}", isAnnouncementOnly);
        logger.debug("Parameter streamPostPolicy is {}", streamPostPolicy);
        logger.debug("Parameter historyPublicToSubscribers is {}", historyPublicToSubscribers);
        logger.debug("Parameter messageRetentionDays is {}", messageRetentionDays);

        api.updateStream(streamId, description, newName, isPrivate, isAnnouncementOnly, streamPostPolicy, historyPublicToSubscribers, messageRetentionDays)
            .onSuccess(apiResponse -> {
                routingContext.response().setStatusCode(apiResponse.getStatusCode());
                if (apiResponse.hasData()) {
                    routingContext.json(apiResponse.getData());
                } else {
                    routingContext.response().end();
                }
            })
            .onFailure(routingContext::fail);
    }

    private void updateSubscriptionSettings(RoutingContext routingContext) {
        logger.info("updateSubscriptionSettings()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        List<Object> subscriptionData = requestParameters.queryParameter("subscription_data") != null ? DatabindCodec.mapper().convertValue(requestParameters.queryParameter("subscription_data").get(), new TypeReference<List<Object>>(){}) : null;

        logger.debug("Parameter subscriptionData is {}", subscriptionData);

        api.updateSubscriptionSettings(subscriptionData)
            .onSuccess(apiResponse -> {
                routingContext.response().setStatusCode(apiResponse.getStatusCode());
                if (apiResponse.hasData()) {
                    routingContext.json(apiResponse.getData());
                } else {
                    routingContext.response().end();
                }
            })
            .onFailure(routingContext::fail);
    }

    private void updateSubscriptions(RoutingContext routingContext) {
        logger.info("updateSubscriptions()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        List<String> delete = requestParameters.queryParameter("delete") != null ? DatabindCodec.mapper().convertValue(requestParameters.queryParameter("delete").get(), new TypeReference<List<String>>(){}) : null;
        List<Object> add = requestParameters.queryParameter("add") != null ? DatabindCodec.mapper().convertValue(requestParameters.queryParameter("add").get(), new TypeReference<List<Object>>(){}) : null;

        logger.debug("Parameter delete is {}", delete);
        logger.debug("Parameter add is {}", add);

        api.updateSubscriptions(delete, add)
            .onSuccess(apiResponse -> {
                routingContext.response().setStatusCode(apiResponse.getStatusCode());
                if (apiResponse.hasData()) {
                    routingContext.json(apiResponse.getData());
                } else {
                    routingContext.response().end();
                }
            })
            .onFailure(routingContext::fail);
    }

}
