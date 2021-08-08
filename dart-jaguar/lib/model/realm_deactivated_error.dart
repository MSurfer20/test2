import 'package:jaguar_serializer/jaguar_serializer.dart';


import 'package:openapi/model/coded_error.dart';

part 'realm_deactivated_error.jser.dart';

class RealmDeactivatedError {
  
  @Alias('result', isNullable: true,  )
  final Object result;
  
  @Alias('msg', isNullable: true,  )
  final Object msg;
  
  @Alias('code', isNullable: true,  )
  final Object code;
  

  RealmDeactivatedError(
      

{
    
     this.result = null,  
     this.msg = null,   this.code = null 
    
    }
  );

  @override
  String toString() {
    return 'RealmDeactivatedError[result=$result, msg=$msg, code=$code, ]';
  }
}

@GenSerializer(nullableFields: true)
class RealmDeactivatedErrorSerializer extends Serializer<RealmDeactivatedError> with _$RealmDeactivatedErrorSerializer {

}

