# Zulip REST API
#
# Powerful open source group chat 
#
# The version of the OpenAPI document: 1.0.0
# 
# Generated by: https://openapi-generator.tech

#' @docType class
#' @title EmojiReactionBaseAllOf
#'
#' @description EmojiReactionBaseAllOf Class
#'
#' @format An \code{R6Class} generator object
#'
#' @field user_id  integer [optional]
#'
#' @field user  \link{EmojiReactionBaseAllOfUser} [optional]
#'
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
EmojiReactionBaseAllOf <- R6::R6Class(
  'EmojiReactionBaseAllOf',
  public = list(
    `user_id` = NULL,
    `user` = NULL,
    initialize = function(
        `user_id`=NULL, `user`=NULL, ...
    ) {
      local.optional.var <- list(...)
      if (!is.null(`user_id`)) {
        stopifnot(is.numeric(`user_id`), length(`user_id`) == 1)
        self$`user_id` <- `user_id`
      }
      if (!is.null(`user`)) {
        stopifnot(R6::is.R6(`user`))
        self$`user` <- `user`
      }
    },
    toJSON = function() {
      EmojiReactionBaseAllOfObject <- list()
      if (!is.null(self$`user_id`)) {
        EmojiReactionBaseAllOfObject[['user_id']] <-
          self$`user_id`
      }
      if (!is.null(self$`user`)) {
        EmojiReactionBaseAllOfObject[['user']] <-
          self$`user`$toJSON()
      }

      EmojiReactionBaseAllOfObject
    },
    fromJSON = function(EmojiReactionBaseAllOfJson) {
      EmojiReactionBaseAllOfObject <- jsonlite::fromJSON(EmojiReactionBaseAllOfJson)
      if (!is.null(EmojiReactionBaseAllOfObject$`user_id`)) {
        self$`user_id` <- EmojiReactionBaseAllOfObject$`user_id`
      }
      if (!is.null(EmojiReactionBaseAllOfObject$`user`)) {
        userObject <- EmojiReactionBaseAllOfUser$new()
        userObject$fromJSON(jsonlite::toJSON(EmojiReactionBaseAllOfObject$user, auto_unbox = TRUE, digits = NA))
        self$`user` <- userObject
      }
      self
    },
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`user_id`)) {
        sprintf(
        '"user_id":
          %d
                ',
        self$`user_id`
        )},
        if (!is.null(self$`user`)) {
        sprintf(
        '"user":
        %s
        ',
        jsonlite::toJSON(self$`user`$toJSON(), auto_unbox=TRUE, digits = NA)
        )}
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      paste('{', jsoncontent, '}', sep = "")
    },
    fromJSONString = function(EmojiReactionBaseAllOfJson) {
      EmojiReactionBaseAllOfObject <- jsonlite::fromJSON(EmojiReactionBaseAllOfJson)
      self$`user_id` <- EmojiReactionBaseAllOfObject$`user_id`
      self$`user` <- EmojiReactionBaseAllOfUser$new()$fromJSON(jsonlite::toJSON(EmojiReactionBaseAllOfObject$user, auto_unbox = TRUE, digits = NA))
      self
    }
  )
)
