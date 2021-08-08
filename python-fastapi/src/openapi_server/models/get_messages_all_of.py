# coding: utf-8

from __future__ import annotations
from datetime import date, datetime  # noqa: F401

import re  # noqa: F401
from typing import Any, Dict, List, Optional  # noqa: F401

from pydantic import AnyUrl, BaseModel, EmailStr, validator  # noqa: F401


class GetMessagesAllOf(BaseModel):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.

    GetMessagesAllOf - a model defined in OpenAPI

        avatar_url: The avatar_url of this GetMessagesAllOf [Optional].
        client: The client of this GetMessagesAllOf [Optional].
        content: The content of this GetMessagesAllOf [Optional].
        content_type: The content_type of this GetMessagesAllOf [Optional].
        display_recipient: The display_recipient of this GetMessagesAllOf [Optional].
        id: The id of this GetMessagesAllOf [Optional].
        is_me_message: The is_me_message of this GetMessagesAllOf [Optional].
        reactions: The reactions of this GetMessagesAllOf [Optional].
        recipient_id: The recipient_id of this GetMessagesAllOf [Optional].
        sender_email: The sender_email of this GetMessagesAllOf [Optional].
        sender_full_name: The sender_full_name of this GetMessagesAllOf [Optional].
        sender_id: The sender_id of this GetMessagesAllOf [Optional].
        sender_realm_str: The sender_realm_str of this GetMessagesAllOf [Optional].
        stream_id: The stream_id of this GetMessagesAllOf [Optional].
        subject: The subject of this GetMessagesAllOf [Optional].
        topic_links: The topic_links of this GetMessagesAllOf [Optional].
        submessages: The submessages of this GetMessagesAllOf [Optional].
        timestamp: The timestamp of this GetMessagesAllOf [Optional].
        type: The type of this GetMessagesAllOf [Optional].
        flags: The flags of this GetMessagesAllOf [Optional].
        last_edit_timestamp: The last_edit_timestamp of this GetMessagesAllOf [Optional].
        match_content: The match_content of this GetMessagesAllOf [Optional].
        match_subject: The match_subject of this GetMessagesAllOf [Optional].
    """

    avatar_url: Optional[object] = None
    client: Optional[object] = None
    content: Optional[object] = None
    content_type: Optional[object] = None
    display_recipient: Optional[object] = None
    id: Optional[object] = None
    is_me_message: Optional[object] = None
    reactions: Optional[object] = None
    recipient_id: Optional[object] = None
    sender_email: Optional[object] = None
    sender_full_name: Optional[object] = None
    sender_id: Optional[object] = None
    sender_realm_str: Optional[object] = None
    stream_id: Optional[object] = None
    subject: Optional[object] = None
    topic_links: Optional[object] = None
    submessages: Optional[object] = None
    timestamp: Optional[object] = None
    type: Optional[object] = None
    flags: Optional[List[str]] = None
    last_edit_timestamp: Optional[int] = None
    match_content: Optional[str] = None
    match_subject: Optional[str] = None

GetMessagesAllOf.update_forward_refs()
