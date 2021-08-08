# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from app.openapi_server.models.base_model_ import Model
from app.openapi_server.models.attachments_messages import AttachmentsMessages  # noqa: F401,E501
from openapi_server import util


class Attachments(Model):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    """

    def __init__(self, id: int=None, name: str=None, path_id: str=None, size: int=None, create_time: int=None, messages: List[AttachmentsMessages]=None):  # noqa: E501
        """Attachments - a model defined in Swagger

        :param id: The id of this Attachments.  # noqa: E501
        :type id: int
        :param name: The name of this Attachments.  # noqa: E501
        :type name: str
        :param path_id: The path_id of this Attachments.  # noqa: E501
        :type path_id: str
        :param size: The size of this Attachments.  # noqa: E501
        :type size: int
        :param create_time: The create_time of this Attachments.  # noqa: E501
        :type create_time: int
        :param messages: The messages of this Attachments.  # noqa: E501
        :type messages: List[AttachmentsMessages]
        """
        self.swagger_types = {
            'id': int,
            'name': str,
            'path_id': str,
            'size': int,
            'create_time': int,
            'messages': List[AttachmentsMessages]
        }

        self.attribute_map = {
            'id': 'id',
            'name': 'name',
            'path_id': 'path_id',
            'size': 'size',
            'create_time': 'create_time',
            'messages': 'messages'
        }

        self._id = id
        self._name = name
        self._path_id = path_id
        self._size = size
        self._create_time = create_time
        self._messages = messages

    @classmethod
    def from_dict(cls, dikt) -> 'Attachments':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The Attachments of this Attachments.  # noqa: E501
        :rtype: Attachments
        """
        return util.deserialize_model(dikt, cls)

    @property
    def id(self) -> int:
        """Gets the id of this Attachments.

        The unique ID for the attachment.   # noqa: E501

        :return: The id of this Attachments.
        :rtype: int
        """
        return self._id

    @id.setter
    def id(self, id: int):
        """Sets the id of this Attachments.

        The unique ID for the attachment.   # noqa: E501

        :param id: The id of this Attachments.
        :type id: int
        """

        self._id = id

    @property
    def name(self) -> str:
        """Gets the name of this Attachments.

        Name of the uploaded file.   # noqa: E501

        :return: The name of this Attachments.
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name: str):
        """Sets the name of this Attachments.

        Name of the uploaded file.   # noqa: E501

        :param name: The name of this Attachments.
        :type name: str
        """

        self._name = name

    @property
    def path_id(self) -> str:
        """Gets the path_id of this Attachments.

        A representation of the path of the file within the repository of user-uploaded files.  If the `path_id` of a file is `{realm_id}/ab/cdef/temp_file.py`, its URL will be: `{server_url}/user_uploads/{realm_id}/ab/cdef/temp_file.py`.   # noqa: E501

        :return: The path_id of this Attachments.
        :rtype: str
        """
        return self._path_id

    @path_id.setter
    def path_id(self, path_id: str):
        """Sets the path_id of this Attachments.

        A representation of the path of the file within the repository of user-uploaded files.  If the `path_id` of a file is `{realm_id}/ab/cdef/temp_file.py`, its URL will be: `{server_url}/user_uploads/{realm_id}/ab/cdef/temp_file.py`.   # noqa: E501

        :param path_id: The path_id of this Attachments.
        :type path_id: str
        """

        self._path_id = path_id

    @property
    def size(self) -> int:
        """Gets the size of this Attachments.

        Size of the file in bytes.   # noqa: E501

        :return: The size of this Attachments.
        :rtype: int
        """
        return self._size

    @size.setter
    def size(self, size: int):
        """Sets the size of this Attachments.

        Size of the file in bytes.   # noqa: E501

        :param size: The size of this Attachments.
        :type size: int
        """

        self._size = size

    @property
    def create_time(self) -> int:
        """Gets the create_time of this Attachments.

        Time when the attachment was uploaded as a UNIX timestamp multiplied by 1000 (matching the format of getTime() in JavaScript).  **Changes**: Changed in Zulip 2.2 (feature level 22).  This field was previously a floating point number.   # noqa: E501

        :return: The create_time of this Attachments.
        :rtype: int
        """
        return self._create_time

    @create_time.setter
    def create_time(self, create_time: int):
        """Sets the create_time of this Attachments.

        Time when the attachment was uploaded as a UNIX timestamp multiplied by 1000 (matching the format of getTime() in JavaScript).  **Changes**: Changed in Zulip 2.2 (feature level 22).  This field was previously a floating point number.   # noqa: E501

        :param create_time: The create_time of this Attachments.
        :type create_time: int
        """

        self._create_time = create_time

    @property
    def messages(self) -> List[AttachmentsMessages]:
        """Gets the messages of this Attachments.

        Contains basic details on any Zulip messages that have been sent referencing this [uploaded file](/api/upload-file). This includes messages sent by any user in the Zulip organization who sent a message containing a link to the uploaded file.   # noqa: E501

        :return: The messages of this Attachments.
        :rtype: List[AttachmentsMessages]
        """
        return self._messages

    @messages.setter
    def messages(self, messages: List[AttachmentsMessages]):
        """Sets the messages of this Attachments.

        Contains basic details on any Zulip messages that have been sent referencing this [uploaded file](/api/upload-file). This includes messages sent by any user in the Zulip organization who sent a message containing a link to the uploaded file.   # noqa: E501

        :param messages: The messages of this Attachments.
        :type messages: List[AttachmentsMessages]
        """

        self._messages = messages
