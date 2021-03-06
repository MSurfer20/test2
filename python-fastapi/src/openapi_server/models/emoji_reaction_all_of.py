# coding: utf-8

from __future__ import annotations
from datetime import date, datetime  # noqa: F401

import re  # noqa: F401
from typing import Any, Dict, List, Optional  # noqa: F401

from pydantic import AnyUrl, BaseModel, EmailStr, validator  # noqa: F401


class EmojiReactionAllOf(BaseModel):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.

    EmojiReactionAllOf - a model defined in OpenAPI

        emoji_code: The emoji_code of this EmojiReactionAllOf [Optional].
        emoji_name: The emoji_name of this EmojiReactionAllOf [Optional].
        reaction_type: The reaction_type of this EmojiReactionAllOf [Optional].
        user_id: The user_id of this EmojiReactionAllOf [Optional].
        user: The user of this EmojiReactionAllOf [Optional].
    """

    emoji_code: Optional[object] = None
    emoji_name: Optional[object] = None
    reaction_type: Optional[object] = None
    user_id: Optional[object] = None
    user: Optional[object] = None

EmojiReactionAllOf.update_forward_refs()
