import 'package:jaguar_serializer/jaguar_serializer.dart';


import 'package:openapi/model/coded_error_base.dart';

import 'package:openapi/model/non_existing_stream_error_all_of.dart';

part 'non_existing_stream_error.jser.dart';

class NonExistingStreamError {
  
  @Alias('result', isNullable: true,  )
  final Object result;
  
  @Alias('msg', isNullable: true,  )
  final Object msg;
  
  @Alias('code', isNullable: true,  )
  final Object code;
   /* The name of the stream that could not be found.  */
  @Alias('stream', isNullable: false,  )
  final String stream;
  

  NonExistingStreamError(
      

{
    
     this.result = null,  
     this.msg = null,   this.code = null,  
     this.stream = null 
    
    }
  );

  @override
  String toString() {
    return 'NonExistingStreamError[result=$result, msg=$msg, code=$code, stream=$stream, ]';
  }
}

@GenSerializer(nullableFields: true)
class NonExistingStreamErrorSerializer extends Serializer<NonExistingStreamError> with _$NonExistingStreamErrorSerializer {

}

