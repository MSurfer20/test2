# coding: utf-8

from __future__ import annotations
from datetime import date, datetime  # noqa: F401

import re  # noqa: F401
from typing import Any, Dict, List, Optional  # noqa: F401

from pydantic import AnyUrl, BaseModel, EmailStr, validator  # noqa: F401
from openapi_server.models.add_subscriptions_response_all_of import AddSubscriptionsResponseAllOf
from openapi_server.models.json_success_base import JsonSuccessBase


class AddSubscriptionsResponse(BaseModel):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.

    AddSubscriptionsResponse - a model defined in OpenAPI

        result: The result of this AddSubscriptionsResponse.
        msg: The msg of this AddSubscriptionsResponse.
        subscribed: The subscribed of this AddSubscriptionsResponse [Optional].
        already_subscribed: The already_subscribed of this AddSubscriptionsResponse [Optional].
        unauthorized: The unauthorized of this AddSubscriptionsResponse [Optional].
    """

    result: object
    msg: object
    subscribed: Optional[Dict[str, List[str]]] = None
    already_subscribed: Optional[Dict[str, List[str]]] = None
    unauthorized: Optional[List[str]] = None

AddSubscriptionsResponse.update_forward_refs()