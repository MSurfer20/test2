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

.PARAMETER AvatarUrl
No description available.
.PARAMETER Client
No description available.
.PARAMETER Content
No description available.
.PARAMETER ContentType
No description available.
.PARAMETER DisplayRecipient
No description available.
.PARAMETER Id
No description available.
.PARAMETER IsMeMessage
No description available.
.PARAMETER Reactions
No description available.
.PARAMETER RecipientId
No description available.
.PARAMETER SenderEmail
No description available.
.PARAMETER SenderFullName
No description available.
.PARAMETER SenderId
No description available.
.PARAMETER SenderRealmStr
No description available.
.PARAMETER StreamId
No description available.
.PARAMETER Subject
No description available.
.PARAMETER TopicLinks
No description available.
.PARAMETER Submessages
No description available.
.PARAMETER Timestamp
No description available.
.PARAMETER Type
No description available.
.PARAMETER Flags
The user's [message flags][message-flags] for the message.  [message-flags]: /api/update-message-flags#available-flags 
.PARAMETER LastEditTimestamp
The UNIX timestamp for when the message was last edited, in UTC seconds. 
.PARAMETER MatchContent
Only present if keyword search was included among the narrow parameters. HTML content of a queried message that matches the narrow, with `<span class=""highlight"">` elements wrapping the matches for the search keywords. 
.PARAMETER MatchSubject
Only present if keyword search was included among the narrow parameters. HTML-escaped topic of a queried message that matches the narrow, with `<span class=""highlight"">` elements wrapping the matches for the search keywords. 
.OUTPUTS

GetMessages<PSCustomObject>
#>

function Initialize-GetMessages {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [PSCustomObject]
        ${AvatarUrl},
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true)]
        [PSCustomObject]
        ${Client},
        [Parameter(Position = 2, ValueFromPipelineByPropertyName = $true)]
        [PSCustomObject]
        ${Content},
        [Parameter(Position = 3, ValueFromPipelineByPropertyName = $true)]
        [PSCustomObject]
        ${ContentType},
        [Parameter(Position = 4, ValueFromPipelineByPropertyName = $true)]
        [PSCustomObject]
        ${DisplayRecipient},
        [Parameter(Position = 5, ValueFromPipelineByPropertyName = $true)]
        [PSCustomObject]
        ${Id},
        [Parameter(Position = 6, ValueFromPipelineByPropertyName = $true)]
        [PSCustomObject]
        ${IsMeMessage},
        [Parameter(Position = 7, ValueFromPipelineByPropertyName = $true)]
        [PSCustomObject]
        ${Reactions},
        [Parameter(Position = 8, ValueFromPipelineByPropertyName = $true)]
        [PSCustomObject]
        ${RecipientId},
        [Parameter(Position = 9, ValueFromPipelineByPropertyName = $true)]
        [PSCustomObject]
        ${SenderEmail},
        [Parameter(Position = 10, ValueFromPipelineByPropertyName = $true)]
        [PSCustomObject]
        ${SenderFullName},
        [Parameter(Position = 11, ValueFromPipelineByPropertyName = $true)]
        [PSCustomObject]
        ${SenderId},
        [Parameter(Position = 12, ValueFromPipelineByPropertyName = $true)]
        [PSCustomObject]
        ${SenderRealmStr},
        [Parameter(Position = 13, ValueFromPipelineByPropertyName = $true)]
        [PSCustomObject]
        ${StreamId},
        [Parameter(Position = 14, ValueFromPipelineByPropertyName = $true)]
        [PSCustomObject]
        ${Subject},
        [Parameter(Position = 15, ValueFromPipelineByPropertyName = $true)]
        [PSCustomObject]
        ${TopicLinks},
        [Parameter(Position = 16, ValueFromPipelineByPropertyName = $true)]
        [PSCustomObject]
        ${Submessages},
        [Parameter(Position = 17, ValueFromPipelineByPropertyName = $true)]
        [PSCustomObject]
        ${Timestamp},
        [Parameter(Position = 18, ValueFromPipelineByPropertyName = $true)]
        [PSCustomObject]
        ${Type},
        [Parameter(Position = 19, ValueFromPipelineByPropertyName = $true)]
        [String[]]
        ${Flags},
        [Parameter(Position = 20, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int32]]
        ${LastEditTimestamp},
        [Parameter(Position = 21, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${MatchContent},
        [Parameter(Position = 22, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${MatchSubject}
    )

    Process {
        'Creating PSCustomObject: PSOpenAPITools => GetMessages' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug


        $PSO = [PSCustomObject]@{
            "avatar_url" = ${AvatarUrl}
            "client" = ${Client}
            "content" = ${Content}
            "content_type" = ${ContentType}
            "display_recipient" = ${DisplayRecipient}
            "id" = ${Id}
            "is_me_message" = ${IsMeMessage}
            "reactions" = ${Reactions}
            "recipient_id" = ${RecipientId}
            "sender_email" = ${SenderEmail}
            "sender_full_name" = ${SenderFullName}
            "sender_id" = ${SenderId}
            "sender_realm_str" = ${SenderRealmStr}
            "stream_id" = ${StreamId}
            "subject" = ${Subject}
            "topic_links" = ${TopicLinks}
            "submessages" = ${Submessages}
            "timestamp" = ${Timestamp}
            "type" = ${Type}
            "flags" = ${Flags}
            "last_edit_timestamp" = ${LastEditTimestamp}
            "match_content" = ${MatchContent}
            "match_subject" = ${MatchSubject}
        }


        return $PSO
    }
}

<#
.SYNOPSIS

Convert from JSON to GetMessages<PSCustomObject>

.DESCRIPTION

Convert from JSON to GetMessages<PSCustomObject>

.PARAMETER Json

Json object

.OUTPUTS

GetMessages<PSCustomObject>
#>
function ConvertFrom-JsonToGetMessages {
    Param(
        [AllowEmptyString()]
        [string]$Json
    )

    Process {
        'Converting JSON to PSCustomObject: PSOpenAPITools => GetMessages' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $JsonParameters = ConvertFrom-Json -InputObject $Json

        # check if Json contains properties not defined in GetMessages
        $AllProperties = ("avatar_url", "client", "content", "content_type", "display_recipient", "id", "is_me_message", "reactions", "recipient_id", "sender_email", "sender_full_name", "sender_id", "sender_realm_str", "stream_id", "subject", "topic_links", "submessages", "timestamp", "type", "flags", "last_edit_timestamp", "match_content", "match_subject")
        foreach ($name in $JsonParameters.PsObject.Properties.Name) {
            if (!($AllProperties.Contains($name))) {
                throw "Error! JSON key '$name' not found in the properties: $($AllProperties)"
            }
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "avatar_url"))) { #optional property not found
            $AvatarUrl = $null
        } else {
            $AvatarUrl = $JsonParameters.PSobject.Properties["avatar_url"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "client"))) { #optional property not found
            $Client = $null
        } else {
            $Client = $JsonParameters.PSobject.Properties["client"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "content"))) { #optional property not found
            $Content = $null
        } else {
            $Content = $JsonParameters.PSobject.Properties["content"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "content_type"))) { #optional property not found
            $ContentType = $null
        } else {
            $ContentType = $JsonParameters.PSobject.Properties["content_type"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "display_recipient"))) { #optional property not found
            $DisplayRecipient = $null
        } else {
            $DisplayRecipient = $JsonParameters.PSobject.Properties["display_recipient"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "id"))) { #optional property not found
            $Id = $null
        } else {
            $Id = $JsonParameters.PSobject.Properties["id"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "is_me_message"))) { #optional property not found
            $IsMeMessage = $null
        } else {
            $IsMeMessage = $JsonParameters.PSobject.Properties["is_me_message"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "reactions"))) { #optional property not found
            $Reactions = $null
        } else {
            $Reactions = $JsonParameters.PSobject.Properties["reactions"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "recipient_id"))) { #optional property not found
            $RecipientId = $null
        } else {
            $RecipientId = $JsonParameters.PSobject.Properties["recipient_id"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "sender_email"))) { #optional property not found
            $SenderEmail = $null
        } else {
            $SenderEmail = $JsonParameters.PSobject.Properties["sender_email"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "sender_full_name"))) { #optional property not found
            $SenderFullName = $null
        } else {
            $SenderFullName = $JsonParameters.PSobject.Properties["sender_full_name"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "sender_id"))) { #optional property not found
            $SenderId = $null
        } else {
            $SenderId = $JsonParameters.PSobject.Properties["sender_id"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "sender_realm_str"))) { #optional property not found
            $SenderRealmStr = $null
        } else {
            $SenderRealmStr = $JsonParameters.PSobject.Properties["sender_realm_str"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "stream_id"))) { #optional property not found
            $StreamId = $null
        } else {
            $StreamId = $JsonParameters.PSobject.Properties["stream_id"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "subject"))) { #optional property not found
            $Subject = $null
        } else {
            $Subject = $JsonParameters.PSobject.Properties["subject"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "topic_links"))) { #optional property not found
            $TopicLinks = $null
        } else {
            $TopicLinks = $JsonParameters.PSobject.Properties["topic_links"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "submessages"))) { #optional property not found
            $Submessages = $null
        } else {
            $Submessages = $JsonParameters.PSobject.Properties["submessages"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "timestamp"))) { #optional property not found
            $Timestamp = $null
        } else {
            $Timestamp = $JsonParameters.PSobject.Properties["timestamp"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "type"))) { #optional property not found
            $Type = $null
        } else {
            $Type = $JsonParameters.PSobject.Properties["type"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "flags"))) { #optional property not found
            $Flags = $null
        } else {
            $Flags = $JsonParameters.PSobject.Properties["flags"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "last_edit_timestamp"))) { #optional property not found
            $LastEditTimestamp = $null
        } else {
            $LastEditTimestamp = $JsonParameters.PSobject.Properties["last_edit_timestamp"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "match_content"))) { #optional property not found
            $MatchContent = $null
        } else {
            $MatchContent = $JsonParameters.PSobject.Properties["match_content"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "match_subject"))) { #optional property not found
            $MatchSubject = $null
        } else {
            $MatchSubject = $JsonParameters.PSobject.Properties["match_subject"].value
        }

        $PSO = [PSCustomObject]@{
            "avatar_url" = ${AvatarUrl}
            "client" = ${Client}
            "content" = ${Content}
            "content_type" = ${ContentType}
            "display_recipient" = ${DisplayRecipient}
            "id" = ${Id}
            "is_me_message" = ${IsMeMessage}
            "reactions" = ${Reactions}
            "recipient_id" = ${RecipientId}
            "sender_email" = ${SenderEmail}
            "sender_full_name" = ${SenderFullName}
            "sender_id" = ${SenderId}
            "sender_realm_str" = ${SenderRealmStr}
            "stream_id" = ${StreamId}
            "subject" = ${Subject}
            "topic_links" = ${TopicLinks}
            "submessages" = ${Submessages}
            "timestamp" = ${Timestamp}
            "type" = ${Type}
            "flags" = ${Flags}
            "last_edit_timestamp" = ${LastEditTimestamp}
            "match_content" = ${MatchContent}
            "match_subject" = ${MatchSubject}
        }

        return $PSO
    }

}

