# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from app.openapi_server.models.base_model_ import Model
from openapi_server import util


class RealmEmoji(Model):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    """

    def __init__(self, id: str=None, name: str=None, source_url: str=None, deactivated: bool=None, author_id: int=None):  # noqa: E501
        """RealmEmoji - a model defined in Swagger

        :param id: The id of this RealmEmoji.  # noqa: E501
        :type id: str
        :param name: The name of this RealmEmoji.  # noqa: E501
        :type name: str
        :param source_url: The source_url of this RealmEmoji.  # noqa: E501
        :type source_url: str
        :param deactivated: The deactivated of this RealmEmoji.  # noqa: E501
        :type deactivated: bool
        :param author_id: The author_id of this RealmEmoji.  # noqa: E501
        :type author_id: int
        """
        self.swagger_types = {
            'id': str,
            'name': str,
            'source_url': str,
            'deactivated': bool,
            'author_id': int
        }

        self.attribute_map = {
            'id': 'id',
            'name': 'name',
            'source_url': 'source_url',
            'deactivated': 'deactivated',
            'author_id': 'author_id'
        }

        self._id = id
        self._name = name
        self._source_url = source_url
        self._deactivated = deactivated
        self._author_id = author_id

    @classmethod
    def from_dict(cls, dikt) -> 'RealmEmoji':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The RealmEmoji of this RealmEmoji.  # noqa: E501
        :rtype: RealmEmoji
        """
        return util.deserialize_model(dikt, cls)

    @property
    def id(self) -> str:
        """Gets the id of this RealmEmoji.

        The ID for this emoji, same as the object's key.   # noqa: E501

        :return: The id of this RealmEmoji.
        :rtype: str
        """
        return self._id

    @id.setter
    def id(self, id: str):
        """Sets the id of this RealmEmoji.

        The ID for this emoji, same as the object's key.   # noqa: E501

        :param id: The id of this RealmEmoji.
        :type id: str
        """

        self._id = id

    @property
    def name(self) -> str:
        """Gets the name of this RealmEmoji.

        The user-friendly name for this emoji. Users in the organization can use this emoji by writing this name between colons (`:name  :`).   # noqa: E501

        :return: The name of this RealmEmoji.
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name: str):
        """Sets the name of this RealmEmoji.

        The user-friendly name for this emoji. Users in the organization can use this emoji by writing this name between colons (`:name  :`).   # noqa: E501

        :param name: The name of this RealmEmoji.
        :type name: str
        """

        self._name = name

    @property
    def source_url(self) -> str:
        """Gets the source_url of this RealmEmoji.

        The path relative to the organization's URL where the emoji's image can be found.   # noqa: E501

        :return: The source_url of this RealmEmoji.
        :rtype: str
        """
        return self._source_url

    @source_url.setter
    def source_url(self, source_url: str):
        """Sets the source_url of this RealmEmoji.

        The path relative to the organization's URL where the emoji's image can be found.   # noqa: E501

        :param source_url: The source_url of this RealmEmoji.
        :type source_url: str
        """

        self._source_url = source_url

    @property
    def deactivated(self) -> bool:
        """Gets the deactivated of this RealmEmoji.

        Whether the emoji has been deactivated or not.   # noqa: E501

        :return: The deactivated of this RealmEmoji.
        :rtype: bool
        """
        return self._deactivated

    @deactivated.setter
    def deactivated(self, deactivated: bool):
        """Sets the deactivated of this RealmEmoji.

        Whether the emoji has been deactivated or not.   # noqa: E501

        :param deactivated: The deactivated of this RealmEmoji.
        :type deactivated: bool
        """

        self._deactivated = deactivated

    @property
    def author_id(self) -> int:
        """Gets the author_id of this RealmEmoji.

        The user ID of the user who uploaded the custom emoji. Will be null if the uploader is unknown.  **Changes**: New in Zulip 3.0 (feature level 7).  Previously was accessible via and `author` object with an `id` field.   # noqa: E501

        :return: The author_id of this RealmEmoji.
        :rtype: int
        """
        return self._author_id

    @author_id.setter
    def author_id(self, author_id: int):
        """Sets the author_id of this RealmEmoji.

        The user ID of the user who uploaded the custom emoji. Will be null if the uploader is unknown.  **Changes**: New in Zulip 3.0 (feature level 7).  Previously was accessible via and `author` object with an `id` field.   # noqa: E501

        :param author_id: The author_id of this RealmEmoji.
        :type author_id: int
        """

        self._author_id = author_id
