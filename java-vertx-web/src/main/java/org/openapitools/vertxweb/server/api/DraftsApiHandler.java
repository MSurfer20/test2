package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.CodedError;
import org.openapitools.vertxweb.server.model.Draft;
import org.openapitools.vertxweb.server.model.JsonError;
import org.openapitools.vertxweb.server.model.JsonSuccess;

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

public class DraftsApiHandler {

    private static final Logger logger = LoggerFactory.getLogger(DraftsApiHandler.class);

    private final DraftsApi api;

    public DraftsApiHandler(DraftsApi api) {
        this.api = api;
    }

    @Deprecated
    public DraftsApiHandler() {
        this(new DraftsApiImpl());
    }

    public void mount(RouterBuilder builder) {
        builder.operation("createDrafts").handler(this::createDrafts);
        builder.operation("deleteDraft").handler(this::deleteDraft);
        builder.operation("editDraft").handler(this::editDraft);
        builder.operation("getDrafts").handler(this::getDrafts);
    }

    private void createDrafts(RoutingContext routingContext) {
        logger.info("createDrafts()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        List<Draft> drafts = requestParameters.queryParameter("drafts") != null ? DatabindCodec.mapper().convertValue(requestParameters.queryParameter("drafts").get(), new TypeReference<List<Draft>>(){}) : null;

        logger.debug("Parameter drafts is {}", drafts);

        api.createDrafts(drafts)
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

    private void deleteDraft(RoutingContext routingContext) {
        logger.info("deleteDraft()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        Integer draftId = requestParameters.pathParameter("draft_id") != null ? requestParameters.pathParameter("draft_id").getInteger() : null;

        logger.debug("Parameter draftId is {}", draftId);

        api.deleteDraft(draftId)
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

    private void editDraft(RoutingContext routingContext) {
        logger.info("editDraft()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        Integer draftId = requestParameters.pathParameter("draft_id") != null ? requestParameters.pathParameter("draft_id").getInteger() : null;
        Draft draft = requestParameters.queryParameter("draft") != null ? DatabindCodec.mapper().convertValue(requestParameters.queryParameter("draft").get(), new TypeReference<Draft>(){}) : null;

        logger.debug("Parameter draftId is {}", draftId);
        logger.debug("Parameter draft is {}", draft);

        api.editDraft(draftId, draft)
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

    private void getDrafts(RoutingContext routingContext) {
        logger.info("getDrafts()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);



        api.getDrafts()
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
