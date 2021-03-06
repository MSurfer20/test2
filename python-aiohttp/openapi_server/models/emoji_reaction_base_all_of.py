# coding: utf-8

from datetime import date, datetime

from typing import List, Dict, Type

from openapi_server.models.base_model_ import Model
from openapi_server.models.emoji_reaction_base_all_of_user import EmojiReactionBaseAllOfUser
from openapi_server import util


class EmojiReactionBaseAllOf(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, user_id: int=None, user: EmojiReactionBaseAllOfUser=None):
        """EmojiReactionBaseAllOf - a model defined in OpenAPI

        :param user_id: The user_id of this EmojiReactionBaseAllOf.
        :param user: The user of this EmojiReactionBaseAllOf.
        """
        self.openapi_types = {
            'user_id': int,
            'user': EmojiReactionBaseAllOfUser
        }

        self.attribute_map = {
            'user_id': 'user_id',
            'user': 'user'
        }

        self._user_id = user_id
        self._user = user

    @classmethod
    def from_dict(cls, dikt: dict) -> 'EmojiReactionBaseAllOf':
        """Returns the dict as a model

        :param dikt: A dict.
        :return: The EmojiReactionBase_allOf of this EmojiReactionBaseAllOf.
        """
        return util.deserialize_model(dikt, cls)

    @property
    def user_id(self):
        """Gets the user_id of this EmojiReactionBaseAllOf.

        The ID of the user who added the reaction.  **Changes**: New in Zulip 3.0 (feature level 2). The `user` object is deprecated and will be removed in the future. 

        :return: The user_id of this EmojiReactionBaseAllOf.
        :rtype: int
        """
        return self._user_id

    @user_id.setter
    def user_id(self, user_id):
        """Sets the user_id of this EmojiReactionBaseAllOf.

        The ID of the user who added the reaction.  **Changes**: New in Zulip 3.0 (feature level 2). The `user` object is deprecated and will be removed in the future. 

        :param user_id: The user_id of this EmojiReactionBaseAllOf.
        :type user_id: int
        """

        self._user_id = user_id

    @property
    def user(self):
        """Gets the user of this EmojiReactionBaseAllOf.


        :return: The user of this EmojiReactionBaseAllOf.
        :rtype: EmojiReactionBaseAllOfUser
        """
        return self._user

    @user.setter
    def user(self, user):
        """Sets the user of this EmojiReactionBaseAllOf.


        :param user: The user of this EmojiReactionBaseAllOf.
        :type user: EmojiReactionBaseAllOfUser
        """

        self._user = user
