# Org.OpenAPITools.Model.RealmPlayground
Object containing details about a realm playground. 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **int** | The unique ID for the realm playground.  | [optional] 
**Name** | **string** | The user-visible display name of the playground.  Clients should display this in UI for picking which playground to open a code block in, to differentiate between multiple configured playground options for a given pygments language.  **Changes**: New in Zulip 4.0 (feature level 49).  | [optional] 
**PygmentsLanguage** | **string** | The name of the Pygments language lexer for that programming language.  | [optional] 
**UrlPrefix** | **string** | The url prefix for the playground.  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

