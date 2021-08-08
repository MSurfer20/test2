/**
 * The StreamsController file is a very simple one, which does not need to be changed manually,
 * unless there's a case where business logic reoutes the request to an entity which is not
 * the service.
 * The heavy lifting of the Controller item is done in Request.js - that is where request
 * parameters are extracted and sent to the service, and where response is handled.
 */

const Controller = require('./Controller');
const service = require('../services/StreamsService');
const archiveStream = async (request, response) => {
  await Controller.handleRequest(request, response, service.archiveStream);
};

const createBigBlueButtonVideoCall = async (request, response) => {
  await Controller.handleRequest(request, response, service.createBigBlueButtonVideoCall);
};

const deleteTopic = async (request, response) => {
  await Controller.handleRequest(request, response, service.deleteTopic);
};

const getStreamId = async (request, response) => {
  await Controller.handleRequest(request, response, service.getStreamId);
};

const getStreamTopics = async (request, response) => {
  await Controller.handleRequest(request, response, service.getStreamTopics);
};

const getStreams = async (request, response) => {
  await Controller.handleRequest(request, response, service.getStreams);
};

const getSubscribers = async (request, response) => {
  await Controller.handleRequest(request, response, service.getSubscribers);
};

const getSubscriptionStatus = async (request, response) => {
  await Controller.handleRequest(request, response, service.getSubscriptionStatus);
};

const getSubscriptions = async (request, response) => {
  await Controller.handleRequest(request, response, service.getSubscriptions);
};

const muteTopic = async (request, response) => {
  await Controller.handleRequest(request, response, service.muteTopic);
};

const subscribe = async (request, response) => {
  await Controller.handleRequest(request, response, service.subscribe);
};

const unsubscribe = async (request, response) => {
  await Controller.handleRequest(request, response, service.unsubscribe);
};

const updateStream = async (request, response) => {
  await Controller.handleRequest(request, response, service.updateStream);
};

const updateSubscriptionSettings = async (request, response) => {
  await Controller.handleRequest(request, response, service.updateSubscriptionSettings);
};

const updateSubscriptions = async (request, response) => {
  await Controller.handleRequest(request, response, service.updateSubscriptions);
};


module.exports = {
  archiveStream,
  createBigBlueButtonVideoCall,
  deleteTopic,
  getStreamId,
  getStreamTopics,
  getStreams,
  getSubscribers,
  getSubscriptionStatus,
  getSubscriptions,
  muteTopic,
  subscribe,
  unsubscribe,
  updateStream,
  updateSubscriptionSettings,
  updateSubscriptions,
};
