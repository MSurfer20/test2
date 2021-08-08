import 'package:jaguar_serializer/jaguar_serializer.dart';


import 'package:openapi/model/coded_error.dart';

part 'user_not_authorized_error.jser.dart';

class UserNotAuthorizedError {
  
  @Alias('result', isNullable: true,  )
  final Object result;
  
  @Alias('msg', isNullable: true,  )
  final Object msg;
  
  @Alias('code', isNullable: true,  )
  final Object code;
  

  UserNotAuthorizedError(
      

{
    
     this.result = null,  
     this.msg = null,   this.code = null 
    
    }
  );

  @override
  String toString() {
    return 'UserNotAuthorizedError[result=$result, msg=$msg, code=$code, ]';
  }
}

@GenSerializer(nullableFields: true)
class UserNotAuthorizedErrorSerializer extends Serializer<UserNotAuthorizedError> with _$UserNotAuthorizedErrorSerializer {

}

