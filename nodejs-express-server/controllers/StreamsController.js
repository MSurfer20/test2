/**
 * The StreamsController file is a very simple one, which does not need to be changed manually,
 * unless there's a case where business logic reoutes the request to an entity which is not
 * the service.
 * The heavy lifting of the Controller item is done in Request.js - that is where request
 * parameters are extracted and sent to the service, and where response is handled.
 */

const Controller = require('./Controller');
const service = require('../services/StreamsService');
const archive_stream = async (request, response) => {
  await Controller.handleRequest(request, response, service.archive_stream);
};

const create_big_blue_button_video_call = async (request, response) => {
  await Controller.handleRequest(request, response, service.create_big_blue_button_video_call);
};

const get_stream_id = async (request, response) => {
  await Controller.handleRequest(request, response, service.get_stream_id);
};

const get_stream_topics = async (request, response) => {
  await Controller.handleRequest(request, response, service.get_stream_topics);
};

const get_streams = async (request, response) => {
  await Controller.handleRequest(request, response, service.get_streams);
};

const get_subscription_status = async (request, response) => {
  await Controller.handleRequest(request, response, service.get_subscription_status);
};

const get_subscriptions = async (request, response) => {
  await Controller.handleRequest(request, response, service.get_subscriptions);
};

const mute_topic = async (request, response) => {
  await Controller.handleRequest(request, response, service.mute_topic);
};

const subscribe = async (request, response) => {
  await Controller.handleRequest(request, response, service.subscribe);
};

const unsubscribe = async (request, response) => {
  await Controller.handleRequest(request, response, service.unsubscribe);
};

const update_stream = async (request, response) => {
  await Controller.handleRequest(request, response, service.update_stream);
};

const update_subscription_settings = async (request, response) => {
  await Controller.handleRequest(request, response, service.update_subscription_settings);
};

const update_subscriptions = async (request, response) => {
  await Controller.handleRequest(request, response, service.update_subscriptions);
};


module.exports = {
  archive_stream,
  create_big_blue_button_video_call,
  get_stream_id,
  get_stream_topics,
  get_streams,
  get_subscription_status,
  get_subscriptions,
  mute_topic,
  subscribe,
  unsubscribe,
  update_stream,
  update_subscription_settings,
  update_subscriptions,
};
