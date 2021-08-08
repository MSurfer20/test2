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


class MessagesBase(object):
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
        'avatar_url': 'str',
        'client': 'str',
        'content': 'str',
        'content_type': 'str',
        'display_recipient': 'OneOfstringarray',
        'id': 'int',
        'is_me_message': 'bool',
        'reactions': 'list[EmojiReaction]',
        'recipient_id': 'int',
        'sender_email': 'str',
        'sender_full_name': 'str',
        'sender_id': 'int',
        'sender_realm_str': 'str',
        'stream_id': 'int',
        'subject': 'str',
        'topic_links': 'list[MessagesBaseTopicLinks]',
        'submessages': 'list[str]',
        'timestamp': 'int',
        'type': 'str'
    }

    attribute_map = {
        'avatar_url': 'avatar_url',
        'client': 'client',
        'content': 'content',
        'content_type': 'content_type',
        'display_recipient': 'display_recipient',
        'id': 'id',
        'is_me_message': 'is_me_message',
        'reactions': 'reactions',
        'recipient_id': 'recipient_id',
        'sender_email': 'sender_email',
        'sender_full_name': 'sender_full_name',
        'sender_id': 'sender_id',
        'sender_realm_str': 'sender_realm_str',
        'stream_id': 'stream_id',
        'subject': 'subject',
        'topic_links': 'topic_links',
        'submessages': 'submessages',
        'timestamp': 'timestamp',
        'type': 'type'
    }

    def __init__(self, avatar_url=None, client=None, content=None, content_type=None, display_recipient=None, id=None, is_me_message=None, reactions=None, recipient_id=None, sender_email=None, sender_full_name=None, sender_id=None, sender_realm_str=None, stream_id=None, subject=None, topic_links=None, submessages=None, timestamp=None, type=None, local_vars_configuration=None):  # noqa: E501
        """MessagesBase - a model defined in OpenAPI"""  # noqa: E501
        if local_vars_configuration is None:
            local_vars_configuration = Configuration.get_default_copy()
        self.local_vars_configuration = local_vars_configuration

        self._avatar_url = None
        self._client = None
        self._content = None
        self._content_type = None
        self._display_recipient = None
        self._id = None
        self._is_me_message = None
        self._reactions = None
        self._recipient_id = None
        self._sender_email = None
        self._sender_full_name = None
        self._sender_id = None
        self._sender_realm_str = None
        self._stream_id = None
        self._subject = None
        self._topic_links = None
        self._submessages = None
        self._timestamp = None
        self._type = None
        self.discriminator = None

        self.avatar_url = avatar_url
        if client is not None:
            self.client = client
        if content is not None:
            self.content = content
        if content_type is not None:
            self.content_type = content_type
        if display_recipient is not None:
            self.display_recipient = display_recipient
        if id is not None:
            self.id = id
        if is_me_message is not None:
            self.is_me_message = is_me_message
        if reactions is not None:
            self.reactions = reactions
        if recipient_id is not None:
            self.recipient_id = recipient_id
        if sender_email is not None:
            self.sender_email = sender_email
        if sender_full_name is not None:
            self.sender_full_name = sender_full_name
        if sender_id is not None:
            self.sender_id = sender_id
        if sender_realm_str is not None:
            self.sender_realm_str = sender_realm_str
        if stream_id is not None:
            self.stream_id = stream_id
        if subject is not None:
            self.subject = subject
        if topic_links is not None:
            self.topic_links = topic_links
        if submessages is not None:
            self.submessages = submessages
        if timestamp is not None:
            self.timestamp = timestamp
        if type is not None:
            self.type = type

    @property
    def avatar_url(self):
        """Gets the avatar_url of this MessagesBase.  # noqa: E501

        The URL of the user's avatar.  Can be null only if client_gravatar was passed, which means that the user has not uploaded an avatar in Zulip, and the client should compute the gravatar URL by hashing the user's email address itself for this user.   # noqa: E501

        :return: The avatar_url of this MessagesBase.  # noqa: E501
        :rtype: str
        """
        return self._avatar_url

    @avatar_url.setter
    def avatar_url(self, avatar_url):
        """Sets the avatar_url of this MessagesBase.

        The URL of the user's avatar.  Can be null only if client_gravatar was passed, which means that the user has not uploaded an avatar in Zulip, and the client should compute the gravatar URL by hashing the user's email address itself for this user.   # noqa: E501

        :param avatar_url: The avatar_url of this MessagesBase.  # noqa: E501
        :type avatar_url: str
        """

        self._avatar_url = avatar_url

    @property
    def client(self):
        """Gets the client of this MessagesBase.  # noqa: E501

        A Zulip \"client\" string, describing what Zulip client sent the message.   # noqa: E501

        :return: The client of this MessagesBase.  # noqa: E501
        :rtype: str
        """
        return self._client

    @client.setter
    def client(self, client):
        """Sets the client of this MessagesBase.

        A Zulip \"client\" string, describing what Zulip client sent the message.   # noqa: E501

        :param client: The client of this MessagesBase.  # noqa: E501
        :type client: str
        """

        self._client = client

    @property
    def content(self):
        """Gets the content of this MessagesBase.  # noqa: E501

        The content/body of the message.   # noqa: E501

        :return: The content of this MessagesBase.  # noqa: E501
        :rtype: str
        """
        return self._content

    @content.setter
    def content(self, content):
        """Sets the content of this MessagesBase.

        The content/body of the message.   # noqa: E501

        :param content: The content of this MessagesBase.  # noqa: E501
        :type content: str
        """

        self._content = content

    @property
    def content_type(self):
        """Gets the content_type of this MessagesBase.  # noqa: E501

        The HTTP `content_type` for the message content.  This will be `text/html` or `text/x-markdown`, depending on whether `apply_markdown` was set.   # noqa: E501

        :return: The content_type of this MessagesBase.  # noqa: E501
        :rtype: str
        """
        return self._content_type

    @content_type.setter
    def content_type(self, content_type):
        """Sets the content_type of this MessagesBase.

        The HTTP `content_type` for the message content.  This will be `text/html` or `text/x-markdown`, depending on whether `apply_markdown` was set.   # noqa: E501

        :param content_type: The content_type of this MessagesBase.  # noqa: E501
        :type content_type: str
        """

        self._content_type = content_type

    @property
    def display_recipient(self):
        """Gets the display_recipient of this MessagesBase.  # noqa: E501

        Data on the recipient of the message; either the name of a stream or a dictionary containing basic data on the users who received the message.   # noqa: E501

        :return: The display_recipient of this MessagesBase.  # noqa: E501
        :rtype: OneOfstringarray
        """
        return self._display_recipient

    @display_recipient.setter
    def display_recipient(self, display_recipient):
        """Sets the display_recipient of this MessagesBase.

        Data on the recipient of the message; either the name of a stream or a dictionary containing basic data on the users who received the message.   # noqa: E501

        :param display_recipient: The display_recipient of this MessagesBase.  # noqa: E501
        :type display_recipient: OneOfstringarray
        """

        self._display_recipient = display_recipient

    @property
    def id(self):
        """Gets the id of this MessagesBase.  # noqa: E501

        The unique message ID.  Messages should always be displayed sorted by ID.   # noqa: E501

        :return: The id of this MessagesBase.  # noqa: E501
        :rtype: int
        """
        return self._id

    @id.setter
    def id(self, id):
        """Sets the id of this MessagesBase.

        The unique message ID.  Messages should always be displayed sorted by ID.   # noqa: E501

        :param id: The id of this MessagesBase.  # noqa: E501
        :type id: int
        """

        self._id = id

    @property
    def is_me_message(self):
        """Gets the is_me_message of this MessagesBase.  # noqa: E501

        Whether the message is a [/me status message][status-messages]  [status-messages]: /help/format-your-message-using-markdown#status-messages   # noqa: E501

        :return: The is_me_message of this MessagesBase.  # noqa: E501
        :rtype: bool
        """
        return self._is_me_message

    @is_me_message.setter
    def is_me_message(self, is_me_message):
        """Sets the is_me_message of this MessagesBase.

        Whether the message is a [/me status message][status-messages]  [status-messages]: /help/format-your-message-using-markdown#status-messages   # noqa: E501

        :param is_me_message: The is_me_message of this MessagesBase.  # noqa: E501
        :type is_me_message: bool
        """

        self._is_me_message = is_me_message

    @property
    def reactions(self):
        """Gets the reactions of this MessagesBase.  # noqa: E501

        Data on any reactions to the message.   # noqa: E501

        :return: The reactions of this MessagesBase.  # noqa: E501
        :rtype: list[EmojiReaction]
        """
        return self._reactions

    @reactions.setter
    def reactions(self, reactions):
        """Sets the reactions of this MessagesBase.

        Data on any reactions to the message.   # noqa: E501

        :param reactions: The reactions of this MessagesBase.  # noqa: E501
        :type reactions: list[EmojiReaction]
        """

        self._reactions = reactions

    @property
    def recipient_id(self):
        """Gets the recipient_id of this MessagesBase.  # noqa: E501

        A unique ID for the set of users receiving the message (either a stream or group of users).  Useful primarily for hashing.   # noqa: E501

        :return: The recipient_id of this MessagesBase.  # noqa: E501
        :rtype: int
        """
        return self._recipient_id

    @recipient_id.setter
    def recipient_id(self, recipient_id):
        """Sets the recipient_id of this MessagesBase.

        A unique ID for the set of users receiving the message (either a stream or group of users).  Useful primarily for hashing.   # noqa: E501

        :param recipient_id: The recipient_id of this MessagesBase.  # noqa: E501
        :type recipient_id: int
        """

        self._recipient_id = recipient_id

    @property
    def sender_email(self):
        """Gets the sender_email of this MessagesBase.  # noqa: E501

        The Zulip display email address of the message's sender.   # noqa: E501

        :return: The sender_email of this MessagesBase.  # noqa: E501
        :rtype: str
        """
        return self._sender_email

    @sender_email.setter
    def sender_email(self, sender_email):
        """Sets the sender_email of this MessagesBase.

        The Zulip display email address of the message's sender.   # noqa: E501

        :param sender_email: The sender_email of this MessagesBase.  # noqa: E501
        :type sender_email: str
        """

        self._sender_email = sender_email

    @property
    def sender_full_name(self):
        """Gets the sender_full_name of this MessagesBase.  # noqa: E501

        The full name of the message's sender.   # noqa: E501

        :return: The sender_full_name of this MessagesBase.  # noqa: E501
        :rtype: str
        """
        return self._sender_full_name

    @sender_full_name.setter
    def sender_full_name(self, sender_full_name):
        """Sets the sender_full_name of this MessagesBase.

        The full name of the message's sender.   # noqa: E501

        :param sender_full_name: The sender_full_name of this MessagesBase.  # noqa: E501
        :type sender_full_name: str
        """

        self._sender_full_name = sender_full_name

    @property
    def sender_id(self):
        """Gets the sender_id of this MessagesBase.  # noqa: E501

        The user ID of the message's sender.   # noqa: E501

        :return: The sender_id of this MessagesBase.  # noqa: E501
        :rtype: int
        """
        return self._sender_id

    @sender_id.setter
    def sender_id(self, sender_id):
        """Sets the sender_id of this MessagesBase.

        The user ID of the message's sender.   # noqa: E501

        :param sender_id: The sender_id of this MessagesBase.  # noqa: E501
        :type sender_id: int
        """

        self._sender_id = sender_id

    @property
    def sender_realm_str(self):
        """Gets the sender_realm_str of this MessagesBase.  # noqa: E501

        A string identifier for the realm the sender is in.  Unique only within the context of a given Zulip server.  E.g. on `example.zulip.com`, this will be `example`.   # noqa: E501

        :return: The sender_realm_str of this MessagesBase.  # noqa: E501
        :rtype: str
        """
        return self._sender_realm_str

    @sender_realm_str.setter
    def sender_realm_str(self, sender_realm_str):
        """Sets the sender_realm_str of this MessagesBase.

        A string identifier for the realm the sender is in.  Unique only within the context of a given Zulip server.  E.g. on `example.zulip.com`, this will be `example`.   # noqa: E501

        :param sender_realm_str: The sender_realm_str of this MessagesBase.  # noqa: E501
        :type sender_realm_str: str
        """

        self._sender_realm_str = sender_realm_str

    @property
    def stream_id(self):
        """Gets the stream_id of this MessagesBase.  # noqa: E501

        Only present for stream messages; the ID of the stream.   # noqa: E501

        :return: The stream_id of this MessagesBase.  # noqa: E501
        :rtype: int
        """
        return self._stream_id

    @stream_id.setter
    def stream_id(self, stream_id):
        """Sets the stream_id of this MessagesBase.

        Only present for stream messages; the ID of the stream.   # noqa: E501

        :param stream_id: The stream_id of this MessagesBase.  # noqa: E501
        :type stream_id: int
        """

        self._stream_id = stream_id

    @property
    def subject(self):
        """Gets the subject of this MessagesBase.  # noqa: E501

        The `topic` of the message.  Currently always `\"\"` for private messages, though this could change if Zulip adds support for topics in private message conversations.  The field name is a legacy holdover from when topics were called \"subjects\" and will eventually change.   # noqa: E501

        :return: The subject of this MessagesBase.  # noqa: E501
        :rtype: str
        """
        return self._subject

    @subject.setter
    def subject(self, subject):
        """Sets the subject of this MessagesBase.

        The `topic` of the message.  Currently always `\"\"` for private messages, though this could change if Zulip adds support for topics in private message conversations.  The field name is a legacy holdover from when topics were called \"subjects\" and will eventually change.   # noqa: E501

        :param subject: The subject of this MessagesBase.  # noqa: E501
        :type subject: str
        """

        self._subject = subject

    @property
    def topic_links(self):
        """Gets the topic_links of this MessagesBase.  # noqa: E501

        Data on any links to be included in the `topic` line (these are generated by [custom linkification filters](/help/add-a-custom-linkifier) that match content in the message's topic.)  **Changes**: This field contained a list of urls before   Zulip 4.0 (feature level 46).  New in Zulip 3.0 (feature level 1): Previously, this field was called `subject_links`; clients are recommended to rename `subject_links` to `topic_links` if present for compatibility with older Zulip servers.   # noqa: E501

        :return: The topic_links of this MessagesBase.  # noqa: E501
        :rtype: list[MessagesBaseTopicLinks]
        """
        return self._topic_links

    @topic_links.setter
    def topic_links(self, topic_links):
        """Sets the topic_links of this MessagesBase.

        Data on any links to be included in the `topic` line (these are generated by [custom linkification filters](/help/add-a-custom-linkifier) that match content in the message's topic.)  **Changes**: This field contained a list of urls before   Zulip 4.0 (feature level 46).  New in Zulip 3.0 (feature level 1): Previously, this field was called `subject_links`; clients are recommended to rename `subject_links` to `topic_links` if present for compatibility with older Zulip servers.   # noqa: E501

        :param topic_links: The topic_links of this MessagesBase.  # noqa: E501
        :type topic_links: list[MessagesBaseTopicLinks]
        """

        self._topic_links = topic_links

    @property
    def submessages(self):
        """Gets the submessages of this MessagesBase.  # noqa: E501

        Data used for certain experimental Zulip integrations.   # noqa: E501

        :return: The submessages of this MessagesBase.  # noqa: E501
        :rtype: list[str]
        """
        return self._submessages

    @submessages.setter
    def submessages(self, submessages):
        """Sets the submessages of this MessagesBase.

        Data used for certain experimental Zulip integrations.   # noqa: E501

        :param submessages: The submessages of this MessagesBase.  # noqa: E501
        :type submessages: list[str]
        """

        self._submessages = submessages

    @property
    def timestamp(self):
        """Gets the timestamp of this MessagesBase.  # noqa: E501

        The UNIX timestamp for when the message was sent, in UTC seconds.   # noqa: E501

        :return: The timestamp of this MessagesBase.  # noqa: E501
        :rtype: int
        """
        return self._timestamp

    @timestamp.setter
    def timestamp(self, timestamp):
        """Sets the timestamp of this MessagesBase.

        The UNIX timestamp for when the message was sent, in UTC seconds.   # noqa: E501

        :param timestamp: The timestamp of this MessagesBase.  # noqa: E501
        :type timestamp: int
        """

        self._timestamp = timestamp

    @property
    def type(self):
        """Gets the type of this MessagesBase.  # noqa: E501

        The type of the message: `stream` or `private`.   # noqa: E501

        :return: The type of this MessagesBase.  # noqa: E501
        :rtype: str
        """
        return self._type

    @type.setter
    def type(self, type):
        """Sets the type of this MessagesBase.

        The type of the message: `stream` or `private`.   # noqa: E501

        :param type: The type of this MessagesBase.  # noqa: E501
        :type type: str
        """

        self._type = type

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
        if not isinstance(other, MessagesBase):
            return False

        return self.to_dict() == other.to_dict()

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        if not isinstance(other, MessagesBase):
            return True

        return self.to_dict() != other.to_dict()