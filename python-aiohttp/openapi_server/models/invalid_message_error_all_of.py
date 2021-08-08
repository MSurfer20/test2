# coding: utf-8

from datetime import date, datetime

from typing import List, Dict, Type

from openapi_server.models.base_model_ import Model
from openapi_server import util


class InvalidMessageErrorAllOf(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, result: object=None, msg: object=None, raw_content: str=None):
        """InvalidMessageErrorAllOf - a model defined in OpenAPI

        :param result: The result of this InvalidMessageErrorAllOf.
        :param msg: The msg of this InvalidMessageErrorAllOf.
        :param raw_content: The raw_content of this InvalidMessageErrorAllOf.
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
    def from_dict(cls, dikt: dict) -> 'InvalidMessageErrorAllOf':
        """Returns the dict as a model

        :param dikt: A dict.
        :return: The InvalidMessageError_allOf of this InvalidMessageErrorAllOf.
        """
        return util.deserialize_model(dikt, cls)

    @property
    def result(self):
        """Gets the result of this InvalidMessageErrorAllOf.


        :return: The result of this InvalidMessageErrorAllOf.
        :rtype: object
        """
        return self._result

    @result.setter
    def result(self, result):
        """Sets the result of this InvalidMessageErrorAllOf.


        :param result: The result of this InvalidMessageErrorAllOf.
        :type result: object
        """

        self._result = result

    @property
    def msg(self):
        """Gets the msg of this InvalidMessageErrorAllOf.


        :return: The msg of this InvalidMessageErrorAllOf.
        :rtype: object
        """
        return self._msg

    @msg.setter
    def msg(self, msg):
        """Sets the msg of this InvalidMessageErrorAllOf.


        :param msg: The msg of this InvalidMessageErrorAllOf.
        :type msg: object
        """

        self._msg = msg

    @property
    def raw_content(self):
        """Gets the raw_content of this InvalidMessageErrorAllOf.

        The raw content of the message. 

        :return: The raw_content of this InvalidMessageErrorAllOf.
        :rtype: str
        """
        return self._raw_content

    @raw_content.setter
    def raw_content(self, raw_content):
        """Sets the raw_content of this InvalidMessageErrorAllOf.

        The raw content of the message. 

        :param raw_content: The raw_content of this InvalidMessageErrorAllOf.
        :type raw_content: str
        """

        self._raw_content = raw_content
