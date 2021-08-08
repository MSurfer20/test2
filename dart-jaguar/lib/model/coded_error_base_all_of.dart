import 'package:jaguar_serializer/jaguar_serializer.dart';


part 'coded_error_base_all_of.jser.dart';

class CodedErrorBaseAllOf {
  
  @Alias('result', isNullable: true,  )
  final Object result;
  
  @Alias('msg', isNullable: true,  )
  final Object msg;
   /* A string that identifies the error.  */
  @Alias('code', isNullable: false,  )
  final String code;
  

  CodedErrorBaseAllOf(
      

{
     this.result = null,  
     this.msg = null,  
     this.code = null 
    
    }
  );

  @override
  String toString() {
    return 'CodedErrorBaseAllOf[result=$result, msg=$msg, code=$code, ]';
  }
}

@GenSerializer(nullableFields: true)
class CodedErrorBaseAllOfSerializer extends Serializer<CodedErrorBaseAllOf> with _$CodedErrorBaseAllOfSerializer {

}

