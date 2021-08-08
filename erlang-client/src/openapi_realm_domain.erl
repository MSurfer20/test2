-module(openapi_realm_domain).

-export([encode/1]).

-export_type([openapi_realm_domain/0]).

-type openapi_realm_domain() ::
    #{ 'domain' => binary(),
       'allow_subdomains' => boolean()
     }.

encode(#{ 'domain' := Domain,
          'allow_subdomains' := AllowSubdomains
        }) ->
    #{ 'domain' => Domain,
       'allow_subdomains' => AllowSubdomains
     }.
