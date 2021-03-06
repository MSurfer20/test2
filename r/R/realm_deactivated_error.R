# Zulip REST API
#
# Powerful open source group chat 
#
# The version of the OpenAPI document: 1.0.0
# 
# Generated by: https://openapi-generator.tech

#' @docType class
#' @title RealmDeactivatedError
#'
#' @description RealmDeactivatedError Class
#'
#' @format An \code{R6Class} generator object
#'
#' @field result  \link{AnyType} 
#'
#' @field msg  \link{AnyType} 
#'
#' @field code  \link{AnyType} [optional]
#'
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
RealmDeactivatedError <- R6::R6Class(
  'RealmDeactivatedError',
  public = list(
    `result` = NULL,
    `msg` = NULL,
    `code` = NULL,
    initialize = function(
        `result`, `msg`, `code`=NULL, ...
    ) {
      local.optional.var <- list(...)
      if (!missing(`result`)) {
        stopifnot(R6::is.R6(`result`))
        self$`result` <- `result`
      }
      if (!missing(`msg`)) {
        stopifnot(R6::is.R6(`msg`))
        self$`msg` <- `msg`
      }
      if (!is.null(`code`)) {
        stopifnot(R6::is.R6(`code`))
        self$`code` <- `code`
      }
    },
    toJSON = function() {
      RealmDeactivatedErrorObject <- list()
      if (!is.null(self$`result`)) {
        RealmDeactivatedErrorObject[['result']] <-
          self$`result`$toJSON()
      }
      if (!is.null(self$`msg`)) {
        RealmDeactivatedErrorObject[['msg']] <-
          self$`msg`$toJSON()
      }
      if (!is.null(self$`code`)) {
        RealmDeactivatedErrorObject[['code']] <-
          self$`code`$toJSON()
      }

      RealmDeactivatedErrorObject
    },
    fromJSON = function(RealmDeactivatedErrorJson) {
      RealmDeactivatedErrorObject <- jsonlite::fromJSON(RealmDeactivatedErrorJson)
      if (!is.null(RealmDeactivatedErrorObject$`result`)) {
        resultObject <- AnyType$new()
        resultObject$fromJSON(jsonlite::toJSON(RealmDeactivatedErrorObject$result, auto_unbox = TRUE, digits = NA))
        self$`result` <- resultObject
      }
      if (!is.null(RealmDeactivatedErrorObject$`msg`)) {
        msgObject <- AnyType$new()
        msgObject$fromJSON(jsonlite::toJSON(RealmDeactivatedErrorObject$msg, auto_unbox = TRUE, digits = NA))
        self$`msg` <- msgObject
      }
      if (!is.null(RealmDeactivatedErrorObject$`code`)) {
        codeObject <- AnyType$new()
        codeObject$fromJSON(jsonlite::toJSON(RealmDeactivatedErrorObject$code, auto_unbox = TRUE, digits = NA))
        self$`code` <- codeObject
      }
      self
    },
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`result`)) {
        sprintf(
        '"result":
        %s
        ',
        jsonlite::toJSON(self$`result`$toJSON(), auto_unbox=TRUE, digits = NA)
        )},
        if (!is.null(self$`msg`)) {
        sprintf(
        '"msg":
        %s
        ',
        jsonlite::toJSON(self$`msg`$toJSON(), auto_unbox=TRUE, digits = NA)
        )},
        if (!is.null(self$`code`)) {
        sprintf(
        '"code":
        %s
        ',
        jsonlite::toJSON(self$`code`$toJSON(), auto_unbox=TRUE, digits = NA)
        )}
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      paste('{', jsoncontent, '}', sep = "")
    },
    fromJSONString = function(RealmDeactivatedErrorJson) {
      RealmDeactivatedErrorObject <- jsonlite::fromJSON(RealmDeactivatedErrorJson)
      self$`result` <- AnyType$new()$fromJSON(jsonlite::toJSON(RealmDeactivatedErrorObject$result, auto_unbox = TRUE, digits = NA))
      self$`msg` <- AnyType$new()$fromJSON(jsonlite::toJSON(RealmDeactivatedErrorObject$msg, auto_unbox = TRUE, digits = NA))
      self$`code` <- AnyType$new()$fromJSON(jsonlite::toJSON(RealmDeactivatedErrorObject$code, auto_unbox = TRUE, digits = NA))
      self
    }
  )
)
