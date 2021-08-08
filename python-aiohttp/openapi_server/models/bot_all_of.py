# coding: utf-8

from datetime import date, datetime

from typing import List, Dict, Type

from openapi_server.models.base_model_ import Model
from openapi_server import util


class BotAllOf(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, user_id: object=None, full_name: object=None, api_key: object=None, default_sending_stream: object=None, default_events_register_stream: object=None, default_all_public_streams: object=None, avatar_url: object=None, owner_id: object=None, services: object=None, email: str=None, bot_type: int=None, is_active: bool=None):
        """BotAllOf - a model defined in OpenAPI

        :param user_id: The user_id of this BotAllOf.
        :param full_name: The full_name of this BotAllOf.
        :param api_key: The api_key of this BotAllOf.
        :param default_sending_stream: The default_sending_stream of this BotAllOf.
        :param default_events_register_stream: The default_events_register_stream of this BotAllOf.
        :param default_all_public_streams: The default_all_public_streams of this BotAllOf.
        :param avatar_url: The avatar_url of this BotAllOf.
        :param owner_id: The owner_id of this BotAllOf.
        :param services: The services of this BotAllOf.
        :param email: The email of this BotAllOf.
        :param bot_type: The bot_type of this BotAllOf.
        :param is_active: The is_active of this BotAllOf.
        """
        self.openapi_types = {
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
    def from_dict(cls, dikt: dict) -> 'BotAllOf':
        """Returns the dict as a model

        :param dikt: A dict.
        :return: The Bot_allOf of this BotAllOf.
        """
        return util.deserialize_model(dikt, cls)

    @property
    def user_id(self):
        """Gets the user_id of this BotAllOf.


        :return: The user_id of this BotAllOf.
        :rtype: object
        """
        return self._user_id

    @user_id.setter
    def user_id(self, user_id):
        """Sets the user_id of this BotAllOf.


        :param user_id: The user_id of this BotAllOf.
        :type user_id: object
        """

        self._user_id = user_id

    @property
    def full_name(self):
        """Gets the full_name of this BotAllOf.


        :return: The full_name of this BotAllOf.
        :rtype: object
        """
        return self._full_name

    @full_name.setter
    def full_name(self, full_name):
        """Sets the full_name of this BotAllOf.


        :param full_name: The full_name of this BotAllOf.
        :type full_name: object
        """

        self._full_name = full_name

    @property
    def api_key(self):
        """Gets the api_key of this BotAllOf.


        :return: The api_key of this BotAllOf.
        :rtype: object
        """
        return self._api_key

    @api_key.setter
    def api_key(self, api_key):
        """Sets the api_key of this BotAllOf.


        :param api_key: The api_key of this BotAllOf.
        :type api_key: object
        """

        self._api_key = api_key

    @property
    def default_sending_stream(self):
        """Gets the default_sending_stream of this BotAllOf.


        :return: The default_sending_stream of this BotAllOf.
        :rtype: object
        """
        return self._default_sending_stream

    @default_sending_stream.setter
    def default_sending_stream(self, default_sending_stream):
        """Sets the default_sending_stream of this BotAllOf.


        :param default_sending_stream: The default_sending_stream of this BotAllOf.
        :type default_sending_stream: object
        """

        self._default_sending_stream = default_sending_stream

    @property
    def default_events_register_stream(self):
        """Gets the default_events_register_stream of this BotAllOf.


        :return: The default_events_register_stream of this BotAllOf.
        :rtype: object
        """
        return self._default_events_register_stream

    @default_events_register_stream.setter
    def default_events_register_stream(self, default_events_register_stream):
        """Sets the default_events_register_stream of this BotAllOf.


        :param default_events_register_stream: The default_events_register_stream of this BotAllOf.
        :type default_events_register_stream: object
        """

        self._default_events_register_stream = default_events_register_stream

    @property
    def default_all_public_streams(self):
        """Gets the default_all_public_streams of this BotAllOf.


        :return: The default_all_public_streams of this BotAllOf.
        :rtype: object
        """
        return self._default_all_public_streams

    @default_all_public_streams.setter
    def default_all_public_streams(self, default_all_public_streams):
        """Sets the default_all_public_streams of this BotAllOf.


        :param default_all_public_streams: The default_all_public_streams of this BotAllOf.
        :type default_all_public_streams: object
        """

        self._default_all_public_streams = default_all_public_streams

    @property
    def avatar_url(self):
        """Gets the avatar_url of this BotAllOf.


        :return: The avatar_url of this BotAllOf.
        :rtype: object
        """
        return self._avatar_url

    @avatar_url.setter
    def avatar_url(self, avatar_url):
        """Sets the avatar_url of this BotAllOf.


        :param avatar_url: The avatar_url of this BotAllOf.
        :type avatar_url: object
        """

        self._avatar_url = avatar_url

    @property
    def owner_id(self):
        """Gets the owner_id of this BotAllOf.


        :return: The owner_id of this BotAllOf.
        :rtype: object
        """
        return self._owner_id

    @owner_id.setter
    def owner_id(self, owner_id):
        """Sets the owner_id of this BotAllOf.


        :param owner_id: The owner_id of this BotAllOf.
        :type owner_id: object
        """

        self._owner_id = owner_id

    @property
    def services(self):
        """Gets the services of this BotAllOf.


        :return: The services of this BotAllOf.
        :rtype: object
        """
        return self._services

    @services.setter
    def services(self, services):
        """Sets the services of this BotAllOf.


        :param services: The services of this BotAllOf.
        :type services: object
        """

        self._services = services

    @property
    def email(self):
        """Gets the email of this BotAllOf.

        The email of the bot. 

        :return: The email of this BotAllOf.
        :rtype: str
        """
        return self._email

    @email.setter
    def email(self, email):
        """Sets the email of this BotAllOf.

        The email of the bot. 

        :param email: The email of this BotAllOf.
        :type email: str
        """

        self._email = email

    @property
    def bot_type(self):
        """Gets the bot_type of this BotAllOf.

        An integer describing the type of bot: * `1` for a `Generic` bot. * `2` for an `Incoming webhook` bot. * `3` for an `Outgoing webhook` bot. * `4` for an `Embedded` bot. 

        :return: The bot_type of this BotAllOf.
        :rtype: int
        """
        return self._bot_type

    @bot_type.setter
    def bot_type(self, bot_type):
        """Sets the bot_type of this BotAllOf.

        An integer describing the type of bot: * `1` for a `Generic` bot. * `2` for an `Incoming webhook` bot. * `3` for an `Outgoing webhook` bot. * `4` for an `Embedded` bot. 

        :param bot_type: The bot_type of this BotAllOf.
        :type bot_type: int
        """

        self._bot_type = bot_type

    @property
    def is_active(self):
        """Gets the is_active of this BotAllOf.

        A boolean describing whether the user account has been deactivated. 

        :return: The is_active of this BotAllOf.
        :rtype: bool
        """
        return self._is_active

    @is_active.setter
    def is_active(self, is_active):
        """Sets the is_active of this BotAllOf.

        A boolean describing whether the user account has been deactivated. 

        :param is_active: The is_active of this BotAllOf.
        :type is_active: bool
        """

        self._is_active = is_active