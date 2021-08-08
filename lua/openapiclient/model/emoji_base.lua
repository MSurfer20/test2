--[[
  Zulip REST API
 
  Powerful open source group chat 
 
  The version of the OpenAPI document: 1.0.0
  
  Generated by: https://openapi-generator.tech
]]

-- emoji_base class
local emoji_base = {}
local emoji_base_mt = {
	__name = "emoji_base";
	__index = emoji_base;
}

local function cast_emoji_base(t)
	return setmetatable(t, emoji_base_mt)
end

local function new_emoji_base(emoji_code, emoji_name, reaction_type)
	return cast_emoji_base({
		["emoji_code"] = emoji_code;
		["emoji_name"] = emoji_name;
		["reaction_type"] = reaction_type;
	})
end

return {
	cast = cast_emoji_base;
	new = new_emoji_base;
}
