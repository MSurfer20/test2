# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model_ import Model
from openapi_server.models.invalid_message_error_all_of import InvalidMessageErrorAllOf
from openapi_server.models.json_success_base import JsonSuccessBase
from openapi_server import util

from openapi_server.models.invalid_message_error_all_of import InvalidMessageErrorAllOf  # noqa: E501
from openapi_server.models.json_success_base import JsonSuccessBase  # noqa: E501

class InvalidMessageError(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, result=None, msg=None, raw_content=None):  # noqa: E501
        """InvalidMessageError - a model defined in OpenAPI

        :param result: The result of this InvalidMessageError.  # noqa: E501
        :type result: object
        :param msg: The msg of this InvalidMessageError.  # noqa: E501
        :type msg: object
        :param raw_content: The raw_content of this InvalidMessageError.  # noqa: E501
        :type raw_content: str
        """
        self.openapi_types = {
            'result': object,
            'msg': object,
            'raw_content': str
        }

        self.attribute_map = {
            'result': 'result',
            'msg': 'msg',
            'raw_content': 'raw_content'
        }

        self._result = result
        self._msg = msg
        self._raw_content = raw_content

    @classmethod
    def from_dict(cls, dikt) -> 'InvalidMessageError':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The InvalidMessageError of this InvalidMessageError.  # noqa: E501
        :rtype: InvalidMessageError
        """
        return util.deserialize_model(dikt, cls)

    @property
    def result(self):
        """Gets the result of this InvalidMessageError.


        :return: The result of this InvalidMessageError.
        :rtype: object
        """
        return self._result

    @result.setter
    def result(self, result):
        """Sets the result of this InvalidMessageError.


        :param result: The result of this InvalidMessageError.
        :type result: object
        """
        if result is None:
            raise ValueError("Invalid value for `result`, must not be `None`")  # noqa: E501

        self._result = result

    @property
    def msg(self):
        """Gets the msg of this InvalidMessageError.


        :return: The msg of this InvalidMessageError.
        :rtype: object
        """
        return self._msg

    @msg.setter
    def msg(self, msg):
        """Sets the msg of this InvalidMessageError.


        :param msg: The msg of this InvalidMessageError.
        :type msg: object
        """
        if msg is None:
            raise ValueError("Invalid value for `msg`, must not be `None`")  # noqa: E501

        self._msg = msg

    @property
    def raw_content(self):
        """Gets the raw_content of this InvalidMessageError.

        The raw content of the message.   # noqa: E501

        :return: The raw_content of this InvalidMessageError.
        :rtype: str
        """
        return self._raw_content

    @raw_content.setter
    def raw_content(self, raw_content):
        """Sets the raw_content of this InvalidMessageError.

        The raw content of the message.   # noqa: E501

        :param raw_content: The raw_content of this InvalidMessageError.
        :type raw_content: str
        """

        self._raw_content = raw_content
