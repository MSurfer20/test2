
# Table `RealmPlayground` 
(mapped from: RealmPlayground)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**id** | id | int PRIMARY KEY AUTOINCREMENT |  | **kotlin.Int** | The unique ID for the realm playground.  |  [optional]
**name** | name | text |  | **kotlin.String** | The user-visible display name of the playground.  Clients should display this in UI for picking which playground to open a code block in, to differentiate between multiple configured playground options for a given pygments language.  **Changes**: New in Zulip 4.0 (feature level 49).  |  [optional]
**pygmentsLanguage** | pygments_language | text |  | **kotlin.String** | The name of the Pygments language lexer for that programming language.  |  [optional]
**urlPrefix** | url_prefix | text |  | **kotlin.String** | The url prefix for the playground.  |  [optional]






