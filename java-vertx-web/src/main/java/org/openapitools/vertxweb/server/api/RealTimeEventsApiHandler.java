package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.BadEventQueueIdError;
import org.openapitools.vertxweb.server.model.JsonSuccess;
import org.openapitools.vertxweb.server.model.JsonSuccessBase;
import org.openapitools.vertxweb.server.model.OneOfInvalidApiKeyErrorMissingArgumentErrorUserNotAuthorizedError;
import org.openapitools.vertxweb.server.model.OneOfRateLimitedError;
import org.openapitools.vertxweb.server.model.OneOfUserDeactivatedErrorRealmDeactivatedError;

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

public class RealTimeEventsApiHandler {

    private static final Logger logger = LoggerFactory.getLogger(RealTimeEventsApiHandler.class);

    private final RealTimeEventsApi api;

    public RealTimeEventsApiHandler(RealTimeEventsApi api) {
        this.api = api;
    }

    @Deprecated
    public RealTimeEventsApiHandler() {
        this(new RealTimeEventsApiImpl());
    }

    public void mount(RouterBuilder builder) {
        builder.operation("deleteQueue").handler(this::deleteQueue);
        builder.operation("getEvents").handler(this::getEvents);
        builder.operation("realTimePost").handler(this::realTimePost);
        builder.operation("registerQueue").handler(this::registerQueue);
        builder.operation("restErrorHandling").handler(this::restErrorHandling);
    }

    private void deleteQueue(RoutingContext routingContext) {
        logger.info("deleteQueue()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String queueId = requestParameters.queryParameter("queue_id") != null ? requestParameters.queryParameter("queue_id").getString() : null;

        logger.debug("Parameter queueId is {}", queueId);

        api.deleteQueue(queueId)
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

    private void getEvents(RoutingContext routingContext) {
        logger.info("getEvents()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String queueId = requestParameters.queryParameter("queue_id") != null ? requestParameters.queryParameter("queue_id").getString() : null;
        Integer lastEventId = requestParameters.queryParameter("last_event_id") != null ? requestParameters.queryParameter("last_event_id").getInteger() : null;
        Boolean dontBlock = requestParameters.queryParameter("dont_block") != null ? requestParameters.queryParameter("dont_block").getBoolean() : null;

        logger.debug("Parameter queueId is {}", queueId);
        logger.debug("Parameter lastEventId is {}", lastEventId);
        logger.debug("Parameter dontBlock is {}", dontBlock);

        api.getEvents(queueId, lastEventId, dontBlock)
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

    private void realTimePost(RoutingContext routingContext) {
        logger.info("realTimePost()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        List<String> eventTypes = requestParameters.queryParameter("event_types") != null ? DatabindCodec.mapper().convertValue(requestParameters.queryParameter("event_types").get(), new TypeReference<List<String>>(){}) : null;
        List<List<String>> narrow = requestParameters.queryParameter("narrow") != null ? DatabindCodec.mapper().convertValue(requestParameters.queryParameter("narrow").get(), new TypeReference<List<List<String>>>(){}) : null;
        Boolean allPublicStreams = requestParameters.queryParameter("all_public_streams") != null ? requestParameters.queryParameter("all_public_streams").getBoolean() : null;

        logger.debug("Parameter eventTypes is {}", eventTypes);
        logger.debug("Parameter narrow is {}", narrow);
        logger.debug("Parameter allPublicStreams is {}", allPublicStreams);

        api.realTimePost(eventTypes, narrow, allPublicStreams)
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

    private void registerQueue(RoutingContext routingContext) {
        logger.info("registerQueue()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        Boolean applyMarkdown = requestParameters.queryParameter("apply_markdown") != null ? requestParameters.queryParameter("apply_markdown").getBoolean() : null;
        Boolean clientGravatar = requestParameters.queryParameter("client_gravatar") != null ? requestParameters.queryParameter("client_gravatar").getBoolean() : null;
        Boolean slimPresence = requestParameters.queryParameter("slim_presence") != null ? requestParameters.queryParameter("slim_presence").getBoolean() : null;
        List<String> eventTypes = requestParameters.queryParameter("event_types") != null ? DatabindCodec.mapper().convertValue(requestParameters.queryParameter("event_types").get(), new TypeReference<List<String>>(){}) : null;
        Boolean allPublicStreams = requestParameters.queryParameter("all_public_streams") != null ? requestParameters.queryParameter("all_public_streams").getBoolean() : null;
        Boolean includeSubscribers = requestParameters.queryParameter("include_subscribers") != null ? requestParameters.queryParameter("include_subscribers").getBoolean() : null;
        Object clientCapabilities = requestParameters.queryParameter("client_capabilities") != null ? requestParameters.queryParameter("client_capabilities").getObject() : null;
        List<String> fetchEventTypes = requestParameters.queryParameter("fetch_event_types") != null ? DatabindCodec.mapper().convertValue(requestParameters.queryParameter("fetch_event_types").get(), new TypeReference<List<String>>(){}) : null;
        List<List<String>> narrow = requestParameters.queryParameter("narrow") != null ? DatabindCodec.mapper().convertValue(requestParameters.queryParameter("narrow").get(), new TypeReference<List<List<String>>>(){}) : null;

        logger.debug("Parameter applyMarkdown is {}", applyMarkdown);
        logger.debug("Parameter clientGravatar is {}", clientGravatar);
        logger.debug("Parameter slimPresence is {}", slimPresence);
        logger.debug("Parameter eventTypes is {}", eventTypes);
        logger.debug("Parameter allPublicStreams is {}", allPublicStreams);
        logger.debug("Parameter includeSubscribers is {}", includeSubscribers);
        logger.debug("Parameter clientCapabilities is {}", clientCapabilities);
        logger.debug("Parameter fetchEventTypes is {}", fetchEventTypes);
        logger.debug("Parameter narrow is {}", narrow);

        api.registerQueue(applyMarkdown, clientGravatar, slimPresence, eventTypes, allPublicStreams, includeSubscribers, clientCapabilities, fetchEventTypes, narrow)
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

    private void restErrorHandling(RoutingContext routingContext) {
        logger.info("restErrorHandling()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);



        api.restErrorHandling()
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
