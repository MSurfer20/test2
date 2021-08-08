#include <glib-object.h>
#include <json-glib/json-glib.h>

#include "DraftsManager.h"
#include "NetClient.h"
#include "Helpers.h"
#include "Error.h"
#include "RequestInfo.h"

using namespace std;
using namespace Tizen::ArtikCloud;


DraftsManager::DraftsManager()
{

}

DraftsManager::~DraftsManager()
{

}

static gboolean __DraftsManagerresponseHandler(gpointer data)
{
	RequestInfo *request = static_cast<RequestInfo*>(data);
	g_thread_join(request->thread);

	// invoke the callback function
	bool retval = request->processor(*(request->p_chunk), *(request->code), request->errormsg, request->userData, request->handler);

	delete request;
	return FALSE;
}

static gpointer __DraftsManagerthreadFunc(gpointer data)
{
	RequestInfo *request = static_cast<RequestInfo*>(data);

	// handle the request
	NetClient::easycurl(request->host, request->path, request->method, request->queryParams,
	request->mBody, request->headerList, request->p_chunk, request->code, request->errormsg);

	request->thread = g_thread_self();
	g_idle_add(__DraftsManagerresponseHandler, static_cast<gpointer>(request));

	return NULL;
}


static bool createDraftsProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
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

static bool createDraftsHelper(char * accessToken,
	std::list<Draft> drafts, 
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
	
	for (std::list
	<Draft>::iterator queryIter = drafts.begin(); queryIter != drafts.end(); ++queryIter) {
		string itemAt = stringify(&(*queryIter), "Draft");
		if( itemAt.empty()){
			continue;
		}
		queryParams.insert(pair<string, string>("drafts", itemAt));
	}
	
	string mBody = "";
	JsonNode* node;
	JsonArray* json_array;

	string url("/drafts");
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
		NetClient::easycurl(DraftsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = createDraftsProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (DraftsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), createDraftsProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __DraftsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool DraftsManager::createDraftsAsync(char * accessToken,
	std::list<Draft> drafts, 
	void(* handler)(JsonSuccess, Error, void* )
	, void* userData)
{
	return createDraftsHelper(accessToken,
	drafts, 
	handler, userData, true);
}

bool DraftsManager::createDraftsSync(char * accessToken,
	std::list<Draft> drafts, 
	void(* handler)(JsonSuccess, Error, void* )
	, void* userData)
{
	return createDraftsHelper(accessToken,
	drafts, 
	handler, userData, false);
}

static bool deleteDraftProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
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

static bool deleteDraftHelper(char * accessToken,
	int draftId, 
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

	string url("/drafts/{draft_id}");
	int pos;

	string s_draftId("{");
	s_draftId.append("draft_id");
	s_draftId.append("}");
	pos = url.find(s_draftId);
	url.erase(pos, s_draftId.length());
	url.insert(pos, stringify(&draftId, "int"));

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
		NetClient::easycurl(DraftsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = deleteDraftProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (DraftsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), deleteDraftProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __DraftsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool DraftsManager::deleteDraftAsync(char * accessToken,
	int draftId, 
	void(* handler)(JsonSuccess, Error, void* )
	, void* userData)
{
	return deleteDraftHelper(accessToken,
	draftId, 
	handler, userData, true);
}

bool DraftsManager::deleteDraftSync(char * accessToken,
	int draftId, 
	void(* handler)(JsonSuccess, Error, void* )
	, void* userData)
{
	return deleteDraftHelper(accessToken,
	draftId, 
	handler, userData, false);
}

static bool editDraftProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
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

static bool editDraftHelper(char * accessToken,
	int draftId, Draft draft, 
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
	

	itemAtq = stringify(&draft, "Draft");
	queryParams.insert(pair<string, string>("draft", itemAtq));

	string mBody = "";
	JsonNode* node;
	JsonArray* json_array;

	string url("/drafts/{draft_id}");
	int pos;

	string s_draftId("{");
	s_draftId.append("draft_id");
	s_draftId.append("}");
	pos = url.find(s_draftId);
	url.erase(pos, s_draftId.length());
	url.insert(pos, stringify(&draftId, "int"));

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
		NetClient::easycurl(DraftsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = editDraftProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (DraftsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), editDraftProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __DraftsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool DraftsManager::editDraftAsync(char * accessToken,
	int draftId, Draft draft, 
	void(* handler)(JsonSuccess, Error, void* )
	, void* userData)
{
	return editDraftHelper(accessToken,
	draftId, draft, 
	handler, userData, true);
}

bool DraftsManager::editDraftSync(char * accessToken,
	int draftId, Draft draft, 
	void(* handler)(JsonSuccess, Error, void* )
	, void* userData)
{
	return editDraftHelper(accessToken,
	draftId, draft, 
	handler, userData, false);
}

static bool getDraftsProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
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

static bool getDraftsHelper(char * accessToken,
	
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

	string url("/drafts");
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
		NetClient::easycurl(DraftsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = getDraftsProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (DraftsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), getDraftsProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __DraftsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool DraftsManager::getDraftsAsync(char * accessToken,
	
	void(* handler)(JsonSuccess, Error, void* )
	, void* userData)
{
	return getDraftsHelper(accessToken,
	
	handler, userData, true);
}

bool DraftsManager::getDraftsSync(char * accessToken,
	
	void(* handler)(JsonSuccess, Error, void* )
	, void* userData)
{
	return getDraftsHelper(accessToken,
	
	handler, userData, false);
}

