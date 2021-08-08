/**
 * The DraftsController file is a very simple one, which does not need to be changed manually,
 * unless there's a case where business logic reoutes the request to an entity which is not
 * the service.
 * The heavy lifting of the Controller item is done in Request.js - that is where request
 * parameters are extracted and sent to the service, and where response is handled.
 */

const Controller = require('./Controller');
const service = require('../services/DraftsService');
const createDrafts = async (request, response) => {
  await Controller.handleRequest(request, response, service.createDrafts);
};

const deleteDraft = async (request, response) => {
  await Controller.handleRequest(request, response, service.deleteDraft);
};

const editDraft = async (request, response) => {
  await Controller.handleRequest(request, response, service.editDraft);
};

const getDrafts = async (request, response) => {
  await Controller.handleRequest(request, response, service.getDrafts);
};


module.exports = {
  createDrafts,
  deleteDraft,
  editDraft,
  getDrafts,
};
