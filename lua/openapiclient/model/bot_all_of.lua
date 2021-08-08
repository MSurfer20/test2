--[[
  Zulip REST API
 
  Powerful open source group chat 
 
  The version of the OpenAPI document: 1.0.0
  
  Generated by: https://openapi-generator.tech
]]

-- bot_all_of class
local bot_all_of = {}
local bot_all_of_mt = {
	__name = "bot_all_of";
	__index = bot_all_of;
}

local function cast_bot_all_of(t)
	return setmetatable(t, bot_all_of_mt)
end

local function new_bot_all_of(user_id, full_name, api_key, default_sending_stream, default_events_register_stream, default_all_public_streams, avatar_url, owner_id, services, email, bot_type, is_active)
	return cast_bot_all_of({
		["user_id"] = user_id;
		["full_name"] = full_name;
		["api_key"] = api_key;
		["default_sending_stream"] = default_sending_stream;
		["default_events_register_stream"] = default_events_register_stream;
		["default_all_public_streams"] = default_all_public_streams;
		["avatar_url"] = avatar_url;
		["owner_id"] = owner_id;
		["services"] = services;
		["email"] = email;
		["bot_type"] = bot_type;
		["is_active"] = is_active;
	})
end

return {
	cast = cast_bot_all_of;
	new = new_bot_all_of;
}