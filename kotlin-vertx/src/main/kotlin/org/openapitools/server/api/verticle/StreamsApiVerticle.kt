package org.openapitools.server.api.verticle
import io.vertx.core.Vertx
import io.vertx.core.AbstractVerticle
import io.vertx.serviceproxy.ServiceBinder

fun main(){
    Vertx.vertx().deployVerticle(StreamsApiVerticle())
}

class StreamsApiVerticle:AbstractVerticle() {

    override fun start() {
        val instance = (javaClass.classLoader.loadClass("org.openapitools.server.api.verticle.StreamsApiImpl").newInstance() as StreamsApi)
        instance.init(vertx,config())
        ServiceBinder(vertx)
            .setAddress(StreamsApi.address)
            .register(StreamsApi::class.java,instance)
    }
}