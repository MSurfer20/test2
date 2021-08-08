import 'package:jaguar_serializer/jaguar_serializer.dart';


part 'emoji_base.jser.dart';

class EmojiBase {
   /* A unique identifier, defining the specific emoji codepoint requested, within the namespace of the `reaction_type`.  For example, for `unicode_emoji`, this will be an encoding of the Unicode codepoint; for `realm_emoji`, it'll be the ID of the realm emoji.  */
  @Alias('emoji_code', isNullable: false,  )
  final String emojiCode;
   /* Name of the emoji.  */
  @Alias('emoji_name', isNullable: false,  )
  final String emojiName;
   /* One of the following values:  * `unicode_emoji`: Unicode emoji (`emoji_code` will be its Unicode   codepoint). * `realm_emoji`: [Custom emoji](/help/add-custom-emoji).   (`emoji_code` will be its ID). * `zulip_extra_emoji`: Special emoji included with Zulip.  Exists to   namespace the `zulip` emoji.  */
  @Alias('reaction_type', isNullable: false,  )
  final String reactionType;
  

  EmojiBase(
      

{
     this.emojiCode = null,  
     this.emojiName = null,  
     this.reactionType = null 
    
    }
  );

  @override
  String toString() {
    return 'EmojiBase[emojiCode=$emojiCode, emojiName=$emojiName, reactionType=$reactionType, ]';
  }
}

@GenSerializer(nullableFields: true)
class EmojiBaseSerializer extends Serializer<EmojiBase> with _$EmojiBaseSerializer {

}

