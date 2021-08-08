import 'package:jaguar_serializer/jaguar_serializer.dart';


part 'realm_playground.jser.dart';

class RealmPlayground {
   /* The unique ID for the realm playground.  */
  @Alias('id', isNullable: false,  )
  final int id;
   /* The user-visible display name of the playground.  Clients should display this in UI for picking which playground to open a code block in, to differentiate between multiple configured playground options for a given pygments language.  **Changes**: New in Zulip 4.0 (feature level 49).  */
  @Alias('name', isNullable: false,  )
  final String name;
   /* The name of the Pygments language lexer for that programming language.  */
  @Alias('pygments_language', isNullable: false,  )
  final String pygmentsLanguage;
   /* The url prefix for the playground.  */
  @Alias('url_prefix', isNullable: false,  )
  final String urlPrefix;
  

  RealmPlayground(
      

{
     this.id = null,  
     this.name = null,  
     this.pygmentsLanguage = null,  
     this.urlPrefix = null 
    
    }
  );

  @override
  String toString() {
    return 'RealmPlayground[id=$id, name=$name, pygmentsLanguage=$pygmentsLanguage, urlPrefix=$urlPrefix, ]';
  }
}

@GenSerializer(nullableFields: true)
class RealmPlaygroundSerializer extends Serializer<RealmPlayground> with _$RealmPlaygroundSerializer {

}

