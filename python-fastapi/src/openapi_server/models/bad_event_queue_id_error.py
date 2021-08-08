# coding: utf-8

from __future__ import annotations
from datetime import date, datetime  # noqa: F401

import re  # noqa: F401
from typing import Any, Dict, List, Optional  # noqa: F401

from pydantic import AnyUrl, BaseModel, EmailStr, validator  # noqa: F401
from openapi_server.models.bad_event_queue_id_error_all_of import BadEventQueueIdErrorAllOf
from openapi_server.models.coded_error_base import CodedErrorBase


class BadEventQueueIdError(BaseModel):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.

    BadEventQueueIdError - a model defined in OpenAPI

        result: The result of this BadEventQueueIdError.
        msg: The msg of this BadEventQueueIdError.
        code: The code of this BadEventQueueIdError [Optional].
        queue_id: The queue_id of this BadEventQueueIdError [Optional].
    """

    result: object
    msg: object
    code: Optional[object] = None
    queue_id: Optional[str] = None

BadEventQueueIdError.update_forward_refs()
