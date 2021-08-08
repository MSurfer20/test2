import 'package:jaguar_serializer/jaguar_serializer.dart';


part 'messages_base_topic_links.jser.dart';

class MessagesBaseTopicLinks {
   /* The original link text present in the topic.  */
  @Alias('text', isNullable: false,  )
  final String text;
   /* The expanded target url which the link points to.  */
  @Alias('url', isNullable: false,  )
  final String url;
  

  MessagesBaseTopicLinks(
      

{
     this.text = null,  
     this.url = null 
    
    }
  );

  @override
  String toString() {
    return 'MessagesBaseTopicLinks[text=$text, url=$url, ]';
  }
}

@GenSerializer(nullableFields: true)
class MessagesBaseTopicLinksSerializer extends Serializer<MessagesBaseTopicLinks> with _$MessagesBaseTopicLinksSerializer {

}

