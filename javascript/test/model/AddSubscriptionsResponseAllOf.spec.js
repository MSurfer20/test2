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
 *
 */

(function(root, factory) {
  if (typeof define === 'function' && define.amd) {
    // AMD.
    define(['expect.js', process.cwd()+'/src/index'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    factory(require('expect.js'), require(process.cwd()+'/src/index'));
  } else {
    // Browser globals (root is window)
    factory(root.expect, root.ZulipRestApi);
  }
}(this, function(expect, ZulipRestApi) {
  'use strict';

  var instance;

  beforeEach(function() {
    instance = new ZulipRestApi.AddSubscriptionsResponseAllOf();
  });

  var getProperty = function(object, getter, property) {
    // Use getter method if present; otherwise, get the property directly.
    if (typeof object[getter] === 'function')
      return object[getter]();
    else
      return object[property];
  }

  var setProperty = function(object, setter, property, value) {
    // Use setter method if present; otherwise, set the property directly.
    if (typeof object[setter] === 'function')
      object[setter](value);
    else
      object[property] = value;
  }

  describe('AddSubscriptionsResponseAllOf', function() {
    it('should create an instance of AddSubscriptionsResponseAllOf', function() {
      // uncomment below and update the code to test AddSubscriptionsResponseAllOf
      //var instane = new ZulipRestApi.AddSubscriptionsResponseAllOf();
      //expect(instance).to.be.a(ZulipRestApi.AddSubscriptionsResponseAllOf);
    });

    it('should have the property result (base name: "result")', function() {
      // uncomment below and update the code to test the property result
      //var instance = new ZulipRestApi.AddSubscriptionsResponseAllOf();
      //expect(instance).to.be();
    });

    it('should have the property msg (base name: "msg")', function() {
      // uncomment below and update the code to test the property msg
      //var instance = new ZulipRestApi.AddSubscriptionsResponseAllOf();
      //expect(instance).to.be();
    });

    it('should have the property subscribed (base name: "subscribed")', function() {
      // uncomment below and update the code to test the property subscribed
      //var instance = new ZulipRestApi.AddSubscriptionsResponseAllOf();
      //expect(instance).to.be();
    });

    it('should have the property alreadySubscribed (base name: "already_subscribed")', function() {
      // uncomment below and update the code to test the property alreadySubscribed
      //var instance = new ZulipRestApi.AddSubscriptionsResponseAllOf();
      //expect(instance).to.be();
    });

    it('should have the property unauthorized (base name: "unauthorized")', function() {
      // uncomment below and update the code to test the property unauthorized
      //var instance = new ZulipRestApi.AddSubscriptionsResponseAllOf();
      //expect(instance).to.be();
    });

  });

}));