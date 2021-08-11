package org.openapitools.client.api

import org.openapitools.client.model._
import com.typesafe.config.ConfigFactory

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.core.structure.PopulationBuilder

import java.io.File

import scala.collection.mutable

class MessagesApiSimulation extends Simulation {

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
    val addReactionPerSecond = config.getDouble("performance.operationsPerSecond.addReaction") * rateMultiplier * instanceMultiplier
    val checkMessagesMatchNarrowPerSecond = config.getDouble("performance.operationsPerSecond.checkMessagesMatchNarrow") * rateMultiplier * instanceMultiplier
    val deleteMessagePerSecond = config.getDouble("performance.operationsPerSecond.deleteMessage") * rateMultiplier * instanceMultiplier
    val getFileTemporaryUrlPerSecond = config.getDouble("performance.operationsPerSecond.getFileTemporaryUrl") * rateMultiplier * instanceMultiplier
    val getMessageHistoryPerSecond = config.getDouble("performance.operationsPerSecond.getMessageHistory") * rateMultiplier * instanceMultiplier
    val getMessagesPerSecond = config.getDouble("performance.operationsPerSecond.getMessages") * rateMultiplier * instanceMultiplier
    val getRawMessagePerSecond = config.getDouble("performance.operationsPerSecond.getRawMessage") * rateMultiplier * instanceMultiplier
    val markAllAsReadPerSecond = config.getDouble("performance.operationsPerSecond.markAllAsRead") * rateMultiplier * instanceMultiplier
    val markStreamAsReadPerSecond = config.getDouble("performance.operationsPerSecond.markStreamAsRead") * rateMultiplier * instanceMultiplier
    val markTopicAsReadPerSecond = config.getDouble("performance.operationsPerSecond.markTopicAsRead") * rateMultiplier * instanceMultiplier
    val removeReactionPerSecond = config.getDouble("performance.operationsPerSecond.removeReaction") * rateMultiplier * instanceMultiplier
    val renderMessagePerSecond = config.getDouble("performance.operationsPerSecond.renderMessage") * rateMultiplier * instanceMultiplier
    val sendMessagePerSecond = config.getDouble("performance.operationsPerSecond.sendMessage") * rateMultiplier * instanceMultiplier
    val updateMessagePerSecond = config.getDouble("performance.operationsPerSecond.updateMessage") * rateMultiplier * instanceMultiplier
    val updateMessageFlagsPerSecond = config.getDouble("performance.operationsPerSecond.updateMessageFlags") * rateMultiplier * instanceMultiplier
    val uploadFilePerSecond = config.getDouble("performance.operationsPerSecond.uploadFile") * rateMultiplier * instanceMultiplier

    val scenarioBuilders: mutable.MutableList[PopulationBuilder] = new mutable.MutableList[PopulationBuilder]()

    // Set up CSV feeders
    val add-reactionQUERYFeeder = csv(userDataDirectory + File.separator + "addReaction-queryParams.csv").random
    val add-reactionPATHFeeder = csv(userDataDirectory + File.separator + "addReaction-pathParams.csv").random
    val check-messages-match-narrowQUERYFeeder = csv(userDataDirectory + File.separator + "checkMessagesMatchNarrow-queryParams.csv").random
    val delete-messagePATHFeeder = csv(userDataDirectory + File.separator + "deleteMessage-pathParams.csv").random
    val get-file-temporary-urlPATHFeeder = csv(userDataDirectory + File.separator + "getFileTemporaryUrl-pathParams.csv").random
    val get-message-historyPATHFeeder = csv(userDataDirectory + File.separator + "getMessageHistory-pathParams.csv").random
    val get-messagesQUERYFeeder = csv(userDataDirectory + File.separator + "getMessages-queryParams.csv").random
    val get-raw-messagePATHFeeder = csv(userDataDirectory + File.separator + "getRawMessage-pathParams.csv").random
    val mark-stream-as-readQUERYFeeder = csv(userDataDirectory + File.separator + "markStreamAsRead-queryParams.csv").random
    val mark-topic-as-readQUERYFeeder = csv(userDataDirectory + File.separator + "markTopicAsRead-queryParams.csv").random
    val remove-reactionQUERYFeeder = csv(userDataDirectory + File.separator + "removeReaction-queryParams.csv").random
    val remove-reactionPATHFeeder = csv(userDataDirectory + File.separator + "removeReaction-pathParams.csv").random
    val render-messageQUERYFeeder = csv(userDataDirectory + File.separator + "renderMessage-queryParams.csv").random
    val send-messageQUERYFeeder = csv(userDataDirectory + File.separator + "sendMessage-queryParams.csv").random
    val update-messageQUERYFeeder = csv(userDataDirectory + File.separator + "updateMessage-queryParams.csv").random
    val update-messagePATHFeeder = csv(userDataDirectory + File.separator + "updateMessage-pathParams.csv").random
    val update-message-flagsQUERYFeeder = csv(userDataDirectory + File.separator + "updateMessageFlags-queryParams.csv").random

    // Setup all scenarios

    
    val scnaddReaction = scenario("addReactionSimulation")
        .feed(add-reactionQUERYFeeder)
        .feed(add-reactionPATHFeeder)
        .exec(http("addReaction")
        .httpRequest("POST","/messages/${message_id}/reactions")
        .queryParam("reaction_type","${reaction_type}")
        .queryParam("emoji_name","${emoji_name}")
        .queryParam("emoji_code","${emoji_code}")
)

    // Run scnaddReaction with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnaddReaction.inject(
        rampUsersPerSec(1) to(addReactionPerSecond) during(rampUpSeconds),
        constantUsersPerSec(addReactionPerSecond) during(durationSeconds),
        rampUsersPerSec(addReactionPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scncheckMessagesMatchNarrow = scenario("checkMessagesMatchNarrowSimulation")
        .feed(check-messages-match-narrowQUERYFeeder)
        .exec(http("checkMessagesMatchNarrow")
        .httpRequest("GET","/messages/matches_narrow")
        .queryParam("msg_ids","${msg_ids}")
        .queryParam("narrow","${narrow}")
)

    // Run scncheckMessagesMatchNarrow with warm up and reach a constant rate for entire duration
    scenarioBuilders += scncheckMessagesMatchNarrow.inject(
        rampUsersPerSec(1) to(checkMessagesMatchNarrowPerSecond) during(rampUpSeconds),
        constantUsersPerSec(checkMessagesMatchNarrowPerSecond) during(durationSeconds),
        rampUsersPerSec(checkMessagesMatchNarrowPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scndeleteMessage = scenario("deleteMessageSimulation")
        .feed(delete-messagePATHFeeder)
        .exec(http("deleteMessage")
        .httpRequest("DELETE","/messages/${message_id}")
)

    // Run scndeleteMessage with warm up and reach a constant rate for entire duration
    scenarioBuilders += scndeleteMessage.inject(
        rampUsersPerSec(1) to(deleteMessagePerSecond) during(rampUpSeconds),
        constantUsersPerSec(deleteMessagePerSecond) during(durationSeconds),
        rampUsersPerSec(deleteMessagePerSecond) to(1) during(rampDownSeconds)
    )

    
    val scngetFileTemporaryUrl = scenario("getFileTemporaryUrlSimulation")
        .feed(get-file-temporary-urlPATHFeeder)
        .exec(http("getFileTemporaryUrl")
        .httpRequest("GET","/user_uploads/${realm_id_str}/${filename}")
)

    // Run scngetFileTemporaryUrl with warm up and reach a constant rate for entire duration
    scenarioBuilders += scngetFileTemporaryUrl.inject(
        rampUsersPerSec(1) to(getFileTemporaryUrlPerSecond) during(rampUpSeconds),
        constantUsersPerSec(getFileTemporaryUrlPerSecond) during(durationSeconds),
        rampUsersPerSec(getFileTemporaryUrlPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scngetMessageHistory = scenario("getMessageHistorySimulation")
        .feed(get-message-historyPATHFeeder)
        .exec(http("getMessageHistory")
        .httpRequest("GET","/messages/${message_id}/history")
)

    // Run scngetMessageHistory with warm up and reach a constant rate for entire duration
    scenarioBuilders += scngetMessageHistory.inject(
        rampUsersPerSec(1) to(getMessageHistoryPerSecond) during(rampUpSeconds),
        constantUsersPerSec(getMessageHistoryPerSecond) during(durationSeconds),
        rampUsersPerSec(getMessageHistoryPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scngetMessages = scenario("getMessagesSimulation")
        .feed(get-messagesQUERYFeeder)
        .exec(http("getMessages")
        .httpRequest("GET","/messages")
        .queryParam("client_gravatar","${client_gravatar}")
        .queryParam("anchor","${anchor}")
        .queryParam("num_before","${num_before}")
        .queryParam("num_after","${num_after}")
        .queryParam("narrow","${narrow}")
        .queryParam("apply_markdown","${apply_markdown}")
        .queryParam("use_first_unread_anchor","${use_first_unread_anchor}")
)

    // Run scngetMessages with warm up and reach a constant rate for entire duration
    scenarioBuilders += scngetMessages.inject(
        rampUsersPerSec(1) to(getMessagesPerSecond) during(rampUpSeconds),
        constantUsersPerSec(getMessagesPerSecond) during(durationSeconds),
        rampUsersPerSec(getMessagesPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scngetRawMessage = scenario("getRawMessageSimulation")
        .feed(get-raw-messagePATHFeeder)
        .exec(http("getRawMessage")
        .httpRequest("GET","/messages/${message_id}")
)

    // Run scngetRawMessage with warm up and reach a constant rate for entire duration
    scenarioBuilders += scngetRawMessage.inject(
        rampUsersPerSec(1) to(getRawMessagePerSecond) during(rampUpSeconds),
        constantUsersPerSec(getRawMessagePerSecond) during(durationSeconds),
        rampUsersPerSec(getRawMessagePerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnmarkAllAsRead = scenario("markAllAsReadSimulation")
        .exec(http("markAllAsRead")
        .httpRequest("POST","/mark_all_as_read")
)

    // Run scnmarkAllAsRead with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnmarkAllAsRead.inject(
        rampUsersPerSec(1) to(markAllAsReadPerSecond) during(rampUpSeconds),
        constantUsersPerSec(markAllAsReadPerSecond) during(durationSeconds),
        rampUsersPerSec(markAllAsReadPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnmarkStreamAsRead = scenario("markStreamAsReadSimulation")
        .feed(mark-stream-as-readQUERYFeeder)
        .exec(http("markStreamAsRead")
        .httpRequest("POST","/mark_stream_as_read")
        .queryParam("stream_id","${stream_id}")
)

    // Run scnmarkStreamAsRead with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnmarkStreamAsRead.inject(
        rampUsersPerSec(1) to(markStreamAsReadPerSecond) during(rampUpSeconds),
        constantUsersPerSec(markStreamAsReadPerSecond) during(durationSeconds),
        rampUsersPerSec(markStreamAsReadPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnmarkTopicAsRead = scenario("markTopicAsReadSimulation")
        .feed(mark-topic-as-readQUERYFeeder)
        .exec(http("markTopicAsRead")
        .httpRequest("POST","/mark_topic_as_read")
        .queryParam("stream_id","${stream_id}")
        .queryParam("topic_name","${topic_name}")
)

    // Run scnmarkTopicAsRead with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnmarkTopicAsRead.inject(
        rampUsersPerSec(1) to(markTopicAsReadPerSecond) during(rampUpSeconds),
        constantUsersPerSec(markTopicAsReadPerSecond) during(durationSeconds),
        rampUsersPerSec(markTopicAsReadPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnremoveReaction = scenario("removeReactionSimulation")
        .feed(remove-reactionQUERYFeeder)
        .feed(remove-reactionPATHFeeder)
        .exec(http("removeReaction")
        .httpRequest("DELETE","/messages/${message_id}/reactions")
        .queryParam("reaction_type","${reaction_type}")
        .queryParam("emoji_name","${emoji_name}")
        .queryParam("emoji_code","${emoji_code}")
)

    // Run scnremoveReaction with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnremoveReaction.inject(
        rampUsersPerSec(1) to(removeReactionPerSecond) during(rampUpSeconds),
        constantUsersPerSec(removeReactionPerSecond) during(durationSeconds),
        rampUsersPerSec(removeReactionPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnrenderMessage = scenario("renderMessageSimulation")
        .feed(render-messageQUERYFeeder)
        .exec(http("renderMessage")
        .httpRequest("POST","/messages/render")
        .queryParam("content","${content}")
)

    // Run scnrenderMessage with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnrenderMessage.inject(
        rampUsersPerSec(1) to(renderMessagePerSecond) during(rampUpSeconds),
        constantUsersPerSec(renderMessagePerSecond) during(durationSeconds),
        rampUsersPerSec(renderMessagePerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnsendMessage = scenario("sendMessageSimulation")
        .feed(send-messageQUERYFeeder)
        .exec(http("sendMessage")
        .httpRequest("POST","/messages")
        .queryParam("content","${content}")
        .queryParam("type","${type}")
        .queryParam("to","${to}")
        .queryParam("topic","${topic}")
        .queryParam("queue_id","${queue_id}")
        .queryParam("local_id","${local_id}")
)

    // Run scnsendMessage with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnsendMessage.inject(
        rampUsersPerSec(1) to(sendMessagePerSecond) during(rampUpSeconds),
        constantUsersPerSec(sendMessagePerSecond) during(durationSeconds),
        rampUsersPerSec(sendMessagePerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnupdateMessage = scenario("updateMessageSimulation")
        .feed(update-messageQUERYFeeder)
        .feed(update-messagePATHFeeder)
        .exec(http("updateMessage")
        .httpRequest("PATCH","/messages/${message_id}")
        .queryParam("propagate_mode","${propagate_mode}")
        .queryParam("content","${content}")
        .queryParam("stream_id","${stream_id}")
        .queryParam("topic","${topic}")
        .queryParam("send_notification_to_old_thread","${send_notification_to_old_thread}")
        .queryParam("send_notification_to_new_thread","${send_notification_to_new_thread}")
)

    // Run scnupdateMessage with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnupdateMessage.inject(
        rampUsersPerSec(1) to(updateMessagePerSecond) during(rampUpSeconds),
        constantUsersPerSec(updateMessagePerSecond) during(durationSeconds),
        rampUsersPerSec(updateMessagePerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnupdateMessageFlags = scenario("updateMessageFlagsSimulation")
        .feed(update-message-flagsQUERYFeeder)
        .exec(http("updateMessageFlags")
        .httpRequest("POST","/messages/flags")
        .queryParam("op","${op}")
        .queryParam("messages","${messages}")
        .queryParam("flag","${flag}")
)

    // Run scnupdateMessageFlags with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnupdateMessageFlags.inject(
        rampUsersPerSec(1) to(updateMessageFlagsPerSecond) during(rampUpSeconds),
        constantUsersPerSec(updateMessageFlagsPerSecond) during(durationSeconds),
        rampUsersPerSec(updateMessageFlagsPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnuploadFile = scenario("uploadFileSimulation")
        .exec(http("uploadFile")
        .httpRequest("POST","/user_uploads")
)

    // Run scnuploadFile with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnuploadFile.inject(
        rampUsersPerSec(1) to(uploadFilePerSecond) during(rampUpSeconds),
        constantUsersPerSec(uploadFilePerSecond) during(durationSeconds),
        rampUsersPerSec(uploadFilePerSecond) to(1) during(rampDownSeconds)
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
