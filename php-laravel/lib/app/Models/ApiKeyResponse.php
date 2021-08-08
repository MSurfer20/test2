<?php
/**
 * ApiKeyResponse
 */
namespace app\Models;

/**
 * ApiKeyResponse
 */
class ApiKeyResponse {

    /** @var mixed $result */
    private $result;

    /** @var mixed $msg */
    private $msg;

    /** @var string $apiKey The API key that can be used to authenticate as the requested user.*/
    private $apiKey;

    /** @var string $email The email address of the user who owns the API key*/
    private $email;

}
