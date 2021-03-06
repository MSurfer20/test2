# NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
# https://openapi-generator.tech
# Do not edit the class manually.

defmodule ZulipRESTAPI.Model.InvalidMessageError do
  @moduledoc """
  
  """

  @derive [Poison.Encoder]
  defstruct [
    :"result",
    :"msg",
    :"raw_content"
  ]

  @type t :: %__MODULE__{
    :"result" => AnyType | nil,
    :"msg" => AnyType | nil,
    :"raw_content" => String.t | nil
  }
end

defimpl Poison.Decoder, for: ZulipRESTAPI.Model.InvalidMessageError do
  import ZulipRESTAPI.Deserializer
  def decode(value, options) do
    value
    |> deserialize(:"result", :struct, ZulipRESTAPI.Model.AnyType, options)
    |> deserialize(:"msg", :struct, ZulipRESTAPI.Model.AnyType, options)
  end
end

