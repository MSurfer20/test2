# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model_ import Model
from openapi_server.models.json_error_base_all_of import JsonErrorBaseAllOf
from openapi_server.models.json_response_base import JsonResponseBase
from openapi_server import util

from openapi_server.models.json_error_base_all_of import JsonErrorBaseAllOf  # noqa: E501
from openapi_server.models.json_response_base import JsonResponseBase  # noqa: E501

class JsonErrorBase(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, result=None, msg=None):  # noqa: E501
        """JsonErrorBase - a model defined in OpenAPI

        :param result: The result of this JsonErrorBase.  # noqa: E501
        :type result: str
        :param msg: The msg of this JsonErrorBase.  # noqa: E501
        :type msg: str
        """
        self.openapi_types = {
            'result': str,
            'msg': str
        }

        self.attribute_map = {
            'result': 'result',
            'msg': 'msg'
        }

        self._result = result
        self._msg = msg

    @classmethod
    def from_dict(cls, dikt) -> 'JsonErrorBase':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The JsonErrorBase of this JsonErrorBase.  # noqa: E501
        :rtype: JsonErrorBase
        """
        return util.deserialize_model(dikt, cls)

    @property
    def result(self):
        """Gets the result of this JsonErrorBase.


        :return: The result of this JsonErrorBase.
        :rtype: str
        """
        return self._result

    @result.setter
    def result(self, result):
        """Sets the result of this JsonErrorBase.


        :param result: The result of this JsonErrorBase.
        :type result: str
        """
        allowed_values = ["error"]  # noqa: E501
        if result not in allowed_values:
            raise ValueError(
                "Invalid value for `result` ({0}), must be one of {1}"
                .format(result, allowed_values)
            )

        self._result = result

    @property
    def msg(self):
        """Gets the msg of this JsonErrorBase.


        :return: The msg of this JsonErrorBase.
        :rtype: str
        """
        return self._msg

    @msg.setter
    def msg(self, msg):
        """Sets the msg of this JsonErrorBase.


        :param msg: The msg of this JsonErrorBase.
        :type msg: str
        """
        if msg is None:
            raise ValueError("Invalid value for `msg`, must not be `None`")  # noqa: E501

        self._msg = msg
