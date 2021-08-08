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
use OpenAPIServer\Model\UserBase;

/**
 * UserBaseTest Class Doc Comment
 *
 * @package OpenAPIServer\Model
 * @author  OpenAPI Generator team
 * @link    https://github.com/openapitools/openapi-generator
 *
 * @coversDefaultClass \OpenAPIServer\Model\UserBase
 */
class UserBaseTest extends TestCase
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
     * Test "UserBase"
     */
    public function testUserBase()
    {
        $testUserBase = new UserBase();
        $namespacedClassname = UserBase::getModelsNamespace() . '\\UserBase';
        $this->assertSame('\\' . UserBase::class, $namespacedClassname);
        $this->assertTrue(
            class_exists($namespacedClassname),
            sprintf('Assertion failed that "%s" class exists', $namespacedClassname)
        );
        $this->markTestIncomplete(
            'Test of "UserBase" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "email"
     */
    public function testPropertyEmail()
    {
        $this->markTestIncomplete(
            'Test of "email" property in "UserBase" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "isBot"
     */
    public function testPropertyIsBot()
    {
        $this->markTestIncomplete(
            'Test of "isBot" property in "UserBase" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "avatarUrl"
     */
    public function testPropertyAvatarUrl()
    {
        $this->markTestIncomplete(
            'Test of "avatarUrl" property in "UserBase" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "avatarVersion"
     */
    public function testPropertyAvatarVersion()
    {
        $this->markTestIncomplete(
            'Test of "avatarVersion" property in "UserBase" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "fullName"
     */
    public function testPropertyFullName()
    {
        $this->markTestIncomplete(
            'Test of "fullName" property in "UserBase" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "isAdmin"
     */
    public function testPropertyIsAdmin()
    {
        $this->markTestIncomplete(
            'Test of "isAdmin" property in "UserBase" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "isOwner"
     */
    public function testPropertyIsOwner()
    {
        $this->markTestIncomplete(
            'Test of "isOwner" property in "UserBase" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "isBillingAdmin"
     */
    public function testPropertyIsBillingAdmin()
    {
        $this->markTestIncomplete(
            'Test of "isBillingAdmin" property in "UserBase" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "role"
     */
    public function testPropertyRole()
    {
        $this->markTestIncomplete(
            'Test of "role" property in "UserBase" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "botType"
     */
    public function testPropertyBotType()
    {
        $this->markTestIncomplete(
            'Test of "botType" property in "UserBase" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "userId"
     */
    public function testPropertyUserId()
    {
        $this->markTestIncomplete(
            'Test of "userId" property in "UserBase" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "botOwnerId"
     */
    public function testPropertyBotOwnerId()
    {
        $this->markTestIncomplete(
            'Test of "botOwnerId" property in "UserBase" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "isActive"
     */
    public function testPropertyIsActive()
    {
        $this->markTestIncomplete(
            'Test of "isActive" property in "UserBase" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "isGuest"
     */
    public function testPropertyIsGuest()
    {
        $this->markTestIncomplete(
            'Test of "isGuest" property in "UserBase" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "timezone"
     */
    public function testPropertyTimezone()
    {
        $this->markTestIncomplete(
            'Test of "timezone" property in "UserBase" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "dateJoined"
     */
    public function testPropertyDateJoined()
    {
        $this->markTestIncomplete(
            'Test of "dateJoined" property in "UserBase" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "deliveryEmail"
     */
    public function testPropertyDeliveryEmail()
    {
        $this->markTestIncomplete(
            'Test of "deliveryEmail" property in "UserBase" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "profileData"
     */
    public function testPropertyProfileData()
    {
        $this->markTestIncomplete(
            'Test of "profileData" property in "UserBase" model has not been implemented yet.'
        );
    }

    /**
     * Test getOpenApiSchema static method
     * @covers ::getOpenApiSchema
     */
    public function testGetOpenApiSchema()
    {
        $schemaArr = UserBase::getOpenApiSchema();
        $this->assertIsArray($schemaArr);
    }
}
