# openapi::RealmPlayground

Object containing details about a realm playground. 

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **integer** | The unique ID for the realm playground.  | [optional] 
**name** | **character** | The user-visible display name of the playground.  Clients should display this in UI for picking which playground to open a code block in, to differentiate between multiple configured playground options for a given pygments language.  **Changes**: New in Zulip 4.0 (feature level 49).  | [optional] 
**pygments_language** | **character** | The name of the Pygments language lexer for that programming language.  | [optional] 
**url_prefix** | **character** | The url prefix for the playground.  | [optional] 


