package org.openapitools.server.api.verticle
import io.vertx.core.Vertx
import io.vertx.core.AbstractVerticle
import io.vertx.serviceproxy.ServiceBinder

fun main(){
    Vertx.vertx().deployVerticle(ServerAndOrganizationsApiVerticle())
}

class ServerAndOrganizationsApiVerticle:AbstractVerticle() {

    override fun start() {
        val instance = (javaClass.classLoader.loadClass("org.openapitools.server.api.verticle.ServerAndOrganizationsApiImpl").newInstance() as ServerAndOrganizationsApi)
        instance.init(vertx,config())
        ServiceBinder(vertx)
            .setAddress(ServerAndOrganizationsApi.address)
            .register(ServerAndOrganizationsApi::class.java,instance)
    }
}