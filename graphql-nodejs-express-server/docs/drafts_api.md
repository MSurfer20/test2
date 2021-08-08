# drafts_api

All URIs are relative to *https://example.zulipchat.com/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**CreateDrafts**](drafts_api.md#CreateDrafts) | **POST** /drafts | Create drafts
[**DeleteDraft**](drafts_api.md#DeleteDraft) | **DELETE** /drafts/{draft_id} | Delete a draft
[**EditDraft**](drafts_api.md#EditDraft) | **PATCH** /drafts/{draft_id} | Edit a draft
[**GetDrafts**](drafts_api.md#GetDrafts) | **GET** /drafts | Get drafts


<a name="CreateDrafts"></a>
# **CreateDrafts**
> JsonSuccess CreateDrafts(drafts)

Create drafts

Create one or more drafts on the server. These drafts will be automatically synchronized to other clients via &#x60;drafts&#x60; events.  &#x60;POST {{ api_url }}/v1/drafts&#x60; 
<a name="DeleteDraft"></a>
# **DeleteDraft**
> JsonSuccess DeleteDraft(draftId)

Delete a draft

Delete a single draft from the server. The deletion will be automatically synchronized to other clients via a &#x60;drafts&#x60; event.  &#x60;DELETE {{ api_url }}/v1/drafts/{draft_id}&#x60; 
<a name="EditDraft"></a>
# **EditDraft**
> JsonSuccess EditDraft(draftId, draft)

Edit a draft

Edit a draft on the server. The edit will be automatically synchronized to other clients via &#x60;drafts&#x60; events.  &#x60;PATCH {{ api_url }}/v1/drafts/{draft_id}&#x60; 
<a name="GetDrafts"></a>
# **GetDrafts**
> JsonSuccess GetDrafts()

Get drafts

Fetch all drafts for the current user.  &#x60;GET {{ api_url }}/v1/drafts&#x60; 
