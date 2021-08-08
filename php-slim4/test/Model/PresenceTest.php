<?php

/**
 * Zulip REST API
 * PHP version 7.2
 *
 * @package OpenAPIServer
 * @author  OpenAPI Generator team
 * @link    https://github.com/openapitools/openapi-generator
 */

/**
 * Powerful open source group chat
 * The version of the OpenAPI document: 1.0.0
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */

/**
 * NOTE: This class is auto generated by the openapi generator program.
 * https://github.com/openapitools/openapi-generator
 * Please update the test case below to test the model.
 */
namespace OpenAPIServer\Model;

use PHPUnit\Framework\TestCase;
use OpenAPIServer\Model\Presence;

/**
 * PresenceTest Class Doc Comment
 *
 * @package OpenAPIServer\Model
 * @author  OpenAPI Generator team
 * @link    https://github.com/openapitools/openapi-generator
 *
 * @coversDefaultClass \OpenAPIServer\Model\Presence
 */
class PresenceTest extends TestCase
{

    /**
     * Setup before running any test cases
     */
    public static function setUpBeforeClass(): void
    {
    }

    /**
     * Setup before running each test case
     */
    public function setUp(): void
    {
    }

    /**
     * Clean up after running each test case
     */
    public function tearDown(): void
    {
    }

    /**
     * Clean up after running all test cases
     */
    public static function tearDownAfterClass(): void
    {
    }

    /**
     * Test "Presence"
     */
    public function testPresence()
    {
        $testPresence = new Presence();
        $namespacedClassname = Presence::getModelsNamespace() . '\\Presence';
        $this->assertSame('\\' . Presence::class, $namespacedClassname);
        $this->assertTrue(
            class_exists($namespacedClassname),
            sprintf('Assertion failed that "%s" class exists', $namespacedClassname)
        );
        $this->markTestIncomplete(
            'Test of "Presence" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "client"
     */
    public function testPropertyClient()
    {
        $this->markTestIncomplete(
            'Test of "client" property in "Presence" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "status"
     */
    public function testPropertyStatus()
    {
        $this->markTestIncomplete(
            'Test of "status" property in "Presence" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "timestamp"
     */
    public function testPropertyTimestamp()
    {
        $this->markTestIncomplete(
            'Test of "timestamp" property in "Presence" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "pushable"
     */
    public function testPropertyPushable()
    {
        $this->markTestIncomplete(
            'Test of "pushable" property in "Presence" model has not been implemented yet.'
        );
    }

    /**
     * Test getOpenApiSchema static method
     * @covers ::getOpenApiSchema
     */
    public function testGetOpenApiSchema()
    {
        $schemaArr = Presence::getOpenApiSchema();
        $this->assertIsArray($schemaArr);
    }
}
