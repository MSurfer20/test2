

# EmojiReactionBaseAllOfUser

Whether the user is a mirror dummy. Dictionary with data on the user who added the reaction, including the user ID as the `id` field.  **Note**: In the [events API](/api/get-events), this `user` dictionary confusing had the user ID in a field called `user_id` instead.  We recommend ignoring fields other than the user ID.  **Deprecated** and to be removed in a future release once core clients have migrated to use the `user_id` field. 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Integer** | ID of the user.  |  [optional]
**email** | **String** | Email of the user.  |  [optional]
**fullName** | **String** | Full name of the user.  |  [optional]
**isMirrorDummy** | **Boolean** | Whether the user is a mirror dummy.  |  [optional]



