# coding: utf-8

from __future__ import annotations
from datetime import date, datetime  # noqa: F401

import re  # noqa: F401
from typing import Any, Dict, List, Optional  # noqa: F401

from pydantic import AnyUrl, BaseModel, EmailStr, validator  # noqa: F401
from openapi_server.models.coded_error import CodedError


class RateLimitedError(BaseModel):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.

    RateLimitedError - a model defined in OpenAPI

        result: The result of this RateLimitedError.
        msg: The msg of this RateLimitedError.
        code: The code of this RateLimitedError [Optional].
    """

    result: object
    msg: object
    code: Optional[object] = None

RateLimitedError.update_forward_refs()
