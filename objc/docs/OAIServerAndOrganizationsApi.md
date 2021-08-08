# OAIServerAndOrganizationsApi

All URIs are relative to *https://example.zulipchat.com/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addCodePlayground**](OAIServerAndOrganizationsApi.md#addcodeplayground) | **POST** /realm/playgrounds | Add a code playground
[**addLinkifier**](OAIServerAndOrganizationsApi.md#addlinkifier) | **POST** /realm/filters | Add a linkifier
[**createCustomProfileField**](OAIServerAndOrganizationsApi.md#createcustomprofilefield) | **POST** /realm/profile_fields | Create a custom profile field
[**getCustomEmoji**](OAIServerAndOrganizationsApi.md#getcustomemoji) | **GET** /realm/emoji | Get all custom emoji
[**getCustomProfileFields**](OAIServerAndOrganizationsApi.md#getcustomprofilefields) | **GET** /realm/profile_fields | Get all custom profile fields
[**getLinkifiers**](OAIServerAndOrganizationsApi.md#getlinkifiers) | **GET** /realm/linkifiers | Get linkifiers
[**getServerSettings**](OAIServerAndOrganizationsApi.md#getserversettings) | **GET** /server_settings | Get server settings
[**removeCodePlayground**](OAIServerAndOrganizationsApi.md#removecodeplayground) | **DELETE** /realm/playgrounds/{playground_id} | Remove a code playground
[**removeLinkifier**](OAIServerAndOrganizationsApi.md#removelinkifier) | **DELETE** /realm/filters/{filter_id} | Remove a linkifier
[**reorderCustomProfileFields**](OAIServerAndOrganizationsApi.md#reordercustomprofilefields) | **PATCH** /realm/profile_fields | Reorder custom profile fields
[**updateLinkifier**](OAIServerAndOrganizationsApi.md#updatelinkifier) | **PATCH** /realm/filters/{filter_id} | Update a linkifier
[**uploadCustomEmoji**](OAIServerAndOrganizationsApi.md#uploadcustomemoji) | **POST** /realm/emoji/{emoji_name} | Upload custom emoji


# **addCodePlayground**
```objc
-(NSURLSessionTask*) addCodePlaygroundWithName: (NSString*) name
    pygmentsLanguage: (NSString*) pygmentsLanguage
    urlPrefix: (NSString*) urlPrefix
        completionHandler: (void (^)(OAIJsonSuccessBase* output, NSError* error)) handler;
```

Add a code playground

Configure [code playgrounds](/help/code-blocks#code-playgrounds) for the organization.  `POST {{ api_url }}/v1/realm/playgrounds`  **Changes**: New in Zulip 4.0 (feature level 49). A parameter encoding bug was fixed in Zulip 4.0 (feature level 57). 

### Example 
```objc

NSString* name = Python playground; // The user-visible display name of the playground which can be used to pick the target playground, especially when multiple playground options exist for that programming language. 
NSString* pygmentsLanguage = Python; // The name of the Pygments language lexer for that programming language. 
NSString* urlPrefix = https://python.example.com; // The url prefix for the playground. 

OAIServerAndOrganizationsApi*apiInstance = [[OAIServerAndOrganizationsApi alloc] init];

// Add a code playground
[apiInstance addCodePlaygroundWithName:name
              pygmentsLanguage:pygmentsLanguage
              urlPrefix:urlPrefix
          completionHandler: ^(OAIJsonSuccessBase* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIServerAndOrganizationsApi->addCodePlayground: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **NSString***| The user-visible display name of the playground which can be used to pick the target playground, especially when multiple playground options exist for that programming language.  | 
 **pygmentsLanguage** | **NSString***| The name of the Pygments language lexer for that programming language.  | 
 **urlPrefix** | **NSString***| The url prefix for the playground.  | 

### Return type

[**OAIJsonSuccessBase***](OAIJsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **addLinkifier**
```objc
-(NSURLSessionTask*) addLinkifierWithPattern: (NSString*) pattern
    urlFormatString: (NSString*) urlFormatString
        completionHandler: (void (^)(OAIJsonSuccessBase* output, NSError* error)) handler;
```

Add a linkifier

Configure [linkifiers](/help/add-a-custom-linkifier), regular expression patterns that are automatically linkified when they appear in messages and topics.  `POST {{ api_url }}/v1/realm/filters` 

### Example 
```objc

NSString* pattern = #(?P<id>[0-9]+); // The [Python regular expression](https://docs.python.org/3/howto/regex.html) that should trigger the linkifier. 
NSString* urlFormatString = https://github.com/zulip/zulip/issues/%(id)s; // The URL used for the link. If you used named groups for the `pattern`, you can insert their content here with `%(name_of_the_capturing_group)s`. 

OAIServerAndOrganizationsApi*apiInstance = [[OAIServerAndOrganizationsApi alloc] init];

// Add a linkifier
[apiInstance addLinkifierWithPattern:pattern
              urlFormatString:urlFormatString
          completionHandler: ^(OAIJsonSuccessBase* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIServerAndOrganizationsApi->addLinkifier: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pattern** | **NSString***| The [Python regular expression](https://docs.python.org/3/howto/regex.html) that should trigger the linkifier.  | 
 **urlFormatString** | **NSString***| The URL used for the link. If you used named groups for the &#x60;pattern&#x60;, you can insert their content here with &#x60;%(name_of_the_capturing_group)s&#x60;.  | 

### Return type

[**OAIJsonSuccessBase***](OAIJsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **createCustomProfileField**
```objc
-(NSURLSessionTask*) createCustomProfileFieldWithFieldType: (NSNumber*) fieldType
    name: (NSString*) name
    hint: (NSString*) hint
    fieldData: (NSObject*) fieldData
        completionHandler: (void (^)(OAIJsonSuccessBase* output, NSError* error)) handler;
```

Create a custom profile field

[Create a custom profile field](/help/add-custom-profile-fields) in the user's organization.  `POST {{ api_url }}/v1/realm/profile_fields` 

### Example 
```objc

NSNumber* fieldType = 3; // The field type can be any of the supported custom profile field types. See the [custom profile fields documentation](/help/add-custom-profile-fields) more details on what each type means.  * **1**: Short text * **2**: Long text * **3**: List of options * **4**: Date picker * **5**: Link * **6**: Person picker * **7**: External account 
NSString* name = Favorite programming language; // The name of the custom profile field, which will appear both in user-facing settings UI for configuring custom profile fields and in UI displaying a user's profile.  (optional)
NSString* hint = Your favorite programming language.; // The help text to be displayed for the custom profile field in user-facing settings UI for configuring custom profile fields.  (optional)
NSObject* fieldData = [[NSObject alloc] init]; // Field types 3 (List of options) and 7 (External account) support storing additional configuration for the field type in the `field_data` attribute.  For field type 3 (List of options), this attribute is a JSON dictionary defining the choices and the order they will be displayed in the dropdown UI for individual users to select an option.  The interface for field type 7 is not yet stabilized.  (optional)

OAIServerAndOrganizationsApi*apiInstance = [[OAIServerAndOrganizationsApi alloc] init];

// Create a custom profile field
[apiInstance createCustomProfileFieldWithFieldType:fieldType
              name:name
              hint:hint
              fieldData:fieldData
          completionHandler: ^(OAIJsonSuccessBase* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIServerAndOrganizationsApi->createCustomProfileField: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fieldType** | **NSNumber***| The field type can be any of the supported custom profile field types. See the [custom profile fields documentation](/help/add-custom-profile-fields) more details on what each type means.  * **1**: Short text * **2**: Long text * **3**: List of options * **4**: Date picker * **5**: Link * **6**: Person picker * **7**: External account  | 
 **name** | **NSString***| The name of the custom profile field, which will appear both in user-facing settings UI for configuring custom profile fields and in UI displaying a user&#39;s profile.  | [optional] 
 **hint** | **NSString***| The help text to be displayed for the custom profile field in user-facing settings UI for configuring custom profile fields.  | [optional] 
 **fieldData** | [**NSObject***](.md)| Field types 3 (List of options) and 7 (External account) support storing additional configuration for the field type in the &#x60;field_data&#x60; attribute.  For field type 3 (List of options), this attribute is a JSON dictionary defining the choices and the order they will be displayed in the dropdown UI for individual users to select an option.  The interface for field type 7 is not yet stabilized.  | [optional] 

### Return type

[**OAIJsonSuccessBase***](OAIJsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getCustomEmoji**
```objc
-(NSURLSessionTask*) getCustomEmojiWithCompletionHandler: 
        (void (^)(OAIJsonSuccessBase* output, NSError* error)) handler;
```

Get all custom emoji

Get all the custom emoji in the user's organization.  `GET {{ api_url }}/v1/realm/emoji` 

### Example 
```objc


OAIServerAndOrganizationsApi*apiInstance = [[OAIServerAndOrganizationsApi alloc] init];

// Get all custom emoji
[apiInstance getCustomEmojiWithCompletionHandler: 
          ^(OAIJsonSuccessBase* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIServerAndOrganizationsApi->getCustomEmoji: %@", error);
                        }
                    }];
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**OAIJsonSuccessBase***](OAIJsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getCustomProfileFields**
```objc
-(NSURLSessionTask*) getCustomProfileFieldsWithCompletionHandler: 
        (void (^)(OAIJsonSuccessBase* output, NSError* error)) handler;
```

Get all custom profile fields

Get all the [custom profile fields](/help/add-custom-profile-fields) configured for the user's organization.  `GET {{ api_url }}/v1/realm/profile_fields` 

### Example 
```objc


OAIServerAndOrganizationsApi*apiInstance = [[OAIServerAndOrganizationsApi alloc] init];

// Get all custom profile fields
[apiInstance getCustomProfileFieldsWithCompletionHandler: 
          ^(OAIJsonSuccessBase* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIServerAndOrganizationsApi->getCustomProfileFields: %@", error);
                        }
                    }];
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**OAIJsonSuccessBase***](OAIJsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getLinkifiers**
```objc
-(NSURLSessionTask*) getLinkifiersWithCompletionHandler: 
        (void (^)(OAIJsonSuccessBase* output, NSError* error)) handler;
```

Get linkifiers

List all of an organization's configured [linkifiers](/help/add-a-custom-linkifier), regular expression patterns that are automatically linkified when they appear in messages and topics.  `GET {{ api_url }}/v1/realm/linkifiers`  **Changes**: New in Zulip 4.0 (feature level 54). On older versions, a similar `GET /realm/filters` endpoint was available with each entry in a `[pattern, url_format, id]` tuple format. 

### Example 
```objc


OAIServerAndOrganizationsApi*apiInstance = [[OAIServerAndOrganizationsApi alloc] init];

// Get linkifiers
[apiInstance getLinkifiersWithCompletionHandler: 
          ^(OAIJsonSuccessBase* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIServerAndOrganizationsApi->getLinkifiers: %@", error);
                        }
                    }];
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**OAIJsonSuccessBase***](OAIJsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getServerSettings**
```objc
-(NSURLSessionTask*) getServerSettingsWithCompletionHandler: 
        (void (^)(OAIJsonSuccessBase* output, NSError* error)) handler;
```

Get server settings

Fetch global settings for a Zulip server.  `GET {{ api_url }}/v1/server_settings`  **Note:** this endpoint does not require any authentication at all, and you can use it to check:  * If this is a Zulip server, and if so, what version of Zulip it's running. * What a Zulip client (e.g. a mobile app or [zulip-terminal](https://github.com/zulip/zulip-terminal/)) needs to know in order to display a login prompt for the server (e.g. what authentication methods are available). 

### Example 
```objc


OAIServerAndOrganizationsApi*apiInstance = [[OAIServerAndOrganizationsApi alloc] init];

// Get server settings
[apiInstance getServerSettingsWithCompletionHandler: 
          ^(OAIJsonSuccessBase* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIServerAndOrganizationsApi->getServerSettings: %@", error);
                        }
                    }];
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**OAIJsonSuccessBase***](OAIJsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **removeCodePlayground**
```objc
-(NSURLSessionTask*) removeCodePlaygroundWithPlaygroundId: (NSNumber*) playgroundId
        completionHandler: (void (^)(OAIJsonSuccess* output, NSError* error)) handler;
```

Remove a code playground

Remove a [code playground](/help/code-blocks#code-playgrounds) previously configured for an organization.  `DELETE {{ api_url }}/v1/realm/playgrounds/{playground_id}`  **Changes**: New in Zulip 4.0 (feature level 49). 

### Example 
```objc

NSNumber* playgroundId = 1; // The ID of the playground that you want to remove. 

OAIServerAndOrganizationsApi*apiInstance = [[OAIServerAndOrganizationsApi alloc] init];

// Remove a code playground
[apiInstance removeCodePlaygroundWithPlaygroundId:playgroundId
          completionHandler: ^(OAIJsonSuccess* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIServerAndOrganizationsApi->removeCodePlayground: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **playgroundId** | **NSNumber***| The ID of the playground that you want to remove.  | 

### Return type

[**OAIJsonSuccess***](OAIJsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **removeLinkifier**
```objc
-(NSURLSessionTask*) removeLinkifierWithFilterId: (NSNumber*) filterId
        completionHandler: (void (^)(OAIJsonSuccess* output, NSError* error)) handler;
```

Remove a linkifier

Remove [linkifiers](/help/add-a-custom-linkifier), regular expression patterns that are automatically linkified when they appear in messages and topics.  `DELETE {{ api_url }}/v1/realm/filters/{filter_id}` 

### Example 
```objc

NSNumber* filterId = 42; // The ID of the linkifier that you want to remove. 

OAIServerAndOrganizationsApi*apiInstance = [[OAIServerAndOrganizationsApi alloc] init];

// Remove a linkifier
[apiInstance removeLinkifierWithFilterId:filterId
          completionHandler: ^(OAIJsonSuccess* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIServerAndOrganizationsApi->removeLinkifier: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filterId** | **NSNumber***| The ID of the linkifier that you want to remove.  | 

### Return type

[**OAIJsonSuccess***](OAIJsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **reorderCustomProfileFields**
```objc
-(NSURLSessionTask*) reorderCustomProfileFieldsWithOrder: (NSArray<NSNumber*>*) order
        completionHandler: (void (^)(OAIJsonSuccess* output, NSError* error)) handler;
```

Reorder custom profile fields

Reorder the custom profile fields in the user's organization.  `PATCH {{ api_url }}/v1/realm/profile_fields`  Custom profile fields are displayed in Zulip UI widgets in order; this endpoint allows administrative settings UI to change the field ordering.  This endpoint is used to implement the dragging feature described in the [custom profile fields documentation](/help/add-custom-profile-fields). 

### Example 
```objc

NSArray<NSNumber*>* order = @[@56]; // A list of the IDs of all the custom profile fields defined in this organization, in the desired new order. 

OAIServerAndOrganizationsApi*apiInstance = [[OAIServerAndOrganizationsApi alloc] init];

// Reorder custom profile fields
[apiInstance reorderCustomProfileFieldsWithOrder:order
          completionHandler: ^(OAIJsonSuccess* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIServerAndOrganizationsApi->reorderCustomProfileFields: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **order** | [**NSArray&lt;NSNumber*&gt;***](NSNumber*.md)| A list of the IDs of all the custom profile fields defined in this organization, in the desired new order.  | 

### Return type

[**OAIJsonSuccess***](OAIJsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **updateLinkifier**
```objc
-(NSURLSessionTask*) updateLinkifierWithFilterId: (NSNumber*) filterId
    pattern: (NSString*) pattern
    urlFormatString: (NSString*) urlFormatString
        completionHandler: (void (^)(OAIJsonSuccess* output, NSError* error)) handler;
```

Update a linkifier

Update a [linkifier](/help/add-a-custom-linkifier), regular expression patterns that are automatically linkified when they appear in messages and topics.  `PATCH {{ api_url }}/v1/realm/filters/{filter_id}`  **Changes**: New in Zulip 4.0 (feature level 57). 

### Example 
```objc

NSNumber* filterId = 2; // The ID of the linkifier that you want to update. 
NSString* pattern = #(?P<id>[0-9]+); // The [Python regular expression](https://docs.python.org/3/howto/regex.html) that should trigger the linkifier. 
NSString* urlFormatString = https://github.com/zulip/zulip/issues/%(id)s; // The URL used for the link. If you used named groups for the `pattern`, you can insert their content here with `%(name_of_the_capturing_group)s`. 

OAIServerAndOrganizationsApi*apiInstance = [[OAIServerAndOrganizationsApi alloc] init];

// Update a linkifier
[apiInstance updateLinkifierWithFilterId:filterId
              pattern:pattern
              urlFormatString:urlFormatString
          completionHandler: ^(OAIJsonSuccess* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIServerAndOrganizationsApi->updateLinkifier: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filterId** | **NSNumber***| The ID of the linkifier that you want to update.  | 
 **pattern** | **NSString***| The [Python regular expression](https://docs.python.org/3/howto/regex.html) that should trigger the linkifier.  | 
 **urlFormatString** | **NSString***| The URL used for the link. If you used named groups for the &#x60;pattern&#x60;, you can insert their content here with &#x60;%(name_of_the_capturing_group)s&#x60;.  | 

### Return type

[**OAIJsonSuccess***](OAIJsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **uploadCustomEmoji**
```objc
-(NSURLSessionTask*) uploadCustomEmojiWithEmojiName: (NSString*) emojiName
    filename: (NSURL*) filename
        completionHandler: (void (^)(OAIJsonSuccess* output, NSError* error)) handler;
```

Upload custom emoji

This endpoint is used to upload a custom emoji for use in the user's organization.  Access to this endpoint depends on the [organization's configuration](https://zulip.com/help/only-allow-admins-to-add-emoji).  `POST {{ api_url }}/v1/realm/emoji/{emoji_name}` 

### Example 
```objc

NSString* emojiName = smile; // The name that should be associated with the uploaded emoji image/gif. The emoji name can only contain letters, numbers, dashes, and spaces. Upper and lower case letters are treated the same, and underscores (_) are treated the same as spaces (consistent with how the Zulip UI handles emoji). 
NSURL* filename = [NSURL fileURLWithPath:@"/path/to/file"]; //  (optional)

OAIServerAndOrganizationsApi*apiInstance = [[OAIServerAndOrganizationsApi alloc] init];

// Upload custom emoji
[apiInstance uploadCustomEmojiWithEmojiName:emojiName
              filename:filename
          completionHandler: ^(OAIJsonSuccess* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIServerAndOrganizationsApi->uploadCustomEmoji: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **emojiName** | **NSString***| The name that should be associated with the uploaded emoji image/gif. The emoji name can only contain letters, numbers, dashes, and spaces. Upper and lower case letters are treated the same, and underscores (_) are treated the same as spaces (consistent with how the Zulip UI handles emoji).  | 
 **filename** | **NSURL*****NSURL***|  | [optional] 

### Return type

[**OAIJsonSuccess***](OAIJsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

