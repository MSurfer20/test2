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
package WWW::OpenAPIClient::Object::Subscriptions;

require 5.6.0;
use strict;
use warnings;
use utf8;
use JSON qw(decode_json);
use Data::Dumper;
use Module::Runtime qw(use_module);
use Log::Any qw($log);
use Date::Parse;
use DateTime;


use base ("Class::Accessor", "Class::Data::Inheritable");

#
#
#
# NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech). Do not edit the class manually.
# REF: https://openapi-generator.tech
#

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
__PACKAGE__->mk_classdata('attribute_map' => {});
__PACKAGE__->mk_classdata('openapi_types' => {});
__PACKAGE__->mk_classdata('method_documentation' => {}); 
__PACKAGE__->mk_classdata('class_documentation' => {});

# new plain object
sub new { 
    my ($class, %args) = @_; 

    my $self = bless {}, $class;

    $self->init(%args);
    
    return $self;
}

# initialize the object
sub init
{
    my ($self, %args) = @_;

    foreach my $attribute (keys %{$self->attribute_map}) {
        my $args_key = $self->attribute_map->{$attribute};
        $self->$attribute( $args{ $args_key } );
    }
}

# return perl hash
sub to_hash {
    my $self = shift;
    my $_hash = decode_json(JSON->new->convert_blessed->encode($self));

    return $_hash;
}

# used by JSON for serialization
sub TO_JSON { 
    my $self = shift;
    my $_data = {};
    foreach my $_key (keys %{$self->attribute_map}) {
        if (defined $self->{$_key}) {
            $_data->{$self->attribute_map->{$_key}} = $self->{$_key};
        }
    }

    return $_data;
}

# from Perl hashref
sub from_hash {
    my ($self, $hash) = @_;

    # loop through attributes and use openapi_types to deserialize the data
    while ( my ($_key, $_type) = each %{$self->openapi_types} ) {
        my $_json_attribute = $self->attribute_map->{$_key}; 
        if ($_type =~ /^array\[(.+)\]$/i) { # array
            my $_subclass = $1;
            my @_array = ();
            foreach my $_element (@{$hash->{$_json_attribute}}) {
                push @_array, $self->_deserialize($_subclass, $_element);
            }
            $self->{$_key} = \@_array;
        } elsif ($_type =~ /^hash\[string,(.+)\]$/i) { # hash
            my $_subclass = $1;
            my %_hash = ();
            while (my($_key, $_element) = each %{$hash->{$_json_attribute}}) {
                $_hash{$_key} = $self->_deserialize($_subclass, $_element);
            }
            $self->{$_key} = \%_hash;
        } elsif (exists $hash->{$_json_attribute}) { #hash(model), primitive, datetime
            $self->{$_key} = $self->_deserialize($_type, $hash->{$_json_attribute});
        } else {
            $log->debugf("Warning: %s (%s) does not exist in input hash\n", $_key, $_json_attribute);
        }
    }
  
    return $self;
}

# deserialize non-array data
sub _deserialize {
    my ($self, $type, $data) = @_;
    $log->debugf("deserializing %s with %s",Dumper($data), $type);

    if ($type eq 'DateTime') {
        return DateTime->from_epoch(epoch => str2time($data));
    } elsif ( grep( /^$type$/, ('int', 'double', 'string', 'boolean'))) {
        return $data;
    } else { # hash(model)
        my $_instance = eval "WWW::OpenAPIClient::Object::$type->new()";
        return $_instance->from_hash($data);
    }
}



__PACKAGE__->class_documentation({description => '',
                                  class => 'Subscriptions',
                                  required => [], # TODO
}                                 );

__PACKAGE__->method_documentation({
    'stream_id' => {
        datatype => 'int',
        base_name => 'stream_id',
        description => 'The unique ID of a stream. ',
        format => '',
        read_only => '',
            },
    'name' => {
        datatype => 'string',
        base_name => 'name',
        description => 'The name of a stream. ',
        format => '',
        read_only => '',
            },
    'description' => {
        datatype => 'string',
        base_name => 'description',
        description => 'The short description of a stream in text/markdown format, intended to be used to prepopulate UI for editing a stream&#39;s description. ',
        format => '',
        read_only => '',
            },
    'rendered_description' => {
        datatype => 'string',
        base_name => 'rendered_description',
        description => 'A short description of a stream rendered as HTML, intended to be used when displaying the stream description in a UI.  One should use the standard Zulip rendered_markdown CSS when displaying this content so that emoji, LaTeX, and other syntax work correctly.  And any client-side security logic for user-generated message content should be applied when displaying this HTML as though it were the body of a Zulip message. ',
        format => '',
        read_only => '',
            },
    'date_created' => {
        datatype => 'int',
        base_name => 'date_created',
        description => 'The UNIX timestamp for when the stream was created, in UTC seconds.  **Changes**: New in Zulip 4.0 (feature level 30). ',
        format => '',
        read_only => '',
            },
    'invite_only' => {
        datatype => 'boolean',
        base_name => 'invite_only',
        description => 'Specifies whether the stream is private or not. Only people who have been invited can access a private stream. ',
        format => '',
        read_only => '',
            },
    'subscribers' => {
        datatype => 'ARRAY[int]',
        base_name => 'subscribers',
        description => 'A list of user IDs of users who are also subscribed to a given stream. Included only if &#x60;include_subscribers&#x60; is &#x60;true&#x60;. ',
        format => '',
        read_only => '',
            },
    'desktop_notifications' => {
        datatype => 'boolean',
        base_name => 'desktop_notifications',
        description => 'A boolean specifying whether desktop notifications are enabled for the given stream.  A null value means the value of this setting should be inherited from the user-level default setting, enable_stream_desktop_notifications, for this stream. ',
        format => '',
        read_only => '',
            },
    'email_notifications' => {
        datatype => 'boolean',
        base_name => 'email_notifications',
        description => 'A boolean specifying whether email notifications are enabled for the given stream.  A null value means the value of this setting should be inherited from the user-level default setting, enable_stream_email_notifications, for this stream. ',
        format => '',
        read_only => '',
            },
    'wildcard_mentions_notify' => {
        datatype => 'boolean',
        base_name => 'wildcard_mentions_notify',
        description => 'A boolean specifying whether wildcard mentions trigger notifications as though they were personal mentions in this stream.  A null value means the value of this setting should be inherited from the user-level default setting, wildcard_mentions_notify, for this stream. ',
        format => '',
        read_only => '',
            },
    'push_notifications' => {
        datatype => 'boolean',
        base_name => 'push_notifications',
        description => 'A boolean specifying whether push notifications are enabled for the given stream.  A null value means the value of this setting should be inherited from the user-level default setting, enable_stream_push_notifications, for this stream. ',
        format => '',
        read_only => '',
            },
    'audible_notifications' => {
        datatype => 'boolean',
        base_name => 'audible_notifications',
        description => 'A boolean specifying whether audible notifications are enabled for the given stream.  A null value means the value of this setting should be inherited from the user-level default setting, enable_stream_audible_notifications, for this stream. ',
        format => '',
        read_only => '',
            },
    'pin_to_top' => {
        datatype => 'boolean',
        base_name => 'pin_to_top',
        description => 'A boolean specifying whether the given stream has been pinned to the top. ',
        format => '',
        read_only => '',
            },
    'email_address' => {
        datatype => 'string',
        base_name => 'email_address',
        description => 'Email address of the given stream, used for [sending emails to the stream](/help/message-a-stream-by-email). ',
        format => '',
        read_only => '',
            },
    'is_muted' => {
        datatype => 'boolean',
        base_name => 'is_muted',
        description => 'Whether the user has muted the stream. Muted streams do not count towards your total unread count and do not show up in &#x60;All messages&#x60; view (previously known as &#x60;Home&#x60; view).  **Changes**: Prior to Zulip 2.1, this feature was represented by the more confusingly named &#x60;in_home_view&#x60; (with the opposite value, &#x60;in_home_view&#x3D;!is_muted&#x60;). ',
        format => '',
        read_only => '',
            },
    'in_home_view' => {
        datatype => 'boolean',
        base_name => 'in_home_view',
        description => 'Legacy property for if the given stream is muted, with inverted meeting.  **Deprecated**; clients should use is_muted where available. ',
        format => '',
        read_only => '',
            },
    'is_announcement_only' => {
        datatype => 'boolean',
        base_name => 'is_announcement_only',
        description => 'Whether only organization administrators can post to the stream.  **Changes**: Deprecated in Zulip 3.0 (feature level 1), use &#x60;stream_post_policy&#x60; instead. ',
        format => '',
        read_only => '',
            },
    'is_web_public' => {
        datatype => 'boolean',
        base_name => 'is_web_public',
        description => 'Whether the stream has been configured to allow unauthenticated access to its message history from the web. ',
        format => '',
        read_only => '',
            },
    'role' => {
        datatype => 'int',
        base_name => 'role',
        description => 'The user&#39;s role within the stream (distinct from the user&#39;s [organization-level role](/help/roles-and-permissions)). Valid values are:  * 20 &#x3D;&gt; Stream administrator. * 50 &#x3D;&gt; Subscriber.  **Changes**: New in Zulip 4.0 (feature level 31). ',
        format => '',
        read_only => '',
            },
    'color' => {
        datatype => 'string',
        base_name => 'color',
        description => 'The user&#39;s personal color for the stream. ',
        format => '',
        read_only => '',
            },
    'stream_post_policy' => {
        datatype => 'int',
        base_name => 'stream_post_policy',
        description => 'Policy for which users can post messages to the stream.  * 1 &#x3D;&gt; Any user can post. * 2 &#x3D;&gt; Only administrators can post. * 3 &#x3D;&gt; Only full members can post. * 4 &#x3D;&gt; Only moderators can post.  **Changes**: New in Zulip 3.0, replacing the previous &#x60;is_announcement_only&#x60; boolean. ',
        format => '',
        read_only => '',
            },
    'message_retention_days' => {
        datatype => 'int',
        base_name => 'message_retention_days',
        description => 'Number of days that messages sent to this stream will be stored before being automatically deleted by the [message retention policy](/help/message-retention-policy).  There are two special values:  * &#x60;null&#x60;, the default, means the stream will inherit the organization   level setting. * &#x60;-1&#x60; encodes retaining messages in this stream forever.  **Changes**: New in Zulip 3.0 (feature level 17). ',
        format => '',
        read_only => '',
            },
    'history_public_to_subscribers' => {
        datatype => 'boolean',
        base_name => 'history_public_to_subscribers',
        description => 'Whether the history of the stream is public to its subscribers.  Currently always true for public streams (i.e. invite_only&#x3D;False implies history_public_to_subscribers&#x3D;True), but clients should not make that assumption, as we may change that behavior in the future. ',
        format => '',
        read_only => '',
            },
    'first_message_id' => {
        datatype => 'int',
        base_name => 'first_message_id',
        description => 'The id of the first message in the stream.  Intended to help clients determine whether they need to display UI like the \&quot;more topics\&quot; widget that would suggest the stream has older history that can be accessed.  Null is used for streams with no message history. ',
        format => '',
        read_only => '',
            },
    'stream_weekly_traffic' => {
        datatype => 'int',
        base_name => 'stream_weekly_traffic',
        description => 'The average number of messages sent to the stream in recent weeks, rounded to the nearest integer.  Null means the stream was recently created and there is insufficient data to estimate the average traffic. ',
        format => '',
        read_only => '',
            },
});

__PACKAGE__->openapi_types( {
    'stream_id' => 'int',
    'name' => 'string',
    'description' => 'string',
    'rendered_description' => 'string',
    'date_created' => 'int',
    'invite_only' => 'boolean',
    'subscribers' => 'ARRAY[int]',
    'desktop_notifications' => 'boolean',
    'email_notifications' => 'boolean',
    'wildcard_mentions_notify' => 'boolean',
    'push_notifications' => 'boolean',
    'audible_notifications' => 'boolean',
    'pin_to_top' => 'boolean',
    'email_address' => 'string',
    'is_muted' => 'boolean',
    'in_home_view' => 'boolean',
    'is_announcement_only' => 'boolean',
    'is_web_public' => 'boolean',
    'role' => 'int',
    'color' => 'string',
    'stream_post_policy' => 'int',
    'message_retention_days' => 'int',
    'history_public_to_subscribers' => 'boolean',
    'first_message_id' => 'int',
    'stream_weekly_traffic' => 'int'
} );

__PACKAGE__->attribute_map( {
    'stream_id' => 'stream_id',
    'name' => 'name',
    'description' => 'description',
    'rendered_description' => 'rendered_description',
    'date_created' => 'date_created',
    'invite_only' => 'invite_only',
    'subscribers' => 'subscribers',
    'desktop_notifications' => 'desktop_notifications',
    'email_notifications' => 'email_notifications',
    'wildcard_mentions_notify' => 'wildcard_mentions_notify',
    'push_notifications' => 'push_notifications',
    'audible_notifications' => 'audible_notifications',
    'pin_to_top' => 'pin_to_top',
    'email_address' => 'email_address',
    'is_muted' => 'is_muted',
    'in_home_view' => 'in_home_view',
    'is_announcement_only' => 'is_announcement_only',
    'is_web_public' => 'is_web_public',
    'role' => 'role',
    'color' => 'color',
    'stream_post_policy' => 'stream_post_policy',
    'message_retention_days' => 'message_retention_days',
    'history_public_to_subscribers' => 'history_public_to_subscribers',
    'first_message_id' => 'first_message_id',
    'stream_weekly_traffic' => 'stream_weekly_traffic'
} );

__PACKAGE__->mk_accessors(keys %{__PACKAGE__->attribute_map});


1;
