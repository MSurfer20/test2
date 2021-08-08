# coding: utf-8

from typing import Dict, List  # noqa: F401

from fastapi import (  # noqa: F401
    APIRouter,
    Body,
    Cookie,
    Depends,
    Form,
    Header,
    Path,
    Query,
    Response,
    Security,
    status,
)

from openapi_server.models.extra_models import TokenModel  # noqa: F401
from openapi_server.models.api_key_response import ApiKeyResponse


router = APIRouter()


@router.post(
    "/dev_fetch_api_key",
    responses={
        200: {"model": ApiKeyResponse, "description": "Success."},
    },
    tags=["authentication"],
    summary="Fetch an API key (development only)",
)
async def dev_fetch_api_key(
    username: str = Query(None, description="The email address for the user that owns the API key. "),
) -> ApiKeyResponse:
    """For easy testing of mobile apps and other clients and against Zulip development servers, we support fetching a Zulip API key for any user on the development server without authentication (so that they can implement analogues of the one-click login process available for Zulip development servers on the web).  **Note:** This endpoint is only available on Zulip development servers; for obvious security reasons it will always return an error in a Zulip production server.  &#x60;POST {{ api_url }}/v1/dev_fetch_api_key&#x60; """
    ...


@router.post(
    "/fetch_api_key",
    responses={
        200: {"model": ApiKeyResponse, "description": "Valid credentials the client can use to access the Zulip API."},
    },
    tags=["authentication"],
    summary="Fetch an API key (production)",
)
async def fetch_api_key(
    username: str = Query(None, description="The username to be used for authentication (typically, the email address, but depending on configuration, it could be an LDAP username).  See the &#x60;require_email_format_usernames&#x60; parameter documented in [GET /server_settings](/api/get-server-settings) for details. "),
    password: str = Query(None, description="The user&#39;s Zulip password (or LDAP password, if LDAP authentication is in use). "),
) -> ApiKeyResponse:
    """This API endpoint is used by clients such as the Zulip mobile and terminal apps to implement password-based authentication.  Given the user&#39;s Zulip login credentials, it returns a Zulip API key that the client can use to make requests requests as the user.  This endpoint is only useful for Zulip servers/organizations with EmailAuthBackend or LDAPAuthBackend enabled.  The Zulip mobile apps also support SSO/social authentication (GitHub auth, Google auth, SAML, etc.) that does not use this endpoint.  Instead, the mobile apps reuse the web login flow passing the &#x60;mobile_flow_otp&#x60; in a webview, and the credentials are returned to the app (encrypted) via a redirect to a &#x60;zulip://&#x60; URL.  !!! warn \&quot;\&quot;     **Note:** If you signed up using passwordless authentication and     never had a password, you can [reset your password](/help/change-your-password).      See the [API keys](/api/api-keys) documentation for     more details on how to download API key manually.  In a [Zulip development environment](https://zulip.readthedocs.io/en/latest/development/overview.html), see also [the unauthenticated variant](/api/dev-fetch-api-key). """
    ...
