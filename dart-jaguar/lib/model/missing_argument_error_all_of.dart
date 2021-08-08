import 'package:jaguar_serializer/jaguar_serializer.dart';


part 'missing_argument_error_all_of.jser.dart';

class MissingArgumentErrorAllOf {
  
  @Alias('result', isNullable: true,  )
  final Object result;
  
  @Alias('msg', isNullable: true,  )
  final Object msg;
  
  @Alias('code', isNullable: true,  )
  final Object code;
   /* It contains the information about the missing parameter.  */
  @Alias('var_name', isNullable: false,  )
  final String varName;
  

  MissingArgumentErrorAllOf(
      

{
     this.result = null,  
     this.msg = null,  
     this.code = null,  
     this.varName = null 
    
    }
  );

  @override
  String toString() {
    return 'MissingArgumentErrorAllOf[result=$result, msg=$msg, code=$code, varName=$varName, ]';
  }
}

@GenSerializer(nullableFields: true)
class MissingArgumentErrorAllOfSerializer extends Serializer<MissingArgumentErrorAllOf> with _$MissingArgumentErrorAllOfSerializer {

}

