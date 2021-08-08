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
/* tslint:disable:no-unused-variable member-ordering */

import { HttpService, Inject, Injectable, Optional } from '@nestjs/common';
import { AxiosResponse } from 'axios';
import { Observable } from 'rxjs';
import { JsonSuccess } from '../model/jsonSuccess';
import { JsonSuccessBase } from '../model/jsonSuccessBase';
import { Configuration } from '../configuration';


@Injectable()
export class ServerAndOrganizationsService {

    protected basePath = 'https://example.zulipchat.com/api/v1';
    public defaultHeaders = new Map()
    public configuration = new Configuration();

    constructor(protected httpClient: HttpService, @Optional() configuration: Configuration) {
        this.configuration = configuration || this.configuration;
        this.basePath = configuration?.basePath || this.basePath;
    }

    /**
     * @param consumes string[] mime-types
     * @return true: consumes contains 'multipart/form-data', false: otherwise
     */
    private canConsumeForm(consumes: string[]): boolean {
        const form = 'multipart/form-data';
        return consumes.includes(form);
    }

    /**
     * Add a code playground
     * Configure [code playgrounds](/help/code-blocks#code-playgrounds) for the organization.  &#x60;POST {{ api_url }}/v1/realm/playgrounds&#x60;  **Changes**: New in Zulip 4.0 (feature level 49). A parameter encoding bug was fixed in Zulip 4.0 (feature level 57). 
     * @param name The user-visible display name of the playground which can be used to pick the target playground, especially when multiple playground options exist for that programming language. 
     * @param pygmentsLanguage The name of the Pygments language lexer for that programming language. 
     * @param urlPrefix The url prefix for the playground. 
     * @param observe set whether or not to return the data Observable as the body, response or events. defaults to returning the body.
     * @param reportProgress flag to report request and response progress.
     */
    public addCodePlayground(name: string, pygmentsLanguage: string, urlPrefix: string, ): Observable<AxiosResponse<JsonSuccessBase & object>>;
    public addCodePlayground(name: string, pygmentsLanguage: string, urlPrefix: string, ): Observable<any> {

        if (name === null || name === undefined) {
            throw new Error('Required parameter name was null or undefined when calling addCodePlayground.');
        }

        if (pygmentsLanguage === null || pygmentsLanguage === undefined) {
            throw new Error('Required parameter pygmentsLanguage was null or undefined when calling addCodePlayground.');
        }

        if (urlPrefix === null || urlPrefix === undefined) {
            throw new Error('Required parameter urlPrefix was null or undefined when calling addCodePlayground.');
        }

        let queryParameters = {};   
        if (name !== undefined && name !== null) {
            queryParameters['name'] = <any>name;
        }
        if (pygmentsLanguage !== undefined && pygmentsLanguage !== null) {
            queryParameters['pygments_language'] = <any>pygmentsLanguage;
        }
        if (urlPrefix !== undefined && urlPrefix !== null) {
            queryParameters['url_prefix'] = <any>urlPrefix;
        }

        let headers = this.defaultHeaders;

        // to determine the Accept header
        let httpHeaderAccepts: string[] = [
            'application/json'
        ];
        const httpHeaderAcceptSelected: string | undefined = this.configuration.selectHeaderAccept(httpHeaderAccepts);
        if (httpHeaderAcceptSelected != undefined) {
            headers['Accept'] = httpHeaderAcceptSelected;
        }

        // to determine the Content-Type header
        const consumes: string[] = [
        ];
        return this.httpClient.post<JsonSuccessBase & object>(`${this.basePath}/realm/playgrounds`,
            null,
            {
                params: queryParameters,
                withCredentials: this.configuration.withCredentials,
                headers: headers
            }
        );
    }
    /**
     * Add a linkifier
     * Configure [linkifiers](/help/add-a-custom-linkifier), regular expression patterns that are automatically linkified when they appear in messages and topics.  &#x60;POST {{ api_url }}/v1/realm/filters&#x60; 
     * @param pattern The [Python regular expression](https://docs.python.org/3/howto/regex.html) that should trigger the linkifier. 
     * @param urlFormatString The URL used for the link. If you used named groups for the &#x60;pattern&#x60;, you can insert their content here with &#x60;%(name_of_the_capturing_group)s&#x60;. 
     * @param observe set whether or not to return the data Observable as the body, response or events. defaults to returning the body.
     * @param reportProgress flag to report request and response progress.
     */
    public addLinkifier(pattern: string, urlFormatString: string, ): Observable<AxiosResponse<JsonSuccessBase & object>>;
    public addLinkifier(pattern: string, urlFormatString: string, ): Observable<any> {

        if (pattern === null || pattern === undefined) {
            throw new Error('Required parameter pattern was null or undefined when calling addLinkifier.');
        }

        if (urlFormatString === null || urlFormatString === undefined) {
            throw new Error('Required parameter urlFormatString was null or undefined when calling addLinkifier.');
        }

        let queryParameters = {};   
        if (pattern !== undefined && pattern !== null) {
            queryParameters['pattern'] = <any>pattern;
        }
        if (urlFormatString !== undefined && urlFormatString !== null) {
            queryParameters['url_format_string'] = <any>urlFormatString;
        }

        let headers = this.defaultHeaders;

        // to determine the Accept header
        let httpHeaderAccepts: string[] = [
            'application/json'
        ];
        const httpHeaderAcceptSelected: string | undefined = this.configuration.selectHeaderAccept(httpHeaderAccepts);
        if (httpHeaderAcceptSelected != undefined) {
            headers['Accept'] = httpHeaderAcceptSelected;
        }

        // to determine the Content-Type header
        const consumes: string[] = [
        ];
        return this.httpClient.post<JsonSuccessBase & object>(`${this.basePath}/realm/filters`,
            null,
            {
                params: queryParameters,
                withCredentials: this.configuration.withCredentials,
                headers: headers
            }
        );
    }
    /**
     * Create a custom profile field
     * [Create a custom profile field](/help/add-custom-profile-fields) in the user\&#39;s organization.  &#x60;POST {{ api_url }}/v1/realm/profile_fields&#x60; 
     * @param fieldType The field type can be any of the supported custom profile field types. See the [custom profile fields documentation](/help/add-custom-profile-fields) more details on what each type means.  * **1**: Short text * **2**: Long text * **3**: List of options * **4**: Date picker * **5**: Link * **6**: Person picker * **7**: External account 
     * @param name The name of the custom profile field, which will appear both in user-facing settings UI for configuring custom profile fields and in UI displaying a user\&#39;s profile. 
     * @param hint The help text to be displayed for the custom profile field in user-facing settings UI for configuring custom profile fields. 
     * @param fieldData Field types 3 (List of options) and 7 (External account) support storing additional configuration for the field type in the &#x60;field_data&#x60; attribute.  For field type 3 (List of options), this attribute is a JSON dictionary defining the choices and the order they will be displayed in the dropdown UI for individual users to select an option.  The interface for field type 7 is not yet stabilized. 
     * @param observe set whether or not to return the data Observable as the body, response or events. defaults to returning the body.
     * @param reportProgress flag to report request and response progress.
     */
    public createCustomProfileField(fieldType: number, name?: string, hint?: string, fieldData?: object, ): Observable<AxiosResponse<JsonSuccessBase & object>>;
    public createCustomProfileField(fieldType: number, name?: string, hint?: string, fieldData?: object, ): Observable<any> {

        if (fieldType === null || fieldType === undefined) {
            throw new Error('Required parameter fieldType was null or undefined when calling createCustomProfileField.');
        }




        let queryParameters = {};   
        if (name !== undefined && name !== null) {
            queryParameters['name'] = <any>name;
        }
        if (hint !== undefined && hint !== null) {
            queryParameters['hint'] = <any>hint;
        }
        if (fieldType !== undefined && fieldType !== null) {
            queryParameters['field_type'] = <any>fieldType;
        }
        if (fieldData !== undefined && fieldData !== null) {
            queryParameters['field_data'] = <any>fieldData;
        }

        let headers = this.defaultHeaders;

        // to determine the Accept header
        let httpHeaderAccepts: string[] = [
            'application/json'
        ];
        const httpHeaderAcceptSelected: string | undefined = this.configuration.selectHeaderAccept(httpHeaderAccepts);
        if (httpHeaderAcceptSelected != undefined) {
            headers['Accept'] = httpHeaderAcceptSelected;
        }

        // to determine the Content-Type header
        const consumes: string[] = [
        ];
        return this.httpClient.post<JsonSuccessBase & object>(`${this.basePath}/realm/profile_fields`,
            null,
            {
                params: queryParameters,
                withCredentials: this.configuration.withCredentials,
                headers: headers
            }
        );
    }
    /**
     * Get all custom emoji
     * Get all the custom emoji in the user\&#39;s organization.  &#x60;GET {{ api_url }}/v1/realm/emoji&#x60; 
     * @param observe set whether or not to return the data Observable as the body, response or events. defaults to returning the body.
     * @param reportProgress flag to report request and response progress.
     */
    public getCustomEmoji(): Observable<AxiosResponse<JsonSuccessBase & object>>;
    public getCustomEmoji(): Observable<any> {

        let headers = this.defaultHeaders;

        // to determine the Accept header
        let httpHeaderAccepts: string[] = [
            'application/json'
        ];
        const httpHeaderAcceptSelected: string | undefined = this.configuration.selectHeaderAccept(httpHeaderAccepts);
        if (httpHeaderAcceptSelected != undefined) {
            headers['Accept'] = httpHeaderAcceptSelected;
        }

        // to determine the Content-Type header
        const consumes: string[] = [
        ];
        return this.httpClient.get<JsonSuccessBase & object>(`${this.basePath}/realm/emoji`,
            {
                withCredentials: this.configuration.withCredentials,
                headers: headers
            }
        );
    }
    /**
     * Get all custom profile fields
     * Get all the [custom profile fields](/help/add-custom-profile-fields) configured for the user\&#39;s organization.  &#x60;GET {{ api_url }}/v1/realm/profile_fields&#x60; 
     * @param observe set whether or not to return the data Observable as the body, response or events. defaults to returning the body.
     * @param reportProgress flag to report request and response progress.
     */
    public getCustomProfileFields(): Observable<AxiosResponse<JsonSuccessBase & object>>;
    public getCustomProfileFields(): Observable<any> {

        let headers = this.defaultHeaders;

        // to determine the Accept header
        let httpHeaderAccepts: string[] = [
            'application/json'
        ];
        const httpHeaderAcceptSelected: string | undefined = this.configuration.selectHeaderAccept(httpHeaderAccepts);
        if (httpHeaderAcceptSelected != undefined) {
            headers['Accept'] = httpHeaderAcceptSelected;
        }

        // to determine the Content-Type header
        const consumes: string[] = [
        ];
        return this.httpClient.get<JsonSuccessBase & object>(`${this.basePath}/realm/profile_fields`,
            {
                withCredentials: this.configuration.withCredentials,
                headers: headers
            }
        );
    }
    /**
     * Get linkifiers
     * List all of an organization\&#39;s configured [linkifiers](/help/add-a-custom-linkifier), regular expression patterns that are automatically linkified when they appear in messages and topics.  &#x60;GET {{ api_url }}/v1/realm/linkifiers&#x60;  **Changes**: New in Zulip 4.0 (feature level 54). On older versions, a similar &#x60;GET /realm/filters&#x60; endpoint was available with each entry in a &#x60;[pattern, url_format, id]&#x60; tuple format. 
     * @param observe set whether or not to return the data Observable as the body, response or events. defaults to returning the body.
     * @param reportProgress flag to report request and response progress.
     */
    public getLinkifiers(): Observable<AxiosResponse<JsonSuccessBase & object>>;
    public getLinkifiers(): Observable<any> {

        let headers = this.defaultHeaders;

        // to determine the Accept header
        let httpHeaderAccepts: string[] = [
            'application/json'
        ];
        const httpHeaderAcceptSelected: string | undefined = this.configuration.selectHeaderAccept(httpHeaderAccepts);
        if (httpHeaderAcceptSelected != undefined) {
            headers['Accept'] = httpHeaderAcceptSelected;
        }

        // to determine the Content-Type header
        const consumes: string[] = [
        ];
        return this.httpClient.get<JsonSuccessBase & object>(`${this.basePath}/realm/linkifiers`,
            {
                withCredentials: this.configuration.withCredentials,
                headers: headers
            }
        );
    }
    /**
     * Get server settings
     * Fetch global settings for a Zulip server.  &#x60;GET {{ api_url }}/v1/server_settings&#x60;  **Note:** this endpoint does not require any authentication at all, and you can use it to check:  * If this is a Zulip server, and if so, what version of Zulip it\&#39;s running. * What a Zulip client (e.g. a mobile app or [zulip-terminal](https://github.com/zulip/zulip-terminal/)) needs to know in order to display a login prompt for the server (e.g. what authentication methods are available). 
     * @param observe set whether or not to return the data Observable as the body, response or events. defaults to returning the body.
     * @param reportProgress flag to report request and response progress.
     */
    public getServerSettings(): Observable<AxiosResponse<JsonSuccessBase & object>>;
    public getServerSettings(): Observable<any> {

        let headers = this.defaultHeaders;

        // to determine the Accept header
        let httpHeaderAccepts: string[] = [
            'application/json'
        ];
        const httpHeaderAcceptSelected: string | undefined = this.configuration.selectHeaderAccept(httpHeaderAccepts);
        if (httpHeaderAcceptSelected != undefined) {
            headers['Accept'] = httpHeaderAcceptSelected;
        }

        // to determine the Content-Type header
        const consumes: string[] = [
        ];
        return this.httpClient.get<JsonSuccessBase & object>(`${this.basePath}/server_settings`,
            {
                withCredentials: this.configuration.withCredentials,
                headers: headers
            }
        );
    }
    /**
     * Remove a code playground
     * Remove a [code playground](/help/code-blocks#code-playgrounds) previously configured for an organization.  &#x60;DELETE {{ api_url }}/v1/realm/playgrounds/{playground_id}&#x60;  **Changes**: New in Zulip 4.0 (feature level 49). 
     * @param playgroundId The ID of the playground that you want to remove. 
     * @param observe set whether or not to return the data Observable as the body, response or events. defaults to returning the body.
     * @param reportProgress flag to report request and response progress.
     */
    public removeCodePlayground(playgroundId: number, ): Observable<AxiosResponse<JsonSuccess>>;
    public removeCodePlayground(playgroundId: number, ): Observable<any> {

        if (playgroundId === null || playgroundId === undefined) {
            throw new Error('Required parameter playgroundId was null or undefined when calling removeCodePlayground.');
        }

        let headers = this.defaultHeaders;

        // to determine the Accept header
        let httpHeaderAccepts: string[] = [
            'application/json'
        ];
        const httpHeaderAcceptSelected: string | undefined = this.configuration.selectHeaderAccept(httpHeaderAccepts);
        if (httpHeaderAcceptSelected != undefined) {
            headers['Accept'] = httpHeaderAcceptSelected;
        }

        // to determine the Content-Type header
        const consumes: string[] = [
        ];
        return this.httpClient.delete<JsonSuccess>(`${this.basePath}/realm/playgrounds/${encodeURIComponent(String(playground_id))}`,
            {
                withCredentials: this.configuration.withCredentials,
                headers: headers
            }
        );
    }
    /**
     * Remove a linkifier
     * Remove [linkifiers](/help/add-a-custom-linkifier), regular expression patterns that are automatically linkified when they appear in messages and topics.  &#x60;DELETE {{ api_url }}/v1/realm/filters/{filter_id}&#x60; 
     * @param filterId The ID of the linkifier that you want to remove. 
     * @param observe set whether or not to return the data Observable as the body, response or events. defaults to returning the body.
     * @param reportProgress flag to report request and response progress.
     */
    public removeLinkifier(filterId: number, ): Observable<AxiosResponse<JsonSuccess>>;
    public removeLinkifier(filterId: number, ): Observable<any> {

        if (filterId === null || filterId === undefined) {
            throw new Error('Required parameter filterId was null or undefined when calling removeLinkifier.');
        }

        let headers = this.defaultHeaders;

        // to determine the Accept header
        let httpHeaderAccepts: string[] = [
            'application/json'
        ];
        const httpHeaderAcceptSelected: string | undefined = this.configuration.selectHeaderAccept(httpHeaderAccepts);
        if (httpHeaderAcceptSelected != undefined) {
            headers['Accept'] = httpHeaderAcceptSelected;
        }

        // to determine the Content-Type header
        const consumes: string[] = [
        ];
        return this.httpClient.delete<JsonSuccess>(`${this.basePath}/realm/filters/${encodeURIComponent(String(filter_id))}`,
            {
                withCredentials: this.configuration.withCredentials,
                headers: headers
            }
        );
    }
    /**
     * Reorder custom profile fields
     * Reorder the custom profile fields in the user\&#39;s organization.  &#x60;PATCH {{ api_url }}/v1/realm/profile_fields&#x60;  Custom profile fields are displayed in Zulip UI widgets in order; this endpoint allows administrative settings UI to change the field ordering.  This endpoint is used to implement the dragging feature described in the [custom profile fields documentation](/help/add-custom-profile-fields). 
     * @param order A list of the IDs of all the custom profile fields defined in this organization, in the desired new order. 
     * @param observe set whether or not to return the data Observable as the body, response or events. defaults to returning the body.
     * @param reportProgress flag to report request and response progress.
     */
    public reorderCustomProfileFields(order: Array<number>, ): Observable<AxiosResponse<JsonSuccess>>;
    public reorderCustomProfileFields(order: Array<number>, ): Observable<any> {

        if (order === null || order === undefined) {
            throw new Error('Required parameter order was null or undefined when calling reorderCustomProfileFields.');
        }

        let queryParameters = {};   
        if (order !== undefined && order !== null) {
            queryParameters['order'] = <any>order;
        }

        let headers = this.defaultHeaders;

        // to determine the Accept header
        let httpHeaderAccepts: string[] = [
            'application/json'
        ];
        const httpHeaderAcceptSelected: string | undefined = this.configuration.selectHeaderAccept(httpHeaderAccepts);
        if (httpHeaderAcceptSelected != undefined) {
            headers['Accept'] = httpHeaderAcceptSelected;
        }

        // to determine the Content-Type header
        const consumes: string[] = [
        ];
        return this.httpClient.patch<JsonSuccess>(`${this.basePath}/realm/profile_fields`,
            null,
            {
                params: queryParameters,
                withCredentials: this.configuration.withCredentials,
                headers: headers
            }
        );
    }
    /**
     * Update a linkifier
     * Update a [linkifier](/help/add-a-custom-linkifier), regular expression patterns that are automatically linkified when they appear in messages and topics.  &#x60;PATCH {{ api_url }}/v1/realm/filters/{filter_id}&#x60;  **Changes**: New in Zulip 4.0 (feature level 57). 
     * @param filterId The ID of the linkifier that you want to update. 
     * @param pattern The [Python regular expression](https://docs.python.org/3/howto/regex.html) that should trigger the linkifier. 
     * @param urlFormatString The URL used for the link. If you used named groups for the &#x60;pattern&#x60;, you can insert their content here with &#x60;%(name_of_the_capturing_group)s&#x60;. 
     * @param observe set whether or not to return the data Observable as the body, response or events. defaults to returning the body.
     * @param reportProgress flag to report request and response progress.
     */
    public updateLinkifier(filterId: number, pattern: string, urlFormatString: string, ): Observable<AxiosResponse<JsonSuccess>>;
    public updateLinkifier(filterId: number, pattern: string, urlFormatString: string, ): Observable<any> {

        if (filterId === null || filterId === undefined) {
            throw new Error('Required parameter filterId was null or undefined when calling updateLinkifier.');
        }

        if (pattern === null || pattern === undefined) {
            throw new Error('Required parameter pattern was null or undefined when calling updateLinkifier.');
        }

        if (urlFormatString === null || urlFormatString === undefined) {
            throw new Error('Required parameter urlFormatString was null or undefined when calling updateLinkifier.');
        }

        let queryParameters = {};   
        if (pattern !== undefined && pattern !== null) {
            queryParameters['pattern'] = <any>pattern;
        }
        if (urlFormatString !== undefined && urlFormatString !== null) {
            queryParameters['url_format_string'] = <any>urlFormatString;
        }

        let headers = this.defaultHeaders;

        // to determine the Accept header
        let httpHeaderAccepts: string[] = [
            'application/json'
        ];
        const httpHeaderAcceptSelected: string | undefined = this.configuration.selectHeaderAccept(httpHeaderAccepts);
        if (httpHeaderAcceptSelected != undefined) {
            headers['Accept'] = httpHeaderAcceptSelected;
        }

        // to determine the Content-Type header
        const consumes: string[] = [
        ];
        return this.httpClient.patch<JsonSuccess>(`${this.basePath}/realm/filters/${encodeURIComponent(String(filter_id))}`,
            null,
            {
                params: queryParameters,
                withCredentials: this.configuration.withCredentials,
                headers: headers
            }
        );
    }
    /**
     * Upload custom emoji
     * This endpoint is used to upload a custom emoji for use in the user\&#39;s organization.  Access to this endpoint depends on the [organization\&#39;s configuration](https://zulip.com/help/only-allow-admins-to-add-emoji).  &#x60;POST {{ api_url }}/v1/realm/emoji/{emoji_name}&#x60; 
     * @param emojiName The name that should be associated with the uploaded emoji image/gif. The emoji name can only contain letters, numbers, dashes, and spaces. Upper and lower case letters are treated the same, and underscores (_) are treated the same as spaces (consistent with how the Zulip UI handles emoji). 
     * @param filename 
     * @param observe set whether or not to return the data Observable as the body, response or events. defaults to returning the body.
     * @param reportProgress flag to report request and response progress.
     */
    public uploadCustomEmoji(emojiName: string, filename?: Blob, ): Observable<AxiosResponse<JsonSuccess>>;
    public uploadCustomEmoji(emojiName: string, filename?: Blob, ): Observable<any> {

        if (emojiName === null || emojiName === undefined) {
            throw new Error('Required parameter emojiName was null or undefined when calling uploadCustomEmoji.');
        }


        let headers = this.defaultHeaders;

        // to determine the Accept header
        let httpHeaderAccepts: string[] = [
            'application/json'
        ];
        const httpHeaderAcceptSelected: string | undefined = this.configuration.selectHeaderAccept(httpHeaderAccepts);
        if (httpHeaderAcceptSelected != undefined) {
            headers['Accept'] = httpHeaderAcceptSelected;
        }

        // to determine the Content-Type header
        const consumes: string[] = [
            'multipart/form-data'
        ];

        const canConsumeForm = this.canConsumeForm(consumes);

        let formParams: { append(param: string, value: any): void; };
        let useForm = false;
        let convertFormParamsToString = false;

        // use FormData to transmit files using content-type "multipart/form-data"
        // see https://stackoverflow.com/questions/4007969/application-x-www-form-urlencoded-or-multipart-form-data
        useForm = canConsumeForm;
        if (useForm) {
            formParams = new FormData();
        } else {
            // formParams = new HttpParams({encoder: new CustomHttpUrlEncodingCodec()});
        }

        if (filename !== undefined) {
            formParams.append('filename', <any>filename);
        }

        return this.httpClient.post<JsonSuccess>(`${this.basePath}/realm/emoji/${encodeURIComponent(String(emoji_name))}`,
            convertFormParamsToString ? formParams.toString() : formParams,
            {
                withCredentials: this.configuration.withCredentials,
                headers: headers
            }
        );
    }
}