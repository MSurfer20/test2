# coding: utf-8

from __future__ import annotations
from datetime import date, datetime  # noqa: F401

import re  # noqa: F401
from typing import Any, Dict, List, Optional  # noqa: F401

from pydantic import AnyUrl, BaseModel, EmailStr, validator  # noqa: F401


class RealmExport(BaseModel):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.

    RealmExport - a model defined in OpenAPI

        id: The id of this RealmExport [Optional].
        acting_user_id: The acting_user_id of this RealmExport [Optional].
        export_time: The export_time of this RealmExport [Optional].
        deleted_timestamp: The deleted_timestamp of this RealmExport [Optional].
        failed_timestamp: The failed_timestamp of this RealmExport [Optional].
        export_url: The export_url of this RealmExport [Optional].
        pending: The pending of this RealmExport [Optional].
    """

    id: Optional[int] = None
    acting_user_id: Optional[int] = None
    export_time: Optional[float] = None
    deleted_timestamp: Optional[float] = None
    failed_timestamp: Optional[float] = None
    export_url: Optional[str] = None
    pending: Optional[bool] = None

RealmExport.update_forward_refs()