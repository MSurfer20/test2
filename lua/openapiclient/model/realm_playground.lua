--[[
  Zulip REST API
 
  Powerful open source group chat 
 
  The version of the OpenAPI document: 1.0.0
  
  Generated by: https://openapi-generator.tech
]]

-- realm_playground class
local realm_playground = {}
local realm_playground_mt = {
	__name = "realm_playground";
	__index = realm_playground;
}

local function cast_realm_playground(t)
	return setmetatable(t, realm_playground_mt)
end

local function new_realm_playground(id, name, pygments_language, url_prefix)
	return cast_realm_playground({
		["id"] = id;
		["name"] = name;
		["pygments_language"] = pygments_language;
		["url_prefix"] = url_prefix;
	})
end

return {
	cast = cast_realm_playground;
	new = new_realm_playground;
}
