import 'package:jaguar_serializer/jaguar_serializer.dart';


part 'realm_emoji.jser.dart';

class RealmEmoji {
   /* The ID for this emoji, same as the object's key.  */
  @Alias('id', isNullable: false,  )
  final String id;
   /* The user-friendly name for this emoji. Users in the organization can use this emoji by writing this name between colons (`:name  :`).  */
  @Alias('name', isNullable: false,  )
  final String name;
   /* The path relative to the organization's URL where the emoji's image can be found.  */
  @Alias('source_url', isNullable: false,  )
  final String sourceUrl;
   /* Whether the emoji has been deactivated or not.  */
  @Alias('deactivated', isNullable: false,  )
  final bool deactivated;
   /* The user ID of the user who uploaded the custom emoji. Will be null if the uploader is unknown.  **Changes**: New in Zulip 3.0 (feature level 7).  Previously was accessible via and `author` object with an `id` field.  */
  @Alias('author_id', isNullable: true,  )
  final int authorId;
  

  RealmEmoji(
      

{
     this.id = null,  
     this.name = null,  
     this.sourceUrl = null,  
     this.deactivated = null,  
     this.authorId = null 
    
    }
  );

  @override
  String toString() {
    return 'RealmEmoji[id=$id, name=$name, sourceUrl=$sourceUrl, deactivated=$deactivated, authorId=$authorId, ]';
  }
}

@GenSerializer(nullableFields: true)
class RealmEmojiSerializer extends Serializer<RealmEmoji> with _$RealmEmojiSerializer {

}

