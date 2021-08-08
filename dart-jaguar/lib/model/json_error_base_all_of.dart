import 'package:jaguar_serializer/jaguar_serializer.dart';


part 'json_error_base_all_of.jser.dart';

class JsonErrorBaseAllOf {
  
  @Alias('result', isNullable: false,
          
  )
  final String result;
  //enum resultEnum {  error,  };
  @Alias('msg', isNullable: false,  )
  final String msg;
  

  JsonErrorBaseAllOf(
      

{
    
     this.result = null,  
     this.msg = null 
    }
  );

  @override
  String toString() {
    return 'JsonErrorBaseAllOf[result=$result, msg=$msg, ]';
  }
}

@GenSerializer(nullableFields: true)
class JsonErrorBaseAllOfSerializer extends Serializer<JsonErrorBaseAllOf> with _$JsonErrorBaseAllOfSerializer {

}

