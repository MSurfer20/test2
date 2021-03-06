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
    instance = new ZulipRestApi.GetMessages();
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

  describe('GetMessages', function() {
    it('should create an instance of GetMessages', function() {
      // uncomment below and update the code to test GetMessages
      //var instane = new ZulipRestApi.GetMessages();
      //expect(instance).to.be.a(ZulipRestApi.GetMessages);
    });

    it('should have the property avatarUrl (base name: "avatar_url")', function() {
      // uncomment below and update the code to test the property avatarUrl
      //var instance = new ZulipRestApi.GetMessages();
      //expect(instance).to.be();
    });

    it('should have the property client (base name: "client")', function() {
      // uncomment below and update the code to test the property client
      //var instance = new ZulipRestApi.GetMessages();
      //expect(instance).to.be();
    });

    it('should have the property content (base name: "content")', function() {
      // uncomment below and update the code to test the property content
      //var instance = new ZulipRestApi.GetMessages();
      //expect(instance).to.be();
    });

    it('should have the property contentType (base name: "content_type")', function() {
      // uncomment below and update the code to test the property contentType
      //var instance = new ZulipRestApi.GetMessages();
      //expect(instance).to.be();
    });

    it('should have the property displayRecipient (base name: "display_recipient")', function() {
      // uncomment below and update the code to test the property displayRecipient
      //var instance = new ZulipRestApi.GetMessages();
      //expect(instance).to.be();
    });

    it('should have the property id (base name: "id")', function() {
      // uncomment below and update the code to test the property id
      //var instance = new ZulipRestApi.GetMessages();
      //expect(instance).to.be();
    });

    it('should have the property isMeMessage (base name: "is_me_message")', function() {
      // uncomment below and update the code to test the property isMeMessage
      //var instance = new ZulipRestApi.GetMessages();
      //expect(instance).to.be();
    });

    it('should have the property reactions (base name: "reactions")', function() {
      // uncomment below and update the code to test the property reactions
      //var instance = new ZulipRestApi.GetMessages();
      //expect(instance).to.be();
    });

    it('should have the property recipientId (base name: "recipient_id")', function() {
      // uncomment below and update the code to test the property recipientId
      //var instance = new ZulipRestApi.GetMessages();
      //expect(instance).to.be();
    });

    it('should have the property senderEmail (base name: "sender_email")', function() {
      // uncomment below and update the code to test the property senderEmail
      //var instance = new ZulipRestApi.GetMessages();
      //expect(instance).to.be();
    });

    it('should have the property senderFullName (base name: "sender_full_name")', function() {
      // uncomment below and update the code to test the property senderFullName
      //var instance = new ZulipRestApi.GetMessages();
      //expect(instance).to.be();
    });

    it('should have the property senderId (base name: "sender_id")', function() {
      // uncomment below and update the code to test the property senderId
      //var instance = new ZulipRestApi.GetMessages();
      //expect(instance).to.be();
    });

    it('should have the property senderRealmStr (base name: "sender_realm_str")', function() {
      // uncomment below and update the code to test the property senderRealmStr
      //var instance = new ZulipRestApi.GetMessages();
      //expect(instance).to.be();
    });

    it('should have the property streamId (base name: "stream_id")', function() {
      // uncomment below and update the code to test the property streamId
      //var instance = new ZulipRestApi.GetMessages();
      //expect(instance).to.be();
    });

    it('should have the property subject (base name: "subject")', function() {
      // uncomment below and update the code to test the property subject
      //var instance = new ZulipRestApi.GetMessages();
      //expect(instance).to.be();
    });

    it('should have the property topicLinks (base name: "topic_links")', function() {
      // uncomment below and update the code to test the property topicLinks
      //var instance = new ZulipRestApi.GetMessages();
      //expect(instance).to.be();
    });

    it('should have the property submessages (base name: "submessages")', function() {
      // uncomment below and update the code to test the property submessages
      //var instance = new ZulipRestApi.GetMessages();
      //expect(instance).to.be();
    });

    it('should have the property timestamp (base name: "timestamp")', function() {
      // uncomment below and update the code to test the property timestamp
      //var instance = new ZulipRestApi.GetMessages();
      //expect(instance).to.be();
    });

    it('should have the property type (base name: "type")', function() {
      // uncomment below and update the code to test the property type
      //var instance = new ZulipRestApi.GetMessages();
      //expect(instance).to.be();
    });

    it('should have the property flags (base name: "flags")', function() {
      // uncomment below and update the code to test the property flags
      //var instance = new ZulipRestApi.GetMessages();
      //expect(instance).to.be();
    });

    it('should have the property lastEditTimestamp (base name: "last_edit_timestamp")', function() {
      // uncomment below and update the code to test the property lastEditTimestamp
      //var instance = new ZulipRestApi.GetMessages();
      //expect(instance).to.be();
    });

    it('should have the property matchContent (base name: "match_content")', function() {
      // uncomment below and update the code to test the property matchContent
      //var instance = new ZulipRestApi.GetMessages();
      //expect(instance).to.be();
    });

    it('should have the property matchSubject (base name: "match_subject")', function() {
      // uncomment below and update the code to test the property matchSubject
      //var instance = new ZulipRestApi.GetMessages();
      //expect(instance).to.be();
    });

  });

}));
