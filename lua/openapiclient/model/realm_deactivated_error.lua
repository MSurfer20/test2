--[[
  Zulip REST API
 
  Powerful open source group chat 
 
  The version of the OpenAPI document: 1.0.0
  
  Generated by: https://openapi-generator.tech
]]

-- realm_deactivated_error class
local realm_deactivated_error = {}
local realm_deactivated_error_mt = {
	__name = "realm_deactivated_error";
	__index = realm_deactivated_error;
}

local function cast_realm_deactivated_error(t)
	return setmetatable(t, realm_deactivated_error_mt)
end

local function new_realm_deactivated_error(result, msg, code)
	return cast_realm_deactivated_error({
		["result"] = result;
		["msg"] = msg;
		["code"] = code;
	})
end

return {
	cast = cast_realm_deactivated_error;
	new = new_realm_deactivated_error;
}
