# NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
# https://openapi-generator.tech
# Do not edit the class manually.

defmodule ZulipRESTAPI.Model.MissingArgumentErrorAllOf do
  @moduledoc """
  ## Missing request parameter(s)  A typical failed JSON response for when a required request parameter is not supplied 
  """

  @derive [Poison.Encoder]
  defstruct [
    :"result",
    :"msg",
    :"code",
    :"var_name"
  ]

  @type t :: %__MODULE__{
    :"result" => AnyType | nil,
    :"msg" => AnyType | nil,
    :"code" => AnyType | nil,
    :"var_name" => String.t | nil
  }
end

defimpl Poison.Decoder, for: ZulipRESTAPI.Model.MissingArgumentErrorAllOf do
  import ZulipRESTAPI.Deserializer
  def decode(value, options) do
    value
    |> deserialize(:"result", :struct, ZulipRESTAPI.Model.AnyType, options)
    |> deserialize(:"msg", :struct, ZulipRESTAPI.Model.AnyType, options)
    |> deserialize(:"code", :struct, ZulipRESTAPI.Model.AnyType, options)
  end
end

