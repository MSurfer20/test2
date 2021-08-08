import 'package:jaguar_retrofit/annotations/annotations.dart';
import 'package:jaguar_retrofit/jaguar_retrofit.dart';
import 'package:jaguar_serializer/jaguar_serializer.dart';
import 'package:jaguar_mimetype/jaguar_mimetype.dart';
import 'dart:async';

import 'package:openapi/model/inline_response200.dart';

part 'webhooks_api.jretro.dart';

@GenApiClient()
class WebhooksApi extends ApiClient with _$WebhooksApiClient {
    final Route base;
    final Map<String, CodecRepo> converters;
    final Duration timeout;

    WebhooksApi({this.base, this.converters, this.timeout = const Duration(minutes: 2)});

    /// Outgoing webhooks
    ///
    /// Outgoing webhooks allows to build or set up Zulip integrations which are notified when certain types of messages are sent in Zulip. 
    @PostReq(path: "/zulip-outgoing-webhook")
    Future<InlineResponse200> zulipOutgoingWebhooks(
        ) {
        return super.zulipOutgoingWebhooks(

        ).timeout(timeout);
    }


}
