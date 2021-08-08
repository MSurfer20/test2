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

// CommonJS-like environments that support module.exports, like Node.
factory(require('expect.js'), require(process.cwd()+'/src/index'));

'use strict';

var instance;

beforeEach(function() {
  instance = new ZulipRestApi.MessagesApi();
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

describe('MessagesApi', function() {
    describe('addReaction', function() {
      it('should call addReaction successfully', function(done) {
        //uncomment below and update the code to test addReaction
        //instance.addReaction(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('checkMessagesMatchNarrow', function() {
      it('should call checkMessagesMatchNarrow successfully', function(done) {
        //uncomment below and update the code to test checkMessagesMatchNarrow
        //instance.checkMessagesMatchNarrow(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('deleteMessage', function() {
      it('should call deleteMessage successfully', function(done) {
        //uncomment below and update the code to test deleteMessage
        //instance.deleteMessage(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('getFileTemporaryUrl', function() {
      it('should call getFileTemporaryUrl successfully', function(done) {
        //uncomment below and update the code to test getFileTemporaryUrl
        //instance.getFileTemporaryUrl(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('getMessageHistory', function() {
      it('should call getMessageHistory successfully', function(done) {
        //uncomment below and update the code to test getMessageHistory
        //instance.getMessageHistory(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('getMessages', function() {
      it('should call getMessages successfully', function(done) {
        //uncomment below and update the code to test getMessages
        //instance.getMessages(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('getRawMessage', function() {
      it('should call getRawMessage successfully', function(done) {
        //uncomment below and update the code to test getRawMessage
        //instance.getRawMessage(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('markAllAsRead', function() {
      it('should call markAllAsRead successfully', function(done) {
        //uncomment below and update the code to test markAllAsRead
        //instance.markAllAsRead(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('markStreamAsRead', function() {
      it('should call markStreamAsRead successfully', function(done) {
        //uncomment below and update the code to test markStreamAsRead
        //instance.markStreamAsRead(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('markTopicAsRead', function() {
      it('should call markTopicAsRead successfully', function(done) {
        //uncomment below and update the code to test markTopicAsRead
        //instance.markTopicAsRead(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('removeReaction', function() {
      it('should call removeReaction successfully', function(done) {
        //uncomment below and update the code to test removeReaction
        //instance.removeReaction(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('renderMessage', function() {
      it('should call renderMessage successfully', function(done) {
        //uncomment below and update the code to test renderMessage
        //instance.renderMessage(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('sendMessage', function() {
      it('should call sendMessage successfully', function(done) {
        //uncomment below and update the code to test sendMessage
        //instance.sendMessage(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('updateMessage', function() {
      it('should call updateMessage successfully', function(done) {
        //uncomment below and update the code to test updateMessage
        //instance.updateMessage(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('updateMessageFlags', function() {
      it('should call updateMessageFlags successfully', function(done) {
        //uncomment below and update the code to test updateMessageFlags
        //instance.updateMessageFlags(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('uploadFile', function() {
      it('should call uploadFile successfully', function(done) {
        //uncomment below and update the code to test uploadFile
        //instance.uploadFile(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
});