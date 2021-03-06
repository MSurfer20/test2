# NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
# https://openapi-generator.tech
# Do not edit the class manually.

defmodule ZulipRESTAPI.Model.BasicBotBase do
  @moduledoc """
  
  """

  @derive [Poison.Encoder]
  defstruct [
    :"user_id",
    :"full_name",
    :"api_key",
    :"default_sending_stream",
    :"default_events_register_stream",
    :"default_all_public_streams",
    :"avatar_url",
    :"owner_id",
    :"services"
  ]

  @type t :: %__MODULE__{
    :"user_id" => integer() | nil,
    :"full_name" => String.t | nil,
    :"api_key" => String.t | nil,
    :"default_sending_stream" => String.t | nil,
    :"default_events_register_stream" => String.t | nil,
    :"default_all_public_streams" => boolean() | nil,
    :"avatar_url" => String.t | nil,
    :"owner_id" => integer() | nil,
    :"services" => [OneOfobjectobject] | nil
  }
end

defimpl Poison.Decoder, for: ZulipRESTAPI.Model.BasicBotBase do
  import ZulipRESTAPI.Deserializer
  def decode(value, options) do
    value
    |> deserialize(:"services", :list, ZulipRESTAPI.Model.OneOfobjectobject, options)
  end
end

