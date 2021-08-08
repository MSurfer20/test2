--[[
  Zulip REST API
 
  Powerful open source group chat 
 
  The version of the OpenAPI document: 1.0.0
  
  Generated by: https://openapi-generator.tech
]]

-- presence class
local presence = {}
local presence_mt = {
	__name = "presence";
	__index = presence;
}

local function cast_presence(t)
	return setmetatable(t, presence_mt)
end

local function new_presence(client, status, timestamp, pushable)
	return cast_presence({
		["client"] = client;
		["status"] = status;
		["timestamp"] = timestamp;
		["pushable"] = pushable;
	})
end

return {
	cast = cast_presence;
	new = new_presence;
}
