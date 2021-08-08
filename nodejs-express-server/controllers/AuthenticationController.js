/**
 * The AuthenticationController file is a very simple one, which does not need to be changed manually,
 * unless there's a case where business logic reoutes the request to an entity which is not
 * the service.
 * The heavy lifting of the Controller item is done in Request.js - that is where request
 * parameters are extracted and sent to the service, and where response is handled.
 */

const Controller = require('./Controller');
const service = require('../services/AuthenticationService');
const dev_fetch_api_key = async (request, response) => {
  await Controller.handleRequest(request, response, service.dev_fetch_api_key);
};

const fetch_api_key = async (request, response) => {
  await Controller.handleRequest(request, response, service.fetch_api_key);
};


module.exports = {
  dev_fetch_api_key,
  fetch_api_key,
};
