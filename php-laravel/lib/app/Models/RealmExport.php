<?php
/**
 * RealmExport
 */
namespace app\Models;

/**
 * RealmExport
 */
class RealmExport {

    /** @var int $id The id of the export.*/
    private $id;

    /** @var int $actingUserId The id of the user who did the export.*/
    private $actingUserId;

    /** @var float $exportTime The UNIX timestamp of when the export was made.*/
    private $exportTime;

    /** @var float $deletedTimestamp The timestamp of when the export was deleted. Null if it wasn&#39;t.*/
    private $deletedTimestamp;

    /** @var float $failedTimestamp The timestamp of when the export failed. Null if it didn&#39;t.*/
    private $failedTimestamp;

    /** @var string $exportUrl The URL of the export. &#x60;null&#x60; if there&#39;s no URL.*/
    private $exportUrl;

    /** @var bool $pending Whether the export is pending or not.*/
    private $pending;

}
