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
    instance = new ZulipRestApi.UsersApi();
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

  describe('UsersApi', function() {
    describe('createUser', function() {
      it('should call createUser successfully', function(done) {
        //uncomment below and update the code to test createUser
        //instance.createUser(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('createUserGroup', function() {
      it('should call createUserGroup successfully', function(done) {
        //uncomment below and update the code to test createUserGroup
        //instance.createUserGroup(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('deactivateOwnUser', function() {
      it('should call deactivateOwnUser successfully', function(done) {
        //uncomment below and update the code to test deactivateOwnUser
        //instance.deactivateOwnUser(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('deactivateUser', function() {
      it('should call deactivateUser successfully', function(done) {
        //uncomment below and update the code to test deactivateUser
        //instance.deactivateUser(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('getAttachments', function() {
      it('should call getAttachments successfully', function(done) {
        //uncomment below and update the code to test getAttachments
        //instance.getAttachments(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('getOwnUser', function() {
      it('should call getOwnUser successfully', function(done) {
        //uncomment below and update the code to test getOwnUser
        //instance.getOwnUser(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('getUser', function() {
      it('should call getUser successfully', function(done) {
        //uncomment below and update the code to test getUser
        //instance.getUser(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('getUserByEmail', function() {
      it('should call getUserByEmail successfully', function(done) {
        //uncomment below and update the code to test getUserByEmail
        //instance.getUserByEmail(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('getUserGroups', function() {
      it('should call getUserGroups successfully', function(done) {
        //uncomment below and update the code to test getUserGroups
        //instance.getUserGroups(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('getUserPresence', function() {
      it('should call getUserPresence successfully', function(done) {
        //uncomment below and update the code to test getUserPresence
        //instance.getUserPresence(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('getUsers', function() {
      it('should call getUsers successfully', function(done) {
        //uncomment below and update the code to test getUsers
        //instance.getUsers(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('muteUser', function() {
      it('should call muteUser successfully', function(done) {
        //uncomment below and update the code to test muteUser
        //instance.muteUser(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('reactivateUser', function() {
      it('should call reactivateUser successfully', function(done) {
        //uncomment below and update the code to test reactivateUser
        //instance.reactivateUser(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('removeUserGroup', function() {
      it('should call removeUserGroup successfully', function(done) {
        //uncomment below and update the code to test removeUserGroup
        //instance.removeUserGroup(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('setTypingStatus', function() {
      it('should call setTypingStatus successfully', function(done) {
        //uncomment below and update the code to test setTypingStatus
        //instance.setTypingStatus(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('unmuteUser', function() {
      it('should call unmuteUser successfully', function(done) {
        //uncomment below and update the code to test unmuteUser
        //instance.unmuteUser(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('updateSettings', function() {
      it('should call updateSettings successfully', function(done) {
        //uncomment below and update the code to test updateSettings
        //instance.updateSettings(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('updateStatus', function() {
      it('should call updateStatus successfully', function(done) {
        //uncomment below and update the code to test updateStatus
        //instance.updateStatus(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('updateUser', function() {
      it('should call updateUser successfully', function(done) {
        //uncomment below and update the code to test updateUser
        //instance.updateUser(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('updateUserGroup', function() {
      it('should call updateUserGroup successfully', function(done) {
        //uncomment below and update the code to test updateUserGroup
        //instance.updateUserGroup(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('updateUserGroupMembers', function() {
      it('should call updateUserGroupMembers successfully', function(done) {
        //uncomment below and update the code to test updateUserGroupMembers
        //instance.updateUserGroupMembers(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
  });

}));
