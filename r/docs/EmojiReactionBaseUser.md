# openapi::EmojiReactionBaseUser

Dictionary with data on the user who added the reaction, including the user ID as the `id` field.  **Note**: In the [events API](/api/get-events), this `user` dictionary confusing had the user ID in a field called `user_id` instead.  We recommend ignoring fields other than the user ID.  **Deprecated** and to be removed in a future release once core clients have migrated to use the `user_id` field. 

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **integer** | ID of the user.  | [optional] 
**email** | **character** | Email of the user.  | [optional] 
**full_name** | **character** | Full name of the user.  | [optional] 
**is_mirror_dummy** | **character** | Whether the user is a mirror dummy.  | [optional] 


