# NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
# https://openapi-generator.tech
# Do not edit the class manually.

defmodule ZulipRESTAPI.Model.AddSubscriptionsResponseAllOf do
  @moduledoc """
  
  """

  @derive [Poison.Encoder]
  defstruct [
    :"result",
    :"msg",
    :"subscribed",
    :"already_subscribed",
    :"unauthorized"
  ]

  @type t :: %__MODULE__{
    :"result" => AnyType | nil,
    :"msg" => AnyType | nil,
    :"subscribed" => %{optional(String.t) => [String.t]} | nil,
    :"already_subscribed" => %{optional(String.t) => [String.t]} | nil,
    :"unauthorized" => [String.t] | nil
  }
end

defimpl Poison.Decoder, for: ZulipRESTAPI.Model.AddSubscriptionsResponseAllOf do
  import ZulipRESTAPI.Deserializer
  def decode(value, options) do
    value
    |> deserialize(:"result", :struct, ZulipRESTAPI.Model.AnyType, options)
    |> deserialize(:"msg", :struct, ZulipRESTAPI.Model.AnyType, options)
  end
end
