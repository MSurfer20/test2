<?php
/**
 * UserGroup
 */
namespace app\Models;

/**
 * UserGroup
 */
class UserGroup {

    /** @var string $name The name of the user group.*/
    private $name;

    /** @var string $description The description of the user group.*/
    private $description;

    /** @var int[] $members Array containing the id of the users who are members of this user group.*/
    private $members;

    /** @var int $id The ID of the user group.*/
    private $id;

}
