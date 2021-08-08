import 'package:jaguar_serializer/jaguar_serializer.dart';


part 'hotspot.jser.dart';

class Hotspot {
   /* The delay after which the user should be shown the hotspot.  */
  @Alias('delay', isNullable: false,  )
  final num delay;
   /* The name of the hotspot.  */
  @Alias('name', isNullable: false,  )
  final String name;
   /* The title of the hotspot, as will be displayed to the user.  */
  @Alias('title', isNullable: false,  )
  final String title;
   /* The description of the hotspot, as will be displayed to the user.  */
  @Alias('description', isNullable: false,  )
  final String description;
  

  Hotspot(
      

{
     this.delay = null,  
     this.name = null,  
     this.title = null,  
     this.description = null 
    
    }
  );

  @override
  String toString() {
    return 'Hotspot[delay=$delay, name=$name, title=$title, description=$description, ]';
  }
}

@GenSerializer(nullableFields: true)
class HotspotSerializer extends Serializer<Hotspot> with _$HotspotSerializer {

}

