# PSOpenAPITools.PSOpenAPITools/Api.DraftsApi

All URIs are relative to *https://example.zulipchat.com/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**New-Drafts**](DraftsApi.md#New-Drafts) | **POST** /drafts | Create drafts
[**Invoke-DeleteDraft**](DraftsApi.md#Invoke-DeleteDraft) | **DELETE** /drafts/{draft_id} | Delete a draft
[**Edit-Draft**](DraftsApi.md#Edit-Draft) | **PATCH** /drafts/{draft_id} | Edit a draft
[**Get-Drafts**](DraftsApi.md#Get-Drafts) | **GET** /drafts | Get drafts


<a name="New-Drafts"></a>
# **New-Drafts**
> JsonSuccess New-Drafts<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Drafts] <PSCustomObject[]><br>

Create drafts

Create one or more drafts on the server. These drafts will be automatically synchronized to other clients via `drafts` events.  `POST {{ api_url }}/v1/drafts` 

### Example
```powershell
$Draft = Initialize-Draft -Id 0 -Type "" -To 0 -Topic "MyTopic" -Content "MyContent" -Timestamp 1595479019 # Draft[] | A JSON-encoded list of containing new draft objects.  (optional)

# Create drafts
try {
    $Result = New-Drafts -Drafts $Drafts
} catch {
    Write-Host ("Exception occured when calling New-Drafts: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **Drafts** | [**Draft[]**](Draft.md)| A JSON-encoded list of containing new draft objects.  | [optional] 

### Return type

[**JsonSuccess**](JsonSuccess.md) (PSCustomObject)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="Invoke-DeleteDraft"></a>
# **Invoke-DeleteDraft**
> JsonSuccess Invoke-DeleteDraft<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-DraftId] <Int32><br>

Delete a draft

Delete a single draft from the server. The deletion will be automatically synchronized to other clients via a `drafts` event.  `DELETE {{ api_url }}/v1/drafts/{draft_id}` 

### Example
```powershell
$DraftId = 1 # Int32 | The ID of the draft you want to delete. 

# Delete a draft
try {
    $Result = Invoke-DeleteDraft -DraftId $DraftId
} catch {
    Write-Host ("Exception occured when calling Invoke-DeleteDraft: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **DraftId** | **Int32**| The ID of the draft you want to delete.  | 

### Return type

[**JsonSuccess**](JsonSuccess.md) (PSCustomObject)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="Edit-Draft"></a>
# **Edit-Draft**
> JsonSuccess Edit-Draft<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-DraftId] <Int32><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Draft] <PSCustomObject><br>

Edit a draft

Edit a draft on the server. The edit will be automatically synchronized to other clients via `drafts` events.  `PATCH {{ api_url }}/v1/drafts/{draft_id}` 

### Example
```powershell
$DraftId = 2 # Int32 | The ID of the draft to be edited. 
$Draft = Initialize-Draft -Id 0 -Type "" -To 0 -Topic "MyTopic" -Content "MyContent" -Timestamp 1595479019 # Draft | A JSON-encoded object containing a replacement draft object for this ID. 

# Edit a draft
try {
    $Result = Edit-Draft -DraftId $DraftId -Draft $Draft
} catch {
    Write-Host ("Exception occured when calling Edit-Draft: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **DraftId** | **Int32**| The ID of the draft to be edited.  | 
 **Draft** | [**Draft**](Draft.md)| A JSON-encoded object containing a replacement draft object for this ID.  | 

### Return type

[**JsonSuccess**](JsonSuccess.md) (PSCustomObject)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="Get-Drafts"></a>
# **Get-Drafts**
> JsonSuccess Get-Drafts<br>

Get drafts

Fetch all drafts for the current user.  `GET {{ api_url }}/v1/drafts` 

### Example
```powershell

# Get drafts
try {
    $Result = Get-Drafts
} catch {
    Write-Host ("Exception occured when calling Get-Drafts: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**JsonSuccess**](JsonSuccess.md) (PSCustomObject)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

