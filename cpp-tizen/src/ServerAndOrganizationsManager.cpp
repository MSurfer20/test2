#include <glib-object.h>
#include <json-glib/json-glib.h>

#include "ServerAndOrganizationsManager.h"
#include "NetClient.h"
#include "Helpers.h"
#include "Error.h"
#include "RequestInfo.h"

using namespace std;
using namespace Tizen::ArtikCloud;


ServerAndOrganizationsManager::ServerAndOrganizationsManager()
{

}

ServerAndOrganizationsManager::~ServerAndOrganizationsManager()
{

}

static gboolean __ServerAndOrganizationsManagerresponseHandler(gpointer data)
{
	RequestInfo *request = static_cast<RequestInfo*>(data);
	g_thread_join(request->thread);

	// invoke the callback function
	bool retval = request->processor(*(request->p_chunk), *(request->code), request->errormsg, request->userData, request->handler);

	delete request;
	return FALSE;
}

static gpointer __ServerAndOrganizationsManagerthreadFunc(gpointer data)
{
	RequestInfo *request = static_cast<RequestInfo*>(data);

	// handle the request
	NetClient::easycurl(request->host, request->path, request->method, request->queryParams,
	request->mBody, request->headerList, request->p_chunk, request->code, request->errormsg);

	request->thread = g_thread_self();
	g_idle_add(__ServerAndOrganizationsManagerresponseHandler, static_cast<gpointer>(request));

	return NULL;
}


static bool addCodePlaygroundProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
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

static bool addCodePlaygroundHelper(char * accessToken,
	std::string name, std::string pygmentsLanguage, std::string urlPrefix, 
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
	

	itemAtq = stringify(&name, "std::string");
	queryParams.insert(pair<string, string>("name", itemAtq));


	itemAtq = stringify(&pygmentsLanguage, "std::string");
	queryParams.insert(pair<string, string>("pygments_language", itemAtq));


	itemAtq = stringify(&urlPrefix, "std::string");
	queryParams.insert(pair<string, string>("url_prefix", itemAtq));

	string mBody = "";
	JsonNode* node;
	JsonArray* json_array;

	string url("/realm/playgrounds");
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
		NetClient::easycurl(ServerAndOrganizationsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = addCodePlaygroundProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (ServerAndOrganizationsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), addCodePlaygroundProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __ServerAndOrganizationsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool ServerAndOrganizationsManager::addCodePlaygroundAsync(char * accessToken,
	std::string name, std::string pygmentsLanguage, std::string urlPrefix, 
	void(* handler)(JsonSuccessBase, Error, void* )
	, void* userData)
{
	return addCodePlaygroundHelper(accessToken,
	name, pygmentsLanguage, urlPrefix, 
	handler, userData, true);
}

bool ServerAndOrganizationsManager::addCodePlaygroundSync(char * accessToken,
	std::string name, std::string pygmentsLanguage, std::string urlPrefix, 
	void(* handler)(JsonSuccessBase, Error, void* )
	, void* userData)
{
	return addCodePlaygroundHelper(accessToken,
	name, pygmentsLanguage, urlPrefix, 
	handler, userData, false);
}

static bool addLinkifierProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
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

static bool addLinkifierHelper(char * accessToken,
	std::string pattern, std::string urlFormatString, 
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
	

	itemAtq = stringify(&pattern, "std::string");
	queryParams.insert(pair<string, string>("pattern", itemAtq));


	itemAtq = stringify(&urlFormatString, "std::string");
	queryParams.insert(pair<string, string>("url_format_string", itemAtq));

	string mBody = "";
	JsonNode* node;
	JsonArray* json_array;

	string url("/realm/filters");
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
		NetClient::easycurl(ServerAndOrganizationsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = addLinkifierProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (ServerAndOrganizationsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), addLinkifierProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __ServerAndOrganizationsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool ServerAndOrganizationsManager::addLinkifierAsync(char * accessToken,
	std::string pattern, std::string urlFormatString, 
	void(* handler)(JsonSuccessBase, Error, void* )
	, void* userData)
{
	return addLinkifierHelper(accessToken,
	pattern, urlFormatString, 
	handler, userData, true);
}

bool ServerAndOrganizationsManager::addLinkifierSync(char * accessToken,
	std::string pattern, std::string urlFormatString, 
	void(* handler)(JsonSuccessBase, Error, void* )
	, void* userData)
{
	return addLinkifierHelper(accessToken,
	pattern, urlFormatString, 
	handler, userData, false);
}

static bool createCustomProfileFieldProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
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

static bool createCustomProfileFieldHelper(char * accessToken,
	int fieldType, std::string name, std::string hint, std::string fieldData, 
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
	

	itemAtq = stringify(&name, "std::string");
	queryParams.insert(pair<string, string>("name", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("name");
	}


	itemAtq = stringify(&hint, "std::string");
	queryParams.insert(pair<string, string>("hint", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("hint");
	}


	itemAtq = stringify(&fieldType, "int");
	queryParams.insert(pair<string, string>("field_type", itemAtq));


	itemAtq = stringify(&fieldData, "std::string");
	queryParams.insert(pair<string, string>("field_data", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("field_data");
	}

	string mBody = "";
	JsonNode* node;
	JsonArray* json_array;

	string url("/realm/profile_fields");
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
		NetClient::easycurl(ServerAndOrganizationsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = createCustomProfileFieldProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (ServerAndOrganizationsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), createCustomProfileFieldProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __ServerAndOrganizationsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool ServerAndOrganizationsManager::createCustomProfileFieldAsync(char * accessToken,
	int fieldType, std::string name, std::string hint, std::string fieldData, 
	void(* handler)(JsonSuccessBase, Error, void* )
	, void* userData)
{
	return createCustomProfileFieldHelper(accessToken,
	fieldType, name, hint, fieldData, 
	handler, userData, true);
}

bool ServerAndOrganizationsManager::createCustomProfileFieldSync(char * accessToken,
	int fieldType, std::string name, std::string hint, std::string fieldData, 
	void(* handler)(JsonSuccessBase, Error, void* )
	, void* userData)
{
	return createCustomProfileFieldHelper(accessToken,
	fieldType, name, hint, fieldData, 
	handler, userData, false);
}

static bool getCustomEmojiProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
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

static bool getCustomEmojiHelper(char * accessToken,
	
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

	string url("/realm/emoji");
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
		NetClient::easycurl(ServerAndOrganizationsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = getCustomEmojiProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (ServerAndOrganizationsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), getCustomEmojiProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __ServerAndOrganizationsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool ServerAndOrganizationsManager::getCustomEmojiAsync(char * accessToken,
	
	void(* handler)(JsonSuccessBase, Error, void* )
	, void* userData)
{
	return getCustomEmojiHelper(accessToken,
	
	handler, userData, true);
}

bool ServerAndOrganizationsManager::getCustomEmojiSync(char * accessToken,
	
	void(* handler)(JsonSuccessBase, Error, void* )
	, void* userData)
{
	return getCustomEmojiHelper(accessToken,
	
	handler, userData, false);
}

static bool getCustomProfileFieldsProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
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

static bool getCustomProfileFieldsHelper(char * accessToken,
	
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

	string url("/realm/profile_fields");
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
		NetClient::easycurl(ServerAndOrganizationsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = getCustomProfileFieldsProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (ServerAndOrganizationsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), getCustomProfileFieldsProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __ServerAndOrganizationsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool ServerAndOrganizationsManager::getCustomProfileFieldsAsync(char * accessToken,
	
	void(* handler)(JsonSuccessBase, Error, void* )
	, void* userData)
{
	return getCustomProfileFieldsHelper(accessToken,
	
	handler, userData, true);
}

bool ServerAndOrganizationsManager::getCustomProfileFieldsSync(char * accessToken,
	
	void(* handler)(JsonSuccessBase, Error, void* )
	, void* userData)
{
	return getCustomProfileFieldsHelper(accessToken,
	
	handler, userData, false);
}

static bool getLinkifiersProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
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

static bool getLinkifiersHelper(char * accessToken,
	
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

	string url("/realm/linkifiers");
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
		NetClient::easycurl(ServerAndOrganizationsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = getLinkifiersProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (ServerAndOrganizationsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), getLinkifiersProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __ServerAndOrganizationsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool ServerAndOrganizationsManager::getLinkifiersAsync(char * accessToken,
	
	void(* handler)(JsonSuccessBase, Error, void* )
	, void* userData)
{
	return getLinkifiersHelper(accessToken,
	
	handler, userData, true);
}

bool ServerAndOrganizationsManager::getLinkifiersSync(char * accessToken,
	
	void(* handler)(JsonSuccessBase, Error, void* )
	, void* userData)
{
	return getLinkifiersHelper(accessToken,
	
	handler, userData, false);
}

static bool getServerSettingsProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
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

static bool getServerSettingsHelper(char * accessToken,
	
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

	string url("/server_settings");
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
		NetClient::easycurl(ServerAndOrganizationsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = getServerSettingsProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (ServerAndOrganizationsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), getServerSettingsProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __ServerAndOrganizationsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool ServerAndOrganizationsManager::getServerSettingsAsync(char * accessToken,
	
	void(* handler)(JsonSuccessBase, Error, void* )
	, void* userData)
{
	return getServerSettingsHelper(accessToken,
	
	handler, userData, true);
}

bool ServerAndOrganizationsManager::getServerSettingsSync(char * accessToken,
	
	void(* handler)(JsonSuccessBase, Error, void* )
	, void* userData)
{
	return getServerSettingsHelper(accessToken,
	
	handler, userData, false);
}

static bool removeCodePlaygroundProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
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

static bool removeCodePlaygroundHelper(char * accessToken,
	int playgroundId, 
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

	string url("/realm/playgrounds/{playground_id}");
	int pos;

	string s_playgroundId("{");
	s_playgroundId.append("playground_id");
	s_playgroundId.append("}");
	pos = url.find(s_playgroundId);
	url.erase(pos, s_playgroundId.length());
	url.insert(pos, stringify(&playgroundId, "int"));

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
		NetClient::easycurl(ServerAndOrganizationsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = removeCodePlaygroundProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (ServerAndOrganizationsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), removeCodePlaygroundProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __ServerAndOrganizationsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool ServerAndOrganizationsManager::removeCodePlaygroundAsync(char * accessToken,
	int playgroundId, 
	void(* handler)(JsonSuccess, Error, void* )
	, void* userData)
{
	return removeCodePlaygroundHelper(accessToken,
	playgroundId, 
	handler, userData, true);
}

bool ServerAndOrganizationsManager::removeCodePlaygroundSync(char * accessToken,
	int playgroundId, 
	void(* handler)(JsonSuccess, Error, void* )
	, void* userData)
{
	return removeCodePlaygroundHelper(accessToken,
	playgroundId, 
	handler, userData, false);
}

static bool removeLinkifierProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
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

static bool removeLinkifierHelper(char * accessToken,
	int filterId, 
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

	string url("/realm/filters/{filter_id}");
	int pos;

	string s_filterId("{");
	s_filterId.append("filter_id");
	s_filterId.append("}");
	pos = url.find(s_filterId);
	url.erase(pos, s_filterId.length());
	url.insert(pos, stringify(&filterId, "int"));

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
		NetClient::easycurl(ServerAndOrganizationsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = removeLinkifierProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (ServerAndOrganizationsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), removeLinkifierProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __ServerAndOrganizationsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool ServerAndOrganizationsManager::removeLinkifierAsync(char * accessToken,
	int filterId, 
	void(* handler)(JsonSuccess, Error, void* )
	, void* userData)
{
	return removeLinkifierHelper(accessToken,
	filterId, 
	handler, userData, true);
}

bool ServerAndOrganizationsManager::removeLinkifierSync(char * accessToken,
	int filterId, 
	void(* handler)(JsonSuccess, Error, void* )
	, void* userData)
{
	return removeLinkifierHelper(accessToken,
	filterId, 
	handler, userData, false);
}

static bool reorderCustomProfileFieldsProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
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

static bool reorderCustomProfileFieldsHelper(char * accessToken,
	std::list<int> order, 
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
	<int>::iterator queryIter = order.begin(); queryIter != order.end(); ++queryIter) {
		string itemAt = stringify(&(*queryIter), "int");
		queryParams.insert(pair<string, string>("order", itemAt));
	}
	
	string mBody = "";
	JsonNode* node;
	JsonArray* json_array;

	string url("/realm/profile_fields");
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
		NetClient::easycurl(ServerAndOrganizationsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = reorderCustomProfileFieldsProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (ServerAndOrganizationsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), reorderCustomProfileFieldsProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __ServerAndOrganizationsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool ServerAndOrganizationsManager::reorderCustomProfileFieldsAsync(char * accessToken,
	std::list<int> order, 
	void(* handler)(JsonSuccess, Error, void* )
	, void* userData)
{
	return reorderCustomProfileFieldsHelper(accessToken,
	order, 
	handler, userData, true);
}

bool ServerAndOrganizationsManager::reorderCustomProfileFieldsSync(char * accessToken,
	std::list<int> order, 
	void(* handler)(JsonSuccess, Error, void* )
	, void* userData)
{
	return reorderCustomProfileFieldsHelper(accessToken,
	order, 
	handler, userData, false);
}

static bool updateLinkifierProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
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

static bool updateLinkifierHelper(char * accessToken,
	int filterId, std::string pattern, std::string urlFormatString, 
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
	

	itemAtq = stringify(&pattern, "std::string");
	queryParams.insert(pair<string, string>("pattern", itemAtq));


	itemAtq = stringify(&urlFormatString, "std::string");
	queryParams.insert(pair<string, string>("url_format_string", itemAtq));

	string mBody = "";
	JsonNode* node;
	JsonArray* json_array;

	string url("/realm/filters/{filter_id}");
	int pos;

	string s_filterId("{");
	s_filterId.append("filter_id");
	s_filterId.append("}");
	pos = url.find(s_filterId);
	url.erase(pos, s_filterId.length());
	url.insert(pos, stringify(&filterId, "int"));

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
		NetClient::easycurl(ServerAndOrganizationsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = updateLinkifierProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (ServerAndOrganizationsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), updateLinkifierProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __ServerAndOrganizationsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool ServerAndOrganizationsManager::updateLinkifierAsync(char * accessToken,
	int filterId, std::string pattern, std::string urlFormatString, 
	void(* handler)(JsonSuccess, Error, void* )
	, void* userData)
{
	return updateLinkifierHelper(accessToken,
	filterId, pattern, urlFormatString, 
	handler, userData, true);
}

bool ServerAndOrganizationsManager::updateLinkifierSync(char * accessToken,
	int filterId, std::string pattern, std::string urlFormatString, 
	void(* handler)(JsonSuccess, Error, void* )
	, void* userData)
{
	return updateLinkifierHelper(accessToken,
	filterId, pattern, urlFormatString, 
	handler, userData, false);
}

static bool uploadCustomEmojiProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
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

static bool uploadCustomEmojiHelper(char * accessToken,
	std::string emojiName, std::string filename, 
	void(* handler)(JsonSuccess, Error, void* )
	, void* userData, bool isAsync)
{

	//TODO: maybe delete headerList after its used to free up space?
	struct curl_slist *headerList = NULL;

	
	string accessHeader = "Authorization: Bearer ";
	accessHeader.append(accessToken);
	headerList = curl_slist_append(headerList, accessHeader.c_str());
	headerList = curl_slist_append(headerList, "Content-Type: multipart/form-data");

	map <string, string> queryParams;
	string itemAtq;
	
	string mBody = "";
	JsonNode* node;
	JsonArray* json_array;

	string url("/realm/emoji/{emoji_name}");
	int pos;

	string s_emojiName("{");
	s_emojiName.append("emoji_name");
	s_emojiName.append("}");
	pos = url.find(s_emojiName);
	url.erase(pos, s_emojiName.length());
	url.insert(pos, stringify(&emojiName, "std::string"));

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
		NetClient::easycurl(ServerAndOrganizationsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = uploadCustomEmojiProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (ServerAndOrganizationsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), uploadCustomEmojiProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __ServerAndOrganizationsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool ServerAndOrganizationsManager::uploadCustomEmojiAsync(char * accessToken,
	std::string emojiName, std::string filename, 
	void(* handler)(JsonSuccess, Error, void* )
	, void* userData)
{
	return uploadCustomEmojiHelper(accessToken,
	emojiName, filename, 
	handler, userData, true);
}

bool ServerAndOrganizationsManager::uploadCustomEmojiSync(char * accessToken,
	std::string emojiName, std::string filename, 
	void(* handler)(JsonSuccess, Error, void* )
	, void* userData)
{
	return uploadCustomEmojiHelper(accessToken,
	emojiName, filename, 
	handler, userData, false);
}

