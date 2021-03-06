--[[
  Zulip REST API
 
  Powerful open source group chat 
 
  The version of the OpenAPI document: 1.0.0
  
  Generated by: https://openapi-generator.tech
]]

-- user_base class
local user_base = {}
local user_base_mt = {
	__name = "user_base";
	__index = user_base;
}

local function cast_user_base(t)
	return setmetatable(t, user_base_mt)
end

local function new_user_base(email, is_bot, avatar_url, avatar_version, full_name, is_admin, is_owner, is_billing_admin, role, bot_type, user_id, bot_owner_id, is_active, is_guest, timezone, date_joined, delivery_email, profile_data)
	return cast_user_base({
		["email"] = email;
		["is_bot"] = is_bot;
		["avatar_url"] = avatar_url;
		["avatar_version"] = avatar_version;
		["full_name"] = full_name;
		["is_admin"] = is_admin;
		["is_owner"] = is_owner;
		["is_billing_admin"] = is_billing_admin;
		["role"] = role;
		["bot_type"] = bot_type;
		["user_id"] = user_id;
		["bot_owner_id"] = bot_owner_id;
		["is_active"] = is_active;
		["is_guest"] = is_guest;
		["timezone"] = timezone;
		["date_joined"] = date_joined;
		["delivery_email"] = delivery_email;
		["profile_data"] = profile_data;
	})
end

return {
	cast = cast_user_base;
	new = new_user_base;
}
