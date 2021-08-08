import 'package:jaguar_serializer/jaguar_serializer.dart';


import 'package:openapi/model/emoji_reaction_base_all_of_user.dart';

part 'emoji_reaction_base_all_of.jser.dart';

class EmojiReactionBaseAllOf {
   /* The ID of the user who added the reaction.  **Changes**: New in Zulip 3.0 (feature level 2). The `user` object is deprecated and will be removed in the future.  */
  @Alias('user_id', isNullable: false,  )
  final int userId;
  
  @Alias('user', isNullable: false,  )
  final EmojiReactionBaseAllOfUser user;
  

  EmojiReactionBaseAllOf(
      

{
     this.userId = null,  
     this.user = null 
    
    }
  );

  @override
  String toString() {
    return 'EmojiReactionBaseAllOf[userId=$userId, user=$user, ]';
  }
}

@GenSerializer(nullableFields: true)
class EmojiReactionBaseAllOfSerializer extends Serializer<EmojiReactionBaseAllOf> with _$EmojiReactionBaseAllOfSerializer {

}

