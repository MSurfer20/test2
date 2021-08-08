import 'package:jaguar_serializer/jaguar_serializer.dart';


part 'non_existing_stream_error_all_of.jser.dart';

class NonExistingStreamErrorAllOf {
  
  @Alias('result', isNullable: true,  )
  final Object result;
  
  @Alias('msg', isNullable: true,  )
  final Object msg;
  
  @Alias('code', isNullable: true,  )
  final Object code;
   /* The name of the stream that could not be found.  */
  @Alias('stream', isNullable: false,  )
  final String stream;
  

  NonExistingStreamErrorAllOf(
      

{
     this.result = null,  
     this.msg = null,  
     this.code = null,  
     this.stream = null 
    
    }
  );

  @override
  String toString() {
    return 'NonExistingStreamErrorAllOf[result=$result, msg=$msg, code=$code, stream=$stream, ]';
  }
}

@GenSerializer(nullableFields: true)
class NonExistingStreamErrorAllOfSerializer extends Serializer<NonExistingStreamErrorAllOf> with _$NonExistingStreamErrorAllOfSerializer {

}

