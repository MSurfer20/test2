(*
 * This file has been generated by the OCamlClientCodegen generator for openapi-generator.
 *
 * Generated by: https://openapi-generator.tech
 *
 *)

type t = {
    (* Time when the message was sent as a UNIX timestamp multiplied by 1000 (matching the format of getTime() in JavaScript).  **Changes**: Changed in Zulip 2.2 (feature level 22).  This field was previously strangely called `name` and was a floating point number.  *)
    date_sent: int32 option [@default None];
    (* The unique message ID.  Messages should always be displayed sorted by ID.  *)
    id: int32 option [@default None];
} [@@deriving yojson { strict = false }, show ];;

let create () : t = {
    date_sent = None;
    id = None;
}

