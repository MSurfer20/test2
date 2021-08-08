package org.openapitools.server.api.verticle
import io.vertx.core.Vertx
import io.vertx.core.AbstractVerticle
import io.vertx.serviceproxy.ServiceBinder

fun main(){
    Vertx.vertx().deployVerticle(MessagesApiVerticle())
}

class MessagesApiVerticle:AbstractVerticle() {

    override fun start() {
        val instance = (javaClass.classLoader.loadClass("org.openapitools.server.api.verticle.MessagesApiImpl").newInstance() as MessagesApi)
        instance.init(vertx,config())
        ServiceBinder(vertx)
            .setAddress(MessagesApi.address)
            .register(MessagesApi::class.java,instance)
    }
}