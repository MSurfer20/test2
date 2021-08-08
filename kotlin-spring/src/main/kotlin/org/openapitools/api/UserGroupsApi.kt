package org.openapitools.api

import org.openapitools.model.JsonError
import org.openapitools.model.JsonSuccess
import org.openapitools.model.JsonSuccessBase
import org.springframework.http.HttpStatus
import org.springframework.http.MediaType
import org.springframework.http.ResponseEntity

import org.springframework.web.bind.annotation.*
import org.springframework.validation.annotation.Validated
import org.springframework.web.context.request.NativeWebRequest
import org.springframework.beans.factory.annotation.Autowired

import javax.validation.Valid
import javax.validation.constraints.DecimalMax
import javax.validation.constraints.DecimalMin
import javax.validation.constraints.Max
import javax.validation.constraints.Min
import javax.validation.constraints.NotNull
import javax.validation.constraints.Pattern
import javax.validation.constraints.Size

import kotlin.collections.List
import kotlin.collections.Map

@RestController
@Validated
@RequestMapping("\${api.base-path:/api/v1}")
class UserGroupsApiController() {


    @PostMapping(
        value = ["/user_groups/create"],
        produces = ["application/json"]
    )
    fun createUserGroup(@NotNull  @RequestParam(value = "name", required = true) name: kotlin.String
,@NotNull  @RequestParam(value = "description", required = true) description: kotlin.String
,@NotNull  @RequestParam(value = "members", required = true) members: kotlin.collections.List<kotlin.Int>
): ResponseEntity<JsonSuccess> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }


    @GetMapping(
        value = ["/user_groups"],
        produces = ["application/json"]
    )
    fun getUserGroups(): ResponseEntity<JsonSuccessBase> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }


    @DeleteMapping(
        value = ["/user_groups/{user_group_id}"],
        produces = ["application/json"]
    )
    fun removeUserGroup( @PathVariable("user_group_id") userGroupId: kotlin.Int
): ResponseEntity<JsonSuccess> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }


    @PatchMapping(
        value = ["/user_groups/{user_group_id}"],
        produces = ["application/json"]
    )
    fun updateUserGroup( @PathVariable("user_group_id") userGroupId: kotlin.Int
,@NotNull  @RequestParam(value = "name", required = true) name: kotlin.String
,@NotNull  @RequestParam(value = "description", required = true) description: kotlin.String
): ResponseEntity<JsonSuccess> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }


    @PostMapping(
        value = ["/user_groups/{user_group_id}/members"],
        produces = ["application/json"]
    )
    fun updateUserGroupMembers( @PathVariable("user_group_id") userGroupId: kotlin.Int
, @RequestParam(value = "delete", required = false) delete: kotlin.collections.List<kotlin.Int>?
, @RequestParam(value = "add", required = false) add: kotlin.collections.List<kotlin.Int>?
): ResponseEntity<JsonSuccess> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }
}
