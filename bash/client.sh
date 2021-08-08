#!/usr/bin/env bash

# !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
# !
# ! Note:
# !
# ! THIS SCRIPT HAS BEEN AUTOMATICALLY GENERATED USING
# ! openapi-generator (https://openapi-generator.tech)
# ! FROM OPENAPI SPECIFICATION IN JSON.
# !
# !
# !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!

#
# This is a Bash client for Zulip REST API.
#
# LICENSE:
# https://www.apache.org/licenses/LICENSE-2.0.html
#
# CONTACT:
# 
#
# MORE INFORMATION:
# 
#

# For improved pattern matching in case statemets
shopt -s extglob

###############################################################################
#
# Make sure Bash is at least in version 4.3
#
###############################################################################
if ! ( (("${BASH_VERSION:0:1}" == "4")) && (("${BASH_VERSION:2:1}" >= "3")) ) \
  && ! (("${BASH_VERSION:0:1}" >= "5")); then
    echo ""
    echo "Sorry - your Bash version is ${BASH_VERSION}"
    echo ""
    echo "You need at least Bash 4.3 to run this script."
    echo ""
    exit 1
fi

###############################################################################
#
# Global variables
#
###############################################################################

##
# The filename of this script for help messages
script_name=$(basename "$0")

##
# Map for headers passed after operation as KEY:VALUE
declare -A header_arguments


##
# Map for operation parameters passed after operation as PARAMETER=VALUE
# These will be mapped to appropriate path or query parameters
# The values in operation_parameters are arrays, so that multiple values
# can be provided for the same parameter if allowed by API specification
declare -A operation_parameters

##
# Declare colors with autodection if output is terminal
if [ -t 1 ]; then
    RED="$(tput setaf 1)"
    GREEN="$(tput setaf 2)"
    YELLOW="$(tput setaf 3)"
    BLUE="$(tput setaf 4)"
    MAGENTA="$(tput setaf 5)"
    CYAN="$(tput setaf 6)"
    WHITE="$(tput setaf 7)"
    BOLD="$(tput bold)"
    OFF="$(tput sgr0)"
else
    RED=""
    GREEN=""
    YELLOW=""
    BLUE=""
    MAGENTA=""
    CYAN=""
    WHITE=""
    BOLD=""
    OFF=""
fi

declare -a result_color_table=( "$WHITE" "$WHITE" "$GREEN" "$YELLOW" "$WHITE" "$MAGENTA" "$WHITE" )

##
# This array stores the minimum number of required occurrences for parameter
# 0 - optional
# 1 - required
declare -A operation_parameters_minimum_occurrences
operation_parameters_minimum_occurrences["devFetchApiKey:::username"]=1
operation_parameters_minimum_occurrences["fetchApiKey:::username"]=1
operation_parameters_minimum_occurrences["fetchApiKey:::password"]=1
operation_parameters_minimum_occurrences["addReaction:::message_id"]=1
operation_parameters_minimum_occurrences["addReaction:::emoji_name"]=1
operation_parameters_minimum_occurrences["addReaction:::emoji_code"]=0
operation_parameters_minimum_occurrences["addReaction:::reaction_type"]=0
operation_parameters_minimum_occurrences["checkMessagesMatchNarrow:::msg_ids"]=1
operation_parameters_minimum_occurrences["checkMessagesMatchNarrow:::narrow"]=1
operation_parameters_minimum_occurrences["deleteMessage:::message_id"]=1
operation_parameters_minimum_occurrences["getFileTemporaryUrl:::realm_id_str"]=1
operation_parameters_minimum_occurrences["getFileTemporaryUrl:::filename"]=1
operation_parameters_minimum_occurrences["getMessageHistory:::message_id"]=1
operation_parameters_minimum_occurrences["getMessages:::num_before"]=1
operation_parameters_minimum_occurrences["getMessages:::num_after"]=1
operation_parameters_minimum_occurrences["getMessages:::anchor"]=0
operation_parameters_minimum_occurrences["getMessages:::narrow"]=0
operation_parameters_minimum_occurrences["getMessages:::client_gravatar"]=0
operation_parameters_minimum_occurrences["getMessages:::apply_markdown"]=0
operation_parameters_minimum_occurrences["getMessages:::use_first_unread_anchor"]=0
operation_parameters_minimum_occurrences["getRawMessage:::message_id"]=1
operation_parameters_minimum_occurrences["markStreamAsRead:::stream_id"]=1
operation_parameters_minimum_occurrences["markTopicAsRead:::stream_id"]=1
operation_parameters_minimum_occurrences["markTopicAsRead:::topic_name"]=1
operation_parameters_minimum_occurrences["removeReaction:::message_id"]=1
operation_parameters_minimum_occurrences["removeReaction:::emoji_name"]=0
operation_parameters_minimum_occurrences["removeReaction:::emoji_code"]=0
operation_parameters_minimum_occurrences["removeReaction:::reaction_type"]=0
operation_parameters_minimum_occurrences["renderMessage:::content"]=1
operation_parameters_minimum_occurrences["sendMessage:::type"]=1
operation_parameters_minimum_occurrences["sendMessage:::to"]=1
operation_parameters_minimum_occurrences["sendMessage:::content"]=1
operation_parameters_minimum_occurrences["sendMessage:::topic"]=0
operation_parameters_minimum_occurrences["sendMessage:::queue_id"]=0
operation_parameters_minimum_occurrences["sendMessage:::local_id"]=0
operation_parameters_minimum_occurrences["updateMessage:::message_id"]=1
operation_parameters_minimum_occurrences["updateMessage:::topic"]=0
operation_parameters_minimum_occurrences["updateMessage:::propagate_mode"]=0
operation_parameters_minimum_occurrences["updateMessage:::send_notification_to_old_thread"]=0
operation_parameters_minimum_occurrences["updateMessage:::send_notification_to_new_thread"]=0
operation_parameters_minimum_occurrences["updateMessage:::content"]=0
operation_parameters_minimum_occurrences["updateMessage:::stream_id"]=0
operation_parameters_minimum_occurrences["updateMessageFlags:::messages"]=1
operation_parameters_minimum_occurrences["updateMessageFlags:::op"]=1
operation_parameters_minimum_occurrences["updateMessageFlags:::flag"]=1
operation_parameters_minimum_occurrences["uploadFile:::filename"]=0
operation_parameters_minimum_occurrences["deleteQueue:::queue_id"]=1
operation_parameters_minimum_occurrences["getEvents:::queue_id"]=1
operation_parameters_minimum_occurrences["getEvents:::last_event_id"]=0
operation_parameters_minimum_occurrences["getEvents:::dont_block"]=0
operation_parameters_minimum_occurrences["realTimePost:::event_types"]=0
operation_parameters_minimum_occurrences["realTimePost:::narrow"]=0
operation_parameters_minimum_occurrences["realTimePost:::all_public_streams"]=0
operation_parameters_minimum_occurrences["registerQueue:::apply_markdown"]=0
operation_parameters_minimum_occurrences["registerQueue:::client_gravatar"]=0
operation_parameters_minimum_occurrences["registerQueue:::slim_presence"]=0
operation_parameters_minimum_occurrences["registerQueue:::event_types"]=0
operation_parameters_minimum_occurrences["registerQueue:::all_public_streams"]=0
operation_parameters_minimum_occurrences["registerQueue:::include_subscribers"]=0
operation_parameters_minimum_occurrences["registerQueue:::client_capabilities"]=0
operation_parameters_minimum_occurrences["registerQueue:::fetch_event_types"]=0
operation_parameters_minimum_occurrences["registerQueue:::narrow"]=0
operation_parameters_minimum_occurrences["addCodePlayground:::name"]=1
operation_parameters_minimum_occurrences["addCodePlayground:::pygments_language"]=1
operation_parameters_minimum_occurrences["addCodePlayground:::url_prefix"]=1
operation_parameters_minimum_occurrences["addLinkifier:::pattern"]=1
operation_parameters_minimum_occurrences["addLinkifier:::url_format_string"]=1
operation_parameters_minimum_occurrences["createCustomProfileField:::field_type"]=1
operation_parameters_minimum_occurrences["createCustomProfileField:::name"]=0
operation_parameters_minimum_occurrences["createCustomProfileField:::hint"]=0
operation_parameters_minimum_occurrences["createCustomProfileField:::field_data"]=0
operation_parameters_minimum_occurrences["removeCodePlayground:::playground_id"]=1
operation_parameters_minimum_occurrences["removeLinkifier:::filter_id"]=1
operation_parameters_minimum_occurrences["reorderCustomProfileFields:::order"]=1
operation_parameters_minimum_occurrences["updateLinkifier:::filter_id"]=1
operation_parameters_minimum_occurrences["updateLinkifier:::pattern"]=1
operation_parameters_minimum_occurrences["updateLinkifier:::url_format_string"]=1
operation_parameters_minimum_occurrences["uploadCustomEmoji:::emoji_name"]=1
operation_parameters_minimum_occurrences["uploadCustomEmoji:::filename"]=0
operation_parameters_minimum_occurrences["archiveStream:::stream_id"]=1
operation_parameters_minimum_occurrences["getStreamId:::stream"]=1
operation_parameters_minimum_occurrences["getStreamTopics:::stream_id"]=1
operation_parameters_minimum_occurrences["getStreams:::include_public"]=0
operation_parameters_minimum_occurrences["getStreams:::include_web_public"]=0
operation_parameters_minimum_occurrences["getStreams:::include_subscribed"]=0
operation_parameters_minimum_occurrences["getStreams:::include_all_active"]=0
operation_parameters_minimum_occurrences["getStreams:::include_default"]=0
operation_parameters_minimum_occurrences["getStreams:::include_owner_subscribed"]=0
operation_parameters_minimum_occurrences["getSubscriptionStatus:::user_id"]=1
operation_parameters_minimum_occurrences["getSubscriptionStatus:::stream_id"]=1
operation_parameters_minimum_occurrences["getSubscriptions:::include_subscribers"]=0
operation_parameters_minimum_occurrences["muteTopic:::topic"]=1
operation_parameters_minimum_occurrences["muteTopic:::op"]=1
operation_parameters_minimum_occurrences["muteTopic:::stream"]=0
operation_parameters_minimum_occurrences["muteTopic:::stream_id"]=0
operation_parameters_minimum_occurrences["subscribe:::subscriptions"]=1
operation_parameters_minimum_occurrences["subscribe:::principals"]=0
operation_parameters_minimum_occurrences["subscribe:::authorization_errors_fatal"]=0
operation_parameters_minimum_occurrences["subscribe:::announce"]=0
operation_parameters_minimum_occurrences["subscribe:::invite_only"]=0
operation_parameters_minimum_occurrences["subscribe:::history_public_to_subscribers"]=0
operation_parameters_minimum_occurrences["subscribe:::stream_post_policy"]=0
operation_parameters_minimum_occurrences["subscribe:::message_retention_days"]=0
operation_parameters_minimum_occurrences["unsubscribe:::subscriptions"]=1
operation_parameters_minimum_occurrences["unsubscribe:::principals"]=0
operation_parameters_minimum_occurrences["updateStream:::stream_id"]=1
operation_parameters_minimum_occurrences["updateStream:::description"]=0
operation_parameters_minimum_occurrences["updateStream:::new_name"]=0
operation_parameters_minimum_occurrences["updateStream:::is_private"]=0
operation_parameters_minimum_occurrences["updateStream:::is_announcement_only"]=0
operation_parameters_minimum_occurrences["updateStream:::stream_post_policy"]=0
operation_parameters_minimum_occurrences["updateStream:::history_public_to_subscribers"]=0
operation_parameters_minimum_occurrences["updateStream:::message_retention_days"]=0
operation_parameters_minimum_occurrences["updateSubscriptionSettings:::subscription_data"]=1
operation_parameters_minimum_occurrences["updateSubscriptions:::delete"]=0
operation_parameters_minimum_occurrences["updateSubscriptions:::add"]=0
operation_parameters_minimum_occurrences["createUser:::email"]=1
operation_parameters_minimum_occurrences["createUser:::password"]=1
operation_parameters_minimum_occurrences["createUser:::full_name"]=1
operation_parameters_minimum_occurrences["createUserGroup:::name"]=1
operation_parameters_minimum_occurrences["createUserGroup:::description"]=1
operation_parameters_minimum_occurrences["createUserGroup:::members"]=1
operation_parameters_minimum_occurrences["deactivateUser:::user_id"]=1
operation_parameters_minimum_occurrences["getUser:::user_id"]=1
operation_parameters_minimum_occurrences["getUser:::client_gravatar"]=0
operation_parameters_minimum_occurrences["getUser:::include_custom_profile_fields"]=0
operation_parameters_minimum_occurrences["getUserByEmail:::email"]=1
operation_parameters_minimum_occurrences["getUserByEmail:::client_gravatar"]=0
operation_parameters_minimum_occurrences["getUserByEmail:::include_custom_profile_fields"]=0
operation_parameters_minimum_occurrences["getUserPresence:::user_id_or_email"]=1
operation_parameters_minimum_occurrences["getUsers:::client_gravatar"]=0
operation_parameters_minimum_occurrences["getUsers:::include_custom_profile_fields"]=0
operation_parameters_minimum_occurrences["muteUser:::muted_user_id"]=1
operation_parameters_minimum_occurrences["reactivateUser:::user_id"]=1
operation_parameters_minimum_occurrences["removeUserGroup:::user_group_id"]=1
operation_parameters_minimum_occurrences["setTypingStatus:::op"]=1
operation_parameters_minimum_occurrences["setTypingStatus:::to"]=1
operation_parameters_minimum_occurrences["setTypingStatus:::type"]=0
operation_parameters_minimum_occurrences["setTypingStatus:::topic"]=0
operation_parameters_minimum_occurrences["unmuteUser:::muted_user_id"]=1
operation_parameters_minimum_occurrences["updateDisplaySettings:::twenty_four_hour_time"]=0
operation_parameters_minimum_occurrences["updateDisplaySettings:::dense_mode"]=0
operation_parameters_minimum_occurrences["updateDisplaySettings:::starred_message_counts"]=0
operation_parameters_minimum_occurrences["updateDisplaySettings:::fluid_layout_width"]=0
operation_parameters_minimum_occurrences["updateDisplaySettings:::high_contrast_mode"]=0
operation_parameters_minimum_occurrences["updateDisplaySettings:::color_scheme"]=0
operation_parameters_minimum_occurrences["updateDisplaySettings:::translate_emoticons"]=0
operation_parameters_minimum_occurrences["updateDisplaySettings:::default_language"]=0
operation_parameters_minimum_occurrences["updateDisplaySettings:::default_view"]=0
operation_parameters_minimum_occurrences["updateDisplaySettings:::left_side_userlist"]=0
operation_parameters_minimum_occurrences["updateDisplaySettings:::emojiset"]=0
operation_parameters_minimum_occurrences["updateDisplaySettings:::demote_inactive_streams"]=0
operation_parameters_minimum_occurrences["updateDisplaySettings:::timezone"]=0
operation_parameters_minimum_occurrences["updateNotificationSettings:::enable_stream_desktop_notifications"]=0
operation_parameters_minimum_occurrences["updateNotificationSettings:::enable_stream_email_notifications"]=0
operation_parameters_minimum_occurrences["updateNotificationSettings:::enable_stream_push_notifications"]=0
operation_parameters_minimum_occurrences["updateNotificationSettings:::enable_stream_audible_notifications"]=0
operation_parameters_minimum_occurrences["updateNotificationSettings:::notification_sound"]=0
operation_parameters_minimum_occurrences["updateNotificationSettings:::enable_desktop_notifications"]=0
operation_parameters_minimum_occurrences["updateNotificationSettings:::enable_sounds"]=0
operation_parameters_minimum_occurrences["updateNotificationSettings:::enable_offline_email_notifications"]=0
operation_parameters_minimum_occurrences["updateNotificationSettings:::enable_offline_push_notifications"]=0
operation_parameters_minimum_occurrences["updateNotificationSettings:::enable_online_push_notifications"]=0
operation_parameters_minimum_occurrences["updateNotificationSettings:::enable_digest_emails"]=0
operation_parameters_minimum_occurrences["updateNotificationSettings:::enable_marketing_emails"]=0
operation_parameters_minimum_occurrences["updateNotificationSettings:::enable_login_emails"]=0
operation_parameters_minimum_occurrences["updateNotificationSettings:::message_content_in_email_notifications"]=0
operation_parameters_minimum_occurrences["updateNotificationSettings:::pm_content_in_desktop_notifications"]=0
operation_parameters_minimum_occurrences["updateNotificationSettings:::wildcard_mentions_notify"]=0
operation_parameters_minimum_occurrences["updateNotificationSettings:::desktop_icon_count_display"]=0
operation_parameters_minimum_occurrences["updateNotificationSettings:::realm_name_in_notifications"]=0
operation_parameters_minimum_occurrences["updateNotificationSettings:::presence_enabled"]=0
operation_parameters_minimum_occurrences["updateUser:::user_id"]=1
operation_parameters_minimum_occurrences["updateUser:::full_name"]=0
operation_parameters_minimum_occurrences["updateUser:::role"]=0
operation_parameters_minimum_occurrences["updateUser:::profile_data"]=0
operation_parameters_minimum_occurrences["updateUserGroup:::user_group_id"]=1
operation_parameters_minimum_occurrences["updateUserGroup:::name"]=1
operation_parameters_minimum_occurrences["updateUserGroup:::description"]=1
operation_parameters_minimum_occurrences["updateUserGroupMembers:::user_group_id"]=1
operation_parameters_minimum_occurrences["updateUserGroupMembers:::delete"]=0
operation_parameters_minimum_occurrences["updateUserGroupMembers:::add"]=0

##
# This array stores the maximum number of allowed occurrences for parameter
# 1 - single value
# 2 - 2 values
# N - N values
# 0 - unlimited
declare -A operation_parameters_maximum_occurrences
operation_parameters_maximum_occurrences["devFetchApiKey:::username"]=0
operation_parameters_maximum_occurrences["fetchApiKey:::username"]=0
operation_parameters_maximum_occurrences["fetchApiKey:::password"]=0
operation_parameters_maximum_occurrences["addReaction:::message_id"]=0
operation_parameters_maximum_occurrences["addReaction:::emoji_name"]=0
operation_parameters_maximum_occurrences["addReaction:::emoji_code"]=0
operation_parameters_maximum_occurrences["addReaction:::reaction_type"]=0
operation_parameters_maximum_occurrences["checkMessagesMatchNarrow:::msg_ids"]=0
operation_parameters_maximum_occurrences["checkMessagesMatchNarrow:::narrow"]=0
operation_parameters_maximum_occurrences["deleteMessage:::message_id"]=0
operation_parameters_maximum_occurrences["getFileTemporaryUrl:::realm_id_str"]=0
operation_parameters_maximum_occurrences["getFileTemporaryUrl:::filename"]=0
operation_parameters_maximum_occurrences["getMessageHistory:::message_id"]=0
operation_parameters_maximum_occurrences["getMessages:::num_before"]=0
operation_parameters_maximum_occurrences["getMessages:::num_after"]=0
operation_parameters_maximum_occurrences["getMessages:::anchor"]=0
operation_parameters_maximum_occurrences["getMessages:::narrow"]=0
operation_parameters_maximum_occurrences["getMessages:::client_gravatar"]=0
operation_parameters_maximum_occurrences["getMessages:::apply_markdown"]=0
operation_parameters_maximum_occurrences["getMessages:::use_first_unread_anchor"]=0
operation_parameters_maximum_occurrences["getRawMessage:::message_id"]=0
operation_parameters_maximum_occurrences["markStreamAsRead:::stream_id"]=0
operation_parameters_maximum_occurrences["markTopicAsRead:::stream_id"]=0
operation_parameters_maximum_occurrences["markTopicAsRead:::topic_name"]=0
operation_parameters_maximum_occurrences["removeReaction:::message_id"]=0
operation_parameters_maximum_occurrences["removeReaction:::emoji_name"]=0
operation_parameters_maximum_occurrences["removeReaction:::emoji_code"]=0
operation_parameters_maximum_occurrences["removeReaction:::reaction_type"]=0
operation_parameters_maximum_occurrences["renderMessage:::content"]=0
operation_parameters_maximum_occurrences["sendMessage:::type"]=0
operation_parameters_maximum_occurrences["sendMessage:::to"]=0
operation_parameters_maximum_occurrences["sendMessage:::content"]=0
operation_parameters_maximum_occurrences["sendMessage:::topic"]=0
operation_parameters_maximum_occurrences["sendMessage:::queue_id"]=0
operation_parameters_maximum_occurrences["sendMessage:::local_id"]=0
operation_parameters_maximum_occurrences["updateMessage:::message_id"]=0
operation_parameters_maximum_occurrences["updateMessage:::topic"]=0
operation_parameters_maximum_occurrences["updateMessage:::propagate_mode"]=0
operation_parameters_maximum_occurrences["updateMessage:::send_notification_to_old_thread"]=0
operation_parameters_maximum_occurrences["updateMessage:::send_notification_to_new_thread"]=0
operation_parameters_maximum_occurrences["updateMessage:::content"]=0
operation_parameters_maximum_occurrences["updateMessage:::stream_id"]=0
operation_parameters_maximum_occurrences["updateMessageFlags:::messages"]=0
operation_parameters_maximum_occurrences["updateMessageFlags:::op"]=0
operation_parameters_maximum_occurrences["updateMessageFlags:::flag"]=0
operation_parameters_maximum_occurrences["uploadFile:::filename"]=0
operation_parameters_maximum_occurrences["deleteQueue:::queue_id"]=0
operation_parameters_maximum_occurrences["getEvents:::queue_id"]=0
operation_parameters_maximum_occurrences["getEvents:::last_event_id"]=0
operation_parameters_maximum_occurrences["getEvents:::dont_block"]=0
operation_parameters_maximum_occurrences["realTimePost:::event_types"]=0
operation_parameters_maximum_occurrences["realTimePost:::narrow"]=0
operation_parameters_maximum_occurrences["realTimePost:::all_public_streams"]=0
operation_parameters_maximum_occurrences["registerQueue:::apply_markdown"]=0
operation_parameters_maximum_occurrences["registerQueue:::client_gravatar"]=0
operation_parameters_maximum_occurrences["registerQueue:::slim_presence"]=0
operation_parameters_maximum_occurrences["registerQueue:::event_types"]=0
operation_parameters_maximum_occurrences["registerQueue:::all_public_streams"]=0
operation_parameters_maximum_occurrences["registerQueue:::include_subscribers"]=0
operation_parameters_maximum_occurrences["registerQueue:::client_capabilities"]=0
operation_parameters_maximum_occurrences["registerQueue:::fetch_event_types"]=0
operation_parameters_maximum_occurrences["registerQueue:::narrow"]=0
operation_parameters_maximum_occurrences["addCodePlayground:::name"]=0
operation_parameters_maximum_occurrences["addCodePlayground:::pygments_language"]=0
operation_parameters_maximum_occurrences["addCodePlayground:::url_prefix"]=0
operation_parameters_maximum_occurrences["addLinkifier:::pattern"]=0
operation_parameters_maximum_occurrences["addLinkifier:::url_format_string"]=0
operation_parameters_maximum_occurrences["createCustomProfileField:::field_type"]=0
operation_parameters_maximum_occurrences["createCustomProfileField:::name"]=0
operation_parameters_maximum_occurrences["createCustomProfileField:::hint"]=0
operation_parameters_maximum_occurrences["createCustomProfileField:::field_data"]=0
operation_parameters_maximum_occurrences["removeCodePlayground:::playground_id"]=0
operation_parameters_maximum_occurrences["removeLinkifier:::filter_id"]=0
operation_parameters_maximum_occurrences["reorderCustomProfileFields:::order"]=0
operation_parameters_maximum_occurrences["updateLinkifier:::filter_id"]=0
operation_parameters_maximum_occurrences["updateLinkifier:::pattern"]=0
operation_parameters_maximum_occurrences["updateLinkifier:::url_format_string"]=0
operation_parameters_maximum_occurrences["uploadCustomEmoji:::emoji_name"]=0
operation_parameters_maximum_occurrences["uploadCustomEmoji:::filename"]=0
operation_parameters_maximum_occurrences["archiveStream:::stream_id"]=0
operation_parameters_maximum_occurrences["getStreamId:::stream"]=0
operation_parameters_maximum_occurrences["getStreamTopics:::stream_id"]=0
operation_parameters_maximum_occurrences["getStreams:::include_public"]=0
operation_parameters_maximum_occurrences["getStreams:::include_web_public"]=0
operation_parameters_maximum_occurrences["getStreams:::include_subscribed"]=0
operation_parameters_maximum_occurrences["getStreams:::include_all_active"]=0
operation_parameters_maximum_occurrences["getStreams:::include_default"]=0
operation_parameters_maximum_occurrences["getStreams:::include_owner_subscribed"]=0
operation_parameters_maximum_occurrences["getSubscriptionStatus:::user_id"]=0
operation_parameters_maximum_occurrences["getSubscriptionStatus:::stream_id"]=0
operation_parameters_maximum_occurrences["getSubscriptions:::include_subscribers"]=0
operation_parameters_maximum_occurrences["muteTopic:::topic"]=0
operation_parameters_maximum_occurrences["muteTopic:::op"]=0
operation_parameters_maximum_occurrences["muteTopic:::stream"]=0
operation_parameters_maximum_occurrences["muteTopic:::stream_id"]=0
operation_parameters_maximum_occurrences["subscribe:::subscriptions"]=0
operation_parameters_maximum_occurrences["subscribe:::principals"]=0
operation_parameters_maximum_occurrences["subscribe:::authorization_errors_fatal"]=0
operation_parameters_maximum_occurrences["subscribe:::announce"]=0
operation_parameters_maximum_occurrences["subscribe:::invite_only"]=0
operation_parameters_maximum_occurrences["subscribe:::history_public_to_subscribers"]=0
operation_parameters_maximum_occurrences["subscribe:::stream_post_policy"]=0
operation_parameters_maximum_occurrences["subscribe:::message_retention_days"]=0
operation_parameters_maximum_occurrences["unsubscribe:::subscriptions"]=0
operation_parameters_maximum_occurrences["unsubscribe:::principals"]=0
operation_parameters_maximum_occurrences["updateStream:::stream_id"]=0
operation_parameters_maximum_occurrences["updateStream:::description"]=0
operation_parameters_maximum_occurrences["updateStream:::new_name"]=0
operation_parameters_maximum_occurrences["updateStream:::is_private"]=0
operation_parameters_maximum_occurrences["updateStream:::is_announcement_only"]=0
operation_parameters_maximum_occurrences["updateStream:::stream_post_policy"]=0
operation_parameters_maximum_occurrences["updateStream:::history_public_to_subscribers"]=0
operation_parameters_maximum_occurrences["updateStream:::message_retention_days"]=0
operation_parameters_maximum_occurrences["updateSubscriptionSettings:::subscription_data"]=0
operation_parameters_maximum_occurrences["updateSubscriptions:::delete"]=0
operation_parameters_maximum_occurrences["updateSubscriptions:::add"]=0
operation_parameters_maximum_occurrences["createUser:::email"]=0
operation_parameters_maximum_occurrences["createUser:::password"]=0
operation_parameters_maximum_occurrences["createUser:::full_name"]=0
operation_parameters_maximum_occurrences["createUserGroup:::name"]=0
operation_parameters_maximum_occurrences["createUserGroup:::description"]=0
operation_parameters_maximum_occurrences["createUserGroup:::members"]=0
operation_parameters_maximum_occurrences["deactivateUser:::user_id"]=0
operation_parameters_maximum_occurrences["getUser:::user_id"]=0
operation_parameters_maximum_occurrences["getUser:::client_gravatar"]=0
operation_parameters_maximum_occurrences["getUser:::include_custom_profile_fields"]=0
operation_parameters_maximum_occurrences["getUserByEmail:::email"]=0
operation_parameters_maximum_occurrences["getUserByEmail:::client_gravatar"]=0
operation_parameters_maximum_occurrences["getUserByEmail:::include_custom_profile_fields"]=0
operation_parameters_maximum_occurrences["getUserPresence:::user_id_or_email"]=0
operation_parameters_maximum_occurrences["getUsers:::client_gravatar"]=0
operation_parameters_maximum_occurrences["getUsers:::include_custom_profile_fields"]=0
operation_parameters_maximum_occurrences["muteUser:::muted_user_id"]=0
operation_parameters_maximum_occurrences["reactivateUser:::user_id"]=0
operation_parameters_maximum_occurrences["removeUserGroup:::user_group_id"]=0
operation_parameters_maximum_occurrences["setTypingStatus:::op"]=0
operation_parameters_maximum_occurrences["setTypingStatus:::to"]=0
operation_parameters_maximum_occurrences["setTypingStatus:::type"]=0
operation_parameters_maximum_occurrences["setTypingStatus:::topic"]=0
operation_parameters_maximum_occurrences["unmuteUser:::muted_user_id"]=0
operation_parameters_maximum_occurrences["updateDisplaySettings:::twenty_four_hour_time"]=0
operation_parameters_maximum_occurrences["updateDisplaySettings:::dense_mode"]=0
operation_parameters_maximum_occurrences["updateDisplaySettings:::starred_message_counts"]=0
operation_parameters_maximum_occurrences["updateDisplaySettings:::fluid_layout_width"]=0
operation_parameters_maximum_occurrences["updateDisplaySettings:::high_contrast_mode"]=0
operation_parameters_maximum_occurrences["updateDisplaySettings:::color_scheme"]=0
operation_parameters_maximum_occurrences["updateDisplaySettings:::translate_emoticons"]=0
operation_parameters_maximum_occurrences["updateDisplaySettings:::default_language"]=0
operation_parameters_maximum_occurrences["updateDisplaySettings:::default_view"]=0
operation_parameters_maximum_occurrences["updateDisplaySettings:::left_side_userlist"]=0
operation_parameters_maximum_occurrences["updateDisplaySettings:::emojiset"]=0
operation_parameters_maximum_occurrences["updateDisplaySettings:::demote_inactive_streams"]=0
operation_parameters_maximum_occurrences["updateDisplaySettings:::timezone"]=0
operation_parameters_maximum_occurrences["updateNotificationSettings:::enable_stream_desktop_notifications"]=0
operation_parameters_maximum_occurrences["updateNotificationSettings:::enable_stream_email_notifications"]=0
operation_parameters_maximum_occurrences["updateNotificationSettings:::enable_stream_push_notifications"]=0
operation_parameters_maximum_occurrences["updateNotificationSettings:::enable_stream_audible_notifications"]=0
operation_parameters_maximum_occurrences["updateNotificationSettings:::notification_sound"]=0
operation_parameters_maximum_occurrences["updateNotificationSettings:::enable_desktop_notifications"]=0
operation_parameters_maximum_occurrences["updateNotificationSettings:::enable_sounds"]=0
operation_parameters_maximum_occurrences["updateNotificationSettings:::enable_offline_email_notifications"]=0
operation_parameters_maximum_occurrences["updateNotificationSettings:::enable_offline_push_notifications"]=0
operation_parameters_maximum_occurrences["updateNotificationSettings:::enable_online_push_notifications"]=0
operation_parameters_maximum_occurrences["updateNotificationSettings:::enable_digest_emails"]=0
operation_parameters_maximum_occurrences["updateNotificationSettings:::enable_marketing_emails"]=0
operation_parameters_maximum_occurrences["updateNotificationSettings:::enable_login_emails"]=0
operation_parameters_maximum_occurrences["updateNotificationSettings:::message_content_in_email_notifications"]=0
operation_parameters_maximum_occurrences["updateNotificationSettings:::pm_content_in_desktop_notifications"]=0
operation_parameters_maximum_occurrences["updateNotificationSettings:::wildcard_mentions_notify"]=0
operation_parameters_maximum_occurrences["updateNotificationSettings:::desktop_icon_count_display"]=0
operation_parameters_maximum_occurrences["updateNotificationSettings:::realm_name_in_notifications"]=0
operation_parameters_maximum_occurrences["updateNotificationSettings:::presence_enabled"]=0
operation_parameters_maximum_occurrences["updateUser:::user_id"]=0
operation_parameters_maximum_occurrences["updateUser:::full_name"]=0
operation_parameters_maximum_occurrences["updateUser:::role"]=0
operation_parameters_maximum_occurrences["updateUser:::profile_data"]=0
operation_parameters_maximum_occurrences["updateUserGroup:::user_group_id"]=0
operation_parameters_maximum_occurrences["updateUserGroup:::name"]=0
operation_parameters_maximum_occurrences["updateUserGroup:::description"]=0
operation_parameters_maximum_occurrences["updateUserGroupMembers:::user_group_id"]=0
operation_parameters_maximum_occurrences["updateUserGroupMembers:::delete"]=0
operation_parameters_maximum_occurrences["updateUserGroupMembers:::add"]=0

##
# The type of collection for specifying multiple values for parameter:
# - multi, csv, ssv, tsv
declare -A operation_parameters_collection_type
operation_parameters_collection_type["devFetchApiKey:::username"]=""
operation_parameters_collection_type["fetchApiKey:::username"]=""
operation_parameters_collection_type["fetchApiKey:::password"]=""
operation_parameters_collection_type["addReaction:::message_id"]=""
operation_parameters_collection_type["addReaction:::emoji_name"]=""
operation_parameters_collection_type["addReaction:::emoji_code"]=""
operation_parameters_collection_type["addReaction:::reaction_type"]=""
operation_parameters_collection_type["checkMessagesMatchNarrow:::msg_ids"]="multi"
operation_parameters_collection_type["checkMessagesMatchNarrow:::narrow"]="multi"
operation_parameters_collection_type["deleteMessage:::message_id"]=""
operation_parameters_collection_type["getFileTemporaryUrl:::realm_id_str"]=""
operation_parameters_collection_type["getFileTemporaryUrl:::filename"]=""
operation_parameters_collection_type["getMessageHistory:::message_id"]=""
operation_parameters_collection_type["getMessages:::num_before"]=""
operation_parameters_collection_type["getMessages:::num_after"]=""
operation_parameters_collection_type["getMessages:::anchor"]=""
operation_parameters_collection_type["getMessages:::narrow"]="multi"
operation_parameters_collection_type["getMessages:::client_gravatar"]=""
operation_parameters_collection_type["getMessages:::apply_markdown"]=""
operation_parameters_collection_type["getMessages:::use_first_unread_anchor"]=""
operation_parameters_collection_type["getRawMessage:::message_id"]=""
operation_parameters_collection_type["markStreamAsRead:::stream_id"]=""
operation_parameters_collection_type["markTopicAsRead:::stream_id"]=""
operation_parameters_collection_type["markTopicAsRead:::topic_name"]=""
operation_parameters_collection_type["removeReaction:::message_id"]=""
operation_parameters_collection_type["removeReaction:::emoji_name"]=""
operation_parameters_collection_type["removeReaction:::emoji_code"]=""
operation_parameters_collection_type["removeReaction:::reaction_type"]=""
operation_parameters_collection_type["renderMessage:::content"]=""
operation_parameters_collection_type["sendMessage:::type"]=""
operation_parameters_collection_type["sendMessage:::to"]="multi"
operation_parameters_collection_type["sendMessage:::content"]=""
operation_parameters_collection_type["sendMessage:::topic"]=""
operation_parameters_collection_type["sendMessage:::queue_id"]=""
operation_parameters_collection_type["sendMessage:::local_id"]=""
operation_parameters_collection_type["updateMessage:::message_id"]=""
operation_parameters_collection_type["updateMessage:::topic"]=""
operation_parameters_collection_type["updateMessage:::propagate_mode"]=""
operation_parameters_collection_type["updateMessage:::send_notification_to_old_thread"]=""
operation_parameters_collection_type["updateMessage:::send_notification_to_new_thread"]=""
operation_parameters_collection_type["updateMessage:::content"]=""
operation_parameters_collection_type["updateMessage:::stream_id"]=""
operation_parameters_collection_type["updateMessageFlags:::messages"]="multi"
operation_parameters_collection_type["updateMessageFlags:::op"]=""
operation_parameters_collection_type["updateMessageFlags:::flag"]=""
operation_parameters_collection_type["uploadFile:::filename"]=""
operation_parameters_collection_type["deleteQueue:::queue_id"]=""
operation_parameters_collection_type["getEvents:::queue_id"]=""
operation_parameters_collection_type["getEvents:::last_event_id"]=""
operation_parameters_collection_type["getEvents:::dont_block"]=""
operation_parameters_collection_type["realTimePost:::event_types"]="multi"
operation_parameters_collection_type["realTimePost:::narrow"]="multi"
operation_parameters_collection_type["realTimePost:::all_public_streams"]=""
operation_parameters_collection_type["registerQueue:::apply_markdown"]=""
operation_parameters_collection_type["registerQueue:::client_gravatar"]=""
operation_parameters_collection_type["registerQueue:::slim_presence"]=""
operation_parameters_collection_type["registerQueue:::event_types"]="multi"
operation_parameters_collection_type["registerQueue:::all_public_streams"]=""
operation_parameters_collection_type["registerQueue:::include_subscribers"]=""
operation_parameters_collection_type["registerQueue:::client_capabilities"]=""
operation_parameters_collection_type["registerQueue:::fetch_event_types"]="multi"
operation_parameters_collection_type["registerQueue:::narrow"]="multi"
operation_parameters_collection_type["addCodePlayground:::name"]=""
operation_parameters_collection_type["addCodePlayground:::pygments_language"]=""
operation_parameters_collection_type["addCodePlayground:::url_prefix"]=""
operation_parameters_collection_type["addLinkifier:::pattern"]=""
operation_parameters_collection_type["addLinkifier:::url_format_string"]=""
operation_parameters_collection_type["createCustomProfileField:::field_type"]=""
operation_parameters_collection_type["createCustomProfileField:::name"]=""
operation_parameters_collection_type["createCustomProfileField:::hint"]=""
operation_parameters_collection_type["createCustomProfileField:::field_data"]=""
operation_parameters_collection_type["removeCodePlayground:::playground_id"]=""
operation_parameters_collection_type["removeLinkifier:::filter_id"]=""
operation_parameters_collection_type["reorderCustomProfileFields:::order"]="multi"
operation_parameters_collection_type["updateLinkifier:::filter_id"]=""
operation_parameters_collection_type["updateLinkifier:::pattern"]=""
operation_parameters_collection_type["updateLinkifier:::url_format_string"]=""
operation_parameters_collection_type["uploadCustomEmoji:::emoji_name"]=""
operation_parameters_collection_type["uploadCustomEmoji:::filename"]=""
operation_parameters_collection_type["archiveStream:::stream_id"]=""
operation_parameters_collection_type["getStreamId:::stream"]=""
operation_parameters_collection_type["getStreamTopics:::stream_id"]=""
operation_parameters_collection_type["getStreams:::include_public"]=""
operation_parameters_collection_type["getStreams:::include_web_public"]=""
operation_parameters_collection_type["getStreams:::include_subscribed"]=""
operation_parameters_collection_type["getStreams:::include_all_active"]=""
operation_parameters_collection_type["getStreams:::include_default"]=""
operation_parameters_collection_type["getStreams:::include_owner_subscribed"]=""
operation_parameters_collection_type["getSubscriptionStatus:::user_id"]=""
operation_parameters_collection_type["getSubscriptionStatus:::stream_id"]=""
operation_parameters_collection_type["getSubscriptions:::include_subscribers"]=""
operation_parameters_collection_type["muteTopic:::topic"]=""
operation_parameters_collection_type["muteTopic:::op"]=""
operation_parameters_collection_type["muteTopic:::stream"]=""
operation_parameters_collection_type["muteTopic:::stream_id"]=""
operation_parameters_collection_type["subscribe:::subscriptions"]="multi"
operation_parameters_collection_type["subscribe:::principals"]="multi"
operation_parameters_collection_type["subscribe:::authorization_errors_fatal"]=""
operation_parameters_collection_type["subscribe:::announce"]=""
operation_parameters_collection_type["subscribe:::invite_only"]=""
operation_parameters_collection_type["subscribe:::history_public_to_subscribers"]=""
operation_parameters_collection_type["subscribe:::stream_post_policy"]=""
operation_parameters_collection_type["subscribe:::message_retention_days"]=""
operation_parameters_collection_type["unsubscribe:::subscriptions"]="multi"
operation_parameters_collection_type["unsubscribe:::principals"]="multi"
operation_parameters_collection_type["updateStream:::stream_id"]=""
operation_parameters_collection_type["updateStream:::description"]=""
operation_parameters_collection_type["updateStream:::new_name"]=""
operation_parameters_collection_type["updateStream:::is_private"]=""
operation_parameters_collection_type["updateStream:::is_announcement_only"]=""
operation_parameters_collection_type["updateStream:::stream_post_policy"]=""
operation_parameters_collection_type["updateStream:::history_public_to_subscribers"]=""
operation_parameters_collection_type["updateStream:::message_retention_days"]=""
operation_parameters_collection_type["updateSubscriptionSettings:::subscription_data"]="multi"
operation_parameters_collection_type["updateSubscriptions:::delete"]="multi"
operation_parameters_collection_type["updateSubscriptions:::add"]="multi"
operation_parameters_collection_type["createUser:::email"]=""
operation_parameters_collection_type["createUser:::password"]=""
operation_parameters_collection_type["createUser:::full_name"]=""
operation_parameters_collection_type["createUserGroup:::name"]=""
operation_parameters_collection_type["createUserGroup:::description"]=""
operation_parameters_collection_type["createUserGroup:::members"]="multi"
operation_parameters_collection_type["deactivateUser:::user_id"]=""
operation_parameters_collection_type["getUser:::user_id"]=""
operation_parameters_collection_type["getUser:::client_gravatar"]=""
operation_parameters_collection_type["getUser:::include_custom_profile_fields"]=""
operation_parameters_collection_type["getUserByEmail:::email"]=""
operation_parameters_collection_type["getUserByEmail:::client_gravatar"]=""
operation_parameters_collection_type["getUserByEmail:::include_custom_profile_fields"]=""
operation_parameters_collection_type["getUserPresence:::user_id_or_email"]=""
operation_parameters_collection_type["getUsers:::client_gravatar"]=""
operation_parameters_collection_type["getUsers:::include_custom_profile_fields"]=""
operation_parameters_collection_type["muteUser:::muted_user_id"]=""
operation_parameters_collection_type["reactivateUser:::user_id"]=""
operation_parameters_collection_type["removeUserGroup:::user_group_id"]=""
operation_parameters_collection_type["setTypingStatus:::op"]=""
operation_parameters_collection_type["setTypingStatus:::to"]="multi"
operation_parameters_collection_type["setTypingStatus:::type"]=""
operation_parameters_collection_type["setTypingStatus:::topic"]=""
operation_parameters_collection_type["unmuteUser:::muted_user_id"]=""
operation_parameters_collection_type["updateDisplaySettings:::twenty_four_hour_time"]=""
operation_parameters_collection_type["updateDisplaySettings:::dense_mode"]=""
operation_parameters_collection_type["updateDisplaySettings:::starred_message_counts"]=""
operation_parameters_collection_type["updateDisplaySettings:::fluid_layout_width"]=""
operation_parameters_collection_type["updateDisplaySettings:::high_contrast_mode"]=""
operation_parameters_collection_type["updateDisplaySettings:::color_scheme"]=""
operation_parameters_collection_type["updateDisplaySettings:::translate_emoticons"]=""
operation_parameters_collection_type["updateDisplaySettings:::default_language"]=""
operation_parameters_collection_type["updateDisplaySettings:::default_view"]=""
operation_parameters_collection_type["updateDisplaySettings:::left_side_userlist"]=""
operation_parameters_collection_type["updateDisplaySettings:::emojiset"]=""
operation_parameters_collection_type["updateDisplaySettings:::demote_inactive_streams"]=""
operation_parameters_collection_type["updateDisplaySettings:::timezone"]=""
operation_parameters_collection_type["updateNotificationSettings:::enable_stream_desktop_notifications"]=""
operation_parameters_collection_type["updateNotificationSettings:::enable_stream_email_notifications"]=""
operation_parameters_collection_type["updateNotificationSettings:::enable_stream_push_notifications"]=""
operation_parameters_collection_type["updateNotificationSettings:::enable_stream_audible_notifications"]=""
operation_parameters_collection_type["updateNotificationSettings:::notification_sound"]=""
operation_parameters_collection_type["updateNotificationSettings:::enable_desktop_notifications"]=""
operation_parameters_collection_type["updateNotificationSettings:::enable_sounds"]=""
operation_parameters_collection_type["updateNotificationSettings:::enable_offline_email_notifications"]=""
operation_parameters_collection_type["updateNotificationSettings:::enable_offline_push_notifications"]=""
operation_parameters_collection_type["updateNotificationSettings:::enable_online_push_notifications"]=""
operation_parameters_collection_type["updateNotificationSettings:::enable_digest_emails"]=""
operation_parameters_collection_type["updateNotificationSettings:::enable_marketing_emails"]=""
operation_parameters_collection_type["updateNotificationSettings:::enable_login_emails"]=""
operation_parameters_collection_type["updateNotificationSettings:::message_content_in_email_notifications"]=""
operation_parameters_collection_type["updateNotificationSettings:::pm_content_in_desktop_notifications"]=""
operation_parameters_collection_type["updateNotificationSettings:::wildcard_mentions_notify"]=""
operation_parameters_collection_type["updateNotificationSettings:::desktop_icon_count_display"]=""
operation_parameters_collection_type["updateNotificationSettings:::realm_name_in_notifications"]=""
operation_parameters_collection_type["updateNotificationSettings:::presence_enabled"]=""
operation_parameters_collection_type["updateUser:::user_id"]=""
operation_parameters_collection_type["updateUser:::full_name"]=""
operation_parameters_collection_type["updateUser:::role"]=""
operation_parameters_collection_type["updateUser:::profile_data"]="multi"
operation_parameters_collection_type["updateUserGroup:::user_group_id"]=""
operation_parameters_collection_type["updateUserGroup:::name"]=""
operation_parameters_collection_type["updateUserGroup:::description"]=""
operation_parameters_collection_type["updateUserGroupMembers:::user_group_id"]=""
operation_parameters_collection_type["updateUserGroupMembers:::delete"]="multi"
operation_parameters_collection_type["updateUserGroupMembers:::add"]="multi"


##
# Map for body parameters passed after operation as
# PARAMETER==STRING_VALUE or PARAMETER:=NUMERIC_VALUE
# These will be mapped to top level json keys ( { "PARAMETER": "VALUE" })
declare -A body_parameters

##
# These arguments will be directly passed to cURL
curl_arguments=""

##
# The host for making the request
host=""

##
# The user credentials for basic authentication
basic_auth_credential=""


##
# If true, the script will only output the actual cURL command that would be
# used
print_curl=false

##
# The operation ID passed on the command line
operation=""

##
# The provided Accept header value
header_accept=""

##
# The provided Content-type header value
header_content_type=""

##
# If there is any body content on the stdin pass it to the body of the request
body_content_temp_file=""

##
# If this variable is set to true, the request will be performed even
# if parameters for required query, header or body values are not provided
# (path parameters are still required).
force=false

##
# Declare some mime types abbreviations for easier content-type and accepts
# headers specification
declare -A mime_type_abbreviations
# text/*
mime_type_abbreviations["text"]="text/plain"
mime_type_abbreviations["html"]="text/html"
mime_type_abbreviations["md"]="text/x-markdown"
mime_type_abbreviations["csv"]="text/csv"
mime_type_abbreviations["css"]="text/css"
mime_type_abbreviations["rtf"]="text/rtf"
# application/*
mime_type_abbreviations["json"]="application/json"
mime_type_abbreviations["xml"]="application/xml"
mime_type_abbreviations["yaml"]="application/yaml"
mime_type_abbreviations["js"]="application/javascript"
mime_type_abbreviations["bin"]="application/octet-stream"
mime_type_abbreviations["rdf"]="application/rdf+xml"
# image/*
mime_type_abbreviations["jpg"]="image/jpeg"
mime_type_abbreviations["png"]="image/png"
mime_type_abbreviations["gif"]="image/gif"
mime_type_abbreviations["bmp"]="image/bmp"
mime_type_abbreviations["tiff"]="image/tiff"


##############################################################################
#
# Escape special URL characters
# Based on table at http://www.w3schools.com/tags/ref_urlencode.asp
#
##############################################################################
url_escape() {
    local raw_url="$1"

    value=$(sed -e 's/ /%20/g' \
       -e 's/!/%21/g' \
       -e 's/"/%22/g' \
       -e 's/#/%23/g' \
       -e 's/\&/%26/g' \
       -e 's/'\''/%28/g' \
       -e 's/(/%28/g' \
       -e 's/)/%29/g' \
       -e 's/:/%3A/g' \
       -e 's/\\t/%09/g' \
       -e 's/?/%3F/g' <<<"$raw_url");

    echo "$value"
}

##############################################################################
#
# Lookup the mime type abbreviation in the mime_type_abbreviations array.
# If not present assume the user provided a valid mime type
#
##############################################################################
lookup_mime_type() {
    local mime_type="$1"

    if [[ ${mime_type_abbreviations[$mime_type]} ]]; then
        echo "${mime_type_abbreviations[$mime_type]}"
    else
        echo "$mime_type"
    fi
}

##############################################################################
#
# Converts an associative array into a list of cURL header
# arguments (-H "KEY: VALUE")
#
##############################################################################
header_arguments_to_curl() {
    local headers_curl=""

    for key in "${!header_arguments[@]}"; do
        headers_curl+="-H \"${key}: ${header_arguments[${key}]}\" "
    done
    headers_curl+=" "

    echo "${headers_curl}"
}

##############################################################################
#
# Converts an associative array into a simple JSON with keys as top
# level object attributes
#
# \todo Add conversion of more complex attributes using paths
#
##############################################################################
body_parameters_to_json() {
    local body_json="-d '{"
    local count=0
    for key in "${!body_parameters[@]}"; do
        if [[ $((count++)) -gt 0 ]]; then
            body_json+=", "
        fi
        body_json+="\"${key}\": ${body_parameters[${key}]}"
    done
    body_json+="}'"

    if [[ "${#body_parameters[@]}" -eq 0 ]]; then
        echo ""
    else
        echo "${body_json}"
    fi
}

##############################################################################
#
# Helper method for showing error because for example echo in
# build_request_path() is evaluated as part of command line not printed on
# output. Anyway better idea for resource clean up ;-).
#
##############################################################################
ERROR_MSG=""
function finish {
    if [[ -n "$ERROR_MSG" ]]; then
        echo >&2 "${OFF}${RED}$ERROR_MSG"
        echo >&2 "${OFF}Check usage: '${script_name} --help'"
    fi
}
trap finish EXIT


##############################################################################
#
# Validate and build request path including query parameters
#
##############################################################################
build_request_path() {
    local path_template=$1
    local -n path_params=$2
    local -n query_params=$3


    #
    # Check input parameters count against minimum and maximum required
    #
    if [[ "$force" = false ]]; then
        local was_error=""
        for qparam in "${query_params[@]}" "${path_params[@]}"; do
            local parameter_values
            mapfile -t parameter_values < <(sed -e 's/'":::"'/\n/g' <<<"${operation_parameters[$qparam]}")

            #
            # Check if the number of provided values is not less than minimum required
            #
            if [[ ${#parameter_values[@]} -lt ${operation_parameters_minimum_occurrences["${operation}:::${qparam}"]} ]]; then
                echo "ERROR: Too few values provided for '${qparam}' parameter."
                was_error=true
            fi

            #
            # Check if the number of provided values is not more than maximum
            #
            if [[ ${operation_parameters_maximum_occurrences["${operation}:::${qparam}"]} -gt 0 \
                  && ${#parameter_values[@]} -gt ${operation_parameters_maximum_occurrences["${operation}:::${qparam}"]} ]]; then
                echo "ERROR: Too many values provided for '${qparam}' parameter"
                was_error=true
            fi
        done
        if [[ -n "$was_error" ]]; then
            exit 1
        fi
    fi

    # First replace all path parameters in the path
    for pparam in "${path_params[@]}"; do
        local path_regex="(.*)(\\{$pparam\\})(.*)"
        if [[ $path_template =~ $path_regex ]]; then
            path_template=${BASH_REMATCH[1]}${operation_parameters[$pparam]}${BASH_REMATCH[3]}
        fi
    done

    local query_request_part=""

    for qparam in "${query_params[@]}"; do
        if [[ "${operation_parameters[$qparam]}" == "" ]]; then
            continue
        fi

        # Get the array of parameter values
        local parameter_value=""
        local parameter_values
        mapfile -t parameter_values < <(sed -e 's/'":::"'/\n/g' <<<"${operation_parameters[$qparam]}")



        #
        # Append parameters without specific cardinality
        #
        local collection_type="${operation_parameters_collection_type["${operation}:::${qparam}"]}"
        if [[ "${collection_type}" == "" ]]; then
            local vcount=0
            for qvalue in "${parameter_values[@]}"; do
                if [[ $((vcount++)) -gt 0 ]]; then
                    parameter_value+="&"
                fi
                parameter_value+="${qparam}=${qvalue}"
            done
        #
        # Append parameters specified as 'mutli' collections i.e. param=value1&param=value2&...
        #
        elif [[ "${collection_type}" == "multi" ]]; then
            local vcount=0
            for qvalue in "${parameter_values[@]}"; do
                if [[ $((vcount++)) -gt 0 ]]; then
                    parameter_value+="&"
                fi
                parameter_value+="${qparam}=${qvalue}"
            done
        #
        # Append parameters specified as 'csv' collections i.e. param=value1,value2,...
        #
        elif [[ "${collection_type}" == "csv" ]]; then
            parameter_value+="${qparam}="
            local vcount=0
            for qvalue in "${parameter_values[@]}"; do
                if [[ $((vcount++)) -gt 0 ]]; then
                    parameter_value+=","
                fi
                parameter_value+="${qvalue}"
            done
        #
        # Append parameters specified as 'ssv' collections i.e. param="value1 value2 ..."
        #
        elif [[ "${collection_type}" == "ssv" ]]; then
            parameter_value+="${qparam}="
            local vcount=0
            for qvalue in "${parameter_values[@]}"; do
                if [[ $((vcount++)) -gt 0 ]]; then
                    parameter_value+=" "
                fi
                parameter_value+="${qvalue}"
            done
        #
        # Append parameters specified as 'tsv' collections i.e. param="value1\tvalue2\t..."
        #
        elif [[ "${collection_type}" == "tsv" ]]; then
            parameter_value+="${qparam}="
            local vcount=0
            for qvalue in "${parameter_values[@]}"; do
                if [[ $((vcount++)) -gt 0 ]]; then
                    parameter_value+="\\t"
                fi
                parameter_value+="${qvalue}"
            done
        else
            echo "Unsupported collection format \"${collection_type}\""
            exit 1
        fi

        if [[ -n "${parameter_value}" ]]; then
            if [[ -n "${query_request_part}" ]]; then
                query_request_part+="&"
            fi
            query_request_part+="${parameter_value}"
        fi

    done


    # Now append query parameters - if any
    if [[ -n "${query_request_part}" ]]; then
        path_template+="?${query_request_part}"
    fi

    echo "$path_template"
}



###############################################################################
#
# Print main help message
#
###############################################################################
print_help() {
cat <<EOF

${BOLD}${WHITE}Zulip REST API command line client (API version 1.0.0)${OFF}

${BOLD}${WHITE}Usage${OFF}

  ${GREEN}${script_name}${OFF} [-h|--help] [-V|--version] [--about] [${RED}<curl-options>${OFF}]
           [-ac|--accept ${GREEN}<mime-type>${OFF}] [-ct,--content-type ${GREEN}<mime-type>${OFF}]
           [--host ${CYAN}<url>${OFF}] [--dry-run] [-nc|--no-colors] ${YELLOW}<operation>${OFF} [-h|--help]
           [${BLUE}<headers>${OFF}] [${MAGENTA}<parameters>${OFF}] [${MAGENTA}<body-parameters>${OFF}]

  - ${CYAN}<url>${OFF} - endpoint of the REST service without basepath

  - ${RED}<curl-options>${OFF} - any valid cURL options can be passed before ${YELLOW}<operation>${OFF}
  - ${GREEN}<mime-type>${OFF} - either full mime-type or one of supported abbreviations:
                   (text, html, md, csv, css, rtf, json, xml, yaml, js, bin,
                    rdf, jpg, png, gif, bmp, tiff)
  - ${BLUE}<headers>${OFF} - HTTP headers can be passed in the form ${YELLOW}HEADER${OFF}:${BLUE}VALUE${OFF}
  - ${MAGENTA}<parameters>${OFF} - REST operation parameters can be passed in the following
                   forms:
                   * ${YELLOW}KEY${OFF}=${BLUE}VALUE${OFF} - path or query parameters
  - ${MAGENTA}<body-parameters>${OFF} - simple JSON body content (first level only) can be build
                        using the following arguments:
                        * ${YELLOW}KEY${OFF}==${BLUE}VALUE${OFF} - body parameters which will be added to body
                                      JSON as '{ ..., "${YELLOW}KEY${OFF}": "${BLUE}VALUE${OFF}", ... }'
                        * ${YELLOW}KEY${OFF}:=${BLUE}VALUE${OFF} - body parameters which will be added to body
                                      JSON as '{ ..., "${YELLOW}KEY${OFF}": ${BLUE}VALUE${OFF}, ... }'

EOF
    echo -e "${BOLD}${WHITE}Authentication methods${OFF}"
    echo -e ""
    echo -e "  - ${BLUE}Basic AUTH${OFF} - add '-u <username>:<password>' before ${YELLOW}<operation>${OFF}"
    
    echo ""
    echo -e "${BOLD}${WHITE}Operations (grouped by tags)${OFF}"
    echo ""
    echo -e "${BOLD}${WHITE}[authentication]${OFF}"
read -r -d '' ops <<EOF
  ${CYAN}devFetchApiKey${OFF};Fetch an API key (development only)
  ${CYAN}fetchApiKey${OFF};Fetch an API key (production)
EOF
echo "  $ops" | column -t -s ';'
    echo ""
    echo -e "${BOLD}${WHITE}[messages]${OFF}"
read -r -d '' ops <<EOF
  ${CYAN}addReaction${OFF};Add an emoji reaction
  ${CYAN}checkMessagesMatchNarrow${OFF};Check if messages match a narrow
  ${CYAN}deleteMessage${OFF};Delete a message
  ${CYAN}getFileTemporaryUrl${OFF};Get public temporary URL
  ${CYAN}getMessageHistory${OFF};Get a message's edit history
  ${CYAN}getMessages${OFF};Get messages
  ${CYAN}getRawMessage${OFF};Get a message's raw Markdown
  ${CYAN}markAllAsRead${OFF};Mark all messages as read
  ${CYAN}markStreamAsRead${OFF};Mark messages in a stream as read
  ${CYAN}markTopicAsRead${OFF};Mark messages in a topic as read
  ${CYAN}removeReaction${OFF};Remove an emoji reaction
  ${CYAN}renderMessage${OFF};Render message
  ${CYAN}sendMessage${OFF};Send a message
  ${CYAN}updateMessage${OFF};Edit a message
  ${CYAN}updateMessageFlags${OFF};Update personal message flags
  ${CYAN}uploadFile${OFF};Upload a file
EOF
echo "  $ops" | column -t -s ';'
    echo ""
    echo -e "${BOLD}${WHITE}[realTimeEvents]${OFF}"
read -r -d '' ops <<EOF
  ${CYAN}deleteQueue${OFF};Delete an event queue
  ${CYAN}getEvents${OFF};Get events from an event queue
  ${CYAN}realTimePost${OFF};
  ${CYAN}registerQueue${OFF};Register an event queue
  ${CYAN}restErrorHandling${OFF};Error handling
EOF
echo "  $ops" | column -t -s ';'
    echo ""
    echo -e "${BOLD}${WHITE}[serverAndOrganizations]${OFF}"
read -r -d '' ops <<EOF
  ${CYAN}addCodePlayground${OFF};Add a code playground
  ${CYAN}addLinkifier${OFF};Add a linkifier
  ${CYAN}createCustomProfileField${OFF};Create a custom profile field
  ${CYAN}getCustomEmoji${OFF};Get all custom emoji
  ${CYAN}getCustomProfileFields${OFF};Get all custom profile fields
  ${CYAN}getLinkifiers${OFF};Get linkifiers
  ${CYAN}getServerSettings${OFF};Get server settings
  ${CYAN}removeCodePlayground${OFF};Remove a code playground
  ${CYAN}removeLinkifier${OFF};Remove a linkifier
  ${CYAN}reorderCustomProfileFields${OFF};Reorder custom profile fields
  ${CYAN}updateLinkifier${OFF};Update a linkifier
  ${CYAN}uploadCustomEmoji${OFF};Upload custom emoji
EOF
echo "  $ops" | column -t -s ';'
    echo ""
    echo -e "${BOLD}${WHITE}[streams]${OFF}"
read -r -d '' ops <<EOF
  ${CYAN}archiveStream${OFF};Archive a stream
  ${CYAN}createBigBlueButtonVideoCall${OFF};Create BigBlueButton video call
  ${CYAN}getStreamId${OFF};Get stream ID
  ${CYAN}getStreamTopics${OFF};Get topics in a stream
  ${CYAN}getStreams${OFF};Get all streams
  ${CYAN}getSubscriptionStatus${OFF};Get subscription status
  ${CYAN}getSubscriptions${OFF};Get subscribed streams
  ${CYAN}muteTopic${OFF};Topic muting
  ${CYAN}subscribe${OFF};Subscribe to a stream
  ${CYAN}unsubscribe${OFF};Unsubscribe from a stream
  ${CYAN}updateStream${OFF};Update a stream
  ${CYAN}updateSubscriptionSettings${OFF};Update subscription settings
  ${CYAN}updateSubscriptions${OFF};Update subscriptions
EOF
echo "  $ops" | column -t -s ';'
    echo ""
    echo -e "${BOLD}${WHITE}[users]${OFF}"
read -r -d '' ops <<EOF
  ${CYAN}createUser${OFF};Create a user
  ${CYAN}createUserGroup${OFF};Create a user group
  ${CYAN}deactivateOwnUser${OFF};Deactivate own user
  ${CYAN}deactivateUser${OFF};Deactivate a user
  ${CYAN}getAttachments${OFF};Get attachments
  ${CYAN}getOwnUser${OFF};Get own user
  ${CYAN}getUser${OFF};Get a user
  ${CYAN}getUserByEmail${OFF};Get a user by email
  ${CYAN}getUserGroups${OFF};Get user groups
  ${CYAN}getUserPresence${OFF};Get user presence
  ${CYAN}getUsers${OFF};Get all users
  ${CYAN}muteUser${OFF};Mute a user
  ${CYAN}reactivateUser${OFF};Reactivate a user
  ${CYAN}removeUserGroup${OFF};Delete a user group
  ${CYAN}setTypingStatus${OFF};Set \"typing\" status
  ${CYAN}unmuteUser${OFF};Unmute a user
  ${CYAN}updateDisplaySettings${OFF};Update display settings
  ${CYAN}updateNotificationSettings${OFF};Update notification settings
  ${CYAN}updateUser${OFF};Update a user
  ${CYAN}updateUserGroup${OFF};Update a user group
  ${CYAN}updateUserGroupMembers${OFF};Update user group members
EOF
echo "  $ops" | column -t -s ';'
    echo ""
    echo -e "${BOLD}${WHITE}[webhooks]${OFF}"
read -r -d '' ops <<EOF
  ${CYAN}zulipOutgoingWebhooks${OFF};Outgoing webhooks
EOF
echo "  $ops" | column -t -s ';'
    echo ""
    echo -e "${BOLD}${WHITE}Options${OFF}"
    echo -e "  -h,--help\\t\\t\\t\\tPrint this help"
    echo -e "  -V,--version\\t\\t\\t\\tPrint API version"
    echo -e "  --about\\t\\t\\t\\tPrint the information about service"
    echo -e "  --host ${CYAN}<url>${OFF}\\t\\t\\t\\tSpecify the host URL "
echo -e "              \\t\\t\\t\\t(e.g. 'https://example.zulipchat.com')"

    echo -e "  --force\\t\\t\\t\\tForce command invocation in spite of missing"
    echo -e "         \\t\\t\\t\\trequired parameters or wrong content type"
    echo -e "  --dry-run\\t\\t\\t\\tPrint out the cURL command without"
    echo -e "           \\t\\t\\t\\texecuting it"
    echo -e "  -nc,--no-colors\\t\\t\\tEnforce print without colors, otherwise autodected"
    echo -e "  -ac,--accept ${YELLOW}<mime-type>${OFF}\\t\\tSet the 'Accept' header in the request"
    echo -e "  -ct,--content-type ${YELLOW}<mime-type>${OFF}\\tSet the 'Content-type' header in "
    echo -e "                                \\tthe request"
    echo ""
}


##############################################################################
#
# Print REST service description
#
##############################################################################
print_about() {
    echo ""
    echo -e "${BOLD}${WHITE}Zulip REST API command line client (API version 1.0.0)${OFF}"
    echo ""
    echo -e "License: Apache 2.0"
    echo -e "Contact: "
    echo ""
read -r -d '' appdescription <<EOF

Powerful open source group chat
EOF
echo "$appdescription" | paste -sd' ' | fold -sw 80
}


##############################################################################
#
# Print REST api version
#
##############################################################################
print_version() {
    echo ""
    echo -e "${BOLD}Zulip REST API command line client (API version 1.0.0)${OFF}"
    echo ""
}

##############################################################################
#
# Print help for devFetchApiKey operation
#
##############################################################################
print_devFetchApiKey_help() {
    echo ""
    echo -e "${BOLD}${WHITE}devFetchApiKey - Fetch an API key (development only)${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "For easy testing of mobile apps and other clients and against Zulip
development servers, we support fetching a Zulip API key for any user
on the development server without authentication (so that they can
implement analogues of the one-click login process available for Zulip
development servers on the web).

**Note:** This endpoint is only available on Zulip development
servers; for obvious security reasons it will always return an error
in a Zulip production server.

'POST {{ api_url }}/v1/dev_fetch_api_key'" | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}username${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - The email address for the user that owns the API key.${YELLOW} Specify as: username=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;Success.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for fetchApiKey operation
#
##############################################################################
print_fetchApiKey_help() {
    echo ""
    echo -e "${BOLD}${WHITE}fetchApiKey - Fetch an API key (production)${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "This API endpoint is used by clients such as the Zulip mobile and
terminal apps to implement password-based authentication.  Given the
user's Zulip login credentials, it returns a Zulip API key that the client
can use to make requests requests as the user.

This endpoint is only useful for Zulip servers/organizations with
EmailAuthBackend or LDAPAuthBackend enabled.

The Zulip mobile apps also support SSO/social authentication (GitHub
auth, Google auth, SAML, etc.) that does not use this endpoint.  Instead,
the mobile apps reuse the web login flow passing the 'mobile_flow_otp' in
a webview, and the credentials are returned to the app (encrypted) via a redirect
to a 'zulip://' URL.

!!! warn \"\"
    **Note:** If you signed up using passwordless authentication and
    never had a password, you can [reset your password](/help/change-your-password).

    See the [API keys](/api/api-keys) documentation for
    more details on how to download API key manually.

In a [Zulip development environment](https://zulip.readthedocs.io/en/latest/development/overview.html),
see also [the unauthenticated variant](/api/dev-fetch-api-key)." | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}username${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - The username to be used for authentication (typically, the email
address, but depending on configuration, it could be an LDAP username).

See the 'require_email_format_usernames' parameter documented in
[GET /server_settings](/api/get-server-settings) for details.${YELLOW} Specify as: username=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}password${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - The user's Zulip password (or LDAP password, if LDAP authentication is in use).${YELLOW} Specify as: password=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;Valid credentials the client can use to access the Zulip API.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for addReaction operation
#
##############################################################################
print_addReaction_help() {
    echo ""
    echo -e "${BOLD}${WHITE}addReaction - Add an emoji reaction${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Add an [emoji reaction](/help/emoji-reactions) to a message.

'POST {{ api_url }}/v1/messages/{message_id}/reactions'" | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}message_id${OFF} ${BLUE}[integer]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - The target message's ID. ${YELLOW}Specify as: message_id=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}emoji_name${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - The target emoji's human-readable name.

To find an emoji's name, hover over a message to reveal
three icons on the right, then click the smiley face icon.
Images of available reaction emojis appear. Hover over the
emoji you want, and note that emoji's text name.${YELLOW} Specify as: emoji_name=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}emoji_code${OFF} ${BLUE}[string]${OFF} ${CYAN}(default: null)${OFF} - A unique identifier, defining the specific emoji codepoint requested,
within the namespace of the 'reaction_type'.

For most API clients, you won't need this, but it's important
for Zulip apps to handle rare corner cases when
adding/removing votes on an emoji reaction added previously by
another user.

If the existing reaction was added when the Zulip server was
using a previous version of the emoji data mapping between
Unicode codepoints and human-readable names, sending the
'emoji_code' in the data for the original reaction allows the
Zulip server to correctly interpret your upvote as an upvote
rather than a reaction with a \"diffenent\" emoji.${YELLOW} Specify as: emoji_code=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}reaction_type${OFF} ${BLUE}[string]${OFF} ${CYAN}(default: null)${OFF} - If an app is adding/removing a vote on an existing reaction,
it should pass this parameter using the value the server provided
for the existing reaction for specificity.  Supported values:

* 'unicode_emoji': Unicode emoji ('emoji_code' will be its Unicode codepoint).
* 'realm_emoji': Custom emoji. ('emoji_code' will be its ID).
* 'zulip_extra_emoji': Special emoji included with Zulip.  Exists to
   namespace the 'zulip' emoji.

**Changes**: In Zulip 3.0 (feature level 2), this become
optional for [custom emoji](/help/add-custom-emoji);
previously, this endpoint assumed 'unicode_emoji' if this
parameter was not specified.${YELLOW} Specify as: reaction_type=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;Success.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=400
    echo -e "${result_color_table[${code:0:1}]}  400;Bad request.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for checkMessagesMatchNarrow operation
#
##############################################################################
print_checkMessagesMatchNarrow_help() {
    echo ""
    echo -e "${BOLD}${WHITE}checkMessagesMatchNarrow - Check if messages match a narrow${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Check whether a set of messages match a [narrow](/api/construct-narrow).

'GET {{ api_url }}/v1/messages/matches_narrow'

For many common narrows (E.g. a topic), clients can write an
efficient client-side check to determine whether a
newly arrived message belongs in the view.

This endpoint is designed to allow clients to handle more complex narrows
for which the client does not (or in the case of full-text search,
cannot) implement this check.

The format of the 'match_subject' and 'match_content' objects is designed to match
those of 'GET /messages', so that a client can splice these fields into a
'message' object received from 'GET /events' and end up with an extended message
object identical to how a 'GET /messages' for the current narrow would have
returned the message." | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}msg_ids${OFF} ${BLUE}[array[integer]]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - List of IDs for the messages to check.${YELLOW} Specify as: msg_ids=value1 msg_ids=value2 msg_ids=...${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}narrow${OFF} ${BLUE}[array[map]]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - A structure defining the narrow to check against. See how to [construct a narrow](/api/construct-narrow).${YELLOW} Specify as: narrow=value1 narrow=value2 narrow=...${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;Success.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for deleteMessage operation
#
##############################################################################
print_deleteMessage_help() {
    echo ""
    echo -e "${BOLD}${WHITE}deleteMessage - Delete a message${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Permanently delete a message.

'DELETE {{ api_url }}/v1/messages/{msg_id}'

This API corresponds to the
[delete a message completely][delete-completely] feature documented in
the Zulip Help Center.

[delete-completely]: /help/edit-or-delete-a-message#delete-a-message-completely" | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}message_id${OFF} ${BLUE}[integer]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - The target message's ID. ${YELLOW}Specify as: message_id=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;Success.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=400
    echo -e "${result_color_table[${code:0:1}]}  400;Bad request.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for getFileTemporaryUrl operation
#
##############################################################################
print_getFileTemporaryUrl_help() {
    echo ""
    echo -e "${BOLD}${WHITE}getFileTemporaryUrl - Get public temporary URL${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Get a temporary URL for access to the file that doesn't require authentication." | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}realm_id_str${OFF} ${BLUE}[integer]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - The realm id. ${YELLOW}Specify as: realm_id_str=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}filename${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Path to the URL. ${YELLOW}Specify as: filename=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;Success.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for getMessageHistory operation
#
##############################################################################
print_getMessageHistory_help() {
    echo ""
    echo -e "${BOLD}${WHITE}getMessageHistory - Get a message's edit history${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Fetch the message edit history of a previously edited message.

'GET {{ api_url }}/v1/messages/{message_id}/history'

Note that edit history may be disabled in some organizations; see the
[Zulip Help Center documentation on editing messages][edit-settings].

[edit-settings]: /help/view-a-messages-edit-history" | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}message_id${OFF} ${BLUE}[integer]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - The target message's ID. ${YELLOW}Specify as: message_id=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;Success.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=400
    echo -e "${result_color_table[${code:0:1}]}  400;Bad request.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for getMessages operation
#
##############################################################################
print_getMessages_help() {
    echo ""
    echo -e "${BOLD}${WHITE}getMessages - Get messages${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Fetch message history from a Zulip server.

'GET {{ api_url }}/v1/messages'

This 'GET /api/v1/messages' endpoint is the primary way to fetch
message history from a Zulip server.  It is useful both for Zulip
clients (e.g. the web, desktop, mobile, and terminal clients) as well
as bots, API clients, backup scripts, etc.

By specifying a [narrow filter](/api/construct-narrow), you can use
this endpoint to fetch the messages matching any search query that is
supported by Zulip's powerful full-text search backend.

When a narrow is not specified, it can be used to fetch a user's
message history. (We recommend paginating to 1000 messages at a time.)

In either case, you specify an 'anchor' message (or ask the server to
calculate the first unread message for you and use that as the
anchor), as well as a number of messages before and after the anchor
message.  The server returns those messages, sorted by message ID, as
well as some metadata that makes it easy for a client to determine
whether there are more messages matching the query that were not
returned due to the 'num_before' and 'num_after' limits.

We recommend using 'num_before <= 1000' and 'num_after <= 1000' to
avoid generating very large HTTP responses. A maximum of 5000 messages
can be obtained per request; attempting to exceed this will result in an
error." | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}num_before${OFF} ${BLUE}[integer]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - The number of messages with IDs less than the anchor to retrieve.${YELLOW} Specify as: num_before=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}num_after${OFF} ${BLUE}[integer]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - The number of messages with IDs greater than the anchor to retrieve.${YELLOW} Specify as: num_after=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}anchor${OFF} ${BLUE}[OneOf&lt;string,integer&gt;]${OFF} ${CYAN}(default: null)${OFF} - Integer message ID to anchor fetching of new messages. Supports special
string values for when the client wants the server to compute the anchor
to use:

* 'newest': The most recent message.
* 'oldest': The oldest message.
* 'first_unread': The oldest unread message matching the
  query, if any; otherwise, the most recent message.

The special values of ''newest'' and ''oldest'' are also supported
for anchoring the query at the most recent or oldest messages.

**Changes**: String values are new in Zulip 3.0 (feature level 1).  The
  'first_unread' functionality was supported in Zulip 2.1.x
  and older by not sending anchor and using use_first_unread_anchor.

  In Zulip 2.1.x and older, 'oldest' can be emulated with
  'anchor=0', and 'newest' with 'anchor=10000000000000000'
  (that specific large value works around a bug in Zulip
  2.1.x and older in the 'found_newest' return value).${YELLOW} Specify as: anchor=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}narrow${OFF} ${BLUE}[array[map]]${OFF} ${CYAN}(default: [])${OFF} - The narrow where you want to fetch the messages from. See how to
[construct a narrow](/api/construct-narrow).${YELLOW} Specify as: narrow=value1 narrow=value2 narrow=...${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}client_gravatar${OFF} ${BLUE}[boolean]${OFF} ${CYAN}(default: false)${OFF} - Whether the client supports computing gravatars URLs.  If
enabled, 'avatar_url' will be included in the response only
if there is a Zulip avatar, and will be 'null' for users who
are using gravatar as their avatar.  This option
significantly reduces the compressed size of user data,
since gravatar URLs are long, random strings and thus do not
compress well. The 'client_gravatar' field is set to 'true' if
clients can compute their own gravatars.${YELLOW} Specify as: client_gravatar=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}apply_markdown${OFF} ${BLUE}[boolean]${OFF} ${CYAN}(default: true)${OFF} - If 'true', message content is returned in the rendered HTML
format. If 'false', message content is returned in the raw
Markdown-format text that user entered.${YELLOW} Specify as: apply_markdown=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}use_first_unread_anchor${OFF} ${BLUE}[boolean]${OFF} ${CYAN}(default: false)${OFF} - Legacy way to specify 'anchor=\"first_unread\"' in Zulip 2.1.x and older.

Whether to use the (computed by the server) first unread message
matching the narrow as the 'anchor'.  Mutually exclusive with 'anchor'.

**Changes**: Deprecated in Zulip 3.0, replaced by
'anchor=\"first_unread\"' instead.${YELLOW} Specify as: use_first_unread_anchor=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;Success.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for getRawMessage operation
#
##############################################################################
print_getRawMessage_help() {
    echo ""
    echo -e "${BOLD}${WHITE}getRawMessage - Get a message's raw Markdown${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Get the raw content of a message.

'GET {{ api_url }}/v1/messages/{msg_id}'

This is a rarely-used endpoint relevant for clients that primarily
work with HTML-rendered messages but might need to occasionally fetch
the message's raw Markdown (e.g. for pre-filling a message-editing
UI)." | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}message_id${OFF} ${BLUE}[integer]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - The target message's ID. ${YELLOW}Specify as: message_id=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;Success.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=400
    echo -e "${result_color_table[${code:0:1}]}  400;Bad request.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for markAllAsRead operation
#
##############################################################################
print_markAllAsRead_help() {
    echo ""
    echo -e "${BOLD}${WHITE}markAllAsRead - Mark all messages as read${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Marks all of the current user's unread messages as read.

'POST {{ api_url }}/v1/mark_all_as_read'" | paste -sd' ' | fold -sw 80
    echo -e ""
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;Success.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for markStreamAsRead operation
#
##############################################################################
print_markStreamAsRead_help() {
    echo ""
    echo -e "${BOLD}${WHITE}markStreamAsRead - Mark messages in a stream as read${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Mark all the unread messages in a stream as read." | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}stream_id${OFF} ${BLUE}[integer]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - The ID of the stream to access.${YELLOW} Specify as: stream_id=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;Success.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for markTopicAsRead operation
#
##############################################################################
print_markTopicAsRead_help() {
    echo ""
    echo -e "${BOLD}${WHITE}markTopicAsRead - Mark messages in a topic as read${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Mark all the unread messages in a topic as read." | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}stream_id${OFF} ${BLUE}[integer]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - The ID of the stream to access.${YELLOW} Specify as: stream_id=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}topic_name${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - The name of the topic whose messages should be marked as read.${YELLOW} Specify as: topic_name=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;Success.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for removeReaction operation
#
##############################################################################
print_removeReaction_help() {
    echo ""
    echo -e "${BOLD}${WHITE}removeReaction - Remove an emoji reaction${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Remove an [emoji reaction](/help/emoji-reactions) from a message.

'DELETE {{ api_url }}/v1/messages/{message_id}/reactions'" | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}message_id${OFF} ${BLUE}[integer]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - The target message's ID. ${YELLOW}Specify as: message_id=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}emoji_name${OFF} ${BLUE}[string]${OFF} ${CYAN}(default: null)${OFF} - The target emoji's human-readable name.

To find an emoji's name, hover over a message to reveal
three icons on the right, then click the smiley face icon.
Images of available reaction emojis appear. Hover over the
emoji you want, and note that emoji's text name.${YELLOW} Specify as: emoji_name=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}emoji_code${OFF} ${BLUE}[string]${OFF} ${CYAN}(default: null)${OFF} - A unique identifier, defining the specific emoji codepoint requested,
within the namespace of the 'reaction_type'.

For most API clients, you won't need this, but it's important
for Zulip apps to handle rare corner cases when
adding/removing votes on an emoji reaction added previously by
another user.

If the existing reaction was added when the Zulip server was
using a previous version of the emoji data mapping between
Unicode codepoints and human-readable names, sending the
'emoji_code' in the data for the original reaction allows the
Zulip server to correctly interpret your upvote as an upvote
rather than a reaction with a \"diffenent\" emoji.${YELLOW} Specify as: emoji_code=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}reaction_type${OFF} ${BLUE}[string]${OFF} ${CYAN}(default: null)${OFF} - If an app is adding/removing a vote on an existing reaction,
it should pass this parameter using the value the server provided
for the existing reaction for specificity.  Supported values:

* 'unicode_emoji': Unicode emoji ('emoji_code' will be its Unicode codepoint).
* 'realm_emoji': Custom emoji. ('emoji_code' will be its ID).
* 'zulip_extra_emoji': Special emoji included with Zulip.  Exists to
   namespace the 'zulip' emoji.

**Changes**: In Zulip 3.0 (feature level 2), this become
optional for [custom emoji](/help/add-custom-emoji);
previously, this endpoint assumed 'unicode_emoji' if this
parameter was not specified.${YELLOW} Specify as: reaction_type=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;Success.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=400
    echo -e "${result_color_table[${code:0:1}]}  400;Bad request.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for renderMessage operation
#
##############################################################################
print_renderMessage_help() {
    echo ""
    echo -e "${BOLD}${WHITE}renderMessage - Render message${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Render a message to HTML.

'POST {{ api_url }}/v1/messages/render'" | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}content${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - The content of the message. Maximum message size of 10000 bytes.${YELLOW} Specify as: content=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;Success.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for sendMessage operation
#
##############################################################################
print_sendMessage_help() {
    echo ""
    echo -e "${BOLD}${WHITE}sendMessage - Send a message${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Send a stream or a private message.

'POST {{ api_url }}/v1/messages'" | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}type${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - The type of message to be sent. 'private' for a private message and
'stream' for a stream message.${YELLOW} Specify as: type=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}to${OFF} ${BLUE}[array[integer]]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - For stream messages, either the name or integer ID of the stream. For
private messages, either a list containing integer user IDs or a list
containing string email addresses.

**Changes**: Support for using user/stream IDs was added in Zulip 2.0.0.${YELLOW} Specify as: to=value1 to=value2 to=...${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}content${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - The content of the message. Maximum message size of 10000 bytes.${YELLOW} Specify as: content=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}topic${OFF} ${BLUE}[string]${OFF} ${CYAN}(default: null)${OFF} - The topic of the message. Only required for stream messages
('type=\"stream\"'), ignored otherwise.

Maximum length of 60 characters.

**Changes**: New in Zulip 2.0.  Previous Zulip releases encoded
this as 'subject', which is currently a deprecated alias.${YELLOW} Specify as: topic=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}queue_id${OFF} ${BLUE}[string]${OFF} ${CYAN}(default: null)${OFF} - For clients supporting
[local echo](https://zulip.readthedocs.io/en/latest/subsystems/sending-messages.html#local-echo),
the [event queue](/api/register-queue)
ID for the client.  If passed, 'local_id' is required.  If the message is
successfully sent, the server will include 'local_id' in the 'message' event
that the client with this 'queue_id' will receive notifying it of the new message
via ['GET /events'](/api/get-events).  This lets the client know unambiguously
that it should replace the locally echoed message, rather than adding this new
message (which would be correct if the user had sent the new message from another
device).${YELLOW} Specify as: queue_id=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}local_id${OFF} ${BLUE}[string]${OFF} ${CYAN}(default: null)${OFF} - For clients supporting local echo, a unique string-format identifier
chosen freely by the client; the server will pass it back to the client without
inspecting it, as described in the 'queue_id' description.${YELLOW} Specify as: local_id=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;Success.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=400
    echo -e "${result_color_table[${code:0:1}]}  400;Bad request.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for updateMessage operation
#
##############################################################################
print_updateMessage_help() {
    echo ""
    echo -e "${BOLD}${WHITE}updateMessage - Edit a message${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Edit/update the content or topic of a message.

'PATCH {{ api_url }}/v1/messages/{msg_id}'

'{msg_id}' in the above URL should be replaced with the ID of the
message you wish you update.

You can [resolve topics](/help/resolve-a-topic) by editing the
topic to '✔ {original_topic}'.

**Note**: See [configuring message
editing][config-message-editing] for detailed documentation on
when users are allowed to edit topics.

[config-message-editing]: /help/configure-message-editing-and-deletion" | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}message_id${OFF} ${BLUE}[integer]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - The target message's ID. ${YELLOW}Specify as: message_id=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}topic${OFF} ${BLUE}[string]${OFF} ${CYAN}(default: null)${OFF} - The topic to move the message(s) to, to request changing the topic.
Should only be sent when changing the topic, and will throw an error
if the target message is not a stream message.

Maximum length of 60 characters.

**Changes**: New in Zulip 2.0.  Previous Zulip releases encoded
this as 'subject', which is currently a deprecated alias.${YELLOW} Specify as: topic=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}propagate_mode${OFF} ${BLUE}[string]${OFF} ${CYAN}(default: change_one)${OFF} - Which message(s) should be edited: just the one indicated in
'message_id', messages in the same topic that had been sent after this
one, or all of them.

Only the default value of 'change_one' is valid when
editing only the content of a message.

This parameter determines both which messages get moved and also whether
clients that are currently narrowed to the topic containing the message
should navigate or adjust their compose box recipient to point to the
post-edit stream/topic.${YELLOW} Specify as: propagate_mode=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}send_notification_to_old_thread${OFF} ${BLUE}[boolean]${OFF} ${CYAN}(default: true)${OFF} - Whether to send breadcrumb message to the old thread to
notify users where the messages were moved to.

**Changes**: New in Zulip 3.0 (feature level 9).${YELLOW} Specify as: send_notification_to_old_thread=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}send_notification_to_new_thread${OFF} ${BLUE}[boolean]${OFF} ${CYAN}(default: true)${OFF} - Whether to send a notification message to the new thread to
notify users where the messages came from.

**Changes**: New in Zulip 3.0 (feature level 9).${YELLOW} Specify as: send_notification_to_new_thread=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}content${OFF} ${BLUE}[string]${OFF} ${CYAN}(default: null)${OFF} - The content of the message. Maximum message size of 10000 bytes.${YELLOW} Specify as: content=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}stream_id${OFF} ${BLUE}[integer]${OFF} ${CYAN}(default: null)${OFF} - The stream ID to move the message(s) to, to request moving
messages to another stream.

Should only be sent when changing the stream, and will throw an error
if the target message is not a stream message.${YELLOW} Specify as: stream_id=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;Success.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=400
    echo -e "${result_color_table[${code:0:1}]}  400;Bad request.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for updateMessageFlags operation
#
##############################################################################
print_updateMessageFlags_help() {
    echo ""
    echo -e "${BOLD}${WHITE}updateMessageFlags - Update personal message flags${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Add or remove personal message flags like 'read' and 'starred'
on a collection of message IDs.

'POST {{ api_url }}/v1/messages/flags'

For updating the 'read' flag on common collections of messages, see also
the
[special endpoints for marking message as read in bulk](/api/mark-all-as-read)." | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}messages${OFF} ${BLUE}[array[integer]]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - An array containing the IDs of the target messages.${YELLOW} Specify as: messages=value1 messages=value2 messages=...${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}op${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Whether to 'add' the flag or 'remove' it.${YELLOW} Specify as: op=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}flag${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - The flag that should be added/removed.${YELLOW} Specify as: flag=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;Success.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for uploadFile operation
#
##############################################################################
print_uploadFile_help() {
    echo ""
    echo -e "${BOLD}${WHITE}uploadFile - Upload a file${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Upload a single file and get the corresponding URI.

'POST {{ api_url }}/v1/user_uploads'

Initially, only you will be able to access the link.  To share the
uploaded file, you'll need to [send a message][send-message]
containing the resulting link.  Users who can already access the link
can reshare it with other users by sending additional Zulip messages
containing the link.

[uploaded-files]: /help/manage-your-uploaded-files
[send-message]: /api/send-message" | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;Success.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for deleteQueue operation
#
##############################################################################
print_deleteQueue_help() {
    echo ""
    echo -e "${BOLD}${WHITE}deleteQueue - Delete an event queue${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Delete a previously registered queue.

'DELETE {{ api_url }}/v1/events'" | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}queue_id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - The ID of an event queue that was previously registered via 'POST
/api/v1/register' (see [Register a queue](/api/register-queue)).${YELLOW} Specify as: queue_id=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;Success.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=400
    echo -e "${result_color_table[${code:0:1}]}  400;Bad request.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for getEvents operation
#
##############################################################################
print_getEvents_help() {
    echo ""
    echo -e "${BOLD}${WHITE}getEvents - Get events from an event queue${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "'GET {{ api_url }}/v1/events'

This endpoint allows you to receive new events from
[a registered event queue](/api/register-queue).

Long-lived clients should use the
'event_queue_longpoll_timeout_seconds' property returned by
'POST /register' as the client-side HTTP request timeout for
calls to this endpoint.  It is guaranteed to be higher than
heartbeat frequency and should be respected by clients to
avoid breaking when heartbeat frequency increases." | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}queue_id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - The ID of an event queue that was previously registered via 'POST
/api/v1/register' (see [Register a queue](/api/register-queue)).${YELLOW} Specify as: queue_id=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}last_event_id${OFF} ${BLUE}[integer]${OFF} ${CYAN}(default: null)${OFF} - The highest event ID in this queue that you've received and
wish to acknowledge. See the [code for
'call_on_each_event'](https://github.com/zulip/python-zulip-api/blob/master/zulip/zulip/__init__.py)
in the [zulip Python
module](https://github.com/zulip/python-zulip-api) for an
example implementation of correctly processing each event
exactly once.${YELLOW} Specify as: last_event_id=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}dont_block${OFF} ${BLUE}[boolean]${OFF} ${CYAN}(default: false)${OFF} - Set to 'true' if the client is requesting a nonblocking reply. If not
specified, the request will block until either a new event is available
or a few minutes have passed, in which case the server will send the
client a heartbeat event.${YELLOW} Specify as: dont_block=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;Success.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=400
    echo -e "${result_color_table[${code:0:1}]}  400;Bad request.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for realTimePost operation
#
##############################################################################
print_realTimePost_help() {
    echo ""
    echo -e "${BOLD}${WHITE}realTimePost - ${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "(Ignored)" | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}event_types${OFF} ${BLUE}[array[string]]${OFF} ${CYAN}(default: null)${OFF} - A JSON-encoded array indicating which types of events you're interested
in. Values that you might find useful include:

  * **message** (messages)
  * **subscription** (changes in your subscriptions)
  * **realm_user** (changes to users in the organization and
    their properties, such as their name).

If you do not specify this parameter, you will receive all
events, and have to filter out the events not relevant to
your client in your client code.  For most applications, one
is only interested in messages, so one specifies:
'event_types=['message']'

Event types not supported by the server are ignored, in order to simplify
the implementation of client apps that support multiple server versions.${YELLOW} Specify as: event_types=value1 event_types=value2 event_types=...${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}narrow${OFF} ${BLUE}[array[array[string]]]${OFF} ${CYAN}(default: [])${OFF} - A JSON-encoded array of arrays of length 2 indicating the
narrow for which you'd like to receive events for. For
instance, to receive events for the stream 'Denmark', you
would specify 'narrow=[['stream', 'Denmark']]'.  Another
example is 'narrow=[['is', 'private']]' for private messages.
Default is '[]'.${YELLOW} Specify as: narrow=value1 narrow=value2 narrow=...${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}all_public_streams${OFF} ${BLUE}[boolean]${OFF} ${CYAN}(default: false)${OFF} - Whether you would like to request message events from all public
streams.  Useful for workflow bots that you'd like to see all new messages
sent to public streams.  (You can also subscribe the user to private streams).${YELLOW} Specify as: all_public_streams=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;Success${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for registerQueue operation
#
##############################################################################
print_registerQueue_help() {
    echo ""
    echo -e "${BOLD}${WHITE}registerQueue - Register an event queue${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "'POST {{ api_url }}/v1/register'

This powerful endpoint can be used to register a Zulip \"event queue\"
(subscribed to certain types of \"events\", or updates to the messages
and other Zulip data the current user has access to), as well as to
fetch the current state of that data.

('register' also powers the 'call_on_each_event' Python API, and is
intended primarily for complex applications for which the more convenient
'call_on_each_event' API is insufficient).

This endpoint returns a 'queue_id' and a 'last_event_id'; these can be
used in subsequent calls to the
[\"events\" endpoint](/api/get-events) to request events from
the Zulip server using long-polling.

The server will queue events for up to 10 minutes of inactivity.
After 10 minutes, your event queue will be garbage-collected.  The
server will send 'heartbeat' events every minute, which makes it easy
to implement a robust client that does not miss events unless the
client loses network connectivity with the Zulip server for 10 minutes
or longer.

Once the server garbage-collects your event queue, the server will
[return an error](/api/get-events#bad_event_queue_id-errors)
with a code of 'BAD_EVENT_QUEUE_ID' if you try to fetch events from
the event queue.  Your software will need to handle that error
condition by re-initializing itself (e.g. this is what triggers your
browser reloading the Zulip web app when your laptop comes back online
after being offline for more than 10 minutes).

When prototyping with this API, we recommend first calling 'register'
with no 'event_types' parameter to see all the available data from all
supported event types.  Before using your client in production, you
should set appropriate 'event_types' and 'fetch_event_types' filters
so that your client only requests the data it needs.  A few minutes
doing this often saves 90% of the total bandwidth and other resources
consumed by a client using this API.

See the
[events system developer documentation](https://zulip.readthedocs.io/en/latest/subsystems/events-system.html)
if you need deeper details about how the Zulip event queue system
works, avoids clients needing to worry about large classes of
potentially messy races, etc." | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}apply_markdown${OFF} ${BLUE}[boolean]${OFF} ${CYAN}(default: false)${OFF} - Set to 'true' if you would like the content to be rendered in HTML
format (otherwise the API will return the raw text that the user
entered)${YELLOW} Specify as: apply_markdown=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}client_gravatar${OFF} ${BLUE}[boolean]${OFF} ${CYAN}(default: false)${OFF} - Whether the client supports computing gravatars URLs.  If
enabled, 'avatar_url' will be included in the response only
if there is a Zulip avatar, and will be 'null' for users who
are using gravatar as their avatar.  This option
significantly reduces the compressed size of user data,
since gravatar URLs are long, random strings and thus do not
compress well. The 'client_gravatar' field is set to 'true' if
clients can compute their own gravatars.${YELLOW} Specify as: client_gravatar=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}slim_presence${OFF} ${BLUE}[boolean]${OFF} ${CYAN}(default: false)${OFF} - Setting this to 'true' will make presence dictionaries be keyed by
user_id instead of email.

**Changes**: New in Zulip 3.0 (Unstable with no feature level yet).${YELLOW} Specify as: slim_presence=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}event_types${OFF} ${BLUE}[array[string]]${OFF} ${CYAN}(default: null)${OFF} - A JSON-encoded array indicating which types of events you're interested
in. Values that you might find useful include:

  * **message** (messages)
  * **subscription** (changes in your subscriptions)
  * **realm_user** (changes to users in the organization and
    their properties, such as their name).

If you do not specify this parameter, you will receive all
events, and have to filter out the events not relevant to
your client in your client code.  For most applications, one
is only interested in messages, so one specifies:
'event_types=['message']'

Event types not supported by the server are ignored, in order to simplify
the implementation of client apps that support multiple server versions.${YELLOW} Specify as: event_types=value1 event_types=value2 event_types=...${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}all_public_streams${OFF} ${BLUE}[boolean]${OFF} ${CYAN}(default: false)${OFF} - Whether you would like to request message events from all public
streams.  Useful for workflow bots that you'd like to see all new messages
sent to public streams.  (You can also subscribe the user to private streams).${YELLOW} Specify as: all_public_streams=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}include_subscribers${OFF} ${BLUE}[boolean]${OFF} ${CYAN}(default: false)${OFF} - Whether each returned stream object should include a 'subscribers'
field containing a list of the user IDs of its subscribers.

(This may be significantly slower in organizations with
thousands of users subscribed to many streams.)

**Changes**: New in Zulip 2.1.0.${YELLOW} Specify as: include_subscribers=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}client_capabilities${OFF} ${BLUE}[map]${OFF} ${CYAN}(default: null)${OFF} - Dictionary containing details on features the client supports that are
relevant to the format of responses sent by the server.

* 'notification_settings_null': Boolean for whether the
  client can handle the current API with null values for
  stream-level notification settings (which means the stream
  is not customized and should inherit the user's global
  notification settings for stream messages).  New in Zulip
  2.1.0; in earlier Zulip releases, stream-level
  notification settings were simple booleans.

* 'bulk_message_deletion': Boolean for whether the client's
   handler for the 'delete_message' event type has been
   updated to process the new bulk format (with a
   'message_ids', rather than a singleton 'message_id').
   Otherwise, the server will send 'delete_message' events
   in a loop.  New in Zulip 3.0 (feature level 13).  This
   capability is for backwards-compatibility; it will be
   required in a future server release.

* 'user_avatar_url_field_optional': Boolean for whether the
   client required avatar URLs for all users, or supports
   using 'GET /avatar/{user_id}' to access user avatars.  If the
   client has this capability, the server may skip sending a
   'avatar_url' field in the 'realm_user' at its sole discretion
   to optimize network performance.  This is an important optimization
   in organizations with 10,000s of users.
   New in Zulip 3.0 (feature level 18).

* 'stream_typing_notifications': Boolean for whether the client
  supports stream typing notifications.

  New in Zulip 4.0 (feature level 58).  This capability is
  for backwards-compatibility; it will be required in a
  future server release.${YELLOW} Specify as: client_capabilities=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}fetch_event_types${OFF} ${BLUE}[array[string]]${OFF} ${CYAN}(default: null)${OFF} - Same as the 'event_types' parameter except that the values in
'fetch_event_types' are used to fetch initial data. If
'fetch_event_types' is not provided, 'event_types' is used and if
'event_types' is not provided, this parameter defaults to 'None'.

Event types not supported by the server are ignored, in order to simplify
the implementation of client apps that support multiple server versions.${YELLOW} Specify as: fetch_event_types=value1 fetch_event_types=value2 fetch_event_types=...${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}narrow${OFF} ${BLUE}[array[array[string]]]${OFF} ${CYAN}(default: [])${OFF} - A JSON-encoded array of arrays of length 2 indicating the
narrow for which you'd like to receive events for. For
instance, to receive events for the stream 'Denmark', you
would specify 'narrow=[['stream', 'Denmark']]'.  Another
example is 'narrow=[['is', 'private']]' for private messages.
Default is '[]'.${YELLOW} Specify as: narrow=value1 narrow=value2 narrow=...${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;Success.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for restErrorHandling operation
#
##############################################################################
print_restErrorHandling_help() {
    echo ""
    echo -e "${BOLD}${WHITE}restErrorHandling - Error handling${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Common error to many endpoints" | paste -sd' ' | fold -sw 80
    echo -e ""
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=400
    echo -e "${result_color_table[${code:0:1}]}  400;Bad request.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=401
    echo -e "${result_color_table[${code:0:1}]}  401;Unauthorized.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=429
    echo -e "${result_color_table[${code:0:1}]}  429;Rate limit exceeded.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for addCodePlayground operation
#
##############################################################################
print_addCodePlayground_help() {
    echo ""
    echo -e "${BOLD}${WHITE}addCodePlayground - Add a code playground${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Configure [code playgrounds](/help/code-blocks#code-playgrounds) for the organization.

'POST {{ api_url }}/v1/realm/playgrounds'

**Changes**: New in Zulip 4.0 (feature level 49). A parameter encoding bug was
fixed in Zulip 4.0 (feature level 57)." | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}name${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - The user-visible display name of the playground which can be
used to pick the target playground, especially when multiple
playground options exist for that programming language.${YELLOW} Specify as: name=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}pygments_language${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - The name of the Pygments language lexer for that
programming language.${YELLOW} Specify as: pygments_language=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}url_prefix${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - The url prefix for the playground.${YELLOW} Specify as: url_prefix=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;Success.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for addLinkifier operation
#
##############################################################################
print_addLinkifier_help() {
    echo ""
    echo -e "${BOLD}${WHITE}addLinkifier - Add a linkifier${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Configure [linkifiers](/help/add-a-custom-linkifier),
regular expression patterns that are automatically linkified when they
appear in messages and topics.

'POST {{ api_url }}/v1/realm/filters'" | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}pattern${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - The [Python regular
expression](https://docs.python.org/3/howto/regex.html) that should
trigger the linkifier.${YELLOW} Specify as: pattern=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}url_format_string${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - The URL used for the link. If you used named groups for the 'pattern',
you can insert their content here with
'%(name_of_the_capturing_group)s'.${YELLOW} Specify as: url_format_string=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;Success.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for createCustomProfileField operation
#
##############################################################################
print_createCustomProfileField_help() {
    echo ""
    echo -e "${BOLD}${WHITE}createCustomProfileField - Create a custom profile field${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "[Create a custom profile field](/help/add-custom-profile-fields) in the user's organization.

'POST {{ api_url }}/v1/realm/profile_fields'" | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}field_type${OFF} ${BLUE}[integer]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - The field type can be any of the supported custom profile field types. See the
[custom profile fields documentation](/help/add-custom-profile-fields)
more details on what each type means.

* **1**: Short text
* **2**: Long text
* **3**: List of options
* **4**: Date picker
* **5**: Link
* **6**: Person picker
* **7**: External account${YELLOW} Specify as: field_type=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}name${OFF} ${BLUE}[string]${OFF} ${CYAN}(default: null)${OFF} - The name of the custom profile field, which will appear both in
user-facing settings UI for configuring custom profile fields and
in UI displaying a user's profile.${YELLOW} Specify as: name=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}hint${OFF} ${BLUE}[string]${OFF} ${CYAN}(default: null)${OFF} - The help text to be displayed for the custom profile field in user-facing
settings UI for configuring custom profile fields.${YELLOW} Specify as: hint=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}field_data${OFF} ${BLUE}[map]${OFF} ${CYAN}(default: null)${OFF} - Field types 3 (List of options) and 7 (External account) support storing
additional configuration for the field type in the 'field_data' attribute.

For field type 3 (List of options), this attribute is a JSON dictionary
defining the choices and the order they will be displayed in the
dropdown UI for individual users to select an option.

The interface for field type 7 is not yet stabilized.${YELLOW} Specify as: field_data=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;Success.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for getCustomEmoji operation
#
##############################################################################
print_getCustomEmoji_help() {
    echo ""
    echo -e "${BOLD}${WHITE}getCustomEmoji - Get all custom emoji${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Get all the custom emoji in the user's organization.

'GET {{ api_url }}/v1/realm/emoji'" | paste -sd' ' | fold -sw 80
    echo -e ""
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;Success.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for getCustomProfileFields operation
#
##############################################################################
print_getCustomProfileFields_help() {
    echo ""
    echo -e "${BOLD}${WHITE}getCustomProfileFields - Get all custom profile fields${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Get all the [custom profile fields](/help/add-custom-profile-fields)
configured for the user's organization.

'GET {{ api_url }}/v1/realm/profile_fields'" | paste -sd' ' | fold -sw 80
    echo -e ""
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;Success.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for getLinkifiers operation
#
##############################################################################
print_getLinkifiers_help() {
    echo ""
    echo -e "${BOLD}${WHITE}getLinkifiers - Get linkifiers${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "List all of an organization's configured
[linkifiers](/help/add-a-custom-linkifier), regular
expression patterns that are automatically linkified when they appear
in messages and topics.

'GET {{ api_url }}/v1/realm/linkifiers'

**Changes**: New in Zulip 4.0 (feature level 54). On older versions,
a similar 'GET /realm/filters' endpoint was available with each entry in
a '[pattern, url_format, id]' tuple format." | paste -sd' ' | fold -sw 80
    echo -e ""
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;Success.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for getServerSettings operation
#
##############################################################################
print_getServerSettings_help() {
    echo ""
    echo -e "${BOLD}${WHITE}getServerSettings - Get server settings${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Fetch global settings for a Zulip server.

'GET {{ api_url }}/v1/server_settings'

**Note:** this endpoint does not require any authentication at all, and you can use it to check:

* If this is a Zulip server, and if so, what version of Zulip it's running.
* What a Zulip client (e.g. a mobile app or
[zulip-terminal](https://github.com/zulip/zulip-terminal/)) needs to
know in order to display a login prompt for the server (e.g. what
authentication methods are available)." | paste -sd' ' | fold -sw 80
    echo -e ""
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;Success.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for removeCodePlayground operation
#
##############################################################################
print_removeCodePlayground_help() {
    echo ""
    echo -e "${BOLD}${WHITE}removeCodePlayground - Remove a code playground${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Remove a [code playground](/help/code-blocks#code-playgrounds) previously
configured for an organization.

'DELETE {{ api_url }}/v1/realm/playgrounds/{playground_id}'

**Changes**: New in Zulip 4.0 (feature level 49)." | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}playground_id${OFF} ${BLUE}[integer]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - The ID of the playground that you want to remove. ${YELLOW}Specify as: playground_id=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;Success.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for removeLinkifier operation
#
##############################################################################
print_removeLinkifier_help() {
    echo ""
    echo -e "${BOLD}${WHITE}removeLinkifier - Remove a linkifier${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Remove [linkifiers](/help/add-a-custom-linkifier), regular
expression patterns that are automatically linkified when they appear
in messages and topics.

'DELETE {{ api_url }}/v1/realm/filters/{filter_id}'" | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}filter_id${OFF} ${BLUE}[integer]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - The ID of the linkifier that you want to remove. ${YELLOW}Specify as: filter_id=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;Success.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for reorderCustomProfileFields operation
#
##############################################################################
print_reorderCustomProfileFields_help() {
    echo ""
    echo -e "${BOLD}${WHITE}reorderCustomProfileFields - Reorder custom profile fields${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Reorder the custom profile fields in the user's organization.

'PATCH {{ api_url }}/v1/realm/profile_fields'

Custom profile fields are displayed in Zulip UI widgets in order; this
endpoint allows administrative settings UI to change the field ordering.

This endpoint is used to implement the dragging feature described in the
[custom profile fields documentation](/help/add-custom-profile-fields)." | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}order${OFF} ${BLUE}[array[integer]]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - A list of the IDs of all the custom profile fields defined in this
organization, in the desired new order.${YELLOW} Specify as: order=value1 order=value2 order=...${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;Success.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for updateLinkifier operation
#
##############################################################################
print_updateLinkifier_help() {
    echo ""
    echo -e "${BOLD}${WHITE}updateLinkifier - Update a linkifier${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Update a [linkifier](/help/add-a-custom-linkifier), regular
expression patterns that are automatically linkified when they appear
in messages and topics.

'PATCH {{ api_url }}/v1/realm/filters/{filter_id}'

**Changes**: New in Zulip 4.0 (feature level 57)." | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}filter_id${OFF} ${BLUE}[integer]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - The ID of the linkifier that you want to update. ${YELLOW}Specify as: filter_id=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}pattern${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - The [Python regular
expression](https://docs.python.org/3/howto/regex.html) that should
trigger the linkifier.${YELLOW} Specify as: pattern=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}url_format_string${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - The URL used for the link. If you used named groups for the 'pattern',
you can insert their content here with
'%(name_of_the_capturing_group)s'.${YELLOW} Specify as: url_format_string=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;Success.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for uploadCustomEmoji operation
#
##############################################################################
print_uploadCustomEmoji_help() {
    echo ""
    echo -e "${BOLD}${WHITE}uploadCustomEmoji - Upload custom emoji${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "This endpoint is used to upload a custom emoji for use in the user's
organization.  Access to this endpoint depends on the
[organization's configuration](https://zulip.com/help/only-allow-admins-to-add-emoji).

'POST {{ api_url }}/v1/realm/emoji/{emoji_name}'" | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}emoji_name${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - The name that should be associated with the uploaded emoji image/gif.
The emoji name can only contain letters, numbers, dashes, and spaces.
Upper and lower case letters are treated the same, and underscores (_)
are treated the same as spaces (consistent with how the Zulip UI
handles emoji). ${YELLOW}Specify as: emoji_name=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;Success.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for archiveStream operation
#
##############################################################################
print_archiveStream_help() {
    echo ""
    echo -e "${BOLD}${WHITE}archiveStream - Archive a stream${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "[Archive the stream](/help/archive-a-stream) with the ID 'stream_id'.

'DELETE {{ api_url }}/v1/streams/{stream_id}'" | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}stream_id${OFF} ${BLUE}[integer]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - The ID of the stream to access. ${YELLOW}Specify as: stream_id=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;Success.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=400
    echo -e "${result_color_table[${code:0:1}]}  400;Bad request.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for createBigBlueButtonVideoCall operation
#
##############################################################################
print_createBigBlueButtonVideoCall_help() {
    echo ""
    echo -e "${BOLD}${WHITE}createBigBlueButtonVideoCall - Create BigBlueButton video call${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Create a video call URL for a BigBlueButton video call.
Requires BigBlueButton to be configured on the Zulip server." | paste -sd' ' | fold -sw 80
    echo -e ""
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;Success.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for getStreamId operation
#
##############################################################################
print_getStreamId_help() {
    echo ""
    echo -e "${BOLD}${WHITE}getStreamId - Get stream ID${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Get the unique ID of a given stream.

'GET {{ api_url }}/v1/get_stream_id'" | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}stream${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - The name of the stream to access.${YELLOW} Specify as: stream=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;Success.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=400
    echo -e "${result_color_table[${code:0:1}]}  400;Bad request.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for getStreamTopics operation
#
##############################################################################
print_getStreamTopics_help() {
    echo ""
    echo -e "${BOLD}${WHITE}getStreamTopics - Get topics in a stream${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Get all the topics in a specific stream

'GET {{ api_url }}/v1/users/me/{stream_id}/topics'" | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}stream_id${OFF} ${BLUE}[integer]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - The ID of the stream to access. ${YELLOW}Specify as: stream_id=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;Success.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=400
    echo -e "${result_color_table[${code:0:1}]}  400;Bad request.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for getStreams operation
#
##############################################################################
print_getStreams_help() {
    echo ""
    echo -e "${BOLD}${WHITE}getStreams - Get all streams${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Get all streams that the user has access to.

'GET {{ api_url }}/v1/streams'" | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}include_public${OFF} ${BLUE}[boolean]${OFF} ${CYAN}(default: true)${OFF} - Include all public streams.${YELLOW} Specify as: include_public=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}include_web_public${OFF} ${BLUE}[boolean]${OFF} ${CYAN}(default: false)${OFF} - Include all web public streams.${YELLOW} Specify as: include_web_public=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}include_subscribed${OFF} ${BLUE}[boolean]${OFF} ${CYAN}(default: true)${OFF} - Include all streams that the user is subscribed to.${YELLOW} Specify as: include_subscribed=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}include_all_active${OFF} ${BLUE}[boolean]${OFF} ${CYAN}(default: false)${OFF} - Include all active streams. The user must have administrative privileges
to use this parameter.${YELLOW} Specify as: include_all_active=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}include_default${OFF} ${BLUE}[boolean]${OFF} ${CYAN}(default: false)${OFF} - Include all default streams for the user's realm.${YELLOW} Specify as: include_default=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}include_owner_subscribed${OFF} ${BLUE}[boolean]${OFF} ${CYAN}(default: false)${OFF} - If the user is a bot, include all streams that the bot's owner is
subscribed to.${YELLOW} Specify as: include_owner_subscribed=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;Success.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=400
    echo -e "${result_color_table[${code:0:1}]}  400;Bad request.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for getSubscriptionStatus operation
#
##############################################################################
print_getSubscriptionStatus_help() {
    echo ""
    echo -e "${BOLD}${WHITE}getSubscriptionStatus - Get subscription status${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Check whether a user is subscribed to a stream.

'GET {{ api_url }}/v1/users/{user_id}/subscriptions/{stream_id}'

**Changes**: New in Zulip 3.0 (feature level 11)." | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}user_id${OFF} ${BLUE}[integer]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - The target user's ID. ${YELLOW}Specify as: user_id=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}stream_id${OFF} ${BLUE}[integer]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - The ID of the stream to access. ${YELLOW}Specify as: stream_id=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;Success${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for getSubscriptions operation
#
##############################################################################
print_getSubscriptions_help() {
    echo ""
    echo -e "${BOLD}${WHITE}getSubscriptions - Get subscribed streams${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Get all streams that the user is subscribed to.

'GET {{ api_url }}/v1/users/me/subscriptions'" | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}include_subscribers${OFF} ${BLUE}[boolean]${OFF} ${CYAN}(default: false)${OFF} - Whether each returned stream object should include a 'subscribers'
field containing a list of the user IDs of its subscribers.

(This may be significantly slower in organizations with
thousands of users subscribed to many streams.)

**Changes**: New in Zulip 2.1.0.${YELLOW} Specify as: include_subscribers=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;Success.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for muteTopic operation
#
##############################################################################
print_muteTopic_help() {
    echo ""
    echo -e "${BOLD}${WHITE}muteTopic - Topic muting${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "This endpoint mutes/unmutes a topic within a stream that the current
user is subscribed to.  Muted topics are displayed faded in the Zulip
UI, and are not included in the user's unread count totals.

'PATCH {{ api_url }}/v1/users/me/subscriptions/muted_topics'" | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}topic${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - The topic to (un)mute. Note that the request will succeed regardless of
whether any messages have been sent to the specified topic.${YELLOW} Specify as: topic=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}op${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Whether to mute ('add') or unmute ('remove') the provided topic.${YELLOW} Specify as: op=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}stream${OFF} ${BLUE}[string]${OFF} ${CYAN}(default: null)${OFF} - The name of the stream to access.${YELLOW} Specify as: stream=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}stream_id${OFF} ${BLUE}[integer]${OFF} ${CYAN}(default: null)${OFF} - The ID of the stream to access.${YELLOW} Specify as: stream_id=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;Success.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=400
    echo -e "${result_color_table[${code:0:1}]}  400;Bad request.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for subscribe operation
#
##############################################################################
print_subscribe_help() {
    echo ""
    echo -e "${BOLD}${WHITE}subscribe - Subscribe to a stream${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Subscribe one or more users to one or more streams.

'POST {{ api_url }}/v1/users/me/subscriptions'

If any of the specified streams do not exist, they are automatically
created.  The initial [stream settings](/api/update-stream) will be determined
by the optional parameters like 'invite_only' detailed below." | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}subscriptions${OFF} ${BLUE}[array[map]]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - A list of dictionaries containing the key 'name' and value
specifying the name of the stream to subscribe. If the stream does not
exist a new stream is created. The description of the stream created can
be specified by setting the dictionary key 'description' with an
appropriate value.${YELLOW} Specify as: subscriptions=value1 subscriptions=value2 subscriptions=...${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}principals${OFF} ${BLUE}[array[OneOf&lt;string,integer&gt;]]${OFF} ${CYAN}(default: null)${OFF} - A list of user ids (preferred) or Zulip display email
addresses of the users to be subscribed to or unsubscribed
from the streams specified in the 'subscriptions' parameter. If
not provided, then the requesting user/bot is subscribed.

**Changes**: The integer format is new in Zulip 3.0 (feature level 9).${YELLOW} Specify as: principals=value1 principals=value2 principals=...${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}authorization_errors_fatal${OFF} ${BLUE}[boolean]${OFF} ${CYAN}(default: true)${OFF} - A boolean specifying whether authorization errors (such as when the
requesting user is not authorized to access a private stream) should be
considered fatal or not. When 'True', an authorization error is reported
as such. When set to 'False', the response will be a 200 and any streams
where the request encountered an authorization error will be listed
in the 'unauthorized' key.${YELLOW} Specify as: authorization_errors_fatal=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}announce${OFF} ${BLUE}[boolean]${OFF} ${CYAN}(default: false)${OFF} - If one of the streams specified did not exist previously and is thus craeted
by this call, this determines whether [notification bot](/help/configure-notification-bot)
will send an announcement about the new stream's creation.${YELLOW} Specify as: announce=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}invite_only${OFF} ${BLUE}[boolean]${OFF} ${CYAN}(default: false)${OFF} - As described above, this endpoint will create a new stream if passed
a stream name that doesn't already exist.  This parameters and the ones
that follow are used to request an initial configuration of a created
stream; they are ignored for streams that already exist.

This parameter determines whether any newly created streams will be
private streams.${YELLOW} Specify as: invite_only=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}history_public_to_subscribers${OFF} ${BLUE}[boolean]${OFF} ${CYAN}(default: null)${OFF} - Whether the stream's message history should be available to
newly subscribed members, or users can only access messages
they actually received while subscribed to the stream.

Corresponds to the [shared history](/help/stream-permissions)
option in documentation.${YELLOW} Specify as: history_public_to_subscribers=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}stream_post_policy${OFF} ${BLUE}[integer]${OFF} ${CYAN}(default: 1)${OFF} - Policy for which users can post messages to the stream.

* 1 => Any user can post.
* 2 => Only administrators can post.
* 3 => Only full members can post.
* 4 => Only moderators can post.

**Changes**: New in Zulip 3.0, replacing the previous
'is_announcement_only' boolean.${YELLOW} Specify as: stream_post_policy=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}message_retention_days${OFF} ${BLUE}[OneOf&lt;string,integer&gt;]${OFF} ${CYAN}(default: null)${OFF} - Number of days that messages sent to this stream will be stored
before being automatically deleted by the [message retention
policy](/help/message-retention-policy).  Two special string format
values are supported:

* \"realm_default\" => Return to the organization-level setting.
* \"forever\" => Retain messages forever.

**Changes**: New in Zulip 3.0 (feature level 17).${YELLOW} Specify as: message_retention_days=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;Success.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=400
    echo -e "${result_color_table[${code:0:1}]}  400;Success.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for unsubscribe operation
#
##############################################################################
print_unsubscribe_help() {
    echo ""
    echo -e "${BOLD}${WHITE}unsubscribe - Unsubscribe from a stream${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Unsubscribe yourself or other users from one or more streams.

'DELETE {{ api_url }}/v1/users/me/subscriptions'" | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}subscriptions${OFF} ${BLUE}[array[string]]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - A list of stream names to unsubscribe from. This parameter is called
'streams' in our Python API.${YELLOW} Specify as: subscriptions=value1 subscriptions=value2 subscriptions=...${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}principals${OFF} ${BLUE}[array[OneOf&lt;string,integer&gt;]]${OFF} ${CYAN}(default: null)${OFF} - A list of user ids (preferred) or Zulip display email
addresses of the users to be subscribed to or unsubscribed
from the streams specified in the 'subscriptions' parameter. If
not provided, then the requesting user/bot is subscribed.

**Changes**: The integer format is new in Zulip 3.0 (feature level 9).${YELLOW} Specify as: principals=value1 principals=value2 principals=...${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;Success.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=400
    echo -e "${result_color_table[${code:0:1}]}  400;Bad request.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for updateStream operation
#
##############################################################################
print_updateStream_help() {
    echo ""
    echo -e "${BOLD}${WHITE}updateStream - Update a stream${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Configure the stream with the ID 'stream_id'.  This endpoint supports
an organization administrator editing any property of a stream,
including:

* Stream [name](/help/rename-a-stream) and [description](/help/change-the-stream-description)
* Stream [permissions](/help/stream-permissions), including
[privacy](/help/change-the-privacy-of-a-stream) and [who can
send](/help/stream-sending-policy).

'PATCH {{ api_url }}/v1/streams/{stream_id}'" | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}stream_id${OFF} ${BLUE}[integer]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - The ID of the stream to access. ${YELLOW}Specify as: stream_id=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}description${OFF} ${BLUE}[string]${OFF} ${CYAN}(default: null)${OFF} - The new description for the stream. Limited Zulip markdown is allowed in this
field.

**Changes**: Removed unnecessary JSON-encoding of this parameter in
Zulip 4.0 (feature level 64).${YELLOW} Specify as: description=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}new_name${OFF} ${BLUE}[string]${OFF} ${CYAN}(default: null)${OFF} - The new name for the stream.

**Changes**: Removed unnecessary JSON-encoding of this parameter in
Zulip 4.0 (feature level 64).${YELLOW} Specify as: new_name=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}is_private${OFF} ${BLUE}[boolean]${OFF} ${CYAN}(default: null)${OFF} - Change whether the stream is a private stream.${YELLOW} Specify as: is_private=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}is_announcement_only${OFF} ${BLUE}[boolean]${OFF} ${CYAN}(default: null)${OFF} - Whether the stream is limited to announcements.

**Changes**: Deprecated in Zulip 3.0 (feature level 1), use
  'stream_post_policy' instead.${YELLOW} Specify as: is_announcement_only=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}stream_post_policy${OFF} ${BLUE}[integer]${OFF} ${CYAN}(default: 1)${OFF} - Policy for which users can post messages to the stream.

* 1 => Any user can post.
* 2 => Only administrators can post.
* 3 => Only full members can post.
* 4 => Only moderators can post.

**Changes**: New in Zulip 3.0, replacing the previous
'is_announcement_only' boolean.${YELLOW} Specify as: stream_post_policy=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}history_public_to_subscribers${OFF} ${BLUE}[boolean]${OFF} ${CYAN}(default: null)${OFF} - Whether the stream's message history should be available to
newly subscribed members, or users can only access messages
they actually received while subscribed to the stream.

Corresponds to the [shared history](/help/stream-permissions)
option in documentation.${YELLOW} Specify as: history_public_to_subscribers=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}message_retention_days${OFF} ${BLUE}[OneOf&lt;string,integer&gt;]${OFF} ${CYAN}(default: null)${OFF} - Number of days that messages sent to this stream will be stored
before being automatically deleted by the [message retention
policy](/help/message-retention-policy).  Two special string format
values are supported:

* \"realm_default\" => Return to the organization-level setting.
* \"forever\" => Retain messages forever.

**Changes**: New in Zulip 3.0 (feature level 17).${YELLOW} Specify as: message_retention_days=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;Success.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=400
    echo -e "${result_color_table[${code:0:1}]}  400;Bad request.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for updateSubscriptionSettings operation
#
##############################################################################
print_updateSubscriptionSettings_help() {
    echo ""
    echo -e "${BOLD}${WHITE}updateSubscriptionSettings - Update subscription settings${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "This endpoint is used to update the user's personal settings for the
streams they are subscribed to, including muting, color, pinning, and
per-stream notification settings.

'POST {{ api_url }}/v1/users/me/subscriptions/properties'" | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}subscription_data${OFF} ${BLUE}[array[map]]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - A list of objects that describe the changes that should be applied in
each subscription. Each object represents a subscription, and must have
a 'stream_id' key that identifies the stream, as well as the 'property'
being modified and its new 'value'.

The possible values for each 'property' and 'value' pairs are:

* 'color' (string): the hex value of the user's display color for the stream.
* 'is_muted' (boolean): whether the stream is
  [muted](/help/mute-a-stream).  Prior to Zulip 2.1, this feature was
  represented by the more confusingly named 'in_home_view' (with the
  opposite value, 'in_home_view=!is_muted'); for
  backwards-compatibility, modern Zulip still accepts that value.
* 'pin_to_top' (boolean): whether to pin the stream at the top of the stream list.
* 'desktop_notifications' (boolean): whether to show desktop notifications
    for all messages sent to the stream.
* 'audible_notifications' (boolean): whether to play a sound
  notification for all messages sent to the stream.
* 'push_notifications' (boolean): whether to trigger a mobile push
    notification for all messages sent to the stream.
* 'email_notifications' (boolean): whether to trigger an email
    notification for all messages sent to the stream.${YELLOW} Specify as: subscription_data=value1 subscription_data=value2 subscription_data=...${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;Success.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for updateSubscriptions operation
#
##############################################################################
print_updateSubscriptions_help() {
    echo ""
    echo -e "${BOLD}${WHITE}updateSubscriptions - Update subscriptions${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Update which streams you are are subscribed to." | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}delete${OFF} ${BLUE}[array[string]]${OFF} ${CYAN}(default: null)${OFF} - A list of stream names to unsubscribe from.${YELLOW} Specify as: delete=value1 delete=value2 delete=...${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}add${OFF} ${BLUE}[array[map]]${OFF} ${CYAN}(default: null)${OFF} - A list of objects describing which streams to subscribe to, optionally
including per-user subscription parameters (e.g. color) and if the
stream is to be created, its description.${YELLOW} Specify as: add=value1 add=value2 add=...${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;Success.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for createUser operation
#
##############################################################################
print_createUser_help() {
    echo ""
    echo -e "${BOLD}${WHITE}createUser - Create a user${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "{!can-create-users-only.md!}

Create a new user account via the API.

'POST {{ api_url }}/v1/users'" | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}email${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - The email address of the new user.${YELLOW} Specify as: email=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}password${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - The password of the new user.${YELLOW} Specify as: password=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}full_name${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - The full name of the new user.${YELLOW} Specify as: full_name=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;Success.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=400
    echo -e "${result_color_table[${code:0:1}]}  400;Bad request.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for createUserGroup operation
#
##############################################################################
print_createUserGroup_help() {
    echo ""
    echo -e "${BOLD}${WHITE}createUserGroup - Create a user group${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Create a new [user group](/help/user-groups).

'POST {{ api_url }}/v1/user_groups/create'" | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}name${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - The name of the user group.${YELLOW} Specify as: name=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}description${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - The description of the user group.${YELLOW} Specify as: description=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}members${OFF} ${BLUE}[array[integer]]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - An array containing the user IDs of the initial members for the
new user group.${YELLOW} Specify as: members=value1 members=value2 members=...${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;Success.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=400
    echo -e "${result_color_table[${code:0:1}]}  400;Bad request.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for deactivateOwnUser operation
#
##############################################################################
print_deactivateOwnUser_help() {
    echo ""
    echo -e "${BOLD}${WHITE}deactivateOwnUser - Deactivate own user${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Deactivates the user's account.  See also the administrative endpoint for
[deactivating another user](/api/deactivate-user).

'DELETE {{ api_url }}/v1/users/me'

This endpoint is primarily useful to Zulip clients providing a user settings UI." | paste -sd' ' | fold -sw 80
    echo -e ""
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;Success.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=400
    echo -e "${result_color_table[${code:0:1}]}  400;Bad request.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for deactivateUser operation
#
##############################################################################
print_deactivateUser_help() {
    echo ""
    echo -e "${BOLD}${WHITE}deactivateUser - Deactivate a user${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "[Deactivates a
user](https://zulip.com/help/deactivate-or-reactivate-a-user)
given their user ID.

'DELETE {{ api_url }}/v1/users/{user_id}'" | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}user_id${OFF} ${BLUE}[integer]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - The target user's ID. ${YELLOW}Specify as: user_id=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;Success${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=400
    echo -e "${result_color_table[${code:0:1}]}  400;Bad request${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for getAttachments operation
#
##############################################################################
print_getAttachments_help() {
    echo ""
    echo -e "${BOLD}${WHITE}getAttachments - Get attachments${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Fetch metadata on files uploaded by the requesting user.

'GET {{ api_url }}/v1/attachments'" | paste -sd' ' | fold -sw 80
    echo -e ""
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;Success.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for getOwnUser operation
#
##############################################################################
print_getOwnUser_help() {
    echo ""
    echo -e "${BOLD}${WHITE}getOwnUser - Get own user${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Get basic data about the user/bot that requests this endpoint.

'GET {{ api_url }}/v1/users/me'" | paste -sd' ' | fold -sw 80
    echo -e ""
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;Success${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for getUser operation
#
##############################################################################
print_getUser_help() {
    echo ""
    echo -e "${BOLD}${WHITE}getUser - Get a user${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Fetch details for a single user in the organization.

'GET {{ api_url }}/v1/users/{user_id}'

You can also fetch details on [all users in the organization](/api/get-users)
or [by email](/api/get-user-by-email).

*This endpoint is new in Zulip Server 3.0 (feature level 1).*" | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}user_id${OFF} ${BLUE}[integer]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - The target user's ID. ${YELLOW}Specify as: user_id=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}client_gravatar${OFF} ${BLUE}[boolean]${OFF} ${CYAN}(default: false)${OFF} - Whether the client supports computing gravatars URLs.  If
enabled, 'avatar_url' will be included in the response only
if there is a Zulip avatar, and will be 'null' for users who
are using gravatar as their avatar.  This option
significantly reduces the compressed size of user data,
since gravatar URLs are long, random strings and thus do not
compress well. The 'client_gravatar' field is set to 'true' if
clients can compute their own gravatars.${YELLOW} Specify as: client_gravatar=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}include_custom_profile_fields${OFF} ${BLUE}[boolean]${OFF} ${CYAN}(default: false)${OFF} - Whether the client wants [custom profile field](/help/add-custom-profile-fields)
data to be included in the response.

**Changes**: New in Zulip 2.1.0.  Previous versions do no offer these
data via the API.${YELLOW} Specify as: include_custom_profile_fields=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;Success.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for getUserByEmail operation
#
##############################################################################
print_getUserByEmail_help() {
    echo ""
    echo -e "${BOLD}${WHITE}getUserByEmail - Get a user by email${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Fetch details for a single user in the organization given a Zulip display
email address.

'GET {{ api_url }}/v1/users/{email}'

Note that this endpoint uses Zulip display emails addresses
for organizations that have configured limited [email address
visibility](/help/restrict-visibility-of-email-addresses).

You can also fetch details on [all users in the organization](/api/get-users) or
[by user ID](/api/get-user).  Fetching by user ID is generally recommended
when possible, as users can
[change their email address](/help/change-your-email-address).

*This endpoint is new in Zulip Server 4.0 (feature level 39).*" | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}email${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - The email address of the user whose details you want to fetch. ${YELLOW}Specify as: email=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}client_gravatar${OFF} ${BLUE}[boolean]${OFF} ${CYAN}(default: false)${OFF} - Whether the client supports computing gravatars URLs.  If
enabled, 'avatar_url' will be included in the response only
if there is a Zulip avatar, and will be 'null' for users who
are using gravatar as their avatar.  This option
significantly reduces the compressed size of user data,
since gravatar URLs are long, random strings and thus do not
compress well. The 'client_gravatar' field is set to 'true' if
clients can compute their own gravatars.${YELLOW} Specify as: client_gravatar=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}include_custom_profile_fields${OFF} ${BLUE}[boolean]${OFF} ${CYAN}(default: false)${OFF} - Whether the client wants [custom profile field](/help/add-custom-profile-fields)
data to be included in the response.

**Changes**: New in Zulip 2.1.0.  Previous versions do no offer these
data via the API.${YELLOW} Specify as: include_custom_profile_fields=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;Success.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for getUserGroups operation
#
##############################################################################
print_getUserGroups_help() {
    echo ""
    echo -e "${BOLD}${WHITE}getUserGroups - Get user groups${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "{!api-members-only.md!}

Fetches all of the user groups in the organization.

'GET {{ api_url }}/v1/user_groups'" | paste -sd' ' | fold -sw 80
    echo -e ""
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;Success.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for getUserPresence operation
#
##############################################################################
print_getUserPresence_help() {
    echo ""
    echo -e "${BOLD}${WHITE}getUserPresence - Get user presence${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Get the presence status for a specific user.

This endpoint is most useful for embedding data about a user's
presence status in other sites (E.g. an employee directory).  Full
Zulip clients like mobile/desktop apps will want to use the main
presence endpoint, which returns data for all active users in the
organization, instead.

'GET {{ api_url }}/v1/users/{user_id_or_email}/presence'

See
[Zulip's developer documentation](https://zulip.readthedocs.io/en/latest/subsystems/presence.html)
for details on the data model for presence in Zulip." | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}user_id_or_email${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - The user_id or Zulip display email address of the user whose presence you want to fetch.

**Changes**: New in Zulip 4.0 (feature level 43). Previous versions only supported
identifying the user by Zulip display email. ${YELLOW}Specify as: user_id_or_email=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;Success.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for getUsers operation
#
##############################################################################
print_getUsers_help() {
    echo ""
    echo -e "${BOLD}${WHITE}getUsers - Get all users${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Retrieve details on all users in the organization.  Optionally
includes values of [custom profile field](/help/add-custom-profile-fields).

'GET {{ api_url }}/v1/users'

You can also [fetch details on a single user](/api/get-user)." | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}client_gravatar${OFF} ${BLUE}[boolean]${OFF} ${CYAN}(default: false)${OFF} - Whether the client supports computing gravatars URLs.  If
enabled, 'avatar_url' will be included in the response only
if there is a Zulip avatar, and will be 'null' for users who
are using gravatar as their avatar.  This option
significantly reduces the compressed size of user data,
since gravatar URLs are long, random strings and thus do not
compress well. The 'client_gravatar' field is set to 'true' if
clients can compute their own gravatars.${YELLOW} Specify as: client_gravatar=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}include_custom_profile_fields${OFF} ${BLUE}[boolean]${OFF} ${CYAN}(default: false)${OFF} - Whether the client wants [custom profile field](/help/add-custom-profile-fields)
data to be included in the response.

**Changes**: New in Zulip 2.1.0.  Previous versions do no offer these
data via the API.${YELLOW} Specify as: include_custom_profile_fields=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;Success.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for muteUser operation
#
##############################################################################
print_muteUser_help() {
    echo ""
    echo -e "${BOLD}${WHITE}muteUser - Mute a user${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "This endpoint [mutes a user](/help/mute-a-user).  Messages sent by users
you've muted will be automatically marked as read and hidden.

'POST {{ api_url }}/v1/users/me/muted_users/{muted_user_id}'

Muted users should be implemented by clients as follows:

* The server will immediately mark all messages sent by the muted
  user as read.  This will automatically clear any existing mobile
  push notifications related to the muted user.
* The server will mark any new messages sent by the muted user as read
  for your account, which prevents all email and mobile push notifications.
* Clients should exclude muted users from presence lists or other UI
  for viewing or composing 1:1 private messages. 1:1 private messages sent by
  muted users should be hidden everywhere in the Zulip UI.
* Stream messages and group private messages sent by the muted
  user should avoid displaying the content and name/avatar,
  but should display that N messages by a muted user were
  hidden (so that it is possible to interpret the messages by
  other users who are talking with the muted user).
* Group private message conversations including the muted user
  should display muted users as \"Muted user\", rather than
  showing their name, in lists of such conversations, along with using
  a blank grey avatar where avatars are displayed.
* Administrative/settings UI elements for showing \"All users that exist
  on this stream or realm\", e.g. for organization
  administration or showing stream subscribers, should display
  the user's name as normal.

**Changes**: New in Zulip 4.0 (feature level 48)." | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}muted_user_id${OFF} ${BLUE}[integer]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - The ID of the user to mute/un-mute. ${YELLOW}Specify as: muted_user_id=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;Success.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=400
    echo -e "${result_color_table[${code:0:1}]}  400;Bad request.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for reactivateUser operation
#
##############################################################################
print_reactivateUser_help() {
    echo ""
    echo -e "${BOLD}${WHITE}reactivateUser - Reactivate a user${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "[Reactivates a
user](https://zulip.com/help/deactivate-or-reactivate-a-user)
given their user ID.

'POST {{ api_url }}/v1/users/{user_id}/reactivate'" | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}user_id${OFF} ${BLUE}[integer]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - The target user's ID. ${YELLOW}Specify as: user_id=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;Success${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for removeUserGroup operation
#
##############################################################################
print_removeUserGroup_help() {
    echo ""
    echo -e "${BOLD}${WHITE}removeUserGroup - Delete a user group${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Delete a [user group](/help/user-groups).

'DELETE {{ api_url }}/v1/user_groups/{user_group_id}'" | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}user_group_id${OFF} ${BLUE}[integer]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - The ID of the target user group. ${YELLOW}Specify as: user_group_id=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;Success.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=400
    echo -e "${result_color_table[${code:0:1}]}  400;Bad request.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for setTypingStatus operation
#
##############################################################################
print_setTypingStatus_help() {
    echo ""
    echo -e "${BOLD}${WHITE}setTypingStatus - Set \"typing\" status${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Notify other users whether the current user is typing a message.

'POST {{ api_url }}/v1/typing'

Clients implementing Zulip's typing notifications protocol should work as follows:

* Send a request to this endpoint with 'op=\"start\"' when a user starts typing a message,
  and also every 'TYPING_STARTED_WAIT_PERIOD=10' seconds that the user continues to
  actively type or otherwise interact with the compose UI (E.g. interacting with the
  compose box emoji picker).
* Send a request to this endpoint with 'op=\"stop\"' when a user pauses using the
  compose UI for at least 'TYPING_STOPPED_WAIT_PERIOD=5' seconds or cancels
  the compose action (if it had previously sent a \"start\" operation for that
  compose action).
* Start displaying \"Sender is typing\" for a given conversation when the client
  receives an 'op=\"start\"' event from the [events API](/api/get-events).
* Continue displaying \"Sender is typing\" until they receive an 'op=\"stop\"' event
  from the [events API](/api/get-events) or 'TYPING_STARTED_EXPIRY_PERIOD=15'
  seconds have passed without a new 'op=\"start\"' event for that conversation.
* Clients that support displaying stream typing notifications (new in Zulip 4.0)
  should indicate they support processing stream typing events via the
  'stream_typing_notifications' in the 'client_capabilities' parameter to '/register'.

This protocol is designed to allow the server-side typing notifications implementation
to be stateless while being resilient; network failures cannot result in a user being
incorrectly displayed as perpetually typing.

See
[the typing notification docs](https://zulip.readthedocs.io/en/latest/subsystems/typing-indicators.html)
for additional design details on Zulip's typing notifications protocol." | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}op${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Whether the user has started ('start') or stopped ('stop') to type.${YELLOW} Specify as: op=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}to${OFF} ${BLUE}[array[integer]]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - For 'private' type it is the user_ids of the recipients of the message being typed.
Send a JSON-encoded list of user_ids. (Use a list even if there is only one
recipient.)

For 'stream' type it is a single element list containing ID of stream in
which the message is being typed.

**Changes**: Before Zulip 2.0, this parameter accepted only a JSON-encoded
list of email addresses.  Support for the email address-based format was
removed in Zulip 3.0 (feature level 11).${YELLOW} Specify as: to=value1 to=value2 to=...${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}type${OFF} ${BLUE}[string]${OFF} ${CYAN}(default: private)${OFF} - Type of the message being composed.${YELLOW} Specify as: type=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}topic${OFF} ${BLUE}[string]${OFF} ${CYAN}(default: null)${OFF} - Topic to which message is being typed. Required for the 'stream' type.
Ignored in case of 'private' type.${YELLOW} Specify as: topic=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;Success.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=400
    echo -e "${result_color_table[${code:0:1}]}  400;Bad request.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for unmuteUser operation
#
##############################################################################
print_unmuteUser_help() {
    echo ""
    echo -e "${BOLD}${WHITE}unmuteUser - Unmute a user${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "This endpoint unmutes a user.

'DELETE {{ api_url }}/v1/users/me/muted_users/{muted_user_id}'

**Changes**: New in Zulip 4.0 (feature level 48)." | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}muted_user_id${OFF} ${BLUE}[integer]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - The ID of the user to mute/un-mute. ${YELLOW}Specify as: muted_user_id=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;Success.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=400
    echo -e "${result_color_table[${code:0:1}]}  400;Bad request.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for updateDisplaySettings operation
#
##############################################################################
print_updateDisplaySettings_help() {
    echo ""
    echo -e "${BOLD}${WHITE}updateDisplaySettings - Update display settings${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "This endpoint is used to edit the current user's user interface settings.

'PATCH {{ api_url }}/v1/settings/display'" | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}twenty_four_hour_time${OFF} ${BLUE}[boolean]${OFF} ${CYAN}(default: null)${OFF} - Whether time should be [displayed in 24-hour notation](/help/change-the-time-format).${YELLOW} Specify as: twenty_four_hour_time=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}dense_mode${OFF} ${BLUE}[boolean]${OFF} ${CYAN}(default: null)${OFF} - This setting has no effect at present.  It is reserved for use in controlling
the default font size in Zulip.${YELLOW} Specify as: dense_mode=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}starred_message_counts${OFF} ${BLUE}[boolean]${OFF} ${CYAN}(default: null)${OFF} - Whether clients should display the [number of starred
messages](/help/star-a-message#display-the-number-of-starred-messages).${YELLOW} Specify as: starred_message_counts=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}fluid_layout_width${OFF} ${BLUE}[boolean]${OFF} ${CYAN}(default: null)${OFF} - Whether to use the [maximum available screen width](/help/enable-full-width-display)
for the web app's center panel (message feed, recent topics) on wide screens.${YELLOW} Specify as: fluid_layout_width=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}high_contrast_mode${OFF} ${BLUE}[boolean]${OFF} ${CYAN}(default: null)${OFF} - This setting is reserved for use to control variations in Zulip's design
to help visually impaired users.${YELLOW} Specify as: high_contrast_mode=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}color_scheme${OFF} ${BLUE}[integer]${OFF} ${CYAN}(default: null)${OFF} - Controls which [color theme](/help/night-mode) to use.

* 1 - Automatic
* 2 - Night mode
* 3 - Day mode

Automatic detection is implementing using the standard 'prefers-color-scheme'
media query.${YELLOW} Specify as: color_scheme=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}translate_emoticons${OFF} ${BLUE}[boolean]${OFF} ${CYAN}(default: null)${OFF} - Whether to [translate emoticons to emoji](/help/enable-emoticon-translations)
in messages the user sends.${YELLOW} Specify as: translate_emoticons=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}default_language${OFF} ${BLUE}[string]${OFF} ${CYAN}(default: null)${OFF} - What [default language](/help/change-your-language) to use for the account.

This controls both the Zulip UI as well as email notifications sent to the user.

The value needs to be a standard language code that the Zulip server has
translation data for; for example, '\"en\"' for English or '\"de\"' for German.

**Changes**: Removed unnecessary JSON-encoding of parameter in Zulip 4.0 (feature level 63).${YELLOW} Specify as: default_language=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}default_view${OFF} ${BLUE}[string]${OFF} ${CYAN}(default: null)${OFF} - The [default view](/help/change-default-view) used when opening a new
Zulip web app window or hitting the 'Esc' keyboard shortcut repeatedly.

* \"recent_topics\" - Recent topics view
* \"all_messages\" - All messages view

**Changes**: Removed unnecessary JSON-encoding of parameter in Zulip 4.0 (feature level 64).${YELLOW} Specify as: default_view=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}left_side_userlist${OFF} ${BLUE}[boolean]${OFF} ${CYAN}(default: null)${OFF} - Whether the users list on left sidebar in narrow windows.

This feature is not heavily used and is likely to be reworked.${YELLOW} Specify as: left_side_userlist=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}emojiset${OFF} ${BLUE}[string]${OFF} ${CYAN}(default: null)${OFF} - The user's configured [emoji set](/help/emoji-and-emoticons#use-emoticons),
used to display emoji to the user everything they appear in the UI.

* \"google\" - Google modern
* \"google-blob\" - Google classic
* \"twitter\" - Twitter
* \"text\" - Plain text

**Changes**: Removed unnecessary JSON-encoding of parameter in Zulip 4.0 (feature level 64).${YELLOW} Specify as: emojiset=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}demote_inactive_streams${OFF} ${BLUE}[integer]${OFF} ${CYAN}(default: null)${OFF} - Whether to [demote inactive streams](/help/manage-inactive-streams) in the left sidebar.

* 1 - Automatic
* 2 - Always
* 3 - Never${YELLOW} Specify as: demote_inactive_streams=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}timezone${OFF} ${BLUE}[string]${OFF} ${CYAN}(default: null)${OFF} - The user's [configured timezone](/help/change-your-timezone).

Timezone values supported by the server are served at
[/static/generated/timezones.json](/static/generated/timezones.json).

**Changes**: Removed unnecessary JSON-encoding of parameter in Zulip 4.0 (feature level 64).${YELLOW} Specify as: timezone=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;Success${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for updateNotificationSettings operation
#
##############################################################################
print_updateNotificationSettings_help() {
    echo ""
    echo -e "${BOLD}${WHITE}updateNotificationSettings - Update notification settings${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "This endpoint is used to edit the user's global notification settings.
See [this endpoint](/api/update-subscription-settings) for
per-stream notification settings.

'PATCH {{ api_url }}/v1/settings/notifications'" | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}enable_stream_desktop_notifications${OFF} ${BLUE}[boolean]${OFF} ${CYAN}(default: null)${OFF} - Enable visual desktop notifications for stream messages.${YELLOW} Specify as: enable_stream_desktop_notifications=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}enable_stream_email_notifications${OFF} ${BLUE}[boolean]${OFF} ${CYAN}(default: null)${OFF} - Enable email notifications for stream messages.${YELLOW} Specify as: enable_stream_email_notifications=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}enable_stream_push_notifications${OFF} ${BLUE}[boolean]${OFF} ${CYAN}(default: null)${OFF} - Enable mobile notifications for stream messages.${YELLOW} Specify as: enable_stream_push_notifications=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}enable_stream_audible_notifications${OFF} ${BLUE}[boolean]${OFF} ${CYAN}(default: null)${OFF} - Enable audible desktop notifications for stream messages.${YELLOW} Specify as: enable_stream_audible_notifications=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}notification_sound${OFF} ${BLUE}[string]${OFF} ${CYAN}(default: null)${OFF} - Notification sound name.

**Changes**: Removed unnecessary JSON-encoding of parameter in Zulip 4.0 (feature level 63).${YELLOW} Specify as: notification_sound=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}enable_desktop_notifications${OFF} ${BLUE}[boolean]${OFF} ${CYAN}(default: null)${OFF} - Enable visual desktop notifications for private messages and @-mentions.${YELLOW} Specify as: enable_desktop_notifications=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}enable_sounds${OFF} ${BLUE}[boolean]${OFF} ${CYAN}(default: null)${OFF} - Enable audible desktop notifications for private messages and
@-mentions.${YELLOW} Specify as: enable_sounds=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}enable_offline_email_notifications${OFF} ${BLUE}[boolean]${OFF} ${CYAN}(default: null)${OFF} - Enable email notifications for private messages and @-mentions received
when the user is offline.${YELLOW} Specify as: enable_offline_email_notifications=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}enable_offline_push_notifications${OFF} ${BLUE}[boolean]${OFF} ${CYAN}(default: null)${OFF} - Enable mobile notification for private messages and @-mentions received
when the user is offline.${YELLOW} Specify as: enable_offline_push_notifications=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}enable_online_push_notifications${OFF} ${BLUE}[boolean]${OFF} ${CYAN}(default: null)${OFF} - Enable mobile notification for private messages and @-mentions received
when the user is online.${YELLOW} Specify as: enable_online_push_notifications=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}enable_digest_emails${OFF} ${BLUE}[boolean]${OFF} ${CYAN}(default: null)${OFF} - Enable digest emails when the user is away.${YELLOW} Specify as: enable_digest_emails=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}enable_marketing_emails${OFF} ${BLUE}[boolean]${OFF} ${CYAN}(default: null)${OFF} - Enable marketing emails. Has no function outside Zulip Cloud.${YELLOW} Specify as: enable_marketing_emails=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}enable_login_emails${OFF} ${BLUE}[boolean]${OFF} ${CYAN}(default: null)${OFF} - Enable email notifications for new logins to account.${YELLOW} Specify as: enable_login_emails=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}message_content_in_email_notifications${OFF} ${BLUE}[boolean]${OFF} ${CYAN}(default: null)${OFF} - Include the message's content in email notifications for new messages.${YELLOW} Specify as: message_content_in_email_notifications=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}pm_content_in_desktop_notifications${OFF} ${BLUE}[boolean]${OFF} ${CYAN}(default: null)${OFF} - Include content of private messages in desktop notifications.${YELLOW} Specify as: pm_content_in_desktop_notifications=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}wildcard_mentions_notify${OFF} ${BLUE}[boolean]${OFF} ${CYAN}(default: null)${OFF} - Whether wildcard mentions (E.g. @**all**) should send notifications
like a personal mention.${YELLOW} Specify as: wildcard_mentions_notify=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}desktop_icon_count_display${OFF} ${BLUE}[integer]${OFF} ${CYAN}(default: null)${OFF} - Unread count summary (appears in desktop sidebar and browser tab)

* 1 - All unreads
* 2 - Private messages and mentions
* 3 - None${YELLOW} Specify as: desktop_icon_count_display=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}realm_name_in_notifications${OFF} ${BLUE}[boolean]${OFF} ${CYAN}(default: null)${OFF} - Include organization name in subject of message notification emails.${YELLOW} Specify as: realm_name_in_notifications=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}presence_enabled${OFF} ${BLUE}[boolean]${OFF} ${CYAN}(default: null)${OFF} - Display the presence status to other users when online.${YELLOW} Specify as: presence_enabled=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;Success.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for updateUser operation
#
##############################################################################
print_updateUser_help() {
    echo ""
    echo -e "${BOLD}${WHITE}updateUser - Update a user${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Administrative endpoint to update the details of another user in the organization.

'PATCH {{ api_url }}/v1/users/{user_id}'

Supports everything an administrator can do to edit details of another
user's account, including editing full name,
[role](/help/roles-and-permissions), and [custom profile
fields](/help/add-custom-profile-fields)." | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}user_id${OFF} ${BLUE}[integer]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - The target user's ID. ${YELLOW}Specify as: user_id=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}full_name${OFF} ${BLUE}[string]${OFF} ${CYAN}(default: null)${OFF} - The user's full name.${YELLOW} Specify as: full_name=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}role${OFF} ${BLUE}[integer]${OFF} ${CYAN}(default: null)${OFF} - New [role](/help/roles-and-permissions) for the user.  Roles are encoded as:

* Organization owner: 100
* Organization administrator: 200
* Organization moderator: 300
* Member: 400
* Guest: 600

Only organization owners can add or remove the owner role.

The owner role cannot be removed from the only organization owner.

**Changes**: New in Zulip 3.0 (feature level 8), replacing the previous
pair of 'is_admin' and 'is_guest' boolean parameters. Organization moderator
role added in Zulip 4.0 (feature level 60).${YELLOW} Specify as: role=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}profile_data${OFF} ${BLUE}[array[map]]${OFF} ${CYAN}(default: null)${OFF} - A dictionary containing the to be updated custom profile field data for the user.${YELLOW} Specify as: profile_data=value1 profile_data=value2 profile_data=...${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;Success.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=400
    echo -e "${result_color_table[${code:0:1}]}  400;Bad request.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for updateUserGroup operation
#
##############################################################################
print_updateUserGroup_help() {
    echo ""
    echo -e "${BOLD}${WHITE}updateUserGroup - Update a user group${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Update the name or description of a [user group](/help/user-groups).

'PATCH {{ api_url }}/v1/user_groups/{user_group_id}'" | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}user_group_id${OFF} ${BLUE}[integer]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - The ID of the target user group. ${YELLOW}Specify as: user_group_id=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}name${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - The new name of the group.${YELLOW} Specify as: name=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}description${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - The new description of the group.${YELLOW} Specify as: description=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;Success.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=400
    echo -e "${result_color_table[${code:0:1}]}  400;Bad request.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for updateUserGroupMembers operation
#
##############################################################################
print_updateUserGroupMembers_help() {
    echo ""
    echo -e "${BOLD}${WHITE}updateUserGroupMembers - Update user group members${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Update the members of a [user group](/help/user-groups).

'POST {{ api_url }}/v1/user_groups/{user_group_id}/members'" | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}user_group_id${OFF} ${BLUE}[integer]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - The ID of the target user group. ${YELLOW}Specify as: user_group_id=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}delete${OFF} ${BLUE}[array[integer]]${OFF} ${CYAN}(default: null)${OFF} - The list of user ids to be removed from the user group.${YELLOW} Specify as: delete=value1 delete=value2 delete=...${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}add${OFF} ${BLUE}[array[integer]]${OFF} ${CYAN}(default: null)${OFF} - The list of user ids to be added to the user group.${YELLOW} Specify as: add=value1 add=value2 add=...${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;Success.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for zulipOutgoingWebhooks operation
#
##############################################################################
print_zulipOutgoingWebhooks_help() {
    echo ""
    echo -e "${BOLD}${WHITE}zulipOutgoingWebhooks - Outgoing webhooks${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Outgoing webhooks allows to build or set up Zulip integrations which are
notified when certain types of messages are sent in Zulip." | paste -sd' ' | fold -sw 80
    echo -e ""
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;Success${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}


##############################################################################
#
# Call devFetchApiKey operation
#
##############################################################################
call_devFetchApiKey() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=()
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(username)
    local path

    if ! path=$(build_request_path "/api/v1/dev_fetch_api_key" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="POST"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call fetchApiKey operation
#
##############################################################################
call_fetchApiKey() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=()
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(username password)
    local path

    if ! path=$(build_request_path "/api/v1/fetch_api_key" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="POST"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call addReaction operation
#
##############################################################################
call_addReaction() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(message_id)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(emoji_name emoji_code reaction_type)
    local path

    if ! path=$(build_request_path "/api/v1/messages/{message_id}/reactions" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="POST"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call checkMessagesMatchNarrow operation
#
##############################################################################
call_checkMessagesMatchNarrow() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=()
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(msg_ids narrow)
    local path

    if ! path=$(build_request_path "/api/v1/messages/matches_narrow" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call deleteMessage operation
#
##############################################################################
call_deleteMessage() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(message_id)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=()
    local path

    if ! path=$(build_request_path "/api/v1/messages/{message_id}" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="DELETE"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call getFileTemporaryUrl operation
#
##############################################################################
call_getFileTemporaryUrl() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(realm_id_str filename)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=()
    local path

    if ! path=$(build_request_path "/api/v1/user_uploads/{realm_id_str}/{filename}" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call getMessageHistory operation
#
##############################################################################
call_getMessageHistory() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(message_id)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=()
    local path

    if ! path=$(build_request_path "/api/v1/messages/{message_id}/history" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call getMessages operation
#
##############################################################################
call_getMessages() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=()
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(anchor num_before num_after narrow client_gravatar apply_markdown use_first_unread_anchor)
    local path

    if ! path=$(build_request_path "/api/v1/messages" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call getRawMessage operation
#
##############################################################################
call_getRawMessage() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(message_id)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=()
    local path

    if ! path=$(build_request_path "/api/v1/messages/{message_id}" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call markAllAsRead operation
#
##############################################################################
call_markAllAsRead() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=()
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=()
    local path

    if ! path=$(build_request_path "/api/v1/mark_all_as_read" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="POST"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call markStreamAsRead operation
#
##############################################################################
call_markStreamAsRead() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=()
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(stream_id)
    local path

    if ! path=$(build_request_path "/api/v1/mark_stream_as_read" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="POST"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call markTopicAsRead operation
#
##############################################################################
call_markTopicAsRead() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=()
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(stream_id topic_name)
    local path

    if ! path=$(build_request_path "/api/v1/mark_topic_as_read" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="POST"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call removeReaction operation
#
##############################################################################
call_removeReaction() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(message_id)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(emoji_name emoji_code reaction_type)
    local path

    if ! path=$(build_request_path "/api/v1/messages/{message_id}/reactions" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="DELETE"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call renderMessage operation
#
##############################################################################
call_renderMessage() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=()
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(content)
    local path

    if ! path=$(build_request_path "/api/v1/messages/render" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="POST"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call sendMessage operation
#
##############################################################################
call_sendMessage() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=()
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(type to content topic queue_id local_id)
    local path

    if ! path=$(build_request_path "/api/v1/messages" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="POST"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call updateMessage operation
#
##############################################################################
call_updateMessage() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(message_id)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(topic propagate_mode send_notification_to_old_thread send_notification_to_new_thread content stream_id)
    local path

    if ! path=$(build_request_path "/api/v1/messages/{message_id}" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="PATCH"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call updateMessageFlags operation
#
##############################################################################
call_updateMessageFlags() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=()
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(messages op flag)
    local path

    if ! path=$(build_request_path "/api/v1/messages/flags" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="POST"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call uploadFile operation
#
##############################################################################
call_uploadFile() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=()
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=()
    local path

    if ! path=$(build_request_path "/api/v1/user_uploads" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="POST"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call deleteQueue operation
#
##############################################################################
call_deleteQueue() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=()
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(queue_id)
    local path

    if ! path=$(build_request_path "/api/v1/events" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="DELETE"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call getEvents operation
#
##############################################################################
call_getEvents() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=()
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(queue_id last_event_id dont_block)
    local path

    if ! path=$(build_request_path "/api/v1/events" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call realTimePost operation
#
##############################################################################
call_realTimePost() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=()
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(event_types narrow all_public_streams)
    local path

    if ! path=$(build_request_path "/api/v1/real-time" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="POST"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call registerQueue operation
#
##############################################################################
call_registerQueue() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=()
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(apply_markdown client_gravatar slim_presence event_types all_public_streams include_subscribers client_capabilities fetch_event_types narrow)
    local path

    if ! path=$(build_request_path "/api/v1/register" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="POST"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call restErrorHandling operation
#
##############################################################################
call_restErrorHandling() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=()
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=()
    local path

    if ! path=$(build_request_path "/api/v1/rest-error-handling" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="POST"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call addCodePlayground operation
#
##############################################################################
call_addCodePlayground() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=()
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(name pygments_language url_prefix)
    local path

    if ! path=$(build_request_path "/api/v1/realm/playgrounds" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="POST"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call addLinkifier operation
#
##############################################################################
call_addLinkifier() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=()
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(pattern url_format_string)
    local path

    if ! path=$(build_request_path "/api/v1/realm/filters" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="POST"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call createCustomProfileField operation
#
##############################################################################
call_createCustomProfileField() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=()
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(name hint field_type field_data)
    local path

    if ! path=$(build_request_path "/api/v1/realm/profile_fields" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="POST"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call getCustomEmoji operation
#
##############################################################################
call_getCustomEmoji() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=()
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=()
    local path

    if ! path=$(build_request_path "/api/v1/realm/emoji" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call getCustomProfileFields operation
#
##############################################################################
call_getCustomProfileFields() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=()
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=()
    local path

    if ! path=$(build_request_path "/api/v1/realm/profile_fields" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call getLinkifiers operation
#
##############################################################################
call_getLinkifiers() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=()
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=()
    local path

    if ! path=$(build_request_path "/api/v1/realm/linkifiers" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call getServerSettings operation
#
##############################################################################
call_getServerSettings() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=()
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=()
    local path

    if ! path=$(build_request_path "/api/v1/server_settings" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call removeCodePlayground operation
#
##############################################################################
call_removeCodePlayground() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(playground_id)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=()
    local path

    if ! path=$(build_request_path "/api/v1/realm/playgrounds/{playground_id}" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="DELETE"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call removeLinkifier operation
#
##############################################################################
call_removeLinkifier() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(filter_id)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=()
    local path

    if ! path=$(build_request_path "/api/v1/realm/filters/{filter_id}" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="DELETE"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call reorderCustomProfileFields operation
#
##############################################################################
call_reorderCustomProfileFields() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=()
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(order)
    local path

    if ! path=$(build_request_path "/api/v1/realm/profile_fields" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="PATCH"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call updateLinkifier operation
#
##############################################################################
call_updateLinkifier() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(filter_id)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(pattern url_format_string)
    local path

    if ! path=$(build_request_path "/api/v1/realm/filters/{filter_id}" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="PATCH"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call uploadCustomEmoji operation
#
##############################################################################
call_uploadCustomEmoji() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(emoji_name)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=()
    local path

    if ! path=$(build_request_path "/api/v1/realm/emoji/{emoji_name}" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="POST"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call archiveStream operation
#
##############################################################################
call_archiveStream() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(stream_id)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=()
    local path

    if ! path=$(build_request_path "/api/v1/streams/{stream_id}" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="DELETE"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call createBigBlueButtonVideoCall operation
#
##############################################################################
call_createBigBlueButtonVideoCall() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=()
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=()
    local path

    if ! path=$(build_request_path "/api/v1/calls/bigbluebutton/create" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call getStreamId operation
#
##############################################################################
call_getStreamId() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=()
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(stream)
    local path

    if ! path=$(build_request_path "/api/v1/get_stream_id" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call getStreamTopics operation
#
##############################################################################
call_getStreamTopics() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(stream_id)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=()
    local path

    if ! path=$(build_request_path "/api/v1/users/me/{stream_id}/topics" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call getStreams operation
#
##############################################################################
call_getStreams() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=()
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(include_public include_web_public include_subscribed include_all_active include_default include_owner_subscribed)
    local path

    if ! path=$(build_request_path "/api/v1/streams" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call getSubscriptionStatus operation
#
##############################################################################
call_getSubscriptionStatus() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(user_id stream_id)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=()
    local path

    if ! path=$(build_request_path "/api/v1/users/{user_id}/subscriptions/{stream_id}" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call getSubscriptions operation
#
##############################################################################
call_getSubscriptions() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=()
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(include_subscribers)
    local path

    if ! path=$(build_request_path "/api/v1/users/me/subscriptions" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call muteTopic operation
#
##############################################################################
call_muteTopic() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=()
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(stream stream_id topic op)
    local path

    if ! path=$(build_request_path "/api/v1/users/me/subscriptions/muted_topics" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="PATCH"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call subscribe operation
#
##############################################################################
call_subscribe() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=()
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(subscriptions principals authorization_errors_fatal announce invite_only history_public_to_subscribers stream_post_policy message_retention_days)
    local path

    if ! path=$(build_request_path "/api/v1/users/me/subscriptions" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="POST"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call unsubscribe operation
#
##############################################################################
call_unsubscribe() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=()
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(subscriptions principals)
    local path

    if ! path=$(build_request_path "/api/v1/users/me/subscriptions" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="DELETE"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call updateStream operation
#
##############################################################################
call_updateStream() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(stream_id)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(description new_name is_private is_announcement_only stream_post_policy history_public_to_subscribers message_retention_days)
    local path

    if ! path=$(build_request_path "/api/v1/streams/{stream_id}" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="PATCH"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call updateSubscriptionSettings operation
#
##############################################################################
call_updateSubscriptionSettings() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=()
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(subscription_data)
    local path

    if ! path=$(build_request_path "/api/v1/users/me/subscriptions/properties" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="POST"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call updateSubscriptions operation
#
##############################################################################
call_updateSubscriptions() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=()
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(delete add)
    local path

    if ! path=$(build_request_path "/api/v1/users/me/subscriptions" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="PATCH"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call createUser operation
#
##############################################################################
call_createUser() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=()
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(email password full_name)
    local path

    if ! path=$(build_request_path "/api/v1/users" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="POST"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call createUserGroup operation
#
##############################################################################
call_createUserGroup() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=()
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(name description members)
    local path

    if ! path=$(build_request_path "/api/v1/user_groups/create" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="POST"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call deactivateOwnUser operation
#
##############################################################################
call_deactivateOwnUser() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=()
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=()
    local path

    if ! path=$(build_request_path "/api/v1/users/me" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="DELETE"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call deactivateUser operation
#
##############################################################################
call_deactivateUser() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(user_id)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=()
    local path

    if ! path=$(build_request_path "/api/v1/users/{user_id}" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="DELETE"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call getAttachments operation
#
##############################################################################
call_getAttachments() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=()
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=()
    local path

    if ! path=$(build_request_path "/api/v1/attachments" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call getOwnUser operation
#
##############################################################################
call_getOwnUser() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=()
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=()
    local path

    if ! path=$(build_request_path "/api/v1/users/me" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call getUser operation
#
##############################################################################
call_getUser() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(user_id)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(client_gravatar include_custom_profile_fields)
    local path

    if ! path=$(build_request_path "/api/v1/users/{user_id}" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call getUserByEmail operation
#
##############################################################################
call_getUserByEmail() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(email)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(client_gravatar include_custom_profile_fields)
    local path

    if ! path=$(build_request_path "/api/v1/users/{email}" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call getUserGroups operation
#
##############################################################################
call_getUserGroups() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=()
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=()
    local path

    if ! path=$(build_request_path "/api/v1/user_groups" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call getUserPresence operation
#
##############################################################################
call_getUserPresence() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(user_id_or_email)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=()
    local path

    if ! path=$(build_request_path "/api/v1/users/{user_id_or_email}/presence" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call getUsers operation
#
##############################################################################
call_getUsers() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=()
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(client_gravatar include_custom_profile_fields)
    local path

    if ! path=$(build_request_path "/api/v1/users" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call muteUser operation
#
##############################################################################
call_muteUser() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(muted_user_id)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=()
    local path

    if ! path=$(build_request_path "/api/v1/users/me/muted_users/{muted_user_id}" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="POST"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call reactivateUser operation
#
##############################################################################
call_reactivateUser() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(user_id)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=()
    local path

    if ! path=$(build_request_path "/api/v1/users/{user_id}/reactivate" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="POST"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call removeUserGroup operation
#
##############################################################################
call_removeUserGroup() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(user_group_id)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=()
    local path

    if ! path=$(build_request_path "/api/v1/user_groups/{user_group_id}" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="DELETE"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call setTypingStatus operation
#
##############################################################################
call_setTypingStatus() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=()
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(type op to topic)
    local path

    if ! path=$(build_request_path "/api/v1/typing" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="POST"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call unmuteUser operation
#
##############################################################################
call_unmuteUser() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(muted_user_id)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=()
    local path

    if ! path=$(build_request_path "/api/v1/users/me/muted_users/{muted_user_id}" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="DELETE"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call updateDisplaySettings operation
#
##############################################################################
call_updateDisplaySettings() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=()
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(twenty_four_hour_time dense_mode starred_message_counts fluid_layout_width high_contrast_mode color_scheme translate_emoticons default_language default_view left_side_userlist emojiset demote_inactive_streams timezone)
    local path

    if ! path=$(build_request_path "/api/v1/settings/display" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="PATCH"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call updateNotificationSettings operation
#
##############################################################################
call_updateNotificationSettings() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=()
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(enable_stream_desktop_notifications enable_stream_email_notifications enable_stream_push_notifications enable_stream_audible_notifications notification_sound enable_desktop_notifications enable_sounds enable_offline_email_notifications enable_offline_push_notifications enable_online_push_notifications enable_digest_emails enable_marketing_emails enable_login_emails message_content_in_email_notifications pm_content_in_desktop_notifications wildcard_mentions_notify desktop_icon_count_display realm_name_in_notifications presence_enabled)
    local path

    if ! path=$(build_request_path "/api/v1/settings/notifications" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="PATCH"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call updateUser operation
#
##############################################################################
call_updateUser() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(user_id)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(full_name role profile_data)
    local path

    if ! path=$(build_request_path "/api/v1/users/{user_id}" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="PATCH"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call updateUserGroup operation
#
##############################################################################
call_updateUserGroup() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(user_group_id)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(name description)
    local path

    if ! path=$(build_request_path "/api/v1/user_groups/{user_group_id}" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="PATCH"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call updateUserGroupMembers operation
#
##############################################################################
call_updateUserGroupMembers() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(user_group_id)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(delete add)
    local path

    if ! path=$(build_request_path "/api/v1/user_groups/{user_group_id}/members" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="POST"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call zulipOutgoingWebhooks operation
#
##############################################################################
call_zulipOutgoingWebhooks() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=()
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=()
    local path

    if ! path=$(build_request_path "/api/v1/zulip-outgoing-webhook" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="POST"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}



##############################################################################
#
# Main
#
##############################################################################


# Check dependencies
type curl >/dev/null 2>&1 || { echo >&2 "ERROR: You do not have 'cURL' installed."; exit 1; }
type sed >/dev/null 2>&1 || { echo >&2 "ERROR: You do not have 'sed' installed."; exit 1; }
type column >/dev/null 2>&1 || { echo >&2 "ERROR: You do not have 'bsdmainutils' installed."; exit 1; }

#
# Process command line
#
# Pass all arguments before 'operation' to cURL except the ones we override
#
take_user=false
take_host=false
take_accept_header=false
take_contenttype_header=false

for key in "$@"; do
# Take the value of -u|--user argument
if [[ "$take_user" = true ]]; then
    basic_auth_credential="$key"
    take_user=false
    continue
fi
# Take the value of --host argument
if [[ "$take_host" = true ]]; then
    host="$key"
    take_host=false
    continue
fi
# Take the value of --accept argument
if [[ "$take_accept_header" = true ]]; then
    header_accept=$(lookup_mime_type "$key")
    take_accept_header=false
    continue
fi
# Take the value of --content-type argument
if [[ "$take_contenttype_header" = true ]]; then
    header_content_type=$(lookup_mime_type "$key")
    take_contenttype_header=false
    continue
fi
case $key in
    -h|--help)
    if [[ "x$operation" == "x" ]]; then
        print_help
        exit 0
    else
        eval "print_${operation}_help"
        exit 0
    fi
    ;;
    -V|--version)
    print_version
    exit 0
    ;;
    --about)
    print_about
    exit 0
    ;;
    -u|--user)
    take_user=true
    ;;
    --host)
    take_host=true
    ;;
    --force)
    force=true
    ;;
    -ac|--accept)
    take_accept_header=true
    ;;
    -ct|--content-type)
    take_contenttype_header=true
    ;;
    --dry-run)
    print_curl=true
    ;;
    -nc|--no-colors)
        RED=""
        GREEN=""
        YELLOW=""
        BLUE=""
        MAGENTA=""
        CYAN=""
        WHITE=""
        BOLD=""
        OFF=""
        result_color_table=( "" "" "" "" "" "" "" )
    ;;
    devFetchApiKey)
    operation="devFetchApiKey"
    ;;
    fetchApiKey)
    operation="fetchApiKey"
    ;;
    addReaction)
    operation="addReaction"
    ;;
    checkMessagesMatchNarrow)
    operation="checkMessagesMatchNarrow"
    ;;
    deleteMessage)
    operation="deleteMessage"
    ;;
    getFileTemporaryUrl)
    operation="getFileTemporaryUrl"
    ;;
    getMessageHistory)
    operation="getMessageHistory"
    ;;
    getMessages)
    operation="getMessages"
    ;;
    getRawMessage)
    operation="getRawMessage"
    ;;
    markAllAsRead)
    operation="markAllAsRead"
    ;;
    markStreamAsRead)
    operation="markStreamAsRead"
    ;;
    markTopicAsRead)
    operation="markTopicAsRead"
    ;;
    removeReaction)
    operation="removeReaction"
    ;;
    renderMessage)
    operation="renderMessage"
    ;;
    sendMessage)
    operation="sendMessage"
    ;;
    updateMessage)
    operation="updateMessage"
    ;;
    updateMessageFlags)
    operation="updateMessageFlags"
    ;;
    uploadFile)
    operation="uploadFile"
    ;;
    deleteQueue)
    operation="deleteQueue"
    ;;
    getEvents)
    operation="getEvents"
    ;;
    realTimePost)
    operation="realTimePost"
    ;;
    registerQueue)
    operation="registerQueue"
    ;;
    restErrorHandling)
    operation="restErrorHandling"
    ;;
    addCodePlayground)
    operation="addCodePlayground"
    ;;
    addLinkifier)
    operation="addLinkifier"
    ;;
    createCustomProfileField)
    operation="createCustomProfileField"
    ;;
    getCustomEmoji)
    operation="getCustomEmoji"
    ;;
    getCustomProfileFields)
    operation="getCustomProfileFields"
    ;;
    getLinkifiers)
    operation="getLinkifiers"
    ;;
    getServerSettings)
    operation="getServerSettings"
    ;;
    removeCodePlayground)
    operation="removeCodePlayground"
    ;;
    removeLinkifier)
    operation="removeLinkifier"
    ;;
    reorderCustomProfileFields)
    operation="reorderCustomProfileFields"
    ;;
    updateLinkifier)
    operation="updateLinkifier"
    ;;
    uploadCustomEmoji)
    operation="uploadCustomEmoji"
    ;;
    archiveStream)
    operation="archiveStream"
    ;;
    createBigBlueButtonVideoCall)
    operation="createBigBlueButtonVideoCall"
    ;;
    getStreamId)
    operation="getStreamId"
    ;;
    getStreamTopics)
    operation="getStreamTopics"
    ;;
    getStreams)
    operation="getStreams"
    ;;
    getSubscriptionStatus)
    operation="getSubscriptionStatus"
    ;;
    getSubscriptions)
    operation="getSubscriptions"
    ;;
    muteTopic)
    operation="muteTopic"
    ;;
    subscribe)
    operation="subscribe"
    ;;
    unsubscribe)
    operation="unsubscribe"
    ;;
    updateStream)
    operation="updateStream"
    ;;
    updateSubscriptionSettings)
    operation="updateSubscriptionSettings"
    ;;
    updateSubscriptions)
    operation="updateSubscriptions"
    ;;
    createUser)
    operation="createUser"
    ;;
    createUserGroup)
    operation="createUserGroup"
    ;;
    deactivateOwnUser)
    operation="deactivateOwnUser"
    ;;
    deactivateUser)
    operation="deactivateUser"
    ;;
    getAttachments)
    operation="getAttachments"
    ;;
    getOwnUser)
    operation="getOwnUser"
    ;;
    getUser)
    operation="getUser"
    ;;
    getUserByEmail)
    operation="getUserByEmail"
    ;;
    getUserGroups)
    operation="getUserGroups"
    ;;
    getUserPresence)
    operation="getUserPresence"
    ;;
    getUsers)
    operation="getUsers"
    ;;
    muteUser)
    operation="muteUser"
    ;;
    reactivateUser)
    operation="reactivateUser"
    ;;
    removeUserGroup)
    operation="removeUserGroup"
    ;;
    setTypingStatus)
    operation="setTypingStatus"
    ;;
    unmuteUser)
    operation="unmuteUser"
    ;;
    updateDisplaySettings)
    operation="updateDisplaySettings"
    ;;
    updateNotificationSettings)
    operation="updateNotificationSettings"
    ;;
    updateUser)
    operation="updateUser"
    ;;
    updateUserGroup)
    operation="updateUserGroup"
    ;;
    updateUserGroupMembers)
    operation="updateUserGroupMembers"
    ;;
    zulipOutgoingWebhooks)
    operation="zulipOutgoingWebhooks"
    ;;
    *==*)
    # Parse body arguments and convert them into top level
    # JSON properties passed in the body content as strings
    if [[ "$operation" ]]; then
        IFS='==' read -r body_key sep body_value <<< "$key"
        body_parameters[${body_key}]="\"${body_value}\""
    fi
    ;;
    *:=*)
    # Parse body arguments and convert them into top level
    # JSON properties passed in the body content without qoutes
    if [[ "$operation" ]]; then
        # ignore error about 'sep' being unused
        # shellcheck disable=SC2034
        IFS=':=' read -r body_key sep body_value <<< "$key"
        body_parameters[${body_key}]=${body_value}
    fi
    ;;
    +([^=]):*)
    # Parse header arguments and convert them into curl
    # only after the operation argument
    if [[ "$operation" ]]; then
        IFS=':' read -r header_name header_value <<< "$key"
        header_arguments[$header_name]=$header_value
    else
        curl_arguments+=" $key"
    fi
    ;;
    -)
    body_content_temp_file=$(mktemp)
    cat - > "$body_content_temp_file"
    ;;
    *=*)
    # Parse operation arguments and convert them into curl
    # only after the operation argument
    if [[ "$operation" ]]; then
        IFS='=' read -r parameter_name parameter_value <<< "$key"
        if [[ -z "${operation_parameters[$parameter_name]+foo}" ]]; then
            operation_parameters[$parameter_name]=$(url_escape "${parameter_value}")
        else
            operation_parameters[$parameter_name]+=":::"$(url_escape "${parameter_value}")
        fi
    else
        curl_arguments+=" $key"
    fi
    ;;
    *)
    # If we are before the operation, treat the arguments as cURL arguments
    if [[ "x$operation" == "x" ]]; then
        # Maintain quotes around cURL arguments if necessary
        space_regexp="[[:space:]]"
        if [[ $key =~ $space_regexp ]]; then
            curl_arguments+=" \"$key\""
        else
            curl_arguments+=" $key"
        fi
    fi
    ;;
esac
done


# Check if user provided host name
if [[ -z "$host" ]]; then
    ERROR_MSG="ERROR: No hostname provided!!! You have to  provide on command line option '--host ...'"
    exit 1
fi

# Check if user specified operation ID
if [[ -z "$operation" ]]; then
    ERROR_MSG="ERROR: No operation specified!!!"
    exit 1
fi


# Run cURL command based on the operation ID
case $operation in
    devFetchApiKey)
    call_devFetchApiKey
    ;;
    fetchApiKey)
    call_fetchApiKey
    ;;
    addReaction)
    call_addReaction
    ;;
    checkMessagesMatchNarrow)
    call_checkMessagesMatchNarrow
    ;;
    deleteMessage)
    call_deleteMessage
    ;;
    getFileTemporaryUrl)
    call_getFileTemporaryUrl
    ;;
    getMessageHistory)
    call_getMessageHistory
    ;;
    getMessages)
    call_getMessages
    ;;
    getRawMessage)
    call_getRawMessage
    ;;
    markAllAsRead)
    call_markAllAsRead
    ;;
    markStreamAsRead)
    call_markStreamAsRead
    ;;
    markTopicAsRead)
    call_markTopicAsRead
    ;;
    removeReaction)
    call_removeReaction
    ;;
    renderMessage)
    call_renderMessage
    ;;
    sendMessage)
    call_sendMessage
    ;;
    updateMessage)
    call_updateMessage
    ;;
    updateMessageFlags)
    call_updateMessageFlags
    ;;
    uploadFile)
    call_uploadFile
    ;;
    deleteQueue)
    call_deleteQueue
    ;;
    getEvents)
    call_getEvents
    ;;
    realTimePost)
    call_realTimePost
    ;;
    registerQueue)
    call_registerQueue
    ;;
    restErrorHandling)
    call_restErrorHandling
    ;;
    addCodePlayground)
    call_addCodePlayground
    ;;
    addLinkifier)
    call_addLinkifier
    ;;
    createCustomProfileField)
    call_createCustomProfileField
    ;;
    getCustomEmoji)
    call_getCustomEmoji
    ;;
    getCustomProfileFields)
    call_getCustomProfileFields
    ;;
    getLinkifiers)
    call_getLinkifiers
    ;;
    getServerSettings)
    call_getServerSettings
    ;;
    removeCodePlayground)
    call_removeCodePlayground
    ;;
    removeLinkifier)
    call_removeLinkifier
    ;;
    reorderCustomProfileFields)
    call_reorderCustomProfileFields
    ;;
    updateLinkifier)
    call_updateLinkifier
    ;;
    uploadCustomEmoji)
    call_uploadCustomEmoji
    ;;
    archiveStream)
    call_archiveStream
    ;;
    createBigBlueButtonVideoCall)
    call_createBigBlueButtonVideoCall
    ;;
    getStreamId)
    call_getStreamId
    ;;
    getStreamTopics)
    call_getStreamTopics
    ;;
    getStreams)
    call_getStreams
    ;;
    getSubscriptionStatus)
    call_getSubscriptionStatus
    ;;
    getSubscriptions)
    call_getSubscriptions
    ;;
    muteTopic)
    call_muteTopic
    ;;
    subscribe)
    call_subscribe
    ;;
    unsubscribe)
    call_unsubscribe
    ;;
    updateStream)
    call_updateStream
    ;;
    updateSubscriptionSettings)
    call_updateSubscriptionSettings
    ;;
    updateSubscriptions)
    call_updateSubscriptions
    ;;
    createUser)
    call_createUser
    ;;
    createUserGroup)
    call_createUserGroup
    ;;
    deactivateOwnUser)
    call_deactivateOwnUser
    ;;
    deactivateUser)
    call_deactivateUser
    ;;
    getAttachments)
    call_getAttachments
    ;;
    getOwnUser)
    call_getOwnUser
    ;;
    getUser)
    call_getUser
    ;;
    getUserByEmail)
    call_getUserByEmail
    ;;
    getUserGroups)
    call_getUserGroups
    ;;
    getUserPresence)
    call_getUserPresence
    ;;
    getUsers)
    call_getUsers
    ;;
    muteUser)
    call_muteUser
    ;;
    reactivateUser)
    call_reactivateUser
    ;;
    removeUserGroup)
    call_removeUserGroup
    ;;
    setTypingStatus)
    call_setTypingStatus
    ;;
    unmuteUser)
    call_unmuteUser
    ;;
    updateDisplaySettings)
    call_updateDisplaySettings
    ;;
    updateNotificationSettings)
    call_updateNotificationSettings
    ;;
    updateUser)
    call_updateUser
    ;;
    updateUserGroup)
    call_updateUserGroup
    ;;
    updateUserGroupMembers)
    call_updateUserGroupMembers
    ;;
    zulipOutgoingWebhooks)
    call_zulipOutgoingWebhooks
    ;;
    *)
    ERROR_MSG="ERROR: Unknown operation: $operation"
    exit 1
esac
