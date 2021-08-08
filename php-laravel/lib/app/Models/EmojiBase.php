<?php
/**
 * EmojiBase
 */
namespace app\Models;

/**
 * EmojiBase
 */
class EmojiBase {

    /** @var string $emojiCode A unique identifier, defining the specific emoji codepoint requested, within the namespace of the &#x60;reaction_type&#x60;.  For example, for &#x60;unicode_emoji&#x60;, this will be an encoding of the Unicode codepoint; for &#x60;realm_emoji&#x60;, it&#39;ll be the ID of the realm emoji.*/
    private $emojiCode;

    /** @var string $emojiName Name of the emoji.*/
    private $emojiName;

    /** @var string $reactionType One of the following values:  * &#x60;unicode_emoji&#x60;: Unicode emoji (&#x60;emoji_code&#x60; will be its Unicode   codepoint). * &#x60;realm_emoji&#x60;: [Custom emoji](/help/add-custom-emoji).   (&#x60;emoji_code&#x60; will be its ID). * &#x60;zulip_extra_emoji&#x60;: Special emoji included with Zulip.  Exists to   namespace the &#x60;zulip&#x60; emoji.*/
    private $reactionType;

}
