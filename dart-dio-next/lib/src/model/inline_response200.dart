//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

import 'package:openapi/src/model/messages_base.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'inline_response200.g.dart';

/// This is an example of the JSON payload that the Zulip server will `POST` to your server 
///
/// Properties:
/// * [botEmail] - Email of the bot user. 
/// * [botFullName] - The full name of the bot user. 
/// * [data] - The message content, in raw Markdown format (not rendered to HTML). 
/// * [trigger] - What aspect of the message triggered the outgoing webhook notification. Possible values include `private_message` and `mention`. 
/// * [token] - A string of alphanumeric characters that can be used to authenticate the webhook request (each bot user uses a fixed token). You can get the token used by a given outgoing webhook bot in the `zuliprc` file downloaded when creating the bot. 
/// * [message] - A dict containing details on the message that triggered the outgoing webhook, in the format used by [`GET /messages`](/api/get-messages). 
abstract class InlineResponse200 implements Built<InlineResponse200, InlineResponse200Builder> {
    /// Email of the bot user. 
    @BuiltValueField(wireName: r'bot_email')
    String? get botEmail;

    /// The full name of the bot user. 
    @BuiltValueField(wireName: r'bot_full_name')
    String? get botFullName;

    /// The message content, in raw Markdown format (not rendered to HTML). 
    @BuiltValueField(wireName: r'data')
    String? get data;

    /// What aspect of the message triggered the outgoing webhook notification. Possible values include `private_message` and `mention`. 
    @BuiltValueField(wireName: r'trigger')
    String? get trigger;

    /// A string of alphanumeric characters that can be used to authenticate the webhook request (each bot user uses a fixed token). You can get the token used by a given outgoing webhook bot in the `zuliprc` file downloaded when creating the bot. 
    @BuiltValueField(wireName: r'token')
    String? get token;

    /// A dict containing details on the message that triggered the outgoing webhook, in the format used by [`GET /messages`](/api/get-messages). 
    @BuiltValueField(wireName: r'message')
    MessagesBase? get message;

    InlineResponse200._();

    static void _initializeBuilder(InlineResponse200Builder b) => b;

    factory InlineResponse200([void updates(InlineResponse200Builder b)]) = _$InlineResponse200;

    @BuiltValueSerializer(custom: true)
    static Serializer<InlineResponse200> get serializer => _$InlineResponse200Serializer();
}

class _$InlineResponse200Serializer implements StructuredSerializer<InlineResponse200> {
    @override
    final Iterable<Type> types = const [InlineResponse200, _$InlineResponse200];

    @override
    final String wireName = r'InlineResponse200';

    @override
    Iterable<Object?> serialize(Serializers serializers, InlineResponse200 object,
        {FullType specifiedType = FullType.unspecified}) {
        final result = <Object?>[];
        if (object.botEmail != null) {
            result
                ..add(r'bot_email')
                ..add(serializers.serialize(object.botEmail,
                    specifiedType: const FullType(String)));
        }
        if (object.botFullName != null) {
            result
                ..add(r'bot_full_name')
                ..add(serializers.serialize(object.botFullName,
                    specifiedType: const FullType(String)));
        }
        if (object.data != null) {
            result
                ..add(r'data')
                ..add(serializers.serialize(object.data,
                    specifiedType: const FullType(String)));
        }
        if (object.trigger != null) {
            result
                ..add(r'trigger')
                ..add(serializers.serialize(object.trigger,
                    specifiedType: const FullType(String)));
        }
        if (object.token != null) {
            result
                ..add(r'token')
                ..add(serializers.serialize(object.token,
                    specifiedType: const FullType(String)));
        }
        if (object.message != null) {
            result
                ..add(r'message')
                ..add(serializers.serialize(object.message,
                    specifiedType: const FullType(MessagesBase)));
        }
        return result;
    }

    @override
    InlineResponse200 deserialize(Serializers serializers, Iterable<Object?> serialized,
        {FullType specifiedType = FullType.unspecified}) {
        final result = InlineResponse200Builder();

        final iterator = serialized.iterator;
        while (iterator.moveNext()) {
            final key = iterator.current as String;
            iterator.moveNext();
            final Object? value = iterator.current;
            switch (key) {
                case r'bot_email':
                    result.botEmail = serializers.deserialize(value,
                        specifiedType: const FullType(String)) as String;
                    break;
                case r'bot_full_name':
                    result.botFullName = serializers.deserialize(value,
                        specifiedType: const FullType(String)) as String;
                    break;
                case r'data':
                    result.data = serializers.deserialize(value,
                        specifiedType: const FullType(String)) as String;
                    break;
                case r'trigger':
                    result.trigger = serializers.deserialize(value,
                        specifiedType: const FullType(String)) as String;
                    break;
                case r'token':
                    result.token = serializers.deserialize(value,
                        specifiedType: const FullType(String)) as String;
                    break;
                case r'message':
                    result.message.replace(serializers.deserialize(value,
                        specifiedType: const FullType(MessagesBase)) as MessagesBase);
                    break;
            }
        }
        return result.build();
    }
}

