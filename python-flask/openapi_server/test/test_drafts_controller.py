# coding: utf-8

from __future__ import absolute_import
import unittest

from flask import json
from six import BytesIO

from openapi_server.models.coded_error import CodedError  # noqa: E501
from openapi_server.models.draft import Draft  # noqa: E501
from openapi_server.models.json_error import JsonError  # noqa: E501
from openapi_server.models.json_success import JsonSuccess  # noqa: E501
from openapi_server.test import BaseTestCase


class TestDraftsController(BaseTestCase):
    """DraftsController integration test stubs"""

    def test_create_drafts(self):
        """Test case for create_drafts

        Create drafts
        """
        query_string = [('drafts', [openapi_server.Draft()])]
        headers = { 
            'Accept': 'application/json',
        }
        response = self.client.open(
            '/api/v1/drafts',
            method='POST',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_delete_draft(self):
        """Test case for delete_draft

        Delete a draft
        """
        headers = { 
            'Accept': 'application/json',
        }
        response = self.client.open(
            '/api/v1/drafts/{draft_id}'.format(draft_id=1),
            method='DELETE',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_edit_draft(self):
        """Test case for edit_draft

        Edit a draft
        """
        query_string = [('draft', openapi_server.Draft())]
        headers = { 
            'Accept': 'application/json',
        }
        response = self.client.open(
            '/api/v1/drafts/{draft_id}'.format(draft_id=2),
            method='PATCH',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_drafts(self):
        """Test case for get_drafts

        Get drafts
        """
        headers = { 
            'Accept': 'application/json',
        }
        response = self.client.open(
            '/api/v1/drafts',
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
