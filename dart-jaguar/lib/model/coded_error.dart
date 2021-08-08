import 'package:jaguar_serializer/jaguar_serializer.dart';


import 'package:openapi/model/coded_error_base.dart';

import 'package:openapi/model/coded_error_all_of.dart';

part 'coded_error.jser.dart';

class CodedError {
  
  @Alias('result', isNullable: true,  )
  final Object result;
  
  @Alias('msg', isNullable: true,  )
  final Object msg;
  
  @Alias('code', isNullable: true,  )
  final Object code;
  

  CodedError(
      

{
    
     this.result = null,  
     this.msg = null,   this.code = null 
    
    }
  );

  @override
  String toString() {
    return 'CodedError[result=$result, msg=$msg, code=$code, ]';
  }
}

@GenSerializer(nullableFields: true)
class CodedErrorSerializer extends Serializer<CodedError> with _$CodedErrorSerializer {

}

