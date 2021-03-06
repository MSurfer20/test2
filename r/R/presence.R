# Zulip REST API
#
# Powerful open source group chat 
#
# The version of the OpenAPI document: 1.0.0
# 
# Generated by: https://openapi-generator.tech

#' @docType class
#' @title Presence
#'
#' @description Presence Class
#'
#' @format An \code{R6Class} generator object
#'
#' @field client  character [optional]
#'
#' @field status  character [optional]
#'
#' @field timestamp  integer [optional]
#'
#' @field pushable  character [optional]
#'
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
Presence <- R6::R6Class(
  'Presence',
  public = list(
    `client` = NULL,
    `status` = NULL,
    `timestamp` = NULL,
    `pushable` = NULL,
    initialize = function(
        `client`=NULL, `status`=NULL, `timestamp`=NULL, `pushable`=NULL, ...
    ) {
      local.optional.var <- list(...)
      if (!is.null(`client`)) {
        stopifnot(is.character(`client`), length(`client`) == 1)
        self$`client` <- `client`
      }
      if (!is.null(`status`)) {
        stopifnot(is.character(`status`), length(`status`) == 1)
        self$`status` <- `status`
      }
      if (!is.null(`timestamp`)) {
        stopifnot(is.numeric(`timestamp`), length(`timestamp`) == 1)
        self$`timestamp` <- `timestamp`
      }
      if (!is.null(`pushable`)) {
        stopifnot(is.logical(`pushable`), length(`pushable`) == 1)
        self$`pushable` <- `pushable`
      }
    },
    toJSON = function() {
      PresenceObject <- list()
      if (!is.null(self$`client`)) {
        PresenceObject[['client']] <-
          self$`client`
      }
      if (!is.null(self$`status`)) {
        PresenceObject[['status']] <-
          self$`status`
      }
      if (!is.null(self$`timestamp`)) {
        PresenceObject[['timestamp']] <-
          self$`timestamp`
      }
      if (!is.null(self$`pushable`)) {
        PresenceObject[['pushable']] <-
          self$`pushable`
      }

      PresenceObject
    },
    fromJSON = function(PresenceJson) {
      PresenceObject <- jsonlite::fromJSON(PresenceJson)
      if (!is.null(PresenceObject$`client`)) {
        self$`client` <- PresenceObject$`client`
      }
      if (!is.null(PresenceObject$`status`)) {
        self$`status` <- PresenceObject$`status`
      }
      if (!is.null(PresenceObject$`timestamp`)) {
        self$`timestamp` <- PresenceObject$`timestamp`
      }
      if (!is.null(PresenceObject$`pushable`)) {
        self$`pushable` <- PresenceObject$`pushable`
      }
      self
    },
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`client`)) {
        sprintf(
        '"client":
          "%s"
                ',
        self$`client`
        )},
        if (!is.null(self$`status`)) {
        sprintf(
        '"status":
          "%s"
                ',
        self$`status`
        )},
        if (!is.null(self$`timestamp`)) {
        sprintf(
        '"timestamp":
          %d
                ',
        self$`timestamp`
        )},
        if (!is.null(self$`pushable`)) {
        sprintf(
        '"pushable":
          %s
                ',
        tolower(self$`pushable`)
        )}
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      paste('{', jsoncontent, '}', sep = "")
    },
    fromJSONString = function(PresenceJson) {
      PresenceObject <- jsonlite::fromJSON(PresenceJson)
      self$`client` <- PresenceObject$`client`
      self$`status` <- PresenceObject$`status`
      self$`timestamp` <- PresenceObject$`timestamp`
      self$`pushable` <- PresenceObject$`pushable`
      self
    }
  )
)
