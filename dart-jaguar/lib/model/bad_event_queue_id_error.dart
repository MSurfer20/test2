import 'package:jaguar_serializer/jaguar_serializer.dart';


import 'package:openapi/model/coded_error_base.dart';

import 'package:openapi/model/bad_event_queue_id_error_all_of.dart';

part 'bad_event_queue_id_error.jser.dart';

class BadEventQueueIdError {
  
  @Alias('result', isNullable: true,  )
  final Object result;
  
  @Alias('msg', isNullable: true,  )
  final Object msg;
  
  @Alias('code', isNullable: true,  )
  final Object code;
   /* The string that identifies the invalid event queue.  */
  @Alias('queue_id', isNullable: false,  )
  final String queueId;
  

  BadEventQueueIdError(
      

{
    
     this.result = null,  
     this.msg = null,   this.code = null,  
     this.queueId = null 
    
    }
  );

  @override
  String toString() {
    return 'BadEventQueueIdError[result=$result, msg=$msg, code=$code, queueId=$queueId, ]';
  }
}

@GenSerializer(nullableFields: true)
class BadEventQueueIdErrorSerializer extends Serializer<BadEventQueueIdError> with _$BadEventQueueIdErrorSerializer {

}

