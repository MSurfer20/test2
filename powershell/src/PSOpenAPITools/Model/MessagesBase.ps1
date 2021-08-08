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

Object containing details of the message. 

.PARAMETER AvatarUrl
The URL of the user's avatar.  Can be null only if client_gravatar was passed, which means that the user has not uploaded an avatar in Zulip, and the client should compute the gravatar URL by hashing the user's email address itself for this user. 
.PARAMETER Client
A Zulip ""client"" string, describing what Zulip client sent the message. 
.PARAMETER Content
The content/body of the message. 
.PARAMETER ContentType
The HTTP `content_type` for the message content.  This will be `text/html` or `text/x-markdown`, depending on whether `apply_markdown` was set. 
.PARAMETER DisplayRecipient
Data on the recipient of the message; either the name of a stream or a dictionary containing basic data on the users who received the message. 
.PARAMETER Id
The unique message ID.  Messages should always be displayed sorted by ID. 
.PARAMETER IsMeMessage
Whether the message is a [/me status message][status-messages]  [status-messages]: /help/format-your-message-using-markdown#status-messages 
.PARAMETER Reactions
Data on any reactions to the message. 
.PARAMETER RecipientId
A unique ID for the set of users receiving the message (either a stream or group of users).  Useful primarily for hashing. 
.PARAMETER SenderEmail
The Zulip display email address of the message's sender. 
.PARAMETER SenderFullName
The full name of the message's sender. 
.PARAMETER SenderId
The user ID of the message's sender. 
.PARAMETER SenderRealmStr
A string identifier for the realm the sender is in.  Unique only within the context of a given Zulip server.  E.g. on `example.zulip.com`, this will be `example`. 
.PARAMETER StreamId
Only present for stream messages; the ID of the stream. 
.PARAMETER Subject
The `topic` of the message.  Currently always `""""` for private messages, though this could change if Zulip adds support for topics in private message conversations.  The field name is a legacy holdover from when topics were called ""subjects"" and will eventually change. 
.PARAMETER TopicLinks
Data on any links to be included in the `topic` line (these are generated by [custom linkification filters](/help/add-a-custom-linkifier) that match content in the message's topic.)  **Changes**: This field contained a list of urls before   Zulip 4.0 (feature level 46).  New in Zulip 3.0 (feature level 1): Previously, this field was called `subject_links`; clients are recommended to rename `subject_links` to `topic_links` if present for compatibility with older Zulip servers. 
.PARAMETER Submessages
Data used for certain experimental Zulip integrations. 
.PARAMETER Timestamp
The UNIX timestamp for when the message was sent, in UTC seconds. 
.PARAMETER Type
The type of the message: `stream` or `private`. 
.OUTPUTS

MessagesBase<PSCustomObject>
#>

function Initialize-MessagesBase {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${AvatarUrl},
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${Client},
        [Parameter(Position = 2, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${Content},
        [Parameter(Position = 3, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${ContentType},
        [Parameter(Position = 4, ValueFromPipelineByPropertyName = $true)]
        [PSCustomObject]
        ${DisplayRecipient},
        [Parameter(Position = 5, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int32]]
        ${Id},
        [Parameter(Position = 6, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Boolean]]
        ${IsMeMessage},
        [Parameter(Position = 7, ValueFromPipelineByPropertyName = $true)]
        [PSCustomObject[]]
        ${Reactions},
        [Parameter(Position = 8, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int32]]
        ${RecipientId},
        [Parameter(Position = 9, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${SenderEmail},
        [Parameter(Position = 10, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${SenderFullName},
        [Parameter(Position = 11, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int32]]
        ${SenderId},
        [Parameter(Position = 12, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${SenderRealmStr},
        [Parameter(Position = 13, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int32]]
        ${StreamId},
        [Parameter(Position = 14, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${Subject},
        [Parameter(Position = 15, ValueFromPipelineByPropertyName = $true)]
        [PSCustomObject[]]
        ${TopicLinks},
        [Parameter(Position = 16, ValueFromPipelineByPropertyName = $true)]
        [String[]]
        ${Submessages},
        [Parameter(Position = 17, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int32]]
        ${Timestamp},
        [Parameter(Position = 18, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${Type}
    )

    Process {
        'Creating PSCustomObject: PSOpenAPITools => MessagesBase' | Write-Debug
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
        }


        return $PSO
    }
}

<#
.SYNOPSIS

Convert from JSON to MessagesBase<PSCustomObject>

.DESCRIPTION

Convert from JSON to MessagesBase<PSCustomObject>

.PARAMETER Json

Json object

.OUTPUTS

MessagesBase<PSCustomObject>
#>
function ConvertFrom-JsonToMessagesBase {
    Param(
        [AllowEmptyString()]
        [string]$Json
    )

    Process {
        'Converting JSON to PSCustomObject: PSOpenAPITools => MessagesBase' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $JsonParameters = ConvertFrom-Json -InputObject $Json

        # check if Json contains properties not defined in MessagesBase
        $AllProperties = ("avatar_url", "client", "content", "content_type", "display_recipient", "id", "is_me_message", "reactions", "recipient_id", "sender_email", "sender_full_name", "sender_id", "sender_realm_str", "stream_id", "subject", "topic_links", "submessages", "timestamp", "type")
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
        }

        return $PSO
    }

}
