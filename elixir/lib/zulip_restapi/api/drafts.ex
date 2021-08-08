# NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
# https://openapi-generator.tech
# Do not edit the class manually.

defmodule ZulipRESTAPI.Api.Drafts do
  @moduledoc """
  API calls for all endpoints tagged `Drafts`.
  """

  alias ZulipRESTAPI.Connection
  import ZulipRESTAPI.RequestBuilder


  @doc """
  Create drafts
  Create one or more drafts on the server. These drafts will be automatically synchronized to other clients via `drafts` events.  `POST {{ api_url }}/v1/drafts` 

  ## Parameters

  - connection (ZulipRESTAPI.Connection): Connection to server
  - opts (KeywordList): [optional] Optional parameters
    - :drafts ([ZulipRESTAPI.Model.Draft.t]): A JSON-encoded list of containing new draft objects. 
  ## Returns

  {:ok, JsonSuccess} on success
  {:error, Tesla.Env.t} on failure
  """
  @spec create_drafts(Tesla.Env.client, keyword()) :: {:ok, ZulipRESTAPI.Model.CodedError.t} | {:ok, ZulipRESTAPI.Model.JsonSuccess.t} | {:error, Tesla.Env.t}
  def create_drafts(connection, opts \\ []) do
    optional_params = %{
      :"drafts" => :query
    }
    %{}
    |> method(:post)
    |> url("/drafts")
    |> add_optional_params(optional_params, opts)
    |> ensure_body()
    |> Enum.into([])
    |> (&Connection.request(connection, &1)).()
    |> evaluate_response([
      { 200, %ZulipRESTAPI.Model.JsonSuccess{}},
      { 400, %ZulipRESTAPI.Model.CodedError{}}
    ])
  end

  @doc """
  Delete a draft
  Delete a single draft from the server. The deletion will be automatically synchronized to other clients via a `drafts` event.  `DELETE {{ api_url }}/v1/drafts/{draft_id}` 

  ## Parameters

  - connection (ZulipRESTAPI.Connection): Connection to server
  - draft_id (integer()): The ID of the draft you want to delete. 
  - opts (KeywordList): [optional] Optional parameters
  ## Returns

  {:ok, JsonSuccess} on success
  {:error, Tesla.Env.t} on failure
  """
  @spec delete_draft(Tesla.Env.client, integer(), keyword()) :: {:ok, ZulipRESTAPI.Model.JsonError.t} | {:ok, ZulipRESTAPI.Model.JsonSuccess.t} | {:error, Tesla.Env.t}
  def delete_draft(connection, draft_id, _opts \\ []) do
    %{}
    |> method(:delete)
    |> url("/drafts/#{draft_id}")
    |> Enum.into([])
    |> (&Connection.request(connection, &1)).()
    |> evaluate_response([
      { 200, %ZulipRESTAPI.Model.JsonSuccess{}},
      { 404, %ZulipRESTAPI.Model.JsonError{}}
    ])
  end

  @doc """
  Edit a draft
  Edit a draft on the server. The edit will be automatically synchronized to other clients via `drafts` events.  `PATCH {{ api_url }}/v1/drafts/{draft_id}` 

  ## Parameters

  - connection (ZulipRESTAPI.Connection): Connection to server
  - draft_id (integer()): The ID of the draft to be edited. 
  - draft (ZulipRESTAPI.Model.Draft.t): A JSON-encoded object containing a replacement draft object for this ID. 
  - opts (KeywordList): [optional] Optional parameters
  ## Returns

  {:ok, JsonSuccess} on success
  {:error, Tesla.Env.t} on failure
  """
  @spec edit_draft(Tesla.Env.client, integer(), ZulipRESTAPI.Model.ZulipRESTAPI.Model.Draft.t.t, keyword()) :: {:ok, ZulipRESTAPI.Model.JsonError.t} | {:ok, ZulipRESTAPI.Model.JsonSuccess.t} | {:error, Tesla.Env.t}
  def edit_draft(connection, draft_id, draft, _opts \\ []) do
    %{}
    |> method(:patch)
    |> url("/drafts/#{draft_id}")
    |> add_param(:query, :"draft", draft)
    |> ensure_body()
    |> Enum.into([])
    |> (&Connection.request(connection, &1)).()
    |> evaluate_response([
      { 200, %ZulipRESTAPI.Model.JsonSuccess{}},
      { 404, %ZulipRESTAPI.Model.JsonError{}}
    ])
  end

  @doc """
  Get drafts
  Fetch all drafts for the current user.  `GET {{ api_url }}/v1/drafts` 

  ## Parameters

  - connection (ZulipRESTAPI.Connection): Connection to server
  - opts (KeywordList): [optional] Optional parameters
  ## Returns

  {:ok, JsonSuccess} on success
  {:error, Tesla.Env.t} on failure
  """
  @spec get_drafts(Tesla.Env.client, keyword()) :: {:ok, ZulipRESTAPI.Model.JsonSuccess.t} | {:error, Tesla.Env.t}
  def get_drafts(connection, _opts \\ []) do
    %{}
    |> method(:get)
    |> url("/drafts")
    |> Enum.into([])
    |> (&Connection.request(connection, &1)).()
    |> evaluate_response([
      { 200, %ZulipRESTAPI.Model.JsonSuccess{}}
    ])
  end
end