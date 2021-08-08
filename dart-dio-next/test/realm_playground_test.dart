import 'package:test/test.dart';
import 'package:openapi/openapi.dart';

// tests for RealmPlayground
void main() {
  final instance = RealmPlaygroundBuilder();
  // TODO add properties to the builder and call build()

  group(RealmPlayground, () {
    // The unique ID for the realm playground. 
    // int id
    test('to test the property `id`', () async {
      // TODO
    });

    // The user-visible display name of the playground.  Clients should display this in UI for picking which playground to open a code block in, to differentiate between multiple configured playground options for a given pygments language.  **Changes**: New in Zulip 4.0 (feature level 49). 
    // String name
    test('to test the property `name`', () async {
      // TODO
    });

    // The name of the Pygments language lexer for that programming language. 
    // String pygmentsLanguage
    test('to test the property `pygmentsLanguage`', () async {
      // TODO
    });

    // The url prefix for the playground. 
    // String urlPrefix
    test('to test the property `urlPrefix`', () async {
      // TODO
    });

  });
}
