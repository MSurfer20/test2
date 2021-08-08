#include <glib-object.h>
#include <json-glib/json-glib.h>

#include "MessagesManager.h"
#include "NetClient.h"
#include "Helpers.h"
#include "Error.h"
#include "RequestInfo.h"

using namespace std;
using namespace Tizen::ArtikCloud;


MessagesManager::MessagesManager()
{

}

MessagesManager::~MessagesManager()
{

}

static gboolean __MessagesManagerresponseHandler(gpointer data)
{
	RequestInfo *request = static_cast<RequestInfo*>(data);
	g_thread_join(request->thread);

	// invoke the callback function
	bool retval = request->processor(*(request->p_chunk), *(request->code), request->errormsg, request->userData, request->handler);

	delete request;
	return FALSE;
}

static gpointer __MessagesManagerthreadFunc(gpointer data)
{
	RequestInfo *request = static_cast<RequestInfo*>(data);

	// handle the request
	NetClient::easycurl(request->host, request->path, request->method, request->queryParams,
	request->mBody, request->headerList, request->p_chunk, request->code, request->errormsg);

	request->thread = g_thread_self();
	g_idle_add(__MessagesManagerresponseHandler, static_cast<gpointer>(request));

	return NULL;
}


static bool addReactionProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
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

static bool addReactionHelper(char * accessToken,
	int messageId, std::string emojiName, std::string emojiCode, std::string reactionType, 
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
	

	itemAtq = stringify(&emojiName, "std::string");
	queryParams.insert(pair<string, string>("emoji_name", itemAtq));


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

	string url("/messages/{message_id}/reactions");
	int pos;

	string s_messageId("{");
	s_messageId.append("message_id");
	s_messageId.append("}");
	pos = url.find(s_messageId);
	url.erase(pos, s_messageId.length());
	url.insert(pos, stringify(&messageId, "int"));

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
		NetClient::easycurl(MessagesManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = addReactionProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (MessagesManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), addReactionProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __MessagesManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool MessagesManager::addReactionAsync(char * accessToken,
	int messageId, std::string emojiName, std::string emojiCode, std::string reactionType, 
	void(* handler)(JsonSuccess, Error, void* )
	, void* userData)
{
	return addReactionHelper(accessToken,
	messageId, emojiName, emojiCode, reactionType, 
	handler, userData, true);
}

bool MessagesManager::addReactionSync(char * accessToken,
	int messageId, std::string emojiName, std::string emojiCode, std::string reactionType, 
	void(* handler)(JsonSuccess, Error, void* )
	, void* userData)
{
	return addReactionHelper(accessToken,
	messageId, emojiName, emojiCode, reactionType, 
	handler, userData, false);
}

static bool checkMessagesMatchNarrowProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
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

static bool checkMessagesMatchNarrowHelper(char * accessToken,
	std::list<int> msgIds, std::list<std::string> narrow, 
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
	
	for (std::list
	<int>::iterator queryIter = msgIds.begin(); queryIter != msgIds.end(); ++queryIter) {
		string itemAt = stringify(&(*queryIter), "int");
		queryParams.insert(pair<string, string>("msgIds", itemAt));
	}
	
	for (std::list
	<std::string>::iterator queryIter = narrow.begin(); queryIter != narrow.end(); ++queryIter) {
		string itemAt = stringify(&(*queryIter), "std::string");
		queryParams.insert(pair<string, string>("narrow", itemAt));
	}
	
	string mBody = "";
	JsonNode* node;
	JsonArray* json_array;

	string url("/messages/matches_narrow");
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
		NetClient::easycurl(MessagesManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = checkMessagesMatchNarrowProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (MessagesManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), checkMessagesMatchNarrowProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __MessagesManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool MessagesManager::checkMessagesMatchNarrowAsync(char * accessToken,
	std::list<int> msgIds, std::list<std::string> narrow, 
	void(* handler)(AnyType, Error, void* )
	, void* userData)
{
	return checkMessagesMatchNarrowHelper(accessToken,
	msgIds, narrow, 
	handler, userData, true);
}

bool MessagesManager::checkMessagesMatchNarrowSync(char * accessToken,
	std::list<int> msgIds, std::list<std::string> narrow, 
	void(* handler)(AnyType, Error, void* )
	, void* userData)
{
	return checkMessagesMatchNarrowHelper(accessToken,
	msgIds, narrow, 
	handler, userData, false);
}

static bool deleteMessageProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
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

static bool deleteMessageHelper(char * accessToken,
	int messageId, 
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

	string url("/messages/{message_id}");
	int pos;

	string s_messageId("{");
	s_messageId.append("message_id");
	s_messageId.append("}");
	pos = url.find(s_messageId);
	url.erase(pos, s_messageId.length());
	url.insert(pos, stringify(&messageId, "int"));

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
		NetClient::easycurl(MessagesManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = deleteMessageProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (MessagesManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), deleteMessageProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __MessagesManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool MessagesManager::deleteMessageAsync(char * accessToken,
	int messageId, 
	void(* handler)(JsonSuccess, Error, void* )
	, void* userData)
{
	return deleteMessageHelper(accessToken,
	messageId, 
	handler, userData, true);
}

bool MessagesManager::deleteMessageSync(char * accessToken,
	int messageId, 
	void(* handler)(JsonSuccess, Error, void* )
	, void* userData)
{
	return deleteMessageHelper(accessToken,
	messageId, 
	handler, userData, false);
}

static bool getFileTemporaryUrlProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
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

static bool getFileTemporaryUrlHelper(char * accessToken,
	int realmIdStr, std::string filename, 
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

	string url("/user_uploads/{realm_id_str}/{filename}");
	int pos;

	string s_realmIdStr("{");
	s_realmIdStr.append("realm_id_str");
	s_realmIdStr.append("}");
	pos = url.find(s_realmIdStr);
	url.erase(pos, s_realmIdStr.length());
	url.insert(pos, stringify(&realmIdStr, "int"));
	string s_filename("{");
	s_filename.append("filename");
	s_filename.append("}");
	pos = url.find(s_filename);
	url.erase(pos, s_filename.length());
	url.insert(pos, stringify(&filename, "std::string"));

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
		NetClient::easycurl(MessagesManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = getFileTemporaryUrlProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (MessagesManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), getFileTemporaryUrlProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __MessagesManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool MessagesManager::getFileTemporaryUrlAsync(char * accessToken,
	int realmIdStr, std::string filename, 
	void(* handler)(JsonSuccessBase, Error, void* )
	, void* userData)
{
	return getFileTemporaryUrlHelper(accessToken,
	realmIdStr, filename, 
	handler, userData, true);
}

bool MessagesManager::getFileTemporaryUrlSync(char * accessToken,
	int realmIdStr, std::string filename, 
	void(* handler)(JsonSuccessBase, Error, void* )
	, void* userData)
{
	return getFileTemporaryUrlHelper(accessToken,
	realmIdStr, filename, 
	handler, userData, false);
}

static bool getMessageHistoryProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
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

static bool getMessageHistoryHelper(char * accessToken,
	int messageId, 
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

	string url("/messages/{message_id}/history");
	int pos;

	string s_messageId("{");
	s_messageId.append("message_id");
	s_messageId.append("}");
	pos = url.find(s_messageId);
	url.erase(pos, s_messageId.length());
	url.insert(pos, stringify(&messageId, "int"));

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
		NetClient::easycurl(MessagesManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = getMessageHistoryProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (MessagesManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), getMessageHistoryProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __MessagesManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool MessagesManager::getMessageHistoryAsync(char * accessToken,
	int messageId, 
	void(* handler)(JsonSuccessBase, Error, void* )
	, void* userData)
{
	return getMessageHistoryHelper(accessToken,
	messageId, 
	handler, userData, true);
}

bool MessagesManager::getMessageHistorySync(char * accessToken,
	int messageId, 
	void(* handler)(JsonSuccessBase, Error, void* )
	, void* userData)
{
	return getMessageHistoryHelper(accessToken,
	messageId, 
	handler, userData, false);
}

static bool getMessagesProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
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

static bool getMessagesHelper(char * accessToken,
	int numBefore, int numAfter, OneOf<string,integer> anchor, std::list<std::string> narrow, bool clientGravatar, bool applyMarkdown, bool useFirstUnreadAnchor, 
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
	

	itemAtq = stringify(&anchor, "OneOf&lt;string,integer&gt;");
	queryParams.insert(pair<string, string>("anchor", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("anchor");
	}


	itemAtq = stringify(&numBefore, "int");
	queryParams.insert(pair<string, string>("num_before", itemAtq));


	itemAtq = stringify(&numAfter, "int");
	queryParams.insert(pair<string, string>("num_after", itemAtq));

	for (std::list
	<std::string>::iterator queryIter = narrow.begin(); queryIter != narrow.end(); ++queryIter) {
		string itemAt = stringify(&(*queryIter), "std::string");
		if( itemAt.empty()){
			continue;
		}
		queryParams.insert(pair<string, string>("narrow", itemAt));
	}
	

	itemAtq = stringify(&clientGravatar, "bool");
	queryParams.insert(pair<string, string>("client_gravatar", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("client_gravatar");
	}


	itemAtq = stringify(&applyMarkdown, "bool");
	queryParams.insert(pair<string, string>("apply_markdown", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("apply_markdown");
	}


	itemAtq = stringify(&useFirstUnreadAnchor, "bool");
	queryParams.insert(pair<string, string>("use_first_unread_anchor", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("use_first_unread_anchor");
	}

	string mBody = "";
	JsonNode* node;
	JsonArray* json_array;

	string url("/messages");
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
		NetClient::easycurl(MessagesManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = getMessagesProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (MessagesManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), getMessagesProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __MessagesManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool MessagesManager::getMessagesAsync(char * accessToken,
	int numBefore, int numAfter, OneOf<string,integer> anchor, std::list<std::string> narrow, bool clientGravatar, bool applyMarkdown, bool useFirstUnreadAnchor, 
	void(* handler)(JsonSuccessBase, Error, void* )
	, void* userData)
{
	return getMessagesHelper(accessToken,
	numBefore, numAfter, anchor, narrow, clientGravatar, applyMarkdown, useFirstUnreadAnchor, 
	handler, userData, true);
}

bool MessagesManager::getMessagesSync(char * accessToken,
	int numBefore, int numAfter, OneOf<string,integer> anchor, std::list<std::string> narrow, bool clientGravatar, bool applyMarkdown, bool useFirstUnreadAnchor, 
	void(* handler)(JsonSuccessBase, Error, void* )
	, void* userData)
{
	return getMessagesHelper(accessToken,
	numBefore, numAfter, anchor, narrow, clientGravatar, applyMarkdown, useFirstUnreadAnchor, 
	handler, userData, false);
}

static bool getRawMessageProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
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

static bool getRawMessageHelper(char * accessToken,
	int messageId, 
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

	string url("/messages/{message_id}");
	int pos;

	string s_messageId("{");
	s_messageId.append("message_id");
	s_messageId.append("}");
	pos = url.find(s_messageId);
	url.erase(pos, s_messageId.length());
	url.insert(pos, stringify(&messageId, "int"));

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
		NetClient::easycurl(MessagesManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = getRawMessageProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (MessagesManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), getRawMessageProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __MessagesManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool MessagesManager::getRawMessageAsync(char * accessToken,
	int messageId, 
	void(* handler)(JsonSuccessBase, Error, void* )
	, void* userData)
{
	return getRawMessageHelper(accessToken,
	messageId, 
	handler, userData, true);
}

bool MessagesManager::getRawMessageSync(char * accessToken,
	int messageId, 
	void(* handler)(JsonSuccessBase, Error, void* )
	, void* userData)
{
	return getRawMessageHelper(accessToken,
	messageId, 
	handler, userData, false);
}

static bool markAllAsReadProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
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

static bool markAllAsReadHelper(char * accessToken,
	
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

	string url("/mark_all_as_read");
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
		NetClient::easycurl(MessagesManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = markAllAsReadProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (MessagesManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), markAllAsReadProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __MessagesManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool MessagesManager::markAllAsReadAsync(char * accessToken,
	
	void(* handler)(JsonSuccess, Error, void* )
	, void* userData)
{
	return markAllAsReadHelper(accessToken,
	
	handler, userData, true);
}

bool MessagesManager::markAllAsReadSync(char * accessToken,
	
	void(* handler)(JsonSuccess, Error, void* )
	, void* userData)
{
	return markAllAsReadHelper(accessToken,
	
	handler, userData, false);
}

static bool markStreamAsReadProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
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

static bool markStreamAsReadHelper(char * accessToken,
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
	

	itemAtq = stringify(&streamId, "int");
	queryParams.insert(pair<string, string>("stream_id", itemAtq));

	string mBody = "";
	JsonNode* node;
	JsonArray* json_array;

	string url("/mark_stream_as_read");
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
		NetClient::easycurl(MessagesManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = markStreamAsReadProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (MessagesManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), markStreamAsReadProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __MessagesManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool MessagesManager::markStreamAsReadAsync(char * accessToken,
	int streamId, 
	void(* handler)(JsonSuccess, Error, void* )
	, void* userData)
{
	return markStreamAsReadHelper(accessToken,
	streamId, 
	handler, userData, true);
}

bool MessagesManager::markStreamAsReadSync(char * accessToken,
	int streamId, 
	void(* handler)(JsonSuccess, Error, void* )
	, void* userData)
{
	return markStreamAsReadHelper(accessToken,
	streamId, 
	handler, userData, false);
}

static bool markTopicAsReadProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
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

static bool markTopicAsReadHelper(char * accessToken,
	int streamId, std::string topicName, 
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
	

	itemAtq = stringify(&streamId, "int");
	queryParams.insert(pair<string, string>("stream_id", itemAtq));


	itemAtq = stringify(&topicName, "std::string");
	queryParams.insert(pair<string, string>("topic_name", itemAtq));

	string mBody = "";
	JsonNode* node;
	JsonArray* json_array;

	string url("/mark_topic_as_read");
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
		NetClient::easycurl(MessagesManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = markTopicAsReadProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (MessagesManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), markTopicAsReadProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __MessagesManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool MessagesManager::markTopicAsReadAsync(char * accessToken,
	int streamId, std::string topicName, 
	void(* handler)(JsonSuccess, Error, void* )
	, void* userData)
{
	return markTopicAsReadHelper(accessToken,
	streamId, topicName, 
	handler, userData, true);
}

bool MessagesManager::markTopicAsReadSync(char * accessToken,
	int streamId, std::string topicName, 
	void(* handler)(JsonSuccess, Error, void* )
	, void* userData)
{
	return markTopicAsReadHelper(accessToken,
	streamId, topicName, 
	handler, userData, false);
}

static bool removeReactionProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
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

static bool removeReactionHelper(char * accessToken,
	int messageId, std::string emojiName, std::string emojiCode, std::string reactionType, 
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

	string url("/messages/{message_id}/reactions");
	int pos;

	string s_messageId("{");
	s_messageId.append("message_id");
	s_messageId.append("}");
	pos = url.find(s_messageId);
	url.erase(pos, s_messageId.length());
	url.insert(pos, stringify(&messageId, "int"));

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
		NetClient::easycurl(MessagesManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = removeReactionProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (MessagesManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), removeReactionProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __MessagesManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool MessagesManager::removeReactionAsync(char * accessToken,
	int messageId, std::string emojiName, std::string emojiCode, std::string reactionType, 
	void(* handler)(JsonSuccess, Error, void* )
	, void* userData)
{
	return removeReactionHelper(accessToken,
	messageId, emojiName, emojiCode, reactionType, 
	handler, userData, true);
}

bool MessagesManager::removeReactionSync(char * accessToken,
	int messageId, std::string emojiName, std::string emojiCode, std::string reactionType, 
	void(* handler)(JsonSuccess, Error, void* )
	, void* userData)
{
	return removeReactionHelper(accessToken,
	messageId, emojiName, emojiCode, reactionType, 
	handler, userData, false);
}

static bool renderMessageProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
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

static bool renderMessageHelper(char * accessToken,
	std::string content, 
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
	

	itemAtq = stringify(&content, "std::string");
	queryParams.insert(pair<string, string>("content", itemAtq));

	string mBody = "";
	JsonNode* node;
	JsonArray* json_array;

	string url("/messages/render");
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
		NetClient::easycurl(MessagesManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = renderMessageProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (MessagesManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), renderMessageProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __MessagesManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool MessagesManager::renderMessageAsync(char * accessToken,
	std::string content, 
	void(* handler)(JsonSuccessBase, Error, void* )
	, void* userData)
{
	return renderMessageHelper(accessToken,
	content, 
	handler, userData, true);
}

bool MessagesManager::renderMessageSync(char * accessToken,
	std::string content, 
	void(* handler)(JsonSuccessBase, Error, void* )
	, void* userData)
{
	return renderMessageHelper(accessToken,
	content, 
	handler, userData, false);
}

static bool sendMessageProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
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

static bool sendMessageHelper(char * accessToken,
	std::string type, std::list<int> to, std::string content, std::string topic, std::string queueId, std::string localId, 
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
	

	itemAtq = stringify(&type, "std::string");
	queryParams.insert(pair<string, string>("type", itemAtq));

	for (std::list
	<int>::iterator queryIter = to.begin(); queryIter != to.end(); ++queryIter) {
		string itemAt = stringify(&(*queryIter), "int");
		queryParams.insert(pair<string, string>("to", itemAt));
	}
	

	itemAtq = stringify(&content, "std::string");
	queryParams.insert(pair<string, string>("content", itemAtq));


	itemAtq = stringify(&topic, "std::string");
	queryParams.insert(pair<string, string>("topic", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("topic");
	}


	itemAtq = stringify(&queueId, "std::string");
	queryParams.insert(pair<string, string>("queue_id", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("queue_id");
	}


	itemAtq = stringify(&localId, "std::string");
	queryParams.insert(pair<string, string>("local_id", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("local_id");
	}

	string mBody = "";
	JsonNode* node;
	JsonArray* json_array;

	string url("/messages");
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
		NetClient::easycurl(MessagesManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = sendMessageProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (MessagesManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), sendMessageProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __MessagesManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool MessagesManager::sendMessageAsync(char * accessToken,
	std::string type, std::list<int> to, std::string content, std::string topic, std::string queueId, std::string localId, 
	void(* handler)(JsonSuccessBase, Error, void* )
	, void* userData)
{
	return sendMessageHelper(accessToken,
	type, to, content, topic, queueId, localId, 
	handler, userData, true);
}

bool MessagesManager::sendMessageSync(char * accessToken,
	std::string type, std::list<int> to, std::string content, std::string topic, std::string queueId, std::string localId, 
	void(* handler)(JsonSuccessBase, Error, void* )
	, void* userData)
{
	return sendMessageHelper(accessToken,
	type, to, content, topic, queueId, localId, 
	handler, userData, false);
}

static bool updateMessageProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
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

static bool updateMessageHelper(char * accessToken,
	int messageId, std::string topic, std::string propagateMode, bool sendNotificationToOldThread, bool sendNotificationToNewThread, std::string content, int streamId, 
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
	

	itemAtq = stringify(&topic, "std::string");
	queryParams.insert(pair<string, string>("topic", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("topic");
	}


	itemAtq = stringify(&propagateMode, "std::string");
	queryParams.insert(pair<string, string>("propagate_mode", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("propagate_mode");
	}


	itemAtq = stringify(&sendNotificationToOldThread, "bool");
	queryParams.insert(pair<string, string>("send_notification_to_old_thread", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("send_notification_to_old_thread");
	}


	itemAtq = stringify(&sendNotificationToNewThread, "bool");
	queryParams.insert(pair<string, string>("send_notification_to_new_thread", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("send_notification_to_new_thread");
	}


	itemAtq = stringify(&content, "std::string");
	queryParams.insert(pair<string, string>("content", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("content");
	}


	itemAtq = stringify(&streamId, "int");
	queryParams.insert(pair<string, string>("stream_id", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("stream_id");
	}

	string mBody = "";
	JsonNode* node;
	JsonArray* json_array;

	string url("/messages/{message_id}");
	int pos;

	string s_messageId("{");
	s_messageId.append("message_id");
	s_messageId.append("}");
	pos = url.find(s_messageId);
	url.erase(pos, s_messageId.length());
	url.insert(pos, stringify(&messageId, "int"));

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
		NetClient::easycurl(MessagesManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = updateMessageProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (MessagesManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), updateMessageProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __MessagesManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool MessagesManager::updateMessageAsync(char * accessToken,
	int messageId, std::string topic, std::string propagateMode, bool sendNotificationToOldThread, bool sendNotificationToNewThread, std::string content, int streamId, 
	void(* handler)(JsonSuccess, Error, void* )
	, void* userData)
{
	return updateMessageHelper(accessToken,
	messageId, topic, propagateMode, sendNotificationToOldThread, sendNotificationToNewThread, content, streamId, 
	handler, userData, true);
}

bool MessagesManager::updateMessageSync(char * accessToken,
	int messageId, std::string topic, std::string propagateMode, bool sendNotificationToOldThread, bool sendNotificationToNewThread, std::string content, int streamId, 
	void(* handler)(JsonSuccess, Error, void* )
	, void* userData)
{
	return updateMessageHelper(accessToken,
	messageId, topic, propagateMode, sendNotificationToOldThread, sendNotificationToNewThread, content, streamId, 
	handler, userData, false);
}

static bool updateMessageFlagsProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
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

static bool updateMessageFlagsHelper(char * accessToken,
	std::list<int> messages, std::string op, std::string flag, 
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
	<int>::iterator queryIter = messages.begin(); queryIter != messages.end(); ++queryIter) {
		string itemAt = stringify(&(*queryIter), "int");
		queryParams.insert(pair<string, string>("messages", itemAt));
	}
	

	itemAtq = stringify(&op, "std::string");
	queryParams.insert(pair<string, string>("op", itemAtq));


	itemAtq = stringify(&flag, "std::string");
	queryParams.insert(pair<string, string>("flag", itemAtq));

	string mBody = "";
	JsonNode* node;
	JsonArray* json_array;

	string url("/messages/flags");
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
		NetClient::easycurl(MessagesManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = updateMessageFlagsProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (MessagesManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), updateMessageFlagsProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __MessagesManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool MessagesManager::updateMessageFlagsAsync(char * accessToken,
	std::list<int> messages, std::string op, std::string flag, 
	void(* handler)(JsonSuccessBase, Error, void* )
	, void* userData)
{
	return updateMessageFlagsHelper(accessToken,
	messages, op, flag, 
	handler, userData, true);
}

bool MessagesManager::updateMessageFlagsSync(char * accessToken,
	std::list<int> messages, std::string op, std::string flag, 
	void(* handler)(JsonSuccessBase, Error, void* )
	, void* userData)
{
	return updateMessageFlagsHelper(accessToken,
	messages, op, flag, 
	handler, userData, false);
}

static bool uploadFileProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
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

static bool uploadFileHelper(char * accessToken,
	std::string filename, 
	void(* handler)(JsonSuccessBase, Error, void* )
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

	string url("/user_uploads");
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
		NetClient::easycurl(MessagesManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = uploadFileProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (MessagesManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), uploadFileProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __MessagesManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool MessagesManager::uploadFileAsync(char * accessToken,
	std::string filename, 
	void(* handler)(JsonSuccessBase, Error, void* )
	, void* userData)
{
	return uploadFileHelper(accessToken,
	filename, 
	handler, userData, true);
}

bool MessagesManager::uploadFileSync(char * accessToken,
	std::string filename, 
	void(* handler)(JsonSuccessBase, Error, void* )
	, void* userData)
{
	return uploadFileHelper(accessToken,
	filename, 
	handler, userData, false);
}

