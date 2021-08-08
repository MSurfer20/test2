import 'package:jaguar_serializer/jaguar_serializer.dart';


part 'emoji_reaction_all_of.jser.dart';

class EmojiReactionAllOf {
  
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
  

  EmojiReactionAllOf(
      

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
    return 'EmojiReactionAllOf[emojiCode=$emojiCode, emojiName=$emojiName, reactionType=$reactionType, userId=$userId, user=$user, ]';
  }
}

@GenSerializer(nullableFields: true)
class EmojiReactionAllOfSerializer extends Serializer<EmojiReactionAllOf> with _$EmojiReactionAllOfSerializer {

}

