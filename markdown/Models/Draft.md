# Draft
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**Integer**](integer.md) | The unique ID of the draft. It will only used whenever the drafts are fetched. This field should not be specified when the draft is being created or edited.  | [optional] [default to null]
**type** | [**String**](string.md) | The type of the draft. Either unaddressed (empty string), \&quot;stream\&quot;, or \&quot;private\&quot; (for PMs and private group messages).  | [default to null]
**to** | [**List**](integer.md) | An array of the tentative target audience IDs. For \&quot;stream\&quot; messages, this should contain exactly 1 ID, the ID of the target stream. For private messages, this should be an array of target user IDs. For unaddressed drafts, this is ignored, and clients should send an empty array.  | [default to null]
**topic** | [**String**](string.md) | For stream message drafts, the tentative topic name. For private or unaddressed messages, this will be ignored and should ideally be the empty string. Should not contain null bytes.  | [default to null]
**content** | [**String**](string.md) | The body of the draft. Should not contain null bytes.  | [default to null]
**timestamp** | [**BigDecimal**](number.md) | A Unix timestamp (seconds only) representing when the draft was last edited. When creating a draft, this key need not be present and it will be filled in automatically by the server.  | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

