<?php
/**
 * ServerAndOrganizationsApiInterfaceTest
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
 * ServerAndOrganizationsApiInterfaceTest Class Doc Comment
 *
 * @category Class
 * @package  OpenAPI\Server\Tests\Api
 * @author   openapi-generator contributors
 * @link     https://github.com/openapitools/openapi-generator
 */
class ServerAndOrganizationsApiInterfaceTest extends WebTestCase
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
     * Test case for addCodePlayground
     *
     * Add a code playground.
     *
     */
    public function testAddCodePlayground()
    {
        $client = static::createClient();

        $path = '/realm/playgrounds';

        $crawler = $client->request('POST', $path);
    }

    /**
     * Test case for addLinkifier
     *
     * Add a linkifier.
     *
     */
    public function testAddLinkifier()
    {
        $client = static::createClient();

        $path = '/realm/filters';

        $crawler = $client->request('POST', $path);
    }

    /**
     * Test case for createCustomProfileField
     *
     * Create a custom profile field.
     *
     */
    public function testCreateCustomProfileField()
    {
        $client = static::createClient();

        $path = '/realm/profile_fields';

        $crawler = $client->request('POST', $path);
    }

    /**
     * Test case for getCustomEmoji
     *
     * Get all custom emoji.
     *
     */
    public function testGetCustomEmoji()
    {
        $client = static::createClient();

        $path = '/realm/emoji';

        $crawler = $client->request('GET', $path);
    }

    /**
     * Test case for getCustomProfileFields
     *
     * Get all custom profile fields.
     *
     */
    public function testGetCustomProfileFields()
    {
        $client = static::createClient();

        $path = '/realm/profile_fields';

        $crawler = $client->request('GET', $path);
    }

    /**
     * Test case for getLinkifiers
     *
     * Get linkifiers.
     *
     */
    public function testGetLinkifiers()
    {
        $client = static::createClient();

        $path = '/realm/linkifiers';

        $crawler = $client->request('GET', $path);
    }

    /**
     * Test case for getServerSettings
     *
     * Get server settings.
     *
     */
    public function testGetServerSettings()
    {
        $client = static::createClient();

        $path = '/server_settings';

        $crawler = $client->request('GET', $path);
    }

    /**
     * Test case for removeCodePlayground
     *
     * Remove a code playground.
     *
     */
    public function testRemoveCodePlayground()
    {
        $client = static::createClient();

        $path = '/realm/playgrounds/{playground_id}';
        $pattern = '{playgroundId}';
        $data = $this->genTestData('\d+');
        $path = str_replace($pattern, $data, $path);

        $crawler = $client->request('DELETE', $path);
    }

    /**
     * Test case for removeLinkifier
     *
     * Remove a linkifier.
     *
     */
    public function testRemoveLinkifier()
    {
        $client = static::createClient();

        $path = '/realm/filters/{filter_id}';
        $pattern = '{filterId}';
        $data = $this->genTestData('\d+');
        $path = str_replace($pattern, $data, $path);

        $crawler = $client->request('DELETE', $path);
    }

    /**
     * Test case for reorderCustomProfileFields
     *
     * Reorder custom profile fields.
     *
     */
    public function testReorderCustomProfileFields()
    {
        $client = static::createClient();

        $path = '/realm/profile_fields';

        $crawler = $client->request('PATCH', $path);
    }

    /**
     * Test case for updateLinkifier
     *
     * Update a linkifier.
     *
     */
    public function testUpdateLinkifier()
    {
        $client = static::createClient();

        $path = '/realm/filters/{filter_id}';
        $pattern = '{filterId}';
        $data = $this->genTestData('\d+');
        $path = str_replace($pattern, $data, $path);

        $crawler = $client->request('PATCH', $path);
    }

    /**
     * Test case for uploadCustomEmoji
     *
     * Upload custom emoji.
     *
     */
    public function testUploadCustomEmoji()
    {
        $client = static::createClient();

        $path = '/realm/emoji/{emoji_name}';
        $pattern = '{emojiName}';
        $data = $this->genTestData('[a-z0-9]+');
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
