# Zulip REST API
#
# Powerful open source group chat 
#
# The version of the OpenAPI document: 1.0.0
# 
# Generated by: https://openapi-generator.tech

#' @docType class
#' @title UserGroup
#'
#' @description UserGroup Class
#'
#' @format An \code{R6Class} generator object
#'
#' @field name  character [optional]
#'
#' @field description  character [optional]
#'
#' @field members  list( integer ) [optional]
#'
#' @field id  integer [optional]
#'
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
UserGroup <- R6::R6Class(
  'UserGroup',
  public = list(
    `name` = NULL,
    `description` = NULL,
    `members` = NULL,
    `id` = NULL,
    initialize = function(
        `name`=NULL, `description`=NULL, `members`=NULL, `id`=NULL, ...
    ) {
      local.optional.var <- list(...)
      if (!is.null(`name`)) {
        stopifnot(is.character(`name`), length(`name`) == 1)
        self$`name` <- `name`
      }
      if (!is.null(`description`)) {
        stopifnot(is.character(`description`), length(`description`) == 1)
        self$`description` <- `description`
      }
      if (!is.null(`members`)) {
        stopifnot(is.vector(`members`), length(`members`) != 0)
        sapply(`members`, function(x) stopifnot(is.character(x)))
        self$`members` <- `members`
      }
      if (!is.null(`id`)) {
        stopifnot(is.numeric(`id`), length(`id`) == 1)
        self$`id` <- `id`
      }
    },
    toJSON = function() {
      UserGroupObject <- list()
      if (!is.null(self$`name`)) {
        UserGroupObject[['name']] <-
          self$`name`
      }
      if (!is.null(self$`description`)) {
        UserGroupObject[['description']] <-
          self$`description`
      }
      if (!is.null(self$`members`)) {
        UserGroupObject[['members']] <-
          self$`members`
      }
      if (!is.null(self$`id`)) {
        UserGroupObject[['id']] <-
          self$`id`
      }

      UserGroupObject
    },
    fromJSON = function(UserGroupJson) {
      UserGroupObject <- jsonlite::fromJSON(UserGroupJson)
      if (!is.null(UserGroupObject$`name`)) {
        self$`name` <- UserGroupObject$`name`
      }
      if (!is.null(UserGroupObject$`description`)) {
        self$`description` <- UserGroupObject$`description`
      }
      if (!is.null(UserGroupObject$`members`)) {
        self$`members` <- ApiClient$new()$deserializeObj(UserGroupObject$`members`, "array[integer]", loadNamespace("openapi"))
      }
      if (!is.null(UserGroupObject$`id`)) {
        self$`id` <- UserGroupObject$`id`
      }
      self
    },
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`name`)) {
        sprintf(
        '"name":
          "%s"
                ',
        self$`name`
        )},
        if (!is.null(self$`description`)) {
        sprintf(
        '"description":
          "%s"
                ',
        self$`description`
        )},
        if (!is.null(self$`members`)) {
        sprintf(
        '"members":
           [%s]
        ',
        paste(unlist(lapply(self$`members`, function(x) paste0('"', x, '"'))), collapse=",")
        )},
        if (!is.null(self$`id`)) {
        sprintf(
        '"id":
          %d
                ',
        self$`id`
        )}
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      paste('{', jsoncontent, '}', sep = "")
    },
    fromJSONString = function(UserGroupJson) {
      UserGroupObject <- jsonlite::fromJSON(UserGroupJson)
      self$`name` <- UserGroupObject$`name`
      self$`description` <- UserGroupObject$`description`
      self$`members` <- ApiClient$new()$deserializeObj(UserGroupObject$`members`, "array[integer]", loadNamespace("openapi"))
      self$`id` <- UserGroupObject$`id`
      self
    }
  )
)
