-module(openapi_api_key_response_all_of).

-export([encode/1]).

-export_type([openapi_api_key_response_all_of/0]).

-type openapi_api_key_response_all_of() ::
    #{ 'result' => openapi_any_type:openapi_any_type(),
       'msg' => openapi_any_type:openapi_any_type(),
       'api_key' := binary(),
       'email' := binary()
     }.

encode(#{ 'result' := Result,
          'msg' := Msg,
          'api_key' := ApiKey,
          'email' := Email
        }) ->
    #{ 'result' => Result,
       'msg' => Msg,
       'api_key' => ApiKey,
       'email' => Email
     }.
