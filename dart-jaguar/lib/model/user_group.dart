import 'package:jaguar_serializer/jaguar_serializer.dart';


part 'user_group.jser.dart';

class UserGroup {
   /* The name of the user group.  */
  @Alias('name', isNullable: false,  )
  final String name;
   /* The description of the user group.  */
  @Alias('description', isNullable: false,  )
  final String description;
   /* Array containing the id of the users who are members of this user group.  */
  @Alias('members', isNullable: false,  )
  final List<int> members;
   /* The ID of the user group.  */
  @Alias('id', isNullable: false,  )
  final int id;
  

  UserGroup(
      

{
     this.name = null,  
     this.description = null,  
     this.members = const [],  
     this.id = null 
    
    }
  );

  @override
  String toString() {
    return 'UserGroup[name=$name, description=$description, members=$members, id=$id, ]';
  }
}

@GenSerializer(nullableFields: true)
class UserGroupSerializer extends Serializer<UserGroup> with _$UserGroupSerializer {

}

