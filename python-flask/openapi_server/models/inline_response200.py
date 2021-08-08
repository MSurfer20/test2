# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model_ import Model
from openapi_server.models.messages_base import MessagesBase
from openapi_server import util

from openapi_server.models.messages_base import MessagesBase  # noqa: E501

class InlineResponse200(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, bot_email=None, bot_full_name=None, data=None, trigger=None, token=None, message=None):  # noqa: E501
        """InlineResponse200 - a model defined in OpenAPI

        :param bot_email: The bot_email of this InlineResponse200.  # noqa: E501
        :type bot_email: str
        :param bot_full_name: The bot_full_name of this InlineResponse200.  # noqa: E501
        :type bot_full_name: str
        :param data: The data of this InlineResponse200.  # noqa: E501
        :type data: str
        :param trigger: The trigger of this InlineResponse200.  # noqa: E501
        :type trigger: str
        :param token: The token of this InlineResponse200.  # noqa: E501
        :type token: str
        :param message: The message of this InlineResponse200.  # noqa: E501
        :type message: MessagesBase
        """
        self.openapi_types = {
            'bot_email': str,
            'bot_full_name': str,
            'data': str,
            'trigger': str,
            'token': str,
            'message': MessagesBase
        }

        self.attribute_map = {
            'bot_email': 'bot_email',
            'bot_full_name': 'bot_full_name',
            'data': 'data',
            'trigger': 'trigger',
            'token': 'token',
            'message': 'message'
        }

        self._bot_email = bot_email
        self._bot_full_name = bot_full_name
        self._data = data
        self._trigger = trigger
        self._token = token
        self._message = message

    @classmethod
    def from_dict(cls, dikt) -> 'InlineResponse200':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The inline_response_200 of this InlineResponse200.  # noqa: E501
        :rtype: InlineResponse200
        """
        return util.deserialize_model(dikt, cls)

    @property
    def bot_email(self):
        """Gets the bot_email of this InlineResponse200.

        Email of the bot user.   # noqa: E501

        :return: The bot_email of this InlineResponse200.
        :rtype: str
        """
        return self._bot_email

    @bot_email.setter
    def bot_email(self, bot_email):
        """Sets the bot_email of this InlineResponse200.

        Email of the bot user.   # noqa: E501

        :param bot_email: The bot_email of this InlineResponse200.
        :type bot_email: str
        """

        self._bot_email = bot_email

    @property
    def bot_full_name(self):
        """Gets the bot_full_name of this InlineResponse200.

        The full name of the bot user.   # noqa: E501

        :return: The bot_full_name of this InlineResponse200.
        :rtype: str
        """
        return self._bot_full_name

    @bot_full_name.setter
    def bot_full_name(self, bot_full_name):
        """Sets the bot_full_name of this InlineResponse200.

        The full name of the bot user.   # noqa: E501

        :param bot_full_name: The bot_full_name of this InlineResponse200.
        :type bot_full_name: str
        """

        self._bot_full_name = bot_full_name

    @property
    def data(self):
        """Gets the data of this InlineResponse200.

        The message content, in raw Markdown format (not rendered to HTML).   # noqa: E501

        :return: The data of this InlineResponse200.
        :rtype: str
        """
        return self._data

    @data.setter
    def data(self, data):
        """Sets the data of this InlineResponse200.

        The message content, in raw Markdown format (not rendered to HTML).   # noqa: E501

        :param data: The data of this InlineResponse200.
        :type data: str
        """

        self._data = data

    @property
    def trigger(self):
        """Gets the trigger of this InlineResponse200.

        What aspect of the message triggered the outgoing webhook notification. Possible values include `private_message` and `mention`.   # noqa: E501

        :return: The trigger of this InlineResponse200.
        :rtype: str
        """
        return self._trigger

    @trigger.setter
    def trigger(self, trigger):
        """Sets the trigger of this InlineResponse200.

        What aspect of the message triggered the outgoing webhook notification. Possible values include `private_message` and `mention`.   # noqa: E501

        :param trigger: The trigger of this InlineResponse200.
        :type trigger: str
        """

        self._trigger = trigger

    @property
    def token(self):
        """Gets the token of this InlineResponse200.

        A string of alphanumeric characters that can be used to authenticate the webhook request (each bot user uses a fixed token). You can get the token used by a given outgoing webhook bot in the `zuliprc` file downloaded when creating the bot.   # noqa: E501

        :return: The token of this InlineResponse200.
        :rtype: str
        """
        return self._token

    @token.setter
    def token(self, token):
        """Sets the token of this InlineResponse200.

        A string of alphanumeric characters that can be used to authenticate the webhook request (each bot user uses a fixed token). You can get the token used by a given outgoing webhook bot in the `zuliprc` file downloaded when creating the bot.   # noqa: E501

        :param token: The token of this InlineResponse200.
        :type token: str
        """

        self._token = token

    @property
    def message(self):
        """Gets the message of this InlineResponse200.

        A dict containing details on the message that triggered the outgoing webhook, in the format used by [`GET /messages`](/api/get-messages).   # noqa: E501

        :return: The message of this InlineResponse200.
        :rtype: MessagesBase
        """
        return self._message

    @message.setter
    def message(self, message):
        """Sets the message of this InlineResponse200.

        A dict containing details on the message that triggered the outgoing webhook, in the format used by [`GET /messages`](/api/get-messages).   # noqa: E501

        :param message: The message of this InlineResponse200.
        :type message: MessagesBase
        """

        self._message = message