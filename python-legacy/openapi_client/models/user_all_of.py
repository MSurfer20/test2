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


class UserAllOf(object):
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
        'email': 'object',
        'is_bot': 'object',
        'avatar_url': 'object',
        'avatar_version': 'object',
        'full_name': 'object',
        'is_admin': 'object',
        'is_owner': 'object',
        'is_billing_admin': 'object',
        'role': 'object',
        'bot_type': 'object',
        'user_id': 'object',
        'bot_owner_id': 'object',
        'is_active': 'object',
        'is_guest': 'object',
        'timezone': 'object',
        'date_joined': 'object',
        'delivery_email': 'object',
        'profile_data': 'object'
    }

    attribute_map = {
        'email': 'email',
        'is_bot': 'is_bot',
        'avatar_url': 'avatar_url',
        'avatar_version': 'avatar_version',
        'full_name': 'full_name',
        'is_admin': 'is_admin',
        'is_owner': 'is_owner',
        'is_billing_admin': 'is_billing_admin',
        'role': 'role',
        'bot_type': 'bot_type',
        'user_id': 'user_id',
        'bot_owner_id': 'bot_owner_id',
        'is_active': 'is_active',
        'is_guest': 'is_guest',
        'timezone': 'timezone',
        'date_joined': 'date_joined',
        'delivery_email': 'delivery_email',
        'profile_data': 'profile_data'
    }

    def __init__(self, email=None, is_bot=None, avatar_url=None, avatar_version=None, full_name=None, is_admin=None, is_owner=None, is_billing_admin=None, role=None, bot_type=None, user_id=None, bot_owner_id=None, is_active=None, is_guest=None, timezone=None, date_joined=None, delivery_email=None, profile_data=None, local_vars_configuration=None):  # noqa: E501
        """UserAllOf - a model defined in OpenAPI"""  # noqa: E501
        if local_vars_configuration is None:
            local_vars_configuration = Configuration.get_default_copy()
        self.local_vars_configuration = local_vars_configuration

        self._email = None
        self._is_bot = None
        self._avatar_url = None
        self._avatar_version = None
        self._full_name = None
        self._is_admin = None
        self._is_owner = None
        self._is_billing_admin = None
        self._role = None
        self._bot_type = None
        self._user_id = None
        self._bot_owner_id = None
        self._is_active = None
        self._is_guest = None
        self._timezone = None
        self._date_joined = None
        self._delivery_email = None
        self._profile_data = None
        self.discriminator = None

        self.email = email
        self.is_bot = is_bot
        self.avatar_url = avatar_url
        self.avatar_version = avatar_version
        self.full_name = full_name
        self.is_admin = is_admin
        self.is_owner = is_owner
        self.is_billing_admin = is_billing_admin
        self.role = role
        self.bot_type = bot_type
        self.user_id = user_id
        self.bot_owner_id = bot_owner_id
        self.is_active = is_active
        self.is_guest = is_guest
        self.timezone = timezone
        self.date_joined = date_joined
        self.delivery_email = delivery_email
        self.profile_data = profile_data

    @property
    def email(self):
        """Gets the email of this UserAllOf.  # noqa: E501


        :return: The email of this UserAllOf.  # noqa: E501
        :rtype: object
        """
        return self._email

    @email.setter
    def email(self, email):
        """Sets the email of this UserAllOf.


        :param email: The email of this UserAllOf.  # noqa: E501
        :type email: object
        """

        self._email = email

    @property
    def is_bot(self):
        """Gets the is_bot of this UserAllOf.  # noqa: E501


        :return: The is_bot of this UserAllOf.  # noqa: E501
        :rtype: object
        """
        return self._is_bot

    @is_bot.setter
    def is_bot(self, is_bot):
        """Sets the is_bot of this UserAllOf.


        :param is_bot: The is_bot of this UserAllOf.  # noqa: E501
        :type is_bot: object
        """

        self._is_bot = is_bot

    @property
    def avatar_url(self):
        """Gets the avatar_url of this UserAllOf.  # noqa: E501


        :return: The avatar_url of this UserAllOf.  # noqa: E501
        :rtype: object
        """
        return self._avatar_url

    @avatar_url.setter
    def avatar_url(self, avatar_url):
        """Sets the avatar_url of this UserAllOf.


        :param avatar_url: The avatar_url of this UserAllOf.  # noqa: E501
        :type avatar_url: object
        """

        self._avatar_url = avatar_url

    @property
    def avatar_version(self):
        """Gets the avatar_version of this UserAllOf.  # noqa: E501


        :return: The avatar_version of this UserAllOf.  # noqa: E501
        :rtype: object
        """
        return self._avatar_version

    @avatar_version.setter
    def avatar_version(self, avatar_version):
        """Sets the avatar_version of this UserAllOf.


        :param avatar_version: The avatar_version of this UserAllOf.  # noqa: E501
        :type avatar_version: object
        """

        self._avatar_version = avatar_version

    @property
    def full_name(self):
        """Gets the full_name of this UserAllOf.  # noqa: E501


        :return: The full_name of this UserAllOf.  # noqa: E501
        :rtype: object
        """
        return self._full_name

    @full_name.setter
    def full_name(self, full_name):
        """Sets the full_name of this UserAllOf.


        :param full_name: The full_name of this UserAllOf.  # noqa: E501
        :type full_name: object
        """

        self._full_name = full_name

    @property
    def is_admin(self):
        """Gets the is_admin of this UserAllOf.  # noqa: E501


        :return: The is_admin of this UserAllOf.  # noqa: E501
        :rtype: object
        """
        return self._is_admin

    @is_admin.setter
    def is_admin(self, is_admin):
        """Sets the is_admin of this UserAllOf.


        :param is_admin: The is_admin of this UserAllOf.  # noqa: E501
        :type is_admin: object
        """

        self._is_admin = is_admin

    @property
    def is_owner(self):
        """Gets the is_owner of this UserAllOf.  # noqa: E501


        :return: The is_owner of this UserAllOf.  # noqa: E501
        :rtype: object
        """
        return self._is_owner

    @is_owner.setter
    def is_owner(self, is_owner):
        """Sets the is_owner of this UserAllOf.


        :param is_owner: The is_owner of this UserAllOf.  # noqa: E501
        :type is_owner: object
        """

        self._is_owner = is_owner

    @property
    def is_billing_admin(self):
        """Gets the is_billing_admin of this UserAllOf.  # noqa: E501


        :return: The is_billing_admin of this UserAllOf.  # noqa: E501
        :rtype: object
        """
        return self._is_billing_admin

    @is_billing_admin.setter
    def is_billing_admin(self, is_billing_admin):
        """Sets the is_billing_admin of this UserAllOf.


        :param is_billing_admin: The is_billing_admin of this UserAllOf.  # noqa: E501
        :type is_billing_admin: object
        """

        self._is_billing_admin = is_billing_admin

    @property
    def role(self):
        """Gets the role of this UserAllOf.  # noqa: E501


        :return: The role of this UserAllOf.  # noqa: E501
        :rtype: object
        """
        return self._role

    @role.setter
    def role(self, role):
        """Sets the role of this UserAllOf.


        :param role: The role of this UserAllOf.  # noqa: E501
        :type role: object
        """

        self._role = role

    @property
    def bot_type(self):
        """Gets the bot_type of this UserAllOf.  # noqa: E501


        :return: The bot_type of this UserAllOf.  # noqa: E501
        :rtype: object
        """
        return self._bot_type

    @bot_type.setter
    def bot_type(self, bot_type):
        """Sets the bot_type of this UserAllOf.


        :param bot_type: The bot_type of this UserAllOf.  # noqa: E501
        :type bot_type: object
        """

        self._bot_type = bot_type

    @property
    def user_id(self):
        """Gets the user_id of this UserAllOf.  # noqa: E501


        :return: The user_id of this UserAllOf.  # noqa: E501
        :rtype: object
        """
        return self._user_id

    @user_id.setter
    def user_id(self, user_id):
        """Sets the user_id of this UserAllOf.


        :param user_id: The user_id of this UserAllOf.  # noqa: E501
        :type user_id: object
        """

        self._user_id = user_id

    @property
    def bot_owner_id(self):
        """Gets the bot_owner_id of this UserAllOf.  # noqa: E501


        :return: The bot_owner_id of this UserAllOf.  # noqa: E501
        :rtype: object
        """
        return self._bot_owner_id

    @bot_owner_id.setter
    def bot_owner_id(self, bot_owner_id):
        """Sets the bot_owner_id of this UserAllOf.


        :param bot_owner_id: The bot_owner_id of this UserAllOf.  # noqa: E501
        :type bot_owner_id: object
        """

        self._bot_owner_id = bot_owner_id

    @property
    def is_active(self):
        """Gets the is_active of this UserAllOf.  # noqa: E501


        :return: The is_active of this UserAllOf.  # noqa: E501
        :rtype: object
        """
        return self._is_active

    @is_active.setter
    def is_active(self, is_active):
        """Sets the is_active of this UserAllOf.


        :param is_active: The is_active of this UserAllOf.  # noqa: E501
        :type is_active: object
        """

        self._is_active = is_active

    @property
    def is_guest(self):
        """Gets the is_guest of this UserAllOf.  # noqa: E501


        :return: The is_guest of this UserAllOf.  # noqa: E501
        :rtype: object
        """
        return self._is_guest

    @is_guest.setter
    def is_guest(self, is_guest):
        """Sets the is_guest of this UserAllOf.


        :param is_guest: The is_guest of this UserAllOf.  # noqa: E501
        :type is_guest: object
        """

        self._is_guest = is_guest

    @property
    def timezone(self):
        """Gets the timezone of this UserAllOf.  # noqa: E501


        :return: The timezone of this UserAllOf.  # noqa: E501
        :rtype: object
        """
        return self._timezone

    @timezone.setter
    def timezone(self, timezone):
        """Sets the timezone of this UserAllOf.


        :param timezone: The timezone of this UserAllOf.  # noqa: E501
        :type timezone: object
        """

        self._timezone = timezone

    @property
    def date_joined(self):
        """Gets the date_joined of this UserAllOf.  # noqa: E501


        :return: The date_joined of this UserAllOf.  # noqa: E501
        :rtype: object
        """
        return self._date_joined

    @date_joined.setter
    def date_joined(self, date_joined):
        """Sets the date_joined of this UserAllOf.


        :param date_joined: The date_joined of this UserAllOf.  # noqa: E501
        :type date_joined: object
        """

        self._date_joined = date_joined

    @property
    def delivery_email(self):
        """Gets the delivery_email of this UserAllOf.  # noqa: E501


        :return: The delivery_email of this UserAllOf.  # noqa: E501
        :rtype: object
        """
        return self._delivery_email

    @delivery_email.setter
    def delivery_email(self, delivery_email):
        """Sets the delivery_email of this UserAllOf.


        :param delivery_email: The delivery_email of this UserAllOf.  # noqa: E501
        :type delivery_email: object
        """

        self._delivery_email = delivery_email

    @property
    def profile_data(self):
        """Gets the profile_data of this UserAllOf.  # noqa: E501


        :return: The profile_data of this UserAllOf.  # noqa: E501
        :rtype: object
        """
        return self._profile_data

    @profile_data.setter
    def profile_data(self, profile_data):
        """Sets the profile_data of this UserAllOf.


        :param profile_data: The profile_data of this UserAllOf.  # noqa: E501
        :type profile_data: object
        """

        self._profile_data = profile_data

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
        if not isinstance(other, UserAllOf):
            return False

        return self.to_dict() == other.to_dict()

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        if not isinstance(other, UserAllOf):
            return True

        return self.to_dict() != other.to_dict()
