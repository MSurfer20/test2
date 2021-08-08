# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model_ import Model
from openapi_server.models.one_ofobjectobject import OneOfobjectobject
from openapi_server import util

from openapi_server.models.one_ofobjectobject import OneOfobjectobject  # noqa: E501

class BasicBotBase(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, user_id=None, full_name=None, api_key=None, default_sending_stream=None, default_events_register_stream=None, default_all_public_streams=None, avatar_url=None, owner_id=None, services=None):  # noqa: E501
        """BasicBotBase - a model defined in OpenAPI

        :param user_id: The user_id of this BasicBotBase.  # noqa: E501
        :type user_id: int
        :param full_name: The full_name of this BasicBotBase.  # noqa: E501
        :type full_name: str
        :param api_key: The api_key of this BasicBotBase.  # noqa: E501
        :type api_key: str
        :param default_sending_stream: The default_sending_stream of this BasicBotBase.  # noqa: E501
        :type default_sending_stream: str
        :param default_events_register_stream: The default_events_register_stream of this BasicBotBase.  # noqa: E501
        :type default_events_register_stream: str
        :param default_all_public_streams: The default_all_public_streams of this BasicBotBase.  # noqa: E501
        :type default_all_public_streams: bool
        :param avatar_url: The avatar_url of this BasicBotBase.  # noqa: E501
        :type avatar_url: str
        :param owner_id: The owner_id of this BasicBotBase.  # noqa: E501
        :type owner_id: int
        :param services: The services of this BasicBotBase.  # noqa: E501
        :type services: List[OneOfobjectobject]
        """
        self.openapi_types = {
            'user_id': int,
            'full_name': str,
            'api_key': str,
            'default_sending_stream': str,
            'default_events_register_stream': str,
            'default_all_public_streams': bool,
            'avatar_url': str,
            'owner_id': int,
            'services': List[OneOfobjectobject]
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
            'services': 'services'
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

    @classmethod
    def from_dict(cls, dikt) -> 'BasicBotBase':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The BasicBotBase of this BasicBotBase.  # noqa: E501
        :rtype: BasicBotBase
        """
        return util.deserialize_model(dikt, cls)

    @property
    def user_id(self):
        """Gets the user_id of this BasicBotBase.

        The user id of the bot.   # noqa: E501

        :return: The user_id of this BasicBotBase.
        :rtype: int
        """
        return self._user_id

    @user_id.setter
    def user_id(self, user_id):
        """Sets the user_id of this BasicBotBase.

        The user id of the bot.   # noqa: E501

        :param user_id: The user_id of this BasicBotBase.
        :type user_id: int
        """

        self._user_id = user_id

    @property
    def full_name(self):
        """Gets the full_name of this BasicBotBase.

        The full name of the bot.   # noqa: E501

        :return: The full_name of this BasicBotBase.
        :rtype: str
        """
        return self._full_name

    @full_name.setter
    def full_name(self, full_name):
        """Sets the full_name of this BasicBotBase.

        The full name of the bot.   # noqa: E501

        :param full_name: The full_name of this BasicBotBase.
        :type full_name: str
        """

        self._full_name = full_name

    @property
    def api_key(self):
        """Gets the api_key of this BasicBotBase.

        The API key of the bot which it uses to make API requests.   # noqa: E501

        :return: The api_key of this BasicBotBase.
        :rtype: str
        """
        return self._api_key

    @api_key.setter
    def api_key(self, api_key):
        """Sets the api_key of this BasicBotBase.

        The API key of the bot which it uses to make API requests.   # noqa: E501

        :param api_key: The api_key of this BasicBotBase.
        :type api_key: str
        """

        self._api_key = api_key

    @property
    def default_sending_stream(self):
        """Gets the default_sending_stream of this BasicBotBase.

        The default sending stream of the bot. Null if the bot doesn't have a default sending stream.   # noqa: E501

        :return: The default_sending_stream of this BasicBotBase.
        :rtype: str
        """
        return self._default_sending_stream

    @default_sending_stream.setter
    def default_sending_stream(self, default_sending_stream):
        """Sets the default_sending_stream of this BasicBotBase.

        The default sending stream of the bot. Null if the bot doesn't have a default sending stream.   # noqa: E501

        :param default_sending_stream: The default_sending_stream of this BasicBotBase.
        :type default_sending_stream: str
        """

        self._default_sending_stream = default_sending_stream

    @property
    def default_events_register_stream(self):
        """Gets the default_events_register_stream of this BasicBotBase.

        The default stream for which the bot receives events/register data. Null if the bot doesn't have such a default stream.   # noqa: E501

        :return: The default_events_register_stream of this BasicBotBase.
        :rtype: str
        """
        return self._default_events_register_stream

    @default_events_register_stream.setter
    def default_events_register_stream(self, default_events_register_stream):
        """Sets the default_events_register_stream of this BasicBotBase.

        The default stream for which the bot receives events/register data. Null if the bot doesn't have such a default stream.   # noqa: E501

        :param default_events_register_stream: The default_events_register_stream of this BasicBotBase.
        :type default_events_register_stream: str
        """

        self._default_events_register_stream = default_events_register_stream

    @property
    def default_all_public_streams(self):
        """Gets the default_all_public_streams of this BasicBotBase.

        Whether the bot can send messages to all streams by default.   # noqa: E501

        :return: The default_all_public_streams of this BasicBotBase.
        :rtype: bool
        """
        return self._default_all_public_streams

    @default_all_public_streams.setter
    def default_all_public_streams(self, default_all_public_streams):
        """Sets the default_all_public_streams of this BasicBotBase.

        Whether the bot can send messages to all streams by default.   # noqa: E501

        :param default_all_public_streams: The default_all_public_streams of this BasicBotBase.
        :type default_all_public_streams: bool
        """

        self._default_all_public_streams = default_all_public_streams

    @property
    def avatar_url(self):
        """Gets the avatar_url of this BasicBotBase.

        The URL of the bot's avatar.   # noqa: E501

        :return: The avatar_url of this BasicBotBase.
        :rtype: str
        """
        return self._avatar_url

    @avatar_url.setter
    def avatar_url(self, avatar_url):
        """Sets the avatar_url of this BasicBotBase.

        The URL of the bot's avatar.   # noqa: E501

        :param avatar_url: The avatar_url of this BasicBotBase.
        :type avatar_url: str
        """

        self._avatar_url = avatar_url

    @property
    def owner_id(self):
        """Gets the owner_id of this BasicBotBase.

        The user id of the bot's owner.  Null if the bot has no owner.   # noqa: E501

        :return: The owner_id of this BasicBotBase.
        :rtype: int
        """
        return self._owner_id

    @owner_id.setter
    def owner_id(self, owner_id):
        """Sets the owner_id of this BasicBotBase.

        The user id of the bot's owner.  Null if the bot has no owner.   # noqa: E501

        :param owner_id: The owner_id of this BasicBotBase.
        :type owner_id: int
        """

        self._owner_id = owner_id

    @property
    def services(self):
        """Gets the services of this BasicBotBase.

        The \"Services\" array contains extra configuration fields only relevant for Outgoing webhook bots and Embedded bots.  It is always a single-element array.  We consider this part of the Zulip API to be unstable; it is used only for UI elements for administering bots and is likely to change.   # noqa: E501

        :return: The services of this BasicBotBase.
        :rtype: List[OneOfobjectobject]
        """
        return self._services

    @services.setter
    def services(self, services):
        """Sets the services of this BasicBotBase.

        The \"Services\" array contains extra configuration fields only relevant for Outgoing webhook bots and Embedded bots.  It is always a single-element array.  We consider this part of the Zulip API to be unstable; it is used only for UI elements for administering bots and is likely to change.   # noqa: E501

        :param services: The services of this BasicBotBase.
        :type services: List[OneOfobjectobject]
        """

        self._services = services
