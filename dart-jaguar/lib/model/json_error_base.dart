import 'package:jaguar_serializer/jaguar_serializer.dart';


import 'package:openapi/model/json_response_base.dart';

import 'package:openapi/model/json_error_base_all_of.dart';

part 'json_error_base.jser.dart';

class JsonErrorBase {
  
  @Alias('result', isNullable: false,
          
  )
  final String result;
  //enum resultEnum {  error,  };
  @Alias('msg', isNullable: false,  )
  final String msg;
  

  JsonErrorBase(
      

{
    
     this.result = null,  
     this.msg = null 
    }
  );

  @override
  String toString() {
    return 'JsonErrorBase[result=$result, msg=$msg, ]';
  }
}

@GenSerializer(nullableFields: true)
class JsonErrorBaseSerializer extends Serializer<JsonErrorBase> with _$JsonErrorBaseSerializer {

}

