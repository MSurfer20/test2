# coding: utf-8

from __future__ import absolute_import

from flask import json
from six import BytesIO

from app.openapi_server.models.bad_event_queue_id_error import BadEventQueueIdError  # noqa: E501
from app.openapi_server.models.json_success import JsonSuccess  # noqa: E501
from app.openapi_server.models.json_success_base import JsonSuccessBase  # noqa: E501
from app.openapi_server.models.one_of_invalid_api_key_error_missing_argument_error_user_not_authorized_error import OneOfInvalidApiKeyErrorMissingArgumentErrorUserNotAuthorizedError  # noqa: E501
from app.openapi_server.models.one_of_rate_limited_error import OneOfRateLimitedError  # noqa: E501
from app.openapi_server.models.one_of_user_deactivated_error_realm_deactivated_error import OneOfUserDeactivatedErrorRealmDeactivatedError  # noqa: E501
from openapi_server.test import BaseTestCase


class TestRealTimeEventsController(BaseTestCase):
    """RealTimeEventsController integration test stubs"""

    def test_delete_queue(self):
        """Test case for delete_queue

        Delete an event queue
        """
        query_string = [('queue_id', '1375801870:2942')]
        response = self.client.open(
            '/api/v1/events',
            method='DELETE',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_events(self):
        """Test case for get_events

        Get events from an event queue
        """
        query_string = [('queue_id', '1375801870:2942'),
                        ('last_event_id', -1),
                        ('dont_block', False)]
        response = self.client.open(
            '/api/v1/events',
            method='GET',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_real_time_post(self):
        """Test case for real_time_post

        
        """
        query_string = [('event_types', ['event_types_example']),
                        ('narrow', []),
                        ('all_public_streams', False)]
        response = self.client.open(
            '/api/v1/real-time',
            method='POST',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_register_queue(self):
        """Test case for register_queue

        Register an event queue
        """
        query_string = [('apply_markdown', False),
                        ('client_gravatar', False),
                        ('slim_presence', False),
                        ('event_types', ['event_types_example']),
                        ('all_public_streams', False),
                        ('include_subscribers', False),
                        ('client_capabilities', None),
                        ('fetch_event_types', ['fetch_event_types_example']),
                        ('narrow', [])]
        response = self.client.open(
            '/api/v1/register',
            method='POST',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_rest_error_handling(self):
        """Test case for rest_error_handling

        Error handling
        """
        response = self.client.open(
            '/api/v1/rest-error-handling',
            method='POST')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    import unittest
    unittest.main()
