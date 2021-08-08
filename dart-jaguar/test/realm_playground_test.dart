import 'package:openapi/api.dart';
import 'package:test/test.dart';

// tests for RealmPlayground
void main() {
  var instance = new RealmPlayground();

  group('test RealmPlayground', () {
    // The unique ID for the realm playground. 
    // int id (default value: null)
    test('to test the property `id`', () async {
      // TODO
    });

    // The user-visible display name of the playground.  Clients should display this in UI for picking which playground to open a code block in, to differentiate between multiple configured playground options for a given pygments language.  **Changes**: New in Zulip 4.0 (feature level 49). 
    // String name (default value: null)
    test('to test the property `name`', () async {
      // TODO
    });

    // The name of the Pygments language lexer for that programming language. 
    // String pygmentsLanguage (default value: null)
    test('to test the property `pygmentsLanguage`', () async {
      // TODO
    });

    // The url prefix for the playground. 
    // String urlPrefix (default value: null)
    test('to test the property `urlPrefix`', () async {
      // TODO
    });


  });

}
