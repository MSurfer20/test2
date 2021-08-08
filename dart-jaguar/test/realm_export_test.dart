import 'package:openapi/api.dart';
import 'package:test/test.dart';

// tests for RealmExport
void main() {
  var instance = new RealmExport();

  group('test RealmExport', () {
    // The id of the export. 
    // int id (default value: null)
    test('to test the property `id`', () async {
      // TODO
    });

    // The id of the user who did the export. 
    // int actingUserId (default value: null)
    test('to test the property `actingUserId`', () async {
      // TODO
    });

    // The UNIX timestamp of when the export was made. 
    // num exportTime (default value: null)
    test('to test the property `exportTime`', () async {
      // TODO
    });

    // The timestamp of when the export was deleted. Null if it wasn't. 
    // num deletedTimestamp (default value: null)
    test('to test the property `deletedTimestamp`', () async {
      // TODO
    });

    // The timestamp of when the export failed. Null if it didn't. 
    // num failedTimestamp (default value: null)
    test('to test the property `failedTimestamp`', () async {
      // TODO
    });

    // The URL of the export. `null` if there's no URL. 
    // String exportUrl (default value: null)
    test('to test the property `exportUrl`', () async {
      // TODO
    });

    // Whether the export is pending or not. 
    // bool pending (default value: null)
    test('to test the property `pending`', () async {
      // TODO
    });


  });

}
