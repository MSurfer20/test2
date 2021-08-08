# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model_ import Model
from openapi_server import util


class UserGroup(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, name=None, description=None, members=None, id=None):  # noqa: E501
        """UserGroup - a model defined in OpenAPI

        :param name: The name of this UserGroup.  # noqa: E501
        :type name: str
        :param description: The description of this UserGroup.  # noqa: E501
        :type description: str
        :param members: The members of this UserGroup.  # noqa: E501
        :type members: List[int]
        :param id: The id of this UserGroup.  # noqa: E501
        :type id: int
        """
        self.openapi_types = {
            'name': str,
            'description': str,
            'members': List[int],
            'id': int
        }

        self.attribute_map = {
            'name': 'name',
            'description': 'description',
            'members': 'members',
            'id': 'id'
        }

        self._name = name
        self._description = description
        self._members = members
        self._id = id

    @classmethod
    def from_dict(cls, dikt) -> 'UserGroup':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The UserGroup of this UserGroup.  # noqa: E501
        :rtype: UserGroup
        """
        return util.deserialize_model(dikt, cls)

    @property
    def name(self):
        """Gets the name of this UserGroup.

        The name of the user group.   # noqa: E501

        :return: The name of this UserGroup.
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name):
        """Sets the name of this UserGroup.

        The name of the user group.   # noqa: E501

        :param name: The name of this UserGroup.
        :type name: str
        """

        self._name = name

    @property
    def description(self):
        """Gets the description of this UserGroup.

        The description of the user group.   # noqa: E501

        :return: The description of this UserGroup.
        :rtype: str
        """
        return self._description

    @description.setter
    def description(self, description):
        """Sets the description of this UserGroup.

        The description of the user group.   # noqa: E501

        :param description: The description of this UserGroup.
        :type description: str
        """

        self._description = description

    @property
    def members(self):
        """Gets the members of this UserGroup.

        Array containing the id of the users who are members of this user group.   # noqa: E501

        :return: The members of this UserGroup.
        :rtype: List[int]
        """
        return self._members

    @members.setter
    def members(self, members):
        """Sets the members of this UserGroup.

        Array containing the id of the users who are members of this user group.   # noqa: E501

        :param members: The members of this UserGroup.
        :type members: List[int]
        """

        self._members = members

    @property
    def id(self):
        """Gets the id of this UserGroup.

        The ID of the user group.   # noqa: E501

        :return: The id of this UserGroup.
        :rtype: int
        """
        return self._id

    @id.setter
    def id(self, id):
        """Sets the id of this UserGroup.

        The ID of the user group.   # noqa: E501

        :param id: The id of this UserGroup.
        :type id: int
        """

        self._id = id
