# AttachmentsMessages
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**DateSent** | **Int32** | Time when the message was sent as a UNIX timestamp multiplied by 1000 (matching the format of getTime() in JavaScript).  **Changes**: Changed in Zulip 2.2 (feature level 22).  This field was previously strangely called &#x60;name&#x60; and was a floating point number.  | [optional] 
**Id** | **Int32** | The unique message ID.  Messages should always be displayed sorted by ID.  | [optional] 

## Examples

- Prepare the resource
```powershell
$AttachmentsMessages = Initialize-PSOpenAPIToolsAttachmentsMessages  -DateSent null `
 -Id null
```

- Convert the resource to JSON
```powershell
$AttachmentsMessages | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

