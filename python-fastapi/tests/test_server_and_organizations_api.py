# coding: utf-8

from fastapi.testclient import TestClient


from openapi_server.models.json_success import JsonSuccess  # noqa: F401
from openapi_server.models.json_success_base import JsonSuccessBase  # noqa: F401


def test_add_code_playground(client: TestClient):
    """Test case for add_code_playground

    Add a code playground
    """
    params = [("name", 'Python playground'),     ("pygments_language", 'Python'),     ("url_prefix", 'https://python.example.com')]
    headers = {
    }
    response = client.request(
        "POST",
        "/realm/playgrounds",
        headers=headers,
        params=params,
    )

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_add_linkifier(client: TestClient):
    """Test case for add_linkifier

    Add a linkifier
    """
    params = [("pattern", '#(?P<id>[0-9]+)'),     ("url_format_string", 'https://github.com/zulip/zulip/issues/%(id)s')]
    headers = {
    }
    response = client.request(
        "POST",
        "/realm/filters",
        headers=headers,
        params=params,
    )

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_create_custom_profile_field(client: TestClient):
    """Test case for create_custom_profile_field

    Create a custom profile field
    """
    params = [("name", 'Favorite programming language'),     ("hint", 'Your favorite programming language.'),     ("field_type", 3),     ("field_data", None)]
    headers = {
    }
    response = client.request(
        "POST",
        "/realm/profile_fields",
        headers=headers,
        params=params,
    )

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_get_custom_emoji(client: TestClient):
    """Test case for get_custom_emoji

    Get all custom emoji
    """

    headers = {
    }
    response = client.request(
        "GET",
        "/realm/emoji",
        headers=headers,
    )

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_get_custom_profile_fields(client: TestClient):
    """Test case for get_custom_profile_fields

    Get all custom profile fields
    """

    headers = {
    }
    response = client.request(
        "GET",
        "/realm/profile_fields",
        headers=headers,
    )

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_get_linkifiers(client: TestClient):
    """Test case for get_linkifiers

    Get linkifiers
    """

    headers = {
    }
    response = client.request(
        "GET",
        "/realm/linkifiers",
        headers=headers,
    )

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_get_server_settings(client: TestClient):
    """Test case for get_server_settings

    Get server settings
    """

    headers = {
    }
    response = client.request(
        "GET",
        "/server_settings",
        headers=headers,
    )

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_remove_code_playground(client: TestClient):
    """Test case for remove_code_playground

    Remove a code playground
    """

    headers = {
    }
    response = client.request(
        "DELETE",
        "/realm/playgrounds/{playground_id}".format(playground_id=1),
        headers=headers,
    )

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_remove_linkifier(client: TestClient):
    """Test case for remove_linkifier

    Remove a linkifier
    """

    headers = {
    }
    response = client.request(
        "DELETE",
        "/realm/filters/{filter_id}".format(filter_id=42),
        headers=headers,
    )

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_reorder_custom_profile_fields(client: TestClient):
    """Test case for reorder_custom_profile_fields

    Reorder custom profile fields
    """
    params = [("order", [56])]
    headers = {
    }
    response = client.request(
        "PATCH",
        "/realm/profile_fields",
        headers=headers,
        params=params,
    )

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_update_linkifier(client: TestClient):
    """Test case for update_linkifier

    Update a linkifier
    """
    params = [("pattern", '#(?P<id>[0-9]+)'),     ("url_format_string", 'https://github.com/zulip/zulip/issues/%(id)s')]
    headers = {
    }
    response = client.request(
        "PATCH",
        "/realm/filters/{filter_id}".format(filter_id=2),
        headers=headers,
        params=params,
    )

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_upload_custom_emoji(client: TestClient):
    """Test case for upload_custom_emoji

    Upload custom emoji
    """

    headers = {
    }
    data = {
        "filename": '/path/to/file'
    }
    response = client.request(
        "POST",
        "/realm/emoji/{emoji_name}".format(emoji_name='smile'),
        headers=headers,
        data=data,
    )

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200

