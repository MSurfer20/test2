--[[
  Zulip REST API
 
  Powerful open source group chat 
 
  The version of the OpenAPI document: 1.0.0
  
  Generated by: https://openapi-generator.tech
]]

-- basic_stream_base class
local basic_stream_base = {}
local basic_stream_base_mt = {
	__name = "basic_stream_base";
	__index = basic_stream_base;
}

local function cast_basic_stream_base(t)
	return setmetatable(t, basic_stream_base_mt)
end

local function new_basic_stream_base(stream_id, name, description, date_created, invite_only, rendered_description, is_web_public, stream_post_policy, message_retention_days, history_public_to_subscribers, first_message_id, is_announcement_only)
	return cast_basic_stream_base({
		["stream_id"] = stream_id;
		["name"] = name;
		["description"] = description;
		["date_created"] = date_created;
		["invite_only"] = invite_only;
		["rendered_description"] = rendered_description;
		["is_web_public"] = is_web_public;
		["stream_post_policy"] = stream_post_policy;
		["message_retention_days"] = message_retention_days;
		["history_public_to_subscribers"] = history_public_to_subscribers;
		["first_message_id"] = first_message_id;
		["is_announcement_only"] = is_announcement_only;
	})
end

return {
	cast = cast_basic_stream_base;
	new = new_basic_stream_base;
}
