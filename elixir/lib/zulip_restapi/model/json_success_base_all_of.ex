# NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
# https://openapi-generator.tech
# Do not edit the class manually.

defmodule ZulipRESTAPI.Model.JsonSuccessBaseAllOf do
  @moduledoc """
  
  """

  @derive [Poison.Encoder]
  defstruct [
    :"result",
    :"msg"
  ]

  @type t :: %__MODULE__{
    :"result" => String.t,
    :"msg" => String.t
  }
end

defimpl Poison.Decoder, for: ZulipRESTAPI.Model.JsonSuccessBaseAllOf do
  def decode(value, _options) do
    value
  end
end

