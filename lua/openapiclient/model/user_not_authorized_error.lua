--[[
  Zulip REST API
 
  Powerful open source group chat 
 
  The version of the OpenAPI document: 1.0.0
  
  Generated by: https://openapi-generator.tech
]]

-- user_not_authorized_error class
local user_not_authorized_error = {}
local user_not_authorized_error_mt = {
	__name = "user_not_authorized_error";
	__index = user_not_authorized_error;
}

local function cast_user_not_authorized_error(t)
	return setmetatable(t, user_not_authorized_error_mt)
end

local function new_user_not_authorized_error(result, msg, code)
	return cast_user_not_authorized_error({
		["result"] = result;
		["msg"] = msg;
		["code"] = code;
	})
end

return {
	cast = cast_user_not_authorized_error;
	new = new_user_not_authorized_error;
}
