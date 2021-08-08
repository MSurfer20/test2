/**
 * The ServerAndOrganizationsController file is a very simple one, which does not need to be changed manually,
 * unless there's a case where business logic reoutes the request to an entity which is not
 * the service.
 * The heavy lifting of the Controller item is done in Request.js - that is where request
 * parameters are extracted and sent to the service, and where response is handled.
 */

const Controller = require('./Controller');
const service = require('../services/ServerAndOrganizationsService');
const add_code_playground = async (request, response) => {
  await Controller.handleRequest(request, response, service.add_code_playground);
};

const add_linkifier = async (request, response) => {
  await Controller.handleRequest(request, response, service.add_linkifier);
};

const create_custom_profile_field = async (request, response) => {
  await Controller.handleRequest(request, response, service.create_custom_profile_field);
};

const get_custom_emoji = async (request, response) => {
  await Controller.handleRequest(request, response, service.get_custom_emoji);
};

const get_custom_profile_fields = async (request, response) => {
  await Controller.handleRequest(request, response, service.get_custom_profile_fields);
};

const get_linkifiers = async (request, response) => {
  await Controller.handleRequest(request, response, service.get_linkifiers);
};

const get_server_settings = async (request, response) => {
  await Controller.handleRequest(request, response, service.get_server_settings);
};

const remove_code_playground = async (request, response) => {
  await Controller.handleRequest(request, response, service.remove_code_playground);
};

const remove_linkifier = async (request, response) => {
  await Controller.handleRequest(request, response, service.remove_linkifier);
};

const reorder_custom_profile_fields = async (request, response) => {
  await Controller.handleRequest(request, response, service.reorder_custom_profile_fields);
};

const update_linkifier = async (request, response) => {
  await Controller.handleRequest(request, response, service.update_linkifier);
};

const upload_custom_emoji = async (request, response) => {
  await Controller.handleRequest(request, response, service.upload_custom_emoji);
};


module.exports = {
  add_code_playground,
  add_linkifier,
  create_custom_profile_field,
  get_custom_emoji,
  get_custom_profile_fields,
  get_linkifiers,
  get_server_settings,
  remove_code_playground,
  remove_linkifier,
  reorder_custom_profile_fields,
  update_linkifier,
  upload_custom_emoji,
};
