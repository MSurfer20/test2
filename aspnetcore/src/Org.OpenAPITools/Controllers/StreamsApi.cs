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
    public class StreamsApiController : ControllerBase
    { 
        /// <summary>
        /// Archive a stream
        /// </summary>
        /// <remarks>[Archive the stream](/help/archive-a-stream) with the ID &#x60;stream_id&#x60;.  &#x60;DELETE {{ api_url }}/v1/streams/{stream_id}&#x60; </remarks>
        /// <param name="streamId">The ID of the stream to access. </param>
        /// <response code="200">Success.</response>
        /// <response code="400">Bad request.</response>
        [HttpDelete]
        [Route("/api/v1/streams/{stream_id}")]
        [ValidateModelState]
        [SwaggerOperation("ArchiveStream")]
        [SwaggerResponse(statusCode: 200, type: typeof(JsonSuccess), description: "Success.")]
        [SwaggerResponse(statusCode: 400, type: typeof(JsonError), description: "Bad request.")]
        public virtual IActionResult ArchiveStream([FromRoute (Name = "stream_id")][Required]int streamId)
        { 

            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(JsonSuccess));
            //TODO: Uncomment the next line to return response 400 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(400, default(JsonError));
            string exampleJson = null;
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<JsonSuccess>(exampleJson)
            : default(JsonSuccess);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }

        /// <summary>
        /// Create BigBlueButton video call
        /// </summary>
        /// <remarks>Create a video call URL for a BigBlueButton video call. Requires BigBlueButton to be configured on the Zulip server. </remarks>
        /// <response code="200">Success.</response>
        [HttpGet]
        [Route("/api/v1/calls/bigbluebutton/create")]
        [ValidateModelState]
        [SwaggerOperation("CreateBigBlueButtonVideoCall")]
        [SwaggerResponse(statusCode: 200, type: typeof(JsonSuccessBase), description: "Success.")]
        public virtual IActionResult CreateBigBlueButtonVideoCall()
        { 

            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(JsonSuccessBase));
            string exampleJson = null;
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<JsonSuccessBase>(exampleJson)
            : default(JsonSuccessBase);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }

        /// <summary>
        /// Delete a topic
        /// </summary>
        /// <remarks>Delete all messages in a topic.  &#x60;POST {{ api_url }}/v1/streams/{stream_id}/delete_topic&#x60;  Topics are a field on messages (not an independent data structure), so deleting all the messages in the topic deletes the topic from Zulip. </remarks>
        /// <param name="streamId">The ID of the stream to access. </param>
        /// <param name="topicName">The name of the topic to delete. </param>
        /// <response code="200">Success.</response>
        /// <response code="400">Error.</response>
        [HttpPost]
        [Route("/api/v1/streams/{stream_id}/delete_topic")]
        [ValidateModelState]
        [SwaggerOperation("DeleteTopic")]
        [SwaggerResponse(statusCode: 200, type: typeof(JsonSuccess), description: "Success.")]
        [SwaggerResponse(statusCode: 400, type: typeof(JsonError), description: "Error.")]
        public virtual IActionResult DeleteTopic([FromRoute (Name = "stream_id")][Required]int streamId, [FromQuery (Name = "topic_name")][Required()]string topicName)
        { 

            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(JsonSuccess));
            //TODO: Uncomment the next line to return response 400 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(400, default(JsonError));
            string exampleJson = null;
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<JsonSuccess>(exampleJson)
            : default(JsonSuccess);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }

        /// <summary>
        /// Get stream ID
        /// </summary>
        /// <remarks>Get the unique ID of a given stream.  &#x60;GET {{ api_url }}/v1/get_stream_id&#x60; </remarks>
        /// <param name="stream">The name of the stream to access. </param>
        /// <response code="200">Success.</response>
        /// <response code="400">Bad request.</response>
        [HttpGet]
        [Route("/api/v1/get_stream_id")]
        [ValidateModelState]
        [SwaggerOperation("GetStreamId")]
        [SwaggerResponse(statusCode: 200, type: typeof(JsonSuccessBase), description: "Success.")]
        [SwaggerResponse(statusCode: 400, type: typeof(CodedError), description: "Bad request.")]
        public virtual IActionResult GetStreamId([FromQuery (Name = "stream")][Required()]string stream)
        { 

            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(JsonSuccessBase));
            //TODO: Uncomment the next line to return response 400 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(400, default(CodedError));
            string exampleJson = null;
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<JsonSuccessBase>(exampleJson)
            : default(JsonSuccessBase);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }

        /// <summary>
        /// Get topics in a stream
        /// </summary>
        /// <remarks>Get all the topics in a specific stream  &#x60;GET {{ api_url }}/v1/users/me/{stream_id}/topics&#x60; </remarks>
        /// <param name="streamId">The ID of the stream to access. </param>
        /// <response code="200">Success.</response>
        /// <response code="400">Bad request.</response>
        [HttpGet]
        [Route("/api/v1/users/me/{stream_id}/topics")]
        [ValidateModelState]
        [SwaggerOperation("GetStreamTopics")]
        [SwaggerResponse(statusCode: 200, type: typeof(JsonSuccessBase), description: "Success.")]
        [SwaggerResponse(statusCode: 400, type: typeof(JsonError), description: "Bad request.")]
        public virtual IActionResult GetStreamTopics([FromRoute (Name = "stream_id")][Required]int streamId)
        { 

            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(JsonSuccessBase));
            //TODO: Uncomment the next line to return response 400 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(400, default(JsonError));
            string exampleJson = null;
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<JsonSuccessBase>(exampleJson)
            : default(JsonSuccessBase);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }

        /// <summary>
        /// Get all streams
        /// </summary>
        /// <remarks>Get all streams that the user has access to.  &#x60;GET {{ api_url }}/v1/streams&#x60; </remarks>
        /// <param name="includePublic">Include all public streams. </param>
        /// <param name="includeWebPublic">Include all web public streams. </param>
        /// <param name="includeSubscribed">Include all streams that the user is subscribed to. </param>
        /// <param name="includeAllActive">Include all active streams. The user must have administrative privileges to use this parameter. </param>
        /// <param name="includeDefault">Include all default streams for the user&#39;s realm. </param>
        /// <param name="includeOwnerSubscribed">If the user is a bot, include all streams that the bot&#39;s owner is subscribed to. </param>
        /// <response code="200">Success.</response>
        /// <response code="400">Bad request.</response>
        [HttpGet]
        [Route("/api/v1/streams")]
        [ValidateModelState]
        [SwaggerOperation("GetStreams")]
        [SwaggerResponse(statusCode: 200, type: typeof(JsonSuccessBase), description: "Success.")]
        [SwaggerResponse(statusCode: 400, type: typeof(CodedError), description: "Bad request.")]
        public virtual IActionResult GetStreams([FromQuery (Name = "include_public")]bool? includePublic, [FromQuery (Name = "include_web_public")]bool? includeWebPublic, [FromQuery (Name = "include_subscribed")]bool? includeSubscribed, [FromQuery (Name = "include_all_active")]bool? includeAllActive, [FromQuery (Name = "include_default")]bool? includeDefault, [FromQuery (Name = "include_owner_subscribed")]bool? includeOwnerSubscribed)
        { 

            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(JsonSuccessBase));
            //TODO: Uncomment the next line to return response 400 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(400, default(CodedError));
            string exampleJson = null;
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<JsonSuccessBase>(exampleJson)
            : default(JsonSuccessBase);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }

        /// <summary>
        /// Get the subscribers of a stream
        /// </summary>
        /// <remarks>Get all users subscribed to a stream.  &#x60;Get {{ api_url }}/v1/streams/{stream_id}/members&#x60; </remarks>
        /// <param name="streamId">The ID of the stream to access. </param>
        /// <response code="200">Success.</response>
        /// <response code="400">Bad request.</response>
        [HttpGet]
        [Route("/api/v1/streams/{stream_id}/members")]
        [ValidateModelState]
        [SwaggerOperation("GetSubscribers")]
        [SwaggerResponse(statusCode: 200, type: typeof(JsonSuccessBase), description: "Success.")]
        [SwaggerResponse(statusCode: 400, type: typeof(JsonError), description: "Bad request.")]
        public virtual IActionResult GetSubscribers([FromRoute (Name = "stream_id")][Required]int streamId)
        { 

            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(JsonSuccessBase));
            //TODO: Uncomment the next line to return response 400 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(400, default(JsonError));
            string exampleJson = null;
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<JsonSuccessBase>(exampleJson)
            : default(JsonSuccessBase);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }

        /// <summary>
        /// Get subscription status
        /// </summary>
        /// <remarks>Check whether a user is subscribed to a stream.  &#x60;GET {{ api_url }}/v1/users/{user_id}/subscriptions/{stream_id}&#x60;  **Changes**: New in Zulip 3.0 (feature level 11). </remarks>
        /// <param name="userId">The target user&#39;s ID. </param>
        /// <param name="streamId">The ID of the stream to access. </param>
        /// <response code="200">Success</response>
        [HttpGet]
        [Route("/api/v1/users/{user_id}/subscriptions/{stream_id}")]
        [ValidateModelState]
        [SwaggerOperation("GetSubscriptionStatus")]
        [SwaggerResponse(statusCode: 200, type: typeof(JsonSuccessBase), description: "Success")]
        public virtual IActionResult GetSubscriptionStatus([FromRoute (Name = "user_id")][Required]int userId, [FromRoute (Name = "stream_id")][Required]int streamId)
        { 

            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(JsonSuccessBase));
            string exampleJson = null;
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<JsonSuccessBase>(exampleJson)
            : default(JsonSuccessBase);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }

        /// <summary>
        /// Get subscribed streams
        /// </summary>
        /// <remarks>Get all streams that the user is subscribed to.  &#x60;GET {{ api_url }}/v1/users/me/subscriptions&#x60; </remarks>
        /// <param name="includeSubscribers">Whether each returned stream object should include a &#x60;subscribers&#x60; field containing a list of the user IDs of its subscribers.  (This may be significantly slower in organizations with thousands of users subscribed to many streams.)  **Changes**: New in Zulip 2.1.0. </param>
        /// <response code="200">Success.</response>
        [HttpGet]
        [Route("/api/v1/users/me/subscriptions")]
        [ValidateModelState]
        [SwaggerOperation("GetSubscriptions")]
        [SwaggerResponse(statusCode: 200, type: typeof(JsonSuccessBase), description: "Success.")]
        public virtual IActionResult GetSubscriptions([FromQuery (Name = "include_subscribers")]bool? includeSubscribers)
        { 

            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(JsonSuccessBase));
            string exampleJson = null;
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<JsonSuccessBase>(exampleJson)
            : default(JsonSuccessBase);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }

        /// <summary>
        /// Topic muting
        /// </summary>
        /// <remarks>This endpoint mutes/unmutes a topic within a stream that the current user is subscribed to.  Muted topics are displayed faded in the Zulip UI, and are not included in the user&#39;s unread count totals.  &#x60;PATCH {{ api_url }}/v1/users/me/subscriptions/muted_topics&#x60; </remarks>
        /// <param name="topic">The topic to (un)mute. Note that the request will succeed regardless of whether any messages have been sent to the specified topic. </param>
        /// <param name="op">Whether to mute (&#x60;add&#x60;) or unmute (&#x60;remove&#x60;) the provided topic. </param>
        /// <param name="stream">The name of the stream to access. </param>
        /// <param name="streamId">The ID of the stream to access. </param>
        /// <response code="200">Success.</response>
        /// <response code="400">Bad request.</response>
        [HttpPatch]
        [Route("/api/v1/users/me/subscriptions/muted_topics")]
        [ValidateModelState]
        [SwaggerOperation("MuteTopic")]
        [SwaggerResponse(statusCode: 200, type: typeof(JsonSuccess), description: "Success.")]
        [SwaggerResponse(statusCode: 400, type: typeof(OneOfobjectobject), description: "Bad request.")]
        public virtual IActionResult MuteTopic([FromQuery (Name = "topic")][Required()]string topic, [FromQuery (Name = "op")][Required()]string op, [FromQuery (Name = "stream")]string stream, [FromQuery (Name = "stream_id")]int? streamId)
        { 

            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(JsonSuccess));
            //TODO: Uncomment the next line to return response 400 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(400, default(OneOfobjectobject));
            string exampleJson = null;
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<JsonSuccess>(exampleJson)
            : default(JsonSuccess);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }

        /// <summary>
        /// Subscribe to a stream
        /// </summary>
        /// <remarks>Subscribe one or more users to one or more streams.  &#x60;POST {{ api_url }}/v1/users/me/subscriptions&#x60;  If any of the specified streams do not exist, they are automatically created.  The initial [stream settings](/api/update-stream) will be determined by the optional parameters like &#x60;invite_only&#x60; detailed below. </remarks>
        /// <param name="subscriptions">A list of dictionaries containing the key &#x60;name&#x60; and value specifying the name of the stream to subscribe. If the stream does not exist a new stream is created. The description of the stream created can be specified by setting the dictionary key &#x60;description&#x60; with an appropriate value. </param>
        /// <param name="principals">A list of user ids (preferred) or Zulip display email addresses of the users to be subscribed to or unsubscribed from the streams specified in the &#x60;subscriptions&#x60; parameter. If not provided, then the requesting user/bot is subscribed.  **Changes**: The integer format is new in Zulip 3.0 (feature level 9). </param>
        /// <param name="authorizationErrorsFatal">A boolean specifying whether authorization errors (such as when the requesting user is not authorized to access a private stream) should be considered fatal or not. When &#x60;True&#x60;, an authorization error is reported as such. When set to &#x60;False&#x60;, the response will be a 200 and any streams where the request encountered an authorization error will be listed in the &#x60;unauthorized&#x60; key. </param>
        /// <param name="announce">If one of the streams specified did not exist previously and is thus craeted by this call, this determines whether [notification bot](/help/configure-notification-bot) will send an announcement about the new stream&#39;s creation. </param>
        /// <param name="inviteOnly">As described above, this endpoint will create a new stream if passed a stream name that doesn&#39;t already exist.  This parameters and the ones that follow are used to request an initial configuration of a created stream; they are ignored for streams that already exist.  This parameter determines whether any newly created streams will be private streams. </param>
        /// <param name="historyPublicToSubscribers">Whether the stream&#39;s message history should be available to newly subscribed members, or users can only access messages they actually received while subscribed to the stream.  Corresponds to the [shared history](/help/stream-permissions) option in documentation. </param>
        /// <param name="streamPostPolicy">Policy for which users can post messages to the stream.  * 1 &#x3D;&gt; Any user can post. * 2 &#x3D;&gt; Only administrators can post. * 3 &#x3D;&gt; Only full members can post. * 4 &#x3D;&gt; Only moderators can post.  **Changes**: New in Zulip 3.0, replacing the previous &#x60;is_announcement_only&#x60; boolean. </param>
        /// <param name="messageRetentionDays">Number of days that messages sent to this stream will be stored before being automatically deleted by the [message retention policy](/help/message-retention-policy).  Two special string format values are supported:  * \&quot;realm_default\&quot; &#x3D;&gt; Return to the organization-level setting. * \&quot;forever\&quot; &#x3D;&gt; Retain messages forever.  **Changes**: New in Zulip 3.0 (feature level 17). </param>
        /// <response code="200">Success.</response>
        /// <response code="400">Success.</response>
        [HttpPost]
        [Route("/api/v1/users/me/subscriptions")]
        [ValidateModelState]
        [SwaggerOperation("Subscribe")]
        [SwaggerResponse(statusCode: 200, type: typeof(OneOfobjectobject), description: "Success.")]
        [SwaggerResponse(statusCode: 400, type: typeof(OneOfobjectobject), description: "Success.")]
        public virtual IActionResult Subscribe([FromQuery (Name = "subscriptions")][Required()]List<Object> subscriptions, [FromQuery (Name = "principals")]List<OneOfstringinteger> principals, [FromQuery (Name = "authorization_errors_fatal")]bool? authorizationErrorsFatal, [FromQuery (Name = "announce")]bool? announce, [FromQuery (Name = "invite_only")]bool? inviteOnly, [FromQuery (Name = "history_public_to_subscribers")]bool? historyPublicToSubscribers, [FromQuery (Name = "stream_post_policy")]int? streamPostPolicy, [FromQuery (Name = "message_retention_days")]OneOfstringinteger messageRetentionDays)
        { 

            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(OneOfobjectobject));
            //TODO: Uncomment the next line to return response 400 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(400, default(OneOfobjectobject));
            string exampleJson = null;
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<OneOfobjectobject>(exampleJson)
            : default(OneOfobjectobject);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }

        /// <summary>
        /// Unsubscribe from a stream
        /// </summary>
        /// <remarks>Unsubscribe yourself or other users from one or more streams.  &#x60;DELETE {{ api_url }}/v1/users/me/subscriptions&#x60; </remarks>
        /// <param name="subscriptions">A list of stream names to unsubscribe from. This parameter is called &#x60;streams&#x60; in our Python API. </param>
        /// <param name="principals">A list of user ids (preferred) or Zulip display email addresses of the users to be subscribed to or unsubscribed from the streams specified in the &#x60;subscriptions&#x60; parameter. If not provided, then the requesting user/bot is subscribed.  **Changes**: The integer format is new in Zulip 3.0 (feature level 9). </param>
        /// <response code="200">Success.</response>
        /// <response code="400">Bad request.</response>
        [HttpDelete]
        [Route("/api/v1/users/me/subscriptions")]
        [ValidateModelState]
        [SwaggerOperation("Unsubscribe")]
        [SwaggerResponse(statusCode: 200, type: typeof(JsonSuccessBase), description: "Success.")]
        [SwaggerResponse(statusCode: 400, type: typeof(NonExistingStreamError), description: "Bad request.")]
        public virtual IActionResult Unsubscribe([FromQuery (Name = "subscriptions")][Required()]List<string> subscriptions, [FromQuery (Name = "principals")]List<OneOfstringinteger> principals)
        { 

            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(JsonSuccessBase));
            //TODO: Uncomment the next line to return response 400 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(400, default(NonExistingStreamError));
            string exampleJson = null;
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<JsonSuccessBase>(exampleJson)
            : default(JsonSuccessBase);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }

        /// <summary>
        /// Update a stream
        /// </summary>
        /// <remarks>Configure the stream with the ID &#x60;stream_id&#x60;.  This endpoint supports an organization administrator editing any property of a stream, including:  * Stream [name](/help/rename-a-stream) and [description](/help/change-the-stream-description) * Stream [permissions](/help/stream-permissions), including [privacy](/help/change-the-privacy-of-a-stream) and [who can send](/help/stream-sending-policy).  &#x60;PATCH {{ api_url }}/v1/streams/{stream_id}&#x60; </remarks>
        /// <param name="streamId">The ID of the stream to access. </param>
        /// <param name="description">The new description for the stream. Limited Zulip markdown is allowed in this field.  **Changes**: Removed unnecessary JSON-encoding of this parameter in Zulip 4.0 (feature level 64). </param>
        /// <param name="newName">The new name for the stream.  **Changes**: Removed unnecessary JSON-encoding of this parameter in Zulip 4.0 (feature level 64). </param>
        /// <param name="isPrivate">Change whether the stream is a private stream. </param>
        /// <param name="isAnnouncementOnly">Whether the stream is limited to announcements.  **Changes**: Deprecated in Zulip 3.0 (feature level 1), use   &#x60;stream_post_policy&#x60; instead. </param>
        /// <param name="streamPostPolicy">Policy for which users can post messages to the stream.  * 1 &#x3D;&gt; Any user can post. * 2 &#x3D;&gt; Only administrators can post. * 3 &#x3D;&gt; Only full members can post. * 4 &#x3D;&gt; Only moderators can post.  **Changes**: New in Zulip 3.0, replacing the previous &#x60;is_announcement_only&#x60; boolean. </param>
        /// <param name="historyPublicToSubscribers">Whether the stream&#39;s message history should be available to newly subscribed members, or users can only access messages they actually received while subscribed to the stream.  Corresponds to the [shared history](/help/stream-permissions) option in documentation. </param>
        /// <param name="messageRetentionDays">Number of days that messages sent to this stream will be stored before being automatically deleted by the [message retention policy](/help/message-retention-policy).  Two special string format values are supported:  * \&quot;realm_default\&quot; &#x3D;&gt; Return to the organization-level setting. * \&quot;forever\&quot; &#x3D;&gt; Retain messages forever.  **Changes**: New in Zulip 3.0 (feature level 17). </param>
        /// <response code="200">Success.</response>
        /// <response code="400">Bad request.</response>
        [HttpPatch]
        [Route("/api/v1/streams/{stream_id}")]
        [ValidateModelState]
        [SwaggerOperation("UpdateStream")]
        [SwaggerResponse(statusCode: 200, type: typeof(JsonSuccess), description: "Success.")]
        [SwaggerResponse(statusCode: 400, type: typeof(JsonError), description: "Bad request.")]
        public virtual IActionResult UpdateStream([FromRoute (Name = "stream_id")][Required]int streamId, [FromQuery (Name = "description")]string description, [FromQuery (Name = "new_name")]string newName, [FromQuery (Name = "is_private")]bool? isPrivate, [FromQuery (Name = "is_announcement_only")]bool? isAnnouncementOnly, [FromQuery (Name = "stream_post_policy")]int? streamPostPolicy, [FromQuery (Name = "history_public_to_subscribers")]bool? historyPublicToSubscribers, [FromQuery (Name = "message_retention_days")]OneOfstringinteger messageRetentionDays)
        { 

            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(JsonSuccess));
            //TODO: Uncomment the next line to return response 400 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(400, default(JsonError));
            string exampleJson = null;
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<JsonSuccess>(exampleJson)
            : default(JsonSuccess);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }

        /// <summary>
        /// Update subscription settings
        /// </summary>
        /// <remarks>This endpoint is used to update the user&#39;s personal settings for the streams they are subscribed to, including muting, color, pinning, and per-stream notification settings.  &#x60;POST {{ api_url }}/v1/users/me/subscriptions/properties&#x60; </remarks>
        /// <param name="subscriptionData">A list of objects that describe the changes that should be applied in each subscription. Each object represents a subscription, and must have a &#x60;stream_id&#x60; key that identifies the stream, as well as the &#x60;property&#x60; being modified and its new &#x60;value&#x60;.  The possible values for each &#x60;property&#x60; and &#x60;value&#x60; pairs are:  * &#x60;color&#x60; (string): the hex value of the user&#39;s display color for the stream. * &#x60;is_muted&#x60; (boolean): whether the stream is   [muted](/help/mute-a-stream).  Prior to Zulip 2.1, this feature was   represented by the more confusingly named &#x60;in_home_view&#x60; (with the   opposite value, &#x60;in_home_view&#x3D;!is_muted&#x60;); for   backwards-compatibility, modern Zulip still accepts that value. * &#x60;pin_to_top&#x60; (boolean): whether to pin the stream at the top of the stream list. * &#x60;desktop_notifications&#x60; (boolean): whether to show desktop notifications     for all messages sent to the stream. * &#x60;audible_notifications&#x60; (boolean): whether to play a sound   notification for all messages sent to the stream. * &#x60;push_notifications&#x60; (boolean): whether to trigger a mobile push     notification for all messages sent to the stream. * &#x60;email_notifications&#x60; (boolean): whether to trigger an email     notification for all messages sent to the stream. </param>
        /// <response code="200">Success.</response>
        [HttpPost]
        [Route("/api/v1/users/me/subscriptions/properties")]
        [ValidateModelState]
        [SwaggerOperation("UpdateSubscriptionSettings")]
        [SwaggerResponse(statusCode: 200, type: typeof(JsonSuccessBase), description: "Success.")]
        public virtual IActionResult UpdateSubscriptionSettings([FromQuery (Name = "subscription_data")][Required()]List<Object> subscriptionData)
        { 

            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(JsonSuccessBase));
            string exampleJson = null;
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<JsonSuccessBase>(exampleJson)
            : default(JsonSuccessBase);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }

        /// <summary>
        /// Update subscriptions
        /// </summary>
        /// <remarks>Update which streams you are are subscribed to. </remarks>
        /// <param name="delete">A list of stream names to unsubscribe from. </param>
        /// <param name="add">A list of objects describing which streams to subscribe to, optionally including per-user subscription parameters (e.g. color) and if the stream is to be created, its description. </param>
        /// <response code="200">Success.</response>
        [HttpPatch]
        [Route("/api/v1/users/me/subscriptions")]
        [ValidateModelState]
        [SwaggerOperation("UpdateSubscriptions")]
        [SwaggerResponse(statusCode: 200, type: typeof(JsonSuccessBase), description: "Success.")]
        public virtual IActionResult UpdateSubscriptions([FromQuery (Name = "delete")]List<string> delete, [FromQuery (Name = "add")]List<Object> add)
        { 

            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(JsonSuccessBase));
            string exampleJson = null;
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<JsonSuccessBase>(exampleJson)
            : default(JsonSuccessBase);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }
    }
}
