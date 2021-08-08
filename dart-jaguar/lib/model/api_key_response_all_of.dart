import 'package:jaguar_serializer/jaguar_serializer.dart';


part 'api_key_response_all_of.jser.dart';

class ApiKeyResponseAllOf {
  
  @Alias('result', isNullable: true,  )
  final Object result;
  
  @Alias('msg', isNullable: true,  )
  final Object msg;
   /* The API key that can be used to authenticate as the requested user.  */
  @Alias('api_key', isNullable: false,  )
  final String apiKey;
   /* The email address of the user who owns the API key  */
  @Alias('email', isNullable: false,  )
  final String email;
  

  ApiKeyResponseAllOf(
      

{
     this.result = null,  
     this.msg = null,  
    
     this.apiKey = null,  
     this.email = null 
    }
  );

  @override
  String toString() {
    return 'ApiKeyResponseAllOf[result=$result, msg=$msg, apiKey=$apiKey, email=$email, ]';
  }
}

@GenSerializer(nullableFields: true)
class ApiKeyResponseAllOfSerializer extends Serializer<ApiKeyResponseAllOf> with _$ApiKeyResponseAllOfSerializer {

}

