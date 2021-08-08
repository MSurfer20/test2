import connexion
import six

from openapi_server.models.coded_error import CodedError  # noqa: E501
from openapi_server.models.draft import Draft  # noqa: E501
from openapi_server.models.json_error import JsonError  # noqa: E501
from openapi_server.models.json_success import JsonSuccess  # noqa: E501
from openapi_server import util


def create_drafts(drafts=None):  # noqa: E501
    """Create drafts

    Create one or more drafts on the server. These drafts will be automatically synchronized to other clients via &#x60;drafts&#x60; events.  &#x60;POST {{ api_url }}/v1/drafts&#x60;  # noqa: E501

    :param drafts: A JSON-encoded list of containing new draft objects. 
    :type drafts: list | bytes

    :rtype: JsonSuccess
    """
    if connexion.request.is_json:
        drafts = [Draft.from_dict(d) for d in connexion.request.get_json()]  # noqa: E501
    return 'do some magic!'


def delete_draft(draft_id):  # noqa: E501
    """Delete a draft

    Delete a single draft from the server. The deletion will be automatically synchronized to other clients via a &#x60;drafts&#x60; event.  &#x60;DELETE {{ api_url }}/v1/drafts/{draft_id}&#x60;  # noqa: E501

    :param draft_id: The ID of the draft you want to delete. 
    :type draft_id: int

    :rtype: JsonSuccess
    """
    return 'do some magic!'


def edit_draft(draft_id, draft):  # noqa: E501
    """Edit a draft

    Edit a draft on the server. The edit will be automatically synchronized to other clients via &#x60;drafts&#x60; events.  &#x60;PATCH {{ api_url }}/v1/drafts/{draft_id}&#x60;  # noqa: E501

    :param draft_id: The ID of the draft to be edited. 
    :type draft_id: int
    :param draft: A JSON-encoded object containing a replacement draft object for this ID. 
    :type draft: dict | bytes

    :rtype: JsonSuccess
    """
    if connexion.request.is_json:
        draft =  Draft.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def get_drafts():  # noqa: E501
    """Get drafts

    Fetch all drafts for the current user.  &#x60;GET {{ api_url }}/v1/drafts&#x60;  # noqa: E501


    :rtype: JsonSuccess
    """
    return 'do some magic!'
