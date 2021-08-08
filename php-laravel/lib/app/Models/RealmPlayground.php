<?php
/**
 * RealmPlayground
 */
namespace app\Models;

/**
 * RealmPlayground
 */
class RealmPlayground {

    /** @var int $id The unique ID for the realm playground.*/
    private $id;

    /** @var string $name The user-visible display name of the playground.  Clients should display this in UI for picking which playground to open a code block in, to differentiate between multiple configured playground options for a given pygments language.  **Changes**: New in Zulip 4.0 (feature level 49).*/
    private $name;

    /** @var string $pygmentsLanguage The name of the Pygments language lexer for that programming language.*/
    private $pygmentsLanguage;

    /** @var string $urlPrefix The url prefix for the playground.*/
    private $urlPrefix;

}
