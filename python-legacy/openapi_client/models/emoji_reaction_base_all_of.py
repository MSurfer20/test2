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


class EmojiReactionBaseAllOf(object):
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
        'user_id': 'int',
        'user': 'EmojiReactionBaseAllOfUser'
    }

    attribute_map = {
        'user_id': 'user_id',
        'user': 'user'
    }

    def __init__(self, user_id=None, user=None, local_vars_configuration=None):  # noqa: E501
        """EmojiReactionBaseAllOf - a model defined in OpenAPI"""  # noqa: E501
        if local_vars_configuration is None:
            local_vars_configuration = Configuration.get_default_copy()
        self.local_vars_configuration = local_vars_configuration

        self._user_id = None
        self._user = None
        self.discriminator = None

        if user_id is not None:
            self.user_id = user_id
        if user is not None:
            self.user = user

    @property
    def user_id(self):
        """Gets the user_id of this EmojiReactionBaseAllOf.  # noqa: E501

        The ID of the user who added the reaction.  **Changes**: New in Zulip 3.0 (feature level 2). The `user` object is deprecated and will be removed in the future.   # noqa: E501

        :return: The user_id of this EmojiReactionBaseAllOf.  # noqa: E501
        :rtype: int
        """
        return self._user_id

    @user_id.setter
    def user_id(self, user_id):
        """Sets the user_id of this EmojiReactionBaseAllOf.

        The ID of the user who added the reaction.  **Changes**: New in Zulip 3.0 (feature level 2). The `user` object is deprecated and will be removed in the future.   # noqa: E501

        :param user_id: The user_id of this EmojiReactionBaseAllOf.  # noqa: E501
        :type user_id: int
        """

        self._user_id = user_id

    @property
    def user(self):
        """Gets the user of this EmojiReactionBaseAllOf.  # noqa: E501


        :return: The user of this EmojiReactionBaseAllOf.  # noqa: E501
        :rtype: EmojiReactionBaseAllOfUser
        """
        return self._user

    @user.setter
    def user(self, user):
        """Sets the user of this EmojiReactionBaseAllOf.


        :param user: The user of this EmojiReactionBaseAllOf.  # noqa: E501
        :type user: EmojiReactionBaseAllOfUser
        """

        self._user = user

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
        if not isinstance(other, EmojiReactionBaseAllOf):
            return False

        return self.to_dict() == other.to_dict()

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        if not isinstance(other, EmojiReactionBaseAllOf):
            return True

        return self.to_dict() != other.to_dict()