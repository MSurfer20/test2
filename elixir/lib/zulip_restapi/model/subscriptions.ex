# NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
# https://openapi-generator.tech
# Do not edit the class manually.

defmodule ZulipRESTAPI.Model.Subscriptions do
  @moduledoc """
  
  """

  @derive [Poison.Encoder]
  defstruct [
    :"stream_id",
    :"name",
    :"description",
    :"rendered_description",
    :"date_created",
    :"invite_only",
    :"subscribers",
    :"desktop_notifications",
    :"email_notifications",
    :"wildcard_mentions_notify",
    :"push_notifications",
    :"audible_notifications",
    :"pin_to_top",
    :"email_address",
    :"is_muted",
    :"in_home_view",
    :"is_announcement_only",
    :"is_web_public",
    :"role",
    :"color",
    :"stream_post_policy",
    :"message_retention_days",
    :"history_public_to_subscribers",
    :"first_message_id",
    :"stream_weekly_traffic"
  ]

  @type t :: %__MODULE__{
    :"stream_id" => integer() | nil,
    :"name" => String.t | nil,
    :"description" => String.t | nil,
    :"rendered_description" => String.t | nil,
    :"date_created" => integer() | nil,
    :"invite_only" => boolean() | nil,
    :"subscribers" => [integer()] | nil,
    :"desktop_notifications" => boolean() | nil,
    :"email_notifications" => boolean() | nil,
    :"wildcard_mentions_notify" => boolean() | nil,
    :"push_notifications" => boolean() | nil,
    :"audible_notifications" => boolean() | nil,
    :"pin_to_top" => boolean() | nil,
    :"email_address" => String.t | nil,
    :"is_muted" => boolean() | nil,
    :"in_home_view" => boolean() | nil,
    :"is_announcement_only" => boolean() | nil,
    :"is_web_public" => boolean() | nil,
    :"role" => integer() | nil,
    :"color" => String.t | nil,
    :"stream_post_policy" => integer() | nil,
    :"message_retention_days" => integer() | nil,
    :"history_public_to_subscribers" => boolean() | nil,
    :"first_message_id" => integer() | nil,
    :"stream_weekly_traffic" => integer() | nil
  }
end

defimpl Poison.Decoder, for: ZulipRESTAPI.Model.Subscriptions do
  def decode(value, _options) do
    value
  end
end

