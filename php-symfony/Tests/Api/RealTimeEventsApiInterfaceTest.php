<?php
/**
 * RealTimeEventsApiInterfaceTest
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
 * RealTimeEventsApiInterfaceTest Class Doc Comment
 *
 * @category Class
 * @package  OpenAPI\Server\Tests\Api
 * @author   openapi-generator contributors
 * @link     https://github.com/openapitools/openapi-generator
 */
class RealTimeEventsApiInterfaceTest extends WebTestCase
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
     * Test case for deleteQueue
     *
     * Delete an event queue.
     *
     */
    public function testDeleteQueue()
    {
        $client = static::createClient();

        $path = '/events';

        $crawler = $client->request('DELETE', $path);
    }

    /**
     * Test case for getEvents
     *
     * Get events from an event queue.
     *
     */
    public function testGetEvents()
    {
        $client = static::createClient();

        $path = '/events';

        $crawler = $client->request('GET', $path);
    }

    /**
     * Test case for realTimePost
     *
     * .
     *
     */
    public function testRealTimePost()
    {
        $client = static::createClient();

        $path = '/real-time';

        $crawler = $client->request('POST', $path);
    }

    /**
     * Test case for registerQueue
     *
     * Register an event queue.
     *
     */
    public function testRegisterQueue()
    {
        $client = static::createClient();

        $path = '/register';

        $crawler = $client->request('POST', $path);
    }

    /**
     * Test case for restErrorHandling
     *
     * Error handling.
     *
     */
    public function testRestErrorHandling()
    {
        $client = static::createClient();

        $path = '/rest-error-handling';

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