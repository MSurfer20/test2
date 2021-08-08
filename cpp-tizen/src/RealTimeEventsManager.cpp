#include <glib-object.h>
#include <json-glib/json-glib.h>

#include "RealTimeEventsManager.h"
#include "NetClient.h"
#include "Helpers.h"
#include "Error.h"
#include "RequestInfo.h"

using namespace std;
using namespace Tizen::ArtikCloud;


RealTimeEventsManager::RealTimeEventsManager()
{

}

RealTimeEventsManager::~RealTimeEventsManager()
{

}

static gboolean __RealTimeEventsManagerresponseHandler(gpointer data)
{
	RequestInfo *request = static_cast<RequestInfo*>(data);
	g_thread_join(request->thread);

	// invoke the callback function
	bool retval = request->processor(*(request->p_chunk), *(request->code), request->errormsg, request->userData, request->handler);

	delete request;
	return FALSE;
}

static gpointer __RealTimeEventsManagerthreadFunc(gpointer data)
{
	RequestInfo *request = static_cast<RequestInfo*>(data);

	// handle the request
	NetClient::easycurl(request->host, request->path, request->method, request->queryParams,
	request->mBody, request->headerList, request->p_chunk, request->code, request->errormsg);

	request->thread = g_thread_self();
	g_idle_add(__RealTimeEventsManagerresponseHandler, static_cast<gpointer>(request));

	return NULL;
}


static bool deleteQueueProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
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

static bool deleteQueueHelper(char * accessToken,
	std::string queueId, 
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
	

	itemAtq = stringify(&queueId, "std::string");
	queryParams.insert(pair<string, string>("queue_id", itemAtq));

	string mBody = "";
	JsonNode* node;
	JsonArray* json_array;

	string url("/events");
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
		NetClient::easycurl(RealTimeEventsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = deleteQueueProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (RealTimeEventsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), deleteQueueProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __RealTimeEventsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool RealTimeEventsManager::deleteQueueAsync(char * accessToken,
	std::string queueId, 
	void(* handler)(JsonSuccess, Error, void* )
	, void* userData)
{
	return deleteQueueHelper(accessToken,
	queueId, 
	handler, userData, true);
}

bool RealTimeEventsManager::deleteQueueSync(char * accessToken,
	std::string queueId, 
	void(* handler)(JsonSuccess, Error, void* )
	, void* userData)
{
	return deleteQueueHelper(accessToken,
	queueId, 
	handler, userData, false);
}

static bool getEventsProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
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

static bool getEventsHelper(char * accessToken,
	std::string queueId, int lastEventId, bool dontBlock, 
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
	

	itemAtq = stringify(&queueId, "std::string");
	queryParams.insert(pair<string, string>("queue_id", itemAtq));


	itemAtq = stringify(&lastEventId, "int");
	queryParams.insert(pair<string, string>("last_event_id", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("last_event_id");
	}


	itemAtq = stringify(&dontBlock, "bool");
	queryParams.insert(pair<string, string>("dont_block", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("dont_block");
	}

	string mBody = "";
	JsonNode* node;
	JsonArray* json_array;

	string url("/events");
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
		NetClient::easycurl(RealTimeEventsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = getEventsProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (RealTimeEventsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), getEventsProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __RealTimeEventsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool RealTimeEventsManager::getEventsAsync(char * accessToken,
	std::string queueId, int lastEventId, bool dontBlock, 
	void(* handler)(JsonSuccessBase, Error, void* )
	, void* userData)
{
	return getEventsHelper(accessToken,
	queueId, lastEventId, dontBlock, 
	handler, userData, true);
}

bool RealTimeEventsManager::getEventsSync(char * accessToken,
	std::string queueId, int lastEventId, bool dontBlock, 
	void(* handler)(JsonSuccessBase, Error, void* )
	, void* userData)
{
	return getEventsHelper(accessToken,
	queueId, lastEventId, dontBlock, 
	handler, userData, false);
}

static bool realTimePostProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	
	void(* handler)(Error, void* ) = reinterpret_cast<void(*)(Error, void* )> (voidHandler);
	JsonNode* pJson;
	char * data = p_chunk.memory;

	

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));


		handler(error, userData);
		return true;



	} else {
		Error error;
		if (errormsg != NULL) {
			error = Error(code, string(errormsg));
		} else if (p_chunk.memory != NULL) {
			error = Error(code, string(p_chunk.memory));
		} else {
			error = Error(code, string("Unknown Error"));
		}
		handler(error, userData);
		return false;
	}
}

static bool realTimePostHelper(char * accessToken,
	std::list<std::string> eventTypes, std::list<std::list> narrow, bool allPublicStreams, 
	
	void(* handler)(Error, void* ) , void* userData, bool isAsync)
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
	<std::string>::iterator queryIter = eventTypes.begin(); queryIter != eventTypes.end(); ++queryIter) {
		string itemAt = stringify(&(*queryIter), "std::string");
		if( itemAt.empty()){
			continue;
		}
		queryParams.insert(pair<string, string>("eventTypes", itemAt));
	}
	
	for (std::list
	<std::list>::iterator queryIter = narrow.begin(); queryIter != narrow.end(); ++queryIter) {
		string itemAt = stringify(&(*queryIter), "std::list");
		if( itemAt.empty()){
			continue;
		}
		queryParams.insert(pair<string, string>("narrow", itemAt));
	}
	

	itemAtq = stringify(&allPublicStreams, "bool");
	queryParams.insert(pair<string, string>("all_public_streams", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("all_public_streams");
	}

	string mBody = "";
	JsonNode* node;
	JsonArray* json_array;

	string url("/real-time");
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
		NetClient::easycurl(RealTimeEventsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = realTimePostProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (RealTimeEventsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), realTimePostProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __RealTimeEventsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool RealTimeEventsManager::realTimePostAsync(char * accessToken,
	std::list<std::string> eventTypes, std::list<std::list> narrow, bool allPublicStreams, 
	
	void(* handler)(Error, void* ) , void* userData)
{
	return realTimePostHelper(accessToken,
	eventTypes, narrow, allPublicStreams, 
	handler, userData, true);
}

bool RealTimeEventsManager::realTimePostSync(char * accessToken,
	std::list<std::string> eventTypes, std::list<std::list> narrow, bool allPublicStreams, 
	
	void(* handler)(Error, void* ) , void* userData)
{
	return realTimePostHelper(accessToken,
	eventTypes, narrow, allPublicStreams, 
	handler, userData, false);
}

static bool registerQueueProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
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

static bool registerQueueHelper(char * accessToken,
	bool applyMarkdown, bool clientGravatar, bool slimPresence, std::list<std::string> eventTypes, bool allPublicStreams, bool includeSubscribers, std::string clientCapabilities, std::list<std::string> fetchEventTypes, std::list<std::list> narrow, 
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
	

	itemAtq = stringify(&applyMarkdown, "bool");
	queryParams.insert(pair<string, string>("apply_markdown", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("apply_markdown");
	}


	itemAtq = stringify(&clientGravatar, "bool");
	queryParams.insert(pair<string, string>("client_gravatar", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("client_gravatar");
	}


	itemAtq = stringify(&slimPresence, "bool");
	queryParams.insert(pair<string, string>("slim_presence", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("slim_presence");
	}

	for (std::list
	<std::string>::iterator queryIter = eventTypes.begin(); queryIter != eventTypes.end(); ++queryIter) {
		string itemAt = stringify(&(*queryIter), "std::string");
		if( itemAt.empty()){
			continue;
		}
		queryParams.insert(pair<string, string>("eventTypes", itemAt));
	}
	

	itemAtq = stringify(&allPublicStreams, "bool");
	queryParams.insert(pair<string, string>("all_public_streams", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("all_public_streams");
	}


	itemAtq = stringify(&includeSubscribers, "bool");
	queryParams.insert(pair<string, string>("include_subscribers", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("include_subscribers");
	}


	itemAtq = stringify(&clientCapabilities, "std::string");
	queryParams.insert(pair<string, string>("client_capabilities", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("client_capabilities");
	}

	for (std::list
	<std::string>::iterator queryIter = fetchEventTypes.begin(); queryIter != fetchEventTypes.end(); ++queryIter) {
		string itemAt = stringify(&(*queryIter), "std::string");
		if( itemAt.empty()){
			continue;
		}
		queryParams.insert(pair<string, string>("fetchEventTypes", itemAt));
	}
	
	for (std::list
	<std::list>::iterator queryIter = narrow.begin(); queryIter != narrow.end(); ++queryIter) {
		string itemAt = stringify(&(*queryIter), "std::list");
		if( itemAt.empty()){
			continue;
		}
		queryParams.insert(pair<string, string>("narrow", itemAt));
	}
	
	string mBody = "";
	JsonNode* node;
	JsonArray* json_array;

	string url("/register");
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
		NetClient::easycurl(RealTimeEventsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = registerQueueProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (RealTimeEventsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), registerQueueProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __RealTimeEventsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool RealTimeEventsManager::registerQueueAsync(char * accessToken,
	bool applyMarkdown, bool clientGravatar, bool slimPresence, std::list<std::string> eventTypes, bool allPublicStreams, bool includeSubscribers, std::string clientCapabilities, std::list<std::string> fetchEventTypes, std::list<std::list> narrow, 
	void(* handler)(JsonSuccessBase, Error, void* )
	, void* userData)
{
	return registerQueueHelper(accessToken,
	applyMarkdown, clientGravatar, slimPresence, eventTypes, allPublicStreams, includeSubscribers, clientCapabilities, fetchEventTypes, narrow, 
	handler, userData, true);
}

bool RealTimeEventsManager::registerQueueSync(char * accessToken,
	bool applyMarkdown, bool clientGravatar, bool slimPresence, std::list<std::string> eventTypes, bool allPublicStreams, bool includeSubscribers, std::string clientCapabilities, std::list<std::string> fetchEventTypes, std::list<std::list> narrow, 
	void(* handler)(JsonSuccessBase, Error, void* )
	, void* userData)
{
	return registerQueueHelper(accessToken,
	applyMarkdown, clientGravatar, slimPresence, eventTypes, allPublicStreams, includeSubscribers, clientCapabilities, fetchEventTypes, narrow, 
	handler, userData, false);
}

static bool restErrorHandlingProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	
	void(* handler)(Error, void* ) = reinterpret_cast<void(*)(Error, void* )> (voidHandler);
	JsonNode* pJson;
	char * data = p_chunk.memory;

	

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));


		handler(error, userData);
		return true;



	} else {
		Error error;
		if (errormsg != NULL) {
			error = Error(code, string(errormsg));
		} else if (p_chunk.memory != NULL) {
			error = Error(code, string(p_chunk.memory));
		} else {
			error = Error(code, string("Unknown Error"));
		}
		handler(error, userData);
		return false;
	}
}

static bool restErrorHandlingHelper(char * accessToken,
	
	
	void(* handler)(Error, void* ) , void* userData, bool isAsync)
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

	string url("/rest-error-handling");
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
		NetClient::easycurl(RealTimeEventsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = restErrorHandlingProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (RealTimeEventsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), restErrorHandlingProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __RealTimeEventsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool RealTimeEventsManager::restErrorHandlingAsync(char * accessToken,
	
	
	void(* handler)(Error, void* ) , void* userData)
{
	return restErrorHandlingHelper(accessToken,
	
	handler, userData, true);
}

bool RealTimeEventsManager::restErrorHandlingSync(char * accessToken,
	
	
	void(* handler)(Error, void* ) , void* userData)
{
	return restErrorHandlingHelper(accessToken,
	
	handler, userData, false);
}

