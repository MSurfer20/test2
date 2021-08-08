# NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
# https://openapi-generator.tech
# Do not edit the class manually.

defmodule ZulipRESTAPI.Model.UserGroup do
  @moduledoc """
  Object containing the user group's attributes. 
  """

  @derive [Poison.Encoder]
  defstruct [
    :"name",
    :"description",
    :"members",
    :"id"
  ]

  @type t :: %__MODULE__{
    :"name" => String.t | nil,
    :"description" => String.t | nil,
    :"members" => [integer()] | nil,
    :"id" => integer() | nil
  }
end

defimpl Poison.Decoder, for: ZulipRESTAPI.Model.UserGroup do
  def decode(value, _options) do
    value
  end
end
