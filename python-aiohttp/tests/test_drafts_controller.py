# coding: utf-8

import pytest
import json
from aiohttp import web

from openapi_server.models.coded_error import CodedError
from openapi_server.models.draft import Draft
from openapi_server.models.json_error import JsonError
from openapi_server.models.json_success import JsonSuccess


async def test_create_drafts(client):
    """Test case for create_drafts

    Create drafts
    """
    params = [('drafts', [openapi_server.Draft()])]
    headers = { 
        'Accept': 'application/json',
    }
    response = await client.request(
        method='POST',
        path='/api/v1/drafts',
        headers=headers,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


async def test_delete_draft(client):
    """Test case for delete_draft

    Delete a draft
    """
    headers = { 
        'Accept': 'application/json',
    }
    response = await client.request(
        method='DELETE',
        path='/api/v1/drafts/{draft_id}'.format(draft_id=1),
        headers=headers,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


async def test_edit_draft(client):
    """Test case for edit_draft

    Edit a draft
    """
    params = [('draft', openapi_server.Draft())]
    headers = { 
        'Accept': 'application/json',
    }
    response = await client.request(
        method='PATCH',
        path='/api/v1/drafts/{draft_id}'.format(draft_id=2),
        headers=headers,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


async def test_get_drafts(client):
    """Test case for get_drafts

    Get drafts
    """
    headers = { 
        'Accept': 'application/json',
    }
    response = await client.request(
        method='GET',
        path='/api/v1/drafts',
        headers=headers,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')

