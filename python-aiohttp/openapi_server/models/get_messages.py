# coding: utf-8

from datetime import date, datetime

from typing import List, Dict, Type

from openapi_server.models.base_model_ import Model
from openapi_server.models.get_messages_all_of import GetMessagesAllOf
from openapi_server.models.messages_base import MessagesBase
from openapi_server import util


class GetMessages(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, avatar_url: object=None, client: object=None, content: object=None, content_type: object=None, display_recipient: object=None, id: object=None, is_me_message: object=None, reactions: object=None, recipient_id: object=None, sender_email: object=None, sender_full_name: object=None, sender_id: object=None, sender_realm_str: object=None, stream_id: object=None, subject: object=None, topic_links: object=None, submessages: object=None, timestamp: object=None, type: object=None, flags: List[str]=None, last_edit_timestamp: int=None, match_content: str=None, match_subject: str=None):
        """GetMessages - a model defined in OpenAPI

        :param avatar_url: The avatar_url of this GetMessages.
        :param client: The client of this GetMessages.
        :param content: The content of this GetMessages.
        :param content_type: The content_type of this GetMessages.
        :param display_recipient: The display_recipient of this GetMessages.
        :param id: The id of this GetMessages.
        :param is_me_message: The is_me_message of this GetMessages.
        :param reactions: The reactions of this GetMessages.
        :param recipient_id: The recipient_id of this GetMessages.
        :param sender_email: The sender_email of this GetMessages.
        :param sender_full_name: The sender_full_name of this GetMessages.
        :param sender_id: The sender_id of this GetMessages.
        :param sender_realm_str: The sender_realm_str of this GetMessages.
        :param stream_id: The stream_id of this GetMessages.
        :param subject: The subject of this GetMessages.
        :param topic_links: The topic_links of this GetMessages.
        :param submessages: The submessages of this GetMessages.
        :param timestamp: The timestamp of this GetMessages.
        :param type: The type of this GetMessages.
        :param flags: The flags of this GetMessages.
        :param last_edit_timestamp: The last_edit_timestamp of this GetMessages.
        :param match_content: The match_content of this GetMessages.
        :param match_subject: The match_subject of this GetMessages.
        """
        self.openapi_types = {
            'avatar_url': object,
            'client': object,
            'content': object,
            'content_type': object,
            'display_recipient': object,
            'id': object,
            'is_me_message': object,
            'reactions': object,
            'recipient_id': object,
            'sender_email': object,
            'sender_full_name': object,
            'sender_id': object,
            'sender_realm_str': object,
            'stream_id': object,
            'subject': object,
            'topic_links': object,
            'submessages': object,
            'timestamp': object,
            'type': object,
            'flags': List[str],
            'last_edit_timestamp': int,
            'match_content': str,
            'match_subject': str
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
            'type': 'type',
            'flags': 'flags',
            'last_edit_timestamp': 'last_edit_timestamp',
            'match_content': 'match_content',
            'match_subject': 'match_subject'
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
        self._flags = flags
        self._last_edit_timestamp = last_edit_timestamp
        self._match_content = match_content
        self._match_subject = match_subject

    @classmethod
    def from_dict(cls, dikt: dict) -> 'GetMessages':
        """Returns the dict as a model

        :param dikt: A dict.
        :return: The GetMessages of this GetMessages.
        """
        return util.deserialize_model(dikt, cls)

    @property
    def avatar_url(self):
        """Gets the avatar_url of this GetMessages.


        :return: The avatar_url of this GetMessages.
        :rtype: object
        """
        return self._avatar_url

    @avatar_url.setter
    def avatar_url(self, avatar_url):
        """Sets the avatar_url of this GetMessages.


        :param avatar_url: The avatar_url of this GetMessages.
        :type avatar_url: object
        """

        self._avatar_url = avatar_url

    @property
    def client(self):
        """Gets the client of this GetMessages.


        :return: The client of this GetMessages.
        :rtype: object
        """
        return self._client

    @client.setter
    def client(self, client):
        """Sets the client of this GetMessages.


        :param client: The client of this GetMessages.
        :type client: object
        """

        self._client = client

    @property
    def content(self):
        """Gets the content of this GetMessages.


        :return: The content of this GetMessages.
        :rtype: object
        """
        return self._content

    @content.setter
    def content(self, content):
        """Sets the content of this GetMessages.


        :param content: The content of this GetMessages.
        :type content: object
        """

        self._content = content

    @property
    def content_type(self):
        """Gets the content_type of this GetMessages.


        :return: The content_type of this GetMessages.
        :rtype: object
        """
        return self._content_type

    @content_type.setter
    def content_type(self, content_type):
        """Sets the content_type of this GetMessages.


        :param content_type: The content_type of this GetMessages.
        :type content_type: object
        """

        self._content_type = content_type

    @property
    def display_recipient(self):
        """Gets the display_recipient of this GetMessages.


        :return: The display_recipient of this GetMessages.
        :rtype: object
        """
        return self._display_recipient

    @display_recipient.setter
    def display_recipient(self, display_recipient):
        """Sets the display_recipient of this GetMessages.


        :param display_recipient: The display_recipient of this GetMessages.
        :type display_recipient: object
        """

        self._display_recipient = display_recipient

    @property
    def id(self):
        """Gets the id of this GetMessages.


        :return: The id of this GetMessages.
        :rtype: object
        """
        return self._id

    @id.setter
    def id(self, id):
        """Sets the id of this GetMessages.


        :param id: The id of this GetMessages.
        :type id: object
        """

        self._id = id

    @property
    def is_me_message(self):
        """Gets the is_me_message of this GetMessages.


        :return: The is_me_message of this GetMessages.
        :rtype: object
        """
        return self._is_me_message

    @is_me_message.setter
    def is_me_message(self, is_me_message):
        """Sets the is_me_message of this GetMessages.


        :param is_me_message: The is_me_message of this GetMessages.
        :type is_me_message: object
        """

        self._is_me_message = is_me_message

    @property
    def reactions(self):
        """Gets the reactions of this GetMessages.


        :return: The reactions of this GetMessages.
        :rtype: object
        """
        return self._reactions

    @reactions.setter
    def reactions(self, reactions):
        """Sets the reactions of this GetMessages.


        :param reactions: The reactions of this GetMessages.
        :type reactions: object
        """

        self._reactions = reactions

    @property
    def recipient_id(self):
        """Gets the recipient_id of this GetMessages.


        :return: The recipient_id of this GetMessages.
        :rtype: object
        """
        return self._recipient_id

    @recipient_id.setter
    def recipient_id(self, recipient_id):
        """Sets the recipient_id of this GetMessages.


        :param recipient_id: The recipient_id of this GetMessages.
        :type recipient_id: object
        """

        self._recipient_id = recipient_id

    @property
    def sender_email(self):
        """Gets the sender_email of this GetMessages.


        :return: The sender_email of this GetMessages.
        :rtype: object
        """
        return self._sender_email

    @sender_email.setter
    def sender_email(self, sender_email):
        """Sets the sender_email of this GetMessages.


        :param sender_email: The sender_email of this GetMessages.
        :type sender_email: object
        """

        self._sender_email = sender_email

    @property
    def sender_full_name(self):
        """Gets the sender_full_name of this GetMessages.


        :return: The sender_full_name of this GetMessages.
        :rtype: object
        """
        return self._sender_full_name

    @sender_full_name.setter
    def sender_full_name(self, sender_full_name):
        """Sets the sender_full_name of this GetMessages.


        :param sender_full_name: The sender_full_name of this GetMessages.
        :type sender_full_name: object
        """

        self._sender_full_name = sender_full_name

    @property
    def sender_id(self):
        """Gets the sender_id of this GetMessages.


        :return: The sender_id of this GetMessages.
        :rtype: object
        """
        return self._sender_id

    @sender_id.setter
    def sender_id(self, sender_id):
        """Sets the sender_id of this GetMessages.


        :param sender_id: The sender_id of this GetMessages.
        :type sender_id: object
        """

        self._sender_id = sender_id

    @property
    def sender_realm_str(self):
        """Gets the sender_realm_str of this GetMessages.


        :return: The sender_realm_str of this GetMessages.
        :rtype: object
        """
        return self._sender_realm_str

    @sender_realm_str.setter
    def sender_realm_str(self, sender_realm_str):
        """Sets the sender_realm_str of this GetMessages.


        :param sender_realm_str: The sender_realm_str of this GetMessages.
        :type sender_realm_str: object
        """

        self._sender_realm_str = sender_realm_str

    @property
    def stream_id(self):
        """Gets the stream_id of this GetMessages.


        :return: The stream_id of this GetMessages.
        :rtype: object
        """
        return self._stream_id

    @stream_id.setter
    def stream_id(self, stream_id):
        """Sets the stream_id of this GetMessages.


        :param stream_id: The stream_id of this GetMessages.
        :type stream_id: object
        """

        self._stream_id = stream_id

    @property
    def subject(self):
        """Gets the subject of this GetMessages.


        :return: The subject of this GetMessages.
        :rtype: object
        """
        return self._subject

    @subject.setter
    def subject(self, subject):
        """Sets the subject of this GetMessages.


        :param subject: The subject of this GetMessages.
        :type subject: object
        """

        self._subject = subject

    @property
    def topic_links(self):
        """Gets the topic_links of this GetMessages.


        :return: The topic_links of this GetMessages.
        :rtype: object
        """
        return self._topic_links

    @topic_links.setter
    def topic_links(self, topic_links):
        """Sets the topic_links of this GetMessages.


        :param topic_links: The topic_links of this GetMessages.
        :type topic_links: object
        """

        self._topic_links = topic_links

    @property
    def submessages(self):
        """Gets the submessages of this GetMessages.


        :return: The submessages of this GetMessages.
        :rtype: object
        """
        return self._submessages

    @submessages.setter
    def submessages(self, submessages):
        """Sets the submessages of this GetMessages.


        :param submessages: The submessages of this GetMessages.
        :type submessages: object
        """

        self._submessages = submessages

    @property
    def timestamp(self):
        """Gets the timestamp of this GetMessages.


        :return: The timestamp of this GetMessages.
        :rtype: object
        """
        return self._timestamp

    @timestamp.setter
    def timestamp(self, timestamp):
        """Sets the timestamp of this GetMessages.


        :param timestamp: The timestamp of this GetMessages.
        :type timestamp: object
        """

        self._timestamp = timestamp

    @property
    def type(self):
        """Gets the type of this GetMessages.


        :return: The type of this GetMessages.
        :rtype: object
        """
        return self._type

    @type.setter
    def type(self, type):
        """Sets the type of this GetMessages.


        :param type: The type of this GetMessages.
        :type type: object
        """

        self._type = type

    @property
    def flags(self):
        """Gets the flags of this GetMessages.

        The user's [message flags][message-flags] for the message.  [message-flags]: /api/update-message-flags#available-flags 

        :return: The flags of this GetMessages.
        :rtype: List[str]
        """
        return self._flags

    @flags.setter
    def flags(self, flags):
        """Sets the flags of this GetMessages.

        The user's [message flags][message-flags] for the message.  [message-flags]: /api/update-message-flags#available-flags 

        :param flags: The flags of this GetMessages.
        :type flags: List[str]
        """

        self._flags = flags

    @property
    def last_edit_timestamp(self):
        """Gets the last_edit_timestamp of this GetMessages.

        The UNIX timestamp for when the message was last edited, in UTC seconds. 

        :return: The last_edit_timestamp of this GetMessages.
        :rtype: int
        """
        return self._last_edit_timestamp

    @last_edit_timestamp.setter
    def last_edit_timestamp(self, last_edit_timestamp):
        """Sets the last_edit_timestamp of this GetMessages.

        The UNIX timestamp for when the message was last edited, in UTC seconds. 

        :param last_edit_timestamp: The last_edit_timestamp of this GetMessages.
        :type last_edit_timestamp: int
        """

        self._last_edit_timestamp = last_edit_timestamp

    @property
    def match_content(self):
        """Gets the match_content of this GetMessages.

        Only present if keyword search was included among the narrow parameters. HTML content of a queried message that matches the narrow, with `<span class=\"highlight\">` elements wrapping the matches for the search keywords. 

        :return: The match_content of this GetMessages.
        :rtype: str
        """
        return self._match_content

    @match_content.setter
    def match_content(self, match_content):
        """Sets the match_content of this GetMessages.

        Only present if keyword search was included among the narrow parameters. HTML content of a queried message that matches the narrow, with `<span class=\"highlight\">` elements wrapping the matches for the search keywords. 

        :param match_content: The match_content of this GetMessages.
        :type match_content: str
        """

        self._match_content = match_content

    @property
    def match_subject(self):
        """Gets the match_subject of this GetMessages.

        Only present if keyword search was included among the narrow parameters. HTML-escaped topic of a queried message that matches the narrow, with `<span class=\"highlight\">` elements wrapping the matches for the search keywords. 

        :return: The match_subject of this GetMessages.
        :rtype: str
        """
        return self._match_subject

    @match_subject.setter
    def match_subject(self, match_subject):
        """Sets the match_subject of this GetMessages.

        Only present if keyword search was included among the narrow parameters. HTML-escaped topic of a queried message that matches the narrow, with `<span class=\"highlight\">` elements wrapping the matches for the search keywords. 

        :param match_subject: The match_subject of this GetMessages.
        :type match_subject: str
        """

        self._match_subject = match_subject