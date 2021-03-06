=begin comment

Zulip REST API

Powerful open source group chat 

The version of the OpenAPI document: 1.0.0

Generated by: https://openapi-generator.tech

=end comment

=cut

#
# NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
# Do not edit the class manually.
# Ref: https://openapi-generator.tech
#
package WWW::OpenAPIClient::AuthenticationApi;

require 5.6.0;
use strict;
use warnings;
use utf8; 
use Exporter;
use Carp qw( croak );
use Log::Any qw($log);

use WWW::OpenAPIClient::ApiClient;

use base "Class::Data::Inheritable";

__PACKAGE__->mk_classdata('method_documentation' => {});

sub new {
    my $class = shift;
    my $api_client;

    if ($_[0] && ref $_[0] && ref $_[0] eq 'WWW::OpenAPIClient::ApiClient' ) {
        $api_client = $_[0];
    } else {
        $api_client = WWW::OpenAPIClient::ApiClient->new(@_);
    }

    bless { api_client => $api_client }, $class;

}


#
# dev_fetch_api_key
#
# Fetch an API key (development only)
# 
# @param string $username The email address for the user that owns the API key.  (required)
{
    my $params = {
    'username' => {
        data_type => 'string',
        description => 'The email address for the user that owns the API key. ',
        required => '1',
    },
    };
    __PACKAGE__->method_documentation->{ 'dev_fetch_api_key' } = { 
        summary => 'Fetch an API key (development only)',
        params => $params,
        returns => 'ApiKeyResponse',
        };
}
# @return ApiKeyResponse
#
sub dev_fetch_api_key {
    my ($self, %args) = @_;

    # verify the required parameter 'username' is set
    unless (exists $args{'username'}) {
      croak("Missing the required parameter 'username' when calling dev_fetch_api_key");
    }

    # parse inputs
    my $_resource_path = '/dev_fetch_api_key';

    my $_method = 'POST';
    my $query_params = {};
    my $header_params = {};
    my $form_params = {};

    # 'Accept' and 'Content-Type' header
    my $_header_accept = $self->{api_client}->select_header_accept('application/json');
    if ($_header_accept) {
        $header_params->{'Accept'} = $_header_accept;
    }
    $header_params->{'Content-Type'} = $self->{api_client}->select_header_content_type();

    # query params
    if ( exists $args{'username'}) {
        $query_params->{'username'} = $self->{api_client}->to_query_value($args{'username'});
    }

    my $_body_data;
    # authentication setting, if any
    my $auth_settings = [qw()];

    # make the API Call
    my $response = $self->{api_client}->call_api($_resource_path, $_method,
                                           $query_params, $form_params,
                                           $header_params, $_body_data, $auth_settings);
    if (!$response) {
        return;
    }
    my $_response_object = $self->{api_client}->deserialize('ApiKeyResponse', $response);
    return $_response_object;
}

#
# fetch_api_key
#
# Fetch an API key (production)
# 
# @param string $username The username to be used for authentication (typically, the email address, but depending on configuration, it could be an LDAP username).  See the &#x60;require_email_format_usernames&#x60; parameter documented in [GET /server_settings](/api/get-server-settings) for details.  (required)
# @param string $password The user&#39;s Zulip password (or LDAP password, if LDAP authentication is in use).  (required)
{
    my $params = {
    'username' => {
        data_type => 'string',
        description => 'The username to be used for authentication (typically, the email address, but depending on configuration, it could be an LDAP username).  See the &#x60;require_email_format_usernames&#x60; parameter documented in [GET /server_settings](/api/get-server-settings) for details. ',
        required => '1',
    },
    'password' => {
        data_type => 'string',
        description => 'The user&#39;s Zulip password (or LDAP password, if LDAP authentication is in use). ',
        required => '1',
    },
    };
    __PACKAGE__->method_documentation->{ 'fetch_api_key' } = { 
        summary => 'Fetch an API key (production)',
        params => $params,
        returns => 'ApiKeyResponse',
        };
}
# @return ApiKeyResponse
#
sub fetch_api_key {
    my ($self, %args) = @_;

    # verify the required parameter 'username' is set
    unless (exists $args{'username'}) {
      croak("Missing the required parameter 'username' when calling fetch_api_key");
    }

    # verify the required parameter 'password' is set
    unless (exists $args{'password'}) {
      croak("Missing the required parameter 'password' when calling fetch_api_key");
    }

    # parse inputs
    my $_resource_path = '/fetch_api_key';

    my $_method = 'POST';
    my $query_params = {};
    my $header_params = {};
    my $form_params = {};

    # 'Accept' and 'Content-Type' header
    my $_header_accept = $self->{api_client}->select_header_accept('application/json');
    if ($_header_accept) {
        $header_params->{'Accept'} = $_header_accept;
    }
    $header_params->{'Content-Type'} = $self->{api_client}->select_header_content_type();

    # query params
    if ( exists $args{'username'}) {
        $query_params->{'username'} = $self->{api_client}->to_query_value($args{'username'});
    }

    # query params
    if ( exists $args{'password'}) {
        $query_params->{'password'} = $self->{api_client}->to_query_value($args{'password'});
    }

    my $_body_data;
    # authentication setting, if any
    my $auth_settings = [qw()];

    # make the API Call
    my $response = $self->{api_client}->call_api($_resource_path, $_method,
                                           $query_params, $form_params,
                                           $header_params, $_body_data, $auth_settings);
    if (!$response) {
        return;
    }
    my $_response_object = $self->{api_client}->deserialize('ApiKeyResponse', $response);
    return $_response_object;
}

1;
