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
    /// Module processing requests of ServerAndOrganizations domain.
    /// </summary>
    public sealed class ServerAndOrganizationsModule : NancyModule
    {
        /// <summary>
        /// Sets up HTTP methods mappings.
        /// </summary>
        /// <param name="service">Service handling requests</param>
        public ServerAndOrganizationsModule(ServerAndOrganizationsService service) : base("/api/v1")
        { 
            Post["/realm/playgrounds"] = parameters =>
            {
                var name = Parameters.ValueOf<string>(parameters, Context.Request, "name", ParameterType.Query);
                var pygmentsLanguage = Parameters.ValueOf<string>(parameters, Context.Request, "pygmentsLanguage", ParameterType.Query);
                var urlPrefix = Parameters.ValueOf<string>(parameters, Context.Request, "urlPrefix", ParameterType.Query);
                Preconditions.IsNotNull(name, "Required parameter: 'name' is missing at 'AddCodePlayground'");
                
                Preconditions.IsNotNull(pygmentsLanguage, "Required parameter: 'pygmentsLanguage' is missing at 'AddCodePlayground'");
                
                Preconditions.IsNotNull(urlPrefix, "Required parameter: 'urlPrefix' is missing at 'AddCodePlayground'");
                
                return service.AddCodePlayground(Context, name, pygmentsLanguage, urlPrefix);
            };

            Post["/realm/filters"] = parameters =>
            {
                var pattern = Parameters.ValueOf<string>(parameters, Context.Request, "pattern", ParameterType.Query);
                var urlFormatString = Parameters.ValueOf<string>(parameters, Context.Request, "urlFormatString", ParameterType.Query);
                Preconditions.IsNotNull(pattern, "Required parameter: 'pattern' is missing at 'AddLinkifier'");
                
                Preconditions.IsNotNull(urlFormatString, "Required parameter: 'urlFormatString' is missing at 'AddLinkifier'");
                
                return service.AddLinkifier(Context, pattern, urlFormatString);
            };

            Post["/realm/profile_fields"] = parameters =>
            {
                var fieldType = Parameters.ValueOf<int?>(parameters, Context.Request, "fieldType", ParameterType.Query);
                var name = Parameters.ValueOf<string>(parameters, Context.Request, "name", ParameterType.Query);
                var hint = Parameters.ValueOf<string>(parameters, Context.Request, "hint", ParameterType.Query);
                var fieldData = Parameters.ValueOf<Object>(parameters, Context.Request, "fieldData", ParameterType.Query);
                Preconditions.IsNotNull(fieldType, "Required parameter: 'fieldType' is missing at 'CreateCustomProfileField'");
                
                return service.CreateCustomProfileField(Context, fieldType, name, hint, fieldData);
            };

            Get["/realm/emoji"] = parameters =>
            {
                
                return service.GetCustomEmoji(Context);
            };

            Get["/realm/profile_fields"] = parameters =>
            {
                
                return service.GetCustomProfileFields(Context);
            };

            Get["/realm/linkifiers"] = parameters =>
            {
                
                return service.GetLinkifiers(Context);
            };

            Get["/server_settings"] = parameters =>
            {
                
                return service.GetServerSettings(Context);
            };

            Delete["/realm/playgrounds/{playground_id}"] = parameters =>
            {
                var playgroundId = Parameters.ValueOf<int?>(parameters, Context.Request, "playgroundId", ParameterType.Path);
                Preconditions.IsNotNull(playgroundId, "Required parameter: 'playgroundId' is missing at 'RemoveCodePlayground'");
                
                return service.RemoveCodePlayground(Context, playgroundId);
            };

            Delete["/realm/filters/{filter_id}"] = parameters =>
            {
                var filterId = Parameters.ValueOf<int?>(parameters, Context.Request, "filterId", ParameterType.Path);
                Preconditions.IsNotNull(filterId, "Required parameter: 'filterId' is missing at 'RemoveLinkifier'");
                
                return service.RemoveLinkifier(Context, filterId);
            };

            Patch["/realm/profile_fields"] = parameters =>
            {
                var order = Parameters.ValueOf<List<int?>>(parameters, Context.Request, "order", ParameterType.Query);
                Preconditions.IsNotNull(order, "Required parameter: 'order' is missing at 'ReorderCustomProfileFields'");
                
                return service.ReorderCustomProfileFields(Context, order);
            };

            Patch["/realm/filters/{filter_id}"] = parameters =>
            {
                var filterId = Parameters.ValueOf<int?>(parameters, Context.Request, "filterId", ParameterType.Path);
                var pattern = Parameters.ValueOf<string>(parameters, Context.Request, "pattern", ParameterType.Query);
                var urlFormatString = Parameters.ValueOf<string>(parameters, Context.Request, "urlFormatString", ParameterType.Query);
                Preconditions.IsNotNull(filterId, "Required parameter: 'filterId' is missing at 'UpdateLinkifier'");
                
                Preconditions.IsNotNull(pattern, "Required parameter: 'pattern' is missing at 'UpdateLinkifier'");
                
                Preconditions.IsNotNull(urlFormatString, "Required parameter: 'urlFormatString' is missing at 'UpdateLinkifier'");
                
                return service.UpdateLinkifier(Context, filterId, pattern, urlFormatString);
            };

            Post["/realm/emoji/{emoji_name}"] = parameters =>
            {
                var emojiName = Parameters.ValueOf<string>(parameters, Context.Request, "emojiName", ParameterType.Path);
                var filename = Parameters.ValueOf<System.IO.Stream>(parameters, Context.Request, "filename", ParameterType.Undefined);
                Preconditions.IsNotNull(emojiName, "Required parameter: 'emojiName' is missing at 'UploadCustomEmoji'");
                
                return service.UploadCustomEmoji(Context, emojiName, filename);
            };
        }
    }

    /// <summary>
    /// Service handling ServerAndOrganizations requests.
    /// </summary>
    public interface ServerAndOrganizationsService
    {
        /// <summary>
        /// Configure [code playgrounds](/help/code-blocks#code-playgrounds) for the organization.  &#x60;POST {{ api_url }}/v1/realm/playgrounds&#x60;  **Changes**: New in Zulip 4.0 (feature level 49). A parameter encoding bug was fixed in Zulip 4.0 (feature level 57). 
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="name">The user-visible display name of the playground which can be used to pick the target playground, especially when multiple playground options exist for that programming language. </param>
        /// <param name="pygmentsLanguage">The name of the Pygments language lexer for that programming language. </param>
        /// <param name="urlPrefix">The url prefix for the playground. </param>
        /// <returns>JsonSuccessBase</returns>
        JsonSuccessBase AddCodePlayground(NancyContext context, string name, string pygmentsLanguage, string urlPrefix);

        /// <summary>
        /// Configure [linkifiers](/help/add-a-custom-linkifier), regular expression patterns that are automatically linkified when they appear in messages and topics.  &#x60;POST {{ api_url }}/v1/realm/filters&#x60; 
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="pattern">The [Python regular expression](https://docs.python.org/3/howto/regex.html) that should trigger the linkifier. </param>
        /// <param name="urlFormatString">The URL used for the link. If you used named groups for the &#x60;pattern&#x60;, you can insert their content here with &#x60;%(name_of_the_capturing_group)s&#x60;. </param>
        /// <returns>JsonSuccessBase</returns>
        JsonSuccessBase AddLinkifier(NancyContext context, string pattern, string urlFormatString);

        /// <summary>
        /// [Create a custom profile field](/help/add-custom-profile-fields) in the user&#39;s organization.  &#x60;POST {{ api_url }}/v1/realm/profile_fields&#x60; 
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="fieldType">The field type can be any of the supported custom profile field types. See the [custom profile fields documentation](/help/add-custom-profile-fields) more details on what each type means.  * **1**: Short text * **2**: Long text * **3**: List of options * **4**: Date picker * **5**: Link * **6**: Person picker * **7**: External account </param>
        /// <param name="name">The name of the custom profile field, which will appear both in user-facing settings UI for configuring custom profile fields and in UI displaying a user&#39;s profile.  (optional)</param>
        /// <param name="hint">The help text to be displayed for the custom profile field in user-facing settings UI for configuring custom profile fields.  (optional)</param>
        /// <param name="fieldData">Field types 3 (List of options) and 7 (External account) support storing additional configuration for the field type in the &#x60;field_data&#x60; attribute.  For field type 3 (List of options), this attribute is a JSON dictionary defining the choices and the order they will be displayed in the dropdown UI for individual users to select an option.  The interface for field type 7 is not yet stabilized.  (optional)</param>
        /// <returns>JsonSuccessBase</returns>
        JsonSuccessBase CreateCustomProfileField(NancyContext context, int? fieldType, string name, string hint, Object fieldData);

        /// <summary>
        /// Get all the custom emoji in the user&#39;s organization.  &#x60;GET {{ api_url }}/v1/realm/emoji&#x60; 
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <returns>JsonSuccessBase</returns>
        JsonSuccessBase GetCustomEmoji(NancyContext context);

        /// <summary>
        /// Get all the [custom profile fields](/help/add-custom-profile-fields) configured for the user&#39;s organization.  &#x60;GET {{ api_url }}/v1/realm/profile_fields&#x60; 
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <returns>JsonSuccessBase</returns>
        JsonSuccessBase GetCustomProfileFields(NancyContext context);

        /// <summary>
        /// List all of an organization&#39;s configured [linkifiers](/help/add-a-custom-linkifier), regular expression patterns that are automatically linkified when they appear in messages and topics.  &#x60;GET {{ api_url }}/v1/realm/linkifiers&#x60;  **Changes**: New in Zulip 4.0 (feature level 54). On older versions, a similar &#x60;GET /realm/filters&#x60; endpoint was available with each entry in a &#x60;[pattern, url_format, id]&#x60; tuple format. 
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <returns>JsonSuccessBase</returns>
        JsonSuccessBase GetLinkifiers(NancyContext context);

        /// <summary>
        /// Fetch global settings for a Zulip server.  &#x60;GET {{ api_url }}/v1/server_settings&#x60;  **Note:** this endpoint does not require any authentication at all, and you can use it to check:  * If this is a Zulip server, and if so, what version of Zulip it&#39;s running. * What a Zulip client (e.g. a mobile app or [zulip-terminal](https://github.com/zulip/zulip-terminal/)) needs to know in order to display a login prompt for the server (e.g. what authentication methods are available). 
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <returns>JsonSuccessBase</returns>
        JsonSuccessBase GetServerSettings(NancyContext context);

        /// <summary>
        /// Remove a [code playground](/help/code-blocks#code-playgrounds) previously configured for an organization.  &#x60;DELETE {{ api_url }}/v1/realm/playgrounds/{playground_id}&#x60;  **Changes**: New in Zulip 4.0 (feature level 49). 
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="playgroundId">The ID of the playground that you want to remove. </param>
        /// <returns>JsonSuccess</returns>
        JsonSuccess RemoveCodePlayground(NancyContext context, int? playgroundId);

        /// <summary>
        /// Remove [linkifiers](/help/add-a-custom-linkifier), regular expression patterns that are automatically linkified when they appear in messages and topics.  &#x60;DELETE {{ api_url }}/v1/realm/filters/{filter_id}&#x60; 
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="filterId">The ID of the linkifier that you want to remove. </param>
        /// <returns>JsonSuccess</returns>
        JsonSuccess RemoveLinkifier(NancyContext context, int? filterId);

        /// <summary>
        /// Reorder the custom profile fields in the user&#39;s organization.  &#x60;PATCH {{ api_url }}/v1/realm/profile_fields&#x60;  Custom profile fields are displayed in Zulip UI widgets in order; this endpoint allows administrative settings UI to change the field ordering.  This endpoint is used to implement the dragging feature described in the [custom profile fields documentation](/help/add-custom-profile-fields). 
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="order">A list of the IDs of all the custom profile fields defined in this organization, in the desired new order. </param>
        /// <returns>JsonSuccess</returns>
        JsonSuccess ReorderCustomProfileFields(NancyContext context, List<int?> order);

        /// <summary>
        /// Update a [linkifier](/help/add-a-custom-linkifier), regular expression patterns that are automatically linkified when they appear in messages and topics.  &#x60;PATCH {{ api_url }}/v1/realm/filters/{filter_id}&#x60;  **Changes**: New in Zulip 4.0 (feature level 57). 
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="filterId">The ID of the linkifier that you want to update. </param>
        /// <param name="pattern">The [Python regular expression](https://docs.python.org/3/howto/regex.html) that should trigger the linkifier. </param>
        /// <param name="urlFormatString">The URL used for the link. If you used named groups for the &#x60;pattern&#x60;, you can insert their content here with &#x60;%(name_of_the_capturing_group)s&#x60;. </param>
        /// <returns>JsonSuccess</returns>
        JsonSuccess UpdateLinkifier(NancyContext context, int? filterId, string pattern, string urlFormatString);

        /// <summary>
        /// This endpoint is used to upload a custom emoji for use in the user&#39;s organization.  Access to this endpoint depends on the [organization&#39;s configuration](https://zulip.com/help/only-allow-admins-to-add-emoji).  &#x60;POST {{ api_url }}/v1/realm/emoji/{emoji_name}&#x60; 
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="emojiName">The name that should be associated with the uploaded emoji image/gif. The emoji name can only contain letters, numbers, dashes, and spaces. Upper and lower case letters are treated the same, and underscores (_) are treated the same as spaces (consistent with how the Zulip UI handles emoji). </param>
        /// <param name="filename"> (optional)</param>
        /// <returns>JsonSuccess</returns>
        JsonSuccess UploadCustomEmoji(NancyContext context, string emojiName, System.IO.Stream filename);
    }

    /// <summary>
    /// Abstraction of ServerAndOrganizationsService.
    /// </summary>
    public abstract class AbstractServerAndOrganizationsService: ServerAndOrganizationsService
    {
        public virtual JsonSuccessBase AddCodePlayground(NancyContext context, string name, string pygmentsLanguage, string urlPrefix)
        {
            return AddCodePlayground(name, pygmentsLanguage, urlPrefix);
        }

        public virtual JsonSuccessBase AddLinkifier(NancyContext context, string pattern, string urlFormatString)
        {
            return AddLinkifier(pattern, urlFormatString);
        }

        public virtual JsonSuccessBase CreateCustomProfileField(NancyContext context, int? fieldType, string name, string hint, Object fieldData)
        {
            return CreateCustomProfileField(fieldType, name, hint, fieldData);
        }

        public virtual JsonSuccessBase GetCustomEmoji(NancyContext context)
        {
            return GetCustomEmoji();
        }

        public virtual JsonSuccessBase GetCustomProfileFields(NancyContext context)
        {
            return GetCustomProfileFields();
        }

        public virtual JsonSuccessBase GetLinkifiers(NancyContext context)
        {
            return GetLinkifiers();
        }

        public virtual JsonSuccessBase GetServerSettings(NancyContext context)
        {
            return GetServerSettings();
        }

        public virtual JsonSuccess RemoveCodePlayground(NancyContext context, int? playgroundId)
        {
            return RemoveCodePlayground(playgroundId);
        }

        public virtual JsonSuccess RemoveLinkifier(NancyContext context, int? filterId)
        {
            return RemoveLinkifier(filterId);
        }

        public virtual JsonSuccess ReorderCustomProfileFields(NancyContext context, List<int?> order)
        {
            return ReorderCustomProfileFields(order);
        }

        public virtual JsonSuccess UpdateLinkifier(NancyContext context, int? filterId, string pattern, string urlFormatString)
        {
            return UpdateLinkifier(filterId, pattern, urlFormatString);
        }

        public virtual JsonSuccess UploadCustomEmoji(NancyContext context, string emojiName, System.IO.Stream filename)
        {
            return UploadCustomEmoji(emojiName, filename);
        }

        protected abstract JsonSuccessBase AddCodePlayground(string name, string pygmentsLanguage, string urlPrefix);

        protected abstract JsonSuccessBase AddLinkifier(string pattern, string urlFormatString);

        protected abstract JsonSuccessBase CreateCustomProfileField(int? fieldType, string name, string hint, Object fieldData);

        protected abstract JsonSuccessBase GetCustomEmoji();

        protected abstract JsonSuccessBase GetCustomProfileFields();

        protected abstract JsonSuccessBase GetLinkifiers();

        protected abstract JsonSuccessBase GetServerSettings();

        protected abstract JsonSuccess RemoveCodePlayground(int? playgroundId);

        protected abstract JsonSuccess RemoveLinkifier(int? filterId);

        protected abstract JsonSuccess ReorderCustomProfileFields(List<int?> order);

        protected abstract JsonSuccess UpdateLinkifier(int? filterId, string pattern, string urlFormatString);

        protected abstract JsonSuccess UploadCustomEmoji(string emojiName, System.IO.Stream filename);
    }

}
