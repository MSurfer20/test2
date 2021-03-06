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


class ApiKeyResponseAllOf(object):
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
        'result': 'object',
        'msg': 'object',
        'api_key': 'str',
        'email': 'str'
    }

    attribute_map = {
        'result': 'result',
        'msg': 'msg',
        'api_key': 'api_key',
        'email': 'email'
    }

    def __init__(self, result=None, msg=None, api_key=None, email=None, local_vars_configuration=None):  # noqa: E501
        """ApiKeyResponseAllOf - a model defined in OpenAPI"""  # noqa: E501
        if local_vars_configuration is None:
            local_vars_configuration = Configuration.get_default_copy()
        self.local_vars_configuration = local_vars_configuration

        self._result = None
        self._msg = None
        self._api_key = None
        self._email = None
        self.discriminator = None

        self.result = result
        self.msg = msg
        self.api_key = api_key
        self.email = email

    @property
    def result(self):
        """Gets the result of this ApiKeyResponseAllOf.  # noqa: E501


        :return: The result of this ApiKeyResponseAllOf.  # noqa: E501
        :rtype: object
        """
        return self._result

    @result.setter
    def result(self, result):
        """Sets the result of this ApiKeyResponseAllOf.


        :param result: The result of this ApiKeyResponseAllOf.  # noqa: E501
        :type result: object
        """

        self._result = result

    @property
    def msg(self):
        """Gets the msg of this ApiKeyResponseAllOf.  # noqa: E501


        :return: The msg of this ApiKeyResponseAllOf.  # noqa: E501
        :rtype: object
        """
        return self._msg

    @msg.setter
    def msg(self, msg):
        """Sets the msg of this ApiKeyResponseAllOf.


        :param msg: The msg of this ApiKeyResponseAllOf.  # noqa: E501
        :type msg: object
        """

        self._msg = msg

    @property
    def api_key(self):
        """Gets the api_key of this ApiKeyResponseAllOf.  # noqa: E501

        The API key that can be used to authenticate as the requested user.   # noqa: E501

        :return: The api_key of this ApiKeyResponseAllOf.  # noqa: E501
        :rtype: str
        """
        return self._api_key

    @api_key.setter
    def api_key(self, api_key):
        """Sets the api_key of this ApiKeyResponseAllOf.

        The API key that can be used to authenticate as the requested user.   # noqa: E501

        :param api_key: The api_key of this ApiKeyResponseAllOf.  # noqa: E501
        :type api_key: str
        """
        if self.local_vars_configuration.client_side_validation and api_key is None:  # noqa: E501
            raise ValueError("Invalid value for `api_key`, must not be `None`")  # noqa: E501

        self._api_key = api_key

    @property
    def email(self):
        """Gets the email of this ApiKeyResponseAllOf.  # noqa: E501

        The email address of the user who owns the API key   # noqa: E501

        :return: The email of this ApiKeyResponseAllOf.  # noqa: E501
        :rtype: str
        """
        return self._email

    @email.setter
    def email(self, email):
        """Sets the email of this ApiKeyResponseAllOf.

        The email address of the user who owns the API key   # noqa: E501

        :param email: The email of this ApiKeyResponseAllOf.  # noqa: E501
        :type email: str
        """
        if self.local_vars_configuration.client_side_validation and email is None:  # noqa: E501
            raise ValueError("Invalid value for `email`, must not be `None`")  # noqa: E501

        self._email = email

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
        if not isinstance(other, ApiKeyResponseAllOf):
            return False

        return self.to_dict() == other.to_dict()

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        if not isinstance(other, ApiKeyResponseAllOf):
            return True

        return self.to_dict() != other.to_dict()
