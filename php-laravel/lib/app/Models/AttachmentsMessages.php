<?php
/**
 * AttachmentsMessages
 */
namespace app\Models;

/**
 * AttachmentsMessages
 */
class AttachmentsMessages {

    /** @var int $dateSent Time when the message was sent as a UNIX timestamp multiplied by 1000 (matching the format of getTime() in JavaScript).  **Changes**: Changed in Zulip 2.2 (feature level 22).  This field was previously strangely called &#x60;name&#x60; and was a floating point number.*/
    private $dateSent;

    /** @var int $id The unique message ID.  Messages should always be displayed sorted by ID.*/
    private $id;

}
