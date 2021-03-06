--[[
  Zulip REST API
 
  Powerful open source group chat 
 
  The version of the OpenAPI document: 1.0.0
  
  Generated by: https://openapi-generator.tech
]]

-- emoji_reaction_base_all_of_user class
local emoji_reaction_base_all_of_user = {}
local emoji_reaction_base_all_of_user_mt = {
	__name = "emoji_reaction_base_all_of_user";
	__index = emoji_reaction_base_all_of_user;
}

local function cast_emoji_reaction_base_all_of_user(t)
	return setmetatable(t, emoji_reaction_base_all_of_user_mt)
end

local function new_emoji_reaction_base_all_of_user(id, email, full_name, is_mirror_dummy)
	return cast_emoji_reaction_base_all_of_user({
		["id"] = id;
		["email"] = email;
		["full_name"] = full_name;
		["is_mirror_dummy"] = is_mirror_dummy;
	})
end

return {
	cast = cast_emoji_reaction_base_all_of_user;
	new = new_emoji_reaction_base_all_of_user;
}
