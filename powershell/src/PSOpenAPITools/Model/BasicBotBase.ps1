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

.PARAMETER UserId
The user id of the bot. 
.PARAMETER FullName
The full name of the bot. 
.PARAMETER ApiKey
The API key of the bot which it uses to make API requests. 
.PARAMETER DefaultSendingStream
The default sending stream of the bot. Null if the bot doesn't have a default sending stream. 
.PARAMETER DefaultEventsRegisterStream
The default stream for which the bot receives events/register data. Null if the bot doesn't have such a default stream. 
.PARAMETER DefaultAllPublicStreams
Whether the bot can send messages to all streams by default. 
.PARAMETER AvatarUrl
The URL of the bot's avatar. 
.PARAMETER OwnerId
The user id of the bot's owner.  Null if the bot has no owner. 
.PARAMETER Services
The ""Services"" array contains extra configuration fields only relevant for Outgoing webhook bots and Embedded bots.  It is always a single-element array.  We consider this part of the Zulip API to be unstable; it is used only for UI elements for administering bots and is likely to change. 
.OUTPUTS

BasicBotBase<PSCustomObject>
#>

function Initialize-BasicBotBase {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int32]]
        ${UserId},
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${FullName},
        [Parameter(Position = 2, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${ApiKey},
        [Parameter(Position = 3, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${DefaultSendingStream},
        [Parameter(Position = 4, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${DefaultEventsRegisterStream},
        [Parameter(Position = 5, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Boolean]]
        ${DefaultAllPublicStreams},
        [Parameter(Position = 6, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${AvatarUrl},
        [Parameter(Position = 7, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int32]]
        ${OwnerId},
        [Parameter(Position = 8, ValueFromPipelineByPropertyName = $true)]
        [PSCustomObject[]]
        ${Services}
    )

    Process {
        'Creating PSCustomObject: PSOpenAPITools => BasicBotBase' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug


        $PSO = [PSCustomObject]@{
            "user_id" = ${UserId}
            "full_name" = ${FullName}
            "api_key" = ${ApiKey}
            "default_sending_stream" = ${DefaultSendingStream}
            "default_events_register_stream" = ${DefaultEventsRegisterStream}
            "default_all_public_streams" = ${DefaultAllPublicStreams}
            "avatar_url" = ${AvatarUrl}
            "owner_id" = ${OwnerId}
            "services" = ${Services}
        }


        return $PSO
    }
}

<#
.SYNOPSIS

Convert from JSON to BasicBotBase<PSCustomObject>

.DESCRIPTION

Convert from JSON to BasicBotBase<PSCustomObject>

.PARAMETER Json

Json object

.OUTPUTS

BasicBotBase<PSCustomObject>
#>
function ConvertFrom-JsonToBasicBotBase {
    Param(
        [AllowEmptyString()]
        [string]$Json
    )

    Process {
        'Converting JSON to PSCustomObject: PSOpenAPITools => BasicBotBase' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $JsonParameters = ConvertFrom-Json -InputObject $Json

        # check if Json contains properties not defined in BasicBotBase
        $AllProperties = ("user_id", "full_name", "api_key", "default_sending_stream", "default_events_register_stream", "default_all_public_streams", "avatar_url", "owner_id", "services")
        foreach ($name in $JsonParameters.PsObject.Properties.Name) {
            if (!($AllProperties.Contains($name))) {
                throw "Error! JSON key '$name' not found in the properties: $($AllProperties)"
            }
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "user_id"))) { #optional property not found
            $UserId = $null
        } else {
            $UserId = $JsonParameters.PSobject.Properties["user_id"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "full_name"))) { #optional property not found
            $FullName = $null
        } else {
            $FullName = $JsonParameters.PSobject.Properties["full_name"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "api_key"))) { #optional property not found
            $ApiKey = $null
        } else {
            $ApiKey = $JsonParameters.PSobject.Properties["api_key"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "default_sending_stream"))) { #optional property not found
            $DefaultSendingStream = $null
        } else {
            $DefaultSendingStream = $JsonParameters.PSobject.Properties["default_sending_stream"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "default_events_register_stream"))) { #optional property not found
            $DefaultEventsRegisterStream = $null
        } else {
            $DefaultEventsRegisterStream = $JsonParameters.PSobject.Properties["default_events_register_stream"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "default_all_public_streams"))) { #optional property not found
            $DefaultAllPublicStreams = $null
        } else {
            $DefaultAllPublicStreams = $JsonParameters.PSobject.Properties["default_all_public_streams"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "avatar_url"))) { #optional property not found
            $AvatarUrl = $null
        } else {
            $AvatarUrl = $JsonParameters.PSobject.Properties["avatar_url"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "owner_id"))) { #optional property not found
            $OwnerId = $null
        } else {
            $OwnerId = $JsonParameters.PSobject.Properties["owner_id"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "services"))) { #optional property not found
            $Services = $null
        } else {
            $Services = $JsonParameters.PSobject.Properties["services"].value
        }

        $PSO = [PSCustomObject]@{
            "user_id" = ${UserId}
            "full_name" = ${FullName}
            "api_key" = ${ApiKey}
            "default_sending_stream" = ${DefaultSendingStream}
            "default_events_register_stream" = ${DefaultEventsRegisterStream}
            "default_all_public_streams" = ${DefaultAllPublicStreams}
            "avatar_url" = ${AvatarUrl}
            "owner_id" = ${OwnerId}
            "services" = ${Services}
        }

        return $PSO
    }

}
