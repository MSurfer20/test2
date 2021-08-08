# coding: utf-8

from datetime import date, datetime

from typing import List, Dict, Type

from openapi_server.models.base_model_ import Model
from openapi_server.models.add_subscriptions_response_all_of import AddSubscriptionsResponseAllOf
from openapi_server.models.json_success_base import JsonSuccessBase
from openapi_server import util


class AddSubscriptionsResponse(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, result: object=None, msg: object=None, subscribed: Dict[str, List[str]]=None, already_subscribed: Dict[str, List[str]]=None, unauthorized: List[str]=None):
        """AddSubscriptionsResponse - a model defined in OpenAPI

        :param result: The result of this AddSubscriptionsResponse.
        :param msg: The msg of this AddSubscriptionsResponse.
        :param subscribed: The subscribed of this AddSubscriptionsResponse.
        :param already_subscribed: The already_subscribed of this AddSubscriptionsResponse.
        :param unauthorized: The unauthorized of this AddSubscriptionsResponse.
        """
        self.openapi_types = {
            'result': object,
            'msg': object,
            'subscribed': Dict[str, List[str]],
            'already_subscribed': Dict[str, List[str]],
            'unauthorized': List[str]
        }

        self.attribute_map = {
            'result': 'result',
            'msg': 'msg',
            'subscribed': 'subscribed',
            'already_subscribed': 'already_subscribed',
            'unauthorized': 'unauthorized'
        }

        self._result = result
        self._msg = msg
        self._subscribed = subscribed
        self._already_subscribed = already_subscribed
        self._unauthorized = unauthorized

    @classmethod
    def from_dict(cls, dikt: dict) -> 'AddSubscriptionsResponse':
        """Returns the dict as a model

        :param dikt: A dict.
        :return: The AddSubscriptionsResponse of this AddSubscriptionsResponse.
        """
        return util.deserialize_model(dikt, cls)

    @property
    def result(self):
        """Gets the result of this AddSubscriptionsResponse.


        :return: The result of this AddSubscriptionsResponse.
        :rtype: object
        """
        return self._result

    @result.setter
    def result(self, result):
        """Sets the result of this AddSubscriptionsResponse.


        :param result: The result of this AddSubscriptionsResponse.
        :type result: object
        """
        if result is None:
            raise ValueError("Invalid value for `result`, must not be `None`")

        self._result = result

    @property
    def msg(self):
        """Gets the msg of this AddSubscriptionsResponse.


        :return: The msg of this AddSubscriptionsResponse.
        :rtype: object
        """
        return self._msg

    @msg.setter
    def msg(self, msg):
        """Sets the msg of this AddSubscriptionsResponse.


        :param msg: The msg of this AddSubscriptionsResponse.
        :type msg: object
        """
        if msg is None:
            raise ValueError("Invalid value for `msg`, must not be `None`")

        self._msg = msg

    @property
    def subscribed(self):
        """Gets the subscribed of this AddSubscriptionsResponse.

        A dictionary where the key is the email address of the user/bot and the value is a list of the names of the streams that were subscribed to as a result of the query. 

        :return: The subscribed of this AddSubscriptionsResponse.
        :rtype: Dict[str, List[str]]
        """
        return self._subscribed

    @subscribed.setter
    def subscribed(self, subscribed):
        """Sets the subscribed of this AddSubscriptionsResponse.

        A dictionary where the key is the email address of the user/bot and the value is a list of the names of the streams that were subscribed to as a result of the query. 

        :param subscribed: The subscribed of this AddSubscriptionsResponse.
        :type subscribed: Dict[str, List[str]]
        """

        self._subscribed = subscribed

    @property
    def already_subscribed(self):
        """Gets the already_subscribed of this AddSubscriptionsResponse.

        A dictionary where the key is the email address of the user/bot and the value is a list of the names of the streams that the user/bot is already subscribed to. 

        :return: The already_subscribed of this AddSubscriptionsResponse.
        :rtype: Dict[str, List[str]]
        """
        return self._already_subscribed

    @already_subscribed.setter
    def already_subscribed(self, already_subscribed):
        """Sets the already_subscribed of this AddSubscriptionsResponse.

        A dictionary where the key is the email address of the user/bot and the value is a list of the names of the streams that the user/bot is already subscribed to. 

        :param already_subscribed: The already_subscribed of this AddSubscriptionsResponse.
        :type already_subscribed: Dict[str, List[str]]
        """

        self._already_subscribed = already_subscribed

    @property
    def unauthorized(self):
        """Gets the unauthorized of this AddSubscriptionsResponse.

        A list of names of streams that the requesting user/bot was not authorized to subscribe to.  Only present if `authorization_errors_fatal=false`. 

        :return: The unauthorized of this AddSubscriptionsResponse.
        :rtype: List[str]
        """
        return self._unauthorized

    @unauthorized.setter
    def unauthorized(self, unauthorized):
        """Sets the unauthorized of this AddSubscriptionsResponse.

        A list of names of streams that the requesting user/bot was not authorized to subscribe to.  Only present if `authorization_errors_fatal=false`. 

        :param unauthorized: The unauthorized of this AddSubscriptionsResponse.
        :type unauthorized: List[str]
        """

        self._unauthorized = unauthorized