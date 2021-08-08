import 'package:jaguar_serializer/jaguar_serializer.dart';


import 'package:openapi/model/coded_error.dart';

part 'user_deactivated_error.jser.dart';

class UserDeactivatedError {
  
  @Alias('result', isNullable: true,  )
  final Object result;
  
  @Alias('msg', isNullable: true,  )
  final Object msg;
  
  @Alias('code', isNullable: true,  )
  final Object code;
  

  UserDeactivatedError(
      

{
    
     this.result = null,  
     this.msg = null,   this.code = null 
    
    }
  );

  @override
  String toString() {
    return 'UserDeactivatedError[result=$result, msg=$msg, code=$code, ]';
  }
}

@GenSerializer(nullableFields: true)
class UserDeactivatedErrorSerializer extends Serializer<UserDeactivatedError> with _$UserDeactivatedErrorSerializer {

}

