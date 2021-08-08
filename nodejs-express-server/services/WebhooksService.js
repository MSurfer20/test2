/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Outgoing webhooks
* Outgoing webhooks allows to build or set up Zulip integrations which are notified when certain types of messages are sent in Zulip. 
*
* returns inline_response_200
* */
const zulipOutgoingWebhooks = () => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);

module.exports = {
  zulipOutgoingWebhooks,
};
