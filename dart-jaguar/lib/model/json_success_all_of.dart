import 'package:jaguar_serializer/jaguar_serializer.dart';


part 'json_success_all_of.jser.dart';

class JsonSuccessAllOf {
  
  @Alias('result', isNullable: true,  )
  final Object result;
  
  @Alias('msg', isNullable: true,  )
  final Object msg;
  

  JsonSuccessAllOf(
      

{
     this.result = null,  
     this.msg = null 
    
    }
  );

  @override
  String toString() {
    return 'JsonSuccessAllOf[result=$result, msg=$msg, ]';
  }
}

@GenSerializer(nullableFields: true)
class JsonSuccessAllOfSerializer extends Serializer<JsonSuccessAllOf> with _$JsonSuccessAllOfSerializer {

}

