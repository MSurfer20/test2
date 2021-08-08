package org.openapitools.server.api.verticle
import io.vertx.core.Vertx
import io.vertx.core.AbstractVerticle
import io.vertx.serviceproxy.ServiceBinder

fun main(){
    Vertx.vertx().deployVerticle(RealTimeEventsApiVerticle())
}

class RealTimeEventsApiVerticle:AbstractVerticle() {

    override fun start() {
        val instance = (javaClass.classLoader.loadClass("org.openapitools.server.api.verticle.RealTimeEventsApiImpl").newInstance() as RealTimeEventsApi)
        instance.init(vertx,config())
        ServiceBinder(vertx)
            .setAddress(RealTimeEventsApi.address)
            .register(RealTimeEventsApi::class.java,instance)
    }
}