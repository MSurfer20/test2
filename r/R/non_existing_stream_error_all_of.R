# Zulip REST API
#
# Powerful open source group chat 
#
# The version of the OpenAPI document: 1.0.0
# 
# Generated by: https://openapi-generator.tech

#' @docType class
#' @title NonExistingStreamErrorAllOf
#'
#' @description NonExistingStreamErrorAllOf Class
#'
#' @format An \code{R6Class} generator object
#'
#' @field result  \link{AnyType} [optional]
#'
#' @field msg  \link{AnyType} [optional]
#'
#' @field code  \link{AnyType} [optional]
#'
#' @field stream  character [optional]
#'
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
NonExistingStreamErrorAllOf <- R6::R6Class(
  'NonExistingStreamErrorAllOf',
  public = list(
    `result` = NULL,
    `msg` = NULL,
    `code` = NULL,
    `stream` = NULL,
    initialize = function(
        `result`=NULL, `msg`=NULL, `code`=NULL, `stream`=NULL, ...
    ) {
      local.optional.var <- list(...)
      if (!is.null(`result`)) {
        stopifnot(R6::is.R6(`result`))
        self$`result` <- `result`
      }
      if (!is.null(`msg`)) {
        stopifnot(R6::is.R6(`msg`))
        self$`msg` <- `msg`
      }
      if (!is.null(`code`)) {
        stopifnot(R6::is.R6(`code`))
        self$`code` <- `code`
      }
      if (!is.null(`stream`)) {
        stopifnot(is.character(`stream`), length(`stream`) == 1)
        self$`stream` <- `stream`
      }
    },
    toJSON = function() {
      NonExistingStreamErrorAllOfObject <- list()
      if (!is.null(self$`result`)) {
        NonExistingStreamErrorAllOfObject[['result']] <-
          self$`result`$toJSON()
      }
      if (!is.null(self$`msg`)) {
        NonExistingStreamErrorAllOfObject[['msg']] <-
          self$`msg`$toJSON()
      }
      if (!is.null(self$`code`)) {
        NonExistingStreamErrorAllOfObject[['code']] <-
          self$`code`$toJSON()
      }
      if (!is.null(self$`stream`)) {
        NonExistingStreamErrorAllOfObject[['stream']] <-
          self$`stream`
      }

      NonExistingStreamErrorAllOfObject
    },
    fromJSON = function(NonExistingStreamErrorAllOfJson) {
      NonExistingStreamErrorAllOfObject <- jsonlite::fromJSON(NonExistingStreamErrorAllOfJson)
      if (!is.null(NonExistingStreamErrorAllOfObject$`result`)) {
        resultObject <- AnyType$new()
        resultObject$fromJSON(jsonlite::toJSON(NonExistingStreamErrorAllOfObject$result, auto_unbox = TRUE, digits = NA))
        self$`result` <- resultObject
      }
      if (!is.null(NonExistingStreamErrorAllOfObject$`msg`)) {
        msgObject <- AnyType$new()
        msgObject$fromJSON(jsonlite::toJSON(NonExistingStreamErrorAllOfObject$msg, auto_unbox = TRUE, digits = NA))
        self$`msg` <- msgObject
      }
      if (!is.null(NonExistingStreamErrorAllOfObject$`code`)) {
        codeObject <- AnyType$new()
        codeObject$fromJSON(jsonlite::toJSON(NonExistingStreamErrorAllOfObject$code, auto_unbox = TRUE, digits = NA))
        self$`code` <- codeObject
      }
      if (!is.null(NonExistingStreamErrorAllOfObject$`stream`)) {
        self$`stream` <- NonExistingStreamErrorAllOfObject$`stream`
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
        )},
        if (!is.null(self$`stream`)) {
        sprintf(
        '"stream":
          "%s"
                ',
        self$`stream`
        )}
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      paste('{', jsoncontent, '}', sep = "")
    },
    fromJSONString = function(NonExistingStreamErrorAllOfJson) {
      NonExistingStreamErrorAllOfObject <- jsonlite::fromJSON(NonExistingStreamErrorAllOfJson)
      self$`result` <- AnyType$new()$fromJSON(jsonlite::toJSON(NonExistingStreamErrorAllOfObject$result, auto_unbox = TRUE, digits = NA))
      self$`msg` <- AnyType$new()$fromJSON(jsonlite::toJSON(NonExistingStreamErrorAllOfObject$msg, auto_unbox = TRUE, digits = NA))
      self$`code` <- AnyType$new()$fromJSON(jsonlite::toJSON(NonExistingStreamErrorAllOfObject$code, auto_unbox = TRUE, digits = NA))
      self$`stream` <- NonExistingStreamErrorAllOfObject$`stream`
      self
    }
  )
)
