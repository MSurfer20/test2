--[[
  Zulip REST API
 
  Powerful open source group chat 
 
  The version of the OpenAPI document: 1.0.0
  
  Generated by: https://openapi-generator.tech
]]

-- basic_bot_all_of class
local basic_bot_all_of = {}
local basic_bot_all_of_mt = {
	__name = "basic_bot_all_of";
	__index = basic_bot_all_of;
}

local function cast_basic_bot_all_of(t)
	return setmetatable(t, basic_bot_all_of_mt)
end

local function new_basic_bot_all_of(user_id, full_name, api_key, default_sending_stream, default_events_register_stream, default_all_public_streams, avatar_url, owner_id, services)
	return cast_basic_bot_all_of({
		["user_id"] = user_id;
		["full_name"] = full_name;
		["api_key"] = api_key;
		["default_sending_stream"] = default_sending_stream;
		["default_events_register_stream"] = default_events_register_stream;
		["default_all_public_streams"] = default_all_public_streams;
		["avatar_url"] = avatar_url;
		["owner_id"] = owner_id;
		["services"] = services;
	})
end

return {
	cast = cast_basic_bot_all_of;
	new = new_basic_bot_all_of;
}
