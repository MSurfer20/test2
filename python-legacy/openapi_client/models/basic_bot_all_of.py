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


class BasicBotAllOf(object):
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
        'user_id': 'object',
        'full_name': 'object',
        'api_key': 'object',
        'default_sending_stream': 'object',
        'default_events_register_stream': 'object',
        'default_all_public_streams': 'object',
        'avatar_url': 'object',
        'owner_id': 'object',
        'services': 'object'
    }

    attribute_map = {
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

    def __init__(self, user_id=None, full_name=None, api_key=None, default_sending_stream=None, default_events_register_stream=None, default_all_public_streams=None, avatar_url=None, owner_id=None, services=None, local_vars_configuration=None):  # noqa: E501
        """BasicBotAllOf - a model defined in OpenAPI"""  # noqa: E501
        if local_vars_configuration is None:
            local_vars_configuration = Configuration.get_default_copy()
        self.local_vars_configuration = local_vars_configuration

        self._user_id = None
        self._full_name = None
        self._api_key = None
        self._default_sending_stream = None
        self._default_events_register_stream = None
        self._default_all_public_streams = None
        self._avatar_url = None
        self._owner_id = None
        self._services = None
        self.discriminator = None

        self.user_id = user_id
        self.full_name = full_name
        self.api_key = api_key
        self.default_sending_stream = default_sending_stream
        self.default_events_register_stream = default_events_register_stream
        self.default_all_public_streams = default_all_public_streams
        self.avatar_url = avatar_url
        self.owner_id = owner_id
        self.services = services

    @property
    def user_id(self):
        """Gets the user_id of this BasicBotAllOf.  # noqa: E501


        :return: The user_id of this BasicBotAllOf.  # noqa: E501
        :rtype: object
        """
        return self._user_id

    @user_id.setter
    def user_id(self, user_id):
        """Sets the user_id of this BasicBotAllOf.


        :param user_id: The user_id of this BasicBotAllOf.  # noqa: E501
        :type user_id: object
        """

        self._user_id = user_id

    @property
    def full_name(self):
        """Gets the full_name of this BasicBotAllOf.  # noqa: E501


        :return: The full_name of this BasicBotAllOf.  # noqa: E501
        :rtype: object
        """
        return self._full_name

    @full_name.setter
    def full_name(self, full_name):
        """Sets the full_name of this BasicBotAllOf.


        :param full_name: The full_name of this BasicBotAllOf.  # noqa: E501
        :type full_name: object
        """

        self._full_name = full_name

    @property
    def api_key(self):
        """Gets the api_key of this BasicBotAllOf.  # noqa: E501


        :return: The api_key of this BasicBotAllOf.  # noqa: E501
        :rtype: object
        """
        return self._api_key

    @api_key.setter
    def api_key(self, api_key):
        """Sets the api_key of this BasicBotAllOf.


        :param api_key: The api_key of this BasicBotAllOf.  # noqa: E501
        :type api_key: object
        """

        self._api_key = api_key

    @property
    def default_sending_stream(self):
        """Gets the default_sending_stream of this BasicBotAllOf.  # noqa: E501


        :return: The default_sending_stream of this BasicBotAllOf.  # noqa: E501
        :rtype: object
        """
        return self._default_sending_stream

    @default_sending_stream.setter
    def default_sending_stream(self, default_sending_stream):
        """Sets the default_sending_stream of this BasicBotAllOf.


        :param default_sending_stream: The default_sending_stream of this BasicBotAllOf.  # noqa: E501
        :type default_sending_stream: object
        """

        self._default_sending_stream = default_sending_stream

    @property
    def default_events_register_stream(self):
        """Gets the default_events_register_stream of this BasicBotAllOf.  # noqa: E501


        :return: The default_events_register_stream of this BasicBotAllOf.  # noqa: E501
        :rtype: object
        """
        return self._default_events_register_stream

    @default_events_register_stream.setter
    def default_events_register_stream(self, default_events_register_stream):
        """Sets the default_events_register_stream of this BasicBotAllOf.


        :param default_events_register_stream: The default_events_register_stream of this BasicBotAllOf.  # noqa: E501
        :type default_events_register_stream: object
        """

        self._default_events_register_stream = default_events_register_stream

    @property
    def default_all_public_streams(self):
        """Gets the default_all_public_streams of this BasicBotAllOf.  # noqa: E501


        :return: The default_all_public_streams of this BasicBotAllOf.  # noqa: E501
        :rtype: object
        """
        return self._default_all_public_streams

    @default_all_public_streams.setter
    def default_all_public_streams(self, default_all_public_streams):
        """Sets the default_all_public_streams of this BasicBotAllOf.


        :param default_all_public_streams: The default_all_public_streams of this BasicBotAllOf.  # noqa: E501
        :type default_all_public_streams: object
        """

        self._default_all_public_streams = default_all_public_streams

    @property
    def avatar_url(self):
        """Gets the avatar_url of this BasicBotAllOf.  # noqa: E501


        :return: The avatar_url of this BasicBotAllOf.  # noqa: E501
        :rtype: object
        """
        return self._avatar_url

    @avatar_url.setter
    def avatar_url(self, avatar_url):
        """Sets the avatar_url of this BasicBotAllOf.


        :param avatar_url: The avatar_url of this BasicBotAllOf.  # noqa: E501
        :type avatar_url: object
        """

        self._avatar_url = avatar_url

    @property
    def owner_id(self):
        """Gets the owner_id of this BasicBotAllOf.  # noqa: E501


        :return: The owner_id of this BasicBotAllOf.  # noqa: E501
        :rtype: object
        """
        return self._owner_id

    @owner_id.setter
    def owner_id(self, owner_id):
        """Sets the owner_id of this BasicBotAllOf.


        :param owner_id: The owner_id of this BasicBotAllOf.  # noqa: E501
        :type owner_id: object
        """

        self._owner_id = owner_id

    @property
    def services(self):
        """Gets the services of this BasicBotAllOf.  # noqa: E501


        :return: The services of this BasicBotAllOf.  # noqa: E501
        :rtype: object
        """
        return self._services

    @services.setter
    def services(self, services):
        """Sets the services of this BasicBotAllOf.


        :param services: The services of this BasicBotAllOf.  # noqa: E501
        :type services: object
        """

        self._services = services

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
        if not isinstance(other, BasicBotAllOf):
            return False

        return self.to_dict() == other.to_dict()

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        if not isinstance(other, BasicBotAllOf):
            return True

        return self.to_dict() != other.to_dict()
