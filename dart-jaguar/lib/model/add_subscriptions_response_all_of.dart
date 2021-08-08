import 'package:jaguar_serializer/jaguar_serializer.dart';


part 'add_subscriptions_response_all_of.jser.dart';

class AddSubscriptionsResponseAllOf {
  
  @Alias('result', isNullable: true,  )
  final Object result;
  
  @Alias('msg', isNullable: true,  )
  final Object msg;
   /* A dictionary where the key is the email address of the user/bot and the value is a list of the names of the streams that were subscribed to as a result of the query.  */
  @Alias('subscribed', isNullable: false,  )
  final Map<String, List<String>> subscribed;
   /* A dictionary where the key is the email address of the user/bot and the value is a list of the names of the streams that the user/bot is already subscribed to.  */
  @Alias('already_subscribed', isNullable: false,  )
  final Map<String, List<String>> alreadySubscribed;
   /* A list of names of streams that the requesting user/bot was not authorized to subscribe to.  Only present if `authorization_errors_fatal=false`.  */
  @Alias('unauthorized', isNullable: false,  )
  final List<String> unauthorized;
  

  AddSubscriptionsResponseAllOf(
      

{
     this.result = null,  
     this.msg = null,  
     this.subscribed = const {},  
     this.alreadySubscribed = const {},  
     this.unauthorized = const [] 
    
    }
  );

  @override
  String toString() {
    return 'AddSubscriptionsResponseAllOf[result=$result, msg=$msg, subscribed=$subscribed, alreadySubscribed=$alreadySubscribed, unauthorized=$unauthorized, ]';
  }
}

@GenSerializer(nullableFields: true)
class AddSubscriptionsResponseAllOfSerializer extends Serializer<AddSubscriptionsResponseAllOf> with _$AddSubscriptionsResponseAllOfSerializer {

}

