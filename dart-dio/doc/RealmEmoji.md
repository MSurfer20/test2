# openapi.model.RealmEmoji

## Load the model package
```dart
import 'package:openapi/api.dart';
```

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | The ID for this emoji, same as the object's key.  | [optional] 
**name** | **String** | The user-friendly name for this emoji. Users in the organization can use this emoji by writing this name between colons (`:name  :`).  | [optional] 
**sourceUrl** | **String** | The path relative to the organization's URL where the emoji's image can be found.  | [optional] 
**deactivated** | **bool** | Whether the emoji has been deactivated or not.  | [optional] 
**authorId** | **int** | The user ID of the user who uploaded the custom emoji. Will be null if the uploader is unknown.  **Changes**: New in Zulip 3.0 (feature level 7).  Previously was accessible via and `author` object with an `id` field.  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


