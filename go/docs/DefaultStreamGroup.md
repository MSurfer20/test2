# DefaultStreamGroup

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Name** | Pointer to **string** | Name of the default stream group.  | [optional] 
**Description** | Pointer to **string** | Description of the default stream group.  | [optional] 
**Id** | Pointer to **int32** | id of the default stream group.  | [optional] 
**Streams** | Pointer to [**[]BasicStream**](BasicStream.md) | Array containing details about the streams in the default stream group.  | [optional] 

## Methods

### NewDefaultStreamGroup

`func NewDefaultStreamGroup() *DefaultStreamGroup`

NewDefaultStreamGroup instantiates a new DefaultStreamGroup object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewDefaultStreamGroupWithDefaults

`func NewDefaultStreamGroupWithDefaults() *DefaultStreamGroup`

NewDefaultStreamGroupWithDefaults instantiates a new DefaultStreamGroup object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetName

`func (o *DefaultStreamGroup) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *DefaultStreamGroup) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *DefaultStreamGroup) SetName(v string)`

SetName sets Name field to given value.

### HasName

`func (o *DefaultStreamGroup) HasName() bool`

HasName returns a boolean if a field has been set.

### GetDescription

`func (o *DefaultStreamGroup) GetDescription() string`

GetDescription returns the Description field if non-nil, zero value otherwise.

### GetDescriptionOk

`func (o *DefaultStreamGroup) GetDescriptionOk() (*string, bool)`

GetDescriptionOk returns a tuple with the Description field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDescription

`func (o *DefaultStreamGroup) SetDescription(v string)`

SetDescription sets Description field to given value.

### HasDescription

`func (o *DefaultStreamGroup) HasDescription() bool`

HasDescription returns a boolean if a field has been set.

### GetId

`func (o *DefaultStreamGroup) GetId() int32`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *DefaultStreamGroup) GetIdOk() (*int32, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *DefaultStreamGroup) SetId(v int32)`

SetId sets Id field to given value.

### HasId

`func (o *DefaultStreamGroup) HasId() bool`

HasId returns a boolean if a field has been set.

### GetStreams

`func (o *DefaultStreamGroup) GetStreams() []BasicStream`

GetStreams returns the Streams field if non-nil, zero value otherwise.

### GetStreamsOk

`func (o *DefaultStreamGroup) GetStreamsOk() (*[]BasicStream, bool)`

GetStreamsOk returns a tuple with the Streams field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStreams

`func (o *DefaultStreamGroup) SetStreams(v []BasicStream)`

SetStreams sets Streams field to given value.

### HasStreams

`func (o *DefaultStreamGroup) HasStreams() bool`

HasStreams returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


