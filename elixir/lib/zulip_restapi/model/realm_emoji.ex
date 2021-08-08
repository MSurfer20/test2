# NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
# https://openapi-generator.tech
# Do not edit the class manually.

defmodule ZulipRESTAPI.Model.RealmEmoji do
  @moduledoc """
  `{emoji_id}`: Object containing details about the emoji with  the specified ID. It has the following properties: 
  """

  @derive [Poison.Encoder]
  defstruct [
    :"id",
    :"name",
    :"source_url",
    :"deactivated",
    :"author_id"
  ]

  @type t :: %__MODULE__{
    :"id" => String.t | nil,
    :"name" => String.t | nil,
    :"source_url" => String.t | nil,
    :"deactivated" => boolean() | nil,
    :"author_id" => integer() | nil
  }
end

defimpl Poison.Decoder, for: ZulipRESTAPI.Model.RealmEmoji do
  def decode(value, _options) do
    value
  end
end
