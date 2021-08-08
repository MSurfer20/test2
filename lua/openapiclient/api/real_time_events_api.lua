--[[
  Zulip REST API
 
  Powerful open source group chat 
 
  The version of the OpenAPI document: 1.0.0
  
  Generated by: https://openapi-generator.tech
]]

--package openapiclient

local http_request = require "http.request"
local http_util = require "http.util"
local dkjson = require "dkjson"
local basexx = require "basexx"

-- model import
local openapiclient_bad_event_queue_id_error = require "openapiclient.model.bad_event_queue_id_error"
local openapiclient_json_success = require "openapiclient.model.json_success"
local openapiclient_json_success_base = require "openapiclient.model.json_success_base"
local openapiclient_todo_object_mapping = require "openapiclient.model.todo_object_mapping"
local openapiclient_one_of_invalid_api_key_error_missing_argument_error_user_not_authorized_error = require "openapiclient.model.one_of_invalid_api_key_error_missing_argument_error_user_not_authorized_error"
local openapiclient_one_of_rate_limited_error = require "openapiclient.model.one_of_rate_limited_error"
local openapiclient_one_of_user_deactivated_error_realm_deactivated_error = require "openapiclient.model.one_of_user_deactivated_error_realm_deactivated_error"

local real_time_events_api = {}
local real_time_events_api_mt = {
	__name = "real_time_events_api";
	__index = real_time_events_api;
}

local function new_real_time_events_api(authority, basePath, schemes)
	local schemes_map = {}
	for _,v in ipairs(schemes) do
		schemes_map[v] = v
	end
	local default_scheme = schemes_map.https or schemes_map.http
	local host, port = http_util.split_authority(authority, default_scheme)
	return setmetatable({
		host = host;
		port = port;
		basePath = basePath or "https://example.zulipchat.com/api/v1";
		schemes = schemes_map;
		default_scheme = default_scheme;
		http_username = nil;
		http_password = nil;
		api_key = {};
		access_token = nil;
	}, real_time_events_api_mt)
end

function real_time_events_api:delete_queue(queue_id)
	local req = http_request.new_from_uri({
		scheme = self.default_scheme;
		host = self.host;
		port = self.port;
		path = string.format("%s/events?queue_id=%s",
			self.basePath, http_util.encodeURIComponent(queue_id));
	})

	-- set HTTP verb
	req.headers:upsert(":method", "DELETE")
	-- TODO: create a function to select proper content-type
	--local var_accept = { "application/json" }
	req.headers:upsert("content-type", "application/json")


	-- make the HTTP call
	local headers, stream, errno = req:go()
	if not headers then
		return nil, stream, errno
	end
	local http_status = headers:get(":status")
	if http_status:sub(1,1) == "2" then
		local body, err, errno2 = stream:get_body_as_string()
		-- exception when getting the HTTP body
		if not body then
			return nil, err, errno2
		end
		stream:shutdown()
		local result, _, err3 = dkjson.decode(body)
		-- exception when decoding the HTTP body
		if result == nil then
			return nil, err3
		end
		return openapiclient_json_success.cast(result), headers
	else
		local body, err, errno2 = stream:get_body_as_string()
		if not body then
			return nil, err, errno2
		end
		stream:shutdown()
		-- return the error message (http body)
		return nil, http_status, body
	end
end

function real_time_events_api:get_events(queue_id, last_event_id, dont_block)
	local req = http_request.new_from_uri({
		scheme = self.default_scheme;
		host = self.host;
		port = self.port;
		path = string.format("%s/events?queue_id=%s&last_event_id=%s&dont_block=%s",
			self.basePath, http_util.encodeURIComponent(queue_id), http_util.encodeURIComponent(last_event_id), http_util.encodeURIComponent(dont_block));
	})

	-- set HTTP verb
	req.headers:upsert(":method", "GET")
	-- TODO: create a function to select proper content-type
	--local var_accept = { "application/json" }
	req.headers:upsert("content-type", "application/json")


	-- make the HTTP call
	local headers, stream, errno = req:go()
	if not headers then
		return nil, stream, errno
	end
	local http_status = headers:get(":status")
	if http_status:sub(1,1) == "2" then
		local body, err, errno2 = stream:get_body_as_string()
		-- exception when getting the HTTP body
		if not body then
			return nil, err, errno2
		end
		stream:shutdown()
		local result, _, err3 = dkjson.decode(body)
		-- exception when decoding the HTTP body
		if result == nil then
			return nil, err3
		end
		return openapiclient_json_success_base.cast(result), headers
	else
		local body, err, errno2 = stream:get_body_as_string()
		if not body then
			return nil, err, errno2
		end
		stream:shutdown()
		-- return the error message (http body)
		return nil, http_status, body
	end
end

function real_time_events_api:real_time_post(event_types, narrow, all_public_streams)
	local req = http_request.new_from_uri({
		scheme = self.default_scheme;
		host = self.host;
		port = self.port;
		path = string.format("%s/real-time?event_types=%s&narrow=%s&all_public_streams=%s",
			self.basePath, http_util.encodeURIComponent(event_types), http_util.encodeURIComponent(narrow), http_util.encodeURIComponent(all_public_streams));
	})

	-- set HTTP verb
	req.headers:upsert(":method", "POST")

	-- make the HTTP call
	local headers, stream, errno = req:go()
	if not headers then
		return nil, stream, errno
	end
	local http_status = headers:get(":status")
	if http_status:sub(1,1) == "2" then
		return nil, headers
	else
		local body, err, errno2 = stream:get_body_as_string()
		if not body then
			return nil, err, errno2
		end
		stream:shutdown()
		-- return the error message (http body)
		return nil, http_status, body
	end
end

function real_time_events_api:register_queue(apply_markdown, client_gravatar, slim_presence, event_types, all_public_streams, include_subscribers, client_capabilities, fetch_event_types, narrow)
	local req = http_request.new_from_uri({
		scheme = self.default_scheme;
		host = self.host;
		port = self.port;
		path = string.format("%s/register?apply_markdown=%s&client_gravatar=%s&slim_presence=%s&event_types=%s&all_public_streams=%s&include_subscribers=%s&client_capabilities=%s&fetch_event_types=%s&narrow=%s",
			self.basePath, http_util.encodeURIComponent(apply_markdown), http_util.encodeURIComponent(client_gravatar), http_util.encodeURIComponent(slim_presence), http_util.encodeURIComponent(event_types), http_util.encodeURIComponent(all_public_streams), http_util.encodeURIComponent(include_subscribers), http_util.encodeURIComponent(client_capabilities), http_util.encodeURIComponent(fetch_event_types), http_util.encodeURIComponent(narrow));
	})

	-- set HTTP verb
	req.headers:upsert(":method", "POST")
	-- TODO: create a function to select proper content-type
	--local var_accept = { "application/json" }
	req.headers:upsert("content-type", "application/json")


	-- make the HTTP call
	local headers, stream, errno = req:go()
	if not headers then
		return nil, stream, errno
	end
	local http_status = headers:get(":status")
	if http_status:sub(1,1) == "2" then
		local body, err, errno2 = stream:get_body_as_string()
		-- exception when getting the HTTP body
		if not body then
			return nil, err, errno2
		end
		stream:shutdown()
		local result, _, err3 = dkjson.decode(body)
		-- exception when decoding the HTTP body
		if result == nil then
			return nil, err3
		end
		return openapiclient_json_success_base.cast(result), headers
	else
		local body, err, errno2 = stream:get_body_as_string()
		if not body then
			return nil, err, errno2
		end
		stream:shutdown()
		-- return the error message (http body)
		return nil, http_status, body
	end
end

function real_time_events_api:rest_error_handling()
	local req = http_request.new_from_uri({
		scheme = self.default_scheme;
		host = self.host;
		port = self.port;
		path = string.format("%s/rest-error-handling",
			self.basePath);
	})

	-- set HTTP verb
	req.headers:upsert(":method", "POST")
	-- TODO: create a function to select proper content-type
	--local var_accept = { "application/json" }
	req.headers:upsert("content-type", "application/json")


	-- make the HTTP call
	local headers, stream, errno = req:go()
	if not headers then
		return nil, stream, errno
	end
	local http_status = headers:get(":status")
	if http_status:sub(1,1) == "2" then
		return nil, headers
	else
		local body, err, errno2 = stream:get_body_as_string()
		if not body then
			return nil, err, errno2
		end
		stream:shutdown()
		-- return the error message (http body)
		return nil, http_status, body
	end
end

return {
	new = new_real_time_events_api;
}
