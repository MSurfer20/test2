package org.openapitools.client.api

import org.openapitools.client.model._
import com.typesafe.config.ConfigFactory

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.core.structure.PopulationBuilder

import java.io.File

import scala.collection.mutable

class RealTimeEventsApiSimulation extends Simulation {

    def getCurrentDirectory = new File("").getAbsolutePath
    def userDataDirectory = getCurrentDirectory + "/src/gatling/resources/data"

    // basic test setup
    val configName = System.getProperty("testConfig", "baseline")
    val config = ConfigFactory.load(configName).withFallback(ConfigFactory.load("default"))
    val durationSeconds = config.getInt("performance.durationSeconds")
    val rampUpSeconds = config.getInt("performance.rampUpSeconds")
    val rampDownSeconds = config.getInt("performance.rampDownSeconds")
    val authentication = config.getString("performance.authorizationHeader")
    val acceptHeader = config.getString("performance.acceptType")
    val contentTypeHeader = config.getString("performance.contentType")
    val rateMultiplier = config.getDouble("performance.rateMultiplier")
    val instanceMultiplier = config.getDouble("performance.instanceMultiplier")

    // global assertion data
    val globalResponseTimeMinLTE = config.getInt("performance.global.assertions.responseTime.min.lte")
    val globalResponseTimeMinGTE = config.getInt("performance.global.assertions.responseTime.min.gte")
    val globalResponseTimeMaxLTE = config.getInt("performance.global.assertions.responseTime.max.lte")
    val globalResponseTimeMaxGTE = config.getInt("performance.global.assertions.responseTime.max.gte")
    val globalResponseTimeMeanLTE = config.getInt("performance.global.assertions.responseTime.mean.lte")
    val globalResponseTimeMeanGTE = config.getInt("performance.global.assertions.responseTime.mean.gte")
    val globalResponseTimeFailedRequestsPercentLTE = config.getDouble("performance.global.assertions.failedRequests.percent.lte")
    val globalResponseTimeFailedRequestsPercentGTE = config.getDouble("performance.global.assertions.failedRequests.percent.gte")
    val globalResponseTimeSuccessfulRequestsPercentLTE = config.getDouble("performance.global.assertions.successfulRequests.percent.lte")
    val globalResponseTimeSuccessfulRequestsPercentGTE = config.getDouble("performance.global.assertions.successfulRequests.percent.gte")

// Setup http protocol configuration
    val httpConf = http
        .baseURL("https://example.zulipchat.com/api/v1")
        .doNotTrackHeader("1")
        .acceptLanguageHeader("en-US,en;q=0.5")
        .acceptEncodingHeader("gzip, deflate")
        .userAgentHeader("Mozilla/5.0 (Windows NT 5.1; rv:31.0) Gecko/20100101 Firefox/31.0")
        .acceptHeader(acceptHeader)
        .contentTypeHeader(contentTypeHeader)

    // set authorization header if it has been modified from config
    if(!authentication.equals("~MANUAL_ENTRY")){
        httpConf.authorizationHeader(authentication)
    }

    // Setup all the operations per second for the test to ultimately be generated from configs
    val deleteQueuePerSecond = config.getDouble("performance.operationsPerSecond.deleteQueue") * rateMultiplier * instanceMultiplier
    val getEventsPerSecond = config.getDouble("performance.operationsPerSecond.getEvents") * rateMultiplier * instanceMultiplier
    val realTimePostPerSecond = config.getDouble("performance.operationsPerSecond.realTimePost") * rateMultiplier * instanceMultiplier
    val registerQueuePerSecond = config.getDouble("performance.operationsPerSecond.registerQueue") * rateMultiplier * instanceMultiplier
    val restErrorHandlingPerSecond = config.getDouble("performance.operationsPerSecond.restErrorHandling") * rateMultiplier * instanceMultiplier

    val scenarioBuilders: mutable.MutableList[PopulationBuilder] = new mutable.MutableList[PopulationBuilder]()

    // Set up CSV feeders
    val delete-queueQUERYFeeder = csv(userDataDirectory + File.separator + "deleteQueue-queryParams.csv").random
    val get-eventsQUERYFeeder = csv(userDataDirectory + File.separator + "getEvents-queryParams.csv").random
    val nullQUERYFeeder = csv(userDataDirectory + File.separator + "realTimePost-queryParams.csv").random
    val register-queueQUERYFeeder = csv(userDataDirectory + File.separator + "registerQueue-queryParams.csv").random

    // Setup all scenarios

    
    val scndeleteQueue = scenario("deleteQueueSimulation")
        .feed(delete-queueQUERYFeeder)
        .exec(http("deleteQueue")
        .httpRequest("DELETE","/events")
        .queryParam("queue_id","${queue_id}")
)

    // Run scndeleteQueue with warm up and reach a constant rate for entire duration
    scenarioBuilders += scndeleteQueue.inject(
        rampUsersPerSec(1) to(deleteQueuePerSecond) during(rampUpSeconds),
        constantUsersPerSec(deleteQueuePerSecond) during(durationSeconds),
        rampUsersPerSec(deleteQueuePerSecond) to(1) during(rampDownSeconds)
    )

    
    val scngetEvents = scenario("getEventsSimulation")
        .feed(get-eventsQUERYFeeder)
        .exec(http("getEvents")
        .httpRequest("GET","/events")
        .queryParam("last_event_id","${last_event_id}")
        .queryParam("dont_block","${dont_block}")
        .queryParam("queue_id","${queue_id}")
)

    // Run scngetEvents with warm up and reach a constant rate for entire duration
    scenarioBuilders += scngetEvents.inject(
        rampUsersPerSec(1) to(getEventsPerSecond) during(rampUpSeconds),
        constantUsersPerSec(getEventsPerSecond) during(durationSeconds),
        rampUsersPerSec(getEventsPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnrealTimePost = scenario("realTimePostSimulation")
        .feed(nullQUERYFeeder)
        .exec(http("realTimePost")
        .httpRequest("POST","/real-time")
        .queryParam("event_types","${event_types}")
        .queryParam("all_public_streams","${all_public_streams}")
        .queryParam("narrow","${narrow}")
)

    // Run scnrealTimePost with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnrealTimePost.inject(
        rampUsersPerSec(1) to(realTimePostPerSecond) during(rampUpSeconds),
        constantUsersPerSec(realTimePostPerSecond) during(durationSeconds),
        rampUsersPerSec(realTimePostPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnregisterQueue = scenario("registerQueueSimulation")
        .feed(register-queueQUERYFeeder)
        .exec(http("registerQueue")
        .httpRequest("POST","/register")
        .queryParam("client_gravatar","${client_gravatar}")
        .queryParam("slim_presence","${slim_presence}")
        .queryParam("event_types","${event_types}")
        .queryParam("client_capabilities","${client_capabilities}")
        .queryParam("include_subscribers","${include_subscribers}")
        .queryParam("all_public_streams","${all_public_streams}")
        .queryParam("narrow","${narrow}")
        .queryParam("fetch_event_types","${fetch_event_types}")
        .queryParam("apply_markdown","${apply_markdown}")
)

    // Run scnregisterQueue with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnregisterQueue.inject(
        rampUsersPerSec(1) to(registerQueuePerSecond) during(rampUpSeconds),
        constantUsersPerSec(registerQueuePerSecond) during(durationSeconds),
        rampUsersPerSec(registerQueuePerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnrestErrorHandling = scenario("restErrorHandlingSimulation")
        .exec(http("restErrorHandling")
        .httpRequest("POST","/rest-error-handling")
)

    // Run scnrestErrorHandling with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnrestErrorHandling.inject(
        rampUsersPerSec(1) to(restErrorHandlingPerSecond) during(rampUpSeconds),
        constantUsersPerSec(restErrorHandlingPerSecond) during(durationSeconds),
        rampUsersPerSec(restErrorHandlingPerSecond) to(1) during(rampDownSeconds)
    )

    setUp(
        scenarioBuilders.toList
    ).protocols(httpConf).assertions(
        global.responseTime.min.lte(globalResponseTimeMinLTE),
        global.responseTime.min.gte(globalResponseTimeMinGTE),
        global.responseTime.max.lte(globalResponseTimeMaxLTE),
        global.responseTime.max.gte(globalResponseTimeMaxGTE),
        global.responseTime.mean.lte(globalResponseTimeMeanLTE),
        global.responseTime.mean.gte(globalResponseTimeMeanGTE),
        global.failedRequests.percent.lte(globalResponseTimeFailedRequestsPercentLTE),
        global.failedRequests.percent.gte(globalResponseTimeFailedRequestsPercentGTE),
        global.successfulRequests.percent.lte(globalResponseTimeSuccessfulRequestsPercentLTE),
        global.successfulRequests.percent.gte(globalResponseTimeSuccessfulRequestsPercentGTE)
    )
}
