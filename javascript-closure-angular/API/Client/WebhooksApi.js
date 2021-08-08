/**
 * @fileoverview AUTOMATICALLY GENERATED service for API.Client.WebhooksApi.
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

goog.provide('API.Client.WebhooksApi');

goog.require('API.Client.inline_response_200');

/**
 * @constructor
 * @param {!angular.$http} $http
 * @param {!Object} $httpParamSerializer
 * @param {!angular.$injector} $injector
 * @struct
 */
API.Client.WebhooksApi = function($http, $httpParamSerializer, $injector) {
  /** @private {!string} */
  this.basePath_ = $injector.has('WebhooksApiBasePath') ?
                   /** @type {!string} */ ($injector.get('WebhooksApiBasePath')) :
                   'https://example.zulipchat.com/api/v1';

  /** @private {!Object<string, string>} */
  this.defaultHeaders_ = $injector.has('WebhooksApiDefaultHeaders') ?
                   /** @type {!Object<string, string>} */ (
                       $injector.get('WebhooksApiDefaultHeaders')) :
                   {};

  /** @private {!angular.$http} */
  this.http_ = $http;

  /** @package {!Object} */
  this.httpParamSerializer = $injector.get('$httpParamSerializer');
}
API.Client.WebhooksApi.$inject = ['$http', '$httpParamSerializer', '$injector'];

/**
 * Outgoing webhooks
 * Outgoing webhooks allows to build or set up Zulip integrations which are notified when certain types of messages are sent in Zulip. 
 * @param {!angular.$http.Config=} opt_extraHttpRequestParams Extra HTTP parameters to send.
 * @return {!angular.$q.Promise<!API.Client.inline_response_200>}
 */
API.Client.WebhooksApi.prototype.zulipOutgoingWebhooks = function(opt_extraHttpRequestParams) {
  /** @const {string} */
  var path = this.basePath_ + '/zulip-outgoing-webhook';

  /** @type {!Object} */
  var queryParameters = {};

  /** @type {!Object} */
  var headerParams = angular.extend({}, this.defaultHeaders_);
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
