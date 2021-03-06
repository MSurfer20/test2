# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from app.openapi_server.models.base_model_ import Model
from app.openapi_server.models.coded_error_base_all_of import CodedErrorBaseAllOf  # noqa: F401,E501
from app.openapi_server.models.json_error_base import JsonErrorBase  # noqa: F401,E501
from openapi_server import util


class CodedErrorBase(Model):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    """

    def __init__(self, result: object=None, msg: object=None, code: str=None):  # noqa: E501
        """CodedErrorBase - a model defined in Swagger

        :param result: The result of this CodedErrorBase.  # noqa: E501
        :type result: object
        :param msg: The msg of this CodedErrorBase.  # noqa: E501
        :type msg: object
        :param code: The code of this CodedErrorBase.  # noqa: E501
        :type code: str
        """
        self.swagger_types = {
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
    def from_dict(cls, dikt) -> 'CodedErrorBase':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The CodedErrorBase of this CodedErrorBase.  # noqa: E501
        :rtype: CodedErrorBase
        """
        return util.deserialize_model(dikt, cls)

    @property
    def result(self) -> object:
        """Gets the result of this CodedErrorBase.


        :return: The result of this CodedErrorBase.
        :rtype: object
        """
        return self._result

    @result.setter
    def result(self, result: object):
        """Sets the result of this CodedErrorBase.


        :param result: The result of this CodedErrorBase.
        :type result: object
        """
        if result is None:
            raise ValueError("Invalid value for `result`, must not be `None`")  # noqa: E501

        self._result = result

    @property
    def msg(self) -> object:
        """Gets the msg of this CodedErrorBase.


        :return: The msg of this CodedErrorBase.
        :rtype: object
        """
        return self._msg

    @msg.setter
    def msg(self, msg: object):
        """Sets the msg of this CodedErrorBase.


        :param msg: The msg of this CodedErrorBase.
        :type msg: object
        """
        if msg is None:
            raise ValueError("Invalid value for `msg`, must not be `None`")  # noqa: E501

        self._msg = msg

    @property
    def code(self) -> str:
        """Gets the code of this CodedErrorBase.

        A string that identifies the error.   # noqa: E501

        :return: The code of this CodedErrorBase.
        :rtype: str
        """
        return self._code

    @code.setter
    def code(self, code: str):
        """Sets the code of this CodedErrorBase.

        A string that identifies the error.   # noqa: E501

        :param code: The code of this CodedErrorBase.
        :type code: str
        """

        self._code = code
