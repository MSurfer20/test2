package org.openapitools.api.impl;

import org.openapitools.api.*;
import org.openapitools.model.InlineResponse200;

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
public class WebhooksApiServiceImpl implements WebhooksApi {
    /**
     * Outgoing webhooks
     *
     * Outgoing webhooks allows to build or set up Zulip integrations which are notified when certain types of messages are sent in Zulip. 
     *
     */
    public InlineResponse200 zulipOutgoingWebhooks() {
        // TODO: Implement...
        
        return null;
    }
    
}

