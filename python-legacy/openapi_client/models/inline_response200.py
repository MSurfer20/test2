# coding: utf-8

"""
    Zulip REST API

    Powerful open source group chat   # noqa: E501

    The version of the OpenAPI document: 1.0.0
    Generated by: https://openapi-generator.tech
"""


try:
    from inspect import getfullargspec
except ImportError:
    from inspect import getargspec as getfullargspec
import pprint
import re  # noqa: F401
import six

from openapi_client.configuration import Configuration


class InlineResponse200(object):
    """NOTE: This class is auto generated by OpenAPI Generator.
    Ref: https://openapi-generator.tech

    Do not edit the class manually.
    """

    """
    Attributes:
      openapi_types (dict): The key is attribute name
                            and the value is attribute type.
      attribute_map (dict): The key is attribute name
                            and the value is json key in definition.
    """
    openapi_types = {
        'bot_email': 'str',
        'bot_full_name': 'str',
        'data': 'str',
        'trigger': 'str',
        'token': 'str',
        'message': 'MessagesBase'
    }

    attribute_map = {
        'bot_email': 'bot_email',
        'bot_full_name': 'bot_full_name',
        'data': 'data',
        'trigger': 'trigger',
        'token': 'token',
        'message': 'message'
    }

    def __init__(self, bot_email=None, bot_full_name=None, data=None, trigger=None, token=None, message=None, local_vars_configuration=None):  # noqa: E501
        """InlineResponse200 - a model defined in OpenAPI"""  # noqa: E501
        if local_vars_configuration is None:
            local_vars_configuration = Configuration.get_default_copy()
        self.local_vars_configuration = local_vars_configuration

        self._bot_email = None
        self._bot_full_name = None
        self._data = None
        self._trigger = None
        self._token = None
        self._message = None
        self.discriminator = None

        if bot_email is not None:
            self.bot_email = bot_email
        if bot_full_name is not None:
            self.bot_full_name = bot_full_name
        if data is not None:
            self.data = data
        if trigger is not None:
            self.trigger = trigger
        if token is not None:
            self.token = token
        if message is not None:
            self.message = message

    @property
    def bot_email(self):
        """Gets the bot_email of this InlineResponse200.  # noqa: E501

        Email of the bot user.   # noqa: E501

        :return: The bot_email of this InlineResponse200.  # noqa: E501
        :rtype: str
        """
        return self._bot_email

    @bot_email.setter
    def bot_email(self, bot_email):
        """Sets the bot_email of this InlineResponse200.

        Email of the bot user.   # noqa: E501

        :param bot_email: The bot_email of this InlineResponse200.  # noqa: E501
        :type bot_email: str
        """

        self._bot_email = bot_email

    @property
    def bot_full_name(self):
        """Gets the bot_full_name of this InlineResponse200.  # noqa: E501

        The full name of the bot user.   # noqa: E501

        :return: The bot_full_name of this InlineResponse200.  # noqa: E501
        :rtype: str
        """
        return self._bot_full_name

    @bot_full_name.setter
    def bot_full_name(self, bot_full_name):
        """Sets the bot_full_name of this InlineResponse200.

        The full name of the bot user.   # noqa: E501

        :param bot_full_name: The bot_full_name of this InlineResponse200.  # noqa: E501
        :type bot_full_name: str
        """

        self._bot_full_name = bot_full_name

    @property
    def data(self):
        """Gets the data of this InlineResponse200.  # noqa: E501

        The message content, in raw Markdown format (not rendered to HTML).   # noqa: E501

        :return: The data of this InlineResponse200.  # noqa: E501
        :rtype: str
        """
        return self._data

    @data.setter
    def data(self, data):
        """Sets the data of this InlineResponse200.

        The message content, in raw Markdown format (not rendered to HTML).   # noqa: E501

        :param data: The data of this InlineResponse200.  # noqa: E501
        :type data: str
        """

        self._data = data

    @property
    def trigger(self):
        """Gets the trigger of this InlineResponse200.  # noqa: E501

        What aspect of the message triggered the outgoing webhook notification. Possible values include `private_message` and `mention`.   # noqa: E501

        :return: The trigger of this InlineResponse200.  # noqa: E501
        :rtype: str
        """
        return self._trigger

    @trigger.setter
    def trigger(self, trigger):
        """Sets the trigger of this InlineResponse200.

        What aspect of the message triggered the outgoing webhook notification. Possible values include `private_message` and `mention`.   # noqa: E501

        :param trigger: The trigger of this InlineResponse200.  # noqa: E501
        :type trigger: str
        """

        self._trigger = trigger

    @property
    def token(self):
        """Gets the token of this InlineResponse200.  # noqa: E501

        A string of alphanumeric characters that can be used to authenticate the webhook request (each bot user uses a fixed token). You can get the token used by a given outgoing webhook bot in the `zuliprc` file downloaded when creating the bot.   # noqa: E501

        :return: The token of this InlineResponse200.  # noqa: E501
        :rtype: str
        """
        return self._token

    @token.setter
    def token(self, token):
        """Sets the token of this InlineResponse200.

        A string of alphanumeric characters that can be used to authenticate the webhook request (each bot user uses a fixed token). You can get the token used by a given outgoing webhook bot in the `zuliprc` file downloaded when creating the bot.   # noqa: E501

        :param token: The token of this InlineResponse200.  # noqa: E501
        :type token: str
        """

        self._token = token

    @property
    def message(self):
        """Gets the message of this InlineResponse200.  # noqa: E501

        A dict containing details on the message that triggered the outgoing webhook, in the format used by [`GET /messages`](/api/get-messages).   # noqa: E501

        :return: The message of this InlineResponse200.  # noqa: E501
        :rtype: MessagesBase
        """
        return self._message

    @message.setter
    def message(self, message):
        """Sets the message of this InlineResponse200.

        A dict containing details on the message that triggered the outgoing webhook, in the format used by [`GET /messages`](/api/get-messages).   # noqa: E501

        :param message: The message of this InlineResponse200.  # noqa: E501
        :type message: MessagesBase
        """

        self._message = message

    def to_dict(self, serialize=False):
        """Returns the model properties as a dict"""
        result = {}

        def convert(x):
            if hasattr(x, "to_dict"):
                args = getfullargspec(x.to_dict).args
                if len(args) == 1:
                    return x.to_dict()
                else:
                    return x.to_dict(serialize)
            else:
                return x

        for attr, _ in six.iteritems(self.openapi_types):
            value = getattr(self, attr)
            attr = self.attribute_map.get(attr, attr) if serialize else attr
            if isinstance(value, list):
                result[attr] = list(map(
                    lambda x: convert(x),
                    value
                ))
            elif isinstance(value, dict):
                result[attr] = dict(map(
                    lambda item: (item[0], convert(item[1])),
                    value.items()
                ))
            else:
                result[attr] = convert(value)

        return result

    def to_str(self):
        """Returns the string representation of the model"""
        return pprint.pformat(self.to_dict())

    def __repr__(self):
        """For `print` and `pprint`"""
        return self.to_str()

    def __eq__(self, other):
        """Returns true if both objects are equal"""
        if not isinstance(other, InlineResponse200):
            return False

        return self.to_dict() == other.to_dict()

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        if not isinstance(other, InlineResponse200):
            return True

        return self.to_dict() != other.to_dict()
