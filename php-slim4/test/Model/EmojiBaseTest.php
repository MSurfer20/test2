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
use OpenAPIServer\Model\EmojiBase;

/**
 * EmojiBaseTest Class Doc Comment
 *
 * @package OpenAPIServer\Model
 * @author  OpenAPI Generator team
 * @link    https://github.com/openapitools/openapi-generator
 *
 * @coversDefaultClass \OpenAPIServer\Model\EmojiBase
 */
class EmojiBaseTest extends TestCase
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
     * Test "EmojiBase"
     */
    public function testEmojiBase()
    {
        $testEmojiBase = new EmojiBase();
        $namespacedClassname = EmojiBase::getModelsNamespace() . '\\EmojiBase';
        $this->assertSame('\\' . EmojiBase::class, $namespacedClassname);
        $this->assertTrue(
            class_exists($namespacedClassname),
            sprintf('Assertion failed that "%s" class exists', $namespacedClassname)
        );
        $this->markTestIncomplete(
            'Test of "EmojiBase" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "emojiCode"
     */
    public function testPropertyEmojiCode()
    {
        $this->markTestIncomplete(
            'Test of "emojiCode" property in "EmojiBase" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "emojiName"
     */
    public function testPropertyEmojiName()
    {
        $this->markTestIncomplete(
            'Test of "emojiName" property in "EmojiBase" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "reactionType"
     */
    public function testPropertyReactionType()
    {
        $this->markTestIncomplete(
            'Test of "reactionType" property in "EmojiBase" model has not been implemented yet.'
        );
    }

    /**
     * Test getOpenApiSchema static method
     * @covers ::getOpenApiSchema
     */
    public function testGetOpenApiSchema()
    {
        $schemaArr = EmojiBase::getOpenApiSchema();
        $this->assertIsArray($schemaArr);
    }
}
