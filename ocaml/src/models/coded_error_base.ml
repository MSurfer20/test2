(*
 * This file has been generated by the OCamlClientCodegen generator for openapi-generator.
 *
 * Generated by: https://openapi-generator.tech
 *
 *)

type t = {
    _result: Any_type.t option;
    msg: Any_type.t option;
    (* A string that identifies the error.  *)
    code: string option [@default None];
} [@@deriving yojson { strict = false }, show ];;

let create (_result : Any_type.t option) (msg : Any_type.t option) : t = {
    _result = _result;
    msg = msg;
    code = None;
}

