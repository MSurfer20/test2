package api

import play.api.libs.json._
import model.JsObject
import model.JsonSuccess
import model.JsonSuccessBase
import play.api.libs.Files.TemporaryFile

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"))
trait ServerAndOrganizationsApi {
  /**
    * Add a code playground
    * Configure [code playgrounds](/help/code-blocks#code-playgrounds) for the organization.  &#x60;POST {{ api_url }}/v1/realm/playgrounds&#x60;  **Changes**: New in Zulip 4.0 (feature level 49). A parameter encoding bug was fixed in Zulip 4.0 (feature level 57). 
    * @param name The user-visible display name of the playground which can be used to pick the target playground, especially when multiple playground options exist for that programming language. 
    * @param pygmentsLanguage The name of the Pygments language lexer for that programming language. 
    * @param urlPrefix The url prefix for the playground. 
    */
  def addCodePlayground(name: String, pygmentsLanguage: String, urlPrefix: String): JsonSuccessBase

  /**
    * Add a linkifier
    * Configure [linkifiers](/help/add-a-custom-linkifier), regular expression patterns that are automatically linkified when they appear in messages and topics.  &#x60;POST {{ api_url }}/v1/realm/filters&#x60; 
    * @param pattern The [Python regular expression](https://docs.python.org/3/howto/regex.html) that should trigger the linkifier. 
    * @param urlFormatString The URL used for the link. If you used named groups for the &#x60;pattern&#x60;, you can insert their content here with &#x60;%(name_of_the_capturing_group)s&#x60;. 
    */
  def addLinkifier(pattern: String, urlFormatString: String): JsonSuccessBase

  /**
    * Create a custom profile field
    * [Create a custom profile field](/help/add-custom-profile-fields) in the user&#39;s organization.  &#x60;POST {{ api_url }}/v1/realm/profile_fields&#x60; 
    * @param fieldType The field type can be any of the supported custom profile field types. See the [custom profile fields documentation](/help/add-custom-profile-fields) more details on what each type means.  * **1**: Short text * **2**: Long text * **3**: List of options * **4**: Date picker * **5**: Link * **6**: Person picker * **7**: External account 
    * @param name The name of the custom profile field, which will appear both in user-facing settings UI for configuring custom profile fields and in UI displaying a user&#39;s profile. 
    * @param hint The help text to be displayed for the custom profile field in user-facing settings UI for configuring custom profile fields. 
    * @param fieldData Field types 3 (List of options) and 7 (External account) support storing additional configuration for the field type in the &#x60;field_data&#x60; attribute.  For field type 3 (List of options), this attribute is a JSON dictionary defining the choices and the order they will be displayed in the dropdown UI for individual users to select an option.  The interface for field type 7 is not yet stabilized. 
    */
  def createCustomProfileField(fieldType: Int, name: Option[String], hint: Option[String], fieldData: Option[JsObject]): JsonSuccessBase

  /**
    * Get all custom emoji
    * Get all the custom emoji in the user&#39;s organization.  &#x60;GET {{ api_url }}/v1/realm/emoji&#x60; 
    */
  def getCustomEmoji(): JsonSuccessBase

  /**
    * Get all custom profile fields
    * Get all the [custom profile fields](/help/add-custom-profile-fields) configured for the user&#39;s organization.  &#x60;GET {{ api_url }}/v1/realm/profile_fields&#x60; 
    */
  def getCustomProfileFields(): JsonSuccessBase

  /**
    * Get linkifiers
    * List all of an organization&#39;s configured [linkifiers](/help/add-a-custom-linkifier), regular expression patterns that are automatically linkified when they appear in messages and topics.  &#x60;GET {{ api_url }}/v1/realm/linkifiers&#x60;  **Changes**: New in Zulip 4.0 (feature level 54). On older versions, a similar &#x60;GET /realm/filters&#x60; endpoint was available with each entry in a &#x60;[pattern, url_format, id]&#x60; tuple format. 
    */
  def getLinkifiers(): JsonSuccessBase

  /**
    * Get server settings
    * Fetch global settings for a Zulip server.  &#x60;GET {{ api_url }}/v1/server_settings&#x60;  **Note:** this endpoint does not require any authentication at all, and you can use it to check:  * If this is a Zulip server, and if so, what version of Zulip it&#39;s running. * What a Zulip client (e.g. a mobile app or [zulip-terminal](https://github.com/zulip/zulip-terminal/)) needs to know in order to display a login prompt for the server (e.g. what authentication methods are available). 
    */
  def getServerSettings(): JsonSuccessBase

  /**
    * Remove a code playground
    * Remove a [code playground](/help/code-blocks#code-playgrounds) previously configured for an organization.  &#x60;DELETE {{ api_url }}/v1/realm/playgrounds/{playground_id}&#x60;  **Changes**: New in Zulip 4.0 (feature level 49). 
    * @param playgroundId The ID of the playground that you want to remove. 
    */
  def removeCodePlayground(playgroundId: Int): JsonSuccess

  /**
    * Remove a linkifier
    * Remove [linkifiers](/help/add-a-custom-linkifier), regular expression patterns that are automatically linkified when they appear in messages and topics.  &#x60;DELETE {{ api_url }}/v1/realm/filters/{filter_id}&#x60; 
    * @param filterId The ID of the linkifier that you want to remove. 
    */
  def removeLinkifier(filterId: Int): JsonSuccess

  /**
    * Reorder custom profile fields
    * Reorder the custom profile fields in the user&#39;s organization.  &#x60;PATCH {{ api_url }}/v1/realm/profile_fields&#x60;  Custom profile fields are displayed in Zulip UI widgets in order; this endpoint allows administrative settings UI to change the field ordering.  This endpoint is used to implement the dragging feature described in the [custom profile fields documentation](/help/add-custom-profile-fields). 
    * @param order A list of the IDs of all the custom profile fields defined in this organization, in the desired new order. 
    */
  def reorderCustomProfileFields(order: List[Int]): JsonSuccess

  /**
    * Update a linkifier
    * Update a [linkifier](/help/add-a-custom-linkifier), regular expression patterns that are automatically linkified when they appear in messages and topics.  &#x60;PATCH {{ api_url }}/v1/realm/filters/{filter_id}&#x60;  **Changes**: New in Zulip 4.0 (feature level 57). 
    * @param filterId The ID of the linkifier that you want to update. 
    * @param pattern The [Python regular expression](https://docs.python.org/3/howto/regex.html) that should trigger the linkifier. 
    * @param urlFormatString The URL used for the link. If you used named groups for the &#x60;pattern&#x60;, you can insert their content here with &#x60;%(name_of_the_capturing_group)s&#x60;. 
    */
  def updateLinkifier(filterId: Int, pattern: String, urlFormatString: String): JsonSuccess

  /**
    * Upload custom emoji
    * This endpoint is used to upload a custom emoji for use in the user&#39;s organization.  Access to this endpoint depends on the [organization&#39;s configuration](https://zulip.com/help/only-allow-admins-to-add-emoji).  &#x60;POST {{ api_url }}/v1/realm/emoji/{emoji_name}&#x60; 
    * @param emojiName The name that should be associated with the uploaded emoji image/gif. The emoji name can only contain letters, numbers, dashes, and spaces. Upper and lower case letters are treated the same, and underscores (_) are treated the same as spaces (consistent with how the Zulip UI handles emoji). 
    */
  def uploadCustomEmoji(emojiName: String, filename: Option[TemporaryFile]): JsonSuccess
}
