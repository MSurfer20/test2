<?php
/**
 * Hotspot
 */
namespace app\Models;

/**
 * Hotspot
 */
class Hotspot {

    /** @var float $delay The delay after which the user should be shown the hotspot.*/
    private $delay;

    /** @var string $name The name of the hotspot.*/
    private $name;

    /** @var string $title The title of the hotspot, as will be displayed to the user.*/
    private $title;

    /** @var string $description The description of the hotspot, as will be displayed to the user.*/
    private $description;

}
