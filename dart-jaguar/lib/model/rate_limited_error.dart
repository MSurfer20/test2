import 'package:jaguar_serializer/jaguar_serializer.dart';


import 'package:openapi/model/coded_error.dart';

part 'rate_limited_error.jser.dart';

class RateLimitedError {
  
  @Alias('result', isNullable: true,  )
  final Object result;
  
  @Alias('msg', isNullable: true,  )
  final Object msg;
  
  @Alias('code', isNullable: true,  )
  final Object code;
  

  RateLimitedError(
      

{
    
     this.result = null,  
     this.msg = null,   this.code = null 
    
    }
  );

  @override
  String toString() {
    return 'RateLimitedError[result=$result, msg=$msg, code=$code, ]';
  }
}

@GenSerializer(nullableFields: true)
class RateLimitedErrorSerializer extends Serializer<RateLimitedError> with _$RateLimitedErrorSerializer {

}

