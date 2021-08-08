from typing import List, Dict
from aiohttp import web

from openapi_server.models.coded_error import CodedError
from openapi_server.models.draft import Draft
from openapi_server.models.json_error import JsonError
from openapi_server.models.json_success import JsonSuccess
from openapi_server import util


async def create_drafts(request: web.Request, drafts=None) -> web.Response:
    """Create drafts

    Create one or more drafts on the server. These drafts will be automatically synchronized to other clients via &#x60;drafts&#x60; events.  &#x60;POST {{ api_url }}/v1/drafts&#x60; 

    :param drafts: A JSON-encoded list of containing new draft objects. 
    :type drafts: list | bytes

    """
    drafts = [Draft.from_dict(d) for d in drafts]
    return web.Response(status=200)


async def delete_draft(request: web.Request, draft_id) -> web.Response:
    """Delete a draft

    Delete a single draft from the server. The deletion will be automatically synchronized to other clients via a &#x60;drafts&#x60; event.  &#x60;DELETE {{ api_url }}/v1/drafts/{draft_id}&#x60; 

    :param draft_id: The ID of the draft you want to delete. 
    :type draft_id: int

    """
    return web.Response(status=200)


async def edit_draft(request: web.Request, draft_id, draft) -> web.Response:
    """Edit a draft

    Edit a draft on the server. The edit will be automatically synchronized to other clients via &#x60;drafts&#x60; events.  &#x60;PATCH {{ api_url }}/v1/drafts/{draft_id}&#x60; 

    :param draft_id: The ID of the draft to be edited. 
    :type draft_id: int
    :param draft: A JSON-encoded object containing a replacement draft object for this ID. 
    :type draft: dict | bytes

    """
    draft = .from_dict(draft)
    return web.Response(status=200)


async def get_drafts(request: web.Request, ) -> web.Response:
    """Get drafts

    Fetch all drafts for the current user.  &#x60;GET {{ api_url }}/v1/drafts&#x60; 


    """
    return web.Response(status=200)
