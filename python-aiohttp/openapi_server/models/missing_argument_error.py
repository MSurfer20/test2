# coding: utf-8

from datetime import date, datetime

from typing import List, Dict, Type

from openapi_server.models.base_model_ import Model
from openapi_server.models.coded_error_base import CodedErrorBase
from openapi_server.models.missing_argument_error_all_of import MissingArgumentErrorAllOf
from openapi_server import util


class MissingArgumentError(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, result: object=None, msg: object=None, code: object=None, var_name: str=None):
        """MissingArgumentError - a model defined in OpenAPI

        :param result: The result of this MissingArgumentError.
        :param msg: The msg of this MissingArgumentError.
        :param code: The code of this MissingArgumentError.
        :param var_name: The var_name of this MissingArgumentError.
        """
        self.openapi_types = {
            'result': object,
            'msg': object,
            'code': object,
            'var_name': str
        }

        self.attribute_map = {
            'result': 'result',
            'msg': 'msg',
            'code': 'code',
            'var_name': 'var_name'
        }

        self._result = result
        self._msg = msg
        self._code = code
        self._var_name = var_name

    @classmethod
    def from_dict(cls, dikt: dict) -> 'MissingArgumentError':
        """Returns the dict as a model

        :param dikt: A dict.
        :return: The MissingArgumentError of this MissingArgumentError.
        """
        return util.deserialize_model(dikt, cls)

    @property
    def result(self):
        """Gets the result of this MissingArgumentError.


        :return: The result of this MissingArgumentError.
        :rtype: object
        """
        return self._result

    @result.setter
    def result(self, result):
        """Sets the result of this MissingArgumentError.


        :param result: The result of this MissingArgumentError.
        :type result: object
        """
        if result is None:
            raise ValueError("Invalid value for `result`, must not be `None`")

        self._result = result

    @property
    def msg(self):
        """Gets the msg of this MissingArgumentError.


        :return: The msg of this MissingArgumentError.
        :rtype: object
        """
        return self._msg

    @msg.setter
    def msg(self, msg):
        """Sets the msg of this MissingArgumentError.


        :param msg: The msg of this MissingArgumentError.
        :type msg: object
        """
        if msg is None:
            raise ValueError("Invalid value for `msg`, must not be `None`")

        self._msg = msg

    @property
    def code(self):
        """Gets the code of this MissingArgumentError.


        :return: The code of this MissingArgumentError.
        :rtype: object
        """
        return self._code

    @code.setter
    def code(self, code):
        """Sets the code of this MissingArgumentError.


        :param code: The code of this MissingArgumentError.
        :type code: object
        """

        self._code = code

    @property
    def var_name(self):
        """Gets the var_name of this MissingArgumentError.

        It contains the information about the missing parameter. 

        :return: The var_name of this MissingArgumentError.
        :rtype: str
        """
        return self._var_name

    @var_name.setter
    def var_name(self, var_name):
        """Sets the var_name of this MissingArgumentError.

        It contains the information about the missing parameter. 

        :param var_name: The var_name of this MissingArgumentError.
        :type var_name: str
        """

        self._var_name = var_name