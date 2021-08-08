# coding: utf-8

from __future__ import annotations
from datetime import date, datetime  # noqa: F401

import re  # noqa: F401
from typing import Any, Dict, List, Optional  # noqa: F401

from pydantic import AnyUrl, BaseModel, EmailStr, validator  # noqa: F401


class JsonSuccessBaseAllOf(BaseModel):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.

    JsonSuccessBaseAllOf - a model defined in OpenAPI

        result: The result of this JsonSuccessBaseAllOf.
        msg: The msg of this JsonSuccessBaseAllOf.
    """

    result: str
    msg: str

JsonSuccessBaseAllOf.update_forward_refs()
