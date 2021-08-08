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
    /// Module processing requests of Drafts domain.
    /// </summary>
    public sealed class DraftsModule : NancyModule
    {
        /// <summary>
        /// Sets up HTTP methods mappings.
        /// </summary>
        /// <param name="service">Service handling requests</param>
        public DraftsModule(DraftsService service) : base("/api/v1")
        { 
            Post["/drafts"] = parameters =>
            {
                var drafts = Parameters.ValueOf<List<Draft>>(parameters, Context.Request, "drafts", ParameterType.Query);
                return service.CreateDrafts(Context, drafts);
            };

            Delete["/drafts/{draft_id}"] = parameters =>
            {
                var draftId = Parameters.ValueOf<int?>(parameters, Context.Request, "draftId", ParameterType.Path);
                Preconditions.IsNotNull(draftId, "Required parameter: 'draftId' is missing at 'DeleteDraft'");
                
                return service.DeleteDraft(Context, draftId);
            };

            Patch["/drafts/{draft_id}"] = parameters =>
            {
                var draftId = Parameters.ValueOf<int?>(parameters, Context.Request, "draftId", ParameterType.Path);
                var draft = Parameters.ValueOf<Draft>(parameters, Context.Request, "draft", ParameterType.Query);
                Preconditions.IsNotNull(draftId, "Required parameter: 'draftId' is missing at 'EditDraft'");
                
                Preconditions.IsNotNull(draft, "Required parameter: 'draft' is missing at 'EditDraft'");
                
                return service.EditDraft(Context, draftId, draft);
            };

            Get["/drafts"] = parameters =>
            {
                
                return service.GetDrafts(Context);
            };
        }
    }

    /// <summary>
    /// Service handling Drafts requests.
    /// </summary>
    public interface DraftsService
    {
        /// <summary>
        /// Create one or more drafts on the server. These drafts will be automatically synchronized to other clients via &#x60;drafts&#x60; events.  &#x60;POST {{ api_url }}/v1/drafts&#x60; 
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="drafts">A JSON-encoded list of containing new draft objects.  (optional)</param>
        /// <returns>JsonSuccess</returns>
        JsonSuccess CreateDrafts(NancyContext context, List<Draft> drafts);

        /// <summary>
        /// Delete a single draft from the server. The deletion will be automatically synchronized to other clients via a &#x60;drafts&#x60; event.  &#x60;DELETE {{ api_url }}/v1/drafts/{draft_id}&#x60; 
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="draftId">The ID of the draft you want to delete. </param>
        /// <returns>JsonSuccess</returns>
        JsonSuccess DeleteDraft(NancyContext context, int? draftId);

        /// <summary>
        /// Edit a draft on the server. The edit will be automatically synchronized to other clients via &#x60;drafts&#x60; events.  &#x60;PATCH {{ api_url }}/v1/drafts/{draft_id}&#x60; 
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="draftId">The ID of the draft to be edited. </param>
        /// <param name="draft">A JSON-encoded object containing a replacement draft object for this ID. </param>
        /// <returns>JsonSuccess</returns>
        JsonSuccess EditDraft(NancyContext context, int? draftId, Draft draft);

        /// <summary>
        /// Fetch all drafts for the current user.  &#x60;GET {{ api_url }}/v1/drafts&#x60; 
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <returns>JsonSuccess</returns>
        JsonSuccess GetDrafts(NancyContext context);
    }

    /// <summary>
    /// Abstraction of DraftsService.
    /// </summary>
    public abstract class AbstractDraftsService: DraftsService
    {
        public virtual JsonSuccess CreateDrafts(NancyContext context, List<Draft> drafts)
        {
            return CreateDrafts(drafts);
        }

        public virtual JsonSuccess DeleteDraft(NancyContext context, int? draftId)
        {
            return DeleteDraft(draftId);
        }

        public virtual JsonSuccess EditDraft(NancyContext context, int? draftId, Draft draft)
        {
            return EditDraft(draftId, draft);
        }

        public virtual JsonSuccess GetDrafts(NancyContext context)
        {
            return GetDrafts();
        }

        protected abstract JsonSuccess CreateDrafts(List<Draft> drafts);

        protected abstract JsonSuccess DeleteDraft(int? draftId);

        protected abstract JsonSuccess EditDraft(int? draftId, Draft draft);

        protected abstract JsonSuccess GetDrafts();
    }

}
