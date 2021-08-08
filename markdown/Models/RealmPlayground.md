# RealmPlayground
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**Integer**](integer.md) | The unique ID for the realm playground.  | [optional] [default to null]
**name** | [**String**](string.md) | The user-visible display name of the playground.  Clients should display this in UI for picking which playground to open a code block in, to differentiate between multiple configured playground options for a given pygments language.  **Changes**: New in Zulip 4.0 (feature level 49).  | [optional] [default to null]
**pygments\_language** | [**String**](string.md) | The name of the Pygments language lexer for that programming language.  | [optional] [default to null]
**url\_prefix** | [**String**](string.md) | The url prefix for the playground.  | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

