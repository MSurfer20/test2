/**
 * The UsersController file is a very simple one, which does not need to be changed manually,
 * unless there's a case where business logic reoutes the request to an entity which is not
 * the service.
 * The heavy lifting of the Controller item is done in Request.js - that is where request
 * parameters are extracted and sent to the service, and where response is handled.
 */

const Controller = require('./Controller');
const service = require('../services/UsersService');
const create_user = async (request, response) => {
  await Controller.handleRequest(request, response, service.create_user);
};

const create_user_group = async (request, response) => {
  await Controller.handleRequest(request, response, service.create_user_group);
};

const deactivate_own_user = async (request, response) => {
  await Controller.handleRequest(request, response, service.deactivate_own_user);
};

const deactivate_user = async (request, response) => {
  await Controller.handleRequest(request, response, service.deactivate_user);
};

const get_attachments = async (request, response) => {
  await Controller.handleRequest(request, response, service.get_attachments);
};

const get_own_user = async (request, response) => {
  await Controller.handleRequest(request, response, service.get_own_user);
};

const get_user = async (request, response) => {
  await Controller.handleRequest(request, response, service.get_user);
};

const get_user_by_email = async (request, response) => {
  await Controller.handleRequest(request, response, service.get_user_by_email);
};

const get_user_groups = async (request, response) => {
  await Controller.handleRequest(request, response, service.get_user_groups);
};

const get_user_presence = async (request, response) => {
  await Controller.handleRequest(request, response, service.get_user_presence);
};

const get_users = async (request, response) => {
  await Controller.handleRequest(request, response, service.get_users);
};

const mute_user = async (request, response) => {
  await Controller.handleRequest(request, response, service.mute_user);
};

const reactivate_user = async (request, response) => {
  await Controller.handleRequest(request, response, service.reactivate_user);
};

const remove_user_group = async (request, response) => {
  await Controller.handleRequest(request, response, service.remove_user_group);
};

const set_typing_status = async (request, response) => {
  await Controller.handleRequest(request, response, service.set_typing_status);
};

const unmute_user = async (request, response) => {
  await Controller.handleRequest(request, response, service.unmute_user);
};

const update_display_settings = async (request, response) => {
  await Controller.handleRequest(request, response, service.update_display_settings);
};

const update_notification_settings = async (request, response) => {
  await Controller.handleRequest(request, response, service.update_notification_settings);
};

const update_user = async (request, response) => {
  await Controller.handleRequest(request, response, service.update_user);
};

const update_user_group = async (request, response) => {
  await Controller.handleRequest(request, response, service.update_user_group);
};

const update_user_group_members = async (request, response) => {
  await Controller.handleRequest(request, response, service.update_user_group_members);
};


module.exports = {
  create_user,
  create_user_group,
  deactivate_own_user,
  deactivate_user,
  get_attachments,
  get_own_user,
  get_user,
  get_user_by_email,
  get_user_groups,
  get_user_presence,
  get_users,
  mute_user,
  reactivate_user,
  remove_user_group,
  set_typing_status,
  unmute_user,
  update_display_settings,
  update_notification_settings,
  update_user,
  update_user_group,
  update_user_group_members,
};
