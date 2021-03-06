# Zulip REST API
#
# Powerful open source group chat 
#
# The version of the OpenAPI document: 1.0.0
# 
# Generated by: https://openapi-generator.tech

#' @docType class
#' @title Drafts operations
#' @description openapi.Drafts
#' @format An \code{R6Class} generator object
#' @field apiClient Handles the client-server communication.
#'
#' @section Methods:
#' \describe{
#' \strong{ CreateDrafts } \emph{ Create drafts }
#' Create one or more drafts on the server. These drafts will be automatically synchronized to other clients via &#x60;drafts&#x60; events.  &#x60;POST {{ api_url }}/v1/drafts&#x60; 
#'
#' \itemize{
#' \item \emph{ @param } drafts list( \link{Draft} )
#' \item \emph{ @returnType } \link{JsonSuccess} \cr
#'
#'
#' \item status code : 200 | Success.
#'
#' \item return type : JsonSuccess 
#' \item response headers :
#'
#' \tabular{ll}{
#' }
#' \item status code : 400 | Bad request.
#'
#' \item return type : CodedError 
#' \item response headers :
#'
#' \tabular{ll}{
#' }
#' }
#'
#' \strong{ DeleteDraft } \emph{ Delete a draft }
#' Delete a single draft from the server. The deletion will be automatically synchronized to other clients via a &#x60;drafts&#x60; event.  &#x60;DELETE {{ api_url }}/v1/drafts/{draft_id}&#x60; 
#'
#' \itemize{
#' \item \emph{ @param } draft.id integer
#' \item \emph{ @returnType } \link{JsonSuccess} \cr
#'
#'
#' \item status code : 200 | Success.
#'
#' \item return type : JsonSuccess 
#' \item response headers :
#'
#' \tabular{ll}{
#' }
#' \item status code : 404 | Not Found.
#'
#' \item return type : JsonError 
#' \item response headers :
#'
#' \tabular{ll}{
#' }
#' }
#'
#' \strong{ EditDraft } \emph{ Edit a draft }
#' Edit a draft on the server. The edit will be automatically synchronized to other clients via &#x60;drafts&#x60; events.  &#x60;PATCH {{ api_url }}/v1/drafts/{draft_id}&#x60; 
#'
#' \itemize{
#' \item \emph{ @param } draft.id integer
#' \item \emph{ @param } draft \link{Draft}
#' \item \emph{ @returnType } \link{JsonSuccess} \cr
#'
#'
#' \item status code : 200 | Success.
#'
#' \item return type : JsonSuccess 
#' \item response headers :
#'
#' \tabular{ll}{
#' }
#' \item status code : 404 | Not Found.
#'
#' \item return type : JsonError 
#' \item response headers :
#'
#' \tabular{ll}{
#' }
#' }
#'
#' \strong{ GetDrafts } \emph{ Get drafts }
#' Fetch all drafts for the current user.  &#x60;GET {{ api_url }}/v1/drafts&#x60; 
#'
#' \itemize{
#' \item \emph{ @returnType } \link{JsonSuccess} \cr
#'
#'
#' \item status code : 200 | Success.
#'
#' \item return type : JsonSuccess 
#' \item response headers :
#'
#' \tabular{ll}{
#' }
#' }
#'
#' }
#'
#'
#' @examples
#' \dontrun{
#' ####################  CreateDrafts  ####################
#'
#' library(openapi)
#' var.drafts <- [Draft$new()] # array[Draft] | A JSON-encoded list of containing new draft objects. 
#'
#' #Create drafts
#' api.instance <- DraftsApi$new()
#'
#' result <- api.instance$CreateDrafts(drafts=var.drafts)
#'
#'
#' ####################  DeleteDraft  ####################
#'
#' library(openapi)
#' var.draft.id <- 1 # integer | The ID of the draft you want to delete. 
#'
#' #Delete a draft
#' api.instance <- DraftsApi$new()
#'
#' result <- api.instance$DeleteDraft(var.draft.id)
#'
#'
#' ####################  EditDraft  ####################
#'
#' library(openapi)
#' var.draft.id <- 2 # integer | The ID of the draft to be edited. 
#' var.draft <- Draft$new() # Draft | A JSON-encoded object containing a replacement draft object for this ID. 
#'
#' #Edit a draft
#' api.instance <- DraftsApi$new()
#'
#' result <- api.instance$EditDraft(var.draft.id, var.draft)
#'
#'
#' ####################  GetDrafts  ####################
#'
#' library(openapi)
#'
#' #Get drafts
#' api.instance <- DraftsApi$new()
#'
#' result <- api.instance$GetDrafts()
#'
#'
#' }
#' @importFrom R6 R6Class
#' @importFrom base64enc base64encode
#' @export
DraftsApi <- R6::R6Class(
  'DraftsApi',
  public = list(
    apiClient = NULL,
    initialize = function(apiClient){
      if (!missing(apiClient)) {
        self$apiClient <- apiClient
      }
      else {
        self$apiClient <- ApiClient$new()
      }
    },
    CreateDrafts = function(drafts=NULL, ...){
      apiResponse <- self$CreateDraftsWithHttpInfo(drafts, ...)
      resp <- apiResponse$response
      if (httr::status_code(resp) >= 200 && httr::status_code(resp) <= 299) {
        apiResponse$content
      } else if (httr::status_code(resp) >= 300 && httr::status_code(resp) <= 399) {
        apiResponse
      } else if (httr::status_code(resp) >= 400 && httr::status_code(resp) <= 499) {
        apiResponse
      } else if (httr::status_code(resp) >= 500 && httr::status_code(resp) <= 599) {
        apiResponse
      }
    },

    CreateDraftsWithHttpInfo = function(drafts=NULL, ...){
      args <- list(...)
      queryParams <- list()
      headerParams <- c()

      queryParams['drafts'] <- drafts

      body <- NULL
      urlPath <- "/drafts"

      resp <- self$apiClient$CallApi(url = paste0(self$apiClient$basePath, urlPath),
                                 method = "POST",
                                 queryParams = queryParams,
                                 headerParams = headerParams,
                                 body = body,
                                 ...)

      if (httr::status_code(resp) >= 200 && httr::status_code(resp) <= 299) {
        deserializedRespObj <- tryCatch(
          self$apiClient$deserialize(resp, "JsonSuccess", loadNamespace("openapi")),
          error = function(e){
             stop("Failed to deserialize response")
          }
        )
        ApiResponse$new(deserializedRespObj, resp)
      } else if (httr::status_code(resp) >= 300 && httr::status_code(resp) <= 399) {
        ApiResponse$new(paste("Server returned " , httr::status_code(resp) , " response status code."), resp)
      } else if (httr::status_code(resp) >= 400 && httr::status_code(resp) <= 499) {
        ApiResponse$new("API client error", resp)
      } else if (httr::status_code(resp) >= 500 && httr::status_code(resp) <= 599) {
        ApiResponse$new("API server error", resp)
      }
    },
    DeleteDraft = function(draft.id, ...){
      apiResponse <- self$DeleteDraftWithHttpInfo(draft.id, ...)
      resp <- apiResponse$response
      if (httr::status_code(resp) >= 200 && httr::status_code(resp) <= 299) {
        apiResponse$content
      } else if (httr::status_code(resp) >= 300 && httr::status_code(resp) <= 399) {
        apiResponse
      } else if (httr::status_code(resp) >= 400 && httr::status_code(resp) <= 499) {
        apiResponse
      } else if (httr::status_code(resp) >= 500 && httr::status_code(resp) <= 599) {
        apiResponse
      }
    },

    DeleteDraftWithHttpInfo = function(draft.id, ...){
      args <- list(...)
      queryParams <- list()
      headerParams <- c()

      if (missing(`draft.id`)) {
        stop("Missing required parameter `draft.id`.")
      }

      body <- NULL
      urlPath <- "/drafts/{draft_id}"
      if (!missing(`draft.id`)) {
        urlPath <- gsub(paste0("\\{", "draft_id", "\\}"), URLencode(as.character(`draft.id`), reserved = TRUE), urlPath)
      }


      resp <- self$apiClient$CallApi(url = paste0(self$apiClient$basePath, urlPath),
                                 method = "DELETE",
                                 queryParams = queryParams,
                                 headerParams = headerParams,
                                 body = body,
                                 ...)

      if (httr::status_code(resp) >= 200 && httr::status_code(resp) <= 299) {
        deserializedRespObj <- tryCatch(
          self$apiClient$deserialize(resp, "JsonSuccess", loadNamespace("openapi")),
          error = function(e){
             stop("Failed to deserialize response")
          }
        )
        ApiResponse$new(deserializedRespObj, resp)
      } else if (httr::status_code(resp) >= 300 && httr::status_code(resp) <= 399) {
        ApiResponse$new(paste("Server returned " , httr::status_code(resp) , " response status code."), resp)
      } else if (httr::status_code(resp) >= 400 && httr::status_code(resp) <= 499) {
        ApiResponse$new("API client error", resp)
      } else if (httr::status_code(resp) >= 500 && httr::status_code(resp) <= 599) {
        ApiResponse$new("API server error", resp)
      }
    },
    EditDraft = function(draft.id, draft, ...){
      apiResponse <- self$EditDraftWithHttpInfo(draft.id, draft, ...)
      resp <- apiResponse$response
      if (httr::status_code(resp) >= 200 && httr::status_code(resp) <= 299) {
        apiResponse$content
      } else if (httr::status_code(resp) >= 300 && httr::status_code(resp) <= 399) {
        apiResponse
      } else if (httr::status_code(resp) >= 400 && httr::status_code(resp) <= 499) {
        apiResponse
      } else if (httr::status_code(resp) >= 500 && httr::status_code(resp) <= 599) {
        apiResponse
      }
    },

    EditDraftWithHttpInfo = function(draft.id, draft, ...){
      args <- list(...)
      queryParams <- list()
      headerParams <- c()

      if (missing(`draft.id`)) {
        stop("Missing required parameter `draft.id`.")
      }

      if (missing(`draft`)) {
        stop("Missing required parameter `draft`.")
      }

      queryParams['draft'] <- draft

      body <- NULL
      urlPath <- "/drafts/{draft_id}"
      if (!missing(`draft.id`)) {
        urlPath <- gsub(paste0("\\{", "draft_id", "\\}"), URLencode(as.character(`draft.id`), reserved = TRUE), urlPath)
      }


      resp <- self$apiClient$CallApi(url = paste0(self$apiClient$basePath, urlPath),
                                 method = "PATCH",
                                 queryParams = queryParams,
                                 headerParams = headerParams,
                                 body = body,
                                 ...)

      if (httr::status_code(resp) >= 200 && httr::status_code(resp) <= 299) {
        deserializedRespObj <- tryCatch(
          self$apiClient$deserialize(resp, "JsonSuccess", loadNamespace("openapi")),
          error = function(e){
             stop("Failed to deserialize response")
          }
        )
        ApiResponse$new(deserializedRespObj, resp)
      } else if (httr::status_code(resp) >= 300 && httr::status_code(resp) <= 399) {
        ApiResponse$new(paste("Server returned " , httr::status_code(resp) , " response status code."), resp)
      } else if (httr::status_code(resp) >= 400 && httr::status_code(resp) <= 499) {
        ApiResponse$new("API client error", resp)
      } else if (httr::status_code(resp) >= 500 && httr::status_code(resp) <= 599) {
        ApiResponse$new("API server error", resp)
      }
    },
    GetDrafts = function(...){
      apiResponse <- self$GetDraftsWithHttpInfo(...)
      resp <- apiResponse$response
      if (httr::status_code(resp) >= 200 && httr::status_code(resp) <= 299) {
        apiResponse$content
      } else if (httr::status_code(resp) >= 300 && httr::status_code(resp) <= 399) {
        apiResponse
      } else if (httr::status_code(resp) >= 400 && httr::status_code(resp) <= 499) {
        apiResponse
      } else if (httr::status_code(resp) >= 500 && httr::status_code(resp) <= 599) {
        apiResponse
      }
    },

    GetDraftsWithHttpInfo = function(...){
      args <- list(...)
      queryParams <- list()
      headerParams <- c()

      body <- NULL
      urlPath <- "/drafts"

      resp <- self$apiClient$CallApi(url = paste0(self$apiClient$basePath, urlPath),
                                 method = "GET",
                                 queryParams = queryParams,
                                 headerParams = headerParams,
                                 body = body,
                                 ...)

      if (httr::status_code(resp) >= 200 && httr::status_code(resp) <= 299) {
        deserializedRespObj <- tryCatch(
          self$apiClient$deserialize(resp, "JsonSuccess", loadNamespace("openapi")),
          error = function(e){
             stop("Failed to deserialize response")
          }
        )
        ApiResponse$new(deserializedRespObj, resp)
      } else if (httr::status_code(resp) >= 300 && httr::status_code(resp) <= 399) {
        ApiResponse$new(paste("Server returned " , httr::status_code(resp) , " response status code."), resp)
      } else if (httr::status_code(resp) >= 400 && httr::status_code(resp) <= 499) {
        ApiResponse$new("API client error", resp)
      } else if (httr::status_code(resp) >= 500 && httr::status_code(resp) <= 599) {
        ApiResponse$new("API server error", resp)
      }
    }
  )
)
