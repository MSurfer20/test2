# Draft
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **Int32** | The unique ID of the draft. It will only used whenever the drafts are fetched. This field should not be specified when the draft is being created or edited.  | [optional] 
**Type** | **String** | The type of the draft. Either unaddressed (empty string), &quot;&quot;stream&quot;&quot;, or &quot;&quot;private&quot;&quot; (for PMs and private group messages).  | 
**To** | **Int32[]** | An array of the tentative target audience IDs. For &quot;&quot;stream&quot;&quot; messages, this should contain exactly 1 ID, the ID of the target stream. For private messages, this should be an array of target user IDs. For unaddressed drafts, this is ignored, and clients should send an empty array.  | 
**Topic** | **String** | For stream message drafts, the tentative topic name. For private or unaddressed messages, this will be ignored and should ideally be the empty string. Should not contain null bytes.  | 
**Content** | **String** | The body of the draft. Should not contain null bytes.  | 
**Timestamp** | **Decimal** | A Unix timestamp (seconds only) representing when the draft was last edited. When creating a draft, this key need not be present and it will be filled in automatically by the server.  | [optional] 

## Examples

- Prepare the resource
```powershell
$Draft = Initialize-PSOpenAPIToolsDraft  -Id null `
 -Type null `
 -To null `
 -Topic null `
 -Content null `
 -Timestamp 1595479019
```

- Convert the resource to JSON
```powershell
$Draft | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

