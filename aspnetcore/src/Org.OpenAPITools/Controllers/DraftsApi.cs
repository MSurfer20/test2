/*
 * Zulip REST API
 *
 * Powerful open source group chat 
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 * Generated by: https://openapi-generator.tech
 */

using System;
using System.Collections.Generic;
using System.ComponentModel.DataAnnotations;
using Microsoft.AspNetCore.Authorization;
using Microsoft.AspNetCore.Mvc;
using Microsoft.AspNetCore.Http;
using Swashbuckle.AspNetCore.Annotations;
using Swashbuckle.AspNetCore.SwaggerGen;
using Newtonsoft.Json;
using Org.OpenAPITools.Attributes;
using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Controllers
{ 
    /// <summary>
    /// 
    /// </summary>
    [ApiController]
    public class DraftsApiController : ControllerBase
    { 
        /// <summary>
        /// Create drafts
        /// </summary>
        /// <remarks>Create one or more drafts on the server. These drafts will be automatically synchronized to other clients via &#x60;drafts&#x60; events.  &#x60;POST {{ api_url }}/v1/drafts&#x60; </remarks>
        /// <param name="drafts">A JSON-encoded list of containing new draft objects. </param>
        /// <response code="200">Success.</response>
        /// <response code="400">Bad request.</response>
        [HttpPost]
        [Route("/api/v1/drafts")]
        [ValidateModelState]
        [SwaggerOperation("CreateDrafts")]
        [SwaggerResponse(statusCode: 200, type: typeof(JsonSuccess), description: "Success.")]
        [SwaggerResponse(statusCode: 400, type: typeof(CodedError), description: "Bad request.")]
        public virtual IActionResult CreateDrafts([FromQuery (Name = "drafts")]List<Draft> drafts)
        { 

            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(JsonSuccess));
            //TODO: Uncomment the next line to return response 400 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(400, default(CodedError));
            string exampleJson = null;
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<JsonSuccess>(exampleJson)
            : default(JsonSuccess);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }

        /// <summary>
        /// Delete a draft
        /// </summary>
        /// <remarks>Delete a single draft from the server. The deletion will be automatically synchronized to other clients via a &#x60;drafts&#x60; event.  &#x60;DELETE {{ api_url }}/v1/drafts/{draft_id}&#x60; </remarks>
        /// <param name="draftId">The ID of the draft you want to delete. </param>
        /// <response code="200">Success.</response>
        /// <response code="404">Not Found.</response>
        [HttpDelete]
        [Route("/api/v1/drafts/{draft_id}")]
        [ValidateModelState]
        [SwaggerOperation("DeleteDraft")]
        [SwaggerResponse(statusCode: 200, type: typeof(JsonSuccess), description: "Success.")]
        [SwaggerResponse(statusCode: 404, type: typeof(JsonError), description: "Not Found.")]
        public virtual IActionResult DeleteDraft([FromRoute (Name = "draft_id")][Required]int draftId)
        { 

            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(JsonSuccess));
            //TODO: Uncomment the next line to return response 404 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(404, default(JsonError));
            string exampleJson = null;
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<JsonSuccess>(exampleJson)
            : default(JsonSuccess);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }

        /// <summary>
        /// Edit a draft
        /// </summary>
        /// <remarks>Edit a draft on the server. The edit will be automatically synchronized to other clients via &#x60;drafts&#x60; events.  &#x60;PATCH {{ api_url }}/v1/drafts/{draft_id}&#x60; </remarks>
        /// <param name="draftId">The ID of the draft to be edited. </param>
        /// <param name="draft">A JSON-encoded object containing a replacement draft object for this ID. </param>
        /// <response code="200">Success.</response>
        /// <response code="404">Not Found.</response>
        [HttpPatch]
        [Route("/api/v1/drafts/{draft_id}")]
        [ValidateModelState]
        [SwaggerOperation("EditDraft")]
        [SwaggerResponse(statusCode: 200, type: typeof(JsonSuccess), description: "Success.")]
        [SwaggerResponse(statusCode: 404, type: typeof(JsonError), description: "Not Found.")]
        public virtual IActionResult EditDraft([FromRoute (Name = "draft_id")][Required]int draftId, [FromQuery (Name = "draft")][Required()]Draft draft)
        { 

            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(JsonSuccess));
            //TODO: Uncomment the next line to return response 404 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(404, default(JsonError));
            string exampleJson = null;
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<JsonSuccess>(exampleJson)
            : default(JsonSuccess);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }

        /// <summary>
        /// Get drafts
        /// </summary>
        /// <remarks>Fetch all drafts for the current user.  &#x60;GET {{ api_url }}/v1/drafts&#x60; </remarks>
        /// <response code="200">Success.</response>
        [HttpGet]
        [Route("/api/v1/drafts")]
        [ValidateModelState]
        [SwaggerOperation("GetDrafts")]
        [SwaggerResponse(statusCode: 200, type: typeof(JsonSuccess), description: "Success.")]
        public virtual IActionResult GetDrafts()
        { 

            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(JsonSuccess));
            string exampleJson = null;
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<JsonSuccess>(exampleJson)
            : default(JsonSuccess);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }
    }
}