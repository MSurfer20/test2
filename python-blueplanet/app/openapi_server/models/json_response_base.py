# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from app.openapi_server.models.base_model_ import Model
from openapi_server import util


class JsonResponseBase(Model):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    """

    def __init__(self, result: str=None):  # noqa: E501
        """JsonResponseBase - a model defined in Swagger

        :param result: The result of this JsonResponseBase.  # noqa: E501
        :type result: str
        """
        self.swagger_types = {
            'result': str
        }

        self.attribute_map = {
            'result': 'result'
        }

        self._result = result

    @classmethod
    def from_dict(cls, dikt) -> 'JsonResponseBase':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The JsonResponseBase of this JsonResponseBase.  # noqa: E501
        :rtype: JsonResponseBase
        """
        return util.deserialize_model(dikt, cls)

    @property
    def result(self) -> str:
        """Gets the result of this JsonResponseBase.


        :return: The result of this JsonResponseBase.
        :rtype: str
        """
        return self._result

    @result.setter
    def result(self, result: str):
        """Sets the result of this JsonResponseBase.


        :param result: The result of this JsonResponseBase.
        :type result: str
        """

        self._result = result
