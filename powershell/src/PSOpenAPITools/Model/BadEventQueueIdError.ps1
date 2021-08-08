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
.PARAMETER QueueId
The string that identifies the invalid event queue. 
.OUTPUTS

BadEventQueueIdError<PSCustomObject>
#>

function Initialize-BadEventQueueIdError {
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
        ${QueueId}
    )

    Process {
        'Creating PSCustomObject: PSOpenAPITools => BadEventQueueIdError' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug


        $PSO = [PSCustomObject]@{
            "result" = ${Result}
            "msg" = ${Msg}
            "code" = ${Code}
            "queue_id" = ${QueueId}
        }


        return $PSO
    }
}

<#
.SYNOPSIS

Convert from JSON to BadEventQueueIdError<PSCustomObject>

.DESCRIPTION

Convert from JSON to BadEventQueueIdError<PSCustomObject>

.PARAMETER Json

Json object

.OUTPUTS

BadEventQueueIdError<PSCustomObject>
#>
function ConvertFrom-JsonToBadEventQueueIdError {
    Param(
        [AllowEmptyString()]
        [string]$Json
    )

    Process {
        'Converting JSON to PSCustomObject: PSOpenAPITools => BadEventQueueIdError' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $JsonParameters = ConvertFrom-Json -InputObject $Json

        # check if Json contains properties not defined in BadEventQueueIdError
        $AllProperties = ("result", "msg", "code", "queue_id")
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

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "queue_id"))) { #optional property not found
            $QueueId = $null
        } else {
            $QueueId = $JsonParameters.PSobject.Properties["queue_id"].value
        }

        $PSO = [PSCustomObject]@{
            "result" = ${Result}
            "msg" = ${Msg}
            "code" = ${Code}
            "queue_id" = ${QueueId}
        }

        return $PSO
    }

}

