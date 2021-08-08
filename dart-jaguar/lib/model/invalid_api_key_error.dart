import 'package:jaguar_serializer/jaguar_serializer.dart';


import 'package:openapi/model/json_error.dart';

part 'invalid_api_key_error.jser.dart';

class InvalidApiKeyError {
  
  @Alias('result', isNullable: true,  )
  final Object result;
  
  @Alias('msg', isNullable: true,  )
  final Object msg;
  

  InvalidApiKeyError(
      

{
    
     this.result = null,  
     this.msg = null 
    }
  );

  @override
  String toString() {
    return 'InvalidApiKeyError[result=$result, msg=$msg, ]';
  }
}

@GenSerializer(nullableFields: true)
class InvalidApiKeyErrorSerializer extends Serializer<InvalidApiKeyError> with _$InvalidApiKeyErrorSerializer {

}

