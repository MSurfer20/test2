-module(openapi_messages_base).

-export([encode/1]).

-export_type([openapi_messages_base/0]).

-type openapi_messages_base() ::
    #{ 'avatar_url' => binary(),
       'client' => binary(),
       'content' => binary(),
       'content_type' => binary(),
       'display_recipient' => openapi_one_of<string,array>:openapi_one_of<string,array>(),
       'id' => integer(),
       'is_me_message' => boolean(),
       'reactions' => list(),
       'recipient_id' => integer(),
       'sender_email' => binary(),
       'sender_full_name' => binary(),
       'sender_id' => integer(),
       'sender_realm_str' => binary(),
       'stream_id' => integer(),
       'subject' => binary(),
       'topic_links' => list(),
       'submessages' => list(),
       'timestamp' => integer(),
       'type' => binary()
     }.

encode(#{ 'avatar_url' := AvatarUrl,
          'client' := Client,
          'content' := Content,
          'content_type' := ContentType,
          'display_recipient' := DisplayRecipient,
          'id' := Id,
          'is_me_message' := IsMeMessage,
          'reactions' := Reactions,
          'recipient_id' := RecipientId,
          'sender_email' := SenderEmail,
          'sender_full_name' := SenderFullName,
          'sender_id' := SenderId,
          'sender_realm_str' := SenderRealmStr,
          'stream_id' := StreamId,
          'subject' := Subject,
          'topic_links' := TopicLinks,
          'submessages' := Submessages,
          'timestamp' := Timestamp,
          'type' := Type
        }) ->
    #{ 'avatar_url' => AvatarUrl,
       'client' => Client,
       'content' => Content,
       'content_type' => ContentType,
       'display_recipient' => DisplayRecipient,
       'id' => Id,
       'is_me_message' => IsMeMessage,
       'reactions' => Reactions,
       'recipient_id' => RecipientId,
       'sender_email' => SenderEmail,
       'sender_full_name' => SenderFullName,
       'sender_id' => SenderId,
       'sender_realm_str' => SenderRealmStr,
       'stream_id' => StreamId,
       'subject' => Subject,
       'topic_links' => TopicLinks,
       'submessages' => Submessages,
       'timestamp' => Timestamp,
       'type' => Type
     }.
