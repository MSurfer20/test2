import connexion
import six

from openapi_server.models.json_success import JsonSuccess  # noqa: E501
from openapi_server.models.json_success_base import JsonSuccessBase  # noqa: E501
from openapi_server import util


def add_code_playground(name, pygments_language, url_prefix):  # noqa: E501
    """Add a code playground

    Configure [code playgrounds](/help/code-blocks#code-playgrounds) for the organization.  &#x60;POST {{ api_url }}/v1/realm/playgrounds&#x60;  **Changes**: New in Zulip 4.0 (feature level 49). A parameter encoding bug was fixed in Zulip 4.0 (feature level 57).  # noqa: E501

    :param name: The user-visible display name of the playground which can be used to pick the target playground, especially when multiple playground options exist for that programming language. 
    :type name: str
    :param pygments_language: The name of the Pygments language lexer for that programming language. 
    :type pygments_language: str
    :param url_prefix: The url prefix for the playground. 
    :type url_prefix: str

    :rtype: JsonSuccessBase
    """
    return 'do some magic!'


def add_linkifier(pattern, url_format_string):  # noqa: E501
    """Add a linkifier

    Configure [linkifiers](/help/add-a-custom-linkifier), regular expression patterns that are automatically linkified when they appear in messages and topics.  &#x60;POST {{ api_url }}/v1/realm/filters&#x60;  # noqa: E501

    :param pattern: The [Python regular expression](https://docs.python.org/3/howto/regex.html) that should trigger the linkifier. 
    :type pattern: str
    :param url_format_string: The URL used for the link. If you used named groups for the &#x60;pattern&#x60;, you can insert their content here with &#x60;%(name_of_the_capturing_group)s&#x60;. 
    :type url_format_string: str

    :rtype: JsonSuccessBase
    """
    return 'do some magic!'


def create_custom_profile_field(field_type, name=None, hint=None, field_data=None):  # noqa: E501
    """Create a custom profile field

    [Create a custom profile field](/help/add-custom-profile-fields) in the user&#39;s organization.  &#x60;POST {{ api_url }}/v1/realm/profile_fields&#x60;  # noqa: E501

    :param field_type: The field type can be any of the supported custom profile field types. See the [custom profile fields documentation](/help/add-custom-profile-fields) more details on what each type means.  * **1**: Short text * **2**: Long text * **3**: List of options * **4**: Date picker * **5**: Link * **6**: Person picker * **7**: External account 
    :type field_type: int
    :param name: The name of the custom profile field, which will appear both in user-facing settings UI for configuring custom profile fields and in UI displaying a user&#39;s profile. 
    :type name: str
    :param hint: The help text to be displayed for the custom profile field in user-facing settings UI for configuring custom profile fields. 
    :type hint: str
    :param field_data: Field types 3 (List of options) and 7 (External account) support storing additional configuration for the field type in the &#x60;field_data&#x60; attribute.  For field type 3 (List of options), this attribute is a JSON dictionary defining the choices and the order they will be displayed in the dropdown UI for individual users to select an option.  The interface for field type 7 is not yet stabilized. 
    :type field_data: dict | bytes

    :rtype: JsonSuccessBase
    """
    if connexion.request.is_json:
        field_data =  object.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def get_custom_emoji():  # noqa: E501
    """Get all custom emoji

    Get all the custom emoji in the user&#39;s organization.  &#x60;GET {{ api_url }}/v1/realm/emoji&#x60;  # noqa: E501


    :rtype: JsonSuccessBase
    """
    return 'do some magic!'


def get_custom_profile_fields():  # noqa: E501
    """Get all custom profile fields

    Get all the [custom profile fields](/help/add-custom-profile-fields) configured for the user&#39;s organization.  &#x60;GET {{ api_url }}/v1/realm/profile_fields&#x60;  # noqa: E501


    :rtype: JsonSuccessBase
    """
    return 'do some magic!'


def get_linkifiers():  # noqa: E501
    """Get linkifiers

    List all of an organization&#39;s configured [linkifiers](/help/add-a-custom-linkifier), regular expression patterns that are automatically linkified when they appear in messages and topics.  &#x60;GET {{ api_url }}/v1/realm/linkifiers&#x60;  **Changes**: New in Zulip 4.0 (feature level 54). On older versions, a similar &#x60;GET /realm/filters&#x60; endpoint was available with each entry in a &#x60;[pattern, url_format, id]&#x60; tuple format.  # noqa: E501


    :rtype: JsonSuccessBase
    """
    return 'do some magic!'


def get_server_settings():  # noqa: E501
    """Get server settings

    Fetch global settings for a Zulip server.  &#x60;GET {{ api_url }}/v1/server_settings&#x60;  **Note:** this endpoint does not require any authentication at all, and you can use it to check:  * If this is a Zulip server, and if so, what version of Zulip it&#39;s running. * What a Zulip client (e.g. a mobile app or [zulip-terminal](https://github.com/zulip/zulip-terminal/)) needs to know in order to display a login prompt for the server (e.g. what authentication methods are available).  # noqa: E501


    :rtype: JsonSuccessBase
    """
    return 'do some magic!'


def remove_code_playground(playground_id):  # noqa: E501
    """Remove a code playground

    Remove a [code playground](/help/code-blocks#code-playgrounds) previously configured for an organization.  &#x60;DELETE {{ api_url }}/v1/realm/playgrounds/{playground_id}&#x60;  **Changes**: New in Zulip 4.0 (feature level 49).  # noqa: E501

    :param playground_id: The ID of the playground that you want to remove. 
    :type playground_id: int

    :rtype: JsonSuccess
    """
    return 'do some magic!'


def remove_linkifier(filter_id):  # noqa: E501
    """Remove a linkifier

    Remove [linkifiers](/help/add-a-custom-linkifier), regular expression patterns that are automatically linkified when they appear in messages and topics.  &#x60;DELETE {{ api_url }}/v1/realm/filters/{filter_id}&#x60;  # noqa: E501

    :param filter_id: The ID of the linkifier that you want to remove. 
    :type filter_id: int

    :rtype: JsonSuccess
    """
    return 'do some magic!'


def reorder_custom_profile_fields(order):  # noqa: E501
    """Reorder custom profile fields

    Reorder the custom profile fields in the user&#39;s organization.  &#x60;PATCH {{ api_url }}/v1/realm/profile_fields&#x60;  Custom profile fields are displayed in Zulip UI widgets in order; this endpoint allows administrative settings UI to change the field ordering.  This endpoint is used to implement the dragging feature described in the [custom profile fields documentation](/help/add-custom-profile-fields).  # noqa: E501

    :param order: A list of the IDs of all the custom profile fields defined in this organization, in the desired new order. 
    :type order: List[int]

    :rtype: JsonSuccess
    """
    return 'do some magic!'


def update_linkifier(filter_id, pattern, url_format_string):  # noqa: E501
    """Update a linkifier

    Update a [linkifier](/help/add-a-custom-linkifier), regular expression patterns that are automatically linkified when they appear in messages and topics.  &#x60;PATCH {{ api_url }}/v1/realm/filters/{filter_id}&#x60;  **Changes**: New in Zulip 4.0 (feature level 57).  # noqa: E501

    :param filter_id: The ID of the linkifier that you want to update. 
    :type filter_id: int
    :param pattern: The [Python regular expression](https://docs.python.org/3/howto/regex.html) that should trigger the linkifier. 
    :type pattern: str
    :param url_format_string: The URL used for the link. If you used named groups for the &#x60;pattern&#x60;, you can insert their content here with &#x60;%(name_of_the_capturing_group)s&#x60;. 
    :type url_format_string: str

    :rtype: JsonSuccess
    """
    return 'do some magic!'


def upload_custom_emoji(emoji_name, filename=None):  # noqa: E501
    """Upload custom emoji

    This endpoint is used to upload a custom emoji for use in the user&#39;s organization.  Access to this endpoint depends on the [organization&#39;s configuration](https://zulip.com/help/only-allow-admins-to-add-emoji).  &#x60;POST {{ api_url }}/v1/realm/emoji/{emoji_name}&#x60;  # noqa: E501

    :param emoji_name: The name that should be associated with the uploaded emoji image/gif. The emoji name can only contain letters, numbers, dashes, and spaces. Upper and lower case letters are treated the same, and underscores (_) are treated the same as spaces (consistent with how the Zulip UI handles emoji). 
    :type emoji_name: str
    :param filename: 
    :type filename: str

    :rtype: JsonSuccess
    """
    return 'do some magic!'
