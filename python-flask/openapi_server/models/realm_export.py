# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model_ import Model
from openapi_server import util


class RealmExport(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, id=None, acting_user_id=None, export_time=None, deleted_timestamp=None, failed_timestamp=None, export_url=None, pending=None):  # noqa: E501
        """RealmExport - a model defined in OpenAPI

        :param id: The id of this RealmExport.  # noqa: E501
        :type id: int
        :param acting_user_id: The acting_user_id of this RealmExport.  # noqa: E501
        :type acting_user_id: int
        :param export_time: The export_time of this RealmExport.  # noqa: E501
        :type export_time: float
        :param deleted_timestamp: The deleted_timestamp of this RealmExport.  # noqa: E501
        :type deleted_timestamp: float
        :param failed_timestamp: The failed_timestamp of this RealmExport.  # noqa: E501
        :type failed_timestamp: float
        :param export_url: The export_url of this RealmExport.  # noqa: E501
        :type export_url: str
        :param pending: The pending of this RealmExport.  # noqa: E501
        :type pending: bool
        """
        self.openapi_types = {
            'id': int,
            'acting_user_id': int,
            'export_time': float,
            'deleted_timestamp': float,
            'failed_timestamp': float,
            'export_url': str,
            'pending': bool
        }

        self.attribute_map = {
            'id': 'id',
            'acting_user_id': 'acting_user_id',
            'export_time': 'export_time',
            'deleted_timestamp': 'deleted_timestamp',
            'failed_timestamp': 'failed_timestamp',
            'export_url': 'export_url',
            'pending': 'pending'
        }

        self._id = id
        self._acting_user_id = acting_user_id
        self._export_time = export_time
        self._deleted_timestamp = deleted_timestamp
        self._failed_timestamp = failed_timestamp
        self._export_url = export_url
        self._pending = pending

    @classmethod
    def from_dict(cls, dikt) -> 'RealmExport':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The RealmExport of this RealmExport.  # noqa: E501
        :rtype: RealmExport
        """
        return util.deserialize_model(dikt, cls)

    @property
    def id(self):
        """Gets the id of this RealmExport.

        The id of the export.   # noqa: E501

        :return: The id of this RealmExport.
        :rtype: int
        """
        return self._id

    @id.setter
    def id(self, id):
        """Sets the id of this RealmExport.

        The id of the export.   # noqa: E501

        :param id: The id of this RealmExport.
        :type id: int
        """

        self._id = id

    @property
    def acting_user_id(self):
        """Gets the acting_user_id of this RealmExport.

        The id of the user who did the export.   # noqa: E501

        :return: The acting_user_id of this RealmExport.
        :rtype: int
        """
        return self._acting_user_id

    @acting_user_id.setter
    def acting_user_id(self, acting_user_id):
        """Sets the acting_user_id of this RealmExport.

        The id of the user who did the export.   # noqa: E501

        :param acting_user_id: The acting_user_id of this RealmExport.
        :type acting_user_id: int
        """

        self._acting_user_id = acting_user_id

    @property
    def export_time(self):
        """Gets the export_time of this RealmExport.

        The UNIX timestamp of when the export was made.   # noqa: E501

        :return: The export_time of this RealmExport.
        :rtype: float
        """
        return self._export_time

    @export_time.setter
    def export_time(self, export_time):
        """Sets the export_time of this RealmExport.

        The UNIX timestamp of when the export was made.   # noqa: E501

        :param export_time: The export_time of this RealmExport.
        :type export_time: float
        """

        self._export_time = export_time

    @property
    def deleted_timestamp(self):
        """Gets the deleted_timestamp of this RealmExport.

        The timestamp of when the export was deleted. Null if it wasn't.   # noqa: E501

        :return: The deleted_timestamp of this RealmExport.
        :rtype: float
        """
        return self._deleted_timestamp

    @deleted_timestamp.setter
    def deleted_timestamp(self, deleted_timestamp):
        """Sets the deleted_timestamp of this RealmExport.

        The timestamp of when the export was deleted. Null if it wasn't.   # noqa: E501

        :param deleted_timestamp: The deleted_timestamp of this RealmExport.
        :type deleted_timestamp: float
        """

        self._deleted_timestamp = deleted_timestamp

    @property
    def failed_timestamp(self):
        """Gets the failed_timestamp of this RealmExport.

        The timestamp of when the export failed. Null if it didn't.   # noqa: E501

        :return: The failed_timestamp of this RealmExport.
        :rtype: float
        """
        return self._failed_timestamp

    @failed_timestamp.setter
    def failed_timestamp(self, failed_timestamp):
        """Sets the failed_timestamp of this RealmExport.

        The timestamp of when the export failed. Null if it didn't.   # noqa: E501

        :param failed_timestamp: The failed_timestamp of this RealmExport.
        :type failed_timestamp: float
        """

        self._failed_timestamp = failed_timestamp

    @property
    def export_url(self):
        """Gets the export_url of this RealmExport.

        The URL of the export. `null` if there's no URL.   # noqa: E501

        :return: The export_url of this RealmExport.
        :rtype: str
        """
        return self._export_url

    @export_url.setter
    def export_url(self, export_url):
        """Sets the export_url of this RealmExport.

        The URL of the export. `null` if there's no URL.   # noqa: E501

        :param export_url: The export_url of this RealmExport.
        :type export_url: str
        """

        self._export_url = export_url

    @property
    def pending(self):
        """Gets the pending of this RealmExport.

        Whether the export is pending or not.   # noqa: E501

        :return: The pending of this RealmExport.
        :rtype: bool
        """
        return self._pending

    @pending.setter
    def pending(self, pending):
        """Sets the pending of this RealmExport.

        Whether the export is pending or not.   # noqa: E501

        :param pending: The pending of this RealmExport.
        :type pending: bool
        """

        self._pending = pending
