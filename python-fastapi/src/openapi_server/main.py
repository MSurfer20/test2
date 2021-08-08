# coding: utf-8

"""
    Zulip REST API

    Powerful open source group chat 

    The version of the OpenAPI document: 1.0.0
    Generated by: https://openapi-generator.tech
"""


from fastapi import FastAPI

from openapi_server.apis.authentication_api import router as AuthenticationApiRouter
from openapi_server.apis.messages_api import router as MessagesApiRouter
from openapi_server.apis.real_time_events_api import router as RealTimeEventsApiRouter
from openapi_server.apis.server_and_organizations_api import router as ServerAndOrganizationsApiRouter
from openapi_server.apis.streams_api import router as StreamsApiRouter
from openapi_server.apis.users_api import router as UsersApiRouter
from openapi_server.apis.webhooks_api import router as WebhooksApiRouter

app = FastAPI(
    title="Zulip REST API",
    description="Powerful open source group chat ",
    version="1.0.0",
)

app.include_router(AuthenticationApiRouter)
app.include_router(MessagesApiRouter)
app.include_router(RealTimeEventsApiRouter)
app.include_router(ServerAndOrganizationsApiRouter)
app.include_router(StreamsApiRouter)
app.include_router(UsersApiRouter)
app.include_router(WebhooksApiRouter)
