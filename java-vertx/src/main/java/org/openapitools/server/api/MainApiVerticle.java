package org.openapitools.server.api;

import java.nio.charset.Charset;

import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.github.phiz71.vertx.swagger.router.OperationIdServiceIdResolver;
import com.github.phiz71.vertx.swagger.router.SwaggerRouter;

import io.swagger.models.Swagger;
import io.swagger.parser.SwaggerParser;
import io.vertx.core.AbstractVerticle;
import io.vertx.core.Context;
import io.vertx.core.Future;
import io.vertx.core.file.FileSystem;
import io.vertx.core.json.Json;
import io.vertx.core.logging.Logger;
import io.vertx.core.logging.LoggerFactory;
import io.vertx.core.Vertx;
import io.vertx.ext.web.Router;

public class MainApiVerticle extends AbstractVerticle {
    static final Logger LOGGER = LoggerFactory.getLogger(MainApiVerticle.class);

    private int serverPort = 8080;
    protected Router router;

    public int getServerPort() {
        return serverPort;
    }

    public void setServerPort(int serverPort) {
        this.serverPort = serverPort;
    }

    @Override
    public void init(Vertx vertx, Context context) {
        super.init(vertx, context);
        router = Router.router(vertx);
    }

    @Override
    public void start(Future<Void> startFuture) throws Exception {
        Json.mapper.registerModule(new JavaTimeModule());
        FileSystem vertxFileSystem = vertx.fileSystem();
        vertxFileSystem.readFile("openapi.json", readFile -> {
            if (readFile.succeeded()) {
                Swagger swagger = new SwaggerParser().parse(readFile.result().toString(Charset.forName("utf-8")));
                Router swaggerRouter = SwaggerRouter.swaggerRouter(router, swagger, vertx.eventBus(), new OperationIdServiceIdResolver());

                deployVerticles(startFuture);

                vertx.createHttpServer()
                    .requestHandler(swaggerRouter::accept) 
                    .listen(serverPort, h -> {
                        if (h.succeeded()) {
                            startFuture.complete();
                        } else {
                            startFuture.fail(h.cause());
                        }
                    });
            } else {
                startFuture.fail(readFile.cause());
            }
        });                
    }
      
    public void deployVerticles(Future<Void> startFuture) {
        
        vertx.deployVerticle("org.openapitools.server.api.verticle.AuthenticationApiVerticle", res -> {
            if (res.succeeded()) {
                LOGGER.info("AuthenticationApiVerticle : Deployed");
            } else {
                startFuture.fail(res.cause());
                LOGGER.error("AuthenticationApiVerticle : Deployment failed");
            }
        });
        
        vertx.deployVerticle("org.openapitools.server.api.verticle.MessagesApiVerticle", res -> {
            if (res.succeeded()) {
                LOGGER.info("MessagesApiVerticle : Deployed");
            } else {
                startFuture.fail(res.cause());
                LOGGER.error("MessagesApiVerticle : Deployment failed");
            }
        });
        
        vertx.deployVerticle("org.openapitools.server.api.verticle.RealTimeEventsApiVerticle", res -> {
            if (res.succeeded()) {
                LOGGER.info("RealTimeEventsApiVerticle : Deployed");
            } else {
                startFuture.fail(res.cause());
                LOGGER.error("RealTimeEventsApiVerticle : Deployment failed");
            }
        });
        
        vertx.deployVerticle("org.openapitools.server.api.verticle.ServerAndOrganizationsApiVerticle", res -> {
            if (res.succeeded()) {
                LOGGER.info("ServerAndOrganizationsApiVerticle : Deployed");
            } else {
                startFuture.fail(res.cause());
                LOGGER.error("ServerAndOrganizationsApiVerticle : Deployment failed");
            }
        });
        
        vertx.deployVerticle("org.openapitools.server.api.verticle.StreamsApiVerticle", res -> {
            if (res.succeeded()) {
                LOGGER.info("StreamsApiVerticle : Deployed");
            } else {
                startFuture.fail(res.cause());
                LOGGER.error("StreamsApiVerticle : Deployment failed");
            }
        });
        
        vertx.deployVerticle("org.openapitools.server.api.verticle.UsersApiVerticle", res -> {
            if (res.succeeded()) {
                LOGGER.info("UsersApiVerticle : Deployed");
            } else {
                startFuture.fail(res.cause());
                LOGGER.error("UsersApiVerticle : Deployment failed");
            }
        });
        
        vertx.deployVerticle("org.openapitools.server.api.verticle.WebhooksApiVerticle", res -> {
            if (res.succeeded()) {
                LOGGER.info("WebhooksApiVerticle : Deployed");
            } else {
                startFuture.fail(res.cause());
                LOGGER.error("WebhooksApiVerticle : Deployment failed");
            }
        });
        
    }
}
