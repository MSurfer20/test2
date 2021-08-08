import 'package:test/test.dart';
import 'package:openapi/openapi.dart';


/// tests for WebhooksApi
void main() {
  final instance = Openapi().getWebhooksApi();

  group(WebhooksApi, () {
    // Outgoing webhooks
    //
    // Outgoing webhooks allows to build or set up Zulip integrations which are notified when certain types of messages are sent in Zulip. 
    //
    //Future<InlineResponse200> zulipOutgoingWebhooks() async
    test('test zulipOutgoingWebhooks', () async {
      // TODO
    });

  });
}
