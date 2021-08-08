import 'package:jaguar_serializer/jaguar_serializer.dart';


import 'package:openapi/model/json_success_base_all_of.dart';

import 'package:openapi/model/json_response_base.dart';

part 'json_success_base.jser.dart';

class JsonSuccessBase {
  
  @Alias('result', isNullable: false,
          
  )
  final String result;
  //enum resultEnum {  success,  };
  @Alias('msg', isNullable: false,  )
  final String msg;
  

  JsonSuccessBase(
      

{
    
     this.result = null,  
     this.msg = null 
    }
  );

  @override
  String toString() {
    return 'JsonSuccessBase[result=$result, msg=$msg, ]';
  }
}

@GenSerializer(nullableFields: true)
class JsonSuccessBaseSerializer extends Serializer<JsonSuccessBase> with _$JsonSuccessBaseSerializer {

}

