import 'package:jaguar_serializer/jaguar_serializer.dart';


part 'invalid_message_error_all_of.jser.dart';

class InvalidMessageErrorAllOf {
  
  @Alias('result', isNullable: true,  )
  final Object result;
  
  @Alias('msg', isNullable: true,  )
  final Object msg;
   /* The raw content of the message.  */
  @Alias('raw_content', isNullable: false,  )
  final String rawContent;
  

  InvalidMessageErrorAllOf(
      

{
     this.result = null,  
     this.msg = null,  
     this.rawContent = null 
    
    }
  );

  @override
  String toString() {
    return 'InvalidMessageErrorAllOf[result=$result, msg=$msg, rawContent=$rawContent, ]';
  }
}

@GenSerializer(nullableFields: true)
class InvalidMessageErrorAllOfSerializer extends Serializer<InvalidMessageErrorAllOf> with _$InvalidMessageErrorAllOfSerializer {

}

