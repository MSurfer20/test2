# NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
# https://openapi-generator.tech
# Do not edit the class manually.

defmodule ZulipRESTAPI.Api.Webhooks do
  @moduledoc """
  API calls for all endpoints tagged `Webhooks`.
  """

  alias ZulipRESTAPI.Connection
  import ZulipRESTAPI.RequestBuilder


  @doc """
  Outgoing webhooks
  Outgoing webhooks allows to build or set up Zulip integrations which are notified when certain types of messages are sent in Zulip. 

  ## Parameters

  - connection (ZulipRESTAPI.Connection): Connection to server
  - opts (KeywordList): [optional] Optional parameters
  ## Returns

  {:ok, ZulipRESTAPI.Model.InlineResponse200.t} on success
  {:error, Tesla.Env.t} on failure
  """
  @spec zulip_outgoing_webhooks(Tesla.Env.client, keyword()) :: {:ok, ZulipRESTAPI.Model.InlineResponse200.t} | {:error, Tesla.Env.t}
  def zulip_outgoing_webhooks(connection, _opts \\ []) do
    %{}
    |> method(:post)
    |> url("/zulip-outgoing-webhook")
    |> ensure_body()
    |> Enum.into([])
    |> (&Connection.request(connection, &1)).()
    |> evaluate_response([
      { 200, %ZulipRESTAPI.Model.InlineResponse200{}}
    ])
  end
end
