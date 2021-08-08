(*
 * This file has been generated by the OCamlClientCodegen generator for openapi-generator.
 *
 * Generated by: https://openapi-generator.tech
 *
 * Schema Inline_response_200.t : This is an example of the JSON payload that the Zulip server will `POST` to your server 
 *)

type t = {
    (* Email of the bot user.  *)
    bot_email: string option [@default None];
    (* The full name of the bot user.  *)
    bot_full_name: string option [@default None];
    (* The message content, in raw Markdown format (not rendered to HTML).  *)
    data: string option [@default None];
    (* What aspect of the message triggered the outgoing webhook notification. Possible values include `private_message` and `mention`.  *)
    trigger: string option [@default None];
    (* A string of alphanumeric characters that can be used to authenticate the webhook request (each bot user uses a fixed token). You can get the token used by a given outgoing webhook bot in the `zuliprc` file downloaded when creating the bot.  *)
    token: string option [@default None];
    (* A dict containing details on the message that triggered the outgoing webhook, in the format used by [`GET /messages`](/api/get-messages).  *)
    message: Messages_base.t option [@default None];
} [@@deriving yojson { strict = false }, show ];;

(** This is an example of the JSON payload that the Zulip server will `POST` to your server  *)
let create () : t = {
    bot_email = None;
    bot_full_name = None;
    data = None;
    trigger = None;
    token = None;
    message = None;
}

