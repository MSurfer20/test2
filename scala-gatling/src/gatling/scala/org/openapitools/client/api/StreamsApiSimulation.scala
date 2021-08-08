package org.openapitools.client.api

import org.openapitools.client.model._
import com.typesafe.config.ConfigFactory

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.core.structure.PopulationBuilder

import java.io.File

import scala.collection.mutable

class StreamsApiSimulation extends Simulation {

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
    val archiveStreamPerSecond = config.getDouble("performance.operationsPerSecond.archiveStream") * rateMultiplier * instanceMultiplier
    val createBigBlueButtonVideoCallPerSecond = config.getDouble("performance.operationsPerSecond.createBigBlueButtonVideoCall") * rateMultiplier * instanceMultiplier
    val getStreamIdPerSecond = config.getDouble("performance.operationsPerSecond.getStreamId") * rateMultiplier * instanceMultiplier
    val getStreamTopicsPerSecond = config.getDouble("performance.operationsPerSecond.getStreamTopics") * rateMultiplier * instanceMultiplier
    val getStreamsPerSecond = config.getDouble("performance.operationsPerSecond.getStreams") * rateMultiplier * instanceMultiplier
    val getSubscriptionStatusPerSecond = config.getDouble("performance.operationsPerSecond.getSubscriptionStatus") * rateMultiplier * instanceMultiplier
    val getSubscriptionsPerSecond = config.getDouble("performance.operationsPerSecond.getSubscriptions") * rateMultiplier * instanceMultiplier
    val muteTopicPerSecond = config.getDouble("performance.operationsPerSecond.muteTopic") * rateMultiplier * instanceMultiplier
    val subscribePerSecond = config.getDouble("performance.operationsPerSecond.subscribe") * rateMultiplier * instanceMultiplier
    val unsubscribePerSecond = config.getDouble("performance.operationsPerSecond.unsubscribe") * rateMultiplier * instanceMultiplier
    val updateStreamPerSecond = config.getDouble("performance.operationsPerSecond.updateStream") * rateMultiplier * instanceMultiplier
    val updateSubscriptionSettingsPerSecond = config.getDouble("performance.operationsPerSecond.updateSubscriptionSettings") * rateMultiplier * instanceMultiplier
    val updateSubscriptionsPerSecond = config.getDouble("performance.operationsPerSecond.updateSubscriptions") * rateMultiplier * instanceMultiplier

    val scenarioBuilders: mutable.MutableList[PopulationBuilder] = new mutable.MutableList[PopulationBuilder]()

    // Set up CSV feeders
    val archive_streamPATHFeeder = csv(userDataDirectory + File.separator + "archiveStream-pathParams.csv").random
    val get_stream_idQUERYFeeder = csv(userDataDirectory + File.separator + "getStreamId-queryParams.csv").random
    val get_stream_topicsPATHFeeder = csv(userDataDirectory + File.separator + "getStreamTopics-pathParams.csv").random
    val get_streamsQUERYFeeder = csv(userDataDirectory + File.separator + "getStreams-queryParams.csv").random
    val get_subscription_statusPATHFeeder = csv(userDataDirectory + File.separator + "getSubscriptionStatus-pathParams.csv").random
    val get_subscriptionsQUERYFeeder = csv(userDataDirectory + File.separator + "getSubscriptions-queryParams.csv").random
    val mute_topicQUERYFeeder = csv(userDataDirectory + File.separator + "muteTopic-queryParams.csv").random
    val subscribeQUERYFeeder = csv(userDataDirectory + File.separator + "subscribe-queryParams.csv").random
    val unsubscribeQUERYFeeder = csv(userDataDirectory + File.separator + "unsubscribe-queryParams.csv").random
    val update_streamQUERYFeeder = csv(userDataDirectory + File.separator + "updateStream-queryParams.csv").random
    val update_streamPATHFeeder = csv(userDataDirectory + File.separator + "updateStream-pathParams.csv").random
    val update_subscription_settingsQUERYFeeder = csv(userDataDirectory + File.separator + "updateSubscriptionSettings-queryParams.csv").random
    val update_subscriptionsQUERYFeeder = csv(userDataDirectory + File.separator + "updateSubscriptions-queryParams.csv").random

    // Setup all scenarios

    
    val scnarchiveStream = scenario("archiveStreamSimulation")
        .feed(archive_streamPATHFeeder)
        .exec(http("archiveStream")
        .httpRequest("DELETE","/streams/${stream_id}")
)

    // Run scnarchiveStream with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnarchiveStream.inject(
        rampUsersPerSec(1) to(archiveStreamPerSecond) during(rampUpSeconds),
        constantUsersPerSec(archiveStreamPerSecond) during(durationSeconds),
        rampUsersPerSec(archiveStreamPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scncreateBigBlueButtonVideoCall = scenario("createBigBlueButtonVideoCallSimulation")
        .exec(http("createBigBlueButtonVideoCall")
        .httpRequest("GET","/calls/bigbluebutton/create")
)

    // Run scncreateBigBlueButtonVideoCall with warm up and reach a constant rate for entire duration
    scenarioBuilders += scncreateBigBlueButtonVideoCall.inject(
        rampUsersPerSec(1) to(createBigBlueButtonVideoCallPerSecond) during(rampUpSeconds),
        constantUsersPerSec(createBigBlueButtonVideoCallPerSecond) during(durationSeconds),
        rampUsersPerSec(createBigBlueButtonVideoCallPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scngetStreamId = scenario("getStreamIdSimulation")
        .feed(get_stream_idQUERYFeeder)
        .exec(http("getStreamId")
        .httpRequest("GET","/get_stream_id")
        .queryParam("stream","${stream}")
)

    // Run scngetStreamId with warm up and reach a constant rate for entire duration
    scenarioBuilders += scngetStreamId.inject(
        rampUsersPerSec(1) to(getStreamIdPerSecond) during(rampUpSeconds),
        constantUsersPerSec(getStreamIdPerSecond) during(durationSeconds),
        rampUsersPerSec(getStreamIdPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scngetStreamTopics = scenario("getStreamTopicsSimulation")
        .feed(get_stream_topicsPATHFeeder)
        .exec(http("getStreamTopics")
        .httpRequest("GET","/users/me/${stream_id}/topics")
)

    // Run scngetStreamTopics with warm up and reach a constant rate for entire duration
    scenarioBuilders += scngetStreamTopics.inject(
        rampUsersPerSec(1) to(getStreamTopicsPerSecond) during(rampUpSeconds),
        constantUsersPerSec(getStreamTopicsPerSecond) during(durationSeconds),
        rampUsersPerSec(getStreamTopicsPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scngetStreams = scenario("getStreamsSimulation")
        .feed(get_streamsQUERYFeeder)
        .exec(http("getStreams")
        .httpRequest("GET","/streams")
        .queryParam("include_web_public","${include_web_public}")
        .queryParam("include_default","${include_default}")
        .queryParam("include_subscribed","${include_subscribed}")
        .queryParam("include_all_active","${include_all_active}")
        .queryParam("include_owner_subscribed","${include_owner_subscribed}")
        .queryParam("include_public","${include_public}")
)

    // Run scngetStreams with warm up and reach a constant rate for entire duration
    scenarioBuilders += scngetStreams.inject(
        rampUsersPerSec(1) to(getStreamsPerSecond) during(rampUpSeconds),
        constantUsersPerSec(getStreamsPerSecond) during(durationSeconds),
        rampUsersPerSec(getStreamsPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scngetSubscriptionStatus = scenario("getSubscriptionStatusSimulation")
        .feed(get_subscription_statusPATHFeeder)
        .exec(http("getSubscriptionStatus")
        .httpRequest("GET","/users/${user_id}/subscriptions/${stream_id}")
)

    // Run scngetSubscriptionStatus with warm up and reach a constant rate for entire duration
    scenarioBuilders += scngetSubscriptionStatus.inject(
        rampUsersPerSec(1) to(getSubscriptionStatusPerSecond) during(rampUpSeconds),
        constantUsersPerSec(getSubscriptionStatusPerSecond) during(durationSeconds),
        rampUsersPerSec(getSubscriptionStatusPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scngetSubscriptions = scenario("getSubscriptionsSimulation")
        .feed(get_subscriptionsQUERYFeeder)
        .exec(http("getSubscriptions")
        .httpRequest("GET","/users/me/subscriptions")
        .queryParam("include_subscribers","${include_subscribers}")
)

    // Run scngetSubscriptions with warm up and reach a constant rate for entire duration
    scenarioBuilders += scngetSubscriptions.inject(
        rampUsersPerSec(1) to(getSubscriptionsPerSecond) during(rampUpSeconds),
        constantUsersPerSec(getSubscriptionsPerSecond) during(durationSeconds),
        rampUsersPerSec(getSubscriptionsPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnmuteTopic = scenario("muteTopicSimulation")
        .feed(mute_topicQUERYFeeder)
        .exec(http("muteTopic")
        .httpRequest("PATCH","/users/me/subscriptions/muted_topics")
        .queryParam("topic","${topic}")
        .queryParam("stream_id","${stream_id}")
        .queryParam("stream","${stream}")
        .queryParam("op","${op}")
)

    // Run scnmuteTopic with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnmuteTopic.inject(
        rampUsersPerSec(1) to(muteTopicPerSecond) during(rampUpSeconds),
        constantUsersPerSec(muteTopicPerSecond) during(durationSeconds),
        rampUsersPerSec(muteTopicPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnsubscribe = scenario("subscribeSimulation")
        .feed(subscribeQUERYFeeder)
        .exec(http("subscribe")
        .httpRequest("POST","/users/me/subscriptions")
        .queryParam("announce","${announce}")
        .queryParam("history_public_to_subscribers","${history_public_to_subscribers}")
        .queryParam("message_retention_days","${message_retention_days}")
        .queryParam("subscriptions","${subscriptions}")
        .queryParam("invite_only","${invite_only}")
        .queryParam("principals","${principals}")
        .queryParam("stream_post_policy","${stream_post_policy}")
        .queryParam("authorization_errors_fatal","${authorization_errors_fatal}")
)

    // Run scnsubscribe with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnsubscribe.inject(
        rampUsersPerSec(1) to(subscribePerSecond) during(rampUpSeconds),
        constantUsersPerSec(subscribePerSecond) during(durationSeconds),
        rampUsersPerSec(subscribePerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnunsubscribe = scenario("unsubscribeSimulation")
        .feed(unsubscribeQUERYFeeder)
        .exec(http("unsubscribe")
        .httpRequest("DELETE","/users/me/subscriptions")
        .queryParam("principals","${principals}")
        .queryParam("subscriptions","${subscriptions}")
)

    // Run scnunsubscribe with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnunsubscribe.inject(
        rampUsersPerSec(1) to(unsubscribePerSecond) during(rampUpSeconds),
        constantUsersPerSec(unsubscribePerSecond) during(durationSeconds),
        rampUsersPerSec(unsubscribePerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnupdateStream = scenario("updateStreamSimulation")
        .feed(update_streamQUERYFeeder)
        .feed(update_streamPATHFeeder)
        .exec(http("updateStream")
        .httpRequest("PATCH","/streams/${stream_id}")
        .queryParam("history_public_to_subscribers","${history_public_to_subscribers}")
        .queryParam("message_retention_days","${message_retention_days}")
        .queryParam("is_announcement_only","${is_announcement_only}")
        .queryParam("new_name","${new_name}")
        .queryParam("stream_post_policy","${stream_post_policy}")
        .queryParam("description","${description}")
        .queryParam("is_private","${is_private}")
)

    // Run scnupdateStream with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnupdateStream.inject(
        rampUsersPerSec(1) to(updateStreamPerSecond) during(rampUpSeconds),
        constantUsersPerSec(updateStreamPerSecond) during(durationSeconds),
        rampUsersPerSec(updateStreamPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnupdateSubscriptionSettings = scenario("updateSubscriptionSettingsSimulation")
        .feed(update_subscription_settingsQUERYFeeder)
        .exec(http("updateSubscriptionSettings")
        .httpRequest("POST","/users/me/subscriptions/properties")
        .queryParam("subscription_data","${subscription_data}")
)

    // Run scnupdateSubscriptionSettings with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnupdateSubscriptionSettings.inject(
        rampUsersPerSec(1) to(updateSubscriptionSettingsPerSecond) during(rampUpSeconds),
        constantUsersPerSec(updateSubscriptionSettingsPerSecond) during(durationSeconds),
        rampUsersPerSec(updateSubscriptionSettingsPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnupdateSubscriptions = scenario("updateSubscriptionsSimulation")
        .feed(update_subscriptionsQUERYFeeder)
        .exec(http("updateSubscriptions")
        .httpRequest("PATCH","/users/me/subscriptions")
        .queryParam("add","${add}")
        .queryParam("delete","${delete}")
)

    // Run scnupdateSubscriptions with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnupdateSubscriptions.inject(
        rampUsersPerSec(1) to(updateSubscriptionsPerSecond) during(rampUpSeconds),
        constantUsersPerSec(updateSubscriptionsPerSecond) during(durationSeconds),
        rampUsersPerSec(updateSubscriptionsPerSecond) to(1) during(rampDownSeconds)
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
