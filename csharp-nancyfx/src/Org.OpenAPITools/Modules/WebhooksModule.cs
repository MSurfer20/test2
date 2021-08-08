using System;
using Nancy;
using Nancy.ModelBinding;
using System.Collections.Generic;
using Sharpility.Base;
using Org.OpenAPITools._api_v1.Models;
using Org.OpenAPITools._api_v1.Utils;
using NodaTime;

namespace Org.OpenAPITools._api_v1.Modules
{ 

    /// <summary>
    /// Module processing requests of Webhooks domain.
    /// </summary>
    public sealed class WebhooksModule : NancyModule
    {
        /// <summary>
        /// Sets up HTTP methods mappings.
        /// </summary>
        /// <param name="service">Service handling requests</param>
        public WebhooksModule(WebhooksService service) : base("/api/v1")
        { 
            Post["/zulip-outgoing-webhook"] = parameters =>
            {
                
                return service.ZulipOutgoingWebhooks(Context);
            };
        }
    }

    /// <summary>
    /// Service handling Webhooks requests.
    /// </summary>
    public interface WebhooksService
    {
        /// <summary>
        /// Outgoing webhooks allows to build or set up Zulip integrations which are notified when certain types of messages are sent in Zulip. 
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <returns>InlineResponse200</returns>
        InlineResponse200 ZulipOutgoingWebhooks(NancyContext context);
    }

    /// <summary>
    /// Abstraction of WebhooksService.
    /// </summary>
    public abstract class AbstractWebhooksService: WebhooksService
    {
        public virtual InlineResponse200 ZulipOutgoingWebhooks(NancyContext context)
        {
            return ZulipOutgoingWebhooks();
        }

        protected abstract InlineResponse200 ZulipOutgoingWebhooks();
    }

}
