# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from app.openapi_server.models.base_model_ import Model
from app.openapi_server.models.coded_error_all_of import CodedErrorAllOf  # noqa: F401,E501
from app.openapi_server.models.coded_error_base import CodedErrorBase  # noqa: F401,E501
from openapi_server import util


class CodedError(Model):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    """

    def __init__(self, result: object=None, msg: object=None, code: object=None):  # noqa: E501
        """CodedError - a model defined in Swagger

        :param result: The result of this CodedError.  # noqa: E501
        :type result: object
        :param msg: The msg of this CodedError.  # noqa: E501
        :type msg: object
        :param code: The code of this CodedError.  # noqa: E501
        :type code: object
        """
        self.swagger_types = {
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
    def from_dict(cls, dikt) -> 'CodedError':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The CodedError of this CodedError.  # noqa: E501
        :rtype: CodedError
        """
        return util.deserialize_model(dikt, cls)

    @property
    def result(self) -> object:
        """Gets the result of this CodedError.


        :return: The result of this CodedError.
        :rtype: object
        """
        return self._result

    @result.setter
    def result(self, result: object):
        """Sets the result of this CodedError.


        :param result: The result of this CodedError.
        :type result: object
        """
        if result is None:
            raise ValueError("Invalid value for `result`, must not be `None`")  # noqa: E501

        self._result = result

    @property
    def msg(self) -> object:
        """Gets the msg of this CodedError.


        :return: The msg of this CodedError.
        :rtype: object
        """
        return self._msg

    @msg.setter
    def msg(self, msg: object):
        """Sets the msg of this CodedError.


        :param msg: The msg of this CodedError.
        :type msg: object
        """
        if msg is None:
            raise ValueError("Invalid value for `msg`, must not be `None`")  # noqa: E501

        self._msg = msg

    @property
    def code(self) -> object:
        """Gets the code of this CodedError.


        :return: The code of this CodedError.
        :rtype: object
        """
        return self._code

    @code.setter
    def code(self, code: object):
        """Sets the code of this CodedError.


        :param code: The code of this CodedError.
        :type code: object
        """

        self._code = code
