# NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
# https://openapi-generator.tech
# Do not edit the class manually.

defmodule ZulipRESTAPI.Model.Messages do
  @moduledoc """
  
  """

  @derive [Poison.Encoder]
  defstruct [
    :"avatar_url",
    :"client",
    :"content",
    :"content_type",
    :"display_recipient",
    :"id",
    :"is_me_message",
    :"reactions",
    :"recipient_id",
    :"sender_email",
    :"sender_full_name",
    :"sender_id",
    :"sender_realm_str",
    :"stream_id",
    :"subject",
    :"topic_links",
    :"submessages",
    :"timestamp",
    :"type"
  ]

  @type t :: %__MODULE__{
    :"avatar_url" => AnyType | nil,
    :"client" => AnyType | nil,
    :"content" => AnyType | nil,
    :"content_type" => AnyType | nil,
    :"display_recipient" => AnyType | nil,
    :"id" => AnyType | nil,
    :"is_me_message" => AnyType | nil,
    :"reactions" => AnyType | nil,
    :"recipient_id" => AnyType | nil,
    :"sender_email" => AnyType | nil,
    :"sender_full_name" => AnyType | nil,
    :"sender_id" => AnyType | nil,
    :"sender_realm_str" => AnyType | nil,
    :"stream_id" => AnyType | nil,
    :"subject" => AnyType | nil,
    :"topic_links" => AnyType | nil,
    :"submessages" => AnyType | nil,
    :"timestamp" => AnyType | nil,
    :"type" => AnyType | nil
  }
end

defimpl Poison.Decoder, for: ZulipRESTAPI.Model.Messages do
  import ZulipRESTAPI.Deserializer
  def decode(value, options) do
    value
    |> deserialize(:"avatar_url", :struct, ZulipRESTAPI.Model.AnyType, options)
    |> deserialize(:"client", :struct, ZulipRESTAPI.Model.AnyType, options)
    |> deserialize(:"content", :struct, ZulipRESTAPI.Model.AnyType, options)
    |> deserialize(:"content_type", :struct, ZulipRESTAPI.Model.AnyType, options)
    |> deserialize(:"display_recipient", :struct, ZulipRESTAPI.Model.AnyType, options)
    |> deserialize(:"id", :struct, ZulipRESTAPI.Model.AnyType, options)
    |> deserialize(:"is_me_message", :struct, ZulipRESTAPI.Model.AnyType, options)
    |> deserialize(:"reactions", :struct, ZulipRESTAPI.Model.AnyType, options)
    |> deserialize(:"recipient_id", :struct, ZulipRESTAPI.Model.AnyType, options)
    |> deserialize(:"sender_email", :struct, ZulipRESTAPI.Model.AnyType, options)
    |> deserialize(:"sender_full_name", :struct, ZulipRESTAPI.Model.AnyType, options)
    |> deserialize(:"sender_id", :struct, ZulipRESTAPI.Model.AnyType, options)
    |> deserialize(:"sender_realm_str", :struct, ZulipRESTAPI.Model.AnyType, options)
    |> deserialize(:"stream_id", :struct, ZulipRESTAPI.Model.AnyType, options)
    |> deserialize(:"subject", :struct, ZulipRESTAPI.Model.AnyType, options)
    |> deserialize(:"topic_links", :struct, ZulipRESTAPI.Model.AnyType, options)
    |> deserialize(:"submessages", :struct, ZulipRESTAPI.Model.AnyType, options)
    |> deserialize(:"timestamp", :struct, ZulipRESTAPI.Model.AnyType, options)
    |> deserialize(:"type", :struct, ZulipRESTAPI.Model.AnyType, options)
  end
end

