package org.openapitools.client.api

import org.openapitools.client.model._
import com.typesafe.config.ConfigFactory

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.core.structure.PopulationBuilder

import java.io.File

import scala.collection.mutable

class UsersApiSimulation extends Simulation {

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
    val createUserPerSecond = config.getDouble("performance.operationsPerSecond.createUser") * rateMultiplier * instanceMultiplier
    val createUserGroupPerSecond = config.getDouble("performance.operationsPerSecond.createUserGroup") * rateMultiplier * instanceMultiplier
    val deactivateOwnUserPerSecond = config.getDouble("performance.operationsPerSecond.deactivateOwnUser") * rateMultiplier * instanceMultiplier
    val deactivateUserPerSecond = config.getDouble("performance.operationsPerSecond.deactivateUser") * rateMultiplier * instanceMultiplier
    val getAttachmentsPerSecond = config.getDouble("performance.operationsPerSecond.getAttachments") * rateMultiplier * instanceMultiplier
    val getOwnUserPerSecond = config.getDouble("performance.operationsPerSecond.getOwnUser") * rateMultiplier * instanceMultiplier
    val getUserPerSecond = config.getDouble("performance.operationsPerSecond.getUser") * rateMultiplier * instanceMultiplier
    val getUserByEmailPerSecond = config.getDouble("performance.operationsPerSecond.getUserByEmail") * rateMultiplier * instanceMultiplier
    val getUserGroupsPerSecond = config.getDouble("performance.operationsPerSecond.getUserGroups") * rateMultiplier * instanceMultiplier
    val getUserPresencePerSecond = config.getDouble("performance.operationsPerSecond.getUserPresence") * rateMultiplier * instanceMultiplier
    val getUsersPerSecond = config.getDouble("performance.operationsPerSecond.getUsers") * rateMultiplier * instanceMultiplier
    val muteUserPerSecond = config.getDouble("performance.operationsPerSecond.muteUser") * rateMultiplier * instanceMultiplier
    val reactivateUserPerSecond = config.getDouble("performance.operationsPerSecond.reactivateUser") * rateMultiplier * instanceMultiplier
    val removeUserGroupPerSecond = config.getDouble("performance.operationsPerSecond.removeUserGroup") * rateMultiplier * instanceMultiplier
    val setTypingStatusPerSecond = config.getDouble("performance.operationsPerSecond.setTypingStatus") * rateMultiplier * instanceMultiplier
    val unmuteUserPerSecond = config.getDouble("performance.operationsPerSecond.unmuteUser") * rateMultiplier * instanceMultiplier
    val updateSettingsPerSecond = config.getDouble("performance.operationsPerSecond.updateSettings") * rateMultiplier * instanceMultiplier
    val updateStatusPerSecond = config.getDouble("performance.operationsPerSecond.updateStatus") * rateMultiplier * instanceMultiplier
    val updateUserPerSecond = config.getDouble("performance.operationsPerSecond.updateUser") * rateMultiplier * instanceMultiplier
    val updateUserGroupPerSecond = config.getDouble("performance.operationsPerSecond.updateUserGroup") * rateMultiplier * instanceMultiplier
    val updateUserGroupMembersPerSecond = config.getDouble("performance.operationsPerSecond.updateUserGroupMembers") * rateMultiplier * instanceMultiplier

    val scenarioBuilders: mutable.MutableList[PopulationBuilder] = new mutable.MutableList[PopulationBuilder]()

    // Set up CSV feeders
    val create-userQUERYFeeder = csv(userDataDirectory + File.separator + "createUser-queryParams.csv").random
    val create-user-groupQUERYFeeder = csv(userDataDirectory + File.separator + "createUserGroup-queryParams.csv").random
    val deactivate-userPATHFeeder = csv(userDataDirectory + File.separator + "deactivateUser-pathParams.csv").random
    val get-userQUERYFeeder = csv(userDataDirectory + File.separator + "getUser-queryParams.csv").random
    val get-userPATHFeeder = csv(userDataDirectory + File.separator + "getUser-pathParams.csv").random
    val get-user-by-emailQUERYFeeder = csv(userDataDirectory + File.separator + "getUserByEmail-queryParams.csv").random
    val get-user-by-emailPATHFeeder = csv(userDataDirectory + File.separator + "getUserByEmail-pathParams.csv").random
    val get-user-presencePATHFeeder = csv(userDataDirectory + File.separator + "getUserPresence-pathParams.csv").random
    val get-usersQUERYFeeder = csv(userDataDirectory + File.separator + "getUsers-queryParams.csv").random
    val mute-userPATHFeeder = csv(userDataDirectory + File.separator + "muteUser-pathParams.csv").random
    val reactivate-userPATHFeeder = csv(userDataDirectory + File.separator + "reactivateUser-pathParams.csv").random
    val remove-user-groupPATHFeeder = csv(userDataDirectory + File.separator + "removeUserGroup-pathParams.csv").random
    val set-typing-statusQUERYFeeder = csv(userDataDirectory + File.separator + "setTypingStatus-queryParams.csv").random
    val unmute-userPATHFeeder = csv(userDataDirectory + File.separator + "unmuteUser-pathParams.csv").random
    val update-settingsQUERYFeeder = csv(userDataDirectory + File.separator + "updateSettings-queryParams.csv").random
    val update-statusQUERYFeeder = csv(userDataDirectory + File.separator + "updateStatus-queryParams.csv").random
    val update-userQUERYFeeder = csv(userDataDirectory + File.separator + "updateUser-queryParams.csv").random
    val update-userPATHFeeder = csv(userDataDirectory + File.separator + "updateUser-pathParams.csv").random
    val update-user-groupQUERYFeeder = csv(userDataDirectory + File.separator + "updateUserGroup-queryParams.csv").random
    val update-user-groupPATHFeeder = csv(userDataDirectory + File.separator + "updateUserGroup-pathParams.csv").random
    val update-user-group-membersQUERYFeeder = csv(userDataDirectory + File.separator + "updateUserGroupMembers-queryParams.csv").random
    val update-user-group-membersPATHFeeder = csv(userDataDirectory + File.separator + "updateUserGroupMembers-pathParams.csv").random

    // Setup all scenarios

    
    val scncreateUser = scenario("createUserSimulation")
        .feed(create-userQUERYFeeder)
        .exec(http("createUser")
        .httpRequest("POST","/users")
        .queryParam("email","${email}")
        .queryParam("full_name","${full_name}")
        .queryParam("password","${password}")
)

    // Run scncreateUser with warm up and reach a constant rate for entire duration
    scenarioBuilders += scncreateUser.inject(
        rampUsersPerSec(1) to(createUserPerSecond) during(rampUpSeconds),
        constantUsersPerSec(createUserPerSecond) during(durationSeconds),
        rampUsersPerSec(createUserPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scncreateUserGroup = scenario("createUserGroupSimulation")
        .feed(create-user-groupQUERYFeeder)
        .exec(http("createUserGroup")
        .httpRequest("POST","/user_groups/create")
        .queryParam("name","${name}")
        .queryParam("members","${members}")
        .queryParam("description","${description}")
)

    // Run scncreateUserGroup with warm up and reach a constant rate for entire duration
    scenarioBuilders += scncreateUserGroup.inject(
        rampUsersPerSec(1) to(createUserGroupPerSecond) during(rampUpSeconds),
        constantUsersPerSec(createUserGroupPerSecond) during(durationSeconds),
        rampUsersPerSec(createUserGroupPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scndeactivateOwnUser = scenario("deactivateOwnUserSimulation")
        .exec(http("deactivateOwnUser")
        .httpRequest("DELETE","/users/me")
)

    // Run scndeactivateOwnUser with warm up and reach a constant rate for entire duration
    scenarioBuilders += scndeactivateOwnUser.inject(
        rampUsersPerSec(1) to(deactivateOwnUserPerSecond) during(rampUpSeconds),
        constantUsersPerSec(deactivateOwnUserPerSecond) during(durationSeconds),
        rampUsersPerSec(deactivateOwnUserPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scndeactivateUser = scenario("deactivateUserSimulation")
        .feed(deactivate-userPATHFeeder)
        .exec(http("deactivateUser")
        .httpRequest("DELETE","/users/${user_id}")
)

    // Run scndeactivateUser with warm up and reach a constant rate for entire duration
    scenarioBuilders += scndeactivateUser.inject(
        rampUsersPerSec(1) to(deactivateUserPerSecond) during(rampUpSeconds),
        constantUsersPerSec(deactivateUserPerSecond) during(durationSeconds),
        rampUsersPerSec(deactivateUserPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scngetAttachments = scenario("getAttachmentsSimulation")
        .exec(http("getAttachments")
        .httpRequest("GET","/attachments")
)

    // Run scngetAttachments with warm up and reach a constant rate for entire duration
    scenarioBuilders += scngetAttachments.inject(
        rampUsersPerSec(1) to(getAttachmentsPerSecond) during(rampUpSeconds),
        constantUsersPerSec(getAttachmentsPerSecond) during(durationSeconds),
        rampUsersPerSec(getAttachmentsPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scngetOwnUser = scenario("getOwnUserSimulation")
        .exec(http("getOwnUser")
        .httpRequest("GET","/users/me")
)

    // Run scngetOwnUser with warm up and reach a constant rate for entire duration
    scenarioBuilders += scngetOwnUser.inject(
        rampUsersPerSec(1) to(getOwnUserPerSecond) during(rampUpSeconds),
        constantUsersPerSec(getOwnUserPerSecond) during(durationSeconds),
        rampUsersPerSec(getOwnUserPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scngetUser = scenario("getUserSimulation")
        .feed(get-userQUERYFeeder)
        .feed(get-userPATHFeeder)
        .exec(http("getUser")
        .httpRequest("GET","/users/${user_id}")
        .queryParam("client_gravatar","${client_gravatar}")
        .queryParam("include_custom_profile_fields","${include_custom_profile_fields}")
)

    // Run scngetUser with warm up and reach a constant rate for entire duration
    scenarioBuilders += scngetUser.inject(
        rampUsersPerSec(1) to(getUserPerSecond) during(rampUpSeconds),
        constantUsersPerSec(getUserPerSecond) during(durationSeconds),
        rampUsersPerSec(getUserPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scngetUserByEmail = scenario("getUserByEmailSimulation")
        .feed(get-user-by-emailQUERYFeeder)
        .feed(get-user-by-emailPATHFeeder)
        .exec(http("getUserByEmail")
        .httpRequest("GET","/users/${email}")
        .queryParam("client_gravatar","${client_gravatar}")
        .queryParam("include_custom_profile_fields","${include_custom_profile_fields}")
)

    // Run scngetUserByEmail with warm up and reach a constant rate for entire duration
    scenarioBuilders += scngetUserByEmail.inject(
        rampUsersPerSec(1) to(getUserByEmailPerSecond) during(rampUpSeconds),
        constantUsersPerSec(getUserByEmailPerSecond) during(durationSeconds),
        rampUsersPerSec(getUserByEmailPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scngetUserGroups = scenario("getUserGroupsSimulation")
        .exec(http("getUserGroups")
        .httpRequest("GET","/user_groups")
)

    // Run scngetUserGroups with warm up and reach a constant rate for entire duration
    scenarioBuilders += scngetUserGroups.inject(
        rampUsersPerSec(1) to(getUserGroupsPerSecond) during(rampUpSeconds),
        constantUsersPerSec(getUserGroupsPerSecond) during(durationSeconds),
        rampUsersPerSec(getUserGroupsPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scngetUserPresence = scenario("getUserPresenceSimulation")
        .feed(get-user-presencePATHFeeder)
        .exec(http("getUserPresence")
        .httpRequest("GET","/users/${user_id_or_email}/presence")
)

    // Run scngetUserPresence with warm up and reach a constant rate for entire duration
    scenarioBuilders += scngetUserPresence.inject(
        rampUsersPerSec(1) to(getUserPresencePerSecond) during(rampUpSeconds),
        constantUsersPerSec(getUserPresencePerSecond) during(durationSeconds),
        rampUsersPerSec(getUserPresencePerSecond) to(1) during(rampDownSeconds)
    )

    
    val scngetUsers = scenario("getUsersSimulation")
        .feed(get-usersQUERYFeeder)
        .exec(http("getUsers")
        .httpRequest("GET","/users")
        .queryParam("client_gravatar","${client_gravatar}")
        .queryParam("include_custom_profile_fields","${include_custom_profile_fields}")
)

    // Run scngetUsers with warm up and reach a constant rate for entire duration
    scenarioBuilders += scngetUsers.inject(
        rampUsersPerSec(1) to(getUsersPerSecond) during(rampUpSeconds),
        constantUsersPerSec(getUsersPerSecond) during(durationSeconds),
        rampUsersPerSec(getUsersPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnmuteUser = scenario("muteUserSimulation")
        .feed(mute-userPATHFeeder)
        .exec(http("muteUser")
        .httpRequest("POST","/users/me/muted_users/${muted_user_id}")
)

    // Run scnmuteUser with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnmuteUser.inject(
        rampUsersPerSec(1) to(muteUserPerSecond) during(rampUpSeconds),
        constantUsersPerSec(muteUserPerSecond) during(durationSeconds),
        rampUsersPerSec(muteUserPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnreactivateUser = scenario("reactivateUserSimulation")
        .feed(reactivate-userPATHFeeder)
        .exec(http("reactivateUser")
        .httpRequest("POST","/users/${user_id}/reactivate")
)

    // Run scnreactivateUser with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnreactivateUser.inject(
        rampUsersPerSec(1) to(reactivateUserPerSecond) during(rampUpSeconds),
        constantUsersPerSec(reactivateUserPerSecond) during(durationSeconds),
        rampUsersPerSec(reactivateUserPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnremoveUserGroup = scenario("removeUserGroupSimulation")
        .feed(remove-user-groupPATHFeeder)
        .exec(http("removeUserGroup")
        .httpRequest("DELETE","/user_groups/${user_group_id}")
)

    // Run scnremoveUserGroup with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnremoveUserGroup.inject(
        rampUsersPerSec(1) to(removeUserGroupPerSecond) during(rampUpSeconds),
        constantUsersPerSec(removeUserGroupPerSecond) during(durationSeconds),
        rampUsersPerSec(removeUserGroupPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnsetTypingStatus = scenario("setTypingStatusSimulation")
        .feed(set-typing-statusQUERYFeeder)
        .exec(http("setTypingStatus")
        .httpRequest("POST","/typing")
        .queryParam("type","${type}")
        .queryParam("op","${op}")
        .queryParam("topic","${topic}")
        .queryParam("to","${to}")
)

    // Run scnsetTypingStatus with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnsetTypingStatus.inject(
        rampUsersPerSec(1) to(setTypingStatusPerSecond) during(rampUpSeconds),
        constantUsersPerSec(setTypingStatusPerSecond) during(durationSeconds),
        rampUsersPerSec(setTypingStatusPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnunmuteUser = scenario("unmuteUserSimulation")
        .feed(unmute-userPATHFeeder)
        .exec(http("unmuteUser")
        .httpRequest("DELETE","/users/me/muted_users/${muted_user_id}")
)

    // Run scnunmuteUser with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnunmuteUser.inject(
        rampUsersPerSec(1) to(unmuteUserPerSecond) during(rampUpSeconds),
        constantUsersPerSec(unmuteUserPerSecond) during(durationSeconds),
        rampUsersPerSec(unmuteUserPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnupdateSettings = scenario("updateSettingsSimulation")
        .feed(update-settingsQUERYFeeder)
        .exec(http("updateSettings")
        .httpRequest("PATCH","/settings")
        .queryParam("enable_offline_push_notifications","${enable_offline_push_notifications}")
        .queryParam("demote_inactive_streams","${demote_inactive_streams}")
        .queryParam("notification_sound","${notification_sound}")
        .queryParam("enable_digest_emails","${enable_digest_emails}")
        .queryParam("translate_emoticons","${translate_emoticons}")
        .queryParam("enable_online_push_notifications","${enable_online_push_notifications}")
        .queryParam("enable_drafts_synchronization","${enable_drafts_synchronization}")
        .queryParam("email","${email}")
        .queryParam("timezone","${timezone}")
        .queryParam("dense_mode","${dense_mode}")
        .queryParam("left_side_userlist","${left_side_userlist}")
        .queryParam("enable_offline_email_notifications","${enable_offline_email_notifications}")
        .queryParam("presence_enabled","${presence_enabled}")
        .queryParam("high_contrast_mode","${high_contrast_mode}")
        .queryParam("full_name","${full_name}")
        .queryParam("emojiset","${emojiset}")
        .queryParam("color_scheme","${color_scheme}")
        .queryParam("enable_stream_push_notifications","${enable_stream_push_notifications}")
        .queryParam("enable_sounds","${enable_sounds}")
        .queryParam("enable_stream_email_notifications","${enable_stream_email_notifications}")
        .queryParam("desktop_icon_count_display","${desktop_icon_count_display}")
        .queryParam("message_content_in_email_notifications","${message_content_in_email_notifications}")
        .queryParam("default_view","${default_view}")
        .queryParam("enable_login_emails","${enable_login_emails}")
        .queryParam("new_password","${new_password}")
        .queryParam("enable_desktop_notifications","${enable_desktop_notifications}")
        .queryParam("pm_content_in_desktop_notifications","${pm_content_in_desktop_notifications}")
        .queryParam("enter_sends","${enter_sends}")
        .queryParam("twenty_four_hour_time","${twenty_four_hour_time}")
        .queryParam("starred_message_counts","${starred_message_counts}")
        .queryParam("enable_marketing_emails","${enable_marketing_emails}")
        .queryParam("fluid_layout_width","${fluid_layout_width}")
        .queryParam("enable_stream_desktop_notifications","${enable_stream_desktop_notifications}")
        .queryParam("enable_stream_audible_notifications","${enable_stream_audible_notifications}")
        .queryParam("old_password","${old_password}")
        .queryParam("realm_name_in_notifications","${realm_name_in_notifications}")
        .queryParam("default_language","${default_language}")
        .queryParam("wildcard_mentions_notify","${wildcard_mentions_notify}")
        .queryParam("email_notifications_batching_period_seconds","${email_notifications_batching_period_seconds}")
)

    // Run scnupdateSettings with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnupdateSettings.inject(
        rampUsersPerSec(1) to(updateSettingsPerSecond) during(rampUpSeconds),
        constantUsersPerSec(updateSettingsPerSecond) during(durationSeconds),
        rampUsersPerSec(updateSettingsPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnupdateStatus = scenario("updateStatusSimulation")
        .feed(update-statusQUERYFeeder)
        .exec(http("updateStatus")
        .httpRequest("POST","/users/me/status")
        .queryParam("away","${away}")
        .queryParam("emoji_name","${emoji_name}")
        .queryParam("status_text","${status_text}")
        .queryParam("reaction_type","${reaction_type}")
        .queryParam("emoji_code","${emoji_code}")
)

    // Run scnupdateStatus with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnupdateStatus.inject(
        rampUsersPerSec(1) to(updateStatusPerSecond) during(rampUpSeconds),
        constantUsersPerSec(updateStatusPerSecond) during(durationSeconds),
        rampUsersPerSec(updateStatusPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnupdateUser = scenario("updateUserSimulation")
        .feed(update-userQUERYFeeder)
        .feed(update-userPATHFeeder)
        .exec(http("updateUser")
        .httpRequest("PATCH","/users/${user_id}")
        .queryParam("role","${role}")
        .queryParam("profile_data","${profile_data}")
        .queryParam("full_name","${full_name}")
)

    // Run scnupdateUser with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnupdateUser.inject(
        rampUsersPerSec(1) to(updateUserPerSecond) during(rampUpSeconds),
        constantUsersPerSec(updateUserPerSecond) during(durationSeconds),
        rampUsersPerSec(updateUserPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnupdateUserGroup = scenario("updateUserGroupSimulation")
        .feed(update-user-groupQUERYFeeder)
        .feed(update-user-groupPATHFeeder)
        .exec(http("updateUserGroup")
        .httpRequest("PATCH","/user_groups/${user_group_id}")
        .queryParam("name","${name}")
        .queryParam("description","${description}")
)

    // Run scnupdateUserGroup with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnupdateUserGroup.inject(
        rampUsersPerSec(1) to(updateUserGroupPerSecond) during(rampUpSeconds),
        constantUsersPerSec(updateUserGroupPerSecond) during(durationSeconds),
        rampUsersPerSec(updateUserGroupPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnupdateUserGroupMembers = scenario("updateUserGroupMembersSimulation")
        .feed(update-user-group-membersQUERYFeeder)
        .feed(update-user-group-membersPATHFeeder)
        .exec(http("updateUserGroupMembers")
        .httpRequest("POST","/user_groups/${user_group_id}/members")
        .queryParam("delete","${delete}")
        .queryParam("add","${add}")
)

    // Run scnupdateUserGroupMembers with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnupdateUserGroupMembers.inject(
        rampUsersPerSec(1) to(updateUserGroupMembersPerSecond) during(rampUpSeconds),
        constantUsersPerSec(updateUserGroupMembersPerSecond) during(durationSeconds),
        rampUsersPerSec(updateUserGroupMembersPerSecond) to(1) during(rampDownSeconds)
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
