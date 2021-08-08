<?php
/**
 * UsersApiInterfaceTest
 * PHP version 7.1.3
 *
 * @category Class
 * @package  OpenAPI\Server\Tests\Api
 * @author   openapi-generator contributors
 * @link     https://github.com/openapitools/openapi-generator
 */

/**
 * Zulip REST API
 *
 * Powerful open source group chat
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 * Generated by: https://github.com/openapitools/openapi-generator.git
 *
 */

/**
 * NOTE: This class is auto generated by the openapi generator program.
 * https://github.com/openapitools/openapi-generator
 * Please update the test case below to test the endpoint.
 */

namespace OpenAPI\Server\Tests\Api;

use OpenAPI\Server\Configuration;
use OpenAPI\Server\ApiClient;
use OpenAPI\Server\ApiException;
use OpenAPI\Server\ObjectSerializer;
use Symfony\Bundle\FrameworkBundle\Test\WebTestCase;

/**
 * UsersApiInterfaceTest Class Doc Comment
 *
 * @category Class
 * @package  OpenAPI\Server\Tests\Api
 * @author   openapi-generator contributors
 * @link     https://github.com/openapitools/openapi-generator
 */
class UsersApiInterfaceTest extends WebTestCase
{

    /**
     * Setup before running any test cases
     */
    public static function setUpBeforeClass()
    {
    }

    /**
     * Setup before running each test case
     */
    public function setUp()
    {
    }

    /**
     * Clean up after running each test case
     */
    public function tearDown()
    {
    }

    /**
     * Clean up after running all test cases
     */
    public static function tearDownAfterClass()
    {
    }

    /**
     * Test case for createUser
     *
     * Create a user.
     *
     */
    public function testCreateUser()
    {
        $client = static::createClient();

        $path = '/users';

        $crawler = $client->request('POST', $path);
    }

    /**
     * Test case for createUserGroup
     *
     * Create a user group.
     *
     */
    public function testCreateUserGroup()
    {
        $client = static::createClient();

        $path = '/user_groups/create';

        $crawler = $client->request('POST', $path);
    }

    /**
     * Test case for deactivateOwnUser
     *
     * Deactivate own user.
     *
     */
    public function testDeactivateOwnUser()
    {
        $client = static::createClient();

        $path = '/users/me';

        $crawler = $client->request('DELETE', $path);
    }

    /**
     * Test case for deactivateUser
     *
     * Deactivate a user.
     *
     */
    public function testDeactivateUser()
    {
        $client = static::createClient();

        $path = '/users/{user_id}';
        $pattern = '{userId}';
        $data = $this->genTestData('\d+');
        $path = str_replace($pattern, $data, $path);

        $crawler = $client->request('DELETE', $path);
    }

    /**
     * Test case for getAttachments
     *
     * Get attachments.
     *
     */
    public function testGetAttachments()
    {
        $client = static::createClient();

        $path = '/attachments';

        $crawler = $client->request('GET', $path);
    }

    /**
     * Test case for getOwnUser
     *
     * Get own user.
     *
     */
    public function testGetOwnUser()
    {
        $client = static::createClient();

        $path = '/users/me';

        $crawler = $client->request('GET', $path);
    }

    /**
     * Test case for getUser
     *
     * Get a user.
     *
     */
    public function testGetUser()
    {
        $client = static::createClient();

        $path = '/users/{user_id}';
        $pattern = '{userId}';
        $data = $this->genTestData('\d+');
        $path = str_replace($pattern, $data, $path);

        $crawler = $client->request('GET', $path);
    }

    /**
     * Test case for getUserByEmail
     *
     * Get a user by email.
     *
     */
    public function testGetUserByEmail()
    {
        $client = static::createClient();

        $path = '/users/{email}';
        $pattern = '{email}';
        $data = $this->genTestData('[a-z0-9]+');
        $path = str_replace($pattern, $data, $path);

        $crawler = $client->request('GET', $path);
    }

    /**
     * Test case for getUserGroups
     *
     * Get user groups.
     *
     */
    public function testGetUserGroups()
    {
        $client = static::createClient();

        $path = '/user_groups';

        $crawler = $client->request('GET', $path);
    }

    /**
     * Test case for getUserPresence
     *
     * Get user presence.
     *
     */
    public function testGetUserPresence()
    {
        $client = static::createClient();

        $path = '/users/{user_id_or_email}/presence';
        $pattern = '{userIdOrEmail}';
        $data = $this->genTestData('[a-z0-9]+');
        $path = str_replace($pattern, $data, $path);

        $crawler = $client->request('GET', $path);
    }

    /**
     * Test case for getUsers
     *
     * Get all users.
     *
     */
    public function testGetUsers()
    {
        $client = static::createClient();

        $path = '/users';

        $crawler = $client->request('GET', $path);
    }

    /**
     * Test case for muteUser
     *
     * Mute a user.
     *
     */
    public function testMuteUser()
    {
        $client = static::createClient();

        $path = '/users/me/muted_users/{muted_user_id}';
        $pattern = '{mutedUserId}';
        $data = $this->genTestData('\d+');
        $path = str_replace($pattern, $data, $path);

        $crawler = $client->request('POST', $path);
    }

    /**
     * Test case for reactivateUser
     *
     * Reactivate a user.
     *
     */
    public function testReactivateUser()
    {
        $client = static::createClient();

        $path = '/users/{user_id}/reactivate';
        $pattern = '{userId}';
        $data = $this->genTestData('\d+');
        $path = str_replace($pattern, $data, $path);

        $crawler = $client->request('POST', $path);
    }

    /**
     * Test case for removeUserGroup
     *
     * Delete a user group.
     *
     */
    public function testRemoveUserGroup()
    {
        $client = static::createClient();

        $path = '/user_groups/{user_group_id}';
        $pattern = '{userGroupId}';
        $data = $this->genTestData('\d+');
        $path = str_replace($pattern, $data, $path);

        $crawler = $client->request('DELETE', $path);
    }

    /**
     * Test case for setTypingStatus
     *
     * Set \"typing\" status.
     *
     */
    public function testSetTypingStatus()
    {
        $client = static::createClient();

        $path = '/typing';

        $crawler = $client->request('POST', $path);
    }

    /**
     * Test case for unmuteUser
     *
     * Unmute a user.
     *
     */
    public function testUnmuteUser()
    {
        $client = static::createClient();

        $path = '/users/me/muted_users/{muted_user_id}';
        $pattern = '{mutedUserId}';
        $data = $this->genTestData('\d+');
        $path = str_replace($pattern, $data, $path);

        $crawler = $client->request('DELETE', $path);
    }

    /**
     * Test case for updateSettings
     *
     * Update settings.
     *
     */
    public function testUpdateSettings()
    {
        $client = static::createClient();

        $path = '/settings';

        $crawler = $client->request('PATCH', $path);
    }

    /**
     * Test case for updateStatus
     *
     * Update your status.
     *
     */
    public function testUpdateStatus()
    {
        $client = static::createClient();

        $path = '/users/me/status';

        $crawler = $client->request('POST', $path);
    }

    /**
     * Test case for updateUser
     *
     * Update a user.
     *
     */
    public function testUpdateUser()
    {
        $client = static::createClient();

        $path = '/users/{user_id}';
        $pattern = '{userId}';
        $data = $this->genTestData('\d+');
        $path = str_replace($pattern, $data, $path);

        $crawler = $client->request('PATCH', $path);
    }

    /**
     * Test case for updateUserGroup
     *
     * Update a user group.
     *
     */
    public function testUpdateUserGroup()
    {
        $client = static::createClient();

        $path = '/user_groups/{user_group_id}';
        $pattern = '{userGroupId}';
        $data = $this->genTestData('\d+');
        $path = str_replace($pattern, $data, $path);

        $crawler = $client->request('PATCH', $path);
    }

    /**
     * Test case for updateUserGroupMembers
     *
     * Update user group members.
     *
     */
    public function testUpdateUserGroupMembers()
    {
        $client = static::createClient();

        $path = '/user_groups/{user_group_id}/members';
        $pattern = '{userGroupId}';
        $data = $this->genTestData('\d+');
        $path = str_replace($pattern, $data, $path);

        $crawler = $client->request('POST', $path);
    }

    protected function genTestData($regexp)
    {
        $grammar  = new \Hoa\File\Read('hoa://Library/Regex/Grammar.pp');
        $compiler = \Hoa\Compiler\Llk\Llk::load($grammar);
        $ast      = $compiler->parse($regexp);
        $generator = new \Hoa\Regex\Visitor\Isotropic(new \Hoa\Math\Sampler\Random());

        return $generator->visit($ast); 
    }
}
