# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from app.openapi_server.models.base_model_ import Model
from openapi_server import util


class BadEventQueueIdErrorAllOf(Model):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    """

    def __init__(self, result: object=None, msg: object=None, code: object=None, queue_id: str=None):  # noqa: E501
        """BadEventQueueIdErrorAllOf - a model defined in Swagger

        :param result: The result of this BadEventQueueIdErrorAllOf.  # noqa: E501
        :type result: object
        :param msg: The msg of this BadEventQueueIdErrorAllOf.  # noqa: E501
        :type msg: object
        :param code: The code of this BadEventQueueIdErrorAllOf.  # noqa: E501
        :type code: object
        :param queue_id: The queue_id of this BadEventQueueIdErrorAllOf.  # noqa: E501
        :type queue_id: str
        """
        self.swagger_types = {
            'result': object,
            'msg': object,
            'code': object,
            'queue_id': str
        }

        self.attribute_map = {
            'result': 'result',
            'msg': 'msg',
            'code': 'code',
            'queue_id': 'queue_id'
        }

        self._result = result
        self._msg = msg
        self._code = code
        self._queue_id = queue_id

    @classmethod
    def from_dict(cls, dikt) -> 'BadEventQueueIdErrorAllOf':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The BadEventQueueIdError_allOf of this BadEventQueueIdErrorAllOf.  # noqa: E501
        :rtype: BadEventQueueIdErrorAllOf
        """
        return util.deserialize_model(dikt, cls)

    @property
    def result(self) -> object:
        """Gets the result of this BadEventQueueIdErrorAllOf.


        :return: The result of this BadEventQueueIdErrorAllOf.
        :rtype: object
        """
        return self._result

    @result.setter
    def result(self, result: object):
        """Sets the result of this BadEventQueueIdErrorAllOf.


        :param result: The result of this BadEventQueueIdErrorAllOf.
        :type result: object
        """

        self._result = result

    @property
    def msg(self) -> object:
        """Gets the msg of this BadEventQueueIdErrorAllOf.


        :return: The msg of this BadEventQueueIdErrorAllOf.
        :rtype: object
        """
        return self._msg

    @msg.setter
    def msg(self, msg: object):
        """Sets the msg of this BadEventQueueIdErrorAllOf.


        :param msg: The msg of this BadEventQueueIdErrorAllOf.
        :type msg: object
        """

        self._msg = msg

    @property
    def code(self) -> object:
        """Gets the code of this BadEventQueueIdErrorAllOf.


        :return: The code of this BadEventQueueIdErrorAllOf.
        :rtype: object
        """
        return self._code

    @code.setter
    def code(self, code: object):
        """Sets the code of this BadEventQueueIdErrorAllOf.


        :param code: The code of this BadEventQueueIdErrorAllOf.
        :type code: object
        """

        self._code = code

    @property
    def queue_id(self) -> str:
        """Gets the queue_id of this BadEventQueueIdErrorAllOf.

        The string that identifies the invalid event queue.   # noqa: E501

        :return: The queue_id of this BadEventQueueIdErrorAllOf.
        :rtype: str
        """
        return self._queue_id

    @queue_id.setter
    def queue_id(self, queue_id: str):
        """Sets the queue_id of this BadEventQueueIdErrorAllOf.

        The string that identifies the invalid event queue.   # noqa: E501

        :param queue_id: The queue_id of this BadEventQueueIdErrorAllOf.
        :type queue_id: str
        """

        self._queue_id = queue_id