# User
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Email** | [**AnyType**](.md) |  | [optional] 
**IsBot** | [**AnyType**](.md) |  | [optional] 
**AvatarUrl** | [**AnyType**](.md) |  | [optional] 
**AvatarVersion** | [**AnyType**](.md) |  | [optional] 
**FullName** | [**AnyType**](.md) |  | [optional] 
**IsAdmin** | [**AnyType**](.md) |  | [optional] 
**IsOwner** | [**AnyType**](.md) |  | [optional] 
**IsBillingAdmin** | [**AnyType**](.md) |  | [optional] 
**Role** | [**AnyType**](.md) |  | [optional] 
**BotType** | [**AnyType**](.md) |  | [optional] 
**UserId** | [**AnyType**](.md) |  | [optional] 
**BotOwnerId** | [**AnyType**](.md) |  | [optional] 
**IsActive** | [**AnyType**](.md) |  | [optional] 
**IsGuest** | [**AnyType**](.md) |  | [optional] 
**Timezone** | [**AnyType**](.md) |  | [optional] 
**DateJoined** | [**AnyType**](.md) |  | [optional] 
**DeliveryEmail** | [**AnyType**](.md) |  | [optional] 
**ProfileData** | [**AnyType**](.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$User = Initialize-PSOpenAPIToolsUser  -Email null `
 -IsBot null `
 -AvatarUrl null `
 -AvatarVersion null `
 -FullName null `
 -IsAdmin null `
 -IsOwner null `
 -IsBillingAdmin null `
 -Role null `
 -BotType null `
 -UserId null `
 -BotOwnerId null `
 -IsActive null `
 -IsGuest null `
 -Timezone null `
 -DateJoined null `
 -DeliveryEmail null `
 -ProfileData null
```

- Convert the resource to JSON
```powershell
$User | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

