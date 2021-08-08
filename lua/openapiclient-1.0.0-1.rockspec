package = "openapiclient"
version = "1.0.0-1"
source = {
	url = "https://github.com/GIT_USER_ID/GIT_REPO_ID.git"
}

description = {
	summary = "API client genreated by OpenAPI Generator",
	detailed = [[
Powerful open source group chat ]],
	homepage = "https://openapi-generator.tech",
	license = "Unlicense",
	maintainer = "OpenAPI Generator contributors",
}

dependencies = {
	"lua >= 5.2",
	"http",
	"dkjson",
	"basexx"
}

build = {
	type = "builtin",
	modules = {
		["openapiclient.api.authentication_api"] = "openapiclient/api/authentication_api.lua";
		["openapiclient.api.messages_api"] = "openapiclient/api/messages_api.lua";
		["openapiclient.api.real_time_events_api"] = "openapiclient/api/real_time_events_api.lua";
		["openapiclient.api.server_and_organizations_api"] = "openapiclient/api/server_and_organizations_api.lua";
		["openapiclient.api.streams_api"] = "openapiclient/api/streams_api.lua";
		["openapiclient.api.users_api"] = "openapiclient/api/users_api.lua";
		["openapiclient.api.webhooks_api"] = "openapiclient/api/webhooks_api.lua";
		["openapiclient.model.add_subscriptions_response"] = "openapiclient/model/add_subscriptions_response.lua";
		["openapiclient.model.add_subscriptions_response_all_of"] = "openapiclient/model/add_subscriptions_response_all_of.lua";
		["openapiclient.model.api_key_response"] = "openapiclient/model/api_key_response.lua";
		["openapiclient.model.api_key_response_all_of"] = "openapiclient/model/api_key_response_all_of.lua";
		["openapiclient.model.attachments"] = "openapiclient/model/attachments.lua";
		["openapiclient.model.attachments_messages"] = "openapiclient/model/attachments_messages.lua";
		["openapiclient.model.bad_event_queue_id_error"] = "openapiclient/model/bad_event_queue_id_error.lua";
		["openapiclient.model.bad_event_queue_id_error_all_of"] = "openapiclient/model/bad_event_queue_id_error_all_of.lua";
		["openapiclient.model.basic_bot"] = "openapiclient/model/basic_bot.lua";
		["openapiclient.model.basic_bot_all_of"] = "openapiclient/model/basic_bot_all_of.lua";
		["openapiclient.model.basic_bot_base"] = "openapiclient/model/basic_bot_base.lua";
		["openapiclient.model.basic_stream"] = "openapiclient/model/basic_stream.lua";
		["openapiclient.model.basic_stream_all_of"] = "openapiclient/model/basic_stream_all_of.lua";
		["openapiclient.model.basic_stream_base"] = "openapiclient/model/basic_stream_base.lua";
		["openapiclient.model.bot"] = "openapiclient/model/bot.lua";
		["openapiclient.model.bot_all_of"] = "openapiclient/model/bot_all_of.lua";
		["openapiclient.model.coded_error"] = "openapiclient/model/coded_error.lua";
		["openapiclient.model.coded_error_all_of"] = "openapiclient/model/coded_error_all_of.lua";
		["openapiclient.model.coded_error_base"] = "openapiclient/model/coded_error_base.lua";
		["openapiclient.model.coded_error_base_all_of"] = "openapiclient/model/coded_error_base_all_of.lua";
		["openapiclient.model.custom_profile_field"] = "openapiclient/model/custom_profile_field.lua";
		["openapiclient.model.default_stream_group"] = "openapiclient/model/default_stream_group.lua";
		["openapiclient.model.emoji_reaction"] = "openapiclient/model/emoji_reaction.lua";
		["openapiclient.model.emoji_reaction_all_of"] = "openapiclient/model/emoji_reaction_all_of.lua";
		["openapiclient.model.emoji_reaction_base"] = "openapiclient/model/emoji_reaction_base.lua";
		["openapiclient.model.emoji_reaction_base_user"] = "openapiclient/model/emoji_reaction_base_user.lua";
		["openapiclient.model.get_messages"] = "openapiclient/model/get_messages.lua";
		["openapiclient.model.get_messages_all_of"] = "openapiclient/model/get_messages_all_of.lua";
		["openapiclient.model.hotspot"] = "openapiclient/model/hotspot.lua";
		["openapiclient.model.inline_response_200"] = "openapiclient/model/inline_response_200.lua";
		["openapiclient.model.invalid_api_key_error"] = "openapiclient/model/invalid_api_key_error.lua";
		["openapiclient.model.invalid_message_error"] = "openapiclient/model/invalid_message_error.lua";
		["openapiclient.model.invalid_message_error_all_of"] = "openapiclient/model/invalid_message_error_all_of.lua";
		["openapiclient.model.json_error"] = "openapiclient/model/json_error.lua";
		["openapiclient.model.json_error_base"] = "openapiclient/model/json_error_base.lua";
		["openapiclient.model.json_error_base_all_of"] = "openapiclient/model/json_error_base_all_of.lua";
		["openapiclient.model.json_response_base"] = "openapiclient/model/json_response_base.lua";
		["openapiclient.model.json_success"] = "openapiclient/model/json_success.lua";
		["openapiclient.model.json_success_all_of"] = "openapiclient/model/json_success_all_of.lua";
		["openapiclient.model.json_success_base"] = "openapiclient/model/json_success_base.lua";
		["openapiclient.model.json_success_base_all_of"] = "openapiclient/model/json_success_base_all_of.lua";
		["openapiclient.model.messages"] = "openapiclient/model/messages.lua";
		["openapiclient.model.messages_all_of"] = "openapiclient/model/messages_all_of.lua";
		["openapiclient.model.messages_base"] = "openapiclient/model/messages_base.lua";
		["openapiclient.model.messages_base_topic_links"] = "openapiclient/model/messages_base_topic_links.lua";
		["openapiclient.model.missing_argument_error"] = "openapiclient/model/missing_argument_error.lua";
		["openapiclient.model.missing_argument_error_all_of"] = "openapiclient/model/missing_argument_error_all_of.lua";
		["openapiclient.model.non_existing_stream_error"] = "openapiclient/model/non_existing_stream_error.lua";
		["openapiclient.model.non_existing_stream_error_all_of"] = "openapiclient/model/non_existing_stream_error_all_of.lua";
		["openapiclient.model.presence"] = "openapiclient/model/presence.lua";
		["openapiclient.model.rate_limited_error"] = "openapiclient/model/rate_limited_error.lua";
		["openapiclient.model.realm_deactivated_error"] = "openapiclient/model/realm_deactivated_error.lua";
		["openapiclient.model.realm_domain"] = "openapiclient/model/realm_domain.lua";
		["openapiclient.model.realm_emoji"] = "openapiclient/model/realm_emoji.lua";
		["openapiclient.model.realm_export"] = "openapiclient/model/realm_export.lua";
		["openapiclient.model.realm_playground"] = "openapiclient/model/realm_playground.lua";
		["openapiclient.model.subscriptions"] = "openapiclient/model/subscriptions.lua";
		["openapiclient.model.user"] = "openapiclient/model/user.lua";
		["openapiclient.model.user_all_of"] = "openapiclient/model/user_all_of.lua";
		["openapiclient.model.user_base"] = "openapiclient/model/user_base.lua";
		["openapiclient.model.user_deactivated_error"] = "openapiclient/model/user_deactivated_error.lua";
		["openapiclient.model.user_group"] = "openapiclient/model/user_group.lua";
		["openapiclient.model.user_not_authorized_error"] = "openapiclient/model/user_not_authorized_error.lua";
	}
}
