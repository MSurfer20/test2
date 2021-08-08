import 'package:jaguar_serializer/jaguar_serializer.dart';


import 'package:openapi/model/basic_stream.dart';

part 'default_stream_group.jser.dart';

class DefaultStreamGroup {
   /* Name of the default stream group.  */
  @Alias('name', isNullable: false,  )
  final String name;
   /* Description of the default stream group.  */
  @Alias('description', isNullable: false,  )
  final String description;
   /* id of the default stream group.  */
  @Alias('id', isNullable: false,  )
  final int id;
   /* Array containing details about the streams in the default stream group.  */
  @Alias('streams', isNullable: false,  )
  final List<BasicStream> streams;
  

  DefaultStreamGroup(
      

{
     this.name = null,  
     this.description = null,  
     this.id = null,  
     this.streams = const [] 
    
    }
  );

  @override
  String toString() {
    return 'DefaultStreamGroup[name=$name, description=$description, id=$id, streams=$streams, ]';
  }
}

@GenSerializer(nullableFields: true)
class DefaultStreamGroupSerializer extends Serializer<DefaultStreamGroup> with _$DefaultStreamGroupSerializer {

}

