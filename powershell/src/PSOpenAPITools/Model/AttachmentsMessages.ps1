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

.PARAMETER DateSent
Time when the message was sent as a UNIX timestamp multiplied by 1000 (matching the format of getTime() in JavaScript).  **Changes**: Changed in Zulip 2.2 (feature level 22).  This field was previously strangely called `name` and was a floating point number. 
.PARAMETER Id
The unique message ID.  Messages should always be displayed sorted by ID. 
.OUTPUTS

AttachmentsMessages<PSCustomObject>
#>

function Initialize-AttachmentsMessages {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int32]]
        ${DateSent},
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int32]]
        ${Id}
    )

    Process {
        'Creating PSCustomObject: PSOpenAPITools => AttachmentsMessages' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug


        $PSO = [PSCustomObject]@{
            "date_sent" = ${DateSent}
            "id" = ${Id}
        }


        return $PSO
    }
}

<#
.SYNOPSIS

Convert from JSON to AttachmentsMessages<PSCustomObject>

.DESCRIPTION

Convert from JSON to AttachmentsMessages<PSCustomObject>

.PARAMETER Json

Json object

.OUTPUTS

AttachmentsMessages<PSCustomObject>
#>
function ConvertFrom-JsonToAttachmentsMessages {
    Param(
        [AllowEmptyString()]
        [string]$Json
    )

    Process {
        'Converting JSON to PSCustomObject: PSOpenAPITools => AttachmentsMessages' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $JsonParameters = ConvertFrom-Json -InputObject $Json

        # check if Json contains properties not defined in AttachmentsMessages
        $AllProperties = ("date_sent", "id")
        foreach ($name in $JsonParameters.PsObject.Properties.Name) {
            if (!($AllProperties.Contains($name))) {
                throw "Error! JSON key '$name' not found in the properties: $($AllProperties)"
            }
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "date_sent"))) { #optional property not found
            $DateSent = $null
        } else {
            $DateSent = $JsonParameters.PSobject.Properties["date_sent"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "id"))) { #optional property not found
            $Id = $null
        } else {
            $Id = $JsonParameters.PSobject.Properties["id"].value
        }

        $PSO = [PSCustomObject]@{
            "date_sent" = ${DateSent}
            "id" = ${Id}
        }

        return $PSO
    }

}

