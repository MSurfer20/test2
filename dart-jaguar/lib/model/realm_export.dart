import 'package:jaguar_serializer/jaguar_serializer.dart';


part 'realm_export.jser.dart';

class RealmExport {
   /* The id of the export.  */
  @Alias('id', isNullable: false,  )
  final int id;
   /* The id of the user who did the export.  */
  @Alias('acting_user_id', isNullable: false,  )
  final int actingUserId;
   /* The UNIX timestamp of when the export was made.  */
  @Alias('export_time', isNullable: false,  )
  final num exportTime;
   /* The timestamp of when the export was deleted. Null if it wasn't.  */
  @Alias('deleted_timestamp', isNullable: true,  )
  final num deletedTimestamp;
   /* The timestamp of when the export failed. Null if it didn't.  */
  @Alias('failed_timestamp', isNullable: true,  )
  final num failedTimestamp;
   /* The URL of the export. `null` if there's no URL.  */
  @Alias('export_url', isNullable: true,  )
  final String exportUrl;
   /* Whether the export is pending or not.  */
  @Alias('pending', isNullable: false,  )
  final bool pending;
  

  RealmExport(
      

{
     this.id = null,  
     this.actingUserId = null,  
     this.exportTime = null,  
     this.deletedTimestamp = null,  
     this.failedTimestamp = null,  
     this.exportUrl = null,  
     this.pending = null 
    
    }
  );

  @override
  String toString() {
    return 'RealmExport[id=$id, actingUserId=$actingUserId, exportTime=$exportTime, deletedTimestamp=$deletedTimestamp, failedTimestamp=$failedTimestamp, exportUrl=$exportUrl, pending=$pending, ]';
  }
}

@GenSerializer(nullableFields: true)
class RealmExportSerializer extends Serializer<RealmExport> with _$RealmExportSerializer {

}

