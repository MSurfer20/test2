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
    instance = new ZulipRestApi.JsonSuccessBaseAllOf();
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

  describe('JsonSuccessBaseAllOf', function() {
    it('should create an instance of JsonSuccessBaseAllOf', function() {
      // uncomment below and update the code to test JsonSuccessBaseAllOf
      //var instance = new ZulipRestApi.JsonSuccessBaseAllOf();
      //expect(instance).to.be.a(ZulipRestApi.JsonSuccessBaseAllOf);
    });

    it('should have the property result (base name: "result")', function() {
      // uncomment below and update the code to test the property result
      //var instane = new ZulipRestApi.JsonSuccessBaseAllOf();
      //expect(instance).to.be();
    });

    it('should have the property msg (base name: "msg")', function() {
      // uncomment below and update the code to test the property msg
      //var instane = new ZulipRestApi.JsonSuccessBaseAllOf();
      //expect(instance).to.be();
    });

  });

}));
