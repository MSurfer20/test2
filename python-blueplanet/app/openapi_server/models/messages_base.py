# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from app.openapi_server.models.base_model_ import Model
from app.openapi_server.models.emoji_reaction import EmojiReaction  # noqa: F401,E501
from app.openapi_server.models.messages_base_topic_links import MessagesBaseTopicLinks  # noqa: F401,E501
from app.openapi_server.models.one_ofstringarray import OneOfstringarray  # noqa: F401,E501
from openapi_server import util


class MessagesBase(Model):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    """

    def __init__(self, avatar_url: str=None, client: str=None, content: str=None, content_type: str=None, display_recipient: OneOfstringarray=None, id: int=None, is_me_message: bool=None, reactions: List[EmojiReaction]=None, recipient_id: int=None, sender_email: str=None, sender_full_name: str=None, sender_id: int=None, sender_realm_str: str=None, stream_id: int=None, subject: str=None, topic_links: List[MessagesBaseTopicLinks]=None, submessages: List[str]=None, timestamp: int=None, type: str=None):  # noqa: E501
        """MessagesBase - a model defined in Swagger

        :param avatar_url: The avatar_url of this MessagesBase.  # noqa: E501
        :type avatar_url: str
        :param client: The client of this MessagesBase.  # noqa: E501
        :type client: str
        :param content: The content of this MessagesBase.  # noqa: E501
        :type content: str
        :param content_type: The content_type of this MessagesBase.  # noqa: E501
        :type content_type: str
        :param display_recipient: The display_recipient of this MessagesBase.  # noqa: E501
        :type display_recipient: OneOfstringarray
        :param id: The id of this MessagesBase.  # noqa: E501
        :type id: int
        :param is_me_message: The is_me_message of this MessagesBase.  # noqa: E501
        :type is_me_message: bool
        :param reactions: The reactions of this MessagesBase.  # noqa: E501
        :type reactions: List[EmojiReaction]
        :param recipient_id: The recipient_id of this MessagesBase.  # noqa: E501
        :type recipient_id: int
        :param sender_email: The sender_email of this MessagesBase.  # noqa: E501
        :type sender_email: str
        :param sender_full_name: The sender_full_name of this MessagesBase.  # noqa: E501
        :type sender_full_name: str
        :param sender_id: The sender_id of this MessagesBase.  # noqa: E501
        :type sender_id: int
        :param sender_realm_str: The sender_realm_str of this MessagesBase.  # noqa: E501
        :type sender_realm_str: str
        :param stream_id: The stream_id of this MessagesBase.  # noqa: E501
        :type stream_id: int
        :param subject: The subject of this MessagesBase.  # noqa: E501
        :type subject: str
        :param topic_links: The topic_links of this MessagesBase.  # noqa: E501
        :type topic_links: List[MessagesBaseTopicLinks]
        :param submessages: The submessages of this MessagesBase.  # noqa: E501
        :type submessages: List[str]
        :param timestamp: The timestamp of this MessagesBase.  # noqa: E501
        :type timestamp: int
        :param type: The type of this MessagesBase.  # noqa: E501
        :type type: str
        """
        self.swagger_types = {
            'avatar_url': str,
            'client': str,
            'content': str,
            'content_type': str,
            'display_recipient': OneOfstringarray,
            'id': int,
            'is_me_message': bool,
            'reactions': List[EmojiReaction],
            'recipient_id': int,
            'sender_email': str,
            'sender_full_name': str,
            'sender_id': int,
            'sender_realm_str': str,
            'stream_id': int,
            'subject': str,
            'topic_links': List[MessagesBaseTopicLinks],
            'submessages': List[str],
            'timestamp': int,
            'type': str
        }

        self.attribute_map = {
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

        self._avatar_url = avatar_url
        self._client = client
        self._content = content
        self._content_type = content_type
        self._display_recipient = display_recipient
        self._id = id
        self._is_me_message = is_me_message
        self._reactions = reactions
        self._recipient_id = recipient_id
        self._sender_email = sender_email
        self._sender_full_name = sender_full_name
        self._sender_id = sender_id
        self._sender_realm_str = sender_realm_str
        self._stream_id = stream_id
        self._subject = subject
        self._topic_links = topic_links
        self._submessages = submessages
        self._timestamp = timestamp
        self._type = type

    @classmethod
    def from_dict(cls, dikt) -> 'MessagesBase':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The MessagesBase of this MessagesBase.  # noqa: E501
        :rtype: MessagesBase
        """
        return util.deserialize_model(dikt, cls)

    @property
    def avatar_url(self) -> str:
        """Gets the avatar_url of this MessagesBase.

        The URL of the user's avatar.  Can be null only if client_gravatar was passed, which means that the user has not uploaded an avatar in Zulip, and the client should compute the gravatar URL by hashing the user's email address itself for this user.   # noqa: E501

        :return: The avatar_url of this MessagesBase.
        :rtype: str
        """
        return self._avatar_url

    @avatar_url.setter
    def avatar_url(self, avatar_url: str):
        """Sets the avatar_url of this MessagesBase.

        The URL of the user's avatar.  Can be null only if client_gravatar was passed, which means that the user has not uploaded an avatar in Zulip, and the client should compute the gravatar URL by hashing the user's email address itself for this user.   # noqa: E501

        :param avatar_url: The avatar_url of this MessagesBase.
        :type avatar_url: str
        """

        self._avatar_url = avatar_url

    @property
    def client(self) -> str:
        """Gets the client of this MessagesBase.

        A Zulip \"client\" string, describing what Zulip client sent the message.   # noqa: E501

        :return: The client of this MessagesBase.
        :rtype: str
        """
        return self._client

    @client.setter
    def client(self, client: str):
        """Sets the client of this MessagesBase.

        A Zulip \"client\" string, describing what Zulip client sent the message.   # noqa: E501

        :param client: The client of this MessagesBase.
        :type client: str
        """

        self._client = client

    @property
    def content(self) -> str:
        """Gets the content of this MessagesBase.

        The content/body of the message.   # noqa: E501

        :return: The content of this MessagesBase.
        :rtype: str
        """
        return self._content

    @content.setter
    def content(self, content: str):
        """Sets the content of this MessagesBase.

        The content/body of the message.   # noqa: E501

        :param content: The content of this MessagesBase.
        :type content: str
        """

        self._content = content

    @property
    def content_type(self) -> str:
        """Gets the content_type of this MessagesBase.

        The HTTP `content_type` for the message content.  This will be `text/html` or `text/x-markdown`, depending on whether `apply_markdown` was set.   # noqa: E501

        :return: The content_type of this MessagesBase.
        :rtype: str
        """
        return self._content_type

    @content_type.setter
    def content_type(self, content_type: str):
        """Sets the content_type of this MessagesBase.

        The HTTP `content_type` for the message content.  This will be `text/html` or `text/x-markdown`, depending on whether `apply_markdown` was set.   # noqa: E501

        :param content_type: The content_type of this MessagesBase.
        :type content_type: str
        """

        self._content_type = content_type

    @property
    def display_recipient(self) -> OneOfstringarray:
        """Gets the display_recipient of this MessagesBase.

        Data on the recipient of the message; either the name of a stream or a dictionary containing basic data on the users who received the message.   # noqa: E501

        :return: The display_recipient of this MessagesBase.
        :rtype: OneOfstringarray
        """
        return self._display_recipient

    @display_recipient.setter
    def display_recipient(self, display_recipient: OneOfstringarray):
        """Sets the display_recipient of this MessagesBase.

        Data on the recipient of the message; either the name of a stream or a dictionary containing basic data on the users who received the message.   # noqa: E501

        :param display_recipient: The display_recipient of this MessagesBase.
        :type display_recipient: OneOfstringarray
        """

        self._display_recipient = display_recipient

    @property
    def id(self) -> int:
        """Gets the id of this MessagesBase.

        The unique message ID.  Messages should always be displayed sorted by ID.   # noqa: E501

        :return: The id of this MessagesBase.
        :rtype: int
        """
        return self._id

    @id.setter
    def id(self, id: int):
        """Sets the id of this MessagesBase.

        The unique message ID.  Messages should always be displayed sorted by ID.   # noqa: E501

        :param id: The id of this MessagesBase.
        :type id: int
        """

        self._id = id

    @property
    def is_me_message(self) -> bool:
        """Gets the is_me_message of this MessagesBase.

        Whether the message is a [/me status message][status-messages]  [status-messages]: /help/format-your-message-using-markdown#status-messages   # noqa: E501

        :return: The is_me_message of this MessagesBase.
        :rtype: bool
        """
        return self._is_me_message

    @is_me_message.setter
    def is_me_message(self, is_me_message: bool):
        """Sets the is_me_message of this MessagesBase.

        Whether the message is a [/me status message][status-messages]  [status-messages]: /help/format-your-message-using-markdown#status-messages   # noqa: E501

        :param is_me_message: The is_me_message of this MessagesBase.
        :type is_me_message: bool
        """

        self._is_me_message = is_me_message

    @property
    def reactions(self) -> List[EmojiReaction]:
        """Gets the reactions of this MessagesBase.

        Data on any reactions to the message.   # noqa: E501

        :return: The reactions of this MessagesBase.
        :rtype: List[EmojiReaction]
        """
        return self._reactions

    @reactions.setter
    def reactions(self, reactions: List[EmojiReaction]):
        """Sets the reactions of this MessagesBase.

        Data on any reactions to the message.   # noqa: E501

        :param reactions: The reactions of this MessagesBase.
        :type reactions: List[EmojiReaction]
        """

        self._reactions = reactions

    @property
    def recipient_id(self) -> int:
        """Gets the recipient_id of this MessagesBase.

        A unique ID for the set of users receiving the message (either a stream or group of users).  Useful primarily for hashing.   # noqa: E501

        :return: The recipient_id of this MessagesBase.
        :rtype: int
        """
        return self._recipient_id

    @recipient_id.setter
    def recipient_id(self, recipient_id: int):
        """Sets the recipient_id of this MessagesBase.

        A unique ID for the set of users receiving the message (either a stream or group of users).  Useful primarily for hashing.   # noqa: E501

        :param recipient_id: The recipient_id of this MessagesBase.
        :type recipient_id: int
        """

        self._recipient_id = recipient_id

    @property
    def sender_email(self) -> str:
        """Gets the sender_email of this MessagesBase.

        The Zulip display email address of the message's sender.   # noqa: E501

        :return: The sender_email of this MessagesBase.
        :rtype: str
        """
        return self._sender_email

    @sender_email.setter
    def sender_email(self, sender_email: str):
        """Sets the sender_email of this MessagesBase.

        The Zulip display email address of the message's sender.   # noqa: E501

        :param sender_email: The sender_email of this MessagesBase.
        :type sender_email: str
        """

        self._sender_email = sender_email

    @property
    def sender_full_name(self) -> str:
        """Gets the sender_full_name of this MessagesBase.

        The full name of the message's sender.   # noqa: E501

        :return: The sender_full_name of this MessagesBase.
        :rtype: str
        """
        return self._sender_full_name

    @sender_full_name.setter
    def sender_full_name(self, sender_full_name: str):
        """Sets the sender_full_name of this MessagesBase.

        The full name of the message's sender.   # noqa: E501

        :param sender_full_name: The sender_full_name of this MessagesBase.
        :type sender_full_name: str
        """

        self._sender_full_name = sender_full_name

    @property
    def sender_id(self) -> int:
        """Gets the sender_id of this MessagesBase.

        The user ID of the message's sender.   # noqa: E501

        :return: The sender_id of this MessagesBase.
        :rtype: int
        """
        return self._sender_id

    @sender_id.setter
    def sender_id(self, sender_id: int):
        """Sets the sender_id of this MessagesBase.

        The user ID of the message's sender.   # noqa: E501

        :param sender_id: The sender_id of this MessagesBase.
        :type sender_id: int
        """

        self._sender_id = sender_id

    @property
    def sender_realm_str(self) -> str:
        """Gets the sender_realm_str of this MessagesBase.

        A string identifier for the realm the sender is in.  Unique only within the context of a given Zulip server.  E.g. on `example.zulip.com`, this will be `example`.   # noqa: E501

        :return: The sender_realm_str of this MessagesBase.
        :rtype: str
        """
        return self._sender_realm_str

    @sender_realm_str.setter
    def sender_realm_str(self, sender_realm_str: str):
        """Sets the sender_realm_str of this MessagesBase.

        A string identifier for the realm the sender is in.  Unique only within the context of a given Zulip server.  E.g. on `example.zulip.com`, this will be `example`.   # noqa: E501

        :param sender_realm_str: The sender_realm_str of this MessagesBase.
        :type sender_realm_str: str
        """

        self._sender_realm_str = sender_realm_str

    @property
    def stream_id(self) -> int:
        """Gets the stream_id of this MessagesBase.

        Only present for stream messages; the ID of the stream.   # noqa: E501

        :return: The stream_id of this MessagesBase.
        :rtype: int
        """
        return self._stream_id

    @stream_id.setter
    def stream_id(self, stream_id: int):
        """Sets the stream_id of this MessagesBase.

        Only present for stream messages; the ID of the stream.   # noqa: E501

        :param stream_id: The stream_id of this MessagesBase.
        :type stream_id: int
        """

        self._stream_id = stream_id

    @property
    def subject(self) -> str:
        """Gets the subject of this MessagesBase.

        The `topic` of the message.  Currently always `\"\"` for private messages, though this could change if Zulip adds support for topics in private message conversations.  The field name is a legacy holdover from when topics were called \"subjects\" and will eventually change.   # noqa: E501

        :return: The subject of this MessagesBase.
        :rtype: str
        """
        return self._subject

    @subject.setter
    def subject(self, subject: str):
        """Sets the subject of this MessagesBase.

        The `topic` of the message.  Currently always `\"\"` for private messages, though this could change if Zulip adds support for topics in private message conversations.  The field name is a legacy holdover from when topics were called \"subjects\" and will eventually change.   # noqa: E501

        :param subject: The subject of this MessagesBase.
        :type subject: str
        """

        self._subject = subject

    @property
    def topic_links(self) -> List[MessagesBaseTopicLinks]:
        """Gets the topic_links of this MessagesBase.

        Data on any links to be included in the `topic` line (these are generated by [custom linkification filters](/help/add-a-custom-linkifier) that match content in the message's topic.)  **Changes**: This field contained a list of urls before   Zulip 4.0 (feature level 46).  New in Zulip 3.0 (feature level 1): Previously, this field was called `subject_links`; clients are recommended to rename `subject_links` to `topic_links` if present for compatibility with older Zulip servers.   # noqa: E501

        :return: The topic_links of this MessagesBase.
        :rtype: List[MessagesBaseTopicLinks]
        """
        return self._topic_links

    @topic_links.setter
    def topic_links(self, topic_links: List[MessagesBaseTopicLinks]):
        """Sets the topic_links of this MessagesBase.

        Data on any links to be included in the `topic` line (these are generated by [custom linkification filters](/help/add-a-custom-linkifier) that match content in the message's topic.)  **Changes**: This field contained a list of urls before   Zulip 4.0 (feature level 46).  New in Zulip 3.0 (feature level 1): Previously, this field was called `subject_links`; clients are recommended to rename `subject_links` to `topic_links` if present for compatibility with older Zulip servers.   # noqa: E501

        :param topic_links: The topic_links of this MessagesBase.
        :type topic_links: List[MessagesBaseTopicLinks]
        """

        self._topic_links = topic_links

    @property
    def submessages(self) -> List[str]:
        """Gets the submessages of this MessagesBase.

        Data used for certain experimental Zulip integrations.   # noqa: E501

        :return: The submessages of this MessagesBase.
        :rtype: List[str]
        """
        return self._submessages

    @submessages.setter
    def submessages(self, submessages: List[str]):
        """Sets the submessages of this MessagesBase.

        Data used for certain experimental Zulip integrations.   # noqa: E501

        :param submessages: The submessages of this MessagesBase.
        :type submessages: List[str]
        """

        self._submessages = submessages

    @property
    def timestamp(self) -> int:
        """Gets the timestamp of this MessagesBase.

        The UNIX timestamp for when the message was sent, in UTC seconds.   # noqa: E501

        :return: The timestamp of this MessagesBase.
        :rtype: int
        """
        return self._timestamp

    @timestamp.setter
    def timestamp(self, timestamp: int):
        """Sets the timestamp of this MessagesBase.

        The UNIX timestamp for when the message was sent, in UTC seconds.   # noqa: E501

        :param timestamp: The timestamp of this MessagesBase.
        :type timestamp: int
        """

        self._timestamp = timestamp

    @property
    def type(self) -> str:
        """Gets the type of this MessagesBase.

        The type of the message: `stream` or `private`.   # noqa: E501

        :return: The type of this MessagesBase.
        :rtype: str
        """
        return self._type

    @type.setter
    def type(self, type: str):
        """Sets the type of this MessagesBase.

        The type of the message: `stream` or `private`.   # noqa: E501

        :param type: The type of this MessagesBase.
        :type type: str
        """

        self._type = type
