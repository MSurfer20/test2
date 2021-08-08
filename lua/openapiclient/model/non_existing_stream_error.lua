--[[
  Zulip REST API
 
  Powerful open source group chat 
 
  The version of the OpenAPI document: 1.0.0
  
  Generated by: https://openapi-generator.tech
]]

-- non_existing_stream_error class
local non_existing_stream_error = {}
local non_existing_stream_error_mt = {
	__name = "non_existing_stream_error";
	__index = non_existing_stream_error;
}

local function cast_non_existing_stream_error(t)
	return setmetatable(t, non_existing_stream_error_mt)
end

local function new_non_existing_stream_error(result, msg, code, stream)
	return cast_non_existing_stream_error({
		["result"] = result;
		["msg"] = msg;
		["code"] = code;
		["stream"] = stream;
	})
end

return {
	cast = cast_non_existing_stream_error;
	new = new_non_existing_stream_error;
}