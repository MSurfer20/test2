# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from app.openapi_server.models.base_model_ import Model
from app.openapi_server.models.api_key_response_all_of import ApiKeyResponseAllOf  # noqa: F401,E501
from app.openapi_server.models.json_success_base import JsonSuccessBase  # noqa: F401,E501
from openapi_server import util


class ApiKeyResponse(Model):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    """

    def __init__(self, result: object=None, msg: object=None, api_key: str=None, email: str=None):  # noqa: E501
        """ApiKeyResponse - a model defined in Swagger

        :param result: The result of this ApiKeyResponse.  # noqa: E501
        :type result: object
        :param msg: The msg of this ApiKeyResponse.  # noqa: E501
        :type msg: object
        :param api_key: The api_key of this ApiKeyResponse.  # noqa: E501
        :type api_key: str
        :param email: The email of this ApiKeyResponse.  # noqa: E501
        :type email: str
        """
        self.swagger_types = {
            'result': object,
            'msg': object,
            'api_key': str,
            'email': str
        }

        self.attribute_map = {
            'result': 'result',
            'msg': 'msg',
            'api_key': 'api_key',
            'email': 'email'
        }

        self._result = result
        self._msg = msg
        self._api_key = api_key
        self._email = email

    @classmethod
    def from_dict(cls, dikt) -> 'ApiKeyResponse':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The ApiKeyResponse of this ApiKeyResponse.  # noqa: E501
        :rtype: ApiKeyResponse
        """
        return util.deserialize_model(dikt, cls)

    @property
    def result(self) -> object:
        """Gets the result of this ApiKeyResponse.


        :return: The result of this ApiKeyResponse.
        :rtype: object
        """
        return self._result

    @result.setter
    def result(self, result: object):
        """Sets the result of this ApiKeyResponse.


        :param result: The result of this ApiKeyResponse.
        :type result: object
        """
        if result is None:
            raise ValueError("Invalid value for `result`, must not be `None`")  # noqa: E501

        self._result = result

    @property
    def msg(self) -> object:
        """Gets the msg of this ApiKeyResponse.


        :return: The msg of this ApiKeyResponse.
        :rtype: object
        """
        return self._msg

    @msg.setter
    def msg(self, msg: object):
        """Sets the msg of this ApiKeyResponse.


        :param msg: The msg of this ApiKeyResponse.
        :type msg: object
        """
        if msg is None:
            raise ValueError("Invalid value for `msg`, must not be `None`")  # noqa: E501

        self._msg = msg

    @property
    def api_key(self) -> str:
        """Gets the api_key of this ApiKeyResponse.

        The API key that can be used to authenticate as the requested user.   # noqa: E501

        :return: The api_key of this ApiKeyResponse.
        :rtype: str
        """
        return self._api_key

    @api_key.setter
    def api_key(self, api_key: str):
        """Sets the api_key of this ApiKeyResponse.

        The API key that can be used to authenticate as the requested user.   # noqa: E501

        :param api_key: The api_key of this ApiKeyResponse.
        :type api_key: str
        """
        if api_key is None:
            raise ValueError("Invalid value for `api_key`, must not be `None`")  # noqa: E501

        self._api_key = api_key

    @property
    def email(self) -> str:
        """Gets the email of this ApiKeyResponse.

        The email address of the user who owns the API key   # noqa: E501

        :return: The email of this ApiKeyResponse.
        :rtype: str
        """
        return self._email

    @email.setter
    def email(self, email: str):
        """Sets the email of this ApiKeyResponse.

        The email address of the user who owns the API key   # noqa: E501

        :param email: The email of this ApiKeyResponse.
        :type email: str
        """
        if email is None:
            raise ValueError("Invalid value for `email`, must not be `None`")  # noqa: E501

        self._email = email
