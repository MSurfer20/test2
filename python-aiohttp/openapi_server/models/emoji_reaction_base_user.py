# coding: utf-8

from datetime import date, datetime

from typing import List, Dict, Type

from openapi_server.models.base_model_ import Model
from openapi_server import util


class EmojiReactionBaseUser(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, id: int=None, email: str=None, full_name: str=None, is_mirror_dummy: bool=None):
        """EmojiReactionBaseUser - a model defined in OpenAPI

        :param id: The id of this EmojiReactionBaseUser.
        :param email: The email of this EmojiReactionBaseUser.
        :param full_name: The full_name of this EmojiReactionBaseUser.
        :param is_mirror_dummy: The is_mirror_dummy of this EmojiReactionBaseUser.
        """
        self.openapi_types = {
            'id': int,
            'email': str,
            'full_name': str,
            'is_mirror_dummy': bool
        }

        self.attribute_map = {
            'id': 'id',
            'email': 'email',
            'full_name': 'full_name',
            'is_mirror_dummy': 'is_mirror_dummy'
        }

        self._id = id
        self._email = email
        self._full_name = full_name
        self._is_mirror_dummy = is_mirror_dummy

    @classmethod
    def from_dict(cls, dikt: dict) -> 'EmojiReactionBaseUser':
        """Returns the dict as a model

        :param dikt: A dict.
        :return: The EmojiReactionBase_user of this EmojiReactionBaseUser.
        """
        return util.deserialize_model(dikt, cls)

    @property
    def id(self):
        """Gets the id of this EmojiReactionBaseUser.

        ID of the user. 

        :return: The id of this EmojiReactionBaseUser.
        :rtype: int
        """
        return self._id

    @id.setter
    def id(self, id):
        """Sets the id of this EmojiReactionBaseUser.

        ID of the user. 

        :param id: The id of this EmojiReactionBaseUser.
        :type id: int
        """

        self._id = id

    @property
    def email(self):
        """Gets the email of this EmojiReactionBaseUser.

        Email of the user. 

        :return: The email of this EmojiReactionBaseUser.
        :rtype: str
        """
        return self._email

    @email.setter
    def email(self, email):
        """Sets the email of this EmojiReactionBaseUser.

        Email of the user. 

        :param email: The email of this EmojiReactionBaseUser.
        :type email: str
        """

        self._email = email

    @property
    def full_name(self):
        """Gets the full_name of this EmojiReactionBaseUser.

        Full name of the user. 

        :return: The full_name of this EmojiReactionBaseUser.
        :rtype: str
        """
        return self._full_name

    @full_name.setter
    def full_name(self, full_name):
        """Sets the full_name of this EmojiReactionBaseUser.

        Full name of the user. 

        :param full_name: The full_name of this EmojiReactionBaseUser.
        :type full_name: str
        """

        self._full_name = full_name

    @property
    def is_mirror_dummy(self):
        """Gets the is_mirror_dummy of this EmojiReactionBaseUser.

        Whether the user is a mirror dummy. 

        :return: The is_mirror_dummy of this EmojiReactionBaseUser.
        :rtype: bool
        """
        return self._is_mirror_dummy

    @is_mirror_dummy.setter
    def is_mirror_dummy(self, is_mirror_dummy):
        """Sets the is_mirror_dummy of this EmojiReactionBaseUser.

        Whether the user is a mirror dummy. 

        :param is_mirror_dummy: The is_mirror_dummy of this EmojiReactionBaseUser.
        :type is_mirror_dummy: bool
        """

        self._is_mirror_dummy = is_mirror_dummy