/**
 * @fileoverview AUTOMATICALLY GENERATED service for API.Client.ServerAndOrganizationsApi.
 * Do not edit this file by hand or your changes will be lost next time it is
 * generated.
 *
 * Powerful open source group chat 
 * Version: 1.0.0
 * Generated by: org.openapitools.codegen.languages.JavascriptClosureAngularClientCodegen
 */
/**
 * @license Apache 2.0
 * https://www.apache.org/licenses/LICENSE-2.0.html
 */

goog.provide('API.Client.ServerAndOrganizationsApi');

goog.require('API.Client.API.Client.Object');
goog.require('API.Client.JsonSuccess');
goog.require('API.Client.JsonSuccessBase');

/**
 * @constructor
 * @param {!angular.$http} $http
 * @param {!Object} $httpParamSerializer
 * @param {!angular.$injector} $injector
 * @struct
 */
API.Client.ServerAndOrganizationsApi = function($http, $httpParamSerializer, $injector) {
  /** @private {!string} */
  this.basePath_ = $injector.has('ServerAndOrganizationsApiBasePath') ?
                   /** @type {!string} */ ($injector.get('ServerAndOrganizationsApiBasePath')) :
                   'https://example.zulipchat.com/api/v1';

  /** @private {!Object<string, string>} */
  this.defaultHeaders_ = $injector.has('ServerAndOrganizationsApiDefaultHeaders') ?
                   /** @type {!Object<string, string>} */ (
                       $injector.get('ServerAndOrganizationsApiDefaultHeaders')) :
                   {};

  /** @private {!angular.$http} */
  this.http_ = $http;

  /** @package {!Object} */
  this.httpParamSerializer = $injector.get('$httpParamSerializer');
}
API.Client.ServerAndOrganizationsApi.$inject = ['$http', '$httpParamSerializer', '$injector'];

/**
 * Add a code playground
 * Configure [code playgrounds](/help/code-blocks#code-playgrounds) for the organization.  &#x60;POST {{ api_url }}/v1/realm/playgrounds&#x60;  **Changes**: New in Zulip 4.0 (feature level 49). A parameter encoding bug was fixed in Zulip 4.0 (feature level 57). 
 * @param {!string} name The user-visible display name of the playground which can be used to pick the target playground, especially when multiple playground options exist for that programming language. 
 * @param {!string} pygmentsLanguage The name of the Pygments language lexer for that programming language. 
 * @param {!string} urlPrefix The url prefix for the playground. 
 * @param {!angular.$http.Config=} opt_extraHttpRequestParams Extra HTTP parameters to send.
 * @return {!angular.$q.Promise<!API.Client.JsonSuccessBase>}
 */
API.Client.ServerAndOrganizationsApi.prototype.addCodePlayground = function(name, pygmentsLanguage, urlPrefix, opt_extraHttpRequestParams) {
  /** @const {string} */
  var path = this.basePath_ + '/realm/playgrounds';

  /** @type {!Object} */
  var queryParameters = {};

  /** @type {!Object} */
  var headerParams = angular.extend({}, this.defaultHeaders_);
  // verify required parameter 'name' is set
  if (!name) {
    throw new Error('Missing required parameter name when calling addCodePlayground');
  }
  // verify required parameter 'pygmentsLanguage' is set
  if (!pygmentsLanguage) {
    throw new Error('Missing required parameter pygmentsLanguage when calling addCodePlayground');
  }
  // verify required parameter 'urlPrefix' is set
  if (!urlPrefix) {
    throw new Error('Missing required parameter urlPrefix when calling addCodePlayground');
  }
  if (name !== undefined) {
    queryParameters['name'] = name;
  }

  if (pygmentsLanguage !== undefined) {
    queryParameters['pygments_language'] = pygmentsLanguage;
  }

  if (urlPrefix !== undefined) {
    queryParameters['url_prefix'] = urlPrefix;
  }

  /** @type {!Object} */
  var httpRequestParams = {
    method: 'POST',
    url: path,
    json: true,
            params: queryParameters,
    headers: headerParams
  };

  if (opt_extraHttpRequestParams) {
    httpRequestParams = angular.extend(httpRequestParams, opt_extraHttpRequestParams);
  }

  return (/** @type {?} */ (this.http_))(httpRequestParams);
}

/**
 * Add a linkifier
 * Configure [linkifiers](/help/add-a-custom-linkifier), regular expression patterns that are automatically linkified when they appear in messages and topics.  &#x60;POST {{ api_url }}/v1/realm/filters&#x60; 
 * @param {!string} pattern The [Python regular expression](https://docs.python.org/3/howto/regex.html) that should trigger the linkifier. 
 * @param {!string} urlFormatString The URL used for the link. If you used named groups for the &#x60;pattern&#x60;, you can insert their content here with &#x60;%(name_of_the_capturing_group)s&#x60;. 
 * @param {!angular.$http.Config=} opt_extraHttpRequestParams Extra HTTP parameters to send.
 * @return {!angular.$q.Promise<!API.Client.JsonSuccessBase>}
 */
API.Client.ServerAndOrganizationsApi.prototype.addLinkifier = function(pattern, urlFormatString, opt_extraHttpRequestParams) {
  /** @const {string} */
  var path = this.basePath_ + '/realm/filters';

  /** @type {!Object} */
  var queryParameters = {};

  /** @type {!Object} */
  var headerParams = angular.extend({}, this.defaultHeaders_);
  // verify required parameter 'pattern' is set
  if (!pattern) {
    throw new Error('Missing required parameter pattern when calling addLinkifier');
  }
  // verify required parameter 'urlFormatString' is set
  if (!urlFormatString) {
    throw new Error('Missing required parameter urlFormatString when calling addLinkifier');
  }
  if (pattern !== undefined) {
    queryParameters['pattern'] = pattern;
  }

  if (urlFormatString !== undefined) {
    queryParameters['url_format_string'] = urlFormatString;
  }

  /** @type {!Object} */
  var httpRequestParams = {
    method: 'POST',
    url: path,
    json: true,
            params: queryParameters,
    headers: headerParams
  };

  if (opt_extraHttpRequestParams) {
    httpRequestParams = angular.extend(httpRequestParams, opt_extraHttpRequestParams);
  }

  return (/** @type {?} */ (this.http_))(httpRequestParams);
}

/**
 * Create a custom profile field
 * [Create a custom profile field](/help/add-custom-profile-fields) in the user&#39;s organization.  &#x60;POST {{ api_url }}/v1/realm/profile_fields&#x60; 
 * @param {!number} fieldType The field type can be any of the supported custom profile field types. See the [custom profile fields documentation](/help/add-custom-profile-fields) more details on what each type means.  * **1**: Short text * **2**: Long text * **3**: List of options * **4**: Date picker * **5**: Link * **6**: Person picker * **7**: External account 
 * @param {!string=} opt_name The name of the custom profile field, which will appear both in user-facing settings UI for configuring custom profile fields and in UI displaying a user&#39;s profile. 
 * @param {!string=} opt_hint The help text to be displayed for the custom profile field in user-facing settings UI for configuring custom profile fields. 
 * @param {!API.Client.Object=} opt_fieldData Field types 3 (List of options) and 7 (External account) support storing additional configuration for the field type in the &#x60;field_data&#x60; attribute.  For field type 3 (List of options), this attribute is a JSON dictionary defining the choices and the order they will be displayed in the dropdown UI for individual users to select an option.  The interface for field type 7 is not yet stabilized. 
 * @param {!angular.$http.Config=} opt_extraHttpRequestParams Extra HTTP parameters to send.
 * @return {!angular.$q.Promise<!API.Client.JsonSuccessBase>}
 */
API.Client.ServerAndOrganizationsApi.prototype.createCustomProfileField = function(fieldType, opt_name, opt_hint, opt_fieldData, opt_extraHttpRequestParams) {
  /** @const {string} */
  var path = this.basePath_ + '/realm/profile_fields';

  /** @type {!Object} */
  var queryParameters = {};

  /** @type {!Object} */
  var headerParams = angular.extend({}, this.defaultHeaders_);
  // verify required parameter 'fieldType' is set
  if (!fieldType) {
    throw new Error('Missing required parameter fieldType when calling createCustomProfileField');
  }
  if (opt_name !== undefined) {
    queryParameters['name'] = opt_name;
  }

  if (opt_hint !== undefined) {
    queryParameters['hint'] = opt_hint;
  }

  if (fieldType !== undefined) {
    queryParameters['field_type'] = fieldType;
  }

  if (opt_fieldData !== undefined) {
    queryParameters['field_data'] = opt_fieldData;
  }

  /** @type {!Object} */
  var httpRequestParams = {
    method: 'POST',
    url: path,
    json: true,
            params: queryParameters,
    headers: headerParams
  };

  if (opt_extraHttpRequestParams) {
    httpRequestParams = angular.extend(httpRequestParams, opt_extraHttpRequestParams);
  }

  return (/** @type {?} */ (this.http_))(httpRequestParams);
}

/**
 * Get all custom emoji
 * Get all the custom emoji in the user&#39;s organization.  &#x60;GET {{ api_url }}/v1/realm/emoji&#x60; 
 * @param {!angular.$http.Config=} opt_extraHttpRequestParams Extra HTTP parameters to send.
 * @return {!angular.$q.Promise<!API.Client.JsonSuccessBase>}
 */
API.Client.ServerAndOrganizationsApi.prototype.getCustomEmoji = function(opt_extraHttpRequestParams) {
  /** @const {string} */
  var path = this.basePath_ + '/realm/emoji';

  /** @type {!Object} */
  var queryParameters = {};

  /** @type {!Object} */
  var headerParams = angular.extend({}, this.defaultHeaders_);
  /** @type {!Object} */
  var httpRequestParams = {
    method: 'GET',
    url: path,
    json: true,
            params: queryParameters,
    headers: headerParams
  };

  if (opt_extraHttpRequestParams) {
    httpRequestParams = angular.extend(httpRequestParams, opt_extraHttpRequestParams);
  }

  return (/** @type {?} */ (this.http_))(httpRequestParams);
}

/**
 * Get all custom profile fields
 * Get all the [custom profile fields](/help/add-custom-profile-fields) configured for the user&#39;s organization.  &#x60;GET {{ api_url }}/v1/realm/profile_fields&#x60; 
 * @param {!angular.$http.Config=} opt_extraHttpRequestParams Extra HTTP parameters to send.
 * @return {!angular.$q.Promise<!API.Client.JsonSuccessBase>}
 */
API.Client.ServerAndOrganizationsApi.prototype.getCustomProfileFields = function(opt_extraHttpRequestParams) {
  /** @const {string} */
  var path = this.basePath_ + '/realm/profile_fields';

  /** @type {!Object} */
  var queryParameters = {};

  /** @type {!Object} */
  var headerParams = angular.extend({}, this.defaultHeaders_);
  /** @type {!Object} */
  var httpRequestParams = {
    method: 'GET',
    url: path,
    json: true,
            params: queryParameters,
    headers: headerParams
  };

  if (opt_extraHttpRequestParams) {
    httpRequestParams = angular.extend(httpRequestParams, opt_extraHttpRequestParams);
  }

  return (/** @type {?} */ (this.http_))(httpRequestParams);
}

/**
 * Get linkifiers
 * List all of an organization&#39;s configured [linkifiers](/help/add-a-custom-linkifier), regular expression patterns that are automatically linkified when they appear in messages and topics.  &#x60;GET {{ api_url }}/v1/realm/linkifiers&#x60;  **Changes**: New in Zulip 4.0 (feature level 54). On older versions, a similar &#x60;GET /realm/filters&#x60; endpoint was available with each entry in a &#x60;[pattern, url_format, id]&#x60; tuple format. 
 * @param {!angular.$http.Config=} opt_extraHttpRequestParams Extra HTTP parameters to send.
 * @return {!angular.$q.Promise<!API.Client.JsonSuccessBase>}
 */
API.Client.ServerAndOrganizationsApi.prototype.getLinkifiers = function(opt_extraHttpRequestParams) {
  /** @const {string} */
  var path = this.basePath_ + '/realm/linkifiers';

  /** @type {!Object} */
  var queryParameters = {};

  /** @type {!Object} */
  var headerParams = angular.extend({}, this.defaultHeaders_);
  /** @type {!Object} */
  var httpRequestParams = {
    method: 'GET',
    url: path,
    json: true,
            params: queryParameters,
    headers: headerParams
  };

  if (opt_extraHttpRequestParams) {
    httpRequestParams = angular.extend(httpRequestParams, opt_extraHttpRequestParams);
  }

  return (/** @type {?} */ (this.http_))(httpRequestParams);
}

/**
 * Get server settings
 * Fetch global settings for a Zulip server.  &#x60;GET {{ api_url }}/v1/server_settings&#x60;  **Note:** this endpoint does not require any authentication at all, and you can use it to check:  * If this is a Zulip server, and if so, what version of Zulip it&#39;s running. * What a Zulip client (e.g. a mobile app or [zulip-terminal](https://github.com/zulip/zulip-terminal/)) needs to know in order to display a login prompt for the server (e.g. what authentication methods are available). 
 * @param {!angular.$http.Config=} opt_extraHttpRequestParams Extra HTTP parameters to send.
 * @return {!angular.$q.Promise<!API.Client.JsonSuccessBase>}
 */
API.Client.ServerAndOrganizationsApi.prototype.getServerSettings = function(opt_extraHttpRequestParams) {
  /** @const {string} */
  var path = this.basePath_ + '/server_settings';

  /** @type {!Object} */
  var queryParameters = {};

  /** @type {!Object} */
  var headerParams = angular.extend({}, this.defaultHeaders_);
  /** @type {!Object} */
  var httpRequestParams = {
    method: 'GET',
    url: path,
    json: true,
            params: queryParameters,
    headers: headerParams
  };

  if (opt_extraHttpRequestParams) {
    httpRequestParams = angular.extend(httpRequestParams, opt_extraHttpRequestParams);
  }

  return (/** @type {?} */ (this.http_))(httpRequestParams);
}

/**
 * Remove a code playground
 * Remove a [code playground](/help/code-blocks#code-playgrounds) previously configured for an organization.  &#x60;DELETE {{ api_url }}/v1/realm/playgrounds/{playground_id}&#x60;  **Changes**: New in Zulip 4.0 (feature level 49). 
 * @param {!number} playgroundId The ID of the playground that you want to remove. 
 * @param {!angular.$http.Config=} opt_extraHttpRequestParams Extra HTTP parameters to send.
 * @return {!angular.$q.Promise<!API.Client.JsonSuccess>}
 */
API.Client.ServerAndOrganizationsApi.prototype.removeCodePlayground = function(playgroundId, opt_extraHttpRequestParams) {
  /** @const {string} */
  var path = this.basePath_ + '/realm/playgrounds/{playground_id}'
      .replace('{' + 'playground_id' + '}', String(playgroundId));

  /** @type {!Object} */
  var queryParameters = {};

  /** @type {!Object} */
  var headerParams = angular.extend({}, this.defaultHeaders_);
  // verify required parameter 'playgroundId' is set
  if (!playgroundId) {
    throw new Error('Missing required parameter playgroundId when calling removeCodePlayground');
  }
  /** @type {!Object} */
  var httpRequestParams = {
    method: 'DELETE',
    url: path,
    json: true,
            params: queryParameters,
    headers: headerParams
  };

  if (opt_extraHttpRequestParams) {
    httpRequestParams = angular.extend(httpRequestParams, opt_extraHttpRequestParams);
  }

  return (/** @type {?} */ (this.http_))(httpRequestParams);
}

/**
 * Remove a linkifier
 * Remove [linkifiers](/help/add-a-custom-linkifier), regular expression patterns that are automatically linkified when they appear in messages and topics.  &#x60;DELETE {{ api_url }}/v1/realm/filters/{filter_id}&#x60; 
 * @param {!number} filterId The ID of the linkifier that you want to remove. 
 * @param {!angular.$http.Config=} opt_extraHttpRequestParams Extra HTTP parameters to send.
 * @return {!angular.$q.Promise<!API.Client.JsonSuccess>}
 */
API.Client.ServerAndOrganizationsApi.prototype.removeLinkifier = function(filterId, opt_extraHttpRequestParams) {
  /** @const {string} */
  var path = this.basePath_ + '/realm/filters/{filter_id}'
      .replace('{' + 'filter_id' + '}', String(filterId));

  /** @type {!Object} */
  var queryParameters = {};

  /** @type {!Object} */
  var headerParams = angular.extend({}, this.defaultHeaders_);
  // verify required parameter 'filterId' is set
  if (!filterId) {
    throw new Error('Missing required parameter filterId when calling removeLinkifier');
  }
  /** @type {!Object} */
  var httpRequestParams = {
    method: 'DELETE',
    url: path,
    json: true,
            params: queryParameters,
    headers: headerParams
  };

  if (opt_extraHttpRequestParams) {
    httpRequestParams = angular.extend(httpRequestParams, opt_extraHttpRequestParams);
  }

  return (/** @type {?} */ (this.http_))(httpRequestParams);
}

/**
 * Reorder custom profile fields
 * Reorder the custom profile fields in the user&#39;s organization.  &#x60;PATCH {{ api_url }}/v1/realm/profile_fields&#x60;  Custom profile fields are displayed in Zulip UI widgets in order; this endpoint allows administrative settings UI to change the field ordering.  This endpoint is used to implement the dragging feature described in the [custom profile fields documentation](/help/add-custom-profile-fields). 
 * @param {!Array<!number>} order A list of the IDs of all the custom profile fields defined in this organization, in the desired new order. 
 * @param {!angular.$http.Config=} opt_extraHttpRequestParams Extra HTTP parameters to send.
 * @return {!angular.$q.Promise<!API.Client.JsonSuccess>}
 */
API.Client.ServerAndOrganizationsApi.prototype.reorderCustomProfileFields = function(order, opt_extraHttpRequestParams) {
  /** @const {string} */
  var path = this.basePath_ + '/realm/profile_fields';

  /** @type {!Object} */
  var queryParameters = {};

  /** @type {!Object} */
  var headerParams = angular.extend({}, this.defaultHeaders_);
  // verify required parameter 'order' is set
  if (!order) {
    throw new Error('Missing required parameter order when calling reorderCustomProfileFields');
  }
  if (order !== undefined) {
    queryParameters['order'] = order;
  }

  /** @type {!Object} */
  var httpRequestParams = {
    method: 'PATCH',
    url: path,
    json: true,
            params: queryParameters,
    headers: headerParams
  };

  if (opt_extraHttpRequestParams) {
    httpRequestParams = angular.extend(httpRequestParams, opt_extraHttpRequestParams);
  }

  return (/** @type {?} */ (this.http_))(httpRequestParams);
}

/**
 * Update a linkifier
 * Update a [linkifier](/help/add-a-custom-linkifier), regular expression patterns that are automatically linkified when they appear in messages and topics.  &#x60;PATCH {{ api_url }}/v1/realm/filters/{filter_id}&#x60;  **Changes**: New in Zulip 4.0 (feature level 57). 
 * @param {!number} filterId The ID of the linkifier that you want to update. 
 * @param {!string} pattern The [Python regular expression](https://docs.python.org/3/howto/regex.html) that should trigger the linkifier. 
 * @param {!string} urlFormatString The URL used for the link. If you used named groups for the &#x60;pattern&#x60;, you can insert their content here with &#x60;%(name_of_the_capturing_group)s&#x60;. 
 * @param {!angular.$http.Config=} opt_extraHttpRequestParams Extra HTTP parameters to send.
 * @return {!angular.$q.Promise<!API.Client.JsonSuccess>}
 */
API.Client.ServerAndOrganizationsApi.prototype.updateLinkifier = function(filterId, pattern, urlFormatString, opt_extraHttpRequestParams) {
  /** @const {string} */
  var path = this.basePath_ + '/realm/filters/{filter_id}'
      .replace('{' + 'filter_id' + '}', String(filterId));

  /** @type {!Object} */
  var queryParameters = {};

  /** @type {!Object} */
  var headerParams = angular.extend({}, this.defaultHeaders_);
  // verify required parameter 'filterId' is set
  if (!filterId) {
    throw new Error('Missing required parameter filterId when calling updateLinkifier');
  }
  // verify required parameter 'pattern' is set
  if (!pattern) {
    throw new Error('Missing required parameter pattern when calling updateLinkifier');
  }
  // verify required parameter 'urlFormatString' is set
  if (!urlFormatString) {
    throw new Error('Missing required parameter urlFormatString when calling updateLinkifier');
  }
  if (pattern !== undefined) {
    queryParameters['pattern'] = pattern;
  }

  if (urlFormatString !== undefined) {
    queryParameters['url_format_string'] = urlFormatString;
  }

  /** @type {!Object} */
  var httpRequestParams = {
    method: 'PATCH',
    url: path,
    json: true,
            params: queryParameters,
    headers: headerParams
  };

  if (opt_extraHttpRequestParams) {
    httpRequestParams = angular.extend(httpRequestParams, opt_extraHttpRequestParams);
  }

  return (/** @type {?} */ (this.http_))(httpRequestParams);
}

/**
 * Upload custom emoji
 * This endpoint is used to upload a custom emoji for use in the user&#39;s organization.  Access to this endpoint depends on the [organization&#39;s configuration](https://zulip.com/help/only-allow-admins-to-add-emoji).  &#x60;POST {{ api_url }}/v1/realm/emoji/{emoji_name}&#x60; 
 * @param {!string} emojiName The name that should be associated with the uploaded emoji image/gif. The emoji name can only contain letters, numbers, dashes, and spaces. Upper and lower case letters are treated the same, and underscores (_) are treated the same as spaces (consistent with how the Zulip UI handles emoji). 
 * @param {!Object=} opt_filename 
 * @param {!angular.$http.Config=} opt_extraHttpRequestParams Extra HTTP parameters to send.
 * @return {!angular.$q.Promise<!API.Client.JsonSuccess>}
 */
API.Client.ServerAndOrganizationsApi.prototype.uploadCustomEmoji = function(emojiName, opt_filename, opt_extraHttpRequestParams) {
  /** @const {string} */
  var path = this.basePath_ + '/realm/emoji/{emoji_name}'
      .replace('{' + 'emoji_name' + '}', String(emojiName));

  /** @type {!Object} */
  var queryParameters = {};

  /** @type {!Object} */
  var headerParams = angular.extend({}, this.defaultHeaders_);
  /** @type {!Object} */
  var formParams = {};

  // verify required parameter 'emojiName' is set
  if (!emojiName) {
    throw new Error('Missing required parameter emojiName when calling uploadCustomEmoji');
  }
  headerParams['Content-Type'] = 'application/x-www-form-urlencoded';

  formParams['filename'] = opt_filename;

  /** @type {!Object} */
  var httpRequestParams = {
    method: 'POST',
    url: path,
    json: false,
        data: this.httpParamSerializer(formParams),
    params: queryParameters,
    headers: headerParams
  };

  if (opt_extraHttpRequestParams) {
    httpRequestParams = angular.extend(httpRequestParams, opt_extraHttpRequestParams);
  }

  return (/** @type {?} */ (this.http_))(httpRequestParams);
}
