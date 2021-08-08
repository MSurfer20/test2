--[[
  Zulip REST API
 
  Powerful open source group chat 
 
  The version of the OpenAPI document: 1.0.0
  
  Generated by: https://openapi-generator.tech
]]

-- add_subscriptions_response_all_of class
local add_subscriptions_response_all_of = {}
local add_subscriptions_response_all_of_mt = {
	__name = "add_subscriptions_response_all_of";
	__index = add_subscriptions_response_all_of;
}

local function cast_add_subscriptions_response_all_of(t)
	return setmetatable(t, add_subscriptions_response_all_of_mt)
end

local function new_add_subscriptions_response_all_of(result, msg, subscribed, already_subscribed, unauthorized)
	return cast_add_subscriptions_response_all_of({
		["result"] = result;
		["msg"] = msg;
		["subscribed"] = subscribed;
		["already_subscribed"] = already_subscribed;
		["unauthorized"] = unauthorized;
	})
end

return {
	cast = cast_add_subscriptions_response_all_of;
	new = new_add_subscriptions_response_all_of;
}