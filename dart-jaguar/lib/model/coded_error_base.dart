import 'package:jaguar_serializer/jaguar_serializer.dart';


import 'package:openapi/model/json_error_base.dart';

import 'package:openapi/model/coded_error_base_all_of.dart';

part 'coded_error_base.jser.dart';

class CodedErrorBase {
  
  @Alias('result', isNullable: true,  )
  final Object result;
  
  @Alias('msg', isNullable: true,  )
  final Object msg;
   /* A string that identifies the error.  */
  @Alias('code', isNullable: false,  )
  final String code;
  

  CodedErrorBase(
      

{
    
     this.result = null,  
     this.msg = null,   this.code = null 
    
    }
  );

  @override
  String toString() {
    return 'CodedErrorBase[result=$result, msg=$msg, code=$code, ]';
  }
}

@GenSerializer(nullableFields: true)
class CodedErrorBaseSerializer extends Serializer<CodedErrorBase> with _$CodedErrorBaseSerializer {

}

