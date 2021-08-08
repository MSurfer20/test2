from typing import List, Dict
from aiohttp import web

from openapi_server.models.inline_response200 import InlineResponse200
from openapi_server import util


async def zulip_outgoing_webhooks(request: web.Request, ) -> web.Response:
    """Outgoing webhooks

    Outgoing webhooks allows to build or set up Zulip integrations which are notified when certain types of messages are sent in Zulip. 


    """
    return web.Response(status=200)
