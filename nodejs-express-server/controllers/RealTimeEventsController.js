/**
 * The RealTimeEventsController file is a very simple one, which does not need to be changed manually,
 * unless there's a case where business logic reoutes the request to an entity which is not
 * the service.
 * The heavy lifting of the Controller item is done in Request.js - that is where request
 * parameters are extracted and sent to the service, and where response is handled.
 */

const Controller = require('./Controller');
const service = require('../services/RealTimeEventsService');
const deleteQueue = async (request, response) => {
  await Controller.handleRequest(request, response, service.deleteQueue);
};

const getEvents = async (request, response) => {
  await Controller.handleRequest(request, response, service.getEvents);
};

const real_timePOST = async (request, response) => {
  await Controller.handleRequest(request, response, service.real_timePOST);
};

const registerQueue = async (request, response) => {
  await Controller.handleRequest(request, response, service.registerQueue);
};

const restErrorHandling = async (request, response) => {
  await Controller.handleRequest(request, response, service.restErrorHandling);
};


module.exports = {
  deleteQueue,
  getEvents,
  real_timePOST,
  registerQueue,
  restErrorHandling,
};
