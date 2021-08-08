import 'package:jaguar_serializer/jaguar_serializer.dart';


part 'bad_event_queue_id_error_all_of.jser.dart';

class BadEventQueueIdErrorAllOf {
  
  @Alias('result', isNullable: true,  )
  final Object result;
  
  @Alias('msg', isNullable: true,  )
  final Object msg;
  
  @Alias('code', isNullable: true,  )
  final Object code;
   /* The string that identifies the invalid event queue.  */
  @Alias('queue_id', isNullable: false,  )
  final String queueId;
  

  BadEventQueueIdErrorAllOf(
      

{
     this.result = null,  
     this.msg = null,  
     this.code = null,  
     this.queueId = null 
    
    }
  );

  @override
  String toString() {
    return 'BadEventQueueIdErrorAllOf[result=$result, msg=$msg, code=$code, queueId=$queueId, ]';
  }
}

@GenSerializer(nullableFields: true)
class BadEventQueueIdErrorAllOfSerializer extends Serializer<BadEventQueueIdErrorAllOf> with _$BadEventQueueIdErrorAllOfSerializer {

}

