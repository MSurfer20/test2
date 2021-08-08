--[[
  Zulip REST API
 
  Powerful open source group chat 
 
  The version of the OpenAPI document: 1.0.0
  
  Generated by: https://openapi-generator.tech
]]

-- json_error class
local json_error = {}
local json_error_mt = {
	__name = "json_error";
	__index = json_error;
}

local function cast_json_error(t)
	return setmetatable(t, json_error_mt)
end

local function new_json_error(result, msg)
	return cast_json_error({
		["result"] = result;
		["msg"] = msg;
	})
end

return {
	cast = cast_json_error;
	new = new_json_error;
}