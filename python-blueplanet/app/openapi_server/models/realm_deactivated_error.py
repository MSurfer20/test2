# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from app.openapi_server.models.base_model_ import Model
from app.openapi_server.models.coded_error import CodedError  # noqa: F401,E501
from openapi_server import util


class RealmDeactivatedError(Model):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    """

    def __init__(self, result: object=None, msg: object=None, code: object=None):  # noqa: E501
        """RealmDeactivatedError - a model defined in Swagger

        :param result: The result of this RealmDeactivatedError.  # noqa: E501
        :type result: object
        :param msg: The msg of this RealmDeactivatedError.  # noqa: E501
        :type msg: object
        :param code: The code of this RealmDeactivatedError.  # noqa: E501
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
    def from_dict(cls, dikt) -> 'RealmDeactivatedError':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The RealmDeactivatedError of this RealmDeactivatedError.  # noqa: E501
        :rtype: RealmDeactivatedError
        """
        return util.deserialize_model(dikt, cls)

    @property
    def result(self) -> object:
        """Gets the result of this RealmDeactivatedError.


        :return: The result of this RealmDeactivatedError.
        :rtype: object
        """
        return self._result

    @result.setter
    def result(self, result: object):
        """Sets the result of this RealmDeactivatedError.


        :param result: The result of this RealmDeactivatedError.
        :type result: object
        """
        if result is None:
            raise ValueError("Invalid value for `result`, must not be `None`")  # noqa: E501

        self._result = result

    @property
    def msg(self) -> object:
        """Gets the msg of this RealmDeactivatedError.


        :return: The msg of this RealmDeactivatedError.
        :rtype: object
        """
        return self._msg

    @msg.setter
    def msg(self, msg: object):
        """Sets the msg of this RealmDeactivatedError.


        :param msg: The msg of this RealmDeactivatedError.
        :type msg: object
        """
        if msg is None:
            raise ValueError("Invalid value for `msg`, must not be `None`")  # noqa: E501

        self._msg = msg

    @property
    def code(self) -> object:
        """Gets the code of this RealmDeactivatedError.


        :return: The code of this RealmDeactivatedError.
        :rtype: object
        """
        return self._code

    @code.setter
    def code(self, code: object):
        """Sets the code of this RealmDeactivatedError.


        :param code: The code of this RealmDeactivatedError.
        :type code: object
        """

        self._code = code