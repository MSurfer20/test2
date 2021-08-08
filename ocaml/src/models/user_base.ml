(*
 * This file has been generated by the OCamlClientCodegen generator for openapi-generator.
 *
 * Generated by: https://openapi-generator.tech
 *
 * Schema User_base.t : A dictionary containing basic data on a given Zulip user. 
 *)

type t = {
    (* The Zulip API email address of the user or bot.  If you do not have permission to view the email address of the target user, this will be a fake email address that is usable for the Zulip API but nothing else.  *)
    email: string option [@default None];
    (* A boolean specifying whether the user is a bot or full account.  *)
    is_bot: bool option [@default None];
    (* URL for the user's avatar.  Will be `null` if the `client_gravatar` query parameter was set to `True` and the user's avatar is hosted by the Gravatar provider (i.e. the user has never uploaded an avatar).  **Changes**: In Zulip 3.0 (feature level 18), if the client has the `user_avatar_url_field_optional` capability, this will be missing at the server's sole discretion.  *)
    avatar_url: string option [@default None];
    (* Version for the user's avatar.  Used for cache-busting requests for the user's avatar.  Clients generally shouldn't need to use this; most avatar URLs sent by Zulip will already end with `?v={avatar_version}`.  *)
    avatar_version: int32 option [@default None];
    (* Full name of the user or bot, used for all display purposes.  *)
    full_name: string option [@default None];
    (* A boolean specifying whether the user is an organization administrator.  *)
    is_admin: bool option [@default None];
    (* A boolean specifying whether the user is an organization owner. If true, is_admin will also be true.  **Changes**: New in Zulip 3.0 (feature level 8).  *)
    is_owner: bool option [@default None];
    (* A boolean specifying whether the user is a billing administrator.  **Changes**: New in Zulip 5.0 (feature level 73).  *)
    is_billing_admin: bool option [@default None];
    (* [Organization-level role](/help/roles-and-permissions)) of the user. Poosible values are:  * Organization owner => 100 * Organization administrator => 200 * Organization moderator => 300 * Member => 400 * Guest => 600  **Changes**: New in Zulip 4.0 (feature level 59).  *)
    role: Enums.role option [@default None];
    (* An integer describing the type of bot: * `null` if the user isn't a bot. * `1` for a `Generic` bot. * `2` for an `Incoming webhook` bot. * `3` for an `Outgoing webhook` bot. * `4` for an `Embedded` bot.  *)
    bot_type: int32 option [@default None];
    (* The unique ID of the user.  *)
    user_id: int32 option [@default None];
    (* If the user is a bot (i.e. `is_bot` is `True`), `bot_owner` is the user ID of the bot's owner (usually, whoever created the bot).  Will be null for legacy bots that do not have an owner.  **Changes**: New in Zulip 3.0 (feature level 1).  In previous versions, there was a `bot_owner` field containing the email address of the bot's owner.  *)
    bot_owner_id: int32 option [@default None];
    (* A boolean specifying whether the user account has been deactivated.  *)
    is_active: bool option [@default None];
    (* A boolean specifying whether the user is a guest user.  *)
    is_guest: bool option [@default None];
    (* The time zone of the user.  *)
    timezone: string option [@default None];
    (* The time the user account was created.  *)
    date_joined: string option [@default None];
    (* The user's real email address.  This field is present only if [email address visibility](/help/restrict-visibility-of-email-addresses) is limited and you are an administrator with access to real email addresses under the configured policy.  *)
    delivery_email: string option [@default None];
    (* A dictionary containing custom profile field data for the user. Each entry maps the integer ID of a custom profile field in the organization to a dictionary containing the user's data for that field.  Generally the data includes just a single `value` key; for those custom profile fields supporting Markdown, a `rendered_value` key will also be present.  *)
    profile_data: (string * Yojson.Safe.t) list;
} [@@deriving yojson { strict = false }, show ];;

(** A dictionary containing basic data on a given Zulip user.  *)
let create () : t = {
    email = None;
    is_bot = None;
    avatar_url = None;
    avatar_version = None;
    full_name = None;
    is_admin = None;
    is_owner = None;
    is_billing_admin = None;
    role = None;
    bot_type = None;
    user_id = None;
    bot_owner_id = None;
    is_active = None;
    is_guest = None;
    timezone = None;
    date_joined = None;
    delivery_email = None;
    profile_data = [];
}

