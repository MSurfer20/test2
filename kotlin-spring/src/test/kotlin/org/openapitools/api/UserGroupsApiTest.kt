package org.openapitools.api

import org.openapitools.model.JsonError
import org.openapitools.model.JsonSuccess
import org.openapitools.model.JsonSuccessBase
import org.junit.jupiter.api.Test

import org.springframework.http.ResponseEntity

class UserGroupsApiTest {

    
    private val api: UserGroupsApiController = UserGroupsApiController()

    
    /**
    * Create a user group
    *
    * Create a new [user group](/help/user-groups).  &#x60;POST {{ api_url }}/v1/user_groups/create&#x60; 
    *
    * @throws ApiException
    *          if the Api call fails
    */
    @Test
    fun createUserGroupTest() {
        val name:kotlin.String? = null
        val description:kotlin.String? = null
        val members:kotlin.collections.List<kotlin.Int>? = null
        val response: ResponseEntity<JsonSuccess> = api.createUserGroup(name!!, description!!, members!!)

        // TODO: test validations
    }
    
    /**
    * Get user groups
    *
    * {!api-members-only.md!}  Fetches all of the user groups in the organization.  &#x60;GET {{ api_url }}/v1/user_groups&#x60; 
    *
    * @throws ApiException
    *          if the Api call fails
    */
    @Test
    fun getUserGroupsTest() {
        val response: ResponseEntity<JsonSuccessBase> = api.getUserGroups()

        // TODO: test validations
    }
    
    /**
    * Delete a user group
    *
    * Delete a [user group](/help/user-groups).  &#x60;DELETE {{ api_url }}/v1/user_groups/{user_group_id}&#x60; 
    *
    * @throws ApiException
    *          if the Api call fails
    */
    @Test
    fun removeUserGroupTest() {
        val userGroupId:kotlin.Int? = null
        val response: ResponseEntity<JsonSuccess> = api.removeUserGroup(userGroupId!!)

        // TODO: test validations
    }
    
    /**
    * Update a user group
    *
    * Update the name or description of a [user group](/help/user-groups).  &#x60;PATCH {{ api_url }}/v1/user_groups/{user_group_id}&#x60; 
    *
    * @throws ApiException
    *          if the Api call fails
    */
    @Test
    fun updateUserGroupTest() {
        val userGroupId:kotlin.Int? = null
        val name:kotlin.String? = null
        val description:kotlin.String? = null
        val response: ResponseEntity<JsonSuccess> = api.updateUserGroup(userGroupId!!, name!!, description!!)

        // TODO: test validations
    }
    
    /**
    * Update user group members
    *
    * Update the members of a [user group](/help/user-groups).  &#x60;POST {{ api_url }}/v1/user_groups/{user_group_id}/members&#x60; 
    *
    * @throws ApiException
    *          if the Api call fails
    */
    @Test
    fun updateUserGroupMembersTest() {
        val userGroupId:kotlin.Int? = null
        val delete:kotlin.collections.List<kotlin.Int>? = null
        val add:kotlin.collections.List<kotlin.Int>? = null
        val response: ResponseEntity<JsonSuccess> = api.updateUserGroupMembers(userGroupId!!, delete!!, add!!)

        // TODO: test validations
    }
    
}
