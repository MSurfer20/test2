/**
 * Zulip REST API
 * Powerful open source group chat 
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package org.openapitools.client.api

import java.io.File
import org.openapitools.client.model.JsonSuccess
import org.openapitools.client.model.JsonSuccessBase
import org.openapitools.client.core.JsonSupport._
import sttp.client._
import sttp.model.Method

object ServerAndOrganizationsApi {

def apply(baseUrl: String = "https://example.zulipchat.com/api/v1") = new ServerAndOrganizationsApi(baseUrl)
}

class ServerAndOrganizationsApi(baseUrl: String) {

  /**
   * Configure [code playgrounds](/help/code-blocks#code-playgrounds) for the organization.  `POST {{ api_url }}/v1/realm/playgrounds`  **Changes**: New in Zulip 4.0 (feature level 49). A parameter encoding bug was fixed in Zulip 4.0 (feature level 57). 
   * 
   * Expected answers:
   *   code 200 : JsonSuccessBase (Success.)
   * 
   * @param name The user-visible display name of the playground which can be used to pick the target playground, especially when multiple playground options exist for that programming language. 
   * @param pygmentsLanguage The name of the Pygments language lexer for that programming language. 
   * @param urlPrefix The url prefix for the playground. 
   */
  def addCodePlayground(name: String, pygmentsLanguage: String, urlPrefix: String
): Request[Either[ResponseError[Exception], JsonSuccessBase], Nothing] =
    basicRequest
      .method(Method.POST, uri"$baseUrl/realm/playgrounds?name=${ name }&pygments_language=${ pygmentsLanguage }&url_prefix=${ urlPrefix }")
      .contentType("application/json")
      .response(asJson[JsonSuccessBase])

  /**
   * Configure [linkifiers](/help/add-a-custom-linkifier), regular expression patterns that are automatically linkified when they appear in messages and topics.  `POST {{ api_url }}/v1/realm/filters` 
   * 
   * Expected answers:
   *   code 200 : JsonSuccessBase (Success.)
   * 
   * @param pattern The [Python regular expression](https://docs.python.org/3/howto/regex.html) that should trigger the linkifier. 
   * @param urlFormatString The URL used for the link. If you used named groups for the `pattern`, you can insert their content here with `%(name_of_the_capturing_group)s`. 
   */
  def addLinkifier(pattern: String, urlFormatString: String
): Request[Either[ResponseError[Exception], JsonSuccessBase], Nothing] =
    basicRequest
      .method(Method.POST, uri"$baseUrl/realm/filters?pattern=${ pattern }&url_format_string=${ urlFormatString }")
      .contentType("application/json")
      .response(asJson[JsonSuccessBase])

  /**
   * [Create a custom profile field](/help/add-custom-profile-fields) in the user's organization.  `POST {{ api_url }}/v1/realm/profile_fields` 
   * 
   * Expected answers:
   *   code 200 : JsonSuccessBase (Success.)
   * 
   * @param fieldType The field type can be any of the supported custom profile field types. See the [custom profile fields documentation](/help/add-custom-profile-fields) more details on what each type means.  * **1**: Short text * **2**: Long text * **3**: List of options * **4**: Date picker * **5**: Link * **6**: Person picker * **7**: External account 
   * @param name The name of the custom profile field, which will appear both in user-facing settings UI for configuring custom profile fields and in UI displaying a user's profile. 
   * @param hint The help text to be displayed for the custom profile field in user-facing settings UI for configuring custom profile fields. 
   * @param fieldData Field types 3 (List of options) and 7 (External account) support storing additional configuration for the field type in the `field_data` attribute.  For field type 3 (List of options), this attribute is a JSON dictionary defining the choices and the order they will be displayed in the dropdown UI for individual users to select an option.  The interface for field type 7 is not yet stabilized. 
   */
  def createCustomProfileField(fieldType: Int, name: Option[String] = None, hint: Option[String] = None, fieldData: Option[Any] = None
): Request[Either[ResponseError[Exception], JsonSuccessBase], Nothing] =
    basicRequest
      .method(Method.POST, uri"$baseUrl/realm/profile_fields?name=${ name }&hint=${ hint }&field_type=${ fieldType }&field_data=${ fieldData }")
      .contentType("application/json")
      .response(asJson[JsonSuccessBase])

  /**
   * Get all the custom emoji in the user's organization.  `GET {{ api_url }}/v1/realm/emoji` 
   * 
   * Expected answers:
   *   code 200 : JsonSuccessBase (Success.)
   */
  def getCustomEmoji(
): Request[Either[ResponseError[Exception], JsonSuccessBase], Nothing] =
    basicRequest
      .method(Method.GET, uri"$baseUrl/realm/emoji")
      .contentType("application/json")
      .response(asJson[JsonSuccessBase])

  /**
   * Get all the [custom profile fields](/help/add-custom-profile-fields) configured for the user's organization.  `GET {{ api_url }}/v1/realm/profile_fields` 
   * 
   * Expected answers:
   *   code 200 : JsonSuccessBase (Success.)
   */
  def getCustomProfileFields(
): Request[Either[ResponseError[Exception], JsonSuccessBase], Nothing] =
    basicRequest
      .method(Method.GET, uri"$baseUrl/realm/profile_fields")
      .contentType("application/json")
      .response(asJson[JsonSuccessBase])

  /**
   * List all of an organization's configured [linkifiers](/help/add-a-custom-linkifier), regular expression patterns that are automatically linkified when they appear in messages and topics.  `GET {{ api_url }}/v1/realm/linkifiers`  **Changes**: New in Zulip 4.0 (feature level 54). On older versions, a similar `GET /realm/filters` endpoint was available with each entry in a `[pattern, url_format, id]` tuple format. 
   * 
   * Expected answers:
   *   code 200 : JsonSuccessBase (Success.)
   */
  def getLinkifiers(
): Request[Either[ResponseError[Exception], JsonSuccessBase], Nothing] =
    basicRequest
      .method(Method.GET, uri"$baseUrl/realm/linkifiers")
      .contentType("application/json")
      .response(asJson[JsonSuccessBase])

  /**
   * Fetch global settings for a Zulip server.  `GET {{ api_url }}/v1/server_settings`  **Note:** this endpoint does not require any authentication at all, and you can use it to check:  * If this is a Zulip server, and if so, what version of Zulip it's running. * What a Zulip client (e.g. a mobile app or [zulip-terminal](https://github.com/zulip/zulip-terminal/)) needs to know in order to display a login prompt for the server (e.g. what authentication methods are available). 
   * 
   * Expected answers:
   *   code 200 : JsonSuccessBase (Success.)
   */
  def getServerSettings(
): Request[Either[ResponseError[Exception], JsonSuccessBase], Nothing] =
    basicRequest
      .method(Method.GET, uri"$baseUrl/server_settings")
      .contentType("application/json")
      .response(asJson[JsonSuccessBase])

  /**
   * Remove a [code playground](/help/code-blocks#code-playgrounds) previously configured for an organization.  `DELETE {{ api_url }}/v1/realm/playgrounds/{playground_id}`  **Changes**: New in Zulip 4.0 (feature level 49). 
   * 
   * Expected answers:
   *   code 200 : JsonSuccess (Success.)
   * 
   * @param playgroundId The ID of the playground that you want to remove. 
   */
  def removeCodePlayground(playgroundId: Int
): Request[Either[ResponseError[Exception], JsonSuccess], Nothing] =
    basicRequest
      .method(Method.DELETE, uri"$baseUrl/realm/playgrounds/${playgroundId}")
      .contentType("application/json")
      .response(asJson[JsonSuccess])

  /**
   * Remove [linkifiers](/help/add-a-custom-linkifier), regular expression patterns that are automatically linkified when they appear in messages and topics.  `DELETE {{ api_url }}/v1/realm/filters/{filter_id}` 
   * 
   * Expected answers:
   *   code 200 : JsonSuccess (Success.)
   * 
   * @param filterId The ID of the linkifier that you want to remove. 
   */
  def removeLinkifier(filterId: Int
): Request[Either[ResponseError[Exception], JsonSuccess], Nothing] =
    basicRequest
      .method(Method.DELETE, uri"$baseUrl/realm/filters/${filterId}")
      .contentType("application/json")
      .response(asJson[JsonSuccess])

  /**
   * Reorder the custom profile fields in the user's organization.  `PATCH {{ api_url }}/v1/realm/profile_fields`  Custom profile fields are displayed in Zulip UI widgets in order; this endpoint allows administrative settings UI to change the field ordering.  This endpoint is used to implement the dragging feature described in the [custom profile fields documentation](/help/add-custom-profile-fields). 
   * 
   * Expected answers:
   *   code 200 : JsonSuccess (Success.)
   * 
   * @param order A list of the IDs of all the custom profile fields defined in this organization, in the desired new order. 
   */
  def reorderCustomProfileFields(order: Seq[Int]
): Request[Either[ResponseError[Exception], JsonSuccess], Nothing] =
    basicRequest
      .method(Method.PATCH, uri"$baseUrl/realm/profile_fields?order=${ order }")
      .contentType("application/json")
      .response(asJson[JsonSuccess])

  /**
   * Update a [linkifier](/help/add-a-custom-linkifier), regular expression patterns that are automatically linkified when they appear in messages and topics.  `PATCH {{ api_url }}/v1/realm/filters/{filter_id}`  **Changes**: New in Zulip 4.0 (feature level 57). 
   * 
   * Expected answers:
   *   code 200 : JsonSuccess (Success.)
   * 
   * @param filterId The ID of the linkifier that you want to update. 
   * @param pattern The [Python regular expression](https://docs.python.org/3/howto/regex.html) that should trigger the linkifier. 
   * @param urlFormatString The URL used for the link. If you used named groups for the `pattern`, you can insert their content here with `%(name_of_the_capturing_group)s`. 
   */
  def updateLinkifier(filterId: Int, pattern: String, urlFormatString: String
): Request[Either[ResponseError[Exception], JsonSuccess], Nothing] =
    basicRequest
      .method(Method.PATCH, uri"$baseUrl/realm/filters/${filterId}?pattern=${ pattern }&url_format_string=${ urlFormatString }")
      .contentType("application/json")
      .response(asJson[JsonSuccess])

  /**
   * This endpoint is used to upload a custom emoji for use in the user's organization.  Access to this endpoint depends on the [organization's configuration](https://zulip.com/help/only-allow-admins-to-add-emoji).  `POST {{ api_url }}/v1/realm/emoji/{emoji_name}` 
   * 
   * Expected answers:
   *   code 200 : JsonSuccess (Success.)
   * 
   * @param emojiName The name that should be associated with the uploaded emoji image/gif. The emoji name can only contain letters, numbers, dashes, and spaces. Upper and lower case letters are treated the same, and underscores (_) are treated the same as spaces (consistent with how the Zulip UI handles emoji). 
   * @param filename 
   */
  def uploadCustomEmoji(emojiName: String, filename: Option[File] = None
): Request[Either[ResponseError[Exception], JsonSuccess], Nothing] =
    basicRequest
      .method(Method.POST, uri"$baseUrl/realm/emoji/${emojiName}")
      .contentType("multipart/form-data")
      .multipartBody(Seq(
                filename.map(multipartFile("filename", _))

      ).flatten)
      .response(asJson[JsonSuccess])

}