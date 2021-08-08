package org.openapitools.server.api.verticle
import io.vertx.core.Vertx
import io.vertx.core.AbstractVerticle
import io.vertx.serviceproxy.ServiceBinder

fun main(){
    Vertx.vertx().deployVerticle(AuthenticationApiVerticle())
}

class AuthenticationApiVerticle:AbstractVerticle() {

    override fun start() {
        val instance = (javaClass.classLoader.loadClass("org.openapitools.server.api.verticle.AuthenticationApiImpl").newInstance() as AuthenticationApi)
        instance.init(vertx,config())
        ServiceBinder(vertx)
            .setAddress(AuthenticationApi.address)
            .register(AuthenticationApi::class.java,instance)
    }
}