<?php
/**
 * BadEventQueueIdError
 */
namespace app\Models;

/**
 * BadEventQueueIdError
 */
class BadEventQueueIdError {

    /** @var mixed $result */
    private $result;

    /** @var mixed $msg */
    private $msg;

    /** @var mixed $code */
    private $code;

    /** @var string $queueId The string that identifies the invalid event queue.*/
    private $queueId;

}
