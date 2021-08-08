# Org.OpenAPITools.Model.EmojiReactionBaseUser
Dictionary with data on the user who added the reaction, including the user ID as the `id` field.  **Note**: In the [events API](/api/get-events), this `user` dictionary confusing had the user ID in a field called `user_id` instead.  We recommend ignoring fields other than the user ID.  **Deprecated** and to be removed in a future release once core clients have migrated to use the `user_id` field. 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **int** | ID of the user.  | [optional] 
**Email** | **string** | Email of the user.  | [optional] 
**FullName** | **string** | Full name of the user.  | [optional] 
**IsMirrorDummy** | **bool** | Whether the user is a mirror dummy.  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

