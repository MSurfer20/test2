--[[
  Zulip REST API
 
  Powerful open source group chat 
 
  The version of the OpenAPI document: 1.0.0
  
  Generated by: https://openapi-generator.tech
]]

-- default_stream_group class
local default_stream_group = {}
local default_stream_group_mt = {
	__name = "default_stream_group";
	__index = default_stream_group;
}

local function cast_default_stream_group(t)
	return setmetatable(t, default_stream_group_mt)
end

local function new_default_stream_group(name, description, id, streams)
	return cast_default_stream_group({
		["name"] = name;
		["description"] = description;
		["id"] = id;
		["streams"] = streams;
	})
end

return {
	cast = cast_default_stream_group;
	new = new_default_stream_group;
}
