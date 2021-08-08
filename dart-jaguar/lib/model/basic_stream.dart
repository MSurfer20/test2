import 'package:jaguar_serializer/jaguar_serializer.dart';


import 'package:openapi/model/basic_stream_base.dart';

import 'package:openapi/model/basic_stream_all_of.dart';

part 'basic_stream.jser.dart';

class BasicStream {
  
  @Alias('stream_id', isNullable: true,  )
  final Object streamId;
  
  @Alias('name', isNullable: true,  )
  final Object name;
  
  @Alias('description', isNullable: true,  )
  final Object description;
  
  @Alias('date_created', isNullable: true,  )
  final Object dateCreated;
  
  @Alias('invite_only', isNullable: true,  )
  final Object inviteOnly;
  
  @Alias('rendered_description', isNullable: true,  )
  final Object renderedDescription;
  
  @Alias('is_web_public', isNullable: true,  )
  final Object isWebPublic;
  
  @Alias('stream_post_policy', isNullable: true,  )
  final Object streamPostPolicy;
  
  @Alias('message_retention_days', isNullable: true,  )
  final Object messageRetentionDays;
  
  @Alias('history_public_to_subscribers', isNullable: true,  )
  final Object historyPublicToSubscribers;
  
  @Alias('first_message_id', isNullable: true,  )
  final Object firstMessageId;
  
  @Alias('is_announcement_only', isNullable: true,  )
  final Object isAnnouncementOnly;
  

  BasicStream(
      

{
     this.streamId = null,  
     this.name = null,  
     this.description = null,  
     this.dateCreated = null,  
     this.inviteOnly = null,  
     this.renderedDescription = null,  
     this.isWebPublic = null,  
     this.streamPostPolicy = null,  
     this.messageRetentionDays = null,  
     this.historyPublicToSubscribers = null,  
     this.firstMessageId = null,  
     this.isAnnouncementOnly = null 
    
    }
  );

  @override
  String toString() {
    return 'BasicStream[streamId=$streamId, name=$name, description=$description, dateCreated=$dateCreated, inviteOnly=$inviteOnly, renderedDescription=$renderedDescription, isWebPublic=$isWebPublic, streamPostPolicy=$streamPostPolicy, messageRetentionDays=$messageRetentionDays, historyPublicToSubscribers=$historyPublicToSubscribers, firstMessageId=$firstMessageId, isAnnouncementOnly=$isAnnouncementOnly, ]';
  }
}

@GenSerializer(nullableFields: true)
class BasicStreamSerializer extends Serializer<BasicStream> with _$BasicStreamSerializer {

}

