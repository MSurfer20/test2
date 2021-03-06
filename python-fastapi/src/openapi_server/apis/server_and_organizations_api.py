# coding: utf-8

from typing import Dict, List  # noqa: F401

from fastapi import (  # noqa: F401
    APIRouter,
    Body,
    Cookie,
    Depends,
    Form,
    Header,
    Path,
    Query,
    Response,
    Security,
    status,
)

from openapi_server.models.extra_models import TokenModel  # noqa: F401
from openapi_server.models.json_success import JsonSuccess
from openapi_server.models.json_success_base import JsonSuccessBase


router = APIRouter()


@router.post(
    "/realm/playgrounds",
    responses={
        200: {"model": JsonSuccessBase, "description": "Success."},
    },
    tags=["server_and_organizations"],
    summary="Add a code playground",
)
async def add_code_playground(
    name: str = Query(None, description="The user-visible display name of the playground which can be used to pick the target playground, especially when multiple playground options exist for that programming language. "),
    pygments_language: str = Query(None, description="The name of the Pygments language lexer for that programming language. "),
    url_prefix: str = Query(None, description="The url prefix for the playground. "),
) -> JsonSuccessBase:
    """Configure [code playgrounds](/help/code-blocks#code-playgrounds) for the organization.  &#x60;POST {{ api_url }}/v1/realm/playgrounds&#x60;  **Changes**: New in Zulip 4.0 (feature level 49). A parameter encoding bug was fixed in Zulip 4.0 (feature level 57). """
    ...


@router.post(
    "/realm/filters",
    responses={
        200: {"model": JsonSuccessBase, "description": "Success."},
    },
    tags=["server_and_organizations"],
    summary="Add a linkifier",
)
async def add_linkifier(
    pattern: str = Query(None, description="The [Python regular expression](https://docs.python.org/3/howto/regex.html) that should trigger the linkifier. "),
    url_format_string: str = Query(None, description="The URL used for the link. If you used named groups for the &#x60;pattern&#x60;, you can insert their content here with &#x60;%(name_of_the_capturing_group)s&#x60;. "),
) -> JsonSuccessBase:
    """Configure [linkifiers](/help/add-a-custom-linkifier), regular expression patterns that are automatically linkified when they appear in messages and topics.  &#x60;POST {{ api_url }}/v1/realm/filters&#x60; """
    ...


@router.post(
    "/realm/profile_fields",
    responses={
        200: {"model": JsonSuccessBase, "description": "Success."},
    },
    tags=["server_and_organizations"],
    summary="Create a custom profile field",
)
async def create_custom_profile_field(
    field_type: int = Query(None, description="The field type can be any of the supported custom profile field types. See the [custom profile fields documentation](/help/add-custom-profile-fields) more details on what each type means.  * **1**: Short text * **2**: Long text * **3**: List of options * **4**: Date picker * **5**: Link * **6**: Person picker * **7**: External account "),
    name: str = Query(None, description="The name of the custom profile field, which will appear both in user-facing settings UI for configuring custom profile fields and in UI displaying a user&#39;s profile. "),
    hint: str = Query(None, description="The help text to be displayed for the custom profile field in user-facing settings UI for configuring custom profile fields. "),
    field_data:  = Query(None, description="Field types 3 (List of options) and 7 (External account) support storing additional configuration for the field type in the &#x60;field_data&#x60; attribute.  For field type 3 (List of options), this attribute is a JSON dictionary defining the choices and the order they will be displayed in the dropdown UI for individual users to select an option.  The interface for field type 7 is not yet stabilized. "),
) -> JsonSuccessBase:
    """[Create a custom profile field](/help/add-custom-profile-fields) in the user&#39;s organization.  &#x60;POST {{ api_url }}/v1/realm/profile_fields&#x60; """
    ...


@router.get(
    "/realm/emoji",
    responses={
        200: {"model": JsonSuccessBase, "description": "Success."},
    },
    tags=["server_and_organizations"],
    summary="Get all custom emoji",
)
async def get_custom_emoji(
) -> JsonSuccessBase:
    """Get all the custom emoji in the user&#39;s organization.  &#x60;GET {{ api_url }}/v1/realm/emoji&#x60; """
    ...


@router.get(
    "/realm/profile_fields",
    responses={
        200: {"model": JsonSuccessBase, "description": "Success."},
    },
    tags=["server_and_organizations"],
    summary="Get all custom profile fields",
)
async def get_custom_profile_fields(
) -> JsonSuccessBase:
    """Get all the [custom profile fields](/help/add-custom-profile-fields) configured for the user&#39;s organization.  &#x60;GET {{ api_url }}/v1/realm/profile_fields&#x60; """
    ...


@router.get(
    "/realm/linkifiers",
    responses={
        200: {"model": JsonSuccessBase, "description": "Success."},
    },
    tags=["server_and_organizations"],
    summary="Get linkifiers",
)
async def get_linkifiers(
) -> JsonSuccessBase:
    """List all of an organization&#39;s configured [linkifiers](/help/add-a-custom-linkifier), regular expression patterns that are automatically linkified when they appear in messages and topics.  &#x60;GET {{ api_url }}/v1/realm/linkifiers&#x60;  **Changes**: New in Zulip 4.0 (feature level 54). On older versions, a similar &#x60;GET /realm/filters&#x60; endpoint was available with each entry in a &#x60;[pattern, url_format, id]&#x60; tuple format. """
    ...


@router.get(
    "/server_settings",
    responses={
        200: {"model": JsonSuccessBase, "description": "Success."},
    },
    tags=["server_and_organizations"],
    summary="Get server settings",
)
async def get_server_settings(
) -> JsonSuccessBase:
    """Fetch global settings for a Zulip server.  &#x60;GET {{ api_url }}/v1/server_settings&#x60;  **Note:** this endpoint does not require any authentication at all, and you can use it to check:  * If this is a Zulip server, and if so, what version of Zulip it&#39;s running. * What a Zulip client (e.g. a mobile app or [zulip-terminal](https://github.com/zulip/zulip-terminal/)) needs to know in order to display a login prompt for the server (e.g. what authentication methods are available). """
    ...


@router.delete(
    "/realm/playgrounds/{playground_id}",
    responses={
        200: {"model": JsonSuccess, "description": "Success."},
    },
    tags=["server_and_organizations"],
    summary="Remove a code playground",
)
async def remove_code_playground(
    playground_id: int = Path(None, description="The ID of the playground that you want to remove. "),
) -> JsonSuccess:
    """Remove a [code playground](/help/code-blocks#code-playgrounds) previously configured for an organization.  &#x60;DELETE {{ api_url }}/v1/realm/playgrounds/{playground_id}&#x60;  **Changes**: New in Zulip 4.0 (feature level 49). """
    ...


@router.delete(
    "/realm/filters/{filter_id}",
    responses={
        200: {"model": JsonSuccess, "description": "Success."},
    },
    tags=["server_and_organizations"],
    summary="Remove a linkifier",
)
async def remove_linkifier(
    filter_id: int = Path(None, description="The ID of the linkifier that you want to remove. "),
) -> JsonSuccess:
    """Remove [linkifiers](/help/add-a-custom-linkifier), regular expression patterns that are automatically linkified when they appear in messages and topics.  &#x60;DELETE {{ api_url }}/v1/realm/filters/{filter_id}&#x60; """
    ...


@router.patch(
    "/realm/profile_fields",
    responses={
        200: {"model": JsonSuccess, "description": "Success."},
    },
    tags=["server_and_organizations"],
    summary="Reorder custom profile fields",
)
async def reorder_custom_profile_fields(
    order: List[int] = Query(None, description="A list of the IDs of all the custom profile fields defined in this organization, in the desired new order. "),
) -> JsonSuccess:
    """Reorder the custom profile fields in the user&#39;s organization.  &#x60;PATCH {{ api_url }}/v1/realm/profile_fields&#x60;  Custom profile fields are displayed in Zulip UI widgets in order; this endpoint allows administrative settings UI to change the field ordering.  This endpoint is used to implement the dragging feature described in the [custom profile fields documentation](/help/add-custom-profile-fields). """
    ...


@router.patch(
    "/realm/filters/{filter_id}",
    responses={
        200: {"model": JsonSuccess, "description": "Success."},
    },
    tags=["server_and_organizations"],
    summary="Update a linkifier",
)
async def update_linkifier(
    filter_id: int = Path(None, description="The ID of the linkifier that you want to update. "),
    pattern: str = Query(None, description="The [Python regular expression](https://docs.python.org/3/howto/regex.html) that should trigger the linkifier. "),
    url_format_string: str = Query(None, description="The URL used for the link. If you used named groups for the &#x60;pattern&#x60;, you can insert their content here with &#x60;%(name_of_the_capturing_group)s&#x60;. "),
) -> JsonSuccess:
    """Update a [linkifier](/help/add-a-custom-linkifier), regular expression patterns that are automatically linkified when they appear in messages and topics.  &#x60;PATCH {{ api_url }}/v1/realm/filters/{filter_id}&#x60;  **Changes**: New in Zulip 4.0 (feature level 57). """
    ...


@router.post(
    "/realm/emoji/{emoji_name}",
    responses={
        200: {"model": JsonSuccess, "description": "Success."},
    },
    tags=["server_and_organizations"],
    summary="Upload custom emoji",
)
async def upload_custom_emoji(
    emoji_name: str = Path(None, description="The name that should be associated with the uploaded emoji image/gif. The emoji name can only contain letters, numbers, dashes, and spaces. Upper and lower case letters are treated the same, and underscores (_) are treated the same as spaces (consistent with how the Zulip UI handles emoji). "),
    filename: str = Form(None, description=""),
) -> JsonSuccess:
    """This endpoint is used to upload a custom emoji for use in the user&#39;s organization.  Access to this endpoint depends on the [organization&#39;s configuration](https://zulip.com/help/only-allow-admins-to-add-emoji).  &#x60;POST {{ api_url }}/v1/realm/emoji/{emoji_name}&#x60; """
    ...
