import 'package:jaguar_serializer/jaguar_serializer.dart';


import 'package:openapi/model/emoji_reaction_base.dart';

import 'package:openapi/model/emoji_reaction_all_of.dart';

part 'emoji_reaction.jser.dart';

class EmojiReaction {
  
  @Alias('emoji_code', isNullable: true,  )
  final Object emojiCode;
  
  @Alias('emoji_name', isNullable: true,  )
  final Object emojiName;
  
  @Alias('reaction_type', isNullable: true,  )
  final Object reactionType;
  
  @Alias('user_id', isNullable: true,  )
  final Object userId;
  
  @Alias('user', isNullable: true,  )
  final Object user;
  

  EmojiReaction(
      

{
     this.emojiCode = null,  
     this.emojiName = null,  
     this.reactionType = null,  
     this.userId = null,  
     this.user = null 
    
    }
  );

  @override
  String toString() {
    return 'EmojiReaction[emojiCode=$emojiCode, emojiName=$emojiName, reactionType=$reactionType, userId=$userId, user=$user, ]';
  }
}

@GenSerializer(nullableFields: true)
class EmojiReactionSerializer extends Serializer<EmojiReaction> with _$EmojiReactionSerializer {

}

