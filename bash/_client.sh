#compdef 

# !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
# !
# ! Note:
# !
# ! THIS SCRIPT HAS BEEN AUTOMATICALLY GENERATED USING
# ! openapi-generator (https://openapi-generator.tech)
# ! FROM OPENAPI SPECIFICATION IN JSON.
# !
# ! Based on: https://github.com/Valodim/zsh-curl-completion/blob/master/_curl
# !
# !
# !
# ! Installation:
# !
# ! Copy the _ file to any directory under FPATH
# ! environment variable (echo $FPATH)
# !
# !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!


local curcontext="$curcontext" state line ret=1
typeset -A opt_args

typeset -A mime_type_abbreviations
# text/*
mime_type_abbreviations[text]="text/plain"
mime_type_abbreviations[html]="text/html"
mime_type_abbreviations[md]="text/x-markdown"
mime_type_abbreviations[csv]="text/csv"
mime_type_abbreviations[css]="text/css"
mime_type_abbreviations[rtf]="text/rtf"
# application/*
mime_type_abbreviations[json]="application/json"
mime_type_abbreviations[xml]="application/xml"
mime_type_abbreviations[yaml]="application/yaml"
mime_type_abbreviations[js]="application/javascript"
mime_type_abbreviations[bin]="application/octet-stream"
mime_type_abbreviations[rdf]="application/rdf+xml"
# image/*
mime_type_abbreviations[jpg]="image/jpeg"
mime_type_abbreviations[png]="image/png"
mime_type_abbreviations[gif]="image/gif"
mime_type_abbreviations[bmp]="image/bmp"
mime_type_abbreviations[tiff]="image/tiff"

#
# Generate zsh completion string list for abbreviated mime types
#
get_mime_type_completions() {
    typeset -a result
    result=()
    for k in "${(@k)mime_type_abbreviations}"; do
        value=$mime_type_abbreviations[${k}]
        #echo $value
        result+=( "${k}[${value}]" )
        #echo $result
    done
    echo "$result"
}

#
# cURL crypto engines completion function
#
_curl_crypto_engine() {
    local vals
    vals=( ${${(f)"$(curl --engine list)":gs/ /}[2,$]} )
    _describe -t outputs 'engines' vals && return 0
}

#
# cURL post data completion functions=
#
_curl_post_data() {

    # don't do anything further if this is raw content
    compset -P '=' && _message 'raw content' && return 0

    # complete filename or stdin for @ syntax
    compset -P '*@' && {
        local expl
        _description files expl stdin
        compadd "$expl[@]" - "-"
        _files
        return 0
    }

    # got a name already? expecting data.
    compset -P '*=' && _message 'data value' && return 0

    # otherwise, name (or @ or =) should be specified
    _message 'data name' && return 0

}


local arg_http arg_ftp arg_other arg_proxy arg_crypto arg_connection arg_auth arg_input arg_output

# HTTP Arguments
arg_http=(''\
  {-0,--http1.0}'[force use of use http 1.0 instead of 1.1]' \
  {-b,--cookie}'[pass data to http server as cookie]:data or file' \
  {-c,--cookie-jar}'[specify cookie file]:file name:_files' \
  {-d,--data}'[send specified data as HTTP POST data]:data:{_curl_post_data}' \
  '--data-binary[post HTTP POST data without any processing]:data:{_curl_post_data}' \
  '--data-urlencode[post HTTP POST data, with url encoding]:data:{_curl_post_data}' \
  {-f,--fail}'[enable failfast behavior for server errors]' \
  '*'{-F,--form}'[add POST form data]:name=content' \
  {-G,--get}'[use HTTP GET even with data (-d, --data, --data-binary)]' \
  '*'{-H,--header}'[specify an extra header]:header' \
  '--ignore-content-length[ignore Content-Length header]' \
  {-i,--include}'[include HTTP header in the output]' \
  {-j,--junk-session-cookies}'[discard all session cookies]' \
  {-e,--referer}'[send url as referer]:referer url:_urls' \
  {-L,--location}'[follow Location headers on http 3XX response]' \
  '--location-trusted[like --location, but allows sending of auth data to redirected hosts]' \
  '--max-redirs[set maximum number of redirection followings allowed]:number' \
  {-J,--remote-header-name}'[use Content-Disposition for output file name]' \
  {-O,--remote-name}'[write to filename parsed from url instead of stdout]' \
  '--post301[do not convert POST to GET after following 301 Location response (follow RFC 2616/10.3.2)]' \
  '--post302[do not convert POST to GET after following 302 Location response (follow RFC 2616/10.3.2)]' \
  )

# FTP arguments
arg_ftp=(\
  {-a,--append}'[append to target file instead of overwriting (FTP/SFTP)]' \
  '--crlf[convert LF to CRLF in upload]' \
  '--disable-eprt[disable use of EPRT and LPRT for active FTP transfers]' \
  '--disable-epsv[disable use of EPSV for passive FTP transfers]' \
  '--ftp-account[account data (FTP)]:data' \
  '--ftp-alternative-to-user[command to send when USER and PASS commands fail (FTP)]:command' \
  '--ftp-create-dirs[create paths remotely if it does not exist]' \
  '--ftp-method[ftp method to use to reach a file (FTP)]:method:(multicwd ocwd singlecwd)' \
  '--ftp-pasv[use passive mode for the data connection (FTP)]' \
  '--ftp-skip-pasv-ip[do not use the ip the server suggests for PASV]' \
  '--form-string[like --form, but do not parse content]:name=string' \
  '--ftp-pret[send PRET before PASV]' \
  '--ftp-ssl-ccc[use clear command channel (CCC) after authentication (FTP)]' \
  '--ftp-ssl-ccc-mode[sets the CCC mode (FTP)]:mode:(active passive)' \
  '--ftp-ssl-control[require SSL/TLS for FTP login, clear for transfer]' \
  {-l,--list-only}'[list names only when listing directories (FTP)]' \
  {-P,--ftp-port}'[use active mode, tell server to connect to specified address or interface (FTP]:address' \
  '*'{-Q,--quote}'[send arbitrary command to the remote server before transfer (FTP/SFTP)]:command' \
  )

# Other Protocol arguments
arg_other=(\
  '--mail-from[specify From: address]:address' \
  '--mail-rcpt[specify email recipient for SMTP, may be given multiple times]:address' \
  {-t,--telnet-option}'[pass options to telnet protocol]:opt=val' \
  '--tftp-blksize[set tftp BLKSIZE option]:value' \
  )

# Proxy arguments
arg_proxy=(\
  '--noproxy[list of hosts to connect directly to instead of through proxy]:no-proxy-list' \
  {-p,--proxytunnel}'[tunnel non-http protocols through http proxy]' \
  {-U,--proxy-user}'[specify the user name and password to use for proxy authentication]:user:password' \
  '--proxy-anyauth[use any authentication method for proxy, default to most secure]' \
  '--proxy-basic[use HTTP Basic authentication for proxy]' \
  '--proxy-digest[use http digest authentication for proxy]' \
  '--proxy-negotiate[enable GSS-Negotiate authentication for proxy]' \
  '--proxy-ntlm[enable ntlm authentication for proxy]' \
  '--proxy1.0[use http 1.0 proxy]:proxy url' \
  {-x,--proxy}'[use specified proxy]:proxy url' \
  '--socks5-gssapi-service[change service name for socks server]:servicename' \
  '--socks5-gssapi-nec[allow unprotected exchange of protection mode negotiation]' \
  )

# Crypto arguments
arg_crypto=(\
  {-1,--tlsv1}'[Forces curl to use TLS version 1 when negotiating with a remote TLS server.]' \
  {-2,--sslv2}'[Forces curl to use SSL version 2 when negotiating with a remote SSL server.]' \
  {-3,--sslv3}'[Forces curl to use SSL version 3 when negotiating with a remote SSL server.]' \
  '--ciphers[specifies which cipher to use for the ssl connection]:list of ciphers' \
  '--crlfile[specify file with revoked certificates]:file' \
  '--delegation[set delegation policy to use with GSS/kerberos]:delegation policy:(none policy always)' \
  {-E,--cert}'[use specified client certificate]:certificate file:_files' \
  '--engine[use selected OpenSSL crypto engine]:ssl crypto engine:{_curl_crypto_engine}' \
  '--egd-file[set ssl entropy gathering daemon socket]:entropy socket:_files' \
  '--cert-type[specify certificate type (PEM, DER, ENG)]:certificate type:(PEM DER ENG)' \
  '--cacert[specify certificate file to verify the peer with]:CA certificate:_files' \
  '--capath[specify a search path for certificate files]:CA certificate directory:_directories' \
  '--hostpubmd5[check remote hosts public key]:md5 hash' \
  {-k,--insecure}'[allow ssl to perform insecure ssl connections (ie, ignore certificate)]' \
  '--key[ssl/ssh private key file name]:key file:_files' \
  '--key-type[ssl/ssh private key file type]:file type:(PEM DER ENG)' \
  '--pubkey[ssh public key file]:pubkey file:_files' \
  '--random-file[set source of random data for ssl]:random source:_files' \
  '--no-sessionid[disable caching of ssl session ids]' \
  '--pass:phrase[passphrase for ssl/ssh private key]' \
  '--ssl[try to use ssl/tls for connection, if available]' \
  '--ssl-reqd[try to use ssl/tls for connection, fail if unavailable]' \
  '--tlsauthtype[set TLS authentication type (only SRP supported!)]:authtype' \
  '--tlsuser[set username for TLS authentication]:user' \
  '--tlspassword[set password for TLS authentication]:password' \
  )

# Connection arguments
arg_connection=(\
  {-4,--ipv4}'[prefer ipv4]' \
  {-6,--ipv6}'[prefer ipv6, if available]' \
  {-B,--use-ascii}'[use ascii mode]' \
  '--compressed[request a compressed transfer]' \
  '--connect-timeout[timeout for connection phase]:seconds' \
  {-I,--head}'[fetch http HEAD only (HTTP/FTP/FILE]' \
  '--interface[work on a specific interface]:name' \
  '--keepalive-time[set time to wait before sending keepalive probes]:seconds' \
  '--limit-rate[specify maximum transfer rate]:speed' \
  '--local-port[set preferred number or range of local ports to use]:num' \
  {-N,--no-buffer}'[disable buffering of the output stream]' \
  '--no-keepalive[disable use of keepalive messages in TCP connections]' \
  '--raw[disable all http decoding and pass raw data]' \
  '--resolve[provide a custom address for a specific host and port pair]:host\:port\:address' \
  '--retry[specify maximum number of retries for transient errors]:num' \
  '--retry-delay[specify delay between retries]:seconds' \
  '--retry-max-time[maximum time to spend on retries]:seconds' \
  '--tcp-nodelay[turn on TCP_NODELAY option]' \
  {-y,--speed-time}'[specify time to abort after if download is slower than speed-limit]:time' \
  {-Y,--speed-limit}'[specify minimum speed for --speed-time]:speed' \
  )

# Authentication arguments
arg_auth=(\
  '--anyauth[use any authentication method, default to most secure]' \
  '--basic[use HTTP Basic authentication]' \
  '--ntlm[enable ntlm authentication]' \
  '--digest[use http digest authentication]' \
  '--krb[use kerberos authentication]:auth:(clear safe confidential private)' \
  '--negotiate[enable GSS-Negotiate authentication]' \
  {-n,--netrc}'[scan ~/.netrc for login data]' \
  '--netrc-optional[like --netrc, but does not make .netrc usage mandatory]' \
  '--netrc-file[like --netrc, but specify file to use]:netrc file:_files' \
  '--tr-encoding[request compressed transfer-encoding]' \
  {-u,--user}'[specify user name and password for server authentication]:user\:password' \
  )

# Input arguments
arg_input=(\
  {-C,--continue-at}'[resume at offset ]:offset' \
  {-g,--globoff}'[do not glob {}\[\] letters]' \
  '--max-filesize[maximum filesize to download, fail for bigger files]:bytes' \
  '--proto[specify allowed protocols for transfer]:protocols' \
  '--proto-redir[specify allowed protocols for transfer after a redirect]:protocols' \
  {-r,--range}'[set range of bytes to request (HTTP/FTP/SFTP/FILE)]:range' \
  {-R,--remote-time}'[use timestamp of remote file for local file]' \
  {-T,--upload-file}'[transfer file to remote url (using PUT for HTTP)]:file to upload:_files' \
  '--url[specify a URL to fetch (multi)]:url:_urls' \
  {-z,--time-cond}'[request downloaded file to be newer than date or given reference file]:date expression' \
  )

# Output arguments
arg_output=(\
  '--create-dirs[create local directory hierarchy as needed]' \
  {-D,--dump-header}'[write protocol headers to file]:dump file:_files' \
  {-o,--output}'[write to specified file instead of stdout]:output file:_files' \
  {--progress-bar,-\#}'[display progress as a simple progress bar]' \
  {-\#,--progress-bar}'[Make curl display progress as a simple progress bar instead of the standard, more informational, meter.]' \
  {-R,--remote-time}'[use timestamp of remote file for local file]' \
  '--raw[disable all http decoding and pass raw data]' \
  {-s,--silent}'[silent mode, do not show progress meter or error messages]' \
  {-S,--show-error}'[show errors in silent mode]' \
  '--stderr[redirect stderr to specified file]:output file:_files' \
  '--trace[enable full trace dump of all incoming and outgoing data]:trace file:_files' \
  '--trace-ascii[enable full trace dump of all incoming and outgoing data, without hex data]:trace file:_files' \
  '--trace-time[prepends a time stamp to each trace or verbose line that curl displays]' \
  {-v,--verbose}'[output debug info]' \
  {-w,--write-out}'[specify message to output on successful operation]:format string' \
  '--xattr[store some file metadata in extended file attributes]' \
  {-X,--request}'[specifies request method for HTTP server]:method:(GET POST PUT DELETE HEAD OPTIONS TRACE CONNECT PATCH LINK UNLINK)' \
  )

_arguments -C -s $arg_http $arg_ftp $arg_other $arg_crypto $arg_connection $arg_auth $arg_input $arg_output \
  {-M,--manual}'[Print manual]' \
  '*'{-K,--config}'[Use other config file to read arguments from]:config file:_files' \
  '--libcurl[output libcurl code for the operation to file]:output file:_files' \
  {-m,--max-time}'[Limit total time of operation]:seconds' \
  {-s,--silent}'[Silent mode, do not show progress meter or error messages]' \
  {-S,--show-error}'[Show errors in silent mode]' \
  '--stderr[Redirect stderr to specified file]:output file:_files' \
  '-q[Do not read settings from .curlrc (must be first option)]' \
  {-h,--help}'[Print help and list of operations]' \
  {-V,--version}'[Print service API version]' \
  '--about[Print the information about service]' \
  '--host[Specify the host URL]':URL:_urls \
  '--dry-run[Print out the cURL command without executing it]' \
  {-ac,--accept}'[Set the Accept header in the request]: :{_values "Accept mime type" $(get_mime_type_completions)}' \
  {-ct,--content-type}'[Set the Content-type header in request]: :{_values "Content mime type" $(get_mime_type_completions)}' \
  '1: :->ops' \
  '*:: :->args' \
  && ret=0


case $state in
  ops)
    # Operations
    _values "Operations" \
            "devFetchApiKey[Fetch an API key (development only)]" \
            "fetchApiKey[Fetch an API key (production)]"             "createDrafts[Create drafts]" \
            "deleteDraft[Delete a draft]" \
            "editDraft[Edit a draft]" \
            "getDrafts[Get drafts]"             "addReaction[Add an emoji reaction]" \
            "checkMessagesMatchNarrow[Check if messages match a narrow]" \
            "deleteMessage[Delete a message]" \
            "getFileTemporaryUrl[Get public temporary URL]" \
            "getMessageHistory[Get a message's edit history]" \
            "getMessages[Get messages]" \
            "getRawMessage[Get a message's raw Markdown]" \
            "markAllAsRead[Mark all messages as read]" \
            "markStreamAsRead[Mark messages in a stream as read]" \
            "markTopicAsRead[Mark messages in a topic as read]" \
            "removeReaction[Remove an emoji reaction]" \
            "renderMessage[Render message]" \
            "sendMessage[Send a message]" \
            "updateMessage[Edit a message]" \
            "updateMessageFlags[Update personal message flags]" \
            "uploadFile[Upload a file]"             "deleteQueue[Delete an event queue]" \
            "getEvents[Get events from an event queue]" \
            "realTimePost[]" \
            "registerQueue[Register an event queue]" \
            "restErrorHandling[Error handling]"             "addCodePlayground[Add a code playground]" \
            "addLinkifier[Add a linkifier]" \
            "createCustomProfileField[Create a custom profile field]" \
            "getCustomEmoji[Get all custom emoji]" \
            "getCustomProfileFields[Get all custom profile fields]" \
            "getLinkifiers[Get linkifiers]" \
            "getServerSettings[Get server settings]" \
            "removeCodePlayground[Remove a code playground]" \
            "removeLinkifier[Remove a linkifier]" \
            "reorderCustomProfileFields[Reorder custom profile fields]" \
            "updateLinkifier[Update a linkifier]" \
            "uploadCustomEmoji[Upload custom emoji]"             "archiveStream[Archive a stream]" \
            "createBigBlueButtonVideoCall[Create BigBlueButton video call]" \
            "deleteTopic[Delete a topic]" \
            "getStreamId[Get stream ID]" \
            "getStreamTopics[Get topics in a stream]" \
            "getStreams[Get all streams]" \
            "getSubscribers[Get the subscribers of a stream]" \
            "getSubscriptionStatus[Get subscription status]" \
            "getSubscriptions[Get subscribed streams]" \
            "muteTopic[Topic muting]" \
            "subscribe[Subscribe to a stream]" \
            "unsubscribe[Unsubscribe from a stream]" \
            "updateStream[Update a stream]" \
            "updateSubscriptionSettings[Update subscription settings]" \
            "updateSubscriptions[Update subscriptions]"             "createUser[Create a user]" \
            "createUserGroup[Create a user group]" \
            "deactivateOwnUser[Deactivate own user]" \
            "deactivateUser[Deactivate a user]" \
            "getAttachments[Get attachments]" \
            "getOwnUser[Get own user]" \
            "getUser[Get a user]" \
            "getUserByEmail[Get a user by email]" \
            "getUserGroups[Get user groups]" \
            "getUserPresence[Get user presence]" \
            "getUsers[Get all users]" \
            "muteUser[Mute a user]" \
            "reactivateUser[Reactivate a user]" \
            "removeUserGroup[Delete a user group]" \
            "setTypingStatus[Set \"typing\" status]" \
            "unmuteUser[Unmute a user]" \
            "updateSettings[Update settings]" \
            "updateStatus[Update your status]" \
            "updateUser[Update a user]" \
            "updateUserGroup[Update a user group]" \
            "updateUserGroupMembers[Update user group members]"             "zulipOutgoingWebhooks[Outgoing webhooks]" \

    _arguments "(--help)--help[Print information about operation]"

    ret=0
    ;;
  args)
    case $line[1] in
      devFetchApiKey)
        local -a _op_arguments
        _op_arguments=(
                    "username=:[QUERY] The email address for the user that owns the API key."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      fetchApiKey)
        local -a _op_arguments
        _op_arguments=(
                    "username=:[QUERY] The username to be used for authentication (typically, the email
address, but depending on configuration, it could be an LDAP username).

See the &#39;require_email_format_usernames&#39; parameter documented in
[GET /server_settings](/api/get-server-settings) for details."
"password=:[QUERY] The user&#39;s Zulip password (or LDAP password, if LDAP authentication is in use)."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      createDrafts)
        local -a _op_arguments
        _op_arguments=(
                    "drafts=:[QUERY] A JSON-encoded list of containing new draft objects."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      deleteDraft)
        local -a _op_arguments
        _op_arguments=(
          "draft_id=:[PATH] The ID of the draft you want to delete."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      editDraft)
        local -a _op_arguments
        _op_arguments=(
          "draft_id=:[PATH] The ID of the draft to be edited."
          "draft=:[QUERY] A JSON-encoded object containing a replacement draft object for this ID."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getDrafts)
        local -a _op_arguments
        _op_arguments=(
                              )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      addReaction)
        local -a _op_arguments
        _op_arguments=(
          "message_id=:[PATH] The target message&#39;s ID."
          "emoji_name=:[QUERY] The target emoji&#39;s human-readable name.

To find an emoji&#39;s name, hover over a message to reveal
three icons on the right, then click the smiley face icon.
Images of available reaction emojis appear. Hover over the
emoji you want, and note that emoji&#39;s text name."
"emoji_code=:[QUERY] A unique identifier, defining the specific emoji codepoint requested,
within the namespace of the &#39;reaction_type&#39;.

For most API clients, you won&#39;t need this, but it&#39;s important
for Zulip apps to handle rare corner cases when
adding/removing votes on an emoji reaction added previously by
another user.

If the existing reaction was added when the Zulip server was
using a previous version of the emoji data mapping between
Unicode codepoints and human-readable names, sending the
&#39;emoji_code&#39; in the data for the original reaction allows the
Zulip server to correctly interpret your upvote as an upvote
rather than a reaction with a \&quot;diffenent\&quot; emoji."
"reaction_type=:[QUERY] If an app is adding/removing a vote on an existing reaction,
it should pass this parameter using the value the server provided
for the existing reaction for specificity.  Supported values:

* &#39;unicode_emoji&#39;: Unicode emoji (&#39;emoji_code&#39; will be its Unicode codepoint).
* &#39;realm_emoji&#39;: Custom emoji. (&#39;emoji_code&#39; will be its ID).
* &#39;zulip_extra_emoji&#39;: Special emoji included with Zulip.  Exists to
   namespace the &#39;zulip&#39; emoji.

**Changes**: In Zulip 3.0 (feature level 2), this become
optional for [custom emoji](/help/add-custom-emoji);
previously, this endpoint assumed &#39;unicode_emoji&#39; if this
parameter was not specified."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      checkMessagesMatchNarrow)
        local -a _op_arguments
        _op_arguments=(
                    "msg_ids=:[QUERY] List of IDs for the messages to check."
"narrow=:[QUERY] A structure defining the narrow to check against. See how to [construct a narrow](/api/construct-narrow)."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      deleteMessage)
        local -a _op_arguments
        _op_arguments=(
          "message_id=:[PATH] The target message&#39;s ID."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getFileTemporaryUrl)
        local -a _op_arguments
        _op_arguments=(
          "realm_id_str=:[PATH] The realm id."
"filename=:[PATH] Path to the URL."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getMessageHistory)
        local -a _op_arguments
        _op_arguments=(
          "message_id=:[PATH] The target message&#39;s ID."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getMessages)
        local -a _op_arguments
        _op_arguments=(
                    "anchor=:[QUERY] Integer message ID to anchor fetching of new messages. Supports special
string values for when the client wants the server to compute the anchor
to use:

* &#39;newest&#39;: The most recent message.
* &#39;oldest&#39;: The oldest message.
* &#39;first_unread&#39;: The oldest unread message matching the
  query, if any; otherwise, the most recent message.

The special values of &#39;&#39;newest&#39;&#39; and &#39;&#39;oldest&#39;&#39; are also supported
for anchoring the query at the most recent or oldest messages.

**Changes**: String values are new in Zulip 3.0 (feature level 1).  The
  &#39;first_unread&#39; functionality was supported in Zulip 2.1.x
  and older by not sending anchor and using use_first_unread_anchor.

  In Zulip 2.1.x and older, &#39;oldest&#39; can be emulated with
  &#39;anchor&#x3D;0&#39;, and &#39;newest&#39; with &#39;anchor&#x3D;10000000000000000&#39;
  (that specific large value works around a bug in Zulip
  2.1.x and older in the &#39;found_newest&#39; return value)."
"num_before=:[QUERY] The number of messages with IDs less than the anchor to retrieve."
"num_after=:[QUERY] The number of messages with IDs greater than the anchor to retrieve."
"narrow=:[QUERY] The narrow where you want to fetch the messages from. See how to
[construct a narrow](/api/construct-narrow)."
"client_gravatar=true:[QUERY] Whether the client supports computing gravatars URLs.  If
enabled, &#39;avatar_url&#39; will be included in the response only
if there is a Zulip avatar, and will be &#39;null&#39; for users who
are using gravatar as their avatar.  This option
significantly reduces the compressed size of user data,
since gravatar URLs are long, random strings and thus do not
compress well. The &#39;client_gravatar&#39; field is set to &#39;true&#39; if
clients can compute their own gravatars."
          "client_gravatar=false:[QUERY] Whether the client supports computing gravatars URLs.  If
enabled, &#39;avatar_url&#39; will be included in the response only
if there is a Zulip avatar, and will be &#39;null&#39; for users who
are using gravatar as their avatar.  This option
significantly reduces the compressed size of user data,
since gravatar URLs are long, random strings and thus do not
compress well. The &#39;client_gravatar&#39; field is set to &#39;true&#39; if
clients can compute their own gravatars."
"apply_markdown=true:[QUERY] If &#39;true&#39;, message content is returned in the rendered HTML
format. If &#39;false&#39;, message content is returned in the raw
Markdown-format text that user entered."
          "apply_markdown=false:[QUERY] If &#39;true&#39;, message content is returned in the rendered HTML
format. If &#39;false&#39;, message content is returned in the raw
Markdown-format text that user entered."
"use_first_unread_anchor=true:[QUERY] Legacy way to specify &#39;anchor&#x3D;\&quot;first_unread\&quot;&#39; in Zulip 2.1.x and older.

Whether to use the (computed by the server) first unread message
matching the narrow as the &#39;anchor&#39;.  Mutually exclusive with &#39;anchor&#39;.

**Changes**: Deprecated in Zulip 3.0, replaced by
&#39;anchor&#x3D;\&quot;first_unread\&quot;&#39; instead."
          "use_first_unread_anchor=false:[QUERY] Legacy way to specify &#39;anchor&#x3D;\&quot;first_unread\&quot;&#39; in Zulip 2.1.x and older.

Whether to use the (computed by the server) first unread message
matching the narrow as the &#39;anchor&#39;.  Mutually exclusive with &#39;anchor&#39;.

**Changes**: Deprecated in Zulip 3.0, replaced by
&#39;anchor&#x3D;\&quot;first_unread\&quot;&#39; instead."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getRawMessage)
        local -a _op_arguments
        _op_arguments=(
          "message_id=:[PATH] The target message&#39;s ID."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      markAllAsRead)
        local -a _op_arguments
        _op_arguments=(
                              )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      markStreamAsRead)
        local -a _op_arguments
        _op_arguments=(
                    "stream_id=:[QUERY] The ID of the stream to access."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      markTopicAsRead)
        local -a _op_arguments
        _op_arguments=(
                    "stream_id=:[QUERY] The ID of the stream to access."
"topic_name=:[QUERY] The name of the topic whose messages should be marked as read."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      removeReaction)
        local -a _op_arguments
        _op_arguments=(
          "message_id=:[PATH] The target message&#39;s ID."
          "emoji_name=:[QUERY] The target emoji&#39;s human-readable name.

To find an emoji&#39;s name, hover over a message to reveal
three icons on the right, then click the smiley face icon.
Images of available reaction emojis appear. Hover over the
emoji you want, and note that emoji&#39;s text name."
"emoji_code=:[QUERY] A unique identifier, defining the specific emoji codepoint requested,
within the namespace of the &#39;reaction_type&#39;.

For most API clients, you won&#39;t need this, but it&#39;s important
for Zulip apps to handle rare corner cases when
adding/removing votes on an emoji reaction added previously by
another user.

If the existing reaction was added when the Zulip server was
using a previous version of the emoji data mapping between
Unicode codepoints and human-readable names, sending the
&#39;emoji_code&#39; in the data for the original reaction allows the
Zulip server to correctly interpret your upvote as an upvote
rather than a reaction with a \&quot;diffenent\&quot; emoji."
"reaction_type=:[QUERY] If an app is adding/removing a vote on an existing reaction,
it should pass this parameter using the value the server provided
for the existing reaction for specificity.  Supported values:

* &#39;unicode_emoji&#39;: Unicode emoji (&#39;emoji_code&#39; will be its Unicode codepoint).
* &#39;realm_emoji&#39;: Custom emoji. (&#39;emoji_code&#39; will be its ID).
* &#39;zulip_extra_emoji&#39;: Special emoji included with Zulip.  Exists to
   namespace the &#39;zulip&#39; emoji.

**Changes**: In Zulip 3.0 (feature level 2), this become
optional for [custom emoji](/help/add-custom-emoji);
previously, this endpoint assumed &#39;unicode_emoji&#39; if this
parameter was not specified."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      renderMessage)
        local -a _op_arguments
        _op_arguments=(
                    "content=:[QUERY] The content of the message. Maximum message size of 10000 bytes."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      sendMessage)
        local -a _op_arguments
        _op_arguments=(
                    "type=:[QUERY] The type of message to be sent. &#39;private&#39; for a private message and
&#39;stream&#39; for a stream message."
"to=:[QUERY] For stream messages, either the name or integer ID of the stream. For
private messages, either a list containing integer user IDs or a list
containing string email addresses.

**Changes**: Support for using user/stream IDs was added in Zulip 2.0.0."
"content=:[QUERY] The content of the message. Maximum message size of 10000 bytes."
"topic=:[QUERY] The topic of the message. Only required for stream messages
(&#39;type&#x3D;\&quot;stream\&quot;&#39;), ignored otherwise.

Maximum length of 60 characters.

**Changes**: New in Zulip 2.0.  Previous Zulip releases encoded
this as &#39;subject&#39;, which is currently a deprecated alias."
"queue_id=:[QUERY] For clients supporting
[local echo](https://zulip.readthedocs.io/en/latest/subsystems/sending-messages.html#local-echo),
the [event queue](/api/register-queue)
ID for the client.  If passed, &#39;local_id&#39; is required.  If the message is
successfully sent, the server will include &#39;local_id&#39; in the &#39;message&#39; event
that the client with this &#39;queue_id&#39; will receive notifying it of the new message
via [&#39;GET /events&#39;](/api/get-events).  This lets the client know unambiguously
that it should replace the locally echoed message, rather than adding this new
message (which would be correct if the user had sent the new message from another
device)."
"local_id=:[QUERY] For clients supporting local echo, a unique string-format identifier
chosen freely by the client; the server will pass it back to the client without
inspecting it, as described in the &#39;queue_id&#39; description."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      updateMessage)
        local -a _op_arguments
        _op_arguments=(
          "message_id=:[PATH] The target message&#39;s ID."
          "topic=:[QUERY] The topic to move the message(s) to, to request changing the topic.
Should only be sent when changing the topic, and will throw an error
if the target message is not a stream message.

Maximum length of 60 characters.

**Changes**: New in Zulip 2.0.  Previous Zulip releases encoded
this as &#39;subject&#39;, which is currently a deprecated alias."
"propagate_mode=:[QUERY] Which message(s) should be edited: just the one indicated in
&#39;message_id&#39;, messages in the same topic that had been sent after this
one, or all of them.

Only the default value of &#39;change_one&#39; is valid when
editing only the content of a message.

This parameter determines both which messages get moved and also whether
clients that are currently narrowed to the topic containing the message
should navigate or adjust their compose box recipient to point to the
post-edit stream/topic."
"send_notification_to_old_thread=true:[QUERY] Whether to send breadcrumb message to the old thread to
notify users where the messages were moved to.

**Changes**: New in Zulip 3.0 (feature level 9)."
          "send_notification_to_old_thread=false:[QUERY] Whether to send breadcrumb message to the old thread to
notify users where the messages were moved to.

**Changes**: New in Zulip 3.0 (feature level 9)."
"send_notification_to_new_thread=true:[QUERY] Whether to send a notification message to the new thread to
notify users where the messages came from.

**Changes**: New in Zulip 3.0 (feature level 9)."
          "send_notification_to_new_thread=false:[QUERY] Whether to send a notification message to the new thread to
notify users where the messages came from.

**Changes**: New in Zulip 3.0 (feature level 9)."
"content=:[QUERY] The content of the message. Maximum message size of 10000 bytes."
"stream_id=:[QUERY] The stream ID to move the message(s) to, to request moving
messages to another stream.

Should only be sent when changing the stream, and will throw an error
if the target message is not a stream message."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      updateMessageFlags)
        local -a _op_arguments
        _op_arguments=(
                    "messages=:[QUERY] An array containing the IDs of the target messages."
"op=:[QUERY] Whether to &#39;add&#39; the flag or &#39;remove&#39; it."
"flag=:[QUERY] The flag that should be added/removed."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      uploadFile)
        local -a _op_arguments
        _op_arguments=(
                              )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      deleteQueue)
        local -a _op_arguments
        _op_arguments=(
                    "queue_id=:[QUERY] The ID of an event queue that was previously registered via &#39;POST
/api/v1/register&#39; (see [Register a queue](/api/register-queue))."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getEvents)
        local -a _op_arguments
        _op_arguments=(
                    "queue_id=:[QUERY] The ID of an event queue that was previously registered via &#39;POST
/api/v1/register&#39; (see [Register a queue](/api/register-queue))."
"last_event_id=:[QUERY] The highest event ID in this queue that you&#39;ve received and
wish to acknowledge. See the [code for
&#39;call_on_each_event&#39;](https://github.com/zulip/python-zulip-api/blob/master/zulip/zulip/__init__.py)
in the [zulip Python
module](https://github.com/zulip/python-zulip-api) for an
example implementation of correctly processing each event
exactly once."
"dont_block=true:[QUERY] Set to &#39;true&#39; if the client is requesting a nonblocking reply. If not
specified, the request will block until either a new event is available
or a few minutes have passed, in which case the server will send the
client a heartbeat event."
          "dont_block=false:[QUERY] Set to &#39;true&#39; if the client is requesting a nonblocking reply. If not
specified, the request will block until either a new event is available
or a few minutes have passed, in which case the server will send the
client a heartbeat event."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      realTimePost)
        local -a _op_arguments
        _op_arguments=(
                    "event_types=:[QUERY] A JSON-encoded array indicating which types of events you&#39;re interested
in. Values that you might find useful include:

  * **message** (messages)
  * **subscription** (changes in your subscriptions)
  * **realm_user** (changes to users in the organization and
    their properties, such as their name).

If you do not specify this parameter, you will receive all
events, and have to filter out the events not relevant to
your client in your client code.  For most applications, one
is only interested in messages, so one specifies:
&#39;event_types&#x3D;[&#39;message&#39;]&#39;

Event types not supported by the server are ignored, in order to simplify
the implementation of client apps that support multiple server versions."
"narrow=:[QUERY] A JSON-encoded array of arrays of length 2 indicating the
narrow for which you&#39;d like to receive events for. For
instance, to receive events for the stream &#39;Denmark&#39;, you
would specify &#39;narrow&#x3D;[[&#39;stream&#39;, &#39;Denmark&#39;]]&#39;.  Another
example is &#39;narrow&#x3D;[[&#39;is&#39;, &#39;private&#39;]]&#39; for private messages.
Default is &#39;[]&#39;."
"all_public_streams=true:[QUERY] Whether you would like to request message events from all public
streams.  Useful for workflow bots that you&#39;d like to see all new messages
sent to public streams.  (You can also subscribe the user to private streams)."
          "all_public_streams=false:[QUERY] Whether you would like to request message events from all public
streams.  Useful for workflow bots that you&#39;d like to see all new messages
sent to public streams.  (You can also subscribe the user to private streams)."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      registerQueue)
        local -a _op_arguments
        _op_arguments=(
                    "apply_markdown=true:[QUERY] Set to &#39;true&#39; if you would like the content to be rendered in HTML
format (otherwise the API will return the raw text that the user
entered)"
          "apply_markdown=false:[QUERY] Set to &#39;true&#39; if you would like the content to be rendered in HTML
format (otherwise the API will return the raw text that the user
entered)"
"client_gravatar=true:[QUERY] Whether the client supports computing gravatars URLs.  If
enabled, &#39;avatar_url&#39; will be included in the response only
if there is a Zulip avatar, and will be &#39;null&#39; for users who
are using gravatar as their avatar.  This option
significantly reduces the compressed size of user data,
since gravatar URLs are long, random strings and thus do not
compress well. The &#39;client_gravatar&#39; field is set to &#39;true&#39; if
clients can compute their own gravatars."
          "client_gravatar=false:[QUERY] Whether the client supports computing gravatars URLs.  If
enabled, &#39;avatar_url&#39; will be included in the response only
if there is a Zulip avatar, and will be &#39;null&#39; for users who
are using gravatar as their avatar.  This option
significantly reduces the compressed size of user data,
since gravatar URLs are long, random strings and thus do not
compress well. The &#39;client_gravatar&#39; field is set to &#39;true&#39; if
clients can compute their own gravatars."
"slim_presence=true:[QUERY] Setting this to &#39;true&#39; will make presence dictionaries be keyed by
user_id instead of email.

**Changes**: New in Zulip 3.0 (Unstable with no feature level yet)."
          "slim_presence=false:[QUERY] Setting this to &#39;true&#39; will make presence dictionaries be keyed by
user_id instead of email.

**Changes**: New in Zulip 3.0 (Unstable with no feature level yet)."
"event_types=:[QUERY] A JSON-encoded array indicating which types of events you&#39;re interested
in. Values that you might find useful include:

  * **message** (messages)
  * **subscription** (changes in your subscriptions)
  * **realm_user** (changes to users in the organization and
    their properties, such as their name).

If you do not specify this parameter, you will receive all
events, and have to filter out the events not relevant to
your client in your client code.  For most applications, one
is only interested in messages, so one specifies:
&#39;event_types&#x3D;[&#39;message&#39;]&#39;

Event types not supported by the server are ignored, in order to simplify
the implementation of client apps that support multiple server versions."
"all_public_streams=true:[QUERY] Whether you would like to request message events from all public
streams.  Useful for workflow bots that you&#39;d like to see all new messages
sent to public streams.  (You can also subscribe the user to private streams)."
          "all_public_streams=false:[QUERY] Whether you would like to request message events from all public
streams.  Useful for workflow bots that you&#39;d like to see all new messages
sent to public streams.  (You can also subscribe the user to private streams)."
"include_subscribers=true:[QUERY] Whether each returned stream object should include a &#39;subscribers&#39;
field containing a list of the user IDs of its subscribers.

(This may be significantly slower in organizations with
thousands of users subscribed to many streams.)

**Changes**: New in Zulip 2.1.0."
          "include_subscribers=false:[QUERY] Whether each returned stream object should include a &#39;subscribers&#39;
field containing a list of the user IDs of its subscribers.

(This may be significantly slower in organizations with
thousands of users subscribed to many streams.)

**Changes**: New in Zulip 2.1.0."
"client_capabilities=:[QUERY] Dictionary containing details on features the client supports that are
relevant to the format of responses sent by the server.

* &#39;notification_settings_null&#39;: Boolean for whether the
  client can handle the current API with null values for
  stream-level notification settings (which means the stream
  is not customized and should inherit the user&#39;s global
  notification settings for stream messages).
  &lt;br /&gt;
  New in Zulip 2.1.0; in earlier Zulip releases, stream-level
  notification settings were simple booleans.

* &#39;bulk_message_deletion&#39;: Boolean for whether the client&#39;s
   handler for the &#39;delete_message&#39; event type has been
   updated to process the new bulk format (with a
   &#39;message_ids&#39;, rather than a singleton &#39;message_id&#39;).
   Otherwise, the server will send &#39;delete_message&#39; events
   in a loop.
   &lt;br /&gt;
   New in Zulip 3.0 (feature level 13).  This
   capability is for backwards-compatibility; it will be
   required in a future server release.

* &#39;user_avatar_url_field_optional&#39;: Boolean for whether the
   client required avatar URLs for all users, or supports
   using &#39;GET /avatar/{user_id}&#39; to access user avatars.  If the
   client has this capability, the server may skip sending a
   &#39;avatar_url&#39; field in the &#39;realm_user&#39; at its sole discretion
   to optimize network performance.  This is an important optimization
   in organizations with 10,000s of users.
   &lt;br /&gt;
   New in Zulip 3.0 (feature level 18).

* &#39;stream_typing_notifications&#39;: Boolean for whether the client
  supports stream typing notifications.
  &lt;br /&gt;
  New in Zulip 4.0 (feature level 58).  This capability is
  for backwards-compatibility; it will be required in a
  future server release.

* &#39;user_settings_object&#39;: Boolean for whether the client supports the modern
  &#39;user_settings&#39; event type. If False, the server will additionally send the
  legacy &#39;update_display_settings&#39; and &#39;update_global_notifications&#39; event
  types for backwards-compatibility with clients that predate this API migration.
  &lt;br /&gt;
  &lt;br /&gt;
  Because the feature level 89 API changes were merged together, clients can
  safely make a request with this client capability and requesting all of the
  &#39;user_settings&#39;, &#39;update_display_settings&#39;, and
  &#39;update_global_notifications&#39; event types, and get exactly one copy of
  settings data on any server version. (And then use the &#39;zulip_feature_level&#39;
  in the &#39;/register&#39; response or the presence/absence of a &#39;user_settings&#39; key
  to determine where to look).
  &lt;br /&gt;
  New in Zulip 5.0 (feature level 89).  This capability is for
  backwards-compatibility; it will be removed in a future server release."
"fetch_event_types=:[QUERY] Same as the &#39;event_types&#39; parameter except that the values in
&#39;fetch_event_types&#39; are used to fetch initial data. If
&#39;fetch_event_types&#39; is not provided, &#39;event_types&#39; is used and if
&#39;event_types&#39; is not provided, this parameter defaults to &#39;None&#39;.

Event types not supported by the server are ignored, in order to simplify
the implementation of client apps that support multiple server versions."
"narrow=:[QUERY] A JSON-encoded array of arrays of length 2 indicating the
narrow for which you&#39;d like to receive events for. For
instance, to receive events for the stream &#39;Denmark&#39;, you
would specify &#39;narrow&#x3D;[[&#39;stream&#39;, &#39;Denmark&#39;]]&#39;.  Another
example is &#39;narrow&#x3D;[[&#39;is&#39;, &#39;private&#39;]]&#39; for private messages.
Default is &#39;[]&#39;."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      restErrorHandling)
        local -a _op_arguments
        _op_arguments=(
                              )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      addCodePlayground)
        local -a _op_arguments
        _op_arguments=(
                    "name=:[QUERY] The user-visible display name of the playground which can be
used to pick the target playground, especially when multiple
playground options exist for that programming language."
"pygments_language=:[QUERY] The name of the Pygments language lexer for that
programming language."
"url_prefix=:[QUERY] The url prefix for the playground."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      addLinkifier)
        local -a _op_arguments
        _op_arguments=(
                    "pattern=:[QUERY] The [Python regular
expression](https://docs.python.org/3/howto/regex.html) that should
trigger the linkifier."
"url_format_string=:[QUERY] The URL used for the link. If you used named groups for the &#39;pattern&#39;,
you can insert their content here with
&#39;%(name_of_the_capturing_group)s&#39;."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      createCustomProfileField)
        local -a _op_arguments
        _op_arguments=(
                    "name=:[QUERY] The name of the custom profile field, which will appear both in
user-facing settings UI for configuring custom profile fields and
in UI displaying a user&#39;s profile."
"hint=:[QUERY] The help text to be displayed for the custom profile field in user-facing
settings UI for configuring custom profile fields."
"field_type=:[QUERY] The field type can be any of the supported custom profile field types. See the
[custom profile fields documentation](/help/add-custom-profile-fields)
more details on what each type means.

* **1**: Short text
* **2**: Long text
* **3**: List of options
* **4**: Date picker
* **5**: Link
* **6**: Person picker
* **7**: External account"
"field_data=:[QUERY] Field types 3 (List of options) and 7 (External account) support storing
additional configuration for the field type in the &#39;field_data&#39; attribute.

For field type 3 (List of options), this attribute is a JSON dictionary
defining the choices and the order they will be displayed in the
dropdown UI for individual users to select an option.

The interface for field type 7 is not yet stabilized."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getCustomEmoji)
        local -a _op_arguments
        _op_arguments=(
                              )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getCustomProfileFields)
        local -a _op_arguments
        _op_arguments=(
                              )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getLinkifiers)
        local -a _op_arguments
        _op_arguments=(
                              )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getServerSettings)
        local -a _op_arguments
        _op_arguments=(
                              )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      removeCodePlayground)
        local -a _op_arguments
        _op_arguments=(
          "playground_id=:[PATH] The ID of the playground that you want to remove."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      removeLinkifier)
        local -a _op_arguments
        _op_arguments=(
          "filter_id=:[PATH] The ID of the linkifier that you want to remove."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      reorderCustomProfileFields)
        local -a _op_arguments
        _op_arguments=(
                    "order=:[QUERY] A list of the IDs of all the custom profile fields defined in this
organization, in the desired new order."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      updateLinkifier)
        local -a _op_arguments
        _op_arguments=(
          "filter_id=:[PATH] The ID of the linkifier that you want to update."
          "pattern=:[QUERY] The [Python regular
expression](https://docs.python.org/3/howto/regex.html) that should
trigger the linkifier."
"url_format_string=:[QUERY] The URL used for the link. If you used named groups for the &#39;pattern&#39;,
you can insert their content here with
&#39;%(name_of_the_capturing_group)s&#39;."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      uploadCustomEmoji)
        local -a _op_arguments
        _op_arguments=(
          "emoji_name=:[PATH] The name that should be associated with the uploaded emoji image/gif.
The emoji name can only contain letters, numbers, dashes, and spaces.
Upper and lower case letters are treated the same, and underscores (_)
are treated the same as spaces (consistent with how the Zulip UI
handles emoji)."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      archiveStream)
        local -a _op_arguments
        _op_arguments=(
          "stream_id=:[PATH] The ID of the stream to access."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      createBigBlueButtonVideoCall)
        local -a _op_arguments
        _op_arguments=(
                              )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      deleteTopic)
        local -a _op_arguments
        _op_arguments=(
          "stream_id=:[PATH] The ID of the stream to access."
          "topic_name=:[QUERY] The name of the topic to delete."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getStreamId)
        local -a _op_arguments
        _op_arguments=(
                    "stream=:[QUERY] The name of the stream to access."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getStreamTopics)
        local -a _op_arguments
        _op_arguments=(
          "stream_id=:[PATH] The ID of the stream to access."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getStreams)
        local -a _op_arguments
        _op_arguments=(
                    "include_public=true:[QUERY] Include all public streams."
          "include_public=false:[QUERY] Include all public streams."
"include_web_public=true:[QUERY] Include all web public streams."
          "include_web_public=false:[QUERY] Include all web public streams."
"include_subscribed=true:[QUERY] Include all streams that the user is subscribed to."
          "include_subscribed=false:[QUERY] Include all streams that the user is subscribed to."
"include_all_active=true:[QUERY] Include all active streams. The user must have administrative privileges
to use this parameter."
          "include_all_active=false:[QUERY] Include all active streams. The user must have administrative privileges
to use this parameter."
"include_default=true:[QUERY] Include all default streams for the user&#39;s realm."
          "include_default=false:[QUERY] Include all default streams for the user&#39;s realm."
"include_owner_subscribed=true:[QUERY] If the user is a bot, include all streams that the bot&#39;s owner is
subscribed to."
          "include_owner_subscribed=false:[QUERY] If the user is a bot, include all streams that the bot&#39;s owner is
subscribed to."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getSubscribers)
        local -a _op_arguments
        _op_arguments=(
          "stream_id=:[PATH] The ID of the stream to access."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getSubscriptionStatus)
        local -a _op_arguments
        _op_arguments=(
          "user_id=:[PATH] The target user&#39;s ID."
"stream_id=:[PATH] The ID of the stream to access."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getSubscriptions)
        local -a _op_arguments
        _op_arguments=(
                    "include_subscribers=true:[QUERY] Whether each returned stream object should include a &#39;subscribers&#39;
field containing a list of the user IDs of its subscribers.

(This may be significantly slower in organizations with
thousands of users subscribed to many streams.)

**Changes**: New in Zulip 2.1.0."
          "include_subscribers=false:[QUERY] Whether each returned stream object should include a &#39;subscribers&#39;
field containing a list of the user IDs of its subscribers.

(This may be significantly slower in organizations with
thousands of users subscribed to many streams.)

**Changes**: New in Zulip 2.1.0."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      muteTopic)
        local -a _op_arguments
        _op_arguments=(
                    "stream=:[QUERY] The name of the stream to access."
"stream_id=:[QUERY] The ID of the stream to access."
"topic=:[QUERY] The topic to (un)mute. Note that the request will succeed regardless of
whether any messages have been sent to the specified topic."
"op=:[QUERY] Whether to mute (&#39;add&#39;) or unmute (&#39;remove&#39;) the provided topic."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      subscribe)
        local -a _op_arguments
        _op_arguments=(
                    "subscriptions=:[QUERY] A list of dictionaries containing the key &#39;name&#39; and value
specifying the name of the stream to subscribe. If the stream does not
exist a new stream is created. The description of the stream created can
be specified by setting the dictionary key &#39;description&#39; with an
appropriate value."
"principals=:[QUERY] A list of user ids (preferred) or Zulip display email
addresses of the users to be subscribed to or unsubscribed
from the streams specified in the &#39;subscriptions&#39; parameter. If
not provided, then the requesting user/bot is subscribed.

**Changes**: The integer format is new in Zulip 3.0 (feature level 9)."
"authorization_errors_fatal=true:[QUERY] A boolean specifying whether authorization errors (such as when the
requesting user is not authorized to access a private stream) should be
considered fatal or not. When &#39;True&#39;, an authorization error is reported
as such. When set to &#39;False&#39;, the response will be a 200 and any streams
where the request encountered an authorization error will be listed
in the &#39;unauthorized&#39; key."
          "authorization_errors_fatal=false:[QUERY] A boolean specifying whether authorization errors (such as when the
requesting user is not authorized to access a private stream) should be
considered fatal or not. When &#39;True&#39;, an authorization error is reported
as such. When set to &#39;False&#39;, the response will be a 200 and any streams
where the request encountered an authorization error will be listed
in the &#39;unauthorized&#39; key."
"announce=true:[QUERY] If one of the streams specified did not exist previously and is thus craeted
by this call, this determines whether [notification bot](/help/configure-notification-bot)
will send an announcement about the new stream&#39;s creation."
          "announce=false:[QUERY] If one of the streams specified did not exist previously and is thus craeted
by this call, this determines whether [notification bot](/help/configure-notification-bot)
will send an announcement about the new stream&#39;s creation."
"invite_only=true:[QUERY] As described above, this endpoint will create a new stream if passed
a stream name that doesn&#39;t already exist.  This parameters and the ones
that follow are used to request an initial configuration of a created
stream; they are ignored for streams that already exist.

This parameter determines whether any newly created streams will be
private streams."
          "invite_only=false:[QUERY] As described above, this endpoint will create a new stream if passed
a stream name that doesn&#39;t already exist.  This parameters and the ones
that follow are used to request an initial configuration of a created
stream; they are ignored for streams that already exist.

This parameter determines whether any newly created streams will be
private streams."
"history_public_to_subscribers=true:[QUERY] Whether the stream&#39;s message history should be available to
newly subscribed members, or users can only access messages
they actually received while subscribed to the stream.

Corresponds to the [shared history](/help/stream-permissions)
option in documentation."
          "history_public_to_subscribers=false:[QUERY] Whether the stream&#39;s message history should be available to
newly subscribed members, or users can only access messages
they actually received while subscribed to the stream.

Corresponds to the [shared history](/help/stream-permissions)
option in documentation."
"stream_post_policy=:[QUERY] Policy for which users can post messages to the stream.

* 1 &#x3D;&gt; Any user can post.
* 2 &#x3D;&gt; Only administrators can post.
* 3 &#x3D;&gt; Only full members can post.
* 4 &#x3D;&gt; Only moderators can post.

**Changes**: New in Zulip 3.0, replacing the previous
&#39;is_announcement_only&#39; boolean."
"message_retention_days=:[QUERY] Number of days that messages sent to this stream will be stored
before being automatically deleted by the [message retention
policy](/help/message-retention-policy).  Two special string format
values are supported:

* \&quot;realm_default\&quot; &#x3D;&gt; Return to the organization-level setting.
* \&quot;forever\&quot; &#x3D;&gt; Retain messages forever.

**Changes**: New in Zulip 3.0 (feature level 17)."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      unsubscribe)
        local -a _op_arguments
        _op_arguments=(
                    "subscriptions=:[QUERY] A list of stream names to unsubscribe from. This parameter is called
&#39;streams&#39; in our Python API."
"principals=:[QUERY] A list of user ids (preferred) or Zulip display email
addresses of the users to be subscribed to or unsubscribed
from the streams specified in the &#39;subscriptions&#39; parameter. If
not provided, then the requesting user/bot is subscribed.

**Changes**: The integer format is new in Zulip 3.0 (feature level 9)."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      updateStream)
        local -a _op_arguments
        _op_arguments=(
          "stream_id=:[PATH] The ID of the stream to access."
          "description=:[QUERY] The new description for the stream. Limited Zulip markdown is allowed in this
field.

**Changes**: Removed unnecessary JSON-encoding of this parameter in
Zulip 4.0 (feature level 64)."
"new_name=:[QUERY] The new name for the stream.

**Changes**: Removed unnecessary JSON-encoding of this parameter in
Zulip 4.0 (feature level 64)."
"is_private=true:[QUERY] Change whether the stream is a private stream."
          "is_private=false:[QUERY] Change whether the stream is a private stream."
"is_announcement_only=true:[QUERY] Whether the stream is limited to announcements.

**Changes**: Deprecated in Zulip 3.0 (feature level 1), use
  &#39;stream_post_policy&#39; instead."
          "is_announcement_only=false:[QUERY] Whether the stream is limited to announcements.

**Changes**: Deprecated in Zulip 3.0 (feature level 1), use
  &#39;stream_post_policy&#39; instead."
"stream_post_policy=:[QUERY] Policy for which users can post messages to the stream.

* 1 &#x3D;&gt; Any user can post.
* 2 &#x3D;&gt; Only administrators can post.
* 3 &#x3D;&gt; Only full members can post.
* 4 &#x3D;&gt; Only moderators can post.

**Changes**: New in Zulip 3.0, replacing the previous
&#39;is_announcement_only&#39; boolean."
"history_public_to_subscribers=true:[QUERY] Whether the stream&#39;s message history should be available to
newly subscribed members, or users can only access messages
they actually received while subscribed to the stream.

Corresponds to the [shared history](/help/stream-permissions)
option in documentation."
          "history_public_to_subscribers=false:[QUERY] Whether the stream&#39;s message history should be available to
newly subscribed members, or users can only access messages
they actually received while subscribed to the stream.

Corresponds to the [shared history](/help/stream-permissions)
option in documentation."
"message_retention_days=:[QUERY] Number of days that messages sent to this stream will be stored
before being automatically deleted by the [message retention
policy](/help/message-retention-policy).  Two special string format
values are supported:

* \&quot;realm_default\&quot; &#x3D;&gt; Return to the organization-level setting.
* \&quot;forever\&quot; &#x3D;&gt; Retain messages forever.

**Changes**: New in Zulip 3.0 (feature level 17)."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      updateSubscriptionSettings)
        local -a _op_arguments
        _op_arguments=(
                    "subscription_data=:[QUERY] A list of objects that describe the changes that should be applied in
each subscription. Each object represents a subscription, and must have
a &#39;stream_id&#39; key that identifies the stream, as well as the &#39;property&#39;
being modified and its new &#39;value&#39;.

The possible values for each &#39;property&#39; and &#39;value&#39; pairs are:

* &#39;color&#39; (string): the hex value of the user&#39;s display color for the stream.
* &#39;is_muted&#39; (boolean): whether the stream is
  [muted](/help/mute-a-stream).  Prior to Zulip 2.1, this feature was
  represented by the more confusingly named &#39;in_home_view&#39; (with the
  opposite value, &#39;in_home_view&#x3D;!is_muted&#39;); for
  backwards-compatibility, modern Zulip still accepts that value.
* &#39;pin_to_top&#39; (boolean): whether to pin the stream at the top of the stream list.
* &#39;desktop_notifications&#39; (boolean): whether to show desktop notifications
    for all messages sent to the stream.
* &#39;audible_notifications&#39; (boolean): whether to play a sound
  notification for all messages sent to the stream.
* &#39;push_notifications&#39; (boolean): whether to trigger a mobile push
    notification for all messages sent to the stream.
* &#39;email_notifications&#39; (boolean): whether to trigger an email
    notification for all messages sent to the stream."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      updateSubscriptions)
        local -a _op_arguments
        _op_arguments=(
                    "delete=:[QUERY] A list of stream names to unsubscribe from."
"add=:[QUERY] A list of objects describing which streams to subscribe to, optionally
including per-user subscription parameters (e.g. color) and if the
stream is to be created, its description."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      createUser)
        local -a _op_arguments
        _op_arguments=(
                    "email=:[QUERY] The email address of the new user."
"password=:[QUERY] The password of the new user."
"full_name=:[QUERY] The full name of the new user."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      createUserGroup)
        local -a _op_arguments
        _op_arguments=(
                    "name=:[QUERY] The name of the user group."
"description=:[QUERY] The description of the user group."
"members=:[QUERY] An array containing the user IDs of the initial members for the
new user group."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      deactivateOwnUser)
        local -a _op_arguments
        _op_arguments=(
                              )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      deactivateUser)
        local -a _op_arguments
        _op_arguments=(
          "user_id=:[PATH] The target user&#39;s ID."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getAttachments)
        local -a _op_arguments
        _op_arguments=(
                              )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getOwnUser)
        local -a _op_arguments
        _op_arguments=(
                              )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getUser)
        local -a _op_arguments
        _op_arguments=(
          "user_id=:[PATH] The target user&#39;s ID."
          "client_gravatar=true:[QUERY] Whether the client supports computing gravatars URLs.  If
enabled, &#39;avatar_url&#39; will be included in the response only
if there is a Zulip avatar, and will be &#39;null&#39; for users who
are using gravatar as their avatar.  This option
significantly reduces the compressed size of user data,
since gravatar URLs are long, random strings and thus do not
compress well. The &#39;client_gravatar&#39; field is set to &#39;true&#39; if
clients can compute their own gravatars."
          "client_gravatar=false:[QUERY] Whether the client supports computing gravatars URLs.  If
enabled, &#39;avatar_url&#39; will be included in the response only
if there is a Zulip avatar, and will be &#39;null&#39; for users who
are using gravatar as their avatar.  This option
significantly reduces the compressed size of user data,
since gravatar URLs are long, random strings and thus do not
compress well. The &#39;client_gravatar&#39; field is set to &#39;true&#39; if
clients can compute their own gravatars."
"include_custom_profile_fields=true:[QUERY] Whether the client wants [custom profile field](/help/add-custom-profile-fields)
data to be included in the response.

**Changes**: New in Zulip 2.1.0.  Previous versions do no offer these
data via the API."
          "include_custom_profile_fields=false:[QUERY] Whether the client wants [custom profile field](/help/add-custom-profile-fields)
data to be included in the response.

**Changes**: New in Zulip 2.1.0.  Previous versions do no offer these
data via the API."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getUserByEmail)
        local -a _op_arguments
        _op_arguments=(
          "email=:[PATH] The email address of the user whose details you want to fetch."
          "client_gravatar=true:[QUERY] Whether the client supports computing gravatars URLs.  If
enabled, &#39;avatar_url&#39; will be included in the response only
if there is a Zulip avatar, and will be &#39;null&#39; for users who
are using gravatar as their avatar.  This option
significantly reduces the compressed size of user data,
since gravatar URLs are long, random strings and thus do not
compress well. The &#39;client_gravatar&#39; field is set to &#39;true&#39; if
clients can compute their own gravatars."
          "client_gravatar=false:[QUERY] Whether the client supports computing gravatars URLs.  If
enabled, &#39;avatar_url&#39; will be included in the response only
if there is a Zulip avatar, and will be &#39;null&#39; for users who
are using gravatar as their avatar.  This option
significantly reduces the compressed size of user data,
since gravatar URLs are long, random strings and thus do not
compress well. The &#39;client_gravatar&#39; field is set to &#39;true&#39; if
clients can compute their own gravatars."
"include_custom_profile_fields=true:[QUERY] Whether the client wants [custom profile field](/help/add-custom-profile-fields)
data to be included in the response.

**Changes**: New in Zulip 2.1.0.  Previous versions do no offer these
data via the API."
          "include_custom_profile_fields=false:[QUERY] Whether the client wants [custom profile field](/help/add-custom-profile-fields)
data to be included in the response.

**Changes**: New in Zulip 2.1.0.  Previous versions do no offer these
data via the API."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getUserGroups)
        local -a _op_arguments
        _op_arguments=(
                              )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getUserPresence)
        local -a _op_arguments
        _op_arguments=(
          "user_id_or_email=:[PATH] The user_id or Zulip display email address of the user whose presence you want to fetch.

**Changes**: New in Zulip 4.0 (feature level 43). Previous versions only supported
identifying the user by Zulip display email."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getUsers)
        local -a _op_arguments
        _op_arguments=(
                    "client_gravatar=true:[QUERY] Whether the client supports computing gravatars URLs.  If
enabled, &#39;avatar_url&#39; will be included in the response only
if there is a Zulip avatar, and will be &#39;null&#39; for users who
are using gravatar as their avatar.  This option
significantly reduces the compressed size of user data,
since gravatar URLs are long, random strings and thus do not
compress well. The &#39;client_gravatar&#39; field is set to &#39;true&#39; if
clients can compute their own gravatars."
          "client_gravatar=false:[QUERY] Whether the client supports computing gravatars URLs.  If
enabled, &#39;avatar_url&#39; will be included in the response only
if there is a Zulip avatar, and will be &#39;null&#39; for users who
are using gravatar as their avatar.  This option
significantly reduces the compressed size of user data,
since gravatar URLs are long, random strings and thus do not
compress well. The &#39;client_gravatar&#39; field is set to &#39;true&#39; if
clients can compute their own gravatars."
"include_custom_profile_fields=true:[QUERY] Whether the client wants [custom profile field](/help/add-custom-profile-fields)
data to be included in the response.

**Changes**: New in Zulip 2.1.0.  Previous versions do no offer these
data via the API."
          "include_custom_profile_fields=false:[QUERY] Whether the client wants [custom profile field](/help/add-custom-profile-fields)
data to be included in the response.

**Changes**: New in Zulip 2.1.0.  Previous versions do no offer these
data via the API."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      muteUser)
        local -a _op_arguments
        _op_arguments=(
          "muted_user_id=:[PATH] The ID of the user to mute/un-mute."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      reactivateUser)
        local -a _op_arguments
        _op_arguments=(
          "user_id=:[PATH] The target user&#39;s ID."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      removeUserGroup)
        local -a _op_arguments
        _op_arguments=(
          "user_group_id=:[PATH] The ID of the target user group."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      setTypingStatus)
        local -a _op_arguments
        _op_arguments=(
                    "type=:[QUERY] Type of the message being composed."
"op=:[QUERY] Whether the user has started (&#39;start&#39;) or stopped (&#39;stop&#39;) to type."
"to=:[QUERY] For &#39;private&#39; type it is the user_ids of the recipients of the message being typed.
Send a JSON-encoded list of user_ids. (Use a list even if there is only one
recipient.)

For &#39;stream&#39; type it is a single element list containing ID of stream in
which the message is being typed.

**Changes**: Before Zulip 2.0, this parameter accepted only a JSON-encoded
list of email addresses.  Support for the email address-based format was
removed in Zulip 3.0 (feature level 11)."
"topic=:[QUERY] Topic to which message is being typed. Required for the &#39;stream&#39; type.
Ignored in case of &#39;private&#39; type."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      unmuteUser)
        local -a _op_arguments
        _op_arguments=(
          "muted_user_id=:[PATH] The ID of the user to mute/un-mute."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      updateSettings)
        local -a _op_arguments
        _op_arguments=(
                    "full_name=:[QUERY] A new display name for the user."
"email=:[QUERY] Asks the server to initiate a confirmation sequence to change the user&#39;s email
address to the indicated value. The user will need to demonstrate control of the
new email address by clicking a confirmation link sent to that address."
"old_password=:[QUERY] The user&#39;s old Zulip password (or LDAP password, if LDAP authentication is in use).

Required only when sending the &#39;new_password&#39; parameter."
"new_password=:[QUERY] The user&#39;s new Zulip password (or LDAP password, if LDAP authentication is in use).

The &#39;old_password&#39; parameter must be included in the request."
"twenty_four_hour_time=true:[QUERY] Whether time should be [displayed in 24-hour notation](/help/change-the-time-format).

**Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by
the &#39;PATCH /settings/display&#39; endpoint."
          "twenty_four_hour_time=false:[QUERY] Whether time should be [displayed in 24-hour notation](/help/change-the-time-format).

**Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by
the &#39;PATCH /settings/display&#39; endpoint."
"dense_mode=true:[QUERY] This setting has no effect at present.  It is reserved for use in controlling
the default font size in Zulip.

**Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by
the &#39;PATCH /settings/display&#39; endpoint."
          "dense_mode=false:[QUERY] This setting has no effect at present.  It is reserved for use in controlling
the default font size in Zulip.

**Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by
the &#39;PATCH /settings/display&#39; endpoint."
"starred_message_counts=true:[QUERY] Whether clients should display the [number of starred
messages](/help/star-a-message#display-the-number-of-starred-messages).

**Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by
the &#39;PATCH /settings/display&#39; endpoint."
          "starred_message_counts=false:[QUERY] Whether clients should display the [number of starred
messages](/help/star-a-message#display-the-number-of-starred-messages).

**Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by
the &#39;PATCH /settings/display&#39; endpoint."
"fluid_layout_width=true:[QUERY] Whether to use the [maximum available screen width](/help/enable-full-width-display)
for the web app&#39;s center panel (message feed, recent topics) on wide screens.

**Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by
the &#39;PATCH /settings/display&#39; endpoint."
          "fluid_layout_width=false:[QUERY] Whether to use the [maximum available screen width](/help/enable-full-width-display)
for the web app&#39;s center panel (message feed, recent topics) on wide screens.

**Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by
the &#39;PATCH /settings/display&#39; endpoint."
"high_contrast_mode=true:[QUERY] This setting is reserved for use to control variations in Zulip&#39;s design
to help visually impaired users.

**Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by
the &#39;PATCH /settings/display&#39; endpoint."
          "high_contrast_mode=false:[QUERY] This setting is reserved for use to control variations in Zulip&#39;s design
to help visually impaired users.

**Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by
the &#39;PATCH /settings/display&#39; endpoint."
"color_scheme=:[QUERY] Controls which [color theme](/help/night-mode) to use.

* 1 - Automatic
* 2 - Night mode
* 3 - Day mode

Automatic detection is implementing using the standard &#39;prefers-color-scheme&#39;
media query.

**Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by
the &#39;PATCH /settings/display&#39; endpoint."
"enable_drafts_synchronization=true:[QUERY] A boolean parameter to control whether synchronizing drafts is enabled for
the user. When synchronization is disabled, all drafts stored in the server
will be automatically deleted from the server.

This does not do anything (like sending events) to delete local copies of
drafts stored in clients.

**Changes**: New in Zulip 5.0 (feature level 87)."
          "enable_drafts_synchronization=false:[QUERY] A boolean parameter to control whether synchronizing drafts is enabled for
the user. When synchronization is disabled, all drafts stored in the server
will be automatically deleted from the server.

This does not do anything (like sending events) to delete local copies of
drafts stored in clients.

**Changes**: New in Zulip 5.0 (feature level 87)."
"translate_emoticons=true:[QUERY] Whether to [translate emoticons to emoji](/help/enable-emoticon-translations)
in messages the user sends.

**Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by
the &#39;PATCH /settings/display&#39; endpoint."
          "translate_emoticons=false:[QUERY] Whether to [translate emoticons to emoji](/help/enable-emoticon-translations)
in messages the user sends.

**Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by
the &#39;PATCH /settings/display&#39; endpoint."
"default_language=:[QUERY] What [default language](/help/change-your-language) to use for the account.

This controls both the Zulip UI as well as email notifications sent to the user.

The value needs to be a standard language code that the Zulip server has
translation data for; for example, &#39;\&quot;en\&quot;&#39; for English or &#39;\&quot;de\&quot;&#39; for German.

**Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by
the &#39;PATCH /settings/display&#39; endpoint.

Unnecessary JSON-encoding of this parameter was removed in Zulip 4.0 (feature level 63)."
"default_view=:[QUERY] The [default view](/help/change-default-view) used when opening a new
Zulip web app window or hitting the &#39;Esc&#39; keyboard shortcut repeatedly.

* \&quot;recent_topics\&quot; - Recent topics view
* \&quot;all_messages\&quot; - All messages view

**Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by
the &#39;PATCH /settings/display&#39; endpoint.

Unnecessary JSON-encoding of this parameter was removed in Zulip 4.0 (feature level 64)."
"left_side_userlist=true:[QUERY] Whether the users list on left sidebar in narrow windows.

This feature is not heavily used and is likely to be reworked.

**Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by
the &#39;PATCH /settings/display&#39; endpoint."
          "left_side_userlist=false:[QUERY] Whether the users list on left sidebar in narrow windows.

This feature is not heavily used and is likely to be reworked.

**Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by
the &#39;PATCH /settings/display&#39; endpoint."
"emojiset=:[QUERY] The user&#39;s configured [emoji set](/help/emoji-and-emoticons#use-emoticons),
used to display emoji to the user everything they appear in the UI.

* \&quot;google\&quot; - Google modern
* \&quot;google-blob\&quot; - Google classic
* \&quot;twitter\&quot; - Twitter
* \&quot;text\&quot; - Plain text

**Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by
the &#39;PATCH /settings/display&#39; endpoint.

Unnecessary JSON-encoding of this parameter was removed in Zulip 4.0 (feature level 64)."
"demote_inactive_streams=:[QUERY] Whether to [demote inactive streams](/help/manage-inactive-streams) in the left sidebar.

* 1 - Automatic
* 2 - Always
* 3 - Never

**Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by
the &#39;PATCH /settings/display&#39; endpoint."
"timezone=:[QUERY] The user&#39;s [configured timezone](/help/change-your-timezone).

Timezone values supported by the server are served at
[/static/generated/timezones.json](/static/generated/timezones.json).

**Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by
the &#39;PATCH /settings/display&#39; endpoint.

Unnecessary JSON-encoding of this parameter was removed in Zulip 4.0 (feature level 64)."
"enable_stream_desktop_notifications=true:[QUERY] Enable visual desktop notifications for stream messages.

**Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by
the &#39;PATCH /settings/notifications&#39; endpoint."
          "enable_stream_desktop_notifications=false:[QUERY] Enable visual desktop notifications for stream messages.

**Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by
the &#39;PATCH /settings/notifications&#39; endpoint."
"enable_stream_email_notifications=true:[QUERY] Enable email notifications for stream messages.

**Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by
the &#39;PATCH /settings/notifications&#39; endpoint."
          "enable_stream_email_notifications=false:[QUERY] Enable email notifications for stream messages.

**Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by
the &#39;PATCH /settings/notifications&#39; endpoint."
"enable_stream_push_notifications=true:[QUERY] Enable mobile notifications for stream messages.

**Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by
the &#39;PATCH /settings/notifications&#39; endpoint."
          "enable_stream_push_notifications=false:[QUERY] Enable mobile notifications for stream messages.

**Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by
the &#39;PATCH /settings/notifications&#39; endpoint."
"enable_stream_audible_notifications=true:[QUERY] Enable audible desktop notifications for stream messages.

**Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by
the &#39;PATCH /settings/notifications&#39; endpoint."
          "enable_stream_audible_notifications=false:[QUERY] Enable audible desktop notifications for stream messages.

**Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by
the &#39;PATCH /settings/notifications&#39; endpoint."
"notification_sound=:[QUERY] Notification sound name.

**Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by
the &#39;PATCH /settings/notifications&#39; endpoint.

Unnecessary JSON-encoding of this parameter was removed in Zulip 4.0 (feature level 63)."
"enable_desktop_notifications=true:[QUERY] Enable visual desktop notifications for private messages and @-mentions.

**Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by
the &#39;PATCH /settings/notifications&#39; endpoint."
          "enable_desktop_notifications=false:[QUERY] Enable visual desktop notifications for private messages and @-mentions.

**Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by
the &#39;PATCH /settings/notifications&#39; endpoint."
"enable_sounds=true:[QUERY] Enable audible desktop notifications for private messages and
@-mentions.

**Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by
the &#39;PATCH /settings/notifications&#39; endpoint."
          "enable_sounds=false:[QUERY] Enable audible desktop notifications for private messages and
@-mentions.

**Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by
the &#39;PATCH /settings/notifications&#39; endpoint."
"email_notifications_batching_period_seconds=:[QUERY] The duration (in seconds) for which the server should wait to batch
email notifications before sending them.

**Changes**: New in Zulip 5.0 (feature level 82)"
"enable_offline_email_notifications=true:[QUERY] Enable email notifications for private messages and @-mentions received
when the user is offline.

**Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by
the &#39;PATCH /settings/notifications&#39; endpoint."
          "enable_offline_email_notifications=false:[QUERY] Enable email notifications for private messages and @-mentions received
when the user is offline.

**Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by
the &#39;PATCH /settings/notifications&#39; endpoint."
"enable_offline_push_notifications=true:[QUERY] Enable mobile notification for private messages and @-mentions received
when the user is offline.

**Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by
the &#39;PATCH /settings/notifications&#39; endpoint."
          "enable_offline_push_notifications=false:[QUERY] Enable mobile notification for private messages and @-mentions received
when the user is offline.

**Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by
the &#39;PATCH /settings/notifications&#39; endpoint."
"enable_online_push_notifications=true:[QUERY] Enable mobile notification for private messages and @-mentions received
when the user is online.

**Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by
the &#39;PATCH /settings/notifications&#39; endpoint."
          "enable_online_push_notifications=false:[QUERY] Enable mobile notification for private messages and @-mentions received
when the user is online.

**Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by
the &#39;PATCH /settings/notifications&#39; endpoint."
"enable_digest_emails=true:[QUERY] Enable digest emails when the user is away.

**Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by
the &#39;PATCH /settings/notifications&#39; endpoint."
          "enable_digest_emails=false:[QUERY] Enable digest emails when the user is away.

**Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by
the &#39;PATCH /settings/notifications&#39; endpoint."
"enable_marketing_emails=true:[QUERY] Enable marketing emails. Has no function outside Zulip Cloud.

**Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by
the &#39;PATCH /settings/notifications&#39; endpoint."
          "enable_marketing_emails=false:[QUERY] Enable marketing emails. Has no function outside Zulip Cloud.

**Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by
the &#39;PATCH /settings/notifications&#39; endpoint."
"enable_login_emails=true:[QUERY] Enable email notifications for new logins to account.

**Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by
the &#39;PATCH /settings/notifications&#39; endpoint."
          "enable_login_emails=false:[QUERY] Enable email notifications for new logins to account.

**Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by
the &#39;PATCH /settings/notifications&#39; endpoint."
"message_content_in_email_notifications=true:[QUERY] Include the message&#39;s content in email notifications for new messages.

**Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by
the &#39;PATCH /settings/notifications&#39; endpoint."
          "message_content_in_email_notifications=false:[QUERY] Include the message&#39;s content in email notifications for new messages.

**Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by
the &#39;PATCH /settings/notifications&#39; endpoint."
"pm_content_in_desktop_notifications=true:[QUERY] Include content of private messages in desktop notifications.

**Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by
the &#39;PATCH /settings/notifications&#39; endpoint."
          "pm_content_in_desktop_notifications=false:[QUERY] Include content of private messages in desktop notifications.

**Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by
the &#39;PATCH /settings/notifications&#39; endpoint."
"wildcard_mentions_notify=true:[QUERY] Whether wildcard mentions (E.g. @**all**) should send notifications
like a personal mention.

**Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by
the &#39;PATCH /settings/notifications&#39; endpoint."
          "wildcard_mentions_notify=false:[QUERY] Whether wildcard mentions (E.g. @**all**) should send notifications
like a personal mention.

**Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by
the &#39;PATCH /settings/notifications&#39; endpoint."
"desktop_icon_count_display=:[QUERY] Unread count summary (appears in desktop sidebar and browser tab)

* 1 - All unreads
* 2 - Private messages and mentions
* 3 - None

**Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by
the &#39;PATCH /settings/notifications&#39; endpoint."
"realm_name_in_notifications=true:[QUERY] Include organization name in subject of message notification emails.

**Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by
the &#39;PATCH /settings/notifications&#39; endpoint."
          "realm_name_in_notifications=false:[QUERY] Include organization name in subject of message notification emails.

**Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by
the &#39;PATCH /settings/notifications&#39; endpoint."
"presence_enabled=true:[QUERY] Display the presence status to other users when online.

**Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by
the &#39;PATCH /settings/notifications&#39; endpoint."
          "presence_enabled=false:[QUERY] Display the presence status to other users when online.

**Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by
the &#39;PATCH /settings/notifications&#39; endpoint."
"enter_sends=true:[QUERY] Whether pressing Enter in the compose box sends a message
(or saves a message edit).

**Changes**: Before Zulip 5.0 (feature level 81), this setting was managed by
the &#39;POST /users/me/enter-sends&#39; endpoint, with the same parameter format."
          "enter_sends=false:[QUERY] Whether pressing Enter in the compose box sends a message
(or saves a message edit).

**Changes**: Before Zulip 5.0 (feature level 81), this setting was managed by
the &#39;POST /users/me/enter-sends&#39; endpoint, with the same parameter format."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      updateStatus)
        local -a _op_arguments
        _op_arguments=(
                    "status_text=:[QUERY] The text content of the status message. Sending the empty string
will clear the user&#39;s status.

**Note**: The limit on the size of the message is 60 characters."
"away=true:[QUERY] Whether the user should be marked as \&quot;away\&quot;."
          "away=false:[QUERY] Whether the user should be marked as \&quot;away\&quot;."
"emoji_name=:[QUERY] The name for the emoji to associate with this status."
"emoji_code=:[QUERY] A unique identifier, defining the specific emoji codepoint requested,
within the namespace of the &#39;reaction_type&#39;.

For example, for &#39;unicode_emoji&#39;, this will be an encoding of the
Unicode codepoint; for &#39;realm_emoji&#39;, it&#39;ll be the ID of the realm emoji."
"reaction_type=:[QUERY] One of the following values:

* &#39;unicode_emoji&#39;: Unicode emoji (&#39;emoji_code&#39; will be its Unicode
  codepoint).
* &#39;realm_emoji&#39;: [Custom emoji](/help/add-custom-emoji).
  (&#39;emoji_code&#39; will be its ID).
* &#39;zulip_extra_emoji&#39;: Special emoji included with Zulip.  Exists to
  namespace the &#39;zulip&#39; emoji."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      updateUser)
        local -a _op_arguments
        _op_arguments=(
          "user_id=:[PATH] The target user&#39;s ID."
          "full_name=:[QUERY] The user&#39;s full name."
"role=:[QUERY] New [role](/help/roles-and-permissions) for the user.  Roles are encoded as:

* Organization owner: 100
* Organization administrator: 200
* Organization moderator: 300
* Member: 400
* Guest: 600

Only organization owners can add or remove the owner role.

The owner role cannot be removed from the only organization owner.

**Changes**: New in Zulip 3.0 (feature level 8), replacing the previous
pair of &#39;is_admin&#39; and &#39;is_guest&#39; boolean parameters. Organization moderator
role added in Zulip 4.0 (feature level 60)."
"profile_data=:[QUERY] A dictionary containing the to be updated custom profile field data for the user."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      updateUserGroup)
        local -a _op_arguments
        _op_arguments=(
          "user_group_id=:[PATH] The ID of the target user group."
          "name=:[QUERY] The new name of the group."
"description=:[QUERY] The new description of the group."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      updateUserGroupMembers)
        local -a _op_arguments
        _op_arguments=(
          "user_group_id=:[PATH] The ID of the target user group."
          "delete=:[QUERY] The list of user ids to be removed from the user group."
"add=:[QUERY] The list of user ids to be added to the user group."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      zulipOutgoingWebhooks)
        local -a _op_arguments
        _op_arguments=(
                              )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
    esac
    ;;

esac

return ret
