# coding: utf-8

from datetime import date, datetime

from typing import List, Dict, Type

from openapi_server.models.base_model_ import Model
from openapi_server.models.json_response_base import JsonResponseBase
from openapi_server.models.json_success_base_all_of import JsonSuccessBaseAllOf
from openapi_server import util


class JsonSuccessBase(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, result: str=None, msg: str=None):
        """JsonSuccessBase - a model defined in OpenAPI

        :param result: The result of this JsonSuccessBase.
        :param msg: The msg of this JsonSuccessBase.
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
    def from_dict(cls, dikt: dict) -> 'JsonSuccessBase':
        """Returns the dict as a model

        :param dikt: A dict.
        :return: The JsonSuccessBase of this JsonSuccessBase.
        """
        return util.deserialize_model(dikt, cls)

    @property
    def result(self):
        """Gets the result of this JsonSuccessBase.


        :return: The result of this JsonSuccessBase.
        :rtype: str
        """
        return self._result

    @result.setter
    def result(self, result):
        """Sets the result of this JsonSuccessBase.


        :param result: The result of this JsonSuccessBase.
        :type result: str
        """
        allowed_values = ["success"]  # noqa: E501
        if result not in allowed_values:
            raise ValueError(
                "Invalid value for `result` ({0}), must be one of {1}"
                .format(result, allowed_values)
            )

        self._result = result

    @property
    def msg(self):
        """Gets the msg of this JsonSuccessBase.


        :return: The msg of this JsonSuccessBase.
        :rtype: str
        """
        return self._msg

    @msg.setter
    def msg(self, msg):
        """Sets the msg of this JsonSuccessBase.


        :param msg: The msg of this JsonSuccessBase.
        :type msg: str
        """
        if msg is None:
            raise ValueError("Invalid value for `msg`, must not be `None`")

        self._msg = msg
