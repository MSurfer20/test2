--[[
  Zulip REST API
 
  Powerful open source group chat 
 
  The version of the OpenAPI document: 1.0.0
  
  Generated by: https://openapi-generator.tech
]]

-- draft class
local draft = {}
local draft_mt = {
	__name = "draft";
	__index = draft;
}

local function cast_draft(t)
	return setmetatable(t, draft_mt)
end

local function new_draft(id, type, to, topic, content, timestamp)
	return cast_draft({
		["id"] = id;
		["type"] = type;
		["to"] = to;
		["topic"] = topic;
		["content"] = content;
		["timestamp"] = timestamp;
	})
end

return {
	cast = cast_draft;
	new = new_draft;
}
