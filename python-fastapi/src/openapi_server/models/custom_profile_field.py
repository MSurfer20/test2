# coding: utf-8

from __future__ import annotations
from datetime import date, datetime  # noqa: F401

import re  # noqa: F401
from typing import Any, Dict, List, Optional  # noqa: F401

from pydantic import AnyUrl, BaseModel, EmailStr, validator  # noqa: F401


class CustomProfileField(BaseModel):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.

    CustomProfileField - a model defined in OpenAPI

        id: The id of this CustomProfileField [Optional].
        type: The type of this CustomProfileField [Optional].
        order: The order of this CustomProfileField [Optional].
        name: The name of this CustomProfileField [Optional].
        hint: The hint of this CustomProfileField [Optional].
        field_data: The field_data of this CustomProfileField [Optional].
    """

    id: Optional[int] = None
    type: Optional[int] = None
    order: Optional[int] = None
    name: Optional[str] = None
    hint: Optional[str] = None
    field_data: Optional[str] = None

CustomProfileField.update_forward_refs()
