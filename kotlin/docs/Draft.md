
# Draft

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | [**inline**](#TypeEnum) | The type of the draft. Either unaddressed (empty string), \&quot;stream\&quot;, or \&quot;private\&quot; (for PMs and private group messages).  | 
**to** | **kotlin.collections.List&lt;kotlin.Int&gt;** | An array of the tentative target audience IDs. For \&quot;stream\&quot; messages, this should contain exactly 1 ID, the ID of the target stream. For private messages, this should be an array of target user IDs. For unaddressed drafts, this is ignored, and clients should send an empty array.  | 
**topic** | **kotlin.String** | For stream message drafts, the tentative topic name. For private or unaddressed messages, this will be ignored and should ideally be the empty string. Should not contain null bytes.  | 
**content** | **kotlin.String** | The body of the draft. Should not contain null bytes.  | 
**id** | **kotlin.Int** | The unique ID of the draft. It will only used whenever the drafts are fetched. This field should not be specified when the draft is being created or edited.  |  [optional]
**timestamp** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | A Unix timestamp (seconds only) representing when the draft was last edited. When creating a draft, this key need not be present and it will be filled in automatically by the server.  |  [optional]


<a name="TypeEnum"></a>
## Enum: type
Name | Value
---- | -----
type | , stream, private



