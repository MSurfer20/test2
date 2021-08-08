<?php
/**
 * MissingArgumentError
 */
namespace app\Models;

/**
 * MissingArgumentError
 */
class MissingArgumentError {

    /** @var mixed $result */
    private $result;

    /** @var mixed $msg */
    private $msg;

    /** @var mixed $code */
    private $code;

    /** @var string $varName It contains the information about the missing parameter.*/
    private $varName;

}
