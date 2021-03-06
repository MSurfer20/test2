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
import { UserAllOf } from './userAllOf';
import { UserBase } from './userBase';


export interface User { 
    email?: any | null;
    is_bot?: any | null;
    avatar_url?: any | null;
    avatar_version?: any | null;
    full_name?: any | null;
    is_admin?: any | null;
    is_owner?: any | null;
    is_billing_admin?: any | null;
    role?: any | null;
    bot_type?: any | null;
    user_id?: any | null;
    bot_owner_id?: any | null;
    is_active?: any | null;
    is_guest?: any | null;
    timezone?: any | null;
    date_joined?: any | null;
    delivery_email?: any | null;
    profile_data?: any | null;
}
