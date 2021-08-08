import 'package:jaguar_serializer/jaguar_serializer.dart';


import 'package:openapi/model/json_success_base.dart';

import 'package:openapi/model/invalid_message_error_all_of.dart';

part 'invalid_message_error.jser.dart';

class InvalidMessageError {
  
  @Alias('result', isNullable: true,  )
  final Object result;
  
  @Alias('msg', isNullable: true,  )
  final Object msg;
   /* The raw content of the message.  */
  @Alias('raw_content', isNullable: false,  )
  final String rawContent;
  

  InvalidMessageError(
      

{
    
     this.result = null,  
     this.msg = null,   this.rawContent = null 
    
    }
  );

  @override
  String toString() {
    return 'InvalidMessageError[result=$result, msg=$msg, rawContent=$rawContent, ]';
  }
}

@GenSerializer(nullableFields: true)
class InvalidMessageErrorSerializer extends Serializer<InvalidMessageError> with _$InvalidMessageErrorSerializer {

}

