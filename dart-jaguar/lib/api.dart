library openapi.api;

import 'package:http/http.dart' as http;
import 'package:jaguar_serializer/jaguar_serializer.dart';
import 'package:jaguar_retrofit/jaguar_retrofit.dart';
import 'package:openapi/auth/api_key_auth.dart';
import 'package:openapi/auth/basic_auth.dart';
import 'package:openapi/auth/oauth.dart';
import 'package:jaguar_mimetype/jaguar_mimetype.dart';

import 'package:openapi/api/authentication_api.dart';
import 'package:openapi/api/drafts_api.dart';
import 'package:openapi/api/messages_api.dart';
import 'package:openapi/api/real_time_events_api.dart';
import 'package:openapi/api/server_and_organizations_api.dart';
import 'package:openapi/api/streams_api.dart';
import 'package:openapi/api/users_api.dart';
import 'package:openapi/api/webhooks_api.dart';

import 'package:openapi/model/add_subscriptions_response.dart';
import 'package:openapi/model/add_subscriptions_response_all_of.dart';
import 'package:openapi/model/api_key_response.dart';
import 'package:openapi/model/api_key_response_all_of.dart';
import 'package:openapi/model/attachments.dart';
import 'package:openapi/model/attachments_messages.dart';
import 'package:openapi/model/bad_event_queue_id_error.dart';
import 'package:openapi/model/bad_event_queue_id_error_all_of.dart';
import 'package:openapi/model/basic_bot.dart';
import 'package:openapi/model/basic_bot_all_of.dart';
import 'package:openapi/model/basic_bot_base.dart';
import 'package:openapi/model/basic_stream.dart';
import 'package:openapi/model/basic_stream_all_of.dart';
import 'package:openapi/model/basic_stream_base.dart';
import 'package:openapi/model/bot.dart';
import 'package:openapi/model/bot_all_of.dart';
import 'package:openapi/model/coded_error.dart';
import 'package:openapi/model/coded_error_all_of.dart';
import 'package:openapi/model/coded_error_base.dart';
import 'package:openapi/model/coded_error_base_all_of.dart';
import 'package:openapi/model/custom_profile_field.dart';
import 'package:openapi/model/default_stream_group.dart';
import 'package:openapi/model/draft.dart';
import 'package:openapi/model/emoji_base.dart';
import 'package:openapi/model/emoji_reaction.dart';
import 'package:openapi/model/emoji_reaction_all_of.dart';
import 'package:openapi/model/emoji_reaction_base.dart';
import 'package:openapi/model/emoji_reaction_base_all_of.dart';
import 'package:openapi/model/emoji_reaction_base_all_of_user.dart';
import 'package:openapi/model/get_messages.dart';
import 'package:openapi/model/get_messages_all_of.dart';
import 'package:openapi/model/hotspot.dart';
import 'package:openapi/model/inline_response200.dart';
import 'package:openapi/model/invalid_api_key_error.dart';
import 'package:openapi/model/invalid_message_error.dart';
import 'package:openapi/model/invalid_message_error_all_of.dart';
import 'package:openapi/model/json_error.dart';
import 'package:openapi/model/json_error_base.dart';
import 'package:openapi/model/json_error_base_all_of.dart';
import 'package:openapi/model/json_response_base.dart';
import 'package:openapi/model/json_success.dart';
import 'package:openapi/model/json_success_all_of.dart';
import 'package:openapi/model/json_success_base.dart';
import 'package:openapi/model/json_success_base_all_of.dart';
import 'package:openapi/model/messages.dart';
import 'package:openapi/model/messages_all_of.dart';
import 'package:openapi/model/messages_base.dart';
import 'package:openapi/model/messages_base_topic_links.dart';
import 'package:openapi/model/missing_argument_error.dart';
import 'package:openapi/model/missing_argument_error_all_of.dart';
import 'package:openapi/model/non_existing_stream_error.dart';
import 'package:openapi/model/non_existing_stream_error_all_of.dart';
import 'package:openapi/model/presence.dart';
import 'package:openapi/model/rate_limited_error.dart';
import 'package:openapi/model/realm_deactivated_error.dart';
import 'package:openapi/model/realm_domain.dart';
import 'package:openapi/model/realm_emoji.dart';
import 'package:openapi/model/realm_export.dart';
import 'package:openapi/model/realm_playground.dart';
import 'package:openapi/model/subscriptions.dart';
import 'package:openapi/model/user.dart';
import 'package:openapi/model/user_all_of.dart';
import 'package:openapi/model/user_base.dart';
import 'package:openapi/model/user_deactivated_error.dart';
import 'package:openapi/model/user_group.dart';
import 'package:openapi/model/user_not_authorized_error.dart';



final _jsonJaguarRepo = JsonRepo()
..add(AddSubscriptionsResponseSerializer())
..add(AddSubscriptionsResponseAllOfSerializer())
..add(ApiKeyResponseSerializer())
..add(ApiKeyResponseAllOfSerializer())
..add(AttachmentsSerializer())
..add(AttachmentsMessagesSerializer())
..add(BadEventQueueIdErrorSerializer())
..add(BadEventQueueIdErrorAllOfSerializer())
..add(BasicBotSerializer())
..add(BasicBotAllOfSerializer())
..add(BasicBotBaseSerializer())
..add(BasicStreamSerializer())
..add(BasicStreamAllOfSerializer())
..add(BasicStreamBaseSerializer())
..add(BotSerializer())
..add(BotAllOfSerializer())
..add(CodedErrorSerializer())
..add(CodedErrorAllOfSerializer())
..add(CodedErrorBaseSerializer())
..add(CodedErrorBaseAllOfSerializer())
..add(CustomProfileFieldSerializer())
..add(DefaultStreamGroupSerializer())
..add(DraftSerializer())
..add(EmojiBaseSerializer())
..add(EmojiReactionSerializer())
..add(EmojiReactionAllOfSerializer())
..add(EmojiReactionBaseSerializer())
..add(EmojiReactionBaseAllOfSerializer())
..add(EmojiReactionBaseAllOfUserSerializer())
..add(GetMessagesSerializer())
..add(GetMessagesAllOfSerializer())
..add(HotspotSerializer())
..add(InlineResponse200Serializer())
..add(InvalidApiKeyErrorSerializer())
..add(InvalidMessageErrorSerializer())
..add(InvalidMessageErrorAllOfSerializer())
..add(JsonErrorSerializer())
..add(JsonErrorBaseSerializer())
..add(JsonErrorBaseAllOfSerializer())
..add(JsonResponseBaseSerializer())
..add(JsonSuccessSerializer())
..add(JsonSuccessAllOfSerializer())
..add(JsonSuccessBaseSerializer())
..add(JsonSuccessBaseAllOfSerializer())
..add(MessagesSerializer())
..add(MessagesAllOfSerializer())
..add(MessagesBaseSerializer())
..add(MessagesBaseTopicLinksSerializer())
..add(MissingArgumentErrorSerializer())
..add(MissingArgumentErrorAllOfSerializer())
..add(NonExistingStreamErrorSerializer())
..add(NonExistingStreamErrorAllOfSerializer())
..add(PresenceSerializer())
..add(RateLimitedErrorSerializer())
..add(RealmDeactivatedErrorSerializer())
..add(RealmDomainSerializer())
..add(RealmEmojiSerializer())
..add(RealmExportSerializer())
..add(RealmPlaygroundSerializer())
..add(SubscriptionsSerializer())
..add(UserSerializer())
..add(UserAllOfSerializer())
..add(UserBaseSerializer())
..add(UserDeactivatedErrorSerializer())
..add(UserGroupSerializer())
..add(UserNotAuthorizedErrorSerializer())
;
final Map<String, CodecRepo> defaultConverters = {
    MimeTypes.json: _jsonJaguarRepo,
};



final _defaultInterceptors = [OAuthInterceptor(), BasicAuthInterceptor(), ApiKeyAuthInterceptor()];

class Openapi {
    List<Interceptor> interceptors;
    String basePath = "https://example.zulipchat.com/api/v1";
    Route _baseRoute;
    final Duration timeout;

    /**
    * Add custom global interceptors, put overrideInterceptors to true to set your interceptors only (auth interceptors will not be added)
    */
    Openapi({List<Interceptor> interceptors, bool overrideInterceptors = false, String baseUrl, this.timeout = const Duration(minutes: 2)}) {
        _baseRoute = Route(baseUrl ?? basePath).withClient(globalClient ?? http.Client());
        if(interceptors == null) {
            this.interceptors = _defaultInterceptors;
        }
        else if(overrideInterceptors){
            this.interceptors = interceptors;
        }
        else {
            this.interceptors = List.from(_defaultInterceptors)..addAll(interceptors);
        }

        this.interceptors.forEach((interceptor) {
            _baseRoute.before(interceptor.before);
            _baseRoute.after(interceptor.after);
        });
    }

    void setOAuthToken(String name, String token) {
        (_defaultInterceptors[0] as OAuthInterceptor).tokens[name] = token;
    }

    void setBasicAuth(String name, String username, String password) {
        (_defaultInterceptors[1] as BasicAuthInterceptor).authInfo[name] = BasicAuthInfo(username, password);
    }

    void setApiKey(String name, String apiKey) {
        (_defaultInterceptors[2] as ApiKeyAuthInterceptor).apiKeys[name] = apiKey;
    }

    
    /**
    * Get AuthenticationApi instance, base route and serializer can be overridden by a given but be careful,
    * by doing that all interceptors will not be executed
    */
    AuthenticationApi getAuthenticationApi({Route base, Map<String, CodecRepo> converters}) {
        if(base == null) {
            base = _baseRoute;
        }
        if(converters == null) {
            converters = defaultConverters;
        }
        return AuthenticationApi(base: base, converters: converters, timeout: timeout);
    }

    
    /**
    * Get DraftsApi instance, base route and serializer can be overridden by a given but be careful,
    * by doing that all interceptors will not be executed
    */
    DraftsApi getDraftsApi({Route base, Map<String, CodecRepo> converters}) {
        if(base == null) {
            base = _baseRoute;
        }
        if(converters == null) {
            converters = defaultConverters;
        }
        return DraftsApi(base: base, converters: converters, timeout: timeout);
    }

    
    /**
    * Get MessagesApi instance, base route and serializer can be overridden by a given but be careful,
    * by doing that all interceptors will not be executed
    */
    MessagesApi getMessagesApi({Route base, Map<String, CodecRepo> converters}) {
        if(base == null) {
            base = _baseRoute;
        }
        if(converters == null) {
            converters = defaultConverters;
        }
        return MessagesApi(base: base, converters: converters, timeout: timeout);
    }

    
    /**
    * Get RealTimeEventsApi instance, base route and serializer can be overridden by a given but be careful,
    * by doing that all interceptors will not be executed
    */
    RealTimeEventsApi getRealTimeEventsApi({Route base, Map<String, CodecRepo> converters}) {
        if(base == null) {
            base = _baseRoute;
        }
        if(converters == null) {
            converters = defaultConverters;
        }
        return RealTimeEventsApi(base: base, converters: converters, timeout: timeout);
    }

    
    /**
    * Get ServerAndOrganizationsApi instance, base route and serializer can be overridden by a given but be careful,
    * by doing that all interceptors will not be executed
    */
    ServerAndOrganizationsApi getServerAndOrganizationsApi({Route base, Map<String, CodecRepo> converters}) {
        if(base == null) {
            base = _baseRoute;
        }
        if(converters == null) {
            converters = defaultConverters;
        }
        return ServerAndOrganizationsApi(base: base, converters: converters, timeout: timeout);
    }

    
    /**
    * Get StreamsApi instance, base route and serializer can be overridden by a given but be careful,
    * by doing that all interceptors will not be executed
    */
    StreamsApi getStreamsApi({Route base, Map<String, CodecRepo> converters}) {
        if(base == null) {
            base = _baseRoute;
        }
        if(converters == null) {
            converters = defaultConverters;
        }
        return StreamsApi(base: base, converters: converters, timeout: timeout);
    }

    
    /**
    * Get UsersApi instance, base route and serializer can be overridden by a given but be careful,
    * by doing that all interceptors will not be executed
    */
    UsersApi getUsersApi({Route base, Map<String, CodecRepo> converters}) {
        if(base == null) {
            base = _baseRoute;
        }
        if(converters == null) {
            converters = defaultConverters;
        }
        return UsersApi(base: base, converters: converters, timeout: timeout);
    }

    
    /**
    * Get WebhooksApi instance, base route and serializer can be overridden by a given but be careful,
    * by doing that all interceptors will not be executed
    */
    WebhooksApi getWebhooksApi({Route base, Map<String, CodecRepo> converters}) {
        if(base == null) {
            base = _baseRoute;
        }
        if(converters == null) {
            converters = defaultConverters;
        }
        return WebhooksApi(base: base, converters: converters, timeout: timeout);
    }

    
}
