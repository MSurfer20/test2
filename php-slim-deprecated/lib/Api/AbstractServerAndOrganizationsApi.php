<?php
/**
 * AbstractServerAndOrganizationsApi
 *
 * PHP version 7
 *
 * @package OpenAPIServer\Api
 * @author  OpenAPI Generator team
 * @link    https://github.com/openapitools/openapi-generator
 */

/**
 * Zulip REST API
 *
 * Powerful open source group chat
 * The version of the OpenAPI document: 1.0.0
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */

/**
 * NOTE: This class is auto generated by the openapi generator program.
 * https://github.com/openapitools/openapi-generator
 * Do not edit the class manually.
 */
namespace OpenAPIServer\Api;

use Psr\Container\ContainerInterface;
use Psr\Http\Message\ServerRequestInterface;
use Psr\Http\Message\ResponseInterface;
use Exception;

/**
 * AbstractServerAndOrganizationsApi Class Doc Comment
 *
 * @package OpenAPIServer\Api
 * @author  OpenAPI Generator team
 * @link    https://github.com/openapitools/openapi-generator
 */
abstract class AbstractServerAndOrganizationsApi
{

    /**
     * @var ContainerInterface Slim app container instance
     */
    protected $container;

    /**
     * Route Controller constructor receives container
     *
     * @param ContainerInterface $container Slim app container instance
     */
    public function __construct(ContainerInterface $container)
    {
        $this->container = $container;
    }


    /**
     * POST addCodePlayground
     * Summary: Add a code playground
     * Notes: Configure [code playgrounds](/help/code-blocks#code-playgrounds) for the organization.  &#x60;POST {{ api_url }}/v1/realm/playgrounds&#x60;  **Changes**: New in Zulip 4.0 (feature level 49). A parameter encoding bug was fixed in Zulip 4.0 (feature level 57).
     * Output-Formats: [application/json]
     *
     * @param ServerRequestInterface $request  Request
     * @param ResponseInterface      $response Response
     * @param array|null             $args     Path arguments
     *
     * @return ResponseInterface
     * @throws Exception to force implementation class to override this method
     */
    public function addCodePlayground(ServerRequestInterface $request, ResponseInterface $response, array $args)
    {
        $queryParams = $request->getQueryParams();
        $name = $request->getQueryParam('name');
        $pygmentsLanguage = $request->getQueryParam('pygments_language');
        $urlPrefix = $request->getQueryParam('url_prefix');
        $message = "How about implementing addCodePlayground as a POST method in OpenAPIServer\Api\ServerAndOrganizationsApi class?";
        throw new Exception($message);

        return $response->write($message)->withStatus(501);
    }

    /**
     * POST addLinkifier
     * Summary: Add a linkifier
     * Notes: Configure [linkifiers](/help/add-a-custom-linkifier), regular expression patterns that are automatically linkified when they appear in messages and topics.  &#x60;POST {{ api_url }}/v1/realm/filters&#x60;
     * Output-Formats: [application/json]
     *
     * @param ServerRequestInterface $request  Request
     * @param ResponseInterface      $response Response
     * @param array|null             $args     Path arguments
     *
     * @return ResponseInterface
     * @throws Exception to force implementation class to override this method
     */
    public function addLinkifier(ServerRequestInterface $request, ResponseInterface $response, array $args)
    {
        $queryParams = $request->getQueryParams();
        $pattern = $request->getQueryParam('pattern');
        $urlFormatString = $request->getQueryParam('url_format_string');
        $message = "How about implementing addLinkifier as a POST method in OpenAPIServer\Api\ServerAndOrganizationsApi class?";
        throw new Exception($message);

        return $response->write($message)->withStatus(501);
    }

    /**
     * POST createCustomProfileField
     * Summary: Create a custom profile field
     * Notes: [Create a custom profile field](/help/add-custom-profile-fields) in the user&#39;s organization.  &#x60;POST {{ api_url }}/v1/realm/profile_fields&#x60;
     * Output-Formats: [application/json]
     *
     * @param ServerRequestInterface $request  Request
     * @param ResponseInterface      $response Response
     * @param array|null             $args     Path arguments
     *
     * @return ResponseInterface
     * @throws Exception to force implementation class to override this method
     */
    public function createCustomProfileField(ServerRequestInterface $request, ResponseInterface $response, array $args)
    {
        $queryParams = $request->getQueryParams();
        $name = $request->getQueryParam('name');
        $hint = $request->getQueryParam('hint');
        $fieldType = $request->getQueryParam('field_type');
        $fieldData = $request->getQueryParam('field_data');
        $message = "How about implementing createCustomProfileField as a POST method in OpenAPIServer\Api\ServerAndOrganizationsApi class?";
        throw new Exception($message);

        return $response->write($message)->withStatus(501);
    }

    /**
     * GET getCustomEmoji
     * Summary: Get all custom emoji
     * Notes: Get all the custom emoji in the user&#39;s organization.  &#x60;GET {{ api_url }}/v1/realm/emoji&#x60;
     * Output-Formats: [application/json]
     *
     * @param ServerRequestInterface $request  Request
     * @param ResponseInterface      $response Response
     * @param array|null             $args     Path arguments
     *
     * @return ResponseInterface
     * @throws Exception to force implementation class to override this method
     */
    public function getCustomEmoji(ServerRequestInterface $request, ResponseInterface $response, array $args)
    {
        $message = "How about implementing getCustomEmoji as a GET method in OpenAPIServer\Api\ServerAndOrganizationsApi class?";
        throw new Exception($message);

        return $response->write($message)->withStatus(501);
    }

    /**
     * GET getCustomProfileFields
     * Summary: Get all custom profile fields
     * Notes: Get all the [custom profile fields](/help/add-custom-profile-fields) configured for the user&#39;s organization.  &#x60;GET {{ api_url }}/v1/realm/profile_fields&#x60;
     * Output-Formats: [application/json]
     *
     * @param ServerRequestInterface $request  Request
     * @param ResponseInterface      $response Response
     * @param array|null             $args     Path arguments
     *
     * @return ResponseInterface
     * @throws Exception to force implementation class to override this method
     */
    public function getCustomProfileFields(ServerRequestInterface $request, ResponseInterface $response, array $args)
    {
        $message = "How about implementing getCustomProfileFields as a GET method in OpenAPIServer\Api\ServerAndOrganizationsApi class?";
        throw new Exception($message);

        return $response->write($message)->withStatus(501);
    }

    /**
     * GET getLinkifiers
     * Summary: Get linkifiers
     * Notes: List all of an organization&#39;s configured [linkifiers](/help/add-a-custom-linkifier), regular expression patterns that are automatically linkified when they appear in messages and topics.  &#x60;GET {{ api_url }}/v1/realm/linkifiers&#x60;  **Changes**: New in Zulip 4.0 (feature level 54). On older versions, a similar &#x60;GET /realm/filters&#x60; endpoint was available with each entry in a &#x60;[pattern, url_format, id]&#x60; tuple format.
     * Output-Formats: [application/json]
     *
     * @param ServerRequestInterface $request  Request
     * @param ResponseInterface      $response Response
     * @param array|null             $args     Path arguments
     *
     * @return ResponseInterface
     * @throws Exception to force implementation class to override this method
     */
    public function getLinkifiers(ServerRequestInterface $request, ResponseInterface $response, array $args)
    {
        $message = "How about implementing getLinkifiers as a GET method in OpenAPIServer\Api\ServerAndOrganizationsApi class?";
        throw new Exception($message);

        return $response->write($message)->withStatus(501);
    }

    /**
     * GET getServerSettings
     * Summary: Get server settings
     * Notes: Fetch global settings for a Zulip server.  &#x60;GET {{ api_url }}/v1/server_settings&#x60;  **Note:** this endpoint does not require any authentication at all, and you can use it to check:  * If this is a Zulip server, and if so, what version of Zulip it&#39;s running. * What a Zulip client (e.g. a mobile app or [zulip-terminal](https://github.com/zulip/zulip-terminal/)) needs to know in order to display a login prompt for the server (e.g. what authentication methods are available).
     * Output-Formats: [application/json]
     *
     * @param ServerRequestInterface $request  Request
     * @param ResponseInterface      $response Response
     * @param array|null             $args     Path arguments
     *
     * @return ResponseInterface
     * @throws Exception to force implementation class to override this method
     */
    public function getServerSettings(ServerRequestInterface $request, ResponseInterface $response, array $args)
    {
        $message = "How about implementing getServerSettings as a GET method in OpenAPIServer\Api\ServerAndOrganizationsApi class?";
        throw new Exception($message);

        return $response->write($message)->withStatus(501);
    }

    /**
     * DELETE removeCodePlayground
     * Summary: Remove a code playground
     * Notes: Remove a [code playground](/help/code-blocks#code-playgrounds) previously configured for an organization.  &#x60;DELETE {{ api_url }}/v1/realm/playgrounds/{playground_id}&#x60;  **Changes**: New in Zulip 4.0 (feature level 49).
     * Output-Formats: [application/json]
     *
     * @param ServerRequestInterface $request  Request
     * @param ResponseInterface      $response Response
     * @param array|null             $args     Path arguments
     *
     * @return ResponseInterface
     * @throws Exception to force implementation class to override this method
     */
    public function removeCodePlayground(ServerRequestInterface $request, ResponseInterface $response, array $args)
    {
        $playgroundId = $args['playground_id'];
        $message = "How about implementing removeCodePlayground as a DELETE method in OpenAPIServer\Api\ServerAndOrganizationsApi class?";
        throw new Exception($message);

        return $response->write($message)->withStatus(501);
    }

    /**
     * DELETE removeLinkifier
     * Summary: Remove a linkifier
     * Notes: Remove [linkifiers](/help/add-a-custom-linkifier), regular expression patterns that are automatically linkified when they appear in messages and topics.  &#x60;DELETE {{ api_url }}/v1/realm/filters/{filter_id}&#x60;
     * Output-Formats: [application/json]
     *
     * @param ServerRequestInterface $request  Request
     * @param ResponseInterface      $response Response
     * @param array|null             $args     Path arguments
     *
     * @return ResponseInterface
     * @throws Exception to force implementation class to override this method
     */
    public function removeLinkifier(ServerRequestInterface $request, ResponseInterface $response, array $args)
    {
        $filterId = $args['filter_id'];
        $message = "How about implementing removeLinkifier as a DELETE method in OpenAPIServer\Api\ServerAndOrganizationsApi class?";
        throw new Exception($message);

        return $response->write($message)->withStatus(501);
    }

    /**
     * PATCH reorderCustomProfileFields
     * Summary: Reorder custom profile fields
     * Notes: Reorder the custom profile fields in the user&#39;s organization.  &#x60;PATCH {{ api_url }}/v1/realm/profile_fields&#x60;  Custom profile fields are displayed in Zulip UI widgets in order; this endpoint allows administrative settings UI to change the field ordering.  This endpoint is used to implement the dragging feature described in the [custom profile fields documentation](/help/add-custom-profile-fields).
     * Output-Formats: [application/json]
     *
     * @param ServerRequestInterface $request  Request
     * @param ResponseInterface      $response Response
     * @param array|null             $args     Path arguments
     *
     * @return ResponseInterface
     * @throws Exception to force implementation class to override this method
     */
    public function reorderCustomProfileFields(ServerRequestInterface $request, ResponseInterface $response, array $args)
    {
        $queryParams = $request->getQueryParams();
        $order = $request->getQueryParam('order');
        $message = "How about implementing reorderCustomProfileFields as a PATCH method in OpenAPIServer\Api\ServerAndOrganizationsApi class?";
        throw new Exception($message);

        return $response->write($message)->withStatus(501);
    }

    /**
     * PATCH updateLinkifier
     * Summary: Update a linkifier
     * Notes: Update a [linkifier](/help/add-a-custom-linkifier), regular expression patterns that are automatically linkified when they appear in messages and topics.  &#x60;PATCH {{ api_url }}/v1/realm/filters/{filter_id}&#x60;  **Changes**: New in Zulip 4.0 (feature level 57).
     * Output-Formats: [application/json]
     *
     * @param ServerRequestInterface $request  Request
     * @param ResponseInterface      $response Response
     * @param array|null             $args     Path arguments
     *
     * @return ResponseInterface
     * @throws Exception to force implementation class to override this method
     */
    public function updateLinkifier(ServerRequestInterface $request, ResponseInterface $response, array $args)
    {
        $filterId = $args['filter_id'];
        $queryParams = $request->getQueryParams();
        $pattern = $request->getQueryParam('pattern');
        $urlFormatString = $request->getQueryParam('url_format_string');
        $message = "How about implementing updateLinkifier as a PATCH method in OpenAPIServer\Api\ServerAndOrganizationsApi class?";
        throw new Exception($message);

        return $response->write($message)->withStatus(501);
    }

    /**
     * POST uploadCustomEmoji
     * Summary: Upload custom emoji
     * Notes: This endpoint is used to upload a custom emoji for use in the user&#39;s organization.  Access to this endpoint depends on the [organization&#39;s configuration](https://zulip.com/help/only-allow-admins-to-add-emoji).  &#x60;POST {{ api_url }}/v1/realm/emoji/{emoji_name}&#x60;
     * Output-Formats: [application/json]
     *
     * @param ServerRequestInterface $request  Request
     * @param ResponseInterface      $response Response
     * @param array|null             $args     Path arguments
     *
     * @return ResponseInterface
     * @throws Exception to force implementation class to override this method
     */
    public function uploadCustomEmoji(ServerRequestInterface $request, ResponseInterface $response, array $args)
    {
        $emojiName = $args['emoji_name'];
        $filename = (key_exists('filename', $request->getUploadedFiles())) ? $request->getUploadedFiles()['filename'] : null;
        $message = "How about implementing uploadCustomEmoji as a POST method in OpenAPIServer\Api\ServerAndOrganizationsApi class?";
        throw new Exception($message);

        return $response->write($message)->withStatus(501);
    }
}