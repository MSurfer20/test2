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

.PARAMETER Result
No description available.
.PARAMETER Msg
No description available.
.PARAMETER Code
No description available.
.PARAMETER Stream
The name of the stream that could not be found. 
.OUTPUTS

NonExistingStreamErrorAllOf<PSCustomObject>
#>

function Initialize-NonExistingStreamErrorAllOf {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [PSCustomObject]
        ${Result},
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true)]
        [PSCustomObject]
        ${Msg},
        [Parameter(Position = 2, ValueFromPipelineByPropertyName = $true)]
        [PSCustomObject]
        ${Code},
        [Parameter(Position = 3, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${Stream}
    )

    Process {
        'Creating PSCustomObject: PSOpenAPITools => NonExistingStreamErrorAllOf' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug


        $PSO = [PSCustomObject]@{
            "result" = ${Result}
            "msg" = ${Msg}
            "code" = ${Code}
            "stream" = ${Stream}
        }


        return $PSO
    }
}

<#
.SYNOPSIS

Convert from JSON to NonExistingStreamErrorAllOf<PSCustomObject>

.DESCRIPTION

Convert from JSON to NonExistingStreamErrorAllOf<PSCustomObject>

.PARAMETER Json

Json object

.OUTPUTS

NonExistingStreamErrorAllOf<PSCustomObject>
#>
function ConvertFrom-JsonToNonExistingStreamErrorAllOf {
    Param(
        [AllowEmptyString()]
        [string]$Json
    )

    Process {
        'Converting JSON to PSCustomObject: PSOpenAPITools => NonExistingStreamErrorAllOf' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $JsonParameters = ConvertFrom-Json -InputObject $Json

        # check if Json contains properties not defined in NonExistingStreamErrorAllOf
        $AllProperties = ("result", "msg", "code", "stream")
        foreach ($name in $JsonParameters.PsObject.Properties.Name) {
            if (!($AllProperties.Contains($name))) {
                throw "Error! JSON key '$name' not found in the properties: $($AllProperties)"
            }
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "result"))) { #optional property not found
            $Result = $null
        } else {
            $Result = $JsonParameters.PSobject.Properties["result"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "msg"))) { #optional property not found
            $Msg = $null
        } else {
            $Msg = $JsonParameters.PSobject.Properties["msg"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "code"))) { #optional property not found
            $Code = $null
        } else {
            $Code = $JsonParameters.PSobject.Properties["code"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "stream"))) { #optional property not found
            $Stream = $null
        } else {
            $Stream = $JsonParameters.PSobject.Properties["stream"].value
        }

        $PSO = [PSCustomObject]@{
            "result" = ${Result}
            "msg" = ${Msg}
            "code" = ${Code}
            "stream" = ${Stream}
        }

        return $PSO
    }

}

