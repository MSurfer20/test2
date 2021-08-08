import 'package:jaguar_serializer/jaguar_serializer.dart';


part 'json_success_base_all_of.jser.dart';

class JsonSuccessBaseAllOf {
  
  @Alias('result', isNullable: false,
          
  )
  final String result;
  //enum resultEnum {  success,  };
  @Alias('msg', isNullable: false,  )
  final String msg;
  

  JsonSuccessBaseAllOf(
      

{
    
     this.result = null,  
     this.msg = null 
    }
  );

  @override
  String toString() {
    return 'JsonSuccessBaseAllOf[result=$result, msg=$msg, ]';
  }
}

@GenSerializer(nullableFields: true)
class JsonSuccessBaseAllOfSerializer extends Serializer<JsonSuccessBaseAllOf> with _$JsonSuccessBaseAllOfSerializer {

}

