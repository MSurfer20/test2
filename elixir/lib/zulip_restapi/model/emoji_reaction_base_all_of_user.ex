# NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
# https://openapi-generator.tech
# Do not edit the class manually.

defmodule ZulipRESTAPI.Model.EmojiReactionBaseAllOfUser do
  @moduledoc """
  Whether the user is a mirror dummy. Dictionary with data on the user who added the reaction, including the user ID as the `id` field.  **Note**: In the [events API](/api/get-events), this `user` dictionary confusing had the user ID in a field called `user_id` instead.  We recommend ignoring fields other than the user ID.  **Deprecated** and to be removed in a future release once core clients have migrated to use the `user_id` field. 
  """

  @derive [Poison.Encoder]
  defstruct [
    :"id",
    :"email",
    :"full_name",
    :"is_mirror_dummy"
  ]

  @type t :: %__MODULE__{
    :"id" => integer() | nil,
    :"email" => String.t | nil,
    :"full_name" => String.t | nil,
    :"is_mirror_dummy" => boolean() | nil
  }
end

defimpl Poison.Decoder, for: ZulipRESTAPI.Model.EmojiReactionBaseAllOfUser do
  def decode(value, _options) do
    value
  end
end

