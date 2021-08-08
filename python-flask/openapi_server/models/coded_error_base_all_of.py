# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model_ import Model
from openapi_server import util


class CodedErrorBaseAllOf(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, result=None, msg=None, code=None):  # noqa: E501
        """CodedErrorBaseAllOf - a model defined in OpenAPI

        :param result: The result of this CodedErrorBaseAllOf.  # noqa: E501
        :type result: object
        :param msg: The msg of this CodedErrorBaseAllOf.  # noqa: E501
        :type msg: object
        :param code: The code of this CodedErrorBaseAllOf.  # noqa: E501
        :type code: str
        """
        self.openapi_types = {
            'result': object,
            'msg': object,
            'code': str
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
    def from_dict(cls, dikt) -> 'CodedErrorBaseAllOf':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The CodedErrorBase_allOf of this CodedErrorBaseAllOf.  # noqa: E501
        :rtype: CodedErrorBaseAllOf
        """
        return util.deserialize_model(dikt, cls)

    @property
    def result(self):
        """Gets the result of this CodedErrorBaseAllOf.


        :return: The result of this CodedErrorBaseAllOf.
        :rtype: object
        """
        return self._result

    @result.setter
    def result(self, result):
        """Sets the result of this CodedErrorBaseAllOf.


        :param result: The result of this CodedErrorBaseAllOf.
        :type result: object
        """

        self._result = result

    @property
    def msg(self):
        """Gets the msg of this CodedErrorBaseAllOf.


        :return: The msg of this CodedErrorBaseAllOf.
        :rtype: object
        """
        return self._msg

    @msg.setter
    def msg(self, msg):
        """Sets the msg of this CodedErrorBaseAllOf.


        :param msg: The msg of this CodedErrorBaseAllOf.
        :type msg: object
        """

        self._msg = msg

    @property
    def code(self):
        """Gets the code of this CodedErrorBaseAllOf.

        A string that identifies the error.   # noqa: E501

        :return: The code of this CodedErrorBaseAllOf.
        :rtype: str
        """
        return self._code

    @code.setter
    def code(self, code):
        """Sets the code of this CodedErrorBaseAllOf.

        A string that identifies the error.   # noqa: E501

        :param code: The code of this CodedErrorBaseAllOf.
        :type code: str
        """

        self._code = code
