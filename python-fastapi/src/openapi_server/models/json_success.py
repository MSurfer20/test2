# coding: utf-8

from __future__ import annotations
from datetime import date, datetime  # noqa: F401

import re  # noqa: F401
from typing import Any, Dict, List, Optional  # noqa: F401

from pydantic import AnyUrl, BaseModel, EmailStr, validator  # noqa: F401
from openapi_server.models.json_success_all_of import JsonSuccessAllOf
from openapi_server.models.json_success_base import JsonSuccessBase


class JsonSuccess(BaseModel):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.

    JsonSuccess - a model defined in OpenAPI

        result: The result of this JsonSuccess.
        msg: The msg of this JsonSuccess.
    """

    result: object
    msg: object

JsonSuccess.update_forward_refs()
