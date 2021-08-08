/**
 * The ServerAndOrganizationsController file is a very simple one, which does not need to be changed manually,
 * unless there's a case where business logic reoutes the request to an entity which is not
 * the service.
 * The heavy lifting of the Controller item is done in Request.js - that is where request
 * parameters are extracted and sent to the service, and where response is handled.
 */

const Controller = require('./Controller');
const service = require('../services/ServerAndOrganizationsService');
const addCodePlayground = async (request, response) => {
  await Controller.handleRequest(request, response, service.addCodePlayground);
};

const addLinkifier = async (request, response) => {
  await Controller.handleRequest(request, response, service.addLinkifier);
};

const createCustomProfileField = async (request, response) => {
  await Controller.handleRequest(request, response, service.createCustomProfileField);
};

const getCustomEmoji = async (request, response) => {
  await Controller.handleRequest(request, response, service.getCustomEmoji);
};

const getCustomProfileFields = async (request, response) => {
  await Controller.handleRequest(request, response, service.getCustomProfileFields);
};

const getLinkifiers = async (request, response) => {
  await Controller.handleRequest(request, response, service.getLinkifiers);
};

const getServerSettings = async (request, response) => {
  await Controller.handleRequest(request, response, service.getServerSettings);
};

const removeCodePlayground = async (request, response) => {
  await Controller.handleRequest(request, response, service.removeCodePlayground);
};

const removeLinkifier = async (request, response) => {
  await Controller.handleRequest(request, response, service.removeLinkifier);
};

const reorderCustomProfileFields = async (request, response) => {
  await Controller.handleRequest(request, response, service.reorderCustomProfileFields);
};

const updateLinkifier = async (request, response) => {
  await Controller.handleRequest(request, response, service.updateLinkifier);
};

const uploadCustomEmoji = async (request, response) => {
  await Controller.handleRequest(request, response, service.uploadCustomEmoji);
};


module.exports = {
  addCodePlayground,
  addLinkifier,
  createCustomProfileField,
  getCustomEmoji,
  getCustomProfileFields,
  getLinkifiers,
  getServerSettings,
  removeCodePlayground,
  removeLinkifier,
  reorderCustomProfileFields,
  updateLinkifier,
  uploadCustomEmoji,
};
