package org.openapitools.vertxweb.server.api;

import io.vertx.ext.web.FileUpload;
import org.openapitools.vertxweb.server.model.JsonSuccess;
import org.openapitools.vertxweb.server.model.JsonSuccessBase;

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

public class ServerAndOrganizationsApiHandler {

    private static final Logger logger = LoggerFactory.getLogger(ServerAndOrganizationsApiHandler.class);

    private final ServerAndOrganizationsApi api;

    public ServerAndOrganizationsApiHandler(ServerAndOrganizationsApi api) {
        this.api = api;
    }

    @Deprecated
    public ServerAndOrganizationsApiHandler() {
        this(new ServerAndOrganizationsApiImpl());
    }

    public void mount(RouterBuilder builder) {
        builder.operation("addCodePlayground").handler(this::addCodePlayground);
        builder.operation("addLinkifier").handler(this::addLinkifier);
        builder.operation("createCustomProfileField").handler(this::createCustomProfileField);
        builder.operation("getCustomEmoji").handler(this::getCustomEmoji);
        builder.operation("getCustomProfileFields").handler(this::getCustomProfileFields);
        builder.operation("getLinkifiers").handler(this::getLinkifiers);
        builder.operation("getServerSettings").handler(this::getServerSettings);
        builder.operation("removeCodePlayground").handler(this::removeCodePlayground);
        builder.operation("removeLinkifier").handler(this::removeLinkifier);
        builder.operation("reorderCustomProfileFields").handler(this::reorderCustomProfileFields);
        builder.operation("updateLinkifier").handler(this::updateLinkifier);
        builder.operation("uploadCustomEmoji").handler(this::uploadCustomEmoji);
    }

    private void addCodePlayground(RoutingContext routingContext) {
        logger.info("addCodePlayground()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String name = requestParameters.queryParameter("name") != null ? requestParameters.queryParameter("name").getString() : null;
        String pygmentsLanguage = requestParameters.queryParameter("pygments_language") != null ? requestParameters.queryParameter("pygments_language").getString() : null;
        String urlPrefix = requestParameters.queryParameter("url_prefix") != null ? requestParameters.queryParameter("url_prefix").getString() : null;

        logger.debug("Parameter name is {}", name);
        logger.debug("Parameter pygmentsLanguage is {}", pygmentsLanguage);
        logger.debug("Parameter urlPrefix is {}", urlPrefix);

        api.addCodePlayground(name, pygmentsLanguage, urlPrefix)
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

    private void addLinkifier(RoutingContext routingContext) {
        logger.info("addLinkifier()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String pattern = requestParameters.queryParameter("pattern") != null ? requestParameters.queryParameter("pattern").getString() : null;
        String urlFormatString = requestParameters.queryParameter("url_format_string") != null ? requestParameters.queryParameter("url_format_string").getString() : null;

        logger.debug("Parameter pattern is {}", pattern);
        logger.debug("Parameter urlFormatString is {}", urlFormatString);

        api.addLinkifier(pattern, urlFormatString)
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

    private void createCustomProfileField(RoutingContext routingContext) {
        logger.info("createCustomProfileField()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        Integer fieldType = requestParameters.queryParameter("field_type") != null ? requestParameters.queryParameter("field_type").getInteger() : null;
        String name = requestParameters.queryParameter("name") != null ? requestParameters.queryParameter("name").getString() : null;
        String hint = requestParameters.queryParameter("hint") != null ? requestParameters.queryParameter("hint").getString() : null;
        Object fieldData = requestParameters.queryParameter("field_data") != null ? requestParameters.queryParameter("field_data").getObject() : null;

        logger.debug("Parameter fieldType is {}", fieldType);
        logger.debug("Parameter name is {}", name);
        logger.debug("Parameter hint is {}", hint);
        logger.debug("Parameter fieldData is {}", fieldData);

        api.createCustomProfileField(fieldType, name, hint, fieldData)
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

    private void getCustomEmoji(RoutingContext routingContext) {
        logger.info("getCustomEmoji()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);



        api.getCustomEmoji()
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

    private void getCustomProfileFields(RoutingContext routingContext) {
        logger.info("getCustomProfileFields()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);



        api.getCustomProfileFields()
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

    private void getLinkifiers(RoutingContext routingContext) {
        logger.info("getLinkifiers()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);



        api.getLinkifiers()
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

    private void getServerSettings(RoutingContext routingContext) {
        logger.info("getServerSettings()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);



        api.getServerSettings()
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

    private void removeCodePlayground(RoutingContext routingContext) {
        logger.info("removeCodePlayground()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        Integer playgroundId = requestParameters.pathParameter("playground_id") != null ? requestParameters.pathParameter("playground_id").getInteger() : null;

        logger.debug("Parameter playgroundId is {}", playgroundId);

        api.removeCodePlayground(playgroundId)
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

    private void removeLinkifier(RoutingContext routingContext) {
        logger.info("removeLinkifier()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        Integer filterId = requestParameters.pathParameter("filter_id") != null ? requestParameters.pathParameter("filter_id").getInteger() : null;

        logger.debug("Parameter filterId is {}", filterId);

        api.removeLinkifier(filterId)
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

    private void reorderCustomProfileFields(RoutingContext routingContext) {
        logger.info("reorderCustomProfileFields()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        List<Integer> order = requestParameters.queryParameter("order") != null ? DatabindCodec.mapper().convertValue(requestParameters.queryParameter("order").get(), new TypeReference<List<Integer>>(){}) : null;

        logger.debug("Parameter order is {}", order);

        api.reorderCustomProfileFields(order)
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

    private void updateLinkifier(RoutingContext routingContext) {
        logger.info("updateLinkifier()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        Integer filterId = requestParameters.pathParameter("filter_id") != null ? requestParameters.pathParameter("filter_id").getInteger() : null;
        String pattern = requestParameters.queryParameter("pattern") != null ? requestParameters.queryParameter("pattern").getString() : null;
        String urlFormatString = requestParameters.queryParameter("url_format_string") != null ? requestParameters.queryParameter("url_format_string").getString() : null;

        logger.debug("Parameter filterId is {}", filterId);
        logger.debug("Parameter pattern is {}", pattern);
        logger.debug("Parameter urlFormatString is {}", urlFormatString);

        api.updateLinkifier(filterId, pattern, urlFormatString)
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

    private void uploadCustomEmoji(RoutingContext routingContext) {
        logger.info("uploadCustomEmoji()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String emojiName = requestParameters.pathParameter("emoji_name") != null ? requestParameters.pathParameter("emoji_name").getString() : null;
        FileUpload filename = routingContext.fileUploads().iterator().next();

        logger.debug("Parameter emojiName is {}", emojiName);
        logger.debug("Parameter filename is {}", filename);

        api.uploadCustomEmoji(emojiName, filename)
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
