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
from openapi_server.models.inline_response200 import InlineResponse200


router = APIRouter()


@router.post(
    "/zulip-outgoing-webhook",
    responses={
        200: {"model": InlineResponse200, "description": "Success "},
    },
    tags=["webhooks"],
    summary="Outgoing webhooks",
)
async def zulip_outgoing_webhooks(
) -> InlineResponse200:
    """Outgoing webhooks allows to build or set up Zulip integrations which are notified when certain types of messages are sent in Zulip. """
    ...
