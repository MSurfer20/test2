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


class RealmEmoji(object):
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
        'id': 'str',
        'name': 'str',
        'source_url': 'str',
        'deactivated': 'bool',
        'author_id': 'int'
    }

    attribute_map = {
        'id': 'id',
        'name': 'name',
        'source_url': 'source_url',
        'deactivated': 'deactivated',
        'author_id': 'author_id'
    }

    def __init__(self, id=None, name=None, source_url=None, deactivated=None, author_id=None, local_vars_configuration=None):  # noqa: E501
        """RealmEmoji - a model defined in OpenAPI"""  # noqa: E501
        if local_vars_configuration is None:
            local_vars_configuration = Configuration.get_default_copy()
        self.local_vars_configuration = local_vars_configuration

        self._id = None
        self._name = None
        self._source_url = None
        self._deactivated = None
        self._author_id = None
        self.discriminator = None

        if id is not None:
            self.id = id
        if name is not None:
            self.name = name
        if source_url is not None:
            self.source_url = source_url
        if deactivated is not None:
            self.deactivated = deactivated
        self.author_id = author_id

    @property
    def id(self):
        """Gets the id of this RealmEmoji.  # noqa: E501

        The ID for this emoji, same as the object's key.   # noqa: E501

        :return: The id of this RealmEmoji.  # noqa: E501
        :rtype: str
        """
        return self._id

    @id.setter
    def id(self, id):
        """Sets the id of this RealmEmoji.

        The ID for this emoji, same as the object's key.   # noqa: E501

        :param id: The id of this RealmEmoji.  # noqa: E501
        :type id: str
        """

        self._id = id

    @property
    def name(self):
        """Gets the name of this RealmEmoji.  # noqa: E501

        The user-friendly name for this emoji. Users in the organization can use this emoji by writing this name between colons (`:name  :`).   # noqa: E501

        :return: The name of this RealmEmoji.  # noqa: E501
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name):
        """Sets the name of this RealmEmoji.

        The user-friendly name for this emoji. Users in the organization can use this emoji by writing this name between colons (`:name  :`).   # noqa: E501

        :param name: The name of this RealmEmoji.  # noqa: E501
        :type name: str
        """

        self._name = name

    @property
    def source_url(self):
        """Gets the source_url of this RealmEmoji.  # noqa: E501

        The path relative to the organization's URL where the emoji's image can be found.   # noqa: E501

        :return: The source_url of this RealmEmoji.  # noqa: E501
        :rtype: str
        """
        return self._source_url

    @source_url.setter
    def source_url(self, source_url):
        """Sets the source_url of this RealmEmoji.

        The path relative to the organization's URL where the emoji's image can be found.   # noqa: E501

        :param source_url: The source_url of this RealmEmoji.  # noqa: E501
        :type source_url: str
        """

        self._source_url = source_url

    @property
    def deactivated(self):
        """Gets the deactivated of this RealmEmoji.  # noqa: E501

        Whether the emoji has been deactivated or not.   # noqa: E501

        :return: The deactivated of this RealmEmoji.  # noqa: E501
        :rtype: bool
        """
        return self._deactivated

    @deactivated.setter
    def deactivated(self, deactivated):
        """Sets the deactivated of this RealmEmoji.

        Whether the emoji has been deactivated or not.   # noqa: E501

        :param deactivated: The deactivated of this RealmEmoji.  # noqa: E501
        :type deactivated: bool
        """

        self._deactivated = deactivated

    @property
    def author_id(self):
        """Gets the author_id of this RealmEmoji.  # noqa: E501

        The user ID of the user who uploaded the custom emoji. Will be null if the uploader is unknown.  **Changes**: New in Zulip 3.0 (feature level 7).  Previously was accessible via and `author` object with an `id` field.   # noqa: E501

        :return: The author_id of this RealmEmoji.  # noqa: E501
        :rtype: int
        """
        return self._author_id

    @author_id.setter
    def author_id(self, author_id):
        """Sets the author_id of this RealmEmoji.

        The user ID of the user who uploaded the custom emoji. Will be null if the uploader is unknown.  **Changes**: New in Zulip 3.0 (feature level 7).  Previously was accessible via and `author` object with an `id` field.   # noqa: E501

        :param author_id: The author_id of this RealmEmoji.  # noqa: E501
        :type author_id: int
        """

        self._author_id = author_id

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
        if not isinstance(other, RealmEmoji):
            return False

        return self.to_dict() == other.to_dict()

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        if not isinstance(other, RealmEmoji):
            return True

        return self.to_dict() != other.to_dict()