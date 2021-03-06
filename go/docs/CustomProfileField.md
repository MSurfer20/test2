# CustomProfileField

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | Pointer to **int32** | The ID of the custom profile field.  This will be referenced in custom the profile fields section of user objects.  | [optional] 
**Type** | Pointer to **int32** | An integer indicating the type of the custom profile field, which determines how it is configured and displayed to users.  See the [Add custom profile fields](/help/add-custom-profile-fields) article for details on what each type means.  * **1**: Short text * **2**: Long text * **3**: List of options * **4**: Date picker * **5**: Link * **6**: Person picker * **7**: External account  | [optional] 
**Order** | Pointer to **int32** | Custom profile fields are displayed in both settings UI and UI showing users&#39; profiles in increasing &#x60;order&#x60;.  | [optional] 
**Name** | Pointer to **string** | The name of the custom profile field.  | [optional] 
**Hint** | Pointer to **string** | The help text to be displayed for the custom profile field in user-facing settings UI for configuring custom profile fields.  | [optional] 
**FieldData** | Pointer to **string** | Field types 3 (List of options) and 7 (External account) support storing additional configuration for the field type in the &#x60;field_data&#x60; attribute.  For field type 3 (List of options), this attribute is a JSON dictionary defining the choices and the order they will be displayed in the dropdown UI for individual users to select an option.  The interface for field type 7 is not yet stabilized.  | [optional] 

## Methods

### NewCustomProfileField

`func NewCustomProfileField() *CustomProfileField`

NewCustomProfileField instantiates a new CustomProfileField object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCustomProfileFieldWithDefaults

`func NewCustomProfileFieldWithDefaults() *CustomProfileField`

NewCustomProfileFieldWithDefaults instantiates a new CustomProfileField object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetId

`func (o *CustomProfileField) GetId() int32`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *CustomProfileField) GetIdOk() (*int32, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *CustomProfileField) SetId(v int32)`

SetId sets Id field to given value.

### HasId

`func (o *CustomProfileField) HasId() bool`

HasId returns a boolean if a field has been set.

### GetType

`func (o *CustomProfileField) GetType() int32`

GetType returns the Type field if non-nil, zero value otherwise.

### GetTypeOk

`func (o *CustomProfileField) GetTypeOk() (*int32, bool)`

GetTypeOk returns a tuple with the Type field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetType

`func (o *CustomProfileField) SetType(v int32)`

SetType sets Type field to given value.

### HasType

`func (o *CustomProfileField) HasType() bool`

HasType returns a boolean if a field has been set.

### GetOrder

`func (o *CustomProfileField) GetOrder() int32`

GetOrder returns the Order field if non-nil, zero value otherwise.

### GetOrderOk

`func (o *CustomProfileField) GetOrderOk() (*int32, bool)`

GetOrderOk returns a tuple with the Order field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOrder

`func (o *CustomProfileField) SetOrder(v int32)`

SetOrder sets Order field to given value.

### HasOrder

`func (o *CustomProfileField) HasOrder() bool`

HasOrder returns a boolean if a field has been set.

### GetName

`func (o *CustomProfileField) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *CustomProfileField) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *CustomProfileField) SetName(v string)`

SetName sets Name field to given value.

### HasName

`func (o *CustomProfileField) HasName() bool`

HasName returns a boolean if a field has been set.

### GetHint

`func (o *CustomProfileField) GetHint() string`

GetHint returns the Hint field if non-nil, zero value otherwise.

### GetHintOk

`func (o *CustomProfileField) GetHintOk() (*string, bool)`

GetHintOk returns a tuple with the Hint field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetHint

`func (o *CustomProfileField) SetHint(v string)`

SetHint sets Hint field to given value.

### HasHint

`func (o *CustomProfileField) HasHint() bool`

HasHint returns a boolean if a field has been set.

### GetFieldData

`func (o *CustomProfileField) GetFieldData() string`

GetFieldData returns the FieldData field if non-nil, zero value otherwise.

### GetFieldDataOk

`func (o *CustomProfileField) GetFieldDataOk() (*string, bool)`

GetFieldDataOk returns a tuple with the FieldData field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFieldData

`func (o *CustomProfileField) SetFieldData(v string)`

SetFieldData sets FieldData field to given value.

### HasFieldData

`func (o *CustomProfileField) HasFieldData() bool`

HasFieldData returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


