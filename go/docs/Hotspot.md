# Hotspot

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Delay** | Pointer to **float32** | The delay after which the user should be shown the hotspot.  | [optional] 
**Name** | Pointer to **string** | The name of the hotspot.  | [optional] 
**Title** | Pointer to **string** | The title of the hotspot, as will be displayed to the user.  | [optional] 
**Description** | Pointer to **string** | The description of the hotspot, as will be displayed to the user.  | [optional] 

## Methods

### NewHotspot

`func NewHotspot() *Hotspot`

NewHotspot instantiates a new Hotspot object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewHotspotWithDefaults

`func NewHotspotWithDefaults() *Hotspot`

NewHotspotWithDefaults instantiates a new Hotspot object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetDelay

`func (o *Hotspot) GetDelay() float32`

GetDelay returns the Delay field if non-nil, zero value otherwise.

### GetDelayOk

`func (o *Hotspot) GetDelayOk() (*float32, bool)`

GetDelayOk returns a tuple with the Delay field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDelay

`func (o *Hotspot) SetDelay(v float32)`

SetDelay sets Delay field to given value.

### HasDelay

`func (o *Hotspot) HasDelay() bool`

HasDelay returns a boolean if a field has been set.

### GetName

`func (o *Hotspot) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *Hotspot) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *Hotspot) SetName(v string)`

SetName sets Name field to given value.

### HasName

`func (o *Hotspot) HasName() bool`

HasName returns a boolean if a field has been set.

### GetTitle

`func (o *Hotspot) GetTitle() string`

GetTitle returns the Title field if non-nil, zero value otherwise.

### GetTitleOk

`func (o *Hotspot) GetTitleOk() (*string, bool)`

GetTitleOk returns a tuple with the Title field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTitle

`func (o *Hotspot) SetTitle(v string)`

SetTitle sets Title field to given value.

### HasTitle

`func (o *Hotspot) HasTitle() bool`

HasTitle returns a boolean if a field has been set.

### GetDescription

`func (o *Hotspot) GetDescription() string`

GetDescription returns the Description field if non-nil, zero value otherwise.

### GetDescriptionOk

`func (o *Hotspot) GetDescriptionOk() (*string, bool)`

GetDescriptionOk returns a tuple with the Description field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDescription

`func (o *Hotspot) SetDescription(v string)`

SetDescription sets Description field to given value.

### HasDescription

`func (o *Hotspot) HasDescription() bool`

HasDescription returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


