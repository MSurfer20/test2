package org.openapitools.client.api

import org.openapitools.client.model._
import com.typesafe.config.ConfigFactory

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.core.structure.PopulationBuilder

import java.io.File

import scala.collection.mutable

class ServerAndOrganizationsApiSimulation extends Simulation {

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
    val addCodePlaygroundPerSecond = config.getDouble("performance.operationsPerSecond.addCodePlayground") * rateMultiplier * instanceMultiplier
    val addLinkifierPerSecond = config.getDouble("performance.operationsPerSecond.addLinkifier") * rateMultiplier * instanceMultiplier
    val createCustomProfileFieldPerSecond = config.getDouble("performance.operationsPerSecond.createCustomProfileField") * rateMultiplier * instanceMultiplier
    val getCustomEmojiPerSecond = config.getDouble("performance.operationsPerSecond.getCustomEmoji") * rateMultiplier * instanceMultiplier
    val getCustomProfileFieldsPerSecond = config.getDouble("performance.operationsPerSecond.getCustomProfileFields") * rateMultiplier * instanceMultiplier
    val getLinkifiersPerSecond = config.getDouble("performance.operationsPerSecond.getLinkifiers") * rateMultiplier * instanceMultiplier
    val getServerSettingsPerSecond = config.getDouble("performance.operationsPerSecond.getServerSettings") * rateMultiplier * instanceMultiplier
    val removeCodePlaygroundPerSecond = config.getDouble("performance.operationsPerSecond.removeCodePlayground") * rateMultiplier * instanceMultiplier
    val removeLinkifierPerSecond = config.getDouble("performance.operationsPerSecond.removeLinkifier") * rateMultiplier * instanceMultiplier
    val reorderCustomProfileFieldsPerSecond = config.getDouble("performance.operationsPerSecond.reorderCustomProfileFields") * rateMultiplier * instanceMultiplier
    val updateLinkifierPerSecond = config.getDouble("performance.operationsPerSecond.updateLinkifier") * rateMultiplier * instanceMultiplier
    val uploadCustomEmojiPerSecond = config.getDouble("performance.operationsPerSecond.uploadCustomEmoji") * rateMultiplier * instanceMultiplier

    val scenarioBuilders: mutable.MutableList[PopulationBuilder] = new mutable.MutableList[PopulationBuilder]()

    // Set up CSV feeders
    val add_code_playgroundQUERYFeeder = csv(userDataDirectory + File.separator + "addCodePlayground-queryParams.csv").random
    val add_linkifierQUERYFeeder = csv(userDataDirectory + File.separator + "addLinkifier-queryParams.csv").random
    val create_custom_profile_fieldQUERYFeeder = csv(userDataDirectory + File.separator + "createCustomProfileField-queryParams.csv").random
    val remove_code_playgroundPATHFeeder = csv(userDataDirectory + File.separator + "removeCodePlayground-pathParams.csv").random
    val remove_linkifierPATHFeeder = csv(userDataDirectory + File.separator + "removeLinkifier-pathParams.csv").random
    val reorder_custom_profile_fieldsQUERYFeeder = csv(userDataDirectory + File.separator + "reorderCustomProfileFields-queryParams.csv").random
    val update_linkifierQUERYFeeder = csv(userDataDirectory + File.separator + "updateLinkifier-queryParams.csv").random
    val update_linkifierPATHFeeder = csv(userDataDirectory + File.separator + "updateLinkifier-pathParams.csv").random
    val upload_custom_emojiPATHFeeder = csv(userDataDirectory + File.separator + "uploadCustomEmoji-pathParams.csv").random

    // Setup all scenarios

    
    val scnaddCodePlayground = scenario("addCodePlaygroundSimulation")
        .feed(add_code_playgroundQUERYFeeder)
        .exec(http("addCodePlayground")
        .httpRequest("POST","/realm/playgrounds")
        .queryParam("pygments_language","${pygments_language}")
        .queryParam("url_prefix","${url_prefix}")
        .queryParam("name","${name}")
)

    // Run scnaddCodePlayground with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnaddCodePlayground.inject(
        rampUsersPerSec(1) to(addCodePlaygroundPerSecond) during(rampUpSeconds),
        constantUsersPerSec(addCodePlaygroundPerSecond) during(durationSeconds),
        rampUsersPerSec(addCodePlaygroundPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnaddLinkifier = scenario("addLinkifierSimulation")
        .feed(add_linkifierQUERYFeeder)
        .exec(http("addLinkifier")
        .httpRequest("POST","/realm/filters")
        .queryParam("pattern","${pattern}")
        .queryParam("url_format_string","${url_format_string}")
)

    // Run scnaddLinkifier with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnaddLinkifier.inject(
        rampUsersPerSec(1) to(addLinkifierPerSecond) during(rampUpSeconds),
        constantUsersPerSec(addLinkifierPerSecond) during(durationSeconds),
        rampUsersPerSec(addLinkifierPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scncreateCustomProfileField = scenario("createCustomProfileFieldSimulation")
        .feed(create_custom_profile_fieldQUERYFeeder)
        .exec(http("createCustomProfileField")
        .httpRequest("POST","/realm/profile_fields")
        .queryParam("field_type","${field_type}")
        .queryParam("field_data","${field_data}")
        .queryParam("name","${name}")
        .queryParam("hint","${hint}")
)

    // Run scncreateCustomProfileField with warm up and reach a constant rate for entire duration
    scenarioBuilders += scncreateCustomProfileField.inject(
        rampUsersPerSec(1) to(createCustomProfileFieldPerSecond) during(rampUpSeconds),
        constantUsersPerSec(createCustomProfileFieldPerSecond) during(durationSeconds),
        rampUsersPerSec(createCustomProfileFieldPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scngetCustomEmoji = scenario("getCustomEmojiSimulation")
        .exec(http("getCustomEmoji")
        .httpRequest("GET","/realm/emoji")
)

    // Run scngetCustomEmoji with warm up and reach a constant rate for entire duration
    scenarioBuilders += scngetCustomEmoji.inject(
        rampUsersPerSec(1) to(getCustomEmojiPerSecond) during(rampUpSeconds),
        constantUsersPerSec(getCustomEmojiPerSecond) during(durationSeconds),
        rampUsersPerSec(getCustomEmojiPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scngetCustomProfileFields = scenario("getCustomProfileFieldsSimulation")
        .exec(http("getCustomProfileFields")
        .httpRequest("GET","/realm/profile_fields")
)

    // Run scngetCustomProfileFields with warm up and reach a constant rate for entire duration
    scenarioBuilders += scngetCustomProfileFields.inject(
        rampUsersPerSec(1) to(getCustomProfileFieldsPerSecond) during(rampUpSeconds),
        constantUsersPerSec(getCustomProfileFieldsPerSecond) during(durationSeconds),
        rampUsersPerSec(getCustomProfileFieldsPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scngetLinkifiers = scenario("getLinkifiersSimulation")
        .exec(http("getLinkifiers")
        .httpRequest("GET","/realm/linkifiers")
)

    // Run scngetLinkifiers with warm up and reach a constant rate for entire duration
    scenarioBuilders += scngetLinkifiers.inject(
        rampUsersPerSec(1) to(getLinkifiersPerSecond) during(rampUpSeconds),
        constantUsersPerSec(getLinkifiersPerSecond) during(durationSeconds),
        rampUsersPerSec(getLinkifiersPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scngetServerSettings = scenario("getServerSettingsSimulation")
        .exec(http("getServerSettings")
        .httpRequest("GET","/server_settings")
)

    // Run scngetServerSettings with warm up and reach a constant rate for entire duration
    scenarioBuilders += scngetServerSettings.inject(
        rampUsersPerSec(1) to(getServerSettingsPerSecond) during(rampUpSeconds),
        constantUsersPerSec(getServerSettingsPerSecond) during(durationSeconds),
        rampUsersPerSec(getServerSettingsPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnremoveCodePlayground = scenario("removeCodePlaygroundSimulation")
        .feed(remove_code_playgroundPATHFeeder)
        .exec(http("removeCodePlayground")
        .httpRequest("DELETE","/realm/playgrounds/${playground_id}")
)

    // Run scnremoveCodePlayground with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnremoveCodePlayground.inject(
        rampUsersPerSec(1) to(removeCodePlaygroundPerSecond) during(rampUpSeconds),
        constantUsersPerSec(removeCodePlaygroundPerSecond) during(durationSeconds),
        rampUsersPerSec(removeCodePlaygroundPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnremoveLinkifier = scenario("removeLinkifierSimulation")
        .feed(remove_linkifierPATHFeeder)
        .exec(http("removeLinkifier")
        .httpRequest("DELETE","/realm/filters/${filter_id}")
)

    // Run scnremoveLinkifier with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnremoveLinkifier.inject(
        rampUsersPerSec(1) to(removeLinkifierPerSecond) during(rampUpSeconds),
        constantUsersPerSec(removeLinkifierPerSecond) during(durationSeconds),
        rampUsersPerSec(removeLinkifierPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnreorderCustomProfileFields = scenario("reorderCustomProfileFieldsSimulation")
        .feed(reorder_custom_profile_fieldsQUERYFeeder)
        .exec(http("reorderCustomProfileFields")
        .httpRequest("PATCH","/realm/profile_fields")
        .queryParam("order","${order}")
)

    // Run scnreorderCustomProfileFields with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnreorderCustomProfileFields.inject(
        rampUsersPerSec(1) to(reorderCustomProfileFieldsPerSecond) during(rampUpSeconds),
        constantUsersPerSec(reorderCustomProfileFieldsPerSecond) during(durationSeconds),
        rampUsersPerSec(reorderCustomProfileFieldsPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnupdateLinkifier = scenario("updateLinkifierSimulation")
        .feed(update_linkifierQUERYFeeder)
        .feed(update_linkifierPATHFeeder)
        .exec(http("updateLinkifier")
        .httpRequest("PATCH","/realm/filters/${filter_id}")
        .queryParam("pattern","${pattern}")
        .queryParam("url_format_string","${url_format_string}")
)

    // Run scnupdateLinkifier with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnupdateLinkifier.inject(
        rampUsersPerSec(1) to(updateLinkifierPerSecond) during(rampUpSeconds),
        constantUsersPerSec(updateLinkifierPerSecond) during(durationSeconds),
        rampUsersPerSec(updateLinkifierPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnuploadCustomEmoji = scenario("uploadCustomEmojiSimulation")
        .feed(upload_custom_emojiPATHFeeder)
        .exec(http("uploadCustomEmoji")
        .httpRequest("POST","/realm/emoji/${emoji_name}")
)

    // Run scnuploadCustomEmoji with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnuploadCustomEmoji.inject(
        rampUsersPerSec(1) to(uploadCustomEmojiPerSecond) during(rampUpSeconds),
        constantUsersPerSec(uploadCustomEmojiPerSecond) during(durationSeconds),
        rampUsersPerSec(uploadCustomEmojiPerSecond) to(1) during(rampDownSeconds)
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
