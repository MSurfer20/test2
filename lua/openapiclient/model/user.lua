--[[
  Zulip REST API
 
  Powerful open source group chat 
 
  The version of the OpenAPI document: 1.0.0
  
  Generated by: https://openapi-generator.tech
]]

-- user class
local user = {}
local user_mt = {
	__name = "user";
	__index = user;
}

local function cast_user(t)
	return setmetatable(t, user_mt)
end

local function new_user(email, is_bot, avatar_url, avatar_version, full_name, is_admin, is_owner, is_billing_admin, role, bot_type, user_id, bot_owner_id, is_active, is_guest, timezone, date_joined, delivery_email, profile_data)
	return cast_user({
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
	cast = cast_user;
	new = new_user;
}
