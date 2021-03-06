#
# Zulip REST API
# Powerful open source group chat 
# Version: 1.0.0
# Generated by OpenAPI Generator: https://openapi-generator.tech
#

<#
.SYNOPSIS

No summary available.

.DESCRIPTION

No description available.

.PARAMETER Email
No description available.
.PARAMETER IsBot
No description available.
.PARAMETER AvatarUrl
No description available.
.PARAMETER AvatarVersion
No description available.
.PARAMETER FullName
No description available.
.PARAMETER IsAdmin
No description available.
.PARAMETER IsOwner
No description available.
.PARAMETER IsBillingAdmin
No description available.
.PARAMETER Role
No description available.
.PARAMETER BotType
No description available.
.PARAMETER UserId
No description available.
.PARAMETER BotOwnerId
No description available.
.PARAMETER IsActive
No description available.
.PARAMETER IsGuest
No description available.
.PARAMETER Timezone
No description available.
.PARAMETER DateJoined
No description available.
.PARAMETER DeliveryEmail
No description available.
.PARAMETER ProfileData
No description available.
.OUTPUTS

User<PSCustomObject>
#>

function Initialize-User {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [PSCustomObject]
        ${Email},
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true)]
        [PSCustomObject]
        ${IsBot},
        [Parameter(Position = 2, ValueFromPipelineByPropertyName = $true)]
        [PSCustomObject]
        ${AvatarUrl},
        [Parameter(Position = 3, ValueFromPipelineByPropertyName = $true)]
        [PSCustomObject]
        ${AvatarVersion},
        [Parameter(Position = 4, ValueFromPipelineByPropertyName = $true)]
        [PSCustomObject]
        ${FullName},
        [Parameter(Position = 5, ValueFromPipelineByPropertyName = $true)]
        [PSCustomObject]
        ${IsAdmin},
        [Parameter(Position = 6, ValueFromPipelineByPropertyName = $true)]
        [PSCustomObject]
        ${IsOwner},
        [Parameter(Position = 7, ValueFromPipelineByPropertyName = $true)]
        [PSCustomObject]
        ${IsBillingAdmin},
        [Parameter(Position = 8, ValueFromPipelineByPropertyName = $true)]
        [PSCustomObject]
        ${Role},
        [Parameter(Position = 9, ValueFromPipelineByPropertyName = $true)]
        [PSCustomObject]
        ${BotType},
        [Parameter(Position = 10, ValueFromPipelineByPropertyName = $true)]
        [PSCustomObject]
        ${UserId},
        [Parameter(Position = 11, ValueFromPipelineByPropertyName = $true)]
        [PSCustomObject]
        ${BotOwnerId},
        [Parameter(Position = 12, ValueFromPipelineByPropertyName = $true)]
        [PSCustomObject]
        ${IsActive},
        [Parameter(Position = 13, ValueFromPipelineByPropertyName = $true)]
        [PSCustomObject]
        ${IsGuest},
        [Parameter(Position = 14, ValueFromPipelineByPropertyName = $true)]
        [PSCustomObject]
        ${Timezone},
        [Parameter(Position = 15, ValueFromPipelineByPropertyName = $true)]
        [PSCustomObject]
        ${DateJoined},
        [Parameter(Position = 16, ValueFromPipelineByPropertyName = $true)]
        [PSCustomObject]
        ${DeliveryEmail},
        [Parameter(Position = 17, ValueFromPipelineByPropertyName = $true)]
        [PSCustomObject]
        ${ProfileData}
    )

    Process {
        'Creating PSCustomObject: PSOpenAPITools => User' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug


        $PSO = [PSCustomObject]@{
            "email" = ${Email}
            "is_bot" = ${IsBot}
            "avatar_url" = ${AvatarUrl}
            "avatar_version" = ${AvatarVersion}
            "full_name" = ${FullName}
            "is_admin" = ${IsAdmin}
            "is_owner" = ${IsOwner}
            "is_billing_admin" = ${IsBillingAdmin}
            "role" = ${Role}
            "bot_type" = ${BotType}
            "user_id" = ${UserId}
            "bot_owner_id" = ${BotOwnerId}
            "is_active" = ${IsActive}
            "is_guest" = ${IsGuest}
            "timezone" = ${Timezone}
            "date_joined" = ${DateJoined}
            "delivery_email" = ${DeliveryEmail}
            "profile_data" = ${ProfileData}
        }


        return $PSO
    }
}

<#
.SYNOPSIS

Convert from JSON to User<PSCustomObject>

.DESCRIPTION

Convert from JSON to User<PSCustomObject>

.PARAMETER Json

Json object

.OUTPUTS

User<PSCustomObject>
#>
function ConvertFrom-JsonToUser {
    Param(
        [AllowEmptyString()]
        [string]$Json
    )

    Process {
        'Converting JSON to PSCustomObject: PSOpenAPITools => User' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $JsonParameters = ConvertFrom-Json -InputObject $Json

        # check if Json contains properties not defined in User
        $AllProperties = ("email", "is_bot", "avatar_url", "avatar_version", "full_name", "is_admin", "is_owner", "is_billing_admin", "role", "bot_type", "user_id", "bot_owner_id", "is_active", "is_guest", "timezone", "date_joined", "delivery_email", "profile_data")
        foreach ($name in $JsonParameters.PsObject.Properties.Name) {
            if (!($AllProperties.Contains($name))) {
                throw "Error! JSON key '$name' not found in the properties: $($AllProperties)"
            }
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "email"))) { #optional property not found
            $Email = $null
        } else {
            $Email = $JsonParameters.PSobject.Properties["email"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "is_bot"))) { #optional property not found
            $IsBot = $null
        } else {
            $IsBot = $JsonParameters.PSobject.Properties["is_bot"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "avatar_url"))) { #optional property not found
            $AvatarUrl = $null
        } else {
            $AvatarUrl = $JsonParameters.PSobject.Properties["avatar_url"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "avatar_version"))) { #optional property not found
            $AvatarVersion = $null
        } else {
            $AvatarVersion = $JsonParameters.PSobject.Properties["avatar_version"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "full_name"))) { #optional property not found
            $FullName = $null
        } else {
            $FullName = $JsonParameters.PSobject.Properties["full_name"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "is_admin"))) { #optional property not found
            $IsAdmin = $null
        } else {
            $IsAdmin = $JsonParameters.PSobject.Properties["is_admin"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "is_owner"))) { #optional property not found
            $IsOwner = $null
        } else {
            $IsOwner = $JsonParameters.PSobject.Properties["is_owner"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "is_billing_admin"))) { #optional property not found
            $IsBillingAdmin = $null
        } else {
            $IsBillingAdmin = $JsonParameters.PSobject.Properties["is_billing_admin"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "role"))) { #optional property not found
            $Role = $null
        } else {
            $Role = $JsonParameters.PSobject.Properties["role"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "bot_type"))) { #optional property not found
            $BotType = $null
        } else {
            $BotType = $JsonParameters.PSobject.Properties["bot_type"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "user_id"))) { #optional property not found
            $UserId = $null
        } else {
            $UserId = $JsonParameters.PSobject.Properties["user_id"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "bot_owner_id"))) { #optional property not found
            $BotOwnerId = $null
        } else {
            $BotOwnerId = $JsonParameters.PSobject.Properties["bot_owner_id"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "is_active"))) { #optional property not found
            $IsActive = $null
        } else {
            $IsActive = $JsonParameters.PSobject.Properties["is_active"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "is_guest"))) { #optional property not found
            $IsGuest = $null
        } else {
            $IsGuest = $JsonParameters.PSobject.Properties["is_guest"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "timezone"))) { #optional property not found
            $Timezone = $null
        } else {
            $Timezone = $JsonParameters.PSobject.Properties["timezone"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "date_joined"))) { #optional property not found
            $DateJoined = $null
        } else {
            $DateJoined = $JsonParameters.PSobject.Properties["date_joined"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "delivery_email"))) { #optional property not found
            $DeliveryEmail = $null
        } else {
            $DeliveryEmail = $JsonParameters.PSobject.Properties["delivery_email"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "profile_data"))) { #optional property not found
            $ProfileData = $null
        } else {
            $ProfileData = $JsonParameters.PSobject.Properties["profile_data"].value
        }

        $PSO = [PSCustomObject]@{
            "email" = ${Email}
            "is_bot" = ${IsBot}
            "avatar_url" = ${AvatarUrl}
            "avatar_version" = ${AvatarVersion}
            "full_name" = ${FullName}
            "is_admin" = ${IsAdmin}
            "is_owner" = ${IsOwner}
            "is_billing_admin" = ${IsBillingAdmin}
            "role" = ${Role}
            "bot_type" = ${BotType}
            "user_id" = ${UserId}
            "bot_owner_id" = ${BotOwnerId}
            "is_active" = ${IsActive}
            "is_guest" = ${IsGuest}
            "timezone" = ${Timezone}
            "date_joined" = ${DateJoined}
            "delivery_email" = ${DeliveryEmail}
            "profile_data" = ${ProfileData}
        }

        return $PSO
    }

}

