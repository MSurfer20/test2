/**
 * The UsersController file is a very simple one, which does not need to be changed manually,
 * unless there's a case where business logic reoutes the request to an entity which is not
 * the service.
 * The heavy lifting of the Controller item is done in Request.js - that is where request
 * parameters are extracted and sent to the service, and where response is handled.
 */

const Controller = require('./Controller');
const service = require('../services/UsersService');
const createUser = async (request, response) => {
  await Controller.handleRequest(request, response, service.createUser);
};

const createUserGroup = async (request, response) => {
  await Controller.handleRequest(request, response, service.createUserGroup);
};

const deactivateOwnUser = async (request, response) => {
  await Controller.handleRequest(request, response, service.deactivateOwnUser);
};

const deactivateUser = async (request, response) => {
  await Controller.handleRequest(request, response, service.deactivateUser);
};

const getAttachments = async (request, response) => {
  await Controller.handleRequest(request, response, service.getAttachments);
};

const getOwnUser = async (request, response) => {
  await Controller.handleRequest(request, response, service.getOwnUser);
};

const getUser = async (request, response) => {
  await Controller.handleRequest(request, response, service.getUser);
};

const getUserByEmail = async (request, response) => {
  await Controller.handleRequest(request, response, service.getUserByEmail);
};

const getUserGroups = async (request, response) => {
  await Controller.handleRequest(request, response, service.getUserGroups);
};

const getUserPresence = async (request, response) => {
  await Controller.handleRequest(request, response, service.getUserPresence);
};

const getUsers = async (request, response) => {
  await Controller.handleRequest(request, response, service.getUsers);
};

const muteUser = async (request, response) => {
  await Controller.handleRequest(request, response, service.muteUser);
};

const reactivateUser = async (request, response) => {
  await Controller.handleRequest(request, response, service.reactivateUser);
};

const removeUserGroup = async (request, response) => {
  await Controller.handleRequest(request, response, service.removeUserGroup);
};

const setTypingStatus = async (request, response) => {
  await Controller.handleRequest(request, response, service.setTypingStatus);
};

const unmuteUser = async (request, response) => {
  await Controller.handleRequest(request, response, service.unmuteUser);
};

const updateSettings = async (request, response) => {
  await Controller.handleRequest(request, response, service.updateSettings);
};

const updateStatus = async (request, response) => {
  await Controller.handleRequest(request, response, service.updateStatus);
};

const updateUser = async (request, response) => {
  await Controller.handleRequest(request, response, service.updateUser);
};

const updateUserGroup = async (request, response) => {
  await Controller.handleRequest(request, response, service.updateUserGroup);
};

const updateUserGroupMembers = async (request, response) => {
  await Controller.handleRequest(request, response, service.updateUserGroupMembers);
};


module.exports = {
  createUser,
  createUserGroup,
  deactivateOwnUser,
  deactivateUser,
  getAttachments,
  getOwnUser,
  getUser,
  getUserByEmail,
  getUserGroups,
  getUserPresence,
  getUsers,
  muteUser,
  reactivateUser,
  removeUserGroup,
  setTypingStatus,
  unmuteUser,
  updateSettings,
  updateStatus,
  updateUser,
  updateUserGroup,
  updateUserGroupMembers,
};
