# coding: utf-8

from datetime import date, datetime

from typing import List, Dict, Type

from openapi_server.models.base_model_ import Model
from openapi_server.models.coded_error import CodedError
from openapi_server import util


class RateLimitedError(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, result: object=None, msg: object=None, code: object=None):
        """RateLimitedError - a model defined in OpenAPI

        :param result: The result of this RateLimitedError.
        :param msg: The msg of this RateLimitedError.
        :param code: The code of this RateLimitedError.
        """
        self.openapi_types = {
            'result': object,
            'msg': object,
            'code': object
        }

        self.attribute_map = {
            'result': 'result',
            'msg': 'msg',
            'code': 'code'
        }

        self._result = result
        self._msg = msg
        self._code = code

    @classmethod
    def from_dict(cls, dikt: dict) -> 'RateLimitedError':
        """Returns the dict as a model

        :param dikt: A dict.
        :return: The RateLimitedError of this RateLimitedError.
        """
        return util.deserialize_model(dikt, cls)

    @property
    def result(self):
        """Gets the result of this RateLimitedError.


        :return: The result of this RateLimitedError.
        :rtype: object
        """
        return self._result

    @result.setter
    def result(self, result):
        """Sets the result of this RateLimitedError.


        :param result: The result of this RateLimitedError.
        :type result: object
        """
        if result is None:
            raise ValueError("Invalid value for `result`, must not be `None`")

        self._result = result

    @property
    def msg(self):
        """Gets the msg of this RateLimitedError.


        :return: The msg of this RateLimitedError.
        :rtype: object
        """
        return self._msg

    @msg.setter
    def msg(self, msg):
        """Sets the msg of this RateLimitedError.


        :param msg: The msg of this RateLimitedError.
        :type msg: object
        """
        if msg is None:
            raise ValueError("Invalid value for `msg`, must not be `None`")

        self._msg = msg

    @property
    def code(self):
        """Gets the code of this RateLimitedError.


        :return: The code of this RateLimitedError.
        :rtype: object
        """
        return self._code

    @code.setter
    def code(self, code):
        """Sets the code of this RateLimitedError.


        :param code: The code of this RateLimitedError.
        :type code: object
        """

        self._code = code
