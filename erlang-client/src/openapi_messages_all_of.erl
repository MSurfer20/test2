-module(openapi_messages_all_of).

-export([encode/1]).

-export_type([openapi_messages_all_of/0]).

-type openapi_messages_all_of() ::
    #{ 'avatar_url' => openapi_any_type:openapi_any_type(),
       'client' => openapi_any_type:openapi_any_type(),
       'content' => openapi_any_type:openapi_any_type(),
       'content_type' => openapi_any_type:openapi_any_type(),
       'display_recipient' => openapi_any_type:openapi_any_type(),
       'id' => openapi_any_type:openapi_any_type(),
       'is_me_message' => openapi_any_type:openapi_any_type(),
       'reactions' => openapi_any_type:openapi_any_type(),
       'recipient_id' => openapi_any_type:openapi_any_type(),
       'sender_email' => openapi_any_type:openapi_any_type(),
       'sender_full_name' => openapi_any_type:openapi_any_type(),
       'sender_id' => openapi_any_type:openapi_any_type(),
       'sender_realm_str' => openapi_any_type:openapi_any_type(),
       'stream_id' => openapi_any_type:openapi_any_type(),
       'subject' => openapi_any_type:openapi_any_type(),
       'topic_links' => openapi_any_type:openapi_any_type(),
       'submessages' => openapi_any_type:openapi_any_type(),
       'timestamp' => openapi_any_type:openapi_any_type(),
       'type' => openapi_any_type:openapi_any_type()
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
