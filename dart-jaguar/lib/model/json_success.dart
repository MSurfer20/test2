import 'package:jaguar_serializer/jaguar_serializer.dart';


import 'package:openapi/model/json_success_base.dart';

import 'package:openapi/model/json_success_all_of.dart';

part 'json_success.jser.dart';

class JsonSuccess {
  
  @Alias('result', isNullable: true,  )
  final Object result;
  
  @Alias('msg', isNullable: true,  )
  final Object msg;
  

  JsonSuccess(
      

{
    
     this.result = null,  
     this.msg = null 
    }
  );

  @override
  String toString() {
    return 'JsonSuccess[result=$result, msg=$msg, ]';
  }
}

@GenSerializer(nullableFields: true)
class JsonSuccessSerializer extends Serializer<JsonSuccess> with _$JsonSuccessSerializer {

}

