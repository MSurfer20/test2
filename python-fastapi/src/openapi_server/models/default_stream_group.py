# coding: utf-8

from __future__ import annotations
from datetime import date, datetime  # noqa: F401

import re  # noqa: F401
from typing import Any, Dict, List, Optional  # noqa: F401

from pydantic import AnyUrl, BaseModel, EmailStr, validator  # noqa: F401
from openapi_server.models.basic_stream import BasicStream


class DefaultStreamGroup(BaseModel):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.

    DefaultStreamGroup - a model defined in OpenAPI

        name: The name of this DefaultStreamGroup [Optional].
        description: The description of this DefaultStreamGroup [Optional].
        id: The id of this DefaultStreamGroup [Optional].
        streams: The streams of this DefaultStreamGroup [Optional].
    """

    name: Optional[str] = None
    description: Optional[str] = None
    id: Optional[int] = None
    streams: Optional[List[BasicStream]] = None

DefaultStreamGroup.update_forward_refs()
