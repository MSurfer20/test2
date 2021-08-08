/**
 * The RealTimeEventsController file is a very simple one, which does not need to be changed manually,
 * unless there's a case where business logic reoutes the request to an entity which is not
 * the service.
 * The heavy lifting of the Controller item is done in Request.js - that is where request
 * parameters are extracted and sent to the service, and where response is handled.
 */

const Controller = require('./Controller');
const service = require('../services/RealTimeEventsService');
const delete_queue = async (request, response) => {
  await Controller.handleRequest(request, response, service.delete_queue);
};

const get_events = async (request, response) => {
  await Controller.handleRequest(request, response, service.get_events);
};

const real_timePOST = async (request, response) => {
  await Controller.handleRequest(request, response, service.real_timePOST);
};

const register_queue = async (request, response) => {
  await Controller.handleRequest(request, response, service.register_queue);
};

const rest_error_handling = async (request, response) => {
  await Controller.handleRequest(request, response, service.rest_error_handling);
};


module.exports = {
  delete_queue,
  get_events,
  real_timePOST,
  register_queue,
  rest_error_handling,
};
