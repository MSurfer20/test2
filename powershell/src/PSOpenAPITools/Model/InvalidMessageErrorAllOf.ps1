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
.PARAMETER RawContent
The raw content of the message. 
.OUTPUTS

InvalidMessageErrorAllOf<PSCustomObject>
#>

function Initialize-InvalidMessageErrorAllOf {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [PSCustomObject]
        ${Result},
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true)]
        [PSCustomObject]
        ${Msg},
        [Parameter(Position = 2, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${RawContent}
    )

    Process {
        'Creating PSCustomObject: PSOpenAPITools => InvalidMessageErrorAllOf' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug


        $PSO = [PSCustomObject]@{
            "result" = ${Result}
            "msg" = ${Msg}
            "raw_content" = ${RawContent}
        }


        return $PSO
    }
}

<#
.SYNOPSIS

Convert from JSON to InvalidMessageErrorAllOf<PSCustomObject>

.DESCRIPTION

Convert from JSON to InvalidMessageErrorAllOf<PSCustomObject>

.PARAMETER Json

Json object

.OUTPUTS

InvalidMessageErrorAllOf<PSCustomObject>
#>
function ConvertFrom-JsonToInvalidMessageErrorAllOf {
    Param(
        [AllowEmptyString()]
        [string]$Json
    )

    Process {
        'Converting JSON to PSCustomObject: PSOpenAPITools => InvalidMessageErrorAllOf' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $JsonParameters = ConvertFrom-Json -InputObject $Json

        # check if Json contains properties not defined in InvalidMessageErrorAllOf
        $AllProperties = ("result", "msg", "raw_content")
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

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "raw_content"))) { #optional property not found
            $RawContent = $null
        } else {
            $RawContent = $JsonParameters.PSobject.Properties["raw_content"].value
        }

        $PSO = [PSCustomObject]@{
            "result" = ${Result}
            "msg" = ${Msg}
            "raw_content" = ${RawContent}
        }

        return $PSO
    }

}

