/**
 * The MessagesController file is a very simple one, which does not need to be changed manually,
 * unless there's a case where business logic reoutes the request to an entity which is not
 * the service.
 * The heavy lifting of the Controller item is done in Request.js - that is where request
 * parameters are extracted and sent to the service, and where response is handled.
 */

const Controller = require('./Controller');
const service = require('../services/MessagesService');
const addReaction = async (request, response) => {
  await Controller.handleRequest(request, response, service.addReaction);
};

const checkMessagesMatchNarrow = async (request, response) => {
  await Controller.handleRequest(request, response, service.checkMessagesMatchNarrow);
};

const deleteMessage = async (request, response) => {
  await Controller.handleRequest(request, response, service.deleteMessage);
};

const getFileTemporaryUrl = async (request, response) => {
  await Controller.handleRequest(request, response, service.getFileTemporaryUrl);
};

const getMessageHistory = async (request, response) => {
  await Controller.handleRequest(request, response, service.getMessageHistory);
};

const getMessages = async (request, response) => {
  await Controller.handleRequest(request, response, service.getMessages);
};

const getRawMessage = async (request, response) => {
  await Controller.handleRequest(request, response, service.getRawMessage);
};

const markAllAsRead = async (request, response) => {
  await Controller.handleRequest(request, response, service.markAllAsRead);
};

const markStreamAsRead = async (request, response) => {
  await Controller.handleRequest(request, response, service.markStreamAsRead);
};

const markTopicAsRead = async (request, response) => {
  await Controller.handleRequest(request, response, service.markTopicAsRead);
};

const removeReaction = async (request, response) => {
  await Controller.handleRequest(request, response, service.removeReaction);
};

const renderMessage = async (request, response) => {
  await Controller.handleRequest(request, response, service.renderMessage);
};

const sendMessage = async (request, response) => {
  await Controller.handleRequest(request, response, service.sendMessage);
};

const updateMessage = async (request, response) => {
  await Controller.handleRequest(request, response, service.updateMessage);
};

const updateMessageFlags = async (request, response) => {
  await Controller.handleRequest(request, response, service.updateMessageFlags);
};

const uploadFile = async (request, response) => {
  await Controller.handleRequest(request, response, service.uploadFile);
};


module.exports = {
  addReaction,
  checkMessagesMatchNarrow,
  deleteMessage,
  getFileTemporaryUrl,
  getMessageHistory,
  getMessages,
  getRawMessage,
  markAllAsRead,
  markStreamAsRead,
  markTopicAsRead,
  removeReaction,
  renderMessage,
  sendMessage,
  updateMessage,
  updateMessageFlags,
  uploadFile,
};
