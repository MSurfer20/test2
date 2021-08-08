import 'package:jaguar_serializer/jaguar_serializer.dart';


import 'package:openapi/model/coded_error_base.dart';

import 'package:openapi/model/missing_argument_error_all_of.dart';

part 'missing_argument_error.jser.dart';

class MissingArgumentError {
  
  @Alias('result', isNullable: true,  )
  final Object result;
  
  @Alias('msg', isNullable: true,  )
  final Object msg;
  
  @Alias('code', isNullable: true,  )
  final Object code;
   /* It contains the information about the missing parameter.  */
  @Alias('var_name', isNullable: false,  )
  final String varName;
  

  MissingArgumentError(
      

{
    
     this.result = null,  
     this.msg = null,   this.code = null,  
     this.varName = null 
    
    }
  );

  @override
  String toString() {
    return 'MissingArgumentError[result=$result, msg=$msg, code=$code, varName=$varName, ]';
  }
}

@GenSerializer(nullableFields: true)
class MissingArgumentErrorSerializer extends Serializer<MissingArgumentError> with _$MissingArgumentErrorSerializer {

}

