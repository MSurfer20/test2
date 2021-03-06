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
.PARAMETER VarName
It contains the information about the missing parameter. 
.OUTPUTS

MissingArgumentError<PSCustomObject>
#>

function Initialize-MissingArgumentError {
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
        ${VarName}
    )

    Process {
        'Creating PSCustomObject: PSOpenAPITools => MissingArgumentError' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug


        $PSO = [PSCustomObject]@{
            "result" = ${Result}
            "msg" = ${Msg}
            "code" = ${Code}
            "var_name" = ${VarName}
        }


        return $PSO
    }
}

<#
.SYNOPSIS

Convert from JSON to MissingArgumentError<PSCustomObject>

.DESCRIPTION

Convert from JSON to MissingArgumentError<PSCustomObject>

.PARAMETER Json

Json object

.OUTPUTS

MissingArgumentError<PSCustomObject>
#>
function ConvertFrom-JsonToMissingArgumentError {
    Param(
        [AllowEmptyString()]
        [string]$Json
    )

    Process {
        'Converting JSON to PSCustomObject: PSOpenAPITools => MissingArgumentError' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $JsonParameters = ConvertFrom-Json -InputObject $Json

        # check if Json contains properties not defined in MissingArgumentError
        $AllProperties = ("result", "msg", "code", "var_name")
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

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "code"))) { #optional property not found
            $Code = $null
        } else {
            $Code = $JsonParameters.PSobject.Properties["code"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "var_name"))) { #optional property not found
            $VarName = $null
        } else {
            $VarName = $JsonParameters.PSobject.Properties["var_name"].value
        }

        $PSO = [PSCustomObject]@{
            "result" = ${Result}
            "msg" = ${Msg}
            "code" = ${Code}
            "var_name" = ${VarName}
        }

        return $PSO
    }

}

