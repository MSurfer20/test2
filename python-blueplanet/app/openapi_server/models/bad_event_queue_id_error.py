# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from app.openapi_server.models.base_model_ import Model
from app.openapi_server.models.bad_event_queue_id_error_all_of import BadEventQueueIdErrorAllOf  # noqa: F401,E501
from app.openapi_server.models.coded_error_base import CodedErrorBase  # noqa: F401,E501
from openapi_server import util


class BadEventQueueIdError(Model):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    """

    def __init__(self, result: object=None, msg: object=None, code: object=None, queue_id: str=None):  # noqa: E501
        """BadEventQueueIdError - a model defined in Swagger

        :param result: The result of this BadEventQueueIdError.  # noqa: E501
        :type result: object
        :param msg: The msg of this BadEventQueueIdError.  # noqa: E501
        :type msg: object
        :param code: The code of this BadEventQueueIdError.  # noqa: E501
        :type code: object
        :param queue_id: The queue_id of this BadEventQueueIdError.  # noqa: E501
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
    def from_dict(cls, dikt) -> 'BadEventQueueIdError':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The BadEventQueueIdError of this BadEventQueueIdError.  # noqa: E501
        :rtype: BadEventQueueIdError
        """
        return util.deserialize_model(dikt, cls)

    @property
    def result(self) -> object:
        """Gets the result of this BadEventQueueIdError.


        :return: The result of this BadEventQueueIdError.
        :rtype: object
        """
        return self._result

    @result.setter
    def result(self, result: object):
        """Sets the result of this BadEventQueueIdError.


        :param result: The result of this BadEventQueueIdError.
        :type result: object
        """
        if result is None:
            raise ValueError("Invalid value for `result`, must not be `None`")  # noqa: E501

        self._result = result

    @property
    def msg(self) -> object:
        """Gets the msg of this BadEventQueueIdError.


        :return: The msg of this BadEventQueueIdError.
        :rtype: object
        """
        return self._msg

    @msg.setter
    def msg(self, msg: object):
        """Sets the msg of this BadEventQueueIdError.


        :param msg: The msg of this BadEventQueueIdError.
        :type msg: object
        """
        if msg is None:
            raise ValueError("Invalid value for `msg`, must not be `None`")  # noqa: E501

        self._msg = msg

    @property
    def code(self) -> object:
        """Gets the code of this BadEventQueueIdError.


        :return: The code of this BadEventQueueIdError.
        :rtype: object
        """
        return self._code

    @code.setter
    def code(self, code: object):
        """Sets the code of this BadEventQueueIdError.


        :param code: The code of this BadEventQueueIdError.
        :type code: object
        """

        self._code = code

    @property
    def queue_id(self) -> str:
        """Gets the queue_id of this BadEventQueueIdError.

        The string that identifies the invalid event queue.   # noqa: E501

        :return: The queue_id of this BadEventQueueIdError.
        :rtype: str
        """
        return self._queue_id

    @queue_id.setter
    def queue_id(self, queue_id: str):
        """Sets the queue_id of this BadEventQueueIdError.

        The string that identifies the invalid event queue.   # noqa: E501

        :param queue_id: The queue_id of this BadEventQueueIdError.
        :type queue_id: str
        """

        self._queue_id = queue_id