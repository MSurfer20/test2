import 'package:jaguar_serializer/jaguar_serializer.dart';


import 'package:openapi/model/json_error_base.dart';

import 'package:openapi/model/json_success_all_of.dart';

part 'json_error.jser.dart';

class JsonError {
  
  @Alias('result', isNullable: true,  )
  final Object result;
  
  @Alias('msg', isNullable: true,  )
  final Object msg;
  

  JsonError(
      

{
    
     this.result = null,  
     this.msg = null 
    }
  );

  @override
  String toString() {
    return 'JsonError[result=$result, msg=$msg, ]';
  }
}

@GenSerializer(nullableFields: true)
class JsonErrorSerializer extends Serializer<JsonError> with _$JsonErrorSerializer {

}

