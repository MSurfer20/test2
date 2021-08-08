<?php
/**
 * EmojiReactionBaseAllOf
 */
namespace app\Models;

/**
 * EmojiReactionBaseAllOf
 */
class EmojiReactionBaseAllOf {

    /** @var int $userId The ID of the user who added the reaction.  **Changes**: New in Zulip 3.0 (feature level 2). The &#x60;user&#x60; object is deprecated and will be removed in the future.*/
    private $userId;

    /** @var \app\Models\EmojiReactionBaseAllOfUser $user */
    private $user;

}
