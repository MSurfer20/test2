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
use OpenAPIServer\Model\JsonErrorBaseAllOf;

/**
 * JsonErrorBaseAllOfTest Class Doc Comment
 *
 * @package OpenAPIServer\Model
 * @author  OpenAPI Generator team
 * @link    https://github.com/openapitools/openapi-generator
 *
 * @coversDefaultClass \OpenAPIServer\Model\JsonErrorBaseAllOf
 */
class JsonErrorBaseAllOfTest extends TestCase
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
     * Test "JsonErrorBaseAllOf"
     */
    public function testJsonErrorBaseAllOf()
    {
        $testJsonErrorBaseAllOf = new JsonErrorBaseAllOf();
        $namespacedClassname = JsonErrorBaseAllOf::getModelsNamespace() . '\\JsonErrorBaseAllOf';
        $this->assertSame('\\' . JsonErrorBaseAllOf::class, $namespacedClassname);
        $this->assertTrue(
            class_exists($namespacedClassname),
            sprintf('Assertion failed that "%s" class exists', $namespacedClassname)
        );
        $this->markTestIncomplete(
            'Test of "JsonErrorBaseAllOf" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "result"
     */
    public function testPropertyResult()
    {
        $this->markTestIncomplete(
            'Test of "result" property in "JsonErrorBaseAllOf" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "msg"
     */
    public function testPropertyMsg()
    {
        $this->markTestIncomplete(
            'Test of "msg" property in "JsonErrorBaseAllOf" model has not been implemented yet.'
        );
    }

    /**
     * Test getOpenApiSchema static method
     * @covers ::getOpenApiSchema
     */
    public function testGetOpenApiSchema()
    {
        $schemaArr = JsonErrorBaseAllOf::getOpenApiSchema();
        $this->assertIsArray($schemaArr);
    }
}
