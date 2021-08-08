/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Create drafts
* Create one or more drafts on the server. These drafts will be automatically synchronized to other clients via `drafts` events.  `POST {{ api_url }}/v1/drafts` 
*
* drafts List A JSON-encoded list of containing new draft objects.  (optional)
* returns JsonSuccess
* */
const createDrafts = ({ drafts }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        drafts,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Delete a draft
* Delete a single draft from the server. The deletion will be automatically synchronized to other clients via a `drafts` event.  `DELETE {{ api_url }}/v1/drafts/{draft_id}` 
*
* draftUnderscoreid Integer The ID of the draft you want to delete. 
* returns JsonSuccess
* */
const deleteDraft = ({ draftUnderscoreid }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        draftUnderscoreid,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Edit a draft
* Edit a draft on the server. The edit will be automatically synchronized to other clients via `drafts` events.  `PATCH {{ api_url }}/v1/drafts/{draft_id}` 
*
* draftUnderscoreid Integer The ID of the draft to be edited. 
* draft Draft A JSON-encoded object containing a replacement draft object for this ID. 
* returns JsonSuccess
* */
const editDraft = ({ draftUnderscoreid, draft }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        draftUnderscoreid,
        draft,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Get drafts
* Fetch all drafts for the current user.  `GET {{ api_url }}/v1/drafts` 
*
* returns JsonSuccess
* */
const getDrafts = () => new Promise(
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
  createDrafts,
  deleteDraft,
  editDraft,
  getDrafts,
};
