-module(openapi_api).

-export([ zulip_outgoing_webhooks/0
        ]).

-define(BASE_URL, "/api/v1").

%% @doc Outgoing webhooks
%% Outgoing webhooks allows to build or set up Zulip integrations which are notified when certain types of messages are sent in Zulip. 
-spec zulip_outgoing_webhooks() ->
  openapi_utils:response().
zulip_outgoing_webhooks() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/zulip-outgoing-webhook"],
  Body        = [],
  ContentType = "text/plain",

  openapi_utils:request(Method, [Host, ?BASE_URL, Path], jsx:encode(Body), ContentType).

