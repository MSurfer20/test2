import 'package:jaguar_serializer/jaguar_serializer.dart';


part 'json_response_base.jser.dart';

class JsonResponseBase {
  
  @Alias('result', isNullable: false,  )
  final String result;
  

  JsonResponseBase(
      

{
     this.result = null 
    
    }
  );

  @override
  String toString() {
    return 'JsonResponseBase[result=$result, ]';
  }
}

@GenSerializer(nullableFields: true)
class JsonResponseBaseSerializer extends Serializer<JsonResponseBase> with _$JsonResponseBaseSerializer {

}

