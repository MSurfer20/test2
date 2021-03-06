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
package WWW::OpenAPIClient::DraftsApi;

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
# create_drafts
#
# Create drafts
# 
# @param ARRAY[Draft] $drafts A JSON-encoded list of containing new draft objects.  (optional)
{
    my $params = {
    'drafts' => {
        data_type => 'ARRAY[Draft]',
        description => 'A JSON-encoded list of containing new draft objects. ',
        required => '0',
    },
    };
    __PACKAGE__->method_documentation->{ 'create_drafts' } = { 
        summary => 'Create drafts',
        params => $params,
        returns => 'JsonSuccess',
        };
}
# @return JsonSuccess
#
sub create_drafts {
    my ($self, %args) = @_;

    # parse inputs
    my $_resource_path = '/drafts';

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
    if ( exists $args{'drafts'}) {
        $query_params->{'drafts'} = $self->{api_client}->to_query_value($args{'drafts'});
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
    my $_response_object = $self->{api_client}->deserialize('JsonSuccess', $response);
    return $_response_object;
}

#
# delete_draft
#
# Delete a draft
# 
# @param int $draft_id The ID of the draft you want to delete.  (required)
{
    my $params = {
    'draft_id' => {
        data_type => 'int',
        description => 'The ID of the draft you want to delete. ',
        required => '1',
    },
    };
    __PACKAGE__->method_documentation->{ 'delete_draft' } = { 
        summary => 'Delete a draft',
        params => $params,
        returns => 'JsonSuccess',
        };
}
# @return JsonSuccess
#
sub delete_draft {
    my ($self, %args) = @_;

    # verify the required parameter 'draft_id' is set
    unless (exists $args{'draft_id'}) {
      croak("Missing the required parameter 'draft_id' when calling delete_draft");
    }

    # parse inputs
    my $_resource_path = '/drafts/{draft_id}';

    my $_method = 'DELETE';
    my $query_params = {};
    my $header_params = {};
    my $form_params = {};

    # 'Accept' and 'Content-Type' header
    my $_header_accept = $self->{api_client}->select_header_accept('application/json');
    if ($_header_accept) {
        $header_params->{'Accept'} = $_header_accept;
    }
    $header_params->{'Content-Type'} = $self->{api_client}->select_header_content_type();

    # path params
    if ( exists $args{'draft_id'}) {
        my $_base_variable = "{" . "draft_id" . "}";
        my $_base_value = $self->{api_client}->to_path_value($args{'draft_id'});
        $_resource_path =~ s/$_base_variable/$_base_value/g;
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
    my $_response_object = $self->{api_client}->deserialize('JsonSuccess', $response);
    return $_response_object;
}

#
# edit_draft
#
# Edit a draft
# 
# @param int $draft_id The ID of the draft to be edited.  (required)
# @param Draft $draft A JSON-encoded object containing a replacement draft object for this ID.  (required)
{
    my $params = {
    'draft_id' => {
        data_type => 'int',
        description => 'The ID of the draft to be edited. ',
        required => '1',
    },
    'draft' => {
        data_type => 'Draft',
        description => 'A JSON-encoded object containing a replacement draft object for this ID. ',
        required => '1',
    },
    };
    __PACKAGE__->method_documentation->{ 'edit_draft' } = { 
        summary => 'Edit a draft',
        params => $params,
        returns => 'JsonSuccess',
        };
}
# @return JsonSuccess
#
sub edit_draft {
    my ($self, %args) = @_;

    # verify the required parameter 'draft_id' is set
    unless (exists $args{'draft_id'}) {
      croak("Missing the required parameter 'draft_id' when calling edit_draft");
    }

    # verify the required parameter 'draft' is set
    unless (exists $args{'draft'}) {
      croak("Missing the required parameter 'draft' when calling edit_draft");
    }

    # parse inputs
    my $_resource_path = '/drafts/{draft_id}';

    my $_method = 'PATCH';
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
    if ( exists $args{'draft'}) {
        $query_params->{'draft'} = $self->{api_client}->to_query_value($args{'draft'});
    }

    # path params
    if ( exists $args{'draft_id'}) {
        my $_base_variable = "{" . "draft_id" . "}";
        my $_base_value = $self->{api_client}->to_path_value($args{'draft_id'});
        $_resource_path =~ s/$_base_variable/$_base_value/g;
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
    my $_response_object = $self->{api_client}->deserialize('JsonSuccess', $response);
    return $_response_object;
}

#
# get_drafts
#
# Get drafts
# 
{
    my $params = {
    };
    __PACKAGE__->method_documentation->{ 'get_drafts' } = { 
        summary => 'Get drafts',
        params => $params,
        returns => 'JsonSuccess',
        };
}
# @return JsonSuccess
#
sub get_drafts {
    my ($self, %args) = @_;

    # parse inputs
    my $_resource_path = '/drafts';

    my $_method = 'GET';
    my $query_params = {};
    my $header_params = {};
    my $form_params = {};

    # 'Accept' and 'Content-Type' header
    my $_header_accept = $self->{api_client}->select_header_accept('application/json');
    if ($_header_accept) {
        $header_params->{'Accept'} = $_header_accept;
    }
    $header_params->{'Content-Type'} = $self->{api_client}->select_header_content_type();

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
    my $_response_object = $self->{api_client}->deserialize('JsonSuccess', $response);
    return $_response_object;
}

1;
