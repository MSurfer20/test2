/**
 * The MessagesController file is a very simple one, which does not need to be changed manually,
 * unless there's a case where business logic reoutes the request to an entity which is not
 * the service.
 * The heavy lifting of the Controller item is done in Request.js - that is where request
 * parameters are extracted and sent to the service, and where response is handled.
 */

const Controller = require('./Controller');
const service = require('../services/MessagesService');
const add_reaction = async (request, response) => {
  await Controller.handleRequest(request, response, service.add_reaction);
};

const check_messages_match_narrow = async (request, response) => {
  await Controller.handleRequest(request, response, service.check_messages_match_narrow);
};

const delete_message = async (request, response) => {
  await Controller.handleRequest(request, response, service.delete_message);
};

const get_file_temporary_url = async (request, response) => {
  await Controller.handleRequest(request, response, service.get_file_temporary_url);
};

const get_message_history = async (request, response) => {
  await Controller.handleRequest(request, response, service.get_message_history);
};

const get_messages = async (request, response) => {
  await Controller.handleRequest(request, response, service.get_messages);
};

const get_raw_message = async (request, response) => {
  await Controller.handleRequest(request, response, service.get_raw_message);
};

const mark_all_as_read = async (request, response) => {
  await Controller.handleRequest(request, response, service.mark_all_as_read);
};

const mark_stream_as_read = async (request, response) => {
  await Controller.handleRequest(request, response, service.mark_stream_as_read);
};

const mark_topic_as_read = async (request, response) => {
  await Controller.handleRequest(request, response, service.mark_topic_as_read);
};

const remove_reaction = async (request, response) => {
  await Controller.handleRequest(request, response, service.remove_reaction);
};

const render_message = async (request, response) => {
  await Controller.handleRequest(request, response, service.render_message);
};

const send_message = async (request, response) => {
  await Controller.handleRequest(request, response, service.send_message);
};

const update_message = async (request, response) => {
  await Controller.handleRequest(request, response, service.update_message);
};

const update_message_flags = async (request, response) => {
  await Controller.handleRequest(request, response, service.update_message_flags);
};

const upload_file = async (request, response) => {
  await Controller.handleRequest(request, response, service.upload_file);
};


module.exports = {
  add_reaction,
  check_messages_match_narrow,
  delete_message,
  get_file_temporary_url,
  get_message_history,
  get_messages,
  get_raw_message,
  mark_all_as_read,
  mark_stream_as_read,
  mark_topic_as_read,
  remove_reaction,
  render_message,
  send_message,
  update_message,
  update_message_flags,
  upload_file,
};
