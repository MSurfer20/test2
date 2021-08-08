import 'package:jaguar_serializer/jaguar_serializer.dart';


part 'coded_error_all_of.jser.dart';

class CodedErrorAllOf {
  
  @Alias('result', isNullable: true,  )
  final Object result;
  
  @Alias('msg', isNullable: true,  )
  final Object msg;
  
  @Alias('code', isNullable: true,  )
  final Object code;
  

  CodedErrorAllOf(
      

{
     this.result = null,  
     this.msg = null,  
     this.code = null 
    
    }
  );

  @override
  String toString() {
    return 'CodedErrorAllOf[result=$result, msg=$msg, code=$code, ]';
  }
}

@GenSerializer(nullableFields: true)
class CodedErrorAllOfSerializer extends Serializer<CodedErrorAllOf> with _$CodedErrorAllOfSerializer {

}

