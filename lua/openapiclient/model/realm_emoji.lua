--[[
  Zulip REST API
 
  Powerful open source group chat 
 
  The version of the OpenAPI document: 1.0.0
  
  Generated by: https://openapi-generator.tech
]]

-- realm_emoji class
local realm_emoji = {}
local realm_emoji_mt = {
	__name = "realm_emoji";
	__index = realm_emoji;
}

local function cast_realm_emoji(t)
	return setmetatable(t, realm_emoji_mt)
end

local function new_realm_emoji(id, name, source_url, deactivated, author_id)
	return cast_realm_emoji({
		["id"] = id;
		["name"] = name;
		["source_url"] = source_url;
		["deactivated"] = deactivated;
		["author_id"] = author_id;
	})
end

return {
	cast = cast_realm_emoji;
	new = new_realm_emoji;
}
