# coding: utf-8

from __future__ import absolute_import

from flask import json
from six import BytesIO

from app.openapi_server.models.coded_error import CodedError  # noqa: E501
from app.openapi_server.models.invalid_message_error import InvalidMessageError  # noqa: E501
from app.openapi_server.models.json_success import JsonSuccess  # noqa: E501
from app.openapi_server.models.json_success_base import JsonSuccessBase  # noqa: E501
from app.openapi_server.models.one_ofobjectobject import OneOfobjectobject  # noqa: E501
from app.openapi_server.models.one_ofstringinteger import OneOfstringinteger  # noqa: E501
from openapi_server.test import BaseTestCase


class TestMessagesController(BaseTestCase):
    """MessagesController integration test stubs"""

    def test_add_reaction(self):
        """Test case for add_reaction

        Add an emoji reaction
        """
        query_string = [('emoji_name', 'octopus'),
                        ('emoji_code', '1f419'),
                        ('reaction_type', 'unicode_emoji')]
        response = self.client.open(
            '/api/v1/messages/{message_id}/reactions'.format(message_id=42),
            method='POST',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_check_messages_match_narrow(self):
        """Test case for check_messages_match_narrow

        Check if messages match a narrow
        """
        query_string = [('msg_ids', [56]),
                        ('narrow', None)]
        response = self.client.open(
            '/api/v1/messages/matches_narrow',
            method='GET',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_delete_message(self):
        """Test case for delete_message

        Delete a message
        """
        response = self.client.open(
            '/api/v1/messages/{message_id}'.format(message_id=42),
            method='DELETE')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_file_temporary_url(self):
        """Test case for get_file_temporary_url

        Get public temporary URL
        """
        response = self.client.open(
            '/api/v1/user_uploads/{realm_id_str}/{filename}'.format(realm_id_str=1, filename='4e/m2A3MSqFnWRLUf9SaPzQ0Up_/zulip.txt'),
            method='GET')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_message_history(self):
        """Test case for get_message_history

        Get a message's edit history
        """
        response = self.client.open(
            '/api/v1/messages/{message_id}/history'.format(message_id=42),
            method='GET')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_messages(self):
        """Test case for get_messages

        Get messages
        """
        query_string = [('anchor', openapi_server.OneOfstringinteger()),
                        ('num_before', 4),
                        ('num_after', 8),
                        ('narrow', []),
                        ('client_gravatar', False),
                        ('apply_markdown', True),
                        ('use_first_unread_anchor', False)]
        response = self.client.open(
            '/api/v1/messages',
            method='GET',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_raw_message(self):
        """Test case for get_raw_message

        Get a message's raw Markdown
        """
        response = self.client.open(
            '/api/v1/messages/{message_id}'.format(message_id=42),
            method='GET')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_mark_all_as_read(self):
        """Test case for mark_all_as_read

        Mark all messages as read
        """
        response = self.client.open(
            '/api/v1/mark_all_as_read',
            method='POST')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_mark_stream_as_read(self):
        """Test case for mark_stream_as_read

        Mark messages in a stream as read
        """
        query_string = [('stream_id', 42)]
        response = self.client.open(
            '/api/v1/mark_stream_as_read',
            method='POST',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_mark_topic_as_read(self):
        """Test case for mark_topic_as_read

        Mark messages in a topic as read
        """
        query_string = [('stream_id', 42),
                        ('topic_name', 'new coffee machine')]
        response = self.client.open(
            '/api/v1/mark_topic_as_read',
            method='POST',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_remove_reaction(self):
        """Test case for remove_reaction

        Remove an emoji reaction
        """
        query_string = [('emoji_name', 'octopus'),
                        ('emoji_code', '1f419'),
                        ('reaction_type', 'unicode_emoji')]
        response = self.client.open(
            '/api/v1/messages/{message_id}/reactions'.format(message_id=42),
            method='DELETE',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_render_message(self):
        """Test case for render_message

        Render message
        """
        query_string = [('content', 'Hello')]
        response = self.client.open(
            '/api/v1/messages/render',
            method='POST',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_send_message(self):
        """Test case for send_message

        Send a message
        """
        query_string = [('type', 'private'),
                        ('to', [56]),
                        ('content', 'Hello'),
                        ('topic', 'Castle'),
                        ('queue_id', '1593114627:0'),
                        ('local_id', '100.01')]
        response = self.client.open(
            '/api/v1/messages',
            method='POST',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_update_message(self):
        """Test case for update_message

        Edit a message
        """
        query_string = [('topic', 'Castle'),
                        ('propagate_mode', 'change_one'),
                        ('send_notification_to_old_thread', True),
                        ('send_notification_to_new_thread', True),
                        ('content', 'Hello'),
                        ('stream_id', 42)]
        response = self.client.open(
            '/api/v1/messages/{message_id}'.format(message_id=42),
            method='PATCH',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_update_message_flags(self):
        """Test case for update_message_flags

        Update personal message flags
        """
        query_string = [('messages', [56]),
                        ('op', 'add'),
                        ('flag', 'read')]
        response = self.client.open(
            '/api/v1/messages/flags',
            method='POST',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_upload_file(self):
        """Test case for upload_file

        Upload a file
        """
        data = dict(filename='/path/to/file')
        response = self.client.open(
            '/api/v1/user_uploads',
            method='POST',
            data=data,
            content_type='multipart/form-data')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    import unittest
    unittest.main()
