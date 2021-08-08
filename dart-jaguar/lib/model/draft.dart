import 'package:jaguar_serializer/jaguar_serializer.dart';


part 'draft.jser.dart';

class Draft {
   /* The unique ID of the draft. It will only used whenever the drafts are fetched. This field should not be specified when the draft is being created or edited.  */
  @Alias('id', isNullable: false,  )
  final int id;
   /* The type of the draft. Either unaddressed (empty string), \"stream\", or \"private\" (for PMs and private group messages).  */
  @Alias('type', isNullable: false,
          
  )
  final String type;
  //enum typeEnum {  ,  stream,  private,  }; /* An array of the tentative target audience IDs. For \"stream\" messages, this should contain exactly 1 ID, the ID of the target stream. For private messages, this should be an array of target user IDs. For unaddressed drafts, this is ignored, and clients should send an empty array.  */
  @Alias('to', isNullable: false,  )
  final List<int> to;
   /* For stream message drafts, the tentative topic name. For private or unaddressed messages, this will be ignored and should ideally be the empty string. Should not contain null bytes.  */
  @Alias('topic', isNullable: false,  )
  final String topic;
   /* The body of the draft. Should not contain null bytes.  */
  @Alias('content', isNullable: false,  )
  final String content;
   /* A Unix timestamp (seconds only) representing when the draft was last edited. When creating a draft, this key need not be present and it will be filled in automatically by the server.  */
  @Alias('timestamp', isNullable: false,  )
  final num timestamp;
  

  Draft(
      

{
     this.id = null,  
    
     this.type = null,  
     this.to = const [],  
     this.topic = null,  
     this.content = null,   this.timestamp = null 
    
    }
  );

  @override
  String toString() {
    return 'Draft[id=$id, type=$type, to=$to, topic=$topic, content=$content, timestamp=$timestamp, ]';
  }
}

@GenSerializer(nullableFields: true)
class DraftSerializer extends Serializer<Draft> with _$DraftSerializer {

}

