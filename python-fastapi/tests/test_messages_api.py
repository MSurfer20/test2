# coding: utf-8

from fastapi.testclient import TestClient


from openapi_server.models.coded_error import CodedError  # noqa: F401
from openapi_server.models.invalid_message_error import InvalidMessageError  # noqa: F401
from openapi_server.models.json_success import JsonSuccess  # noqa: F401
from openapi_server.models.json_success_base import JsonSuccessBase  # noqa: F401
from openapi_server.models.one_ofobjectobject import OneOfobjectobject  # noqa: F401
from openapi_server.models.one_ofstringinteger import OneOfstringinteger  # noqa: F401


def test_add_reaction(client: TestClient):
    """Test case for add_reaction

    Add an emoji reaction
    """
    params = [("emoji_name", 'octopus'),     ("emoji_code", '1f419'),     ("reaction_type", 'unicode_emoji')]
    headers = {
    }
    response = client.request(
        "POST",
        "/messages/{message_id}/reactions".format(message_id=42),
        headers=headers,
        params=params,
    )

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_check_messages_match_narrow(client: TestClient):
    """Test case for check_messages_match_narrow

    Check if messages match a narrow
    """
    params = [("msg_ids", [56]),     ("narrow", None)]
    headers = {
    }
    response = client.request(
        "GET",
        "/messages/matches_narrow",
        headers=headers,
        params=params,
    )

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_delete_message(client: TestClient):
    """Test case for delete_message

    Delete a message
    """

    headers = {
    }
    response = client.request(
        "DELETE",
        "/messages/{message_id}".format(message_id=42),
        headers=headers,
    )

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_get_file_temporary_url(client: TestClient):
    """Test case for get_file_temporary_url

    Get public temporary URL
    """

    headers = {
    }
    response = client.request(
        "GET",
        "/user_uploads/{realm_id_str}/{filename}".format(realm_id_str=1, filename='4e/m2A3MSqFnWRLUf9SaPzQ0Up_/zulip.txt'),
        headers=headers,
    )

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_get_message_history(client: TestClient):
    """Test case for get_message_history

    Get a message's edit history
    """

    headers = {
    }
    response = client.request(
        "GET",
        "/messages/{message_id}/history".format(message_id=42),
        headers=headers,
    )

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_get_messages(client: TestClient):
    """Test case for get_messages

    Get messages
    """
    params = [("anchor", openapi_server.OneOfstringinteger()),     ("num_before", 4),     ("num_after", 8),     ("narrow", []),     ("client_gravatar", False),     ("apply_markdown", True),     ("use_first_unread_anchor", False)]
    headers = {
    }
    response = client.request(
        "GET",
        "/messages",
        headers=headers,
        params=params,
    )

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_get_raw_message(client: TestClient):
    """Test case for get_raw_message

    Get a message's raw Markdown
    """

    headers = {
    }
    response = client.request(
        "GET",
        "/messages/{message_id}".format(message_id=42),
        headers=headers,
    )

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_mark_all_as_read(client: TestClient):
    """Test case for mark_all_as_read

    Mark all messages as read
    """

    headers = {
    }
    response = client.request(
        "POST",
        "/mark_all_as_read",
        headers=headers,
    )

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_mark_stream_as_read(client: TestClient):
    """Test case for mark_stream_as_read

    Mark messages in a stream as read
    """
    params = [("stream_id", 42)]
    headers = {
    }
    response = client.request(
        "POST",
        "/mark_stream_as_read",
        headers=headers,
        params=params,
    )

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_mark_topic_as_read(client: TestClient):
    """Test case for mark_topic_as_read

    Mark messages in a topic as read
    """
    params = [("stream_id", 42),     ("topic_name", 'new coffee machine')]
    headers = {
    }
    response = client.request(
        "POST",
        "/mark_topic_as_read",
        headers=headers,
        params=params,
    )

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_remove_reaction(client: TestClient):
    """Test case for remove_reaction

    Remove an emoji reaction
    """
    params = [("emoji_name", 'octopus'),     ("emoji_code", '1f419'),     ("reaction_type", 'unicode_emoji')]
    headers = {
    }
    response = client.request(
        "DELETE",
        "/messages/{message_id}/reactions".format(message_id=42),
        headers=headers,
        params=params,
    )

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_render_message(client: TestClient):
    """Test case for render_message

    Render message
    """
    params = [("content", 'Hello')]
    headers = {
    }
    response = client.request(
        "POST",
        "/messages/render",
        headers=headers,
        params=params,
    )

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_send_message(client: TestClient):
    """Test case for send_message

    Send a message
    """
    params = [("type", 'private'),     ("to", [56]),     ("content", 'Hello'),     ("topic", 'Castle'),     ("queue_id", '1593114627:0'),     ("local_id", '100.01')]
    headers = {
    }
    response = client.request(
        "POST",
        "/messages",
        headers=headers,
        params=params,
    )

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_update_message(client: TestClient):
    """Test case for update_message

    Edit a message
    """
    params = [("topic", 'Castle'),     ("propagate_mode", 'change_one'),     ("send_notification_to_old_thread", True),     ("send_notification_to_new_thread", True),     ("content", 'Hello'),     ("stream_id", 42)]
    headers = {
    }
    response = client.request(
        "PATCH",
        "/messages/{message_id}".format(message_id=42),
        headers=headers,
        params=params,
    )

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_update_message_flags(client: TestClient):
    """Test case for update_message_flags

    Update personal message flags
    """
    params = [("messages", [56]),     ("op", 'add'),     ("flag", 'read')]
    headers = {
    }
    response = client.request(
        "POST",
        "/messages/flags",
        headers=headers,
        params=params,
    )

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_upload_file(client: TestClient):
    """Test case for upload_file

    Upload a file
    """

    headers = {
    }
    data = {
        "filename": '/path/to/file'
    }
    response = client.request(
        "POST",
        "/user_uploads",
        headers=headers,
        data=data,
    )

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200

