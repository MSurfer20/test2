package org.openapitools.vertxweb.server;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.Promise;
import io.vertx.core.http.HttpServerOptions;
import io.vertx.ext.web.Router;
import io.vertx.ext.web.RoutingContext;
import io.vertx.ext.web.openapi.RouterBuilder;
import io.vertx.ext.web.openapi.RouterBuilderOptions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.openapitools.vertxweb.server.api.AuthenticationApiHandler;
import org.openapitools.vertxweb.server.api.AuthenticationApiImpl;
import org.openapitools.vertxweb.server.api.MessagesApiHandler;
import org.openapitools.vertxweb.server.api.MessagesApiImpl;
import org.openapitools.vertxweb.server.api.RealTimeEventsApiHandler;
import org.openapitools.vertxweb.server.api.RealTimeEventsApiImpl;
import org.openapitools.vertxweb.server.api.ServerAndOrganizationsApiHandler;
import org.openapitools.vertxweb.server.api.ServerAndOrganizationsApiImpl;
import org.openapitools.vertxweb.server.api.StreamsApiHandler;
import org.openapitools.vertxweb.server.api.StreamsApiImpl;
import org.openapitools.vertxweb.server.api.UsersApiHandler;
import org.openapitools.vertxweb.server.api.UsersApiImpl;
import org.openapitools.vertxweb.server.api.WebhooksApiHandler;
import org.openapitools.vertxweb.server.api.WebhooksApiImpl;

public class HttpServerVerticle extends AbstractVerticle {

    private static final Logger logger = LoggerFactory.getLogger(HttpServerVerticle.class);
    private static final String specFile = "src/main/resources/openapi.yaml";

    
    private final AuthenticationApiHandler authenticationHandler = new AuthenticationApiHandler(new AuthenticationApiImpl());
    private final MessagesApiHandler messagesHandler = new MessagesApiHandler(new MessagesApiImpl());
    private final RealTimeEventsApiHandler realTimeEventsHandler = new RealTimeEventsApiHandler(new RealTimeEventsApiImpl());
    private final ServerAndOrganizationsApiHandler serverAndOrganizationsHandler = new ServerAndOrganizationsApiHandler(new ServerAndOrganizationsApiImpl());
    private final StreamsApiHandler streamsHandler = new StreamsApiHandler(new StreamsApiImpl());
    private final UsersApiHandler usersHandler = new UsersApiHandler(new UsersApiImpl());
    private final WebhooksApiHandler webhooksHandler = new WebhooksApiHandler(new WebhooksApiImpl());

    @Override
    public void start(Promise<Void> startPromise) {
        RouterBuilder.create(vertx, specFile)
            .map(builder -> {
              builder.setOptions(new RouterBuilderOptions()
                  // For production use case, you need to enable this flag and provide the proper security handler
                  .setRequireSecurityHandlers(false)
              );
              
              authenticationHandler.mount(builder);
              messagesHandler.mount(builder);
              realTimeEventsHandler.mount(builder);
              serverAndOrganizationsHandler.mount(builder);
              streamsHandler.mount(builder);
              usersHandler.mount(builder);
              webhooksHandler.mount(builder);

              Router router = builder.createRouter();
              router.errorHandler(400, this::validationFailureHandler);

              return router;
            })
            .compose(router ->
                vertx.createHttpServer()
                    .requestHandler(router)
                    .listen(8080)
            )
            .onSuccess(server -> logger.info("Http verticle deploy successful"))
            .onFailure(t -> logger.error("Http verticle failed to deploy", t))
            // Complete the start promise
            .<Void>mapEmpty().onComplete(startPromise);
    }

    private void validationFailureHandler(RoutingContext rc) {
         rc.response().setStatusCode(400)
                 .end("Bad Request : " + rc.failure().getMessage());
    }
}
