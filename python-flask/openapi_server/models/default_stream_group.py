# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model_ import Model
from openapi_server.models.basic_stream import BasicStream
from openapi_server import util

from openapi_server.models.basic_stream import BasicStream  # noqa: E501

class DefaultStreamGroup(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, name=None, description=None, id=None, streams=None):  # noqa: E501
        """DefaultStreamGroup - a model defined in OpenAPI

        :param name: The name of this DefaultStreamGroup.  # noqa: E501
        :type name: str
        :param description: The description of this DefaultStreamGroup.  # noqa: E501
        :type description: str
        :param id: The id of this DefaultStreamGroup.  # noqa: E501
        :type id: int
        :param streams: The streams of this DefaultStreamGroup.  # noqa: E501
        :type streams: List[BasicStream]
        """
        self.openapi_types = {
            'name': str,
            'description': str,
            'id': int,
            'streams': List[BasicStream]
        }

        self.attribute_map = {
            'name': 'name',
            'description': 'description',
            'id': 'id',
            'streams': 'streams'
        }

        self._name = name
        self._description = description
        self._id = id
        self._streams = streams

    @classmethod
    def from_dict(cls, dikt) -> 'DefaultStreamGroup':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The DefaultStreamGroup of this DefaultStreamGroup.  # noqa: E501
        :rtype: DefaultStreamGroup
        """
        return util.deserialize_model(dikt, cls)

    @property
    def name(self):
        """Gets the name of this DefaultStreamGroup.

        Name of the default stream group.   # noqa: E501

        :return: The name of this DefaultStreamGroup.
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name):
        """Sets the name of this DefaultStreamGroup.

        Name of the default stream group.   # noqa: E501

        :param name: The name of this DefaultStreamGroup.
        :type name: str
        """

        self._name = name

    @property
    def description(self):
        """Gets the description of this DefaultStreamGroup.

        Description of the default stream group.   # noqa: E501

        :return: The description of this DefaultStreamGroup.
        :rtype: str
        """
        return self._description

    @description.setter
    def description(self, description):
        """Sets the description of this DefaultStreamGroup.

        Description of the default stream group.   # noqa: E501

        :param description: The description of this DefaultStreamGroup.
        :type description: str
        """

        self._description = description

    @property
    def id(self):
        """Gets the id of this DefaultStreamGroup.

        id of the default stream group.   # noqa: E501

        :return: The id of this DefaultStreamGroup.
        :rtype: int
        """
        return self._id

    @id.setter
    def id(self, id):
        """Sets the id of this DefaultStreamGroup.

        id of the default stream group.   # noqa: E501

        :param id: The id of this DefaultStreamGroup.
        :type id: int
        """

        self._id = id

    @property
    def streams(self):
        """Gets the streams of this DefaultStreamGroup.

        Array containing details about the streams in the default stream group.   # noqa: E501

        :return: The streams of this DefaultStreamGroup.
        :rtype: List[BasicStream]
        """
        return self._streams

    @streams.setter
    def streams(self, streams):
        """Sets the streams of this DefaultStreamGroup.

        Array containing details about the streams in the default stream group.   # noqa: E501

        :param streams: The streams of this DefaultStreamGroup.
        :type streams: List[BasicStream]
        """

        self._streams = streams