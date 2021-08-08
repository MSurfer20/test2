--[[
  Zulip REST API
 
  Powerful open source group chat 
 
  The version of the OpenAPI document: 1.0.0
  
  Generated by: https://openapi-generator.tech
]]

-- invalid_api_key_error class
local invalid_api_key_error = {}
local invalid_api_key_error_mt = {
	__name = "invalid_api_key_error";
	__index = invalid_api_key_error;
}

local function cast_invalid_api_key_error(t)
	return setmetatable(t, invalid_api_key_error_mt)
end

local function new_invalid_api_key_error(result, msg)
	return cast_invalid_api_key_error({
		["result"] = result;
		["msg"] = msg;
	})
end

return {
	cast = cast_invalid_api_key_error;
	new = new_invalid_api_key_error;
}
