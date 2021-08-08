package org.openapitools.api.impl;

import org.openapitools.api.*;
import org.openapitools.model.CodedError;
import org.openapitools.model.Draft;
import org.openapitools.model.JsonError;
import org.openapitools.model.JsonSuccess;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import org.apache.cxf.jaxrs.model.wadl.Description;
import org.apache.cxf.jaxrs.model.wadl.DocTarget;

import org.apache.cxf.jaxrs.ext.multipart.*;

import io.swagger.annotations.Api;

/**
 * Zulip REST API
 *
 * <p>Powerful open source group chat 
 *
 */
public class DraftsApiServiceImpl implements DraftsApi {
    /**
     * Create drafts
     *
     * Create one or more drafts on the server. These drafts will be automatically synchronized to other clients via &#x60;drafts&#x60; events.  &#x60;POST {{ api_url }}/v1/drafts&#x60; 
     *
     */
    @Override
    public JsonSuccess createDrafts(List<Draft> drafts) {
        // TODO: Implement...
        return null;
    }

    /**
     * Delete a draft
     *
     * Delete a single draft from the server. The deletion will be automatically synchronized to other clients via a &#x60;drafts&#x60; event.  &#x60;DELETE {{ api_url }}/v1/drafts/{draft_id}&#x60; 
     *
     */
    @Override
    public JsonSuccess deleteDraft(Integer draftId) {
        // TODO: Implement...
        return null;
    }

    /**
     * Edit a draft
     *
     * Edit a draft on the server. The edit will be automatically synchronized to other clients via &#x60;drafts&#x60; events.  &#x60;PATCH {{ api_url }}/v1/drafts/{draft_id}&#x60; 
     *
     */
    @Override
    public JsonSuccess editDraft(Integer draftId, Draft draft) {
        // TODO: Implement...
        return null;
    }

    /**
     * Get drafts
     *
     * Fetch all drafts for the current user.  &#x60;GET {{ api_url }}/v1/drafts&#x60; 
     *
     */
    @Override
    public JsonSuccess getDrafts() {
        // TODO: Implement...
        return null;
    }

}
