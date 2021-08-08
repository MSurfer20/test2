# NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
# https://openapi-generator.tech
# Do not edit the class manually.

defmodule ZulipRESTAPI.Model.EmojiBase do
  @moduledoc """
  
  """

  @derive [Poison.Encoder]
  defstruct [
    :"emoji_code",
    :"emoji_name",
    :"reaction_type"
  ]

  @type t :: %__MODULE__{
    :"emoji_code" => String.t | nil,
    :"emoji_name" => String.t | nil,
    :"reaction_type" => String.t | nil
  }
end

defimpl Poison.Decoder, for: ZulipRESTAPI.Model.EmojiBase do
  def decode(value, _options) do
    value
  end
end

