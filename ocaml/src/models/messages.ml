(*
 * This file has been generated by the OCamlClientCodegen generator for openapi-generator.
 *
 * Generated by: https://openapi-generator.tech
 *
 *)

type t = {
    avatar_url: Any_type.t option [@default None];
    client: Any_type.t option [@default None];
    content: Any_type.t option [@default None];
    content_type: Any_type.t option [@default None];
    display_recipient: Any_type.t option [@default None];
    id: Any_type.t option [@default None];
    is_me_message: Any_type.t option [@default None];
    reactions: Any_type.t option [@default None];
    recipient_id: Any_type.t option [@default None];
    sender_email: Any_type.t option [@default None];
    sender_full_name: Any_type.t option [@default None];
    sender_id: Any_type.t option [@default None];
    sender_realm_str: Any_type.t option [@default None];
    stream_id: Any_type.t option [@default None];
    subject: Any_type.t option [@default None];
    topic_links: Any_type.t option [@default None];
    submessages: Any_type.t option [@default None];
    timestamp: Any_type.t option [@default None];
    _type: Any_type.t option [@default None];
} [@@deriving yojson { strict = false }, show ];;

let create () : t = {
    avatar_url = None;
    client = None;
    content = None;
    content_type = None;
    display_recipient = None;
    id = None;
    is_me_message = None;
    reactions = None;
    recipient_id = None;
    sender_email = None;
    sender_full_name = None;
    sender_id = None;
    sender_realm_str = None;
    stream_id = None;
    subject = None;
    topic_links = None;
    submessages = None;
    timestamp = None;
    _type = None;
}
