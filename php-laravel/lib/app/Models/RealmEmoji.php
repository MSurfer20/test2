<?php
/**
 * RealmEmoji
 */
namespace app\Models;

/**
 * RealmEmoji
 */
class RealmEmoji {

    /** @var string $id The ID for this emoji, same as the object&#39;s key.*/
    private $id;

    /** @var string $name The user-friendly name for this emoji. Users in the organization can use this emoji by writing this name between colons (&#x60;:name  :&#x60;).*/
    private $name;

    /** @var string $sourceUrl The path relative to the organization&#39;s URL where the emoji&#39;s image can be found.*/
    private $sourceUrl;

    /** @var bool $deactivated Whether the emoji has been deactivated or not.*/
    private $deactivated;

    /** @var int $authorId The user ID of the user who uploaded the custom emoji. Will be null if the uploader is unknown.  **Changes**: New in Zulip 3.0 (feature level 7).  Previously was accessible via and &#x60;author&#x60; object with an &#x60;id&#x60; field.*/
    private $authorId;

}
