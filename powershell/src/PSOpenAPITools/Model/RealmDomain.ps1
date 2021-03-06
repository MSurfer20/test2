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

Object containing details of the newly added domain. 

.PARAMETER Domain
The new allowed domain. 
.PARAMETER AllowSubdomains
Whether subdomains are allowed for this domain. 
.OUTPUTS

RealmDomain<PSCustomObject>
#>

function Initialize-RealmDomain {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${Domain},
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Boolean]]
        ${AllowSubdomains}
    )

    Process {
        'Creating PSCustomObject: PSOpenAPITools => RealmDomain' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug


        $PSO = [PSCustomObject]@{
            "domain" = ${Domain}
            "allow_subdomains" = ${AllowSubdomains}
        }


        return $PSO
    }
}

<#
.SYNOPSIS

Convert from JSON to RealmDomain<PSCustomObject>

.DESCRIPTION

Convert from JSON to RealmDomain<PSCustomObject>

.PARAMETER Json

Json object

.OUTPUTS

RealmDomain<PSCustomObject>
#>
function ConvertFrom-JsonToRealmDomain {
    Param(
        [AllowEmptyString()]
        [string]$Json
    )

    Process {
        'Converting JSON to PSCustomObject: PSOpenAPITools => RealmDomain' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $JsonParameters = ConvertFrom-Json -InputObject $Json

        # check if Json contains properties not defined in RealmDomain
        $AllProperties = ("domain", "allow_subdomains")
        foreach ($name in $JsonParameters.PsObject.Properties.Name) {
            if (!($AllProperties.Contains($name))) {
                throw "Error! JSON key '$name' not found in the properties: $($AllProperties)"
            }
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "domain"))) { #optional property not found
            $Domain = $null
        } else {
            $Domain = $JsonParameters.PSobject.Properties["domain"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "allow_subdomains"))) { #optional property not found
            $AllowSubdomains = $null
        } else {
            $AllowSubdomains = $JsonParameters.PSobject.Properties["allow_subdomains"].value
        }

        $PSO = [PSCustomObject]@{
            "domain" = ${Domain}
            "allow_subdomains" = ${AllowSubdomains}
        }

        return $PSO
    }

}

