package org.openapitools.server.api.verticle
import io.vertx.core.Vertx
import io.vertx.core.AbstractVerticle
import io.vertx.serviceproxy.ServiceBinder

fun main(){
    Vertx.vertx().deployVerticle(DraftsApiVerticle())
}

class DraftsApiVerticle:AbstractVerticle() {

    override fun start() {
        val instance = (javaClass.classLoader.loadClass("org.openapitools.server.api.verticle.DraftsApiImpl").newInstance() as DraftsApi)
        instance.init(vertx,config())
        ServiceBinder(vertx)
            .setAddress(DraftsApi.address)
            .register(DraftsApi::class.java,instance)
    }
}