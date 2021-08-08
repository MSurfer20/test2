# coding: utf-8

from __future__ import annotations
from datetime import date, datetime  # noqa: F401

import re  # noqa: F401
from typing import Any, Dict, List, Optional  # noqa: F401

from pydantic import AnyUrl, BaseModel, EmailStr, validator  # noqa: F401
from openapi_server.models.coded_error_all_of import CodedErrorAllOf
from openapi_server.models.coded_error_base import CodedErrorBase


class CodedError(BaseModel):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.

    CodedError - a model defined in OpenAPI

        result: The result of this CodedError.
        msg: The msg of this CodedError.
        code: The code of this CodedError [Optional].
    """

    result: object
    msg: object
    code: Optional[object] = None

CodedError.update_forward_refs()
