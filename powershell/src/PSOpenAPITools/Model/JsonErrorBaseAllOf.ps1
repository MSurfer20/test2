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
.OUTPUTS

JsonErrorBaseAllOf<PSCustomObject>
#>

function Initialize-JsonErrorBaseAllOf {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [ValidateSet("error")]
        [String]
        ${Result},
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${Msg}
    )

    Process {
        'Creating PSCustomObject: PSOpenAPITools => JsonErrorBaseAllOf' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        if ($Result -eq $null) {
            throw "invalid value for 'Result', 'Result' cannot be null."
        }

        if ($Msg -eq $null) {
            throw "invalid value for 'Msg', 'Msg' cannot be null."
        }


        $PSO = [PSCustomObject]@{
            "result" = ${Result}
            "msg" = ${Msg}
        }


        return $PSO
    }
}

<#
.SYNOPSIS

Convert from JSON to JsonErrorBaseAllOf<PSCustomObject>

.DESCRIPTION

Convert from JSON to JsonErrorBaseAllOf<PSCustomObject>

.PARAMETER Json

Json object

.OUTPUTS

JsonErrorBaseAllOf<PSCustomObject>
#>
function ConvertFrom-JsonToJsonErrorBaseAllOf {
    Param(
        [AllowEmptyString()]
        [string]$Json
    )

    Process {
        'Converting JSON to PSCustomObject: PSOpenAPITools => JsonErrorBaseAllOf' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $JsonParameters = ConvertFrom-Json -InputObject $Json

        # check if Json contains properties not defined in JsonErrorBaseAllOf
        $AllProperties = ("result", "msg")
        foreach ($name in $JsonParameters.PsObject.Properties.Name) {
            if (!($AllProperties.Contains($name))) {
                throw "Error! JSON key '$name' not found in the properties: $($AllProperties)"
            }
        }

        If ([string]::IsNullOrEmpty($Json) -or $Json -eq "{}") { # empty json
            throw "Error! Empty JSON cannot be serialized due to the required property 'result' missing."
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "result"))) {
            throw "Error! JSON cannot be serialized due to the required property 'result' missing."
        } else {
            $Result = $JsonParameters.PSobject.Properties["result"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "msg"))) {
            throw "Error! JSON cannot be serialized due to the required property 'msg' missing."
        } else {
            $Msg = $JsonParameters.PSobject.Properties["msg"].value
        }

        $PSO = [PSCustomObject]@{
            "result" = ${Result}
            "msg" = ${Msg}
        }

        return $PSO
    }

}

