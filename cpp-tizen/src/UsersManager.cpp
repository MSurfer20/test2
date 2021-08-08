#include <glib-object.h>
#include <json-glib/json-glib.h>

#include "UsersManager.h"
#include "NetClient.h"
#include "Helpers.h"
#include "Error.h"
#include "RequestInfo.h"

using namespace std;
using namespace Tizen::ArtikCloud;


UsersManager::UsersManager()
{

}

UsersManager::~UsersManager()
{

}

static gboolean __UsersManagerresponseHandler(gpointer data)
{
	RequestInfo *request = static_cast<RequestInfo*>(data);
	g_thread_join(request->thread);

	// invoke the callback function
	bool retval = request->processor(*(request->p_chunk), *(request->code), request->errormsg, request->userData, request->handler);

	delete request;
	return FALSE;
}

static gpointer __UsersManagerthreadFunc(gpointer data)
{
	RequestInfo *request = static_cast<RequestInfo*>(data);

	// handle the request
	NetClient::easycurl(request->host, request->path, request->method, request->queryParams,
	request->mBody, request->headerList, request->p_chunk, request->code, request->errormsg);

	request->thread = g_thread_self();
	g_idle_add(__UsersManagerresponseHandler, static_cast<gpointer>(request));

	return NULL;
}


static bool createUserProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
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

static bool createUserHelper(char * accessToken,
	std::string email, std::string password, std::string fullName, 
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
	

	itemAtq = stringify(&email, "std::string");
	queryParams.insert(pair<string, string>("email", itemAtq));


	itemAtq = stringify(&password, "std::string");
	queryParams.insert(pair<string, string>("password", itemAtq));


	itemAtq = stringify(&fullName, "std::string");
	queryParams.insert(pair<string, string>("full_name", itemAtq));

	string mBody = "";
	JsonNode* node;
	JsonArray* json_array;

	string url("/users");
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
		NetClient::easycurl(UsersManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = createUserProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (UsersManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), createUserProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __UsersManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool UsersManager::createUserAsync(char * accessToken,
	std::string email, std::string password, std::string fullName, 
	void(* handler)(JsonSuccessBase, Error, void* )
	, void* userData)
{
	return createUserHelper(accessToken,
	email, password, fullName, 
	handler, userData, true);
}

bool UsersManager::createUserSync(char * accessToken,
	std::string email, std::string password, std::string fullName, 
	void(* handler)(JsonSuccessBase, Error, void* )
	, void* userData)
{
	return createUserHelper(accessToken,
	email, password, fullName, 
	handler, userData, false);
}

static bool createUserGroupProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
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

static bool createUserGroupHelper(char * accessToken,
	std::string name, std::string description, std::list<int> members, 
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
	

	itemAtq = stringify(&name, "std::string");
	queryParams.insert(pair<string, string>("name", itemAtq));


	itemAtq = stringify(&description, "std::string");
	queryParams.insert(pair<string, string>("description", itemAtq));

	for (std::list
	<int>::iterator queryIter = members.begin(); queryIter != members.end(); ++queryIter) {
		string itemAt = stringify(&(*queryIter), "int");
		queryParams.insert(pair<string, string>("members", itemAt));
	}
	
	string mBody = "";
	JsonNode* node;
	JsonArray* json_array;

	string url("/user_groups/create");
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
		NetClient::easycurl(UsersManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = createUserGroupProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (UsersManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), createUserGroupProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __UsersManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool UsersManager::createUserGroupAsync(char * accessToken,
	std::string name, std::string description, std::list<int> members, 
	void(* handler)(JsonSuccess, Error, void* )
	, void* userData)
{
	return createUserGroupHelper(accessToken,
	name, description, members, 
	handler, userData, true);
}

bool UsersManager::createUserGroupSync(char * accessToken,
	std::string name, std::string description, std::list<int> members, 
	void(* handler)(JsonSuccess, Error, void* )
	, void* userData)
{
	return createUserGroupHelper(accessToken,
	name, description, members, 
	handler, userData, false);
}

static bool deactivateOwnUserProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
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

static bool deactivateOwnUserHelper(char * accessToken,
	
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

	string url("/users/me");
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
		NetClient::easycurl(UsersManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = deactivateOwnUserProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (UsersManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), deactivateOwnUserProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __UsersManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool UsersManager::deactivateOwnUserAsync(char * accessToken,
	
	void(* handler)(JsonSuccess, Error, void* )
	, void* userData)
{
	return deactivateOwnUserHelper(accessToken,
	
	handler, userData, true);
}

bool UsersManager::deactivateOwnUserSync(char * accessToken,
	
	void(* handler)(JsonSuccess, Error, void* )
	, void* userData)
{
	return deactivateOwnUserHelper(accessToken,
	
	handler, userData, false);
}

static bool deactivateUserProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
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

static bool deactivateUserHelper(char * accessToken,
	int userId, 
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

	string url("/users/{user_id}");
	int pos;

	string s_userId("{");
	s_userId.append("user_id");
	s_userId.append("}");
	pos = url.find(s_userId);
	url.erase(pos, s_userId.length());
	url.insert(pos, stringify(&userId, "int"));

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
		NetClient::easycurl(UsersManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = deactivateUserProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (UsersManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), deactivateUserProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __UsersManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool UsersManager::deactivateUserAsync(char * accessToken,
	int userId, 
	void(* handler)(JsonSuccess, Error, void* )
	, void* userData)
{
	return deactivateUserHelper(accessToken,
	userId, 
	handler, userData, true);
}

bool UsersManager::deactivateUserSync(char * accessToken,
	int userId, 
	void(* handler)(JsonSuccess, Error, void* )
	, void* userData)
{
	return deactivateUserHelper(accessToken,
	userId, 
	handler, userData, false);
}

static bool getAttachmentsProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
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

static bool getAttachmentsHelper(char * accessToken,
	
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

	string url("/attachments");
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
		NetClient::easycurl(UsersManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = getAttachmentsProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (UsersManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), getAttachmentsProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __UsersManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool UsersManager::getAttachmentsAsync(char * accessToken,
	
	void(* handler)(JsonSuccessBase, Error, void* )
	, void* userData)
{
	return getAttachmentsHelper(accessToken,
	
	handler, userData, true);
}

bool UsersManager::getAttachmentsSync(char * accessToken,
	
	void(* handler)(JsonSuccessBase, Error, void* )
	, void* userData)
{
	return getAttachmentsHelper(accessToken,
	
	handler, userData, false);
}

static bool getOwnUserProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
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

static bool getOwnUserHelper(char * accessToken,
	
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

	string url("/users/me");
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
		NetClient::easycurl(UsersManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = getOwnUserProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (UsersManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), getOwnUserProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __UsersManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool UsersManager::getOwnUserAsync(char * accessToken,
	
	void(* handler)(JsonSuccessBase, Error, void* )
	, void* userData)
{
	return getOwnUserHelper(accessToken,
	
	handler, userData, true);
}

bool UsersManager::getOwnUserSync(char * accessToken,
	
	void(* handler)(JsonSuccessBase, Error, void* )
	, void* userData)
{
	return getOwnUserHelper(accessToken,
	
	handler, userData, false);
}

static bool getUserProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
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

static bool getUserHelper(char * accessToken,
	int userId, bool clientGravatar, bool includeCustomProfileFields, 
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
	

	itemAtq = stringify(&clientGravatar, "bool");
	queryParams.insert(pair<string, string>("client_gravatar", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("client_gravatar");
	}


	itemAtq = stringify(&includeCustomProfileFields, "bool");
	queryParams.insert(pair<string, string>("include_custom_profile_fields", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("include_custom_profile_fields");
	}

	string mBody = "";
	JsonNode* node;
	JsonArray* json_array;

	string url("/users/{user_id}");
	int pos;

	string s_userId("{");
	s_userId.append("user_id");
	s_userId.append("}");
	pos = url.find(s_userId);
	url.erase(pos, s_userId.length());
	url.insert(pos, stringify(&userId, "int"));

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
		NetClient::easycurl(UsersManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = getUserProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (UsersManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), getUserProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __UsersManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool UsersManager::getUserAsync(char * accessToken,
	int userId, bool clientGravatar, bool includeCustomProfileFields, 
	void(* handler)(JsonSuccessBase, Error, void* )
	, void* userData)
{
	return getUserHelper(accessToken,
	userId, clientGravatar, includeCustomProfileFields, 
	handler, userData, true);
}

bool UsersManager::getUserSync(char * accessToken,
	int userId, bool clientGravatar, bool includeCustomProfileFields, 
	void(* handler)(JsonSuccessBase, Error, void* )
	, void* userData)
{
	return getUserHelper(accessToken,
	userId, clientGravatar, includeCustomProfileFields, 
	handler, userData, false);
}

static bool getUserByEmailProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
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

static bool getUserByEmailHelper(char * accessToken,
	std::string email, bool clientGravatar, bool includeCustomProfileFields, 
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
	

	itemAtq = stringify(&clientGravatar, "bool");
	queryParams.insert(pair<string, string>("client_gravatar", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("client_gravatar");
	}


	itemAtq = stringify(&includeCustomProfileFields, "bool");
	queryParams.insert(pair<string, string>("include_custom_profile_fields", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("include_custom_profile_fields");
	}

	string mBody = "";
	JsonNode* node;
	JsonArray* json_array;

	string url("/users/{email}");
	int pos;

	string s_email("{");
	s_email.append("email");
	s_email.append("}");
	pos = url.find(s_email);
	url.erase(pos, s_email.length());
	url.insert(pos, stringify(&email, "std::string"));

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
		NetClient::easycurl(UsersManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = getUserByEmailProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (UsersManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), getUserByEmailProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __UsersManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool UsersManager::getUserByEmailAsync(char * accessToken,
	std::string email, bool clientGravatar, bool includeCustomProfileFields, 
	void(* handler)(JsonSuccessBase, Error, void* )
	, void* userData)
{
	return getUserByEmailHelper(accessToken,
	email, clientGravatar, includeCustomProfileFields, 
	handler, userData, true);
}

bool UsersManager::getUserByEmailSync(char * accessToken,
	std::string email, bool clientGravatar, bool includeCustomProfileFields, 
	void(* handler)(JsonSuccessBase, Error, void* )
	, void* userData)
{
	return getUserByEmailHelper(accessToken,
	email, clientGravatar, includeCustomProfileFields, 
	handler, userData, false);
}

static bool getUserGroupsProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
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

static bool getUserGroupsHelper(char * accessToken,
	
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

	string url("/user_groups");
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
		NetClient::easycurl(UsersManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = getUserGroupsProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (UsersManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), getUserGroupsProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __UsersManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool UsersManager::getUserGroupsAsync(char * accessToken,
	
	void(* handler)(JsonSuccessBase, Error, void* )
	, void* userData)
{
	return getUserGroupsHelper(accessToken,
	
	handler, userData, true);
}

bool UsersManager::getUserGroupsSync(char * accessToken,
	
	void(* handler)(JsonSuccessBase, Error, void* )
	, void* userData)
{
	return getUserGroupsHelper(accessToken,
	
	handler, userData, false);
}

static bool getUserPresenceProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
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

static bool getUserPresenceHelper(char * accessToken,
	std::string userIdOrEmail, 
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

	string url("/users/{user_id_or_email}/presence");
	int pos;

	string s_userIdOrEmail("{");
	s_userIdOrEmail.append("user_id_or_email");
	s_userIdOrEmail.append("}");
	pos = url.find(s_userIdOrEmail);
	url.erase(pos, s_userIdOrEmail.length());
	url.insert(pos, stringify(&userIdOrEmail, "std::string"));

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
		NetClient::easycurl(UsersManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = getUserPresenceProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (UsersManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), getUserPresenceProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __UsersManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool UsersManager::getUserPresenceAsync(char * accessToken,
	std::string userIdOrEmail, 
	void(* handler)(JsonSuccessBase, Error, void* )
	, void* userData)
{
	return getUserPresenceHelper(accessToken,
	userIdOrEmail, 
	handler, userData, true);
}

bool UsersManager::getUserPresenceSync(char * accessToken,
	std::string userIdOrEmail, 
	void(* handler)(JsonSuccessBase, Error, void* )
	, void* userData)
{
	return getUserPresenceHelper(accessToken,
	userIdOrEmail, 
	handler, userData, false);
}

static bool getUsersProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
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

static bool getUsersHelper(char * accessToken,
	bool clientGravatar, bool includeCustomProfileFields, 
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
	

	itemAtq = stringify(&clientGravatar, "bool");
	queryParams.insert(pair<string, string>("client_gravatar", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("client_gravatar");
	}


	itemAtq = stringify(&includeCustomProfileFields, "bool");
	queryParams.insert(pair<string, string>("include_custom_profile_fields", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("include_custom_profile_fields");
	}

	string mBody = "";
	JsonNode* node;
	JsonArray* json_array;

	string url("/users");
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
		NetClient::easycurl(UsersManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = getUsersProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (UsersManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), getUsersProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __UsersManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool UsersManager::getUsersAsync(char * accessToken,
	bool clientGravatar, bool includeCustomProfileFields, 
	void(* handler)(JsonSuccessBase, Error, void* )
	, void* userData)
{
	return getUsersHelper(accessToken,
	clientGravatar, includeCustomProfileFields, 
	handler, userData, true);
}

bool UsersManager::getUsersSync(char * accessToken,
	bool clientGravatar, bool includeCustomProfileFields, 
	void(* handler)(JsonSuccessBase, Error, void* )
	, void* userData)
{
	return getUsersHelper(accessToken,
	clientGravatar, includeCustomProfileFields, 
	handler, userData, false);
}

static bool muteUserProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
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

static bool muteUserHelper(char * accessToken,
	int mutedUserId, 
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

	string url("/users/me/muted_users/{muted_user_id}");
	int pos;

	string s_mutedUserId("{");
	s_mutedUserId.append("muted_user_id");
	s_mutedUserId.append("}");
	pos = url.find(s_mutedUserId);
	url.erase(pos, s_mutedUserId.length());
	url.insert(pos, stringify(&mutedUserId, "int"));

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
		NetClient::easycurl(UsersManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = muteUserProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (UsersManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), muteUserProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __UsersManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool UsersManager::muteUserAsync(char * accessToken,
	int mutedUserId, 
	void(* handler)(JsonSuccess, Error, void* )
	, void* userData)
{
	return muteUserHelper(accessToken,
	mutedUserId, 
	handler, userData, true);
}

bool UsersManager::muteUserSync(char * accessToken,
	int mutedUserId, 
	void(* handler)(JsonSuccess, Error, void* )
	, void* userData)
{
	return muteUserHelper(accessToken,
	mutedUserId, 
	handler, userData, false);
}

static bool reactivateUserProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(AnyType, Error, void* )
	= reinterpret_cast<void(*)(AnyType, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	AnyType out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("AnyType")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "AnyType", "AnyType");
			json_node_free(pJson);

			if ("AnyType" == "std::string") {
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

static bool reactivateUserHelper(char * accessToken,
	int userId, 
	void(* handler)(AnyType, Error, void* )
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

	string url("/users/{user_id}/reactivate");
	int pos;

	string s_userId("{");
	s_userId.append("user_id");
	s_userId.append("}");
	pos = url.find(s_userId);
	url.erase(pos, s_userId.length());
	url.insert(pos, stringify(&userId, "int"));

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
		NetClient::easycurl(UsersManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = reactivateUserProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (UsersManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), reactivateUserProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __UsersManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool UsersManager::reactivateUserAsync(char * accessToken,
	int userId, 
	void(* handler)(AnyType, Error, void* )
	, void* userData)
{
	return reactivateUserHelper(accessToken,
	userId, 
	handler, userData, true);
}

bool UsersManager::reactivateUserSync(char * accessToken,
	int userId, 
	void(* handler)(AnyType, Error, void* )
	, void* userData)
{
	return reactivateUserHelper(accessToken,
	userId, 
	handler, userData, false);
}

static bool removeUserGroupProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
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

static bool removeUserGroupHelper(char * accessToken,
	int userGroupId, 
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

	string url("/user_groups/{user_group_id}");
	int pos;

	string s_userGroupId("{");
	s_userGroupId.append("user_group_id");
	s_userGroupId.append("}");
	pos = url.find(s_userGroupId);
	url.erase(pos, s_userGroupId.length());
	url.insert(pos, stringify(&userGroupId, "int"));

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
		NetClient::easycurl(UsersManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = removeUserGroupProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (UsersManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), removeUserGroupProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __UsersManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool UsersManager::removeUserGroupAsync(char * accessToken,
	int userGroupId, 
	void(* handler)(JsonSuccess, Error, void* )
	, void* userData)
{
	return removeUserGroupHelper(accessToken,
	userGroupId, 
	handler, userData, true);
}

bool UsersManager::removeUserGroupSync(char * accessToken,
	int userGroupId, 
	void(* handler)(JsonSuccess, Error, void* )
	, void* userData)
{
	return removeUserGroupHelper(accessToken,
	userGroupId, 
	handler, userData, false);
}

static bool setTypingStatusProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
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

static bool setTypingStatusHelper(char * accessToken,
	std::string op, std::list<int> to, std::string type, std::string topic, 
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
	

	itemAtq = stringify(&type, "std::string");
	queryParams.insert(pair<string, string>("type", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("type");
	}


	itemAtq = stringify(&op, "std::string");
	queryParams.insert(pair<string, string>("op", itemAtq));

	for (std::list
	<int>::iterator queryIter = to.begin(); queryIter != to.end(); ++queryIter) {
		string itemAt = stringify(&(*queryIter), "int");
		queryParams.insert(pair<string, string>("to", itemAt));
	}
	

	itemAtq = stringify(&topic, "std::string");
	queryParams.insert(pair<string, string>("topic", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("topic");
	}

	string mBody = "";
	JsonNode* node;
	JsonArray* json_array;

	string url("/typing");
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
		NetClient::easycurl(UsersManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = setTypingStatusProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (UsersManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), setTypingStatusProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __UsersManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool UsersManager::setTypingStatusAsync(char * accessToken,
	std::string op, std::list<int> to, std::string type, std::string topic, 
	void(* handler)(JsonSuccess, Error, void* )
	, void* userData)
{
	return setTypingStatusHelper(accessToken,
	op, to, type, topic, 
	handler, userData, true);
}

bool UsersManager::setTypingStatusSync(char * accessToken,
	std::string op, std::list<int> to, std::string type, std::string topic, 
	void(* handler)(JsonSuccess, Error, void* )
	, void* userData)
{
	return setTypingStatusHelper(accessToken,
	op, to, type, topic, 
	handler, userData, false);
}

static bool unmuteUserProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
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

static bool unmuteUserHelper(char * accessToken,
	int mutedUserId, 
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

	string url("/users/me/muted_users/{muted_user_id}");
	int pos;

	string s_mutedUserId("{");
	s_mutedUserId.append("muted_user_id");
	s_mutedUserId.append("}");
	pos = url.find(s_mutedUserId);
	url.erase(pos, s_mutedUserId.length());
	url.insert(pos, stringify(&mutedUserId, "int"));

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
		NetClient::easycurl(UsersManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = unmuteUserProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (UsersManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), unmuteUserProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __UsersManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool UsersManager::unmuteUserAsync(char * accessToken,
	int mutedUserId, 
	void(* handler)(JsonSuccess, Error, void* )
	, void* userData)
{
	return unmuteUserHelper(accessToken,
	mutedUserId, 
	handler, userData, true);
}

bool UsersManager::unmuteUserSync(char * accessToken,
	int mutedUserId, 
	void(* handler)(JsonSuccess, Error, void* )
	, void* userData)
{
	return unmuteUserHelper(accessToken,
	mutedUserId, 
	handler, userData, false);
}

static bool updateSettingsProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
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

static bool updateSettingsHelper(char * accessToken,
	std::string fullName, std::string email, std::string oldPassword, std::string newPassword, bool twentyFourHourTime, bool denseMode, bool starredMessageCounts, bool fluidLayoutWidth, bool highContrastMode, int colorScheme, bool enableDraftsSynchronization, bool translateEmoticons, std::string defaultLanguage, std::string defaultView, bool leftSideUserlist, std::string emojiset, int demoteInactiveStreams, std::string timezone, bool enableStreamDesktopNotifications, bool enableStreamEmailNotifications, bool enableStreamPushNotifications, bool enableStreamAudibleNotifications, std::string notificationSound, bool enableDesktopNotifications, bool enableSounds, int emailNotificationsBatchingPeriodSeconds, bool enableOfflineEmailNotifications, bool enableOfflinePushNotifications, bool enableOnlinePushNotifications, bool enableDigestEmails, bool enableMarketingEmails, bool enableLoginEmails, bool messageContentInEmailNotifications, bool pmContentInDesktopNotifications, bool wildcardMentionsNotify, int desktopIconCountDisplay, bool realmNameInNotifications, bool presenceEnabled, bool enterSends, 
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
	

	itemAtq = stringify(&fullName, "std::string");
	queryParams.insert(pair<string, string>("full_name", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("full_name");
	}


	itemAtq = stringify(&email, "std::string");
	queryParams.insert(pair<string, string>("email", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("email");
	}


	itemAtq = stringify(&oldPassword, "std::string");
	queryParams.insert(pair<string, string>("old_password", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("old_password");
	}


	itemAtq = stringify(&newPassword, "std::string");
	queryParams.insert(pair<string, string>("new_password", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("new_password");
	}


	itemAtq = stringify(&twentyFourHourTime, "bool");
	queryParams.insert(pair<string, string>("twenty_four_hour_time", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("twenty_four_hour_time");
	}


	itemAtq = stringify(&denseMode, "bool");
	queryParams.insert(pair<string, string>("dense_mode", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("dense_mode");
	}


	itemAtq = stringify(&starredMessageCounts, "bool");
	queryParams.insert(pair<string, string>("starred_message_counts", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("starred_message_counts");
	}


	itemAtq = stringify(&fluidLayoutWidth, "bool");
	queryParams.insert(pair<string, string>("fluid_layout_width", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("fluid_layout_width");
	}


	itemAtq = stringify(&highContrastMode, "bool");
	queryParams.insert(pair<string, string>("high_contrast_mode", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("high_contrast_mode");
	}


	itemAtq = stringify(&colorScheme, "int");
	queryParams.insert(pair<string, string>("color_scheme", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("color_scheme");
	}


	itemAtq = stringify(&enableDraftsSynchronization, "bool");
	queryParams.insert(pair<string, string>("enable_drafts_synchronization", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("enable_drafts_synchronization");
	}


	itemAtq = stringify(&translateEmoticons, "bool");
	queryParams.insert(pair<string, string>("translate_emoticons", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("translate_emoticons");
	}


	itemAtq = stringify(&defaultLanguage, "std::string");
	queryParams.insert(pair<string, string>("default_language", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("default_language");
	}


	itemAtq = stringify(&defaultView, "std::string");
	queryParams.insert(pair<string, string>("default_view", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("default_view");
	}


	itemAtq = stringify(&leftSideUserlist, "bool");
	queryParams.insert(pair<string, string>("left_side_userlist", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("left_side_userlist");
	}


	itemAtq = stringify(&emojiset, "std::string");
	queryParams.insert(pair<string, string>("emojiset", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("emojiset");
	}


	itemAtq = stringify(&demoteInactiveStreams, "int");
	queryParams.insert(pair<string, string>("demote_inactive_streams", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("demote_inactive_streams");
	}


	itemAtq = stringify(&timezone, "std::string");
	queryParams.insert(pair<string, string>("timezone", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("timezone");
	}


	itemAtq = stringify(&enableStreamDesktopNotifications, "bool");
	queryParams.insert(pair<string, string>("enable_stream_desktop_notifications", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("enable_stream_desktop_notifications");
	}


	itemAtq = stringify(&enableStreamEmailNotifications, "bool");
	queryParams.insert(pair<string, string>("enable_stream_email_notifications", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("enable_stream_email_notifications");
	}


	itemAtq = stringify(&enableStreamPushNotifications, "bool");
	queryParams.insert(pair<string, string>("enable_stream_push_notifications", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("enable_stream_push_notifications");
	}


	itemAtq = stringify(&enableStreamAudibleNotifications, "bool");
	queryParams.insert(pair<string, string>("enable_stream_audible_notifications", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("enable_stream_audible_notifications");
	}


	itemAtq = stringify(&notificationSound, "std::string");
	queryParams.insert(pair<string, string>("notification_sound", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("notification_sound");
	}


	itemAtq = stringify(&enableDesktopNotifications, "bool");
	queryParams.insert(pair<string, string>("enable_desktop_notifications", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("enable_desktop_notifications");
	}


	itemAtq = stringify(&enableSounds, "bool");
	queryParams.insert(pair<string, string>("enable_sounds", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("enable_sounds");
	}


	itemAtq = stringify(&emailNotificationsBatchingPeriodSeconds, "int");
	queryParams.insert(pair<string, string>("email_notifications_batching_period_seconds", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("email_notifications_batching_period_seconds");
	}


	itemAtq = stringify(&enableOfflineEmailNotifications, "bool");
	queryParams.insert(pair<string, string>("enable_offline_email_notifications", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("enable_offline_email_notifications");
	}


	itemAtq = stringify(&enableOfflinePushNotifications, "bool");
	queryParams.insert(pair<string, string>("enable_offline_push_notifications", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("enable_offline_push_notifications");
	}


	itemAtq = stringify(&enableOnlinePushNotifications, "bool");
	queryParams.insert(pair<string, string>("enable_online_push_notifications", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("enable_online_push_notifications");
	}


	itemAtq = stringify(&enableDigestEmails, "bool");
	queryParams.insert(pair<string, string>("enable_digest_emails", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("enable_digest_emails");
	}


	itemAtq = stringify(&enableMarketingEmails, "bool");
	queryParams.insert(pair<string, string>("enable_marketing_emails", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("enable_marketing_emails");
	}


	itemAtq = stringify(&enableLoginEmails, "bool");
	queryParams.insert(pair<string, string>("enable_login_emails", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("enable_login_emails");
	}


	itemAtq = stringify(&messageContentInEmailNotifications, "bool");
	queryParams.insert(pair<string, string>("message_content_in_email_notifications", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("message_content_in_email_notifications");
	}


	itemAtq = stringify(&pmContentInDesktopNotifications, "bool");
	queryParams.insert(pair<string, string>("pm_content_in_desktop_notifications", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("pm_content_in_desktop_notifications");
	}


	itemAtq = stringify(&wildcardMentionsNotify, "bool");
	queryParams.insert(pair<string, string>("wildcard_mentions_notify", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("wildcard_mentions_notify");
	}


	itemAtq = stringify(&desktopIconCountDisplay, "int");
	queryParams.insert(pair<string, string>("desktop_icon_count_display", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("desktop_icon_count_display");
	}


	itemAtq = stringify(&realmNameInNotifications, "bool");
	queryParams.insert(pair<string, string>("realm_name_in_notifications", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("realm_name_in_notifications");
	}


	itemAtq = stringify(&presenceEnabled, "bool");
	queryParams.insert(pair<string, string>("presence_enabled", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("presence_enabled");
	}


	itemAtq = stringify(&enterSends, "bool");
	queryParams.insert(pair<string, string>("enter_sends", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("enter_sends");
	}

	string mBody = "";
	JsonNode* node;
	JsonArray* json_array;

	string url("/settings");
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
		NetClient::easycurl(UsersManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = updateSettingsProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (UsersManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), updateSettingsProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __UsersManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool UsersManager::updateSettingsAsync(char * accessToken,
	std::string fullName, std::string email, std::string oldPassword, std::string newPassword, bool twentyFourHourTime, bool denseMode, bool starredMessageCounts, bool fluidLayoutWidth, bool highContrastMode, int colorScheme, bool enableDraftsSynchronization, bool translateEmoticons, std::string defaultLanguage, std::string defaultView, bool leftSideUserlist, std::string emojiset, int demoteInactiveStreams, std::string timezone, bool enableStreamDesktopNotifications, bool enableStreamEmailNotifications, bool enableStreamPushNotifications, bool enableStreamAudibleNotifications, std::string notificationSound, bool enableDesktopNotifications, bool enableSounds, int emailNotificationsBatchingPeriodSeconds, bool enableOfflineEmailNotifications, bool enableOfflinePushNotifications, bool enableOnlinePushNotifications, bool enableDigestEmails, bool enableMarketingEmails, bool enableLoginEmails, bool messageContentInEmailNotifications, bool pmContentInDesktopNotifications, bool wildcardMentionsNotify, int desktopIconCountDisplay, bool realmNameInNotifications, bool presenceEnabled, bool enterSends, 
	void(* handler)(JsonSuccessBase, Error, void* )
	, void* userData)
{
	return updateSettingsHelper(accessToken,
	fullName, email, oldPassword, newPassword, twentyFourHourTime, denseMode, starredMessageCounts, fluidLayoutWidth, highContrastMode, colorScheme, enableDraftsSynchronization, translateEmoticons, defaultLanguage, defaultView, leftSideUserlist, emojiset, demoteInactiveStreams, timezone, enableStreamDesktopNotifications, enableStreamEmailNotifications, enableStreamPushNotifications, enableStreamAudibleNotifications, notificationSound, enableDesktopNotifications, enableSounds, emailNotificationsBatchingPeriodSeconds, enableOfflineEmailNotifications, enableOfflinePushNotifications, enableOnlinePushNotifications, enableDigestEmails, enableMarketingEmails, enableLoginEmails, messageContentInEmailNotifications, pmContentInDesktopNotifications, wildcardMentionsNotify, desktopIconCountDisplay, realmNameInNotifications, presenceEnabled, enterSends, 
	handler, userData, true);
}

bool UsersManager::updateSettingsSync(char * accessToken,
	std::string fullName, std::string email, std::string oldPassword, std::string newPassword, bool twentyFourHourTime, bool denseMode, bool starredMessageCounts, bool fluidLayoutWidth, bool highContrastMode, int colorScheme, bool enableDraftsSynchronization, bool translateEmoticons, std::string defaultLanguage, std::string defaultView, bool leftSideUserlist, std::string emojiset, int demoteInactiveStreams, std::string timezone, bool enableStreamDesktopNotifications, bool enableStreamEmailNotifications, bool enableStreamPushNotifications, bool enableStreamAudibleNotifications, std::string notificationSound, bool enableDesktopNotifications, bool enableSounds, int emailNotificationsBatchingPeriodSeconds, bool enableOfflineEmailNotifications, bool enableOfflinePushNotifications, bool enableOnlinePushNotifications, bool enableDigestEmails, bool enableMarketingEmails, bool enableLoginEmails, bool messageContentInEmailNotifications, bool pmContentInDesktopNotifications, bool wildcardMentionsNotify, int desktopIconCountDisplay, bool realmNameInNotifications, bool presenceEnabled, bool enterSends, 
	void(* handler)(JsonSuccessBase, Error, void* )
	, void* userData)
{
	return updateSettingsHelper(accessToken,
	fullName, email, oldPassword, newPassword, twentyFourHourTime, denseMode, starredMessageCounts, fluidLayoutWidth, highContrastMode, colorScheme, enableDraftsSynchronization, translateEmoticons, defaultLanguage, defaultView, leftSideUserlist, emojiset, demoteInactiveStreams, timezone, enableStreamDesktopNotifications, enableStreamEmailNotifications, enableStreamPushNotifications, enableStreamAudibleNotifications, notificationSound, enableDesktopNotifications, enableSounds, emailNotificationsBatchingPeriodSeconds, enableOfflineEmailNotifications, enableOfflinePushNotifications, enableOnlinePushNotifications, enableDigestEmails, enableMarketingEmails, enableLoginEmails, messageContentInEmailNotifications, pmContentInDesktopNotifications, wildcardMentionsNotify, desktopIconCountDisplay, realmNameInNotifications, presenceEnabled, enterSends, 
	handler, userData, false);
}

static bool updateStatusProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
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

static bool updateStatusHelper(char * accessToken,
	std::string statusText, bool away, std::string emojiName, std::string emojiCode, std::string reactionType, 
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
	

	itemAtq = stringify(&statusText, "std::string");
	queryParams.insert(pair<string, string>("status_text", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("status_text");
	}


	itemAtq = stringify(&away, "bool");
	queryParams.insert(pair<string, string>("away", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("away");
	}


	itemAtq = stringify(&emojiName, "std::string");
	queryParams.insert(pair<string, string>("emoji_name", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("emoji_name");
	}


	itemAtq = stringify(&emojiCode, "std::string");
	queryParams.insert(pair<string, string>("emoji_code", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("emoji_code");
	}


	itemAtq = stringify(&reactionType, "std::string");
	queryParams.insert(pair<string, string>("reaction_type", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("reaction_type");
	}

	string mBody = "";
	JsonNode* node;
	JsonArray* json_array;

	string url("/users/me/status");
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
		NetClient::easycurl(UsersManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = updateStatusProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (UsersManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), updateStatusProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __UsersManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool UsersManager::updateStatusAsync(char * accessToken,
	std::string statusText, bool away, std::string emojiName, std::string emojiCode, std::string reactionType, 
	void(* handler)(JsonSuccess, Error, void* )
	, void* userData)
{
	return updateStatusHelper(accessToken,
	statusText, away, emojiName, emojiCode, reactionType, 
	handler, userData, true);
}

bool UsersManager::updateStatusSync(char * accessToken,
	std::string statusText, bool away, std::string emojiName, std::string emojiCode, std::string reactionType, 
	void(* handler)(JsonSuccess, Error, void* )
	, void* userData)
{
	return updateStatusHelper(accessToken,
	statusText, away, emojiName, emojiCode, reactionType, 
	handler, userData, false);
}

static bool updateUserProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
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

static bool updateUserHelper(char * accessToken,
	int userId, std::string fullName, int role, std::list<std::string> profileData, 
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
	

	itemAtq = stringify(&fullName, "std::string");
	queryParams.insert(pair<string, string>("full_name", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("full_name");
	}


	itemAtq = stringify(&role, "int");
	queryParams.insert(pair<string, string>("role", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("role");
	}

	for (std::list
	<std::string>::iterator queryIter = profileData.begin(); queryIter != profileData.end(); ++queryIter) {
		string itemAt = stringify(&(*queryIter), "std::string");
		if( itemAt.empty()){
			continue;
		}
		queryParams.insert(pair<string, string>("profileData", itemAt));
	}
	
	string mBody = "";
	JsonNode* node;
	JsonArray* json_array;

	string url("/users/{user_id}");
	int pos;

	string s_userId("{");
	s_userId.append("user_id");
	s_userId.append("}");
	pos = url.find(s_userId);
	url.erase(pos, s_userId.length());
	url.insert(pos, stringify(&userId, "int"));

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
		NetClient::easycurl(UsersManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = updateUserProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (UsersManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), updateUserProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __UsersManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool UsersManager::updateUserAsync(char * accessToken,
	int userId, std::string fullName, int role, std::list<std::string> profileData, 
	void(* handler)(JsonSuccess, Error, void* )
	, void* userData)
{
	return updateUserHelper(accessToken,
	userId, fullName, role, profileData, 
	handler, userData, true);
}

bool UsersManager::updateUserSync(char * accessToken,
	int userId, std::string fullName, int role, std::list<std::string> profileData, 
	void(* handler)(JsonSuccess, Error, void* )
	, void* userData)
{
	return updateUserHelper(accessToken,
	userId, fullName, role, profileData, 
	handler, userData, false);
}

static bool updateUserGroupProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
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

static bool updateUserGroupHelper(char * accessToken,
	int userGroupId, std::string name, std::string description, 
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
	

	itemAtq = stringify(&name, "std::string");
	queryParams.insert(pair<string, string>("name", itemAtq));


	itemAtq = stringify(&description, "std::string");
	queryParams.insert(pair<string, string>("description", itemAtq));

	string mBody = "";
	JsonNode* node;
	JsonArray* json_array;

	string url("/user_groups/{user_group_id}");
	int pos;

	string s_userGroupId("{");
	s_userGroupId.append("user_group_id");
	s_userGroupId.append("}");
	pos = url.find(s_userGroupId);
	url.erase(pos, s_userGroupId.length());
	url.insert(pos, stringify(&userGroupId, "int"));

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
		NetClient::easycurl(UsersManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = updateUserGroupProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (UsersManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), updateUserGroupProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __UsersManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool UsersManager::updateUserGroupAsync(char * accessToken,
	int userGroupId, std::string name, std::string description, 
	void(* handler)(JsonSuccess, Error, void* )
	, void* userData)
{
	return updateUserGroupHelper(accessToken,
	userGroupId, name, description, 
	handler, userData, true);
}

bool UsersManager::updateUserGroupSync(char * accessToken,
	int userGroupId, std::string name, std::string description, 
	void(* handler)(JsonSuccess, Error, void* )
	, void* userData)
{
	return updateUserGroupHelper(accessToken,
	userGroupId, name, description, 
	handler, userData, false);
}

static bool updateUserGroupMembersProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
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

static bool updateUserGroupMembersHelper(char * accessToken,
	int userGroupId, std::list<int> r_delete, std::list<int> add, 
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
	<int>::iterator queryIter = r_delete.begin(); queryIter != r_delete.end(); ++queryIter) {
		string itemAt = stringify(&(*queryIter), "int");
		if( itemAt.empty()){
			continue;
		}
		queryParams.insert(pair<string, string>("r_delete", itemAt));
	}
	
	for (std::list
	<int>::iterator queryIter = add.begin(); queryIter != add.end(); ++queryIter) {
		string itemAt = stringify(&(*queryIter), "int");
		if( itemAt.empty()){
			continue;
		}
		queryParams.insert(pair<string, string>("add", itemAt));
	}
	
	string mBody = "";
	JsonNode* node;
	JsonArray* json_array;

	string url("/user_groups/{user_group_id}/members");
	int pos;

	string s_userGroupId("{");
	s_userGroupId.append("user_group_id");
	s_userGroupId.append("}");
	pos = url.find(s_userGroupId);
	url.erase(pos, s_userGroupId.length());
	url.insert(pos, stringify(&userGroupId, "int"));

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
		NetClient::easycurl(UsersManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = updateUserGroupMembersProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (UsersManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), updateUserGroupMembersProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __UsersManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool UsersManager::updateUserGroupMembersAsync(char * accessToken,
	int userGroupId, std::list<int> r_delete, std::list<int> add, 
	void(* handler)(JsonSuccess, Error, void* )
	, void* userData)
{
	return updateUserGroupMembersHelper(accessToken,
	userGroupId, r_delete, add, 
	handler, userData, true);
}

bool UsersManager::updateUserGroupMembersSync(char * accessToken,
	int userGroupId, std::list<int> r_delete, std::list<int> add, 
	void(* handler)(JsonSuccess, Error, void* )
	, void* userData)
{
	return updateUserGroupMembersHelper(accessToken,
	userGroupId, r_delete, add, 
	handler, userData, false);
}

