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
from openapi_server.models.coded_error import CodedError
from openapi_server.models.draft import Draft
from openapi_server.models.json_error import JsonError
from openapi_server.models.json_success import JsonSuccess


router = APIRouter()


@router.post(
    "/drafts",
    responses={
        200: {"model": JsonSuccess, "description": "Success."},
        400: {"model": CodedError, "description": "Bad request."},
    },
    tags=["drafts"],
    summary="Create drafts",
)
async def create_drafts(
    drafts: List[Draft] = Query(None, description="A JSON-encoded list of containing new draft objects. "),
) -> JsonSuccess:
    """Create one or more drafts on the server. These drafts will be automatically synchronized to other clients via &#x60;drafts&#x60; events.  &#x60;POST {{ api_url }}/v1/drafts&#x60; """
    ...


@router.delete(
    "/drafts/{draft_id}",
    responses={
        200: {"model": JsonSuccess, "description": "Success."},
        404: {"model": JsonError, "description": "Not Found."},
    },
    tags=["drafts"],
    summary="Delete a draft",
)
async def delete_draft(
    draft_id: int = Path(None, description="The ID of the draft you want to delete. "),
) -> JsonSuccess:
    """Delete a single draft from the server. The deletion will be automatically synchronized to other clients via a &#x60;drafts&#x60; event.  &#x60;DELETE {{ api_url }}/v1/drafts/{draft_id}&#x60; """
    ...


@router.patch(
    "/drafts/{draft_id}",
    responses={
        200: {"model": JsonSuccess, "description": "Success."},
        404: {"model": JsonError, "description": "Not Found."},
    },
    tags=["drafts"],
    summary="Edit a draft",
)
async def edit_draft(
    draft_id: int = Path(None, description="The ID of the draft to be edited. "),
    draft: Draft = Query(None, description="A JSON-encoded object containing a replacement draft object for this ID. "),
) -> JsonSuccess:
    """Edit a draft on the server. The edit will be automatically synchronized to other clients via &#x60;drafts&#x60; events.  &#x60;PATCH {{ api_url }}/v1/drafts/{draft_id}&#x60; """
    ...


@router.get(
    "/drafts",
    responses={
        200: {"model": JsonSuccess, "description": "Success."},
    },
    tags=["drafts"],
    summary="Get drafts",
)
async def get_drafts(
) -> JsonSuccess:
    """Fetch all drafts for the current user.  &#x60;GET {{ api_url }}/v1/drafts&#x60; """
    ...
