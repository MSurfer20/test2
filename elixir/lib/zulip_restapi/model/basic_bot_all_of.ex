# NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
# https://openapi-generator.tech
# Do not edit the class manually.

defmodule ZulipRESTAPI.Model.BasicBotAllOf do
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
    :"user_id" => AnyType | nil,
    :"full_name" => AnyType | nil,
    :"api_key" => AnyType | nil,
    :"default_sending_stream" => AnyType | nil,
    :"default_events_register_stream" => AnyType | nil,
    :"default_all_public_streams" => AnyType | nil,
    :"avatar_url" => AnyType | nil,
    :"owner_id" => AnyType | nil,
    :"services" => AnyType | nil
  }
end

defimpl Poison.Decoder, for: ZulipRESTAPI.Model.BasicBotAllOf do
  import ZulipRESTAPI.Deserializer
  def decode(value, options) do
    value
    |> deserialize(:"user_id", :struct, ZulipRESTAPI.Model.AnyType, options)
    |> deserialize(:"full_name", :struct, ZulipRESTAPI.Model.AnyType, options)
    |> deserialize(:"api_key", :struct, ZulipRESTAPI.Model.AnyType, options)
    |> deserialize(:"default_sending_stream", :struct, ZulipRESTAPI.Model.AnyType, options)
    |> deserialize(:"default_events_register_stream", :struct, ZulipRESTAPI.Model.AnyType, options)
    |> deserialize(:"default_all_public_streams", :struct, ZulipRESTAPI.Model.AnyType, options)
    |> deserialize(:"avatar_url", :struct, ZulipRESTAPI.Model.AnyType, options)
    |> deserialize(:"owner_id", :struct, ZulipRESTAPI.Model.AnyType, options)
    |> deserialize(:"services", :struct, ZulipRESTAPI.Model.AnyType, options)
  end
end

