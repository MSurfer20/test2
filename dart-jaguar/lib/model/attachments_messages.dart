import 'package:jaguar_serializer/jaguar_serializer.dart';


part 'attachments_messages.jser.dart';

class AttachmentsMessages {
   /* Time when the message was sent as a UNIX timestamp multiplied by 1000 (matching the format of getTime() in JavaScript).  **Changes**: Changed in Zulip 2.2 (feature level 22).  This field was previously strangely called `name` and was a floating point number.  */
  @Alias('date_sent', isNullable: false,  )
  final int dateSent;
   /* The unique message ID.  Messages should always be displayed sorted by ID.  */
  @Alias('id', isNullable: false,  )
  final int id;
  

  AttachmentsMessages(
      

{
     this.dateSent = null,  
     this.id = null 
    
    }
  );

  @override
  String toString() {
    return 'AttachmentsMessages[dateSent=$dateSent, id=$id, ]';
  }
}

@GenSerializer(nullableFields: true)
class AttachmentsMessagesSerializer extends Serializer<AttachmentsMessages> with _$AttachmentsMessagesSerializer {

}

