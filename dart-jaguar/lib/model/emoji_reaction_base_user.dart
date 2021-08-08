import 'package:jaguar_serializer/jaguar_serializer.dart';


part 'emoji_reaction_base_user.jser.dart';

class EmojiReactionBaseUser {
   /* ID of the user.  */
  @Alias('id', isNullable: false,  )
  final int id;
   /* Email of the user.  */
  @Alias('email', isNullable: false,  )
  final String email;
   /* Full name of the user.  */
  @Alias('full_name', isNullable: false,  )
  final String fullName;
   /* Whether the user is a mirror dummy.  */
  @Alias('is_mirror_dummy', isNullable: false,  )
  final bool isMirrorDummy;
  

  EmojiReactionBaseUser(
      

{
     this.id = null,  
     this.email = null,  
     this.fullName = null,  
     this.isMirrorDummy = null 
    
    }
  );

  @override
  String toString() {
    return 'EmojiReactionBaseUser[id=$id, email=$email, fullName=$fullName, isMirrorDummy=$isMirrorDummy, ]';
  }
}

@GenSerializer(nullableFields: true)
class EmojiReactionBaseUserSerializer extends Serializer<EmojiReactionBaseUser> with _$EmojiReactionBaseUserSerializer {

}

