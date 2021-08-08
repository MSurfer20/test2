# coding: utf-8

from fastapi.testclient import TestClient


from openapi_server.models.coded_error import CodedError  # noqa: F401
from openapi_server.models.draft import Draft  # noqa: F401
from openapi_server.models.json_error import JsonError  # noqa: F401
from openapi_server.models.json_success import JsonSuccess  # noqa: F401


def test_create_drafts(client: TestClient):
    """Test case for create_drafts

    Create drafts
    """
    params = [("drafts", [openapi_server.Draft()])]
    headers = {
    }
    response = client.request(
        "POST",
        "/drafts",
        headers=headers,
        params=params,
    )

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_delete_draft(client: TestClient):
    """Test case for delete_draft

    Delete a draft
    """

    headers = {
    }
    response = client.request(
        "DELETE",
        "/drafts/{draft_id}".format(draft_id=1),
        headers=headers,
    )

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_edit_draft(client: TestClient):
    """Test case for edit_draft

    Edit a draft
    """
    params = [("draft", openapi_server.Draft())]
    headers = {
    }
    response = client.request(
        "PATCH",
        "/drafts/{draft_id}".format(draft_id=2),
        headers=headers,
        params=params,
    )

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_get_drafts(client: TestClient):
    """Test case for get_drafts

    Get drafts
    """

    headers = {
    }
    response = client.request(
        "GET",
        "/drafts",
        headers=headers,
    )

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200

