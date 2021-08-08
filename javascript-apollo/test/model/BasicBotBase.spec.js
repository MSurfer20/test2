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
    instance = new ZulipRestApi.BasicBotBase();
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

  describe('BasicBotBase', function() {
    it('should create an instance of BasicBotBase', function() {
      // uncomment below and update the code to test BasicBotBase
      //var instance = new ZulipRestApi.BasicBotBase();
      //expect(instance).to.be.a(ZulipRestApi.BasicBotBase);
    });

    it('should have the property userId (base name: "user_id")', function() {
      // uncomment below and update the code to test the property userId
      //var instane = new ZulipRestApi.BasicBotBase();
      //expect(instance).to.be();
    });

    it('should have the property fullName (base name: "full_name")', function() {
      // uncomment below and update the code to test the property fullName
      //var instane = new ZulipRestApi.BasicBotBase();
      //expect(instance).to.be();
    });

    it('should have the property apiKey (base name: "api_key")', function() {
      // uncomment below and update the code to test the property apiKey
      //var instane = new ZulipRestApi.BasicBotBase();
      //expect(instance).to.be();
    });

    it('should have the property defaultSendingStream (base name: "default_sending_stream")', function() {
      // uncomment below and update the code to test the property defaultSendingStream
      //var instane = new ZulipRestApi.BasicBotBase();
      //expect(instance).to.be();
    });

    it('should have the property defaultEventsRegisterStream (base name: "default_events_register_stream")', function() {
      // uncomment below and update the code to test the property defaultEventsRegisterStream
      //var instane = new ZulipRestApi.BasicBotBase();
      //expect(instance).to.be();
    });

    it('should have the property defaultAllPublicStreams (base name: "default_all_public_streams")', function() {
      // uncomment below and update the code to test the property defaultAllPublicStreams
      //var instane = new ZulipRestApi.BasicBotBase();
      //expect(instance).to.be();
    });

    it('should have the property avatarUrl (base name: "avatar_url")', function() {
      // uncomment below and update the code to test the property avatarUrl
      //var instane = new ZulipRestApi.BasicBotBase();
      //expect(instance).to.be();
    });

    it('should have the property ownerId (base name: "owner_id")', function() {
      // uncomment below and update the code to test the property ownerId
      //var instane = new ZulipRestApi.BasicBotBase();
      //expect(instance).to.be();
    });

    it('should have the property services (base name: "services")', function() {
      // uncomment below and update the code to test the property services
      //var instane = new ZulipRestApi.BasicBotBase();
      //expect(instance).to.be();
    });

  });

}));
