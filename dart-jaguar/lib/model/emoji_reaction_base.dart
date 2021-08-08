import 'package:jaguar_serializer/jaguar_serializer.dart';


import 'package:openapi/model/emoji_reaction_base_user.dart';

part 'emoji_reaction_base.jser.dart';

class EmojiReactionBase {
   /* A unique identifier, defining the specific emoji codepoint requested, within the namespace of the `reaction_type`.  For example, for `unicode_emoji`, this will be an encoding of the Unicode codepoint.  */
  @Alias('emoji_code', isNullable: false,  )
  final String emojiCode;
   /* Name of the emoji.  */
  @Alias('emoji_name', isNullable: false,  )
  final String emojiName;
   /* One of the following values:  * `unicode_emoji`: Unicode emoji (`emoji_code` will be its Unicode   codepoint). * `realm_emoji`: [Custom emoji](/help/add-custom-emoji).   (`emoji_code` will be its ID). * `zulip_extra_emoji`: Special emoji included with Zulip.  Exists to   namespace the `zulip` emoji.  */
  @Alias('reaction_type', isNullable: false,  )
  final String reactionType;
   /* The ID of the user who added the reaction.  **Changes**: New in Zulip 3.0 (feature level 2). The `user` object is deprecated and will be removed in the future.  */
  @Alias('user_id', isNullable: false,  )
  final int userId;
  
  @Alias('user', isNullable: false,  )
  final EmojiReactionBaseUser user;
  

  EmojiReactionBase(
      

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
    return 'EmojiReactionBase[emojiCode=$emojiCode, emojiName=$emojiName, reactionType=$reactionType, userId=$userId, user=$user, ]';
  }
}

@GenSerializer(nullableFields: true)
class EmojiReactionBaseSerializer extends Serializer<EmojiReactionBase> with _$EmojiReactionBaseSerializer {

}

