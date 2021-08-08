//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.7

// ignore_for_file: unused_import

library openapi.api;

import 'package:dio/dio.dart';
import 'package:built_value/serializer.dart';
import 'package:openapi/serializers.dart';
import 'package:openapi/auth/api_key_auth.dart';
import 'package:openapi/auth/basic_auth.dart';
import 'package:openapi/auth/oauth.dart';
import 'package:openapi/api/authentication_api.dart';
import 'package:openapi/api/drafts_api.dart';
import 'package:openapi/api/messages_api.dart';
import 'package:openapi/api/real_time_events_api.dart';
import 'package:openapi/api/server_and_organizations_api.dart';
import 'package:openapi/api/streams_api.dart';
import 'package:openapi/api/users_api.dart';
import 'package:openapi/api/webhooks_api.dart';


final _defaultInterceptors = [
  OAuthInterceptor(),
  BasicAuthInterceptor(),
  ApiKeyAuthInterceptor(),
];

class Openapi {

    static const String basePath = r'https://example.zulipchat.com/api/v1';

    final Dio dio;

    final Serializers serializers;

    Openapi({
      Dio dio,
      Serializers serializers,
      String basePathOverride,
      List<Interceptor> interceptors,
    })  : this.serializers = serializers ?? standardSerializers,
          this.dio = dio ??
              Dio(BaseOptions(
                baseUrl: basePathOverride ?? basePath,
                connectTimeout: 5000,
                receiveTimeout: 3000,
              )) {
      if (interceptors == null) {
        this.dio.interceptors.addAll(_defaultInterceptors);
      } else {
        this.dio.interceptors.addAll(interceptors);
      }
    }

    void setOAuthToken(String name, String token) {
        (this.dio.interceptors.firstWhere((element) => element is OAuthInterceptor, orElse: null) as OAuthInterceptor)?.tokens[name] = token;
    }

    void setBasicAuth(String name, String username, String password) {
        (this.dio.interceptors.firstWhere((element) => element is BasicAuthInterceptor, orElse: null) as BasicAuthInterceptor)?.authInfo[name] = BasicAuthInfo(username, password);
    }

    void setApiKey(String name, String apiKey) {
        (this.dio.interceptors.firstWhere((element) => element is ApiKeyAuthInterceptor, orElse: null) as ApiKeyAuthInterceptor)?.apiKeys[name] = apiKey;
    }


    /**
    * Get AuthenticationApi instance, base route and serializer can be overridden by a given but be careful,
    * by doing that all interceptors will not be executed
    */
    AuthenticationApi getAuthenticationApi() {
    return AuthenticationApi(dio, serializers);
    }


    /**
    * Get DraftsApi instance, base route and serializer can be overridden by a given but be careful,
    * by doing that all interceptors will not be executed
    */
    DraftsApi getDraftsApi() {
    return DraftsApi(dio, serializers);
    }


    /**
    * Get MessagesApi instance, base route and serializer can be overridden by a given but be careful,
    * by doing that all interceptors will not be executed
    */
    MessagesApi getMessagesApi() {
    return MessagesApi(dio, serializers);
    }


    /**
    * Get RealTimeEventsApi instance, base route and serializer can be overridden by a given but be careful,
    * by doing that all interceptors will not be executed
    */
    RealTimeEventsApi getRealTimeEventsApi() {
    return RealTimeEventsApi(dio, serializers);
    }


    /**
    * Get ServerAndOrganizationsApi instance, base route and serializer can be overridden by a given but be careful,
    * by doing that all interceptors will not be executed
    */
    ServerAndOrganizationsApi getServerAndOrganizationsApi() {
    return ServerAndOrganizationsApi(dio, serializers);
    }


    /**
    * Get StreamsApi instance, base route and serializer can be overridden by a given but be careful,
    * by doing that all interceptors will not be executed
    */
    StreamsApi getStreamsApi() {
    return StreamsApi(dio, serializers);
    }


    /**
    * Get UsersApi instance, base route and serializer can be overridden by a given but be careful,
    * by doing that all interceptors will not be executed
    */
    UsersApi getUsersApi() {
    return UsersApi(dio, serializers);
    }


    /**
    * Get WebhooksApi instance, base route and serializer can be overridden by a given but be careful,
    * by doing that all interceptors will not be executed
    */
    WebhooksApi getWebhooksApi() {
    return WebhooksApi(dio, serializers);
    }


}
