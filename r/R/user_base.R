# Zulip REST API
#
# Powerful open source group chat 
#
# The version of the OpenAPI document: 1.0.0
# 
# Generated by: https://openapi-generator.tech

#' @docType class
#' @title UserBase
#'
#' @description UserBase Class
#'
#' @format An \code{R6Class} generator object
#'
#' @field email  character [optional]
#'
#' @field is_bot  character [optional]
#'
#' @field avatar_url  character [optional]
#'
#' @field avatar_version  integer [optional]
#'
#' @field full_name  character [optional]
#'
#' @field is_admin  character [optional]
#'
#' @field is_owner  character [optional]
#'
#' @field is_billing_admin  character [optional]
#'
#' @field role  integer [optional]
#'
#' @field bot_type  integer [optional]
#'
#' @field user_id  integer [optional]
#'
#' @field bot_owner_id  integer [optional]
#'
#' @field is_active  character [optional]
#'
#' @field is_guest  character [optional]
#'
#' @field timezone  character [optional]
#'
#' @field date_joined  character [optional]
#'
#' @field delivery_email  character [optional]
#'
#' @field profile_data  named list( object ) [optional]
#'
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
UserBase <- R6::R6Class(
  'UserBase',
  public = list(
    `email` = NULL,
    `is_bot` = NULL,
    `avatar_url` = NULL,
    `avatar_version` = NULL,
    `full_name` = NULL,
    `is_admin` = NULL,
    `is_owner` = NULL,
    `is_billing_admin` = NULL,
    `role` = NULL,
    `bot_type` = NULL,
    `user_id` = NULL,
    `bot_owner_id` = NULL,
    `is_active` = NULL,
    `is_guest` = NULL,
    `timezone` = NULL,
    `date_joined` = NULL,
    `delivery_email` = NULL,
    `profile_data` = NULL,
    initialize = function(
        `email`=NULL, `is_bot`=NULL, `avatar_url`=NULL, `avatar_version`=NULL, `full_name`=NULL, `is_admin`=NULL, `is_owner`=NULL, `is_billing_admin`=NULL, `role`=NULL, `bot_type`=NULL, `user_id`=NULL, `bot_owner_id`=NULL, `is_active`=NULL, `is_guest`=NULL, `timezone`=NULL, `date_joined`=NULL, `delivery_email`=NULL, `profile_data`=NULL, ...
    ) {
      local.optional.var <- list(...)
      if (!is.null(`email`)) {
        stopifnot(is.character(`email`), length(`email`) == 1)
        self$`email` <- `email`
      }
      if (!is.null(`is_bot`)) {
        stopifnot(is.logical(`is_bot`), length(`is_bot`) == 1)
        self$`is_bot` <- `is_bot`
      }
      if (!is.null(`avatar_url`)) {
        stopifnot(is.character(`avatar_url`), length(`avatar_url`) == 1)
        self$`avatar_url` <- `avatar_url`
      }
      if (!is.null(`avatar_version`)) {
        stopifnot(is.numeric(`avatar_version`), length(`avatar_version`) == 1)
        self$`avatar_version` <- `avatar_version`
      }
      if (!is.null(`full_name`)) {
        stopifnot(is.character(`full_name`), length(`full_name`) == 1)
        self$`full_name` <- `full_name`
      }
      if (!is.null(`is_admin`)) {
        stopifnot(is.logical(`is_admin`), length(`is_admin`) == 1)
        self$`is_admin` <- `is_admin`
      }
      if (!is.null(`is_owner`)) {
        stopifnot(is.logical(`is_owner`), length(`is_owner`) == 1)
        self$`is_owner` <- `is_owner`
      }
      if (!is.null(`is_billing_admin`)) {
        stopifnot(is.logical(`is_billing_admin`), length(`is_billing_admin`) == 1)
        self$`is_billing_admin` <- `is_billing_admin`
      }
      if (!is.null(`role`)) {
        stopifnot(is.numeric(`role`), length(`role`) == 1)
        self$`role` <- `role`
      }
      if (!is.null(`bot_type`)) {
        stopifnot(is.numeric(`bot_type`), length(`bot_type`) == 1)
        self$`bot_type` <- `bot_type`
      }
      if (!is.null(`user_id`)) {
        stopifnot(is.numeric(`user_id`), length(`user_id`) == 1)
        self$`user_id` <- `user_id`
      }
      if (!is.null(`bot_owner_id`)) {
        stopifnot(is.numeric(`bot_owner_id`), length(`bot_owner_id`) == 1)
        self$`bot_owner_id` <- `bot_owner_id`
      }
      if (!is.null(`is_active`)) {
        stopifnot(is.logical(`is_active`), length(`is_active`) == 1)
        self$`is_active` <- `is_active`
      }
      if (!is.null(`is_guest`)) {
        stopifnot(is.logical(`is_guest`), length(`is_guest`) == 1)
        self$`is_guest` <- `is_guest`
      }
      if (!is.null(`timezone`)) {
        stopifnot(is.character(`timezone`), length(`timezone`) == 1)
        self$`timezone` <- `timezone`
      }
      if (!is.null(`date_joined`)) {
        stopifnot(is.character(`date_joined`), length(`date_joined`) == 1)
        self$`date_joined` <- `date_joined`
      }
      if (!is.null(`delivery_email`)) {
        stopifnot(is.character(`delivery_email`), length(`delivery_email`) == 1)
        self$`delivery_email` <- `delivery_email`
      }
      if (!is.null(`profile_data`)) {
        stopifnot(is.vector(`profile_data`), length(`profile_data`) != 0)
        sapply(`profile_data`, function(x) stopifnot(is.character(x)))
        self$`profile_data` <- `profile_data`
      }
    },
    toJSON = function() {
      UserBaseObject <- list()
      if (!is.null(self$`email`)) {
        UserBaseObject[['email']] <-
          self$`email`
      }
      if (!is.null(self$`is_bot`)) {
        UserBaseObject[['is_bot']] <-
          self$`is_bot`
      }
      if (!is.null(self$`avatar_url`)) {
        UserBaseObject[['avatar_url']] <-
          self$`avatar_url`
      }
      if (!is.null(self$`avatar_version`)) {
        UserBaseObject[['avatar_version']] <-
          self$`avatar_version`
      }
      if (!is.null(self$`full_name`)) {
        UserBaseObject[['full_name']] <-
          self$`full_name`
      }
      if (!is.null(self$`is_admin`)) {
        UserBaseObject[['is_admin']] <-
          self$`is_admin`
      }
      if (!is.null(self$`is_owner`)) {
        UserBaseObject[['is_owner']] <-
          self$`is_owner`
      }
      if (!is.null(self$`is_billing_admin`)) {
        UserBaseObject[['is_billing_admin']] <-
          self$`is_billing_admin`
      }
      if (!is.null(self$`role`)) {
        UserBaseObject[['role']] <-
          self$`role`
      }
      if (!is.null(self$`bot_type`)) {
        UserBaseObject[['bot_type']] <-
          self$`bot_type`
      }
      if (!is.null(self$`user_id`)) {
        UserBaseObject[['user_id']] <-
          self$`user_id`
      }
      if (!is.null(self$`bot_owner_id`)) {
        UserBaseObject[['bot_owner_id']] <-
          self$`bot_owner_id`
      }
      if (!is.null(self$`is_active`)) {
        UserBaseObject[['is_active']] <-
          self$`is_active`
      }
      if (!is.null(self$`is_guest`)) {
        UserBaseObject[['is_guest']] <-
          self$`is_guest`
      }
      if (!is.null(self$`timezone`)) {
        UserBaseObject[['timezone']] <-
          self$`timezone`
      }
      if (!is.null(self$`date_joined`)) {
        UserBaseObject[['date_joined']] <-
          self$`date_joined`
      }
      if (!is.null(self$`delivery_email`)) {
        UserBaseObject[['delivery_email']] <-
          self$`delivery_email`
      }
      if (!is.null(self$`profile_data`)) {
        UserBaseObject[['profile_data']] <-
          self$`profile_data`
      }

      UserBaseObject
    },
    fromJSON = function(UserBaseJson) {
      UserBaseObject <- jsonlite::fromJSON(UserBaseJson)
      if (!is.null(UserBaseObject$`email`)) {
        self$`email` <- UserBaseObject$`email`
      }
      if (!is.null(UserBaseObject$`is_bot`)) {
        self$`is_bot` <- UserBaseObject$`is_bot`
      }
      if (!is.null(UserBaseObject$`avatar_url`)) {
        self$`avatar_url` <- UserBaseObject$`avatar_url`
      }
      if (!is.null(UserBaseObject$`avatar_version`)) {
        self$`avatar_version` <- UserBaseObject$`avatar_version`
      }
      if (!is.null(UserBaseObject$`full_name`)) {
        self$`full_name` <- UserBaseObject$`full_name`
      }
      if (!is.null(UserBaseObject$`is_admin`)) {
        self$`is_admin` <- UserBaseObject$`is_admin`
      }
      if (!is.null(UserBaseObject$`is_owner`)) {
        self$`is_owner` <- UserBaseObject$`is_owner`
      }
      if (!is.null(UserBaseObject$`is_billing_admin`)) {
        self$`is_billing_admin` <- UserBaseObject$`is_billing_admin`
      }
      if (!is.null(UserBaseObject$`role`)) {
        self$`role` <- UserBaseObject$`role`
      }
      if (!is.null(UserBaseObject$`bot_type`)) {
        self$`bot_type` <- UserBaseObject$`bot_type`
      }
      if (!is.null(UserBaseObject$`user_id`)) {
        self$`user_id` <- UserBaseObject$`user_id`
      }
      if (!is.null(UserBaseObject$`bot_owner_id`)) {
        self$`bot_owner_id` <- UserBaseObject$`bot_owner_id`
      }
      if (!is.null(UserBaseObject$`is_active`)) {
        self$`is_active` <- UserBaseObject$`is_active`
      }
      if (!is.null(UserBaseObject$`is_guest`)) {
        self$`is_guest` <- UserBaseObject$`is_guest`
      }
      if (!is.null(UserBaseObject$`timezone`)) {
        self$`timezone` <- UserBaseObject$`timezone`
      }
      if (!is.null(UserBaseObject$`date_joined`)) {
        self$`date_joined` <- UserBaseObject$`date_joined`
      }
      if (!is.null(UserBaseObject$`delivery_email`)) {
        self$`delivery_email` <- UserBaseObject$`delivery_email`
      }
      if (!is.null(UserBaseObject$`profile_data`)) {
        self$`profile_data` <- ApiClient$new()$deserializeObj(UserBaseObject$`profile_data`, "map(object)", loadNamespace("openapi"))
      }
      self
    },
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`email`)) {
        sprintf(
        '"email":
          "%s"
                ',
        self$`email`
        )},
        if (!is.null(self$`is_bot`)) {
        sprintf(
        '"is_bot":
          %s
                ',
        tolower(self$`is_bot`)
        )},
        if (!is.null(self$`avatar_url`)) {
        sprintf(
        '"avatar_url":
          "%s"
                ',
        self$`avatar_url`
        )},
        if (!is.null(self$`avatar_version`)) {
        sprintf(
        '"avatar_version":
          %d
                ',
        self$`avatar_version`
        )},
        if (!is.null(self$`full_name`)) {
        sprintf(
        '"full_name":
          "%s"
                ',
        self$`full_name`
        )},
        if (!is.null(self$`is_admin`)) {
        sprintf(
        '"is_admin":
          %s
                ',
        tolower(self$`is_admin`)
        )},
        if (!is.null(self$`is_owner`)) {
        sprintf(
        '"is_owner":
          %s
                ',
        tolower(self$`is_owner`)
        )},
        if (!is.null(self$`is_billing_admin`)) {
        sprintf(
        '"is_billing_admin":
          %s
                ',
        tolower(self$`is_billing_admin`)
        )},
        if (!is.null(self$`role`)) {
        sprintf(
        '"role":
          %d
                ',
        self$`role`
        )},
        if (!is.null(self$`bot_type`)) {
        sprintf(
        '"bot_type":
          %d
                ',
        self$`bot_type`
        )},
        if (!is.null(self$`user_id`)) {
        sprintf(
        '"user_id":
          %d
                ',
        self$`user_id`
        )},
        if (!is.null(self$`bot_owner_id`)) {
        sprintf(
        '"bot_owner_id":
          %d
                ',
        self$`bot_owner_id`
        )},
        if (!is.null(self$`is_active`)) {
        sprintf(
        '"is_active":
          %s
                ',
        tolower(self$`is_active`)
        )},
        if (!is.null(self$`is_guest`)) {
        sprintf(
        '"is_guest":
          %s
                ',
        tolower(self$`is_guest`)
        )},
        if (!is.null(self$`timezone`)) {
        sprintf(
        '"timezone":
          "%s"
                ',
        self$`timezone`
        )},
        if (!is.null(self$`date_joined`)) {
        sprintf(
        '"date_joined":
          "%s"
                ',
        self$`date_joined`
        )},
        if (!is.null(self$`delivery_email`)) {
        sprintf(
        '"delivery_email":
          "%s"
                ',
        self$`delivery_email`
        )},
        if (!is.null(self$`profile_data`)) {
        sprintf(
        '"profile_data":
          "%s"
        ',
        jsonlite::toJSON(lapply(self$`profile_data`, function(x){ x }), auto_unbox = TRUE, digits=NA)
        )}
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      paste('{', jsoncontent, '}', sep = "")
    },
    fromJSONString = function(UserBaseJson) {
      UserBaseObject <- jsonlite::fromJSON(UserBaseJson)
      self$`email` <- UserBaseObject$`email`
      self$`is_bot` <- UserBaseObject$`is_bot`
      self$`avatar_url` <- UserBaseObject$`avatar_url`
      self$`avatar_version` <- UserBaseObject$`avatar_version`
      self$`full_name` <- UserBaseObject$`full_name`
      self$`is_admin` <- UserBaseObject$`is_admin`
      self$`is_owner` <- UserBaseObject$`is_owner`
      self$`is_billing_admin` <- UserBaseObject$`is_billing_admin`
      self$`role` <- UserBaseObject$`role`
      self$`bot_type` <- UserBaseObject$`bot_type`
      self$`user_id` <- UserBaseObject$`user_id`
      self$`bot_owner_id` <- UserBaseObject$`bot_owner_id`
      self$`is_active` <- UserBaseObject$`is_active`
      self$`is_guest` <- UserBaseObject$`is_guest`
      self$`timezone` <- UserBaseObject$`timezone`
      self$`date_joined` <- UserBaseObject$`date_joined`
      self$`delivery_email` <- UserBaseObject$`delivery_email`
      self$`profile_data` <- ApiClient$new()$deserializeObj(UserBaseObject$`profile_data`, "map(object)", loadNamespace("openapi"))
      self
    }
  )
)
