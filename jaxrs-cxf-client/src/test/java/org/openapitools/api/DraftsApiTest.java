/**
 * Zulip REST API
 * Powerful open source group chat 
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.api;

import org.openapitools.model.CodedError;
import org.openapitools.model.Draft;
import org.openapitools.model.JsonError;
import org.openapitools.model.JsonSuccess;
import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

import javax.ws.rs.core.Response;
import org.apache.cxf.jaxrs.client.JAXRSClientFactory;
import org.apache.cxf.jaxrs.client.ClientConfiguration;
import org.apache.cxf.jaxrs.client.WebClient;


import com.fasterxml.jackson.jaxrs.json.JacksonJsonProvider;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;




/**
 * Zulip REST API
 *
 * <p>Powerful open source group chat 
 *
 * API tests for DraftsApi 
 */
public class DraftsApiTest {


    private DraftsApi api;
    
    @Before
    public void setup() {
        JacksonJsonProvider provider = new JacksonJsonProvider();
        List providers = new ArrayList();
        providers.add(provider);
        
        api = JAXRSClientFactory.create("https://example.zulipchat.com/api/v1", DraftsApi.class, providers);
        org.apache.cxf.jaxrs.client.Client client = WebClient.client(api);
        
        ClientConfiguration config = WebClient.getConfig(client); 
    }

    
    /**
     * Create drafts
     *
     * Create one or more drafts on the server. These drafts will be automatically synchronized to other clients via &#x60;drafts&#x60; events.  &#x60;POST {{ api_url }}/v1/drafts&#x60; 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createDraftsTest() {
        List<Draft> drafts = null;
        //JsonSuccess response = api.createDrafts(drafts);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    
    /**
     * Delete a draft
     *
     * Delete a single draft from the server. The deletion will be automatically synchronized to other clients via a &#x60;drafts&#x60; event.  &#x60;DELETE {{ api_url }}/v1/drafts/{draft_id}&#x60; 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteDraftTest() {
        Integer draftId = null;
        //JsonSuccess response = api.deleteDraft(draftId);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    
    /**
     * Edit a draft
     *
     * Edit a draft on the server. The edit will be automatically synchronized to other clients via &#x60;drafts&#x60; events.  &#x60;PATCH {{ api_url }}/v1/drafts/{draft_id}&#x60; 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void editDraftTest() {
        Integer draftId = null;
        Draft draft = null;
        //JsonSuccess response = api.editDraft(draftId, draft);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    
    /**
     * Get drafts
     *
     * Fetch all drafts for the current user.  &#x60;GET {{ api_url }}/v1/drafts&#x60; 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDraftsTest() {
        //JsonSuccess response = api.getDrafts();
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    
}
