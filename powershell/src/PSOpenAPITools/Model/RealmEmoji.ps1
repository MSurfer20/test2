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

`{emoji_id}`: Object containing details about the emoji with  the specified ID. It has the following properties: 

.PARAMETER Id
The ID for this emoji, same as the object's key. 
.PARAMETER Name
The user-friendly name for this emoji. Users in the organization can use this emoji by writing this name between colons (`:name  :`). 
.PARAMETER SourceUrl
The path relative to the organization's URL where the emoji's image can be found. 
.PARAMETER Deactivated
Whether the emoji has been deactivated or not. 
.PARAMETER AuthorId
The user ID of the user who uploaded the custom emoji. Will be null if the uploader is unknown.  **Changes**: New in Zulip 3.0 (feature level 7).  Previously was accessible via and `author` object with an `id` field. 
.OUTPUTS

RealmEmoji<PSCustomObject>
#>

function Initialize-RealmEmoji {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${Id},
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${Name},
        [Parameter(Position = 2, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${SourceUrl},
        [Parameter(Position = 3, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Boolean]]
        ${Deactivated},
        [Parameter(Position = 4, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int32]]
        ${AuthorId}
    )

    Process {
        'Creating PSCustomObject: PSOpenAPITools => RealmEmoji' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug


        $PSO = [PSCustomObject]@{
            "id" = ${Id}
            "name" = ${Name}
            "source_url" = ${SourceUrl}
            "deactivated" = ${Deactivated}
            "author_id" = ${AuthorId}
        }


        return $PSO
    }
}

<#
.SYNOPSIS

Convert from JSON to RealmEmoji<PSCustomObject>

.DESCRIPTION

Convert from JSON to RealmEmoji<PSCustomObject>

.PARAMETER Json

Json object

.OUTPUTS

RealmEmoji<PSCustomObject>
#>
function ConvertFrom-JsonToRealmEmoji {
    Param(
        [AllowEmptyString()]
        [string]$Json
    )

    Process {
        'Converting JSON to PSCustomObject: PSOpenAPITools => RealmEmoji' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $JsonParameters = ConvertFrom-Json -InputObject $Json

        # check if Json contains properties not defined in RealmEmoji
        $AllProperties = ("id", "name", "source_url", "deactivated", "author_id")
        foreach ($name in $JsonParameters.PsObject.Properties.Name) {
            if (!($AllProperties.Contains($name))) {
                throw "Error! JSON key '$name' not found in the properties: $($AllProperties)"
            }
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "id"))) { #optional property not found
            $Id = $null
        } else {
            $Id = $JsonParameters.PSobject.Properties["id"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "name"))) { #optional property not found
            $Name = $null
        } else {
            $Name = $JsonParameters.PSobject.Properties["name"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "source_url"))) { #optional property not found
            $SourceUrl = $null
        } else {
            $SourceUrl = $JsonParameters.PSobject.Properties["source_url"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "deactivated"))) { #optional property not found
            $Deactivated = $null
        } else {
            $Deactivated = $JsonParameters.PSobject.Properties["deactivated"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "author_id"))) { #optional property not found
            $AuthorId = $null
        } else {
            $AuthorId = $JsonParameters.PSobject.Properties["author_id"].value
        }

        $PSO = [PSCustomObject]@{
            "id" = ${Id}
            "name" = ${Name}
            "source_url" = ${SourceUrl}
            "deactivated" = ${Deactivated}
            "author_id" = ${AuthorId}
        }

        return $PSO
    }

}

