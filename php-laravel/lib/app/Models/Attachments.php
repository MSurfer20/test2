<?php
/**
 * Attachments
 */
namespace app\Models;

/**
 * Attachments
 */
class Attachments {

    /** @var int $id The unique ID for the attachment.*/
    private $id;

    /** @var string $name Name of the uploaded file.*/
    private $name;

    /** @var string $pathId A representation of the path of the file within the repository of user-uploaded files.  If the &#x60;path_id&#x60; of a file is &#x60;{realm_id}/ab/cdef/temp_file.py&#x60;, its URL will be: &#x60;{server_url}/user_uploads/{realm_id}/ab/cdef/temp_file.py&#x60;.*/
    private $pathId;

    /** @var int $size Size of the file in bytes.*/
    private $size;

    /** @var int $createTime Time when the attachment was uploaded as a UNIX timestamp multiplied by 1000 (matching the format of getTime() in JavaScript).  **Changes**: Changed in Zulip 2.2 (feature level 22).  This field was previously a floating point number.*/
    private $createTime;

    /** @var \app\Models\AttachmentsMessages[] $messages Contains basic details on any Zulip messages that have been sent referencing this [uploaded file](/api/upload-file). This includes messages sent by any user in the Zulip organization who sent a message containing a link to the uploaded file.*/
    private $messages;

}
