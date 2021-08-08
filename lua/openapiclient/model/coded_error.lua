--[[
  Zulip REST API
 
  Powerful open source group chat 
 
  The version of the OpenAPI document: 1.0.0
  
  Generated by: https://openapi-generator.tech
]]

-- coded_error class
local coded_error = {}
local coded_error_mt = {
	__name = "coded_error";
	__index = coded_error;
}

local function cast_coded_error(t)
	return setmetatable(t, coded_error_mt)
end

local function new_coded_error(result, msg, code)
	return cast_coded_error({
		["result"] = result;
		["msg"] = msg;
		["code"] = code;
	})
end

return {
	cast = cast_coded_error;
	new = new_coded_error;
}