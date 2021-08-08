#include <glib-object.h>
#include <json-glib/json-glib.h>

#include "StreamsManager.h"
#include "NetClient.h"
#include "Helpers.h"
#include "Error.h"
#include "RequestInfo.h"

using namespace std;
using namespace Tizen::ArtikCloud;


StreamsManager::StreamsManager()
{

}

StreamsManager::~StreamsManager()
{

}

static gboolean __StreamsManagerresponseHandler(gpointer data)
{
	RequestInfo *request = static_cast<RequestInfo*>(data);
	g_thread_join(request->thread);

	// invoke the callback function
	bool retval = request->processor(*(request->p_chunk), *(request->code), request->errormsg, request->userData, request->handler);

	delete request;
	return FALSE;
}

static gpointer __StreamsManagerthreadFunc(gpointer data)
{
	RequestInfo *request = static_cast<RequestInfo*>(data);

	// handle the request
	NetClient::easycurl(request->host, request->path, request->method, request->queryParams,
	request->mBody, request->headerList, request->p_chunk, request->code, request->errormsg);

	request->thread = g_thread_self();
	g_idle_add(__StreamsManagerresponseHandler, static_cast<gpointer>(request));

	return NULL;
}


static bool archiveStreamProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(JsonSuccess, Error, void* )
	= reinterpret_cast<void(*)(JsonSuccess, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	JsonSuccess out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("JsonSuccess")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "JsonSuccess", "JsonSuccess");
			json_node_free(pJson);

			if ("JsonSuccess" == "std::string") {
				string* val = (std::string*)(&out);
				if (val->empty() && p_chunk.size>4) {
					*val = string(p_chunk.memory, p_chunk.size);
				}
			}
		} else {
			
			out.fromJson(data);
			char *jsonStr =  out.toJson();
			printf("\n%s\n", jsonStr);
			g_free(static_cast<gpointer>(jsonStr));
			
			out.fromJson(data);
			char *jsonStr =  out.toJson();
			printf("\n%s\n", jsonStr);
			g_free(static_cast<gpointer>(jsonStr));
			
		}
		handler(out, error, userData);
		return true;
		//TODO: handle case where json parsing has an error

	} else {
		Error error;
		if (errormsg != NULL) {
			error = Error(code, string(errormsg));
		} else if (p_chunk.memory != NULL) {
			error = Error(code, string(p_chunk.memory));
		} else {
			error = Error(code, string("Unknown Error"));
		}
		 handler(out, error, userData);
		return false;
			}
}

static bool archiveStreamHelper(char * accessToken,
	int streamId, 
	void(* handler)(JsonSuccess, Error, void* )
	, void* userData, bool isAsync)
{

	//TODO: maybe delete headerList after its used to free up space?
	struct curl_slist *headerList = NULL;

	
	string accessHeader = "Authorization: Bearer ";
	accessHeader.append(accessToken);
	headerList = curl_slist_append(headerList, accessHeader.c_str());
	headerList = curl_slist_append(headerList, "Content-Type: application/json");

	map <string, string> queryParams;
	string itemAtq;
	
	string mBody = "";
	JsonNode* node;
	JsonArray* json_array;

	string url("/streams/{stream_id}");
	int pos;

	string s_streamId("{");
	s_streamId.append("stream_id");
	s_streamId.append("}");
	pos = url.find(s_streamId);
	url.erase(pos, s_streamId.length());
	url.insert(pos, stringify(&streamId, "int"));

	//TODO: free memory of errormsg, memorystruct
	MemoryStruct_s* p_chunk = new MemoryStruct_s();
	long code;
	char* errormsg = NULL;
	string myhttpmethod("DELETE");

	if(strcmp("PUT", "DELETE") == 0){
		if(strcmp("", mBody.c_str()) == 0){
			mBody.append("{}");
		}
	}

	if(!isAsync){
		NetClient::easycurl(StreamsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = archiveStreamProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

		curl_slist_free_all(headerList);
		if (p_chunk) {
			if(p_chunk->memory) {
				free(p_chunk->memory);
			}
			delete (p_chunk);
		}
		if (errormsg) {
			free(errormsg);
		}
		return retval;
	} else{
		GThread *thread = NULL;
		RequestInfo *requestInfo = NULL;

		requestInfo = new(nothrow) RequestInfo (StreamsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), archiveStreamProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __StreamsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool StreamsManager::archiveStreamAsync(char * accessToken,
	int streamId, 
	void(* handler)(JsonSuccess, Error, void* )
	, void* userData)
{
	return archiveStreamHelper(accessToken,
	streamId, 
	handler, userData, true);
}

bool StreamsManager::archiveStreamSync(char * accessToken,
	int streamId, 
	void(* handler)(JsonSuccess, Error, void* )
	, void* userData)
{
	return archiveStreamHelper(accessToken,
	streamId, 
	handler, userData, false);
}

static bool createBigBlueButtonVideoCallProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(JsonSuccessBase, Error, void* )
	= reinterpret_cast<void(*)(JsonSuccessBase, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	JsonSuccessBase out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("JsonSuccessBase")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "JsonSuccessBase", "JsonSuccessBase");
			json_node_free(pJson);

			if ("JsonSuccessBase" == "std::string") {
				string* val = (std::string*)(&out);
				if (val->empty() && p_chunk.size>4) {
					*val = string(p_chunk.memory, p_chunk.size);
				}
			}
		} else {
			
			out.fromJson(data);
			char *jsonStr =  out.toJson();
			printf("\n%s\n", jsonStr);
			g_free(static_cast<gpointer>(jsonStr));
			
		}
		handler(out, error, userData);
		return true;
		//TODO: handle case where json parsing has an error

	} else {
		Error error;
		if (errormsg != NULL) {
			error = Error(code, string(errormsg));
		} else if (p_chunk.memory != NULL) {
			error = Error(code, string(p_chunk.memory));
		} else {
			error = Error(code, string("Unknown Error"));
		}
		 handler(out, error, userData);
		return false;
			}
}

static bool createBigBlueButtonVideoCallHelper(char * accessToken,
	
	void(* handler)(JsonSuccessBase, Error, void* )
	, void* userData, bool isAsync)
{

	//TODO: maybe delete headerList after its used to free up space?
	struct curl_slist *headerList = NULL;

	
	string accessHeader = "Authorization: Bearer ";
	accessHeader.append(accessToken);
	headerList = curl_slist_append(headerList, accessHeader.c_str());
	headerList = curl_slist_append(headerList, "Content-Type: application/json");

	map <string, string> queryParams;
	string itemAtq;
	
	string mBody = "";
	JsonNode* node;
	JsonArray* json_array;

	string url("/calls/bigbluebutton/create");
	int pos;


	//TODO: free memory of errormsg, memorystruct
	MemoryStruct_s* p_chunk = new MemoryStruct_s();
	long code;
	char* errormsg = NULL;
	string myhttpmethod("GET");

	if(strcmp("PUT", "GET") == 0){
		if(strcmp("", mBody.c_str()) == 0){
			mBody.append("{}");
		}
	}

	if(!isAsync){
		NetClient::easycurl(StreamsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = createBigBlueButtonVideoCallProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

		curl_slist_free_all(headerList);
		if (p_chunk) {
			if(p_chunk->memory) {
				free(p_chunk->memory);
			}
			delete (p_chunk);
		}
		if (errormsg) {
			free(errormsg);
		}
		return retval;
	} else{
		GThread *thread = NULL;
		RequestInfo *requestInfo = NULL;

		requestInfo = new(nothrow) RequestInfo (StreamsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), createBigBlueButtonVideoCallProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __StreamsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool StreamsManager::createBigBlueButtonVideoCallAsync(char * accessToken,
	
	void(* handler)(JsonSuccessBase, Error, void* )
	, void* userData)
{
	return createBigBlueButtonVideoCallHelper(accessToken,
	
	handler, userData, true);
}

bool StreamsManager::createBigBlueButtonVideoCallSync(char * accessToken,
	
	void(* handler)(JsonSuccessBase, Error, void* )
	, void* userData)
{
	return createBigBlueButtonVideoCallHelper(accessToken,
	
	handler, userData, false);
}

static bool getStreamIdProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(JsonSuccessBase, Error, void* )
	= reinterpret_cast<void(*)(JsonSuccessBase, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	JsonSuccessBase out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("JsonSuccessBase")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "JsonSuccessBase", "JsonSuccessBase");
			json_node_free(pJson);

			if ("JsonSuccessBase" == "std::string") {
				string* val = (std::string*)(&out);
				if (val->empty() && p_chunk.size>4) {
					*val = string(p_chunk.memory, p_chunk.size);
				}
			}
		} else {
			
			out.fromJson(data);
			char *jsonStr =  out.toJson();
			printf("\n%s\n", jsonStr);
			g_free(static_cast<gpointer>(jsonStr));
			
			out.fromJson(data);
			char *jsonStr =  out.toJson();
			printf("\n%s\n", jsonStr);
			g_free(static_cast<gpointer>(jsonStr));
			
		}
		handler(out, error, userData);
		return true;
		//TODO: handle case where json parsing has an error

	} else {
		Error error;
		if (errormsg != NULL) {
			error = Error(code, string(errormsg));
		} else if (p_chunk.memory != NULL) {
			error = Error(code, string(p_chunk.memory));
		} else {
			error = Error(code, string("Unknown Error"));
		}
		 handler(out, error, userData);
		return false;
			}
}

static bool getStreamIdHelper(char * accessToken,
	std::string stream, 
	void(* handler)(JsonSuccessBase, Error, void* )
	, void* userData, bool isAsync)
{

	//TODO: maybe delete headerList after its used to free up space?
	struct curl_slist *headerList = NULL;

	
	string accessHeader = "Authorization: Bearer ";
	accessHeader.append(accessToken);
	headerList = curl_slist_append(headerList, accessHeader.c_str());
	headerList = curl_slist_append(headerList, "Content-Type: application/json");

	map <string, string> queryParams;
	string itemAtq;
	

	itemAtq = stringify(&stream, "std::string");
	queryParams.insert(pair<string, string>("stream", itemAtq));

	string mBody = "";
	JsonNode* node;
	JsonArray* json_array;

	string url("/get_stream_id");
	int pos;


	//TODO: free memory of errormsg, memorystruct
	MemoryStruct_s* p_chunk = new MemoryStruct_s();
	long code;
	char* errormsg = NULL;
	string myhttpmethod("GET");

	if(strcmp("PUT", "GET") == 0){
		if(strcmp("", mBody.c_str()) == 0){
			mBody.append("{}");
		}
	}

	if(!isAsync){
		NetClient::easycurl(StreamsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = getStreamIdProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

		curl_slist_free_all(headerList);
		if (p_chunk) {
			if(p_chunk->memory) {
				free(p_chunk->memory);
			}
			delete (p_chunk);
		}
		if (errormsg) {
			free(errormsg);
		}
		return retval;
	} else{
		GThread *thread = NULL;
		RequestInfo *requestInfo = NULL;

		requestInfo = new(nothrow) RequestInfo (StreamsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), getStreamIdProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __StreamsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool StreamsManager::getStreamIdAsync(char * accessToken,
	std::string stream, 
	void(* handler)(JsonSuccessBase, Error, void* )
	, void* userData)
{
	return getStreamIdHelper(accessToken,
	stream, 
	handler, userData, true);
}

bool StreamsManager::getStreamIdSync(char * accessToken,
	std::string stream, 
	void(* handler)(JsonSuccessBase, Error, void* )
	, void* userData)
{
	return getStreamIdHelper(accessToken,
	stream, 
	handler, userData, false);
}

static bool getStreamTopicsProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(JsonSuccessBase, Error, void* )
	= reinterpret_cast<void(*)(JsonSuccessBase, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	JsonSuccessBase out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("JsonSuccessBase")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "JsonSuccessBase", "JsonSuccessBase");
			json_node_free(pJson);

			if ("JsonSuccessBase" == "std::string") {
				string* val = (std::string*)(&out);
				if (val->empty() && p_chunk.size>4) {
					*val = string(p_chunk.memory, p_chunk.size);
				}
			}
		} else {
			
			out.fromJson(data);
			char *jsonStr =  out.toJson();
			printf("\n%s\n", jsonStr);
			g_free(static_cast<gpointer>(jsonStr));
			
			out.fromJson(data);
			char *jsonStr =  out.toJson();
			printf("\n%s\n", jsonStr);
			g_free(static_cast<gpointer>(jsonStr));
			
		}
		handler(out, error, userData);
		return true;
		//TODO: handle case where json parsing has an error

	} else {
		Error error;
		if (errormsg != NULL) {
			error = Error(code, string(errormsg));
		} else if (p_chunk.memory != NULL) {
			error = Error(code, string(p_chunk.memory));
		} else {
			error = Error(code, string("Unknown Error"));
		}
		 handler(out, error, userData);
		return false;
			}
}

static bool getStreamTopicsHelper(char * accessToken,
	int streamId, 
	void(* handler)(JsonSuccessBase, Error, void* )
	, void* userData, bool isAsync)
{

	//TODO: maybe delete headerList after its used to free up space?
	struct curl_slist *headerList = NULL;

	
	string accessHeader = "Authorization: Bearer ";
	accessHeader.append(accessToken);
	headerList = curl_slist_append(headerList, accessHeader.c_str());
	headerList = curl_slist_append(headerList, "Content-Type: application/json");

	map <string, string> queryParams;
	string itemAtq;
	
	string mBody = "";
	JsonNode* node;
	JsonArray* json_array;

	string url("/users/me/{stream_id}/topics");
	int pos;

	string s_streamId("{");
	s_streamId.append("stream_id");
	s_streamId.append("}");
	pos = url.find(s_streamId);
	url.erase(pos, s_streamId.length());
	url.insert(pos, stringify(&streamId, "int"));

	//TODO: free memory of errormsg, memorystruct
	MemoryStruct_s* p_chunk = new MemoryStruct_s();
	long code;
	char* errormsg = NULL;
	string myhttpmethod("GET");

	if(strcmp("PUT", "GET") == 0){
		if(strcmp("", mBody.c_str()) == 0){
			mBody.append("{}");
		}
	}

	if(!isAsync){
		NetClient::easycurl(StreamsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = getStreamTopicsProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

		curl_slist_free_all(headerList);
		if (p_chunk) {
			if(p_chunk->memory) {
				free(p_chunk->memory);
			}
			delete (p_chunk);
		}
		if (errormsg) {
			free(errormsg);
		}
		return retval;
	} else{
		GThread *thread = NULL;
		RequestInfo *requestInfo = NULL;

		requestInfo = new(nothrow) RequestInfo (StreamsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), getStreamTopicsProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __StreamsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool StreamsManager::getStreamTopicsAsync(char * accessToken,
	int streamId, 
	void(* handler)(JsonSuccessBase, Error, void* )
	, void* userData)
{
	return getStreamTopicsHelper(accessToken,
	streamId, 
	handler, userData, true);
}

bool StreamsManager::getStreamTopicsSync(char * accessToken,
	int streamId, 
	void(* handler)(JsonSuccessBase, Error, void* )
	, void* userData)
{
	return getStreamTopicsHelper(accessToken,
	streamId, 
	handler, userData, false);
}

static bool getStreamsProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(JsonSuccessBase, Error, void* )
	= reinterpret_cast<void(*)(JsonSuccessBase, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	JsonSuccessBase out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("JsonSuccessBase")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "JsonSuccessBase", "JsonSuccessBase");
			json_node_free(pJson);

			if ("JsonSuccessBase" == "std::string") {
				string* val = (std::string*)(&out);
				if (val->empty() && p_chunk.size>4) {
					*val = string(p_chunk.memory, p_chunk.size);
				}
			}
		} else {
			
			out.fromJson(data);
			char *jsonStr =  out.toJson();
			printf("\n%s\n", jsonStr);
			g_free(static_cast<gpointer>(jsonStr));
			
			out.fromJson(data);
			char *jsonStr =  out.toJson();
			printf("\n%s\n", jsonStr);
			g_free(static_cast<gpointer>(jsonStr));
			
		}
		handler(out, error, userData);
		return true;
		//TODO: handle case where json parsing has an error

	} else {
		Error error;
		if (errormsg != NULL) {
			error = Error(code, string(errormsg));
		} else if (p_chunk.memory != NULL) {
			error = Error(code, string(p_chunk.memory));
		} else {
			error = Error(code, string("Unknown Error"));
		}
		 handler(out, error, userData);
		return false;
			}
}

static bool getStreamsHelper(char * accessToken,
	bool includePublic, bool includeWebPublic, bool includeSubscribed, bool includeAllActive, bool includeDefault, bool includeOwnerSubscribed, 
	void(* handler)(JsonSuccessBase, Error, void* )
	, void* userData, bool isAsync)
{

	//TODO: maybe delete headerList after its used to free up space?
	struct curl_slist *headerList = NULL;

	
	string accessHeader = "Authorization: Bearer ";
	accessHeader.append(accessToken);
	headerList = curl_slist_append(headerList, accessHeader.c_str());
	headerList = curl_slist_append(headerList, "Content-Type: application/json");

	map <string, string> queryParams;
	string itemAtq;
	

	itemAtq = stringify(&includePublic, "bool");
	queryParams.insert(pair<string, string>("include_public", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("include_public");
	}


	itemAtq = stringify(&includeWebPublic, "bool");
	queryParams.insert(pair<string, string>("include_web_public", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("include_web_public");
	}


	itemAtq = stringify(&includeSubscribed, "bool");
	queryParams.insert(pair<string, string>("include_subscribed", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("include_subscribed");
	}


	itemAtq = stringify(&includeAllActive, "bool");
	queryParams.insert(pair<string, string>("include_all_active", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("include_all_active");
	}


	itemAtq = stringify(&includeDefault, "bool");
	queryParams.insert(pair<string, string>("include_default", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("include_default");
	}


	itemAtq = stringify(&includeOwnerSubscribed, "bool");
	queryParams.insert(pair<string, string>("include_owner_subscribed", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("include_owner_subscribed");
	}

	string mBody = "";
	JsonNode* node;
	JsonArray* json_array;

	string url("/streams");
	int pos;


	//TODO: free memory of errormsg, memorystruct
	MemoryStruct_s* p_chunk = new MemoryStruct_s();
	long code;
	char* errormsg = NULL;
	string myhttpmethod("GET");

	if(strcmp("PUT", "GET") == 0){
		if(strcmp("", mBody.c_str()) == 0){
			mBody.append("{}");
		}
	}

	if(!isAsync){
		NetClient::easycurl(StreamsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = getStreamsProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

		curl_slist_free_all(headerList);
		if (p_chunk) {
			if(p_chunk->memory) {
				free(p_chunk->memory);
			}
			delete (p_chunk);
		}
		if (errormsg) {
			free(errormsg);
		}
		return retval;
	} else{
		GThread *thread = NULL;
		RequestInfo *requestInfo = NULL;

		requestInfo = new(nothrow) RequestInfo (StreamsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), getStreamsProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __StreamsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool StreamsManager::getStreamsAsync(char * accessToken,
	bool includePublic, bool includeWebPublic, bool includeSubscribed, bool includeAllActive, bool includeDefault, bool includeOwnerSubscribed, 
	void(* handler)(JsonSuccessBase, Error, void* )
	, void* userData)
{
	return getStreamsHelper(accessToken,
	includePublic, includeWebPublic, includeSubscribed, includeAllActive, includeDefault, includeOwnerSubscribed, 
	handler, userData, true);
}

bool StreamsManager::getStreamsSync(char * accessToken,
	bool includePublic, bool includeWebPublic, bool includeSubscribed, bool includeAllActive, bool includeDefault, bool includeOwnerSubscribed, 
	void(* handler)(JsonSuccessBase, Error, void* )
	, void* userData)
{
	return getStreamsHelper(accessToken,
	includePublic, includeWebPublic, includeSubscribed, includeAllActive, includeDefault, includeOwnerSubscribed, 
	handler, userData, false);
}

static bool getSubscriptionStatusProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(JsonSuccessBase, Error, void* )
	= reinterpret_cast<void(*)(JsonSuccessBase, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	JsonSuccessBase out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("JsonSuccessBase")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "JsonSuccessBase", "JsonSuccessBase");
			json_node_free(pJson);

			if ("JsonSuccessBase" == "std::string") {
				string* val = (std::string*)(&out);
				if (val->empty() && p_chunk.size>4) {
					*val = string(p_chunk.memory, p_chunk.size);
				}
			}
		} else {
			
			out.fromJson(data);
			char *jsonStr =  out.toJson();
			printf("\n%s\n", jsonStr);
			g_free(static_cast<gpointer>(jsonStr));
			
		}
		handler(out, error, userData);
		return true;
		//TODO: handle case where json parsing has an error

	} else {
		Error error;
		if (errormsg != NULL) {
			error = Error(code, string(errormsg));
		} else if (p_chunk.memory != NULL) {
			error = Error(code, string(p_chunk.memory));
		} else {
			error = Error(code, string("Unknown Error"));
		}
		 handler(out, error, userData);
		return false;
			}
}

static bool getSubscriptionStatusHelper(char * accessToken,
	int userId, int streamId, 
	void(* handler)(JsonSuccessBase, Error, void* )
	, void* userData, bool isAsync)
{

	//TODO: maybe delete headerList after its used to free up space?
	struct curl_slist *headerList = NULL;

	
	string accessHeader = "Authorization: Bearer ";
	accessHeader.append(accessToken);
	headerList = curl_slist_append(headerList, accessHeader.c_str());
	headerList = curl_slist_append(headerList, "Content-Type: application/json");

	map <string, string> queryParams;
	string itemAtq;
	
	string mBody = "";
	JsonNode* node;
	JsonArray* json_array;

	string url("/users/{user_id}/subscriptions/{stream_id}");
	int pos;

	string s_userId("{");
	s_userId.append("user_id");
	s_userId.append("}");
	pos = url.find(s_userId);
	url.erase(pos, s_userId.length());
	url.insert(pos, stringify(&userId, "int"));
	string s_streamId("{");
	s_streamId.append("stream_id");
	s_streamId.append("}");
	pos = url.find(s_streamId);
	url.erase(pos, s_streamId.length());
	url.insert(pos, stringify(&streamId, "int"));

	//TODO: free memory of errormsg, memorystruct
	MemoryStruct_s* p_chunk = new MemoryStruct_s();
	long code;
	char* errormsg = NULL;
	string myhttpmethod("GET");

	if(strcmp("PUT", "GET") == 0){
		if(strcmp("", mBody.c_str()) == 0){
			mBody.append("{}");
		}
	}

	if(!isAsync){
		NetClient::easycurl(StreamsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = getSubscriptionStatusProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

		curl_slist_free_all(headerList);
		if (p_chunk) {
			if(p_chunk->memory) {
				free(p_chunk->memory);
			}
			delete (p_chunk);
		}
		if (errormsg) {
			free(errormsg);
		}
		return retval;
	} else{
		GThread *thread = NULL;
		RequestInfo *requestInfo = NULL;

		requestInfo = new(nothrow) RequestInfo (StreamsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), getSubscriptionStatusProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __StreamsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool StreamsManager::getSubscriptionStatusAsync(char * accessToken,
	int userId, int streamId, 
	void(* handler)(JsonSuccessBase, Error, void* )
	, void* userData)
{
	return getSubscriptionStatusHelper(accessToken,
	userId, streamId, 
	handler, userData, true);
}

bool StreamsManager::getSubscriptionStatusSync(char * accessToken,
	int userId, int streamId, 
	void(* handler)(JsonSuccessBase, Error, void* )
	, void* userData)
{
	return getSubscriptionStatusHelper(accessToken,
	userId, streamId, 
	handler, userData, false);
}

static bool getSubscriptionsProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(JsonSuccessBase, Error, void* )
	= reinterpret_cast<void(*)(JsonSuccessBase, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	JsonSuccessBase out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("JsonSuccessBase")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "JsonSuccessBase", "JsonSuccessBase");
			json_node_free(pJson);

			if ("JsonSuccessBase" == "std::string") {
				string* val = (std::string*)(&out);
				if (val->empty() && p_chunk.size>4) {
					*val = string(p_chunk.memory, p_chunk.size);
				}
			}
		} else {
			
			out.fromJson(data);
			char *jsonStr =  out.toJson();
			printf("\n%s\n", jsonStr);
			g_free(static_cast<gpointer>(jsonStr));
			
		}
		handler(out, error, userData);
		return true;
		//TODO: handle case where json parsing has an error

	} else {
		Error error;
		if (errormsg != NULL) {
			error = Error(code, string(errormsg));
		} else if (p_chunk.memory != NULL) {
			error = Error(code, string(p_chunk.memory));
		} else {
			error = Error(code, string("Unknown Error"));
		}
		 handler(out, error, userData);
		return false;
			}
}

static bool getSubscriptionsHelper(char * accessToken,
	bool includeSubscribers, 
	void(* handler)(JsonSuccessBase, Error, void* )
	, void* userData, bool isAsync)
{

	//TODO: maybe delete headerList after its used to free up space?
	struct curl_slist *headerList = NULL;

	
	string accessHeader = "Authorization: Bearer ";
	accessHeader.append(accessToken);
	headerList = curl_slist_append(headerList, accessHeader.c_str());
	headerList = curl_slist_append(headerList, "Content-Type: application/json");

	map <string, string> queryParams;
	string itemAtq;
	

	itemAtq = stringify(&includeSubscribers, "bool");
	queryParams.insert(pair<string, string>("include_subscribers", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("include_subscribers");
	}

	string mBody = "";
	JsonNode* node;
	JsonArray* json_array;

	string url("/users/me/subscriptions");
	int pos;


	//TODO: free memory of errormsg, memorystruct
	MemoryStruct_s* p_chunk = new MemoryStruct_s();
	long code;
	char* errormsg = NULL;
	string myhttpmethod("GET");

	if(strcmp("PUT", "GET") == 0){
		if(strcmp("", mBody.c_str()) == 0){
			mBody.append("{}");
		}
	}

	if(!isAsync){
		NetClient::easycurl(StreamsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = getSubscriptionsProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

		curl_slist_free_all(headerList);
		if (p_chunk) {
			if(p_chunk->memory) {
				free(p_chunk->memory);
			}
			delete (p_chunk);
		}
		if (errormsg) {
			free(errormsg);
		}
		return retval;
	} else{
		GThread *thread = NULL;
		RequestInfo *requestInfo = NULL;

		requestInfo = new(nothrow) RequestInfo (StreamsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), getSubscriptionsProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __StreamsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool StreamsManager::getSubscriptionsAsync(char * accessToken,
	bool includeSubscribers, 
	void(* handler)(JsonSuccessBase, Error, void* )
	, void* userData)
{
	return getSubscriptionsHelper(accessToken,
	includeSubscribers, 
	handler, userData, true);
}

bool StreamsManager::getSubscriptionsSync(char * accessToken,
	bool includeSubscribers, 
	void(* handler)(JsonSuccessBase, Error, void* )
	, void* userData)
{
	return getSubscriptionsHelper(accessToken,
	includeSubscribers, 
	handler, userData, false);
}

static bool muteTopicProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(JsonSuccess, Error, void* )
	= reinterpret_cast<void(*)(JsonSuccess, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	JsonSuccess out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("JsonSuccess")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "JsonSuccess", "JsonSuccess");
			json_node_free(pJson);

			if ("JsonSuccess" == "std::string") {
				string* val = (std::string*)(&out);
				if (val->empty() && p_chunk.size>4) {
					*val = string(p_chunk.memory, p_chunk.size);
				}
			}
		} else {
			
			out.fromJson(data);
			char *jsonStr =  out.toJson();
			printf("\n%s\n", jsonStr);
			g_free(static_cast<gpointer>(jsonStr));
			
			out.fromJson(data);
			char *jsonStr =  out.toJson();
			printf("\n%s\n", jsonStr);
			g_free(static_cast<gpointer>(jsonStr));
			
		}
		handler(out, error, userData);
		return true;
		//TODO: handle case where json parsing has an error

	} else {
		Error error;
		if (errormsg != NULL) {
			error = Error(code, string(errormsg));
		} else if (p_chunk.memory != NULL) {
			error = Error(code, string(p_chunk.memory));
		} else {
			error = Error(code, string("Unknown Error"));
		}
		 handler(out, error, userData);
		return false;
			}
}

static bool muteTopicHelper(char * accessToken,
	std::string topic, std::string op, std::string stream, int streamId, 
	void(* handler)(JsonSuccess, Error, void* )
	, void* userData, bool isAsync)
{

	//TODO: maybe delete headerList after its used to free up space?
	struct curl_slist *headerList = NULL;

	
	string accessHeader = "Authorization: Bearer ";
	accessHeader.append(accessToken);
	headerList = curl_slist_append(headerList, accessHeader.c_str());
	headerList = curl_slist_append(headerList, "Content-Type: application/json");

	map <string, string> queryParams;
	string itemAtq;
	

	itemAtq = stringify(&stream, "std::string");
	queryParams.insert(pair<string, string>("stream", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("stream");
	}


	itemAtq = stringify(&streamId, "int");
	queryParams.insert(pair<string, string>("stream_id", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("stream_id");
	}


	itemAtq = stringify(&topic, "std::string");
	queryParams.insert(pair<string, string>("topic", itemAtq));


	itemAtq = stringify(&op, "std::string");
	queryParams.insert(pair<string, string>("op", itemAtq));

	string mBody = "";
	JsonNode* node;
	JsonArray* json_array;

	string url("/users/me/subscriptions/muted_topics");
	int pos;


	//TODO: free memory of errormsg, memorystruct
	MemoryStruct_s* p_chunk = new MemoryStruct_s();
	long code;
	char* errormsg = NULL;
	string myhttpmethod("PATCH");

	if(strcmp("PUT", "PATCH") == 0){
		if(strcmp("", mBody.c_str()) == 0){
			mBody.append("{}");
		}
	}

	if(!isAsync){
		NetClient::easycurl(StreamsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = muteTopicProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

		curl_slist_free_all(headerList);
		if (p_chunk) {
			if(p_chunk->memory) {
				free(p_chunk->memory);
			}
			delete (p_chunk);
		}
		if (errormsg) {
			free(errormsg);
		}
		return retval;
	} else{
		GThread *thread = NULL;
		RequestInfo *requestInfo = NULL;

		requestInfo = new(nothrow) RequestInfo (StreamsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), muteTopicProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __StreamsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool StreamsManager::muteTopicAsync(char * accessToken,
	std::string topic, std::string op, std::string stream, int streamId, 
	void(* handler)(JsonSuccess, Error, void* )
	, void* userData)
{
	return muteTopicHelper(accessToken,
	topic, op, stream, streamId, 
	handler, userData, true);
}

bool StreamsManager::muteTopicSync(char * accessToken,
	std::string topic, std::string op, std::string stream, int streamId, 
	void(* handler)(JsonSuccess, Error, void* )
	, void* userData)
{
	return muteTopicHelper(accessToken,
	topic, op, stream, streamId, 
	handler, userData, false);
}

static bool subscribeProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(OneOf&lt;object,object&gt;, Error, void* )
	= reinterpret_cast<void(*)(OneOf&lt;object,object&gt;, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	OneOf&lt;object,object&gt; out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("OneOf&lt;object,object&gt;")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "OneOf&lt;object,object&gt;", "OneOf&lt;object,object&gt;");
			json_node_free(pJson);

			if ("OneOf&lt;object,object&gt;" == "std::string") {
				string* val = (std::string*)(&out);
				if (val->empty() && p_chunk.size>4) {
					*val = string(p_chunk.memory, p_chunk.size);
				}
			}
		} else {
			
			out.fromJson(data);
			char *jsonStr =  out.toJson();
			printf("\n%s\n", jsonStr);
			g_free(static_cast<gpointer>(jsonStr));
			
			out.fromJson(data);
			char *jsonStr =  out.toJson();
			printf("\n%s\n", jsonStr);
			g_free(static_cast<gpointer>(jsonStr));
			
		}
		handler(out, error, userData);
		return true;
		//TODO: handle case where json parsing has an error

	} else {
		Error error;
		if (errormsg != NULL) {
			error = Error(code, string(errormsg));
		} else if (p_chunk.memory != NULL) {
			error = Error(code, string(p_chunk.memory));
		} else {
			error = Error(code, string("Unknown Error"));
		}
		 handler(out, error, userData);
		return false;
			}
}

static bool subscribeHelper(char * accessToken,
	std::list<std::string> subscriptions, std::list<OneOf&lt;string,integer&gt;> principals, bool authorizationErrorsFatal, bool announce, bool inviteOnly, bool historyPublicToSubscribers, int streamPostPolicy, OneOf<string,integer> messageRetentionDays, 
	void(* handler)(OneOf&lt;object,object&gt;, Error, void* )
	, void* userData, bool isAsync)
{

	//TODO: maybe delete headerList after its used to free up space?
	struct curl_slist *headerList = NULL;

	
	string accessHeader = "Authorization: Bearer ";
	accessHeader.append(accessToken);
	headerList = curl_slist_append(headerList, accessHeader.c_str());
	headerList = curl_slist_append(headerList, "Content-Type: application/json");

	map <string, string> queryParams;
	string itemAtq;
	
	for (std::list
	<std::string>::iterator queryIter = subscriptions.begin(); queryIter != subscriptions.end(); ++queryIter) {
		string itemAt = stringify(&(*queryIter), "std::string");
		queryParams.insert(pair<string, string>("subscriptions", itemAt));
	}
	
	for (std::list
	<OneOf&lt;string,integer&gt;>::iterator queryIter = principals.begin(); queryIter != principals.end(); ++queryIter) {
		string itemAt = stringify(&(*queryIter), "OneOf&lt;string,integer&gt;");
		if( itemAt.empty()){
			continue;
		}
		queryParams.insert(pair<string, string>("principals", itemAt));
	}
	

	itemAtq = stringify(&authorizationErrorsFatal, "bool");
	queryParams.insert(pair<string, string>("authorization_errors_fatal", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("authorization_errors_fatal");
	}


	itemAtq = stringify(&announce, "bool");
	queryParams.insert(pair<string, string>("announce", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("announce");
	}


	itemAtq = stringify(&inviteOnly, "bool");
	queryParams.insert(pair<string, string>("invite_only", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("invite_only");
	}


	itemAtq = stringify(&historyPublicToSubscribers, "bool");
	queryParams.insert(pair<string, string>("history_public_to_subscribers", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("history_public_to_subscribers");
	}


	itemAtq = stringify(&streamPostPolicy, "int");
	queryParams.insert(pair<string, string>("stream_post_policy", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("stream_post_policy");
	}


	itemAtq = stringify(&messageRetentionDays, "OneOf&lt;string,integer&gt;");
	queryParams.insert(pair<string, string>("message_retention_days", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("message_retention_days");
	}

	string mBody = "";
	JsonNode* node;
	JsonArray* json_array;

	string url("/users/me/subscriptions");
	int pos;


	//TODO: free memory of errormsg, memorystruct
	MemoryStruct_s* p_chunk = new MemoryStruct_s();
	long code;
	char* errormsg = NULL;
	string myhttpmethod("POST");

	if(strcmp("PUT", "POST") == 0){
		if(strcmp("", mBody.c_str()) == 0){
			mBody.append("{}");
		}
	}

	if(!isAsync){
		NetClient::easycurl(StreamsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = subscribeProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

		curl_slist_free_all(headerList);
		if (p_chunk) {
			if(p_chunk->memory) {
				free(p_chunk->memory);
			}
			delete (p_chunk);
		}
		if (errormsg) {
			free(errormsg);
		}
		return retval;
	} else{
		GThread *thread = NULL;
		RequestInfo *requestInfo = NULL;

		requestInfo = new(nothrow) RequestInfo (StreamsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), subscribeProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __StreamsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool StreamsManager::subscribeAsync(char * accessToken,
	std::list<std::string> subscriptions, std::list<OneOf&lt;string,integer&gt;> principals, bool authorizationErrorsFatal, bool announce, bool inviteOnly, bool historyPublicToSubscribers, int streamPostPolicy, OneOf<string,integer> messageRetentionDays, 
	void(* handler)(OneOf&lt;object,object&gt;, Error, void* )
	, void* userData)
{
	return subscribeHelper(accessToken,
	subscriptions, principals, authorizationErrorsFatal, announce, inviteOnly, historyPublicToSubscribers, streamPostPolicy, messageRetentionDays, 
	handler, userData, true);
}

bool StreamsManager::subscribeSync(char * accessToken,
	std::list<std::string> subscriptions, std::list<OneOf&lt;string,integer&gt;> principals, bool authorizationErrorsFatal, bool announce, bool inviteOnly, bool historyPublicToSubscribers, int streamPostPolicy, OneOf<string,integer> messageRetentionDays, 
	void(* handler)(OneOf&lt;object,object&gt;, Error, void* )
	, void* userData)
{
	return subscribeHelper(accessToken,
	subscriptions, principals, authorizationErrorsFatal, announce, inviteOnly, historyPublicToSubscribers, streamPostPolicy, messageRetentionDays, 
	handler, userData, false);
}

static bool unsubscribeProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(JsonSuccessBase, Error, void* )
	= reinterpret_cast<void(*)(JsonSuccessBase, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	JsonSuccessBase out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("JsonSuccessBase")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "JsonSuccessBase", "JsonSuccessBase");
			json_node_free(pJson);

			if ("JsonSuccessBase" == "std::string") {
				string* val = (std::string*)(&out);
				if (val->empty() && p_chunk.size>4) {
					*val = string(p_chunk.memory, p_chunk.size);
				}
			}
		} else {
			
			out.fromJson(data);
			char *jsonStr =  out.toJson();
			printf("\n%s\n", jsonStr);
			g_free(static_cast<gpointer>(jsonStr));
			
			out.fromJson(data);
			char *jsonStr =  out.toJson();
			printf("\n%s\n", jsonStr);
			g_free(static_cast<gpointer>(jsonStr));
			
		}
		handler(out, error, userData);
		return true;
		//TODO: handle case where json parsing has an error

	} else {
		Error error;
		if (errormsg != NULL) {
			error = Error(code, string(errormsg));
		} else if (p_chunk.memory != NULL) {
			error = Error(code, string(p_chunk.memory));
		} else {
			error = Error(code, string("Unknown Error"));
		}
		 handler(out, error, userData);
		return false;
			}
}

static bool unsubscribeHelper(char * accessToken,
	std::list<std::string> subscriptions, std::list<OneOf&lt;string,integer&gt;> principals, 
	void(* handler)(JsonSuccessBase, Error, void* )
	, void* userData, bool isAsync)
{

	//TODO: maybe delete headerList after its used to free up space?
	struct curl_slist *headerList = NULL;

	
	string accessHeader = "Authorization: Bearer ";
	accessHeader.append(accessToken);
	headerList = curl_slist_append(headerList, accessHeader.c_str());
	headerList = curl_slist_append(headerList, "Content-Type: application/json");

	map <string, string> queryParams;
	string itemAtq;
	
	for (std::list
	<std::string>::iterator queryIter = subscriptions.begin(); queryIter != subscriptions.end(); ++queryIter) {
		string itemAt = stringify(&(*queryIter), "std::string");
		queryParams.insert(pair<string, string>("subscriptions", itemAt));
	}
	
	for (std::list
	<OneOf&lt;string,integer&gt;>::iterator queryIter = principals.begin(); queryIter != principals.end(); ++queryIter) {
		string itemAt = stringify(&(*queryIter), "OneOf&lt;string,integer&gt;");
		if( itemAt.empty()){
			continue;
		}
		queryParams.insert(pair<string, string>("principals", itemAt));
	}
	
	string mBody = "";
	JsonNode* node;
	JsonArray* json_array;

	string url("/users/me/subscriptions");
	int pos;


	//TODO: free memory of errormsg, memorystruct
	MemoryStruct_s* p_chunk = new MemoryStruct_s();
	long code;
	char* errormsg = NULL;
	string myhttpmethod("DELETE");

	if(strcmp("PUT", "DELETE") == 0){
		if(strcmp("", mBody.c_str()) == 0){
			mBody.append("{}");
		}
	}

	if(!isAsync){
		NetClient::easycurl(StreamsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = unsubscribeProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

		curl_slist_free_all(headerList);
		if (p_chunk) {
			if(p_chunk->memory) {
				free(p_chunk->memory);
			}
			delete (p_chunk);
		}
		if (errormsg) {
			free(errormsg);
		}
		return retval;
	} else{
		GThread *thread = NULL;
		RequestInfo *requestInfo = NULL;

		requestInfo = new(nothrow) RequestInfo (StreamsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), unsubscribeProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __StreamsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool StreamsManager::unsubscribeAsync(char * accessToken,
	std::list<std::string> subscriptions, std::list<OneOf&lt;string,integer&gt;> principals, 
	void(* handler)(JsonSuccessBase, Error, void* )
	, void* userData)
{
	return unsubscribeHelper(accessToken,
	subscriptions, principals, 
	handler, userData, true);
}

bool StreamsManager::unsubscribeSync(char * accessToken,
	std::list<std::string> subscriptions, std::list<OneOf&lt;string,integer&gt;> principals, 
	void(* handler)(JsonSuccessBase, Error, void* )
	, void* userData)
{
	return unsubscribeHelper(accessToken,
	subscriptions, principals, 
	handler, userData, false);
}

static bool updateStreamProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(JsonSuccess, Error, void* )
	= reinterpret_cast<void(*)(JsonSuccess, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	JsonSuccess out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("JsonSuccess")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "JsonSuccess", "JsonSuccess");
			json_node_free(pJson);

			if ("JsonSuccess" == "std::string") {
				string* val = (std::string*)(&out);
				if (val->empty() && p_chunk.size>4) {
					*val = string(p_chunk.memory, p_chunk.size);
				}
			}
		} else {
			
			out.fromJson(data);
			char *jsonStr =  out.toJson();
			printf("\n%s\n", jsonStr);
			g_free(static_cast<gpointer>(jsonStr));
			
			out.fromJson(data);
			char *jsonStr =  out.toJson();
			printf("\n%s\n", jsonStr);
			g_free(static_cast<gpointer>(jsonStr));
			
		}
		handler(out, error, userData);
		return true;
		//TODO: handle case where json parsing has an error

	} else {
		Error error;
		if (errormsg != NULL) {
			error = Error(code, string(errormsg));
		} else if (p_chunk.memory != NULL) {
			error = Error(code, string(p_chunk.memory));
		} else {
			error = Error(code, string("Unknown Error"));
		}
		 handler(out, error, userData);
		return false;
			}
}

static bool updateStreamHelper(char * accessToken,
	int streamId, std::string description, std::string newName, bool isPrivate, bool isAnnouncementOnly, int streamPostPolicy, bool historyPublicToSubscribers, OneOf<string,integer> messageRetentionDays, 
	void(* handler)(JsonSuccess, Error, void* )
	, void* userData, bool isAsync)
{

	//TODO: maybe delete headerList after its used to free up space?
	struct curl_slist *headerList = NULL;

	
	string accessHeader = "Authorization: Bearer ";
	accessHeader.append(accessToken);
	headerList = curl_slist_append(headerList, accessHeader.c_str());
	headerList = curl_slist_append(headerList, "Content-Type: application/json");

	map <string, string> queryParams;
	string itemAtq;
	

	itemAtq = stringify(&description, "std::string");
	queryParams.insert(pair<string, string>("description", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("description");
	}


	itemAtq = stringify(&newName, "std::string");
	queryParams.insert(pair<string, string>("new_name", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("new_name");
	}


	itemAtq = stringify(&isPrivate, "bool");
	queryParams.insert(pair<string, string>("is_private", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("is_private");
	}


	itemAtq = stringify(&isAnnouncementOnly, "bool");
	queryParams.insert(pair<string, string>("is_announcement_only", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("is_announcement_only");
	}


	itemAtq = stringify(&streamPostPolicy, "int");
	queryParams.insert(pair<string, string>("stream_post_policy", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("stream_post_policy");
	}


	itemAtq = stringify(&historyPublicToSubscribers, "bool");
	queryParams.insert(pair<string, string>("history_public_to_subscribers", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("history_public_to_subscribers");
	}


	itemAtq = stringify(&messageRetentionDays, "OneOf&lt;string,integer&gt;");
	queryParams.insert(pair<string, string>("message_retention_days", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("message_retention_days");
	}

	string mBody = "";
	JsonNode* node;
	JsonArray* json_array;

	string url("/streams/{stream_id}");
	int pos;

	string s_streamId("{");
	s_streamId.append("stream_id");
	s_streamId.append("}");
	pos = url.find(s_streamId);
	url.erase(pos, s_streamId.length());
	url.insert(pos, stringify(&streamId, "int"));

	//TODO: free memory of errormsg, memorystruct
	MemoryStruct_s* p_chunk = new MemoryStruct_s();
	long code;
	char* errormsg = NULL;
	string myhttpmethod("PATCH");

	if(strcmp("PUT", "PATCH") == 0){
		if(strcmp("", mBody.c_str()) == 0){
			mBody.append("{}");
		}
	}

	if(!isAsync){
		NetClient::easycurl(StreamsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = updateStreamProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

		curl_slist_free_all(headerList);
		if (p_chunk) {
			if(p_chunk->memory) {
				free(p_chunk->memory);
			}
			delete (p_chunk);
		}
		if (errormsg) {
			free(errormsg);
		}
		return retval;
	} else{
		GThread *thread = NULL;
		RequestInfo *requestInfo = NULL;

		requestInfo = new(nothrow) RequestInfo (StreamsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), updateStreamProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __StreamsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool StreamsManager::updateStreamAsync(char * accessToken,
	int streamId, std::string description, std::string newName, bool isPrivate, bool isAnnouncementOnly, int streamPostPolicy, bool historyPublicToSubscribers, OneOf<string,integer> messageRetentionDays, 
	void(* handler)(JsonSuccess, Error, void* )
	, void* userData)
{
	return updateStreamHelper(accessToken,
	streamId, description, newName, isPrivate, isAnnouncementOnly, streamPostPolicy, historyPublicToSubscribers, messageRetentionDays, 
	handler, userData, true);
}

bool StreamsManager::updateStreamSync(char * accessToken,
	int streamId, std::string description, std::string newName, bool isPrivate, bool isAnnouncementOnly, int streamPostPolicy, bool historyPublicToSubscribers, OneOf<string,integer> messageRetentionDays, 
	void(* handler)(JsonSuccess, Error, void* )
	, void* userData)
{
	return updateStreamHelper(accessToken,
	streamId, description, newName, isPrivate, isAnnouncementOnly, streamPostPolicy, historyPublicToSubscribers, messageRetentionDays, 
	handler, userData, false);
}

static bool updateSubscriptionSettingsProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(JsonSuccessBase, Error, void* )
	= reinterpret_cast<void(*)(JsonSuccessBase, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	JsonSuccessBase out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("JsonSuccessBase")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "JsonSuccessBase", "JsonSuccessBase");
			json_node_free(pJson);

			if ("JsonSuccessBase" == "std::string") {
				string* val = (std::string*)(&out);
				if (val->empty() && p_chunk.size>4) {
					*val = string(p_chunk.memory, p_chunk.size);
				}
			}
		} else {
			
			out.fromJson(data);
			char *jsonStr =  out.toJson();
			printf("\n%s\n", jsonStr);
			g_free(static_cast<gpointer>(jsonStr));
			
		}
		handler(out, error, userData);
		return true;
		//TODO: handle case where json parsing has an error

	} else {
		Error error;
		if (errormsg != NULL) {
			error = Error(code, string(errormsg));
		} else if (p_chunk.memory != NULL) {
			error = Error(code, string(p_chunk.memory));
		} else {
			error = Error(code, string("Unknown Error"));
		}
		 handler(out, error, userData);
		return false;
			}
}

static bool updateSubscriptionSettingsHelper(char * accessToken,
	std::list<std::string> subscriptionData, 
	void(* handler)(JsonSuccessBase, Error, void* )
	, void* userData, bool isAsync)
{

	//TODO: maybe delete headerList after its used to free up space?
	struct curl_slist *headerList = NULL;

	
	string accessHeader = "Authorization: Bearer ";
	accessHeader.append(accessToken);
	headerList = curl_slist_append(headerList, accessHeader.c_str());
	headerList = curl_slist_append(headerList, "Content-Type: application/json");

	map <string, string> queryParams;
	string itemAtq;
	
	for (std::list
	<std::string>::iterator queryIter = subscriptionData.begin(); queryIter != subscriptionData.end(); ++queryIter) {
		string itemAt = stringify(&(*queryIter), "std::string");
		queryParams.insert(pair<string, string>("subscriptionData", itemAt));
	}
	
	string mBody = "";
	JsonNode* node;
	JsonArray* json_array;

	string url("/users/me/subscriptions/properties");
	int pos;


	//TODO: free memory of errormsg, memorystruct
	MemoryStruct_s* p_chunk = new MemoryStruct_s();
	long code;
	char* errormsg = NULL;
	string myhttpmethod("POST");

	if(strcmp("PUT", "POST") == 0){
		if(strcmp("", mBody.c_str()) == 0){
			mBody.append("{}");
		}
	}

	if(!isAsync){
		NetClient::easycurl(StreamsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = updateSubscriptionSettingsProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

		curl_slist_free_all(headerList);
		if (p_chunk) {
			if(p_chunk->memory) {
				free(p_chunk->memory);
			}
			delete (p_chunk);
		}
		if (errormsg) {
			free(errormsg);
		}
		return retval;
	} else{
		GThread *thread = NULL;
		RequestInfo *requestInfo = NULL;

		requestInfo = new(nothrow) RequestInfo (StreamsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), updateSubscriptionSettingsProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __StreamsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool StreamsManager::updateSubscriptionSettingsAsync(char * accessToken,
	std::list<std::string> subscriptionData, 
	void(* handler)(JsonSuccessBase, Error, void* )
	, void* userData)
{
	return updateSubscriptionSettingsHelper(accessToken,
	subscriptionData, 
	handler, userData, true);
}

bool StreamsManager::updateSubscriptionSettingsSync(char * accessToken,
	std::list<std::string> subscriptionData, 
	void(* handler)(JsonSuccessBase, Error, void* )
	, void* userData)
{
	return updateSubscriptionSettingsHelper(accessToken,
	subscriptionData, 
	handler, userData, false);
}

static bool updateSubscriptionsProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(JsonSuccessBase, Error, void* )
	= reinterpret_cast<void(*)(JsonSuccessBase, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	JsonSuccessBase out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("JsonSuccessBase")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "JsonSuccessBase", "JsonSuccessBase");
			json_node_free(pJson);

			if ("JsonSuccessBase" == "std::string") {
				string* val = (std::string*)(&out);
				if (val->empty() && p_chunk.size>4) {
					*val = string(p_chunk.memory, p_chunk.size);
				}
			}
		} else {
			
			out.fromJson(data);
			char *jsonStr =  out.toJson();
			printf("\n%s\n", jsonStr);
			g_free(static_cast<gpointer>(jsonStr));
			
		}
		handler(out, error, userData);
		return true;
		//TODO: handle case where json parsing has an error

	} else {
		Error error;
		if (errormsg != NULL) {
			error = Error(code, string(errormsg));
		} else if (p_chunk.memory != NULL) {
			error = Error(code, string(p_chunk.memory));
		} else {
			error = Error(code, string("Unknown Error"));
		}
		 handler(out, error, userData);
		return false;
			}
}

static bool updateSubscriptionsHelper(char * accessToken,
	std::list<std::string> r_delete, std::list<std::string> add, 
	void(* handler)(JsonSuccessBase, Error, void* )
	, void* userData, bool isAsync)
{

	//TODO: maybe delete headerList after its used to free up space?
	struct curl_slist *headerList = NULL;

	
	string accessHeader = "Authorization: Bearer ";
	accessHeader.append(accessToken);
	headerList = curl_slist_append(headerList, accessHeader.c_str());
	headerList = curl_slist_append(headerList, "Content-Type: application/json");

	map <string, string> queryParams;
	string itemAtq;
	
	for (std::list
	<std::string>::iterator queryIter = r_delete.begin(); queryIter != r_delete.end(); ++queryIter) {
		string itemAt = stringify(&(*queryIter), "std::string");
		if( itemAt.empty()){
			continue;
		}
		queryParams.insert(pair<string, string>("r_delete", itemAt));
	}
	
	for (std::list
	<std::string>::iterator queryIter = add.begin(); queryIter != add.end(); ++queryIter) {
		string itemAt = stringify(&(*queryIter), "std::string");
		if( itemAt.empty()){
			continue;
		}
		queryParams.insert(pair<string, string>("add", itemAt));
	}
	
	string mBody = "";
	JsonNode* node;
	JsonArray* json_array;

	string url("/users/me/subscriptions");
	int pos;


	//TODO: free memory of errormsg, memorystruct
	MemoryStruct_s* p_chunk = new MemoryStruct_s();
	long code;
	char* errormsg = NULL;
	string myhttpmethod("PATCH");

	if(strcmp("PUT", "PATCH") == 0){
		if(strcmp("", mBody.c_str()) == 0){
			mBody.append("{}");
		}
	}

	if(!isAsync){
		NetClient::easycurl(StreamsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = updateSubscriptionsProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

		curl_slist_free_all(headerList);
		if (p_chunk) {
			if(p_chunk->memory) {
				free(p_chunk->memory);
			}
			delete (p_chunk);
		}
		if (errormsg) {
			free(errormsg);
		}
		return retval;
	} else{
		GThread *thread = NULL;
		RequestInfo *requestInfo = NULL;

		requestInfo = new(nothrow) RequestInfo (StreamsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), updateSubscriptionsProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __StreamsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool StreamsManager::updateSubscriptionsAsync(char * accessToken,
	std::list<std::string> r_delete, std::list<std::string> add, 
	void(* handler)(JsonSuccessBase, Error, void* )
	, void* userData)
{
	return updateSubscriptionsHelper(accessToken,
	r_delete, add, 
	handler, userData, true);
}

bool StreamsManager::updateSubscriptionsSync(char * accessToken,
	std::list<std::string> r_delete, std::list<std::string> add, 
	void(* handler)(JsonSuccessBase, Error, void* )
	, void* userData)
{
	return updateSubscriptionsHelper(accessToken,
	r_delete, add, 
	handler, userData, false);
}

