import 'package:jaguar_serializer/jaguar_serializer.dart';


import 'package:openapi/model/attachments_messages.dart';

part 'attachments.jser.dart';

class Attachments {
   /* The unique ID for the attachment.  */
  @Alias('id', isNullable: false,  )
  final int id;
   /* Name of the uploaded file.  */
  @Alias('name', isNullable: false,  )
  final String name;
   /* A representation of the path of the file within the repository of user-uploaded files.  If the `path_id` of a file is `{realm_id}/ab/cdef/temp_file.py`, its URL will be: `{server_url}/user_uploads/{realm_id}/ab/cdef/temp_file.py`.  */
  @Alias('path_id', isNullable: false,  )
  final String pathId;
   /* Size of the file in bytes.  */
  @Alias('size', isNullable: false,  )
  final int size;
   /* Time when the attachment was uploaded as a UNIX timestamp multiplied by 1000 (matching the format of getTime() in JavaScript).  **Changes**: Changed in Zulip 2.2 (feature level 22).  This field was previously a floating point number.  */
  @Alias('create_time', isNullable: false,  )
  final int createTime;
   /* Contains basic details on any Zulip messages that have been sent referencing this [uploaded file](/api/upload-file). This includes messages sent by any user in the Zulip organization who sent a message containing a link to the uploaded file.  */
  @Alias('messages', isNullable: false,  )
  final List<AttachmentsMessages> messages;
  

  Attachments(
      

{
     this.id = null,  
     this.name = null,  
     this.pathId = null,  
     this.size = null,  
     this.createTime = null,  
     this.messages = const [] 
    
    }
  );

  @override
  String toString() {
    return 'Attachments[id=$id, name=$name, pathId=$pathId, size=$size, createTime=$createTime, messages=$messages, ]';
  }
}

@GenSerializer(nullableFields: true)
class AttachmentsSerializer extends Serializer<Attachments> with _$AttachmentsSerializer {

}

