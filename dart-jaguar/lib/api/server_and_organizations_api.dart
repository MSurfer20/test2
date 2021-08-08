import 'package:jaguar_retrofit/annotations/annotations.dart';
import 'package:jaguar_retrofit/jaguar_retrofit.dart';
import 'package:jaguar_serializer/jaguar_serializer.dart';
import 'package:jaguar_mimetype/jaguar_mimetype.dart';
import 'dart:async';

import 'package:openapi/model/json_success_base.dart';
import 'package:openapi/model/json_success.dart';

part 'server_and_organizations_api.jretro.dart';

@GenApiClient()
class ServerAndOrganizationsApi extends ApiClient with _$ServerAndOrganizationsApiClient {
    final Route base;
    final Map<String, CodecRepo> converters;
    final Duration timeout;

    ServerAndOrganizationsApi({this.base, this.converters, this.timeout = const Duration(minutes: 2)});

    /// Add a code playground
    ///
    /// Configure [code playgrounds](/help/code-blocks#code-playgrounds) for the organization.  &#x60;POST {{ api_url }}/v1/realm/playgrounds&#x60;  **Changes**: New in Zulip 4.0 (feature level 49). A parameter encoding bug was fixed in Zulip 4.0 (feature level 57). 
    @PostReq(path: "/realm/playgrounds")
    Future<JsonSuccessBase> addCodePlayground(
        
            @QueryParam("name") String name, 
        
            @QueryParam("pygments_language") String pygmentsLanguage, 
        
            @QueryParam("url_prefix") String urlPrefix
        ) {
        return super.addCodePlayground(
        
        name, 
        
        pygmentsLanguage, 
        
        urlPrefix

        ).timeout(timeout);
    }

    /// Add a linkifier
    ///
    /// Configure [linkifiers](/help/add-a-custom-linkifier), regular expression patterns that are automatically linkified when they appear in messages and topics.  &#x60;POST {{ api_url }}/v1/realm/filters&#x60; 
    @PostReq(path: "/realm/filters")
    Future<JsonSuccessBase> addLinkifier(
        
            @QueryParam("pattern") String pattern, 
        
            @QueryParam("url_format_string") String urlFormatString
        ) {
        return super.addLinkifier(
        
        pattern, 
        
        urlFormatString

        ).timeout(timeout);
    }

    /// Create a custom profile field
    ///
    /// [Create a custom profile field](/help/add-custom-profile-fields) in the user&#39;s organization.  &#x60;POST {{ api_url }}/v1/realm/profile_fields&#x60; 
    @PostReq(path: "/realm/profile_fields")
    Future<JsonSuccessBase> createCustomProfileField(
        
            @QueryParam("name") String name, 
        
            @QueryParam("hint") String hint, 
        
            @QueryParam("field_type") int fieldType, 
        
            @QueryParam("field_data") Object fieldData
        ) {
        return super.createCustomProfileField(
        
        name, 
        
        hint, 
        
        fieldType, 
        
        fieldData

        ).timeout(timeout);
    }

    /// Get all custom emoji
    ///
    /// Get all the custom emoji in the user&#39;s organization.  &#x60;GET {{ api_url }}/v1/realm/emoji&#x60; 
    @GetReq(path: "/realm/emoji")
    Future<JsonSuccessBase> getCustomEmoji(
        ) {
        return super.getCustomEmoji(

        ).timeout(timeout);
    }

    /// Get all custom profile fields
    ///
    /// Get all the [custom profile fields](/help/add-custom-profile-fields) configured for the user&#39;s organization.  &#x60;GET {{ api_url }}/v1/realm/profile_fields&#x60; 
    @GetReq(path: "/realm/profile_fields")
    Future<JsonSuccessBase> getCustomProfileFields(
        ) {
        return super.getCustomProfileFields(

        ).timeout(timeout);
    }

    /// Get linkifiers
    ///
    /// List all of an organization&#39;s configured [linkifiers](/help/add-a-custom-linkifier), regular expression patterns that are automatically linkified when they appear in messages and topics.  &#x60;GET {{ api_url }}/v1/realm/linkifiers&#x60;  **Changes**: New in Zulip 4.0 (feature level 54). On older versions, a similar &#x60;GET /realm/filters&#x60; endpoint was available with each entry in a &#x60;[pattern, url_format, id]&#x60; tuple format. 
    @GetReq(path: "/realm/linkifiers")
    Future<JsonSuccessBase> getLinkifiers(
        ) {
        return super.getLinkifiers(

        ).timeout(timeout);
    }

    /// Get server settings
    ///
    /// Fetch global settings for a Zulip server.  &#x60;GET {{ api_url }}/v1/server_settings&#x60;  **Note:** this endpoint does not require any authentication at all, and you can use it to check:  * If this is a Zulip server, and if so, what version of Zulip it&#39;s running. * What a Zulip client (e.g. a mobile app or [zulip-terminal](https://github.com/zulip/zulip-terminal/)) needs to know in order to display a login prompt for the server (e.g. what authentication methods are available). 
    @GetReq(path: "/server_settings")
    Future<JsonSuccessBase> getServerSettings(
        ) {
        return super.getServerSettings(

        ).timeout(timeout);
    }

    /// Remove a code playground
    ///
    /// Remove a [code playground](/help/code-blocks#code-playgrounds) previously configured for an organization.  &#x60;DELETE {{ api_url }}/v1/realm/playgrounds/{playground_id}&#x60;  **Changes**: New in Zulip 4.0 (feature level 49). 
    @DeleteReq(path: "/realm/playgrounds/:playground_id")
    Future<JsonSuccess> removeCodePlayground(
            @PathParam("playground_id") int playgroundId
        ) {
        return super.removeCodePlayground(
        playgroundId

        ).timeout(timeout);
    }

    /// Remove a linkifier
    ///
    /// Remove [linkifiers](/help/add-a-custom-linkifier), regular expression patterns that are automatically linkified when they appear in messages and topics.  &#x60;DELETE {{ api_url }}/v1/realm/filters/{filter_id}&#x60; 
    @DeleteReq(path: "/realm/filters/:filter_id")
    Future<JsonSuccess> removeLinkifier(
            @PathParam("filter_id") int filterId
        ) {
        return super.removeLinkifier(
        filterId

        ).timeout(timeout);
    }

    /// Reorder custom profile fields
    ///
    /// Reorder the custom profile fields in the user&#39;s organization.  &#x60;PATCH {{ api_url }}/v1/realm/profile_fields&#x60;  Custom profile fields are displayed in Zulip UI widgets in order; this endpoint allows administrative settings UI to change the field ordering.  This endpoint is used to implement the dragging feature described in the [custom profile fields documentation](/help/add-custom-profile-fields). 
    @PatchReq(path: "/realm/profile_fields")
    Future<JsonSuccess> reorderCustomProfileFields(
        
            @QueryParam("order") List<int> order
        ) {
        return super.reorderCustomProfileFields(
        
        order

        ).timeout(timeout);
    }

    /// Update a linkifier
    ///
    /// Update a [linkifier](/help/add-a-custom-linkifier), regular expression patterns that are automatically linkified when they appear in messages and topics.  &#x60;PATCH {{ api_url }}/v1/realm/filters/{filter_id}&#x60;  **Changes**: New in Zulip 4.0 (feature level 57). 
    @PatchReq(path: "/realm/filters/:filter_id")
    Future<JsonSuccess> updateLinkifier(
            @PathParam("filter_id") int filterId
        ,
            @QueryParam("pattern") String pattern, 
        
            @QueryParam("url_format_string") String urlFormatString
        ) {
        return super.updateLinkifier(
        filterId
        ,
        pattern, 
        
        urlFormatString

        ).timeout(timeout);
    }

    /// Upload custom emoji
    ///
    /// This endpoint is used to upload a custom emoji for use in the user&#39;s organization.  Access to this endpoint depends on the [organization&#39;s configuration](https://zulip.com/help/only-allow-admins-to-add-emoji).  &#x60;POST {{ api_url }}/v1/realm/emoji/{emoji_name}&#x60; 
    @PostReq(path: "/realm/emoji/:emoji_name")
    Future<JsonSuccess> uploadCustomEmoji(
            @PathParam("emoji_name") String emojiName
            ,
            @AsMultipartField() MultipartFile filename
        ) {
        return super.uploadCustomEmoji(
        emojiName

        ,
        filename
        ).timeout(timeout);
    }


}
