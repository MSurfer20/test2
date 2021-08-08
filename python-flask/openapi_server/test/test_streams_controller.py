# coding: utf-8

from __future__ import absolute_import
import unittest

from flask import json
from six import BytesIO

from openapi_server.models.coded_error import CodedError  # noqa: E501
from openapi_server.models.json_error import JsonError  # noqa: E501
from openapi_server.models.json_success import JsonSuccess  # noqa: E501
from openapi_server.models.json_success_base import JsonSuccessBase  # noqa: E501
from openapi_server.models.non_existing_stream_error import NonExistingStreamError  # noqa: E501
from openapi_server.models.one_ofobjectobject import OneOfobjectobject  # noqa: E501
from openapi_server.models.one_ofstringinteger import OneOfstringinteger  # noqa: E501
from openapi_server.test import BaseTestCase


class TestStreamsController(BaseTestCase):
    """StreamsController integration test stubs"""

    def test_archive_stream(self):
        """Test case for archive_stream

        Archive a stream
        """
        headers = { 
            'Accept': 'application/json',
        }
        response = self.client.open(
            '/api/v1/streams/{stream_id}'.format(stream_id=1),
            method='DELETE',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_create_big_blue_button_video_call(self):
        """Test case for create_big_blue_button_video_call

        Create BigBlueButton video call
        """
        headers = { 
            'Accept': 'application/json',
        }
        response = self.client.open(
            '/api/v1/calls/bigbluebutton/create',
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_stream_id(self):
        """Test case for get_stream_id

        Get stream ID
        """
        query_string = [('stream', 'Denmark')]
        headers = { 
            'Accept': 'application/json',
        }
        response = self.client.open(
            '/api/v1/get_stream_id',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_stream_topics(self):
        """Test case for get_stream_topics

        Get topics in a stream
        """
        headers = { 
            'Accept': 'application/json',
        }
        response = self.client.open(
            '/api/v1/users/me/{stream_id}/topics'.format(stream_id=1),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_streams(self):
        """Test case for get_streams

        Get all streams
        """
        query_string = [('include_public', True),
                        ('include_web_public', False),
                        ('include_subscribed', True),
                        ('include_all_active', False),
                        ('include_default', False),
                        ('include_owner_subscribed', False)]
        headers = { 
            'Accept': 'application/json',
        }
        response = self.client.open(
            '/api/v1/streams',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_subscription_status(self):
        """Test case for get_subscription_status

        Get subscription status
        """
        headers = { 
            'Accept': 'application/json',
        }
        response = self.client.open(
            '/api/v1/users/{user_id}/subscriptions/{stream_id}'.format(user_id=12, stream_id=1),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_subscriptions(self):
        """Test case for get_subscriptions

        Get subscribed streams
        """
        query_string = [('include_subscribers', False)]
        headers = { 
            'Accept': 'application/json',
        }
        response = self.client.open(
            '/api/v1/users/me/subscriptions',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_mute_topic(self):
        """Test case for mute_topic

        Topic muting
        """
        query_string = [('stream', 'Denmark'),
                        ('stream_id', 42),
                        ('topic', 'dinner'),
                        ('op', 'add')]
        headers = { 
            'Accept': 'application/json',
        }
        response = self.client.open(
            '/api/v1/users/me/subscriptions/muted_topics',
            method='PATCH',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_subscribe(self):
        """Test case for subscribe

        Subscribe to a stream
        """
        query_string = [('subscriptions', None),
                        ('principals', [openapi_server.OneOfstringinteger()]),
                        ('authorization_errors_fatal', True),
                        ('announce', False),
                        ('invite_only', False),
                        ('history_public_to_subscribers', false),
                        ('stream_post_policy', 1),
                        ('message_retention_days', openapi_server.OneOfstringinteger())]
        headers = { 
            'Accept': 'application/json',
        }
        response = self.client.open(
            '/api/v1/users/me/subscriptions',
            method='POST',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_unsubscribe(self):
        """Test case for unsubscribe

        Unsubscribe from a stream
        """
        query_string = [('subscriptions', ['subscriptions_example']),
                        ('principals', [openapi_server.OneOfstringinteger()])]
        headers = { 
            'Accept': 'application/json',
        }
        response = self.client.open(
            '/api/v1/users/me/subscriptions',
            method='DELETE',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_update_stream(self):
        """Test case for update_stream

        Update a stream
        """
        query_string = [('description', 'Discuss Italian history and travel destinations.'),
                        ('new_name', 'Italy'),
                        ('is_private', true),
                        ('is_announcement_only', true),
                        ('stream_post_policy', 1),
                        ('history_public_to_subscribers', false),
                        ('message_retention_days', openapi_server.OneOfstringinteger())]
        headers = { 
            'Accept': 'application/json',
        }
        response = self.client.open(
            '/api/v1/streams/{stream_id}'.format(stream_id=1),
            method='PATCH',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_update_subscription_settings(self):
        """Test case for update_subscription_settings

        Update subscription settings
        """
        query_string = [('subscription_data', None)]
        headers = { 
            'Accept': 'application/json',
        }
        response = self.client.open(
            '/api/v1/users/me/subscriptions/properties',
            method='POST',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_update_subscriptions(self):
        """Test case for update_subscriptions

        Update subscriptions
        """
        query_string = [('delete', ['delete_example']),
                        ('add', None)]
        headers = { 
            'Accept': 'application/json',
        }
        response = self.client.open(
            '/api/v1/users/me/subscriptions',
            method='PATCH',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
