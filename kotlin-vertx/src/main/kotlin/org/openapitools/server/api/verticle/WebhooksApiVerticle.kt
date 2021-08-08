package org.openapitools.server.api.verticle
import io.vertx.core.Vertx
import io.vertx.core.AbstractVerticle
import io.vertx.serviceproxy.ServiceBinder

fun main(){
    Vertx.vertx().deployVerticle(WebhooksApiVerticle())
}

class WebhooksApiVerticle:AbstractVerticle() {

    override fun start() {
        val instance = (javaClass.classLoader.loadClass("org.openapitools.server.api.verticle.WebhooksApiImpl").newInstance() as WebhooksApi)
        instance.init(vertx,config())
        ServiceBinder(vertx)
            .setAddress(WebhooksApi.address)
            .register(WebhooksApi::class.java,instance)
    }
}