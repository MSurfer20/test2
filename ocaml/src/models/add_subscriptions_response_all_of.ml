(*
 * This file has been generated by the OCamlClientCodegen generator for openapi-generator.
 *
 * Generated by: https://openapi-generator.tech
 *
 *)

type t = {
    _result: Any_type.t option [@default None];
    msg: Any_type.t option [@default None];
    (* A dictionary where the key is the email address of the user/bot and the value is a list of the names of the streams that were subscribed to as a result of the query.  *)
    subscribed: (string * string list) list;
    (* A dictionary where the key is the email address of the user/bot and the value is a list of the names of the streams that the user/bot is already subscribed to.  *)
    already_subscribed: (string * string list) list;
    (* A list of names of streams that the requesting user/bot was not authorized to subscribe to.  Only present if `authorization_errors_fatal=false`.  *)
    unauthorized: string list;
} [@@deriving yojson { strict = false }, show ];;

let create () : t = {
    _result = None;
    msg = None;
    subscribed = [];
    already_subscribed = [];
    unauthorized = [];
}

