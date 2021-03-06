# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model_ import Model
from openapi_server.models.json_error import JsonError
from openapi_server import util

from openapi_server.models.json_error import JsonError  # noqa: E501

class InvalidApiKeyError(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, result=None, msg=None):  # noqa: E501
        """InvalidApiKeyError - a model defined in OpenAPI

        :param result: The result of this InvalidApiKeyError.  # noqa: E501
        :type result: object
        :param msg: The msg of this InvalidApiKeyError.  # noqa: E501
        :type msg: object
        """
        self.openapi_types = {
            'result': object,
            'msg': object
        }

        self.attribute_map = {
            'result': 'result',
            'msg': 'msg'
        }

        self._result = result
        self._msg = msg

    @classmethod
    def from_dict(cls, dikt) -> 'InvalidApiKeyError':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The InvalidApiKeyError of this InvalidApiKeyError.  # noqa: E501
        :rtype: InvalidApiKeyError
        """
        return util.deserialize_model(dikt, cls)

    @property
    def result(self):
        """Gets the result of this InvalidApiKeyError.


        :return: The result of this InvalidApiKeyError.
        :rtype: object
        """
        return self._result

    @result.setter
    def result(self, result):
        """Sets the result of this InvalidApiKeyError.


        :param result: The result of this InvalidApiKeyError.
        :type result: object
        """
        if result is None:
            raise ValueError("Invalid value for `result`, must not be `None`")  # noqa: E501

        self._result = result

    @property
    def msg(self):
        """Gets the msg of this InvalidApiKeyError.


        :return: The msg of this InvalidApiKeyError.
        :rtype: object
        """
        return self._msg

    @msg.setter
    def msg(self, msg):
        """Sets the msg of this InvalidApiKeyError.


        :param msg: The msg of this InvalidApiKeyError.
        :type msg: object
        """
        if msg is None:
            raise ValueError("Invalid value for `msg`, must not be `None`")  # noqa: E501

        self._msg = msg
