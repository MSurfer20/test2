# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from app.openapi_server.models.base_model_ import Model
from app.openapi_server.models.basic_bot_base import BasicBotBase  # noqa: F401,E501
from app.openapi_server.models.bot_all_of import BotAllOf  # noqa: F401,E501
from openapi_server import util


class Bot(Model):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    """

    def __init__(self, user_id: object=None, full_name: object=None, api_key: object=None, default_sending_stream: object=None, default_events_register_stream: object=None, default_all_public_streams: object=None, avatar_url: object=None, owner_id: object=None, services: object=None, email: str=None, bot_type: int=None, is_active: bool=None):  # noqa: E501
        """Bot - a model defined in Swagger

        :param user_id: The user_id of this Bot.  # noqa: E501
        :type user_id: object
        :param full_name: The full_name of this Bot.  # noqa: E501
        :type full_name: object
        :param api_key: The api_key of this Bot.  # noqa: E501
        :type api_key: object
        :param default_sending_stream: The default_sending_stream of this Bot.  # noqa: E501
        :type default_sending_stream: object
        :param default_events_register_stream: The default_events_register_stream of this Bot.  # noqa: E501
        :type default_events_register_stream: object
        :param default_all_public_streams: The default_all_public_streams of this Bot.  # noqa: E501
        :type default_all_public_streams: object
        :param avatar_url: The avatar_url of this Bot.  # noqa: E501
        :type avatar_url: object
        :param owner_id: The owner_id of this Bot.  # noqa: E501
        :type owner_id: object
        :param services: The services of this Bot.  # noqa: E501
        :type services: object
        :param email: The email of this Bot.  # noqa: E501
        :type email: str
        :param bot_type: The bot_type of this Bot.  # noqa: E501
        :type bot_type: int
        :param is_active: The is_active of this Bot.  # noqa: E501
        :type is_active: bool
        """
        self.swagger_types = {
            'user_id': object,
            'full_name': object,
            'api_key': object,
            'default_sending_stream': object,
            'default_events_register_stream': object,
            'default_all_public_streams': object,
            'avatar_url': object,
            'owner_id': object,
            'services': object,
            'email': str,
            'bot_type': int,
            'is_active': bool
        }

        self.attribute_map = {
            'user_id': 'user_id',
            'full_name': 'full_name',
            'api_key': 'api_key',
            'default_sending_stream': 'default_sending_stream',
            'default_events_register_stream': 'default_events_register_stream',
            'default_all_public_streams': 'default_all_public_streams',
            'avatar_url': 'avatar_url',
            'owner_id': 'owner_id',
            'services': 'services',
            'email': 'email',
            'bot_type': 'bot_type',
            'is_active': 'is_active'
        }

        self._user_id = user_id
        self._full_name = full_name
        self._api_key = api_key
        self._default_sending_stream = default_sending_stream
        self._default_events_register_stream = default_events_register_stream
        self._default_all_public_streams = default_all_public_streams
        self._avatar_url = avatar_url
        self._owner_id = owner_id
        self._services = services
        self._email = email
        self._bot_type = bot_type
        self._is_active = is_active

    @classmethod
    def from_dict(cls, dikt) -> 'Bot':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The Bot of this Bot.  # noqa: E501
        :rtype: Bot
        """
        return util.deserialize_model(dikt, cls)

    @property
    def user_id(self) -> object:
        """Gets the user_id of this Bot.


        :return: The user_id of this Bot.
        :rtype: object
        """
        return self._user_id

    @user_id.setter
    def user_id(self, user_id: object):
        """Sets the user_id of this Bot.


        :param user_id: The user_id of this Bot.
        :type user_id: object
        """

        self._user_id = user_id

    @property
    def full_name(self) -> object:
        """Gets the full_name of this Bot.


        :return: The full_name of this Bot.
        :rtype: object
        """
        return self._full_name

    @full_name.setter
    def full_name(self, full_name: object):
        """Sets the full_name of this Bot.


        :param full_name: The full_name of this Bot.
        :type full_name: object
        """

        self._full_name = full_name

    @property
    def api_key(self) -> object:
        """Gets the api_key of this Bot.


        :return: The api_key of this Bot.
        :rtype: object
        """
        return self._api_key

    @api_key.setter
    def api_key(self, api_key: object):
        """Sets the api_key of this Bot.


        :param api_key: The api_key of this Bot.
        :type api_key: object
        """

        self._api_key = api_key

    @property
    def default_sending_stream(self) -> object:
        """Gets the default_sending_stream of this Bot.


        :return: The default_sending_stream of this Bot.
        :rtype: object
        """
        return self._default_sending_stream

    @default_sending_stream.setter
    def default_sending_stream(self, default_sending_stream: object):
        """Sets the default_sending_stream of this Bot.


        :param default_sending_stream: The default_sending_stream of this Bot.
        :type default_sending_stream: object
        """

        self._default_sending_stream = default_sending_stream

    @property
    def default_events_register_stream(self) -> object:
        """Gets the default_events_register_stream of this Bot.


        :return: The default_events_register_stream of this Bot.
        :rtype: object
        """
        return self._default_events_register_stream

    @default_events_register_stream.setter
    def default_events_register_stream(self, default_events_register_stream: object):
        """Sets the default_events_register_stream of this Bot.


        :param default_events_register_stream: The default_events_register_stream of this Bot.
        :type default_events_register_stream: object
        """

        self._default_events_register_stream = default_events_register_stream

    @property
    def default_all_public_streams(self) -> object:
        """Gets the default_all_public_streams of this Bot.


        :return: The default_all_public_streams of this Bot.
        :rtype: object
        """
        return self._default_all_public_streams

    @default_all_public_streams.setter
    def default_all_public_streams(self, default_all_public_streams: object):
        """Sets the default_all_public_streams of this Bot.


        :param default_all_public_streams: The default_all_public_streams of this Bot.
        :type default_all_public_streams: object
        """

        self._default_all_public_streams = default_all_public_streams

    @property
    def avatar_url(self) -> object:
        """Gets the avatar_url of this Bot.


        :return: The avatar_url of this Bot.
        :rtype: object
        """
        return self._avatar_url

    @avatar_url.setter
    def avatar_url(self, avatar_url: object):
        """Sets the avatar_url of this Bot.


        :param avatar_url: The avatar_url of this Bot.
        :type avatar_url: object
        """

        self._avatar_url = avatar_url

    @property
    def owner_id(self) -> object:
        """Gets the owner_id of this Bot.


        :return: The owner_id of this Bot.
        :rtype: object
        """
        return self._owner_id

    @owner_id.setter
    def owner_id(self, owner_id: object):
        """Sets the owner_id of this Bot.


        :param owner_id: The owner_id of this Bot.
        :type owner_id: object
        """

        self._owner_id = owner_id

    @property
    def services(self) -> object:
        """Gets the services of this Bot.


        :return: The services of this Bot.
        :rtype: object
        """
        return self._services

    @services.setter
    def services(self, services: object):
        """Sets the services of this Bot.


        :param services: The services of this Bot.
        :type services: object
        """

        self._services = services

    @property
    def email(self) -> str:
        """Gets the email of this Bot.

        The email of the bot.   # noqa: E501

        :return: The email of this Bot.
        :rtype: str
        """
        return self._email

    @email.setter
    def email(self, email: str):
        """Sets the email of this Bot.

        The email of the bot.   # noqa: E501

        :param email: The email of this Bot.
        :type email: str
        """

        self._email = email

    @property
    def bot_type(self) -> int:
        """Gets the bot_type of this Bot.

        An integer describing the type of bot: * `1` for a `Generic` bot. * `2` for an `Incoming webhook` bot. * `3` for an `Outgoing webhook` bot. * `4` for an `Embedded` bot.   # noqa: E501

        :return: The bot_type of this Bot.
        :rtype: int
        """
        return self._bot_type

    @bot_type.setter
    def bot_type(self, bot_type: int):
        """Sets the bot_type of this Bot.

        An integer describing the type of bot: * `1` for a `Generic` bot. * `2` for an `Incoming webhook` bot. * `3` for an `Outgoing webhook` bot. * `4` for an `Embedded` bot.   # noqa: E501

        :param bot_type: The bot_type of this Bot.
        :type bot_type: int
        """

        self._bot_type = bot_type

    @property
    def is_active(self) -> bool:
        """Gets the is_active of this Bot.

        A boolean describing whether the user account has been deactivated.   # noqa: E501

        :return: The is_active of this Bot.
        :rtype: bool
        """
        return self._is_active

    @is_active.setter
    def is_active(self, is_active: bool):
        """Sets the is_active of this Bot.

        A boolean describing whether the user account has been deactivated.   # noqa: E501

        :param is_active: The is_active of this Bot.
        :type is_active: bool
        """

        self._is_active = is_active
