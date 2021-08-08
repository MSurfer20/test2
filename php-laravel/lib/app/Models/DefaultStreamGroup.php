<?php
/**
 * DefaultStreamGroup
 */
namespace app\Models;

/**
 * DefaultStreamGroup
 */
class DefaultStreamGroup {

    /** @var string $name Name of the default stream group.*/
    private $name;

    /** @var string $description Description of the default stream group.*/
    private $description;

    /** @var int $id id of the default stream group.*/
    private $id;

    /** @var \app\Models\BasicStream[] $streams Array containing details about the streams in the default stream group.*/
    private $streams;

}
