--[[
  Zulip REST API
 
  Powerful open source group chat 
 
  The version of the OpenAPI document: 1.0.0
  
  Generated by: https://openapi-generator.tech
]]

-- attachments_messages class
local attachments_messages = {}
local attachments_messages_mt = {
	__name = "attachments_messages";
	__index = attachments_messages;
}

local function cast_attachments_messages(t)
	return setmetatable(t, attachments_messages_mt)
end

local function new_attachments_messages(date_sent, id)
	return cast_attachments_messages({
		["date_sent"] = date_sent;
		["id"] = id;
	})
end

return {
	cast = cast_attachments_messages;
	new = new_attachments_messages;
}
